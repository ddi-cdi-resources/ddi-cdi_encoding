/*
 * An XML document type.
 * Localname: LabelForDisplay
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplayDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one LabelForDisplay(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class LabelForDisplayDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplayDocument {
    private static final long serialVersionUID = 1L;

    public LabelForDisplayDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "LabelForDisplay"),
    };


    /**
     * Gets the "LabelForDisplay" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay getLabelForDisplay() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "LabelForDisplay" element
     */
    @Override
    public void setLabelForDisplay(org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay labelForDisplay) {
        generatedSetterHelperImpl(labelForDisplay, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "LabelForDisplay" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay addNewLabelForDisplay() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
