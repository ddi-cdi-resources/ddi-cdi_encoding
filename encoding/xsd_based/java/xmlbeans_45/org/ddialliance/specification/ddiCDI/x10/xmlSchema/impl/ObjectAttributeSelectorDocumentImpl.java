/*
 * An XML document type.
 * Localname: ObjectAttributeSelector
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectAttributeSelectorDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one ObjectAttributeSelector(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class ObjectAttributeSelectorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectAttributeSelectorDocument {
    private static final long serialVersionUID = 1L;

    public ObjectAttributeSelectorDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ObjectAttributeSelector"),
    };


    /**
     * Gets the "ObjectAttributeSelector" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectAttributeSelector getObjectAttributeSelector() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectAttributeSelector target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectAttributeSelector)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "ObjectAttributeSelector" element
     */
    @Override
    public void setObjectAttributeSelector(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectAttributeSelector objectAttributeSelector) {
        generatedSetterHelperImpl(objectAttributeSelector, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "ObjectAttributeSelector" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectAttributeSelector addNewObjectAttributeSelector() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectAttributeSelector target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectAttributeSelector)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
