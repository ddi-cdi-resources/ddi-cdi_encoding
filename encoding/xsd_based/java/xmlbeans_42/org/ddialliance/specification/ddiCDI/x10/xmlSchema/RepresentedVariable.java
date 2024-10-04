/*
 * XML Type:  RepresentedVariable
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML RepresentedVariable(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface RepresentedVariable extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "representedvariable3e0ftype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "describedUnitOfMeasure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getDescribedUnitOfMeasure();

    /**
     * True if has "describedUnitOfMeasure" element
     */
    boolean isSetDescribedUnitOfMeasure();

    /**
     * Sets the "describedUnitOfMeasure" element
     */
    void setDescribedUnitOfMeasure(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry describedUnitOfMeasure);

    /**
     * Appends and returns a new empty "describedUnitOfMeasure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewDescribedUnitOfMeasure();

    /**
     * Unsets the "describedUnitOfMeasure" element
     */
    void unsetDescribedUnitOfMeasure();

    /**
     * Gets the "hasIntendedDataType" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getHasIntendedDataType();

    /**
     * True if has "hasIntendedDataType" element
     */
    boolean isSetHasIntendedDataType();

    /**
     * Sets the "hasIntendedDataType" element
     */
    void setHasIntendedDataType(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry hasIntendedDataType);

    /**
     * Appends and returns a new empty "hasIntendedDataType" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewHasIntendedDataType();

    /**
     * Unsets the "hasIntendedDataType" element
     */
    void unsetHasIntendedDataType();

    /**
     * Gets the "simpleUnitOfMeasure" element
     */
    java.lang.String getSimpleUnitOfMeasure();

    /**
     * Gets (as xml) the "simpleUnitOfMeasure" element
     */
    org.apache.xmlbeans.XmlString xgetSimpleUnitOfMeasure();

    /**
     * True if has "simpleUnitOfMeasure" element
     */
    boolean isSetSimpleUnitOfMeasure();

    /**
     * Sets the "simpleUnitOfMeasure" element
     */
    void setSimpleUnitOfMeasure(java.lang.String simpleUnitOfMeasure);

    /**
     * Sets (as xml) the "simpleUnitOfMeasure" element
     */
    void xsetSimpleUnitOfMeasure(org.apache.xmlbeans.XmlString simpleUnitOfMeasure);

    /**
     * Unsets the "simpleUnitOfMeasure" element
     */
    void unsetSimpleUnitOfMeasure();

    /**
     * Gets a List of "RepresentedVariable_takesSentinelValuesFrom_SentinelValueDomain" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable.RepresentedVariableTakesSentinelValuesFromSentinelValueDomain> getRepresentedVariableTakesSentinelValuesFromSentinelValueDomainList();

    /**
     * Gets array of all "RepresentedVariable_takesSentinelValuesFrom_SentinelValueDomain" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable.RepresentedVariableTakesSentinelValuesFromSentinelValueDomain[] getRepresentedVariableTakesSentinelValuesFromSentinelValueDomainArray();

    /**
     * Gets ith "RepresentedVariable_takesSentinelValuesFrom_SentinelValueDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable.RepresentedVariableTakesSentinelValuesFromSentinelValueDomain getRepresentedVariableTakesSentinelValuesFromSentinelValueDomainArray(int i);

    /**
     * Returns number of "RepresentedVariable_takesSentinelValuesFrom_SentinelValueDomain" element
     */
    int sizeOfRepresentedVariableTakesSentinelValuesFromSentinelValueDomainArray();

    /**
     * Sets array of all "RepresentedVariable_takesSentinelValuesFrom_SentinelValueDomain" element
     */
    void setRepresentedVariableTakesSentinelValuesFromSentinelValueDomainArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable.RepresentedVariableTakesSentinelValuesFromSentinelValueDomain[] representedVariableTakesSentinelValuesFromSentinelValueDomainArray);

    /**
     * Sets ith "RepresentedVariable_takesSentinelValuesFrom_SentinelValueDomain" element
     */
    void setRepresentedVariableTakesSentinelValuesFromSentinelValueDomainArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable.RepresentedVariableTakesSentinelValuesFromSentinelValueDomain representedVariableTakesSentinelValuesFromSentinelValueDomain);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "RepresentedVariable_takesSentinelValuesFrom_SentinelValueDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable.RepresentedVariableTakesSentinelValuesFromSentinelValueDomain insertNewRepresentedVariableTakesSentinelValuesFromSentinelValueDomain(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "RepresentedVariable_takesSentinelValuesFrom_SentinelValueDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable.RepresentedVariableTakesSentinelValuesFromSentinelValueDomain addNewRepresentedVariableTakesSentinelValuesFromSentinelValueDomain();

    /**
     * Removes the ith "RepresentedVariable_takesSentinelValuesFrom_SentinelValueDomain" element
     */
    void removeRepresentedVariableTakesSentinelValuesFromSentinelValueDomain(int i);

    /**
     * Gets the "RepresentedVariable_takesSubstantiveValuesFrom_SubstantiveValueDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable.RepresentedVariableTakesSubstantiveValuesFromSubstantiveValueDomain getRepresentedVariableTakesSubstantiveValuesFromSubstantiveValueDomain();

    /**
     * True if has "RepresentedVariable_takesSubstantiveValuesFrom_SubstantiveValueDomain" element
     */
    boolean isSetRepresentedVariableTakesSubstantiveValuesFromSubstantiveValueDomain();

    /**
     * Sets the "RepresentedVariable_takesSubstantiveValuesFrom_SubstantiveValueDomain" element
     */
    void setRepresentedVariableTakesSubstantiveValuesFromSubstantiveValueDomain(org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable.RepresentedVariableTakesSubstantiveValuesFromSubstantiveValueDomain representedVariableTakesSubstantiveValuesFromSubstantiveValueDomain);

    /**
     * Appends and returns a new empty "RepresentedVariable_takesSubstantiveValuesFrom_SubstantiveValueDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable.RepresentedVariableTakesSubstantiveValuesFromSubstantiveValueDomain addNewRepresentedVariableTakesSubstantiveValuesFromSubstantiveValueDomain();

    /**
     * Unsets the "RepresentedVariable_takesSubstantiveValuesFrom_SubstantiveValueDomain" element
     */
    void unsetRepresentedVariableTakesSubstantiveValuesFromSubstantiveValueDomain();

    /**
     * An XML RepresentedVariable_takesSentinelValuesFrom_SentinelValueDomain(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface RepresentedVariableTakesSentinelValuesFromSentinelValueDomain extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable.RepresentedVariableTakesSentinelValuesFromSentinelValueDomain> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "representedvariabletakessentinelvaluesfromsentinelvaluedomain8d0delemtype");
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable$RepresentedVariableTakesSentinelValuesFromSentinelValueDomain$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable.RepresentedVariableTakesSentinelValuesFromSentinelValueDomain.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "validtype4fcfelemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum SENTINEL_VALUE_DOMAIN = Enum.forString("SentinelValueDomain");

            int INT_SENTINEL_VALUE_DOMAIN = Enum.INT_SENTINEL_VALUE_DOMAIN;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable$RepresentedVariableTakesSentinelValuesFromSentinelValueDomain$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_SENTINEL_VALUE_DOMAIN
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

                static final int INT_SENTINEL_VALUE_DOMAIN = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("SentinelValueDomain", INT_SENTINEL_VALUE_DOMAIN),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }

    /**
     * An XML RepresentedVariable_takesSubstantiveValuesFrom_SubstantiveValueDomain(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface RepresentedVariableTakesSubstantiveValuesFromSubstantiveValueDomain extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable.RepresentedVariableTakesSubstantiveValuesFromSubstantiveValueDomain> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "representedvariabletakessubstantivevaluesfromsubstantivevaluedomainc2afelemtype");
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable$RepresentedVariableTakesSubstantiveValuesFromSubstantiveValueDomain$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable.RepresentedVariableTakesSubstantiveValuesFromSubstantiveValueDomain.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "validtypeebf1elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum DESCRIPTOR_VALUE_DOMAIN = Enum.forString("DescriptorValueDomain");
            Enum SUBSTANTIVE_VALUE_DOMAIN = Enum.forString("SubstantiveValueDomain");

            int INT_DESCRIPTOR_VALUE_DOMAIN = Enum.INT_DESCRIPTOR_VALUE_DOMAIN;
            int INT_SUBSTANTIVE_VALUE_DOMAIN = Enum.INT_SUBSTANTIVE_VALUE_DOMAIN;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable$RepresentedVariableTakesSubstantiveValuesFromSubstantiveValueDomain$ValidType.
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
                static final int INT_SUBSTANTIVE_VALUE_DOMAIN = 2;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("DescriptorValueDomain", INT_DESCRIPTOR_VALUE_DOMAIN),
                    new Enum("SubstantiveValueDomain", INT_SUBSTANTIVE_VALUE_DOMAIN),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }
}
