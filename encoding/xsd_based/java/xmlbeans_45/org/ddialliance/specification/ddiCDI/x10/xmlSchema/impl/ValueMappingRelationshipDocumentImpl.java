/*
 * An XML document type.
 * Localname: ValueMappingRelationship
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationshipDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one ValueMappingRelationship(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class ValueMappingRelationshipDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationshipDocument {
    private static final long serialVersionUID = 1L;

    public ValueMappingRelationshipDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ValueMappingRelationship"),
    };


    /**
     * Gets the "ValueMappingRelationship" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship getValueMappingRelationship() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "ValueMappingRelationship" element
     */
    @Override
    public void setValueMappingRelationship(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship valueMappingRelationship) {
        generatedSetterHelperImpl(valueMappingRelationship, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "ValueMappingRelationship" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship addNewValueMappingRelationship() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
