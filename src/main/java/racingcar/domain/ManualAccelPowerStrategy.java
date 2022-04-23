package racingcar.domain;

public class ManualAccelPowerStrategy implements AccelPowerStrategy{

    @Override
    public boolean isMove() {
        return false;
    }
}
