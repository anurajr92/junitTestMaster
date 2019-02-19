//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.05 at 03:14:26 PM GST 
//


package commonTypes;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * FLIGHT DETAIL definition.
 * 
 * <p>Java class for FlightDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}FlightSegmentType" minOccurs="0"/>
 *         &lt;element ref="{}FlightDistance" minOccurs="0"/>
 *         &lt;element ref="{}FlightDuration" minOccurs="0"/>
 *         &lt;element name="Stops" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="StopQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element ref="{}StopLocations" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{}ResDateTime" minOccurs="0"/>
 *         &lt;element name="TourOperatorFlightID" type="{}ContextSimpleType" minOccurs="0"/>
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
@XmlType(name = "FlightDetailType", propOrder = {
    "flightSegmentType",
    "flightDistance",
    "flightDuration",
    "stops",
    "resDateTime",
    "tourOperatorFlightID"
})
public class FlightDetailType {

    @XmlElement(name = "FlightSegmentType")
    protected String flightSegmentType;
    @XmlElement(name = "FlightDistance")
    protected FlightDistanceType flightDistance;
    @XmlElement(name = "FlightDuration")
    protected FlightDurationType flightDuration;
    @XmlElement(name = "Stops")
    protected FlightDetailType.Stops stops;
    @XmlElement(name = "ResDateTime")
    protected ResDateTime resDateTime;
    @XmlElement(name = "TourOperatorFlightID")
    protected String tourOperatorFlightID;
    @XmlAttribute(name = "refs")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refs;

    /**
     * Gets the value of the flightSegmentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightSegmentType() {
        return flightSegmentType;
    }

    /**
     * Sets the value of the flightSegmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightSegmentType(String value) {
        this.flightSegmentType = value;
    }

    /**
     * Gets the value of the flightDistance property.
     * 
     * @return
     *     possible object is
     *     {@link FlightDistanceType }
     *     
     */
    public FlightDistanceType getFlightDistance() {
        return flightDistance;
    }

    /**
     * Sets the value of the flightDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightDistanceType }
     *     
     */
    public void setFlightDistance(FlightDistanceType value) {
        this.flightDistance = value;
    }

    /**
     * Gets the value of the flightDuration property.
     * 
     * @return
     *     possible object is
     *     {@link FlightDurationType }
     *     
     */
    public FlightDurationType getFlightDuration() {
        return flightDuration;
    }

    /**
     * Sets the value of the flightDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightDurationType }
     *     
     */
    public void setFlightDuration(FlightDurationType value) {
        this.flightDuration = value;
    }

    /**
     * Gets the value of the stops property.
     * 
     * @return
     *     possible object is
     *     {@link FlightDetailType.Stops }
     *     
     */
    public FlightDetailType.Stops getStops() {
        return stops;
    }

    /**
     * Sets the value of the stops property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightDetailType.Stops }
     *     
     */
    public void setStops(FlightDetailType.Stops value) {
        this.stops = value;
    }

    /**
     * Gets the value of the resDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link ResDateTime }
     *     
     */
    public ResDateTime getResDateTime() {
        return resDateTime;
    }

    /**
     * Sets the value of the resDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResDateTime }
     *     
     */
    public void setResDateTime(ResDateTime value) {
        this.resDateTime = value;
    }

    /**
     * Gets the value of the tourOperatorFlightID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTourOperatorFlightID() {
        return tourOperatorFlightID;
    }

    /**
     * Sets the value of the tourOperatorFlightID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTourOperatorFlightID(String value) {
        this.tourOperatorFlightID = value;
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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="StopQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element ref="{}StopLocations" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "stopQuantity",
        "stopLocations"
    })
    public static class Stops {

        @XmlElement(name = "StopQuantity")
        protected BigInteger stopQuantity;
        @XmlElement(name = "StopLocations")
        protected StopLocationType stopLocations;

        /**
         * Gets the value of the stopQuantity property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getStopQuantity() {
            return stopQuantity;
        }

        /**
         * Sets the value of the stopQuantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setStopQuantity(BigInteger value) {
            this.stopQuantity = value;
        }

        /**
         * Gets the value of the stopLocations property.
         * 
         * @return
         *     possible object is
         *     {@link StopLocationType }
         *     
         */
        public StopLocationType getStopLocations() {
            return stopLocations;
        }

        /**
         * Sets the value of the stopLocations property.
         * 
         * @param value
         *     allowed object is
         *     {@link StopLocationType }
         *     
         */
        public void setStopLocations(StopLocationType value) {
            this.stopLocations = value;
        }

    }

}
