/**
 * Created by danawacomputer on 2017-04-19.
 */
public interface Interface101 {

    public static void main(String[] args) {
        int i = Interface101.howManyChar("Hello world");
        System.out.println(i);
    }

    //모든 변수는 public 이고 static, final(재할당이 되지 않는 상수 변수) 이다.
    public static final int A_NUMBER = 5;

    //모든 메소는 public 이고 abstract 이다.
    //public abstract
    int max(int a, int b);

    //자바8에서 새로운 메소드인 default메소드 등자
    default boolean isEven(int a) {
        return a % 2 == 0;
    }

    // 자바 8에서는 스태틱 메소드도 지원한다.
    public static int howManyChar(String s) {
        return s.length();
    }
}
