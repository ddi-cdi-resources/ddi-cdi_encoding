/*
 * An XML document type.
 * Localname: IndividualName
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.IndividualNameDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one IndividualName(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface IndividualNameDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.IndividualNameDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "individualname10f2doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "IndividualName" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.IndividualName getIndividualName();

    /**
     * Sets the "IndividualName" element
     */
    void setIndividualName(org.ddialliance.specification.ddiCDI.x10.xmlSchema.IndividualName individualName);

    /**
     * Appends and returns a new empty "IndividualName" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.IndividualName addNewIndividualName();
}
