/*
 * An XML document type.
 * Localname: ReferenceVariable
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceVariableDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one ReferenceVariable(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class ReferenceVariableDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceVariableDocument {
    private static final long serialVersionUID = 1L;

    public ReferenceVariableDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ReferenceVariable"),
    };


    /**
     * Gets the "ReferenceVariable" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceVariable getReferenceVariable() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceVariable target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceVariable)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "ReferenceVariable" element
     */
    @Override
    public void setReferenceVariable(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceVariable referenceVariable) {
        generatedSetterHelperImpl(referenceVariable, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "ReferenceVariable" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceVariable addNewReferenceVariable() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceVariable target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceVariable)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
