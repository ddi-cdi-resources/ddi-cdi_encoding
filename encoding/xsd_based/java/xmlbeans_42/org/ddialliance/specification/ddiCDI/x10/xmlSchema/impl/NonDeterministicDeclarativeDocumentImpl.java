/*
 * An XML document type.
 * Localname: NonDeterministicDeclarative
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDeterministicDeclarativeDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one NonDeterministicDeclarative(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class NonDeterministicDeclarativeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDeterministicDeclarativeDocument {
    private static final long serialVersionUID = 1L;

    public NonDeterministicDeclarativeDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "NonDeterministicDeclarative"),
    };


    /**
     * Gets the "NonDeterministicDeclarative" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDeterministicDeclarative getNonDeterministicDeclarative() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDeterministicDeclarative target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDeterministicDeclarative)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "NonDeterministicDeclarative" element
     */
    @Override
    public void setNonDeterministicDeclarative(org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDeterministicDeclarative nonDeterministicDeclarative) {
        generatedSetterHelperImpl(nonDeterministicDeclarative, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "NonDeterministicDeclarative" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDeterministicDeclarative addNewNonDeterministicDeclarative() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDeterministicDeclarative target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDeterministicDeclarative)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
