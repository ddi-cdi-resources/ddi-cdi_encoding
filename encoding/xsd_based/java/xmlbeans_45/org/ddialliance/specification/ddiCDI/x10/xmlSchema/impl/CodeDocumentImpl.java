/*
 * An XML document type.
 * Localname: Code
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one Code(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class CodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeDocument {
    private static final long serialVersionUID = 1L;

    public CodeDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "Code"),
    };


    /**
     * Gets the "Code" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Code getCode() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Code target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Code)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "Code" element
     */
    @Override
    public void setCode(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Code code) {
        generatedSetterHelperImpl(code, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Code" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Code addNewCode() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Code target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Code)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
