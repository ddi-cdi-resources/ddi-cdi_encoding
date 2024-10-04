/*
 * XML Type:  ValueMappingRelationship
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ValueMappingRelationship(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface ValueMappingRelationship extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "valuemappingrelationship9053type");
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
     * Gets a List of "ValueMappingRelationship_hasTarget_ValueMapping" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship.ValueMappingRelationshipHasTargetValueMapping> getValueMappingRelationshipHasTargetValueMappingList();

    /**
     * Gets array of all "ValueMappingRelationship_hasTarget_ValueMapping" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship.ValueMappingRelationshipHasTargetValueMapping[] getValueMappingRelationshipHasTargetValueMappingArray();

    /**
     * Gets ith "ValueMappingRelationship_hasTarget_ValueMapping" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship.ValueMappingRelationshipHasTargetValueMapping getValueMappingRelationshipHasTargetValueMappingArray(int i);

    /**
     * Returns number of "ValueMappingRelationship_hasTarget_ValueMapping" element
     */
    int sizeOfValueMappingRelationshipHasTargetValueMappingArray();

    /**
     * Sets array of all "ValueMappingRelationship_hasTarget_ValueMapping" element
     */
    void setValueMappingRelationshipHasTargetValueMappingArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship.ValueMappingRelationshipHasTargetValueMapping[] valueMappingRelationshipHasTargetValueMappingArray);

    /**
     * Sets ith "ValueMappingRelationship_hasTarget_ValueMapping" element
     */
    void setValueMappingRelationshipHasTargetValueMappingArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship.ValueMappingRelationshipHasTargetValueMapping valueMappingRelationshipHasTargetValueMapping);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ValueMappingRelationship_hasTarget_ValueMapping" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship.ValueMappingRelationshipHasTargetValueMapping insertNewValueMappingRelationshipHasTargetValueMapping(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ValueMappingRelationship_hasTarget_ValueMapping" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship.ValueMappingRelationshipHasTargetValueMapping addNewValueMappingRelationshipHasTargetValueMapping();

    /**
     * Removes the ith "ValueMappingRelationship_hasTarget_ValueMapping" element
     */
    void removeValueMappingRelationshipHasTargetValueMapping(int i);

    /**
     * Gets a List of "ValueMappingRelationship_hasSource_ValueMapping" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship.ValueMappingRelationshipHasSourceValueMapping> getValueMappingRelationshipHasSourceValueMappingList();

    /**
     * Gets array of all "ValueMappingRelationship_hasSource_ValueMapping" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship.ValueMappingRelationshipHasSourceValueMapping[] getValueMappingRelationshipHasSourceValueMappingArray();

    /**
     * Gets ith "ValueMappingRelationship_hasSource_ValueMapping" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship.ValueMappingRelationshipHasSourceValueMapping getValueMappingRelationshipHasSourceValueMappingArray(int i);

    /**
     * Returns number of "ValueMappingRelationship_hasSource_ValueMapping" element
     */
    int sizeOfValueMappingRelationshipHasSourceValueMappingArray();

    /**
     * Sets array of all "ValueMappingRelationship_hasSource_ValueMapping" element
     */
    void setValueMappingRelationshipHasSourceValueMappingArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship.ValueMappingRelationshipHasSourceValueMapping[] valueMappingRelationshipHasSourceValueMappingArray);

    /**
     * Sets ith "ValueMappingRelationship_hasSource_ValueMapping" element
     */
    void setValueMappingRelationshipHasSourceValueMappingArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship.ValueMappingRelationshipHasSourceValueMapping valueMappingRelationshipHasSourceValueMapping);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ValueMappingRelationship_hasSource_ValueMapping" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship.ValueMappingRelationshipHasSourceValueMapping insertNewValueMappingRelationshipHasSourceValueMapping(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ValueMappingRelationship_hasSource_ValueMapping" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship.ValueMappingRelationshipHasSourceValueMapping addNewValueMappingRelationshipHasSourceValueMapping();

    /**
     * Removes the ith "ValueMappingRelationship_hasSource_ValueMapping" element
     */
    void removeValueMappingRelationshipHasSourceValueMapping(int i);

    /**
     * An XML ValueMappingRelationship_hasTarget_ValueMapping(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface ValueMappingRelationshipHasTargetValueMapping extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship.ValueMappingRelationshipHasTargetValueMapping> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "valuemappingrelationshiphastargetvaluemappingc46celemtype");
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship$ValueMappingRelationshipHasTargetValueMapping$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship.ValueMappingRelationshipHasTargetValueMapping.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "validtype26eaelemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum VALUE_MAPPING = Enum.forString("ValueMapping");

            int INT_VALUE_MAPPING = Enum.INT_VALUE_MAPPING;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship$ValueMappingRelationshipHasTargetValueMapping$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_VALUE_MAPPING
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

                static final int INT_VALUE_MAPPING = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("ValueMapping", INT_VALUE_MAPPING),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }

    /**
     * An XML ValueMappingRelationship_hasSource_ValueMapping(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface ValueMappingRelationshipHasSourceValueMapping extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship.ValueMappingRelationshipHasSourceValueMapping> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "valuemappingrelationshiphassourcevaluemapping6df6elemtype");
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship$ValueMappingRelationshipHasSourceValueMapping$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship.ValueMappingRelationshipHasSourceValueMapping.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "validtyped074elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum VALUE_MAPPING = Enum.forString("ValueMapping");

            int INT_VALUE_MAPPING = Enum.INT_VALUE_MAPPING;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship$ValueMappingRelationshipHasSourceValueMapping$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_VALUE_MAPPING
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

                static final int INT_VALUE_MAPPING = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("ValueMapping", INT_VALUE_MAPPING),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }
}
