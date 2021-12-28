package boj.stack;


import java.io.*;
import java.util.Stack;

/**
 * https://www.acmicpc.net/problem/1874
 *
 */
public class 스택_수열 {
//public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<>();
		int n = Integer.parseInt(br.readLine());
		int stackNum = 0;

		while (n-- > 0) {
			int num = Integer.parseInt(br.readLine());

			if (stackNum < num) {
				while (stackNum < num) {
					stack.push(++stackNum);
					sb.append("+\n");
				}
			}
			else {
				while (!stack.isEmpty() && stack.peek() != num) {
					stack.pop();
					sb.append("-\n");
				}

				if (stack.isEmpty()) {
					System.out.println("NO");
					return;
				}
			}

			stack.pop();
			sb.append("-\n");
		}

		bw.write(sb.toString());
		bw.flush();
	}

}
