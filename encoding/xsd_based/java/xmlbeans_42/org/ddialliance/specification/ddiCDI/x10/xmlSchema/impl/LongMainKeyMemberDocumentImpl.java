/*
 * An XML document type.
 * Localname: LongMainKeyMember
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongMainKeyMemberDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one LongMainKeyMember(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class LongMainKeyMemberDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongMainKeyMemberDocument {
    private static final long serialVersionUID = 1L;

    public LongMainKeyMemberDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "LongMainKeyMember"),
    };


    /**
     * Gets the "LongMainKeyMember" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongMainKeyMember getLongMainKeyMember() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongMainKeyMember target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongMainKeyMember)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "LongMainKeyMember" element
     */
    @Override
    public void setLongMainKeyMember(org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongMainKeyMember longMainKeyMember) {
        generatedSetterHelperImpl(longMainKeyMember, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "LongMainKeyMember" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongMainKeyMember addNewLongMainKeyMember() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongMainKeyMember target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongMainKeyMember)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
