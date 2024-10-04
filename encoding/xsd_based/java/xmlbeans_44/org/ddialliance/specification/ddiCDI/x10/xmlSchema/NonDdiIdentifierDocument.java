/*
 * An XML document type.
 * Localname: NonDdiIdentifier
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDdiIdentifierDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one NonDdiIdentifier(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface NonDdiIdentifierDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDdiIdentifierDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "nonddiidentifierca13doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "NonDdiIdentifier" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDdiIdentifier getNonDdiIdentifier();

    /**
     * Sets the "NonDdiIdentifier" element
     */
    void setNonDdiIdentifier(org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDdiIdentifier nonDdiIdentifier);

    /**
     * Appends and returns a new empty "NonDdiIdentifier" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDdiIdentifier addNewNonDdiIdentifier();
}
