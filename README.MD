# 섹션 2
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