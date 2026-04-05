package lab3.problem5;

import exportsFromPractice.Time;

public class TestSort {
    public static void main(String[] args) {
        // Тест шоколадок
        Chocolate[] chocolates = {
            new Chocolate("Twix", 50.0),
            new Chocolate("Snickers", 95.0),
            new Chocolate("Mars", 45.0)
        };

        System.out.println("Chocolates before sort:");
        printArray(chocolates);

        Sort.bubbleSort(chocolates);

        System.out.println("Chocolates after Bubble Sort:");
        printArray(chocolates);

        System.out.println("--------------------");

        // Тест времени
        Time[] times = {
            new Time(23, 5, 6),
            new Time(4, 24, 33),
            new Time(12, 0, 0)
        };

        System.out.println("Times before sort:");
        printArray(times);

        Sort.bubbleSort(times);

        System.out.println("Times after Bubble Sort:");
        printArray(times);
    }

    private static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.println(element);
        }
        System.out.println();
    }
}

