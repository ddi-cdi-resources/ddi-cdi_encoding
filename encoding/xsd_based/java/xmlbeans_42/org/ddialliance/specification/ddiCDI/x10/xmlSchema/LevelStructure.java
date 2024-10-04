/*
 * XML Type:  LevelStructure
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.LevelStructure
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML LevelStructure(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface LevelStructure extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.LevelStructure> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "levelstructure55edtype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "catalogDetails" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails getCatalogDetails();

    /**
     * True if has "catalogDetails" element
     */
    boolean isSetCatalogDetails();

    /**
     * Sets the "catalogDetails" element
     */
    void setCatalogDetails(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails catalogDetails);

    /**
     * Appends and returns a new empty "catalogDetails" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails addNewCatalogDetails();

    /**
     * Unsets the "catalogDetails" element
     */
    void unsetCatalogDetails();

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
     * Gets a List of "name" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName> getNameList();

    /**
     * Gets array of all "name" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName[] getNameArray();

    /**
     * Gets ith "name" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName getNameArray(int i);

    /**
     * Returns number of "name" element
     */
    int sizeOfNameArray();

    /**
     * Sets array of all "name" element
     */
    void setNameArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName[] nameArray);

    /**
     * Sets ith "name" element
     */
    void setNameArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName name);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "name" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName insertNewName(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "name" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName addNewName();

    /**
     * Removes the ith "name" element
     */
    void removeName(int i);

    /**
     * Gets the "usage" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getUsage();

    /**
     * True if has "usage" element
     */
    boolean isSetUsage();

    /**
     * Sets the "usage" element
     */
    void setUsage(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString usage);

    /**
     * Appends and returns a new empty "usage" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewUsage();

    /**
     * Unsets the "usage" element
     */
    void unsetUsage();

    /**
     * Gets the "validDateRange" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange getValidDateRange();

    /**
     * True if has "validDateRange" element
     */
    boolean isSetValidDateRange();

    /**
     * Sets the "validDateRange" element
     */
    void setValidDateRange(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange validDateRange);

    /**
     * Appends and returns a new empty "validDateRange" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange addNewValidDateRange();

    /**
     * Unsets the "validDateRange" element
     */
    void unsetValidDateRange();

    /**
     * Gets a List of "LevelStructure_has_Level" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.LevelStructure.LevelStructureHasLevel> getLevelStructureHasLevelList();

    /**
     * Gets array of all "LevelStructure_has_Level" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LevelStructure.LevelStructureHasLevel[] getLevelStructureHasLevelArray();

    /**
     * Gets ith "LevelStructure_has_Level" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LevelStructure.LevelStructureHasLevel getLevelStructureHasLevelArray(int i);

    /**
     * Returns number of "LevelStructure_has_Level" element
     */
    int sizeOfLevelStructureHasLevelArray();

    /**
     * Sets array of all "LevelStructure_has_Level" element
     */
    void setLevelStructureHasLevelArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.LevelStructure.LevelStructureHasLevel[] levelStructureHasLevelArray);

    /**
     * Sets ith "LevelStructure_has_Level" element
     */
    void setLevelStructureHasLevelArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.LevelStructure.LevelStructureHasLevel levelStructureHasLevel);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "LevelStructure_has_Level" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LevelStructure.LevelStructureHasLevel insertNewLevelStructureHasLevel(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "LevelStructure_has_Level" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LevelStructure.LevelStructureHasLevel addNewLevelStructureHasLevel();

    /**
     * Removes the ith "LevelStructure_has_Level" element
     */
    void removeLevelStructureHasLevel(int i);

    /**
     * An XML LevelStructure_has_Level(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface LevelStructureHasLevel extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.LevelStructure.LevelStructureHasLevel> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "levelstructurehaslevel0b82elemtype");
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.LevelStructure$LevelStructureHasLevel$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.LevelStructure.LevelStructureHasLevel.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "validtypee944elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum LEVEL = Enum.forString("Level");

            int INT_LEVEL = Enum.INT_LEVEL;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.LevelStructure$LevelStructureHasLevel$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_LEVEL
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

                static final int INT_LEVEL = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("Level", INT_LEVEL),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }
}
