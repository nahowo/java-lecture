package java_mid2.collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryTest {
    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("==단어 입력 단계==");
        System.out.println("종료 시 'q' 입력");
        while (true) {
            System.out.print("영어 단어를 입력하세요: ");
            String eWord = scanner.nextLine();
            if (eWord.equals("q")) {
                break;
            }
            System.out.print("한글 뜻을 입력하세요: ");
            String kWord = scanner.nextLine();
            dictionary.put(eWord, kWord);
        }

        System.out.println("==만든 영어 사전==");
        System.out.println(dictionary);

        System.out.println("\n==단어 검색 단계==");
        while (true) {
            System.out.print("찾을 영어 단어를 입력하세요: ");
            String eWord = scanner.nextLine();
            if (eWord.equals("q")) {
                break;
            }
            if (dictionary.containsKey(eWord)) {
                System.out.println(eWord + "의 뜻: " + dictionary.get(eWord));
            } else {
                System.out.println(eWord + "은(는) 사전에 없는 단어입니다. ");
            }
        }
    }
}
