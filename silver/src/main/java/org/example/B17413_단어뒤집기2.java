package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class B17413_단어뒤집기2 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine();
        StringBuilder sb = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        boolean inner = false; //<안에 있는지 여부 확인용

        for (char ch : input.toCharArray()) {
            if (ch == '<') { //괄호 열림
                if (!temp.isEmpty()) {
                    sb.append(temp.reverse());
                    temp.setLength(0); // temp 초기화
                }
                inner = true;
            } else if (ch == '>') { //괄호 닫힘
                if (!temp.isEmpty() && inner) {
                    sb.append(temp);
                    temp.setLength(0);
                }
                inner = false;
            } else if (ch == ' ') { //공백
                if (!temp.isEmpty()) {
                    sb.append(temp.reverse());
                    temp.setLength(0); // temp 초기화
                }
            } else {
                temp.append(ch);
            }
        }
        System.out.println(sb);
    }
}
