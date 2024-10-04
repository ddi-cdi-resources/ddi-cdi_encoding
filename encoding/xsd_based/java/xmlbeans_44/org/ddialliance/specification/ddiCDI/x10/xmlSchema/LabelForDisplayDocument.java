/*
 * An XML document type.
 * Localname: LabelForDisplay
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplayDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one LabelForDisplay(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface LabelForDisplayDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplayDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "labelfordisplayaae9doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "LabelForDisplay" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay getLabelForDisplay();

    /**
     * Sets the "LabelForDisplay" element
     */
    void setLabelForDisplay(org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay labelForDisplay);

    /**
     * Appends and returns a new empty "LabelForDisplay" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay addNewLabelForDisplay();
}
