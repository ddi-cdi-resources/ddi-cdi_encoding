/*
 * XML Type:  Descriptor
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML Descriptor(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class DescriptorImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.KeyMemberImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor {
    private static final long serialVersionUID = 1L;

    public DescriptorImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "Descriptor_refersTo_ReferenceValue"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "Descriptor_identifies_ReferenceVariable"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "Descriptor_hasValueFrom_DescriptorValueDomain"),
    };


    /**
     * Gets a List of "Descriptor_refersTo_ReferenceValue" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor.DescriptorRefersToReferenceValue> getDescriptorRefersToReferenceValueList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getDescriptorRefersToReferenceValueArray,
                this::setDescriptorRefersToReferenceValueArray,
                this::insertNewDescriptorRefersToReferenceValue,
                this::removeDescriptorRefersToReferenceValue,
                this::sizeOfDescriptorRefersToReferenceValueArray
            );
        }
    }

    /**
     * Gets array of all "Descriptor_refersTo_ReferenceValue" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor.DescriptorRefersToReferenceValue[] getDescriptorRefersToReferenceValueArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor.DescriptorRefersToReferenceValue[0]);
    }

    /**
     * Gets ith "Descriptor_refersTo_ReferenceValue" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor.DescriptorRefersToReferenceValue getDescriptorRefersToReferenceValueArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor.DescriptorRefersToReferenceValue target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor.DescriptorRefersToReferenceValue)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Descriptor_refersTo_ReferenceValue" element
     */
    @Override
    public int sizeOfDescriptorRefersToReferenceValueArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "Descriptor_refersTo_ReferenceValue" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setDescriptorRefersToReferenceValueArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor.DescriptorRefersToReferenceValue[] descriptorRefersToReferenceValueArray) {
        check_orphaned();
        arraySetterHelper(descriptorRefersToReferenceValueArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "Descriptor_refersTo_ReferenceValue" element
     */
    @Override
    public void setDescriptorRefersToReferenceValueArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor.DescriptorRefersToReferenceValue descriptorRefersToReferenceValue) {
        generatedSetterHelperImpl(descriptorRefersToReferenceValue, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Descriptor_refersTo_ReferenceValue" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor.DescriptorRefersToReferenceValue insertNewDescriptorRefersToReferenceValue(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor.DescriptorRefersToReferenceValue target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor.DescriptorRefersToReferenceValue)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Descriptor_refersTo_ReferenceValue" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor.DescriptorRefersToReferenceValue addNewDescriptorRefersToReferenceValue() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor.DescriptorRefersToReferenceValue target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor.DescriptorRefersToReferenceValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "Descriptor_refersTo_ReferenceValue" element
     */
    @Override
    public void removeDescriptorRefersToReferenceValue(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }

    /**
     * Gets the "Descriptor_identifies_ReferenceVariable" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor.DescriptorIdentifiesReferenceVariable getDescriptorIdentifiesReferenceVariable() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor.DescriptorIdentifiesReferenceVariable target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor.DescriptorIdentifiesReferenceVariable)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "Descriptor_identifies_ReferenceVariable" element
     */
    @Override
    public void setDescriptorIdentifiesReferenceVariable(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor.DescriptorIdentifiesReferenceVariable descriptorIdentifiesReferenceVariable) {
        generatedSetterHelperImpl(descriptorIdentifiesReferenceVariable, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Descriptor_identifies_ReferenceVariable" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor.DescriptorIdentifiesReferenceVariable addNewDescriptorIdentifiesReferenceVariable() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor.DescriptorIdentifiesReferenceVariable target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor.DescriptorIdentifiesReferenceVariable)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Gets the "Descriptor_hasValueFrom_DescriptorValueDomain" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor.DescriptorHasValueFromDescriptorValueDomain getDescriptorHasValueFromDescriptorValueDomain() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor.DescriptorHasValueFromDescriptorValueDomain target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor.DescriptorHasValueFromDescriptorValueDomain)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "Descriptor_hasValueFrom_DescriptorValueDomain" element
     */
    @Override
    public void setDescriptorHasValueFromDescriptorValueDomain(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor.DescriptorHasValueFromDescriptorValueDomain descriptorHasValueFromDescriptorValueDomain) {
        generatedSetterHelperImpl(descriptorHasValueFromDescriptorValueDomain, PROPERTY_QNAME[2], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Descriptor_hasValueFrom_DescriptorValueDomain" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor.DescriptorHasValueFromDescriptorValueDomain addNewDescriptorHasValueFromDescriptorValueDomain() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor.DescriptorHasValueFromDescriptorValueDomain target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor.DescriptorHasValueFromDescriptorValueDomain)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }
    /**
     * An XML Descriptor_refersTo_ReferenceValue(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class DescriptorRefersToReferenceValueImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.ReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor.DescriptorRefersToReferenceValue {
        private static final long serialVersionUID = 1L;

        public DescriptorRefersToReferenceValueImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }

        private static final QName[] PROPERTY_QNAME = {
            new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "validType"),
            new QName("", "isAssociationReference"),
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
         * Gets the "isAssociationReference" attribute
         */
        @Override
        public boolean getIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[1]);
                }
                return (target == null) ? false : target.getBooleanValue();
            }
        }

        /**
         * Gets (as xml) the "isAssociationReference" attribute
         */
        @Override
        public org.apache.xmlbeans.XmlBoolean xgetIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[1]);
                if (target == null) {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PROPERTY_QNAME[1]);
                }
                return target;
            }
        }

        /**
         * True if has "isAssociationReference" attribute
         */
        @Override
        public boolean isSetIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().find_attribute_user(PROPERTY_QNAME[1]) != null;
            }
        }

        /**
         * Sets the "isAssociationReference" attribute
         */
        @Override
        public void setIsAssociationReference(boolean isAssociationReference) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
                }
                target.setBooleanValue(isAssociationReference);
            }
        }

        /**
         * Sets (as xml) the "isAssociationReference" attribute
         */
        @Override
        public void xsetIsAssociationReference(org.apache.xmlbeans.XmlBoolean isAssociationReference) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[1]);
                if (target == null) {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[1]);
                }
                target.set(isAssociationReference);
            }
        }

        /**
         * Unsets the "isAssociationReference" attribute
         */
        @Override
        public void unsetIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_attribute(PROPERTY_QNAME[1]);
            }
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor$DescriptorRefersToReferenceValue$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor.DescriptorRefersToReferenceValue.ValidType {
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
     * An XML Descriptor_identifies_ReferenceVariable(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class DescriptorIdentifiesReferenceVariableImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.ReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor.DescriptorIdentifiesReferenceVariable {
        private static final long serialVersionUID = 1L;

        public DescriptorIdentifiesReferenceVariableImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }

        private static final QName[] PROPERTY_QNAME = {
            new QName("", "isAssociationReference"),
        };


        /**
         * Gets the "isAssociationReference" attribute
         */
        @Override
        public boolean getIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[0]);
                }
                return (target == null) ? false : target.getBooleanValue();
            }
        }

        /**
         * Gets (as xml) the "isAssociationReference" attribute
         */
        @Override
        public org.apache.xmlbeans.XmlBoolean xgetIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PROPERTY_QNAME[0]);
                }
                return target;
            }
        }

        /**
         * True if has "isAssociationReference" attribute
         */
        @Override
        public boolean isSetIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
            }
        }

        /**
         * Sets the "isAssociationReference" attribute
         */
        @Override
        public void setIsAssociationReference(boolean isAssociationReference) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
                }
                target.setBooleanValue(isAssociationReference);
            }
        }

        /**
         * Sets (as xml) the "isAssociationReference" attribute
         */
        @Override
        public void xsetIsAssociationReference(org.apache.xmlbeans.XmlBoolean isAssociationReference) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[0]);
                }
                target.set(isAssociationReference);
            }
        }

        /**
         * Unsets the "isAssociationReference" attribute
         */
        @Override
        public void unsetIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_attribute(PROPERTY_QNAME[0]);
            }
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor$DescriptorIdentifiesReferenceVariable$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor.DescriptorIdentifiesReferenceVariable.ValidType {
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
     * An XML Descriptor_hasValueFrom_DescriptorValueDomain(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class DescriptorHasValueFromDescriptorValueDomainImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.ReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor.DescriptorHasValueFromDescriptorValueDomain {
        private static final long serialVersionUID = 1L;

        public DescriptorHasValueFromDescriptorValueDomainImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }

        private static final QName[] PROPERTY_QNAME = {
            new QName("", "isAssociationReference"),
        };


        /**
         * Gets the "isAssociationReference" attribute
         */
        @Override
        public boolean getIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[0]);
                }
                return (target == null) ? false : target.getBooleanValue();
            }
        }

        /**
         * Gets (as xml) the "isAssociationReference" attribute
         */
        @Override
        public org.apache.xmlbeans.XmlBoolean xgetIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PROPERTY_QNAME[0]);
                }
                return target;
            }
        }

        /**
         * True if has "isAssociationReference" attribute
         */
        @Override
        public boolean isSetIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
            }
        }

        /**
         * Sets the "isAssociationReference" attribute
         */
        @Override
        public void setIsAssociationReference(boolean isAssociationReference) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
                }
                target.setBooleanValue(isAssociationReference);
            }
        }

        /**
         * Sets (as xml) the "isAssociationReference" attribute
         */
        @Override
        public void xsetIsAssociationReference(org.apache.xmlbeans.XmlBoolean isAssociationReference) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[0]);
                }
                target.set(isAssociationReference);
            }
        }

        /**
         * Unsets the "isAssociationReference" attribute
         */
        @Override
        public void unsetIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_attribute(PROPERTY_QNAME[0]);
            }
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor$DescriptorHasValueFromDescriptorValueDomain$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor.DescriptorHasValueFromDescriptorValueDomain.ValidType {
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
