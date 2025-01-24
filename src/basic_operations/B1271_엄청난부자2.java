package basic_operations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class B1271_엄청난부자2 {

	public static void main(String[] args) throws IOException {
		//큰 수 연산 - 거의 무한에 가까운 수 -> BigInteger활용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		BigInteger m = new BigInteger(st.nextToken());
		BigInteger n = new BigInteger(st.nextToken());
		
		bw.write(m.divide(n)+"\n"+m.remainder(n));
		br.close();
		bw.flush();
		bw.close();
	
		
		//System.out.println(m/n);
		//System.out.println(m%n);
		
		
		

	}

}
