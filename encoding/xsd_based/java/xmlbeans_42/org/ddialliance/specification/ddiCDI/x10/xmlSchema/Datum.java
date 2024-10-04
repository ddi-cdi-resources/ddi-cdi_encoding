/*
 * XML Type:  Datum
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML Datum(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface Datum extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "datum235btype");
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
     * Gets the "Datum_uses_Notation" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumUsesNotation getDatumUsesNotation();

    /**
     * True if has "Datum_uses_Notation" element
     */
    boolean isSetDatumUsesNotation();

    /**
     * Sets the "Datum_uses_Notation" element
     */
    void setDatumUsesNotation(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumUsesNotation datumUsesNotation);

    /**
     * Appends and returns a new empty "Datum_uses_Notation" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumUsesNotation addNewDatumUsesNotation();

    /**
     * Unsets the "Datum_uses_Notation" element
     */
    void unsetDatumUsesNotation();

    /**
     * Gets the "Datum_denotes_ConceptualValue" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumDenotesConceptualValue getDatumDenotesConceptualValue();

    /**
     * Sets the "Datum_denotes_ConceptualValue" element
     */
    void setDatumDenotesConceptualValue(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumDenotesConceptualValue datumDenotesConceptualValue);

    /**
     * Appends and returns a new empty "Datum_denotes_ConceptualValue" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumDenotesConceptualValue addNewDatumDenotesConceptualValue();

    /**
     * Gets a List of "Datum_uses_InstanceValue" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumUsesInstanceValue> getDatumUsesInstanceValueList();

    /**
     * Gets array of all "Datum_uses_InstanceValue" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumUsesInstanceValue[] getDatumUsesInstanceValueArray();

    /**
     * Gets ith "Datum_uses_InstanceValue" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumUsesInstanceValue getDatumUsesInstanceValueArray(int i);

    /**
     * Returns number of "Datum_uses_InstanceValue" element
     */
    int sizeOfDatumUsesInstanceValueArray();

    /**
     * Sets array of all "Datum_uses_InstanceValue" element
     */
    void setDatumUsesInstanceValueArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumUsesInstanceValue[] datumUsesInstanceValueArray);

    /**
     * Sets ith "Datum_uses_InstanceValue" element
     */
    void setDatumUsesInstanceValueArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumUsesInstanceValue datumUsesInstanceValue);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Datum_uses_InstanceValue" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumUsesInstanceValue insertNewDatumUsesInstanceValue(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Datum_uses_InstanceValue" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumUsesInstanceValue addNewDatumUsesInstanceValue();

    /**
     * Removes the ith "Datum_uses_InstanceValue" element
     */
    void removeDatumUsesInstanceValue(int i);

    /**
     * Gets a List of "Datum_isBoundedBy_InstanceVariable" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumIsBoundedByInstanceVariable> getDatumIsBoundedByInstanceVariableList();

    /**
     * Gets array of all "Datum_isBoundedBy_InstanceVariable" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumIsBoundedByInstanceVariable[] getDatumIsBoundedByInstanceVariableArray();

    /**
     * Gets ith "Datum_isBoundedBy_InstanceVariable" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumIsBoundedByInstanceVariable getDatumIsBoundedByInstanceVariableArray(int i);

    /**
     * Returns number of "Datum_isBoundedBy_InstanceVariable" element
     */
    int sizeOfDatumIsBoundedByInstanceVariableArray();

    /**
     * Sets array of all "Datum_isBoundedBy_InstanceVariable" element
     */
    void setDatumIsBoundedByInstanceVariableArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumIsBoundedByInstanceVariable[] datumIsBoundedByInstanceVariableArray);

    /**
     * Sets ith "Datum_isBoundedBy_InstanceVariable" element
     */
    void setDatumIsBoundedByInstanceVariableArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumIsBoundedByInstanceVariable datumIsBoundedByInstanceVariable);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Datum_isBoundedBy_InstanceVariable" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumIsBoundedByInstanceVariable insertNewDatumIsBoundedByInstanceVariable(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Datum_isBoundedBy_InstanceVariable" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumIsBoundedByInstanceVariable addNewDatumIsBoundedByInstanceVariable();

    /**
     * Removes the ith "Datum_isBoundedBy_InstanceVariable" element
     */
    void removeDatumIsBoundedByInstanceVariable(int i);

    /**
     * An XML Datum_uses_Notation(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface DatumUsesNotation extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumUsesNotation> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "datumusesnotation5a8celemtype");
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum$DatumUsesNotation$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumUsesNotation.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "validtype93ceelemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum NOTATION = Enum.forString("Notation");

            int INT_NOTATION = Enum.INT_NOTATION;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum$DatumUsesNotation$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_NOTATION
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

                static final int INT_NOTATION = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("Notation", INT_NOTATION),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }

    /**
     * An XML Datum_denotes_ConceptualValue(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface DatumDenotesConceptualValue extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumDenotesConceptualValue> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "datumdenotesconceptualvalue5bb1elemtype");
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum$DatumDenotesConceptualValue$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumDenotesConceptualValue.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "validtype6a73elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum CONCEPTUAL_VALUE = Enum.forString("ConceptualValue");
            Enum DIMENSIONAL_KEY_DEFINITION_MEMBER = Enum.forString("DimensionalKeyDefinitionMember");
            Enum KEY_DEFINITION_MEMBER = Enum.forString("KeyDefinitionMember");

            int INT_CONCEPTUAL_VALUE = Enum.INT_CONCEPTUAL_VALUE;
            int INT_DIMENSIONAL_KEY_DEFINITION_MEMBER = Enum.INT_DIMENSIONAL_KEY_DEFINITION_MEMBER;
            int INT_KEY_DEFINITION_MEMBER = Enum.INT_KEY_DEFINITION_MEMBER;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum$DatumDenotesConceptualValue$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_CONCEPTUAL_VALUE
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

                static final int INT_CONCEPTUAL_VALUE = 1;
                static final int INT_DIMENSIONAL_KEY_DEFINITION_MEMBER = 2;
                static final int INT_KEY_DEFINITION_MEMBER = 3;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("ConceptualValue", INT_CONCEPTUAL_VALUE),
                    new Enum("DimensionalKeyDefinitionMember", INT_DIMENSIONAL_KEY_DEFINITION_MEMBER),
                    new Enum("KeyDefinitionMember", INT_KEY_DEFINITION_MEMBER),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }

    /**
     * An XML Datum_uses_InstanceValue(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface DatumUsesInstanceValue extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumUsesInstanceValue> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "datumusesinstancevalue79f0elemtype");
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum$DatumUsesInstanceValue$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumUsesInstanceValue.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "validtypeb9eeelemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum DESCRIPTOR = Enum.forString("Descriptor");
            Enum DIMENSIONAL_KEY_MEMBER = Enum.forString("DimensionalKeyMember");
            Enum INSTANCE_VALUE = Enum.forString("InstanceValue");
            Enum KEY_MEMBER = Enum.forString("KeyMember");
            Enum LONG_MAIN_KEY_MEMBER = Enum.forString("LongMainKeyMember");
            Enum MAIN_KEY_MEMBER = Enum.forString("MainKeyMember");
            Enum REFERENCE_VALUE = Enum.forString("ReferenceValue");
            Enum WIDE_KEY_MEMBER = Enum.forString("WideKeyMember");

            int INT_DESCRIPTOR = Enum.INT_DESCRIPTOR;
            int INT_DIMENSIONAL_KEY_MEMBER = Enum.INT_DIMENSIONAL_KEY_MEMBER;
            int INT_INSTANCE_VALUE = Enum.INT_INSTANCE_VALUE;
            int INT_KEY_MEMBER = Enum.INT_KEY_MEMBER;
            int INT_LONG_MAIN_KEY_MEMBER = Enum.INT_LONG_MAIN_KEY_MEMBER;
            int INT_MAIN_KEY_MEMBER = Enum.INT_MAIN_KEY_MEMBER;
            int INT_REFERENCE_VALUE = Enum.INT_REFERENCE_VALUE;
            int INT_WIDE_KEY_MEMBER = Enum.INT_WIDE_KEY_MEMBER;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum$DatumUsesInstanceValue$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_DESCRIPTOR
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

                static final int INT_DESCRIPTOR = 1;
                static final int INT_DIMENSIONAL_KEY_MEMBER = 2;
                static final int INT_INSTANCE_VALUE = 3;
                static final int INT_KEY_MEMBER = 4;
                static final int INT_LONG_MAIN_KEY_MEMBER = 5;
                static final int INT_MAIN_KEY_MEMBER = 6;
                static final int INT_REFERENCE_VALUE = 7;
                static final int INT_WIDE_KEY_MEMBER = 8;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("Descriptor", INT_DESCRIPTOR),
                    new Enum("DimensionalKeyMember", INT_DIMENSIONAL_KEY_MEMBER),
                    new Enum("InstanceValue", INT_INSTANCE_VALUE),
                    new Enum("KeyMember", INT_KEY_MEMBER),
                    new Enum("LongMainKeyMember", INT_LONG_MAIN_KEY_MEMBER),
                    new Enum("MainKeyMember", INT_MAIN_KEY_MEMBER),
                    new Enum("ReferenceValue", INT_REFERENCE_VALUE),
                    new Enum("WideKeyMember", INT_WIDE_KEY_MEMBER),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }

    /**
     * An XML Datum_isBoundedBy_InstanceVariable(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface DatumIsBoundedByInstanceVariable extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumIsBoundedByInstanceVariable> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "datumisboundedbyinstancevariable9b0delemtype");
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum$DatumIsBoundedByInstanceVariable$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumIsBoundedByInstanceVariable.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "validtype758belemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum INSTANCE_VARIABLE = Enum.forString("InstanceVariable");

            int INT_INSTANCE_VARIABLE = Enum.INT_INSTANCE_VARIABLE;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum$DatumIsBoundedByInstanceVariable$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_INSTANCE_VARIABLE
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

                static final int INT_INSTANCE_VARIABLE = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("InstanceVariable", INT_INSTANCE_VARIABLE),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }
}
