/*
 * An XML document type.
 * Localname: SpecializationRole
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpecializationRoleDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one SpecializationRole(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class SpecializationRoleDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpecializationRoleDocument {
    private static final long serialVersionUID = 1L;

    public SpecializationRoleDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "SpecializationRole"),
    };


    /**
     * Gets the "SpecializationRole" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpecializationRole getSpecializationRole() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpecializationRole target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpecializationRole)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "SpecializationRole" element
     */
    @Override
    public void setSpecializationRole(org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpecializationRole specializationRole) {
        generatedSetterHelperImpl(specializationRole, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "SpecializationRole" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpecializationRole addNewSpecializationRole() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpecializationRole target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpecializationRole)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
