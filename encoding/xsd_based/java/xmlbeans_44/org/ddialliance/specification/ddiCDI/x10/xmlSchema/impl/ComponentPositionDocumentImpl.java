/*
 * An XML document type.
 * Localname: ComponentPosition
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ComponentPositionDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one ComponentPosition(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class ComponentPositionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ComponentPositionDocument {
    private static final long serialVersionUID = 1L;

    public ComponentPositionDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ComponentPosition"),
    };


    /**
     * Gets the "ComponentPosition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ComponentPosition getComponentPosition() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ComponentPosition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ComponentPosition)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "ComponentPosition" element
     */
    @Override
    public void setComponentPosition(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ComponentPosition componentPosition) {
        generatedSetterHelperImpl(componentPosition, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "ComponentPosition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ComponentPosition addNewComponentPosition() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ComponentPosition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ComponentPosition)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
