/*
 * An XML document type.
 * Localname: OrganizationName
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.OrganizationNameDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one OrganizationName(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class OrganizationNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.OrganizationNameDocument {
    private static final long serialVersionUID = 1L;

    public OrganizationNameDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "OrganizationName"),
    };


    /**
     * Gets the "OrganizationName" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.OrganizationName getOrganizationName() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.OrganizationName target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.OrganizationName)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "OrganizationName" element
     */
    @Override
    public void setOrganizationName(org.ddialliance.specification.ddiCDI.x10.xmlSchema.OrganizationName organizationName) {
        generatedSetterHelperImpl(organizationName, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "OrganizationName" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.OrganizationName addNewOrganizationName() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.OrganizationName target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.OrganizationName)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
