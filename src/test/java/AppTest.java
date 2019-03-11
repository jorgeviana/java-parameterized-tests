import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

@RunWith(Parameterized.class)
public class AppTest {

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
//              { a, b, max},
                { 1, 1, 1 },
                { 1, 9, 9 },
                { 8, 2, 8 },
                { 9, 9, 9 },
        });
    }

    private int a;
    private int b;
    private int max;

    public AppTest(int a, int b, int max) {
        this.a = a;
        this.b = b;
        this.max = max;
    }

    @Test
    public void test() {
        assertThat(Math.max(a, b), equalTo(max));
    }

}
