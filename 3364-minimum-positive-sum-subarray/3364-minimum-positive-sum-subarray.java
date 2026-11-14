class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
       int p=nums.size();
       int a=Integer.MAX_VALUE;
       for(int i=0;i<p;i++)
       { int sum=0;
       for(int j=i;j<p;j++)
       {
        sum+=nums.get(j);
        int len=j-i+1;
        if(len>=l&&len<=r&&sum>0)
        {
            a=Math.min(a,sum);
        }
        if(len>r)
        break;
       }
       } 
       return a==Integer.MAX_VALUE?-1:a;
    }

}