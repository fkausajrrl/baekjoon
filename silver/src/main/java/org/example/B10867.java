package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B10867 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // buffer로 읽어들이기

        int size = Integer.parseInt(bf.readLine()); //크기 읽기
        int pre[] = new int[size];
        StringTokenizer st = new StringTokenizer(bf.readLine());

        for(int i = 0; i < size; i++){
            pre[i] = Integer.parseInt(st.nextToken());
        }

        int result[] = Arrays.stream(pre).distinct().sorted().toArray();

        StringBuilder sb = new StringBuilder();
        for(int r : result) {
            sb.append(r+" ");

        }
        System.out.println(sb);
    }
}
