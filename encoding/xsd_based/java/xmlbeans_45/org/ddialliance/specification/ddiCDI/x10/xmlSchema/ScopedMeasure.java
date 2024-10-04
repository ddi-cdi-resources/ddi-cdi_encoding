/*
 * XML Type:  ScopedMeasure
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ScopedMeasure(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface ScopedMeasure extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "scopedmeasure821atype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "frequency" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getFrequency();

    /**
     * True if has "frequency" element
     */
    boolean isSetFrequency();

    /**
     * Sets the "frequency" element
     */
    void setFrequency(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString frequency);

    /**
     * Appends and returns a new empty "frequency" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewFrequency();

    /**
     * Unsets the "frequency" element
     */
    void unsetFrequency();

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
     * Gets the "ScopedMeasure_circumscribes_DimensionalKeyDefinition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure.ScopedMeasureCircumscribesDimensionalKeyDefinition getScopedMeasureCircumscribesDimensionalKeyDefinition();

    /**
     * True if has "ScopedMeasure_circumscribes_DimensionalKeyDefinition" element
     */
    boolean isSetScopedMeasureCircumscribesDimensionalKeyDefinition();

    /**
     * Sets the "ScopedMeasure_circumscribes_DimensionalKeyDefinition" element
     */
    void setScopedMeasureCircumscribesDimensionalKeyDefinition(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure.ScopedMeasureCircumscribesDimensionalKeyDefinition scopedMeasureCircumscribesDimensionalKeyDefinition);

    /**
     * Appends and returns a new empty "ScopedMeasure_circumscribes_DimensionalKeyDefinition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure.ScopedMeasureCircumscribesDimensionalKeyDefinition addNewScopedMeasureCircumscribesDimensionalKeyDefinition();

    /**
     * Unsets the "ScopedMeasure_circumscribes_DimensionalKeyDefinition" element
     */
    void unsetScopedMeasureCircumscribesDimensionalKeyDefinition();

    /**
     * Gets the "ScopedMeasure_restricts_QualifiedMeasure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure.ScopedMeasureRestrictsQualifiedMeasure getScopedMeasureRestrictsQualifiedMeasure();

    /**
     * True if has "ScopedMeasure_restricts_QualifiedMeasure" element
     */
    boolean isSetScopedMeasureRestrictsQualifiedMeasure();

    /**
     * Sets the "ScopedMeasure_restricts_QualifiedMeasure" element
     */
    void setScopedMeasureRestrictsQualifiedMeasure(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure.ScopedMeasureRestrictsQualifiedMeasure scopedMeasureRestrictsQualifiedMeasure);

    /**
     * Appends and returns a new empty "ScopedMeasure_restricts_QualifiedMeasure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure.ScopedMeasureRestrictsQualifiedMeasure addNewScopedMeasureRestrictsQualifiedMeasure();

    /**
     * Unsets the "ScopedMeasure_restricts_QualifiedMeasure" element
     */
    void unsetScopedMeasureRestrictsQualifiedMeasure();

    /**
     * Gets the "ScopedMeasure_generates_RevisableDatum" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure.ScopedMeasureGeneratesRevisableDatum getScopedMeasureGeneratesRevisableDatum();

    /**
     * Sets the "ScopedMeasure_generates_RevisableDatum" element
     */
    void setScopedMeasureGeneratesRevisableDatum(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure.ScopedMeasureGeneratesRevisableDatum scopedMeasureGeneratesRevisableDatum);

    /**
     * Appends and returns a new empty "ScopedMeasure_generates_RevisableDatum" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure.ScopedMeasureGeneratesRevisableDatum addNewScopedMeasureGeneratesRevisableDatum();

    /**
     * An XML ScopedMeasure_circumscribes_DimensionalKeyDefinition(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface ScopedMeasureCircumscribesDimensionalKeyDefinition extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure.ScopedMeasureCircumscribesDimensionalKeyDefinition> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "scopedmeasurecircumscribesdimensionalkeydefinition986delemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure$ScopedMeasureCircumscribesDimensionalKeyDefinition$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure.ScopedMeasureCircumscribesDimensionalKeyDefinition.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "validtype316belemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum DIMENSIONAL_KEY_DEFINITION = Enum.forString("DimensionalKeyDefinition");

            int INT_DIMENSIONAL_KEY_DEFINITION = Enum.INT_DIMENSIONAL_KEY_DEFINITION;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure$ScopedMeasureCircumscribesDimensionalKeyDefinition$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_DIMENSIONAL_KEY_DEFINITION
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

                static final int INT_DIMENSIONAL_KEY_DEFINITION = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("DimensionalKeyDefinition", INT_DIMENSIONAL_KEY_DEFINITION),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }

    /**
     * An XML ScopedMeasure_restricts_QualifiedMeasure(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface ScopedMeasureRestrictsQualifiedMeasure extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure.ScopedMeasureRestrictsQualifiedMeasure> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "scopedmeasurerestrictsqualifiedmeasure13d1elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure$ScopedMeasureRestrictsQualifiedMeasure$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure.ScopedMeasureRestrictsQualifiedMeasure.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "validtypeb9cfelemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum QUALIFIED_MEASURE = Enum.forString("QualifiedMeasure");

            int INT_QUALIFIED_MEASURE = Enum.INT_QUALIFIED_MEASURE;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure$ScopedMeasureRestrictsQualifiedMeasure$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_QUALIFIED_MEASURE
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

                static final int INT_QUALIFIED_MEASURE = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("QualifiedMeasure", INT_QUALIFIED_MEASURE),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }

    /**
     * An XML ScopedMeasure_generates_RevisableDatum(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface ScopedMeasureGeneratesRevisableDatum extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure.ScopedMeasureGeneratesRevisableDatum> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "scopedmeasuregeneratesrevisabledatumd9f0elemtype");
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure$ScopedMeasureGeneratesRevisableDatum$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure.ScopedMeasureGeneratesRevisableDatum.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "validtypee76eelemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum REVISABLE_DATUM = Enum.forString("RevisableDatum");

            int INT_REVISABLE_DATUM = Enum.INT_REVISABLE_DATUM;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure$ScopedMeasureGeneratesRevisableDatum$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_REVISABLE_DATUM
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

                static final int INT_REVISABLE_DATUM = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("RevisableDatum", INT_REVISABLE_DATUM),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }
}
