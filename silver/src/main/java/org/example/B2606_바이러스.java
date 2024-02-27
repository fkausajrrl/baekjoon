package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class B2606_바이러스 {
    @SuppressWarnings("unchecked")
    static LinkedList<Integer>[] adj = (LinkedList<Integer>[]) new LinkedList[100];
    static boolean[] virus;

    public static void add(int v1, int v2) {
        adj[v1].add(v2);
        adj[v2].add(v1);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //입력 값 읽기

        int computerCount = Integer.parseInt(bf.readLine());// 컴퓨터 갯수
        int lineCount = Integer.parseInt(bf.readLine()); //연결된 선 갯수
        virus = new boolean[computerCount]; //바이러스 감염 여부 표시


        for (int i = 0; i < computerCount + 1; i++) {
            adj[i] = new LinkedList<>();
        }

        while (lineCount-- > 0) {
            String[] str = bf.readLine().split(" ");
            add(Integer.parseInt(str[0]), Integer.parseInt(str[1]));
        }
//        for (int i = 1; i < computerCount + 1; i++) {
//            System.out.println(i + ":" + adj[i]);
//        }

    }
}
//원래 코드는 1 탐색은 가능한데 이후 탐색할때 독립적으로 연결된 개체들이 이후에 감염되는 걸 감지 X 그래서 버리고 링크리스트도 다시 만들거임.
//        StringBuilder lines = new StringBuilder();
//
//        String line;
//        while (lineCount-- > 0) {
//            line = bf.readLine();
//            lines.append(line).append(" ");
//        }
//        str = lines.toString().trim().split(" "); //공백으로 분리 후 배열 저장 //홀수 인덱스 = 출발 , 짝수 인덱스 = 도착
//
//        for (int i = 0; i < str.length - 1; i += 2) {
//            if (str[i].equals("1")) { // 1 찾기
//                virus[Integer.parseInt(str[i + 1]) - 1] = true;
//
//                if (i < str.length - 1) { // 초과 방지를 위한 조건 추가
//                    virusDiffusion(str[i + 1]); //1의 목적지 값
//                }
//            } else {
//                if(!virus[Integer.parseInt(str[i]) - 1] && !virus[Integer.parseInt(str[i + 1]) - 1]){ //현재 시작점과 도착점 둘다 감염 X
//
//                }
//            }
//        }
//        int count = 0;
//        for (boolean value : virus) {
//            if (value) {
//                count++;
//            }
//        }
//        System.out.println(count);
//    }

//    static void virusDiffusion(String number) {
//        for (int j = 0; j < str.length - 1; j += 2) {
//            if (Objects.equals(str[j], number)) { //찾은 값을 시작으로 하는 라인 찾음.
//                if (j < str.length - 1) { // 초과 방지를 위한 조건 추가
//                    if (virus[Integer.parseInt(str[j + 1]) - 1]) { //이미 방문 한적 있는지 판별
//                        continue;
//                    }
//                    virus[Integer.parseInt(str[j + 1]) - 1] = true;
//                    virusDiffusion(str[j + 1]);
//                }
//            }
//        }
//    }
//}