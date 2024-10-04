/*
 * An XML document type.
 * Localname: AgentPosition
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentPositionDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one AgentPosition(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface AgentPositionDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentPositionDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "agentposition22aadoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "AgentPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentPosition getAgentPosition();

    /**
     * Sets the "AgentPosition" element
     */
    void setAgentPosition(org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentPosition agentPosition);

    /**
     * Appends and returns a new empty "AgentPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentPosition addNewAgentPosition();
}
