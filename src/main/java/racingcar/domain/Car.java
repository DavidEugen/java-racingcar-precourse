package racingcar.domain;

public class Car {

    private static final int THRESHOLD_ACCELERATION_POWER = 4;

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

    public void move(int accelerationPower) {
        if (accelerationPower >= THRESHOLD_ACCELERATION_POWER) {
            this.position++;
        }
    }

}
