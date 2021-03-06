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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * AIRLINE ALLIANCE PROGRAM Preferences.
 * 
 * <p>Java class for AlliancePreferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlliancePreferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Alliance" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{}CodesetType">
 *                 &lt;sequence>
 *                   &lt;element name="GeoIndicatorType" type="{}IATA_CodeType" minOccurs="0"/>
 *                   &lt;element name="FlightHaulLength" type="{}IATA_CodeType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{}PreferenceAttrGroup"/>
 *               &lt;/extension>
 *             &lt;/complexContent>
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
@XmlType(name = "AlliancePreferencesType", propOrder = {
    "alliance"
})
public class AlliancePreferencesType {

    @XmlElement(name = "Alliance", required = true)
    protected List<AlliancePreferencesType.Alliance> alliance;
    @XmlAttribute(name = "refs")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refs;

    /**
     * Gets the value of the alliance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alliance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlliance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlliancePreferencesType.Alliance }
     * 
     * 
     */
    public List<AlliancePreferencesType.Alliance> getAlliance() {
        if (alliance == null) {
            alliance = new ArrayList<AlliancePreferencesType.Alliance>();
        }
        return this.alliance;
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
     *   &lt;complexContent>
     *     &lt;extension base="{}CodesetType">
     *       &lt;sequence>
     *         &lt;element name="GeoIndicatorType" type="{}IATA_CodeType" minOccurs="0"/>
     *         &lt;element name="FlightHaulLength" type="{}IATA_CodeType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{}PreferenceAttrGroup"/>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "geoIndicatorType",
        "flightHaulLength"
    })
    public static class Alliance
        extends CodesetType
    {

        @XmlElement(name = "GeoIndicatorType")
        protected String geoIndicatorType;
        @XmlElement(name = "FlightHaulLength")
        protected String flightHaulLength;
        @XmlAttribute(name = "PreferencesLevel")
        protected String preferencesLevel;
        @XmlAttribute(name = "PreferencesContext")
        protected String preferencesContext;

        /**
         * Gets the value of the geoIndicatorType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGeoIndicatorType() {
            return geoIndicatorType;
        }

        /**
         * Sets the value of the geoIndicatorType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGeoIndicatorType(String value) {
            this.geoIndicatorType = value;
        }

        /**
         * Gets the value of the flightHaulLength property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFlightHaulLength() {
            return flightHaulLength;
        }

        /**
         * Sets the value of the flightHaulLength property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFlightHaulLength(String value) {
            this.flightHaulLength = value;
        }

        /**
         * Gets the value of the preferencesLevel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPreferencesLevel() {
            return preferencesLevel;
        }

        /**
         * Sets the value of the preferencesLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPreferencesLevel(String value) {
            this.preferencesLevel = value;
        }

        /**
         * Gets the value of the preferencesContext property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPreferencesContext() {
            return preferencesContext;
        }

        /**
         * Sets the value of the preferencesContext property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPreferencesContext(String value) {
            this.preferencesContext = value;
        }

    }

}
