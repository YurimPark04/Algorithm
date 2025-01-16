package conditions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2480_주사위세개 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());  
		int B = Integer.parseInt(st.nextToken()); 
		int C = Integer.parseInt(st.nextToken());
		
		if(A==B && B==C) {
			System.out.println(10000+A*1000);
		}else if(A==B || A==C) {
			System.out.println(1000+A*100);
		}else if(B==C) {
			System.out.println(1000+B*100);
		}else {
			int max = 0;
			if(A>B && A>C) {
				max = A;
			}else if(B>A && B>C) {
				max = B;
			}else if(C>A && C>B) {
				max = C;
			}
			
			System.out.println(max*100);
		}
		
		
		

	}

}
