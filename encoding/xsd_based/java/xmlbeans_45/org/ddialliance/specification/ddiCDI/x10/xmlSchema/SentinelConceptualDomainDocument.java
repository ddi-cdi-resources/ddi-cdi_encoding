/*
 * An XML document type.
 * Localname: SentinelConceptualDomain
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelConceptualDomainDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one SentinelConceptualDomain(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface SentinelConceptualDomainDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelConceptualDomainDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "sentinelconceptualdomain620edoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "SentinelConceptualDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelConceptualDomain getSentinelConceptualDomain();

    /**
     * Sets the "SentinelConceptualDomain" element
     */
    void setSentinelConceptualDomain(org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelConceptualDomain sentinelConceptualDomain);

    /**
     * Appends and returns a new empty "SentinelConceptualDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelConceptualDomain addNewSentinelConceptualDomain();
}
