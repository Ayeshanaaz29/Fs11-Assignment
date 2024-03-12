public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 3, 7, 15, 6};
        int max = arr[0]; // Assume first element is the maximum

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Update max if current element is greater
            }
        }

        System.out.println("Maximum element in the array: " + max);
    }
}
