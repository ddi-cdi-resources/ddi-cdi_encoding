/*
 * An XML document type.
 * Localname: PhysicalRecordSegmentRelationship
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationshipDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one PhysicalRecordSegmentRelationship(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class PhysicalRecordSegmentRelationshipDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationshipDocument {
    private static final long serialVersionUID = 1L;

    public PhysicalRecordSegmentRelationshipDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "PhysicalRecordSegmentRelationship"),
    };


    /**
     * Gets the "PhysicalRecordSegmentRelationship" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship getPhysicalRecordSegmentRelationship() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "PhysicalRecordSegmentRelationship" element
     */
    @Override
    public void setPhysicalRecordSegmentRelationship(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship physicalRecordSegmentRelationship) {
        generatedSetterHelperImpl(physicalRecordSegmentRelationship, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "PhysicalRecordSegmentRelationship" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship addNewPhysicalRecordSegmentRelationship() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
