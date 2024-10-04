/*
 * An XML document type.
 * Localname: WideDataStructure
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideDataStructureDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one WideDataStructure(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface WideDataStructureDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideDataStructureDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "widedatastructure2cb2doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "WideDataStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideDataStructure getWideDataStructure();

    /**
     * Sets the "WideDataStructure" element
     */
    void setWideDataStructure(org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideDataStructure wideDataStructure);

    /**
     * Appends and returns a new empty "WideDataStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideDataStructure addNewWideDataStructure();
}
