package ProjectEuler;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Problem_11 {
	public static void main(String[] args) throws IOException{
		int[][] arr = new int[20][];
		for(int i=0;i<20;i++){
			arr[i]=new int[20];
		}
		FileReader file = new FileReader("Problem_11.txt");
		fileToGrid(arr,file);
		int max = 0;
		for(int x=0;x<20;x++){
			for(int y=0;y<=16;y++){
				int result_right = arr[x][y]*arr[x][y+1]*arr[x][y+2]*arr[x][y+3];
				if(result_right>max)
					max=result_right;
			}
		}
		for(int x=0;x<=16;x++){
			for(int y=0;y<20;y++){
				int result_down = arr[x][y]*arr[x+1][y]*arr[x+2][y]*arr[x+3][y];
				if(result_down>max)
					max=result_down;
			}
		}
		for(int x=0;x<=16;x++){
			for(int y=0;y<=16;y++){
				int result_diagonal=arr[x][y]*arr[x+1][y+1]*arr[x+2][y+2]*arr[x+3][y+3];
				if(result_diagonal>max)
					max=result_diagonal;
			}
		}
		for(int x=0;x<=16;x++){
			for(int y=3;y<20;y++){
				int result = arr[x][y]*arr[x+1][y-1]*arr[x+2][y-2]*arr[x+3][y-3];
				if(result>max)
					max=result;
			}
		}
		System.out.println(max);
	}
	public static void fileToGrid(int[][] arr,FileReader file){
		Scanner input = new Scanner(file);
		while(input.hasNext()){
			for(int i=0;i<20;i++){
				for(int j=0;j<20;j++){
					arr[i][j]=input.nextInt();
				}
			}		
		}
		input.close();
	}
	public static int max(int a,int b,int c){
		if(a>b){
			if(a>c)
				return a;
			else
				return c;
			
		}else{
			if(b>c)
				return b;
			else
				return c;
		}
	}
}
