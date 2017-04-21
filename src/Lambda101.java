/**
 * Created by danawacomputer on 2017-04-19.
 */
public class Lambda101 {
//    public static void main(String[] args) {
//
//        // 람다함수는 익명함수라 이름이 없다.
//        (int a, int b) -> {return a > b? a:b};
//        (int a, int b) -> return a > b? a:b;
//        (a, b) -> return a > b? a:b; // return 키워드, {}, 파라미터 타입 생략가능(내부적으로 타입을 추론한다.)
//         //지금은 람다식을 사용할 수 없는 상황이라 문법은 맞지만 에러가 난다.
//
//        a -> a % 2 == 0? "짝수" : "홀수";
//
//        s -> s.length();
//    }



    int max (int a, int b){
        return a > b? a:b; }// 단축표현법 : Syntax Sugar, pureFunction : 입력값이 같으면 항상 출력값도 같다.

    boolean isEven(int a) {
        return a % 2 == 1;
        }

    int howManyChar(String s) {
        return s.length();
    }





}
