/*
 * An XML document type.
 * Localname: TemporalConstraints
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalConstraintsDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one TemporalConstraints(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class TemporalConstraintsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalConstraintsDocument {
    private static final long serialVersionUID = 1L;

    public TemporalConstraintsDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "TemporalConstraints"),
    };


    /**
     * Gets the "TemporalConstraints" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalConstraints getTemporalConstraints() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalConstraints target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalConstraints)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "TemporalConstraints" element
     */
    @Override
    public void setTemporalConstraints(org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalConstraints temporalConstraints) {
        generatedSetterHelperImpl(temporalConstraints, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "TemporalConstraints" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalConstraints addNewTemporalConstraints() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalConstraints target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalConstraints)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
