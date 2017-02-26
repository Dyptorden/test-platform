package applications;

/**
 * Created by dpuscasu on 12-Jan-17.
 */
public class SelectionSort {

    public int[] doSelectionSort(int[] arr){

        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index])
                    index = j;

            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        for(int i:arr){
            System.out.print(i);
            System.out.print(", ");
        }
        return arr;
    }

}
