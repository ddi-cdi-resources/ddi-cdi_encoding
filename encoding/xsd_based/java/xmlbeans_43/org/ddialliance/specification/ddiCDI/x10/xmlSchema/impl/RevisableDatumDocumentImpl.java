/*
 * An XML document type.
 * Localname: RevisableDatum
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.RevisableDatumDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one RevisableDatum(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class RevisableDatumDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.RevisableDatumDocument {
    private static final long serialVersionUID = 1L;

    public RevisableDatumDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "RevisableDatum"),
    };


    /**
     * Gets the "RevisableDatum" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.RevisableDatum getRevisableDatum() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.RevisableDatum target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.RevisableDatum)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "RevisableDatum" element
     */
    @Override
    public void setRevisableDatum(org.ddialliance.specification.ddiCDI.x10.xmlSchema.RevisableDatum revisableDatum) {
        generatedSetterHelperImpl(revisableDatum, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "RevisableDatum" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.RevisableDatum addNewRevisableDatum() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.RevisableDatum target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.RevisableDatum)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
