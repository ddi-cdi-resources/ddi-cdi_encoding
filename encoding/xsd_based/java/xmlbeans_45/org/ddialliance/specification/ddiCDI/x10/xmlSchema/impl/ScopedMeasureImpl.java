/*
 * XML Type:  ScopedMeasure
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML ScopedMeasure(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class ScopedMeasureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure {
    private static final long serialVersionUID = 1L;

    public ScopedMeasureImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "frequency"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "identifier"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ScopedMeasure_circumscribes_DimensionalKeyDefinition"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ScopedMeasure_restricts_QualifiedMeasure"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ScopedMeasure_generates_RevisableDatum"),
    };


    /**
     * Gets the "frequency" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getFrequency() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "frequency" element
     */
    @Override
    public boolean isSetFrequency() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "frequency" element
     */
    @Override
    public void setFrequency(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString frequency) {
        generatedSetterHelperImpl(frequency, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "frequency" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewFrequency() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "frequency" element
     */
    @Override
    public void unsetFrequency() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "identifier" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier getIdentifier() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier)get_store().find_element_user(PROPERTY_QNAME[1], 0);
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
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "identifier" element
     */
    @Override
    public void setIdentifier(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier identifier) {
        generatedSetterHelperImpl(identifier, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "identifier" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier addNewIdentifier() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier)get_store().add_element_user(PROPERTY_QNAME[1]);
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
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets the "ScopedMeasure_circumscribes_DimensionalKeyDefinition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure.ScopedMeasureCircumscribesDimensionalKeyDefinition getScopedMeasureCircumscribesDimensionalKeyDefinition() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure.ScopedMeasureCircumscribesDimensionalKeyDefinition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure.ScopedMeasureCircumscribesDimensionalKeyDefinition)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "ScopedMeasure_circumscribes_DimensionalKeyDefinition" element
     */
    @Override
    public boolean isSetScopedMeasureCircumscribesDimensionalKeyDefinition() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "ScopedMeasure_circumscribes_DimensionalKeyDefinition" element
     */
    @Override
    public void setScopedMeasureCircumscribesDimensionalKeyDefinition(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure.ScopedMeasureCircumscribesDimensionalKeyDefinition scopedMeasureCircumscribesDimensionalKeyDefinition) {
        generatedSetterHelperImpl(scopedMeasureCircumscribesDimensionalKeyDefinition, PROPERTY_QNAME[2], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "ScopedMeasure_circumscribes_DimensionalKeyDefinition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure.ScopedMeasureCircumscribesDimensionalKeyDefinition addNewScopedMeasureCircumscribesDimensionalKeyDefinition() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure.ScopedMeasureCircumscribesDimensionalKeyDefinition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure.ScopedMeasureCircumscribesDimensionalKeyDefinition)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Unsets the "ScopedMeasure_circumscribes_DimensionalKeyDefinition" element
     */
    @Override
    public void unsetScopedMeasureCircumscribesDimensionalKeyDefinition() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }

    /**
     * Gets the "ScopedMeasure_restricts_QualifiedMeasure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure.ScopedMeasureRestrictsQualifiedMeasure getScopedMeasureRestrictsQualifiedMeasure() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure.ScopedMeasureRestrictsQualifiedMeasure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure.ScopedMeasureRestrictsQualifiedMeasure)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "ScopedMeasure_restricts_QualifiedMeasure" element
     */
    @Override
    public boolean isSetScopedMeasureRestrictsQualifiedMeasure() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]) != 0;
        }
    }

    /**
     * Sets the "ScopedMeasure_restricts_QualifiedMeasure" element
     */
    @Override
    public void setScopedMeasureRestrictsQualifiedMeasure(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure.ScopedMeasureRestrictsQualifiedMeasure scopedMeasureRestrictsQualifiedMeasure) {
        generatedSetterHelperImpl(scopedMeasureRestrictsQualifiedMeasure, PROPERTY_QNAME[3], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "ScopedMeasure_restricts_QualifiedMeasure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure.ScopedMeasureRestrictsQualifiedMeasure addNewScopedMeasureRestrictsQualifiedMeasure() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure.ScopedMeasureRestrictsQualifiedMeasure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure.ScopedMeasureRestrictsQualifiedMeasure)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Unsets the "ScopedMeasure_restricts_QualifiedMeasure" element
     */
    @Override
    public void unsetScopedMeasureRestrictsQualifiedMeasure() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], 0);
        }
    }

    /**
     * Gets the "ScopedMeasure_generates_RevisableDatum" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure.ScopedMeasureGeneratesRevisableDatum getScopedMeasureGeneratesRevisableDatum() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure.ScopedMeasureGeneratesRevisableDatum target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure.ScopedMeasureGeneratesRevisableDatum)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "ScopedMeasure_generates_RevisableDatum" element
     */
    @Override
    public void setScopedMeasureGeneratesRevisableDatum(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure.ScopedMeasureGeneratesRevisableDatum scopedMeasureGeneratesRevisableDatum) {
        generatedSetterHelperImpl(scopedMeasureGeneratesRevisableDatum, PROPERTY_QNAME[4], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "ScopedMeasure_generates_RevisableDatum" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure.ScopedMeasureGeneratesRevisableDatum addNewScopedMeasureGeneratesRevisableDatum() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure.ScopedMeasureGeneratesRevisableDatum target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure.ScopedMeasureGeneratesRevisableDatum)get_store().add_element_user(PROPERTY_QNAME[4]);
            return target;
        }
    }
    /**
     * An XML ScopedMeasure_circumscribes_DimensionalKeyDefinition(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class ScopedMeasureCircumscribesDimensionalKeyDefinitionImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure.ScopedMeasureCircumscribesDimensionalKeyDefinition {
        private static final long serialVersionUID = 1L;

        public ScopedMeasureCircumscribesDimensionalKeyDefinitionImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure$ScopedMeasureCircumscribesDimensionalKeyDefinition$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure.ScopedMeasureCircumscribesDimensionalKeyDefinition.ValidType {
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
     * An XML ScopedMeasure_restricts_QualifiedMeasure(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class ScopedMeasureRestrictsQualifiedMeasureImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure.ScopedMeasureRestrictsQualifiedMeasure {
        private static final long serialVersionUID = 1L;

        public ScopedMeasureRestrictsQualifiedMeasureImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure$ScopedMeasureRestrictsQualifiedMeasure$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure.ScopedMeasureRestrictsQualifiedMeasure.ValidType {
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
     * An XML ScopedMeasure_generates_RevisableDatum(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class ScopedMeasureGeneratesRevisableDatumImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure.ScopedMeasureGeneratesRevisableDatum {
        private static final long serialVersionUID = 1L;

        public ScopedMeasureGeneratesRevisableDatumImpl(org.apache.xmlbeans.SchemaType sType) {
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure$ScopedMeasureGeneratesRevisableDatum$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure.ScopedMeasureGeneratesRevisableDatum.ValidType {
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
