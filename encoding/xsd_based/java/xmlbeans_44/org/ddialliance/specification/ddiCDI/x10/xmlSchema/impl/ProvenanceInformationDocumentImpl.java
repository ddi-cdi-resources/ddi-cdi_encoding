/*
 * An XML document type.
 * Localname: ProvenanceInformation
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProvenanceInformationDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one ProvenanceInformation(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class ProvenanceInformationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProvenanceInformationDocument {
    private static final long serialVersionUID = 1L;

    public ProvenanceInformationDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ProvenanceInformation"),
    };


    /**
     * Gets the "ProvenanceInformation" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProvenanceInformation getProvenanceInformation() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProvenanceInformation target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProvenanceInformation)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "ProvenanceInformation" element
     */
    @Override
    public void setProvenanceInformation(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProvenanceInformation provenanceInformation) {
        generatedSetterHelperImpl(provenanceInformation, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "ProvenanceInformation" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProvenanceInformation addNewProvenanceInformation() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProvenanceInformation target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProvenanceInformation)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
