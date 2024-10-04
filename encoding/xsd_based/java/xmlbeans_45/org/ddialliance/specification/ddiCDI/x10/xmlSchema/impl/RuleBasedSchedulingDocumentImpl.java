/*
 * An XML document type.
 * Localname: RuleBasedScheduling
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleBasedSchedulingDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one RuleBasedScheduling(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class RuleBasedSchedulingDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleBasedSchedulingDocument {
    private static final long serialVersionUID = 1L;

    public RuleBasedSchedulingDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "RuleBasedScheduling"),
    };


    /**
     * Gets the "RuleBasedScheduling" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleBasedScheduling getRuleBasedScheduling() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleBasedScheduling target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleBasedScheduling)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "RuleBasedScheduling" element
     */
    @Override
    public void setRuleBasedScheduling(org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleBasedScheduling ruleBasedScheduling) {
        generatedSetterHelperImpl(ruleBasedScheduling, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "RuleBasedScheduling" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleBasedScheduling addNewRuleBasedScheduling() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleBasedScheduling target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleBasedScheduling)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
