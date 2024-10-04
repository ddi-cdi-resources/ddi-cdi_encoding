/*
 * XML Type:  Unit
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.Unit
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML Unit(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface Unit extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Unit> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "unit5ae2type");
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
     * Gets the "definition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getDefinition();

    /**
     * True if has "definition" element
     */
    boolean isSetDefinition();

    /**
     * Sets the "definition" element
     */
    void setDefinition(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString definition);

    /**
     * Appends and returns a new empty "definition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewDefinition();

    /**
     * Unsets the "definition" element
     */
    void unsetDefinition();

    /**
     * Gets a List of "displayLabel" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay> getDisplayLabelList();

    /**
     * Gets array of all "displayLabel" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay[] getDisplayLabelArray();

    /**
     * Gets ith "displayLabel" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay getDisplayLabelArray(int i);

    /**
     * Returns number of "displayLabel" element
     */
    int sizeOfDisplayLabelArray();

    /**
     * Sets array of all "displayLabel" element
     */
    void setDisplayLabelArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay[] displayLabelArray);

    /**
     * Sets ith "displayLabel" element
     */
    void setDisplayLabelArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay displayLabel);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "displayLabel" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay insertNewDisplayLabel(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "displayLabel" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay addNewDisplayLabel();

    /**
     * Removes the ith "displayLabel" element
     */
    void removeDisplayLabel(int i);

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
     * Gets a List of "Unit_has_UnitType" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Unit.UnitHasUnitType> getUnitHasUnitTypeList();

    /**
     * Gets array of all "Unit_has_UnitType" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Unit.UnitHasUnitType[] getUnitHasUnitTypeArray();

    /**
     * Gets ith "Unit_has_UnitType" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Unit.UnitHasUnitType getUnitHasUnitTypeArray(int i);

    /**
     * Returns number of "Unit_has_UnitType" element
     */
    int sizeOfUnitHasUnitTypeArray();

    /**
     * Sets array of all "Unit_has_UnitType" element
     */
    void setUnitHasUnitTypeArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Unit.UnitHasUnitType[] unitHasUnitTypeArray);

    /**
     * Sets ith "Unit_has_UnitType" element
     */
    void setUnitHasUnitTypeArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Unit.UnitHasUnitType unitHasUnitType);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Unit_has_UnitType" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Unit.UnitHasUnitType insertNewUnitHasUnitType(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Unit_has_UnitType" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Unit.UnitHasUnitType addNewUnitHasUnitType();

    /**
     * Removes the ith "Unit_has_UnitType" element
     */
    void removeUnitHasUnitType(int i);

    /**
     * An XML Unit_has_UnitType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface UnitHasUnitType extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Unit.UnitHasUnitType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "unithasunittyped678elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.Unit$UnitHasUnitType$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Unit.UnitHasUnitType.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "validtypef476elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum POPULATION = Enum.forString("Population");
            Enum UNIT_TYPE = Enum.forString("UnitType");
            Enum UNIVERSE = Enum.forString("Universe");

            int INT_POPULATION = Enum.INT_POPULATION;
            int INT_UNIT_TYPE = Enum.INT_UNIT_TYPE;
            int INT_UNIVERSE = Enum.INT_UNIVERSE;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.Unit$UnitHasUnitType$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_POPULATION
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

                static final int INT_POPULATION = 1;
                static final int INT_UNIT_TYPE = 2;
                static final int INT_UNIVERSE = 3;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("Population", INT_POPULATION),
                    new Enum("UnitType", INT_UNIT_TYPE),
                    new Enum("Universe", INT_UNIVERSE),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }
}
