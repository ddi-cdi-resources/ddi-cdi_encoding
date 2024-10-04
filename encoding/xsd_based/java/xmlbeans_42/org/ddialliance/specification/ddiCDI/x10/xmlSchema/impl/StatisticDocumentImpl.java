/*
 * An XML document type.
 * Localname: Statistic
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one Statistic(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class StatisticDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticDocument {
    private static final long serialVersionUID = 1L;

    public StatisticDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "Statistic"),
    };


    /**
     * Gets the "Statistic" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Statistic getStatistic() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Statistic target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Statistic)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "Statistic" element
     */
    @Override
    public void setStatistic(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Statistic statistic) {
        generatedSetterHelperImpl(statistic, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Statistic" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Statistic addNewStatistic() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Statistic target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Statistic)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
