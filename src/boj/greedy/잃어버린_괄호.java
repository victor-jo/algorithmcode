package boj.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 잃어버린_괄호 {
//public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String expression = br.readLine();
        String[] minusToken = expression.split("-");
        int min = 0;
        min += sumExpression(minusToken[0]);
        for (int i = 1; i < minusToken.length; i++) {
            min -= sumExpression(minusToken[i]);
        }
        System.out.println(min);
    }

    private static int sumExpression(String token) {
        String[] plusToken = token.split("\\+");
        int sum = 0;
        for (String plus : plusToken) {
            sum += Integer.parseInt(plus);
        }
        return sum;
    }
}
