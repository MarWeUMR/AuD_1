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

            long avg_dec = 0; // counter für mittlere Zeit
            long avg_inc = 0;
            long avg_rand = 0;
            long avg_alt = 0;

            int loops = 10; // anzahl der durchläufe

            var dec = SortTools.createSequenceDec(var); // Array erzeugen
            var inc = SortTools.createSequenceInc(var);
            var rand = SortTools.createSequenceRand(var);
            var alt = SortTools.createSequenceAlt(var);

            for (int i = 0; i < loops; i++) { // n-fache sortierung des arrays

                long t_start_dec = System.nanoTime();
                SortTools.insertionSort(dec);
                long t_stop_dec = System.nanoTime();

                long t_start_inc = System.nanoTime();
                SortTools.insertionSort(inc);
                long t_stop_inc = System.nanoTime();

                long t_start_rand = System.nanoTime();
                SortTools.insertionSort(rand);
                long t_stop_rand = System.nanoTime();

                long t_start_alt = System.nanoTime();
                SortTools.insertionSort(alt);
                long t_stop_alt = System.nanoTime();

                avg_dec += t_stop_dec - t_start_dec;
                avg_inc += t_stop_inc - t_start_inc;
                avg_rand += t_stop_rand - t_start_rand;
                avg_alt += t_stop_alt - t_start_alt;
            }

            System.out.printf("Execution Time (Decreasing): %d ns\n", avg_dec / loops);
            System.out.printf("Execution Time (Increasing): %d ns\n", avg_inc / loops);
            System.out.printf("Execution Time (Random): %d ns\n", avg_rand / loops);
            System.out.printf("Execution Time (Alternating): %d ns\n", avg_alt / loops);

            /*
             * Execution Time (Decreasing): 1392 ns; 61818 ns; 228182 ns; 16146550 ns;
             * 70437808 ns Execution Time (Increasing): 9940 ns; 18820 ns; 35580 ns; 181610
             * ns; 330860 ns; Execution Time (Random): 21250 ns; 254740 ns; 2194500 ns;
             * 112249550 ns; 460927470 ns; Execution Time (Alternating): 14420 ns; 143170
             * ns; 1066100 ns; 60333850 ns; 231798940 ns;
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