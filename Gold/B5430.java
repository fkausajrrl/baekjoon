package Gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class B5430 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

//        함수 R : 배열에 있는 수의 순서를 뒤집는 함수
//        함수 D : 첫 번째 수를 버리는 함수              <배열이 비어있는데 D를 사용한 경우에는 에러>


        int size = Integer.parseInt(bf.readLine()); //최대 100
        StringBuilder sb = new StringBuilder();

        while (size > 0) {
            Deque<Integer> deque = new ArrayDeque<>();
            String command = bf.readLine(); //명령어                      1 ≤ p ≤ 100,000
            int ArraySize = Integer.parseInt(bf.readLine()); //배열 크기   0 ≤ n ≤ 100,000
            String Array = bf.readLine(); //배열 내용                      1 ≤ xi ≤ 100
            int i = 0;
            boolean frontBackCheak = false; //true : 앞, false : 뒤
            boolean DWhether = true;

            Array = Array.replaceAll("[\\[\\[\\]]", ""); //'[' ,']' 2개 제거
            StringTokenizer st = new StringTokenizer(Array, ",");
            while (st.hasMoreTokens()) { //토큰이 존재할때까지
                deque.offerFirst(Integer.valueOf(st.nextToken()));
            }

            while (i < command.length()) { //명렁어 수행
                switch (command.charAt(i)) {
                    case 'R'://배열 순서 뒤집기
                        frontBackCheak = !frontBackCheak; //반대 값 넣기
                        if (deque.isEmpty() && (i+1 == command.length())) { //수행 후 deque 비었음.
                            DWhether = false;
                        }
                        break;
                    case 'D':
                        if (deque.isEmpty()) {
                            sb.append("error\n");
                            i = command.length();
                            break;
                        }
                        if (frontBackCheak) { //앞에서 부터 시작
                            deque.pollFirst(); //제일 앞의 값 제거
                            if (deque.isEmpty() && (i+1 == command.length())) { //수행 후 deque 비었음.
                                DWhether = false;
                            }
                            break;
                        } else { //뒤에서 부터 시작
                            deque.pollLast(); //제일 뒤의 값 제거
                            if (deque.isEmpty() && (i+1 == command.length())) { //수행 후 deque 비었음.
                                DWhether = false;
                            }
                            break;
                        }
                }
                i++;
            }
            if (!deque.isEmpty()) {
                sb.append("[");
                while (!deque.isEmpty()) {
                    sb.append(frontBackCheak ? deque.pollFirst() : deque.pollLast());
                    if (!deque.isEmpty()) {
                        sb.append(",");
                    }
                }
                sb.append("]\n");
            }
            else if (!DWhether){
                sb.append("[]\n");
            }
            size--;
        }
        System.out.println(sb);
    }
}
