import java.util.Arrays;

public class Array {
    public static void main(String[] args)
    {

       /* 1. Write a Java program to sort a numeric array and a string array.*/


       /* int[] arr2 = {4, 3, 7, 1, 6, 11, 2, 34, 9, 2};

        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr2));*/

        //---------------------------------------------

        //creating empty array and filling it
        /*

        int[] arr = new int[10];
        for (int i = 0; i<arr.length; i++)
        {
            arr[i] = i + 1;

        }

        for (int j = 0; j<arr.length; j++){
            System.out.println(arr[j]);
        }*/

        //ascending order sort
       /* for(int k = 0; k<arr2.length; k++)
        {
            for (int j = 0; j<arr2.length; j++)
            {
                if(arr2[k] > arr2[j])
                {
                    num = arr2[k];
                    arr2[k] = arr2[j];
                    arr2[j] = num;
                    System.out.println(arr2[j]);
                }
            }
        }*/

        //descending order sort

        //---------------------------------------------------

        //2. Write a Java program to sum values of an array.

        /*int[] arr2 = {4, 3, 7, 1, 6, 11, 2, 34, 9, 2};
        int sum = 0;

        for (int i : arr2){
            sum += i;
            System.out.println(sum);
        }*/


        //------------------------------------------
        //3. Write a Java program to print the following grid.

        /*String dash = "- - - - - - - - - - ";

        int[] arr3 = new int[10];
        for(int i : arr3)
        {
            System.out.println(dash);
        }*/

        //------------------------------------------
        /*4. Write a Java program to calculate the average value of array elements.*/

        int[] arr2 = {4, 3, 7, 1, 6, 11, 2, 34, 9, 2};

        int sum = 0;
        /*for (int i = 0; i<arr2.length; i++)
        {
            sum += arr2[i];
        }*/

        /*for (int i : arr2)
        {
            sum = sum + i;
        }*/

        System.out.println(sum);



    }
}
