package loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2438_별찍기_1 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		
		for(int i=1; i<=N; i++) {
			
			for(int j=0; j<i; j++) {  
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		
	}

}
