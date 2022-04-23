package racingcar.domain;

import java.util.Objects;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Lap lap1 = (Lap) o;
        return lap == lap1.lap;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lap);
    }

    public int getCurrentLap() {
        return lap;
    }

    public void decrease() {
        lap--;
    }
}
