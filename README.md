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
<br>
