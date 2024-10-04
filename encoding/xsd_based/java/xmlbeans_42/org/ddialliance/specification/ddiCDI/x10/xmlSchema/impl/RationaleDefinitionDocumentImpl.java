/*
 * An XML document type.
 * Localname: RationaleDefinition
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.RationaleDefinitionDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one RationaleDefinition(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class RationaleDefinitionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.RationaleDefinitionDocument {
    private static final long serialVersionUID = 1L;

    public RationaleDefinitionDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "RationaleDefinition"),
    };


    /**
     * Gets the "RationaleDefinition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.RationaleDefinition getRationaleDefinition() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.RationaleDefinition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.RationaleDefinition)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "RationaleDefinition" element
     */
    @Override
    public void setRationaleDefinition(org.ddialliance.specification.ddiCDI.x10.xmlSchema.RationaleDefinition rationaleDefinition) {
        generatedSetterHelperImpl(rationaleDefinition, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "RationaleDefinition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.RationaleDefinition addNewRationaleDefinition() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.RationaleDefinition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.RationaleDefinition)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
