/*
 * An XML document type.
 * Localname: Step
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.StepDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one Step(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class StepDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.StepDocument {
    private static final long serialVersionUID = 1L;

    public StepDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "Step"),
    };


    /**
     * Gets the "Step" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step getStep() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "Step" element
     */
    @Override
    public void setStep(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step step) {
        generatedSetterHelperImpl(step, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Step" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step addNewStep() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
