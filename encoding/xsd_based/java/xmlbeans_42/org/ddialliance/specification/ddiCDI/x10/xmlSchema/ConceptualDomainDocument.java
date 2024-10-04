/*
 * An XML document type.
 * Localname: ConceptualDomain
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualDomainDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one ConceptualDomain(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface ConceptualDomainDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualDomainDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "conceptualdomainc4cadoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ConceptualDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualDomain getConceptualDomain();

    /**
     * Sets the "ConceptualDomain" element
     */
    void setConceptualDomain(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualDomain conceptualDomain);

    /**
     * Appends and returns a new empty "ConceptualDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualDomain addNewConceptualDomain();
}
