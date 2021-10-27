package home3;

import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {


        String[] arr = {"asd", "ds", "ret", "123"};


        System.out.println(Arrays.toString(arr));
        swapElements(arr, 2, 3);
        System.out.println(Arrays.toString(arr));



        List<String> list = convertToList(arr);
        System.out.println( list.getClass() + " : " + list);


        Orange orange = new Orange();
        Apple apple = new Apple();
        Box<Orange> orangeBox1 = new Box();
        Box<Orange> orangeBox2 = new Box();
        Box<Apple> appleBox = new Box();
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());

        for (int i = 0; i < 4; i++) {
            orangeBox2.add(new Orange());
        }
        for (int i = 0; i < 6; i++) {
            appleBox.add(new Apple());
        }


        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();

        Float orange1Weigth = orangeBox1.getWeight();
        Float orange2Weigth = orangeBox2.getWeight();
        Float appleWeigth = appleBox.getWeight();
        System.out.println("Box 1 weight with oranges: " + orange1Weigth);
        System.out.println("Box 2 weight with oranges: " + orange2Weigth);
        System.out.println("Apple box weight: " + appleWeigth);

        System.out.println("Compare weight orangeBox1 и appleBox: " + orangeBox1.compare(appleBox));
        System.out.println("Compare weightorangeBox2 и appleBox: " + orangeBox2.compare(appleBox));

        orangeBox1.moveAt(orangeBox2);


        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();
    }

    private static <T> void swapElements(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private static <E> List<E> convertToList(E[] array) {
        return Arrays.asList(array);
    }
}

