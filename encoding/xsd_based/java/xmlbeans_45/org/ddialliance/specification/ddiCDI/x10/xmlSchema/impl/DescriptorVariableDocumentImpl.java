/*
 * An XML document type.
 * Localname: DescriptorVariable
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorVariableDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one DescriptorVariable(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class DescriptorVariableDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorVariableDocument {
    private static final long serialVersionUID = 1L;

    public DescriptorVariableDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "DescriptorVariable"),
    };


    /**
     * Gets the "DescriptorVariable" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorVariable getDescriptorVariable() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorVariable target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorVariable)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "DescriptorVariable" element
     */
    @Override
    public void setDescriptorVariable(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorVariable descriptorVariable) {
        generatedSetterHelperImpl(descriptorVariable, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "DescriptorVariable" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorVariable addNewDescriptorVariable() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorVariable target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorVariable)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
