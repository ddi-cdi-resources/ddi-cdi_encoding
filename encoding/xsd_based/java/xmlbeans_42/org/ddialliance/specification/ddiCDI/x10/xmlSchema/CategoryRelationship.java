/*
 * XML Type:  CategoryRelationship
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CategoryRelationship(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface CategoryRelationship extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "categoryrelationshipf2b4type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "identifier" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier getIdentifier();

    /**
     * True if has "identifier" element
     */
    boolean isSetIdentifier();

    /**
     * Sets the "identifier" element
     */
    void setIdentifier(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier identifier);

    /**
     * Appends and returns a new empty "identifier" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier addNewIdentifier();

    /**
     * Unsets the "identifier" element
     */
    void unsetIdentifier();

    /**
     * Gets the "semantics" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getSemantics();

    /**
     * True if has "semantics" element
     */
    boolean isSetSemantics();

    /**
     * Sets the "semantics" element
     */
    void setSemantics(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry semantics);

    /**
     * Appends and returns a new empty "semantics" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewSemantics();

    /**
     * Unsets the "semantics" element
     */
    void unsetSemantics();

    /**
     * Gets a List of "CategoryRelationship_hasSource_Category" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship.CategoryRelationshipHasSourceCategory> getCategoryRelationshipHasSourceCategoryList();

    /**
     * Gets array of all "CategoryRelationship_hasSource_Category" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship.CategoryRelationshipHasSourceCategory[] getCategoryRelationshipHasSourceCategoryArray();

    /**
     * Gets ith "CategoryRelationship_hasSource_Category" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship.CategoryRelationshipHasSourceCategory getCategoryRelationshipHasSourceCategoryArray(int i);

    /**
     * Returns number of "CategoryRelationship_hasSource_Category" element
     */
    int sizeOfCategoryRelationshipHasSourceCategoryArray();

    /**
     * Sets array of all "CategoryRelationship_hasSource_Category" element
     */
    void setCategoryRelationshipHasSourceCategoryArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship.CategoryRelationshipHasSourceCategory[] categoryRelationshipHasSourceCategoryArray);

    /**
     * Sets ith "CategoryRelationship_hasSource_Category" element
     */
    void setCategoryRelationshipHasSourceCategoryArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship.CategoryRelationshipHasSourceCategory categoryRelationshipHasSourceCategory);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "CategoryRelationship_hasSource_Category" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship.CategoryRelationshipHasSourceCategory insertNewCategoryRelationshipHasSourceCategory(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "CategoryRelationship_hasSource_Category" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship.CategoryRelationshipHasSourceCategory addNewCategoryRelationshipHasSourceCategory();

    /**
     * Removes the ith "CategoryRelationship_hasSource_Category" element
     */
    void removeCategoryRelationshipHasSourceCategory(int i);

    /**
     * Gets a List of "CategoryRelationship_hasTarget_Category" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship.CategoryRelationshipHasTargetCategory> getCategoryRelationshipHasTargetCategoryList();

    /**
     * Gets array of all "CategoryRelationship_hasTarget_Category" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship.CategoryRelationshipHasTargetCategory[] getCategoryRelationshipHasTargetCategoryArray();

    /**
     * Gets ith "CategoryRelationship_hasTarget_Category" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship.CategoryRelationshipHasTargetCategory getCategoryRelationshipHasTargetCategoryArray(int i);

    /**
     * Returns number of "CategoryRelationship_hasTarget_Category" element
     */
    int sizeOfCategoryRelationshipHasTargetCategoryArray();

    /**
     * Sets array of all "CategoryRelationship_hasTarget_Category" element
     */
    void setCategoryRelationshipHasTargetCategoryArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship.CategoryRelationshipHasTargetCategory[] categoryRelationshipHasTargetCategoryArray);

    /**
     * Sets ith "CategoryRelationship_hasTarget_Category" element
     */
    void setCategoryRelationshipHasTargetCategoryArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship.CategoryRelationshipHasTargetCategory categoryRelationshipHasTargetCategory);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "CategoryRelationship_hasTarget_Category" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship.CategoryRelationshipHasTargetCategory insertNewCategoryRelationshipHasTargetCategory(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "CategoryRelationship_hasTarget_Category" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship.CategoryRelationshipHasTargetCategory addNewCategoryRelationshipHasTargetCategory();

    /**
     * Removes the ith "CategoryRelationship_hasTarget_Category" element
     */
    void removeCategoryRelationshipHasTargetCategory(int i);

    /**
     * An XML CategoryRelationship_hasSource_Category(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface CategoryRelationshipHasSourceCategory extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship.CategoryRelationshipHasSourceCategory> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "categoryrelationshiphassourcecategory97f7elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * Gets the "isAssociationReference" attribute
         */
        boolean getIsAssociationReference();

        /**
         * Gets (as xml) the "isAssociationReference" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetIsAssociationReference();

        /**
         * True if has "isAssociationReference" attribute
         */
        boolean isSetIsAssociationReference();

        /**
         * Sets the "isAssociationReference" attribute
         */
        void setIsAssociationReference(boolean isAssociationReference);

        /**
         * Sets (as xml) the "isAssociationReference" attribute
         */
        void xsetIsAssociationReference(org.apache.xmlbeans.XmlBoolean isAssociationReference);

        /**
         * Unsets the "isAssociationReference" attribute
         */
        void unsetIsAssociationReference();

        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship$CategoryRelationshipHasSourceCategory$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship.CategoryRelationshipHasSourceCategory.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "validtype4775elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum CATEGORY = Enum.forString("Category");

            int INT_CATEGORY = Enum.INT_CATEGORY;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship$CategoryRelationshipHasSourceCategory$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_CATEGORY
             * Enum.forString(s); // returns the enum value for a string
             * Enum.forInt(i); // returns the enum value for an int
             * </pre>
             * Enumeration objects are immutable singleton objects that
             * can be compared using == object equality. They have no
             * public constructor. See the constants defined within this
             * class for all the valid values.
             */
            final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase {
                /**
                 * Returns the enum value for a string, or null if none.
                 */
                public static Enum forString(java.lang.String s) {
                    return (Enum)table.forString(s);
                }

                /**
                 * Returns the enum value corresponding to an int, or null if none.
                 */
                public static Enum forInt(int i) {
                    return (Enum)table.forInt(i);
                }

                private Enum(java.lang.String s, int i) {
                    super(s, i);
                }

                static final int INT_CATEGORY = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("Category", INT_CATEGORY),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }

    /**
     * An XML CategoryRelationship_hasTarget_Category(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface CategoryRelationshipHasTargetCategory extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship.CategoryRelationshipHasTargetCategory> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "categoryrelationshiphastargetcategoryc46delemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * Gets the "isAssociationReference" attribute
         */
        boolean getIsAssociationReference();

        /**
         * Gets (as xml) the "isAssociationReference" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetIsAssociationReference();

        /**
         * True if has "isAssociationReference" attribute
         */
        boolean isSetIsAssociationReference();

        /**
         * Sets the "isAssociationReference" attribute
         */
        void setIsAssociationReference(boolean isAssociationReference);

        /**
         * Sets (as xml) the "isAssociationReference" attribute
         */
        void xsetIsAssociationReference(org.apache.xmlbeans.XmlBoolean isAssociationReference);

        /**
         * Unsets the "isAssociationReference" attribute
         */
        void unsetIsAssociationReference();

        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship$CategoryRelationshipHasTargetCategory$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship.CategoryRelationshipHasTargetCategory.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "validtype73ebelemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum CATEGORY = Enum.forString("Category");

            int INT_CATEGORY = Enum.INT_CATEGORY;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship$CategoryRelationshipHasTargetCategory$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_CATEGORY
             * Enum.forString(s); // returns the enum value for a string
             * Enum.forInt(i); // returns the enum value for an int
             * </pre>
             * Enumeration objects are immutable singleton objects that
             * can be compared using == object equality. They have no
             * public constructor. See the constants defined within this
             * class for all the valid values.
             */
            final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase {
                /**
                 * Returns the enum value for a string, or null if none.
                 */
                public static Enum forString(java.lang.String s) {
                    return (Enum)table.forString(s);
                }

                /**
                 * Returns the enum value corresponding to an int, or null if none.
                 */
                public static Enum forInt(int i) {
                    return (Enum)table.forInt(i);
                }

                private Enum(java.lang.String s, int i) {
                    super(s, i);
                }

                static final int INT_CATEGORY = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("Category", INT_CATEGORY),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }
}
