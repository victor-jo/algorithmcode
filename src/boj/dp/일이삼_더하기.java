package boj.dp;


import java.io.*;

/**
 * https://www.acmicpc.net/problem/9095
 *
 */
public class 일이삼_더하기 {
//public class Main {

	private static final int[] dp = new int[12];

	private static void dp(int n) {
		dp[0] = 1;
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		for (int i = 4; i <=n; ++i) {
			dp[i] = dp[i-3] + dp[i-2] + dp[i-1];
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine());
		int[] arr = new int[t];
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < t; ++i) {
			arr[i] = Integer.parseInt(br.readLine());
			max = Math.max(max, arr[i]);
		}

		dp(max);

		for (int n : arr) {
			bw.write(String.valueOf(dp[n]));
			bw.newLine();
		}
		bw.flush();
	}

}
