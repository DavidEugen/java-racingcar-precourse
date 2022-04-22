package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class RaceTrack {

    private final List<Car> cars;
    private int lapCount;

    public RaceTrack(String[] carNames) {
        this.cars = readyCars(carNames);
        this.lapCount = 0;
    }

    public RaceTrack(CarRegister carRegister) {
        this(carRegister.getCarNames());
        this.lapCount = 0;
    }

    public RaceTrack(CarRegister carRegister, LapRegister lapRegister) {
        this(carRegister.getCarNames());
        this.lapCount = lapRegister.getLap();
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
        return this.lapCount;
    }
}
