/*
 * An XML document type.
 * Localname: SentinelConceptualDomain
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelConceptualDomainDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one SentinelConceptualDomain(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class SentinelConceptualDomainDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelConceptualDomainDocument {
    private static final long serialVersionUID = 1L;

    public SentinelConceptualDomainDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "SentinelConceptualDomain"),
    };


    /**
     * Gets the "SentinelConceptualDomain" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelConceptualDomain getSentinelConceptualDomain() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelConceptualDomain target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelConceptualDomain)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "SentinelConceptualDomain" element
     */
    @Override
    public void setSentinelConceptualDomain(org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelConceptualDomain sentinelConceptualDomain) {
        generatedSetterHelperImpl(sentinelConceptualDomain, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "SentinelConceptualDomain" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelConceptualDomain addNewSentinelConceptualDomain() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelConceptualDomain target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelConceptualDomain)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
