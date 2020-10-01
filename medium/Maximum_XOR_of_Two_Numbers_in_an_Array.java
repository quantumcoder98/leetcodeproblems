// #421 Maximum_XOR_of_Two_Numbers_in_an_Array
// Java
// pratik ghule

class Solution {
    public int findMaximumXOR(int[] nums) {
        
        
        
        int n = nums.length;
        if(n == 1)
            return 0;
        int max = (-2)^31;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                //int x = nums[i];
               //int y = nums[j];
                int t = (nums[i] | nums[j]) & (~(nums[i]) | ~(nums[j]));
                if(max < t)
                    max = t;
                
            }
        }
        return max;
    }
}
