/*
 * An XML document type.
 * Localname: InformationFlowDefinition
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinitionDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one InformationFlowDefinition(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class InformationFlowDefinitionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinitionDocument {
    private static final long serialVersionUID = 1L;

    public InformationFlowDefinitionDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "InformationFlowDefinition"),
    };


    /**
     * Gets the "InformationFlowDefinition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition getInformationFlowDefinition() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "InformationFlowDefinition" element
     */
    @Override
    public void setInformationFlowDefinition(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition informationFlowDefinition) {
        generatedSetterHelperImpl(informationFlowDefinition, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "InformationFlowDefinition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition addNewInformationFlowDefinition() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
