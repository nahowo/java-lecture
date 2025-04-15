# 목차
- 2: [프로세스와 스레드 소개](https://github.com/nahowo/java-lecture/tree/main/source/src/java_adv1#%EC%84%B9%EC%85%98-2-%ED%94%84%EB%A1%9C%EC%84%B8%EC%8A%A4%EC%99%80-%EC%8A%A4%EB%A0%88%EB%93%9C-%EC%86%8C%EA%B0%9C)
- 3: [스레드 생성과 실행](https://github.com/nahowo/java-lecture/tree/main/source/src/java_adv1#%EC%84%B9%EC%85%98-3-%EC%8A%A4%EB%A0%88%EB%93%9C-%EC%83%9D%EC%84%B1%EA%B3%BC-%EC%8B%A4%ED%96%89)
- 4: [스레드 제어와 생명 주기 1](https://github.com/nahowo/java-lecture/tree/main/source/src/java_adv1#%EC%84%B9%EC%85%98-4-%EC%8A%A4%EB%A0%88%EB%93%9C-%EC%A0%9C%EC%96%B4%EC%99%80-%EC%83%9D%EB%AA%85-%EC%A3%BC%EA%B8%B0-1)
- 5: [스레드 제어와 생명 주기 2](https://github.com/nahowo/java-lecture/tree/main/source/src/java_adv1#%EC%84%B9%EC%85%98-5-%EC%8A%A4%EB%A0%88%EB%93%9C-%EC%A0%9C%EC%96%B4%EC%99%80-%EC%83%9D%EB%AA%85-%EC%A3%BC%EA%B8%B0-2)
- 6: [메모리 가시성](https://github.com/nahowo/java-lecture/tree/main/source/src/java_adv1#%EC%84%B9%EC%85%98-6-%EB%A9%94%EB%AA%A8%EB%A6%AC-%EA%B0%80%EC%8B%9C%EC%84%B1)
- 7: [동기화 - synchronized](https://github.com/nahowo/java-lecture/tree/main/source/src/java_adv1#%EC%84%B9%EC%85%98-7-%EB%8F%99%EA%B8%B0%ED%99%94---synchronized)
- 8: [고급 동기화 - concurrent.Lock](https://github.com/nahowo/java-lecture/tree/main/source/src/java_adv1#%EC%84%B9%EC%85%98-8-%EA%B3%A0%EA%B8%89-%EB%8F%99%EA%B8%B0%ED%99%94---concurrentlock)
- 9: [생산자 소비자 문제 1](https://github.com/nahowo/java-lecture/tree/main/source/src/java_adv1#%EC%84%B9%EC%85%98-9-%EC%83%9D%EC%82%B0%EC%9E%90-%EC%86%8C%EB%B9%84%EC%9E%90-%EB%AC%B8%EC%A0%9C-1)
- 10: [생산자 소비자 문제 1](https://github.com/nahowo/java-lecture/tree/main/source/src/java_adv1#%EC%84%B9%EC%85%98-10-%EC%83%9D%EC%82%B0%EC%9E%90-%EC%86%8C%EB%B9%84%EC%9E%90-%EB%AC%B8%EC%A0%9C-2)
- 11: [CAS - 동기화와 원자적 연산](https://github.com/nahowo/java-lecture/tree/main/source/src/java_adv1#%EC%84%B9%EC%85%98-11-cas---%EB%8F%99%EA%B8%B0%ED%99%94%EC%99%80-%EC%9B%90%EC%9E%90%EC%A0%81-%EC%97%B0%EC%82%B0)
- 12: [동시성 컬렉션](https://github.com/nahowo/java-lecture/tree/main/source/src/java_adv1#%EC%84%B9%EC%85%98-12-%EB%8F%99%EC%8B%9C%EC%84%B1-%EC%BB%AC%EB%A0%89%EC%85%98)
- 13: [스레드 풀과 Executor 프레임워크 1](https://github.com/nahowo/java-lecture/tree/main/source/src/java_adv1#%EC%84%B9%EC%85%98-13-%EC%8A%A4%EB%A0%88%EB%93%9C-%ED%92%80%EA%B3%BC-executor-%ED%94%84%EB%A0%88%EC%9E%84%EC%9B%8C%ED%81%AC-1)
- 14: [스레드 풀과 Executor 프레임워크 2](https://github.com/nahowo/java-lecture/tree/main/source/src/java_adv1#%EC%84%B9%EC%85%98-14-%EC%8A%A4%EB%A0%88%EB%93%9C-%ED%92%80%EA%B3%BC-executor-%ED%94%84%EB%A0%88%EC%9E%84%EC%9B%8C%ED%81%AC-2)

# 섹션 2: 프로세스와 스레드 소개
### 멀티태스킹
- 하나의 CPU 코어가 매우 빠르게 두 프로그램의 코드를 번갈아 수행한다면 두 프로그램이 동시에 실행되는 것처럼 느껴질 것이다. 
- `시분할(Time Sharing)`: 프로그램의 실행 시간을 분할해(스케줄링) 동시에 실행되는 것처럼 하는 기법
- 운영체제가 스케줄링 기법을 이용해 CPU 사용을 배분한다. 
- `멀티태스킹(Multi-Tasking)`: 하나의 컴퓨터 시스템이 동시에 여러 작업을 수행하는 것
- 소프트웨어 기반으로 성능 향상

### 멀티프로세싱
- CPU 코어가 여러개인 경우 실제 물리적으로 동시에 프로그램을 처리할 수 있다. 
- `멀티프로세싱(Multi-Processing)`: 둘 이상의 프로세서(CPU 코어)를 사용하여 여러 작업을 동시에 처리하는 기술
- 하드웨어 기반으로 성능 향상

## 프로세스와 스레드

### 프로세스
- 운영체제 안에서 실행 중인 프로그램
- 프로세스는 프로그램의 인스턴스이다. 
- 각 프로세스는 독립적인 메모리 공간을 가지며, 서로 간섭하지 않고 서로의 메모리에 직접 접근할 수 없다. 운영체제에서 별도의 작업 단위로 분리해서 관리된다. 
- 독립되어 있기 때문에 하나의 프로세스가 충돌해도 다른 프로세스에 영향을 주지 않는다. 
- 메모리 구성
  - `코드 섹션`: 실행할 프로그램의 코드
  - `데이터 섹션`: 전역/정적 변수
  - `힙`: 동적으로 할당되는 메모리 영역
  - `스택`: 메서드 호출 시 생성되는 지역 변수와 반환 주소가 저장되는 영역(스레드에 포함)

### 스레드
- **프로세스는 하나 이상의 스레드를 반드시 포함한다.**
- 프로세스 내에서 실행되는 작업의 단위
- 한 프로세스 내에서 여러 스레드가 존재할 수 있다. 프로세스가 제공하는 메모리 공간을 스레드끼리 공유한다. 
- 스레드는 프로세스보다 단순하므로 생성 및 관리가 단순하고 가볍다. 
- 메모리 구성
  - `공유 메모리`: 같은 프로세스의 메모리 영역 공유
  - `개별 스택`: 각 스레드는 자신만의 스택을 가짐

### 프로그램 실행
- 프로그램을 실행하면 운영체제는 디스크에 있는 프로그램을 메모리로 불러오면서 프로세스를 생성한다. 
- 프로세스 안에 있는 코드가 한 줄씩 실행되면서 프로그램이 실행된다. 
- 실(thread)이 코드를 위에서 아래로 하나씩 꿰면서 내려가는 것과 같다. 프로세스의 코드를 실행하는 흐름을 스레드라고 한다ㅏ. 
- `단일 스레드`: 한 프로세스 내에 하나의 스레드만 존재
- `멀티 스레드`: 한 프로세스 내에 여러 스레드가 존재
- 프로세스는 실행 환경과 자원을 제공하는 컨테이너 역할, 스레드는 CPU를 사용해 코드를 실행

### 멀티스레드가 필요한 이유
- 하나의 프로그램도 그 안에서 동시에 여러 작업이 필요하다. 
  - 유튜브 영상이 재생되는 동안 댓글도 달 수 있어야 함

## 스레드와 스케줄링
### 단일 코어 스케줄링
- 스케줄링 큐에 스레드들이 대기한다. 차례가 된 스레드를 큐에서 꺼내고 CPU를 통해 실행한다. 
- 실행하던 스레드를 잠시 멈추고 스케줄링 큐에 다시 넣는다. 다음 차례의 스레드를 큐에서 꺼내고 CPU를 통해 실행한다. 이 과정을 반복한다. 

### 멀티 코어 스케줄링
- 코어의 개수가 더 많다는 점 외에 단일 코어 스케줄링과 동일하게 동작한다. 

## 컨텍스트 스위칭
- 멀티태스킹 시 스레드를 중단하고 다른 스레드를 실행하는 과정이 빈번하게 발생한다. 이 때 스레드의 코드가 어디까지 수행되었는지 위치를 찾고, 계산하던 변수값을 CPU에 다시 불려들여야 한다. 
- `컨텍스트 스위칭`: 스레드를 멈추는 시점에 CPU에서 사용하던 값들을 메모리에 저장하고, 이후에 그 스레드를 다시 실행할 때 이 값들을 CPU에 다시 불러오는 과정

# 섹션 3: 스레드 생성과 실행
- 자바의 메모리 구조에서 스택 영역은 각 스레드별로 하나의 실행 스택이 생성된다. 즉 스레드 수만큼 스택이 생성된다. 
- 프로세스가 작동하려면 스레드가 최소 하나는 있어야 한다. 자바는 실행 시점에 main이라는 이름의 스레드를 만들고 프로그램의 시작점인 main() 메서드를 실행한다. 
- main() 메서드 내부에서(main 스레드) 새로운 스레드를 생성하고 특정 이름을 부여하지 않으면 자바가 임의의 이름을 부여한다. 
- 새 스레드의 start() 메서드를 호출하면 새 스레드가 시작되면서 **main 스레드가 아닌 새 스레드가 run() 메서드를 실행한다.** 
- main 스레드는 새 스레드에게 실행을 지시하기만 하고 run() 호출에 관여하지 않는다. 이제 main 스레드와 새 스레드는 동시에 실행된다. 
- main 스레드는 새 스레드의 코드를 기다리지 않는다. 
  ```
  main main() start
  main main() end
  Thread-0 : run()
  ```
- 실제 결과를 보면 Thread-0의 run()은 main에서 thread-0.start() 이후이고 main end 이전이지만 main() end가 Thread-0의 결과를 기다리지 않고 먼저 출력되었다. 
- **스레드는 실행 순서와 실행 기간을 보장하지 않는다.**

### `start()` 메서드
- main에서 `run()` 직접 호출
  - 새 스레드의 `start()` 대신 `run()`을 main 메서드에서 직접 실행하면 main 스레드가 사용하는 스택 위에 `run()` 스택 프레임이 올라간다. 
  - `start()`는 스레드에 스택 공간을 할당하면서 스레드를 시작하는 특별한 메서드이다. 이후 해당 스레드에서 `run()` 메서드를 실행한다.

## 데몬 스레드
- 스레드는 사용자(user) 스레드와 데몬(daemon) 스레드로 나눌 수 있다. 
### 사용자 스레드(non-daemon 스레드)
- 프로그램 주 작업 수행
- 작업이 완료될 때까지 실행
- 모든 user 스레드가 종료되면 JVM도 종료

### 데몬 스레드
- 백그라운드에서 보조 작업 수행
- 모든 user 스레드가 종료되면 데몬 스레드는 자동으로 종료

### Thread 상속 vs Runnable 구현
- **스레드 생성 시 Runnable을 구현해 사용하자.** 
- Thread 클래스 상속
  - 장점: 간단한 구현
  - 단점: 상속의 제한(단일 상속만 허용), 유연성 부족(인터페이스보다 유연성 적음)
- Runnable 인터페이스 구현
  - 장점: 상속의 자유로움, 코드 분리(스레드와 실행할 작업의 분리), 여러 스레드가 동일한 Runnable 객체를 공유할 수 있어 효율적인 자원 관리 가능
  - 단점: 코드가 약간 복잡해짐

# 섹션 4: 스레드 제어와 생명 주기 1
# 섹션 5: 스레드 제어와 생명 주기 2
# 섹션 6: 메모리 가시성
# 섹션 7: 동기화 - synchronized
# 섹션 8: 고급 동기화 - concurrent.Lock
# 섹션 9: 생산자 소비자 문제 1
# 섹션 10: 생산자 소비자 문제 2
# 섹션 11: CAS - 동기화와 원자적 연산
# 섹션 12: 동시성 컬렉션
# 섹션 13: 스레드 풀과 Executor 프레임워크 1
# 섹션 14: 스레드 풀과 Executor 프레임워크 2