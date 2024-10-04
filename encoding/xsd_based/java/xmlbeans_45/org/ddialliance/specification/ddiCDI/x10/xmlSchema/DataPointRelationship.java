/*
 * XML Type:  DataPointRelationship
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML DataPointRelationship(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface DataPointRelationship extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "datapointrelationship85catype");
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
     * Gets a List of "DataPointRelationship_hasTarget_DataPoint" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship.DataPointRelationshipHasTargetDataPoint> getDataPointRelationshipHasTargetDataPointList();

    /**
     * Gets array of all "DataPointRelationship_hasTarget_DataPoint" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship.DataPointRelationshipHasTargetDataPoint[] getDataPointRelationshipHasTargetDataPointArray();

    /**
     * Gets ith "DataPointRelationship_hasTarget_DataPoint" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship.DataPointRelationshipHasTargetDataPoint getDataPointRelationshipHasTargetDataPointArray(int i);

    /**
     * Returns number of "DataPointRelationship_hasTarget_DataPoint" element
     */
    int sizeOfDataPointRelationshipHasTargetDataPointArray();

    /**
     * Sets array of all "DataPointRelationship_hasTarget_DataPoint" element
     */
    void setDataPointRelationshipHasTargetDataPointArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship.DataPointRelationshipHasTargetDataPoint[] dataPointRelationshipHasTargetDataPointArray);

    /**
     * Sets ith "DataPointRelationship_hasTarget_DataPoint" element
     */
    void setDataPointRelationshipHasTargetDataPointArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship.DataPointRelationshipHasTargetDataPoint dataPointRelationshipHasTargetDataPoint);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataPointRelationship_hasTarget_DataPoint" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship.DataPointRelationshipHasTargetDataPoint insertNewDataPointRelationshipHasTargetDataPoint(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "DataPointRelationship_hasTarget_DataPoint" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship.DataPointRelationshipHasTargetDataPoint addNewDataPointRelationshipHasTargetDataPoint();

    /**
     * Removes the ith "DataPointRelationship_hasTarget_DataPoint" element
     */
    void removeDataPointRelationshipHasTargetDataPoint(int i);

    /**
     * Gets a List of "DataPointRelationship_hasSource_DataPoint" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship.DataPointRelationshipHasSourceDataPoint> getDataPointRelationshipHasSourceDataPointList();

    /**
     * Gets array of all "DataPointRelationship_hasSource_DataPoint" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship.DataPointRelationshipHasSourceDataPoint[] getDataPointRelationshipHasSourceDataPointArray();

    /**
     * Gets ith "DataPointRelationship_hasSource_DataPoint" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship.DataPointRelationshipHasSourceDataPoint getDataPointRelationshipHasSourceDataPointArray(int i);

    /**
     * Returns number of "DataPointRelationship_hasSource_DataPoint" element
     */
    int sizeOfDataPointRelationshipHasSourceDataPointArray();

    /**
     * Sets array of all "DataPointRelationship_hasSource_DataPoint" element
     */
    void setDataPointRelationshipHasSourceDataPointArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship.DataPointRelationshipHasSourceDataPoint[] dataPointRelationshipHasSourceDataPointArray);

    /**
     * Sets ith "DataPointRelationship_hasSource_DataPoint" element
     */
    void setDataPointRelationshipHasSourceDataPointArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship.DataPointRelationshipHasSourceDataPoint dataPointRelationshipHasSourceDataPoint);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataPointRelationship_hasSource_DataPoint" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship.DataPointRelationshipHasSourceDataPoint insertNewDataPointRelationshipHasSourceDataPoint(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "DataPointRelationship_hasSource_DataPoint" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship.DataPointRelationshipHasSourceDataPoint addNewDataPointRelationshipHasSourceDataPoint();

    /**
     * Removes the ith "DataPointRelationship_hasSource_DataPoint" element
     */
    void removeDataPointRelationshipHasSourceDataPoint(int i);

    /**
     * An XML DataPointRelationship_hasTarget_DataPoint(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface DataPointRelationshipHasTargetDataPoint extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship.DataPointRelationshipHasTargetDataPoint> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "datapointrelationshiphastargetdatapoint60a7elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship$DataPointRelationshipHasTargetDataPoint$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship.DataPointRelationshipHasTargetDataPoint.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "validtype9869elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum DATA_POINT = Enum.forString("DataPoint");

            int INT_DATA_POINT = Enum.INT_DATA_POINT;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship$DataPointRelationshipHasTargetDataPoint$ValidType.
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
     * An XML DataPointRelationship_hasSource_DataPoint(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface DataPointRelationshipHasSourceDataPoint extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship.DataPointRelationshipHasSourceDataPoint> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "datapointrelationshiphassourcedatapoint79b1elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship$DataPointRelationshipHasSourceDataPoint$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship.DataPointRelationshipHasSourceDataPoint.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "validtypeb173elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum DATA_POINT = Enum.forString("DataPoint");

            int INT_DATA_POINT = Enum.INT_DATA_POINT;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship$DataPointRelationshipHasSourceDataPoint$ValidType.
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
