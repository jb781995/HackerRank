package HackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BetweenToSets {
	 public static int getTotalX(List<Integer> a, List<Integer> b) {
		 
		    Collections.sort(a);
		    Collections.sort(b);
		    int factors = 0;
		    int i=0;
		    for(i=0;i<=a.size()-1;i++) {
		    	if(a.get(a.size()-1)%a.get(i)==0) {
		    		
		    		continue;
		    	}
		    	else 
		    		break;
		    }
		    if(i == a.size()-1)
		    	factors++;
		    
		    System.out.println("factors: "+factors);
		    
		    
		    i = 1;
		    int number=a.get(a.size()-1)*i;
		    while(number<=b.get(0)) {
		    	System.out.println("divisor this time: "+number);
		    	if(isMultiplier(number, a)) {
		    	if(isDivisor(number, b)) {
		    		factors++;
		    		System.out.println("added.... factors now: "+factors);
		    	}
		    	}
		    	i++;
		    	number=a.get(a.size()-1)*i;
		    }
		    
		    System.out.println("factors finally: "+factors);
		    return factors;
		    
		    }
	 
	 public static boolean isDivisor(int divisor, List<Integer>b) {
		 
		 boolean flag = false;
		 for(int i=0;i<b.size();i++)
			 if(b.get(i)%divisor!=0)
				 return flag;
		 flag = true;
		 return flag;
		 
	 }
	 
public static boolean isMultiplier(int multiplier, List<Integer>a) {
		 
		 boolean flag = false;
		 for(int i=0;i<a.size();i++)
			 if(multiplier%a.get(i)!=0)
				 return flag;
		 flag = true;
		 return flag;
		 
	 }
	public static void main(String[] args) {
		List<Integer> a = new ArrayList<Integer>();
		List<Integer> b = new ArrayList<Integer>();
		a.add(2);
		a.add(4);
		//a.add(3);
		b.add(16);
		b.add(32);
		b.add(96);
		System.out.println(getTotalX(a,b));

	}

}

// 2 4
// 16 32 96
