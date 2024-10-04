/*
 * An XML document type.
 * Localname: Selector
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.SelectorDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one Selector(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class SelectorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.SelectorDocument {
    private static final long serialVersionUID = 1L;

    public SelectorDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "Selector"),
    };


    /**
     * Gets the "Selector" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Selector getSelector() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Selector target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Selector)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "Selector" element
     */
    @Override
    public void setSelector(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Selector selector) {
        generatedSetterHelperImpl(selector, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Selector" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Selector addNewSelector() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Selector target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Selector)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
