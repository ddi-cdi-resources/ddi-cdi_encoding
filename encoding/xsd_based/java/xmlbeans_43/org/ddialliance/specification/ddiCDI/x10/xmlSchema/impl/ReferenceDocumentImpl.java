/*
 * An XML document type.
 * Localname: Reference
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one Reference(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class ReferenceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceDocument {
    private static final long serialVersionUID = 1L;

    public ReferenceDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "Reference"),
    };


    /**
     * Gets the "Reference" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference getReference() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "Reference" element
     */
    @Override
    public void setReference(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference reference) {
        generatedSetterHelperImpl(reference, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Reference" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference addNewReference() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
