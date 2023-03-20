import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MagicBoxTest {

    @Test
    void stringEquals_MagicBox_full(){

        MagicBox<String> test1 = new MagicBox<String>(3);
        test1.add("Кошка");
        test1.add("Собака");
        test1.add("Попугай");
        test1.add("Рыбки");

        String[] expected = {"Кошка", "Собака", "Попугай"};
        boolean test = true;
        for (int i=0; i< expected.length; i++)
        {
            if (!(expected[i].equals(test1.getItem(i)))) {test = false;}
        }
        if (test) {System.out.println("Массивы равны");}
        else {System.out.println("Массивы не равны");}
    }

    @Test
    void intEquals_MagicBox_full(){
        MagicBox<Integer> item2 = new MagicBox<Integer>(5);
        item2.add(4);
        item2.add(5);
        item2.add(45);
        item2.add(66);
        item2.add(34);
        item2.add(25);

        int[] expected = {4, 5, 45, 66, 34};
        boolean test = true;
        for (int i=0; i< expected.length; i++)
        {
            if (expected[i] != item2.getItem(i)) {test = false;};
        }
        if (test) {System.out.println("Массивы равны");}
        else {System.out.println("Массивы не равны");}

    }

    @Test
    void magicBox_Notfull(){
        MagicBox<Integer> item3 = new MagicBox<Integer>(5);
        item3.add(4);
        item3.add(5);
        item3.add(45);
        //System.out.println(item3.pick());

        String expected = "Коробка не полна, осталось заполнить " + (item3.getSize() - item3.num) + " ячеек";
        Exception ex = Assertions.assertThrows(RuntimeException.class, () -> item3.pick());
        Assertions.assertEquals(expected,ex.getMessage());
    }
}