/*
 * An XML document type.
 * Localname: MeasureComponent
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.MeasureComponentDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one MeasureComponent(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class MeasureComponentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.MeasureComponentDocument {
    private static final long serialVersionUID = 1L;

    public MeasureComponentDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "MeasureComponent"),
    };


    /**
     * Gets the "MeasureComponent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.MeasureComponent getMeasureComponent() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.MeasureComponent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.MeasureComponent)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "MeasureComponent" element
     */
    @Override
    public void setMeasureComponent(org.ddialliance.specification.ddiCDI.x10.xmlSchema.MeasureComponent measureComponent) {
        generatedSetterHelperImpl(measureComponent, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "MeasureComponent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.MeasureComponent addNewMeasureComponent() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.MeasureComponent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.MeasureComponent)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
