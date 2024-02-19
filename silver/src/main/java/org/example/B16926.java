package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B16926 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String sizes = bf.readLine();
        String[] firstLine = sizes.split(" ");

        int row = Integer.parseInt(firstLine[0]); //행 갯수
        int col = Integer.parseInt(firstLine[1]); //열 갯수
        int R = Integer.parseInt(firstLine[2]); //회전 수

        int[][] matrix = new int[row][col];
//        2 ≤ N, M ≤ 300
//        1 ≤ R ≤ 1,000
//        min(N, M) mod 2 = 0
//        1 ≤ Aij ≤ 108
        for (int i = 0; i < row; i++) {
            String line = bf.readLine(); //각 줄에 대해서 읽어들이기
            String[] splitLine = line.split(" "); // 공백으로 분리
            for (int j = 0; j < col; j++) {
                matrix[row][col] = Integer.parseInt(splitLine[j]);
            }
        }

    }
}
