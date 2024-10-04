/*
 * An XML document type.
 * Localname: WideKeyMember
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideKeyMemberDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one WideKeyMember(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class WideKeyMemberDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideKeyMemberDocument {
    private static final long serialVersionUID = 1L;

    public WideKeyMemberDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "WideKeyMember"),
    };


    /**
     * Gets the "WideKeyMember" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideKeyMember getWideKeyMember() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideKeyMember target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideKeyMember)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "WideKeyMember" element
     */
    @Override
    public void setWideKeyMember(org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideKeyMember wideKeyMember) {
        generatedSetterHelperImpl(wideKeyMember, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "WideKeyMember" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideKeyMember addNewWideKeyMember() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideKeyMember target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideKeyMember)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
