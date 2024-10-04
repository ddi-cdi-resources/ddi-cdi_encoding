/*
 * An XML document type.
 * Localname: RationaleDefinition
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.RationaleDefinitionDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one RationaleDefinition(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface RationaleDefinitionDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.RationaleDefinitionDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "rationaledefinitionb9c6doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "RationaleDefinition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.RationaleDefinition getRationaleDefinition();

    /**
     * Sets the "RationaleDefinition" element
     */
    void setRationaleDefinition(org.ddialliance.specification.ddiCDI.x10.xmlSchema.RationaleDefinition rationaleDefinition);

    /**
     * Appends and returns a new empty "RationaleDefinition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.RationaleDefinition addNewRationaleDefinition();
}
