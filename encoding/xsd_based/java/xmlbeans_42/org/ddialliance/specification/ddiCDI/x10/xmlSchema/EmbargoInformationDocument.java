/*
 * An XML document type.
 * Localname: EmbargoInformation
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.EmbargoInformationDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one EmbargoInformation(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface EmbargoInformationDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.EmbargoInformationDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "embargoinformation50c7doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "EmbargoInformation" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.EmbargoInformation getEmbargoInformation();

    /**
     * Sets the "EmbargoInformation" element
     */
    void setEmbargoInformation(org.ddialliance.specification.ddiCDI.x10.xmlSchema.EmbargoInformation embargoInformation);

    /**
     * Appends and returns a new empty "EmbargoInformation" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.EmbargoInformation addNewEmbargoInformation();
}
