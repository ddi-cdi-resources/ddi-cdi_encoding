/*
 * XML Type:  CategorySet
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategorySet
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CategorySet(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface CategorySet extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystem {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategorySet> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "categoryset36b0type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "CategorySet_has_Category" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategorySet.CategorySetHasCategory> getCategorySetHasCategoryList();

    /**
     * Gets array of all "CategorySet_has_Category" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategorySet.CategorySetHasCategory[] getCategorySetHasCategoryArray();

    /**
     * Gets ith "CategorySet_has_Category" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategorySet.CategorySetHasCategory getCategorySetHasCategoryArray(int i);

    /**
     * Returns number of "CategorySet_has_Category" element
     */
    int sizeOfCategorySetHasCategoryArray();

    /**
     * Sets array of all "CategorySet_has_Category" element
     */
    void setCategorySetHasCategoryArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategorySet.CategorySetHasCategory[] categorySetHasCategoryArray);

    /**
     * Sets ith "CategorySet_has_Category" element
     */
    void setCategorySetHasCategoryArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategorySet.CategorySetHasCategory categorySetHasCategory);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "CategorySet_has_Category" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategorySet.CategorySetHasCategory insertNewCategorySetHasCategory(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "CategorySet_has_Category" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategorySet.CategorySetHasCategory addNewCategorySetHasCategory();

    /**
     * Removes the ith "CategorySet_has_Category" element
     */
    void removeCategorySetHasCategory(int i);

    /**
     * Gets a List of "CategorySet_has_CategoryPosition" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategorySet.CategorySetHasCategoryPosition> getCategorySetHasCategoryPositionList();

    /**
     * Gets array of all "CategorySet_has_CategoryPosition" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategorySet.CategorySetHasCategoryPosition[] getCategorySetHasCategoryPositionArray();

    /**
     * Gets ith "CategorySet_has_CategoryPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategorySet.CategorySetHasCategoryPosition getCategorySetHasCategoryPositionArray(int i);

    /**
     * Returns number of "CategorySet_has_CategoryPosition" element
     */
    int sizeOfCategorySetHasCategoryPositionArray();

    /**
     * Sets array of all "CategorySet_has_CategoryPosition" element
     */
    void setCategorySetHasCategoryPositionArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategorySet.CategorySetHasCategoryPosition[] categorySetHasCategoryPositionArray);

    /**
     * Sets ith "CategorySet_has_CategoryPosition" element
     */
    void setCategorySetHasCategoryPositionArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategorySet.CategorySetHasCategoryPosition categorySetHasCategoryPosition);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "CategorySet_has_CategoryPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategorySet.CategorySetHasCategoryPosition insertNewCategorySetHasCategoryPosition(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "CategorySet_has_CategoryPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategorySet.CategorySetHasCategoryPosition addNewCategorySetHasCategoryPosition();

    /**
     * Removes the ith "CategorySet_has_CategoryPosition" element
     */
    void removeCategorySetHasCategoryPosition(int i);

    /**
     * An XML CategorySet_has_Category(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface CategorySetHasCategory extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategorySet.CategorySetHasCategory> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "categorysethascategory19eaelemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategorySet$CategorySetHasCategory$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategorySet.CategorySetHasCategory.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "validtypee368elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum CATEGORY = Enum.forString("Category");

            int INT_CATEGORY = Enum.INT_CATEGORY;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategorySet$CategorySetHasCategory$ValidType.
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
     * An XML CategorySet_has_CategoryPosition(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface CategorySetHasCategoryPosition extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategorySet.CategorySetHasCategoryPosition> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "categorysethascategoryposition71f3elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * Gets a List of "validType" elements
         */
        java.util.List<java.lang.String> getValidTypeList();

        /**
         * Gets array of all "validType" elements
         */
        java.lang.String[] getValidTypeArray();

        /**
         * Gets ith "validType" element
         */
        java.lang.String getValidTypeArray(int i);

        /**
         * Gets (as xml) a List of "validType" elements
         */
        java.util.List<org.apache.xmlbeans.XmlString> xgetValidTypeList();

        /**
         * Gets (as xml) array of all "validType" elements
         */
        org.apache.xmlbeans.XmlString[] xgetValidTypeArray();

        /**
         * Gets (as xml) ith "validType" element
         */
        org.apache.xmlbeans.XmlString xgetValidTypeArray(int i);

        /**
         * Returns number of "validType" element
         */
        int sizeOfValidTypeArray();

        /**
         * Sets array of all "validType" element
         */
        void setValidTypeArray(java.lang.String[] validTypeArray);

        /**
         * Sets ith "validType" element
         */
        void setValidTypeArray(int i, java.lang.String validType);

        /**
         * Sets (as xml) array of all "validType" element
         */
        void xsetValidTypeArray(org.apache.xmlbeans.XmlString[] validTypeArray);

        /**
         * Sets (as xml) ith "validType" element
         */
        void xsetValidTypeArray(int i, org.apache.xmlbeans.XmlString validType);

        /**
         * Inserts the value as the ith "validType" element
         */
        void insertValidType(int i, java.lang.String validType);

        /**
         * Appends the value as the last "validType" element
         */
        void addValidType(java.lang.String validType);

        /**
         * Inserts and returns a new empty value (as xml) as the ith "validType" element
         */
        org.apache.xmlbeans.XmlString insertNewValidType(int i);

        /**
         * Appends and returns a new empty value (as xml) as the last "validType" element
         */
        org.apache.xmlbeans.XmlString addNewValidType();

        /**
         * Removes the ith "validType" element
         */
        void removeValidType(int i);

        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategorySet$CategorySetHasCategoryPosition$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategorySet.CategorySetHasCategoryPosition.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "validtypedd71elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum CATEGORY_POSITION = Enum.forString("CategoryPosition");

            int INT_CATEGORY_POSITION = Enum.INT_CATEGORY_POSITION;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategorySet$CategorySetHasCategoryPosition$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_CATEGORY_POSITION
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

                static final int INT_CATEGORY_POSITION = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("CategoryPosition", INT_CATEGORY_POSITION),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }
}
