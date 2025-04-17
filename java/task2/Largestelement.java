public class Largestelement {
    public static void main(String[] args) {
        int arr[] = {5, 6, 7, 8, 9};
        
        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("The Largest Element: " + largest);
    }
}
