package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class RaceTrack {

    private final List<Car> cars;
    private Lap lapCount;

    public RaceTrack(String[] carNames) {
        this.cars = readyCars(carNames);
        this.lapCount = new Lap(0);
    }

    public RaceTrack(CarRegister carRegister) {
        this(carRegister.getCarNames());
        this.lapCount = new Lap(0);
    }

    public RaceTrack(CarRegister carRegister, Lap lap) {
        this(carRegister.getCarNames());
        this.lapCount = lap;
    }

    private List<Car> readyCars(String[] carNames) {
        final List<Car> cars;
        cars = new ArrayList<>();
        for (String name : carNames) {
            cars.add(new Car(name));
        }
        return cars;
    }

    public int carCount() {
        return cars.size();
    }

    public int getCurrentLap() {
        return lapCount.getCurrentLap();
    }

    public void raceEachLap(int accelerationPower) {
        lapCount.decrease();
        for (Car car : cars) {
            car.move(accelerationPower);
        }
    }

    public Car getCar(int index) {
        return cars.get(index);
    }

}
