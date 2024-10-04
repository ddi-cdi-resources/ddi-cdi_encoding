/*
 * An XML document type.
 * Localname: AgentInRole
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRoleDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one AgentInRole(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class AgentInRoleDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRoleDocument {
    private static final long serialVersionUID = 1L;

    public AgentInRoleDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "AgentInRole"),
    };


    /**
     * Gets the "AgentInRole" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole getAgentInRole() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "AgentInRole" element
     */
    @Override
    public void setAgentInRole(org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole agentInRole) {
        generatedSetterHelperImpl(agentInRole, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "AgentInRole" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole addNewAgentInRole() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
