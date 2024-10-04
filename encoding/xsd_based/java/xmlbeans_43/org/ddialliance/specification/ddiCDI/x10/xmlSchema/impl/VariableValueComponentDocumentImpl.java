/*
 * An XML document type.
 * Localname: VariableValueComponent
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableValueComponentDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one VariableValueComponent(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class VariableValueComponentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableValueComponentDocument {
    private static final long serialVersionUID = 1L;

    public VariableValueComponentDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "VariableValueComponent"),
    };


    /**
     * Gets the "VariableValueComponent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableValueComponent getVariableValueComponent() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableValueComponent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableValueComponent)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "VariableValueComponent" element
     */
    @Override
    public void setVariableValueComponent(org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableValueComponent variableValueComponent) {
        generatedSetterHelperImpl(variableValueComponent, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "VariableValueComponent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableValueComponent addNewVariableValueComponent() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableValueComponent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableValueComponent)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
