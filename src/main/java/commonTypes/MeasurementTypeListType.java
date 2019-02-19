//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.05 at 03:14:26 PM GST 
//


package commonTypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeasurementTypeListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MeasurementTypeListType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Imperial"/>
 *     &lt;enumeration value="Metric"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MeasurementTypeListType")
@XmlEnum
public enum MeasurementTypeListType {

    @XmlEnumValue("Imperial")
    IMPERIAL("Imperial"),
    @XmlEnumValue("Metric")
    METRIC("Metric");
    private final String value;

    MeasurementTypeListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MeasurementTypeListType fromValue(String v) {
        for (MeasurementTypeListType c: MeasurementTypeListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
