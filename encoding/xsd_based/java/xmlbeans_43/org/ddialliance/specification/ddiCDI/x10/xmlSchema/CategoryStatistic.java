/*
 * XML Type:  CategoryStatistic
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CategoryStatistic(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface CategoryStatistic extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "categorystatistic2bdetype");
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
     * Gets a List of "statistic" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Statistic> getStatisticList();

    /**
     * Gets array of all "statistic" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Statistic[] getStatisticArray();

    /**
     * Gets ith "statistic" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Statistic getStatisticArray(int i);

    /**
     * Returns number of "statistic" element
     */
    int sizeOfStatisticArray();

    /**
     * Sets array of all "statistic" element
     */
    void setStatisticArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Statistic[] statisticArray);

    /**
     * Sets ith "statistic" element
     */
    void setStatisticArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Statistic statistic);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "statistic" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Statistic insertNewStatistic(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "statistic" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Statistic addNewStatistic();

    /**
     * Removes the ith "statistic" element
     */
    void removeStatistic(int i);

    /**
     * Gets the "typeOfCategoryStatistic" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getTypeOfCategoryStatistic();

    /**
     * True if has "typeOfCategoryStatistic" element
     */
    boolean isSetTypeOfCategoryStatistic();

    /**
     * Sets the "typeOfCategoryStatistic" element
     */
    void setTypeOfCategoryStatistic(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry typeOfCategoryStatistic);

    /**
     * Appends and returns a new empty "typeOfCategoryStatistic" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewTypeOfCategoryStatistic();

    /**
     * Unsets the "typeOfCategoryStatistic" element
     */
    void unsetTypeOfCategoryStatistic();

    /**
     * Gets a List of "CategoryStatistic_appliesTo_InstanceVariable" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic.CategoryStatisticAppliesToInstanceVariable> getCategoryStatisticAppliesToInstanceVariableList();

    /**
     * Gets array of all "CategoryStatistic_appliesTo_InstanceVariable" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic.CategoryStatisticAppliesToInstanceVariable[] getCategoryStatisticAppliesToInstanceVariableArray();

    /**
     * Gets ith "CategoryStatistic_appliesTo_InstanceVariable" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic.CategoryStatisticAppliesToInstanceVariable getCategoryStatisticAppliesToInstanceVariableArray(int i);

    /**
     * Returns number of "CategoryStatistic_appliesTo_InstanceVariable" element
     */
    int sizeOfCategoryStatisticAppliesToInstanceVariableArray();

    /**
     * Sets array of all "CategoryStatistic_appliesTo_InstanceVariable" element
     */
    void setCategoryStatisticAppliesToInstanceVariableArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic.CategoryStatisticAppliesToInstanceVariable[] categoryStatisticAppliesToInstanceVariableArray);

    /**
     * Sets ith "CategoryStatistic_appliesTo_InstanceVariable" element
     */
    void setCategoryStatisticAppliesToInstanceVariableArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic.CategoryStatisticAppliesToInstanceVariable categoryStatisticAppliesToInstanceVariable);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "CategoryStatistic_appliesTo_InstanceVariable" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic.CategoryStatisticAppliesToInstanceVariable insertNewCategoryStatisticAppliesToInstanceVariable(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "CategoryStatistic_appliesTo_InstanceVariable" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic.CategoryStatisticAppliesToInstanceVariable addNewCategoryStatisticAppliesToInstanceVariable();

    /**
     * Removes the ith "CategoryStatistic_appliesTo_InstanceVariable" element
     */
    void removeCategoryStatisticAppliesToInstanceVariable(int i);

    /**
     * Gets the "CategoryStatistic_for_Category" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic.CategoryStatisticForCategory getCategoryStatisticForCategory();

    /**
     * True if has "CategoryStatistic_for_Category" element
     */
    boolean isSetCategoryStatisticForCategory();

    /**
     * Sets the "CategoryStatistic_for_Category" element
     */
    void setCategoryStatisticForCategory(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic.CategoryStatisticForCategory categoryStatisticForCategory);

    /**
     * Appends and returns a new empty "CategoryStatistic_for_Category" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic.CategoryStatisticForCategory addNewCategoryStatisticForCategory();

    /**
     * Unsets the "CategoryStatistic_for_Category" element
     */
    void unsetCategoryStatisticForCategory();

    /**
     * An XML CategoryStatistic_appliesTo_InstanceVariable(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface CategoryStatisticAppliesToInstanceVariable extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic.CategoryStatisticAppliesToInstanceVariable> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "categorystatisticappliestoinstancevariablebe70elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic$CategoryStatisticAppliesToInstanceVariable$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic.CategoryStatisticAppliesToInstanceVariable.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "validtype866eelemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum INSTANCE_VARIABLE = Enum.forString("InstanceVariable");

            int INT_INSTANCE_VARIABLE = Enum.INT_INSTANCE_VARIABLE;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic$CategoryStatisticAppliesToInstanceVariable$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_INSTANCE_VARIABLE
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

                static final int INT_INSTANCE_VARIABLE = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("InstanceVariable", INT_INSTANCE_VARIABLE),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }

    /**
     * An XML CategoryStatistic_for_Category(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface CategoryStatisticForCategory extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic.CategoryStatisticForCategory> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "categorystatisticforcategory459belemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic$CategoryStatisticForCategory$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic.CategoryStatisticForCategory.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "validtypec219elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum CATEGORY = Enum.forString("Category");

            int INT_CATEGORY = Enum.INT_CATEGORY;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic$CategoryStatisticForCategory$ValidType.
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
