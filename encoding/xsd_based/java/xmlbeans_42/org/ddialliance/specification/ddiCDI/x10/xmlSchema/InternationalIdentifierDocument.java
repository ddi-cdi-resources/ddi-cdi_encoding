/*
 * An XML document type.
 * Localname: InternationalIdentifier
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalIdentifierDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one InternationalIdentifier(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface InternationalIdentifierDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalIdentifierDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "internationalidentifierbcf3doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "InternationalIdentifier" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalIdentifier getInternationalIdentifier();

    /**
     * Sets the "InternationalIdentifier" element
     */
    void setInternationalIdentifier(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalIdentifier internationalIdentifier);

    /**
     * Appends and returns a new empty "InternationalIdentifier" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalIdentifier addNewInternationalIdentifier();
}
