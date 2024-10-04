/*
 * An XML document type.
 * Localname: AgentInRole
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRoleDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one AgentInRole(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface AgentInRoleDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRoleDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "agentinroled4bcdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "AgentInRole" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole getAgentInRole();

    /**
     * Sets the "AgentInRole" element
     */
    void setAgentInRole(org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole agentInRole);

    /**
     * Appends and returns a new empty "AgentInRole" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole addNewAgentInRole();
}
