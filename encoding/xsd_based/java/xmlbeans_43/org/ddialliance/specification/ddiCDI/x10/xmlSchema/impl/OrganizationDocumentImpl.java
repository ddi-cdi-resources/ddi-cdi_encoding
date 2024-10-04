/*
 * An XML document type.
 * Localname: Organization
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.OrganizationDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one Organization(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class OrganizationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.OrganizationDocument {
    private static final long serialVersionUID = 1L;

    public OrganizationDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "Organization"),
    };


    /**
     * Gets the "Organization" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Organization getOrganization() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Organization target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Organization)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "Organization" element
     */
    @Override
    public void setOrganization(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Organization organization) {
        generatedSetterHelperImpl(organization, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Organization" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Organization addNewOrganization() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Organization target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Organization)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
