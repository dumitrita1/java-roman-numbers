import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {
    @Test
    public void convertFromNumberToRoman() {
        Converter converter = new Converter();

        String result1 = converter.convertFromNumberToRoman(2000);
        assertEquals("MM", result1);

        String result2 = converter.convertFromNumberToRoman(1986);
        assertEquals("MDCCCCLXXXVI", result2);

        String result3 = converter.convertFromNumberToRoman(1995);
        assertEquals("MDCCCCLXXXXV", result3);
    }

    @Test
    public void convertFromRomanToNumber() {
        Converter converter = new Converter();

        int result1 = converter.convertFromRomanToNumber("M");
        assertEquals(1000, result1);

        int result2 = converter.convertFromRomanToNumber("MDCCCCLXXXVI");
        assertEquals(1986, result2);

        int result3 = converter.convertFromRomanToNumber("MDCCCCLXXXXV");
        assertEquals(1995, result3);
    }
}