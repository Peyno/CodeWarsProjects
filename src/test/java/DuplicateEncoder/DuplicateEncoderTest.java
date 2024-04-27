package DuplicateEncoder;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

import static org.testng.Assert.*;

    public class DuplicateEncoderTest {
        @Test
        public void test() {
            assertEquals(")()())()(()()(",
                    DuplicateEncoder.encode("Prespecialized"));
            assertEquals("))))())))",DuplicateEncoder.encode("   ()(   "));
        }

}