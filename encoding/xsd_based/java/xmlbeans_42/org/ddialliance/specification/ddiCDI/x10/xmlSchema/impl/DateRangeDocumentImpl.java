/*
 * An XML document type.
 * Localname: DateRange
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRangeDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one DateRange(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class DateRangeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRangeDocument {
    private static final long serialVersionUID = 1L;

    public DateRangeDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "DateRange"),
    };


    /**
     * Gets the "DateRange" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange getDateRange() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "DateRange" element
     */
    @Override
    public void setDateRange(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange dateRange) {
        generatedSetterHelperImpl(dateRange, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "DateRange" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange addNewDateRange() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
