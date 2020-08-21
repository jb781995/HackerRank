package HackerRank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class HourGlass {
private static Scanner scanner = new Scanner(System.in);

  public static int hourglassSum(int[][] arr) {
	  int[]resultArr = new int[16];
	  
	  int counter = 0;
	  int b1, b2,b3 = 0;
	  for(int i=0;i<4;i++) {
		  for(int j=0;j<4;j++) {
			  b1 = arr[i][j] + arr[i][j+1] + arr[i][j+2];
			  b2 = arr[i+1][j+1] + b1;
			  b3 = arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2] +b1+b2;
			  resultArr[counter] = b3;
		  }
		  counter++;
	  }
	  
	  Arrays.sort(resultArr);
	  return resultArr[15];
	  
  }

	public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("HourGlass.txt"));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        
        
        int[]resultArr = new int[16];
  	  
  	  int counter = 0;
  	  int b1, b2,b3 = 0;
  	  int sum=0;
  	  for(int i=0;i<4;i++) {
  		  
  		  for(int j=0;j<4;j++) {
  			  b1 = arr[i][j] + arr[i][j+1] + arr[i][j+2];
  			  b2 = arr[i+1][j+1];
  			  b3 = arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
  			  sum =  b1+b2+b3;
  			  //System.out.println("sum :"+sum);
  			  resultArr[counter] = sum;
  			  counter++;
  			  sum=0;
  		  }
  		  //counter++;
  	  }
  	  
  	  Arrays.sort(resultArr);
  	  for(int k=0;k<resultArr.length;k++)
  	  System.out.print(resultArr[k]+" ");

		
//		  int result = hourglassSum(arr);
//		  System.out.println(result);
		  
		/*
		 * bufferedWriter.write(String.valueOf(result));
		 * 
		 * bufferedWriter.newLine();
		 * 
		 * bufferedWriter.close();
		 */

        scanner.close();
    }
	
	/*
-9 -9 -9  1 1 1 
 0 -9  0  4 3 2
-9 -9 -9  1 2 3
 0  0  8  6 6 0
 0  0  0 -2 0 0
 0  0  1  2 4 0
 
 1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0
	 */

}
