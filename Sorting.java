import java.util.Arrays;

public class ArraySortingAndOccurrence {
    public static void main(String[] args) {
        int[] array = {4, 2, 1, 5, 2, 2, 4, 3, 4, 5, 1};
        int numberToFind = 2;

        // Sort the array
        Arrays.sort(array);

        // Find the number of occurrences
        int occurrences = countOccurrences(array, numberToFind);

        System.out.println("Sorted Array: " + Arrays.toString(array));
        System.out.println("Number of occurrences of " + numberToFind + ": " + occurrences);
    }

    private static int countOccurrences(int[] array, int numberToFind) {
        int count = 0;
        for (int num : array) {
            if (num == numberToFind) {
                count++;
            }
        }
        return count;
    }
}
