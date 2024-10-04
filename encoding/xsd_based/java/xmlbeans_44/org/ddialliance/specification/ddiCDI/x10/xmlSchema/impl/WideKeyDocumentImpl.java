/*
 * An XML document type.
 * Localname: WideKey
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideKeyDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one WideKey(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class WideKeyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideKeyDocument {
    private static final long serialVersionUID = 1L;

    public WideKeyDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "WideKey"),
    };


    /**
     * Gets the "WideKey" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideKey getWideKey() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideKey target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideKey)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "WideKey" element
     */
    @Override
    public void setWideKey(org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideKey wideKey) {
        generatedSetterHelperImpl(wideKey, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "WideKey" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideKey addNewWideKey() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideKey target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideKey)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
