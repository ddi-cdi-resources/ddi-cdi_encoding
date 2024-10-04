/*
 * An XML document type.
 * Localname: AttributeComponent
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.AttributeComponentDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one AttributeComponent(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class AttributeComponentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.AttributeComponentDocument {
    private static final long serialVersionUID = 1L;

    public AttributeComponentDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "AttributeComponent"),
    };


    /**
     * Gets the "AttributeComponent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AttributeComponent getAttributeComponent() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.AttributeComponent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.AttributeComponent)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "AttributeComponent" element
     */
    @Override
    public void setAttributeComponent(org.ddialliance.specification.ddiCDI.x10.xmlSchema.AttributeComponent attributeComponent) {
        generatedSetterHelperImpl(attributeComponent, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "AttributeComponent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AttributeComponent addNewAttributeComponent() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.AttributeComponent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.AttributeComponent)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
