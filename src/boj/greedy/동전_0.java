package boj.greedy;

import java.io.*;
import java.util.StringTokenizer;

public class 동전_0 {
//public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;
        while (k > 0 && --n >= 0) {
            count += k / arr[n];
            k %= arr[n];
        }

        System.out.println(count);
    }
}
