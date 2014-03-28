//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.07 at 03:25:51 PM MEZ 
//


package org.modeldriven.fuml.config;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReferenceMappingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReferenceMappingType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="parent"/>
 *     &lt;enumeration value="child"/>
 *     &lt;enumeration value="sibling"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReferenceMappingType")
@XmlEnum
public enum ReferenceMappingType {

    @XmlEnumValue("parent")
    PARENT("parent"),
    @XmlEnumValue("child")
    CHILD("child"),
    @XmlEnumValue("sibling")
    SIBLING("sibling");
    private final String value;

    ReferenceMappingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReferenceMappingType fromValue(String v) {
        for (ReferenceMappingType c: ReferenceMappingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
