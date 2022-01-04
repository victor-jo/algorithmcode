package boj.dp;


import java.io.*;

/**
 * https://www.acmicpc.net/problem/1904
 *
 */
public class 영일타일 {
//public class Main {

	private static final int[] dp = new int[1000001];
	private static final int MOD = 15_746;

	private static int dp(int n) {
		dp[1] = 1;
		dp[2] = 2;
		for (int i = 3; i <=n; ++i) {
			dp[i] = (dp[i-2] + dp[i-1]) % MOD;
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
