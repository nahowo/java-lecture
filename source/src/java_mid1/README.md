# 목차
- 2: [Object 클래스](https://github.com/nahowo/java-lecture/tree/main/source/src/java_mid1#%EC%84%B9%EC%85%98-2-object-%ED%81%B4%EB%9E%98%EC%8A%A4)
- 3: [불변 객체](https://github.com/nahowo/java-lecture/tree/main/source/src/java_mid1#%EC%84%B9%EC%85%98-3-%EB%B6%88%EB%B3%80-%EA%B0%9D%EC%B2%B4)
- 4: [String 클래스](https://github.com/nahowo/java-lecture/tree/main/source/src/java_mid1#%EC%84%B9%EC%85%98-4-string-%ED%81%B4%EB%9E%98%EC%8A%A4)
- 5: [래퍼, Class 클래스](https://github.com/nahowo/java-lecture/tree/main/source/src/java_mid1#%EC%84%B9%EC%85%98-5-%EB%9E%98%ED%8D%BC-class-%ED%81%B4%EB%9E%98%EC%8A%A4)
- 6: [열거형 - ENUM](https://github.com/nahowo/java-lecture/tree/main/source/src/java_mid1#%EC%84%B9%EC%85%98-6-%EC%97%B4%EA%B1%B0%ED%98%95---enum)
- 7: [날짜와 시간](https://github.com/nahowo/java-lecture/tree/main/source/src/java_mid1#%EC%84%B9%EC%85%98-7-%EB%82%A0%EC%A7%9C%EC%99%80-%EC%8B%9C%EA%B0%84)
- 8: [중첩 클래스, 내부 클래스 1](https://github.com/nahowo/java-lecture/tree/main/source/src/java_mid1#%EC%84%B9%EC%85%98-8-%EC%A4%91%EC%B2%A9-%ED%81%B4%EB%9E%98%EC%8A%A4-%EB%82%B4%EB%B6%80-%ED%81%B4%EB%9E%98%EC%8A%A4-1)
- 9: [중첩 클래스, 내부 클래스 2](https://github.com/nahowo/java-lecture/tree/main/source/src/java_mid1#%EC%84%B9%EC%85%98-9-%EC%A4%91%EC%B2%A9-%ED%81%B4%EB%9E%98%EC%8A%A4-%EB%82%B4%EB%B6%80-%ED%81%B4%EB%9E%98%EC%8A%A4-2)
- 10: [예외 처리1 - 이론](https://github.com/nahowo/java-lecture/tree/main/source/src/java_mid1#%EC%84%B9%EC%85%98-10-%EC%98%88%EC%99%B8-%EC%B2%98%EB%A6%AC1---%EC%9D%B4%EB%A1%A0)
- 11: [예외 처리2 - 실습](https://github.com/nahowo/java-lecture/tree/main/source/src/java_mid1#%EC%84%B9%EC%85%98-11-%EC%98%88%EC%99%B8-%EC%B2%98%EB%A6%AC2---%EC%8B%A4%EC%8A%B5)

# 섹션 2: Object 클래스
## java.lang 패키지
- 자바가 기본으로 제공하는 라이브러리 중 기본이 되는 패키지이다. 
- java.lang 패키지의 대표 클래스
  - `Object`: 모든 자바 객체의 부모 클래스
  - `String`: 문자열
  - `Integer`, Long, Double 등: 기본형 데이터 타입을 래핑해 객체로 만든 것
  - `Class`: 클래스 메타 정보
  - `System`: 시스템 관련 기본 기능 제공
- java.lang은 import 구문을 사용하지 않아도 된다. 
## Object 클래스
- 모든 클래스의 최상위 부모 클래스는 항상 Object이다. 
- 클래스가 상속받는 부모 클래스가 없다면 묵시적으로 Object 클래스를 상속받는다. 상속받는 클래스가 존재한다면 Object를 상속받지 않는다. 
  - 상위 계층으로 올라가다 보면 최상위에는 Object가 존재하게 된다. 즉 모든 클래스는 Object의 직계 자손(묵시적)이거나 후손(명시음)이 된다. 
### Object가 최상위 클래스인 이유
- **공통 기능 제공**
  - 모든 객체에게 필요한 공통 기능을 일관성있게 제공
  - `toString()`: 객체 정보 제공
  - `equals()`: 객체 동등 비교
  - `getClass()`: 객체의 클래스 정보 제공
- **다형성의 기본 구현**
  - 부모는 자식을 담을 수 있음 -> Object는 모든 객체를 참조할 수 있음
  - 다형성을 지원하는 기본적 매커니즘 제공, 모든 객체를 Object 타입으로 편리하게 처리

## Object 다형성
- Object는 모든 객체를 대상으로 다형적 참조를 할 수 있다. 
- Object를 통해 전달받은 객체를 호출하려면 해당 객체에 맞는 다운캐스팅이 필요하다. 
  - Object는 전달받은 객체의 메서드를 알지 못하므로 Object의 메서드를 제외한 메서드에는 오버라이딩을 활용할 수 없다. 

## Object 배열
- Object 타입을 원소로 가지는 배열에는 자바의 모든 클래스가 들어갈 수 있다. 

## toString()
```java
  public String toString() {
    return getClass().getName() + "@" + Integer.toHexString(hashCode());
  }
```
- 패키지를 포함한 객체의 이름, 참조값(해시코드)을 16진수로 표현한다. 
- System.out.println, print등은 내부적으로 toString()을 호출한다. 

## Object와 OCP
- Object는 공통의 부모 역할을 통해 모든 객체들 간 관계를 생성해준다.
- 자바는 객체의 정보를 사용할 때 다형적 참조 문제를 해결해 줄 Object 클래스와 메서드 오버라이딩 문제를 해결해 줄 toString() 메서드가 있다. 
- 다형적 참조
  - Object 타입을 매개변수로 사용해 다형적 참조를 사용한다. 
- 메서드 오버라이딩
  - Object 클래스를 상속하는 구체적인 클래스는 toString() 메서드를 오버라이딩할 수 있다. 
  - 구체적인 타입에 의존하지 않고 런타임 동안 각 인스턴스의 toString()을 호출할 수 있다. 
### System.out.println()
- System.out.println()도 Object 매개변수를 사용하고 내부에서 toString()을 호출한다. 즉 모든 자바 객체를 편리하게 출력할 수 있다. 

## equals() - 동일성과 동등성
- `동일성(Identity)`: 두 객체의 참조가 동일한 객체를 가리키고 있는지 확인
- `동등성(equality)`: 두 객체가 논리적으로 동등한지 확인, 즉 값이 같은지 확인

# 섹션 3: 불변 객체
# 섹션 4: String 클래스
# 섹션 5: 래퍼, Class 클래스
# 섹션 6: 열거형 - ENUM
# 섹션 7: 날짜와 시간
# 섹션 8: 중첩 클래스, 내부 클래스 1
# 섹션 9: 중첩 클래스, 내부 클래스 2
# 섹션 10: 예외 처리1 - 이론 
# 섹션 11: 예외 처리2 - 실습 