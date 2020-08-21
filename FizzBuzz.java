package HackerRank;

public class FizzBuzz {
	public static String[] fizzBuzz(int n) {
	    String[] result = new String[n];
	    for(int i=1;i<=n;i++){
	        if(((i%3)==0) && ((i%5)==0))
	          result[i-1] = "FizzBuzz";
	        else if(((i%3)==0) && ((i%5)!=0))
	        result[i-1] = "Fizz";
	        else if(((i%3)!=0) && ((i%5)==0))
	        result[i-1]= "Buzz";
	        else
	        result[i-1] = Integer.toString(i);
	    }
	    return result;
	}
	public static void main(String[] args) {
		String [] result = fizzBuzz(15);
		for(int i=0;i<result.length;i++)
			System.out.println(result[i]);

	}

}
