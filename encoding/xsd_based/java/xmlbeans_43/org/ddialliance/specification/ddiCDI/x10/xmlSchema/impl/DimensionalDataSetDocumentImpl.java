/*
 * An XML document type.
 * Localname: DimensionalDataSet
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataSetDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one DimensionalDataSet(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class DimensionalDataSetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataSetDocument {
    private static final long serialVersionUID = 1L;

    public DimensionalDataSetDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "DimensionalDataSet"),
    };


    /**
     * Gets the "DimensionalDataSet" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataSet getDimensionalDataSet() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataSet target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataSet)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "DimensionalDataSet" element
     */
    @Override
    public void setDimensionalDataSet(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataSet dimensionalDataSet) {
        generatedSetterHelperImpl(dimensionalDataSet, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "DimensionalDataSet" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataSet addNewDimensionalDataSet() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataSet target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataSet)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
