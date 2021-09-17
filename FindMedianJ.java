public class MyClass {
    public static void main(String args[]) {
      int[] a1 = {2,3,5};
      int[] a2 = {4,6,7};
      System.out.println(findMedianSortedArrays(a1, a2));
    }
    
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //create a new array to store merge array
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] result = new int[n1 + n2];
        
        //compare value to sort them and put them into the result array
        //k is index of the result array
        int i = 0, j = 0, k = 0; 
        
        while(i < n1 && j < n2) {
            if(nums1[i] < nums2[j]){
                result[k] = nums1[i];
                k++;
                i++;
            }else{
                result[k] = nums2[j];
                k++;
                j++;
            }
        }
        
        //now we append the rest to the result array
        //now we have a sorted array with elements from nums1 and nums2
        while(i < n1) {
            result[k] = nums1[i];
            i++;
            k++;
        }
        
        while(j < n2){
            result[k] = nums2[j];
            k++;
            j++;
        }
        
        //find median
        double median;
        
        if(result.length % 2 == 0) {
            //find 2 middle indexes
            int index2 = result.length / 2;
            int index1 = index2 - 1;
            median = (double) (result[index1] +  result[index2]) / 2;
        }else {
            median = (double) result[result.length / 2];
        }
        
        
        return median;
        
    }
}