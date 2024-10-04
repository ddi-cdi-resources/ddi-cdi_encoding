/*
 * An XML document type.
 * Localname: RecordRelation
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.RecordRelationDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one RecordRelation(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class RecordRelationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.RecordRelationDocument {
    private static final long serialVersionUID = 1L;

    public RecordRelationDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "RecordRelation"),
    };


    /**
     * Gets the "RecordRelation" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.RecordRelation getRecordRelation() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.RecordRelation target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.RecordRelation)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "RecordRelation" element
     */
    @Override
    public void setRecordRelation(org.ddialliance.specification.ddiCDI.x10.xmlSchema.RecordRelation recordRelation) {
        generatedSetterHelperImpl(recordRelation, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "RecordRelation" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.RecordRelation addNewRecordRelation() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.RecordRelation target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.RecordRelation)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
