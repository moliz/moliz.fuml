//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-520 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.03.03 at 06:04:29 PM EST 
//


package org.modeldriven.fuml.config;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImportAdapterType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ImportAdapterType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="stream"/>
 *     &lt;enumeration value="assembly"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ImportAdapterType")
@XmlEnum
public enum ImportAdapterType {

    @XmlEnumValue("stream")
    STREAM("stream"),
    @XmlEnumValue("assembly")
    ASSEMBLY("assembly");
    private final String value;

    ImportAdapterType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ImportAdapterType fromValue(String v) {
        for (ImportAdapterType c: ImportAdapterType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
