package ProjectEuler;

import java.util.Scanner;

public class Problem_3 {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("input: ");
		Long n = input.nextLong();
		input.close();
//		largestPrime(n);
		System.out.println(getTheLargestPrimeFactor1(n));
	}
	public static boolean isPrime(Long n){
		int squareRoot = (int) Math.sqrt(n);
//		System.out.println(squareRoot);
		if((n==0)||(n==1)) return false;
		for(int i=2;i<squareRoot;i++){
			if(n%i==0)return false;
		}
		return true;
	}
	
	public static void largestPrime(Long n){
		for(Long i=2L;i<n;i++){
			if(isPrime(i)&&(n%i==0)){
				System.out.println("prime: "+i);
				n=n/i;
				if(isPrime(n)) {
					System.out.println("prime: "+n);
					break;
				}

			}
		}
	}
	
	private static Long getTheLargestPrimeFactor1(Long n) {  
        Long returnFactor = 1L;  
        Double LargestFactor = Math.sqrt(n);  
        for (Long factor = 2L; factor <= LargestFactor; factor++) {  
            if (n % factor == 0) {  
                n /= factor;  // factor is Definitely a prime
                returnFactor = factor;  
//                while (n % factor == 0) {  
//                    n /= factor;  
//                }  
            if(n==1) break;
            }  
        } 
        return returnFactor;  
    }  
}
