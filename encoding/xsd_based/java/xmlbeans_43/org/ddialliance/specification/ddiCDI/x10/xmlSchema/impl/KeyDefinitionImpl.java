/*
 * XML Type:  KeyDefinition
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML KeyDefinition(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class KeyDefinitionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition {
    private static final long serialVersionUID = 1L;

    public KeyDefinitionImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "identifier"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "KeyDefinition_correspondsTo_Universe"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "KeyDefinition_correspondsTo_Unit"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "KeyDefinition_has_KeyDefinitionMember"),
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
     * Gets the "KeyDefinition_correspondsTo_Universe" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition.KeyDefinitionCorrespondsToUniverse getKeyDefinitionCorrespondsToUniverse() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition.KeyDefinitionCorrespondsToUniverse target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition.KeyDefinitionCorrespondsToUniverse)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "KeyDefinition_correspondsTo_Universe" element
     */
    @Override
    public boolean isSetKeyDefinitionCorrespondsToUniverse() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "KeyDefinition_correspondsTo_Universe" element
     */
    @Override
    public void setKeyDefinitionCorrespondsToUniverse(org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition.KeyDefinitionCorrespondsToUniverse keyDefinitionCorrespondsToUniverse) {
        generatedSetterHelperImpl(keyDefinitionCorrespondsToUniverse, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "KeyDefinition_correspondsTo_Universe" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition.KeyDefinitionCorrespondsToUniverse addNewKeyDefinitionCorrespondsToUniverse() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition.KeyDefinitionCorrespondsToUniverse target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition.KeyDefinitionCorrespondsToUniverse)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "KeyDefinition_correspondsTo_Universe" element
     */
    @Override
    public void unsetKeyDefinitionCorrespondsToUniverse() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets the "KeyDefinition_correspondsTo_Unit" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition.KeyDefinitionCorrespondsToUnit getKeyDefinitionCorrespondsToUnit() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition.KeyDefinitionCorrespondsToUnit target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition.KeyDefinitionCorrespondsToUnit)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "KeyDefinition_correspondsTo_Unit" element
     */
    @Override
    public boolean isSetKeyDefinitionCorrespondsToUnit() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "KeyDefinition_correspondsTo_Unit" element
     */
    @Override
    public void setKeyDefinitionCorrespondsToUnit(org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition.KeyDefinitionCorrespondsToUnit keyDefinitionCorrespondsToUnit) {
        generatedSetterHelperImpl(keyDefinitionCorrespondsToUnit, PROPERTY_QNAME[2], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "KeyDefinition_correspondsTo_Unit" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition.KeyDefinitionCorrespondsToUnit addNewKeyDefinitionCorrespondsToUnit() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition.KeyDefinitionCorrespondsToUnit target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition.KeyDefinitionCorrespondsToUnit)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Unsets the "KeyDefinition_correspondsTo_Unit" element
     */
    @Override
    public void unsetKeyDefinitionCorrespondsToUnit() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }

    /**
     * Gets a List of "KeyDefinition_has_KeyDefinitionMember" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition.KeyDefinitionHasKeyDefinitionMember> getKeyDefinitionHasKeyDefinitionMemberList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getKeyDefinitionHasKeyDefinitionMemberArray,
                this::setKeyDefinitionHasKeyDefinitionMemberArray,
                this::insertNewKeyDefinitionHasKeyDefinitionMember,
                this::removeKeyDefinitionHasKeyDefinitionMember,
                this::sizeOfKeyDefinitionHasKeyDefinitionMemberArray
            );
        }
    }

    /**
     * Gets array of all "KeyDefinition_has_KeyDefinitionMember" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition.KeyDefinitionHasKeyDefinitionMember[] getKeyDefinitionHasKeyDefinitionMemberArray() {
        return getXmlObjectArray(PROPERTY_QNAME[3], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition.KeyDefinitionHasKeyDefinitionMember[0]);
    }

    /**
     * Gets ith "KeyDefinition_has_KeyDefinitionMember" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition.KeyDefinitionHasKeyDefinitionMember getKeyDefinitionHasKeyDefinitionMemberArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition.KeyDefinitionHasKeyDefinitionMember target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition.KeyDefinitionHasKeyDefinitionMember)get_store().find_element_user(PROPERTY_QNAME[3], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "KeyDefinition_has_KeyDefinitionMember" element
     */
    @Override
    public int sizeOfKeyDefinitionHasKeyDefinitionMemberArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Sets array of all "KeyDefinition_has_KeyDefinitionMember" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setKeyDefinitionHasKeyDefinitionMemberArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition.KeyDefinitionHasKeyDefinitionMember[] keyDefinitionHasKeyDefinitionMemberArray) {
        check_orphaned();
        arraySetterHelper(keyDefinitionHasKeyDefinitionMemberArray, PROPERTY_QNAME[3]);
    }

    /**
     * Sets ith "KeyDefinition_has_KeyDefinitionMember" element
     */
    @Override
    public void setKeyDefinitionHasKeyDefinitionMemberArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition.KeyDefinitionHasKeyDefinitionMember keyDefinitionHasKeyDefinitionMember) {
        generatedSetterHelperImpl(keyDefinitionHasKeyDefinitionMember, PROPERTY_QNAME[3], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "KeyDefinition_has_KeyDefinitionMember" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition.KeyDefinitionHasKeyDefinitionMember insertNewKeyDefinitionHasKeyDefinitionMember(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition.KeyDefinitionHasKeyDefinitionMember target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition.KeyDefinitionHasKeyDefinitionMember)get_store().insert_element_user(PROPERTY_QNAME[3], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "KeyDefinition_has_KeyDefinitionMember" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition.KeyDefinitionHasKeyDefinitionMember addNewKeyDefinitionHasKeyDefinitionMember() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition.KeyDefinitionHasKeyDefinitionMember target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition.KeyDefinitionHasKeyDefinitionMember)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Removes the ith "KeyDefinition_has_KeyDefinitionMember" element
     */
    @Override
    public void removeKeyDefinitionHasKeyDefinitionMember(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], i);
        }
    }
    /**
     * An XML KeyDefinition_correspondsTo_Universe(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class KeyDefinitionCorrespondsToUniverseImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition.KeyDefinitionCorrespondsToUniverse {
        private static final long serialVersionUID = 1L;

        public KeyDefinitionCorrespondsToUniverseImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition$KeyDefinitionCorrespondsToUniverse$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition.KeyDefinitionCorrespondsToUniverse.ValidType {
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
     * An XML KeyDefinition_correspondsTo_Unit(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class KeyDefinitionCorrespondsToUnitImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition.KeyDefinitionCorrespondsToUnit {
        private static final long serialVersionUID = 1L;

        public KeyDefinitionCorrespondsToUnitImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition$KeyDefinitionCorrespondsToUnit$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition.KeyDefinitionCorrespondsToUnit.ValidType {
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
     * An XML KeyDefinition_has_KeyDefinitionMember(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class KeyDefinitionHasKeyDefinitionMemberImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition.KeyDefinitionHasKeyDefinitionMember {
        private static final long serialVersionUID = 1L;

        public KeyDefinitionHasKeyDefinitionMemberImpl(org.apache.xmlbeans.SchemaType sType) {
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition$KeyDefinitionHasKeyDefinitionMember$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition.KeyDefinitionHasKeyDefinitionMember.ValidType {
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
