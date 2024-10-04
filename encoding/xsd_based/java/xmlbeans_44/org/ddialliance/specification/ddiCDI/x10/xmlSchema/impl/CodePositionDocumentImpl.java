/*
 * An XML document type.
 * Localname: CodePosition
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodePositionDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one CodePosition(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class CodePositionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodePositionDocument {
    private static final long serialVersionUID = 1L;

    public CodePositionDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "CodePosition"),
    };


    /**
     * Gets the "CodePosition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodePosition getCodePosition() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodePosition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodePosition)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "CodePosition" element
     */
    @Override
    public void setCodePosition(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodePosition codePosition) {
        generatedSetterHelperImpl(codePosition, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "CodePosition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodePosition addNewCodePosition() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodePosition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodePosition)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
