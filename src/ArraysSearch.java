//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;
import java.util.Comparator;

public class ArraysSearch {

    // Для типа byte
    public static int binarySearch(byte[] a, byte key) {
        return Arrays.binarySearch(a, key);
    }

    public static int binarySearch(byte[] a, int fromIndex, int toIndex, byte key) {
        return Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    // Для типа char
    public static int binarySearch(char[] a, char key) {
        return Arrays.binarySearch(a, key);
    }

    public static int binarySearch(char[] a, int fromIndex, int toIndex, char key) {
        return Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    // Для типа double
    public static int binarySearch(double[] a, double key) {
        return Arrays.binarySearch(a, key);
    }

    public static int binarySearch(double[] a, int fromIndex, int toIndex, double key) {
        return Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    // Для типа float
    public static int binarySearch(float[] a, float key) {
        return Arrays.binarySearch(a, key);
    }

    public static int binarySearch(float[] a, int fromIndex, int toIndex, float key) {
        return Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    // Для типа int
    public static int binarySearch(int[] a, int key) {
        return Arrays.binarySearch(a, key);
    }

    public static int binarySearch(int[] a, int fromIndex, int toIndex, int key) {
        return Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    // Для типа long
    public static int binarySearch(long[] a, long key) {
        return Arrays.binarySearch(a, key);
    }

    public static int binarySearch(long[] a, int fromIndex, int toIndex, long key) {
        return Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    // Для типа short
    public static int binarySearch(short[] a, short key) {
        return Arrays.binarySearch(a, key);
    }

    public static int binarySearch(short[] a, int fromIndex, int toIndex, short key) {
        return Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    // Для обобщенного типа T
    public static <T extends Comparable<T>> int binarySearch(T[] a, T key) {
        return Arrays.binarySearch(a, key);
    }

    public static <T extends Comparable<T>> int binarySearch(T[] a, int fromIndex, int toIndex, T key) {
        return Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    // Для обобщенного типа T с Comparator
    public static <T> int binarySearch(T[] a, T key, Comparator<? super T> c) {
        return Arrays.binarySearch(a, key, c);
    }

    public static <T> int binarySearch(T[] a, int fromIndex, int toIndex, T key, Comparator<? super T> c) {
        return Arrays.binarySearch(a, fromIndex, toIndex, key, c);
    }
}