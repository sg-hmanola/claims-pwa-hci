//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.06.06 at 02:17:03 PM GMT 
//


package claimspwahci.generated;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for entryInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="entryInput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="i_DEALERCODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="i_PARTLIST" type="{http://wwr450.wsbeans.iseries/}dspart" maxOccurs="unbounded"/&gt;
 *         &lt;element name="i_RODATE" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "entryInput", propOrder = {
    "idealercode",
    "ipartlist",
    "irodate"
})
public class EntryInput {

    @XmlElement(name = "i_DEALERCODE", required = true)
    protected String idealercode;
    @XmlElement(name = "i_PARTLIST", required = true)
    protected List<Dspart> ipartlist;
    @XmlElement(name = "i_RODATE", required = true)
    protected BigDecimal irodate;

    /**
     * Gets the value of the idealercode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDEALERCODE() {
        return idealercode;
    }

    /**
     * Sets the value of the idealercode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDEALERCODE(String value) {
        this.idealercode = value;
    }

    /**
     * Gets the value of the ipartlist property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ipartlist property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIPARTLIST().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Dspart }
     * 
     * 
     */
    public List<Dspart> getIPARTLIST() {
        if (ipartlist == null) {
            ipartlist = new ArrayList<Dspart>();
        }
        return this.ipartlist;
    }

    /**
     * Gets the value of the irodate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIRODATE() {
        return irodate;
    }

    /**
     * Sets the value of the irodate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIRODATE(BigDecimal value) {
        this.irodate = value;
    }

}
