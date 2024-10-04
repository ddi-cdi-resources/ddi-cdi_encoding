/*
 * An XML document type.
 * Localname: SequencePosition
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.SequencePositionDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one SequencePosition(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface SequencePositionDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.SequencePositionDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "sequenceposition08f8doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "SequencePosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.SequencePosition getSequencePosition();

    /**
     * Sets the "SequencePosition" element
     */
    void setSequencePosition(org.ddialliance.specification.ddiCDI.x10.xmlSchema.SequencePosition sequencePosition);

    /**
     * Appends and returns a new empty "SequencePosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.SequencePosition addNewSequencePosition();
}
