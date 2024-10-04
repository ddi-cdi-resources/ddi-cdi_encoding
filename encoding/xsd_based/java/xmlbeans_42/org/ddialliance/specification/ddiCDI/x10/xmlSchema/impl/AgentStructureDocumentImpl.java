/*
 * An XML document type.
 * Localname: AgentStructure
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentStructureDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one AgentStructure(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class AgentStructureDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentStructureDocument {
    private static final long serialVersionUID = 1L;

    public AgentStructureDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "AgentStructure"),
    };


    /**
     * Gets the "AgentStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentStructure getAgentStructure() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentStructure)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "AgentStructure" element
     */
    @Override
    public void setAgentStructure(org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentStructure agentStructure) {
        generatedSetterHelperImpl(agentStructure, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "AgentStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentStructure addNewAgentStructure() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentStructure)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
