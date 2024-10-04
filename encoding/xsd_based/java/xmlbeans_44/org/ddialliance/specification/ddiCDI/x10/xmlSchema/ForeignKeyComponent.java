/*
 * XML Type:  ForeignKeyComponent
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKeyComponent
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ForeignKeyComponent(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface ForeignKeyComponent extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKeyComponent> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "foreignkeycomponenta87etype");
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
     * Gets the "ForeignKeyComponent_references_PrimaryKeyComponent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKeyComponent.ForeignKeyComponentReferencesPrimaryKeyComponent getForeignKeyComponentReferencesPrimaryKeyComponent();

    /**
     * Sets the "ForeignKeyComponent_references_PrimaryKeyComponent" element
     */
    void setForeignKeyComponentReferencesPrimaryKeyComponent(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKeyComponent.ForeignKeyComponentReferencesPrimaryKeyComponent foreignKeyComponentReferencesPrimaryKeyComponent);

    /**
     * Appends and returns a new empty "ForeignKeyComponent_references_PrimaryKeyComponent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKeyComponent.ForeignKeyComponentReferencesPrimaryKeyComponent addNewForeignKeyComponentReferencesPrimaryKeyComponent();

    /**
     * Gets the "ForeignKeyComponent_correspondsTo_DataStructureComponent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKeyComponent.ForeignKeyComponentCorrespondsToDataStructureComponent getForeignKeyComponentCorrespondsToDataStructureComponent();

    /**
     * Sets the "ForeignKeyComponent_correspondsTo_DataStructureComponent" element
     */
    void setForeignKeyComponentCorrespondsToDataStructureComponent(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKeyComponent.ForeignKeyComponentCorrespondsToDataStructureComponent foreignKeyComponentCorrespondsToDataStructureComponent);

    /**
     * Appends and returns a new empty "ForeignKeyComponent_correspondsTo_DataStructureComponent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKeyComponent.ForeignKeyComponentCorrespondsToDataStructureComponent addNewForeignKeyComponentCorrespondsToDataStructureComponent();

    /**
     * An XML ForeignKeyComponent_references_PrimaryKeyComponent(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface ForeignKeyComponentReferencesPrimaryKeyComponent extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKeyComponent.ForeignKeyComponentReferencesPrimaryKeyComponent> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "foreignkeycomponentreferencesprimarykeycomponentf870elemtype");
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKeyComponent$ForeignKeyComponentReferencesPrimaryKeyComponent$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKeyComponent.ForeignKeyComponentReferencesPrimaryKeyComponent.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "validtypee26eelemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum PRIMARY_KEY_COMPONENT = Enum.forString("PrimaryKeyComponent");

            int INT_PRIMARY_KEY_COMPONENT = Enum.INT_PRIMARY_KEY_COMPONENT;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKeyComponent$ForeignKeyComponentReferencesPrimaryKeyComponent$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_PRIMARY_KEY_COMPONENT
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

                static final int INT_PRIMARY_KEY_COMPONENT = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("PrimaryKeyComponent", INT_PRIMARY_KEY_COMPONENT),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }

    /**
     * An XML ForeignKeyComponent_correspondsTo_DataStructureComponent(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface ForeignKeyComponentCorrespondsToDataStructureComponent extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKeyComponent.ForeignKeyComponentCorrespondsToDataStructureComponent> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "foreignkeycomponentcorrespondstodatastructurecomponent969belemtype");
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKeyComponent$ForeignKeyComponentCorrespondsToDataStructureComponent$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKeyComponent.ForeignKeyComponentCorrespondsToDataStructureComponent.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "validtype8a19elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum ATTRIBUTE_COMPONENT = Enum.forString("AttributeComponent");
            Enum CONTEXTUAL_COMPONENT = Enum.forString("ContextualComponent");
            Enum DATA_STRUCTURE = Enum.forString("DataStructure");
            Enum DATA_STRUCTURE_COMPONENT = Enum.forString("DataStructureComponent");
            Enum DIMENSION_COMPONENT = Enum.forString("DimensionComponent");
            Enum DIMENSIONAL_DATA_STRUCTURE = Enum.forString("DimensionalDataStructure");
            Enum IDENTIFIER_COMPONENT = Enum.forString("IdentifierComponent");
            Enum KEY_VALUE_STRUCTURE = Enum.forString("KeyValueStructure");
            Enum LONG_DATA_STRUCTURE = Enum.forString("LongDataStructure");
            Enum MEASURE_COMPONENT = Enum.forString("MeasureComponent");
            Enum QUALIFIED_MEASURE = Enum.forString("QualifiedMeasure");
            Enum SYNTHETIC_ID_COMPONENT = Enum.forString("SyntheticIdComponent");
            Enum VARIABLE_DESCRIPTOR_COMPONENT = Enum.forString("VariableDescriptorComponent");
            Enum VARIABLE_VALUE_COMPONENT = Enum.forString("VariableValueComponent");
            Enum WIDE_DATA_STRUCTURE = Enum.forString("WideDataStructure");

            int INT_ATTRIBUTE_COMPONENT = Enum.INT_ATTRIBUTE_COMPONENT;
            int INT_CONTEXTUAL_COMPONENT = Enum.INT_CONTEXTUAL_COMPONENT;
            int INT_DATA_STRUCTURE = Enum.INT_DATA_STRUCTURE;
            int INT_DATA_STRUCTURE_COMPONENT = Enum.INT_DATA_STRUCTURE_COMPONENT;
            int INT_DIMENSION_COMPONENT = Enum.INT_DIMENSION_COMPONENT;
            int INT_DIMENSIONAL_DATA_STRUCTURE = Enum.INT_DIMENSIONAL_DATA_STRUCTURE;
            int INT_IDENTIFIER_COMPONENT = Enum.INT_IDENTIFIER_COMPONENT;
            int INT_KEY_VALUE_STRUCTURE = Enum.INT_KEY_VALUE_STRUCTURE;
            int INT_LONG_DATA_STRUCTURE = Enum.INT_LONG_DATA_STRUCTURE;
            int INT_MEASURE_COMPONENT = Enum.INT_MEASURE_COMPONENT;
            int INT_QUALIFIED_MEASURE = Enum.INT_QUALIFIED_MEASURE;
            int INT_SYNTHETIC_ID_COMPONENT = Enum.INT_SYNTHETIC_ID_COMPONENT;
            int INT_VARIABLE_DESCRIPTOR_COMPONENT = Enum.INT_VARIABLE_DESCRIPTOR_COMPONENT;
            int INT_VARIABLE_VALUE_COMPONENT = Enum.INT_VARIABLE_VALUE_COMPONENT;
            int INT_WIDE_DATA_STRUCTURE = Enum.INT_WIDE_DATA_STRUCTURE;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKeyComponent$ForeignKeyComponentCorrespondsToDataStructureComponent$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_ATTRIBUTE_COMPONENT
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

                static final int INT_ATTRIBUTE_COMPONENT = 1;
                static final int INT_CONTEXTUAL_COMPONENT = 2;
                static final int INT_DATA_STRUCTURE = 3;
                static final int INT_DATA_STRUCTURE_COMPONENT = 4;
                static final int INT_DIMENSION_COMPONENT = 5;
                static final int INT_DIMENSIONAL_DATA_STRUCTURE = 6;
                static final int INT_IDENTIFIER_COMPONENT = 7;
                static final int INT_KEY_VALUE_STRUCTURE = 8;
                static final int INT_LONG_DATA_STRUCTURE = 9;
                static final int INT_MEASURE_COMPONENT = 10;
                static final int INT_QUALIFIED_MEASURE = 11;
                static final int INT_SYNTHETIC_ID_COMPONENT = 12;
                static final int INT_VARIABLE_DESCRIPTOR_COMPONENT = 13;
                static final int INT_VARIABLE_VALUE_COMPONENT = 14;
                static final int INT_WIDE_DATA_STRUCTURE = 15;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("AttributeComponent", INT_ATTRIBUTE_COMPONENT),
                    new Enum("ContextualComponent", INT_CONTEXTUAL_COMPONENT),
                    new Enum("DataStructure", INT_DATA_STRUCTURE),
                    new Enum("DataStructureComponent", INT_DATA_STRUCTURE_COMPONENT),
                    new Enum("DimensionComponent", INT_DIMENSION_COMPONENT),
                    new Enum("DimensionalDataStructure", INT_DIMENSIONAL_DATA_STRUCTURE),
                    new Enum("IdentifierComponent", INT_IDENTIFIER_COMPONENT),
                    new Enum("KeyValueStructure", INT_KEY_VALUE_STRUCTURE),
                    new Enum("LongDataStructure", INT_LONG_DATA_STRUCTURE),
                    new Enum("MeasureComponent", INT_MEASURE_COMPONENT),
                    new Enum("QualifiedMeasure", INT_QUALIFIED_MEASURE),
                    new Enum("SyntheticIdComponent", INT_SYNTHETIC_ID_COMPONENT),
                    new Enum("VariableDescriptorComponent", INT_VARIABLE_DESCRIPTOR_COMPONENT),
                    new Enum("VariableValueComponent", INT_VARIABLE_VALUE_COMPONENT),
                    new Enum("WideDataStructure", INT_WIDE_DATA_STRUCTURE),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }
}
