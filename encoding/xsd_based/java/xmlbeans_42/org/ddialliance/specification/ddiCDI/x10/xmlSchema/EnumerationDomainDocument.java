/*
 * An XML document type.
 * Localname: EnumerationDomain
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomainDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one EnumerationDomain(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface EnumerationDomainDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomainDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "enumerationdomainc447doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "EnumerationDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain getEnumerationDomain();

    /**
     * Sets the "EnumerationDomain" element
     */
    void setEnumerationDomain(org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain enumerationDomain);

    /**
     * Appends and returns a new empty "EnumerationDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain addNewEnumerationDomain();
}
