package basic_operations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B15552_빠른A더하기B {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			bw.write(a+b + "\n");
			//System.out.println(a+b+"\n"); -> 하나의 테스트케이스가 끝나고 바로 찍어준다. (즉각 로그 출략) 따라서, T가 3이더라도, 첫번째 테스트케이스에서 출력해버림  
			
		}
		br.close();
		
		bw.flush();
		bw.close();

	}

}
