/*
 * An XML document type.
 * Localname: Key
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one Key(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class KeyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDocument {
    private static final long serialVersionUID = 1L;

    public KeyDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "Key"),
    };


    /**
     * Gets the "Key" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key getKey() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "Key" element
     */
    @Override
    public void setKey(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key key) {
        generatedSetterHelperImpl(key, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Key" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key addNewKey() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
