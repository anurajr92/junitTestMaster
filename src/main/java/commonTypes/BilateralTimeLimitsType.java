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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Offer/ Offer Item: BILATERAL (Implementer-Assigned) TIME LIMITS definition.
 * 
 * Bilateral Time Limit value.
 * Examples: 2017-05-30T09:00:00,  2015-01-13T13:59:38Z
 * 
 * Note: This is a bilaterally-agreed upon time limit that is not included in the NDC XML Specification.
 * 
 * <p>Java class for BilateralTimeLimitsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BilateralTimeLimitsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BilateralTimeLimit" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Name" type="{}ProperNameSimpleType"/>
 *                   &lt;element name="Description" type="{}DescriptionSimpleType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{}AttrCoreDateGrpType"/>
 *                 &lt;attGroup ref="{}ObjAssociationAttrGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BilateralTimeLimitsType", propOrder = {
    "bilateralTimeLimit"
})
public class BilateralTimeLimitsType {

    @XmlElement(name = "BilateralTimeLimit", required = true)
    protected List<BilateralTimeLimitsType.BilateralTimeLimit> bilateralTimeLimit;

    /**
     * Gets the value of the bilateralTimeLimit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bilateralTimeLimit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBilateralTimeLimit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BilateralTimeLimitsType.BilateralTimeLimit }
     * 
     * 
     */
    public List<BilateralTimeLimitsType.BilateralTimeLimit> getBilateralTimeLimit() {
        if (bilateralTimeLimit == null) {
            bilateralTimeLimit = new ArrayList<BilateralTimeLimitsType.BilateralTimeLimit>();
        }
        return this.bilateralTimeLimit;
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
     *         &lt;element name="Name" type="{}ProperNameSimpleType"/>
     *         &lt;element name="Description" type="{}DescriptionSimpleType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{}AttrCoreDateGrpType"/>
     *       &lt;attGroup ref="{}ObjAssociationAttrGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "name",
        "description"
    })
    public static class BilateralTimeLimit {

        @XmlElement(name = "Name", required = true)
        protected String name;
        @XmlElement(name = "Description")
        protected String description;
        @XmlAttribute(name = "DateTime")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar dateTime;
        @XmlAttribute(name = "ShortDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar shortDate;
        @XmlAttribute(name = "Timestamp")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar timestamp;
        @XmlAttribute(name = "Time")
        protected String time;
        @XmlAttribute(name = "refs")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String refs;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.description = value;
        }

        /**
         * Gets the value of the dateTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDateTime() {
            return dateTime;
        }

        /**
         * Sets the value of the dateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDateTime(XMLGregorianCalendar value) {
            this.dateTime = value;
        }

        /**
         * Gets the value of the shortDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getShortDate() {
            return shortDate;
        }

        /**
         * Sets the value of the shortDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setShortDate(XMLGregorianCalendar value) {
            this.shortDate = value;
        }

        /**
         * Gets the value of the timestamp property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTimestamp() {
            return timestamp;
        }

        /**
         * Sets the value of the timestamp property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTimestamp(XMLGregorianCalendar value) {
            this.timestamp = value;
        }

        /**
         * Gets the value of the time property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTime() {
            return time;
        }

        /**
         * Sets the value of the time property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTime(String value) {
            this.time = value;
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

}
