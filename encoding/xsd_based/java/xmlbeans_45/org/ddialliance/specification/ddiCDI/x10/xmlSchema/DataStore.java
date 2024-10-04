/*
 * XML Type:  DataStore
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML DataStore(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface DataStore extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "datastorebec3type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "aboutMissing" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getAboutMissing();

    /**
     * True if has "aboutMissing" element
     */
    boolean isSetAboutMissing();

    /**
     * Sets the "aboutMissing" element
     */
    void setAboutMissing(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString aboutMissing);

    /**
     * Appends and returns a new empty "aboutMissing" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewAboutMissing();

    /**
     * Unsets the "aboutMissing" element
     */
    void unsetAboutMissing();

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
     * Gets the "characterSet" element
     */
    java.lang.String getCharacterSet();

    /**
     * Gets (as xml) the "characterSet" element
     */
    org.apache.xmlbeans.XmlString xgetCharacterSet();

    /**
     * True if has "characterSet" element
     */
    boolean isSetCharacterSet();

    /**
     * Sets the "characterSet" element
     */
    void setCharacterSet(java.lang.String characterSet);

    /**
     * Sets (as xml) the "characterSet" element
     */
    void xsetCharacterSet(org.apache.xmlbeans.XmlString characterSet);

    /**
     * Unsets the "characterSet" element
     */
    void unsetCharacterSet();

    /**
     * Gets the "dataStoreType" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getDataStoreType();

    /**
     * True if has "dataStoreType" element
     */
    boolean isSetDataStoreType();

    /**
     * Sets the "dataStoreType" element
     */
    void setDataStoreType(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry dataStoreType);

    /**
     * Appends and returns a new empty "dataStoreType" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewDataStoreType();

    /**
     * Unsets the "dataStoreType" element
     */
    void unsetDataStoreType();

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
     * Gets the "recordCount" element
     */
    java.math.BigInteger getRecordCount();

    /**
     * Gets (as xml) the "recordCount" element
     */
    org.apache.xmlbeans.XmlInteger xgetRecordCount();

    /**
     * True if has "recordCount" element
     */
    boolean isSetRecordCount();

    /**
     * Sets the "recordCount" element
     */
    void setRecordCount(java.math.BigInteger recordCount);

    /**
     * Sets (as xml) the "recordCount" element
     */
    void xsetRecordCount(org.apache.xmlbeans.XmlInteger recordCount);

    /**
     * Unsets the "recordCount" element
     */
    void unsetRecordCount();

    /**
     * Gets a List of "DataStore_isDefinedBy_Concept" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreIsDefinedByConcept> getDataStoreIsDefinedByConceptList();

    /**
     * Gets array of all "DataStore_isDefinedBy_Concept" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreIsDefinedByConcept[] getDataStoreIsDefinedByConceptArray();

    /**
     * Gets ith "DataStore_isDefinedBy_Concept" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreIsDefinedByConcept getDataStoreIsDefinedByConceptArray(int i);

    /**
     * Returns number of "DataStore_isDefinedBy_Concept" element
     */
    int sizeOfDataStoreIsDefinedByConceptArray();

    /**
     * Sets array of all "DataStore_isDefinedBy_Concept" element
     */
    void setDataStoreIsDefinedByConceptArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreIsDefinedByConcept[] dataStoreIsDefinedByConceptArray);

    /**
     * Sets ith "DataStore_isDefinedBy_Concept" element
     */
    void setDataStoreIsDefinedByConceptArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreIsDefinedByConcept dataStoreIsDefinedByConcept);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataStore_isDefinedBy_Concept" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreIsDefinedByConcept insertNewDataStoreIsDefinedByConcept(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "DataStore_isDefinedBy_Concept" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreIsDefinedByConcept addNewDataStoreIsDefinedByConcept();

    /**
     * Removes the ith "DataStore_isDefinedBy_Concept" element
     */
    void removeDataStoreIsDefinedByConcept(int i);

    /**
     * Gets a List of "DataStore_has_LogicalRecordPosition" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreHasLogicalRecordPosition> getDataStoreHasLogicalRecordPositionList();

    /**
     * Gets array of all "DataStore_has_LogicalRecordPosition" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreHasLogicalRecordPosition[] getDataStoreHasLogicalRecordPositionArray();

    /**
     * Gets ith "DataStore_has_LogicalRecordPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreHasLogicalRecordPosition getDataStoreHasLogicalRecordPositionArray(int i);

    /**
     * Returns number of "DataStore_has_LogicalRecordPosition" element
     */
    int sizeOfDataStoreHasLogicalRecordPositionArray();

    /**
     * Sets array of all "DataStore_has_LogicalRecordPosition" element
     */
    void setDataStoreHasLogicalRecordPositionArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreHasLogicalRecordPosition[] dataStoreHasLogicalRecordPositionArray);

    /**
     * Sets ith "DataStore_has_LogicalRecordPosition" element
     */
    void setDataStoreHasLogicalRecordPositionArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreHasLogicalRecordPosition dataStoreHasLogicalRecordPosition);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataStore_has_LogicalRecordPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreHasLogicalRecordPosition insertNewDataStoreHasLogicalRecordPosition(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "DataStore_has_LogicalRecordPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreHasLogicalRecordPosition addNewDataStoreHasLogicalRecordPosition();

    /**
     * Removes the ith "DataStore_has_LogicalRecordPosition" element
     */
    void removeDataStoreHasLogicalRecordPosition(int i);

    /**
     * Gets a List of "DataStore_has_LogicalRecord" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreHasLogicalRecord> getDataStoreHasLogicalRecordList();

    /**
     * Gets array of all "DataStore_has_LogicalRecord" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreHasLogicalRecord[] getDataStoreHasLogicalRecordArray();

    /**
     * Gets ith "DataStore_has_LogicalRecord" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreHasLogicalRecord getDataStoreHasLogicalRecordArray(int i);

    /**
     * Returns number of "DataStore_has_LogicalRecord" element
     */
    int sizeOfDataStoreHasLogicalRecordArray();

    /**
     * Sets array of all "DataStore_has_LogicalRecord" element
     */
    void setDataStoreHasLogicalRecordArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreHasLogicalRecord[] dataStoreHasLogicalRecordArray);

    /**
     * Sets ith "DataStore_has_LogicalRecord" element
     */
    void setDataStoreHasLogicalRecordArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreHasLogicalRecord dataStoreHasLogicalRecord);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataStore_has_LogicalRecord" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreHasLogicalRecord insertNewDataStoreHasLogicalRecord(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "DataStore_has_LogicalRecord" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreHasLogicalRecord addNewDataStoreHasLogicalRecord();

    /**
     * Removes the ith "DataStore_has_LogicalRecord" element
     */
    void removeDataStoreHasLogicalRecord(int i);

    /**
     * Gets the "DataStore_has_RecordRelation" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreHasRecordRelation getDataStoreHasRecordRelation();

    /**
     * True if has "DataStore_has_RecordRelation" element
     */
    boolean isSetDataStoreHasRecordRelation();

    /**
     * Sets the "DataStore_has_RecordRelation" element
     */
    void setDataStoreHasRecordRelation(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreHasRecordRelation dataStoreHasRecordRelation);

    /**
     * Appends and returns a new empty "DataStore_has_RecordRelation" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreHasRecordRelation addNewDataStoreHasRecordRelation();

    /**
     * Unsets the "DataStore_has_RecordRelation" element
     */
    void unsetDataStoreHasRecordRelation();

    /**
     * An XML DataStore_isDefinedBy_Concept(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface DataStoreIsDefinedByConcept extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreIsDefinedByConcept> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "datastoreisdefinedbyconcept5e66elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore$DataStoreIsDefinedByConcept$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreIsDefinedByConcept.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "validtype3c28elemtype");
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
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore$DataStoreIsDefinedByConcept$ValidType.
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
     * An XML DataStore_has_LogicalRecordPosition(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface DataStoreHasLogicalRecordPosition extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreHasLogicalRecordPosition> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "datastorehaslogicalrecordposition4325elemtype");
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore$DataStoreHasLogicalRecordPosition$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreHasLogicalRecordPosition.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "validtype4767elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum LOGICAL_RECORD_POSITION = Enum.forString("LogicalRecordPosition");

            int INT_LOGICAL_RECORD_POSITION = Enum.INT_LOGICAL_RECORD_POSITION;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore$DataStoreHasLogicalRecordPosition$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_LOGICAL_RECORD_POSITION
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

                static final int INT_LOGICAL_RECORD_POSITION = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("LogicalRecordPosition", INT_LOGICAL_RECORD_POSITION),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }

    /**
     * An XML DataStore_has_LogicalRecord(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface DataStoreHasLogicalRecord extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreHasLogicalRecord> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "datastorehaslogicalrecord4bdcelemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore$DataStoreHasLogicalRecord$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreHasLogicalRecord.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "validtypeb21eelemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum LOGICAL_RECORD = Enum.forString("LogicalRecord");

            int INT_LOGICAL_RECORD = Enum.INT_LOGICAL_RECORD;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore$DataStoreHasLogicalRecord$ValidType.
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
     * An XML DataStore_has_RecordRelation(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface DataStoreHasRecordRelation extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreHasRecordRelation> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "datastorehasrecordrelationb939elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore$DataStoreHasRecordRelation$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreHasRecordRelation.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "validtype1b37elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum RECORD_RELATION = Enum.forString("RecordRelation");

            int INT_RECORD_RELATION = Enum.INT_RECORD_RELATION;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore$DataStoreHasRecordRelation$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_RECORD_RELATION
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

                static final int INT_RECORD_RELATION = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("RecordRelation", INT_RECORD_RELATION),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }
}
