package java_mid1.enumeration.test;

import java.util.Scanner;

public class HttpStatusMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("상태 코드를 입력하세요: ");
        int code = scanner.nextInt();

        HttpStatus httpStatus = HttpStatus.findByCode(code);
        if (httpStatus == null) {
            System.out.println("정의되지 않은 코드");
            return;
        }
        System.out.println("HTTP CODE: " + httpStatus.getCode() + " " + httpStatus.getMessage());
        System.out.println("isSucess: " + httpStatus.isSuccess());
    }
}
