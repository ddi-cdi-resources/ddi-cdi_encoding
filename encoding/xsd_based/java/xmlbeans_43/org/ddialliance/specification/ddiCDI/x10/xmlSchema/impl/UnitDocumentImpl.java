/*
 * An XML document type.
 * Localname: Unit
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one Unit(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class UnitDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitDocument {
    private static final long serialVersionUID = 1L;

    public UnitDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "Unit"),
    };


    /**
     * Gets the "Unit" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Unit getUnit() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Unit target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Unit)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "Unit" element
     */
    @Override
    public void setUnit(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Unit unit) {
        generatedSetterHelperImpl(unit, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Unit" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Unit addNewUnit() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Unit target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Unit)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
