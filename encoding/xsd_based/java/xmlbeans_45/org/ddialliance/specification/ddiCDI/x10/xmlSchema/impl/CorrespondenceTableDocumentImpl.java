/*
 * An XML document type.
 * Localname: CorrespondenceTable
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTableDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one CorrespondenceTable(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class CorrespondenceTableDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTableDocument {
    private static final long serialVersionUID = 1L;

    public CorrespondenceTableDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "CorrespondenceTable"),
    };


    /**
     * Gets the "CorrespondenceTable" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable getCorrespondenceTable() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "CorrespondenceTable" element
     */
    @Override
    public void setCorrespondenceTable(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable correspondenceTable) {
        generatedSetterHelperImpl(correspondenceTable, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "CorrespondenceTable" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable addNewCorrespondenceTable() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
