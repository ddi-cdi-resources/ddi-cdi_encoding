/*
 * An XML document type.
 * Localname: UnitSegmentLayout
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitSegmentLayoutDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one UnitSegmentLayout(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class UnitSegmentLayoutDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitSegmentLayoutDocument {
    private static final long serialVersionUID = 1L;

    public UnitSegmentLayoutDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "UnitSegmentLayout"),
    };


    /**
     * Gets the "UnitSegmentLayout" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitSegmentLayout getUnitSegmentLayout() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitSegmentLayout target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitSegmentLayout)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "UnitSegmentLayout" element
     */
    @Override
    public void setUnitSegmentLayout(org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitSegmentLayout unitSegmentLayout) {
        generatedSetterHelperImpl(unitSegmentLayout, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "UnitSegmentLayout" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitSegmentLayout addNewUnitSegmentLayout() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitSegmentLayout target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitSegmentLayout)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
