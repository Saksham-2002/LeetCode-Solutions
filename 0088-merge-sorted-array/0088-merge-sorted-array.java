class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int k=(m+n)-1;
        int i=m-1;
        int j=n-1;
        
        while(i>=0 && j>=0)
        {
            if(nums1[i]>nums2[j])
            {
                nums1[k]=nums1[i];
                k--;
                i--;
            }
            else
            {
                nums1[k]=nums2[j];
                k--;
                j--;
            }
        }
        
        //System.out.println(i+ " " + j + " "+ k);
        while(j>=0 && i<0) 
        {
            //System.out.println("Inside first if");
            nums1[k]=nums2[j];
            k--;
            j--;
        }
        while(i>=0  && j<0)
        {
             //System.out.println("Inside second if");
            nums1[k]=nums1[i];
            k--;
            i--;
        }
    }
}