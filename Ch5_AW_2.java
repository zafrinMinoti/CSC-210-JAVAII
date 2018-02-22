public class Ch5_AW_2{

     public static void main(String []args){
        // Declare Variables
        final int LENGTH = 100;
        int[] numberArray1 = new int[LENGTH];
        int[] numberArray2 = new int[LENGTH];
        
        
        // loop for assigning each element of the array
        for(int i=0; i<LENGTH; i++)
            numberArray2[i] = numberArray1[i];
     }
}