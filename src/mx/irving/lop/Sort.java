package mx.irving.lop;

/**
 * Created by Irving on 07/12/2015.
 *
 */
public class Sort {

    private int [] array;

    public Sort(int [] input) {
        array = input;
    }

    public static void quickSort(int [] array, int left, int right) {
        int pivot = array[left];
        int i = left;
        int j = right;
        int aux;
        while (i < j) {
            while (array[i] <= pivot && i < j)
                i++;
            while (array[j] > pivot)
                j--;
            if (i < j) {
                aux = array[i];
                array[i] = array[j];
                array[j] = aux;
            }
        }
        array[left] = array[j];
        array[j] = pivot;
        if (left < j-1)
            quickSort(array, left, j-1);
        if (j+1 < right)
            quickSort(array, j+1, right);
    }

    public int [] getArray() {
        return array;
    }

    public void print() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int val : array) {
            stringBuilder.append(val).append(" ");
        }
        System.out.println(stringBuilder.toString());
    }
}
