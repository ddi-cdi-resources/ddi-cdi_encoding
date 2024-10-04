/*
 * An XML document type.
 * Localname: ModelIdentification
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ModelIdentificationDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one ModelIdentification(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class ModelIdentificationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ModelIdentificationDocument {
    private static final long serialVersionUID = 1L;

    public ModelIdentificationDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ModelIdentification"),
    };


    /**
     * Gets the "ModelIdentification" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ModelIdentification getModelIdentification() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ModelIdentification target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ModelIdentification)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "ModelIdentification" element
     */
    @Override
    public void setModelIdentification(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ModelIdentification modelIdentification) {
        generatedSetterHelperImpl(modelIdentification, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "ModelIdentification" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ModelIdentification addNewModelIdentification() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ModelIdentification target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ModelIdentification)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
