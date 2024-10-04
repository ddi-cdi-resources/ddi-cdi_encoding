/*
 * XML Type:  VariableRelationship
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML VariableRelationship(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface VariableRelationship extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "variablerelationshipba32type");
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
     * Gets a List of "VariableRelationship_hasTarget_ConceptualVariable" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship.VariableRelationshipHasTargetConceptualVariable> getVariableRelationshipHasTargetConceptualVariableList();

    /**
     * Gets array of all "VariableRelationship_hasTarget_ConceptualVariable" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship.VariableRelationshipHasTargetConceptualVariable[] getVariableRelationshipHasTargetConceptualVariableArray();

    /**
     * Gets ith "VariableRelationship_hasTarget_ConceptualVariable" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship.VariableRelationshipHasTargetConceptualVariable getVariableRelationshipHasTargetConceptualVariableArray(int i);

    /**
     * Returns number of "VariableRelationship_hasTarget_ConceptualVariable" element
     */
    int sizeOfVariableRelationshipHasTargetConceptualVariableArray();

    /**
     * Sets array of all "VariableRelationship_hasTarget_ConceptualVariable" element
     */
    void setVariableRelationshipHasTargetConceptualVariableArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship.VariableRelationshipHasTargetConceptualVariable[] variableRelationshipHasTargetConceptualVariableArray);

    /**
     * Sets ith "VariableRelationship_hasTarget_ConceptualVariable" element
     */
    void setVariableRelationshipHasTargetConceptualVariableArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship.VariableRelationshipHasTargetConceptualVariable variableRelationshipHasTargetConceptualVariable);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "VariableRelationship_hasTarget_ConceptualVariable" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship.VariableRelationshipHasTargetConceptualVariable insertNewVariableRelationshipHasTargetConceptualVariable(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "VariableRelationship_hasTarget_ConceptualVariable" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship.VariableRelationshipHasTargetConceptualVariable addNewVariableRelationshipHasTargetConceptualVariable();

    /**
     * Removes the ith "VariableRelationship_hasTarget_ConceptualVariable" element
     */
    void removeVariableRelationshipHasTargetConceptualVariable(int i);

    /**
     * Gets a List of "VariableRelationship_hasSource_ConceptualVariable" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship.VariableRelationshipHasSourceConceptualVariable> getVariableRelationshipHasSourceConceptualVariableList();

    /**
     * Gets array of all "VariableRelationship_hasSource_ConceptualVariable" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship.VariableRelationshipHasSourceConceptualVariable[] getVariableRelationshipHasSourceConceptualVariableArray();

    /**
     * Gets ith "VariableRelationship_hasSource_ConceptualVariable" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship.VariableRelationshipHasSourceConceptualVariable getVariableRelationshipHasSourceConceptualVariableArray(int i);

    /**
     * Returns number of "VariableRelationship_hasSource_ConceptualVariable" element
     */
    int sizeOfVariableRelationshipHasSourceConceptualVariableArray();

    /**
     * Sets array of all "VariableRelationship_hasSource_ConceptualVariable" element
     */
    void setVariableRelationshipHasSourceConceptualVariableArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship.VariableRelationshipHasSourceConceptualVariable[] variableRelationshipHasSourceConceptualVariableArray);

    /**
     * Sets ith "VariableRelationship_hasSource_ConceptualVariable" element
     */
    void setVariableRelationshipHasSourceConceptualVariableArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship.VariableRelationshipHasSourceConceptualVariable variableRelationshipHasSourceConceptualVariable);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "VariableRelationship_hasSource_ConceptualVariable" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship.VariableRelationshipHasSourceConceptualVariable insertNewVariableRelationshipHasSourceConceptualVariable(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "VariableRelationship_hasSource_ConceptualVariable" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship.VariableRelationshipHasSourceConceptualVariable addNewVariableRelationshipHasSourceConceptualVariable();

    /**
     * Removes the ith "VariableRelationship_hasSource_ConceptualVariable" element
     */
    void removeVariableRelationshipHasSourceConceptualVariable(int i);

    /**
     * An XML VariableRelationship_hasTarget_ConceptualVariable(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface VariableRelationshipHasTargetConceptualVariable extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship.VariableRelationshipHasTargetConceptualVariable> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "variablerelationshiphastargetconceptualvariable8d53elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship$VariableRelationshipHasTargetConceptualVariable$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship.VariableRelationshipHasTargetConceptualVariable.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "validtype7751elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum CONCEPTUAL_VARIABLE = Enum.forString("ConceptualVariable");
            Enum DESCRIPTOR_VARIABLE = Enum.forString("DescriptorVariable");
            Enum INSTANCE_VARIABLE = Enum.forString("InstanceVariable");
            Enum REFERENCE_VARIABLE = Enum.forString("ReferenceVariable");
            Enum REPRESENTED_VARIABLE = Enum.forString("RepresentedVariable");

            int INT_CONCEPTUAL_VARIABLE = Enum.INT_CONCEPTUAL_VARIABLE;
            int INT_DESCRIPTOR_VARIABLE = Enum.INT_DESCRIPTOR_VARIABLE;
            int INT_INSTANCE_VARIABLE = Enum.INT_INSTANCE_VARIABLE;
            int INT_REFERENCE_VARIABLE = Enum.INT_REFERENCE_VARIABLE;
            int INT_REPRESENTED_VARIABLE = Enum.INT_REPRESENTED_VARIABLE;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship$VariableRelationshipHasTargetConceptualVariable$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_CONCEPTUAL_VARIABLE
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

                static final int INT_CONCEPTUAL_VARIABLE = 1;
                static final int INT_DESCRIPTOR_VARIABLE = 2;
                static final int INT_INSTANCE_VARIABLE = 3;
                static final int INT_REFERENCE_VARIABLE = 4;
                static final int INT_REPRESENTED_VARIABLE = 5;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("ConceptualVariable", INT_CONCEPTUAL_VARIABLE),
                    new Enum("DescriptorVariable", INT_DESCRIPTOR_VARIABLE),
                    new Enum("InstanceVariable", INT_INSTANCE_VARIABLE),
                    new Enum("ReferenceVariable", INT_REFERENCE_VARIABLE),
                    new Enum("RepresentedVariable", INT_REPRESENTED_VARIABLE),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }

    /**
     * An XML VariableRelationship_hasSource_ConceptualVariable(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface VariableRelationshipHasSourceConceptualVariable extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship.VariableRelationshipHasSourceConceptualVariable> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "variablerelationshiphassourceconceptualvariablefc5delemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship$VariableRelationshipHasSourceConceptualVariable$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship.VariableRelationshipHasSourceConceptualVariable.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "validtypee65belemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum CONCEPTUAL_VARIABLE = Enum.forString("ConceptualVariable");
            Enum DESCRIPTOR_VARIABLE = Enum.forString("DescriptorVariable");
            Enum INSTANCE_VARIABLE = Enum.forString("InstanceVariable");
            Enum REFERENCE_VARIABLE = Enum.forString("ReferenceVariable");
            Enum REPRESENTED_VARIABLE = Enum.forString("RepresentedVariable");

            int INT_CONCEPTUAL_VARIABLE = Enum.INT_CONCEPTUAL_VARIABLE;
            int INT_DESCRIPTOR_VARIABLE = Enum.INT_DESCRIPTOR_VARIABLE;
            int INT_INSTANCE_VARIABLE = Enum.INT_INSTANCE_VARIABLE;
            int INT_REFERENCE_VARIABLE = Enum.INT_REFERENCE_VARIABLE;
            int INT_REPRESENTED_VARIABLE = Enum.INT_REPRESENTED_VARIABLE;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship$VariableRelationshipHasSourceConceptualVariable$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_CONCEPTUAL_VARIABLE
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

                static final int INT_CONCEPTUAL_VARIABLE = 1;
                static final int INT_DESCRIPTOR_VARIABLE = 2;
                static final int INT_INSTANCE_VARIABLE = 3;
                static final int INT_REFERENCE_VARIABLE = 4;
                static final int INT_REPRESENTED_VARIABLE = 5;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("ConceptualVariable", INT_CONCEPTUAL_VARIABLE),
                    new Enum("DescriptorVariable", INT_DESCRIPTOR_VARIABLE),
                    new Enum("InstanceVariable", INT_INSTANCE_VARIABLE),
                    new Enum("ReferenceVariable", INT_REFERENCE_VARIABLE),
                    new Enum("RepresentedVariable", INT_REPRESENTED_VARIABLE),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }
}
