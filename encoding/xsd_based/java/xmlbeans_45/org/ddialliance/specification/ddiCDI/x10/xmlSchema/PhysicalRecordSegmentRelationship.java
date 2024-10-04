/*
 * XML Type:  PhysicalRecordSegmentRelationship
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML PhysicalRecordSegmentRelationship(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface PhysicalRecordSegmentRelationship extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "physicalrecordsegmentrelationship504ftype");
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
     * Gets a List of "PhysicalRecordSegmentRelationship_hasTarget_PhysicalRecordSegment" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship.PhysicalRecordSegmentRelationshipHasTargetPhysicalRecordSegment> getPhysicalRecordSegmentRelationshipHasTargetPhysicalRecordSegmentList();

    /**
     * Gets array of all "PhysicalRecordSegmentRelationship_hasTarget_PhysicalRecordSegment" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship.PhysicalRecordSegmentRelationshipHasTargetPhysicalRecordSegment[] getPhysicalRecordSegmentRelationshipHasTargetPhysicalRecordSegmentArray();

    /**
     * Gets ith "PhysicalRecordSegmentRelationship_hasTarget_PhysicalRecordSegment" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship.PhysicalRecordSegmentRelationshipHasTargetPhysicalRecordSegment getPhysicalRecordSegmentRelationshipHasTargetPhysicalRecordSegmentArray(int i);

    /**
     * Returns number of "PhysicalRecordSegmentRelationship_hasTarget_PhysicalRecordSegment" element
     */
    int sizeOfPhysicalRecordSegmentRelationshipHasTargetPhysicalRecordSegmentArray();

    /**
     * Sets array of all "PhysicalRecordSegmentRelationship_hasTarget_PhysicalRecordSegment" element
     */
    void setPhysicalRecordSegmentRelationshipHasTargetPhysicalRecordSegmentArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship.PhysicalRecordSegmentRelationshipHasTargetPhysicalRecordSegment[] physicalRecordSegmentRelationshipHasTargetPhysicalRecordSegmentArray);

    /**
     * Sets ith "PhysicalRecordSegmentRelationship_hasTarget_PhysicalRecordSegment" element
     */
    void setPhysicalRecordSegmentRelationshipHasTargetPhysicalRecordSegmentArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship.PhysicalRecordSegmentRelationshipHasTargetPhysicalRecordSegment physicalRecordSegmentRelationshipHasTargetPhysicalRecordSegment);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "PhysicalRecordSegmentRelationship_hasTarget_PhysicalRecordSegment" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship.PhysicalRecordSegmentRelationshipHasTargetPhysicalRecordSegment insertNewPhysicalRecordSegmentRelationshipHasTargetPhysicalRecordSegment(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "PhysicalRecordSegmentRelationship_hasTarget_PhysicalRecordSegment" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship.PhysicalRecordSegmentRelationshipHasTargetPhysicalRecordSegment addNewPhysicalRecordSegmentRelationshipHasTargetPhysicalRecordSegment();

    /**
     * Removes the ith "PhysicalRecordSegmentRelationship_hasTarget_PhysicalRecordSegment" element
     */
    void removePhysicalRecordSegmentRelationshipHasTargetPhysicalRecordSegment(int i);

    /**
     * Gets the "PhysicalRecordSegmentRelationship_hasSource_PhysicalRecordSegment" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship.PhysicalRecordSegmentRelationshipHasSourcePhysicalRecordSegment getPhysicalRecordSegmentRelationshipHasSourcePhysicalRecordSegment();

    /**
     * True if has "PhysicalRecordSegmentRelationship_hasSource_PhysicalRecordSegment" element
     */
    boolean isSetPhysicalRecordSegmentRelationshipHasSourcePhysicalRecordSegment();

    /**
     * Sets the "PhysicalRecordSegmentRelationship_hasSource_PhysicalRecordSegment" element
     */
    void setPhysicalRecordSegmentRelationshipHasSourcePhysicalRecordSegment(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship.PhysicalRecordSegmentRelationshipHasSourcePhysicalRecordSegment physicalRecordSegmentRelationshipHasSourcePhysicalRecordSegment);

    /**
     * Appends and returns a new empty "PhysicalRecordSegmentRelationship_hasSource_PhysicalRecordSegment" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship.PhysicalRecordSegmentRelationshipHasSourcePhysicalRecordSegment addNewPhysicalRecordSegmentRelationshipHasSourcePhysicalRecordSegment();

    /**
     * Unsets the "PhysicalRecordSegmentRelationship_hasSource_PhysicalRecordSegment" element
     */
    void unsetPhysicalRecordSegmentRelationshipHasSourcePhysicalRecordSegment();

    /**
     * An XML PhysicalRecordSegmentRelationship_hasTarget_PhysicalRecordSegment(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface PhysicalRecordSegmentRelationshipHasTargetPhysicalRecordSegment extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship.PhysicalRecordSegmentRelationshipHasTargetPhysicalRecordSegment> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "physicalrecordsegmentrelationshiphastargetphysicalrecordsegmentefb6elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship$PhysicalRecordSegmentRelationshipHasTargetPhysicalRecordSegment$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship.PhysicalRecordSegmentRelationshipHasTargetPhysicalRecordSegment.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "validtypeee78elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum PHYSICAL_RECORD_SEGMENT = Enum.forString("PhysicalRecordSegment");

            int INT_PHYSICAL_RECORD_SEGMENT = Enum.INT_PHYSICAL_RECORD_SEGMENT;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship$PhysicalRecordSegmentRelationshipHasTargetPhysicalRecordSegment$ValidType.
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
     * An XML PhysicalRecordSegmentRelationship_hasSource_PhysicalRecordSegment(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface PhysicalRecordSegmentRelationshipHasSourcePhysicalRecordSegment extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship.PhysicalRecordSegmentRelationshipHasSourcePhysicalRecordSegment> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "physicalrecordsegmentrelationshiphassourcephysicalrecordsegment0ac0elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship$PhysicalRecordSegmentRelationshipHasSourcePhysicalRecordSegment$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship.PhysicalRecordSegmentRelationshipHasSourcePhysicalRecordSegment.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "validtype0982elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum PHYSICAL_RECORD_SEGMENT = Enum.forString("PhysicalRecordSegment");

            int INT_PHYSICAL_RECORD_SEGMENT = Enum.INT_PHYSICAL_RECORD_SEGMENT;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship$PhysicalRecordSegmentRelationshipHasSourcePhysicalRecordSegment$ValidType.
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
}
