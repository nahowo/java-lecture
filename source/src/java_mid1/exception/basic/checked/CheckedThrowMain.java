package java_mid1.exception.basic.checked;

public class CheckedThrowMain {
    public static void main(String[] args) throws MyCheckedException {
        Service service = new Service();
        service.catchThrow(); // main 밖으로 나감 -> 오류 로그 출력 뒤 종료
        System.out.println("정상 종료");
    }
}
