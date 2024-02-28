package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B2579_계단_오르기 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(bf.readLine()); //계단 갯수
        int[] stairs = new int[size + 1];
        int[] dp = new int[size + 1];

        for (int i = 1; i <= size; i++) {
            stairs[i] = Integer.parseInt(bf.readLine()); //순서에 맞게 값 입력
        }
        dp[1] = stairs[1];
        if (size >= 2) { //>= 가 아니라 ==으로 하니까 3이상 일때는 2가 안생김.
            dp[2] = stairs[1] + stairs[2];
            if (size >= 3) {
                dp[3] = Math.max(stairs[1], stairs[2]) + stairs[3];
            }
        }

        for (int i = 4; i <= size; i++) {
            dp[i] = Math.max(dp[i - 3] + stairs[i - 1], dp[i - 2]) + stairs[i];
        }
        System.out.println(dp[size]);
    }
}