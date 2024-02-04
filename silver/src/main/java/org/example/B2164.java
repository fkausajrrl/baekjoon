package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B2164 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        // -> int 타입으로 배열 생성
        // -> 입력 값까지 배열 값 입력
        // -> 문제 로직 반복
        // -> 최종 결과 start가 가르키는 인덱스의 값 출력.

        int[] card = new int[1000000]; //500,001개 해야지 첫번째 수를 뒤로 넘길 수 있음.      //초기값 false
        int size = Integer.parseInt(bf.readLine());
        int start = 0;
        int end = size - 1;

        for (int i = 0; i < size; i++) { //시간 복잡도 O(n)
            card[i] = i + 1;
        }
        while (end - start != 0) {
            card[start] = 0; //제일 위의 카드를 버림
            start++;
            card[end + 1] = card[start];
            card[start] = 0;
            start++;
            end++;
        }
        System.out.println(card[start]);
    }
}
