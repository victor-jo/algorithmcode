package boj.math;


import java.io.*;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/9613
 *
 */
public class GCD_합 {
//public class Main {

	private static long gcd(int a, int b) {
		while (b != 0) {
			int temp = a % b;
			a = b;
			b = temp;
		}
		return Math.abs(a);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int n = Integer.parseInt(st.nextToken());
			int[] arr = new int[n];
			for (int i = 0; i < n; ++i) {
				arr[i] = Integer.parseInt(st.nextToken());
			}

			long sum = 0;
			for (int i = 0; i < arr.length; ++i) {
				for (int j = i+1; j < arr.length; ++j) {
					sum += gcd(arr[i], arr[j]);
				}
			}

			bw.write(String.valueOf(sum));
			bw.newLine();
		}

		bw.flush();
	}

}
