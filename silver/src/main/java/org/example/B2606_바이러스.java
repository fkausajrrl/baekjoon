package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Objects;

public class B2606_바이러스 {
    static boolean[] virus;
    static String[] str;
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int computerCount = Integer.parseInt(bf.readLine());// 컴퓨터 갯수
        int lineCount = Integer.parseInt(bf.readLine()); //연결된 선 갯수
        virus = new boolean[computerCount + 1];
        StringBuilder lines = new StringBuilder();

        String line;
        while (lineCount-- > 0){
            line = bf.readLine();
            lines.append(line).append(" ");
        }
        str = lines.toString().trim().split(" "); //공백으로 분리 후 배열 저장 //홀수 인덱스 = 출발 , 짝수 인덱스 = 도착

        for (int i = 0; i < str.length - 1; i += 2) {
            if (str[i].equals("1")) { // 1 찾기
                virus[i + 1] = true;
                virusDiffusion(str[i + 1]); //1의 목적지 값
            }
        }
        int count = 0;
        for (boolean value : virus) {
            if (value) {
                count++;
            }
        }
        System.out.println(count);
    }

    static void virusDiffusion(String number) {
        for (int j = 0; j < str.length - 1; j += 2) {
            if (Objects.equals(str[j], number)) {
                if (j + 1 < str.length) { // 초과 방지를 위한 조건 추가
                    virus[j + 1] = true;
                    virusDiffusion(str[j + 1]);
                }
            }
        }
    }

}


