/*
 * An XML document type.
 * Localname: ReferenceValue
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValueDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one ReferenceValue(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface ReferenceValueDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValueDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "referencevaluefe14doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ReferenceValue" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValue getReferenceValue();

    /**
     * Sets the "ReferenceValue" element
     */
    void setReferenceValue(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValue referenceValue);

    /**
     * Appends and returns a new empty "ReferenceValue" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValue addNewReferenceValue();
}
