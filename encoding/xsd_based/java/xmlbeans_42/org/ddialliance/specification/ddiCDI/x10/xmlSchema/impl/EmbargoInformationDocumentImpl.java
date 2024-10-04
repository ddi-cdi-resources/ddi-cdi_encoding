/*
 * An XML document type.
 * Localname: EmbargoInformation
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.EmbargoInformationDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one EmbargoInformation(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class EmbargoInformationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.EmbargoInformationDocument {
    private static final long serialVersionUID = 1L;

    public EmbargoInformationDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "EmbargoInformation"),
    };


    /**
     * Gets the "EmbargoInformation" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.EmbargoInformation getEmbargoInformation() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.EmbargoInformation target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.EmbargoInformation)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "EmbargoInformation" element
     */
    @Override
    public void setEmbargoInformation(org.ddialliance.specification.ddiCDI.x10.xmlSchema.EmbargoInformation embargoInformation) {
        generatedSetterHelperImpl(embargoInformation, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "EmbargoInformation" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.EmbargoInformation addNewEmbargoInformation() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.EmbargoInformation target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.EmbargoInformation)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
