import csYa_ronny.ArrayMerger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayMergerTest {
    @Test
    public void testMergeSortedArrays() {
        // בדיקות עם תוצאות צפויות עבור השיטה
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6},
                ArrayMerger.mergeSortedArrays(new int[]{1, 3, 5}, new int[]{2, 4, 6}));
        assertArrayEquals(new int[]{1, 1, 2, 3, 5, 8}, ArrayMerger.mergeSortedArrays(new int[]{1, 3, 5}, new int[]{1, 2, 8}));
        assertArrayEquals(new int[]{1, 2, 3}, ArrayMerger.mergeSortedArrays(new int[]{}, new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{}, ArrayMerger.mergeSortedArrays(new int[]{}, new int[]{}));
        assertArrayEquals(new int[]{-5, -3, -1, 0, 2, 4}, ArrayMerger.mergeSortedArrays(new int[]{-5, -3, 0}, new int[]{-1, 2, 4}));

    }
}
