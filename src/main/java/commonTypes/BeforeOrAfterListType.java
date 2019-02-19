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
 * <p>Java class for BeforeOrAfterListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BeforeOrAfterListType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Before"/>
 *     &lt;enumeration value="After"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BeforeOrAfterListType")
@XmlEnum
public enum BeforeOrAfterListType {

    @XmlEnumValue("Before")
    BEFORE("Before"),
    @XmlEnumValue("After")
    AFTER("After");
    private final String value;

    BeforeOrAfterListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BeforeOrAfterListType fromValue(String v) {
        for (BeforeOrAfterListType c: BeforeOrAfterListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
