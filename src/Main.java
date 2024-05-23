import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    /**
     *
     * @param values array to add element to
     * @param toAdd element to add to the array
     * @return a new array with the new element added to the end
     */
    public static int[] addElement(int[] values, int toAdd) {
        // Create new array with room to add a new element
        int[] result = new int[values.length + 1];

        // Copy old array to the new array
        for (int i = 0; i < values.length; i++) {
            result[i] = values[i];
        }

        // Add new element to end of array
        result[result.length - 1] = toAdd;
        return result;
    }

    /**
     * Removes the element at the given index
     * @param values array to remove element from
     * @param indexToRemove element to remove
     * @return a new array with the element removed
     */
    public static int[] removeElement(int[] values, int indexToRemove) {
        // Create new array smaller than original array
        int[] result = new int[values.length - 1];

        // Copy values from original array over to new array
        int valuesIndex = 0;
        int resultIndex = 0;
        while(valuesIndex < values.length) {
            if(valuesIndex == indexToRemove) {
                valuesIndex++;
            }

            result[resultIndex] = values[valuesIndex];
            valuesIndex++;
            resultIndex++;
        }

        return result;
    }

    public static void main(String[] args) {
        // Initializing array and array list
        int[] values = {1, 2, 3, 4, 5};
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);

        // Printing array and array list
        System.out.println(Arrays.toString(values));
        System.out.println(intList);

        // Adding a new element to an array vs an array list
        values = addElement(values, 10);
        intList.add(20);

        System.out.println(Arrays.toString(values));
        System.out.println(intList);

        // Removing an element from an array and an array list
        values = removeElement(values, 1);
        intList.remove(1);

        System.out.println(Arrays.toString(values));
        System.out.println(intList);
    }
}
