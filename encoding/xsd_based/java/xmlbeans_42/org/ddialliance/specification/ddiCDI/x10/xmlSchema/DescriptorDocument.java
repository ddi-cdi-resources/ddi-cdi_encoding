/*
 * An XML document type.
 * Localname: Descriptor
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one Descriptor(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface DescriptorDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "descriptor119ddoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "Descriptor" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor getDescriptor();

    /**
     * Sets the "Descriptor" element
     */
    void setDescriptor(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor descriptor);

    /**
     * Appends and returns a new empty "Descriptor" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor addNewDescriptor();
}
