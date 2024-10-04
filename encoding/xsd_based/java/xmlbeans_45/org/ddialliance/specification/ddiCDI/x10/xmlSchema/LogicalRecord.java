/*
 * XML Type:  LogicalRecord
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML LogicalRecord(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface LogicalRecord extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "logicalrecord2326type");
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
     * Gets a List of "LogicalRecord_organizes_DataSet" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordOrganizesDataSet> getLogicalRecordOrganizesDataSetList();

    /**
     * Gets array of all "LogicalRecord_organizes_DataSet" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordOrganizesDataSet[] getLogicalRecordOrganizesDataSetArray();

    /**
     * Gets ith "LogicalRecord_organizes_DataSet" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordOrganizesDataSet getLogicalRecordOrganizesDataSetArray(int i);

    /**
     * Returns number of "LogicalRecord_organizes_DataSet" element
     */
    int sizeOfLogicalRecordOrganizesDataSetArray();

    /**
     * Sets array of all "LogicalRecord_organizes_DataSet" element
     */
    void setLogicalRecordOrganizesDataSetArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordOrganizesDataSet[] logicalRecordOrganizesDataSetArray);

    /**
     * Sets ith "LogicalRecord_organizes_DataSet" element
     */
    void setLogicalRecordOrganizesDataSetArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordOrganizesDataSet logicalRecordOrganizesDataSet);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "LogicalRecord_organizes_DataSet" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordOrganizesDataSet insertNewLogicalRecordOrganizesDataSet(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "LogicalRecord_organizes_DataSet" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordOrganizesDataSet addNewLogicalRecordOrganizesDataSet();

    /**
     * Removes the ith "LogicalRecord_organizes_DataSet" element
     */
    void removeLogicalRecordOrganizesDataSet(int i);

    /**
     * Gets a List of "LogicalRecord_isDefinedBy_Concept" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordIsDefinedByConcept> getLogicalRecordIsDefinedByConceptList();

    /**
     * Gets array of all "LogicalRecord_isDefinedBy_Concept" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordIsDefinedByConcept[] getLogicalRecordIsDefinedByConceptArray();

    /**
     * Gets ith "LogicalRecord_isDefinedBy_Concept" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordIsDefinedByConcept getLogicalRecordIsDefinedByConceptArray(int i);

    /**
     * Returns number of "LogicalRecord_isDefinedBy_Concept" element
     */
    int sizeOfLogicalRecordIsDefinedByConceptArray();

    /**
     * Sets array of all "LogicalRecord_isDefinedBy_Concept" element
     */
    void setLogicalRecordIsDefinedByConceptArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordIsDefinedByConcept[] logicalRecordIsDefinedByConceptArray);

    /**
     * Sets ith "LogicalRecord_isDefinedBy_Concept" element
     */
    void setLogicalRecordIsDefinedByConceptArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordIsDefinedByConcept logicalRecordIsDefinedByConcept);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "LogicalRecord_isDefinedBy_Concept" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordIsDefinedByConcept insertNewLogicalRecordIsDefinedByConcept(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "LogicalRecord_isDefinedBy_Concept" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordIsDefinedByConcept addNewLogicalRecordIsDefinedByConcept();

    /**
     * Removes the ith "LogicalRecord_isDefinedBy_Concept" element
     */
    void removeLogicalRecordIsDefinedByConcept(int i);

    /**
     * Gets a List of "LogicalRecord_has_InstanceVariable" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordHasInstanceVariable> getLogicalRecordHasInstanceVariableList();

    /**
     * Gets array of all "LogicalRecord_has_InstanceVariable" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordHasInstanceVariable[] getLogicalRecordHasInstanceVariableArray();

    /**
     * Gets ith "LogicalRecord_has_InstanceVariable" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordHasInstanceVariable getLogicalRecordHasInstanceVariableArray(int i);

    /**
     * Returns number of "LogicalRecord_has_InstanceVariable" element
     */
    int sizeOfLogicalRecordHasInstanceVariableArray();

    /**
     * Sets array of all "LogicalRecord_has_InstanceVariable" element
     */
    void setLogicalRecordHasInstanceVariableArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordHasInstanceVariable[] logicalRecordHasInstanceVariableArray);

    /**
     * Sets ith "LogicalRecord_has_InstanceVariable" element
     */
    void setLogicalRecordHasInstanceVariableArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordHasInstanceVariable logicalRecordHasInstanceVariable);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "LogicalRecord_has_InstanceVariable" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordHasInstanceVariable insertNewLogicalRecordHasInstanceVariable(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "LogicalRecord_has_InstanceVariable" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordHasInstanceVariable addNewLogicalRecordHasInstanceVariable();

    /**
     * Removes the ith "LogicalRecord_has_InstanceVariable" element
     */
    void removeLogicalRecordHasInstanceVariable(int i);

    /**
     * An XML LogicalRecord_organizes_DataSet(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface LogicalRecordOrganizesDataSet extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordOrganizesDataSet> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "logicalrecordorganizesdatasetee56elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord$LogicalRecordOrganizesDataSet$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordOrganizesDataSet.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "validtypef298elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum DATA_SET = Enum.forString("DataSet");
            Enum DIMENSIONAL_DATA_SET = Enum.forString("DimensionalDataSet");
            Enum KEY_VALUE_DATA_STORE = Enum.forString("KeyValueDataStore");
            Enum LONG_DATA_SET = Enum.forString("LongDataSet");
            Enum WIDE_DATA_SET = Enum.forString("WideDataSet");

            int INT_DATA_SET = Enum.INT_DATA_SET;
            int INT_DIMENSIONAL_DATA_SET = Enum.INT_DIMENSIONAL_DATA_SET;
            int INT_KEY_VALUE_DATA_STORE = Enum.INT_KEY_VALUE_DATA_STORE;
            int INT_LONG_DATA_SET = Enum.INT_LONG_DATA_SET;
            int INT_WIDE_DATA_SET = Enum.INT_WIDE_DATA_SET;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord$LogicalRecordOrganizesDataSet$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_DATA_SET
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

                static final int INT_DATA_SET = 1;
                static final int INT_DIMENSIONAL_DATA_SET = 2;
                static final int INT_KEY_VALUE_DATA_STORE = 3;
                static final int INT_LONG_DATA_SET = 4;
                static final int INT_WIDE_DATA_SET = 5;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("DataSet", INT_DATA_SET),
                    new Enum("DimensionalDataSet", INT_DIMENSIONAL_DATA_SET),
                    new Enum("KeyValueDataStore", INT_KEY_VALUE_DATA_STORE),
                    new Enum("LongDataSet", INT_LONG_DATA_SET),
                    new Enum("WideDataSet", INT_WIDE_DATA_SET),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }

    /**
     * An XML LogicalRecord_isDefinedBy_Concept(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface LogicalRecordIsDefinedByConcept extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordIsDefinedByConcept> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "logicalrecordisdefinedbyconcepta7acelemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord$LogicalRecordIsDefinedByConcept$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordIsDefinedByConcept.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "validtypea36eelemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum CATEGORY = Enum.forString("Category");
            Enum CONCEPT = Enum.forString("Concept");
            Enum CONCEPTUAL_VALUE = Enum.forString("ConceptualValue");
            Enum CONCEPTUAL_VARIABLE = Enum.forString("ConceptualVariable");
            Enum DESCRIPTOR_VARIABLE = Enum.forString("DescriptorVariable");
            Enum DIMENSIONAL_KEY_DEFINITION_MEMBER = Enum.forString("DimensionalKeyDefinitionMember");
            Enum INSTANCE_VARIABLE = Enum.forString("InstanceVariable");
            Enum KEY_DEFINITION_MEMBER = Enum.forString("KeyDefinitionMember");
            Enum POPULATION = Enum.forString("Population");
            Enum REFERENCE_VARIABLE = Enum.forString("ReferenceVariable");
            Enum REPRESENTED_VARIABLE = Enum.forString("RepresentedVariable");
            Enum UNIT_TYPE = Enum.forString("UnitType");
            Enum UNIVERSE = Enum.forString("Universe");

            int INT_CATEGORY = Enum.INT_CATEGORY;
            int INT_CONCEPT = Enum.INT_CONCEPT;
            int INT_CONCEPTUAL_VALUE = Enum.INT_CONCEPTUAL_VALUE;
            int INT_CONCEPTUAL_VARIABLE = Enum.INT_CONCEPTUAL_VARIABLE;
            int INT_DESCRIPTOR_VARIABLE = Enum.INT_DESCRIPTOR_VARIABLE;
            int INT_DIMENSIONAL_KEY_DEFINITION_MEMBER = Enum.INT_DIMENSIONAL_KEY_DEFINITION_MEMBER;
            int INT_INSTANCE_VARIABLE = Enum.INT_INSTANCE_VARIABLE;
            int INT_KEY_DEFINITION_MEMBER = Enum.INT_KEY_DEFINITION_MEMBER;
            int INT_POPULATION = Enum.INT_POPULATION;
            int INT_REFERENCE_VARIABLE = Enum.INT_REFERENCE_VARIABLE;
            int INT_REPRESENTED_VARIABLE = Enum.INT_REPRESENTED_VARIABLE;
            int INT_UNIT_TYPE = Enum.INT_UNIT_TYPE;
            int INT_UNIVERSE = Enum.INT_UNIVERSE;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord$LogicalRecordIsDefinedByConcept$ValidType.
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
                static final int INT_CONCEPT = 2;
                static final int INT_CONCEPTUAL_VALUE = 3;
                static final int INT_CONCEPTUAL_VARIABLE = 4;
                static final int INT_DESCRIPTOR_VARIABLE = 5;
                static final int INT_DIMENSIONAL_KEY_DEFINITION_MEMBER = 6;
                static final int INT_INSTANCE_VARIABLE = 7;
                static final int INT_KEY_DEFINITION_MEMBER = 8;
                static final int INT_POPULATION = 9;
                static final int INT_REFERENCE_VARIABLE = 10;
                static final int INT_REPRESENTED_VARIABLE = 11;
                static final int INT_UNIT_TYPE = 12;
                static final int INT_UNIVERSE = 13;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("Category", INT_CATEGORY),
                    new Enum("Concept", INT_CONCEPT),
                    new Enum("ConceptualValue", INT_CONCEPTUAL_VALUE),
                    new Enum("ConceptualVariable", INT_CONCEPTUAL_VARIABLE),
                    new Enum("DescriptorVariable", INT_DESCRIPTOR_VARIABLE),
                    new Enum("DimensionalKeyDefinitionMember", INT_DIMENSIONAL_KEY_DEFINITION_MEMBER),
                    new Enum("InstanceVariable", INT_INSTANCE_VARIABLE),
                    new Enum("KeyDefinitionMember", INT_KEY_DEFINITION_MEMBER),
                    new Enum("Population", INT_POPULATION),
                    new Enum("ReferenceVariable", INT_REFERENCE_VARIABLE),
                    new Enum("RepresentedVariable", INT_REPRESENTED_VARIABLE),
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

    /**
     * An XML LogicalRecord_has_InstanceVariable(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface LogicalRecordHasInstanceVariable extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordHasInstanceVariable> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "logicalrecordhasinstancevariableda1delemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord$LogicalRecordHasInstanceVariable$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord.LogicalRecordHasInstanceVariable.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "validtype569belemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum INSTANCE_VARIABLE = Enum.forString("InstanceVariable");

            int INT_INSTANCE_VARIABLE = Enum.INT_INSTANCE_VARIABLE;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord$LogicalRecordHasInstanceVariable$ValidType.
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
}
