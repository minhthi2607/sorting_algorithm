package bai5;

import java.util.Arrays;

public class InsertionSortByStep {
    static int[] list = {2, 3, 2, 5, 6, 1, -2};

    public static void insertionSort(int[] list) {
        System.out.println("Mảng ban đầu: " + Arrays.toString(list));

        for (int i = 1; i < list.length; i++) {
            int x = list[i];
            int pos = i;

            System.out.println("\nLấy phần tử x = " + x + " tại vị trí " + i);

            while (pos > 0 && list[pos - 1] > x) {
                list[pos] = list[pos - 1];
                pos--;

                System.out.println("Dịch phần tử sang phải: "
                        + Arrays.toString(list));
            }

            list[pos] = x;
            System.out.println("Chèn x vào vị trí " + pos + ": "
                    + Arrays.toString(list));
        }
    }

    public static void main(String[] args) {
        insertionSort(list);
    }
}
