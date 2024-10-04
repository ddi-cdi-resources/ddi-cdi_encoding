/*
 * XML Type:  Rule
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.Rule
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML Rule(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class RuleImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.Rule {
    private static final long serialVersionUID = 1L;

    public RuleImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "identifier"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "Rule_hasPrecondition_ConditionalControlLogic"),
    };


    /**
     * Gets the "identifier" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier getIdentifier() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "identifier" element
     */
    @Override
    public boolean isSetIdentifier() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "identifier" element
     */
    @Override
    public void setIdentifier(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier identifier) {
        generatedSetterHelperImpl(identifier, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "identifier" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier addNewIdentifier() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "identifier" element
     */
    @Override
    public void unsetIdentifier() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets a List of "Rule_hasPrecondition_ConditionalControlLogic" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Rule.RuleHasPreconditionConditionalControlLogic> getRuleHasPreconditionConditionalControlLogicList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getRuleHasPreconditionConditionalControlLogicArray,
                this::setRuleHasPreconditionConditionalControlLogicArray,
                this::insertNewRuleHasPreconditionConditionalControlLogic,
                this::removeRuleHasPreconditionConditionalControlLogic,
                this::sizeOfRuleHasPreconditionConditionalControlLogicArray
            );
        }
    }

    /**
     * Gets array of all "Rule_hasPrecondition_ConditionalControlLogic" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Rule.RuleHasPreconditionConditionalControlLogic[] getRuleHasPreconditionConditionalControlLogicArray() {
        return getXmlObjectArray(PROPERTY_QNAME[1], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.Rule.RuleHasPreconditionConditionalControlLogic[0]);
    }

    /**
     * Gets ith "Rule_hasPrecondition_ConditionalControlLogic" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Rule.RuleHasPreconditionConditionalControlLogic getRuleHasPreconditionConditionalControlLogicArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Rule.RuleHasPreconditionConditionalControlLogic target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Rule.RuleHasPreconditionConditionalControlLogic)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Rule_hasPrecondition_ConditionalControlLogic" element
     */
    @Override
    public int sizeOfRuleHasPreconditionConditionalControlLogicArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets array of all "Rule_hasPrecondition_ConditionalControlLogic" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setRuleHasPreconditionConditionalControlLogicArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Rule.RuleHasPreconditionConditionalControlLogic[] ruleHasPreconditionConditionalControlLogicArray) {
        check_orphaned();
        arraySetterHelper(ruleHasPreconditionConditionalControlLogicArray, PROPERTY_QNAME[1]);
    }

    /**
     * Sets ith "Rule_hasPrecondition_ConditionalControlLogic" element
     */
    @Override
    public void setRuleHasPreconditionConditionalControlLogicArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Rule.RuleHasPreconditionConditionalControlLogic ruleHasPreconditionConditionalControlLogic) {
        generatedSetterHelperImpl(ruleHasPreconditionConditionalControlLogic, PROPERTY_QNAME[1], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Rule_hasPrecondition_ConditionalControlLogic" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Rule.RuleHasPreconditionConditionalControlLogic insertNewRuleHasPreconditionConditionalControlLogic(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Rule.RuleHasPreconditionConditionalControlLogic target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Rule.RuleHasPreconditionConditionalControlLogic)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Rule_hasPrecondition_ConditionalControlLogic" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Rule.RuleHasPreconditionConditionalControlLogic addNewRuleHasPreconditionConditionalControlLogic() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Rule.RuleHasPreconditionConditionalControlLogic target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Rule.RuleHasPreconditionConditionalControlLogic)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Removes the ith "Rule_hasPrecondition_ConditionalControlLogic" element
     */
    @Override
    public void removeRuleHasPreconditionConditionalControlLogic(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], i);
        }
    }
    /**
     * An XML Rule_hasPrecondition_ConditionalControlLogic(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class RuleHasPreconditionConditionalControlLogicImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.Rule.RuleHasPreconditionConditionalControlLogic {
        private static final long serialVersionUID = 1L;

        public RuleHasPreconditionConditionalControlLogicImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.Rule$RuleHasPreconditionConditionalControlLogic$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.Rule.RuleHasPreconditionConditionalControlLogic.ValidType {
            private static final long serialVersionUID = 1L;

            public ValidTypeImpl(org.apache.xmlbeans.SchemaType sType) {
                super(sType, false);
            }

            protected ValidTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
                super(sType, b);
            }
        }
    }
}
