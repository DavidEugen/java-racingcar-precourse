package racingcar.domain;

import static org.assertj.core.api.Assertions.assertThat;

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
        assertThat(raceTrack.carCount()).isEqualTo(3);
    }

    @Test
    @DisplayName("차량을 Register로 초기화 시킨다")
    void 차량_Register로_초기화_시킨다() {
        //given
        String inputNameString = "Tester1, Tester2, Tester3";

        //when
        RaceTrack raceTrack = new RaceTrack(new CarRegister(inputNameString));

        //then
        assertThat(raceTrack.carCount()).isEqualTo(3);
    }

    @Test
    @DisplayName("레이싱을 시도회수를 등록한다. ")
    void 시도회수를_등록한다() {
        //given
        String inputNameString = "Tester1, Tester2, Tester3";
        String inputLapCountString = "3";

        //when
        RaceTrack raceTrack = new RaceTrack(new CarRegister(inputNameString),new LapRegister(inputLapCountString));

        //then
        assertThat(raceTrack.getCurrentLap()).isEqualTo(3);

    }


}
