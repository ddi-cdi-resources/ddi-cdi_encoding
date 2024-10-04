/*
 * XML Type:  VariableDescriptorComponent
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableDescriptorComponent
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML VariableDescriptorComponent(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class VariableDescriptorComponentImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.DataStructureComponentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableDescriptorComponent {
    private static final long serialVersionUID = 1L;

    public VariableDescriptorComponentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "VariableDescriptorComponent_isDefinedBy_DescriptorVariable"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "VariableDescriptorComponent_refersTo_VariableValueComponent"),
    };


    /**
     * Gets the "VariableDescriptorComponent_isDefinedBy_DescriptorVariable" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableDescriptorComponent.VariableDescriptorComponentIsDefinedByDescriptorVariable getVariableDescriptorComponentIsDefinedByDescriptorVariable() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableDescriptorComponent.VariableDescriptorComponentIsDefinedByDescriptorVariable target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableDescriptorComponent.VariableDescriptorComponentIsDefinedByDescriptorVariable)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "VariableDescriptorComponent_isDefinedBy_DescriptorVariable" element
     */
    @Override
    public boolean isSetVariableDescriptorComponentIsDefinedByDescriptorVariable() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "VariableDescriptorComponent_isDefinedBy_DescriptorVariable" element
     */
    @Override
    public void setVariableDescriptorComponentIsDefinedByDescriptorVariable(org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableDescriptorComponent.VariableDescriptorComponentIsDefinedByDescriptorVariable variableDescriptorComponentIsDefinedByDescriptorVariable) {
        generatedSetterHelperImpl(variableDescriptorComponentIsDefinedByDescriptorVariable, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "VariableDescriptorComponent_isDefinedBy_DescriptorVariable" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableDescriptorComponent.VariableDescriptorComponentIsDefinedByDescriptorVariable addNewVariableDescriptorComponentIsDefinedByDescriptorVariable() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableDescriptorComponent.VariableDescriptorComponentIsDefinedByDescriptorVariable target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableDescriptorComponent.VariableDescriptorComponentIsDefinedByDescriptorVariable)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "VariableDescriptorComponent_isDefinedBy_DescriptorVariable" element
     */
    @Override
    public void unsetVariableDescriptorComponentIsDefinedByDescriptorVariable() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "VariableDescriptorComponent_refersTo_VariableValueComponent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableDescriptorComponent.VariableDescriptorComponentRefersToVariableValueComponent getVariableDescriptorComponentRefersToVariableValueComponent() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableDescriptorComponent.VariableDescriptorComponentRefersToVariableValueComponent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableDescriptorComponent.VariableDescriptorComponentRefersToVariableValueComponent)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "VariableDescriptorComponent_refersTo_VariableValueComponent" element
     */
    @Override
    public void setVariableDescriptorComponentRefersToVariableValueComponent(org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableDescriptorComponent.VariableDescriptorComponentRefersToVariableValueComponent variableDescriptorComponentRefersToVariableValueComponent) {
        generatedSetterHelperImpl(variableDescriptorComponentRefersToVariableValueComponent, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "VariableDescriptorComponent_refersTo_VariableValueComponent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableDescriptorComponent.VariableDescriptorComponentRefersToVariableValueComponent addNewVariableDescriptorComponentRefersToVariableValueComponent() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableDescriptorComponent.VariableDescriptorComponentRefersToVariableValueComponent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableDescriptorComponent.VariableDescriptorComponentRefersToVariableValueComponent)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }
    /**
     * An XML VariableDescriptorComponent_isDefinedBy_DescriptorVariable(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class VariableDescriptorComponentIsDefinedByDescriptorVariableImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableDescriptorComponent.VariableDescriptorComponentIsDefinedByDescriptorVariable {
        private static final long serialVersionUID = 1L;

        public VariableDescriptorComponentIsDefinedByDescriptorVariableImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableDescriptorComponent$VariableDescriptorComponentIsDefinedByDescriptorVariable$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableDescriptorComponent.VariableDescriptorComponentIsDefinedByDescriptorVariable.ValidType {
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
     * An XML VariableDescriptorComponent_refersTo_VariableValueComponent(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class VariableDescriptorComponentRefersToVariableValueComponentImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableDescriptorComponent.VariableDescriptorComponentRefersToVariableValueComponent {
        private static final long serialVersionUID = 1L;

        public VariableDescriptorComponentRefersToVariableValueComponentImpl(org.apache.xmlbeans.SchemaType sType) {
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableDescriptorComponent$VariableDescriptorComponentRefersToVariableValueComponent$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableDescriptorComponent.VariableDescriptorComponentRefersToVariableValueComponent.ValidType {
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
