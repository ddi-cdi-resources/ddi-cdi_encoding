/*
 * An XML document type.
 * Localname: ContextualComponent
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContextualComponentDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one ContextualComponent(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class ContextualComponentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContextualComponentDocument {
    private static final long serialVersionUID = 1L;

    public ContextualComponentDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ContextualComponent"),
    };


    /**
     * Gets the "ContextualComponent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContextualComponent getContextualComponent() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContextualComponent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContextualComponent)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "ContextualComponent" element
     */
    @Override
    public void setContextualComponent(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContextualComponent contextualComponent) {
        generatedSetterHelperImpl(contextualComponent, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "ContextualComponent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContextualComponent addNewContextualComponent() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContextualComponent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContextualComponent)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
