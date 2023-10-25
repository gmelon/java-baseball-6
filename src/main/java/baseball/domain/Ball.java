package baseball.domain;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ball {

    public static final int MINIMUM_VALID_NUMBER = 1;
    public static final int MAXIMUM_VALID_NUMBER = 9;
    private static final Pattern VALID_NUMBER_PATTERN = Pattern.compile("[1-9]");

    private final int number;

    private Ball(int number) {
        this.number = number;
    }

    public static Ball from(String stringNumber) {
        validateStringNumber(stringNumber);
        return new Ball(Integer.parseInt(stringNumber));
    }

    private static void validateStringNumber(String stringNumber) {
        Matcher matcher = VALID_NUMBER_PATTERN.matcher(stringNumber);
        if (!matcher.matches()) {
            throw new IllegalArgumentException(stringNumber + "은 유효한 값이 아닙니다.");
        }
    }

    public static Ball from(Integer number) {
        validateNumber(number);
        return new Ball(number);
    }

    private static void validateNumber(Integer number) {
        if (number < MINIMUM_VALID_NUMBER || number > MAXIMUM_VALID_NUMBER) {
            throw new IllegalArgumentException(number + "은 유효한 값이 아닙니다.");
        }
    }

    public int number() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Ball ball = (Ball) o;
        return number == ball.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return "Ball{" +
                "number=" + number +
                '}';
    }
}
