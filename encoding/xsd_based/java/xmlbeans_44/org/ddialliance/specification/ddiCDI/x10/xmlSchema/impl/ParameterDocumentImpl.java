/*
 * An XML document type.
 * Localname: Parameter
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ParameterDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one Parameter(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class ParameterDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ParameterDocument {
    private static final long serialVersionUID = 1L;

    public ParameterDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "Parameter"),
    };


    /**
     * Gets the "Parameter" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Parameter getParameter() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Parameter target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Parameter)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "Parameter" element
     */
    @Override
    public void setParameter(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Parameter parameter) {
        generatedSetterHelperImpl(parameter, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Parameter" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Parameter addNewParameter() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Parameter target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Parameter)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
