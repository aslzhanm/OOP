package pr4;

public class CountingSort {
    public static void sort(int[] arr) {
        int[] count = new int[11];

        for (int num : arr) {
            count[num]++;
        }

        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                System.out.print(i + " ");
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 2, 5, 3};

        sort(arr);
    }
}
