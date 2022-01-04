package boj.dp;


import java.io.*;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/9465
 *
 */
public class 스티커 {
//public class Main {

	private static final int[][] dp = new int[2][100001];

	private static int dp(int[][] sticker) {
		dp[0][1] = sticker[0][1];
		dp[1][1] = sticker[1][1];

		int n = sticker[0].length - 1;
		for (int i = 2; i <= n; ++i) {
			dp[0][i] = Math.max(dp[1][i-1], dp[1][i-2]) + sticker[0][i];
			dp[1][i] = Math.max(dp[0][i-1], dp[0][i-2]) + sticker[1][i];
		}

		return Math.max(dp[0][n], dp[1][n]);
	}


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int[][] sticker = new int[2][n+1];
			for (int i = 0; i < 2; ++i) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for (int j = 1; j <= n; ++j) {
					sticker[i][j] = Integer.parseInt(st.nextToken());
				}
			}

			bw.write(String.valueOf(dp(sticker)));
			bw.newLine();
		}

		bw.flush();
	}

}
