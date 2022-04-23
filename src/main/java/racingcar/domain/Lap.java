package racingcar.domain;

import racingcar.message.ERRORMessage;

public class Lap {

    int lap;

    public Lap(Integer inputValue) {
        validate(inputValue);
        this.lap = inputValue;
    }

    private void validate(Integer inputValue) {
        if (inputValue < 0) {
            throw new IllegalArgumentException(ERRORMessage.LAP_VALIDATE_POSITIVE);
        }
    }

    public int getCurrentLap() {
        return lap;
    }

    public void decrease() {
        lap--;
    }
}
