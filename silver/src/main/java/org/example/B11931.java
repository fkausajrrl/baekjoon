//문제
//N개의 수가 주어졌을 때, 이를 내림차순으로 정렬하는 프로그램을 작성하시오.
//출력
//첫째 줄부터 N개의 줄에 내림차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B11931 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // buffer로 읽어들이기

        int size = Integer.parseInt(bf.readLine()); //크기 읽기
        Integer[] value = new Integer[size];
        for (int i = 0; i < size; i++) {
            value[i] = Integer.parseInt(bf.readLine());
        }
        Arrays.sort(value);//오림차순 정렬

        StringBuilder sb = new StringBuilder();
        for(int r : value) {
            sb.append(r+"\n");
        }
        System.out.println(sb);
    }
}
