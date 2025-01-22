package loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B25304_영수증 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int X = Integer.parseInt(br.readLine());  //총 금액
		int N = Integer.parseInt(br.readLine());  //목록 수
		
		int total = 0;
		int sum = 0;
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());  //개당 가격
			int b = Integer.parseInt(st.nextToken());  //갯수
			total = a*b;
			sum+=total;
		}
		
		if(sum==X) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		

	}

}
