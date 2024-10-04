/*
 * An XML document type.
 * Localname: ProvenanceInformation
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProvenanceInformationDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one ProvenanceInformation(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface ProvenanceInformationDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProvenanceInformationDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "provenanceinformation0b27doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ProvenanceInformation" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProvenanceInformation getProvenanceInformation();

    /**
     * Sets the "ProvenanceInformation" element
     */
    void setProvenanceInformation(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProvenanceInformation provenanceInformation);

    /**
     * Appends and returns a new empty "ProvenanceInformation" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProvenanceInformation addNewProvenanceInformation();
}
