class Solution {
    public int[] sortArrayByParity(int[] A) {
     
        
        int start=0,end=A.length-1;
        int[] a = new int[A.length];
        for(int i=0;i<A.length;i++)
        {
            if(A[i] %2==0)
            {
                a[start++] = A[i];
            }
            else
            {
                a[end--] = A[i];
            }
        }
        
        return a;
    }
}
