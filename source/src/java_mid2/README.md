# 목차
- 2: [제네릭 1](https://github.com/nahowo/java-lecture/tree/main/source/src/java_mid2#%EC%84%B9%EC%85%98-2-%EC%A0%9C%EB%84%A4%EB%A6%AD-1)
- 3: [제네릭 2](https://github.com/nahowo/java-lecture/tree/main/source/src/java_mid2#%EC%84%B9%EC%85%98-3-%EC%A0%9C%EB%84%A4%EB%A6%AD-2)
- 4: [컬렉션 프레임워크 - ArrayList](https://github.com/nahowo/java-lecture/tree/main/source/src/java_mid2#%EC%84%B9%EC%85%98-4-%EC%BB%AC%EB%A0%89%EC%85%98-%ED%94%84%EB%A0%88%EC%9E%84%EC%9B%8C%ED%81%AC---arraylist)
- 5: [컬렉션 프레임워크 - LinkedList](https://github.com/nahowo/java-lecture/tree/main/source/src/java_mid2#%EC%84%B9%EC%85%98-5-%EC%BB%AC%EB%A0%89%EC%85%98-%ED%94%84%EB%A0%88%EC%9E%84%EC%9B%8C%ED%81%AC---linkedlist)
- 6: [컬렉션 프레임워크 - List](https://github.com/nahowo/java-lecture/tree/main/source/src/java_mid2#%EC%84%B9%EC%85%98-6-%EC%BB%AC%EB%A0%89%EC%85%98-%ED%94%84%EB%A0%88%EC%9E%84%EC%9B%8C%ED%81%AC---list)
- 7: [컬렉션 프레임워크 - Hash](https://github.com/nahowo/java-lecture/tree/main/source/src/java_mid2#%EC%84%B9%EC%85%98-7-%EC%BB%AC%EB%A0%89%EC%85%98-%ED%94%84%EB%A0%88%EC%9E%84%EC%9B%8C%ED%81%AC---hash)
- 8: [컬렉션 프레임워크 - HashSet](https://github.com/nahowo/java-lecture/tree/main/source/src/java_mid2#%EC%84%B9%EC%85%98-8-%EC%BB%AC%EB%A0%89%EC%85%98-%ED%94%84%EB%A0%88%EC%9E%84%EC%9B%8C%ED%81%AC---hashset)
- 9: [컬렉션 프레임워크 - Set](https://github.com/nahowo/java-lecture/tree/main/source/src/java_mid2#%EC%84%B9%EC%85%98-9-%EC%BB%AC%EB%A0%89%EC%85%98-%ED%94%84%EB%A0%88%EC%9E%84%EC%9B%8C%ED%81%AC---set)
- 10: [컬렉션 프레임워크 - Map, Stack, Queue](https://github.com/nahowo/java-lecture/tree/main/source/src/java_mid2#%EC%84%B9%EC%85%98-10-%EC%BB%AC%EB%A0%89%EC%85%98-%ED%94%84%EB%A0%88%EC%9E%84%EC%9B%8C%ED%81%AC---map-stack-queue)
- 11: [컬렉션 프레임워크 - 순회, 정렬](https://github.com/nahowo/java-lecture/tree/main/source/src/java_mid2#%EC%84%B9%EC%85%98-11-%EC%BB%AC%EB%A0%89%EC%85%98-%ED%94%84%EB%A0%88%EC%9E%84%EC%9B%8C%ED%81%AC---%EC%88%9C%ED%9A%8C-%EC%A0%95%EB%A0%AC)

# 섹션 2: 제네릭 1
- 변수 하나로 합치기: control + T에서 8 선택
- 변수명 변경: shift + F6(fn + 터치패드)
### Object의 문제점
- 다운캐스팅이 필수적: 자식 타입은 부모 타입을 담을 수 없기 때문에 Object 객체를 반환 시 다운캐스팅을 통해 원하는 타입으로 변경해야 한다. 
- 잘못된 타입의 인수 전달: setter로 기존 타입이 아닌 다른 타입을 전달 시 컴파일 오류로 확인할 수 없고 런타임 오류가 발생한다. 즉 타입 안정성이 낮다. 
- 중복을 제거하면 타입 안정성이 낮아지고, 타입 안정성을 높이면 코드 재사용성이 낮아진다. 

## 제네릭
- 제네릭의 영어 의미는 일반적인, 범용적인이다.  
- `<>`(다이이몬드)를 사용한 클래스를 제네릭 클래스라고 한다.
- 클래스명 오른쪽에 `<T>` 처럼 선언하면 제네릭 클래스가 된다. T는 타입 매개변수라고 하며, 매개변수이므로 T 말고 다른 이름을 사용해도 된다. 
  - 타입 매개변수는 일반적으로 대문자를 사용하고 용도에 맞는 단어의 첫글자를 사용하는 관례를 따른다.
- T 타입은 이후에 다른 타입으로 변할 수 있다. 
- 인스턴스 생성 시점에 T의 타입(참조형만 가능)을 지정한다. 이후 클래스의 T가 모두 해당 타입으로 변한다. 설정한 타입과 맞지 않으면 컴파일 오류가 발생한다. 즉 타입 안정성을 보장하기 때문에 캐스팅도 필요하지 않다. 
  - 컴파일러가 입력한 타입 정보를 기반으로 컴파일 과정에서 반영한다(실제 해당 타입의 코드가 생성되는 것은 아니다). 
- 제네릭을 사용해 중복 제거와 타입 안정성을 모두 확보할 수 있다. 

### 타입 추론
- 인스턴스 생성 시 `GenericClass<Integer> genericClass = new GenericClass<>()` 처럼 다이아몬드 안에 타입을 생략할 수 있다.
- 타입 추론은 자바 컴파일러가 타입을 추론할 수 있는 상황에서만 가능하다. 즉 주변에 읽을 수 있는 타입 정보가 있어야 추론할 수 있다. 

### 제네릭 용어
- 제네릭의 핵심은 사용할 타입을 미리 정의하지 않는다는 점이다. 메서드 매개변수와 인자의 관계와 비슷하다. 
- 메서드 매개변수와 인자
  - 매개변수(parameter): 중간에서 연결(매개)해주는 변수, 인자를 받아서 처리해줌
  - 인자, 인수(argument): 실제 메서드로 전달되는 값
- **실행 시점에 메서드의 매개변수에 인자를 전달해서 메서드의 사용할 값을 결정한다.**
- 제네릭의 타입 매개변수와 타입 인자
  - 제네릭 클래스 정의 시 내부에서 사용할 타입을 미리 결정하는 것이 아니라, **해당 클래스를 실제 사용하는 생성 시점에 내부에서 사용할 타입을 결정한다.**
- 매서드는 **매개변수**에 **인자**를 전달해서 사용할 값을 결정한다. 
- 제네릭 클래스는 **타입 매개변수**에 **타입 인자**를 전달해서 사용할 타입을 결정한다.
- 제네릭 타입 사용 시 다이아몬드 없이 타입 지정을 생략하면 타입 인자가 Object로 들어간다. 이런 경우를 원시 타입(Row Type)이라고 한다.
  - 제네릭이 없던 과거 코드와의 호환성을 위해 원시 타입을 지원한다. 원시 타입은 위에서 나왔던 타입 안정성 문제 때문에 지양해야 한다.  
- 오버라이딩 단축키: control + O

# 섹션 3: 제네릭 2
# 섹션 4: 컬렉션 프레임워크 - ArrayList
# 섹션 5: 컬렉션 프레임워크 - LinkedList
# 섹션 6: 컬렉션 프레임워크 - List
# 섹션 7: 컬렉션 프레임워크 - Hash
# 섹션 8: 컬렉션 프레임워크 - HashSet
# 섹션 9: 컬렉션 프레임워크 - Set
# 섹션 10: 컬렉션 프레임워크 - Map, Stack, Queue
# 섹션 11: 컬렉션 프레임워크 - 순회, 정렬