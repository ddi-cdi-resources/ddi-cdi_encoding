/*
 * An XML document type.
 * Localname: RuleSet
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleSetDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one RuleSet(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class RuleSetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleSetDocument {
    private static final long serialVersionUID = 1L;

    public RuleSetDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "RuleSet"),
    };


    /**
     * Gets the "RuleSet" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleSet getRuleSet() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleSet target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleSet)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "RuleSet" element
     */
    @Override
    public void setRuleSet(org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleSet ruleSet) {
        generatedSetterHelperImpl(ruleSet, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "RuleSet" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleSet addNewRuleSet() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleSet target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleSet)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
