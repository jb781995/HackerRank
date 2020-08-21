package HackerRank;
/*
 this method prints the binary in reverse. Its correct, its just that it is reversed.
 https://www.hackerrank.com/challenges/30-binary-numbers/problem
 */
import java.util.Scanner;

public class Decimal_to_Binary {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		String binary = "";
		int quotient = 0;
		int r = 0;
		while(quotient!=1) {
			r = n%2;
			binary+= Integer.toString(r);
			quotient = n/2;
			//System.out.println(quotient+"  "+binary);
			n=n/2;
		}
		
		
		binary+=Integer.toString(quotient);
		//System.out.println(n+" : "+binary);
		int max = 0;
		int temp = 0;
		for(int i=0;i<binary.length();i++) {
			if(binary.charAt(i)==49)
				temp++;
			else {
				if(temp>max)
				  max = temp;
			    temp = 0;
			}
		}
		
		if(temp>max)
			max = temp;
		
		//System.out.println("most consecutive 1s: "+max);

	}

}
