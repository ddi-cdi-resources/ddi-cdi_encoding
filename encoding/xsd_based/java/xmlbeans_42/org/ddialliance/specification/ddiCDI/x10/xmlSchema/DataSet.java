/*
 * XML Type:  DataSet
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataSet
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML DataSet(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface DataSet extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataSet> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "dataseta204type");
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
     * Gets a List of "DataSet_isStructuredBy_DataStructure" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataSet.DataSetIsStructuredByDataStructure> getDataSetIsStructuredByDataStructureList();

    /**
     * Gets array of all "DataSet_isStructuredBy_DataStructure" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataSet.DataSetIsStructuredByDataStructure[] getDataSetIsStructuredByDataStructureArray();

    /**
     * Gets ith "DataSet_isStructuredBy_DataStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataSet.DataSetIsStructuredByDataStructure getDataSetIsStructuredByDataStructureArray(int i);

    /**
     * Returns number of "DataSet_isStructuredBy_DataStructure" element
     */
    int sizeOfDataSetIsStructuredByDataStructureArray();

    /**
     * Sets array of all "DataSet_isStructuredBy_DataStructure" element
     */
    void setDataSetIsStructuredByDataStructureArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataSet.DataSetIsStructuredByDataStructure[] dataSetIsStructuredByDataStructureArray);

    /**
     * Sets ith "DataSet_isStructuredBy_DataStructure" element
     */
    void setDataSetIsStructuredByDataStructureArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataSet.DataSetIsStructuredByDataStructure dataSetIsStructuredByDataStructure);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataSet_isStructuredBy_DataStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataSet.DataSetIsStructuredByDataStructure insertNewDataSetIsStructuredByDataStructure(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "DataSet_isStructuredBy_DataStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataSet.DataSetIsStructuredByDataStructure addNewDataSetIsStructuredByDataStructure();

    /**
     * Removes the ith "DataSet_isStructuredBy_DataStructure" element
     */
    void removeDataSetIsStructuredByDataStructure(int i);

    /**
     * Gets a List of "DataSet_has_DataPoint" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataSet.DataSetHasDataPoint> getDataSetHasDataPointList();

    /**
     * Gets array of all "DataSet_has_DataPoint" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataSet.DataSetHasDataPoint[] getDataSetHasDataPointArray();

    /**
     * Gets ith "DataSet_has_DataPoint" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataSet.DataSetHasDataPoint getDataSetHasDataPointArray(int i);

    /**
     * Returns number of "DataSet_has_DataPoint" element
     */
    int sizeOfDataSetHasDataPointArray();

    /**
     * Sets array of all "DataSet_has_DataPoint" element
     */
    void setDataSetHasDataPointArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataSet.DataSetHasDataPoint[] dataSetHasDataPointArray);

    /**
     * Sets ith "DataSet_has_DataPoint" element
     */
    void setDataSetHasDataPointArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataSet.DataSetHasDataPoint dataSetHasDataPoint);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataSet_has_DataPoint" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataSet.DataSetHasDataPoint insertNewDataSetHasDataPoint(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "DataSet_has_DataPoint" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataSet.DataSetHasDataPoint addNewDataSetHasDataPoint();

    /**
     * Removes the ith "DataSet_has_DataPoint" element
     */
    void removeDataSetHasDataPoint(int i);

    /**
     * Gets a List of "DataSet_has_Key" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataSet.DataSetHasKey> getDataSetHasKeyList();

    /**
     * Gets array of all "DataSet_has_Key" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataSet.DataSetHasKey[] getDataSetHasKeyArray();

    /**
     * Gets ith "DataSet_has_Key" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataSet.DataSetHasKey getDataSetHasKeyArray(int i);

    /**
     * Returns number of "DataSet_has_Key" element
     */
    int sizeOfDataSetHasKeyArray();

    /**
     * Sets array of all "DataSet_has_Key" element
     */
    void setDataSetHasKeyArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataSet.DataSetHasKey[] dataSetHasKeyArray);

    /**
     * Sets ith "DataSet_has_Key" element
     */
    void setDataSetHasKeyArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataSet.DataSetHasKey dataSetHasKey);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataSet_has_Key" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataSet.DataSetHasKey insertNewDataSetHasKey(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "DataSet_has_Key" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataSet.DataSetHasKey addNewDataSetHasKey();

    /**
     * Removes the ith "DataSet_has_Key" element
     */
    void removeDataSetHasKey(int i);

    /**
     * An XML DataSet_isStructuredBy_DataStructure(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface DataSetIsStructuredByDataStructure extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataSet.DataSetIsStructuredByDataStructure> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "datasetisstructuredbydatastructuref923elemtype");
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataSet$DataSetIsStructuredByDataStructure$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataSet.DataSetIsStructuredByDataStructure.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "validtype64a1elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum DATA_STRUCTURE = Enum.forString("DataStructure");
            Enum DIMENSIONAL_DATA_STRUCTURE = Enum.forString("DimensionalDataStructure");
            Enum KEY_VALUE_STRUCTURE = Enum.forString("KeyValueStructure");
            Enum LONG_DATA_STRUCTURE = Enum.forString("LongDataStructure");
            Enum WIDE_DATA_STRUCTURE = Enum.forString("WideDataStructure");

            int INT_DATA_STRUCTURE = Enum.INT_DATA_STRUCTURE;
            int INT_DIMENSIONAL_DATA_STRUCTURE = Enum.INT_DIMENSIONAL_DATA_STRUCTURE;
            int INT_KEY_VALUE_STRUCTURE = Enum.INT_KEY_VALUE_STRUCTURE;
            int INT_LONG_DATA_STRUCTURE = Enum.INT_LONG_DATA_STRUCTURE;
            int INT_WIDE_DATA_STRUCTURE = Enum.INT_WIDE_DATA_STRUCTURE;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataSet$DataSetIsStructuredByDataStructure$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_DATA_STRUCTURE
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

                static final int INT_DATA_STRUCTURE = 1;
                static final int INT_DIMENSIONAL_DATA_STRUCTURE = 2;
                static final int INT_KEY_VALUE_STRUCTURE = 3;
                static final int INT_LONG_DATA_STRUCTURE = 4;
                static final int INT_WIDE_DATA_STRUCTURE = 5;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("DataStructure", INT_DATA_STRUCTURE),
                    new Enum("DimensionalDataStructure", INT_DIMENSIONAL_DATA_STRUCTURE),
                    new Enum("KeyValueStructure", INT_KEY_VALUE_STRUCTURE),
                    new Enum("LongDataStructure", INT_LONG_DATA_STRUCTURE),
                    new Enum("WideDataStructure", INT_WIDE_DATA_STRUCTURE),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }

    /**
     * An XML DataSet_has_DataPoint(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface DataSetHasDataPoint extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataSet.DataSetHasDataPoint> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "datasethasdatapoint0caaelemtype");
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataSet$DataSetHasDataPoint$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataSet.DataSetHasDataPoint.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "validtyped4ecelemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum DATA_POINT = Enum.forString("DataPoint");

            int INT_DATA_POINT = Enum.INT_DATA_POINT;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataSet$DataSetHasDataPoint$ValidType.
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

    /**
     * An XML DataSet_has_Key(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface DataSetHasKey extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataSet.DataSetHasKey> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "datasethaskey9143elemtype");
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataSet$DataSetHasKey$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataSet.DataSetHasKey.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "validtype3305elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum DIMENSIONAL_KEY = Enum.forString("DimensionalKey");
            Enum INSTANCE_KEY = Enum.forString("InstanceKey");
            Enum KEY = Enum.forString("Key");
            Enum LONG_KEY = Enum.forString("LongKey");
            Enum WIDE_KEY = Enum.forString("WideKey");

            int INT_DIMENSIONAL_KEY = Enum.INT_DIMENSIONAL_KEY;
            int INT_INSTANCE_KEY = Enum.INT_INSTANCE_KEY;
            int INT_KEY = Enum.INT_KEY;
            int INT_LONG_KEY = Enum.INT_LONG_KEY;
            int INT_WIDE_KEY = Enum.INT_WIDE_KEY;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataSet$DataSetHasKey$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_DIMENSIONAL_KEY
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

                static final int INT_DIMENSIONAL_KEY = 1;
                static final int INT_INSTANCE_KEY = 2;
                static final int INT_KEY = 3;
                static final int INT_LONG_KEY = 4;
                static final int INT_WIDE_KEY = 5;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("DimensionalKey", INT_DIMENSIONAL_KEY),
                    new Enum("InstanceKey", INT_INSTANCE_KEY),
                    new Enum("Key", INT_KEY),
                    new Enum("LongKey", INT_LONG_KEY),
                    new Enum("WideKey", INT_WIDE_KEY),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }
}
