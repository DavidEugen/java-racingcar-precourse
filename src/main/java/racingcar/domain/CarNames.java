package racingcar.domain;

public class CarNames {

    private final String[] carNames;

    public CarNames(String inputString) {
        this.carNames = inputString.split("\\s*,\\s*");
    }

    public int getCount() {
        return carNames.length;
    }

    public String getCarName(int index) {
        return carNames[index];
    }

    public String[] getCarNames() {
        return this.carNames;
    }
}
