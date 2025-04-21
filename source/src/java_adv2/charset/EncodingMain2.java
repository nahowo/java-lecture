package java_adv2.charset;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import static java.nio.charset.StandardCharsets.*;

public class EncodingMain2 {
    private static final Charset EUC_KR = Charset.forName("EUC_KR");
    private static final Charset MS_949 = Charset.forName("MS_949");
    public static void main(String[] args) {
        System.out.println("==ASCII==");
        test("A", US_ASCII, US_ASCII);
        test("A", US_ASCII, ISO_8859_1);
        test("A", US_ASCII, EUC_KR);
        test("A", US_ASCII, MS_949);
        test("A", US_ASCII, UTF_8);
        test("A", US_ASCII, UTF_16BE); // 2byte 디코딩 실패

        System.out.println("==한글==");
        test("가", US_ASCII, US_ASCII);
        test("가", ISO_8859_1, ISO_8859_1);
        test("가", EUC_KR, EUC_KR);
        test("가", MS_949, MS_949);
        test("가", UTF_8, UTF_8);
        test("가", UTF_16BE, UTF_16BE);

        System.out.println("==한글 - 복잡한 문자==");
        String text = "뷁";
        test(text, EUC_KR, EUC_KR);
        test(text, MS_949, MS_949);
        test(text, UTF_8, UTF_8);
        test(text, UTF_16BE, UTF_16BE);

        System.out.println("==한글 - 인코딩과 디코딩이 다른 문자==");
        test(text, MS_949, EUC_KR);
        text = "가";
        test(text, EUC_KR, MS_949);
        test(text, EUC_KR, UTF_8);
        test(text, MS_949, UTF_8);
        test(text, UTF_8, MS_949);

        System.out.println("==영문 - 인코딩과 디코딩이 다른 문자==");
        text = "A";
        test(text, EUC_KR, MS_949);
        test(text, EUC_KR, UTF_8);
        test(text, MS_949, UTF_8);
        test(text, UTF_8, UTF_16BE);

    }

    private static void test(String text, Charset encodingCharset, Charset decodingCharSet) {
        byte[] encoded = text.getBytes(encodingCharset);
        String decoded = new String(encoded, decodingCharSet);
        System.out.printf("%s: [%s] 인코딩 -> %s %sbyte -> [%s] 디코딩 -> %s\n",
                text, encodingCharset, Arrays.toString(encoded), encoded.length, decodingCharSet, decoded);
    }
}
