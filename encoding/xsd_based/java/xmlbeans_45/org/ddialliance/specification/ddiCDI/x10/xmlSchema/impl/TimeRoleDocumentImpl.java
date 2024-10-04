/*
 * An XML document type.
 * Localname: TimeRole
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.TimeRoleDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one TimeRole(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class TimeRoleDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.TimeRoleDocument {
    private static final long serialVersionUID = 1L;

    public TimeRoleDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "TimeRole"),
    };


    /**
     * Gets the "TimeRole" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.TimeRole getTimeRole() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.TimeRole target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.TimeRole)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "TimeRole" element
     */
    @Override
    public void setTimeRole(org.ddialliance.specification.ddiCDI.x10.xmlSchema.TimeRole timeRole) {
        generatedSetterHelperImpl(timeRole, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "TimeRole" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.TimeRole addNewTimeRole() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.TimeRole target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.TimeRole)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
