/*
 * An XML document type.
 * Localname: Individual
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.IndividualDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one Individual(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class IndividualDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.IndividualDocument {
    private static final long serialVersionUID = 1L;

    public IndividualDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "Individual"),
    };


    /**
     * Gets the "Individual" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Individual getIndividual() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Individual target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Individual)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "Individual" element
     */
    @Override
    public void setIndividual(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Individual individual) {
        generatedSetterHelperImpl(individual, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Individual" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Individual addNewIndividual() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Individual target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Individual)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
