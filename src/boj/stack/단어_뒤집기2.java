package boj.stack;


import java.io.*;
import java.util.Stack;

/**
 * https://www.acmicpc.net/problem/17413
 *
 */
public class 단어_뒤집기2 {
//public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Stack<Character> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();

		String s = br.readLine();

		boolean ignore = false;

		for (char ch : s.toCharArray()) {
			if (ch == '<') {
				while (!stack.isEmpty()) {
					sb.append(stack.pop());
				}
				sb.append(ch);
				ignore = true;
			}
			else if (ch == '>') {
				sb.append(ch);
				ignore = false;
			}
			else if (ignore) {
				sb.append(ch);
			}
			else {
				if (ch == ' ') {
					while (!stack.isEmpty()) {
						sb.append(stack.pop());
					}
					sb.append(" ");
				}
				else {
					stack.push(ch);
				}
			}
		}
		while (!stack.isEmpty()) {
			sb.append(stack.pop());
		}

		bw.write(sb.toString());
		bw.newLine();
		bw.flush();
	}

}
