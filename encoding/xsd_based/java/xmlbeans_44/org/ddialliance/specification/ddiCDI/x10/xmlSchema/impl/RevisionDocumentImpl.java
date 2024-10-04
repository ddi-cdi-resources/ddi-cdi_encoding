/*
 * An XML document type.
 * Localname: Revision
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.RevisionDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one Revision(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class RevisionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.RevisionDocument {
    private static final long serialVersionUID = 1L;

    public RevisionDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "Revision"),
    };


    /**
     * Gets the "Revision" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Revision getRevision() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Revision target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Revision)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "Revision" element
     */
    @Override
    public void setRevision(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Revision revision) {
        generatedSetterHelperImpl(revision, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Revision" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Revision addNewRevision() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Revision target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Revision)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
