package csYa_ronny;

public class ArrayMerger {
    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        int[] mergedArray = new int[len1 + len2];
        int i = 0, j = 0, k = 0;
        while (i < len1 && j < len2)
        {
            if (arr1[i] <= arr2[j])
            {
                mergedArray[k] = arr1[i];
                k++;
                i++;
            }
            else
            {
                mergedArray[k] = arr2[j];
                k++;
                j++;
            }
        }
        while (i < len1)
        {
            mergedArray[k] = arr1[i];
            k++;
            i++;
        }
        while (j < len2)
        {
            mergedArray[k] = arr2[j];
            k++;
            j++;
        }
        return mergedArray;
    }


    public static void main(String[] args) {
        // דוגמה לשימוש בשיטה
        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 6};
        int[] result = mergeSortedArrays(array1, array2);

        System.out.print("Merged array: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}