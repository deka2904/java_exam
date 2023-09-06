package day6.overloading.overloadingEX.Solve4;
// 가정 : 우리는 오라클 자바 개발팀에 취업을 했습니다. 우리는 자바 10의 새로운 기능은 `저장소` 클래스를 만들어야 합니다.
// 다음 코드가 오류없이 진행되도록 해주세요. 오류만 안나면 됩니다.
class 사람{
    public 사람(){
        System.out.println("사람입니다.");
    }
}
class 사과{
    public 사과(){
        System.out.println("사과입니다.");
    }}
class 저장소{
    public static void 저장(byte i){
        System.out.println(i);
    }
    public static void 저장(char i){
        System.out.println(i);
    }
    public static void 저장(String i){
        System.out.println(i);
    }
    public static void 저장(short i){
        System.out.println(i);
    }
    public static void 저장(int i){
        System.out.println(i);
    }
    public static void 저장(long i){
        System.out.println(i);
    }
    public static void 저장(float i){
        System.out.println(i);
    }
    public static void 저장(double i){
        System.out.println(i);
    }
    public static void 저장(boolean i){
        System.out.println(i);
    }
    public static void 저장(사람 사람){
    }
    public static void 저장(사과 사과){
    }
}
public class OverloadingSolve4 {
    public static void main(String[] args) {
        저장소.저장(10);
        저장소.저장("안녕");
        저장소.저장(new 사람());
        저장소.저장(new 사과());
        저장소.저장(5.5);
        저장소.저장(false);
        저장소.저장('a');

        // 정수 계열
        byte b = 0; // 1바이트
        char c = 1; // 2바이트
        short s = 2; // 2바이트
        int i = 3; // 4바이트
        long l = 4; // 8바이트

        // 실수 계열
        // 4.1f => float 형 실수를 의미
        float f = 3.14f; // 4바이트
        // 3.141592 => double 형 실수를 의미
        double d = 3.141592; // 8 바이트

        // 논리 계열
        boolean bl = false; // 1/8 바이트, 1비트

        저장소.저장(b);
        저장소.저장(s);
        저장소.저장(c);
        저장소.저장(i);
        저장소.저장(l);
        저장소.저장(f);
        저장소.저장(d);
        저장소.저장(bl);
    }
}
