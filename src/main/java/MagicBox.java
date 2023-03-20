import java.util.Random;

public class MagicBox<T> {
    protected T[] item;

    public MagicBox(int i) {
        this.item = (T[]) new Object[i];
    }

    public int num = 0;

    public boolean add(T name) {
        if (item[item.length - 1] == null) {
            item[num] = name;
            num++;
            return true;
        } else {
            return false;
        }
    }

    public T pick() throws RuntimeException {
        if (item[item.length - 1] != null) {
            Random random = new Random();
            int randomInt = random.nextInt(item.length);
            return item[randomInt];
        } else throw new RuntimeException("Коробка не полна, осталось заполнить " + (item.length - num) + " ячеек");
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < item.length; i++) {
            builder.append(item[i]);
            builder.append(",");
        }
        return builder.toString();
    }

    public T getItem(int i) {
        return item[i];
    }

    public int getSize(){
        return item.length;
    }
}