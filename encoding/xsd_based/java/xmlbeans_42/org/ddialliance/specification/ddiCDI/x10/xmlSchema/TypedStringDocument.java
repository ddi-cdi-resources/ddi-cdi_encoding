/*
 * An XML document type.
 * Localname: TypedString
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.TypedStringDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one TypedString(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface TypedStringDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.TypedStringDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "typedstring20b7doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "TypedString" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.TypedString getTypedString();

    /**
     * Sets the "TypedString" element
     */
    void setTypedString(org.ddialliance.specification.ddiCDI.x10.xmlSchema.TypedString typedString);

    /**
     * Appends and returns a new empty "TypedString" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.TypedString addNewTypedString();
}
