# 목차
- 2: [Hello world](https://github.com/nahowo/java-start?tab=readme-ov-file#%EC%84%B9%EC%85%98-2-hello-world)
- 3: [변수](https://github.com/nahowo/java-start?tab=readme-ov-file#%EC%84%B9%EC%85%98-3-%EB%B3%80%EC%88%98)
- 4: [연산자](https://github.com/nahowo/java-start?tab=readme-ov-file#%EC%84%B9%EC%85%98-4-%EC%97%B0%EC%82%B0%EC%9E%90)
- 5: [조건문](https://github.com/nahowo/java-start?tab=readme-ov-file#%EC%84%B9%EC%85%98-5-%EC%A1%B0%EA%B1%B4%EB%AC%B8)
- 6: [반복문](https://github.com/nahowo/java-start?tab=readme-ov-file#%EC%84%B9%EC%85%98-6-%EB%B0%98%EB%B3%B5%EB%AC%B8)
- 7: [스코프, 형변환](https://github.com/nahowo/java-start?tab=readme-ov-file#%EC%84%B9%EC%85%98-7-%EC%8A%A4%EC%BD%94%ED%94%84-%ED%98%95%EB%B3%80%ED%99%98)
- 8: [훈련](https://github.com/nahowo/java-start?tab=readme-ov-file#%EC%84%B9%EC%85%98-8-%ED%9B%88%EB%A0%A8)
- 9: [배열](https://github.com/nahowo/java-start?tab=readme-ov-file#%EC%84%B9%EC%85%98-9-%EB%B0%B0%EC%97%B4)
- 10: [메서드](https://github.com/nahowo/java-start?tab=readme-ov-file#%EC%84%B9%EC%85%98-10-%EB%A9%94%EC%84%9C%EB%93%9C)
---

# 섹션 2: Hello World
## 3: 자바 프로그램 실행
### public class HelloJava
- HelloJava는 클래스이다. 파일명과 클래스명은 같아야 한다. 
- {} 블록으로 클래스를 구분한다. 

### public static void main(String[] args) {}
- main은 함수(메서드)이다. 클래스와 동일하게 {} 블록으로 메서드를 구분한다. 
- 자바는 main(String[] args) 메서드를 찾아서 프로그램을 시작한다. 메서드 이름이 main이더라도 매개변수가 다르면 인식하지 못한다. 
  ```plain text 
  Error: Main method not found in class HelloJava, please define the main method as:
    public static void main(String[] args)
    or a JavaFX application class must extend javafx.application.Application
- psvm으로 빠르게 main 메서드를 작성할 수 있다(intelliJ). 
- System.out.println은 값을 콘솔에 출력한다. sout을 단축키로 사용한다.  
  - soutv를 사용하면 가장 가까운 변수를 자동으로 sout에 추가한다. 
- 자바는 문자열을 사용할 때 쌍따옴표를 사용한다. 

### 주석
- //로 한 줄 주석이 가능하다. 
- /* */사이에 주석처리할 코드를 작성하면 여러 줄 주석이 가능하다.

---
## 5: 자바란?
### 자바 표준 스펙
- 자바는 **표준 스택**과 **구현**으로 나눌 수 있다.
- 자바 표준 스택: java 컴파일러 스펙, java 실행 라이브러리 스펙, JVM 스펙 등
  - 자바는 이렇게 만들어야 한다는 설계도
  - 여러 회사에서 표준 스택을 기반으로 실제 작동하는 자바를 만듦
  - 자바 표준 스펙은 자바 커뮤니티 프로세스(JCP)를 통해 관리
- 다양한 자바 구현
  - 여러 회사에서 자바 표준 스펙에 맞추어 실제 작동하는 자바 프로그램 개발
    - Amazon Correto(AWS에 최적화)
  - 각 회사들은 대부분 Windows, MAC, Linux등 다양한 OS에서 작동하는 버전의 자바도 함께 제공
  - 예시: java 컴파일러, java 실행 라이브러리, JVM 구현
    - 오라클 Open JDK
    - Adopitum Eclipse Temurin
    - Amazon Correto
- 다른 회사 제품으로 변경하더라도 대부분 문제 없이 작동
### 컴파일과 실행
1. Hello.java 같은 java 소스 코드를 개발자가 작성 
2. javac 프로그램(java 컴파일러)가 Hello.java 소스 코드를 컴파일.java -> .class 파일 생성
3. 자바 소스 코드를 바이트코드로 변환해 자바 가상 머신에서 더 빠르게 실행되도록 최적화/문법 오류 검출
4. java 프로그램으로 자바 프로그램 실행
5. JVM이 실행되며 프로그램 작동

- intelliJ를 통한 자바 컴파일/실행
  - 컴파일: intelliJ가 자동으로 javac 프로그램 실행
  - 프로젝트 디렉토리의 out 디렉토리에 컴파일된 .class파일 존재
  - 실행: 클래스 파일의 초록 삼각형을 누르면 intelliJ가 컴파일(javac)/실행(java) 둘 다 수행

### 자바와 운영체제 독립성
- 일반적 프로그램은 특정 OS가 사용하는 명령어들로 구성되기 때문에, 다른 OS에서 실행할 수 없다. 
- 자바는 자바가 설치된 모든 OS에서 실행할 수 있다. 자바가 OS 호환성 문제를 알아서 해결한다.
- 개발자가 MAC 환경에서 자바 코드를 개발하고, 컴파일한 .class 파일을 Linux 기반 서버에 배포해도 아무런 문제 없이 사용 가능하다.


# 섹션 3: 변수
### 패키지
- 자바 파일을 구분하기 위한 폴더로 이해하기
- 패키지 내부의 클래스에는 ```package {패키지명};``` 이라는 코드로 소속 패키지를 선언해야 한다.
### 변수
- 변수 선언: 값을 보관할 데이터 저장소를 만든다. 어떤 데이터가 들어갈지, 어떤 이름인지를 지정한다. 
- 변수에 값 대입: 저장소에 실제 데이터를 넣는다. 대입 연산자(=)를 사용한다.
- 자바는 runtime에 변수의 값을 읽어 사용한다. 
- 변수의 값 변경
  - static이 아닌 변수는 대입 연산자를 여러번 사용해 업데이트할 수 있다. 
### 변수 선언
- 하나씩, 여러개씩 변수를 선언할 수 있다. 
- 초기화하지 않은 변수 읽기
  ```
  java: variable c might not have been initialized
  ```
  - 변수를 초기화하지 않고 접근하면 위와 같은 컴파일 오류가 발생한다. 
  - 컴파일 오류이기 때문에 .java 파일에서 오류가 발생하고, .class 파일은 생성되지 않는다.
  - 컴퓨터에서 메모리는 여러 시스템이 함께 사용한다. 변수 선언 시 메모리상의 어떤 공간을 차지/사용하는데, 기존에 어떤 값이 있었는지 알 수 없다. 따라서 초기화를 하지 않으면 이상한 값이 출력될 수 있다. 
  - 또한 자바는 초기화되지 않은 변수(선언만 하고 초기화/사용이 없음)는 컴파일하지 않도록 최적화한다.
### 변수 타입
- int: 정수, 각 타입의 최대값을 선언하면 아래와 같다. 범위를 벗어나면 컴파일 오류가 발생한다. 
  - byte(1byte): 2^8
  - short(2byte): 2^16
  - int(4byte): 2^32
  - long(8byte): 2^64, 숫자 뒤에 L을 붙여줘야 한다(소문자 l은 1과 혼동 가능성이 있어 지양). 
    ```java
    byte b = 127;
    short s = 32767;
    int i = 2147483647;
    long l = 9223372036854775807L;

- double: 실수, 각 타입의 최대값을 선언하면 아래와 같음
  - float(4byte): 2^32, 숫자 뒤에 f를 붙여줘야 한다. 
  - float(8byte): 2^64
      ```java
    float f = 10.0f;
    double d = 10.0;
- boolean(1byte): 참/거짓
- char(1byte): 문자 하나, 따옴표(')로 감쌈
- String: 문자열, 쌍따옴표(")로 감쌈, 문자 길이에 따라 메모리도 동적으로 달라짐
### 리터럴(Literal)
- 변수를 직접 작성한 고정된 값들을 리터럴이라고 한다. 리터럴 자체는 바뀌지 않는다.
### 실무에서의 사용
- byte, short, float, char은 거의 사용하지 않는다. 메모리 용량보다 개발 속도/효율에 초점을 맞추는 게 더 효과적이다.
- 정수는 int, long을 주로 사용한다. 파일을 다룰 떄는 가끔 byte를 사용한다. 
- 실수는 무조건 double을 사용한다. 
- 조건문에서 boolean을 사용한다. 
- 문자 하나든 문자열이든 모두 String을 사용하는 게 편리하다. 
### 변수 명명 규칙
- **규칙**
  - 숫자로 시작 불가능
  - 공백 포함 불가능
  - 예약어 사용 불가능
  - 영문자, 숫자, 달러 기호, 언더바만 사용 가능
- **관례**
  - 카멜 케이스 사용
  - 클래스는 대문자로 시작, 카멜 케이스
  - 나머지는 소문자로 시작, 카멜 케이스
  - 예외
    - 상수는 전부 대문자, 스네이크 케이스 사용
    - 패키지는 모두 소문자
  - 변수명은 용도를 명확하게 설명하는 단어를 사용해야 한다.

# 섹션 4: 연산자
### 산술 연산자
- `+`: 더하기
- `-`: 빼기
- `*`: 곱하기
- `/`: 나누기, 정수끼리 나누면 소수점 제거(round)
- `%`: 나머지
- 0으로 나누는 것은 허용되지 않음(/ by zero 예외 발생)
  - `ArithmeticException`은 `RuntimeException`을 상속하는 런타임 예외이다. 따라서 .java 파일이 .class 파일로 컴파일되고 컴파일된 파일 안에서도 변수가 0으로 세팅된 것을 확인할 수 있다.

### 문자열 더하기
- String 타입의 문자열을 더하기 연산자로 연산하면 순서대로 문자열을 연결해 새 문자열을 만든다.
  - char 타입에 더하기 연산자를 사용하면 아스키 코드값의 합을 반환한다. 
    ```java
    char c1 = 'A';
    char c2 = 'A';
    System.out.println(c1 + c2); // 130
- 문자열과 다른 타입을 함께 사용하면 문자열로 연결한다.
  ```java
  String s = "Hello ";
  String ac = "!";
  int c = 103;
  double d = 10.8;
  char c = 'c';
  boolean b = true;
  System.out.println(s + c + ac); // Hello 103!
  System.out.println(s + d + ac); // Hello 10.8!
  System.out.println(s + c + ac); // Hello c!
  System.out.println(s + b + ac); // Hello true!
  
### 연산자 우선순위
- 우선순위 변경을 위해 괄호 사용(가독성 고려)
- 우선순위
1. 괄호
2. 단항 연산자(++, --, !, ~, new, (type))
3. 산술 연산자
4. Shift 연산자(<<, >>, >>>)
5. 비교 연산자(<, <=, >, >=, instanceof)
6. 등식 연산자(==, !=)
7. 비트 연산자(&, ^, |)
8. 논리 연산자(&&, ||)
9. 삼항 연산자(? :)
10. 대입 연산자(=, ...)
- 실무에서의 사용법: 모든 연산자 우선순위를 외우지 말고 적당히 사용
  - 상식선에서 사용하자. 
  - 애매하면 괄호를 사용하자. 

### 증감 연산자
- `a = a + 1`을 `a ++`로 사용할 수 있다. 
- `a = a - 1`을 `a --`로 사용할 수 있다.
- 증감 연산자는 피연산자 앞/뒤에 둘 수 있고, 위치에 따라 연산 수행 시점이 달라진다. 
- ++a는 전위(prefix) 증감 연산자이다. a값을 증가시킨 뒤 a변수를 사용한다. 
- a++는 후위(postfix) 증감 연산자이다. a변수를 사용한 뒤 a값을 증가시킨다. 

### 비교 연산자
- `==`: 동등
- `!=`: 불일치
- `>`: 큼
- `<`: 작음
- **문자열 비교**
  - 문자열 비교에는 `==` 대신 `.equals()`를 사용한다. 
    ```java
    String str1 = "문자열 1";
    String str2 = "문자열 1";
    System.out.println(str1.equals(str2)); // true
- 단축키
  - `cmd + D`: 현재 줄 복사
  - `ctrl + shift + R`: 현재 파일 컴파일 + 실행
  - `ctrl + R`: 직전 컴파일된 파일 실행
  - `cmd + shift + enter`: 자동완성

### 논리 연산자
- boolean 비교에 사용
- `&&`: AND
- `||`: OR
- `!`: NOT

### 대입 연산자
- `=`: 왼쪽 변수에 오른쪽 값 할당
- 축약(복합) 대입 연산자: 산술 연산자와 대입 연산자를 함께 사용(`+=`, `-=`등)


# 섹션 5: 조건문
### if문
- 특정 조건이 참인지 확인하고 true일 경우 특정 코드 블럭을 실행한다. 
### else문
- if문에서 만족하는 조건이 없을 때 실행하는 코드를 제공한다. 
- if문에 해당하면 if문 블럭 실행, if문에 해당하지 않은 모든 경우는 else문 블럭 실행
### else if문
- 앞선 if문의 조건이 거짓일 때 순서대로 다음 조건을 검사한다. 
- 조건 분기가 여러가지일 때 if문을 여러개 사용하는 것보다 적은 비교를 수행한다. 
### switch문
- `switch({변수명})`과 `case: {값}`으로 특정 변수의 값에 대응하는 코드 블럭을 사용한다. if문처럼 참/거짓을 나누는 게 아니라 특정 값인지만 확인한다. 
- if문과 다르게 각 case문에 break가 없다면 다음 case도 실행한다. 
- 자바  14의 새로운 switch 문법
  ```java
  int coupon = switch (grade) {
    case 1 -> 5;
    case 2 -> 10;
    case 3 -> 15;
    default -> 0;
    };

### 삼항 연산자
- 참/거짓의 경우를 한 문장에 담을 수 있는 연산자
- `{조건문} ? {참일 경우 값} : {거짓일 경우 값}`의 형태로 작성한다. 

# 섹션 6: 반복문
- 특정 코드를 반복해서 실행할 때 사용한다. 
### while문
- 조건에 따라 코드를 반복해서 실행한다. 
### do-while문
- 조건 만족 여부와 상관없이 적어도 한 번은 블럭을 실행하는 while문이다. 
- `do {실행 코드} while (조건)`형식이며 do문의 실행 코드를 한 번 실행한 뒤 조건을 검사한다. 
### break
- 반복문을 종료하고 루프를 벗어난다. 
### continue
- 현재 반복을 종료하고 다음 반복으로 넘어간다. 
### for문
- 반복 횟수가 정해져 있을 때 사용하는 반복문이다. 
- `for (초기식; 조건식; 증감식)` 형식이며 아래와 같은 순서로 실행된다. 
1. 초기식 실행
2. 조건식 검증(거짓이면 루프를 빠져나감)
3. 코드 실행
4. 증감식 실행
5. 2번으로 되돌아감
- 무한 루프를 for문으로 작성하려면 `for (; ;)`를 사용한다. 
### for vs while
- for문은 초기화, 조건 검사, 반복 후 작업이 규칙적으로 한 줄에 모두 들어있어 코드를 이해하기 쉽다. 
- while문은 해당 내용이 여러 곳에 분산되어 있어 가독성이 떨어진다. 

# 섹션 7: 스코프, 형변환
### 지역 변수
- 지역 변수는 자신이 선언된 블럭 안에서만 사용 가능하다. 코드 블럭이 종료되면 해당 변수도 생존이 종료된다. 
### 스코프
- 필요한 용도와 시간에 따라 스코프를 설정하면 메모리를 낭비하지 않아도 된다. 또한 어디에서 어떤 변수가 사용되는지 명확하게 확인할 수 있다. 
### 자동 형변환(묵시적 형변환)
- 작은 범위 -> 큰 범위는 형변환이 가능하다. 
- 큰 범위 -> 작은 범위는 소수점, 오버플로우 등의 문제가 발생할 수 있다. 
- 작은 범위 -> 큰 범위 변환을 자바가 자동으로 변환해준다. 
  ```java
  int i = 10;
  long l;
  l = i;
- 이때 (long)을 생략해도 올바르게 형변환이 이루어진다. 

### 명시적 형변환
- 큰 범위 -> 작은 범위 형변환의 경우 명시하지 않으면 컴파일 오류가 발생한다. 
  ```java
  double d = 1.5;
  int i = (int) d; // 1
- double에서 int로 형변환이 이루어져 소수점이 사라진다. 대신 i는 d의 값을 읽어온 뒤  d의 값은 1.5 그대로 유지된다. 
- 작은 범위로의 형변환 시 범위 내 값을 대입하면 정상적으로 동작하지만, 범위를 초과하면 오버플로우가 발생한다. 

### 계산과 형변환
```java
public static void main(String[] args) {
    int div1 = 3 / 2;
    System.out.println("div1 = " + div1); // 1
    double div2 = 3 / 2;
    System.out.println("div2 = " + div2); // 1.0
    double div3 = 3.0 / 2;
    System.out.println("div3 = " + div3); // 1.5
    double div4 = (double) 3 / 2;
    System.out.println("div4 = " + div4); // 1.5
}
```

- **같은 타입끼리의 계산은 같은 타입의 결과를 낸다.** 
- **서로 다른 타입의 계산은 큰 범위로 자동 형변환이 일어난다.** 

# 섹션 8: 훈련

# 섹션 9: 배열

# 섹션 10: 메서드