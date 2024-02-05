package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class B1835 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(bf.readLine()); //size
        Queue<Integer> queue = new LinkedList<>();

//        Queue<Interger> queue = new linklist<>();
//        queue.poll();   첫번쨰 반환 + 삭제
//        queue.offer();  삽입
//        queue.peek();   첫번째 반환

//        Stack<Integer> stack = new Stack<>();
//        stack.push(); 값 넣기
//        stack.peek(); 제일 위에 값 출력
//        stack.pop(); 제일 위에 값 출력 + 제거
//        stack.empty(); 비었는지 여부 확인


        //4는 마지막에 내려놓으니까 result[0]에 넣기
        // -> 3도 4전에 내려놓으니까 result[0] 값 result[1]로 옮기고, result[0]에 넣고 3번 뒤로 셔플    => 3,4
        // -> result[0,1] 값 result [1,2]로 옮기고, 2를 result[0]에 넣고, 앞에꺼 뒤로 2번
        // -> result[0,1,2] 값 result [1,2,3]로 옮기고,1을 result[0]에 넣고, 앞에꺼 제일 뒤로 =>끝

        for (int i = size; i > 0; i--) {
            queue.offer(i);
            for (int j = 0; j < i; j++) {
                queue.offer(queue.poll());
            }
        }
        StringBuilder sb = new StringBuilder();
        /* 전체 출력 */
        while(!queue.isEmpty()){
            sb.insert(0, queue.poll() + " "); //insert 통해서 앞에서 부터 들어가니까 3,4,1,2 저장된게 앞에서 부터 차례대로 밀면서 들어가서 3 -> 4,3 -> 1,4,3 -> 2,1,4,3
        }
        System.out.println(sb.toString().trim()); //trim()통해서 앞뒤 공백 제거
    }
}