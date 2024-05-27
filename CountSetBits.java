import java.util.Scanner;

public class CountSetBits {
    public static void main(String[] args) {
        // try-with-resources to close the Scanner resource automatically
        try (Scanner sc = new Scanner(System.in)) {
            System.err.print("\nEnter the number : ");
            int num = sc.nextInt(); 
            
            int count = countSetBits(num); 
            System.err.println("\nnumber of 1s (set bits) : " + count); 
        }
    }

    // Method to count the number of set bits (1s) in the binary representation of a number
    public static int countSetBits(int num) {
        StringBuilder sb = new StringBuilder();
        int temp = num;
       
        while (temp != 0) {            
      
            if(temp % 2 == 1){
                sb.append("1");
            }else{
                sb.append("0");
            }
            
            temp /= 2;
        }     
        int count = 0;
        for (int i = 0; i < sb.length(); i++) {
            if(sb.charAt(i) == '1'){
                ++count;
            }
        }
        return count; 
    }
}
