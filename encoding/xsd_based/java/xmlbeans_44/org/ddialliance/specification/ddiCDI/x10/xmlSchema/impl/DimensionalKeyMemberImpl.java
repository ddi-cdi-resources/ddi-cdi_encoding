/*
 * XML Type:  DimensionalKeyMember
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyMember
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML DimensionalKeyMember(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class DimensionalKeyMemberImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.KeyMemberImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyMember {
    private static final long serialVersionUID = 1L;

    public DimensionalKeyMemberImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "DimensionalKeyMember_hasValueFrom_CodeList"),
    };


    /**
     * Gets the "DimensionalKeyMember_hasValueFrom_CodeList" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyMember.DimensionalKeyMemberHasValueFromCodeList getDimensionalKeyMemberHasValueFromCodeList() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyMember.DimensionalKeyMemberHasValueFromCodeList target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyMember.DimensionalKeyMemberHasValueFromCodeList)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "DimensionalKeyMember_hasValueFrom_CodeList" element
     */
    @Override
    public void setDimensionalKeyMemberHasValueFromCodeList(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyMember.DimensionalKeyMemberHasValueFromCodeList dimensionalKeyMemberHasValueFromCodeList) {
        generatedSetterHelperImpl(dimensionalKeyMemberHasValueFromCodeList, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "DimensionalKeyMember_hasValueFrom_CodeList" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyMember.DimensionalKeyMemberHasValueFromCodeList addNewDimensionalKeyMemberHasValueFromCodeList() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyMember.DimensionalKeyMemberHasValueFromCodeList target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyMember.DimensionalKeyMemberHasValueFromCodeList)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
    /**
     * An XML DimensionalKeyMember_hasValueFrom_CodeList(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class DimensionalKeyMemberHasValueFromCodeListImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyMember.DimensionalKeyMemberHasValueFromCodeList {
        private static final long serialVersionUID = 1L;

        public DimensionalKeyMemberHasValueFromCodeListImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyMember$DimensionalKeyMemberHasValueFromCodeList$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyMember.DimensionalKeyMemberHasValueFromCodeList.ValidType {
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
