# Algorithm

> ## Baekjoon

> ## Programmers

> ## ETC

# Algorithm 풀기 전 알아두기
> ## 자료형(Data Types) 
자바의 자료형은 크게 기본 자료형(Primitive)과 참조 자료형(Reference Type)으로 구분

### 1. 기본 자료형 (Primitive Data Types)
- `byte`: 1바이트 (-128 ~ 127)
- `short`: 2바이트 (-32,768 ~ 32,767)
- `int`: 4바이트 (-2^31 ~ 2^31-1)
- `long`: 8바이트 (-2^63 ~ 2^63-1)
- `float`: 4바이트 (단정도 부동소수점)
- `double`: 8바이트 (배정도 부동소수점)
- `char`: 2바이트 (0 ~ 65,535, 문자 하나를 표현)
- `boolean`: 1비트 (true 또는 false)

### 2. 참조 자료형 (Reference Types)
참조 자료형은 배열, 클래스, 인터페이스 등 객체를 참조하는 자료형으로 배열은 고정 크기의 자료형을 저장하고 객체는 동적으로 메모리를 할당

> ## 배열과 리스트 (Array & List)

배열과 리스트는 데이터를 저장하는 기본적인 자료구조로

### 배열 (Array):
- 고정 크기 배열: 한 번 크기가 설정되면 크기를 변경할 수 없음
- 배열은 연속된 메모리 공간에 데이터를 저장하므로 검색과 인덱스 접근이 매우 빠름
- 배열은 `int[] arr = new int[10];`처럼 선언하고, `arr[0] = 5;`처럼 사용
- **단점**: 크기를 동적으로 변경할 수 없음

### ArrayList:
- 동적 배열로 배열은 크기가 고정되지만 ArrayList는 크기가 동적으로 변할 수 있음
- ArrayList는 요소를 추가하거나 삭제할 때 내부적으로 크기를 재조정함
- ex.  `ArrayList<Integer> list = new ArrayList<>();`로 선언하고 `list.add(10);`으로 추가
- **장점**: 크기 조정이 가능하여 유연
- **단점**: 요소 추가/삭제 시에 메모리 재조정이 필요하여 성능이 떨어질 수 있음

> ## 시간복잡도 (Time Complexity)

알고리즘의 성능을 평가하기 위해 시간복잡도를 계산함
일반적으로 빅오 표기법(Big O notation)을 사용하여 시간 복잡도를 나타냄

- `O(1)`: 상수 시간 복잡도, 입력 크기와 상관없이 일정 시간 소요
- `O(n)`: 선형 시간 복잡도, 입력 크기 `n`에 비례하여 시간이 증가
- `O(n^2)`: 이차 시간 복잡도, 두 개의 중첩된 반복문이 있을 때 발생
- `O(log n)`: 로그 시간 복잡도, 이진 탐색과 같이 문제를 절반씩 줄여가는 알고리즘에서 발생
- `O(n log n)`: 선형 로그 시간 복잡도, 퀵 정렬, 병합 정렬 등이 해당

> ## 조건문과 반복문 (Conditional Statements & Loops)

### 조건문 (if, switch): 조건문은 특정 조건에 따라 실행 흐름을 제어하는 구조
- `if문`: 주어진 조건이 참이면 해당 코드 블록을 실행
- `switch문`: 여러 조건 중 하나에 해당하는 코드를 실행할 때 사용

### 반복문 (for, while, do-while): 반복문은 주어진 조건을 만족하는 동안 코드를 반복적으로 실행
- `for문`: 주어진 횟수만큼 반복할 때 사용
- `while문`: 조건이 참일 때 반복 실행
- `do-while문`: 조건 검사 후 반복을 실행하는데 적어도 한 번은 실행됨

> ## 재귀 (Recursion)

재귀는 함수가 자기 자신을 호출하는 방식으로 문제를 해결하는 기법입으로 트리나 그래프 탐색에서 유용하게 사용

### 재귀 함수의 기본 구조:

```java
public int factorial(int n) {
    if (n == 0) return 1;
    return n * factorial(n - 1);
}
```
- 종료 조건이 필요하며 종료 조건이 없으면 무한히 재귀가 호출
- 재귀 함수는 스택을 사용하므로 너무 깊은 재귀 호출은 스택 오버플로우를 일으킴

> ## 자료구조 (Data Structures)
### 스택 (Stack)
후입선출(LIFO) 구조로 주로 함수 호출이나 문자열 반전 등에 사용
기본 연산: push(), pop(), peek()
### 큐 (Queue)
선입선출(FIFO) 구조로 프린터 큐, 버퍼 처리 등에서 사용
기본 연산: enqueue(), dequeue()
### 트리 (Tree)
계층적 구조를 나타내는 자료구조로 이진 트리나 이진 탐색 트리(BST) 등에서 사용
트리는 DFS(깊이 우선 탐색), BFS(너비 우선 탐색) 등의 알고리즘을 적용할 수 있음

### 그래프 (Graph)
노드와 엣지로 구성된 자료구조로 DFS, BFS, 다익스트라 등 그래프 관련 알고리즘을 구현할 때 사용

> ## 정렬 알고리즘 (Sorting Algorithms)
정렬 알고리즘은 데이터를 오름차순 또는 내림차순으로 정렬하는 방법

### 버블 정렬 (Bubble Sort)
인접한 두 원소를 비교하여 자리를 바꾸는 방식
**시간복잡도 O(n^2)**이므로 데이터가 많을 경우 비효율적

### 퀵 정렬 (Quick Sort)
분할 정복 방식으로 데이터를 분할하고 정렬
**시간복잡도 O(n log n)**으로 효율적

### 병합 정렬 (Merge Sort)
배열을 반으로 나누어 정렬한 뒤 합치는 방식
**시간복잡도 O(n log n)**

> ## 탐색 알고리즘 (Search Algorithms)
### 이진 탐색 (Binary Search)
정렬된 배열에서 원하는 값을 반씩 나누어 찾는 효율적인 탐색 방법
**시간복잡도 O(log n)**

### DFS (깊이 우선 탐색) & BFS (너비 우선 탐색)
DFS는 스택을 사용하고 BFS는 큐를 사용하여 그래프 탐색을 구현

> ## 동적 계획법 (Dynamic Programming)
동적 계획법(DP)은 문제를 작은 하위 문제로 나누어 해결한 뒤 그 결과를 메모리에 저장하여 중복 계산을 피하는 방식<br>
ex. 피보나치 수열 문제

> ## 그리디 알고리즘 (Greedy Algorithm)
그리디 알고리즘은 각 단계에서 현재 가장 좋은 선택을 하는 방식<br>
ex. 동전 문제에서 가장 큰 단위의 동전부터 사용해 나가는 방식
