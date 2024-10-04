/*
 * An XML document type.
 * Localname: AgentListing
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListingDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one AgentListing(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class AgentListingDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListingDocument {
    private static final long serialVersionUID = 1L;

    public AgentListingDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "AgentListing"),
    };


    /**
     * Gets the "AgentListing" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing getAgentListing() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "AgentListing" element
     */
    @Override
    public void setAgentListing(org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing agentListing) {
        generatedSetterHelperImpl(agentListing, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "AgentListing" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing addNewAgentListing() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
