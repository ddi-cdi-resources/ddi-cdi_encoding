/*
 * An XML document type.
 * Localname: DescriptorValueDomain
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorValueDomainDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one DescriptorValueDomain(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class DescriptorValueDomainDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorValueDomainDocument {
    private static final long serialVersionUID = 1L;

    public DescriptorValueDomainDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "DescriptorValueDomain"),
    };


    /**
     * Gets the "DescriptorValueDomain" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorValueDomain getDescriptorValueDomain() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorValueDomain target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorValueDomain)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "DescriptorValueDomain" element
     */
    @Override
    public void setDescriptorValueDomain(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorValueDomain descriptorValueDomain) {
        generatedSetterHelperImpl(descriptorValueDomain, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "DescriptorValueDomain" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorValueDomain addNewDescriptorValueDomain() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorValueDomain target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorValueDomain)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
