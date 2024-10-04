/*
 * An XML document type.
 * Localname: IdentifierComponent
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.IdentifierComponentDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one IdentifierComponent(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class IdentifierComponentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.IdentifierComponentDocument {
    private static final long serialVersionUID = 1L;

    public IdentifierComponentDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "IdentifierComponent"),
    };


    /**
     * Gets the "IdentifierComponent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.IdentifierComponent getIdentifierComponent() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.IdentifierComponent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.IdentifierComponent)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "IdentifierComponent" element
     */
    @Override
    public void setIdentifierComponent(org.ddialliance.specification.ddiCDI.x10.xmlSchema.IdentifierComponent identifierComponent) {
        generatedSetterHelperImpl(identifierComponent, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "IdentifierComponent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.IdentifierComponent addNewIdentifierComponent() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.IdentifierComponent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.IdentifierComponent)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
