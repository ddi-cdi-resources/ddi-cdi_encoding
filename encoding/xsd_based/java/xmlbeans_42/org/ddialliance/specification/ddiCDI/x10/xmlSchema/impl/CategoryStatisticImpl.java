/*
 * XML Type:  CategoryStatistic
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CategoryStatistic(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class CategoryStatisticImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic {
    private static final long serialVersionUID = 1L;

    public CategoryStatisticImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "identifier"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "statistic"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "typeOfCategoryStatistic"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "CategoryStatistic_appliesTo_InstanceVariable"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "CategoryStatistic_for_Category"),
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
     * Gets a List of "statistic" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Statistic> getStatisticList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getStatisticArray,
                this::setStatisticArray,
                this::insertNewStatistic,
                this::removeStatistic,
                this::sizeOfStatisticArray
            );
        }
    }

    /**
     * Gets array of all "statistic" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Statistic[] getStatisticArray() {
        return getXmlObjectArray(PROPERTY_QNAME[1], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.Statistic[0]);
    }

    /**
     * Gets ith "statistic" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Statistic getStatisticArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Statistic target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Statistic)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "statistic" element
     */
    @Override
    public int sizeOfStatisticArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets array of all "statistic" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setStatisticArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Statistic[] statisticArray) {
        check_orphaned();
        arraySetterHelper(statisticArray, PROPERTY_QNAME[1]);
    }

    /**
     * Sets ith "statistic" element
     */
    @Override
    public void setStatisticArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Statistic statistic) {
        generatedSetterHelperImpl(statistic, PROPERTY_QNAME[1], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "statistic" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Statistic insertNewStatistic(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Statistic target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Statistic)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "statistic" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Statistic addNewStatistic() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Statistic target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Statistic)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Removes the ith "statistic" element
     */
    @Override
    public void removeStatistic(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], i);
        }
    }

    /**
     * Gets the "typeOfCategoryStatistic" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getTypeOfCategoryStatistic() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "typeOfCategoryStatistic" element
     */
    @Override
    public boolean isSetTypeOfCategoryStatistic() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "typeOfCategoryStatistic" element
     */
    @Override
    public void setTypeOfCategoryStatistic(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry typeOfCategoryStatistic) {
        generatedSetterHelperImpl(typeOfCategoryStatistic, PROPERTY_QNAME[2], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "typeOfCategoryStatistic" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewTypeOfCategoryStatistic() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Unsets the "typeOfCategoryStatistic" element
     */
    @Override
    public void unsetTypeOfCategoryStatistic() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }

    /**
     * Gets a List of "CategoryStatistic_appliesTo_InstanceVariable" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic.CategoryStatisticAppliesToInstanceVariable> getCategoryStatisticAppliesToInstanceVariableList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getCategoryStatisticAppliesToInstanceVariableArray,
                this::setCategoryStatisticAppliesToInstanceVariableArray,
                this::insertNewCategoryStatisticAppliesToInstanceVariable,
                this::removeCategoryStatisticAppliesToInstanceVariable,
                this::sizeOfCategoryStatisticAppliesToInstanceVariableArray
            );
        }
    }

    /**
     * Gets array of all "CategoryStatistic_appliesTo_InstanceVariable" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic.CategoryStatisticAppliesToInstanceVariable[] getCategoryStatisticAppliesToInstanceVariableArray() {
        return getXmlObjectArray(PROPERTY_QNAME[3], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic.CategoryStatisticAppliesToInstanceVariable[0]);
    }

    /**
     * Gets ith "CategoryStatistic_appliesTo_InstanceVariable" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic.CategoryStatisticAppliesToInstanceVariable getCategoryStatisticAppliesToInstanceVariableArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic.CategoryStatisticAppliesToInstanceVariable target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic.CategoryStatisticAppliesToInstanceVariable)get_store().find_element_user(PROPERTY_QNAME[3], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "CategoryStatistic_appliesTo_InstanceVariable" element
     */
    @Override
    public int sizeOfCategoryStatisticAppliesToInstanceVariableArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Sets array of all "CategoryStatistic_appliesTo_InstanceVariable" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setCategoryStatisticAppliesToInstanceVariableArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic.CategoryStatisticAppliesToInstanceVariable[] categoryStatisticAppliesToInstanceVariableArray) {
        check_orphaned();
        arraySetterHelper(categoryStatisticAppliesToInstanceVariableArray, PROPERTY_QNAME[3]);
    }

    /**
     * Sets ith "CategoryStatistic_appliesTo_InstanceVariable" element
     */
    @Override
    public void setCategoryStatisticAppliesToInstanceVariableArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic.CategoryStatisticAppliesToInstanceVariable categoryStatisticAppliesToInstanceVariable) {
        generatedSetterHelperImpl(categoryStatisticAppliesToInstanceVariable, PROPERTY_QNAME[3], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "CategoryStatistic_appliesTo_InstanceVariable" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic.CategoryStatisticAppliesToInstanceVariable insertNewCategoryStatisticAppliesToInstanceVariable(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic.CategoryStatisticAppliesToInstanceVariable target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic.CategoryStatisticAppliesToInstanceVariable)get_store().insert_element_user(PROPERTY_QNAME[3], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "CategoryStatistic_appliesTo_InstanceVariable" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic.CategoryStatisticAppliesToInstanceVariable addNewCategoryStatisticAppliesToInstanceVariable() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic.CategoryStatisticAppliesToInstanceVariable target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic.CategoryStatisticAppliesToInstanceVariable)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Removes the ith "CategoryStatistic_appliesTo_InstanceVariable" element
     */
    @Override
    public void removeCategoryStatisticAppliesToInstanceVariable(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], i);
        }
    }

    /**
     * Gets the "CategoryStatistic_for_Category" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic.CategoryStatisticForCategory getCategoryStatisticForCategory() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic.CategoryStatisticForCategory target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic.CategoryStatisticForCategory)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "CategoryStatistic_for_Category" element
     */
    @Override
    public boolean isSetCategoryStatisticForCategory() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[4]) != 0;
        }
    }

    /**
     * Sets the "CategoryStatistic_for_Category" element
     */
    @Override
    public void setCategoryStatisticForCategory(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic.CategoryStatisticForCategory categoryStatisticForCategory) {
        generatedSetterHelperImpl(categoryStatisticForCategory, PROPERTY_QNAME[4], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "CategoryStatistic_for_Category" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic.CategoryStatisticForCategory addNewCategoryStatisticForCategory() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic.CategoryStatisticForCategory target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic.CategoryStatisticForCategory)get_store().add_element_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * Unsets the "CategoryStatistic_for_Category" element
     */
    @Override
    public void unsetCategoryStatisticForCategory() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[4], 0);
        }
    }
    /**
     * An XML CategoryStatistic_appliesTo_InstanceVariable(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class CategoryStatisticAppliesToInstanceVariableImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.ReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic.CategoryStatisticAppliesToInstanceVariable {
        private static final long serialVersionUID = 1L;

        public CategoryStatisticAppliesToInstanceVariableImpl(org.apache.xmlbeans.SchemaType sType) {
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic$CategoryStatisticAppliesToInstanceVariable$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic.CategoryStatisticAppliesToInstanceVariable.ValidType {
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
     * An XML CategoryStatistic_for_Category(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class CategoryStatisticForCategoryImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.ReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic.CategoryStatisticForCategory {
        private static final long serialVersionUID = 1L;

        public CategoryStatisticForCategoryImpl(org.apache.xmlbeans.SchemaType sType) {
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic$CategoryStatisticForCategory$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic.CategoryStatisticForCategory.ValidType {
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
