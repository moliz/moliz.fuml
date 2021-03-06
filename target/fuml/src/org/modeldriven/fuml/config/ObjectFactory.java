//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-520 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.03.03 at 06:40:01 PM EST 
//


package org.modeldriven.fuml.config;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.modeldriven.fuml.config package. 
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

    private final static QName _ImportExemption_QNAME = new QName("http://www.modeldriven.org/fuml/config", "ImportExemption");
    private final static QName _LibraryImport_QNAME = new QName("http://www.modeldriven.org/fuml/config", "LibraryImport");
    private final static QName _ImportAdapter_QNAME = new QName("http://www.modeldriven.org/fuml/config", "ImportAdapter");
    private final static QName _LibraryConfiguration_QNAME = new QName("http://www.modeldriven.org/fuml/config", "LibraryConfiguration");
    private final static QName _ExtensionPackage_QNAME = new QName("http://www.modeldriven.org/fuml/config", "ExtensionPackage");
    private final static QName _Configuration_QNAME = new QName("http://www.modeldriven.org/fuml/config", "Configuration");
    private final static QName _BehaviorExecutionMapping_QNAME = new QName("http://www.modeldriven.org/fuml/config", "BehaviorExecutionMapping");
    private final static QName _ReferenceMapping_QNAME = new QName("http://www.modeldriven.org/fuml/config", "ReferenceMapping");
    private final static QName _ValidationConfiguration_QNAME = new QName("http://www.modeldriven.org/fuml/config", "ValidationConfiguration");
    private final static QName _SupportedNamespace_QNAME = new QName("http://www.modeldriven.org/fuml/config", "SupportedNamespace");
    private final static QName _MappingConfiguration_QNAME = new QName("http://www.modeldriven.org/fuml/config", "MappingConfiguration");
    private final static QName _ImportConfiguration_QNAME = new QName("http://www.modeldriven.org/fuml/config", "ImportConfiguration");
    private final static QName _ValidationExemption_QNAME = new QName("http://www.modeldriven.org/fuml/config", "ValidationExemption");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.modeldriven.fuml.config
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SupportedNamespace }
     * 
     */
    public SupportedNamespace createSupportedNamespace() {
        return new SupportedNamespace();
    }

    /**
     * Create an instance of {@link ImportExemption }
     * 
     */
    public ImportExemption createImportExemption() {
        return new ImportExemption();
    }

    /**
     * Create an instance of {@link BehaviorExecutionMapping }
     * 
     */
    public BehaviorExecutionMapping createBehaviorExecutionMapping() {
        return new BehaviorExecutionMapping();
    }

    /**
     * Create an instance of {@link MappingConfiguration }
     * 
     */
    public MappingConfiguration createMappingConfiguration() {
        return new MappingConfiguration();
    }

    /**
     * Create an instance of {@link Configuration }
     * 
     */
    public Configuration createConfiguration() {
        return new Configuration();
    }

    /**
     * Create an instance of {@link ImportConfiguration }
     * 
     */
    public ImportConfiguration createImportConfiguration() {
        return new ImportConfiguration();
    }

    /**
     * Create an instance of {@link ValidationExemption }
     * 
     */
    public ValidationExemption createValidationExemption() {
        return new ValidationExemption();
    }

    /**
     * Create an instance of {@link ReferenceMapping }
     * 
     */
    public ReferenceMapping createReferenceMapping() {
        return new ReferenceMapping();
    }

    /**
     * Create an instance of {@link ImportAdapter }
     * 
     */
    public ImportAdapter createImportAdapter() {
        return new ImportAdapter();
    }

    /**
     * Create an instance of {@link ExtensionPackage }
     * 
     */
    public ExtensionPackage createExtensionPackage() {
        return new ExtensionPackage();
    }

    /**
     * Create an instance of {@link ValidationConfiguration }
     * 
     */
    public ValidationConfiguration createValidationConfiguration() {
        return new ValidationConfiguration();
    }

    /**
     * Create an instance of {@link LibraryConfiguration }
     * 
     */
    public LibraryConfiguration createLibraryConfiguration() {
        return new LibraryConfiguration();
    }

    /**
     * Create an instance of {@link LibraryImport }
     * 
     */
    public LibraryImport createLibraryImport() {
        return new LibraryImport();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportExemption }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modeldriven.org/fuml/config", name = "ImportExemption")
    public JAXBElement<ImportExemption> createImportExemption(ImportExemption value) {
        return new JAXBElement<ImportExemption>(_ImportExemption_QNAME, ImportExemption.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LibraryImport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modeldriven.org/fuml/config", name = "LibraryImport")
    public JAXBElement<LibraryImport> createLibraryImport(LibraryImport value) {
        return new JAXBElement<LibraryImport>(_LibraryImport_QNAME, LibraryImport.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportAdapter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modeldriven.org/fuml/config", name = "ImportAdapter")
    public JAXBElement<ImportAdapter> createImportAdapter(ImportAdapter value) {
        return new JAXBElement<ImportAdapter>(_ImportAdapter_QNAME, ImportAdapter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LibraryConfiguration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modeldriven.org/fuml/config", name = "LibraryConfiguration")
    public JAXBElement<LibraryConfiguration> createLibraryConfiguration(LibraryConfiguration value) {
        return new JAXBElement<LibraryConfiguration>(_LibraryConfiguration_QNAME, LibraryConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtensionPackage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modeldriven.org/fuml/config", name = "ExtensionPackage")
    public JAXBElement<ExtensionPackage> createExtensionPackage(ExtensionPackage value) {
        return new JAXBElement<ExtensionPackage>(_ExtensionPackage_QNAME, ExtensionPackage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Configuration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modeldriven.org/fuml/config", name = "Configuration")
    public JAXBElement<Configuration> createConfiguration(Configuration value) {
        return new JAXBElement<Configuration>(_Configuration_QNAME, Configuration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BehaviorExecutionMapping }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modeldriven.org/fuml/config", name = "BehaviorExecutionMapping")
    public JAXBElement<BehaviorExecutionMapping> createBehaviorExecutionMapping(BehaviorExecutionMapping value) {
        return new JAXBElement<BehaviorExecutionMapping>(_BehaviorExecutionMapping_QNAME, BehaviorExecutionMapping.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReferenceMapping }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modeldriven.org/fuml/config", name = "ReferenceMapping")
    public JAXBElement<ReferenceMapping> createReferenceMapping(ReferenceMapping value) {
        return new JAXBElement<ReferenceMapping>(_ReferenceMapping_QNAME, ReferenceMapping.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidationConfiguration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modeldriven.org/fuml/config", name = "ValidationConfiguration")
    public JAXBElement<ValidationConfiguration> createValidationConfiguration(ValidationConfiguration value) {
        return new JAXBElement<ValidationConfiguration>(_ValidationConfiguration_QNAME, ValidationConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupportedNamespace }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modeldriven.org/fuml/config", name = "SupportedNamespace")
    public JAXBElement<SupportedNamespace> createSupportedNamespace(SupportedNamespace value) {
        return new JAXBElement<SupportedNamespace>(_SupportedNamespace_QNAME, SupportedNamespace.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MappingConfiguration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modeldriven.org/fuml/config", name = "MappingConfiguration")
    public JAXBElement<MappingConfiguration> createMappingConfiguration(MappingConfiguration value) {
        return new JAXBElement<MappingConfiguration>(_MappingConfiguration_QNAME, MappingConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportConfiguration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modeldriven.org/fuml/config", name = "ImportConfiguration")
    public JAXBElement<ImportConfiguration> createImportConfiguration(ImportConfiguration value) {
        return new JAXBElement<ImportConfiguration>(_ImportConfiguration_QNAME, ImportConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidationExemption }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.modeldriven.org/fuml/config", name = "ValidationExemption")
    public JAXBElement<ValidationExemption> createValidationExemption(ValidationExemption value) {
        return new JAXBElement<ValidationExemption>(_ValidationExemption_QNAME, ValidationExemption.class, null, value);
    }

}
