//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-520 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.03.03 at 06:40:01 PM EST 
//


package org.modeldriven.fuml.config;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Mapping configuration root class. 
 * 
 * <p>Java class for MappingConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MappingConfiguration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReferenceMapping" type="{http://www.modeldriven.org/fuml/config}ReferenceMapping" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BehaviorExecutionMapping" type="{http://www.modeldriven.org/fuml/config}BehaviorExecutionMapping" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MappingConfiguration", propOrder = {
    "referenceMapping",
    "behaviorExecutionMapping"
})
public class MappingConfiguration {

    @XmlElement(name = "ReferenceMapping")
    protected List<ReferenceMapping> referenceMapping;
    @XmlElement(name = "BehaviorExecutionMapping")
    protected List<BehaviorExecutionMapping> behaviorExecutionMapping;

    /**
     * Gets the value of the referenceMapping property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenceMapping property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceMapping().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceMapping }
     * 
     * 
     */
    public List<ReferenceMapping> getReferenceMapping() {
        if (referenceMapping == null) {
            referenceMapping = new ArrayList<ReferenceMapping>();
        }
        return this.referenceMapping;
    }

    /**
     * Gets the value of the behaviorExecutionMapping property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the behaviorExecutionMapping property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBehaviorExecutionMapping().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BehaviorExecutionMapping }
     * 
     * 
     */
    public List<BehaviorExecutionMapping> getBehaviorExecutionMapping() {
        if (behaviorExecutionMapping == null) {
            behaviorExecutionMapping = new ArrayList<BehaviorExecutionMapping>();
        }
        return this.behaviorExecutionMapping;
    }

}
