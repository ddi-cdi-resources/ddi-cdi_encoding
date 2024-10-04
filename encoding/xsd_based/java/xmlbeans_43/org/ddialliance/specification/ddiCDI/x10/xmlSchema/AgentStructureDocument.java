/*
 * An XML document type.
 * Localname: AgentStructure
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentStructureDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one AgentStructure(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface AgentStructureDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentStructureDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "agentstructuree91cdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "AgentStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentStructure getAgentStructure();

    /**
     * Sets the "AgentStructure" element
     */
    void setAgentStructure(org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentStructure agentStructure);

    /**
     * Appends and returns a new empty "AgentStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentStructure addNewAgentStructure();
}
