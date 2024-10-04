/*
 * XML Type:  DimensionGroup
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionGroup
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML DimensionGroup(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface DimensionGroup extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionGroup> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "dimensiongroup6d57type");
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
     * Gets a List of "DimensionGroup_has_DimensionComponent" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionGroup.DimensionGroupHasDimensionComponent> getDimensionGroupHasDimensionComponentList();

    /**
     * Gets array of all "DimensionGroup_has_DimensionComponent" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionGroup.DimensionGroupHasDimensionComponent[] getDimensionGroupHasDimensionComponentArray();

    /**
     * Gets ith "DimensionGroup_has_DimensionComponent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionGroup.DimensionGroupHasDimensionComponent getDimensionGroupHasDimensionComponentArray(int i);

    /**
     * Returns number of "DimensionGroup_has_DimensionComponent" element
     */
    int sizeOfDimensionGroupHasDimensionComponentArray();

    /**
     * Sets array of all "DimensionGroup_has_DimensionComponent" element
     */
    void setDimensionGroupHasDimensionComponentArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionGroup.DimensionGroupHasDimensionComponent[] dimensionGroupHasDimensionComponentArray);

    /**
     * Sets ith "DimensionGroup_has_DimensionComponent" element
     */
    void setDimensionGroupHasDimensionComponentArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionGroup.DimensionGroupHasDimensionComponent dimensionGroupHasDimensionComponent);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DimensionGroup_has_DimensionComponent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionGroup.DimensionGroupHasDimensionComponent insertNewDimensionGroupHasDimensionComponent(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "DimensionGroup_has_DimensionComponent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionGroup.DimensionGroupHasDimensionComponent addNewDimensionGroupHasDimensionComponent();

    /**
     * Removes the ith "DimensionGroup_has_DimensionComponent" element
     */
    void removeDimensionGroupHasDimensionComponent(int i);

    /**
     * An XML DimensionGroup_has_DimensionComponent(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface DimensionGroupHasDimensionComponent extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionGroup.DimensionGroupHasDimensionComponent> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "dimensiongrouphasdimensioncomponent2369elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionGroup$DimensionGroupHasDimensionComponent$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionGroup.DimensionGroupHasDimensionComponent.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "validtype30e7elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum DIMENSION_COMPONENT = Enum.forString("DimensionComponent");

            int INT_DIMENSION_COMPONENT = Enum.INT_DIMENSION_COMPONENT;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionGroup$DimensionGroupHasDimensionComponent$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_DIMENSION_COMPONENT
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

                static final int INT_DIMENSION_COMPONENT = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("DimensionComponent", INT_DIMENSION_COMPONENT),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }
}
