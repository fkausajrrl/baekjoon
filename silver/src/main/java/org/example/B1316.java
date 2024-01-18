/*그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다.
  예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만,
  aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.

  단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.*/
//입력
//첫째 줄에 단어의 개수 N이 들어온다. N은 100보다 작거나 같은 자연수이다. 둘째 줄부터 N개의 줄에 단어가 들어온다. 단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다.

//출력
//첫째 줄에 그룹 단어의 개수를 출력한다.
//알고리즘.
//main
// - 크기 읽기
// - 단어 읽어서 checkGroupWord로 넘겨주기 -> 함수 사용하니까 Alphabet 배열 자동으로 초기화

//checkGroupWord
// - 단어 받기
// - 알파벳 배열 선언                    - 같은 경우 => 다음 반복문으로
// - previous와 current값 일치 여부 if문 - 다른 경우 => if문 해서 알파벳 배열 확인
// - 단어 하나씩 보면서 알파벳 배열에 true상태인지 확인
// 1. true인 경우 -> 그룹 단어 아님 false를 main에 반환
// 2. false인 경우 -> 알파벳 배열에 저장, 이전 값(previous)으로 현재 값 설정.
package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B1316 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;
        int size = Integer.parseInt(br.readLine());

        for (int i = 0; i < size; i++) {
            if (checkGroupWord(br.readLine())) {
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean checkGroupWord(String word) {
        boolean[] alphabet = new boolean[26];

        int previous = 0;
        for(int i = 0; i < word.length(); i++) {
            int current = word.charAt(i);

            if (previous != current) {
                if (!alphabet[current - 'a']) { //해당 알파벳 사용 한적 없음.
                    alphabet[current - 'a'] = true; //해당 알파벳 true로 변경
                    previous = current; //previous로 설정.
                } else {//이전 알파벳과 다른 알파벳 이지만 알파벳 배열에 이미 true값 기록 되 있음.
                    return false;
                }
            }
        }
        return true;
    }
}
//원래 코드

///*그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다.
//예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만,
//aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
//
//단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.*/
////입력
////첫째 줄에 단어의 개수 N이 들어온다. N은 100보다 작거나 같은 자연수이다. 둘째 줄부터 N개의 줄에 단어가 들어온다. 단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다.
//
////출력
////첫째 줄에 그룹 단어의 개수를 출력한다.
//
////결론 같은 알파벳이 반복되면 그건 카운트 X
//package org.example;
//
//        import java.io.BufferedReader;
//        import java.io.InputStreamReader;
//        import java.util.Arrays;
//
//public class B1316 {
//    public static void main(String[] args) throws Exception {
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // buffer로 읽어들이기
//
//        int size = Integer.parseInt(bf.readLine()); //크기 읽기
//        int[] Alphabet = new int[26]; //알파벳
//        Arrays.fill(Alphabet, 0); //0으로 초기화
//        String sentence;
//
//        int count = 0; //그룹 단어 카운트
//        for (int i = 0; i < size; i++) {
//            sentence = bf.readLine();
//            for (int j = 0; j < sentence.length(); j++) {
//                int asc = sentence.charAt(j);
//                int pre = Alphabet[asc - 97];
//                if (pre == j - 1) {
//                    Alphabet[asc - 97] = j;
//                    count++;
//                } else {
//                    break;
//                }
//            }
//        }
//        System.out.println(count);
//    }
//}
