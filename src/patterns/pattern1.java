package patterns;
import java.util.Scanner;

public class pattern1 {
public static void main(String[] args) {
	
	try(Scanner p = new Scanner(System.in)){
		int n = p.nextInt();
	
	int i=1;
	while (i<=n) {
		int j=1;
		while(j<=i) {
			System.out.print(j);
			j = j+1;
			
			
		}
		System.out.println();
		i=i+1;
		
	}

		/*
		 * finally{
		 * 
		 * in.close(); }
		 */
}
	
}
}
