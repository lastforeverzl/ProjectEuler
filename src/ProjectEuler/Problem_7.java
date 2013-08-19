package ProjectEuler;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem_7 {
	public static void main(String[] args){
		System.out.println("which number do you want to know?");
		Scanner input = new Scanner(System.in);
		int position = input.nextInt();
		PrimeNumber prime = new PrimeNumber(position);
		prime.value();
	}

}

class PrimeNumber{
	private int position;
	private int value;
	private ArrayList<Integer> list = new ArrayList<Integer>();
	

	public PrimeNumber(int n){
		this.position=n;
	}
	
	public void value(){
		int primeCount=0;
		int i=2;
		while(primeCount<position){
			if(isPrime(i)){
				list.add(i);
				primeCount++;
			}
			i++;
		}
		this.value = i-1;
		System.out.println(this.value);
	}
	
	private boolean isPrime(int n){
		for(int i:list){
			if(n%i==0)
				return false;
		}
		return true;
	}
}
