/*
 * An XML document type.
 * Localname: ValueAndConceptDescription
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueAndConceptDescriptionDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one ValueAndConceptDescription(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class ValueAndConceptDescriptionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueAndConceptDescriptionDocument {
    private static final long serialVersionUID = 1L;

    public ValueAndConceptDescriptionDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ValueAndConceptDescription"),
    };


    /**
     * Gets the "ValueAndConceptDescription" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueAndConceptDescription getValueAndConceptDescription() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueAndConceptDescription target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueAndConceptDescription)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "ValueAndConceptDescription" element
     */
    @Override
    public void setValueAndConceptDescription(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueAndConceptDescription valueAndConceptDescription) {
        generatedSetterHelperImpl(valueAndConceptDescription, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "ValueAndConceptDescription" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueAndConceptDescription addNewValueAndConceptDescription() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueAndConceptDescription target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueAndConceptDescription)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
