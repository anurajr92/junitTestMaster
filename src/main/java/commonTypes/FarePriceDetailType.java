//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.05 at 03:14:26 PM GST 
//


package commonTypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * FARE PRICE DETAIL definition.
 * 
 * <p>Java class for FarePriceDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FarePriceDetailType">
 *   &lt;complexContent>
 *     &lt;extension base="{}FarePriceBaseType">
 *       &lt;sequence>
 *         &lt;element name="Taxes" type="{}TaxDetailType" minOccurs="0"/>
 *         &lt;element ref="{}TaxExemption" minOccurs="0"/>
 *         &lt;element name="RequestedDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Alignment" type="{}IATA_CodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FarePriceDetailType", propOrder = {
    "taxes",
    "taxExemption",
    "requestedDate",
    "alignment"
})
public class FarePriceDetailType
    extends FarePriceBaseType
{

    @XmlElement(name = "Taxes")
    protected TaxDetailType taxes;
    @XmlElement(name = "TaxExemption")
    protected TaxExemptionType taxExemption;
    @XmlElement(name = "RequestedDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar requestedDate;
    @XmlElement(name = "Alignment")
    protected String alignment;

    /**
     * Gets the value of the taxes property.
     * 
     * @return
     *     possible object is
     *     {@link TaxDetailType }
     *     
     */
    public TaxDetailType getTaxes() {
        return taxes;
    }

    /**
     * Sets the value of the taxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxDetailType }
     *     
     */
    public void setTaxes(TaxDetailType value) {
        this.taxes = value;
    }

    /**
     * Gets the value of the taxExemption property.
     * 
     * @return
     *     possible object is
     *     {@link TaxExemptionType }
     *     
     */
    public TaxExemptionType getTaxExemption() {
        return taxExemption;
    }

    /**
     * Sets the value of the taxExemption property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxExemptionType }
     *     
     */
    public void setTaxExemption(TaxExemptionType value) {
        this.taxExemption = value;
    }

    /**
     * Gets the value of the requestedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestedDate() {
        return requestedDate;
    }

    /**
     * Sets the value of the requestedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestedDate(XMLGregorianCalendar value) {
        this.requestedDate = value;
    }

    /**
     * Gets the value of the alignment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlignment() {
        return alignment;
    }

    /**
     * Sets the value of the alignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlignment(String value) {
        this.alignment = value;
    }

}
