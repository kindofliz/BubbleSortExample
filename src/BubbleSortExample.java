import java.util.Arrays;
import java.util.Scanner;


public class BubbleSortExample {
    public static void main(String[] args) {

//        //BUBBLE SORT ASCENDING EXAMPLE 1
//        int arr[] = {3, 60, 35, 2, 45, 320, 5};
//
//        System.out.println("Array Before Bubble Sort");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//
//        bubbleSort(arr); //sorting array elements using bubble sort
//
//        System.out.println("Array After Bubble Sort");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//            System.out.println();
//        }

//        System.out.println("--------------------ANOTHER EXAMPLE---------------------------");
//        //BUBBLE SORT WITH USER INPUT AND ALL IN ONE 'VOID'
//
//        int num, i, j, temp;
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter the number of integers to sort:");
//        num = input.nextInt(); //this the length of the array
//
//        int array[] = new int[num];
//        System.out.println("Enter " + num + " integers: ");
//
//        for (i = 0; i < num; i++)
//            array[i] = input.nextInt(); //this is the list of numbers in array
//
//        for (i = 0; i < ( num - 1 ); i++) {
//            for (j = 0; j < num - i - 1; j++) {
//                if (array[j] > array[j+1]) // > ascending; < descending
//                {
//                    temp = array[j];
//                    array[j] = array[j+1];
//                    array[j+1] = temp;
//                }
//            }
//        }
//
//        System.out.println("Sorted list of integers:");
//        for (i = 0; i < num; i++)
//            System.out.println(array[i]);
//        System.out.println();







        System.out.println("--------------------ANOTHER (SIMPLER) EXAMPLE CREATED AS A METHOD LOWER!---------------------------");
        System.out.println();

        //CALLING THE METHOD BUBBLE SORT!
        bubbleSort();

    }


    //CREATING A SEPARATE METHOD TO USE BUBBLE SORT (ASCENDING)
    public static void bubbleSort() {
        int[] numbers = {5, 2, 9, 7, 6, 3, 1, 4, 8};

        System.out.println("Array before sorting: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(Arrays.toString(numbers)); //prints the array in one line
            break; //stops the result from printing for every iteration
        }

        //writing the external loop to go through the array as per usual
        for (int i = 0; i < (numbers.length - 1); i++) {
            //writing the inner loop to compare numbers
            for (int j = 0; j < (numbers.length - i - 1); j++) {
                if (numbers[j] > numbers[j + 1]) // > ascending; < descending
                {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        System.out.println("MY Sorted list of integers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(Arrays.toString(numbers)); //prints the array in one line
            break; //stops the result from printing for every iteration
        }

    }

}
















