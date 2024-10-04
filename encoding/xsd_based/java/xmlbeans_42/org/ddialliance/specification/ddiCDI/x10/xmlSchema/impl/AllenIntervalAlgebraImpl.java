/*
 * XML Type:  AllenIntervalAlgebra
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.AllenIntervalAlgebra
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML AllenIntervalAlgebra(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class AllenIntervalAlgebraImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.TemporalConstraintsImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.AllenIntervalAlgebra {
    private static final long serialVersionUID = 1L;

    public AllenIntervalAlgebraImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "temporalIntervalRelation"),
    };


    /**
     * Gets the "temporalIntervalRelation" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalRelation.Enum getTemporalIntervalRelation() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : (org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalRelation.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "temporalIntervalRelation" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalRelation xgetTemporalIntervalRelation() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalRelation target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalRelation)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return target;
        }
    }

    /**
     * Sets the "temporalIntervalRelation" element
     */
    @Override
    public void setTemporalIntervalRelation(org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalRelation.Enum temporalIntervalRelation) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.setEnumValue(temporalIntervalRelation);
        }
    }

    /**
     * Sets (as xml) the "temporalIntervalRelation" element
     */
    @Override
    public void xsetTemporalIntervalRelation(org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalRelation temporalIntervalRelation) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalRelation target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalRelation)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalRelation)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(temporalIntervalRelation);
        }
    }
}
