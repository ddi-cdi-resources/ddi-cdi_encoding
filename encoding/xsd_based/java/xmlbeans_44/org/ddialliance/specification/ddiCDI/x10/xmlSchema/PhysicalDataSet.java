/*
 * XML Type:  PhysicalDataSet
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML PhysicalDataSet(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface PhysicalDataSet extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "physicaldataset76adtype");
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
     * Gets the "name" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName getName();

    /**
     * True if has "name" element
     */
    boolean isSetName();

    /**
     * Sets the "name" element
     */
    void setName(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName name);

    /**
     * Appends and returns a new empty "name" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName addNewName();

    /**
     * Unsets the "name" element
     */
    void unsetName();

    /**
     * Gets the "numberOfSegments" element
     */
    java.math.BigInteger getNumberOfSegments();

    /**
     * Gets (as xml) the "numberOfSegments" element
     */
    org.apache.xmlbeans.XmlInteger xgetNumberOfSegments();

    /**
     * True if has "numberOfSegments" element
     */
    boolean isSetNumberOfSegments();

    /**
     * Sets the "numberOfSegments" element
     */
    void setNumberOfSegments(java.math.BigInteger numberOfSegments);

    /**
     * Sets (as xml) the "numberOfSegments" element
     */
    void xsetNumberOfSegments(org.apache.xmlbeans.XmlInteger numberOfSegments);

    /**
     * Unsets the "numberOfSegments" element
     */
    void unsetNumberOfSegments();

    /**
     * Gets the "overview" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getOverview();

    /**
     * True if has "overview" element
     */
    boolean isSetOverview();

    /**
     * Sets the "overview" element
     */
    void setOverview(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString overview);

    /**
     * Appends and returns a new empty "overview" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewOverview();

    /**
     * Unsets the "overview" element
     */
    void unsetOverview();

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
     * Gets a List of "PhysicalDataSet_isDefinedBy_Concept" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet.PhysicalDataSetIsDefinedByConcept> getPhysicalDataSetIsDefinedByConceptList();

    /**
     * Gets array of all "PhysicalDataSet_isDefinedBy_Concept" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet.PhysicalDataSetIsDefinedByConcept[] getPhysicalDataSetIsDefinedByConceptArray();

    /**
     * Gets ith "PhysicalDataSet_isDefinedBy_Concept" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet.PhysicalDataSetIsDefinedByConcept getPhysicalDataSetIsDefinedByConceptArray(int i);

    /**
     * Returns number of "PhysicalDataSet_isDefinedBy_Concept" element
     */
    int sizeOfPhysicalDataSetIsDefinedByConceptArray();

    /**
     * Sets array of all "PhysicalDataSet_isDefinedBy_Concept" element
     */
    void setPhysicalDataSetIsDefinedByConceptArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet.PhysicalDataSetIsDefinedByConcept[] physicalDataSetIsDefinedByConceptArray);

    /**
     * Sets ith "PhysicalDataSet_isDefinedBy_Concept" element
     */
    void setPhysicalDataSetIsDefinedByConceptArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet.PhysicalDataSetIsDefinedByConcept physicalDataSetIsDefinedByConcept);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "PhysicalDataSet_isDefinedBy_Concept" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet.PhysicalDataSetIsDefinedByConcept insertNewPhysicalDataSetIsDefinedByConcept(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "PhysicalDataSet_isDefinedBy_Concept" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet.PhysicalDataSetIsDefinedByConcept addNewPhysicalDataSetIsDefinedByConcept();

    /**
     * Removes the ith "PhysicalDataSet_isDefinedBy_Concept" element
     */
    void removePhysicalDataSetIsDefinedByConcept(int i);

    /**
     * Gets a List of "PhysicalDataSet_formats_DataStore" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet.PhysicalDataSetFormatsDataStore> getPhysicalDataSetFormatsDataStoreList();

    /**
     * Gets array of all "PhysicalDataSet_formats_DataStore" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet.PhysicalDataSetFormatsDataStore[] getPhysicalDataSetFormatsDataStoreArray();

    /**
     * Gets ith "PhysicalDataSet_formats_DataStore" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet.PhysicalDataSetFormatsDataStore getPhysicalDataSetFormatsDataStoreArray(int i);

    /**
     * Returns number of "PhysicalDataSet_formats_DataStore" element
     */
    int sizeOfPhysicalDataSetFormatsDataStoreArray();

    /**
     * Sets array of all "PhysicalDataSet_formats_DataStore" element
     */
    void setPhysicalDataSetFormatsDataStoreArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet.PhysicalDataSetFormatsDataStore[] physicalDataSetFormatsDataStoreArray);

    /**
     * Sets ith "PhysicalDataSet_formats_DataStore" element
     */
    void setPhysicalDataSetFormatsDataStoreArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet.PhysicalDataSetFormatsDataStore physicalDataSetFormatsDataStore);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "PhysicalDataSet_formats_DataStore" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet.PhysicalDataSetFormatsDataStore insertNewPhysicalDataSetFormatsDataStore(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "PhysicalDataSet_formats_DataStore" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet.PhysicalDataSetFormatsDataStore addNewPhysicalDataSetFormatsDataStore();

    /**
     * Removes the ith "PhysicalDataSet_formats_DataStore" element
     */
    void removePhysicalDataSetFormatsDataStore(int i);

    /**
     * Gets a List of "PhysicalDataSet_has_InstanceVariable" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet.PhysicalDataSetHasInstanceVariable> getPhysicalDataSetHasInstanceVariableList();

    /**
     * Gets array of all "PhysicalDataSet_has_InstanceVariable" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet.PhysicalDataSetHasInstanceVariable[] getPhysicalDataSetHasInstanceVariableArray();

    /**
     * Gets ith "PhysicalDataSet_has_InstanceVariable" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet.PhysicalDataSetHasInstanceVariable getPhysicalDataSetHasInstanceVariableArray(int i);

    /**
     * Returns number of "PhysicalDataSet_has_InstanceVariable" element
     */
    int sizeOfPhysicalDataSetHasInstanceVariableArray();

    /**
     * Sets array of all "PhysicalDataSet_has_InstanceVariable" element
     */
    void setPhysicalDataSetHasInstanceVariableArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet.PhysicalDataSetHasInstanceVariable[] physicalDataSetHasInstanceVariableArray);

    /**
     * Sets ith "PhysicalDataSet_has_InstanceVariable" element
     */
    void setPhysicalDataSetHasInstanceVariableArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet.PhysicalDataSetHasInstanceVariable physicalDataSetHasInstanceVariable);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "PhysicalDataSet_has_InstanceVariable" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet.PhysicalDataSetHasInstanceVariable insertNewPhysicalDataSetHasInstanceVariable(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "PhysicalDataSet_has_InstanceVariable" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet.PhysicalDataSetHasInstanceVariable addNewPhysicalDataSetHasInstanceVariable();

    /**
     * Removes the ith "PhysicalDataSet_has_InstanceVariable" element
     */
    void removePhysicalDataSetHasInstanceVariable(int i);

    /**
     * Gets a List of "PhysicalDataSet_has_PhysicalRecordSegment" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet.PhysicalDataSetHasPhysicalRecordSegment> getPhysicalDataSetHasPhysicalRecordSegmentList();

    /**
     * Gets array of all "PhysicalDataSet_has_PhysicalRecordSegment" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet.PhysicalDataSetHasPhysicalRecordSegment[] getPhysicalDataSetHasPhysicalRecordSegmentArray();

    /**
     * Gets ith "PhysicalDataSet_has_PhysicalRecordSegment" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet.PhysicalDataSetHasPhysicalRecordSegment getPhysicalDataSetHasPhysicalRecordSegmentArray(int i);

    /**
     * Returns number of "PhysicalDataSet_has_PhysicalRecordSegment" element
     */
    int sizeOfPhysicalDataSetHasPhysicalRecordSegmentArray();

    /**
     * Sets array of all "PhysicalDataSet_has_PhysicalRecordSegment" element
     */
    void setPhysicalDataSetHasPhysicalRecordSegmentArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet.PhysicalDataSetHasPhysicalRecordSegment[] physicalDataSetHasPhysicalRecordSegmentArray);

    /**
     * Sets ith "PhysicalDataSet_has_PhysicalRecordSegment" element
     */
    void setPhysicalDataSetHasPhysicalRecordSegmentArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet.PhysicalDataSetHasPhysicalRecordSegment physicalDataSetHasPhysicalRecordSegment);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "PhysicalDataSet_has_PhysicalRecordSegment" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet.PhysicalDataSetHasPhysicalRecordSegment insertNewPhysicalDataSetHasPhysicalRecordSegment(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "PhysicalDataSet_has_PhysicalRecordSegment" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet.PhysicalDataSetHasPhysicalRecordSegment addNewPhysicalDataSetHasPhysicalRecordSegment();

    /**
     * Removes the ith "PhysicalDataSet_has_PhysicalRecordSegment" element
     */
    void removePhysicalDataSetHasPhysicalRecordSegment(int i);

    /**
     * Gets a List of "PhysicalDataSet_has_PhysicalRecordSegmentPosition" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet.PhysicalDataSetHasPhysicalRecordSegmentPosition> getPhysicalDataSetHasPhysicalRecordSegmentPositionList();

    /**
     * Gets array of all "PhysicalDataSet_has_PhysicalRecordSegmentPosition" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet.PhysicalDataSetHasPhysicalRecordSegmentPosition[] getPhysicalDataSetHasPhysicalRecordSegmentPositionArray();

    /**
     * Gets ith "PhysicalDataSet_has_PhysicalRecordSegmentPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet.PhysicalDataSetHasPhysicalRecordSegmentPosition getPhysicalDataSetHasPhysicalRecordSegmentPositionArray(int i);

    /**
     * Returns number of "PhysicalDataSet_has_PhysicalRecordSegmentPosition" element
     */
    int sizeOfPhysicalDataSetHasPhysicalRecordSegmentPositionArray();

    /**
     * Sets array of all "PhysicalDataSet_has_PhysicalRecordSegmentPosition" element
     */
    void setPhysicalDataSetHasPhysicalRecordSegmentPositionArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet.PhysicalDataSetHasPhysicalRecordSegmentPosition[] physicalDataSetHasPhysicalRecordSegmentPositionArray);

    /**
     * Sets ith "PhysicalDataSet_has_PhysicalRecordSegmentPosition" element
     */
    void setPhysicalDataSetHasPhysicalRecordSegmentPositionArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet.PhysicalDataSetHasPhysicalRecordSegmentPosition physicalDataSetHasPhysicalRecordSegmentPosition);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "PhysicalDataSet_has_PhysicalRecordSegmentPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet.PhysicalDataSetHasPhysicalRecordSegmentPosition insertNewPhysicalDataSetHasPhysicalRecordSegmentPosition(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "PhysicalDataSet_has_PhysicalRecordSegmentPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet.PhysicalDataSetHasPhysicalRecordSegmentPosition addNewPhysicalDataSetHasPhysicalRecordSegmentPosition();

    /**
     * Removes the ith "PhysicalDataSet_has_PhysicalRecordSegmentPosition" element
     */
    void removePhysicalDataSetHasPhysicalRecordSegmentPosition(int i);

    /**
     * An XML PhysicalDataSet_isDefinedBy_Concept(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface PhysicalDataSetIsDefinedByConcept extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet.PhysicalDataSetIsDefinedByConcept> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "physicaldatasetisdefinedbyconceptafbaelemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet$PhysicalDataSetIsDefinedByConcept$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet.PhysicalDataSetIsDefinedByConcept.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "validtypefa7celemtype");
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
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet$PhysicalDataSetIsDefinedByConcept$ValidType.
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
     * An XML PhysicalDataSet_formats_DataStore(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface PhysicalDataSetFormatsDataStore extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet.PhysicalDataSetFormatsDataStore> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "physicaldatasetformatsdatastore2e4felemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet$PhysicalDataSetFormatsDataStore$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet.PhysicalDataSetFormatsDataStore.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "validtype4191elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum DATA_STORE = Enum.forString("DataStore");

            int INT_DATA_STORE = Enum.INT_DATA_STORE;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet$PhysicalDataSetFormatsDataStore$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_DATA_STORE
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

                static final int INT_DATA_STORE = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("DataStore", INT_DATA_STORE),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }

    /**
     * An XML PhysicalDataSet_has_InstanceVariable(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface PhysicalDataSetHasInstanceVariable extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet.PhysicalDataSetHasInstanceVariable> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "physicaldatasethasinstancevariable4ebdelemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet$PhysicalDataSetHasInstanceVariable$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet.PhysicalDataSetHasInstanceVariable.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "validtype5c3belemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum INSTANCE_VARIABLE = Enum.forString("InstanceVariable");

            int INT_INSTANCE_VARIABLE = Enum.INT_INSTANCE_VARIABLE;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet$PhysicalDataSetHasInstanceVariable$ValidType.
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
     * An XML PhysicalDataSet_has_PhysicalRecordSegment(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface PhysicalDataSetHasPhysicalRecordSegment extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet.PhysicalDataSetHasPhysicalRecordSegment> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "physicaldatasethasphysicalrecordsegmenta8c1elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet$PhysicalDataSetHasPhysicalRecordSegment$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet.PhysicalDataSetHasPhysicalRecordSegment.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "validtype5a03elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum PHYSICAL_RECORD_SEGMENT = Enum.forString("PhysicalRecordSegment");

            int INT_PHYSICAL_RECORD_SEGMENT = Enum.INT_PHYSICAL_RECORD_SEGMENT;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet$PhysicalDataSetHasPhysicalRecordSegment$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_PHYSICAL_RECORD_SEGMENT
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

                static final int INT_PHYSICAL_RECORD_SEGMENT = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("PhysicalRecordSegment", INT_PHYSICAL_RECORD_SEGMENT),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }

    /**
     * An XML PhysicalDataSet_has_PhysicalRecordSegmentPosition(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface PhysicalDataSetHasPhysicalRecordSegmentPosition extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet.PhysicalDataSetHasPhysicalRecordSegmentPosition> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "physicaldatasethasphysicalrecordsegmentposition5a4aelemtype");
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet$PhysicalDataSetHasPhysicalRecordSegmentPosition$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet.PhysicalDataSetHasPhysicalRecordSegmentPosition.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "validtypea98celemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum PHYSICAL_RECORD_SEGMENT_POSITION = Enum.forString("PhysicalRecordSegmentPosition");

            int INT_PHYSICAL_RECORD_SEGMENT_POSITION = Enum.INT_PHYSICAL_RECORD_SEGMENT_POSITION;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet$PhysicalDataSetHasPhysicalRecordSegmentPosition$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_PHYSICAL_RECORD_SEGMENT_POSITION
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

                static final int INT_PHYSICAL_RECORD_SEGMENT_POSITION = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("PhysicalRecordSegmentPosition", INT_PHYSICAL_RECORD_SEGMENT_POSITION),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }
}
