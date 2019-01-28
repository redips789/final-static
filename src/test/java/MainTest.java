import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.time.*;

import static org.junit.Assert.assertEquals;

@RunWith(PowerMockRunner.class)
@PrepareForTest(LocalDateTime.class)
public class MainTest {
    @Test
    public void test() {
        LocalDateTime localDateTime = LocalDateTime.of(LocalDate.of(2014, Month.DECEMBER, 22), LocalTime.of(10,15,30));
        Clock clock = Clock.fixed(Instant.parse("2014-12-22T10:15:30.00Z"), ZoneId.of("UTC"));
        LocalDateTime dateTime = LocalDateTime.now(clock);
        PowerMockito.mockStatic(LocalDateTime.class);
        PowerMockito.when(LocalDateTime.now()).thenReturn(dateTime);


        LocalDateTime now = LocalDateTime.now();

        assertEquals(now, localDateTime);
    }

}
