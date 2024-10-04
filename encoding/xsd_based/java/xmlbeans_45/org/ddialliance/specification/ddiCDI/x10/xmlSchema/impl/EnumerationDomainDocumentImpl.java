/*
 * An XML document type.
 * Localname: EnumerationDomain
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomainDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one EnumerationDomain(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class EnumerationDomainDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomainDocument {
    private static final long serialVersionUID = 1L;

    public EnumerationDomainDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "EnumerationDomain"),
    };


    /**
     * Gets the "EnumerationDomain" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain getEnumerationDomain() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "EnumerationDomain" element
     */
    @Override
    public void setEnumerationDomain(org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain enumerationDomain) {
        generatedSetterHelperImpl(enumerationDomain, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "EnumerationDomain" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain addNewEnumerationDomain() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
