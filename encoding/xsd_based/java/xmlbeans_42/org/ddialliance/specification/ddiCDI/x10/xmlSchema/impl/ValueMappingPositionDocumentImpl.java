/*
 * An XML document type.
 * Localname: ValueMappingPosition
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingPositionDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one ValueMappingPosition(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class ValueMappingPositionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingPositionDocument {
    private static final long serialVersionUID = 1L;

    public ValueMappingPositionDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ValueMappingPosition"),
    };


    /**
     * Gets the "ValueMappingPosition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingPosition getValueMappingPosition() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingPosition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingPosition)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "ValueMappingPosition" element
     */
    @Override
    public void setValueMappingPosition(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingPosition valueMappingPosition) {
        generatedSetterHelperImpl(valueMappingPosition, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "ValueMappingPosition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingPosition addNewValueMappingPosition() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingPosition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingPosition)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
