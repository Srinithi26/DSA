public class array {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] numbers = {10, 20, 30, 40, 50};

        // Access elements using their index (0-based)
        System.out.println("First element: " + numbers[0]);  // Output: First element: 10
        System.out.println("Third element: " + numbers[2]);  // Output: Third element: 30

        // Modify an element
        numbers[1] = 25;
        System.out.println("Modified second element: " + numbers[1]); // Output: Modified second element: 25

        // Iterate through the array using a for loop
        System.out.println("All elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Declare an array with a specified size and then assign values
        String[] fruits = new String[3];
        fruits[0] = "Apple";
        fruits[1] = "Banana";
        fruits[2] = "Cherry";

        System.out.println("Fruits array elements:");
        for (String fruit : fruits) { // Enhanced for loop
            System.out.println(fruit);
        }
    }
}