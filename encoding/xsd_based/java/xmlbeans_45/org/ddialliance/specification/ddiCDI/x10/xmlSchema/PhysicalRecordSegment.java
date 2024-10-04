/*
 * XML Type:  PhysicalRecordSegment
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML PhysicalRecordSegment(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface PhysicalRecordSegment extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "physicalrecordsegment7cf7type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "allowsDuplicates" element
     */
    boolean getAllowsDuplicates();

    /**
     * Gets (as xml) the "allowsDuplicates" element
     */
    org.apache.xmlbeans.XmlBoolean xgetAllowsDuplicates();

    /**
     * Sets the "allowsDuplicates" element
     */
    void setAllowsDuplicates(boolean allowsDuplicates);

    /**
     * Sets (as xml) the "allowsDuplicates" element
     */
    void xsetAllowsDuplicates(org.apache.xmlbeans.XmlBoolean allowsDuplicates);

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
     * Gets the "physicalFileName" element
     */
    java.lang.String getPhysicalFileName();

    /**
     * Gets (as xml) the "physicalFileName" element
     */
    org.apache.xmlbeans.XmlString xgetPhysicalFileName();

    /**
     * True if has "physicalFileName" element
     */
    boolean isSetPhysicalFileName();

    /**
     * Sets the "physicalFileName" element
     */
    void setPhysicalFileName(java.lang.String physicalFileName);

    /**
     * Sets (as xml) the "physicalFileName" element
     */
    void xsetPhysicalFileName(org.apache.xmlbeans.XmlString physicalFileName);

    /**
     * Unsets the "physicalFileName" element
     */
    void unsetPhysicalFileName();

    /**
     * Gets the "purpose" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getPurpose();

    /**
     * True if has "purpose" element
     */
    boolean isSetPurpose();

    /**
     * Sets the "purpose" element
     */
    void setPurpose(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString purpose);

    /**
     * Appends and returns a new empty "purpose" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewPurpose();

    /**
     * Unsets the "purpose" element
     */
    void unsetPurpose();

    /**
     * Gets the "PhysicalRecordSegment_represents_Population" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment.PhysicalRecordSegmentRepresentsPopulation getPhysicalRecordSegmentRepresentsPopulation();

    /**
     * True if has "PhysicalRecordSegment_represents_Population" element
     */
    boolean isSetPhysicalRecordSegmentRepresentsPopulation();

    /**
     * Sets the "PhysicalRecordSegment_represents_Population" element
     */
    void setPhysicalRecordSegmentRepresentsPopulation(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment.PhysicalRecordSegmentRepresentsPopulation physicalRecordSegmentRepresentsPopulation);

    /**
     * Appends and returns a new empty "PhysicalRecordSegment_represents_Population" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment.PhysicalRecordSegmentRepresentsPopulation addNewPhysicalRecordSegmentRepresentsPopulation();

    /**
     * Unsets the "PhysicalRecordSegment_represents_Population" element
     */
    void unsetPhysicalRecordSegmentRepresentsPopulation();

    /**
     * Gets a List of "PhysicalRecordSegment_isDefinedBy_Concept" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment.PhysicalRecordSegmentIsDefinedByConcept> getPhysicalRecordSegmentIsDefinedByConceptList();

    /**
     * Gets array of all "PhysicalRecordSegment_isDefinedBy_Concept" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment.PhysicalRecordSegmentIsDefinedByConcept[] getPhysicalRecordSegmentIsDefinedByConceptArray();

    /**
     * Gets ith "PhysicalRecordSegment_isDefinedBy_Concept" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment.PhysicalRecordSegmentIsDefinedByConcept getPhysicalRecordSegmentIsDefinedByConceptArray(int i);

    /**
     * Returns number of "PhysicalRecordSegment_isDefinedBy_Concept" element
     */
    int sizeOfPhysicalRecordSegmentIsDefinedByConceptArray();

    /**
     * Sets array of all "PhysicalRecordSegment_isDefinedBy_Concept" element
     */
    void setPhysicalRecordSegmentIsDefinedByConceptArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment.PhysicalRecordSegmentIsDefinedByConcept[] physicalRecordSegmentIsDefinedByConceptArray);

    /**
     * Sets ith "PhysicalRecordSegment_isDefinedBy_Concept" element
     */
    void setPhysicalRecordSegmentIsDefinedByConceptArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment.PhysicalRecordSegmentIsDefinedByConcept physicalRecordSegmentIsDefinedByConcept);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "PhysicalRecordSegment_isDefinedBy_Concept" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment.PhysicalRecordSegmentIsDefinedByConcept insertNewPhysicalRecordSegmentIsDefinedByConcept(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "PhysicalRecordSegment_isDefinedBy_Concept" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment.PhysicalRecordSegmentIsDefinedByConcept addNewPhysicalRecordSegmentIsDefinedByConcept();

    /**
     * Removes the ith "PhysicalRecordSegment_isDefinedBy_Concept" element
     */
    void removePhysicalRecordSegmentIsDefinedByConcept(int i);

    /**
     * Gets the "PhysicalRecordSegment_has_PhysicalSegmentLayout" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment.PhysicalRecordSegmentHasPhysicalSegmentLayout getPhysicalRecordSegmentHasPhysicalSegmentLayout();

    /**
     * True if has "PhysicalRecordSegment_has_PhysicalSegmentLayout" element
     */
    boolean isSetPhysicalRecordSegmentHasPhysicalSegmentLayout();

    /**
     * Sets the "PhysicalRecordSegment_has_PhysicalSegmentLayout" element
     */
    void setPhysicalRecordSegmentHasPhysicalSegmentLayout(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment.PhysicalRecordSegmentHasPhysicalSegmentLayout physicalRecordSegmentHasPhysicalSegmentLayout);

    /**
     * Appends and returns a new empty "PhysicalRecordSegment_has_PhysicalSegmentLayout" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment.PhysicalRecordSegmentHasPhysicalSegmentLayout addNewPhysicalRecordSegmentHasPhysicalSegmentLayout();

    /**
     * Unsets the "PhysicalRecordSegment_has_PhysicalSegmentLayout" element
     */
    void unsetPhysicalRecordSegmentHasPhysicalSegmentLayout();

    /**
     * Gets the "PhysicalRecordSegment_mapsTo_LogicalRecord" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment.PhysicalRecordSegmentMapsToLogicalRecord getPhysicalRecordSegmentMapsToLogicalRecord();

    /**
     * True if has "PhysicalRecordSegment_mapsTo_LogicalRecord" element
     */
    boolean isSetPhysicalRecordSegmentMapsToLogicalRecord();

    /**
     * Sets the "PhysicalRecordSegment_mapsTo_LogicalRecord" element
     */
    void setPhysicalRecordSegmentMapsToLogicalRecord(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment.PhysicalRecordSegmentMapsToLogicalRecord physicalRecordSegmentMapsToLogicalRecord);

    /**
     * Appends and returns a new empty "PhysicalRecordSegment_mapsTo_LogicalRecord" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment.PhysicalRecordSegmentMapsToLogicalRecord addNewPhysicalRecordSegmentMapsToLogicalRecord();

    /**
     * Unsets the "PhysicalRecordSegment_mapsTo_LogicalRecord" element
     */
    void unsetPhysicalRecordSegmentMapsToLogicalRecord();

    /**
     * Gets a List of "PhysicalRecordSegment_has_DataPointPosition" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment.PhysicalRecordSegmentHasDataPointPosition> getPhysicalRecordSegmentHasDataPointPositionList();

    /**
     * Gets array of all "PhysicalRecordSegment_has_DataPointPosition" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment.PhysicalRecordSegmentHasDataPointPosition[] getPhysicalRecordSegmentHasDataPointPositionArray();

    /**
     * Gets ith "PhysicalRecordSegment_has_DataPointPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment.PhysicalRecordSegmentHasDataPointPosition getPhysicalRecordSegmentHasDataPointPositionArray(int i);

    /**
     * Returns number of "PhysicalRecordSegment_has_DataPointPosition" element
     */
    int sizeOfPhysicalRecordSegmentHasDataPointPositionArray();

    /**
     * Sets array of all "PhysicalRecordSegment_has_DataPointPosition" element
     */
    void setPhysicalRecordSegmentHasDataPointPositionArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment.PhysicalRecordSegmentHasDataPointPosition[] physicalRecordSegmentHasDataPointPositionArray);

    /**
     * Sets ith "PhysicalRecordSegment_has_DataPointPosition" element
     */
    void setPhysicalRecordSegmentHasDataPointPositionArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment.PhysicalRecordSegmentHasDataPointPosition physicalRecordSegmentHasDataPointPosition);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "PhysicalRecordSegment_has_DataPointPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment.PhysicalRecordSegmentHasDataPointPosition insertNewPhysicalRecordSegmentHasDataPointPosition(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "PhysicalRecordSegment_has_DataPointPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment.PhysicalRecordSegmentHasDataPointPosition addNewPhysicalRecordSegmentHasDataPointPosition();

    /**
     * Removes the ith "PhysicalRecordSegment_has_DataPointPosition" element
     */
    void removePhysicalRecordSegmentHasDataPointPosition(int i);

    /**
     * Gets a List of "PhysicalRecordSegment_has_DataPoint" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment.PhysicalRecordSegmentHasDataPoint> getPhysicalRecordSegmentHasDataPointList();

    /**
     * Gets array of all "PhysicalRecordSegment_has_DataPoint" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment.PhysicalRecordSegmentHasDataPoint[] getPhysicalRecordSegmentHasDataPointArray();

    /**
     * Gets ith "PhysicalRecordSegment_has_DataPoint" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment.PhysicalRecordSegmentHasDataPoint getPhysicalRecordSegmentHasDataPointArray(int i);

    /**
     * Returns number of "PhysicalRecordSegment_has_DataPoint" element
     */
    int sizeOfPhysicalRecordSegmentHasDataPointArray();

    /**
     * Sets array of all "PhysicalRecordSegment_has_DataPoint" element
     */
    void setPhysicalRecordSegmentHasDataPointArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment.PhysicalRecordSegmentHasDataPoint[] physicalRecordSegmentHasDataPointArray);

    /**
     * Sets ith "PhysicalRecordSegment_has_DataPoint" element
     */
    void setPhysicalRecordSegmentHasDataPointArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment.PhysicalRecordSegmentHasDataPoint physicalRecordSegmentHasDataPoint);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "PhysicalRecordSegment_has_DataPoint" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment.PhysicalRecordSegmentHasDataPoint insertNewPhysicalRecordSegmentHasDataPoint(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "PhysicalRecordSegment_has_DataPoint" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment.PhysicalRecordSegmentHasDataPoint addNewPhysicalRecordSegmentHasDataPoint();

    /**
     * Removes the ith "PhysicalRecordSegment_has_DataPoint" element
     */
    void removePhysicalRecordSegmentHasDataPoint(int i);

    /**
     * An XML PhysicalRecordSegment_represents_Population(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface PhysicalRecordSegmentRepresentsPopulation extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment.PhysicalRecordSegmentRepresentsPopulation> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "physicalrecordsegmentrepresentspopulationb570elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment$PhysicalRecordSegmentRepresentsPopulation$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment.PhysicalRecordSegmentRepresentsPopulation.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "validtype04b2elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum POPULATION = Enum.forString("Population");

            int INT_POPULATION = Enum.INT_POPULATION;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment$PhysicalRecordSegmentRepresentsPopulation$ValidType.
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

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("Population", INT_POPULATION),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }

    /**
     * An XML PhysicalRecordSegment_isDefinedBy_Concept(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface PhysicalRecordSegmentIsDefinedByConcept extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment.PhysicalRecordSegmentIsDefinedByConcept> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "physicalrecordsegmentisdefinedbyconceptfeceelemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment$PhysicalRecordSegmentIsDefinedByConcept$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment.PhysicalRecordSegmentIsDefinedByConcept.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "validtype3690elemtype");
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
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment$PhysicalRecordSegmentIsDefinedByConcept$ValidType.
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
     * An XML PhysicalRecordSegment_has_PhysicalSegmentLayout(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface PhysicalRecordSegmentHasPhysicalSegmentLayout extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment.PhysicalRecordSegmentHasPhysicalSegmentLayout> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "physicalrecordsegmenthasphysicalsegmentlayout2a30elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment$PhysicalRecordSegmentHasPhysicalSegmentLayout$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment.PhysicalRecordSegmentHasPhysicalSegmentLayout.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "validtype0872elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum PHYSICAL_SEGMENT_LAYOUT = Enum.forString("PhysicalSegmentLayout");
            Enum UNIT_SEGMENT_LAYOUT = Enum.forString("UnitSegmentLayout");

            int INT_PHYSICAL_SEGMENT_LAYOUT = Enum.INT_PHYSICAL_SEGMENT_LAYOUT;
            int INT_UNIT_SEGMENT_LAYOUT = Enum.INT_UNIT_SEGMENT_LAYOUT;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment$PhysicalRecordSegmentHasPhysicalSegmentLayout$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_PHYSICAL_SEGMENT_LAYOUT
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

                static final int INT_PHYSICAL_SEGMENT_LAYOUT = 1;
                static final int INT_UNIT_SEGMENT_LAYOUT = 2;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("PhysicalSegmentLayout", INT_PHYSICAL_SEGMENT_LAYOUT),
                    new Enum("UnitSegmentLayout", INT_UNIT_SEGMENT_LAYOUT),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }

    /**
     * An XML PhysicalRecordSegment_mapsTo_LogicalRecord(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface PhysicalRecordSegmentMapsToLogicalRecord extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment.PhysicalRecordSegmentMapsToLogicalRecord> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "physicalrecordsegmentmapstologicalrecord7c74elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment$PhysicalRecordSegmentMapsToLogicalRecord$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment.PhysicalRecordSegmentMapsToLogicalRecord.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "validtype3cf2elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum LOGICAL_RECORD = Enum.forString("LogicalRecord");

            int INT_LOGICAL_RECORD = Enum.INT_LOGICAL_RECORD;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment$PhysicalRecordSegmentMapsToLogicalRecord$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_LOGICAL_RECORD
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

                static final int INT_LOGICAL_RECORD = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("LogicalRecord", INT_LOGICAL_RECORD),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }

    /**
     * An XML PhysicalRecordSegment_has_DataPointPosition(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface PhysicalRecordSegmentHasDataPointPosition extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment.PhysicalRecordSegmentHasDataPointPosition> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "physicalrecordsegmenthasdatapointposition21d9elemtype");
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment$PhysicalRecordSegmentHasDataPointPosition$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment.PhysicalRecordSegmentHasDataPointPosition.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "validtype711belemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum DATA_POINT_POSITION = Enum.forString("DataPointPosition");

            int INT_DATA_POINT_POSITION = Enum.INT_DATA_POINT_POSITION;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment$PhysicalRecordSegmentHasDataPointPosition$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_DATA_POINT_POSITION
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

                static final int INT_DATA_POINT_POSITION = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("DataPointPosition", INT_DATA_POINT_POSITION),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }

    /**
     * An XML PhysicalRecordSegment_has_DataPoint(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface PhysicalRecordSegmentHasDataPoint extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment.PhysicalRecordSegmentHasDataPoint> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "physicalrecordsegmenthasdatapoint5010elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment$PhysicalRecordSegmentHasDataPoint$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment.PhysicalRecordSegmentHasDataPoint.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "validtype0152elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum DATA_POINT = Enum.forString("DataPoint");

            int INT_DATA_POINT = Enum.INT_DATA_POINT;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment$PhysicalRecordSegmentHasDataPoint$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_DATA_POINT
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

                static final int INT_DATA_POINT = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("DataPoint", INT_DATA_POINT),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }
}
