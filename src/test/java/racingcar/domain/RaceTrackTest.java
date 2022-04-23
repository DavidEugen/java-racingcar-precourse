package racingcar.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RaceTrackTest {

    private String inputNameString;
    private String inputLapCountString;

    @BeforeEach
    void setup() {
        //given
        inputNameString = "Test1, Test2, Test3";
        inputLapCountString = "3";
    }

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
        //when
        RaceTrack raceTrack = new RaceTrack(new CarRegister(inputNameString));

        //then
        assertThat(raceTrack.carCount()).isEqualTo(3);
    }

    @Test
    @DisplayName("레이싱을 시도회수를 등록한다. ")
    void 시도회수를_등록한다() {
        //when
        RaceTrack raceTrack = new RaceTrack(new CarRegister(inputNameString),new LapRegister(inputLapCountString));

        //then
        assertThat(raceTrack.getCurrentLap()).isEqualTo(3);

    }

    @Test
    @DisplayName("랩을 돌았을때 위치 이동 검증.")
    void 랩을_돌았을때_위치_검증() {
        //given
        int moveAccelerationPower = 4;
        int stopAccelerationPower = 3;
        int firstExpectedPosition = 1;
        int secondExpectedPosition = 1;
        int thirdExpectedPosition = 2;

        RaceTrack raceTrack = new RaceTrack(new CarRegister(inputNameString),new LapRegister(inputLapCountString));

        //when
        raceTrack.raceEachLap(moveAccelerationPower);
        //then
        assertThat(raceTrack.getCar(1).getPosition()).isEqualTo(firstExpectedPosition);

        //when
        raceTrack.raceEachLap(stopAccelerationPower);
        //then
        assertThat(raceTrack.getCar(1).getPosition()).isEqualTo(secondExpectedPosition);

        //when
        raceTrack.raceEachLap(moveAccelerationPower);
        //then
        assertThat(raceTrack.getCar(1).getPosition()).isEqualTo(thirdExpectedPosition);

    }

}
