package HackerRank;

public class Counting_Valleys {
	
	static int countingValleys(int n, String s) {
    int sea_level =0;
    int count =0; 
    int prev_step=0;
    int valleys =0;
    //System.out.println(s.charAt(1));
    for(int i=0;i<n;i++) {
    	char c = s.charAt(i);
    	prev_step = count;
    	if(c == 'U') 
    		count+=1;
    	else
    		count-=1;
    	//System.out.println("previous step: "+prev_step+", altitude: "+count);
    	if(prev_step<sea_level && count == sea_level)
    		valleys+=1;
    	
    }
		
    return valleys;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countingValleys(8,"DDUUUUDD"));
	}

}
