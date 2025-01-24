package basic_operations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2420_사파리월드 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		Long n = Long.parseLong(st.nextToken());
		Long m = Long.parseLong(st.nextToken());
		
		System.out.println(Math.abs(n-m));  //절댓값 구하기

	}

}
