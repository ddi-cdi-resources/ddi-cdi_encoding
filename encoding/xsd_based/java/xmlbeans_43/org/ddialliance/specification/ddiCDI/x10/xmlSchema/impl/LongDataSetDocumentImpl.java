/*
 * An XML document type.
 * Localname: LongDataSet
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongDataSetDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one LongDataSet(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class LongDataSetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongDataSetDocument {
    private static final long serialVersionUID = 1L;

    public LongDataSetDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "LongDataSet"),
    };


    /**
     * Gets the "LongDataSet" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongDataSet getLongDataSet() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongDataSet target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongDataSet)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "LongDataSet" element
     */
    @Override
    public void setLongDataSet(org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongDataSet longDataSet) {
        generatedSetterHelperImpl(longDataSet, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "LongDataSet" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongDataSet addNewLongDataSet() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongDataSet target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongDataSet)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
