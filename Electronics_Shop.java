package HackerRank;

import java.util.Arrays;

/*
 * https://www.hackerrank.com/challenges/electronics-shop/problem
 */
public class Electronics_Shop {
	static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        Arrays.sort(keyboards);
        Arrays.sort(drives);
        //System.out.println("max keyboard: "+keyboards[keyboards.length-1]+", mac drives: "+drives[drives.length-1]);
        int count = 2;
        int max = 0;
        int c = keyboards.length-1;
        int d = drives.length-1;
         
        while(true) {
        if(keyboards[c]>=drives[d]) {
        	if(keyboards[c] < b) {
        		System.out.println(keyboards[c]);
        		max = keyboards[c];
        		break;
        	}
        	c--;
        	
        }
        else {
        	if(drives[d] < b) {
        		System.out.println(drives[d]);
        		max = drives[d];
        		break;
        	}
        	d--;
        }
        
        }
        int remainder = b - max;
        count = count -1;
        System.out.println("max she could spend now: "+remainder);
        if (remainder == 0 && count ==1)
        return -1;
        else{
        if(keyboards[keyboards.length-1] >= drives[drives.length-1]){
        	for (int i=drives.length-1;i>=0;i--){
               if((drives[i])<=remainder){
               max = max + drives[i];
               //System.out.println("drivers added...remainder now: "+max);
               break;
               }
        	}
        }
        else{
        	for (int i=keyboards.length-1;i>=0;i--){
        if((keyboards[i])<=remainder){
               max = max + keyboards[i];
               //System.out.println("keyboard added...remainder now: "+max);
               break;
               }
        	}
        }

        }
        return max;
    }
	public static void main(String[] args) {
		int [] keyboards = {4};
		int [] drives = {5};
		System.out.println("result: "+getMoneySpent(keyboards, drives, 5));

	}

}
