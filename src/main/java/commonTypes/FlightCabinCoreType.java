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
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A data type for Cabin Core.
 * 
 * Cabin code.
 * Example: F
 * 
 * <p>Java class for FlightCabin_CoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightCabin_CoreType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CabinDesignator">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;>Flight_COS_SimpleType">
 *                 &lt;attribute name="AllCabins" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MarketingName" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;>ProperNameSimpleType">
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "FlightCabin_CoreType", propOrder = {
    "cabinDesignator",
    "marketingName"
})
@XmlSeeAlso({
    SimpleAircraftCabinType.class
})
public class FlightCabinCoreType {

    @XmlElement(name = "CabinDesignator", required = true)
    protected FlightCabinCoreType.CabinDesignator cabinDesignator;
    @XmlElement(name = "MarketingName")
    protected FlightCabinCoreType.MarketingName marketingName;
    @XmlAttribute(name = "refs")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refs;

    /**
     * Gets the value of the cabinDesignator property.
     * 
     * @return
     *     possible object is
     *     {@link FlightCabinCoreType.CabinDesignator }
     *     
     */
    public FlightCabinCoreType.CabinDesignator getCabinDesignator() {
        return cabinDesignator;
    }

    /**
     * Sets the value of the cabinDesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightCabinCoreType.CabinDesignator }
     *     
     */
    public void setCabinDesignator(FlightCabinCoreType.CabinDesignator value) {
        this.cabinDesignator = value;
    }

    /**
     * Gets the value of the marketingName property.
     * 
     * @return
     *     possible object is
     *     {@link FlightCabinCoreType.MarketingName }
     *     
     */
    public FlightCabinCoreType.MarketingName getMarketingName() {
        return marketingName;
    }

    /**
     * Sets the value of the marketingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightCabinCoreType.MarketingName }
     *     
     */
    public void setMarketingName(FlightCabinCoreType.MarketingName value) {
        this.marketingName = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;>Flight_COS_SimpleType">
     *       &lt;attribute name="AllCabins" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class CabinDesignator {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "AllCabins")
        protected Boolean allCabins;

        /**
         * A data type for Flight Class of Service encoding constraint.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the allCabins property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAllCabins() {
            return allCabins;
        }

        /**
         * Sets the value of the allCabins property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAllCabins(Boolean value) {
            this.allCabins = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;>ProperNameSimpleType">
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class MarketingName {

        @XmlValue
        protected String value;

        /**
         * A data type for Proper Name size constraint.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

    }

}