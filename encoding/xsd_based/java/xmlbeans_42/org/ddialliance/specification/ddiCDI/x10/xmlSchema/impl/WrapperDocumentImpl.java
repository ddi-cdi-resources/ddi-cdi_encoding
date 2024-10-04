/*
 * An XML document type.
 * Localname: Wrapper
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.WrapperDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one Wrapper(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class WrapperDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.WrapperDocument {
    private static final long serialVersionUID = 1L;

    public WrapperDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "Wrapper"),
    };


    /**
     * Gets the "Wrapper" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Wrapper getWrapper() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Wrapper target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Wrapper)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "Wrapper" element
     */
    @Override
    public void setWrapper(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Wrapper wrapper) {
        generatedSetterHelperImpl(wrapper, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Wrapper" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Wrapper addNewWrapper() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Wrapper target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Wrapper)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
