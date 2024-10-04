/*
 * XML Type:  PhysicalDataSetStructure
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSetStructure
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML PhysicalDataSetStructure(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface PhysicalDataSetStructure extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSetStructure> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "physicaldatasetstructure64d0type");
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
     * Gets the "semantics" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getSemantics();

    /**
     * True if has "semantics" element
     */
    boolean isSetSemantics();

    /**
     * Sets the "semantics" element
     */
    void setSemantics(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry semantics);

    /**
     * Appends and returns a new empty "semantics" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewSemantics();

    /**
     * Unsets the "semantics" element
     */
    void unsetSemantics();

    /**
     * Gets the "specification" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.StructureSpecification getSpecification();

    /**
     * True if has "specification" element
     */
    boolean isSetSpecification();

    /**
     * Sets the "specification" element
     */
    void setSpecification(org.ddialliance.specification.ddiCDI.x10.xmlSchema.StructureSpecification specification);

    /**
     * Appends and returns a new empty "specification" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.StructureSpecification addNewSpecification();

    /**
     * Unsets the "specification" element
     */
    void unsetSpecification();

    /**
     * Gets the "topology" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getTopology();

    /**
     * True if has "topology" element
     */
    boolean isSetTopology();

    /**
     * Sets the "topology" element
     */
    void setTopology(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry topology);

    /**
     * Appends and returns a new empty "topology" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewTopology();

    /**
     * Unsets the "topology" element
     */
    void unsetTopology();

    /**
     * Gets the "totality" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.StructureExtent.Enum getTotality();

    /**
     * Gets (as xml) the "totality" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.StructureExtent xgetTotality();

    /**
     * True if has "totality" element
     */
    boolean isSetTotality();

    /**
     * Sets the "totality" element
     */
    void setTotality(org.ddialliance.specification.ddiCDI.x10.xmlSchema.StructureExtent.Enum totality);

    /**
     * Sets (as xml) the "totality" element
     */
    void xsetTotality(org.ddialliance.specification.ddiCDI.x10.xmlSchema.StructureExtent totality);

    /**
     * Unsets the "totality" element
     */
    void unsetTotality();

    /**
     * Gets the "PhysicalDataSetStructure_structures_PhysicalDataSet" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSetStructure.PhysicalDataSetStructureStructuresPhysicalDataSet getPhysicalDataSetStructureStructuresPhysicalDataSet();

    /**
     * True if has "PhysicalDataSetStructure_structures_PhysicalDataSet" element
     */
    boolean isSetPhysicalDataSetStructureStructuresPhysicalDataSet();

    /**
     * Sets the "PhysicalDataSetStructure_structures_PhysicalDataSet" element
     */
    void setPhysicalDataSetStructureStructuresPhysicalDataSet(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSetStructure.PhysicalDataSetStructureStructuresPhysicalDataSet physicalDataSetStructureStructuresPhysicalDataSet);

    /**
     * Appends and returns a new empty "PhysicalDataSetStructure_structures_PhysicalDataSet" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSetStructure.PhysicalDataSetStructureStructuresPhysicalDataSet addNewPhysicalDataSetStructureStructuresPhysicalDataSet();

    /**
     * Unsets the "PhysicalDataSetStructure_structures_PhysicalDataSet" element
     */
    void unsetPhysicalDataSetStructureStructuresPhysicalDataSet();

    /**
     * Gets a List of "PhysicalDataSetStructure_has_PhysicalRecordSegmentRelationship" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSetStructure.PhysicalDataSetStructureHasPhysicalRecordSegmentRelationship> getPhysicalDataSetStructureHasPhysicalRecordSegmentRelationshipList();

    /**
     * Gets array of all "PhysicalDataSetStructure_has_PhysicalRecordSegmentRelationship" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSetStructure.PhysicalDataSetStructureHasPhysicalRecordSegmentRelationship[] getPhysicalDataSetStructureHasPhysicalRecordSegmentRelationshipArray();

    /**
     * Gets ith "PhysicalDataSetStructure_has_PhysicalRecordSegmentRelationship" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSetStructure.PhysicalDataSetStructureHasPhysicalRecordSegmentRelationship getPhysicalDataSetStructureHasPhysicalRecordSegmentRelationshipArray(int i);

    /**
     * Returns number of "PhysicalDataSetStructure_has_PhysicalRecordSegmentRelationship" element
     */
    int sizeOfPhysicalDataSetStructureHasPhysicalRecordSegmentRelationshipArray();

    /**
     * Sets array of all "PhysicalDataSetStructure_has_PhysicalRecordSegmentRelationship" element
     */
    void setPhysicalDataSetStructureHasPhysicalRecordSegmentRelationshipArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSetStructure.PhysicalDataSetStructureHasPhysicalRecordSegmentRelationship[] physicalDataSetStructureHasPhysicalRecordSegmentRelationshipArray);

    /**
     * Sets ith "PhysicalDataSetStructure_has_PhysicalRecordSegmentRelationship" element
     */
    void setPhysicalDataSetStructureHasPhysicalRecordSegmentRelationshipArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSetStructure.PhysicalDataSetStructureHasPhysicalRecordSegmentRelationship physicalDataSetStructureHasPhysicalRecordSegmentRelationship);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "PhysicalDataSetStructure_has_PhysicalRecordSegmentRelationship" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSetStructure.PhysicalDataSetStructureHasPhysicalRecordSegmentRelationship insertNewPhysicalDataSetStructureHasPhysicalRecordSegmentRelationship(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "PhysicalDataSetStructure_has_PhysicalRecordSegmentRelationship" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSetStructure.PhysicalDataSetStructureHasPhysicalRecordSegmentRelationship addNewPhysicalDataSetStructureHasPhysicalRecordSegmentRelationship();

    /**
     * Removes the ith "PhysicalDataSetStructure_has_PhysicalRecordSegmentRelationship" element
     */
    void removePhysicalDataSetStructureHasPhysicalRecordSegmentRelationship(int i);

    /**
     * An XML PhysicalDataSetStructure_structures_PhysicalDataSet(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface PhysicalDataSetStructureStructuresPhysicalDataSet extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSetStructure.PhysicalDataSetStructureStructuresPhysicalDataSet> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "physicaldatasetstructurestructuresphysicaldataset6a35elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSetStructure$PhysicalDataSetStructureStructuresPhysicalDataSet$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSetStructure.PhysicalDataSetStructureStructuresPhysicalDataSet.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "validtype5db3elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum PHYSICAL_DATA_SET = Enum.forString("PhysicalDataSet");

            int INT_PHYSICAL_DATA_SET = Enum.INT_PHYSICAL_DATA_SET;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSetStructure$PhysicalDataSetStructureStructuresPhysicalDataSet$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_PHYSICAL_DATA_SET
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

                static final int INT_PHYSICAL_DATA_SET = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("PhysicalDataSet", INT_PHYSICAL_DATA_SET),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }

    /**
     * An XML PhysicalDataSetStructure_has_PhysicalRecordSegmentRelationship(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface PhysicalDataSetStructureHasPhysicalRecordSegmentRelationship extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSetStructure.PhysicalDataSetStructureHasPhysicalRecordSegmentRelationship> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "physicaldatasetstructurehasphysicalrecordsegmentrelationship57a3elemtype");
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSetStructure$PhysicalDataSetStructureHasPhysicalRecordSegmentRelationship$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSetStructure.PhysicalDataSetStructureHasPhysicalRecordSegmentRelationship.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "validtypee965elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum PHYSICAL_RECORD_SEGMENT_RELATIONSHIP = Enum.forString("PhysicalRecordSegmentRelationship");

            int INT_PHYSICAL_RECORD_SEGMENT_RELATIONSHIP = Enum.INT_PHYSICAL_RECORD_SEGMENT_RELATIONSHIP;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSetStructure$PhysicalDataSetStructureHasPhysicalRecordSegmentRelationship$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_PHYSICAL_RECORD_SEGMENT_RELATIONSHIP
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

                static final int INT_PHYSICAL_RECORD_SEGMENT_RELATIONSHIP = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("PhysicalRecordSegmentRelationship", INT_PHYSICAL_RECORD_SEGMENT_RELATIONSHIP),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }
}
