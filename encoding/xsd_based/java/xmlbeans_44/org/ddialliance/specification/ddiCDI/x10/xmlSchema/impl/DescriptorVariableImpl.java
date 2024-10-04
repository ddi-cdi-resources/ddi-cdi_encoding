/*
 * XML Type:  DescriptorVariable
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorVariable
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML DescriptorVariable(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class DescriptorVariableImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.RepresentedVariableImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorVariable {
    private static final long serialVersionUID = 1L;

    public DescriptorVariableImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "DescriptorVariable_takesSubstantiveValuesFrom_DescriptorValueDomain"),
    };


    /**
     * Gets the "DescriptorVariable_takesSubstantiveValuesFrom_DescriptorValueDomain" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorVariable.DescriptorVariableTakesSubstantiveValuesFromDescriptorValueDomain getDescriptorVariableTakesSubstantiveValuesFromDescriptorValueDomain() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorVariable.DescriptorVariableTakesSubstantiveValuesFromDescriptorValueDomain target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorVariable.DescriptorVariableTakesSubstantiveValuesFromDescriptorValueDomain)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "DescriptorVariable_takesSubstantiveValuesFrom_DescriptorValueDomain" element
     */
    @Override
    public boolean isSetDescriptorVariableTakesSubstantiveValuesFromDescriptorValueDomain() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "DescriptorVariable_takesSubstantiveValuesFrom_DescriptorValueDomain" element
     */
    @Override
    public void setDescriptorVariableTakesSubstantiveValuesFromDescriptorValueDomain(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorVariable.DescriptorVariableTakesSubstantiveValuesFromDescriptorValueDomain descriptorVariableTakesSubstantiveValuesFromDescriptorValueDomain) {
        generatedSetterHelperImpl(descriptorVariableTakesSubstantiveValuesFromDescriptorValueDomain, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "DescriptorVariable_takesSubstantiveValuesFrom_DescriptorValueDomain" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorVariable.DescriptorVariableTakesSubstantiveValuesFromDescriptorValueDomain addNewDescriptorVariableTakesSubstantiveValuesFromDescriptorValueDomain() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorVariable.DescriptorVariableTakesSubstantiveValuesFromDescriptorValueDomain target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorVariable.DescriptorVariableTakesSubstantiveValuesFromDescriptorValueDomain)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "DescriptorVariable_takesSubstantiveValuesFrom_DescriptorValueDomain" element
     */
    @Override
    public void unsetDescriptorVariableTakesSubstantiveValuesFromDescriptorValueDomain() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }
    /**
     * An XML DescriptorVariable_takesSubstantiveValuesFrom_DescriptorValueDomain(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class DescriptorVariableTakesSubstantiveValuesFromDescriptorValueDomainImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorVariable.DescriptorVariableTakesSubstantiveValuesFromDescriptorValueDomain {
        private static final long serialVersionUID = 1L;

        public DescriptorVariableTakesSubstantiveValuesFromDescriptorValueDomainImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorVariable$DescriptorVariableTakesSubstantiveValuesFromDescriptorValueDomain$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorVariable.DescriptorVariableTakesSubstantiveValuesFromDescriptorValueDomain.ValidType {
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
