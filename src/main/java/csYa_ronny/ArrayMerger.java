package csYa_ronny;

public class ArrayMerger {
    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int[] mergedArrays = new int[arr1.length+arr2.length];
        int indexArr1 = 0, indexArr2 = 0;
        for (int i = 0; i < mergedArrays.length; i++){
            if (arr1[indexArr1] < arr2[indexArr2]){
                mergedArrays[i] = arr1[indexArr1];
                indexArr1 += 1;
            }
            else if (arr2[indexArr2] < arr1[indexArr1]){
                mergedArrays[i] = arr2[indexArr2];
                indexArr2 += 1;
            }
        }
        return mergedArrays;
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