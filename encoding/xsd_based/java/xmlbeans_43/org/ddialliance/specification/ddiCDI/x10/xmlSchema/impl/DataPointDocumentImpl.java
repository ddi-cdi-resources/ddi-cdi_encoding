/*
 * An XML document type.
 * Localname: DataPoint
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one DataPoint(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class DataPointDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointDocument {
    private static final long serialVersionUID = 1L;

    public DataPointDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "DataPoint"),
    };


    /**
     * Gets the "DataPoint" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPoint getDataPoint() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPoint target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPoint)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "DataPoint" element
     */
    @Override
    public void setDataPoint(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPoint dataPoint) {
        generatedSetterHelperImpl(dataPoint, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "DataPoint" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPoint addNewDataPoint() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPoint target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPoint)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
