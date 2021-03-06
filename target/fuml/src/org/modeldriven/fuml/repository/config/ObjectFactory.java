//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-520 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.03.03 at 06:40:03 PM EST 
//


package org.modeldriven.fuml.repository.config;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.modeldriven.fuml.repository.config package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Artifact_QNAME = new QName("http://www.modeldriven.org/fuml/repository/config", "Artifact");
    private final static QName _RegisteredPackage_QNAME = new QName("http://www.modeldriven.org/fuml/repository/config", "RegisteredPackage");
    private final static QName _IgnoredPackage_QNAME = new QName("http://www.modeldriven.org/fuml/repository/config", "IgnoredPackage");
    private final static QName _IgnoredClass_QNAME = new QName("http://www.modeldriven.org/fuml/repository/config", "IgnoredClass");
    private final static QName _RepositoryConfig_QNAME = new QName("http://www.modeldriven.org/fuml/repository/config", "RepositoryConfig");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.modeldriven.fuml.repository.config
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IgnoredPackage }
     * 
     */
    public IgnoredPackage createIgnoredPackage() {
        return new IgnoredPackage();
    }

    /**
     * Create an instance of {@link Artifact }
     * 
     */
    public Artifact createArtifact() {
        return new Artifact();
    }

    /**
     * Create an instance of {@link RegisteredPackage }
     * 
     */
    public RegisteredPackage createRegisteredPackage() {
        return new RegisteredPackage();
    }

    /**
     * Create an instance of {@link RepositoryConfig }
     * 
     */
    public RepositoryConfig createRepositoryConfig() {
        return new RepositoryConfig();
    }

    /**
     * Create an instance of {@link IgnoredClass }
     * 
     */
    public IgnoredClass createIgnoredClass() {
        return new IgnoredClass();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Artifact }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modeldriven.org/fuml/repository/config", name = "Artifact")
    public JAXBElement<Artifact> createArtifact(Artifact value) {
        return new JAXBElement<Artifact>(_Artifact_QNAME, Artifact.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisteredPackage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modeldriven.org/fuml/repository/config", name = "RegisteredPackage")
    public JAXBElement<RegisteredPackage> createRegisteredPackage(RegisteredPackage value) {
        return new JAXBElement<RegisteredPackage>(_RegisteredPackage_QNAME, RegisteredPackage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IgnoredPackage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modeldriven.org/fuml/repository/config", name = "IgnoredPackage")
    public JAXBElement<IgnoredPackage> createIgnoredPackage(IgnoredPackage value) {
        return new JAXBElement<IgnoredPackage>(_IgnoredPackage_QNAME, IgnoredPackage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IgnoredClass }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modeldriven.org/fuml/repository/config", name = "IgnoredClass")
    public JAXBElement<IgnoredClass> createIgnoredClass(IgnoredClass value) {
        return new JAXBElement<IgnoredClass>(_IgnoredClass_QNAME, IgnoredClass.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RepositoryConfig }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modeldriven.org/fuml/repository/config", name = "RepositoryConfig")
    public JAXBElement<RepositoryConfig> createRepositoryConfig(RepositoryConfig value) {
        return new JAXBElement<RepositoryConfig>(_RepositoryConfig_QNAME, RepositoryConfig.class, null, value);
    }

}
