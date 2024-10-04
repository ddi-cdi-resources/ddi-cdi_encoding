/*
 * XML Type:  CategoryRelationship
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CategoryRelationship(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class CategoryRelationshipImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship {
    private static final long serialVersionUID = 1L;

    public CategoryRelationshipImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "identifier"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "semantics"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "CategoryRelationship_hasSource_Category"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "CategoryRelationship_hasTarget_Category"),
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
     * Gets a List of "CategoryRelationship_hasSource_Category" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship.CategoryRelationshipHasSourceCategory> getCategoryRelationshipHasSourceCategoryList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getCategoryRelationshipHasSourceCategoryArray,
                this::setCategoryRelationshipHasSourceCategoryArray,
                this::insertNewCategoryRelationshipHasSourceCategory,
                this::removeCategoryRelationshipHasSourceCategory,
                this::sizeOfCategoryRelationshipHasSourceCategoryArray
            );
        }
    }

    /**
     * Gets array of all "CategoryRelationship_hasSource_Category" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship.CategoryRelationshipHasSourceCategory[] getCategoryRelationshipHasSourceCategoryArray() {
        return getXmlObjectArray(PROPERTY_QNAME[2], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship.CategoryRelationshipHasSourceCategory[0]);
    }

    /**
     * Gets ith "CategoryRelationship_hasSource_Category" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship.CategoryRelationshipHasSourceCategory getCategoryRelationshipHasSourceCategoryArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship.CategoryRelationshipHasSourceCategory target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship.CategoryRelationshipHasSourceCategory)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "CategoryRelationship_hasSource_Category" element
     */
    @Override
    public int sizeOfCategoryRelationshipHasSourceCategoryArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Sets array of all "CategoryRelationship_hasSource_Category" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setCategoryRelationshipHasSourceCategoryArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship.CategoryRelationshipHasSourceCategory[] categoryRelationshipHasSourceCategoryArray) {
        check_orphaned();
        arraySetterHelper(categoryRelationshipHasSourceCategoryArray, PROPERTY_QNAME[2]);
    }

    /**
     * Sets ith "CategoryRelationship_hasSource_Category" element
     */
    @Override
    public void setCategoryRelationshipHasSourceCategoryArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship.CategoryRelationshipHasSourceCategory categoryRelationshipHasSourceCategory) {
        generatedSetterHelperImpl(categoryRelationshipHasSourceCategory, PROPERTY_QNAME[2], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "CategoryRelationship_hasSource_Category" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship.CategoryRelationshipHasSourceCategory insertNewCategoryRelationshipHasSourceCategory(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship.CategoryRelationshipHasSourceCategory target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship.CategoryRelationshipHasSourceCategory)get_store().insert_element_user(PROPERTY_QNAME[2], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "CategoryRelationship_hasSource_Category" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship.CategoryRelationshipHasSourceCategory addNewCategoryRelationshipHasSourceCategory() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship.CategoryRelationshipHasSourceCategory target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship.CategoryRelationshipHasSourceCategory)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Removes the ith "CategoryRelationship_hasSource_Category" element
     */
    @Override
    public void removeCategoryRelationshipHasSourceCategory(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], i);
        }
    }

    /**
     * Gets a List of "CategoryRelationship_hasTarget_Category" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship.CategoryRelationshipHasTargetCategory> getCategoryRelationshipHasTargetCategoryList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getCategoryRelationshipHasTargetCategoryArray,
                this::setCategoryRelationshipHasTargetCategoryArray,
                this::insertNewCategoryRelationshipHasTargetCategory,
                this::removeCategoryRelationshipHasTargetCategory,
                this::sizeOfCategoryRelationshipHasTargetCategoryArray
            );
        }
    }

    /**
     * Gets array of all "CategoryRelationship_hasTarget_Category" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship.CategoryRelationshipHasTargetCategory[] getCategoryRelationshipHasTargetCategoryArray() {
        return getXmlObjectArray(PROPERTY_QNAME[3], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship.CategoryRelationshipHasTargetCategory[0]);
    }

    /**
     * Gets ith "CategoryRelationship_hasTarget_Category" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship.CategoryRelationshipHasTargetCategory getCategoryRelationshipHasTargetCategoryArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship.CategoryRelationshipHasTargetCategory target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship.CategoryRelationshipHasTargetCategory)get_store().find_element_user(PROPERTY_QNAME[3], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "CategoryRelationship_hasTarget_Category" element
     */
    @Override
    public int sizeOfCategoryRelationshipHasTargetCategoryArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Sets array of all "CategoryRelationship_hasTarget_Category" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setCategoryRelationshipHasTargetCategoryArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship.CategoryRelationshipHasTargetCategory[] categoryRelationshipHasTargetCategoryArray) {
        check_orphaned();
        arraySetterHelper(categoryRelationshipHasTargetCategoryArray, PROPERTY_QNAME[3]);
    }

    /**
     * Sets ith "CategoryRelationship_hasTarget_Category" element
     */
    @Override
    public void setCategoryRelationshipHasTargetCategoryArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship.CategoryRelationshipHasTargetCategory categoryRelationshipHasTargetCategory) {
        generatedSetterHelperImpl(categoryRelationshipHasTargetCategory, PROPERTY_QNAME[3], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "CategoryRelationship_hasTarget_Category" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship.CategoryRelationshipHasTargetCategory insertNewCategoryRelationshipHasTargetCategory(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship.CategoryRelationshipHasTargetCategory target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship.CategoryRelationshipHasTargetCategory)get_store().insert_element_user(PROPERTY_QNAME[3], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "CategoryRelationship_hasTarget_Category" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship.CategoryRelationshipHasTargetCategory addNewCategoryRelationshipHasTargetCategory() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship.CategoryRelationshipHasTargetCategory target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship.CategoryRelationshipHasTargetCategory)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Removes the ith "CategoryRelationship_hasTarget_Category" element
     */
    @Override
    public void removeCategoryRelationshipHasTargetCategory(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], i);
        }
    }
    /**
     * An XML CategoryRelationship_hasSource_Category(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class CategoryRelationshipHasSourceCategoryImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship.CategoryRelationshipHasSourceCategory {
        private static final long serialVersionUID = 1L;

        public CategoryRelationshipHasSourceCategoryImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship$CategoryRelationshipHasSourceCategory$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship.CategoryRelationshipHasSourceCategory.ValidType {
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
     * An XML CategoryRelationship_hasTarget_Category(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class CategoryRelationshipHasTargetCategoryImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship.CategoryRelationshipHasTargetCategory {
        private static final long serialVersionUID = 1L;

        public CategoryRelationshipHasTargetCategoryImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship$CategoryRelationshipHasTargetCategory$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship.CategoryRelationshipHasTargetCategory.ValidType {
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
