/*
 * XML Type:  RecordRelation
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.RecordRelation
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML RecordRelation(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface RecordRelation extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.RecordRelation> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "recordrelation280btype");
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
     * Gets a List of "RecordRelation_maps_LogicalRecord" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.RecordRelation.RecordRelationMapsLogicalRecord> getRecordRelationMapsLogicalRecordList();

    /**
     * Gets array of all "RecordRelation_maps_LogicalRecord" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.RecordRelation.RecordRelationMapsLogicalRecord[] getRecordRelationMapsLogicalRecordArray();

    /**
     * Gets ith "RecordRelation_maps_LogicalRecord" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.RecordRelation.RecordRelationMapsLogicalRecord getRecordRelationMapsLogicalRecordArray(int i);

    /**
     * Returns number of "RecordRelation_maps_LogicalRecord" element
     */
    int sizeOfRecordRelationMapsLogicalRecordArray();

    /**
     * Sets array of all "RecordRelation_maps_LogicalRecord" element
     */
    void setRecordRelationMapsLogicalRecordArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.RecordRelation.RecordRelationMapsLogicalRecord[] recordRelationMapsLogicalRecordArray);

    /**
     * Sets ith "RecordRelation_maps_LogicalRecord" element
     */
    void setRecordRelationMapsLogicalRecordArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.RecordRelation.RecordRelationMapsLogicalRecord recordRelationMapsLogicalRecord);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "RecordRelation_maps_LogicalRecord" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.RecordRelation.RecordRelationMapsLogicalRecord insertNewRecordRelationMapsLogicalRecord(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "RecordRelation_maps_LogicalRecord" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.RecordRelation.RecordRelationMapsLogicalRecord addNewRecordRelationMapsLogicalRecord();

    /**
     * Removes the ith "RecordRelation_maps_LogicalRecord" element
     */
    void removeRecordRelationMapsLogicalRecord(int i);

    /**
     * Gets a List of "RecordRelation_has_InstanceVariableMap" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.RecordRelation.RecordRelationHasInstanceVariableMap> getRecordRelationHasInstanceVariableMapList();

    /**
     * Gets array of all "RecordRelation_has_InstanceVariableMap" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.RecordRelation.RecordRelationHasInstanceVariableMap[] getRecordRelationHasInstanceVariableMapArray();

    /**
     * Gets ith "RecordRelation_has_InstanceVariableMap" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.RecordRelation.RecordRelationHasInstanceVariableMap getRecordRelationHasInstanceVariableMapArray(int i);

    /**
     * Returns number of "RecordRelation_has_InstanceVariableMap" element
     */
    int sizeOfRecordRelationHasInstanceVariableMapArray();

    /**
     * Sets array of all "RecordRelation_has_InstanceVariableMap" element
     */
    void setRecordRelationHasInstanceVariableMapArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.RecordRelation.RecordRelationHasInstanceVariableMap[] recordRelationHasInstanceVariableMapArray);

    /**
     * Sets ith "RecordRelation_has_InstanceVariableMap" element
     */
    void setRecordRelationHasInstanceVariableMapArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.RecordRelation.RecordRelationHasInstanceVariableMap recordRelationHasInstanceVariableMap);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "RecordRelation_has_InstanceVariableMap" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.RecordRelation.RecordRelationHasInstanceVariableMap insertNewRecordRelationHasInstanceVariableMap(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "RecordRelation_has_InstanceVariableMap" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.RecordRelation.RecordRelationHasInstanceVariableMap addNewRecordRelationHasInstanceVariableMap();

    /**
     * Removes the ith "RecordRelation_has_InstanceVariableMap" element
     */
    void removeRecordRelationHasInstanceVariableMap(int i);

    /**
     * An XML RecordRelation_maps_LogicalRecord(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface RecordRelationMapsLogicalRecord extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.RecordRelation.RecordRelationMapsLogicalRecord> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "recordrelationmapslogicalrecordfdbbelemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.RecordRelation$RecordRelationMapsLogicalRecord$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.RecordRelation.RecordRelationMapsLogicalRecord.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "validtype7a39elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum LOGICAL_RECORD = Enum.forString("LogicalRecord");

            int INT_LOGICAL_RECORD = Enum.INT_LOGICAL_RECORD;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.RecordRelation$RecordRelationMapsLogicalRecord$ValidType.
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
     * An XML RecordRelation_has_InstanceVariableMap(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface RecordRelationHasInstanceVariableMap extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.RecordRelation.RecordRelationHasInstanceVariableMap> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "recordrelationhasinstancevariablemap23fbelemtype");
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.RecordRelation$RecordRelationHasInstanceVariableMap$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.RecordRelation.RecordRelationHasInstanceVariableMap.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "validtypec63delemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum INSTANCE_VARIABLE_MAP = Enum.forString("InstanceVariableMap");

            int INT_INSTANCE_VARIABLE_MAP = Enum.INT_INSTANCE_VARIABLE_MAP;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.RecordRelation$RecordRelationHasInstanceVariableMap$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_INSTANCE_VARIABLE_MAP
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

                static final int INT_INSTANCE_VARIABLE_MAP = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("InstanceVariableMap", INT_INSTANCE_VARIABLE_MAP),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }
}
