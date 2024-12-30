import java.util.Collections;
import java.util.Comparator;

public class CollectionsSearch {

    // Для обобщенного типа T
    public static <T extends Comparable<T>> int binarySearch(java.util.List<T> list, T key) {
        return Collections.binarySearch(list, key);
    }

    // Для обобщенного типа T с Comparator
    public static <T> int binarySearch(java.util.List<T> list, T key, Comparator<? super T> c) {
        return Collections.binarySearch(list, key, c);
    }
}