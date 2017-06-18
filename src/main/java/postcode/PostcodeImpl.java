package postcode;

import com.sun.xml.ws.developer.SchemaValidation;

import javax.jws.WebService;
import javax.xml.ws.Holder;
import java.io.IOException;

@WebService(endpointInterface="postcode.PortType")
@SchemaValidation(handler=ValidationHandler.class)
public class PostcodeImpl implements PortType {
    public void searchAddress(Holder<String> postcode, Holder<Integer> houseNumber, Holder<String> street, Holder<String> addition, Holder<String> place) throws InputFault_Exception {
        try {
            AddressType address = Api.getAddress(postcode.value, houseNumber.value, addition.value);
            postcode.value    = address.getPostcode();
            houseNumber.value = address.getHouseNumber();
            street.value      = address.getStreet();
            addition.value    = address.getAddition();
            place.value       = address.getPlace();
        } catch (IOException e) {
            InputFault fault = new InputFault();
            fault.setErrorCode((short) 1);
            fault.setMessage("Could not find address");

            InputFault_Exception throwException = new InputFault_Exception("Something went wrong", fault);

            throw throwException;
        }
    }

    public void searchPostcode(Holder<String> street, Holder<Integer> houseNumber, Holder<String> addition, Holder<String> place, Holder<String> postcode) throws InputFault_Exception {
        try {
            AddressType address = Api.getPostcode(street.value, houseNumber.value, addition.value, place.value);
            street.value      = address.getStreet();
            houseNumber.value = address.getHouseNumber();
            addition.value    = address.getAddition();
            place.value       = address.getPlace();
            postcode.value    = address.getPostcode();
        } catch (IOException e) {
            InputFault fault = new InputFault();
            fault.setErrorCode((short) 2);
            fault.setMessage("Could not find postcode");

            InputFault_Exception throwException = new InputFault_Exception("Something went wrong", fault);

            throw throwException;
        }
    }
}
