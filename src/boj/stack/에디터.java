package boj.stack;


import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/1406
 *
 */
public class 에디터 {
//public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String s = br.readLine();

		Stack<Character> leftStack = new Stack<>();
		Stack<Character> rightStack = new Stack<>();

		for (Character character : s.toCharArray()) {
			leftStack.push(character);
		}

		int m = Integer.parseInt(br.readLine());

		while (m-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			switch (st.nextToken().charAt(0)) {
				case 'L':
					if (!leftStack.isEmpty()) {
						rightStack.push(leftStack.pop());
					}
					break;
				case 'D':
					if (!rightStack.isEmpty()) {
						leftStack.push(rightStack.pop());
					}
					break;
				case 'B':
					if (!leftStack.isEmpty()) {
						leftStack.pop();
					}
					break;
				case 'P':
					leftStack.push(st.nextToken().charAt(0));
					break;
			}
		}

		for (Character character : leftStack) {
			bw.write(character);
		}
		while (!rightStack.isEmpty()) {
			bw.write(rightStack.pop());
		}

		bw.newLine();
		bw.flush();
	}

}
