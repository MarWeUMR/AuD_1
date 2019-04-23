import java.util.stream.IntStream;

public class AuD_1 {

    public static void main(String[] args) {

        // ================================================================================
        // Funktionalitätscheck
        // ================================================================================

        for (int var : SortTools.createSequenceInc(10)) {
            System.out.println(var);
        }

        System.out.println();

        for (int var : SortTools.createSequenceDec(10)) {
            System.out.println(var);
        }

        System.out.println();

        for (int var : SortTools.createSequenceRand(10)) {
            System.out.println(var);
        }

        System.out.println();

        for (int var : SortTools.createSequenceAlt(10)) {
            System.out.println(var);
        }

        // ================================================================================
        // Aufgaben
        // ================================================================================

        for (int var : new int[] { 100, 1000, 10000, 100000, 200000 }) { // Schleife über die einzelnen Arrays

            long avg = 0; // counter für mittlere Zeit

            int loops = 10; // anzahl der durchläufe

            var A = SortTools.createSequenceDec(var); // Array erzeugen

            for (int i = 0; i < loops; i++) { // n-fache sortierung des arrays

                long t_start = System.nanoTime();

                SortTools.insertionSort(A);

                long t_stop = System.nanoTime();

                avg += t_stop - t_start;
            }

            avg = avg / loops;

            System.out.printf("Execution Time: %d ns\n", avg / loops);

            /*
             * Execution Time: 1392 ns; 61818 ns; 228182 ns; 16146550 ns; 70437808 ns
             */
        }

        Character[] cRay = { 'a', 'c', 'd', 'z', 'f' };
        Integer[] iRay = new Integer[] { 3, 1, 2, 5, 2, 0, 8 };

        System.out.println("before");
        for (int var : iRay) {
            System.out.println(var);
        }

        SortTools.insertionSortGen(iRay);

        System.out.println("after");
        for (int var : iRay) {
            System.out.println(var);
        }

    }
}