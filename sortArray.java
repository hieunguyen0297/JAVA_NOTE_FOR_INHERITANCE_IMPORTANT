import java.util.Arrays;
public class MyClass {
    public static void main(String args[]) {
        int[] intArray = {10, 9, 8, 6, 8 ,11};
      
        //the fastest is O(nLogn)
        //sort the above array with O(n2) time
        for (int i= 0; i < intArray.length - 1; i++){
            for(int y = i+ 1; y < intArray.length; y++){
                int temp = intArray[i];
                if(intArray[i] > intArray[y] ){
                    intArray[i] = intArray[y];
                    intArray[y] = temp;
                }
                
                
            }
        }
        for(int u : intArray){
            System.out.print(u + " ");
        }
   
     
    }
}
