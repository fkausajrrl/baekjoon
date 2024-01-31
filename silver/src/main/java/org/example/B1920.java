package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class B1920 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //입력
        StringBuilder sb = new StringBuilder();//출력

        int Nsize = Integer.parseInt(bf.readLine()); //첫번쨰줄 크기
        HashSet<String> set = new HashSet<>();
        StringTokenizer Nst = new StringTokenizer(bf.readLine()); //두번쨰줄 값 읽어서 토큰으로 쪼개서 배열 저장
        for (int i = 0; i < Nsize; i++) {
            set.add(Nst.nextToken());
        }
        int Msize = Integer.parseInt(bf.readLine()); //세번쨰줄 크기
        StringTokenizer Mst = new StringTokenizer(bf.readLine()); // 네번쨰줄 값 읽어서 토큰으로 쪼개서 배열 저장
        for (int i = 0; i < Msize; i++) {
            String Mnumber = Mst.nextToken();
            if (set.contains(Mnumber)) {
                sb.append("1" + "\n");
            } else {
                sb.append("0" + "\n");
            }
        }
        System.out.println(sb);
    }
}
