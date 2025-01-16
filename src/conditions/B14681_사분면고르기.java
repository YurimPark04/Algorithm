package conditions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B14681_사분면고르기 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int x = Integer.parseInt(st.nextToken());
		
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		
		int y = Integer.parseInt(st2.nextToken());
		
		int ans = 0;
		if(x>0 && y>0) {
			ans = 1;
		}else if(x<0 && y>0) {
			ans = 2;
		}else if(x<0 && y<0) {
			ans = 3;
		}else {
			ans = 4;
		}
		
		System.out.println(ans);
		

	}

}
