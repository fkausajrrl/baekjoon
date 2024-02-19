package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B1929 {
    static void primeNumberSieve(int startNumber2, int endNumber2) {
        boolean[] Eratosthenes = new boolean[endNumber2 + 1];

        for (int i = 0; i < endNumber2 + 1; i++) {
            Eratosthenes[i] = true;
        }
        Eratosthenes[0] = false;
        Eratosthenes[1] = false;

        for (int i = 2; i <= endNumber2; i++) {
            for (int j = i + i; j <= endNumber2; j += i) {
                Eratosthenes[j] = false;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = startNumber2; i <= endNumber2; i++) {
            if (Eratosthenes[i]) {
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" "); //공백으로 구분해서 분리

        int startNumber = Integer.parseInt((str[0]));
        int endNumber = Integer.parseInt(str[1]);

        primeNumberSieve(startNumber, endNumber);
    }
}

//원래 코드
//package org.example;
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//
//public class B1929 {
//    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        String[] str = br.readLine().split(" "); //공백으로 구분해서 분리
//
//        int startNumber = Integer.parseInt((str[0]));
//        int endNumber = Integer.parseInt(str[1]);
//
//        StringBuilder sb = new StringBuilder();
//
//        for (int i = startNumber; i <= endNumber; i++) {
//            //ex) 3 10이라고 하면 3~10까지 중에서 소수만 출력
//            //소수 판별은 어떻게 함? -> 이중 반복문 돌려서 나눠지는 수를 number배열에 저장해서 길이 2이면 소수 아니면 소수 아님
//            if (i == 2) { //2도 소수
//                sb.append("2").append("\n");
//                continue;
//            }
//            for (int j = 2; j < i; j++) { //현재 숫자까지 반복
//                if (i % j == 0) { //나눠 떨어진다 = 소수 아님
//                    break;
//                } else if (j == i - 1) {
//                    sb.append(i).append("\n");
//                }
//            }
//        }
//        System.out.println(sb);
//    }
//}
