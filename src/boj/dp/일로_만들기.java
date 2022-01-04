package boj.dp;


import java.io.*;

/**
 * https://www.acmicpc.net/problem/1463
 *
 */
public class 일로_만들기 {
//public class Main {

	private static final int[] dp = new int[1000001];

	private static int dp(int n) {
		dp[1] = 0;
		for (int i = 2; i <=n; ++i) {
			dp[i] = dp[i-1] + 1;
			if (i % 3 == 0) {
				dp[i] = Math.min(dp[i/3] + 1, dp[i]);
			}
			if (i % 2 == 0) {
				dp[i] = Math.min(dp[i/2] + 1, dp[i]);
			}
		}
		return dp[n];
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		bw.write(String.valueOf(dp(n)));
		bw.newLine();
		bw.flush();
	}

}
