package java_adv3.lambda.ex2;

public class TransformerExample {
    public static void main(String[] args) {
        MyTransformer toUpper = (str) -> str.toUpperCase();
        MyTransformer addDeco = (str) -> "**" + str + "**";
        MyTransformer result = compose(addDeco, toUpper);
        System.out.println(result.transform("hello"));
    }

    static MyTransformer compose(MyTransformer f1, MyTransformer f2) {
        return (str) -> f1.transform(f2.transform(str));
    }

    @FunctionalInterface
    static interface MyTransformer {
        String transform(String s);
    }
}
