# baekjoon
<h1>1920번</h1>
문제<br>
N개의 정수 A[1], A[2], …, A[N]이 주어져 있을 때, 이 안에 X라는 정수가 존재하는지 알아내는 프로그램을 작성하시오.<br>
<br>
입력<br>
첫째 줄에 자연수 N(1 ≤ N ≤ 100,000)이 주어진다. 다음 줄에는 N개의 정수 A[1], A[2], …, A[N]이 주어진다. 다음 줄에는 M(1 ≤ M ≤ 100,000)이 주어진다. 다음 줄에는 M개의 수들이 주어지는데, 이 수들이 A안에 존재하는지 알아내면 된다. 모든 정수의 범위는 -231 보다 크거나 같고 231보다 작다.<br>
<br>
출력<br>
M개의 줄에 답을 출력한다. 존재하면 1을, 존재하지 않으면 0을 출력한다.<br>
=>Tip : strList.contains(Mnumber)으로 하면 contains의 시간 복잡도가 O(n), 따라서 strList말고 Hashset사용함으로서 시간 복잡도도 O(1)이 되고, 배열도 사용 안해도 됨!<br>
=> 데이터의 크기가 크고, 특히 데이터의 검색이 빈번하게 이루어질 때는 HashSet을 사용하는 것이 훨씬 효율적<br>
<hr>
<h1>1463번 1로 만들기 </h1>
문제<br>
정수 X에 사용할 수 있는 연산은 다음과 같이 세 가지 이다.<br>
<br>
1. X가 3으로 나누어 떨어지면, 3으로 나눈다.<br>
2. X가 2로 나누어 떨어지면, 2로 나눈다.<br>
3. 1을 뺀다.<br>
정수 N이 주어졌을 때, 위와 같은 연산 세 개를 적절히 사용해서 1을 만들려고 한다. 연산을 사용하는 횟수의 최솟값을 출력하시오.<br>
<br>
입력<br>
첫째 줄에 1보다 크거나 같고, 106보다 작거나 같은 정수 N이 주어진다.<br>
<br>
출력<br>
첫째 줄에 연산을 하는 횟수의 최솟값을 출력한다.<br>
<hr>
<h1>18258번 <h3>10845와 크기만 다름</h3></h1>
문제<br>
정수를 저장하는 큐를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.<br>
<br>
명령은 총 여섯 가지이다.<br>
<br>
push X: 정수 X를 큐에 넣는 연산이다.<br>
pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.<br>
size: 큐에 들어있는 정수의 개수를 출력한다.<br>
empty: 큐가 비어있으면 1, 아니면 0을 출력한다.<br>
front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.<br>
back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
<br>
입력<br>
첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 2,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다.<br>
주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다. 문제에 나와있지 않은 명령이 주어지는 경우는 없다.<br>
<br>
출력<br>
출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력한다.<br>
<hr>
<h1>28278번 <h3>10828 스텍 문제와 거의 같음</h3></h1>
문제<br>
정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.<br>
<br>
명령은 총 다섯 가지이다.<br>
<br>
1 X: 정수 X를 스택에 넣는다. (1 ≤ X ≤ 100,000)<br>
2: 스택에 정수가 있다면 맨 위의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.<br>
3: 스택에 들어있는 정수의 개수를 출력한다.<br>
4: 스택이 비어있으면 1, 아니면 0을 출력한다.<br>
5: 스택에 정수가 있다면 맨 위의 정수를 출력한다. 없다면 -1을 대신 출력한다.
<br>
입력<br>
첫째 줄에 명령의 수 N이 주어진다. (1 ≤ N ≤ 1,000,000)<br>
<br>
둘째 줄부터 N개 줄에 명령이 하나씩 주어진다.<br>
<br>
출력을 요구하는 명령은 하나 이상 주어진다.<br>
<br>
출력<br>
출력을 요구하는 명령이 주어질 때마다 명령의 결과를 한 줄에 하나씩 출력한다.<br>
<hr>
<h1>2164번 카드2</h1>
문제<br>
N장의 카드가 있다. 각각의 카드는 차례로 1부터 N까지의 번호가 붙어 있으며, 1번 카드가 제일 위에, N번 카드가 제일 아래인 상태로 순서대로 카드가 놓여 있다.<br>
<br>
이제 다음과 같은 동작을 카드가 한 장 남을 때까지 반복하게 된다. 우선, 제일 위에 있는 카드를 바닥에 버린다. 그 다음, 제일 위에 있는 카드를 제일 아래에 있는 카드 밑으로 옮긴다.<br>
<br>
예를 들어 N=4인 경우를 생각해 보자. 카드는 제일 위에서부터 1234 의 순서로 놓여있다. 1을 버리면 234가 남는다. 여기서 2를 제일 아래로 옮기면 342가 된다. 3을 버리면 42가 되고, 4를 밑으로 옮기면 24가 된다. 마지막으로 2를 버리고 나면, 남는 카드는 4가 된다.<br>
<br>
N이 주어졌을 때, 제일 마지막에 남게 되는 카드를 구하는 프로그램을 작성하시오.<br>
<br>
입력<br>
첫째 줄에 정수 N(1 ≤ N ≤ 500,000)이 주어진다.<br>
<br>
출력<br>
첫째 줄에 남게 되는 카드의 번호를 출력한다.<br>
<hr>
<h1>1835번 카드</h1>
문제<br>
1부터 N까지의 숫자가 적힌 카드가 있다. 찬유는 이 카드를 가지고 마술을 하려 한다. 마술을 하는 순서는 다음과 같다.<br>
<br>
먼저 1부터 N까지의 숫자가 적힌 카드에서 첫 번째 카드를 가장 뒤로 옮긴다. 그러고 나서 첫 번째 카드를 책상 위에 올려놓는다. 그런데 그 카드는 1이 되어야 한다.<br>
그리고 남은 카드 중에서 첫 번째 카드를 가장 뒤로 옮기고, 또 가장 앞에 있는 카드를 가장 뒤로 옮긴다.(2번 반복) 그리고 가장 앞에 있는 카드를 책상 위에 올려놓는다. 그런데 그 카드는 2가 되어야 한다.<br>
또 남은 카드 중에서 첫 번째 카드를 가장 뒤로 옮기고... (3번 반복) 그리고 가장 앞에 있는 카드를 책상위에 올려놓는데 그것은 3이 된다.<br>
또 남은 카드 중에서 첫 번째 카드를 가장 뒤로 옮기고.. (4번 반복) 그리고 가장 앞에 있는 카드를 책상 위에 올려놓는데 그것은 4이다.<br>
위 과정을 계속 반복하여 N번 카드만 남을 때 까지 반복한다.<br>
위와 같은 카드를 하려면 미리 카드의 순서를 알고 있어야 한다. 카드의 개수 N이 주어져 있을 때 위의 마술을 하기 위한 카드의 초기 순서를 구하는 프로그램을 작성하시오.<br>
<br>
입력<br>
첫 번째 줄에 카드의 개수 N(1 ≤ N ≤ 1,000)이 주어진다.<br>
<br>
출력<br>
첫 번째 줄부터 N번째 줄까지 차례로 카드의 순서를 출력한다.<br>
<hr>
<h1>5430번 AC</h1>
문제<br>
선영이는 주말에 할 일이 없어서 새로운 언어 AC를 만들었다. AC는 정수 배열에 연산을 하기 위해 만든 언어이다. 이 언어에는 두 가지 함수 R(뒤집기)과 D(버리기)가 있다.<br>
<br>
함수 R은 배열에 있는 수의 순서를 뒤집는 함수이고, D는 첫 번째 수를 버리는 함수이다. 배열이 비어있는데 D를 사용한 경우에는 에러가 발생한다.<br>
<br>
함수는 조합해서 한 번에 사용할 수 있다. 예를 들어, "AB"는 A를 수행한 다음에 바로 이어서 B를 수행하는 함수이다. 예를 들어, "RDD"는 배열을 뒤집은 다음 처음 두 수를 버리는 함수이다.<br>
<br>
배열의 초기값과 수행할 함수가 주어졌을 때, 최종 결과를 구하는 프로그램을 작성하시오.<br>
<br>
입력<br>
첫째 줄에 테스트 케이스의 개수 T가 주어진다. T는 최대 100이다.<br>
<br>
각 테스트 케이스의 첫째 줄에는 수행할 함수 p가 주어진다. p의 길이는 1보다 크거나 같고, 100,000보다 작거나 같다.<br>
<br>
다음 줄에는 배열에 들어있는 수의 개수 n이 주어진다. (0 ≤ n ≤ 100,000)<br>
<br>
다음 줄에는 [x1,...,xn]과 같은 형태로 배열에 들어있는 정수가 주어진다. (1 ≤ xi ≤ 100)<br>
<br>
전체 테스트 케이스에 주어지는 p의 길이의 합과 n의 합은 70만을 넘지 않는다.<br>
<br>
출력<br>
각 테스트 케이스에 대해서, 입력으로 주어진 정수 배열에 함수를 수행한 결과를 출력한다. 만약, 에러가 발생한 경우에는 error를 출력한다.<br>
<br>
예외 처리할게 많았음.
<hr>
<h1>12852번 1로 만들기 2</h1>
문제<br>
정수 X에 사용할 수 있는 연산은 다음과 같이 세 가지 이다.<br>
<br>
1. X가 3으로 나누어 떨어지면, 3으로 나눈다.<br>
2. X가 2로 나누어 떨어지면, 2로 나눈다.<br>
3. 1을 뺀다.<br>
정수 N이 주어졌을 때, 위와 같은 연산 세 개를 적절히 사용해서 1을 만들려고 한다. 연산을 사용하는 횟수의 최솟값을 출력하시오.<br>
<br>
입력<br>
첫째 줄에 1보다 크거나 같고, 10^6보다 작거나 같은 정수 N이 주어진다.<br>
<br>
출력<br>
첫째 줄에 연산을 하는 횟수의 최솟값을 출력한다.<br>
둘째 줄에는 N을 1로 만드는 방법에 포함되어 있는 수를 공백으로 구분해서 순서대로 출력한다. 정답이 여러 가지인 경우에는 아무거나 출력한다.<br>
<hr>
<h1>1929번 소수 구하기</h1>
<h3> 에라토스테네스의 체 사용해야지 시간 초과 안됨.</h3>
문제<br>
M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.<br>
<br>
입력<br>
첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다. (1 ≤ M ≤ N ≤ 1,000,000) M이상 N이하의 소수가 하나 이상 있는 입력만 주어진다.<br>
<br>
출력<br>
한 줄에 하나씩, 증가하는 순서대로 소수를 출력한다.<br>
<hr>
<h1>9095번 1,2,3 더하기</h1>
<h3>dp(동적 프로그래밍)사용해서 이전 값들 이용하기</h3>
문제<br>
정수 4를 1, 2, 3의 합으로 나타내는 방법은 총 7가지가 있다. 합을 나타낼 때는 수를 1개 이상 사용해야 한다.<br>
<br>
1+1+1+1<br>
1+1+2<br>
1+2+1<br>
2+1+1<br>
2+2<br>
1+3<br>
3+1<br>
정수 n이 주어졌을 때, n을 1, 2, 3의 합으로 나타내는 방법의 수를 구하는 프로그램을 작성하시오.<br>
<br>
입력<br>
첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 정수 n이 주어진다. n은 양수이며 11보다 작다.<br>
<br>
출력<br>
각 테스트 케이스마다, n을 1, 2, 3의 합으로 나타내는 방법의 수를 출력한다.<br>
<hr>
<h1>2606번 바이러스</h1>
<h3>dfs 깊이 우선 탐색 방법 사용</h3>
<h5>알고리즘 공부 하자;;;;;</h5>
문제<br>
신종 바이러스인 웜 바이러스는 네트워크를 통해 전파된다. 한 컴퓨터가 웜 바이러스에 걸리면 그 컴퓨터와 네트워크 상에서 연결되어 있는 모든 컴퓨터는 웜 바이러스에 걸리게 된다.<br>
<img alt src="https://www.acmicpc.net/upload/images/zmMEZZ8ioN6rhCdHmcIT4a7.png" style="width: 239px; height: 157px; ">
예를 들어 7대의 컴퓨터가 <그림 1>과 같이 네트워크 상에서 연결되어 있다고 하자. 1번 컴퓨터가 웜 바이러스에 걸리면 웜 바이러스는 2번과 5번 컴퓨터를 거쳐 3번과 6번 컴퓨터까지 전파되어 2, 3, 5, 6 네 대의 컴퓨터는 웜 바이러스에 걸리게 된다. 하지만 4번과 7번 컴퓨터는 1번 컴퓨터와 네트워크상에서 연결되어 있지 않기 때문에 영향을 받지 않는다.<br>
<br>
<br>
어느 날 1번 컴퓨터가 웜 바이러스에 걸렸다. 컴퓨터의 수와 네트워크 상에서 서로 연결되어 있는 정보가 주어질 때, 1번 컴퓨터를 통해 웜 바이러스에 걸리게 되는 컴퓨터의 수를 출력하는 프로그램을 작성하시오.<br>
<br>
입력<br>
첫째 줄에는 컴퓨터의 수가 주어진다. 컴퓨터의 수는 100 이하인 양의 정수이고 각 컴퓨터에는 1번 부터 차례대로 번호가 매겨진다. 둘째 줄에는 네트워크 상에서 직접 연결되어 있는 컴퓨터 쌍의 수가 주어진다. 이어서 그 수만큼 한 줄에 한 쌍씩 네트워크 상에서 직접 연결되어 있는 컴퓨터의 번호 쌍이 주어진다.<br>
<br>
출력<br>
1번 컴퓨터가 웜 바이러스에 걸렸을 때, 1번 컴퓨터를 통해 웜 바이러스에 걸리게 되는 컴퓨터의 수를 첫째 줄에 출력한다.<br>
<hr>
<h1>2579번 계단 오르기</h1>
<h3>dp사용하기 + 조건 if로 일일이 할필요 X => 3개 연속 X, 이 조건을 Math.max(dp[i - 3] + stairs[i - 1], dp[i - 2]) + stairs[i] 이걸로 처리해버림.</h3>
문제<br>
계단 오르기 게임은 계단 아래 시작점부터 계단 꼭대기에 위치한 도착점까지 가는 게임이다. <그림 1>과 같이 각각의 계단에는 일정한 점수가 쓰여 있는데 계단을 밟으면 그 계단에 쓰여 있는 점수를 얻게 된다.<br>
<img alt="" src="https://u.acmicpc.net/7177ea45-aa8d-4724-b256-7b84832c9b97/Screen%20Shot%202021-06-23%20at%203.00.46%20PM.png" style="width: 300px; height: 160px;">
<그림 1><br>
<br>
예를 들어 <그림 2>와 같이 시작점에서부터 첫 번째, 두 번째, 네 번째, 여섯 번째 계단을 밟아 도착점에 도달하면 총 점수는 10 + 20 + 25 + 20 = 75점이 된다.<br>
<img alt="" src="https://u.acmicpc.net/7177ea45-aa8d-4724-b256-7b84832c9b97/Screen%20Shot%202021-06-23%20at%203.00.46%20PM.png" style="width: 300px; height: 160px;">
<그림 2><br>
<br>
계단 오르는 데는 다음과 같은 규칙이 있다.<br>
<br>
계단은 한 번에 한 계단씩 또는 두 계단씩 오를 수 있다. 즉, 한 계단을 밟으면서 이어서 다음 계단이나, 다음 다음 계단으로 오를 수 있다.<br>
연속된 세 개의 계단을 모두 밟아서는 안 된다. 단, 시작점은 계단에 포함되지 않는다.<br>
마지막 도착 계단은 반드시 밟아야 한다.<br>
따라서 첫 번째 계단을 밟고 이어 두 번째 계단이나, 세 번째 계단으로 오를 수 있다. 하지만, 첫 번째 계단을 밟고 이어 네 번째 계단으로 올라가거나, 첫 번째, 두 번째, 세 번째 계단을 연속해서 모두 밟을 수는 없다.<br>
<br>
각 계단에 쓰여 있는 점수가 주어질 때 이 게임에서 얻을 수 있는 총 점수의 최댓값을 구하는 프로그램을 작성하시오.<br>
<br>
입력<br>
입력의 첫째 줄에 계단의 개수가 주어진다.<br>
<br>
둘째 줄부터 한 줄에 하나씩 제일 아래에 놓인 계단부터 순서대로 각 계단에 쓰여 있는 점수가 주어진다. 계단의 개수는 300이하의 자연수이고, 계단에 쓰여 있는 점수는 10,000이하의 자연수이다.<br>
<br>
출력<br>
첫째 줄에 계단 오르기 게임에서 얻을 수 있는 총 점수의 최댓값을 출력한다.<br>
<hr>
<h1>15649 ~ 15657번 N과M</h1>
<h3>순열, 조합, 중복 순열, 중복 조합 등등... 밑에 문제는 15649번 여기서 조금씩 바뀐거 뿐임.</h3>
<h5>단골 알고리즘 이니까 코테 준비하면 외우면 좋다고 함.</h5>
문제<br>
자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.<br>
<br>
1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열<br>
입력<br>
첫째 줄에 자연수 N과 M이 주어진다. (1 ≤ M ≤ N ≤ 8)<br>
<br>
출력<br>
한 줄에 하나씩 문제의 조건을 만족하는 수열을 출력한다. 중복되는 수열을 여러 번 출력하면 안되며, 각 수열은 공백으로 구분해서 출력해야 한다.<br>
<br>
수열은 사전 순으로 증가하는 순서로 출력해야 한다.<br>
<hr>
<h1>17413번 단어 뒤집기2</h1>
문제<br>
문자열 S가 주어졌을 때, 이 문자열에서 단어만 뒤집으려고 한다.<br>
<br>
먼저, 문자열 S는 아래와과 같은 규칙을 지킨다.<br>
<br>
알파벳 소문자('a'-'z'), 숫자('0'-'9'), 공백(' '), 특수 문자('<', '>')로만 이루어져 있다.<br>
문자열의 시작과 끝은 공백이 아니다.<br>
'<'와 '>'가 문자열에 있는 경우 번갈아가면서 등장하며, '<'이 먼저 등장한다. 또, 두 문자의 개수는 같다.<br>
태그는 '<'로 시작해서 '>'로 끝나는 길이가 3 이상인 부분 문자열이고, '<'와 '>' 사이에는 알파벳 소문자와 공백만 있다. 단어는 알파벳 소문자와 숫자로 이루어진 부분 문자열이고, 연속하는 두 단어는 공백 하나로 구분한다. 태그는 단어가 아니며, 태그와 단어 사이에는 공백이 없다.<br>
<br>
입력<br>
첫째 줄에 문자열 S가 주어진다. S의 길이는 100,000 이하이다.<br>
<br>
출력<br>
첫째 줄에 문자열 S의 단어를 뒤집어서 출력한다.<br>
<hr>
