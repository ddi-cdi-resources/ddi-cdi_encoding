/*
 * An XML document type.
 * Localname: OrganizationName
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.OrganizationNameDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one OrganizationName(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface OrganizationNameDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.OrganizationNameDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "organizationname994cdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "OrganizationName" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.OrganizationName getOrganizationName();

    /**
     * Sets the "OrganizationName" element
     */
    void setOrganizationName(org.ddialliance.specification.ddiCDI.x10.xmlSchema.OrganizationName organizationName);

    /**
     * Appends and returns a new empty "OrganizationName" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.OrganizationName addNewOrganizationName();
}
