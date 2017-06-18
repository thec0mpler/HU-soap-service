import org.junit.Test;
import postcode.InputFault_Exception;
import postcode.PostcodeImpl;

import javax.xml.ws.Holder;

import static org.junit.Assert.assertTrue;

public class PostcodeImplTest {
    @Test
    public void searchAddressHome() {
        try {
            PostcodeImpl postcode = new PostcodeImpl();
            postcode.searchAddress(new Holder("3824AHH"), new Holder(42), new Holder("Notarisappelgaarde"), new Holder(""), new Holder("Amersfoort"));
        } catch (InputFault_Exception e) {
            assertTrue(true);

            return;
        }

        assertTrue(false);
    }

    @Test
    public void searchAddressDL200() {
        try {
            PostcodeImpl postcode = new PostcodeImpl();
            postcode.searchAddress(new Holder("3584BJJ"), new Holder(200), new Holder("Daltonlaan"), new Holder(""), new Holder("Utrecht"));
        } catch (InputFault_Exception e) {
            assertTrue(true);

            return;
        }

        assertTrue(false);
    }

    @Test
    public void searchPostcodeHome() {
        try {
            PostcodeImpl postcode = new PostcodeImpl();
            postcode.searchPostcode(new Holder("Notarisappelgaarde"), new Holder(420), new Holder(""), new Holder("Amersfoort"), new Holder("3824AH"));
        } catch (InputFault_Exception e) {
            assertTrue(true);

            return;
        }

        assertTrue(false);
    }

    @Test
    public void searchPostcodeDL200() {
        try {
            PostcodeImpl postcode = new PostcodeImpl();
            postcode.searchPostcode(new Holder("Daltoonlaan"), new Holder(2001), new Holder(""), new Holder("Utrecht"), new Holder("3584BJ"));
        } catch (InputFault_Exception e) {
            assertTrue(true);

            return;
        }

        assertTrue(false);
    }
}
