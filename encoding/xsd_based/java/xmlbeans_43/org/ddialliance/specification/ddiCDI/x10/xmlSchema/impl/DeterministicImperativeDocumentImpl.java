/*
 * An XML document type.
 * Localname: DeterministicImperative
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.DeterministicImperativeDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one DeterministicImperative(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class DeterministicImperativeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.DeterministicImperativeDocument {
    private static final long serialVersionUID = 1L;

    public DeterministicImperativeDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "DeterministicImperative"),
    };


    /**
     * Gets the "DeterministicImperative" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DeterministicImperative getDeterministicImperative() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DeterministicImperative target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DeterministicImperative)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "DeterministicImperative" element
     */
    @Override
    public void setDeterministicImperative(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DeterministicImperative deterministicImperative) {
        generatedSetterHelperImpl(deterministicImperative, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "DeterministicImperative" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DeterministicImperative addNewDeterministicImperative() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DeterministicImperative target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DeterministicImperative)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
