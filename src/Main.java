public class Main {
    public static void main(String[] args) {

        //Демонстрация массива типа String
        MagicBox<String> item1 = new MagicBox<>(3);
        item1.add("Кошка");
        item1.add("Собака");
        item1.add("Попугай");
        item1.add("Рыбки");
        System.out.println(item1.toString());
        System.out.println(item1.pick());

        //Демонстрация массива типа Int
        MagicBox<Integer> item2 = new MagicBox<>(5);
        item2.add(4);
        item2.add(5);
        item2.add(45);
        item2.add(66);
        item2.add(34);
        System.out.println(item2.toString());
        System.out.println(item2.pick());

        //Демонстрация ошибки
        MagicBox<Integer> item3 = new MagicBox<>(5);
        item3.add(4);
        item3.add(5);
        item3.add(45);
        System.out.println(item3.toString());
        System.out.println(item3.pick());

    }
}