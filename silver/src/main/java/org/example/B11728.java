//첫째 줄에 배열 A의 크기 N, 배열 B의 크기 M이 주어진다. (1 ≤ N, M ≤ 1,000,000)
//둘째 줄에는 배열 A의 내용이, 셋째 줄에는 배열 B의 내용이 주어진다. 배열에 들어있는 수는 절댓값이 109보다 작거나 같은 정수이다.
//출력 : 첫째 줄에 두 배열을 합친 후 정렬한 결과를 출력한다.

//입력
//2 2
//3 5
//2 9

//출력 : 2 3 5 9
package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B11728 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // buffer로 읽어들이기
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken()); // 배열 A의 크기 N
        int M = Integer.parseInt(st.nextToken()); // 배열 B의 크기 M
        int[] value = new int[N + M];

        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < N; i++) {
            value[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < M; i++) {
            value[N + i] = Integer.parseInt(st.nextToken());
        }
        //정렬
        Arrays.sort(value);
        //이 반복문 쓰면 시간 초과
        for (int element : value) {
            System.out.print(element + " ");
        }
//        StringBuilder sb = new StringBuilder();
//        for(int r : value) {
//            sb.append(r+" ");
//
//        }
//        System.out.println(sb);

    }
}

