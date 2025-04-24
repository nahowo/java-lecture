package java_adv2.reflection;

import java_adv2.reflection.data.BasicData;

public class BasicV1 {
    public static void main(String[] args) throws ClassNotFoundException {
        // 클래스 메타데이터 조회 방법


        // 1. 클래스에서 찾기
        Class<BasicData> basicData1 = BasicData.class;
        System.out.println("basicData1 = " + basicData1);

        // 2. 인스턴스에서 찾기
        BasicData basicInstance = new BasicData();
        Class<? extends BasicData> basicData2 = basicInstance.getClass();
        System.out.println("basicData2 = " + basicData2);

        // 3. 문자로 찾기
        String className = "java_adv2.reflection.data.BasicData";
        Class<?> basicData3 = Class.forName(className);
        System.out.println("basicData3 = " + basicData3);
    }
}
