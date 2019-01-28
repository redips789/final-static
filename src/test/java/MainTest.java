import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.time.LocalDate;
import java.time.Month;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Main.class)
public class MainTest {
    @Test
    public void test() {
        PowerMockito.mockStatic(Main.class);
        PowerMockito.when(Main.method1()).thenReturn(LocalDate.of(2018, Month.APRIL, 1));
        org.junit.Assert.assertEquals(Main.method1(), LocalDate.of(2018, Month.APRIL, 1));
    }

}
