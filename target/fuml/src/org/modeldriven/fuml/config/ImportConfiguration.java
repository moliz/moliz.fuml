//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-520 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.02.29 at 03:31:29 PM EST 
//


package org.modeldriven.fuml.config;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImportConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImportConfiguration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SupportedNamespace" type="{http://www.modeldriven.org/fuml/config}SupportedNamespace" maxOccurs="unbounded"/>
 *         &lt;element name="Exemption" type="{http://www.modeldriven.org/fuml/config}ImportExemption" maxOccurs="unbounded"/>
 *         &lt;element name="Adapter" type="{http://www.modeldriven.org/fuml/config}ImportAdapter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ExtensionPackage" type="{http://www.modeldriven.org/fuml/config}ExtensionPackage" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportConfiguration", propOrder = {
    "supportedNamespace",
    "exemption",
    "adapter",
    "extensionPackage"
})
public class ImportConfiguration {

    @XmlElement(name = "SupportedNamespace", required = true)
    protected List<SupportedNamespace> supportedNamespace;
    @XmlElement(name = "Exemption", required = true)
    protected List<ImportExemption> exemption;
    @XmlElement(name = "Adapter")
    protected List<ImportAdapter> adapter;
    @XmlElement(name = "ExtensionPackage")
    protected List<ExtensionPackage> extensionPackage;

    /**
     * Gets the value of the supportedNamespace property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedNamespace property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportedNamespace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupportedNamespace }
     * 
     * 
     */
    public List<SupportedNamespace> getSupportedNamespace() {
        if (supportedNamespace == null) {
            supportedNamespace = new ArrayList<SupportedNamespace>();
        }
        return this.supportedNamespace;
    }

    /**
     * Gets the value of the exemption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exemption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExemption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportExemption }
     * 
     * 
     */
    public List<ImportExemption> getExemption() {
        if (exemption == null) {
            exemption = new ArrayList<ImportExemption>();
        }
        return this.exemption;
    }

    /**
     * Gets the value of the adapter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adapter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdapter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportAdapter }
     * 
     * 
     */
    public List<ImportAdapter> getAdapter() {
        if (adapter == null) {
            adapter = new ArrayList<ImportAdapter>();
        }
        return this.adapter;
    }

    /**
     * Gets the value of the extensionPackage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extensionPackage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtensionPackage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtensionPackage }
     * 
     * 
     */
    public List<ExtensionPackage> getExtensionPackage() {
        if (extensionPackage == null) {
            extensionPackage = new ArrayList<ExtensionPackage>();
        }
        return this.extensionPackage;
    }

}
