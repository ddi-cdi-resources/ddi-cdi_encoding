/*
 * An XML document type.
 * Localname: TextPositionSelector
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.TextPositionSelectorDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one TextPositionSelector(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class TextPositionSelectorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.TextPositionSelectorDocument {
    private static final long serialVersionUID = 1L;

    public TextPositionSelectorDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "TextPositionSelector"),
    };


    /**
     * Gets the "TextPositionSelector" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.TextPositionSelector getTextPositionSelector() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.TextPositionSelector target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.TextPositionSelector)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "TextPositionSelector" element
     */
    @Override
    public void setTextPositionSelector(org.ddialliance.specification.ddiCDI.x10.xmlSchema.TextPositionSelector textPositionSelector) {
        generatedSetterHelperImpl(textPositionSelector, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "TextPositionSelector" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.TextPositionSelector addNewTextPositionSelector() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.TextPositionSelector target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.TextPositionSelector)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
