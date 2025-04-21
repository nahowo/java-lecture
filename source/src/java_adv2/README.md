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
# 섹션 7: 네트워크 - 기본 이론
# 섹션 8: 프로그램1
# 섹션 9: 프로그램2
# 섹션 10: 채팅 프로그램
# 섹션 11: HTTP - 기본 이론
# 섹션 12: HTTP 서버 만들기
# 섹션 13: 리플렉션
# 섹션 14: 애노테이션
# 섹션 15: HTTP 서버 활용
