/*
 * An XML document type.
 * Localname: AgentRelationship
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentRelationshipDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one AgentRelationship(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface AgentRelationshipDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentRelationshipDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "agentrelationshipf139doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "AgentRelationship" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentRelationship getAgentRelationship();

    /**
     * Sets the "AgentRelationship" element
     */
    void setAgentRelationship(org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentRelationship agentRelationship);

    /**
     * Appends and returns a new empty "AgentRelationship" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentRelationship addNewAgentRelationship();
}
