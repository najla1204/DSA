//finding largest element O(N)
/*class Arrays {
    static int largestElement(int[] nums) {
        int max = nums[0];
        for(int i = 0;i<nums.length;i++)
        {
            if(nums[i]>max)
                max = nums[i];
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr1 = {2, 5, 1, 3, 0};
        int max = largestElement(arr1);
        System.out.println("The largest element in the array is: " + max);

    }
}*/
//finding second largest element (optimal approach) t.c = O(N)
//very very important interview question
/*class Arrays {
    static int secondLargestElement(int[] nums) {
        int largest = nums[0];
        int seclar = -1;
        for(int i = 1;i<nums.length;i++) {
            if (nums.length < 2)
                return -1;
        }
            int large = Integer.MIN_VALUE, second_large = Integer.MIN_VALUE;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] > large) {
                    second_large = large;
                    large = nums[j];
                }
                else if (nums[j] > second_large && nums[j] != large) {
                    second_large = nums[j];
                }

            }
        return second_large;


    }
    public static void main(String[] args)
    {
        int[] arr = {1,2,4,7,7,5};
        int max = secondLargestElement(arr);
        System.out.println(max);

    }
}*/
//check if array is sorted or not
//time complexity = O(N)
/*class Arrays {
    static boolean check(int[] nums)
    {
        int count = 0;
        for(int i =0; i<nums.length;i++)
        {
            if ( nums[i] > nums[(i+1)%nums.length])
            {
                count++;
            }
        }
        if (count > 1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,5,8,9};
        System.out.println(check(arr));
    }
}*/
//remove duplicates from a sorted array
/*class Solution {
    static int removeDuplicates(int[] nums) {
        if (nums.length == 0)
        {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = {0,0,1,5,6,6,8,8,9};
        System.out.println(removeDuplicates(arr));

    }
}*/
//union of two SORTED arrays
/*import java.util.*;

class Arrays {
    // Function to find union of two sorted arrays using two pointers
    static List<Integer> findUnion(int[] arr1, int[] arr2, int n, int m) {
        List<Integer> Union = new ArrayList<>();
        int i = 0, j = 0;

        while (i < n && j < m) {

            if (arr1[i] < arr2[j]) {

                if (Union.isEmpty() || Union.get(Union.size() - 1) != arr1[i])
                    Union.add(arr1[i]);
                i++;
            } else if (arr2[j] < arr1[i]) {
                if (Union.isEmpty() || Union.get(Union.size() - 1) != arr2[j])
                    Union.add(arr2[j]);
                j++;
            } else {
                if (Union.isEmpty() || Union.get(Union.size() - 1) != arr1[i])
                    Union.add(arr1[i]);
                i++;
                j++;
            }
        }
        while (i < n) {
            if (Union.isEmpty() || Union.get(Union.size() - 1) != arr1[i])
                Union.add(arr1[i]);
            i++;
        }

        while (j < m) {
            if (Union.isEmpty() || Union.get(Union.size() - 1) != arr2[j])
                Union.add(arr2[j]);
            j++;
        }

        return Union;
    }


    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {2, 3, 4, 4, 5, 11, 12};
        int n = arr1.length, m = arr2.length;


        List<Integer> result = findUnion(arr1, arr2, n, m);

        System.out.print("Union of arr1 and arr2 is: ");
        for (int val : result) System.out.print(val + " ");
    }
}*/
//find the missing number
//time complexity = O(n)
/*class Arrays {
    static int missingNumber(int[] a) {
        int xor1 = 0;
        int xor2 = 0;
        for (int i =0;i<=a.length;i++)
        {
            xor1 = xor1^i;
        }

        for (int j =0;j<a.length;j++)
        {
            xor2 = xor2^a[j];
        }


        return xor1^xor2;


    }
}*/
//maximum consecutive ones
/*class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max1 = 0;
        for(int i:nums)
        {
            if(i == 1)
            {
                count ++;
                max1 = Math.max(max1,count);
            }
            else
            {
                count = 0 ;
            }
        }
        return max1;
    }

}*/
//Find the number that appears once, and other numbers twice.
/*class Solution {
    public int singleNumber(int[] nums) {
        int xor = 0;
        for(int i =0;i<nums.length;i++)
        {
            xor = xor ^ nums[i];

        }
        return xor;
    }
}*/
//Longest subarray with sum K (Positives + Negatives)
/*import java.util.*;

class SubarraySolver {

    public int getLongestSubarray(int[] a, int k) {
        int n = a.length;
        Map<Integer, Integer> preSumMap = new HashMap<>();
        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            sum += a[i];
            if (sum == k) {
                maxLen = i + 1;
            }
            int rem = sum - k;
            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }
            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] a = { -1, 1, 1 };
        int k = 1;

        SubarraySolver solver = new SubarraySolver();
        int len = solver.getLongestSubarray(a, k);

        System.out.println("The length of the longest subarray is: " + len);
    }
}*/

