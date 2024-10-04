/*
 * An XML document type.
 * Localname: Parameter
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ParameterDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one Parameter(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface ParameterDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ParameterDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "parameter5405doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "Parameter" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Parameter getParameter();

    /**
     * Sets the "Parameter" element
     */
    void setParameter(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Parameter parameter);

    /**
     * Appends and returns a new empty "Parameter" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Parameter addNewParameter();
}
