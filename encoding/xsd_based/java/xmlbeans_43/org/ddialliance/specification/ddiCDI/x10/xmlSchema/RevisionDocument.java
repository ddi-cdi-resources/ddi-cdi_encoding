/*
 * An XML document type.
 * Localname: Revision
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.RevisionDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one Revision(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface RevisionDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.RevisionDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "revision4e49doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "Revision" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Revision getRevision();

    /**
     * Sets the "Revision" element
     */
    void setRevision(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Revision revision);

    /**
     * Appends and returns a new empty "Revision" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Revision addNewRevision();
}
