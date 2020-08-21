package HackerRank;
/*
 https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem
 Scores: 100 100 50 40 40 20 10
 Alice: 5 25 50 120
 */
public class Climbing_Leaderboard {
	static int[] climbingLeaderboard(int[] scores, int[] alice) {
   int max = scores[0];
   int [] result = new int[alice.length];
   int rank = 1;
   int mark = scores.length; 
   for(int i = 0;i<alice.length;i++){
   	for(int j = 1 ;j< mark; j++){
   	if(scores[j]<max && alice[i]<max) {
   	  rank++;
   	}
    max = scores[j];
   	if(alice[i] >= scores[j]){
   	result[i] = rank;
   	mark = j+1;
   	break;
   	}
   	else{
   	result[i] = rank + 1;
   	System.out.println("rank for alice"+i+" : "+result[i]);
   	}
   	}
   	rank = 1;
   	max = scores[0];
}
   
   for(int i =0;i<result.length;i++)
	   System.out.print(result[i]+"  ");
   return result;
    }
	public static void main(String[] args) {
		//int [] scores = {100, 90, 90, 80, 75, 60};
		int [] scores = {100, 100, 50, 40, 40, 20, 10};
		//int [] alice = {50, 65, 77 , 90, 102};
		int [] alice = {5, 25, 50, 101};
		climbingLeaderboard(scores, alice);
		

	}

}
