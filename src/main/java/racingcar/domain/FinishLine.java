package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class FinishLine {
    private final List<Car> allCars;
    private final List<Car> winnerCars = new ArrayList<>();

    public FinishLine(List<Car> cars) {
        this.allCars = cars;
    }

    public Position getMaxPosition() {
        Position maxPosition = new Position(0);
        for (Car car : allCars) {
            maxPosition = car.getPosition().getBiggerPosition(maxPosition);
        }
        return maxPosition;
    }

    public void judgeWinners() {
        Position maxPosition = getMaxPosition();
        for (Car car : allCars) {
            comparePosition(maxPosition, car);
        }
    }

    private void comparePosition(Position maxPosition, Car car) {
        if (car.isLocated(maxPosition)) {
            winnerCars.add(car);
        }
    }

    public List<Car> getWinners() {
        return this.winnerCars;
    }
}
