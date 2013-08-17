package ProjectEuler;

import java.util.ArrayList;

public class Problem_4 {
	public static void main(String[] args){
		ArrayList<Integer> list=new ArrayList<Integer>();
		int max=0;
		for(int i=100;i<1000;i++){
			for(int j=i;j<1000;j++){
				int result = i*j;
				if(palindromic(result)){
					if(result>max){
						max=result;
					}
				}
					
			}
		}
		
		System.out.println(max);
	}		
	public static boolean palindromic(int n){
		ArrayList<Integer> digits = digits(n);
		if(digits.size()==5){
			if(digits.get(0).equals(digits.get(4))&&digits.get(1).equals(digits.get(3))){
				return true;
			}else
				return false;
		}else{
			if(digits.get(0).equals(digits.get(5))&&digits.get(1).equals(digits.get(4))&&digits.get(2).equals(digits.get(3)))
				return true;
			else
				return false;
		}		
	}
	static ArrayList<Integer> digits(int n){
		ArrayList<Integer> digits = new ArrayList<Integer>();
		while(n>0){
			digits.add(n%10);
			n/=10;
		}
		return digits;
	}
}
