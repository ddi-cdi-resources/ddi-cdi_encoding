/*
 * An XML document type.
 * Localname: Wrapper
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.WrapperDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one Wrapper(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface WrapperDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.WrapperDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "wrapperefafdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "Wrapper" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Wrapper getWrapper();

    /**
     * Sets the "Wrapper" element
     */
    void setWrapper(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Wrapper wrapper);

    /**
     * Appends and returns a new empty "Wrapper" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Wrapper addNewWrapper();
}
