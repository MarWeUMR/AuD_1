import java.util.stream.IntStream;
import java.util.Collections;
import java.util.Random;

public class SortTools {

    public static int[] createSequenceInc(int n) {
        return IntStream.range(1, n + 1).toArray();
    }

    public static int[] createSequenceDec(int n) {
        return IntStream.range(0, n).map(i -> n - i + 1 - 1).toArray();
    }

    public static int[] createSequenceRand(int n) {
        return new Random().ints(n, 1, n).toArray();
    }

    public static int[] createSequenceAlt(int n) {
        return IntStream.range(1, n + 1).map(i -> i % 2 != 0 ? 1 : 2).toArray();
    }

    public static void insertionSort(int[] A) {

        for (int i = 1; i < A.length; i++) {

            int var_backup = A[i];
            int j = i - 1;

            while (j >= 0 && A[j] > var_backup) {
                A[j + 1] = A[j];
                j = j - 1;
            }

            A[j + 1] = var_backup;
        }
    }

    public static <T extends Comparable<T>> void insertionSortGen(T[] A) {

        for (int i = 1; i < A.length; i++) {

            T var_backup = A[i];
            int j = i - 1;

            while (j >= 0 && A[j].compareTo(var_backup) > 0) {
                A[j + 1] = A[j];
                j = j - 1;
            }

            A[j + 1] = var_backup;
        }
    }

}