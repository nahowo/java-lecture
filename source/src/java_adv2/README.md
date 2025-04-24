# 목차
- 2: [문자 인코딩](https://github.com/nahowo/java-lecture/blob/main/source/src/java_adv2/README.md#%EC%84%B9%EC%85%98-2-%EB%AC%B8%EC%9E%90-%EC%9D%B8%EC%BD%94%EB%94%A9)
- 3: [I/O 기본 1](https://github.com/nahowo/java-lecture/blob/main/source/src/java_adv2/README.md#%EC%84%B9%EC%85%98-3-io-%EA%B8%B0%EB%B3%B8-1)
- 4: [I/O 기본 2](https://github.com/nahowo/java-lecture/blob/main/source/src/java_adv2/README.md#%EC%84%B9%EC%85%98-4-io-%EA%B8%B0%EB%B3%B8-2)
- 5: [I/O 활용](https://github.com/nahowo/java-lecture/blob/main/source/src/java_adv2/README.md#%EC%84%B9%EC%85%98-5-io-%ED%99%9C%EC%9A%A9)
- 6: [File, Files](https://github.com/nahowo/java-lecture/blob/main/source/src/java_adv2/README.md#%EC%84%B9%EC%85%98-6-file-files)
- 7: [네트워크 - 기본 이론](https://github.com/nahowo/java-lecture/blob/main/source/src/java_adv2/README.md#%EC%84%B9%EC%85%98-7-%EB%84%A4%ED%8A%B8%EC%9B%8C%ED%81%AC---%EA%B8%B0%EB%B3%B8-%EC%9D%B4%EB%A1%A0)
- 8: [프로그램1](https://github.com/nahowo/java-lecture/blob/main/source/src/java_adv2/README.md#%EC%84%B9%EC%85%98-8-%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%A81)
- 9: [프로그램2](https://github.com/nahowo/java-lecture/blob/main/source/src/java_adv2/README.md#%EC%84%B9%EC%85%98-9-%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%A82)
- 10: [채팅 프로그램](https://github.com/nahowo/java-lecture/blob/main/source/src/java_adv2/README.md#%EC%84%B9%EC%85%98-10-%EC%B1%84%ED%8C%85-%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%A8)
- 11: [HTTP - 기본 이론](https://github.com/nahowo/java-lecture/blob/main/source/src/java_adv2/README.md#%EC%84%B9%EC%85%98-11-http---%EA%B8%B0%EB%B3%B8-%EC%9D%B4%EB%A1%A0)
- 12: [HTTP 서버 만들기](https://github.com/nahowo/java-lecture/blob/main/source/src/java_adv2/README.md#%EC%84%B9%EC%85%98-12-http-%EC%84%9C%EB%B2%84-%EB%A7%8C%EB%93%A4%EA%B8%B0)
- 13: [리플렉션](https://github.com/nahowo/java-lecture/blob/main/source/src/java_adv2/README.md#%EC%84%B9%EC%85%98-13-%EB%A6%AC%ED%94%8C%EB%A0%89%EC%85%98)
- 14: [애노테이션](https://github.com/nahowo/java-lecture/blob/main/source/src/java_adv2/README.md#%EC%84%B9%EC%85%98-14-%EC%95%A0%EB%85%B8%ED%85%8C%EC%9D%B4%EC%85%98)
- 15: [HTTP 서버 활용](https://github.com/nahowo/java-lecture/blob/main/source/src/java_adv2/README.md#%EC%84%B9%EC%85%98-15-http-%EC%84%9C%EB%B2%84-%ED%99%9C%EC%9A%A9)

# 섹션 2: 문자 인코딩
- 문자 인코딩: 문자 집합을 통해 문자를 숫자로 전환하는 것
- 문자 디코딩: 문자 집합을 통해 숫자를 문자로 변환하는 것
- `String.getByte(charset)`을 사용하면 바이트 배열을 얻을 수 있다. 문자 집합을 지정해 원하는 문자 집합을 인코딩에 사용한다.

# 섹션 3: I/O 기본 1
## 스트림
- 자바 프로세스의 데이터를 밖으로 보내려면 출력 스트림, 반대라면 입력 스트림을 사용한다. 각 스트림은 단방향으로 흐른다. 
- FileOutputStream, FileInputStream은 자바 입장에서 외부 자원을 사용하는 것이므로 사용 후 반드시 닫아주어야 한다.
- InputStream, OutputStream: 다양한 스트림들을 추상화(추상 클래스)하고 기본 기능에 대한 표준을 통해 파일, 네트워크, 메모리 등에 대해 편리한 입출력 작업 수행 가능

## 파일 입출력과 성능 최적화
- FileOutputStream, FileInputStream의 write(), read()를 호출할 때마다 OS의 시스템 콜을 통해 명령을 수행한다. 이런 연산은 매우 무겁기 때문에 시간이 오래 걸린다. OS나 하드웨어 레벨에서 최적화가 발생하지만 시스템 콜은 발생하므로 read(), write() 호출 자체를 줄여야 한다. 
### 버퍼를 사용한 출력
- 많은 데이터를 한번에 전달해 시스템 콜을 줄이면 성능을 최적화할 수 있다. 
- 하지만 디스크나 파일 시스템에서 데이터를 읽고 쓰는 기본 단위가 보통 4~8KB이기 때문에 무조건 버퍼 크기를 키운다고 해서 속도가 계속 줄어들지는 않는다. 따라서 버퍼의 크기도 4~8KB(4096 ~ 8192byte)로 잡는 것이 효율적이다. 
### Buffered 스트림
- BufferedOutputStream, BufferedInputStream은 직접 버퍼를 만들어 사용하지 않고 내부에서 대신 처리하도록 한다. 
- FileOutputStream처럼 단독으로 사용 가능한 스트림을 기본 스트림이라고 한다. 
- BufferedOutputStream처럼 단독으로 사용할 수 없고, 보조 기능을 제공하는 스트림을 보조 스트림이라고 한다. 보조 스트림은 기능을 제공할 대상 기본 스트림이 있어야 한다. 
- 직접 버퍼를 다루는 것보다 BufferedXXX가 느린 이유: BufferedXXX는 동기화를 위해 스레드 안전하게 락을 사용한다.
### 한 번에 쓰고 읽기
- 버퍼 크기를 파일 크기와 동일하게 사용하면 한번에 쓸 수 있다. 
- readAllBytes()를 사용하면 한번에 읽을 수 있다. 
- 이 경우 모든 데이터가 한번에 들어오므로 메모리를 신경써야 한다. 

# 섹션 4: I/O 기본 2
## 스트림을 문자로 다루기
- OutputStreamWriter: 스트림에 문자를 저장할 수 있도록 한다.
- InputStreamReader: 스트림을 문자로 읽을 수 있도록 한다. 

# 섹션 5: I/O 활용
### 객체 직렬화
- 메모리에 있는 객체 인스턴스를 바이트 스트림으로 변환해 파일에 저장하거나 네트워크를 통해 전송할 수 있도록 하는 기능이다. 
- 객체 직렬화를 사용하려면 Serializable 인터페이스를 구현해야 한다. 아무런 기능이 없고 단지 직렬화 가능한 클래스라는 것을 표시하기 위한 인터페이스이다(마커 인터페이스).
## XML, JSON
- 객체 직렬화를 사용하면 버전 관리가 어렵고, 플랫폼 종속적이며 직렬화/역직렬화 과정이 느리다. 또한 직렬화 방식을 변경하기 어렵고 데이터 크기가 많다는 단점이 있다. 
- XML(eXtensible Markup Language): 플랫폼 종속성을 해결하기 위해 나타난 객체 직렬화의 대안, 복잡하고 무거움
- JSON(JavaScript Object Notation): 자바스크립트와의 호환성, 가볍고 간결한 구조를 가진 객체 직렬화의 대안, 웹 환경에서 데이터 교환 시 사실상 표준 기술
## 데이터베이스
- 파일에 데이터를 직접 저장하면 아래와 같은 문제가 발생한다. 
  - 데이터 무결성을 보장하기 어렵다. 
  - 데이터 검색/관리가 비효율적이다. 
  - 파일 기반 시스템에는 접근 제어/암호화 등의 보안 문제가 생길 수 있다. 
  - 대규모 데이터의 효율적 백업/복구가 필요하다. 
- 데이터베이스는 이런 문제를 해결하며 발전한 서버 프로그램이다. 

# 섹션 6: File, Files
- File은 과거와의 호환을 위해 남겨두었다. Files를 사용하는 것이 좋다.

# 섹션 7: 네트워크 - 기본 이론

# 섹션 8: 프로그램1
### 서버
- 서버는 특정 포트를 열어두어야 한다. 클라이언트가 이 포트를 지정해 접속할 수 있다. 
- 서버는 서버 소켓이라는 특별한 소켓을 사용한다. 지정한 포트를 이용해 서버 소켓을 생성한다. 
  - 서버 소켓은 클라이언트와 서버의 TCP 연결만 지원하는 특별한 소켓이다. 
  - ServerSocket.accept() 메서드를 호출하면 TCP 연결 정보를 기반으로 Socket 객체를 만들어 반환한다. 
- 서버가 지정 포트로 서버 소켓을 열어둔다. 클라이언트가 이 지정 포트로 서버에 접속한다. 클라이언트가 접속을 시도하면 TCP 3 way Handshake가 발생하고, TCP 연결이 완료된다. 
- TCP 연결이 완료되면 서버는 OS backlog queue에 클라이언트와 서버의 TCP 연결 정보를 보관한다. 
- 서버의 input은 클라이언트의 output이고, output은 클라이언트의 input이다. 
### 클라이언트
- 클라이언트는 자신의 포트를 지정하지 않고 랜덤 포트를 생성한다. 서버와 다르게 클라이언트는 자신의 포트가 명확하게 지정되어 있지 않아도 된다.
- localhost로 호스트를 지정했으므로 localhost를 통해 컴퓨터의 포트에 TCP 접속을 시도한다. 
  - localhost IP를 찾기 위해 내부적으로 InetAddress를 사용한다. 
- 연결이 성공적으로 완료되면 Socket 객체를 반환한다. 이 객체를 통해 서버와 통신한다. 
- 클라이언트의 input은 서버의 output이고, output은 서버의 input이다.
### 입력을 반복해서 받도록 수정
- while문을 이용해 입력을 Scanner로 받고 exit이 들어오기 전까지 무한 반복하도록 수정할 수 있다. 
- 그런데 클라이언트를 여러 개 실행하면 하나만 정상적으로 입력을 받아오고 나머지 클라이언트는 서버 응답을 받아오지 못하는 문제가 발생한다. 
### 서버 소켓과 연결
- 여러 클라이언트가 서버에 접속하는 경우
  - 서버가 서버 소켓을 열어둔다. 
  - 랜덤 포트를 사용하는 클라이언트가 먼저 해당 포트의 서버에 접속을 시도한다. 
  - TCP 3 way Handshake가 발생하고, TCP 연결이 완료된다.
  - TCP 연결이 완료되면 서버는 OS backlog queue에 클라이언트와 서버의 TCP 연결을 보관한다. 
- 이 시점에 TCP 3 way Handshake가 완료되었기 때문에 클라이언트와 서버의 TCP 연결은 이미 완료되었고, 클라이언트 소켓 객체도 생성된다. 서버의 소켓 객체는 생성되지 않았다. 
- 이때 다른 클라이언트가 위와 동일한 과정을 거쳐 클라이언트 소켓 객체를 생성한다. 
- 서버가 클라이언트와 데이터를 주고받으려면 소켓을 획득해야 한다. ServerSocket.accept() 메서드를 호출하면 backlog queue 정보를 기반으로 소켓 객체를 하나 생성한다. 
- 큐 순서대로 데이터를 꺼내면 맨 처음 연결되었던 클라이언트와의 접속을 기반으로 서버 소켓이 생성된다. 이러면 첫 번째 클라이언트와 서버는 소켓 스트림을 통해 데이터를 주고받을 수 있다. 
- 두 번째 클라이언트도 서버와 TCP 연결이 되어있기 때문에 서버로 메시지를 보낼 수 있다.
- 클라이언트가 메시지를 서버에 전송하는 경우
  - 클라이언트: 애플리케이션 -> OS TCP 송신 버퍼 -> 클라이언트 네트워크 카드
  - 클라이언트가 보낸 메시지가 서버에 도착했을 때의 서버: 서버 네트워크 카드 -> OS TCP 수신 버퍼 -> 애플리케이션
- 두 번째 클라이언트가 보낸 메시지는 서버 애플리케이션에서 아직 읽지 않았기 때문에 OS TCP 수신 버퍼에서 대기한다. 
- accept() 메서드는 이미 연결된 TCP 연결 정보를 기반으로 서버 측에 소켓 객체를 생성한다. 이 소켓 객체가 있어야 스트림을 사용해 메시지를 주고받을 수 있다. 
- accept() 메서드는 backlog queue에 새로운 연결 정보가 도착할 때까지 블로킹 상태로 대기한다. 
### 현재 서버의 문제점
- accept() 메서드를 한 번만 호출해 서버에 소켓 객체가 한 개만 생긴다. 
- 2개의 블로킹 작업은 각각 스레드에서 처리해야 한다. accept()와 readXXX() 메서드 둘 다 블로킹 메서드이다. 
### 자원 정리
- 서로 관련된 자원끼리는 항상 먼저 생성한 자원을 먼저 정리해야 한다. 
- 직접 try - catch를 작성하면 순서를 헷갈릴 수 있고, 복잡한 코드를 작성해야 한다. try - with - resources 구문을 사용해 자원을 깔끔하게 정리할 수 있다. 
  - try - with - resources 구문을 사용하면 선언된 자원들의 역순으로 close를 수행해준다. 
  - 자원을 정리하는 과정에서 발생하는 예외는 핵심 예외가 아니라고 가정하고 핵심 예외 안에 압축(suppress)한다. 
- 장점
  - 리소스 누수 방지
  - 코드 간결성/가독성 향상
  - 스코프 범위 한정
  - 조금 더 빠른 자원 해제
  - 자원 정리 순서
  - 부가 예외 포함

# 섹션 9: 프로그램2
- 먼저 선언된 변수를 try - with - resources 구문 안에 넣고 싶다면 선언 없이 변수명만 추가해주면 된다. 
### 셧다운 훅(shutdown hook)
- 자바는 프로세스가 종료될 때 자원 정리나 로그 기록과 같은 종료 작업을 마무리할 수 있는 셧다운 훅 기능을 제공한다. 
- 프로세스 종류는 크게 아래 2가지로 분류할 수 있다. 
1. 정상 종료
   - 모든 non-deamon 스레드 실행 완료로 자바 프로세스 정상 종료
   - 사용자가 Ctrl + C를 눌러 프로그램 중단
   - kill 명령 전달(kill -9 제외)
   - intelliJ의 stop 버튼
2. 강제 종료
   - 운영체제에서 프로세스를 더 이상 유지할 수 없다고 판단할 때 사용
   - 리눅스/유닉스의 kill -9나 윈도우의 taskkill /F
- 셧다운 훅은 정상 종료의 경우에만 작동해 프로세스 종료 전에 필요한 후처리를 할 수 있다. 
- try - with - resources는 사용한 자원을 try가 끝나는 시점에 정리한다. 이 경우가 아닐 때(서버를 종료하는 경우 등)에도 사용하는 자원을 정리해야 한다면 try - with - resources 구문을 사용할 수 없다. 

## 네트워크 예외
### 연결 예외
- `UnknownHostException`: 호스트를 알 수 없음
- `ConnectException` - Connection refused: 연결이 거절됨
### 타임 아웃
- 네트워크 연결을 시도해서 서버 IP에 연결 패킷을 전달했지만 응답이 없는 경우
- **연결 타임아웃**
  - 연결을 시도했는데 일정 시간 안에 연결이 성공하지 못하는 경우
- **TCP 소켓 타임아웃: read 타임아웃**
  - 성공적으로 연결한 이후 서버에 요청을 보냈는데 서버가 계속 응답을 주지 않는 경우
  - Socket 객체에 요청 이후 대기할 타임아웃 시간을 설정할 수 있다. 설정하지 않으면 무한 대기한다. 
### 정상 종료
- TCP 연결을 종료하려면 서로 FIN 메시지를 보내야 한다. 
- 서버에서 socket.close()를 호출하면 클라이언트에 FIN 패킷을 보낸다. 
- 서버에게서 FIN 패킷을 받은 클라이언트의 소켓은 더는 서버를 통해 읽을 데이터가 없다는 의미로 -1(EOF)를 반환한다. 
- **EOF 반환값**
  - read: -1
  - BufferedReader().readLine(): null
  - DataInputStream().readUTF(): EOFException
### 강제 종료
- TCP 연결 중 문제가 발생하면 RST 패킷이 전송된다. RST 패킷이 전송되면 현재 TCP 연결에 심각한 문제가 있으므로 해당 연결을 더 이상 사용하면 안 된다는 의미이다. 
## 네트워크 종료와 예외 처리
- 네트워크에서 위의 예외를 따로 이해하고 다루기는 어렵기 때문에, 기본적으로 정상 종료와 강제 종료 모두 자원을 정리하고 닫도록 설계한다. 
- 기본적으로는 IOException이 발생 시 자원을 정리하도록 하고, 더 세부적으로 분류해야 하는 경우는 그때 예외를 구분해 처리하면 된다. 

# 섹션 10: 채팅 프로그램
- 전체 과정은 [여기](https://nahowo.tistory.com/31)에 있다. 
## 리팩토링
### 커맨드 패턴(Command Pattern)
- 커맨드 패턴은 요청을 독립적인 객체로 변환해 처리하는 패턴이다. 
  - 분리: 작업을 호출하는 객체와 작업을 수행하는 객체를 분리한다. 
  - 확장성: 기존 코드를 변경하지 않고 새 명령을 추가할 수 있다. OCP을 잘 수행한다. 
- 단점은 간단한 작업인 경우에도 새 객체/인터페이스를 만들어야 하며 그 객체를 호출/관리하는 클래스 등 여러 클래스를 만들어야 하기 때문에 복잡성이 증가한다. 
- 기능이 많고 각 기능이 명확히 나누어지며 향후 기능 확장까지 고려해야 한다면 커맨드 패턴은 좋은 대안이 될 수 있다.
### 널 오브젝트 패턴(Null Object Pattern)
- 널 오브젝트 패턴은 null을 객체처럼 처리하는 방법이다. null 대신 사용할 수 있는 특별한 객체를 만들어 예외 상황을 방지한다. 

# 섹션 11: HTTP - 기본 이론
# 섹션 12: HTTP 서버 만들기
# 섹션 13: 리플렉션
# 섹션 14: 애노테이션
# 섹션 15: HTTP 서버 활용
