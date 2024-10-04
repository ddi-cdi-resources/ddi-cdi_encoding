/*
 * An XML document type.
 * Localname: SentinelValueDomain
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomainDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one SentinelValueDomain(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class SentinelValueDomainDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomainDocument {
    private static final long serialVersionUID = 1L;

    public SentinelValueDomainDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "SentinelValueDomain"),
    };


    /**
     * Gets the "SentinelValueDomain" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain getSentinelValueDomain() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "SentinelValueDomain" element
     */
    @Override
    public void setSentinelValueDomain(org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain sentinelValueDomain) {
        generatedSetterHelperImpl(sentinelValueDomain, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "SentinelValueDomain" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain addNewSentinelValueDomain() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
