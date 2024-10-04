/*
 * XML Type:  DimensionalKeyDefinitionMember
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinitionMember
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML DimensionalKeyDefinitionMember(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class DimensionalKeyDefinitionMemberImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.ConceptualValueImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinitionMember {
    private static final long serialVersionUID = 1L;

    public DimensionalKeyDefinitionMemberImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "DimensionalKeyDefinitionMember_isRepresentedBy_DimensionalKeyMember"),
    };


    /**
     * Gets a List of "DimensionalKeyDefinitionMember_isRepresentedBy_DimensionalKeyMember" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinitionMember.DimensionalKeyDefinitionMemberIsRepresentedByDimensionalKeyMember> getDimensionalKeyDefinitionMemberIsRepresentedByDimensionalKeyMemberList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getDimensionalKeyDefinitionMemberIsRepresentedByDimensionalKeyMemberArray,
                this::setDimensionalKeyDefinitionMemberIsRepresentedByDimensionalKeyMemberArray,
                this::insertNewDimensionalKeyDefinitionMemberIsRepresentedByDimensionalKeyMember,
                this::removeDimensionalKeyDefinitionMemberIsRepresentedByDimensionalKeyMember,
                this::sizeOfDimensionalKeyDefinitionMemberIsRepresentedByDimensionalKeyMemberArray
            );
        }
    }

    /**
     * Gets array of all "DimensionalKeyDefinitionMember_isRepresentedBy_DimensionalKeyMember" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinitionMember.DimensionalKeyDefinitionMemberIsRepresentedByDimensionalKeyMember[] getDimensionalKeyDefinitionMemberIsRepresentedByDimensionalKeyMemberArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinitionMember.DimensionalKeyDefinitionMemberIsRepresentedByDimensionalKeyMember[0]);
    }

    /**
     * Gets ith "DimensionalKeyDefinitionMember_isRepresentedBy_DimensionalKeyMember" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinitionMember.DimensionalKeyDefinitionMemberIsRepresentedByDimensionalKeyMember getDimensionalKeyDefinitionMemberIsRepresentedByDimensionalKeyMemberArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinitionMember.DimensionalKeyDefinitionMemberIsRepresentedByDimensionalKeyMember target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinitionMember.DimensionalKeyDefinitionMemberIsRepresentedByDimensionalKeyMember)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "DimensionalKeyDefinitionMember_isRepresentedBy_DimensionalKeyMember" element
     */
    @Override
    public int sizeOfDimensionalKeyDefinitionMemberIsRepresentedByDimensionalKeyMemberArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "DimensionalKeyDefinitionMember_isRepresentedBy_DimensionalKeyMember" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setDimensionalKeyDefinitionMemberIsRepresentedByDimensionalKeyMemberArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinitionMember.DimensionalKeyDefinitionMemberIsRepresentedByDimensionalKeyMember[] dimensionalKeyDefinitionMemberIsRepresentedByDimensionalKeyMemberArray) {
        check_orphaned();
        arraySetterHelper(dimensionalKeyDefinitionMemberIsRepresentedByDimensionalKeyMemberArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "DimensionalKeyDefinitionMember_isRepresentedBy_DimensionalKeyMember" element
     */
    @Override
    public void setDimensionalKeyDefinitionMemberIsRepresentedByDimensionalKeyMemberArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinitionMember.DimensionalKeyDefinitionMemberIsRepresentedByDimensionalKeyMember dimensionalKeyDefinitionMemberIsRepresentedByDimensionalKeyMember) {
        generatedSetterHelperImpl(dimensionalKeyDefinitionMemberIsRepresentedByDimensionalKeyMember, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DimensionalKeyDefinitionMember_isRepresentedBy_DimensionalKeyMember" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinitionMember.DimensionalKeyDefinitionMemberIsRepresentedByDimensionalKeyMember insertNewDimensionalKeyDefinitionMemberIsRepresentedByDimensionalKeyMember(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinitionMember.DimensionalKeyDefinitionMemberIsRepresentedByDimensionalKeyMember target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinitionMember.DimensionalKeyDefinitionMemberIsRepresentedByDimensionalKeyMember)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "DimensionalKeyDefinitionMember_isRepresentedBy_DimensionalKeyMember" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinitionMember.DimensionalKeyDefinitionMemberIsRepresentedByDimensionalKeyMember addNewDimensionalKeyDefinitionMemberIsRepresentedByDimensionalKeyMember() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinitionMember.DimensionalKeyDefinitionMemberIsRepresentedByDimensionalKeyMember target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinitionMember.DimensionalKeyDefinitionMemberIsRepresentedByDimensionalKeyMember)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "DimensionalKeyDefinitionMember_isRepresentedBy_DimensionalKeyMember" element
     */
    @Override
    public void removeDimensionalKeyDefinitionMemberIsRepresentedByDimensionalKeyMember(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
    /**
     * An XML DimensionalKeyDefinitionMember_isRepresentedBy_DimensionalKeyMember(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class DimensionalKeyDefinitionMemberIsRepresentedByDimensionalKeyMemberImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinitionMember.DimensionalKeyDefinitionMemberIsRepresentedByDimensionalKeyMember {
        private static final long serialVersionUID = 1L;

        public DimensionalKeyDefinitionMemberIsRepresentedByDimensionalKeyMemberImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }

        private static final QName[] PROPERTY_QNAME = {
            new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "validType"),
        };


        /**
         * Gets a List of "validType" elements
         */
        @Override
        public java.util.List<java.lang.String> getValidTypeList() {
            synchronized (monitor()) {
                check_orphaned();
                return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                    this::getValidTypeArray,
                    this::setValidTypeArray,
                    this::insertValidType,
                    this::removeValidType,
                    this::sizeOfValidTypeArray
                );
            }
        }

        /**
         * Gets array of all "validType" elements
         */
        @Override
        public java.lang.String[] getValidTypeArray() {
            return getObjectArray(PROPERTY_QNAME[0], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
        }

        /**
         * Gets ith "validType" element
         */
        @Override
        public java.lang.String getValidTypeArray(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], i);
                if (target == null) {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }

        /**
         * Gets (as xml) a List of "validType" elements
         */
        @Override
        public java.util.List<org.apache.xmlbeans.XmlString> xgetValidTypeList() {
            synchronized (monitor()) {
                check_orphaned();
                return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                    this::xgetValidTypeArray,
                    this::xsetValidTypeArray,
                    this::insertNewValidType,
                    this::removeValidType,
                    this::sizeOfValidTypeArray
                );
            }
        }

        /**
         * Gets (as xml) array of all "validType" elements
         */
        @Override
        public org.apache.xmlbeans.XmlString[] xgetValidTypeArray() {
            return xgetArray(PROPERTY_QNAME[0], org.apache.xmlbeans.XmlString[]::new);
        }

        /**
         * Gets (as xml) ith "validType" element
         */
        @Override
        public org.apache.xmlbeans.XmlString xgetValidTypeArray(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[0], i);
                if (target == null) {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }

        /**
         * Returns number of "validType" element
         */
        @Override
        public int sizeOfValidTypeArray() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().count_elements(PROPERTY_QNAME[0]);
            }
        }

        /**
         * Sets array of all "validType" element
         */
        @Override
        public void setValidTypeArray(java.lang.String[] validTypeArray) {
            synchronized (monitor()) {
                check_orphaned();
                arraySetterHelper(validTypeArray, PROPERTY_QNAME[0]);
            }
        }

        /**
         * Sets ith "validType" element
         */
        @Override
        public void setValidTypeArray(int i, java.lang.String validType) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], i);
                if (target == null) {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(validType);
            }
        }

        /**
         * Sets (as xml) array of all "validType" element
         */
        @Override
        public void xsetValidTypeArray(org.apache.xmlbeans.XmlString[]validTypeArray) {
            synchronized (monitor()) {
                check_orphaned();
                arraySetterHelper(validTypeArray, PROPERTY_QNAME[0]);
            }
        }

        /**
         * Sets (as xml) ith "validType" element
         */
        @Override
        public void xsetValidTypeArray(int i, org.apache.xmlbeans.XmlString validType) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[0], i);
                if (target == null) {
                    throw new IndexOutOfBoundsException();
                }
                target.set(validType);
            }
        }

        /**
         * Inserts the value as the ith "validType" element
         */
        @Override
        public void insertValidType(int i, java.lang.String validType) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target =
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[0], i);
                target.setStringValue(validType);
            }
        }

        /**
         * Appends the value as the last "validType" element
         */
        @Override
        public void addValidType(java.lang.String validType) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
                target.setStringValue(validType);
            }
        }

        /**
         * Inserts and returns a new empty value (as xml) as the ith "validType" element
         */
        @Override
        public org.apache.xmlbeans.XmlString insertNewValidType(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(PROPERTY_QNAME[0], i);
                return target;
            }
        }

        /**
         * Appends and returns a new empty value (as xml) as the last "validType" element
         */
        @Override
        public org.apache.xmlbeans.XmlString addNewValidType() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[0]);
                return target;
            }
        }

        /**
         * Removes the ith "validType" element
         */
        @Override
        public void removeValidType(int i) {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_element(PROPERTY_QNAME[0], i);
            }
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinitionMember$DimensionalKeyDefinitionMemberIsRepresentedByDimensionalKeyMember$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinitionMember.DimensionalKeyDefinitionMemberIsRepresentedByDimensionalKeyMember.ValidType {
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
