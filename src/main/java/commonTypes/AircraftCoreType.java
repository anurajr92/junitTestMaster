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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * AIRCRAFT CORE representation.
 * 
 * <p>Java class for AircraftCoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AircraftCoreType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}AircraftCode"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{}ObjAssociationAttrGroup"/>
 *       &lt;attribute name="ChangeOfGaugeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AircraftCoreType", propOrder = {
    "aircraftCode"
})
@XmlSeeAlso({
    AircraftSummaryType.class
})
public class AircraftCoreType {

    @XmlElement(name = "AircraftCode", required = true)
    protected AircraftCode aircraftCode;
    @XmlAttribute(name = "ChangeOfGaugeInd")
    protected Boolean changeOfGaugeInd;
    @XmlAttribute(name = "refs")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refs;

    /**
     * Equipment Code. Example: 737
     * 
     * Encoding Scheme: IATA/ A4A Equipment Code
     * 
     * @return
     *     possible object is
     *     {@link AircraftCode }
     *     
     */
    public AircraftCode getAircraftCode() {
        return aircraftCode;
    }

    /**
     * Sets the value of the aircraftCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AircraftCode }
     *     
     */
    public void setAircraftCode(AircraftCode value) {
        this.aircraftCode = value;
    }

    /**
     * Gets the value of the changeOfGaugeInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChangeOfGaugeInd() {
        return changeOfGaugeInd;
    }

    /**
     * Sets the value of the changeOfGaugeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChangeOfGaugeInd(Boolean value) {
        this.changeOfGaugeInd = value;
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