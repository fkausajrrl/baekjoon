//수 N개 A1, A2, ..., AN이 주어진다. A를 오름차순 정렬했을 때, 앞에서부터 K번째 있는 수를 구하는 프로그램을 작성하시오.
//5 2
//4 1 2 3 5

//출력 2
package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B11004 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // buffer로 읽어들이기
        StringTokenizer st = new StringTokenizer(bf.readLine()); //1줄 읽어서 토큰 분리

        int size = Integer.parseInt(st.nextToken()); //첫 토큰 = 배열 크기
        int choose = Integer.parseInt(st.nextToken()); //두번째 토큰 = 마지막에 뽑을 결과물

        int[] pre = new int[size];

        StringTokenizer st2 = new StringTokenizer(bf.readLine());

        for (int i = 0; i < size; i++) {
            pre[i] = Integer.parseInt(st2.nextToken());
        }
        Arrays.sort(pre); //정렬
        System.out.print(pre[choose - 1]);
    }
}
