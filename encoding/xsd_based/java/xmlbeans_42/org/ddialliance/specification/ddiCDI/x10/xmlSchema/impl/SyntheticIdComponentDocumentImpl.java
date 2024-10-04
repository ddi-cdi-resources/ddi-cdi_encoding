/*
 * An XML document type.
 * Localname: SyntheticIdComponent
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.SyntheticIdComponentDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one SyntheticIdComponent(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class SyntheticIdComponentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.SyntheticIdComponentDocument {
    private static final long serialVersionUID = 1L;

    public SyntheticIdComponentDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "SyntheticIdComponent"),
    };


    /**
     * Gets the "SyntheticIdComponent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.SyntheticIdComponent getSyntheticIdComponent() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.SyntheticIdComponent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.SyntheticIdComponent)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "SyntheticIdComponent" element
     */
    @Override
    public void setSyntheticIdComponent(org.ddialliance.specification.ddiCDI.x10.xmlSchema.SyntheticIdComponent syntheticIdComponent) {
        generatedSetterHelperImpl(syntheticIdComponent, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "SyntheticIdComponent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.SyntheticIdComponent addNewSyntheticIdComponent() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.SyntheticIdComponent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.SyntheticIdComponent)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
