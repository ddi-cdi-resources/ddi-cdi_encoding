/*
 * An XML document type.
 * Localname: CodeListStructure
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeListStructureDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one CodeListStructure(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class CodeListStructureDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeListStructureDocument {
    private static final long serialVersionUID = 1L;

    public CodeListStructureDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "CodeListStructure"),
    };


    /**
     * Gets the "CodeListStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeListStructure getCodeListStructure() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeListStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeListStructure)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "CodeListStructure" element
     */
    @Override
    public void setCodeListStructure(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeListStructure codeListStructure) {
        generatedSetterHelperImpl(codeListStructure, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "CodeListStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeListStructure addNewCodeListStructure() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeListStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeListStructure)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
