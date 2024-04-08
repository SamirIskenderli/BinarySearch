import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int index = recursiveBinarySearch(new int[]{3, 22, 27, 47, 57, 67, 89, 91, 95, 99}, 0, 10, 67);
        System.out.println(index);


    }

    public static int recursiveBinarySearch(int arr[], int firstElement, int lastElement, int elementToSearch) {


        if (lastElement >= firstElement) {
            int mid = firstElement + (lastElement - firstElement) / 2;


            if (arr[mid] == elementToSearch)
                return mid;


            if (arr[mid] > elementToSearch)
                return recursiveBinarySearch(arr, firstElement, mid - 1, elementToSearch);


            return recursiveBinarySearch(arr, mid + 1, lastElement, elementToSearch);
        }

        return -1;
    }

}


