package day6.constructor.constructorEX.Solve3;
// 출력 : 아래와 같이 출력되게 해주세요.

class 사람 {
    팔 a왼팔 = new 팔(100);

    public void 걷다() {
        System.out.println("사람 걷는다.");
    }
}
class 팔{
    int 길이;
    public 팔(int 길이){
        this.길이 = 길이;
    }
}
public class ConstructorSolve3 {
    public static void main(String[] args) {
        new 사람().걷다();

        System.out.println(new 사람().a왼팔.길이 + "cm");
        // 출력 : 100cm
    }
}
