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
import javax.xml.bind.annotation.XmlType;


/**
 * Order Item Time Limits definition.
 * 
 * <p>Java class for OrderItemTimeLimitsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderItemTimeLimitsType">
 *   &lt;complexContent>
 *     &lt;extension base="{}OrderTimeLimitsType">
 *       &lt;sequence>
 *         &lt;element ref="{}PriceGuaranteeTimeLimits" minOccurs="0"/>
 *         &lt;element ref="{}TicketingTimeLimits" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderItemTimeLimitsType", propOrder = {
    "priceGuaranteeTimeLimits",
    "ticketingTimeLimits"
})
public class OrderItemTimeLimitsType
    extends OrderTimeLimitsType
{

    @XmlElement(name = "PriceGuaranteeTimeLimits")
    protected PriceGuaranteeTimeLimitType priceGuaranteeTimeLimits;
    @XmlElement(name = "TicketingTimeLimits")
    protected TicketingTimeLimits ticketingTimeLimits;

    /**
     * Gets the value of the priceGuaranteeTimeLimits property.
     * 
     * @return
     *     possible object is
     *     {@link PriceGuaranteeTimeLimitType }
     *     
     */
    public PriceGuaranteeTimeLimitType getPriceGuaranteeTimeLimits() {
        return priceGuaranteeTimeLimits;
    }

    /**
     * Sets the value of the priceGuaranteeTimeLimits property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceGuaranteeTimeLimitType }
     *     
     */
    public void setPriceGuaranteeTimeLimits(PriceGuaranteeTimeLimitType value) {
        this.priceGuaranteeTimeLimits = value;
    }

    /**
     * Gets the value of the ticketingTimeLimits property.
     * 
     * @return
     *     possible object is
     *     {@link TicketingTimeLimits }
     *     
     */
    public TicketingTimeLimits getTicketingTimeLimits() {
        return ticketingTimeLimits;
    }

    /**
     * Sets the value of the ticketingTimeLimits property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketingTimeLimits }
     *     
     */
    public void setTicketingTimeLimits(TicketingTimeLimits value) {
        this.ticketingTimeLimits = value;
    }

}
