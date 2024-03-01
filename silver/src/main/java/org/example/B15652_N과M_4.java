package org.example;

import java.util.Scanner;

public class B15652_N과M_4 {
    static int[] perm; //N까지의 숫자 저장된 배열
    static int[] result; //결과 저장할 배열
    static StringBuilder sb = new StringBuilder();

    static void combination(int start,int ind, int M) {
        if (start > M) {
            for (int i = 1; i <= M; i++) {
                sb.append(result[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = ind; i <= perm.length - 1; i++) {
            result[start] = perm[i];
            combination(start + 1,i, M); //재귀 실행
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        perm = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            perm[i] = i; //N까지 숫자 기입
        }
        result = new int[N + 1]; //결과 저장할 배열

        combination(1,1, M);
        System.out.print(sb.toString());
    }
}