//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.05 at 03:14:26 PM GST 
//


package commonTypes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Associated Offer Detail definition.
 * 
 * <p>Java class for OfferDetailInfoAssocType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferDetailInfoAssocType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}OfferInstructionReferences" minOccurs="0"/>
 *         &lt;element ref="{}OfferPenaltyReferences" minOccurs="0"/>
 *         &lt;element ref="{}OfferTermReferences" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferDetailInfoAssocType", propOrder = {
    "offerInstructionReferences",
    "offerPenaltyReferences",
    "offerTermReferences"
})
public class OfferDetailInfoAssocType {

    @XmlElement(name = "OfferInstructionReferences")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String offerInstructionReferences;
    @XmlElement(name = "OfferPenaltyReferences")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String offerPenaltyReferences;
    @XmlElement(name = "OfferTermReferences")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected List<String> offerTermReferences;

    /**
     * Gets the value of the offerInstructionReferences property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferInstructionReferences() {
        return offerInstructionReferences;
    }

    /**
     * Sets the value of the offerInstructionReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferInstructionReferences(String value) {
        this.offerInstructionReferences = value;
    }

    /**
     * Gets the value of the offerPenaltyReferences property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferPenaltyReferences() {
        return offerPenaltyReferences;
    }

    /**
     * Sets the value of the offerPenaltyReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferPenaltyReferences(String value) {
        this.offerPenaltyReferences = value;
    }

    /**
     * Gets the value of the offerTermReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offerTermReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfferTermReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOfferTermReferences() {
        if (offerTermReferences == null) {
            offerTermReferences = new ArrayList<String>();
        }
        return this.offerTermReferences;
    }

}
