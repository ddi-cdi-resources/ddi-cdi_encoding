/*
 * An XML document type.
 * Localname: CorrespondenceTable
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTableDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one CorrespondenceTable(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface CorrespondenceTableDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTableDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "correspondencetable4570doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "CorrespondenceTable" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable getCorrespondenceTable();

    /**
     * Sets the "CorrespondenceTable" element
     */
    void setCorrespondenceTable(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable correspondenceTable);

    /**
     * Appends and returns a new empty "CorrespondenceTable" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable addNewCorrespondenceTable();
}
