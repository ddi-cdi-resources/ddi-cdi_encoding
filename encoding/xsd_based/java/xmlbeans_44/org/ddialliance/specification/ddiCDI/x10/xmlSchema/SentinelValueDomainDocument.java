/*
 * An XML document type.
 * Localname: SentinelValueDomain
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomainDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one SentinelValueDomain(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface SentinelValueDomainDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomainDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "sentinelvaluedomain526ddoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "SentinelValueDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain getSentinelValueDomain();

    /**
     * Sets the "SentinelValueDomain" element
     */
    void setSentinelValueDomain(org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain sentinelValueDomain);

    /**
     * Appends and returns a new empty "SentinelValueDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain addNewSentinelValueDomain();
}
