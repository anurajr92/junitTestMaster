//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.05 at 03:14:26 PM GST 
//


package commonTypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type for LANGUAGE Metadata.
 * 
 * <p>Java class for LanguageMetadataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LanguageMetadataType">
 *   &lt;complexContent>
 *     &lt;extension base="{}MetadataObjectBaseType">
 *       &lt;sequence>
 *         &lt;element name="Application" type="{}LanguageAppSimpleType" minOccurs="0"/>
 *         &lt;element name="Code_ISO" type="{}CodesetValueSimpleType" minOccurs="0"/>
 *         &lt;element name="Code_NLS" type="{}CodesetValueSimpleType" minOccurs="0"/>
 *         &lt;element name="Name" type="{}ProperNameSimpleType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LanguageMetadataType", propOrder = {
    "application",
    "codeISO",
    "codeNLS",
    "name"
})
public class LanguageMetadataType
    extends MetadataObjectBaseType
{

    @XmlElement(name = "Application")
    protected String application;
    @XmlElement(name = "Code_ISO")
    protected String codeISO;
    @XmlElement(name = "Code_NLS")
    protected String codeNLS;
    @XmlElement(name = "Name")
    protected String name;

    /**
     * Gets the value of the application property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplication() {
        return application;
    }

    /**
     * Sets the value of the application property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplication(String value) {
        this.application = value;
    }

    /**
     * Gets the value of the codeISO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeISO() {
        return codeISO;
    }

    /**
     * Sets the value of the codeISO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeISO(String value) {
        this.codeISO = value;
    }

    /**
     * Gets the value of the codeNLS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeNLS() {
        return codeNLS;
    }

    /**
     * Sets the value of the codeNLS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeNLS(String value) {
        this.codeNLS = value;
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
