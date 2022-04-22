package racingcar.domain;

public class LapRegister {

    int lap;

    public LapRegister(String inputLapCountString) {
        this.lap = initLap(inputLapCountString);
    }

    private int initLap(String inputLapCountString) {
        return Integer.parseInt(inputLapCountString);
    }

    public int getLap() {
        return lap;
    }
}
