import java.util.Scanner;
public class ConvertDecimalNumberToBinaryFormat{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Number  : ");

		int num = sc.nextInt();

		String binary = convertDecimalToBinary(num);

		System.out.println("\nBinary format of -> "+num+" : "+binary);
		sc.close();
	}
	public static String convertDecimalToBinary(int num){

		if(num == 0)return "0";
		if(num == 1 || num == 2 )return "1";

		int temp = num;
		StringBuilder binary = new StringBuilder();

		while (temp != 0) {
			if(temp % 2 == 1){
				binary.append("1");
			}else{
				binary.append("0");
			}
			temp /= 2;
		}

		return binary.reverse().toString();
	}
}