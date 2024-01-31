////1순위 3으로 나눠지는게 아니면 1빼기 이후 다시 3으로 나눠보기
////2순위 2로 나누기
package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B1463 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] dp = new int[N+1];

        dp[1] = 0;
        for(int i = 2; i <= N; i++) {
            dp[i] = dp[i-1] + 1;
            if(i % 2 == 0) dp[i] = Math.min(dp[i], dp[i/2] + 1);
            if(i % 3 == 0) dp[i] = Math.min(dp[i], dp[i/3] + 1);
        }//결국 모든 숫자에 대해서 1이되는 연산 횟수를 다 구하는데 하나하나 구해 나가면서 작은 값 찾는 거

        System.out.println(dp[N]);
    }
}

//package org.example;
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//
//public class B1463 {
//    public static void main(String[] args) throws Exception {
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        int number = Integer.parseInt(bf.readLine());
//        int count = 0;
//
//        while (number != 1) {
//
//            if (Math.floorMod(number, 3) == 0) {
//                number = Math.floorDiv(number,3) ;
//                count++;
//            } else if (Math.floorMod((number - 1), 3) == 0) {
//                number -= 1;
//                count++;
//            } else {
//                number = Math.floorDiv(number,2);
//                count++;
//            }System.out.println(number + "\n");
//        }
//        System.out.println(count);
//    }
//}
