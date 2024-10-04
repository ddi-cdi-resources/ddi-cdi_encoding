/*
 * XML Type:  DataPointRelationship
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML DataPointRelationship(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class DataPointRelationshipImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship {
    private static final long serialVersionUID = 1L;

    public DataPointRelationshipImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "identifier"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "semantics"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "DataPointRelationship_hasTarget_DataPoint"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "DataPointRelationship_hasSource_DataPoint"),
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
     * Gets the "semantics" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getSemantics() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "semantics" element
     */
    @Override
    public boolean isSetSemantics() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "semantics" element
     */
    @Override
    public void setSemantics(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry semantics) {
        generatedSetterHelperImpl(semantics, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "semantics" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewSemantics() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "semantics" element
     */
    @Override
    public void unsetSemantics() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets a List of "DataPointRelationship_hasTarget_DataPoint" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship.DataPointRelationshipHasTargetDataPoint> getDataPointRelationshipHasTargetDataPointList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getDataPointRelationshipHasTargetDataPointArray,
                this::setDataPointRelationshipHasTargetDataPointArray,
                this::insertNewDataPointRelationshipHasTargetDataPoint,
                this::removeDataPointRelationshipHasTargetDataPoint,
                this::sizeOfDataPointRelationshipHasTargetDataPointArray
            );
        }
    }

    /**
     * Gets array of all "DataPointRelationship_hasTarget_DataPoint" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship.DataPointRelationshipHasTargetDataPoint[] getDataPointRelationshipHasTargetDataPointArray() {
        return getXmlObjectArray(PROPERTY_QNAME[2], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship.DataPointRelationshipHasTargetDataPoint[0]);
    }

    /**
     * Gets ith "DataPointRelationship_hasTarget_DataPoint" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship.DataPointRelationshipHasTargetDataPoint getDataPointRelationshipHasTargetDataPointArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship.DataPointRelationshipHasTargetDataPoint target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship.DataPointRelationshipHasTargetDataPoint)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "DataPointRelationship_hasTarget_DataPoint" element
     */
    @Override
    public int sizeOfDataPointRelationshipHasTargetDataPointArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Sets array of all "DataPointRelationship_hasTarget_DataPoint" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setDataPointRelationshipHasTargetDataPointArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship.DataPointRelationshipHasTargetDataPoint[] dataPointRelationshipHasTargetDataPointArray) {
        check_orphaned();
        arraySetterHelper(dataPointRelationshipHasTargetDataPointArray, PROPERTY_QNAME[2]);
    }

    /**
     * Sets ith "DataPointRelationship_hasTarget_DataPoint" element
     */
    @Override
    public void setDataPointRelationshipHasTargetDataPointArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship.DataPointRelationshipHasTargetDataPoint dataPointRelationshipHasTargetDataPoint) {
        generatedSetterHelperImpl(dataPointRelationshipHasTargetDataPoint, PROPERTY_QNAME[2], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataPointRelationship_hasTarget_DataPoint" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship.DataPointRelationshipHasTargetDataPoint insertNewDataPointRelationshipHasTargetDataPoint(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship.DataPointRelationshipHasTargetDataPoint target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship.DataPointRelationshipHasTargetDataPoint)get_store().insert_element_user(PROPERTY_QNAME[2], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "DataPointRelationship_hasTarget_DataPoint" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship.DataPointRelationshipHasTargetDataPoint addNewDataPointRelationshipHasTargetDataPoint() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship.DataPointRelationshipHasTargetDataPoint target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship.DataPointRelationshipHasTargetDataPoint)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Removes the ith "DataPointRelationship_hasTarget_DataPoint" element
     */
    @Override
    public void removeDataPointRelationshipHasTargetDataPoint(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], i);
        }
    }

    /**
     * Gets a List of "DataPointRelationship_hasSource_DataPoint" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship.DataPointRelationshipHasSourceDataPoint> getDataPointRelationshipHasSourceDataPointList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getDataPointRelationshipHasSourceDataPointArray,
                this::setDataPointRelationshipHasSourceDataPointArray,
                this::insertNewDataPointRelationshipHasSourceDataPoint,
                this::removeDataPointRelationshipHasSourceDataPoint,
                this::sizeOfDataPointRelationshipHasSourceDataPointArray
            );
        }
    }

    /**
     * Gets array of all "DataPointRelationship_hasSource_DataPoint" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship.DataPointRelationshipHasSourceDataPoint[] getDataPointRelationshipHasSourceDataPointArray() {
        return getXmlObjectArray(PROPERTY_QNAME[3], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship.DataPointRelationshipHasSourceDataPoint[0]);
    }

    /**
     * Gets ith "DataPointRelationship_hasSource_DataPoint" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship.DataPointRelationshipHasSourceDataPoint getDataPointRelationshipHasSourceDataPointArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship.DataPointRelationshipHasSourceDataPoint target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship.DataPointRelationshipHasSourceDataPoint)get_store().find_element_user(PROPERTY_QNAME[3], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "DataPointRelationship_hasSource_DataPoint" element
     */
    @Override
    public int sizeOfDataPointRelationshipHasSourceDataPointArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Sets array of all "DataPointRelationship_hasSource_DataPoint" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setDataPointRelationshipHasSourceDataPointArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship.DataPointRelationshipHasSourceDataPoint[] dataPointRelationshipHasSourceDataPointArray) {
        check_orphaned();
        arraySetterHelper(dataPointRelationshipHasSourceDataPointArray, PROPERTY_QNAME[3]);
    }

    /**
     * Sets ith "DataPointRelationship_hasSource_DataPoint" element
     */
    @Override
    public void setDataPointRelationshipHasSourceDataPointArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship.DataPointRelationshipHasSourceDataPoint dataPointRelationshipHasSourceDataPoint) {
        generatedSetterHelperImpl(dataPointRelationshipHasSourceDataPoint, PROPERTY_QNAME[3], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataPointRelationship_hasSource_DataPoint" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship.DataPointRelationshipHasSourceDataPoint insertNewDataPointRelationshipHasSourceDataPoint(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship.DataPointRelationshipHasSourceDataPoint target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship.DataPointRelationshipHasSourceDataPoint)get_store().insert_element_user(PROPERTY_QNAME[3], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "DataPointRelationship_hasSource_DataPoint" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship.DataPointRelationshipHasSourceDataPoint addNewDataPointRelationshipHasSourceDataPoint() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship.DataPointRelationshipHasSourceDataPoint target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship.DataPointRelationshipHasSourceDataPoint)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Removes the ith "DataPointRelationship_hasSource_DataPoint" element
     */
    @Override
    public void removeDataPointRelationshipHasSourceDataPoint(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], i);
        }
    }
    /**
     * An XML DataPointRelationship_hasTarget_DataPoint(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class DataPointRelationshipHasTargetDataPointImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.ReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship.DataPointRelationshipHasTargetDataPoint {
        private static final long serialVersionUID = 1L;

        public DataPointRelationshipHasTargetDataPointImpl(org.apache.xmlbeans.SchemaType sType) {
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship$DataPointRelationshipHasTargetDataPoint$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship.DataPointRelationshipHasTargetDataPoint.ValidType {
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
     * An XML DataPointRelationship_hasSource_DataPoint(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class DataPointRelationshipHasSourceDataPointImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.ReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship.DataPointRelationshipHasSourceDataPoint {
        private static final long serialVersionUID = 1L;

        public DataPointRelationshipHasSourceDataPointImpl(org.apache.xmlbeans.SchemaType sType) {
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship$DataPointRelationshipHasSourceDataPoint$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship.DataPointRelationshipHasSourceDataPoint.ValidType {
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
