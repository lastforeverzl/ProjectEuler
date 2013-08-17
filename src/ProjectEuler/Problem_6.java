package ProjectEuler;

import java.lang.Math;

public class Problem_6 {
	public static void main(String[] args){
		int sum=0;
		for(int i=1;i<=100;i++){
			sum+=i;
		}
		int j = (int)Math.pow(sum, 2);
		System.out.println(j);
		int sum2=0;
		for(int k=1;k<=100;k++){
			sum2+=Math.pow(k, 2);
		}
		
//		int i = (int) Math.pow(sum,2)-(10*3025+100*385+200*3025);
		System.out.println(j-sum2);
	}
}
