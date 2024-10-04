/*
 * An XML document type.
 * Localname: DescriptorVariable
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorVariableDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one DescriptorVariable(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface DescriptorVariableDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorVariableDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "descriptorvariablece39doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "DescriptorVariable" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorVariable getDescriptorVariable();

    /**
     * Sets the "DescriptorVariable" element
     */
    void setDescriptorVariable(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorVariable descriptorVariable);

    /**
     * Appends and returns a new empty "DescriptorVariable" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorVariable addNewDescriptorVariable();
}
