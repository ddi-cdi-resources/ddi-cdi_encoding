/*
 * An XML document type.
 * Localname: UnitType
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitTypeDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one UnitType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class UnitTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitTypeDocument {
    private static final long serialVersionUID = 1L;

    public UnitTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "UnitType"),
    };


    /**
     * Gets the "UnitType" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitType getUnitType() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitType target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "UnitType" element
     */
    @Override
    public void setUnitType(org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitType unitType) {
        generatedSetterHelperImpl(unitType, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "UnitType" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitType addNewUnitType() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitType target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
