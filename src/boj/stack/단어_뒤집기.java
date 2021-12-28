package boj.stack;


import java.io.*;
import java.util.Stack;


public class 단어_뒤집기 {
//public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			StringBuilder sb = new StringBuilder();
			Stack<Character> stack = new Stack<>();
			String s = br.readLine();

			for (char ch : s.toCharArray()) {
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
			while (!stack.isEmpty()) {
				sb.append(stack.pop());
			}

			bw.write(sb.toString());
			bw.newLine();
		}

		bw.flush();
	}

}
