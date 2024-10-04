/*
 * An XML document type.
 * Localname: ReferenceValue
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValueDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one ReferenceValue(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class ReferenceValueDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValueDocument {
    private static final long serialVersionUID = 1L;

    public ReferenceValueDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ReferenceValue"),
    };


    /**
     * Gets the "ReferenceValue" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValue getReferenceValue() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValue target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "ReferenceValue" element
     */
    @Override
    public void setReferenceValue(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValue referenceValue) {
        generatedSetterHelperImpl(referenceValue, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "ReferenceValue" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValue addNewReferenceValue() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValue target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
