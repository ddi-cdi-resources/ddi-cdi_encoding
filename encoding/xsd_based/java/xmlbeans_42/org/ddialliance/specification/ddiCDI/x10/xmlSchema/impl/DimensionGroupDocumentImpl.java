/*
 * An XML document type.
 * Localname: DimensionGroup
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionGroupDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one DimensionGroup(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class DimensionGroupDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionGroupDocument {
    private static final long serialVersionUID = 1L;

    public DimensionGroupDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "DimensionGroup"),
    };


    /**
     * Gets the "DimensionGroup" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionGroup getDimensionGroup() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionGroup target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionGroup)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "DimensionGroup" element
     */
    @Override
    public void setDimensionGroup(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionGroup dimensionGroup) {
        generatedSetterHelperImpl(dimensionGroup, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "DimensionGroup" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionGroup addNewDimensionGroup() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionGroup target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionGroup)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
