package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B9095 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(bf.readLine()); //total size
        StringBuilder sb = new StringBuilder();
        int[] dp = new int[12];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for (int i = 4; i < 12; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }
        while (size-- > 0) {
            int number = Integer.parseInt(bf.readLine());
            sb.append(dp[number]).append("\n");
        }
        System.out.println(sb);
    }
}
//배열로 1  /  2  / 3
//     갯수  갯수  갯수
//     4 / 0 / 0 => count++  여기서 자릿수 경우도
//     3 / 0 / 0 => X
//     2 / 1 / 0 => count++  3가지
//     1 / 0 / 1 => count++  2가지
//     0 / 2 / 0 => count++  X

//배열하나 하고 안에 배열 하나 더 또 안에 하나 더 해서 각 인덱스 담당하게 해서

//ㄹㅇ 천재들 개 많네
// dp[n] = dp[n - 1] + dp[n - 2] + dp[n - 3]  // 각각 이전 값의 모든 경우에서 1 더한 경우 / 2 더한 경우 / 3 더한 경우
// 3+1 ,1+1+1+1, 2+1+1, 1+2+1
// 2+2, 1+1+2
// 1+3
//다음 7개의 경우의 수를 구해낼 수 있다.
//
//그런데 잘 따지고 보면 이러한 숫자 조합 덧셈에는 규칙이 존재한다.
//dp[n]을 1,2,3을 가지고 n을 만들 수 있는 숫자 조합 덧셈의 경우의 수라고 할 때,
//dp[1] = 1, dp[2] = 2 dp[3] = 4이다.
//
//여기서 위의 4를 만드는 식들을 자세히 들여다보면 뭔가 규칙이 보일 것이다.
//첫째 줄은 각 식에서 마지막 +1을 제외하고는 모두 3을 만드는 4가지 경우의 수고
//두번째 줄은 각 식에서 마지막 +2를 제외하고는 모두 2를 만드는 2가지 경우의 수이며
//마지막 줄은 마찬가지로 주어진 식에서 +3을 제외하면 1을 만드는 1가지 경우의 수이다.

//3만드는 경우의 수
// 1 1 1 / 2 1
// 1 2
// 3

//1 1 1 1 1 /  2 1 1 1 / 1 2 1 1  / 1 1 2 1 / 2 2 1 1 / 2 1 2 1 / 1 2 2 1/ 3 1 1 / 1 3 1
