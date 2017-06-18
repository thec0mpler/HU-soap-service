
package postcode;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the postcode package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Address_QNAME = new QName("http://postcode.local/postcode.response.xsd", "address");
    private final static QName _SearchPostcode_QNAME = new QName("http://postcode.local/postcode.request.xsd", "searchPostcode");
    private final static QName _InputFault_QNAME = new QName("http://postcode.local/postcode.response.xsd", "inputFault");
    private final static QName _SearchAddress_QNAME = new QName("http://postcode.local/postcode.request.xsd", "searchAddress");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: postcode
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SearchAddressType }
     * 
     */
    public SearchAddressType createSearchAddressType() {
        return new SearchAddressType();
    }

    /**
     * Create an instance of {@link SearchPostcodeType }
     * 
     */
    public SearchPostcodeType createSearchPostcodeType() {
        return new SearchPostcodeType();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link InputFault }
     * 
     */
    public InputFault createInputFault() {
        return new InputFault();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://postcode.local/postcode.response.xsd", name = "address")
    public JAXBElement<AddressType> createAddress(AddressType value) {
        return new JAXBElement<AddressType>(_Address_QNAME, AddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchPostcodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://postcode.local/postcode.request.xsd", name = "searchPostcode")
    public JAXBElement<SearchPostcodeType> createSearchPostcode(SearchPostcodeType value) {
        return new JAXBElement<SearchPostcodeType>(_SearchPostcode_QNAME, SearchPostcodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InputFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://postcode.local/postcode.response.xsd", name = "inputFault")
    public JAXBElement<InputFault> createInputFault(InputFault value) {
        return new JAXBElement<InputFault>(_InputFault_QNAME, InputFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchAddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://postcode.local/postcode.request.xsd", name = "searchAddress")
    public JAXBElement<SearchAddressType> createSearchAddress(SearchAddressType value) {
        return new JAXBElement<SearchAddressType>(_SearchAddress_QNAME, SearchAddressType.class, null, value);
    }

}
