/*
 * An XML document type.
 * Localname: InternationalIdentifier
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalIdentifierDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one InternationalIdentifier(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class InternationalIdentifierDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalIdentifierDocument {
    private static final long serialVersionUID = 1L;

    public InternationalIdentifierDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "InternationalIdentifier"),
    };


    /**
     * Gets the "InternationalIdentifier" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalIdentifier getInternationalIdentifier() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalIdentifier target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalIdentifier)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "InternationalIdentifier" element
     */
    @Override
    public void setInternationalIdentifier(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalIdentifier internationalIdentifier) {
        generatedSetterHelperImpl(internationalIdentifier, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "InternationalIdentifier" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalIdentifier addNewInternationalIdentifier() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalIdentifier target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalIdentifier)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
