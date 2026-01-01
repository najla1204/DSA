import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.print("enter the number of elements:");
        n = in.nextInt();
        int[] arr = new int[n];


        for(int i = 0;i<n;i++)
        {
            System.out.println("enter number " + (i+1));
            arr[i] = in.nextInt();
        }
        Insertion(arr);
        System.out.println(Arrays.toString(arr));


    }
    static void Insertion(int[] arr)
    {
        for(int i = 0;i<arr.length-1;i++)
        {
            int j = i+1;
            while(j>0 && arr[j]<arr[j-1]) {
                int temp = arr[j-1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }
}
