/*
 * XML Type:  InstanceValue
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceValue
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML InstanceValue(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface InstanceValue extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceValue> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "instancevalue0c48type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "content" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.TypedString getContent();

    /**
     * True if has "content" element
     */
    boolean isSetContent();

    /**
     * Sets the "content" element
     */
    void setContent(org.ddialliance.specification.ddiCDI.x10.xmlSchema.TypedString content);

    /**
     * Appends and returns a new empty "content" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.TypedString addNewContent();

    /**
     * Unsets the "content" element
     */
    void unsetContent();

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
     * Gets the "whiteSpace" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.WhiteSpaceRule.Enum getWhiteSpace();

    /**
     * Gets (as xml) the "whiteSpace" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.WhiteSpaceRule xgetWhiteSpace();

    /**
     * True if has "whiteSpace" element
     */
    boolean isSetWhiteSpace();

    /**
     * Sets the "whiteSpace" element
     */
    void setWhiteSpace(org.ddialliance.specification.ddiCDI.x10.xmlSchema.WhiteSpaceRule.Enum whiteSpace);

    /**
     * Sets (as xml) the "whiteSpace" element
     */
    void xsetWhiteSpace(org.ddialliance.specification.ddiCDI.x10.xmlSchema.WhiteSpaceRule whiteSpace);

    /**
     * Unsets the "whiteSpace" element
     */
    void unsetWhiteSpace();

    /**
     * Gets the "InstanceValue_hasValueFrom_ValueDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceValue.InstanceValueHasValueFromValueDomain getInstanceValueHasValueFromValueDomain();

    /**
     * Sets the "InstanceValue_hasValueFrom_ValueDomain" element
     */
    void setInstanceValueHasValueFromValueDomain(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceValue.InstanceValueHasValueFromValueDomain instanceValueHasValueFromValueDomain);

    /**
     * Appends and returns a new empty "InstanceValue_hasValueFrom_ValueDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceValue.InstanceValueHasValueFromValueDomain addNewInstanceValueHasValueFromValueDomain();

    /**
     * Gets the "InstanceValue_isStoredIn_DataPoint" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceValue.InstanceValueIsStoredInDataPoint getInstanceValueIsStoredInDataPoint();

    /**
     * True if has "InstanceValue_isStoredIn_DataPoint" element
     */
    boolean isSetInstanceValueIsStoredInDataPoint();

    /**
     * Sets the "InstanceValue_isStoredIn_DataPoint" element
     */
    void setInstanceValueIsStoredInDataPoint(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceValue.InstanceValueIsStoredInDataPoint instanceValueIsStoredInDataPoint);

    /**
     * Appends and returns a new empty "InstanceValue_isStoredIn_DataPoint" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceValue.InstanceValueIsStoredInDataPoint addNewInstanceValueIsStoredInDataPoint();

    /**
     * Unsets the "InstanceValue_isStoredIn_DataPoint" element
     */
    void unsetInstanceValueIsStoredInDataPoint();

    /**
     * Gets the "InstanceValue_represents_ConceptualValue" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceValue.InstanceValueRepresentsConceptualValue getInstanceValueRepresentsConceptualValue();

    /**
     * True if has "InstanceValue_represents_ConceptualValue" element
     */
    boolean isSetInstanceValueRepresentsConceptualValue();

    /**
     * Sets the "InstanceValue_represents_ConceptualValue" element
     */
    void setInstanceValueRepresentsConceptualValue(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceValue.InstanceValueRepresentsConceptualValue instanceValueRepresentsConceptualValue);

    /**
     * Appends and returns a new empty "InstanceValue_represents_ConceptualValue" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceValue.InstanceValueRepresentsConceptualValue addNewInstanceValueRepresentsConceptualValue();

    /**
     * Unsets the "InstanceValue_represents_ConceptualValue" element
     */
    void unsetInstanceValueRepresentsConceptualValue();

    /**
     * An XML InstanceValue_hasValueFrom_ValueDomain(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface InstanceValueHasValueFromValueDomain extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceValue.InstanceValueHasValueFromValueDomain> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "instancevaluehasvaluefromvaluedomainbc7eelemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceValue$InstanceValueHasValueFromValueDomain$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceValue.InstanceValueHasValueFromValueDomain.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "validtypec9fcelemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum DESCRIPTOR_VALUE_DOMAIN = Enum.forString("DescriptorValueDomain");
            Enum REFERENCE_VALUE_DOMAIN = Enum.forString("ReferenceValueDomain");
            Enum SENTINEL_VALUE_DOMAIN = Enum.forString("SentinelValueDomain");
            Enum SUBSTANTIVE_VALUE_DOMAIN = Enum.forString("SubstantiveValueDomain");
            Enum VALUE_DOMAIN = Enum.forString("ValueDomain");

            int INT_DESCRIPTOR_VALUE_DOMAIN = Enum.INT_DESCRIPTOR_VALUE_DOMAIN;
            int INT_REFERENCE_VALUE_DOMAIN = Enum.INT_REFERENCE_VALUE_DOMAIN;
            int INT_SENTINEL_VALUE_DOMAIN = Enum.INT_SENTINEL_VALUE_DOMAIN;
            int INT_SUBSTANTIVE_VALUE_DOMAIN = Enum.INT_SUBSTANTIVE_VALUE_DOMAIN;
            int INT_VALUE_DOMAIN = Enum.INT_VALUE_DOMAIN;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceValue$InstanceValueHasValueFromValueDomain$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_DESCRIPTOR_VALUE_DOMAIN
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

                static final int INT_DESCRIPTOR_VALUE_DOMAIN = 1;
                static final int INT_REFERENCE_VALUE_DOMAIN = 2;
                static final int INT_SENTINEL_VALUE_DOMAIN = 3;
                static final int INT_SUBSTANTIVE_VALUE_DOMAIN = 4;
                static final int INT_VALUE_DOMAIN = 5;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("DescriptorValueDomain", INT_DESCRIPTOR_VALUE_DOMAIN),
                    new Enum("ReferenceValueDomain", INT_REFERENCE_VALUE_DOMAIN),
                    new Enum("SentinelValueDomain", INT_SENTINEL_VALUE_DOMAIN),
                    new Enum("SubstantiveValueDomain", INT_SUBSTANTIVE_VALUE_DOMAIN),
                    new Enum("ValueDomain", INT_VALUE_DOMAIN),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }

    /**
     * An XML InstanceValue_isStoredIn_DataPoint(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface InstanceValueIsStoredInDataPoint extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceValue.InstanceValueIsStoredInDataPoint> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "instancevalueisstoredindatapoint1ce0elemtype");
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceValue$InstanceValueIsStoredInDataPoint$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceValue.InstanceValueIsStoredInDataPoint.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "validtype995eelemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum DATA_POINT = Enum.forString("DataPoint");

            int INT_DATA_POINT = Enum.INT_DATA_POINT;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceValue$InstanceValueIsStoredInDataPoint$ValidType.
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
     * An XML InstanceValue_represents_ConceptualValue(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface InstanceValueRepresentsConceptualValue extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceValue.InstanceValueRepresentsConceptualValue> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "instancevaluerepresentsconceptualvalue558celemtype");
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceValue$InstanceValueRepresentsConceptualValue$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceValue.InstanceValueRepresentsConceptualValue.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "validtypefb8aelemtype");
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
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceValue$InstanceValueRepresentsConceptualValue$ValidType.
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
}
