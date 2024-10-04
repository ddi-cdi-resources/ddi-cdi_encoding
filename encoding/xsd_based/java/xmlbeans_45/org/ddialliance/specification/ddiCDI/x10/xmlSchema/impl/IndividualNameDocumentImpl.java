/*
 * An XML document type.
 * Localname: IndividualName
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.IndividualNameDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one IndividualName(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class IndividualNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.IndividualNameDocument {
    private static final long serialVersionUID = 1L;

    public IndividualNameDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "IndividualName"),
    };


    /**
     * Gets the "IndividualName" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.IndividualName getIndividualName() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.IndividualName target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.IndividualName)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "IndividualName" element
     */
    @Override
    public void setIndividualName(org.ddialliance.specification.ddiCDI.x10.xmlSchema.IndividualName individualName) {
        generatedSetterHelperImpl(individualName, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "IndividualName" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.IndividualName addNewIndividualName() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.IndividualName target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.IndividualName)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
