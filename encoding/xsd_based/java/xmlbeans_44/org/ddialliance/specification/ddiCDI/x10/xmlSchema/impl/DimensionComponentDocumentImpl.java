/*
 * An XML document type.
 * Localname: DimensionComponent
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionComponentDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one DimensionComponent(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class DimensionComponentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionComponentDocument {
    private static final long serialVersionUID = 1L;

    public DimensionComponentDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "DimensionComponent"),
    };


    /**
     * Gets the "DimensionComponent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionComponent getDimensionComponent() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionComponent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionComponent)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "DimensionComponent" element
     */
    @Override
    public void setDimensionComponent(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionComponent dimensionComponent) {
        generatedSetterHelperImpl(dimensionComponent, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "DimensionComponent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionComponent addNewDimensionComponent() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionComponent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionComponent)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
