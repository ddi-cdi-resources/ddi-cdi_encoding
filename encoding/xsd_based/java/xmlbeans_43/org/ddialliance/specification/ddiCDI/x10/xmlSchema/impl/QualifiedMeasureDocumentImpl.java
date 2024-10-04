/*
 * An XML document type.
 * Localname: QualifiedMeasure
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.QualifiedMeasureDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one QualifiedMeasure(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class QualifiedMeasureDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.QualifiedMeasureDocument {
    private static final long serialVersionUID = 1L;

    public QualifiedMeasureDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "QualifiedMeasure"),
    };


    /**
     * Gets the "QualifiedMeasure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.QualifiedMeasure getQualifiedMeasure() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.QualifiedMeasure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.QualifiedMeasure)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "QualifiedMeasure" element
     */
    @Override
    public void setQualifiedMeasure(org.ddialliance.specification.ddiCDI.x10.xmlSchema.QualifiedMeasure qualifiedMeasure) {
        generatedSetterHelperImpl(qualifiedMeasure, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "QualifiedMeasure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.QualifiedMeasure addNewQualifiedMeasure() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.QualifiedMeasure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.QualifiedMeasure)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
