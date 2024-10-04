/*
 * XML Type:  ReferenceValue
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValue
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML ReferenceValue(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class ReferenceValueImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.InstanceValueImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValue {
    private static final long serialVersionUID = 1L;

    public ReferenceValueImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ReferenceValue_correspondsTo_VariableValueComponent"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ReferenceValue_hasValueFrom_ReferenceValueDomain"),
    };


    /**
     * Gets the "ReferenceValue_correspondsTo_VariableValueComponent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValue.ReferenceValueCorrespondsToVariableValueComponent getReferenceValueCorrespondsToVariableValueComponent() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValue.ReferenceValueCorrespondsToVariableValueComponent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValue.ReferenceValueCorrespondsToVariableValueComponent)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "ReferenceValue_correspondsTo_VariableValueComponent" element
     */
    @Override
    public void setReferenceValueCorrespondsToVariableValueComponent(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValue.ReferenceValueCorrespondsToVariableValueComponent referenceValueCorrespondsToVariableValueComponent) {
        generatedSetterHelperImpl(referenceValueCorrespondsToVariableValueComponent, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "ReferenceValue_correspondsTo_VariableValueComponent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValue.ReferenceValueCorrespondsToVariableValueComponent addNewReferenceValueCorrespondsToVariableValueComponent() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValue.ReferenceValueCorrespondsToVariableValueComponent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValue.ReferenceValueCorrespondsToVariableValueComponent)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Gets the "ReferenceValue_hasValueFrom_ReferenceValueDomain" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValue.ReferenceValueHasValueFromReferenceValueDomain getReferenceValueHasValueFromReferenceValueDomain() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValue.ReferenceValueHasValueFromReferenceValueDomain target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValue.ReferenceValueHasValueFromReferenceValueDomain)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "ReferenceValue_hasValueFrom_ReferenceValueDomain" element
     */
    @Override
    public void setReferenceValueHasValueFromReferenceValueDomain(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValue.ReferenceValueHasValueFromReferenceValueDomain referenceValueHasValueFromReferenceValueDomain) {
        generatedSetterHelperImpl(referenceValueHasValueFromReferenceValueDomain, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "ReferenceValue_hasValueFrom_ReferenceValueDomain" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValue.ReferenceValueHasValueFromReferenceValueDomain addNewReferenceValueHasValueFromReferenceValueDomain() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValue.ReferenceValueHasValueFromReferenceValueDomain target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValue.ReferenceValueHasValueFromReferenceValueDomain)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }
    /**
     * An XML ReferenceValue_correspondsTo_VariableValueComponent(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class ReferenceValueCorrespondsToVariableValueComponentImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValue.ReferenceValueCorrespondsToVariableValueComponent {
        private static final long serialVersionUID = 1L;

        public ReferenceValueCorrespondsToVariableValueComponentImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValue$ReferenceValueCorrespondsToVariableValueComponent$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValue.ReferenceValueCorrespondsToVariableValueComponent.ValidType {
            private static final long serialVersionUID = 1L;

            public ValidTypeImpl(org.apache.xmlbeans.SchemaType sType) {
                super(sType, false);
            }

            protected ValidTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
                super(sType, b);
            }
        }
    }
    /**
     * An XML ReferenceValue_hasValueFrom_ReferenceValueDomain(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class ReferenceValueHasValueFromReferenceValueDomainImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValue.ReferenceValueHasValueFromReferenceValueDomain {
        private static final long serialVersionUID = 1L;

        public ReferenceValueHasValueFromReferenceValueDomainImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValue$ReferenceValueHasValueFromReferenceValueDomain$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValue.ReferenceValueHasValueFromReferenceValueDomain.ValidType {
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
