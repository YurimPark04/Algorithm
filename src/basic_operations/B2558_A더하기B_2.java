package basic_operations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2558_A더하기B_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		
		System.out.println(a+b);
		
		

	}

}
