/*
 * An XML document type.
 * Localname: TypedString
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.TypedStringDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one TypedString(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class TypedStringDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.TypedStringDocument {
    private static final long serialVersionUID = 1L;

    public TypedStringDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "TypedString"),
    };


    /**
     * Gets the "TypedString" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.TypedString getTypedString() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.TypedString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.TypedString)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "TypedString" element
     */
    @Override
    public void setTypedString(org.ddialliance.specification.ddiCDI.x10.xmlSchema.TypedString typedString) {
        generatedSetterHelperImpl(typedString, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "TypedString" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.TypedString addNewTypedString() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.TypedString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.TypedString)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
