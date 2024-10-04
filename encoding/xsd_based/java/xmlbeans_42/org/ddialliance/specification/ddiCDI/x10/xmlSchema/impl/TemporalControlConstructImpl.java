/*
 * XML Type:  TemporalControlConstruct
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalControlConstruct
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML TemporalControlConstruct(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class TemporalControlConstructImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.TemporalConstraintsImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalControlConstruct {
    private static final long serialVersionUID = 1L;

    public TemporalControlConstructImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "temporalControl"),
    };


    /**
     * Gets the "temporalControl" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalOperator.Enum getTemporalControl() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : (org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalOperator.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "temporalControl" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalOperator xgetTemporalControl() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalOperator target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalOperator)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return target;
        }
    }

    /**
     * Sets the "temporalControl" element
     */
    @Override
    public void setTemporalControl(org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalOperator.Enum temporalControl) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.setEnumValue(temporalControl);
        }
    }

    /**
     * Sets (as xml) the "temporalControl" element
     */
    @Override
    public void xsetTemporalControl(org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalOperator temporalControl) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalOperator target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalOperator)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalOperator)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(temporalControl);
        }
    }
}
