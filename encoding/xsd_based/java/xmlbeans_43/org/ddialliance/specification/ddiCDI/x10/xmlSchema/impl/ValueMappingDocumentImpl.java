/*
 * An XML document type.
 * Localname: ValueMapping
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one ValueMapping(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class ValueMappingDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingDocument {
    private static final long serialVersionUID = 1L;

    public ValueMappingDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ValueMapping"),
    };


    /**
     * Gets the "ValueMapping" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMapping getValueMapping() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMapping target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMapping)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "ValueMapping" element
     */
    @Override
    public void setValueMapping(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMapping valueMapping) {
        generatedSetterHelperImpl(valueMapping, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "ValueMapping" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMapping addNewValueMapping() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMapping target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMapping)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
