/*
 * XML Type:  MainKeyMember
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.MainKeyMember
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML MainKeyMember(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class MainKeyMemberImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.KeyMemberImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.MainKeyMember {
    private static final long serialVersionUID = 1L;

    public MainKeyMemberImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "MainKeyMember_hasValueFrom_SubstantiveValueDomain"),
    };


    /**
     * Gets the "MainKeyMember_hasValueFrom_SubstantiveValueDomain" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.MainKeyMember.MainKeyMemberHasValueFromSubstantiveValueDomain getMainKeyMemberHasValueFromSubstantiveValueDomain() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.MainKeyMember.MainKeyMemberHasValueFromSubstantiveValueDomain target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.MainKeyMember.MainKeyMemberHasValueFromSubstantiveValueDomain)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "MainKeyMember_hasValueFrom_SubstantiveValueDomain" element
     */
    @Override
    public boolean isSetMainKeyMemberHasValueFromSubstantiveValueDomain() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "MainKeyMember_hasValueFrom_SubstantiveValueDomain" element
     */
    @Override
    public void setMainKeyMemberHasValueFromSubstantiveValueDomain(org.ddialliance.specification.ddiCDI.x10.xmlSchema.MainKeyMember.MainKeyMemberHasValueFromSubstantiveValueDomain mainKeyMemberHasValueFromSubstantiveValueDomain) {
        generatedSetterHelperImpl(mainKeyMemberHasValueFromSubstantiveValueDomain, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "MainKeyMember_hasValueFrom_SubstantiveValueDomain" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.MainKeyMember.MainKeyMemberHasValueFromSubstantiveValueDomain addNewMainKeyMemberHasValueFromSubstantiveValueDomain() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.MainKeyMember.MainKeyMemberHasValueFromSubstantiveValueDomain target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.MainKeyMember.MainKeyMemberHasValueFromSubstantiveValueDomain)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "MainKeyMember_hasValueFrom_SubstantiveValueDomain" element
     */
    @Override
    public void unsetMainKeyMemberHasValueFromSubstantiveValueDomain() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }
    /**
     * An XML MainKeyMember_hasValueFrom_SubstantiveValueDomain(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class MainKeyMemberHasValueFromSubstantiveValueDomainImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.MainKeyMember.MainKeyMemberHasValueFromSubstantiveValueDomain {
        private static final long serialVersionUID = 1L;

        public MainKeyMemberHasValueFromSubstantiveValueDomainImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.MainKeyMember$MainKeyMemberHasValueFromSubstantiveValueDomain$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.MainKeyMember.MainKeyMemberHasValueFromSubstantiveValueDomain.ValidType {
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
