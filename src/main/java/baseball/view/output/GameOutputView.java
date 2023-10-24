package baseball.view.output;

import baseball.domain.BallStatus;
import baseball.dto.GuessResult;

public class GameOutputView {

    public static void printEnterBallNumbersScript() {
        System.out.print("숫자를 입력해주세요 : ");
    }

    public static void printGuessResult(GuessResult guessResult) {
        int ballCount = guessResult.count(BallStatus.BALL);
        int strikeCount = guessResult.count(BallStatus.STRIKE);

        printNothing(ballCount, strikeCount);
        printBallCount(ballCount);
        printPadding(ballCount, strikeCount);
        printStrikeCount(ballCount, strikeCount);
    }

    private static void printNothing(int ballCount, int strikeCount) {
        if (ballCount == 0 && strikeCount == 0) {
            System.out.println("낫싱");
        }
    }

    private static void printBallCount(int ballCount) {
        if (ballCount != 0) {
            System.out.print(ballCount + "볼");
        }
    }

    private static void printPadding(int ballCount, int strikeCount) {
        if (ballCount != 0 && strikeCount != 0) {
            System.out.print(" ");
        }
    }

    private static void printStrikeCount(int ballCount, int strikeCount) {
        if (strikeCount != 0) {
            System.out.println(ballCount + "스트라이크");
        }
    }

}