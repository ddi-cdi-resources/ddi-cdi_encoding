/*
 * An XML document type.
 * Localname: VariableDescriptorComponent
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableDescriptorComponentDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one VariableDescriptorComponent(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class VariableDescriptorComponentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableDescriptorComponentDocument {
    private static final long serialVersionUID = 1L;

    public VariableDescriptorComponentDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "VariableDescriptorComponent"),
    };


    /**
     * Gets the "VariableDescriptorComponent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableDescriptorComponent getVariableDescriptorComponent() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableDescriptorComponent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableDescriptorComponent)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "VariableDescriptorComponent" element
     */
    @Override
    public void setVariableDescriptorComponent(org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableDescriptorComponent variableDescriptorComponent) {
        generatedSetterHelperImpl(variableDescriptorComponent, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "VariableDescriptorComponent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableDescriptorComponent addNewVariableDescriptorComponent() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableDescriptorComponent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableDescriptorComponent)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
