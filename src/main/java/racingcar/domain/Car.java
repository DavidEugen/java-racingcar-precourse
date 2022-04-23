package racingcar.domain;

public class Car {

    private final String name;
    private int position;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getPosition() {
        return this.position;
    }

    public void move(AccelPowerStrategy accelerationPowerStrategy) {
        if (accelerationPowerStrategy.isMove()) {
            this.position++;
        }
    }

}
