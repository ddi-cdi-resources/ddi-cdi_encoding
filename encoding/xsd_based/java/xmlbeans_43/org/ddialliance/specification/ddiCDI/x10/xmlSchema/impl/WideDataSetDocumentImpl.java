/*
 * An XML document type.
 * Localname: WideDataSet
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideDataSetDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one WideDataSet(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class WideDataSetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideDataSetDocument {
    private static final long serialVersionUID = 1L;

    public WideDataSetDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "WideDataSet"),
    };


    /**
     * Gets the "WideDataSet" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideDataSet getWideDataSet() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideDataSet target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideDataSet)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "WideDataSet" element
     */
    @Override
    public void setWideDataSet(org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideDataSet wideDataSet) {
        generatedSetterHelperImpl(wideDataSet, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "WideDataSet" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideDataSet addNewWideDataSet() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideDataSet target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideDataSet)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
