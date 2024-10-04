/*
 * An XML document type.
 * Localname: LogicalRecordRelationship
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationshipDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one LogicalRecordRelationship(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class LogicalRecordRelationshipDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationshipDocument {
    private static final long serialVersionUID = 1L;

    public LogicalRecordRelationshipDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "LogicalRecordRelationship"),
    };


    /**
     * Gets the "LogicalRecordRelationship" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship getLogicalRecordRelationship() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "LogicalRecordRelationship" element
     */
    @Override
    public void setLogicalRecordRelationship(org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship logicalRecordRelationship) {
        generatedSetterHelperImpl(logicalRecordRelationship, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "LogicalRecordRelationship" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship addNewLogicalRecordRelationship() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
