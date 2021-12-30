package boj.stack;


import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/17299
 *
 */
public class 오등큰수 {
//public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Stack<Integer> stack = new Stack<>();

		int n = Integer.parseInt(br.readLine());
		int[] nums = new int[n];
		int[] ngf = new int[n];
		int[] freq = new int[1000001];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i) {
			nums[i] = Integer.parseInt(st.nextToken());
			freq[nums[i]] += 1;
		}

		for (int i = 0; i < n; ++i) {
			while (!stack.isEmpty() && freq[nums[stack.peek()]] < freq[nums[i]]) {
				ngf[stack.pop()] = nums[i];
			}
			stack.push(i);
		}

		while (!stack.isEmpty()) {
			ngf[stack.pop()] = -1;
		}

		StringBuilder sb = new StringBuilder();
		for (int ngeNum : ngf) {
			sb.append(ngeNum).append(" ");
		}

		sb.setLength(sb.length() - 1);

		bw.write(sb.toString());
		bw.newLine();
		bw.flush();
	}

}
