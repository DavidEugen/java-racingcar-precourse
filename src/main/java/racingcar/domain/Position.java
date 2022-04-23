package racingcar.domain;

import java.util.Objects;

public class Position {
    private int position;

    public Position(int position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Position position = (Position) o;
        return this.position == position.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }

    public void increase() {
        position++;
    }
}
