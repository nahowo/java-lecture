package java_mid1.time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingMain1 {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2024, 12, 31);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
        System.out.println(ld.format(formatter));


        String input = "2024년 02월 13일"; // formatter와 형식 일치해야 함
        LocalDate parsed = LocalDate.parse(input, formatter);
        System.out.println(parsed);
    }
}
