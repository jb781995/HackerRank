package HackerRank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Diagonal_Difference {
	
	public static int diagonalDifference(List<List<Integer>> arr) {
	    int sum1 = 0;
	    int sum2 = 0;
	     for(int i = 0;i<arr.size();i++)
	        sum1+= arr.get(i).get(i);
	     int count = 0;
         for(int j = arr.size()-1;j>=0;j--) {
        	sum2+= arr.get(j).get(count);
        	count++;
         }
         
         //System.out.println(sum1+", "+sum2);
         return Math.abs(sum1-sum2);

	}

	public static void main(String[] args) {
		/*BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

	}*/
	
	
	ArrayList<Integer> a1 = new ArrayList<Integer>();
	ArrayList<Integer> a2 = new ArrayList<Integer>();
	ArrayList<Integer> a3 = new ArrayList<Integer>();
	a1.add(11);
	a1.add(2);
	a1.add(4);
	a2.add(4);
	a2.add(5);
	a2.add(6);
	a3.add(10);
	a3.add(8);
	a3.add(-12);
	List<List<Integer>> integers = new ArrayList<List<Integer>>();
	integers.add(a1);
	integers.add(a2);
	integers.add(a3);
	
	System.out.println(diagonalDifference(integers));
	
	
	}
}
