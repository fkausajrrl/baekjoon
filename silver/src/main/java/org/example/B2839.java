//상근이는 귀찮기 때문에, 최대한 적은 봉지를 들고 가려고 한다. 예를 들어, 18킬로그램 설탕을 배달해야 할 때, 3킬로그램 봉지 6개를 가져가도 되지만, 5킬로그램 3개와 3킬로그램 1개를 배달하면, 더 적은 개수의 봉지를 배달할 수 있다.
//
//상근이가 설탕을 정확하게 N킬로그램 배달해야 할 때, 봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오.
//18 -> 4봉지(5,5,5,3)
//BUT, 4 -> -1     ==>이거 처럼 나머지가 생기는 경우는 -1 출력
package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B2839 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int weight = Integer.parseInt(br.readLine());
        int count = 0;

        while (weight % 5 != 0 && weight >= 0) { //5kg으로 나눠지고, weight가 0이상일 경우에 반복
            weight -= 3;
            count++;
        }

        if (weight < 0) {
            System.out.println(-1);
        } else {
            System.out.println(count + weight / 5);
        }
    }
}
