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
 * COUPON BOOKING/ SERVICING AGENT definition.
 * 
 * <p>Java class for CouponAgentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CouponAgentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{}IATA_CodeType"/>
 *         &lt;element name="ID">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;>UniqueStringID_SimpleType">
 *                 &lt;attribute name="refs" type="{}InstanceClassRefSimpleType" />
 *                 &lt;attribute name="ObjectMetaReferences" type="{}InstanceClassRefSimpleType" />
 *                 &lt;attribute name="Name" type="{}ProperNameSimpleType" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
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
@XmlType(name = "CouponAgentType", propOrder = {
    "type",
    "id"
})
@XmlSeeAlso({
    AgentID.class
})
public class CouponAgentType {

    @XmlElement(name = "Type", required = true)
    protected String type;
    @XmlElement(name = "ID", required = true)
    protected CouponAgentType.ID id;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link CouponAgentType.ID }
     *     
     */
    public CouponAgentType.ID getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link CouponAgentType.ID }
     *     
     */
    public void setID(CouponAgentType.ID value) {
        this.id = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;>UniqueStringID_SimpleType">
     *       &lt;attribute name="refs" type="{}InstanceClassRefSimpleType" />
     *       &lt;attribute name="ObjectMetaReferences" type="{}InstanceClassRefSimpleType" />
     *       &lt;attribute name="Name" type="{}ProperNameSimpleType" />
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
    public static class ID {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "refs")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String refs;
        @XmlAttribute(name = "ObjectMetaReferences")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String objectMetaReferences;
        @XmlAttribute(name = "Name")
        protected String name;

        /**
         * A data type for a Unique String Identifier constraint.
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
         * Gets the value of the objectMetaReferences property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getObjectMetaReferences() {
            return objectMetaReferences;
        }

        /**
         * Sets the value of the objectMetaReferences property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setObjectMetaReferences(String value) {
            this.objectMetaReferences = value;
        }

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

    }

}