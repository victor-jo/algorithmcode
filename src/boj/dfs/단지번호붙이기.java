package boj.dfs;


import java.io.*;
import java.util.*;

/**
 * https://www.acmicpc.net/problem/2667
 *
 */
public class 단지번호붙이기 {
//public class Main {

	private static int jarNumber = 0;
	private static int count = 0;
	private static int N;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


		N = Integer.parseInt(br.readLine());

		int[][] map = new int[N][N];
		boolean[][] visit = new boolean[N][N];
		for (int i = 0; i < N; ++i) {
			String s = br.readLine();
			for (int j = 0; j < s.toCharArray().length; ++j) {
				map[i][j] = s.charAt(j) - '0';
			}
		}

		List<Integer> countList = new ArrayList<>();

		for (int i = 0; i < N; ++i) {
			for (int j = 0; j < N; ++j) {
				if (map[i][j] == 1 && !visit[i][j]) {
					++jarNumber;
					count = 0;
					dfs(map, visit, i, j);
					countList.add(count);
				}
			}
		}

		bw.write(String.valueOf(jarNumber));
		bw.newLine();
		Collections.sort(countList);
		for (int i = 0; i < jarNumber; ++i) {
			bw.write(String.valueOf(countList.get(i)));
			bw.newLine();
		}
		bw.flush();
	}

	private static final int[] dx = {1, -1, 0, 0};
	private static final int[] dy = {0, 0, -1, 1};

	private static void dfs(int[][] map, boolean[][] visit, int i, int j) {
		if (!(i >= 0 && i < N && j >= 0 && j < N)) {
			return;
		}

		if (visit[i][j] || map[i][j] == 0) {
			return;
		}

		visit[i][j] = true;
		++count;

		for (int k = 0; k < 4; ++k) {
			dfs(map, visit, i + dx[k], j + dy[k]);
		}
	}

}
