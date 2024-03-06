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
                if (!inner) {
                    if (temp.isEmpty()) {
                        sb.append("<");
                        sb.append(temp.reverse());
                    } else {
                        sb.append(temp.reverse());
                        sb.append("<");
                    }
                    temp.setLength(0); // temp 초기화
                }
                inner = true;
            } else if (ch == '>') { //괄호 닫힘
                if (inner) {
                    sb.append(temp);
                    sb.append(">");
                    temp.setLength(0);
                }
                inner = false;
            } else if (ch == ' ') { //공백
                if (!temp.isEmpty()) { //!temp.isEmpty()
                    if (inner) {//괄호 안쪽
                        sb.append(temp).append(" ");
                        temp.setLength(0); // temp 초기화
                        continue;
                    }
                    sb.append(temp.reverse());
                    sb.append(" ");
                    temp.setLength(0); // temp 초기화
                } else { //temp 비었는데 공백 입력
                    if (inner) { //괄호 안에 있다.
                        sb.append(" ");
                    }
                }
            } else {
                temp.append(ch);
            }
        }
        sb.append(temp.reverse()); //문장끝이 '>'로 끝나지 않아서 temp에 남아있는 문자열 뒤집어서 저장.
        System.out.println(sb);
    }
}
