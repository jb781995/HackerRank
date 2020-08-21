package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Alice_Bob_Ratings {

	public static void main(String[] args) {
		List<Integer> result = new ArrayList<>(Arrays.asList(new Integer[2]));
		
		int [] a = {17,28,30};
		int [] b = {99,16,8};
		Collections.fill(result, 0);
		
		for(int i=0;i<a.length;i++) {
			int incr =0;
			if(a[i]>b[i]) {
				incr = result.get(0);
				incr++;
				result.set(0, incr);
			}
			else if(a[i]<b[i]) {
				incr = result.get(1);
				incr++;
				result.set(1, incr);
			}
			}
		System.out.println(result);
		
        long result2 = 0L;
	}

}
