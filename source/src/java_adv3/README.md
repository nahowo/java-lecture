# 목차
- 2: [람다가 필요한 이유](https://github.com/nahowo/java-lecture/blob/main/source/src/java_adv3/README.md#%EC%84%B9%EC%85%98-2-%EB%9E%8C%EB%8B%A4%EA%B0%80-%ED%95%84%EC%9A%94%ED%95%9C-%EC%9D%B4%EC%9C%A0)
- 3: [람다](https://github.com/nahowo/java-lecture/blob/main/source/src/java_adv3/README.md#%EC%84%B9%EC%85%98-3-%EB%9E%8C%EB%8B%A4)
- 4: [함수형 인터페이스](https://github.com/nahowo/java-lecture/blob/main/source/src/java_adv3/README.md#%EC%84%B9%EC%85%98-4-%ED%95%A8%EC%88%98%ED%98%95-%EC%9D%B8%ED%84%B0%ED%8E%98%EC%9D%B4%EC%8A%A4)
- 5: [람다 활용](https://github.com/nahowo/java-lecture/blob/main/source/src/java_adv3/README.md#%EC%84%B9%EC%85%98-5-%EB%9E%8C%EB%8B%A4-%ED%99%9C%EC%9A%A9)
- 6: [람다 vs 익명 클래스](https://github.com/nahowo/java-lecture/blob/main/source/src/java_adv3/README.md#%EC%84%B9%EC%85%98-6-%EB%9E%8C%EB%8B%A4-vs-%EC%9D%B5%EB%AA%85-%ED%81%B4%EB%9E%98%EC%8A%A4)
- 7: [메서드 참조](https://github.com/nahowo/java-lecture/blob/main/source/src/java_adv3/README.md#%EC%84%B9%EC%85%98-7-%EB%A9%94%EC%84%9C%EB%93%9C-%EC%B0%B8%EC%A1%B0)
- 8: [스트림 API 1 - 기본](https://github.com/nahowo/java-lecture/blob/main/source/src/java_adv3/README.md#%EC%84%B9%EC%85%98-8-%EC%8A%A4%ED%8A%B8%EB%A6%BC-api-1---%EA%B8%B0%EB%B3%B8)
- 9: [스트림 API 2 - 기능](https://github.com/nahowo/java-lecture/blob/main/source/src/java_adv3/README.md#%EC%84%B9%EC%85%98-9-%EC%8A%A4%ED%8A%B8%EB%A6%BC-api-2---%EA%B8%B0%EB%8A%A5)
- 10: [스트림 API 3 - 컬렉터](https://github.com/nahowo/java-lecture/blob/main/source/src/java_adv3/README.md#%EC%84%B9%EC%85%98-10-%EC%8A%A4%ED%8A%B8%EB%A6%BC-api-3---%EC%BB%AC%EB%A0%89%ED%84%B0)
- 11: [Optional](https://github.com/nahowo/java-lecture/blob/main/source/src/java_adv3/README.md#%EC%84%B9%EC%85%98-11-optional)
- 12: [디폴트 메서드](https://github.com/nahowo/java-lecture/blob/main/source/src/java_adv3/README.md#%EC%84%B9%EC%85%98-12-%EB%94%94%ED%8F%B4%ED%8A%B8-%EB%A9%94%EC%84%9C%EB%93%9C)
- 13: [병렬 스트림](https://github.com/nahowo/java-lecture/blob/main/source/src/java_adv3/README.md#%EC%84%B9%EC%85%98-13-%EB%B3%91%EB%A0%AC-%EC%8A%A4%ED%8A%B8%EB%A6%BC)
- 14: [함수형 프로그래밍](https://github.com/nahowo/java-lecture/blob/main/source/src/java_adv3/README.md#%EC%84%B9%EC%85%98-14-%ED%95%A8%EC%88%98%ED%98%95-%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%B0%8D)

# 섹션 2: 람다가 필요한 이유
- **프로그래밍에서 중복을 제거하고 좋은 코드를 유지하는 핵심은 변하는 부분과 변하지 않는 부분을 분리하는 것이다.**
- 값 매개변수화(Value Parameterization): 구체적인 값을 메서드 안에 두는 것이 아니라 매개변수를 통해 외부에서 전달받도록 해 메서드의 동작을 다형화하고 재사용성을 높이는 방법
  - 값을 바꿔가며 메서드의 동작을 다르게 함
- 동작 매개변수화(Behavior Parameterization): 코드 조각(동작, 로직)을 메서드 안에 두는 것이 아니라 매개변수를 통해 외부에서 전달받도록 해 메서드의 동작을 다형화하고 재사용성을 높이는 방법
  - 어떤 동작을 수행할지를 메서드에 전달
  - 동작을 수행하는 클래스를 정의하고 이를 인스턴스로 전달해야 한다는 복잡성이 존재
- 람다를 사용하면 클래스, 인스턴스를 정의하지 않고 위의 문제를 해결할 수 있다. 
### 함수 vs 메서드
- 함수(Function)와 메서드(Method)는 둘 다 어떤 작업을 수행하는 코드의 묶음이다. 하지만 일반적으로 OOP 관점에서 차이가 존재한다. 
- `함수`
  - 독맂벅으로 존재, 클래스와 직접적인 연관이 없음
  - 객체지향 언어가 아닌 C 등의 절차적 언어에서는 모든 로직이 함수 단위로 구성
  - 객체지향 언어라도 파이썬이나 js처럼 클래스 밖에서도 정의할 수 있는 함수 개념을 지원하는 경우 그냥 함수라고 함
- `메서드`
  - 클래스(또는 객체)에 속해 있는 함수
  - 객체의 상태에 직접 접근하거나 객체가 제공해야 할 기능 구현
  - 대부분의 객체지향 언어에서 클래스 내부에 정의된 함수는 보통 메서드라고 부름
- 호출 방식과 스코프
  - 함수는 호출 시 객체 인스턴스가 필요하지 않다. 지역 변수, 전역 변수와 함께 동작하며 클래스나 객체 특성(인스턴스 변수 등)은 다루지 못한다. 
  - 메서드는 `객체.메서드명` 형식으로 호출한다. 호출 시 객체의 필드나 다른 메서드에 접근 가능하고 이를 이용해 로직을 수행한다. 인스턴스 메서드, 클래스 메서드, 추상 메서드 등 다양한 형태가 있을 수 있다. 
- 함수와 메서드는 수행 역할은 같지만 소속과 호출 방식에서 차이가 있다.

# 섹션 3: 람다

## 람다
- 람다는 () -> {}로 표현한다. ()가 메서드 매개변수 부분, {} 부분에 코드 조각이 들어간다.
- 이름, 반환 타입은 생략하고 매개변수와 본문만 간단하게 작성할 수 있다. 익명 클래스를 사용하는 것보다 코드가 훨씬 간단해진다.
### 함수형 인터페이스
- 정확히 하나의 추상 메서드를 가지는 인터페이스를 의미한다.
- 람다는 함수형 인터페이스에만 할당할 수 있다.
- 단일 추상 메서드(Single Abstract Method; SAM)
- 람다는 단일 추상 메서드를 가지는 인터페이스에만 할당할 수 있다. 즉 클래스, 추상 클래스에는 할당할 수 없다. 어떤 메서드에 람다를 할당해야 하는지 모르기 때문이다.
### @FunctionalInterface
- @FunctionalInterface 어노테이션을 붙이면 해당 어노테이션이 함수형 인터페이스임을 보장할 수 있다. @Override와 동일하게 함수형 인터페이스가 아니라면 컴파일 오류가 발생한다.
### 람다와 시그니처
- 람다를 함수형 인터페이스에 할당할 떄는 `메서드 시그니처`가 일치해야 한다.
  - 메서드 이름
  - 매개변수 수와 타입, 순서
  - 반환 타입
### 람다와 생략
- 단일 표현식(하나의 값으로 평가되는 코드 조각)인 경우 return과 중괄호를 생략할 수 있다.
- 타입 추론: 함수형 인터페이스에는 하나의 메서드만 존재하고, 해당 인터페이스에 메서드 매개변수 타입이 작성되어 있기 때문에, 람다식 작성 시 매개변수 타입을 작성하지 않아도 컴파일러가 자동으로 추론해준다.
- 매개변수가 정확하게 1개인 경우 매개변수를 감싸는 괄호를 생략할 수 있다.
### 람다의 전달
- 메서드의 인자, 반환 타입으로 람다(인스턴스)를 전달할 수 있다. 타입은 함수형 인터페이스여야 한다.
### 고차 함수
- 람다를 변수에 대입하거나 람다를 매서드의 매개변수나 반환값으로 넘기는 것은 람다 인스턴스의 참조값을 대입/전달하는 것이다. 이를 통해 코드의 간결성과 유연성이 높아진다.
- `고차 함수(Higher-Order Function)`은 함수를 값처럼 다루는 함수를 뜻한다. '고차'의 의미는 함수를 다루는 추상화 수준이 높다는 데에서 유래했다.
  - 함수를 인자로 받는 함수
  - 함수를 반환하는 함수
- 위의 매개변수나 반환값에 함수를 활용하는 함수가 고차 함수에 해당한다.

# 섹션 4: 함수형 인터페이스
# 섹션 5: 람다 활용
# 섹션 6: 람다 vs 익명 클래스
# 섹션 7: 메서드 참조
# 섹션 8: 스트림 API 1 - 기본
# 섹션 9: 스트림 API 2 - 기능
# 섹션 10: 스트림 API 3 - 컬렉터
# 섹션 11: Optional
# 섹션 12: 디폴트 메서드
# 섹션 13: 병렬 스트림
# 섹션 14: 함수형 프로그래밍