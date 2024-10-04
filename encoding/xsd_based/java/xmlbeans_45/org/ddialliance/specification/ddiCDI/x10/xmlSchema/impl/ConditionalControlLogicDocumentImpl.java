/*
 * An XML document type.
 * Localname: ConditionalControlLogic
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConditionalControlLogicDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one ConditionalControlLogic(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class ConditionalControlLogicDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConditionalControlLogicDocument {
    private static final long serialVersionUID = 1L;

    public ConditionalControlLogicDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ConditionalControlLogic"),
    };


    /**
     * Gets the "ConditionalControlLogic" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConditionalControlLogic getConditionalControlLogic() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConditionalControlLogic target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConditionalControlLogic)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "ConditionalControlLogic" element
     */
    @Override
    public void setConditionalControlLogic(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConditionalControlLogic conditionalControlLogic) {
        generatedSetterHelperImpl(conditionalControlLogic, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "ConditionalControlLogic" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConditionalControlLogic addNewConditionalControlLogic() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConditionalControlLogic target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConditionalControlLogic)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
