/*
 * XML Type:  ValueMapping
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMapping
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ValueMapping(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface ValueMapping extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMapping> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "valuemappinga2fbtype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "decimalPositions" element
     */
    java.math.BigInteger getDecimalPositions();

    /**
     * Gets (as xml) the "decimalPositions" element
     */
    org.apache.xmlbeans.XmlInteger xgetDecimalPositions();

    /**
     * True if has "decimalPositions" element
     */
    boolean isSetDecimalPositions();

    /**
     * Sets the "decimalPositions" element
     */
    void setDecimalPositions(java.math.BigInteger decimalPositions);

    /**
     * Sets (as xml) the "decimalPositions" element
     */
    void xsetDecimalPositions(org.apache.xmlbeans.XmlInteger decimalPositions);

    /**
     * Unsets the "decimalPositions" element
     */
    void unsetDecimalPositions();

    /**
     * Gets the "defaultDecimalSeparator" element
     */
    java.lang.String getDefaultDecimalSeparator();

    /**
     * Gets (as xml) the "defaultDecimalSeparator" element
     */
    org.apache.xmlbeans.XmlString xgetDefaultDecimalSeparator();

    /**
     * True if has "defaultDecimalSeparator" element
     */
    boolean isSetDefaultDecimalSeparator();

    /**
     * Sets the "defaultDecimalSeparator" element
     */
    void setDefaultDecimalSeparator(java.lang.String defaultDecimalSeparator);

    /**
     * Sets (as xml) the "defaultDecimalSeparator" element
     */
    void xsetDefaultDecimalSeparator(org.apache.xmlbeans.XmlString defaultDecimalSeparator);

    /**
     * Unsets the "defaultDecimalSeparator" element
     */
    void unsetDefaultDecimalSeparator();

    /**
     * Gets the "defaultDigitGroupSeparator" element
     */
    java.lang.String getDefaultDigitGroupSeparator();

    /**
     * Gets (as xml) the "defaultDigitGroupSeparator" element
     */
    org.apache.xmlbeans.XmlString xgetDefaultDigitGroupSeparator();

    /**
     * True if has "defaultDigitGroupSeparator" element
     */
    boolean isSetDefaultDigitGroupSeparator();

    /**
     * Sets the "defaultDigitGroupSeparator" element
     */
    void setDefaultDigitGroupSeparator(java.lang.String defaultDigitGroupSeparator);

    /**
     * Sets (as xml) the "defaultDigitGroupSeparator" element
     */
    void xsetDefaultDigitGroupSeparator(org.apache.xmlbeans.XmlString defaultDigitGroupSeparator);

    /**
     * Unsets the "defaultDigitGroupSeparator" element
     */
    void unsetDefaultDigitGroupSeparator();

    /**
     * Gets the "defaultValue" element
     */
    java.lang.String getDefaultValue();

    /**
     * Gets (as xml) the "defaultValue" element
     */
    org.apache.xmlbeans.XmlString xgetDefaultValue();

    /**
     * Sets the "defaultValue" element
     */
    void setDefaultValue(java.lang.String defaultValue);

    /**
     * Sets (as xml) the "defaultValue" element
     */
    void xsetDefaultValue(org.apache.xmlbeans.XmlString defaultValue);

    /**
     * Gets the "format" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getFormat();

    /**
     * True if has "format" element
     */
    boolean isSetFormat();

    /**
     * Sets the "format" element
     */
    void setFormat(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry format);

    /**
     * Appends and returns a new empty "format" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewFormat();

    /**
     * Unsets the "format" element
     */
    void unsetFormat();

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
     * Gets the "isRequired" element
     */
    boolean getIsRequired();

    /**
     * Gets (as xml) the "isRequired" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsRequired();

    /**
     * True if has "isRequired" element
     */
    boolean isSetIsRequired();

    /**
     * Sets the "isRequired" element
     */
    void setIsRequired(boolean isRequired);

    /**
     * Sets (as xml) the "isRequired" element
     */
    void xsetIsRequired(org.apache.xmlbeans.XmlBoolean isRequired);

    /**
     * Unsets the "isRequired" element
     */
    void unsetIsRequired();

    /**
     * Gets the "length" element
     */
    java.math.BigInteger getLength();

    /**
     * Gets (as xml) the "length" element
     */
    org.apache.xmlbeans.XmlInteger xgetLength();

    /**
     * True if has "length" element
     */
    boolean isSetLength();

    /**
     * Sets the "length" element
     */
    void setLength(java.math.BigInteger length);

    /**
     * Sets (as xml) the "length" element
     */
    void xsetLength(org.apache.xmlbeans.XmlInteger length);

    /**
     * Unsets the "length" element
     */
    void unsetLength();

    /**
     * Gets the "maximumLength" element
     */
    java.math.BigInteger getMaximumLength();

    /**
     * Gets (as xml) the "maximumLength" element
     */
    org.apache.xmlbeans.XmlInteger xgetMaximumLength();

    /**
     * True if has "maximumLength" element
     */
    boolean isSetMaximumLength();

    /**
     * Sets the "maximumLength" element
     */
    void setMaximumLength(java.math.BigInteger maximumLength);

    /**
     * Sets (as xml) the "maximumLength" element
     */
    void xsetMaximumLength(org.apache.xmlbeans.XmlInteger maximumLength);

    /**
     * Unsets the "maximumLength" element
     */
    void unsetMaximumLength();

    /**
     * Gets the "minimumLength" element
     */
    java.math.BigInteger getMinimumLength();

    /**
     * Gets (as xml) the "minimumLength" element
     */
    org.apache.xmlbeans.XmlInteger xgetMinimumLength();

    /**
     * True if has "minimumLength" element
     */
    boolean isSetMinimumLength();

    /**
     * Sets the "minimumLength" element
     */
    void setMinimumLength(java.math.BigInteger minimumLength);

    /**
     * Sets (as xml) the "minimumLength" element
     */
    void xsetMinimumLength(org.apache.xmlbeans.XmlInteger minimumLength);

    /**
     * Unsets the "minimumLength" element
     */
    void unsetMinimumLength();

    /**
     * Gets the "nullSequence" element
     */
    java.lang.String getNullSequence();

    /**
     * Gets (as xml) the "nullSequence" element
     */
    org.apache.xmlbeans.XmlString xgetNullSequence();

    /**
     * True if has "nullSequence" element
     */
    boolean isSetNullSequence();

    /**
     * Sets the "nullSequence" element
     */
    void setNullSequence(java.lang.String nullSequence);

    /**
     * Sets (as xml) the "nullSequence" element
     */
    void xsetNullSequence(org.apache.xmlbeans.XmlString nullSequence);

    /**
     * Unsets the "nullSequence" element
     */
    void unsetNullSequence();

    /**
     * Gets the "numberPattern" element
     */
    java.lang.String getNumberPattern();

    /**
     * Gets (as xml) the "numberPattern" element
     */
    org.apache.xmlbeans.XmlString xgetNumberPattern();

    /**
     * True if has "numberPattern" element
     */
    boolean isSetNumberPattern();

    /**
     * Sets the "numberPattern" element
     */
    void setNumberPattern(java.lang.String numberPattern);

    /**
     * Sets (as xml) the "numberPattern" element
     */
    void xsetNumberPattern(org.apache.xmlbeans.XmlString numberPattern);

    /**
     * Unsets the "numberPattern" element
     */
    void unsetNumberPattern();

    /**
     * Gets the "physicalDataType" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getPhysicalDataType();

    /**
     * True if has "physicalDataType" element
     */
    boolean isSetPhysicalDataType();

    /**
     * Sets the "physicalDataType" element
     */
    void setPhysicalDataType(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry physicalDataType);

    /**
     * Appends and returns a new empty "physicalDataType" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewPhysicalDataType();

    /**
     * Unsets the "physicalDataType" element
     */
    void unsetPhysicalDataType();

    /**
     * Gets the "scale" element
     */
    java.math.BigInteger getScale();

    /**
     * Gets (as xml) the "scale" element
     */
    org.apache.xmlbeans.XmlInteger xgetScale();

    /**
     * True if has "scale" element
     */
    boolean isSetScale();

    /**
     * Sets the "scale" element
     */
    void setScale(java.math.BigInteger scale);

    /**
     * Sets (as xml) the "scale" element
     */
    void xsetScale(org.apache.xmlbeans.XmlInteger scale);

    /**
     * Unsets the "scale" element
     */
    void unsetScale();

    /**
     * Gets a List of "ValueMapping_formats_DataPoint" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMapping.ValueMappingFormatsDataPoint> getValueMappingFormatsDataPointList();

    /**
     * Gets array of all "ValueMapping_formats_DataPoint" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMapping.ValueMappingFormatsDataPoint[] getValueMappingFormatsDataPointArray();

    /**
     * Gets ith "ValueMapping_formats_DataPoint" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMapping.ValueMappingFormatsDataPoint getValueMappingFormatsDataPointArray(int i);

    /**
     * Returns number of "ValueMapping_formats_DataPoint" element
     */
    int sizeOfValueMappingFormatsDataPointArray();

    /**
     * Sets array of all "ValueMapping_formats_DataPoint" element
     */
    void setValueMappingFormatsDataPointArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMapping.ValueMappingFormatsDataPoint[] valueMappingFormatsDataPointArray);

    /**
     * Sets ith "ValueMapping_formats_DataPoint" element
     */
    void setValueMappingFormatsDataPointArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMapping.ValueMappingFormatsDataPoint valueMappingFormatsDataPoint);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ValueMapping_formats_DataPoint" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMapping.ValueMappingFormatsDataPoint insertNewValueMappingFormatsDataPoint(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ValueMapping_formats_DataPoint" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMapping.ValueMappingFormatsDataPoint addNewValueMappingFormatsDataPoint();

    /**
     * Removes the ith "ValueMapping_formats_DataPoint" element
     */
    void removeValueMappingFormatsDataPoint(int i);

    /**
     * Gets the "ValueMapping_uses_PhysicalSegmentLocation" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMapping.ValueMappingUsesPhysicalSegmentLocation getValueMappingUsesPhysicalSegmentLocation();

    /**
     * True if has "ValueMapping_uses_PhysicalSegmentLocation" element
     */
    boolean isSetValueMappingUsesPhysicalSegmentLocation();

    /**
     * Sets the "ValueMapping_uses_PhysicalSegmentLocation" element
     */
    void setValueMappingUsesPhysicalSegmentLocation(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMapping.ValueMappingUsesPhysicalSegmentLocation valueMappingUsesPhysicalSegmentLocation);

    /**
     * Appends and returns a new empty "ValueMapping_uses_PhysicalSegmentLocation" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMapping.ValueMappingUsesPhysicalSegmentLocation addNewValueMappingUsesPhysicalSegmentLocation();

    /**
     * Unsets the "ValueMapping_uses_PhysicalSegmentLocation" element
     */
    void unsetValueMappingUsesPhysicalSegmentLocation();

    /**
     * An XML ValueMapping_formats_DataPoint(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface ValueMappingFormatsDataPoint extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMapping.ValueMappingFormatsDataPoint> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "valuemappingformatsdatapointdafeelemtype");
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMapping$ValueMappingFormatsDataPoint$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMapping.ValueMappingFormatsDataPoint.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "validtype07c0elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum DATA_POINT = Enum.forString("DataPoint");

            int INT_DATA_POINT = Enum.INT_DATA_POINT;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMapping$ValueMappingFormatsDataPoint$ValidType.
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
     * An XML ValueMapping_uses_PhysicalSegmentLocation(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface ValueMappingUsesPhysicalSegmentLocation extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMapping.ValueMappingUsesPhysicalSegmentLocation> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "valuemappingusesphysicalsegmentlocation87afelemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMapping$ValueMappingUsesPhysicalSegmentLocation$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMapping.ValueMappingUsesPhysicalSegmentLocation.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "validtype2dadelemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum PHYSICAL_SEGMENT_LOCATION = Enum.forString("PhysicalSegmentLocation");
            Enum SEGMENT_BY_TEXT = Enum.forString("SegmentByText");

            int INT_PHYSICAL_SEGMENT_LOCATION = Enum.INT_PHYSICAL_SEGMENT_LOCATION;
            int INT_SEGMENT_BY_TEXT = Enum.INT_SEGMENT_BY_TEXT;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMapping$ValueMappingUsesPhysicalSegmentLocation$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_PHYSICAL_SEGMENT_LOCATION
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

                static final int INT_PHYSICAL_SEGMENT_LOCATION = 1;
                static final int INT_SEGMENT_BY_TEXT = 2;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("PhysicalSegmentLocation", INT_PHYSICAL_SEGMENT_LOCATION),
                    new Enum("SegmentByText", INT_SEGMENT_BY_TEXT),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }
}
