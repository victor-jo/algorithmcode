package boj.math;


import java.io.*;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/17087
 *
 */
public class 숨바꼭질_6 {
//public class Main {

	private static int gcd(int a, int b) {
		while (b > 0) {
			int temp = a % b;
			a = b;
			b = temp;
		}
		return Math.abs(a);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());

		StringTokenizer brother = new StringTokenizer(br.readLine());
		int d = Math.abs(s - Integer.parseInt(brother.nextToken()));
		while (--n > 0) {
			d = gcd(d, Math.abs(s - Integer.parseInt(brother.nextToken())));
		}

		bw.write(String.valueOf(d));
		bw.newLine();
		bw.flush();
	}

}
