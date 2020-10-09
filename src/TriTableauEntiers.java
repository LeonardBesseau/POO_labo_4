import java.io.IOError;

public class TriTableauEntiers {

    /**
     * Parse a string to an integer
     *
     * @param input a string with a sign symbol at it's first char
     * @return an integer
     * @throws RuntimeException if multiple sign symbols are detected
     */
    public static int parseString(String input) {
        int output = 0;
        int sign = 1;
        boolean signed = false;
        int exponent = 1;
        for (int i = 0; i < input.length(); i++) {
            switch (input.charAt(i)){
                case '-':
                    if (signed || i != 0) {
                        throw new RuntimeException();
                    } else {
                        signed = true;
                        sign = -1;
                        continue;
                    }
                case '+':
                    if (signed || i != 0) {
                        throw new RuntimeException();
                    } else {
                        signed = true;
                        continue;
                    }
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    output += (((int) input.charAt(i)) - '0') * (exponent);
                    exponent *= 10;
                    break;
                default:
                    throw new NumberFormatException();
            }
        }
        return output * sign;
    }

    /**
     * Sort an array using bubblesort O(n²)
     *
     * @param array an integer array
     */
    public static void sortArray(int[] array) {
        int n = array.length;
        while (n > 1) {
            int newN = 0;
            for (int i = 1; i < n; i++) {
                if (array[i - 1] > array[i]) {
                    int tmp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = tmp;
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
    public static void displayArray(int[] array) {
        for (int i : array) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int[] integers = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            integers[i] = parseString(args[i]);
        }

        sortArray(integers);
        displayArray(integers);

    }
}
