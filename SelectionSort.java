import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SelectionSort {
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
        Selection(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void Selection(int[] arr){
        for (int i=0;i<arr.length;i++)
        {
            int min = i;
            for (int j = i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[min])
                {
                    min = j;
                }

            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}
