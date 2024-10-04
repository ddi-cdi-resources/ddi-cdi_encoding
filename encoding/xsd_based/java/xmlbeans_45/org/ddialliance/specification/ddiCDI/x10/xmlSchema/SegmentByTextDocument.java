/*
 * An XML document type.
 * Localname: SegmentByText
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.SegmentByTextDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one SegmentByText(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface SegmentByTextDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.SegmentByTextDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "segmentbytext2713doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "SegmentByText" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.SegmentByText getSegmentByText();

    /**
     * Sets the "SegmentByText" element
     */
    void setSegmentByText(org.ddialliance.specification.ddiCDI.x10.xmlSchema.SegmentByText segmentByText);

    /**
     * Appends and returns a new empty "SegmentByText" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.SegmentByText addNewSegmentByText();
}
