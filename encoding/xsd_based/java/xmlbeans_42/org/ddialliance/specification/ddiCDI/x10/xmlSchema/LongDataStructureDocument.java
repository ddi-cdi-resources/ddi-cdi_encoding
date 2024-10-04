/*
 * An XML document type.
 * Localname: LongDataStructure
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongDataStructureDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one LongDataStructure(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface LongDataStructureDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongDataStructureDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "longdatastructure6b29doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "LongDataStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongDataStructure getLongDataStructure();

    /**
     * Sets the "LongDataStructure" element
     */
    void setLongDataStructure(org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongDataStructure longDataStructure);

    /**
     * Appends and returns a new empty "LongDataStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongDataStructure addNewLongDataStructure();
}
