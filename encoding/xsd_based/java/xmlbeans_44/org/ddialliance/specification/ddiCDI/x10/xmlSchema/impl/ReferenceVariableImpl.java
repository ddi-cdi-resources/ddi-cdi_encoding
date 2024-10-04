/*
 * XML Type:  ReferenceVariable
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceVariable
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML ReferenceVariable(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class ReferenceVariableImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.RepresentedVariableImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceVariable {
    private static final long serialVersionUID = 1L;

    public ReferenceVariableImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ReferenceVariable_takesValuesFrom_ReferenceValueDomain"),
    };


    /**
     * Gets the "ReferenceVariable_takesValuesFrom_ReferenceValueDomain" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceVariable.ReferenceVariableTakesValuesFromReferenceValueDomain getReferenceVariableTakesValuesFromReferenceValueDomain() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceVariable.ReferenceVariableTakesValuesFromReferenceValueDomain target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceVariable.ReferenceVariableTakesValuesFromReferenceValueDomain)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "ReferenceVariable_takesValuesFrom_ReferenceValueDomain" element
     */
    @Override
    public boolean isSetReferenceVariableTakesValuesFromReferenceValueDomain() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "ReferenceVariable_takesValuesFrom_ReferenceValueDomain" element
     */
    @Override
    public void setReferenceVariableTakesValuesFromReferenceValueDomain(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceVariable.ReferenceVariableTakesValuesFromReferenceValueDomain referenceVariableTakesValuesFromReferenceValueDomain) {
        generatedSetterHelperImpl(referenceVariableTakesValuesFromReferenceValueDomain, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "ReferenceVariable_takesValuesFrom_ReferenceValueDomain" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceVariable.ReferenceVariableTakesValuesFromReferenceValueDomain addNewReferenceVariableTakesValuesFromReferenceValueDomain() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceVariable.ReferenceVariableTakesValuesFromReferenceValueDomain target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceVariable.ReferenceVariableTakesValuesFromReferenceValueDomain)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "ReferenceVariable_takesValuesFrom_ReferenceValueDomain" element
     */
    @Override
    public void unsetReferenceVariableTakesValuesFromReferenceValueDomain() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }
    /**
     * An XML ReferenceVariable_takesValuesFrom_ReferenceValueDomain(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class ReferenceVariableTakesValuesFromReferenceValueDomainImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceVariable.ReferenceVariableTakesValuesFromReferenceValueDomain {
        private static final long serialVersionUID = 1L;

        public ReferenceVariableTakesValuesFromReferenceValueDomainImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceVariable$ReferenceVariableTakesValuesFromReferenceValueDomain$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceVariable.ReferenceVariableTakesValuesFromReferenceValueDomain.ValidType {
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
