/*
 * An XML document type.
 * Localname: LogicalRecordPosition
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordPositionDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one LogicalRecordPosition(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class LogicalRecordPositionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordPositionDocument {
    private static final long serialVersionUID = 1L;

    public LogicalRecordPositionDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "LogicalRecordPosition"),
    };


    /**
     * Gets the "LogicalRecordPosition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordPosition getLogicalRecordPosition() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordPosition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordPosition)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "LogicalRecordPosition" element
     */
    @Override
    public void setLogicalRecordPosition(org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordPosition logicalRecordPosition) {
        generatedSetterHelperImpl(logicalRecordPosition, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "LogicalRecordPosition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordPosition addNewLogicalRecordPosition() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordPosition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordPosition)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
