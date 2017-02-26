package junit;

import applications.SelectionSort;
import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.assertTrue;

/**
 * Created by dpuscasu on 12-Jan-17.
 */
public class SelectionSortTests {

    SelectionSort selectionSort = new SelectionSort();

    @Test
    public void testSort(){

            int[] arr1 = {10,34,2,56,7,67,88,42};
            int[] arr1Sorted = {2, 7, 10, 34, 42, 56, 67, 88};
            int[] arr2 = selectionSort.doSelectionSort(arr1);
        assertTrue("The selection sort method is broken",Arrays.equals(arr2,arr1Sorted));
    }
}
