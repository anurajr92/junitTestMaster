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
 * <p>Java class for LanguageAppListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LanguageAppListType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Actual"/>
 *     &lt;enumeration value="Requested"/>
 *     &lt;enumeration value="Spoken"/>
 *     &lt;enumeration value="Written"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LanguageAppListType")
@XmlEnum
public enum LanguageAppListType {

    @XmlEnumValue("Actual")
    ACTUAL("Actual"),
    @XmlEnumValue("Requested")
    REQUESTED("Requested"),
    @XmlEnumValue("Spoken")
    SPOKEN("Spoken"),
    @XmlEnumValue("Written")
    WRITTEN("Written"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    LanguageAppListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LanguageAppListType fromValue(String v) {
        for (LanguageAppListType c: LanguageAppListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
