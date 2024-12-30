import java.util.Arrays;
import java.util.Random;

public class SortingComparison {

    public static void main(String[] args) {
        int[] sizes = {10, 100, 1000, 10000, 100000};  // Размеры массивов
        for (int size : sizes) {
            int[] array = generateRandomArray(size);

            // Сортировка пузырьком
            long startTime = System.nanoTime();
            bubbleSort(Arrays.copyOf(array, array.length));
            long endTime = System.nanoTime();
            System.out.println("Bubble Sort for n = " + size + ": " + (endTime - startTime) + " ns");

            // Быстрая сортировка
            startTime = System.nanoTime();
            quickSort(Arrays.copyOf(array, array.length), 0, array.length - 1);
            endTime = System.nanoTime();
            System.out.println("Quick Sort for n = " + size + ": " + (endTime - startTime) + " ns");

            // Сортировка слиянием
            startTime = System.nanoTime();
            mergeSort(Arrays.copyOf(array, array.length), 0, array.length - 1);
            endTime = System.nanoTime();
            System.out.println("Merge Sort for n = " + size + ": " + (endTime - startTime) + " ns");
        }
    }

    public static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(10000);
        }
        return array;
    }

    // Реализация сортировки пузырьком
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Реализация быстрой сортировки
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }

    // Реализация сортировки слиянием
    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }

    private static void merge(int[] array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];
        System.arraycopy(array, left, L, 0, n1);
        System.arraycopy(array, mid + 1, R, 0, n2);

        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }
}