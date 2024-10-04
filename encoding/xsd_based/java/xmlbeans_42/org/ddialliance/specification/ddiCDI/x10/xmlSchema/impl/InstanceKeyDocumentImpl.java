/*
 * An XML document type.
 * Localname: InstanceKey
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKeyDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one InstanceKey(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class InstanceKeyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKeyDocument {
    private static final long serialVersionUID = 1L;

    public InstanceKeyDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "InstanceKey"),
    };


    /**
     * Gets the "InstanceKey" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKey getInstanceKey() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKey target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKey)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "InstanceKey" element
     */
    @Override
    public void setInstanceKey(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKey instanceKey) {
        generatedSetterHelperImpl(instanceKey, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "InstanceKey" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKey addNewInstanceKey() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKey target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKey)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
