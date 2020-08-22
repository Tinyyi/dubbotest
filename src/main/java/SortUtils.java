import java.util.Arrays;
import java.util.Random;

public class SortUtils {

    public static void main(String[] args) {
        int[] arr = new int[10];

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            arr[i] = random.nextInt(20);
        }
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - i - 1; i++) {
            for (int j = i; j < arr.length - 2; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] + arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];
                }
            }
        }
    }
}
