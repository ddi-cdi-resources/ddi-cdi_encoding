/*
 * An XML document type.
 * Localname: AssociationReference
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReferenceDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one AssociationReference(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class AssociationReferenceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReferenceDocument {
    private static final long serialVersionUID = 1L;

    public AssociationReferenceDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "AssociationReference"),
    };


    /**
     * Gets the "AssociationReference" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference getAssociationReference() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "AssociationReference" element
     */
    @Override
    public void setAssociationReference(org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference associationReference) {
        generatedSetterHelperImpl(associationReference, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "AssociationReference" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference addNewAssociationReference() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
