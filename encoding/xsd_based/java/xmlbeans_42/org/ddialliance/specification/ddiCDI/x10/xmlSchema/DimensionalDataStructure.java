/*
 * XML Type:  DimensionalDataStructure
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataStructure
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML DimensionalDataStructure(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface DimensionalDataStructure extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructure {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataStructure> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "dimensionaldatastructure0536type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "DimensionalDataStructure_uses_DimensionGroup" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataStructure.DimensionalDataStructureUsesDimensionGroup> getDimensionalDataStructureUsesDimensionGroupList();

    /**
     * Gets array of all "DimensionalDataStructure_uses_DimensionGroup" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataStructure.DimensionalDataStructureUsesDimensionGroup[] getDimensionalDataStructureUsesDimensionGroupArray();

    /**
     * Gets ith "DimensionalDataStructure_uses_DimensionGroup" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataStructure.DimensionalDataStructureUsesDimensionGroup getDimensionalDataStructureUsesDimensionGroupArray(int i);

    /**
     * Returns number of "DimensionalDataStructure_uses_DimensionGroup" element
     */
    int sizeOfDimensionalDataStructureUsesDimensionGroupArray();

    /**
     * Sets array of all "DimensionalDataStructure_uses_DimensionGroup" element
     */
    void setDimensionalDataStructureUsesDimensionGroupArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataStructure.DimensionalDataStructureUsesDimensionGroup[] dimensionalDataStructureUsesDimensionGroupArray);

    /**
     * Sets ith "DimensionalDataStructure_uses_DimensionGroup" element
     */
    void setDimensionalDataStructureUsesDimensionGroupArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataStructure.DimensionalDataStructureUsesDimensionGroup dimensionalDataStructureUsesDimensionGroup);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DimensionalDataStructure_uses_DimensionGroup" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataStructure.DimensionalDataStructureUsesDimensionGroup insertNewDimensionalDataStructureUsesDimensionGroup(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "DimensionalDataStructure_uses_DimensionGroup" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataStructure.DimensionalDataStructureUsesDimensionGroup addNewDimensionalDataStructureUsesDimensionGroup();

    /**
     * Removes the ith "DimensionalDataStructure_uses_DimensionGroup" element
     */
    void removeDimensionalDataStructureUsesDimensionGroup(int i);

    /**
     * An XML DimensionalDataStructure_uses_DimensionGroup(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface DimensionalDataStructureUsesDimensionGroup extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataStructure.DimensionalDataStructureUsesDimensionGroup> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "dimensionaldatastructureusesdimensiongroupd415elemtype");
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataStructure$DimensionalDataStructureUsesDimensionGroup$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataStructure.DimensionalDataStructureUsesDimensionGroup.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "validtypeb257elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum DIMENSION_GROUP = Enum.forString("DimensionGroup");

            int INT_DIMENSION_GROUP = Enum.INT_DIMENSION_GROUP;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataStructure$DimensionalDataStructureUsesDimensionGroup$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_DIMENSION_GROUP
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

                static final int INT_DIMENSION_GROUP = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("DimensionGroup", INT_DIMENSION_GROUP),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }
}
