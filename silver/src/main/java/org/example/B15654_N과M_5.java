package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class B15654_N과M_5 {
    static int[] perm; //N까지의 숫자 저장된 배열
    static int[] result; //결과 저장할 배열
    static boolean[] visit; //해당 배열 방문 여부 확인용
    static StringBuilder sb = new StringBuilder();

    static void permutation(int start,int ind, int M) {
        if (start > M) {
            for (int i = 1; i <= M; i++) {
                sb.append(result[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 1; i <= perm.length - 1; i++) {
            if (visit[i]) { //해당 인덱스 방문 했음
                continue;
            }
            visit[i] = true; //방문 했음으로 변경
            result[start] = perm[i];
            permutation(start + 1,i, M); //재귀 실행
            visit[i] = false; //해당 숫자에 대한 순열 끝났으니까 다음을 위해서 선택 해제
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        perm = new int[N + 1];
        perm[0] = 0; //내림차순 정려하려고 넣기

        for (int i = 1; i <= N; i++) {
            perm[i] = sc.nextInt(); //N까지 숫자 기입
        }
        Arrays.sort(perm);
        result = new int[N + 1]; //결과 저장할 배열
        visit = new boolean[N + 1]; //방문 여부 확인 배열

        permutation(1,1, M);
        System.out.print(sb.toString());
    }
}