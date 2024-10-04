/*
 * An XML document type.
 * Localname: AgentListing
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListingDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one AgentListing(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface AgentListingDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListingDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "agentlistinge3addoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "AgentListing" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing getAgentListing();

    /**
     * Sets the "AgentListing" element
     */
    void setAgentListing(org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing agentListing);

    /**
     * Appends and returns a new empty "AgentListing" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing addNewAgentListing();
}
