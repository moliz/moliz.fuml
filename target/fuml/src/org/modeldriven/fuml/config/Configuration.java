//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-520 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.02.29 at 03:31:29 PM EST 
//


package org.modeldriven.fuml.config;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Configuration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Configuration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ImportConfiguration" type="{http://www.modeldriven.org/fuml/config}ImportConfiguration"/>
 *         &lt;element name="ValidationConfiguration" type="{http://www.modeldriven.org/fuml/config}ValidationConfiguration"/>
 *         &lt;element name="MappingConfiguration" type="{http://www.modeldriven.org/fuml/config}MappingConfiguration"/>
 *         &lt;element name="LibraryConfiguration" type="{http://www.modeldriven.org/fuml/config}LibraryConfiguration"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Configuration", propOrder = {
    "importConfiguration",
    "validationConfiguration",
    "mappingConfiguration",
    "libraryConfiguration"
})
public class Configuration {

    @XmlElement(name = "ImportConfiguration", required = true)
    protected ImportConfiguration importConfiguration;
    @XmlElement(name = "ValidationConfiguration", required = true)
    protected ValidationConfiguration validationConfiguration;
    @XmlElement(name = "MappingConfiguration", required = true)
    protected MappingConfiguration mappingConfiguration;
    @XmlElement(name = "LibraryConfiguration", required = true)
    protected LibraryConfiguration libraryConfiguration;

    /**
     * Gets the value of the importConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link ImportConfiguration }
     *     
     */
    public ImportConfiguration getImportConfiguration() {
        return importConfiguration;
    }

    /**
     * Sets the value of the importConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportConfiguration }
     *     
     */
    public void setImportConfiguration(ImportConfiguration value) {
        this.importConfiguration = value;
    }

    /**
     * Gets the value of the validationConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link ValidationConfiguration }
     *     
     */
    public ValidationConfiguration getValidationConfiguration() {
        return validationConfiguration;
    }

    /**
     * Sets the value of the validationConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationConfiguration }
     *     
     */
    public void setValidationConfiguration(ValidationConfiguration value) {
        this.validationConfiguration = value;
    }

    /**
     * Gets the value of the mappingConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link MappingConfiguration }
     *     
     */
    public MappingConfiguration getMappingConfiguration() {
        return mappingConfiguration;
    }

    /**
     * Sets the value of the mappingConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link MappingConfiguration }
     *     
     */
    public void setMappingConfiguration(MappingConfiguration value) {
        this.mappingConfiguration = value;
    }

    /**
     * Gets the value of the libraryConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link LibraryConfiguration }
     *     
     */
    public LibraryConfiguration getLibraryConfiguration() {
        return libraryConfiguration;
    }

    /**
     * Sets the value of the libraryConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link LibraryConfiguration }
     *     
     */
    public void setLibraryConfiguration(LibraryConfiguration value) {
        this.libraryConfiguration = value;
    }

}
