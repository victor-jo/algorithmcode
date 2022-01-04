package boj.dp;


import java.io.*;

/**
 * https://www.acmicpc.net/problem/2748
 *
 */
public class 피보나치_수2 {
//public class Main {

	private static final long[] dp = new long[91];

	static {
		dp[0] = 0;
		dp[1] = 1;
		for (int i = 2; i <= 90; ++i) {
			dp[i] = dp[i-1] + dp[i-2];
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		bw.write(String.valueOf(dp[n]));
		bw.newLine();
		bw.flush();
	}

}
