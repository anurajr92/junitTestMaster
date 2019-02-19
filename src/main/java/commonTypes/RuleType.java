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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * RULE definition.
 * 
 * <p>Java class for RuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RuleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RuleID" type="{}ProperNameSimpleType"/>
 *         &lt;element name="Value">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Text" type="{}ShortDescSimpleType" minOccurs="0"/>
 *                   &lt;element ref="{}AugmentationPoint" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Name" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;>ProperNameSimpleType">
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Owner" type="{}ContextSimpleType" minOccurs="0"/>
 *         &lt;element name="EffectivePeriod" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{}YearPeriod"/>
 *                   &lt;element ref="{}YearMonthPeriod"/>
 *                   &lt;element ref="{}TimePeriod"/>
 *                   &lt;element ref="{}QuarterPeriod"/>
 *                   &lt;element ref="{}MonthPeriod"/>
 *                   &lt;element ref="{}DayPeriod"/>
 *                   &lt;element ref="{}DateTimePeriod"/>
 *                   &lt;element ref="{}DatePeriod"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{}ObjectKeyAttrGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RuleType", propOrder = {
    "ruleID",
    "value",
    "name",
    "owner",
    "effectivePeriod"
})
public class RuleType {

    @XmlElement(name = "RuleID", required = true)
    protected String ruleID;
    @XmlElement(name = "Value", required = true)
    protected RuleType.Value value;
    @XmlElement(name = "Name")
    protected RuleType.Name name;
    @XmlElement(name = "Owner")
    protected String owner;
    @XmlElement(name = "EffectivePeriod")
    protected RuleType.EffectivePeriod effectivePeriod;
    @XmlAttribute(name = "refs")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refs;
    @XmlAttribute(name = "ObjectKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String objectKey;

    /**
     * Gets the value of the ruleID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleID() {
        return ruleID;
    }

    /**
     * Sets the value of the ruleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleID(String value) {
        this.ruleID = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link RuleType.Value }
     *     
     */
    public RuleType.Value getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link RuleType.Value }
     *     
     */
    public void setValue(RuleType.Value value) {
        this.value = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link RuleType.Name }
     *     
     */
    public RuleType.Name getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link RuleType.Name }
     *     
     */
    public void setName(RuleType.Name value) {
        this.name = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner(String value) {
        this.owner = value;
    }

    /**
     * Gets the value of the effectivePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link RuleType.EffectivePeriod }
     *     
     */
    public RuleType.EffectivePeriod getEffectivePeriod() {
        return effectivePeriod;
    }

    /**
     * Sets the value of the effectivePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link RuleType.EffectivePeriod }
     *     
     */
    public void setEffectivePeriod(RuleType.EffectivePeriod value) {
        this.effectivePeriod = value;
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
     * Gets the value of the objectKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectKey() {
        return objectKey;
    }

    /**
     * Sets the value of the objectKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectKey(String value) {
        this.objectKey = value;
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
     *         &lt;element ref="{}YearPeriod"/>
     *         &lt;element ref="{}YearMonthPeriod"/>
     *         &lt;element ref="{}TimePeriod"/>
     *         &lt;element ref="{}QuarterPeriod"/>
     *         &lt;element ref="{}MonthPeriod"/>
     *         &lt;element ref="{}DayPeriod"/>
     *         &lt;element ref="{}DateTimePeriod"/>
     *         &lt;element ref="{}DatePeriod"/>
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
        "yearPeriod",
        "yearMonthPeriod",
        "timePeriod",
        "quarterPeriod",
        "monthPeriod",
        "dayPeriod",
        "dateTimePeriod",
        "datePeriod"
    })
    public static class EffectivePeriod {

        @XmlElement(name = "YearPeriod", required = true)
        protected YearPeriodRepType yearPeriod;
        @XmlElement(name = "YearMonthPeriod", required = true)
        protected YearMonthPeriodRepType yearMonthPeriod;
        @XmlElement(name = "TimePeriod", required = true)
        protected TimePeriodRepType timePeriod;
        @XmlElement(name = "QuarterPeriod", required = true)
        protected QuarterPeriodRepType quarterPeriod;
        @XmlElement(name = "MonthPeriod", required = true)
        protected MonthPeriodRepType monthPeriod;
        @XmlElement(name = "DayPeriod", required = true)
        protected DayPeriodRepType dayPeriod;
        @XmlElement(name = "DateTimePeriod", required = true)
        protected DateTimePeriodRepType dateTimePeriod;
        @XmlElement(name = "DatePeriod", required = true)
        protected DatePeriodRepType datePeriod;

        /**
         * Gets the value of the yearPeriod property.
         * 
         * @return
         *     possible object is
         *     {@link YearPeriodRepType }
         *     
         */
        public YearPeriodRepType getYearPeriod() {
            return yearPeriod;
        }

        /**
         * Sets the value of the yearPeriod property.
         * 
         * @param value
         *     allowed object is
         *     {@link YearPeriodRepType }
         *     
         */
        public void setYearPeriod(YearPeriodRepType value) {
            this.yearPeriod = value;
        }

        /**
         * Gets the value of the yearMonthPeriod property.
         * 
         * @return
         *     possible object is
         *     {@link YearMonthPeriodRepType }
         *     
         */
        public YearMonthPeriodRepType getYearMonthPeriod() {
            return yearMonthPeriod;
        }

        /**
         * Sets the value of the yearMonthPeriod property.
         * 
         * @param value
         *     allowed object is
         *     {@link YearMonthPeriodRepType }
         *     
         */
        public void setYearMonthPeriod(YearMonthPeriodRepType value) {
            this.yearMonthPeriod = value;
        }

        /**
         * Gets the value of the timePeriod property.
         * 
         * @return
         *     possible object is
         *     {@link TimePeriodRepType }
         *     
         */
        public TimePeriodRepType getTimePeriod() {
            return timePeriod;
        }

        /**
         * Sets the value of the timePeriod property.
         * 
         * @param value
         *     allowed object is
         *     {@link TimePeriodRepType }
         *     
         */
        public void setTimePeriod(TimePeriodRepType value) {
            this.timePeriod = value;
        }

        /**
         * Gets the value of the quarterPeriod property.
         * 
         * @return
         *     possible object is
         *     {@link QuarterPeriodRepType }
         *     
         */
        public QuarterPeriodRepType getQuarterPeriod() {
            return quarterPeriod;
        }

        /**
         * Sets the value of the quarterPeriod property.
         * 
         * @param value
         *     allowed object is
         *     {@link QuarterPeriodRepType }
         *     
         */
        public void setQuarterPeriod(QuarterPeriodRepType value) {
            this.quarterPeriod = value;
        }

        /**
         * Gets the value of the monthPeriod property.
         * 
         * @return
         *     possible object is
         *     {@link MonthPeriodRepType }
         *     
         */
        public MonthPeriodRepType getMonthPeriod() {
            return monthPeriod;
        }

        /**
         * Sets the value of the monthPeriod property.
         * 
         * @param value
         *     allowed object is
         *     {@link MonthPeriodRepType }
         *     
         */
        public void setMonthPeriod(MonthPeriodRepType value) {
            this.monthPeriod = value;
        }

        /**
         * Gets the value of the dayPeriod property.
         * 
         * @return
         *     possible object is
         *     {@link DayPeriodRepType }
         *     
         */
        public DayPeriodRepType getDayPeriod() {
            return dayPeriod;
        }

        /**
         * Sets the value of the dayPeriod property.
         * 
         * @param value
         *     allowed object is
         *     {@link DayPeriodRepType }
         *     
         */
        public void setDayPeriod(DayPeriodRepType value) {
            this.dayPeriod = value;
        }

        /**
         * Gets the value of the dateTimePeriod property.
         * 
         * @return
         *     possible object is
         *     {@link DateTimePeriodRepType }
         *     
         */
        public DateTimePeriodRepType getDateTimePeriod() {
            return dateTimePeriod;
        }

        /**
         * Sets the value of the dateTimePeriod property.
         * 
         * @param value
         *     allowed object is
         *     {@link DateTimePeriodRepType }
         *     
         */
        public void setDateTimePeriod(DateTimePeriodRepType value) {
            this.dateTimePeriod = value;
        }

        /**
         * Gets the value of the datePeriod property.
         * 
         * @return
         *     possible object is
         *     {@link DatePeriodRepType }
         *     
         */
        public DatePeriodRepType getDatePeriod() {
            return datePeriod;
        }

        /**
         * Sets the value of the datePeriod property.
         * 
         * @param value
         *     allowed object is
         *     {@link DatePeriodRepType }
         *     
         */
        public void setDatePeriod(DatePeriodRepType value) {
            this.datePeriod = value;
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
    public static class Name {

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
     *         &lt;element name="Text" type="{}ShortDescSimpleType" minOccurs="0"/>
     *         &lt;element ref="{}AugmentationPoint" minOccurs="0"/>
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
        "text",
        "augmentationPoint"
    })
    public static class Value {

        @XmlElement(name = "Text")
        protected String text;
        @XmlElement(name = "AugmentationPoint")
        protected AugPointInfoType augmentationPoint;

        /**
         * Gets the value of the text property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getText() {
            return text;
        }

        /**
         * Sets the value of the text property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setText(String value) {
            this.text = value;
        }

        /**
         * Implementer-defined rule values.
         * 
         * @return
         *     possible object is
         *     {@link AugPointInfoType }
         *     
         */
        public AugPointInfoType getAugmentationPoint() {
            return augmentationPoint;
        }

        /**
         * Sets the value of the augmentationPoint property.
         * 
         * @param value
         *     allowed object is
         *     {@link AugPointInfoType }
         *     
         */
        public void setAugmentationPoint(AugPointInfoType value) {
            this.augmentationPoint = value;
        }

    }

}
