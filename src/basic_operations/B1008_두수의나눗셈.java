package basic_operations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1008_두수의나눗셈 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		double A = Double.parseDouble(st.nextToken());
		double B = Double.parseDouble(st.nextToken());
		
		System.out.println(A/B);
		
		
	}

}
