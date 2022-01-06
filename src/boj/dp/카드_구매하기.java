package boj.dp;


import java.io.*;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/11052
 *
 */
public class 카드_구매하기 {
//public class Main {

	private static final int[] dp = new int[1001];

	private static int dp(int[] p, int n) {
		for (int i = 1; i <= n; ++i) {
			for (int j = 1; j <= i; ++j) {
				dp[i] = Math.max(dp[i], dp[i-j] + p[j]);
			}
		}
		return dp[n];
	}


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n+1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= n; ++i) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		bw.write(String.valueOf(dp(arr, n)));
		bw.newLine();
		bw.flush();
	}

}
