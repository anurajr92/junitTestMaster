//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.05 at 03:14:26 PM GST 
//


package commonTypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * OFFER TERMS definition.
 * 
 * <p>Java class for OfferTermsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferTermsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="AvailablePeriod" type="{}OfferValidPeriodType"/>
 *         &lt;element name="Descriptions" type="{}Descriptions"/>
 *         &lt;element name="GroupSize" type="{}OfferGroupSizeType"/>
 *         &lt;element name="OrderingQuantity" type="{}OfferOrderQuantityType"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{}ObjAssociationAttrGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferTermsType", propOrder = {
    "availablePeriod",
    "descriptions",
    "groupSize",
    "orderingQuantity"
})
public class OfferTermsType {

    @XmlElement(name = "AvailablePeriod")
    protected OfferValidPeriodType availablePeriod;
    @XmlElement(name = "Descriptions")
    protected Descriptions descriptions;
    @XmlElement(name = "GroupSize")
    protected OfferGroupSizeType groupSize;
    @XmlElement(name = "OrderingQuantity")
    protected OfferOrderQuantityType orderingQuantity;
    @XmlAttribute(name = "refs")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refs;

    /**
     * Gets the value of the availablePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link OfferValidPeriodType }
     *     
     */
    public OfferValidPeriodType getAvailablePeriod() {
        return availablePeriod;
    }

    /**
     * Sets the value of the availablePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferValidPeriodType }
     *     
     */
    public void setAvailablePeriod(OfferValidPeriodType value) {
        this.availablePeriod = value;
    }

    /**
     * Gets the value of the descriptions property.
     * 
     * @return
     *     possible object is
     *     {@link Descriptions }
     *     
     */
    public Descriptions getDescriptions() {
        return descriptions;
    }

    /**
     * Sets the value of the descriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Descriptions }
     *     
     */
    public void setDescriptions(Descriptions value) {
        this.descriptions = value;
    }

    /**
     * Gets the value of the groupSize property.
     * 
     * @return
     *     possible object is
     *     {@link OfferGroupSizeType }
     *     
     */
    public OfferGroupSizeType getGroupSize() {
        return groupSize;
    }

    /**
     * Sets the value of the groupSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferGroupSizeType }
     *     
     */
    public void setGroupSize(OfferGroupSizeType value) {
        this.groupSize = value;
    }

    /**
     * Gets the value of the orderingQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link OfferOrderQuantityType }
     *     
     */
    public OfferOrderQuantityType getOrderingQuantity() {
        return orderingQuantity;
    }

    /**
     * Sets the value of the orderingQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferOrderQuantityType }
     *     
     */
    public void setOrderingQuantity(OfferOrderQuantityType value) {
        this.orderingQuantity = value;
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