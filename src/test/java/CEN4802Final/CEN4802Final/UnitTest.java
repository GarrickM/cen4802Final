package CEN4802Final.CEN4802Final;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class UnitTest {

	@Test
	void test() {
		assertEquals(0, "1,234".compareTo(DiceGame.numberFormatter(1234)));
	}

}
