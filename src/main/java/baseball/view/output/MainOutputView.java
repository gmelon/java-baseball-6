package baseball.view.output;

public class MainOutputView {

    public static void printGameStartScript() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    public static void printGameEndScript() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

    public static void printShouldStartNewGameScript() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }

}