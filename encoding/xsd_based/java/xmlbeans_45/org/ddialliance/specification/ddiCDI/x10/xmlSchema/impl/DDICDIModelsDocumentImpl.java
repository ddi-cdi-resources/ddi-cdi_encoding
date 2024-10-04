/*
 * An XML document type.
 * Localname: DDICDIModels
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.DDICDIModelsDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one DDICDIModels(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class DDICDIModelsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.DDICDIModelsDocument {
    private static final long serialVersionUID = 1L;

    public DDICDIModelsDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "DDICDIModels"),
    };


    /**
     * Gets the "DDICDIModels" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DDICDIModels getDDICDIModels() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DDICDIModels target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DDICDIModels)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "DDICDIModels" element
     */
    @Override
    public void setDDICDIModels(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DDICDIModels ddicdiModels) {
        generatedSetterHelperImpl(ddicdiModels, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "DDICDIModels" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DDICDIModels addNewDDICDIModels() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DDICDIModels target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DDICDIModels)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
