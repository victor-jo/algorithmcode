package boj.stack;


import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/17298
 *
 */
public class 오큰수 {
//public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Stack<Integer> stack = new Stack<>();

		int n = Integer.parseInt(br.readLine());
		int[] nums = new int[n];
		int[] nge = new int[n];

		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; ++i) {
			nums[i] = Integer.parseInt(st.nextToken());
			while (!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
				nge[stack.pop()] = nums[i];
			}
			stack.push(i);
		}

		while (!stack.isEmpty()) {
			nge[stack.pop()] = -1;
		}

		StringBuilder sb = new StringBuilder();
		for (int ngeNum : nge) {
			sb.append(ngeNum).append(" ");
		}

		sb.setLength(sb.length() - 1);

		bw.write(sb.toString());
		bw.newLine();
		bw.flush();
	}

}
