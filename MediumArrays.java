//2 sum problem
//time complexity = O(nlogn)
/*import java.util.HashMap;
import java.util.Map;

    class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];

                if (map.containsKey(complement)) {
                    return new int[] { map.get(complement), i };
                }

                map.put(nums[i], i);
            }
            return new int[] {};
        }
    }*/
// Sort an array of 0's 1's and 2's
//time complexity = O(n)
/*class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length -1;
        while(mid <= high)
        {
            if(nums[mid] == 0)
            {
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                low++;
                mid++;
            }
            else if(nums[mid] == 1)
            {
                mid++;
            }
            else
            {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
}*/
//Majority Element (>n/2 times)
/*class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}*/
//Kadane's Algorithm, maximum subarray sum
/*class Solution {
    public int maxSubArray(int[] nums) {
        long maxi = Long.MIN_VALUE;
        long sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum > maxi) {
                maxi = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return (int) maxi;
    }
}*/
//Rearrange Array Elements by Sign
//time complexity = O(n)
/*class Solution {
    public int[] rearrangeArray(int[] arr) {
        int[] ans = new int[arr.length];
        int pos = 0;
        int neg = 1;
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i] < 0)
            {
                ans[neg] = arr[i];
                neg = neg + 2;
            }
            else
            {
                ans[pos] = arr[i];
                pos = pos+ 2;
            }
        }
        return ans;
    }
}*/
