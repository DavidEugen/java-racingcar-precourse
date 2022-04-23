package racingcar.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.message.ERRORMessage;

public class LapTest {

    @Test
    @DisplayName("Lap 숫자 입력 확인 테스트")
    void 랩_숫자_생성_테스트() {
        //given
        int givenValue = 1;

        //when
        Lap lap = new Lap(givenValue);

        //then
        assertThat(lap).isEqualTo(new Lap(1));
    }

    @Test
    @DisplayName("Lap 음수 입력 테스트")
    void 랩_음수_입력_테스트() {
        //given
        int givenValue = -1;

        //when, then
        assertThatThrownBy(() -> new Lap(givenValue)).isInstanceOf(IllegalArgumentException.class).hasMessageContaining(
                ERRORMessage.LAP_VALIDATE_POSITIVE);

    }

}
