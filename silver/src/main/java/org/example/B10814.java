// 3
// 21 Junkyu    ->   20 Sunyoung
// 21 Dohyun    ->   21 Junkyu
// 20 Sunyoung  ->   21 Dohyun
//나이순 정렬 / 나이가 같은 경우 먼저 가입한 순서대로 정렬
//1 ≤ N ≤ 100,000   /   1 ≤ 나이 ≤ 200    /   이름 길이 ≤ 100
package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class B10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(bf.readLine());
        String[] sort = new String[size];

        for (int i = 0; i < size; i++) {
            sort[i] = bf.readLine();
        }

        Arrays.sort(sort, Comparator.comparingInt(s -> Integer.parseInt(s.split("\\s+")[0])));

        for (String element : sort) {
            System.out.println(element);
        }
    }
}
//StringTokenizer 사용하면 빨리질거라곤 함.
