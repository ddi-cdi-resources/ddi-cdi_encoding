/*
 * An XML document type.
 * Localname: BibliographicName
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.BibliographicNameDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one BibliographicName(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class BibliographicNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.BibliographicNameDocument {
    private static final long serialVersionUID = 1L;

    public BibliographicNameDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "BibliographicName"),
    };


    /**
     * Gets the "BibliographicName" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.BibliographicName getBibliographicName() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.BibliographicName target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.BibliographicName)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "BibliographicName" element
     */
    @Override
    public void setBibliographicName(org.ddialliance.specification.ddiCDI.x10.xmlSchema.BibliographicName bibliographicName) {
        generatedSetterHelperImpl(bibliographicName, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "BibliographicName" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.BibliographicName addNewBibliographicName() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.BibliographicName target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.BibliographicName)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
