/*
 * An XML document type.
 * Localname: ConceptualDomain
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualDomainDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one ConceptualDomain(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class ConceptualDomainDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualDomainDocument {
    private static final long serialVersionUID = 1L;

    public ConceptualDomainDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ConceptualDomain"),
    };


    /**
     * Gets the "ConceptualDomain" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualDomain getConceptualDomain() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualDomain target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualDomain)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "ConceptualDomain" element
     */
    @Override
    public void setConceptualDomain(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualDomain conceptualDomain) {
        generatedSetterHelperImpl(conceptualDomain, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "ConceptualDomain" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualDomain addNewConceptualDomain() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualDomain target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualDomain)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
