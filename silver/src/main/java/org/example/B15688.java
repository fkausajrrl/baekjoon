//Arrays.sort(value);//오림차순 정렬
//        Arrays.sort는 퀵 정렬, 병합 정렬, 힙 정렬 등을 기반으로 한 Dual-Pivot Quicksort 알고리즘임.  시간 복잡도가 O(n log n)
//        더 빠른 정렬 알고리즘은 계수 정렬(Counting Sort). 각 원소의 값이 정수이고, 그 범위가 알려져 있을 때만 사용
package org.example;

import java.io.*;

public class B15688 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[] value = new int[2000001];

        for (int i = 0; i < size; i++) {
            value[Integer.parseInt(bf.readLine()) + 1000000]++;
        }

        for(int i = 0; i < 2000001; i++) {
            while(value[i]-- > 0) {
                bw.write((i - 1000000) + "\n");
            }
        }
        bw.flush();
        bw.close(); //출력에서도 버퍼 사용하면 시간 더 단축됨.
    }//버퍼로 출력 안하면 시간 초과로 안넘어감.
}

