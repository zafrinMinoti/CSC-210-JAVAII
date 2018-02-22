public class Ch5_AW_4{

     public static void main(String []args){
        // Declare Variables
        String[] countries = { "China", "India", 
        "United States", "Indonesia", "Brazil",
        "Pakistan", "Nigeria", "Bangladesh", "Russia",
        "Mexico", "Japan", "Ethiopia" };

        double[] populations = { 1409517.397, 
        	1339180.127, 324459.463, 263991.379, 209288.278,
        	197015.955, 190886.311, 164669.751, 143989.754,
        	129163.276, 127484.450, 104957.438 };     
            
        // display countries and their population
        for(int i=0; i<countries.length; i++)
            System.out.printf("%-15s\t%15s K\n", countries[i], populations[i]);
     }
}
