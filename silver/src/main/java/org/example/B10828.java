package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B10828 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine()); //size
        StringBuilder sb = new StringBuilder(); //출력 값 저장할 곳
        int[] stack = new int[size];
        int count = 0;

        while (size >= 0) {
            String command = br.readLine(); //한줄씩 읽어오기

            if (command == null) {
                break;
            }

            if (command.contains("push")) {//push 명령어라면  if문 해당
                int number = Integer.parseInt(command.substring(5)); //5자리부터 끝자리까지의 값 = 숫자  //가져오기
                stack[count] = number; //count 번째에 입력 값 저장
                count++;
                size--;
                continue;
            }
            switch (command) {
                case "top":
                    if (count == 0) {
                        sb.append("-1" + "\n"); //스택 비었을 경우
                    } else {
                        sb.append(stack[count - 1]).append("\n"); //top값 출력
                    }
                    break;

                case "size":
                    sb.append(count).append("\n");
                    break;
                case "pop":
                    if (count == 0) {
                        sb.append("-1" + "\n"); //스택 비었을 경우
                    } else {
                        sb.append(stack[count - 1]).append("\n"); //top값 출력
                        count--; //빼기
                    }
                    break;
                case "empty":
                    if (count == 0) {
                        sb.append("1" + "\n"); //스택 비었을 경우
                    } else {
                        sb.append("0" + "\n"); //스택안에 저장 된 값 있음.
                    }
                    break;
            }
            size--;
        }
        System.out.println(sb);
    }
}
