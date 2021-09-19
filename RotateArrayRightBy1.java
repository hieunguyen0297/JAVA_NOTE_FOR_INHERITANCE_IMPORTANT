public class MyClass {
    public static void main(String args[]) {
      int[] arr = {1,2,3,4,5};
      rotateArray(arr);
    }
    
    public static int[] rotateArray(int[] arr){
        int last = arr[arr.length - 1];

        //{1,2,3,4,5}

        //make a new array
        int[] result = new int[arr.length];

        // Write - Your - Code
        for(int i = 1; i < arr.length; i++) {
            result[0] = last;
            result[i] = arr[i-1];


        }

        for(int k : result){
            System.out.print(k + " ");
        }
        return result;

    }

}