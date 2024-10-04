/*
 * An XML document type.
 * Localname: DataStructure
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructureDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one DataStructure(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface DataStructureDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructureDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "datastructurec1c5doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "DataStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructure getDataStructure();

    /**
     * Sets the "DataStructure" element
     */
    void setDataStructure(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructure dataStructure);

    /**
     * Appends and returns a new empty "DataStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructure addNewDataStructure();
}
