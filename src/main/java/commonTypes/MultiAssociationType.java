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
 * Shopping and Order Multiple Association definition.
 * 
 * <p>Java class for MultiAssociationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultiAssociationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{}OfferAssociations"/>
 *         &lt;element ref="{}OrderAssociations"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiAssociationType", propOrder = {
    "offerAssociations",
    "orderAssociations"
})
public class MultiAssociationType {

    @XmlElement(name = "OfferAssociations")
    protected OfferAssociations offerAssociations;
    @XmlElement(name = "OrderAssociations")
    protected OrderItemAssociationType orderAssociations;

    /**
     * Gets the value of the offerAssociations property.
     * 
     * @return
     *     possible object is
     *     {@link OfferAssociations }
     *     
     */
    public OfferAssociations getOfferAssociations() {
        return offerAssociations;
    }

    /**
     * Sets the value of the offerAssociations property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferAssociations }
     *     
     */
    public void setOfferAssociations(OfferAssociations value) {
        this.offerAssociations = value;
    }

    /**
     * Gets the value of the orderAssociations property.
     * 
     * @return
     *     possible object is
     *     {@link OrderItemAssociationType }
     *     
     */
    public OrderItemAssociationType getOrderAssociations() {
        return orderAssociations;
    }

    /**
     * Sets the value of the orderAssociations property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderItemAssociationType }
     *     
     */
    public void setOrderAssociations(OrderItemAssociationType value) {
        this.orderAssociations = value;
    }

}
