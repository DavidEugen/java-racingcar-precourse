package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class RaceTrack {

    private final List<Car> cars;

    public RaceTrack(String[] carNames) {
        cars = readyCars(carNames);
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
}
