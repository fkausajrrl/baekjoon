package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B12852 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] dp = new int[N + 1];
        int[] preDp = new int[N + 1];
        int preInd;

        dp[1] = 0;
        preDp[1] = 0;

        for (int i = 2; i <= N; i++) {
            dp[i] = dp[i - 1] + 1;  // 현재 값에서 1을 빼는 과정(1번)이 카운팅 되기때문에  + 1되는거
            preDp[i] = i - 1; //기본 값으로 이전 인덱스

            if (i % 2 == 0 && dp[i] > dp[i / 2] + 1) { // 2로 나눠지고, 2로 나눴을때가 최소 값인 경우
                dp[i] = dp[i / 2] + 1;
                preDp[i] = i / 2;
            }
            if (i % 3 == 0 && dp[i] > dp[i / 3] + 1) { // 2로 나눠지고, 2로 나눴을때가 최소 값인 경우
                dp[i] = dp[i / 3] + 1;
                preDp[i] = i / 3;
            }
        }
        System.out.println(dp[N]); //최소 값 출력

        StringBuilder sb = new StringBuilder(); //해당 인덱스 출력용 StringBuilder;

        for (preInd = N; preInd != 0; preInd = preDp[preInd]) {
            sb.append(preInd).append(" ");
        }
        System.out.println(sb);
        // 0 1 2 3 4 5
        // 0 0 1 1 2 3
        // 0 0 1 2 3 4

        //5 입력 했다고 치면 3번 5 4 2 1 or 5 4 3 1
        //1 빼기, 2 나누기, 3 나누기 -> 이 count가 dp[5]의 값과 같아야됨
        //각 배열에 배열 하나 더 해서 이전 인덱스 가지고 있으면?
    }
}


//원래 반복문 로직
//             if (i % 3 == 0 && i % 2 == 0) { // 2와 3으로 나누어질 경우
//                dp[i] = Math.min(Math.min(dp[i], dp[i / 3] + 1), dp[i / 2] + 1); //3개 비교
//                if (dp[i] == dp[i / 3] + 1) {
//                    preDp[i] = i / 3;
//                }
//                if (dp[i] == dp[i / 2] + 1) {
//                    preDp[i] = i / 2;
//                }
//                else {
//                    preDp[i] = i - 1;
//                }
//            }
//            if (i % 2 == 0 && i % 3 != 0) {
//                dp[i] = Math.min(dp[i], dp[i / 2] + 1); //더 작은 값 저장
//                if (dp[i] != dp[i / 2] + 1)// 1 뺀값
//                {
//                    preDp[i] = i - 1;
//                } else {            // 2 나눈 값
//                    preDp[i] = i / 2;
//                }
//            }
////            [i / 3] + 1하는 이유가 나눠 떨어지는 경우(3번) 카운팅 되는거 횟수 1번
//            if (i % 3 == 0 && i % 2 != 0) {
//                dp[i] = Math.min(dp[i], dp[i / 3] + 1); //더 작은 값 저장
//                if (dp[i] != dp[i / 3] + 1)// 1 뺀값
//                {
//                    preDp[i] = i - 1;
//                } else {            // 3 나눈 값
//                    preDp[i] = i / 3;
//                }
//            }
//            if (i % 3 != 0 && i % 2 != 0) {// 2로도 안나눠지고 3으로도 안나눠질 경우
//                preDp[i] = i - 1;
//            }
