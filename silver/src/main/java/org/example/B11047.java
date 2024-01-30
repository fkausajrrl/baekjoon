package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B11047 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // buffer로 읽어들이기
        StringTokenizer st = new StringTokenizer(bf.readLine()); //1줄 읽어서 토큰 분리

        int size = Integer.parseInt(st.nextToken()); //첫 토큰 = 금액 종류
        int TotalMoney = Integer.parseInt(st.nextToken()); //두번째 토큰 = 총액
        int count = 0; //동전 개수
        int[] money = new int[size];
        int i = 0;

       while(size > 0){
           money[size - 1] = Integer.parseInt(bf.readLine()); //한줄씩 읽어서 순서 뒤집어서 저장.
           size--;
        }

        while(TotalMoney != 0){
            if(TotalMoney - money[i] < 0){ //계산 X
                i++;//다음 값 으로 사용
            }
            else{ //계산 O
                TotalMoney -= money[i]; //빼기.
                count++;
            }
        }
        System.out.println(count);
    }
}
