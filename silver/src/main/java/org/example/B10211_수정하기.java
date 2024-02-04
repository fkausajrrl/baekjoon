package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B10211_수정하기 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int TotalSize = Integer.parseInt(bf.readLine()); //전체 크기

        while (TotalSize > 0) {
            int ArraySize = Integer.parseInt(bf.readLine()); //배열의 크기
            int sum = 0;
            String Array = bf.readLine(); //배열 내용
            String[] splits = Array.split(" ");
            for (int i = 0; i < ArraySize; i++){
                sum += Integer.parseInt(splits[i]); //합
            }
            sb.append(sum + "\n");
            TotalSize--;
        }
        System.out.println(sb);
    }
}
