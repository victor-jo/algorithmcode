package boj.stack;


import java.io.*;
import java.util.Stack;


public class 괄호 {
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
				if (ch == ')') {
					if (stack.isEmpty()) {
						sb.append("NO");
						break;
					}
					stack.pop();
				}
				else {
					stack.push(ch);
				}
			}

			if (sb.length() < 1) {
				sb.append(!stack.isEmpty() ? "NO" : "YES");
			}

			bw.write(sb.toString());
			bw.newLine();
		}

		bw.flush();
	}

}
