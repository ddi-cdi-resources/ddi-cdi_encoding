/*
 * An XML document type.
 * Localname: WideKey
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideKeyDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one WideKey(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface WideKeyDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideKeyDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "widekeyaa28doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "WideKey" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideKey getWideKey();

    /**
     * Sets the "WideKey" element
     */
    void setWideKey(org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideKey wideKey);

    /**
     * Appends and returns a new empty "WideKey" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideKey addNewWideKey();
}
