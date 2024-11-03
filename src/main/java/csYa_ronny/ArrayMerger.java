package csYa_ronny;

public class ArrayMerger {
    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        // TODO: Implement the logic to merge two sorted arrays
        return new int[] {};  // Return an empty array by default
    }

    public static void main(String[] args) {
        // דוגמה לשימוש בשיטה
        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 6};
        int[] result = mergeSortedArrays(array1, array2);

        // הדפסת המערך הממוזג
        System.out.print("Merged array: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}