/*
 * An XML document type.
 * Localname: TextPositionSelector
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.TextPositionSelectorDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one TextPositionSelector(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface TextPositionSelectorDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.TextPositionSelectorDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "textpositionselector8d63doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "TextPositionSelector" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.TextPositionSelector getTextPositionSelector();

    /**
     * Sets the "TextPositionSelector" element
     */
    void setTextPositionSelector(org.ddialliance.specification.ddiCDI.x10.xmlSchema.TextPositionSelector textPositionSelector);

    /**
     * Appends and returns a new empty "TextPositionSelector" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.TextPositionSelector addNewTextPositionSelector();
}
