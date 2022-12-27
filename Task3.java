/*
 * Задача №3______________________________________________________________
 */
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {

        int array[] = {10, 2, 6, 1, 9, 5, 8, 3, 7, 4};
        Task3 ob = new Task3();
        ob.sort(array);
        System.out.println("Результат: " + Arrays.toString(array));

    }

    public void sort(int array[]) {
        for (int i = array.length / 2 - 1; i >= 0; i--)
        convert(array, array.length, i);

  
        for (int i = array.length - 1; i >= 0; i--) {
            int temporary = array[0];
            array[0] = array[i];
            array[i] = temporary;

            convert(array, i, 0);
        }
    }

    void convert(int array[], int size, int i) {
        int largest = i;
        int left = 2 * i + 1; 
        int right = 2 * i + 2; 

        if (left < size && array[left] > array[largest])
            largest = left;

        if (right < size && array[right] > array[largest])
            largest = right;

        if (largest != i) {
            int temporary = array[i];
            array[i] = array[largest];
            array[largest] = temporary;

            convert(array, size, largest);
        }
    }
}
