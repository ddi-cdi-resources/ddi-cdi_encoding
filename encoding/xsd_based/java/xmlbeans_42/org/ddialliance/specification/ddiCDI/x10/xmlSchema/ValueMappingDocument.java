/*
 * An XML document type.
 * Localname: ValueMapping
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one ValueMapping(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface ValueMappingDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "valuemapping110bdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ValueMapping" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMapping getValueMapping();

    /**
     * Sets the "ValueMapping" element
     */
    void setValueMapping(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMapping valueMapping);

    /**
     * Appends and returns a new empty "ValueMapping" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMapping addNewValueMapping();
}
