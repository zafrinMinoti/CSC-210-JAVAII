public class Ch5_AW_3{

     public static void main(String []args){
        // Declare Variables
        String[] names = { "Einstein", "Newton", "Copernicus", "Kepler" };
        int size = names.length;
        
        // display content of the array
        for(int i=0; i<size; i++)
            System.out.println(names[i]);
            
        // display length of the array elements
        for(int i=0; i<size; i++)
            System.out.println(names[i].length());
     }
}