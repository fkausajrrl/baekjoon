package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class B2606_virus2 {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
    static boolean[] visited; //방문 췤

    public static void dfs(int x) {
        visited[x] = true;
        for (int y : graph.get(x)) {
            if (!visited[y]) {
                dfs(y);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int computerNumber = sc.nextInt();  //총 컴퓨터 갯수
        int lineNumber = sc.nextInt();  //생성되는 라인 갯수

        visited = new boolean[computerNumber + 1]; //방문 확인 용 배열 크기 지정
        for (int i = 0; i < computerNumber + 1; i++) { //인접 리스트 생성
            graph.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < lineNumber; i++) { //인접 리스트 내용 넣기
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();

            graph.get(v1).add(v2);
            graph.get(v2).add(v1);
        }

        dfs(1); //1부터 시작

        int count = 0;

        for (int i = 2; i < computerNumber + 1; i++) {
            if (visited[i]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
