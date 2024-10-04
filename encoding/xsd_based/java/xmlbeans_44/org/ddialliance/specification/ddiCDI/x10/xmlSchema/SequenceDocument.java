/*
 * An XML document type.
 * Localname: Sequence
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.SequenceDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one Sequence(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface SequenceDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.SequenceDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "sequencec12fdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "Sequence" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Sequence getSequence();

    /**
     * Sets the "Sequence" element
     */
    void setSequence(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Sequence sequence);

    /**
     * Appends and returns a new empty "Sequence" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Sequence addNewSequence();
}
