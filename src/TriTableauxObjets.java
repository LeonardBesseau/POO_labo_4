public class TriTableauxObjets {
    /**
     * Swap position between two Int in the array
     *
     * @param array An Int array
     * @param i     index of the first Int to swap
     * @param j     index of the second Int to swap
     * @implNote No check are made to verify that i and j are < array.length
     */
    public static void swap(Int[] array, int i, int j) {
        Int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    /**
     * Swap value of two Int
     *
     * @param a the first Int to swap with
     * @param b the second Int to swap with
     */
    public static void swapValue(Int a, Int b) {
        int tmp = a.getValue();
        a.setValue(b.getValue());
        b.setValue(tmp);
    }

    /**
     * Sort an array using bubblesort O(n²)
     * Swap function is the swap array position function
     *
     * @param array an integer array
     */
    public static void sortArray_1(Int[] array) {
        int n = array.length;
        while (n > 1) {
            int newN = 0;
            for (int i = 1; i < n; i++) {
                if (array[i - 1].getValue() > array[i].getValue()) {
                    swap(array, i - 1, i);
                    newN = i;
                }
            }
            n = newN;
        }
    }

    /**
     * Sort an array using bubblesort O(n²)
     * Swap function is the swap value function
     *
     * @param array an integer array
     */
    public static void sortArray_2(Int[] array) {
        int n = array.length;
        while (n > 1) {
            int newN = 0;
            for (int i = 1; i < n; i++) {
                if (array[i - 1].getValue() > array[i].getValue()) {
                    swapValue(array[i - 1], array[i]);
                    newN = i;
                }
            }
            n = newN;
        }
    }

    /**
     * Sort an array using bubblesort O(n²)
     * Swap function is the Int object swap
     *
     * @param array an integer array
     */
    public static void sortArray_3(Int[] array) {
        int n = array.length;
        while (n > 1) {
            int newN = 0;
            for (int i = 1; i < n; i++) {
                if (array[i - 1].getValue() > array[i].getValue()) {
                    array[i - 1].swap(array[i]);
                    newN = i;
                }
            }
            n = newN;
        }
    }

    /**
     * Display an array on the standard output
     *
     * @param array an integer array
     */
    public static void displayArray(Int[] array) {
        for (Int i : array) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Int[] integers = new Int[args.length];
        for (int i = 0; i < args.length; i++) {
            integers[i] = new Int(TriTableauEntiers.parseString(args[i]));
        }

        sortArray_3(integers);
        displayArray(integers);
    }
}
