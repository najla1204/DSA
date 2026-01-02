import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n;
        System.out.println("enter the number of elements to be sorted:");
        n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++)
        {
            System.out.println("enter the number " + (i+1) + ":");
            arr[i] = in.nextInt();
        }
        Mergesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] Mergesort(int[] arr)
    {
        if(arr.length==1)
        {
            return arr;
        }
        int mid  = arr.length/2;
        int[] left = Arrays.copyOfRange(arr,0,mid);
        int[] right = Arrays.copyOfRange(arr,mid,arr.length);
        return merge(left,right);

    }
    static int[] merge(int[] first, int[] second)
    {
        int[] mix = new int[first.length+second.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i<first.length && j<second.length)
        {
            if(first[i]<second[j])
            {
                mix[k] = first[i];
                i++;
            }
            else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        while(i < first.length)
        {
            mix[k] = first[i];
            i++;
            k++;
        }
        while(j < second.length)
        {
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }

}
