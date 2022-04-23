package racingcar.domain;

public class Car {

    private final String name;
    private Position position;

    public Car(String name) {
        this.name = name;
        this.position = new Position(0);
    }

    public String getName() {
        return this.name;
    }

    public Position getPosition() {
        return this.position;
    }

    public void move(AccelPowerStrategy accelerationPowerStrategy) {
        if (accelerationPowerStrategy.isMove()) {
            position.increase();
        }
    }

}
