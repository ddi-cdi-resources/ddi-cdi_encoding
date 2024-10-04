/*
 * An XML document type.
 * Localname: CodeList
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeListDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one CodeList(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class CodeListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeListDocument {
    private static final long serialVersionUID = 1L;

    public CodeListDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "CodeList"),
    };


    /**
     * Gets the "CodeList" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeList getCodeList() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeList target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeList)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "CodeList" element
     */
    @Override
    public void setCodeList(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeList codeList) {
        generatedSetterHelperImpl(codeList, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "CodeList" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeList addNewCodeList() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeList target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeList)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
