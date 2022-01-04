package boj.dp;


import java.io.*;

/**
 * https://www.acmicpc.net/problem/11726
 *
 */
public class 이곱하기엔_타일링 {
//public class Main {

	private static final int[] dp = new int[1001];

	private static int dp(int n) {
		dp[1] = 1;
		dp[2] = 2;
		for (int i = 3; i <=n; ++i) {
			dp[i] = (dp[i-2] + dp[i-1]) % 10_007;
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
