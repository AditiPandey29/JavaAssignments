import java.util.Scanner;
    public class FirstNonRepeatingElement {
        public static int findFirstNonRepeating(int[] arr) {
            int n = arr.length;

            for (int i = 0; i < n; i++) {
                boolean isRepeated = false;

                // Check if arr[i] is repeated in the array
                for (int j = 0; j < n; j++) {
                    if (i != j && arr[i] == arr[j]) {
                        isRepeated = true;
                        break;
                    }
                }

                // If not repeated, return the element
                if (!isRepeated) {
                    return arr[i];
                }
            }

            return -1; // No non-repeating element found
        }

        public static void main(String[] args) {
            int[] arr1 = {9, 4, 9, 6, 7, 4};
            System.out.println("First non-repeating element: " + findFirstNonRepeating(arr1)); // Output: 6

            int[] arr2 = {1, 1, 1, 2, 2, 3, 3};

            System.out.println("First non-repeating element: " + findFirstNonRepeating(arr2)); // Output: -1
            System.out.println("print git hub");

        }

    }

