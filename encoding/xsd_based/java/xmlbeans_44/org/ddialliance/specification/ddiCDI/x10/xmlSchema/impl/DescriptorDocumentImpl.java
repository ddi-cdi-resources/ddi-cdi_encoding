/*
 * An XML document type.
 * Localname: Descriptor
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one Descriptor(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class DescriptorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorDocument {
    private static final long serialVersionUID = 1L;

    public DescriptorDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "Descriptor"),
    };


    /**
     * Gets the "Descriptor" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor getDescriptor() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "Descriptor" element
     */
    @Override
    public void setDescriptor(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor descriptor) {
        generatedSetterHelperImpl(descriptor, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Descriptor" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor addNewDescriptor() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
