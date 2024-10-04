/*
 * An XML document type.
 * Localname: CorrespondenceDefinition
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceDefinitionDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one CorrespondenceDefinition(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class CorrespondenceDefinitionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceDefinitionDocument {
    private static final long serialVersionUID = 1L;

    public CorrespondenceDefinitionDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "CorrespondenceDefinition"),
    };


    /**
     * Gets the "CorrespondenceDefinition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceDefinition getCorrespondenceDefinition() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceDefinition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceDefinition)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "CorrespondenceDefinition" element
     */
    @Override
    public void setCorrespondenceDefinition(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceDefinition correspondenceDefinition) {
        generatedSetterHelperImpl(correspondenceDefinition, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "CorrespondenceDefinition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceDefinition addNewCorrespondenceDefinition() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceDefinition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceDefinition)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
