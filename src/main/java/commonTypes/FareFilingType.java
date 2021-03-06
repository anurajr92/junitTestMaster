//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.05 at 03:14:26 PM GST 
//


package commonTypes;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * FARE FILING definition.
 * 
 * <p>Java class for FareFilingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareFilingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BaseAmount" type="{}CurrencyAmountOptType"/>
 *         &lt;element name="NUC_Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ExchangeRate" type="{}ContextSimpleType" minOccurs="0"/>
 *         &lt;element name="TicketBulkMask" type="{}ContextSimpleType" minOccurs="0"/>
 *         &lt;element ref="{}FiledFare" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{}ObjAssociationAttrGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareFilingType", propOrder = {
    "baseAmount",
    "nucAmount",
    "exchangeRate",
    "ticketBulkMask",
    "filedFare"
})
public class FareFilingType {

    @XmlElement(name = "BaseAmount", required = true)
    protected CurrencyAmountOptType baseAmount;
    @XmlElement(name = "NUC_Amount")
    protected BigDecimal nucAmount;
    @XmlElement(name = "ExchangeRate")
    protected String exchangeRate;
    @XmlElement(name = "TicketBulkMask")
    protected String ticketBulkMask;
    @XmlElement(name = "FiledFare")
    protected FiledFare filedFare;
    @XmlAttribute(name = "refs")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refs;

    /**
     * Gets the value of the baseAmount property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountOptType }
     *     
     */
    public CurrencyAmountOptType getBaseAmount() {
        return baseAmount;
    }

    /**
     * Sets the value of the baseAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountOptType }
     *     
     */
    public void setBaseAmount(CurrencyAmountOptType value) {
        this.baseAmount = value;
    }

    /**
     * Gets the value of the nucAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNUCAmount() {
        return nucAmount;
    }

    /**
     * Sets the value of the nucAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNUCAmount(BigDecimal value) {
        this.nucAmount = value;
    }

    /**
     * Gets the value of the exchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Sets the value of the exchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeRate(String value) {
        this.exchangeRate = value;
    }

    /**
     * Gets the value of the ticketBulkMask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketBulkMask() {
        return ticketBulkMask;
    }

    /**
     * Sets the value of the ticketBulkMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketBulkMask(String value) {
        this.ticketBulkMask = value;
    }

    /**
     * Filed fare information that may contain specific indicators applicable to the use of filed fares scenarios.
     * 
     * @return
     *     possible object is
     *     {@link FiledFare }
     *     
     */
    public FiledFare getFiledFare() {
        return filedFare;
    }

    /**
     * Sets the value of the filedFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link FiledFare }
     *     
     */
    public void setFiledFare(FiledFare value) {
        this.filedFare = value;
    }

    /**
     * Gets the value of the refs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefs() {
        return refs;
    }

    /**
     * Sets the value of the refs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefs(String value) {
        this.refs = value;
    }

}
