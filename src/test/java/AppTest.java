import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @ParameterizedTest
    @CsvSource({
//           a, b, max
            "1, 1, 1",
            "1, 9, 9",
            "8, 2, 8",
            "9, 9, 9"
    })
    void test(int a, int b, int max) {
        assertEquals(max, Math.max(a, b));
    }

}
