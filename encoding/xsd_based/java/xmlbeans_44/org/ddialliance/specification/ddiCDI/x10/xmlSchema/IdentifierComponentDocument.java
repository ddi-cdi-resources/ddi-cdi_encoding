/*
 * An XML document type.
 * Localname: IdentifierComponent
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.IdentifierComponentDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one IdentifierComponent(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface IdentifierComponentDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.IdentifierComponentDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "identifiercomponentb770doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "IdentifierComponent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.IdentifierComponent getIdentifierComponent();

    /**
     * Sets the "IdentifierComponent" element
     */
    void setIdentifierComponent(org.ddialliance.specification.ddiCDI.x10.xmlSchema.IdentifierComponent identifierComponent);

    /**
     * Appends and returns a new empty "IdentifierComponent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.IdentifierComponent addNewIdentifierComponent();
}
