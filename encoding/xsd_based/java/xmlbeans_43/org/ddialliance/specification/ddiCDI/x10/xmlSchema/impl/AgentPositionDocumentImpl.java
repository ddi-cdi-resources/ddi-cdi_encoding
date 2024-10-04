/*
 * An XML document type.
 * Localname: AgentPosition
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentPositionDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one AgentPosition(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class AgentPositionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentPositionDocument {
    private static final long serialVersionUID = 1L;

    public AgentPositionDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "AgentPosition"),
    };


    /**
     * Gets the "AgentPosition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentPosition getAgentPosition() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentPosition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentPosition)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "AgentPosition" element
     */
    @Override
    public void setAgentPosition(org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentPosition agentPosition) {
        generatedSetterHelperImpl(agentPosition, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "AgentPosition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentPosition addNewAgentPosition() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentPosition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentPosition)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
