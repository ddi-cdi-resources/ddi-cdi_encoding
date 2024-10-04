/*
 * An XML document type.
 * Localname: AccessInformation
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.AccessInformationDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one AccessInformation(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface AccessInformationDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.AccessInformationDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "accessinformationaa04doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "AccessInformation" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AccessInformation getAccessInformation();

    /**
     * Sets the "AccessInformation" element
     */
    void setAccessInformation(org.ddialliance.specification.ddiCDI.x10.xmlSchema.AccessInformation accessInformation);

    /**
     * Appends and returns a new empty "AccessInformation" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AccessInformation addNewAccessInformation();
}
