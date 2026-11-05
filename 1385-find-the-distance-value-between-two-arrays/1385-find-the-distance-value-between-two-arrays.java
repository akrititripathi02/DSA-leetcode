class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count=0;
        boolean found=true;
        for(int i=0;i<arr1.length;i++)
        {
            found=true;
            for(int j=0;j<arr2.length;j++)
            {
                if(Math.abs(arr1[i]-arr2[j])<=d)
                {found=false;
                break;}
            }
            if(found==true)
            count=count+1;
        }
        return count;
        
    }
}