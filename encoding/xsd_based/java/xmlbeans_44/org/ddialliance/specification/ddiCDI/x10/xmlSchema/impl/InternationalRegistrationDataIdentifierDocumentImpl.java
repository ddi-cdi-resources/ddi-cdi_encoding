/*
 * An XML document type.
 * Localname: InternationalRegistrationDataIdentifier
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalRegistrationDataIdentifierDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one InternationalRegistrationDataIdentifier(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class InternationalRegistrationDataIdentifierDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalRegistrationDataIdentifierDocument {
    private static final long serialVersionUID = 1L;

    public InternationalRegistrationDataIdentifierDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "InternationalRegistrationDataIdentifier"),
    };


    /**
     * Gets the "InternationalRegistrationDataIdentifier" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalRegistrationDataIdentifier getInternationalRegistrationDataIdentifier() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalRegistrationDataIdentifier target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalRegistrationDataIdentifier)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "InternationalRegistrationDataIdentifier" element
     */
    @Override
    public void setInternationalRegistrationDataIdentifier(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalRegistrationDataIdentifier internationalRegistrationDataIdentifier) {
        generatedSetterHelperImpl(internationalRegistrationDataIdentifier, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "InternationalRegistrationDataIdentifier" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalRegistrationDataIdentifier addNewInternationalRegistrationDataIdentifier() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalRegistrationDataIdentifier target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalRegistrationDataIdentifier)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
