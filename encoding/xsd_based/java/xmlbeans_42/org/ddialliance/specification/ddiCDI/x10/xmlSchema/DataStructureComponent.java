/*
 * XML Type:  DataStructureComponent
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructureComponent
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML DataStructureComponent(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface DataStructureComponent extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructureComponent> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "datastructurecomponentef32type");
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
     * Gets a List of "semantic" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PairedControlledVocabularyEntry> getSemanticList();

    /**
     * Gets array of all "semantic" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PairedControlledVocabularyEntry[] getSemanticArray();

    /**
     * Gets ith "semantic" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PairedControlledVocabularyEntry getSemanticArray(int i);

    /**
     * Returns number of "semantic" element
     */
    int sizeOfSemanticArray();

    /**
     * Sets array of all "semantic" element
     */
    void setSemanticArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PairedControlledVocabularyEntry[] semanticArray);

    /**
     * Sets ith "semantic" element
     */
    void setSemanticArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.PairedControlledVocabularyEntry semantic);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "semantic" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PairedControlledVocabularyEntry insertNewSemantic(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "semantic" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PairedControlledVocabularyEntry addNewSemantic();

    /**
     * Removes the ith "semantic" element
     */
    void removeSemantic(int i);

    /**
     * Gets the "specialization" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpecializationRole getSpecialization();

    /**
     * True if has "specialization" element
     */
    boolean isSetSpecialization();

    /**
     * Sets the "specialization" element
     */
    void setSpecialization(org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpecializationRole specialization);

    /**
     * Appends and returns a new empty "specialization" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpecializationRole addNewSpecialization();

    /**
     * Unsets the "specialization" element
     */
    void unsetSpecialization();

    /**
     * Gets the "DataStructureComponent_isDefinedBy_RepresentedVariable" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructureComponent.DataStructureComponentIsDefinedByRepresentedVariable getDataStructureComponentIsDefinedByRepresentedVariable();

    /**
     * True if has "DataStructureComponent_isDefinedBy_RepresentedVariable" element
     */
    boolean isSetDataStructureComponentIsDefinedByRepresentedVariable();

    /**
     * Sets the "DataStructureComponent_isDefinedBy_RepresentedVariable" element
     */
    void setDataStructureComponentIsDefinedByRepresentedVariable(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructureComponent.DataStructureComponentIsDefinedByRepresentedVariable dataStructureComponentIsDefinedByRepresentedVariable);

    /**
     * Appends and returns a new empty "DataStructureComponent_isDefinedBy_RepresentedVariable" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructureComponent.DataStructureComponentIsDefinedByRepresentedVariable addNewDataStructureComponentIsDefinedByRepresentedVariable();

    /**
     * Unsets the "DataStructureComponent_isDefinedBy_RepresentedVariable" element
     */
    void unsetDataStructureComponentIsDefinedByRepresentedVariable();

    /**
     * An XML DataStructureComponent_isDefinedBy_RepresentedVariable(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface DataStructureComponentIsDefinedByRepresentedVariable extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructureComponent.DataStructureComponentIsDefinedByRepresentedVariable> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "datastructurecomponentisdefinedbyrepresentedvariablec1c7elemtype");
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructureComponent$DataStructureComponentIsDefinedByRepresentedVariable$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructureComponent.DataStructureComponentIsDefinedByRepresentedVariable.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "validtype3e09elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum DESCRIPTOR_VARIABLE = Enum.forString("DescriptorVariable");
            Enum INSTANCE_VARIABLE = Enum.forString("InstanceVariable");
            Enum REFERENCE_VARIABLE = Enum.forString("ReferenceVariable");
            Enum REPRESENTED_VARIABLE = Enum.forString("RepresentedVariable");

            int INT_DESCRIPTOR_VARIABLE = Enum.INT_DESCRIPTOR_VARIABLE;
            int INT_INSTANCE_VARIABLE = Enum.INT_INSTANCE_VARIABLE;
            int INT_REFERENCE_VARIABLE = Enum.INT_REFERENCE_VARIABLE;
            int INT_REPRESENTED_VARIABLE = Enum.INT_REPRESENTED_VARIABLE;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructureComponent$DataStructureComponentIsDefinedByRepresentedVariable$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_DESCRIPTOR_VARIABLE
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

                static final int INT_DESCRIPTOR_VARIABLE = 1;
                static final int INT_INSTANCE_VARIABLE = 2;
                static final int INT_REFERENCE_VARIABLE = 3;
                static final int INT_REPRESENTED_VARIABLE = 4;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
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
