import java.util.Scanner;

public class HackeRankDataType {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		for(int i = 0; i < t; i++) {
			try {
				Long x = scan.nextLong();
				if(x >= -128 && x <= 127)System.out.println("Byte");
				if(x >= -32768 && x <= 32767)System.out.println("Short");
				if(x >= -2147483648 && x <= 2147483647)System.out.println("Int");
				if(x >= -9223372036854775808L && x <= 9223372036854775807L)System.out.println("Long");
	
			} catch (Exception e) {
				System.out.println(scan.next() + "Dado não cabe em lugar nenhum");
			}
		}
		scan.close();
		
	}

}
