/*
 * XML Type:  StatisticalClassificationRelationship
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML StatisticalClassificationRelationship(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class StatisticalClassificationRelationshipImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship {
    private static final long serialVersionUID = 1L;

    public StatisticalClassificationRelationshipImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "identifier"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "semantics"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "StatisticalClassificationRelationship_hasTarget_StatisticalClassification"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "StatisticalClassificationRelationship_hasSource_StatisticalClassification"),
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
     * Gets a List of "StatisticalClassificationRelationship_hasTarget_StatisticalClassification" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship.StatisticalClassificationRelationshipHasTargetStatisticalClassification> getStatisticalClassificationRelationshipHasTargetStatisticalClassificationList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getStatisticalClassificationRelationshipHasTargetStatisticalClassificationArray,
                this::setStatisticalClassificationRelationshipHasTargetStatisticalClassificationArray,
                this::insertNewStatisticalClassificationRelationshipHasTargetStatisticalClassification,
                this::removeStatisticalClassificationRelationshipHasTargetStatisticalClassification,
                this::sizeOfStatisticalClassificationRelationshipHasTargetStatisticalClassificationArray
            );
        }
    }

    /**
     * Gets array of all "StatisticalClassificationRelationship_hasTarget_StatisticalClassification" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship.StatisticalClassificationRelationshipHasTargetStatisticalClassification[] getStatisticalClassificationRelationshipHasTargetStatisticalClassificationArray() {
        return getXmlObjectArray(PROPERTY_QNAME[2], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship.StatisticalClassificationRelationshipHasTargetStatisticalClassification[0]);
    }

    /**
     * Gets ith "StatisticalClassificationRelationship_hasTarget_StatisticalClassification" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship.StatisticalClassificationRelationshipHasTargetStatisticalClassification getStatisticalClassificationRelationshipHasTargetStatisticalClassificationArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship.StatisticalClassificationRelationshipHasTargetStatisticalClassification target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship.StatisticalClassificationRelationshipHasTargetStatisticalClassification)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "StatisticalClassificationRelationship_hasTarget_StatisticalClassification" element
     */
    @Override
    public int sizeOfStatisticalClassificationRelationshipHasTargetStatisticalClassificationArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Sets array of all "StatisticalClassificationRelationship_hasTarget_StatisticalClassification" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setStatisticalClassificationRelationshipHasTargetStatisticalClassificationArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship.StatisticalClassificationRelationshipHasTargetStatisticalClassification[] statisticalClassificationRelationshipHasTargetStatisticalClassificationArray) {
        check_orphaned();
        arraySetterHelper(statisticalClassificationRelationshipHasTargetStatisticalClassificationArray, PROPERTY_QNAME[2]);
    }

    /**
     * Sets ith "StatisticalClassificationRelationship_hasTarget_StatisticalClassification" element
     */
    @Override
    public void setStatisticalClassificationRelationshipHasTargetStatisticalClassificationArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship.StatisticalClassificationRelationshipHasTargetStatisticalClassification statisticalClassificationRelationshipHasTargetStatisticalClassification) {
        generatedSetterHelperImpl(statisticalClassificationRelationshipHasTargetStatisticalClassification, PROPERTY_QNAME[2], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "StatisticalClassificationRelationship_hasTarget_StatisticalClassification" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship.StatisticalClassificationRelationshipHasTargetStatisticalClassification insertNewStatisticalClassificationRelationshipHasTargetStatisticalClassification(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship.StatisticalClassificationRelationshipHasTargetStatisticalClassification target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship.StatisticalClassificationRelationshipHasTargetStatisticalClassification)get_store().insert_element_user(PROPERTY_QNAME[2], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "StatisticalClassificationRelationship_hasTarget_StatisticalClassification" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship.StatisticalClassificationRelationshipHasTargetStatisticalClassification addNewStatisticalClassificationRelationshipHasTargetStatisticalClassification() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship.StatisticalClassificationRelationshipHasTargetStatisticalClassification target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship.StatisticalClassificationRelationshipHasTargetStatisticalClassification)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Removes the ith "StatisticalClassificationRelationship_hasTarget_StatisticalClassification" element
     */
    @Override
    public void removeStatisticalClassificationRelationshipHasTargetStatisticalClassification(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], i);
        }
    }

    /**
     * Gets a List of "StatisticalClassificationRelationship_hasSource_StatisticalClassification" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship.StatisticalClassificationRelationshipHasSourceStatisticalClassification> getStatisticalClassificationRelationshipHasSourceStatisticalClassificationList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getStatisticalClassificationRelationshipHasSourceStatisticalClassificationArray,
                this::setStatisticalClassificationRelationshipHasSourceStatisticalClassificationArray,
                this::insertNewStatisticalClassificationRelationshipHasSourceStatisticalClassification,
                this::removeStatisticalClassificationRelationshipHasSourceStatisticalClassification,
                this::sizeOfStatisticalClassificationRelationshipHasSourceStatisticalClassificationArray
            );
        }
    }

    /**
     * Gets array of all "StatisticalClassificationRelationship_hasSource_StatisticalClassification" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship.StatisticalClassificationRelationshipHasSourceStatisticalClassification[] getStatisticalClassificationRelationshipHasSourceStatisticalClassificationArray() {
        return getXmlObjectArray(PROPERTY_QNAME[3], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship.StatisticalClassificationRelationshipHasSourceStatisticalClassification[0]);
    }

    /**
     * Gets ith "StatisticalClassificationRelationship_hasSource_StatisticalClassification" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship.StatisticalClassificationRelationshipHasSourceStatisticalClassification getStatisticalClassificationRelationshipHasSourceStatisticalClassificationArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship.StatisticalClassificationRelationshipHasSourceStatisticalClassification target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship.StatisticalClassificationRelationshipHasSourceStatisticalClassification)get_store().find_element_user(PROPERTY_QNAME[3], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "StatisticalClassificationRelationship_hasSource_StatisticalClassification" element
     */
    @Override
    public int sizeOfStatisticalClassificationRelationshipHasSourceStatisticalClassificationArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Sets array of all "StatisticalClassificationRelationship_hasSource_StatisticalClassification" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setStatisticalClassificationRelationshipHasSourceStatisticalClassificationArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship.StatisticalClassificationRelationshipHasSourceStatisticalClassification[] statisticalClassificationRelationshipHasSourceStatisticalClassificationArray) {
        check_orphaned();
        arraySetterHelper(statisticalClassificationRelationshipHasSourceStatisticalClassificationArray, PROPERTY_QNAME[3]);
    }

    /**
     * Sets ith "StatisticalClassificationRelationship_hasSource_StatisticalClassification" element
     */
    @Override
    public void setStatisticalClassificationRelationshipHasSourceStatisticalClassificationArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship.StatisticalClassificationRelationshipHasSourceStatisticalClassification statisticalClassificationRelationshipHasSourceStatisticalClassification) {
        generatedSetterHelperImpl(statisticalClassificationRelationshipHasSourceStatisticalClassification, PROPERTY_QNAME[3], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "StatisticalClassificationRelationship_hasSource_StatisticalClassification" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship.StatisticalClassificationRelationshipHasSourceStatisticalClassification insertNewStatisticalClassificationRelationshipHasSourceStatisticalClassification(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship.StatisticalClassificationRelationshipHasSourceStatisticalClassification target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship.StatisticalClassificationRelationshipHasSourceStatisticalClassification)get_store().insert_element_user(PROPERTY_QNAME[3], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "StatisticalClassificationRelationship_hasSource_StatisticalClassification" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship.StatisticalClassificationRelationshipHasSourceStatisticalClassification addNewStatisticalClassificationRelationshipHasSourceStatisticalClassification() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship.StatisticalClassificationRelationshipHasSourceStatisticalClassification target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship.StatisticalClassificationRelationshipHasSourceStatisticalClassification)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Removes the ith "StatisticalClassificationRelationship_hasSource_StatisticalClassification" element
     */
    @Override
    public void removeStatisticalClassificationRelationshipHasSourceStatisticalClassification(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], i);
        }
    }
    /**
     * An XML StatisticalClassificationRelationship_hasTarget_StatisticalClassification(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class StatisticalClassificationRelationshipHasTargetStatisticalClassificationImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.ReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship.StatisticalClassificationRelationshipHasTargetStatisticalClassification {
        private static final long serialVersionUID = 1L;

        public StatisticalClassificationRelationshipHasTargetStatisticalClassificationImpl(org.apache.xmlbeans.SchemaType sType) {
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship$StatisticalClassificationRelationshipHasTargetStatisticalClassification$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship.StatisticalClassificationRelationshipHasTargetStatisticalClassification.ValidType {
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
     * An XML StatisticalClassificationRelationship_hasSource_StatisticalClassification(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class StatisticalClassificationRelationshipHasSourceStatisticalClassificationImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.ReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship.StatisticalClassificationRelationshipHasSourceStatisticalClassification {
        private static final long serialVersionUID = 1L;

        public StatisticalClassificationRelationshipHasSourceStatisticalClassificationImpl(org.apache.xmlbeans.SchemaType sType) {
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship$StatisticalClassificationRelationshipHasSourceStatisticalClassification$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship.StatisticalClassificationRelationshipHasSourceStatisticalClassification.ValidType {
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
