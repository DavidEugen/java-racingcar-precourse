package racingcar.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RaceTrackTest {

    @Test
    @DisplayName("차량을 초기화 시킨다")
    void 차량_초기화_시킨다() {
        //given
        String[] carNames = {"Tester1", "Tester2", "Tester3"};

        //when
        RaceTrack raceTrack = new RaceTrack(carNames);

        //then
        Assertions.assertThat(raceTrack.carCount()).isEqualTo(3);
    }

    @Test
    @DisplayName("차량을 Register로 초기화 시킨다")
    void 차량_Register로_초기화_시킨다() {
        //given
        String inputString = "Tester1, Tester2, Tester3";

        //when
        RaceTrack raceTrack = new RaceTrack(new CarRegister(inputString));

        //then
        Assertions.assertThat(raceTrack.carCount()).isEqualTo(3);
    }


}
