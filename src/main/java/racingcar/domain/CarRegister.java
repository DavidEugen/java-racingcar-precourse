package racingcar.domain;

public class CarRegister {

    private final String[] carNames;

    public CarRegister(String inputString) {
        this.carNames = inputString.split("\\s*,\\s*");
    }

    public int getCount() {
        return carNames.length;
    }

    public String getCarName(int index) {
        return carNames[index];
    }

}
