import java.util.Scanner;
public class ConvertBinaryFomatToDecimalNumber{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter the binary value : ");
		String binary = sc.next();

		int decimal = convertBinaryToDecimalNum(binary);
		System.out.println("\nDecimal Number Of -> "+binary+" is : "+decimal);

		sc.close();
	}
	public static int convertBinaryToDecimalNum(String binary){
		
		int decimal = 0;
		for (int i = 0; i < binary.length() ; ++i) {
			
			if (binary.charAt(binary.length() - i -1) == '1') {
				
				decimal += (int)Math.pow(2,i);
			}
		}
		return decimal;
	}
}