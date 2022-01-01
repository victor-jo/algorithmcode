package boj.math;


import java.io.*;

/**
 * https://www.acmicpc.net/problem/1676
 *
 */
public class 팩토리얼_0의_개수 {
//public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int result = 0;

		for (int i = 5; i <= n; i*=5) {
			result += n / i;
		}

		bw.write(String.valueOf(result));
		bw.newLine();
		bw.flush();
	}

}
