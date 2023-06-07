//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.06.06 at 02:17:03 PM GMT 
//


package claimspwahci.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the claimspwahci.generated package. 
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

    private final static QName _Entry_QNAME = new QName("http://wwr450.wsbeans.iseries/", "entry");
    private final static QName _EntryResponse_QNAME = new QName("http://wwr450.wsbeans.iseries/", "entryResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: claimspwahci.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Entry }
     * 
     */
    public Entry createEntry() {
        return new Entry();
    }

    /**
     * Create an instance of {@link EntryResponse }
     * 
     */
    public EntryResponse createEntryResponse() {
        return new EntryResponse();
    }

    /**
     * Create an instance of {@link EntryInput }
     * 
     */
    public EntryInput createEntryInput() {
        return new EntryInput();
    }

    /**
     * Create an instance of {@link Dspart }
     * 
     */
    public Dspart createDspart() {
        return new Dspart();
    }

    /**
     * Create an instance of {@link EntryResult }
     * 
     */
    public EntryResult createEntryResult() {
        return new EntryResult();
    }

    /**
     * Create an instance of {@link Dspartprice }
     * 
     */
    public Dspartprice createDspartprice() {
        return new Dspartprice();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Entry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wwr450.wsbeans.iseries/", name = "entry")
    public JAXBElement<Entry> createEntry(Entry value) {
        return new JAXBElement<Entry>(_Entry_QNAME, Entry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wwr450.wsbeans.iseries/", name = "entryResponse")
    public JAXBElement<EntryResponse> createEntryResponse(EntryResponse value) {
        return new JAXBElement<EntryResponse>(_EntryResponse_QNAME, EntryResponse.class, null, value);
    }

}