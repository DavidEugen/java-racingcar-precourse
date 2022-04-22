package racingcar.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarTest {

    private Car car;

    @BeforeEach
    void setup(){
        //given
        car = new Car("Tester");
    }

    @Test
    @DisplayName("차량 이름 확인")
    void 차량_이름_확인() {
        //then
        assertThat(car.getName()).isEqualTo("Tester");
    }

    @Test
    @DisplayName("주어진 값에 대해 차 정지 확인")
    void 차량_정지_확인() {
        //when
        car.move(3);

        //then
        assertThat(car.getPosition()).isEqualTo(0);
    }

    @Test
    @DisplayName("주어진 값에 대해 차 움직임 확인")
    void 차량_움직임_확인() {
        //when
        car.move(4);

        //then
        assertThat(car.getPosition()).isEqualTo(1);
    }

}
