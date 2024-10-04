/*
 * An XML document type.
 * Localname: ReferenceValueDomain
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValueDomainDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one ReferenceValueDomain(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface ReferenceValueDomainDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValueDomainDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "referencevaluedomain85b8doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ReferenceValueDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValueDomain getReferenceValueDomain();

    /**
     * Sets the "ReferenceValueDomain" element
     */
    void setReferenceValueDomain(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValueDomain referenceValueDomain);

    /**
     * Appends and returns a new empty "ReferenceValueDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValueDomain addNewReferenceValueDomain();
}
