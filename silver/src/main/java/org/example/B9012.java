package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B9012 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine()); //size
        //size 수만큼 반복
        //bool 배열로 ( 나오면 배열 증가, ) 나오면 배열 감소해서 배열 비었는지 마지막에 확인 후 비엇으면 YES, 아니면 NO 출력

        int count = 0;
        StringBuilder sb = new StringBuilder(); //결과 저장 YES / NO
        String Yes_No;
        int i = 0;

        for (int j = 0; j < size; j++) {
            String sentence = br.readLine();
            i = 0;
            count = 0;
            while (i < sentence.length()) {
                if (sentence.charAt(i) == '(') {
                    count++;
                } else if (sentence.charAt(i) == ')') {
                    if(count == 0){
                       count = 10; //0이 아닌 다른 수로 해서 NO 저장되도록 함.
                        break;
                    }
                    count--;
                }
                i++;
            }
            if(count == 0){
                Yes_No = "YES";
            }
            else{
                Yes_No = "NO";
            }
            sb.append(Yes_No +"\n");
        }
        System.out.println(sb);
    }
}

