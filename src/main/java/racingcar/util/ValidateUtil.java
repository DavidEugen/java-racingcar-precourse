package racingcar.util;

import java.util.List;
import racingcar.message.ERRORMessage;

public class ValidateUtil {

    public static void validateNames(List<String> carNames) {
        for (String carName : carNames) {
            validate(carName);
        }
    }

    public static void validate(String carName) {
        underFiveCharacter(carName);
        blank(carName);
    }

    private static void underFiveCharacter(String carName) {
        if (carName.length() > 5) {
            throw new IllegalArgumentException(ERRORMessage.CAR_NAME_VALIDATE_FIVE_CHARACTER);
        }
    }

    private static void blank(String carName) {
        if (carName.isEmpty()) {
            throw new IllegalArgumentException(ERRORMessage.CAR_NAME_VALIDATE_BLANK);
        }
    }
}
