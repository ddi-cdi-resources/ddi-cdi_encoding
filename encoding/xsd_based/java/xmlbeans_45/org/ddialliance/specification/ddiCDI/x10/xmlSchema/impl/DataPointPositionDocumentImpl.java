/*
 * An XML document type.
 * Localname: DataPointPosition
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointPositionDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one DataPointPosition(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class DataPointPositionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointPositionDocument {
    private static final long serialVersionUID = 1L;

    public DataPointPositionDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "DataPointPosition"),
    };


    /**
     * Gets the "DataPointPosition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointPosition getDataPointPosition() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointPosition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointPosition)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "DataPointPosition" element
     */
    @Override
    public void setDataPointPosition(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointPosition dataPointPosition) {
        generatedSetterHelperImpl(dataPointPosition, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "DataPointPosition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointPosition addNewDataPointPosition() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointPosition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointPosition)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
