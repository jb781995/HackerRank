package HackerRank;

public class BreakingTheRecords {

	static int[] breakingRecords(int[] scores) {
   int [] records = new int[2];
   int max = scores[0];
   int min =  scores [0];
   int maxR = 0;
   int minR = 0;
   for(int i=0;i<scores.length;i++) {
	   if(min<scores[i]) {
		   minR++;
		   min = scores[i];
	   }
	   else if(max > scores[i]) {
		   maxR++;
		   max = scores[i];
	   }
   }
   
   records[0] = minR;
   records[1] = maxR;
   return records;

    } 
	
	public static void main(String[] args) {
		int [] scores = {3, 4, 21, 36, 10, 28, 35, 5, 24, 42};
		int [] result = breakingRecords(scores);
		
		System.out.println(result[0]+" "+result[1]);

	}

}
