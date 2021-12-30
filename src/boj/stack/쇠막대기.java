package boj.stack;


import java.io.*;
import java.util.Stack;

/**
 * https://www.acmicpc.net/problem/10799
 *
 */
public class 쇠막대기 {
//public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Stack<Integer> stack = new Stack<>();
		String s = br.readLine();

		int count = 0;

		for (int i = 0; i < s.length(); ++i) {
			char ch = s.charAt(i);
			if (ch == '(') {
				stack.push(i);
			}
			else {
				if (stack.peek() == i-1) {
					stack.pop();
					count += stack.size();
				}
				else {
					stack.pop();
					count += 1;
				}
			}
		}

		bw.write(String.valueOf(count));
		bw.newLine();
		bw.flush();
	}

}
