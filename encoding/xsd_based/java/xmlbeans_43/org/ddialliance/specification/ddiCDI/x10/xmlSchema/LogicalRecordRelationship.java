/*
 * XML Type:  LogicalRecordRelationship
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML LogicalRecordRelationship(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface LogicalRecordRelationship extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "logicalrecordrelationship27fetype");
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
     * Gets a List of "LogicalRecordRelationship_hasTarget_LogicalRecord" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship.LogicalRecordRelationshipHasTargetLogicalRecord> getLogicalRecordRelationshipHasTargetLogicalRecordList();

    /**
     * Gets array of all "LogicalRecordRelationship_hasTarget_LogicalRecord" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship.LogicalRecordRelationshipHasTargetLogicalRecord[] getLogicalRecordRelationshipHasTargetLogicalRecordArray();

    /**
     * Gets ith "LogicalRecordRelationship_hasTarget_LogicalRecord" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship.LogicalRecordRelationshipHasTargetLogicalRecord getLogicalRecordRelationshipHasTargetLogicalRecordArray(int i);

    /**
     * Returns number of "LogicalRecordRelationship_hasTarget_LogicalRecord" element
     */
    int sizeOfLogicalRecordRelationshipHasTargetLogicalRecordArray();

    /**
     * Sets array of all "LogicalRecordRelationship_hasTarget_LogicalRecord" element
     */
    void setLogicalRecordRelationshipHasTargetLogicalRecordArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship.LogicalRecordRelationshipHasTargetLogicalRecord[] logicalRecordRelationshipHasTargetLogicalRecordArray);

    /**
     * Sets ith "LogicalRecordRelationship_hasTarget_LogicalRecord" element
     */
    void setLogicalRecordRelationshipHasTargetLogicalRecordArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship.LogicalRecordRelationshipHasTargetLogicalRecord logicalRecordRelationshipHasTargetLogicalRecord);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "LogicalRecordRelationship_hasTarget_LogicalRecord" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship.LogicalRecordRelationshipHasTargetLogicalRecord insertNewLogicalRecordRelationshipHasTargetLogicalRecord(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "LogicalRecordRelationship_hasTarget_LogicalRecord" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship.LogicalRecordRelationshipHasTargetLogicalRecord addNewLogicalRecordRelationshipHasTargetLogicalRecord();

    /**
     * Removes the ith "LogicalRecordRelationship_hasTarget_LogicalRecord" element
     */
    void removeLogicalRecordRelationshipHasTargetLogicalRecord(int i);

    /**
     * Gets a List of "LogicalRecordRelationship_hasSource_LogicalRecord" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship.LogicalRecordRelationshipHasSourceLogicalRecord> getLogicalRecordRelationshipHasSourceLogicalRecordList();

    /**
     * Gets array of all "LogicalRecordRelationship_hasSource_LogicalRecord" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship.LogicalRecordRelationshipHasSourceLogicalRecord[] getLogicalRecordRelationshipHasSourceLogicalRecordArray();

    /**
     * Gets ith "LogicalRecordRelationship_hasSource_LogicalRecord" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship.LogicalRecordRelationshipHasSourceLogicalRecord getLogicalRecordRelationshipHasSourceLogicalRecordArray(int i);

    /**
     * Returns number of "LogicalRecordRelationship_hasSource_LogicalRecord" element
     */
    int sizeOfLogicalRecordRelationshipHasSourceLogicalRecordArray();

    /**
     * Sets array of all "LogicalRecordRelationship_hasSource_LogicalRecord" element
     */
    void setLogicalRecordRelationshipHasSourceLogicalRecordArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship.LogicalRecordRelationshipHasSourceLogicalRecord[] logicalRecordRelationshipHasSourceLogicalRecordArray);

    /**
     * Sets ith "LogicalRecordRelationship_hasSource_LogicalRecord" element
     */
    void setLogicalRecordRelationshipHasSourceLogicalRecordArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship.LogicalRecordRelationshipHasSourceLogicalRecord logicalRecordRelationshipHasSourceLogicalRecord);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "LogicalRecordRelationship_hasSource_LogicalRecord" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship.LogicalRecordRelationshipHasSourceLogicalRecord insertNewLogicalRecordRelationshipHasSourceLogicalRecord(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "LogicalRecordRelationship_hasSource_LogicalRecord" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship.LogicalRecordRelationshipHasSourceLogicalRecord addNewLogicalRecordRelationshipHasSourceLogicalRecord();

    /**
     * Removes the ith "LogicalRecordRelationship_hasSource_LogicalRecord" element
     */
    void removeLogicalRecordRelationshipHasSourceLogicalRecord(int i);

    /**
     * An XML LogicalRecordRelationship_hasTarget_LogicalRecord(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface LogicalRecordRelationshipHasTargetLogicalRecord extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship.LogicalRecordRelationshipHasTargetLogicalRecord> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "logicalrecordrelationshiphastargetlogicalrecord7843elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship$LogicalRecordRelationshipHasTargetLogicalRecord$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship.LogicalRecordRelationshipHasTargetLogicalRecord.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "validtype1d05elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum LOGICAL_RECORD = Enum.forString("LogicalRecord");

            int INT_LOGICAL_RECORD = Enum.INT_LOGICAL_RECORD;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship$LogicalRecordRelationshipHasTargetLogicalRecord$ValidType.
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
     * An XML LogicalRecordRelationship_hasSource_LogicalRecord(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface LogicalRecordRelationshipHasSourceLogicalRecord extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship.LogicalRecordRelationshipHasSourceLogicalRecord> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "logicalrecordrelationshiphassourcelogicalrecorde74delemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship$LogicalRecordRelationshipHasSourceLogicalRecord$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship.LogicalRecordRelationshipHasSourceLogicalRecord.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "validtype8c0felemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum LOGICAL_RECORD = Enum.forString("LogicalRecord");

            int INT_LOGICAL_RECORD = Enum.INT_LOGICAL_RECORD;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship$LogicalRecordRelationshipHasSourceLogicalRecord$ValidType.
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
}
