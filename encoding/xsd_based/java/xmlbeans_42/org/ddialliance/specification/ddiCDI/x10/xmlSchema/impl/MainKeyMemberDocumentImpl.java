/*
 * An XML document type.
 * Localname: MainKeyMember
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.MainKeyMemberDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one MainKeyMember(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class MainKeyMemberDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.MainKeyMemberDocument {
    private static final long serialVersionUID = 1L;

    public MainKeyMemberDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "MainKeyMember"),
    };


    /**
     * Gets the "MainKeyMember" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.MainKeyMember getMainKeyMember() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.MainKeyMember target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.MainKeyMember)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "MainKeyMember" element
     */
    @Override
    public void setMainKeyMember(org.ddialliance.specification.ddiCDI.x10.xmlSchema.MainKeyMember mainKeyMember) {
        generatedSetterHelperImpl(mainKeyMember, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "MainKeyMember" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.MainKeyMember addNewMainKeyMember() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.MainKeyMember target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.MainKeyMember)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
