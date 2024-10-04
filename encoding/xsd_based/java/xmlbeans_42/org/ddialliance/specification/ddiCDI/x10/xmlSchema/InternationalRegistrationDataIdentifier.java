/*
 * XML Type:  InternationalRegistrationDataIdentifier
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalRegistrationDataIdentifier
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML InternationalRegistrationDataIdentifier(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface InternationalRegistrationDataIdentifier extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalRegistrationDataIdentifier> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "internationalregistrationdataidentifier38e6type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "dataIdentifier" element
     */
    java.lang.String getDataIdentifier();

    /**
     * Gets (as xml) the "dataIdentifier" element
     */
    org.apache.xmlbeans.XmlString xgetDataIdentifier();

    /**
     * Sets the "dataIdentifier" element
     */
    void setDataIdentifier(java.lang.String dataIdentifier);

    /**
     * Sets (as xml) the "dataIdentifier" element
     */
    void xsetDataIdentifier(org.apache.xmlbeans.XmlString dataIdentifier);

    /**
     * Gets the "registrationAuthorityIdentifier" element
     */
    java.lang.String getRegistrationAuthorityIdentifier();

    /**
     * Gets (as xml) the "registrationAuthorityIdentifier" element
     */
    org.apache.xmlbeans.XmlString xgetRegistrationAuthorityIdentifier();

    /**
     * Sets the "registrationAuthorityIdentifier" element
     */
    void setRegistrationAuthorityIdentifier(java.lang.String registrationAuthorityIdentifier);

    /**
     * Sets (as xml) the "registrationAuthorityIdentifier" element
     */
    void xsetRegistrationAuthorityIdentifier(org.apache.xmlbeans.XmlString registrationAuthorityIdentifier);

    /**
     * Gets the "versionIdentifier" element
     */
    java.lang.String getVersionIdentifier();

    /**
     * Gets (as xml) the "versionIdentifier" element
     */
    org.apache.xmlbeans.XmlString xgetVersionIdentifier();

    /**
     * Sets the "versionIdentifier" element
     */
    void setVersionIdentifier(java.lang.String versionIdentifier);

    /**
     * Sets (as xml) the "versionIdentifier" element
     */
    void xsetVersionIdentifier(org.apache.xmlbeans.XmlString versionIdentifier);
}
