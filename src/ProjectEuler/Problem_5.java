package ProjectEuler;

public class Problem_5 {
	public static void main(String[] args){
		int result = 1;
		int divide = 1;
		while(!loop(result,divide)){
			result++;
		}
		System.out.println("result: "+result);
	}
	public static boolean loop(int result,int divide){
		int temp = result % divide;
		if(temp==0&&divide<21){
			return loop(result,++divide);
		}else if(result!=0&&divide<21){
			return false;
		}else{
			return true;
		}
		
	}
}
