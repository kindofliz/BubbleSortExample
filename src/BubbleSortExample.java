import java.util.Scanner;

public class BubbleSortExample {
//    public static void bubbleSort(int[] arr) {
//
//        int num = arr.length;
//        int temp = 0;
//        for (int i = 0; i < num; i++) {
//            for (int j = 1; j < (num - i); j++) {
//                //ASCENDING >
//                //DESCENDING <
//                if (arr[j - 1] > arr[j]) {
//                    //swap elements
//                    temp = arr[j - 1];
//                    arr[j - 1] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//    }


    public static void main(String[] args) {

//        //BUBBLE SORT ASCENDING
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





        System.out.println("--------------------ANOTHER (SIMPLER) EXAMPLE---------------------------");
        //BUBBLE SORT WITH USER INPUT AND ALL IN ONE 'VOID'

        int num, i, j, temp;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of integers to sort:");
        num = input.nextInt(); //this the length of the array

        int array[] = new int[num];
        System.out.println("Enter " + num + " integers: ");

        for (i = 0; i < num; i++)
            array[i] = input.nextInt(); //this is the list of numbers in array

        for (i = 0; i < ( num - 1 ); i++) {
            for (j = 0; j < num - i - 1; j++) {
                if (array[j] > array[j+1]) // > ascending; < descending
                {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        System.out.println("Sorted list of integers:");
        for (i = 0; i < num; i++)
            System.out.println(array[i]);
            System.out.println();


        System.out.println("EVERY OTHER ELEMENT from the sorted list of integers:");
        for (i = 0; i < num; i=i+2)
            System.out.println(array[i]);
            System.out.println();


        System.out.println("EVERY ODD ELEMENT from the sorted list of integers:");
        for (i = 0; i < num; i++) {
            if(array[i]%2!=0){
                System.out.println(array[i]);
            }
        }
        System.out.println();


        System.out.println("EVERY EVEN ELEMENT from the sorted list of integers:");
        for (i = 0; i < num; i++) {
            if(array[i]%2==0){
                System.out.println(array[i]);
            }
        }
        System.out.println();


        System.out.println("EVERY ELEMENT BIGGER THAN 3 (from the sorted list of integers):");
        for (i = 0; i < num; i++) {
            if(array[i]>3){
                System.out.println(array[i]);
            }
        }
        System.out.println();


    }
}














