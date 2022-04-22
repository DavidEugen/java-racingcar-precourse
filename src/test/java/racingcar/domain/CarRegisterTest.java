package racingcar.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarRegisterTest {
    @Test
    @DisplayName("입력받은 문자열로 차량을 만든다.")
    void 차량_생성() {
        //given
        String inputString = "Tester1, Tester2, Tester3";

        //when
        CarRegister carRegister = new CarRegister(inputString);

        //then
        assertThat(carRegister.getCount()).isEqualTo(3);
        assertThat(carRegister.getCarName(1)).isEqualTo("Tester2");

    }

}
