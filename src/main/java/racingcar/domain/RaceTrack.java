package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class RaceTrack {

    private final List<Car> cars;
    private Lap lap;

    public RaceTrack(String[] carNames) {
        this.cars = readyCars(carNames);
        this.lap = new Lap(0);
    }

    public RaceTrack(CarNames carNames) {
        this(carNames.getCarNames());
        this.lap = new Lap(0);
    }

    public RaceTrack(CarNames carNames, Lap lap) {
        this(carNames.getCarNames());
        this.lap = lap;
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
        return lap.getCurrentLap();
    }

    public void raceEachLap(AccelPowerStrategy accelerationPowerStrategy) {
        lap.decrease();
        for (Car car : cars) {
            car.move(accelerationPowerStrategy);
        }
    }

    public Car getCar(int index) {
        return cars.get(index);
    }

    public boolean keepGoing() {
        return lap.getCurrentLap() > 0;
    }
}
