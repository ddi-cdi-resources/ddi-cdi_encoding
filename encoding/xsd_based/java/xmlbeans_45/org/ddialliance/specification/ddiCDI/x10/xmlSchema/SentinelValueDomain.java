/*
 * XML Type:  SentinelValueDomain
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML SentinelValueDomain(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface SentinelValueDomain extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueDomain {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "sentinelvaluedomainb27dtype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "platformType" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getPlatformType();

    /**
     * True if has "platformType" element
     */
    boolean isSetPlatformType();

    /**
     * Sets the "platformType" element
     */
    void setPlatformType(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry platformType);

    /**
     * Appends and returns a new empty "platformType" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewPlatformType();

    /**
     * Unsets the "platformType" element
     */
    void unsetPlatformType();

    /**
     * Gets the "SentinelValueDomain_takesConceptsFrom_SentinelConceptualDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain.SentinelValueDomainTakesConceptsFromSentinelConceptualDomain getSentinelValueDomainTakesConceptsFromSentinelConceptualDomain();

    /**
     * True if has "SentinelValueDomain_takesConceptsFrom_SentinelConceptualDomain" element
     */
    boolean isSetSentinelValueDomainTakesConceptsFromSentinelConceptualDomain();

    /**
     * Sets the "SentinelValueDomain_takesConceptsFrom_SentinelConceptualDomain" element
     */
    void setSentinelValueDomainTakesConceptsFromSentinelConceptualDomain(org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain.SentinelValueDomainTakesConceptsFromSentinelConceptualDomain sentinelValueDomainTakesConceptsFromSentinelConceptualDomain);

    /**
     * Appends and returns a new empty "SentinelValueDomain_takesConceptsFrom_SentinelConceptualDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain.SentinelValueDomainTakesConceptsFromSentinelConceptualDomain addNewSentinelValueDomainTakesConceptsFromSentinelConceptualDomain();

    /**
     * Unsets the "SentinelValueDomain_takesConceptsFrom_SentinelConceptualDomain" element
     */
    void unsetSentinelValueDomainTakesConceptsFromSentinelConceptualDomain();

    /**
     * Gets the "SentinelValueDomain_takesValuesFrom_EnumerationDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain.SentinelValueDomainTakesValuesFromEnumerationDomain getSentinelValueDomainTakesValuesFromEnumerationDomain();

    /**
     * True if has "SentinelValueDomain_takesValuesFrom_EnumerationDomain" element
     */
    boolean isSetSentinelValueDomainTakesValuesFromEnumerationDomain();

    /**
     * Sets the "SentinelValueDomain_takesValuesFrom_EnumerationDomain" element
     */
    void setSentinelValueDomainTakesValuesFromEnumerationDomain(org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain.SentinelValueDomainTakesValuesFromEnumerationDomain sentinelValueDomainTakesValuesFromEnumerationDomain);

    /**
     * Appends and returns a new empty "SentinelValueDomain_takesValuesFrom_EnumerationDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain.SentinelValueDomainTakesValuesFromEnumerationDomain addNewSentinelValueDomainTakesValuesFromEnumerationDomain();

    /**
     * Unsets the "SentinelValueDomain_takesValuesFrom_EnumerationDomain" element
     */
    void unsetSentinelValueDomainTakesValuesFromEnumerationDomain();

    /**
     * Gets the "SentinelValueDomain_isDescribedBy_ValueAndConceptDescription" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain.SentinelValueDomainIsDescribedByValueAndConceptDescription getSentinelValueDomainIsDescribedByValueAndConceptDescription();

    /**
     * True if has "SentinelValueDomain_isDescribedBy_ValueAndConceptDescription" element
     */
    boolean isSetSentinelValueDomainIsDescribedByValueAndConceptDescription();

    /**
     * Sets the "SentinelValueDomain_isDescribedBy_ValueAndConceptDescription" element
     */
    void setSentinelValueDomainIsDescribedByValueAndConceptDescription(org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain.SentinelValueDomainIsDescribedByValueAndConceptDescription sentinelValueDomainIsDescribedByValueAndConceptDescription);

    /**
     * Appends and returns a new empty "SentinelValueDomain_isDescribedBy_ValueAndConceptDescription" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain.SentinelValueDomainIsDescribedByValueAndConceptDescription addNewSentinelValueDomainIsDescribedByValueAndConceptDescription();

    /**
     * Unsets the "SentinelValueDomain_isDescribedBy_ValueAndConceptDescription" element
     */
    void unsetSentinelValueDomainIsDescribedByValueAndConceptDescription();

    /**
     * An XML SentinelValueDomain_takesConceptsFrom_SentinelConceptualDomain(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface SentinelValueDomainTakesConceptsFromSentinelConceptualDomain extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain.SentinelValueDomainTakesConceptsFromSentinelConceptualDomain> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "sentinelvaluedomaintakesconceptsfromsentinelconceptualdomain96e5elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain$SentinelValueDomainTakesConceptsFromSentinelConceptualDomain$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain.SentinelValueDomainTakesConceptsFromSentinelConceptualDomain.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "validtype73e3elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum SENTINEL_CONCEPTUAL_DOMAIN = Enum.forString("SentinelConceptualDomain");

            int INT_SENTINEL_CONCEPTUAL_DOMAIN = Enum.INT_SENTINEL_CONCEPTUAL_DOMAIN;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain$SentinelValueDomainTakesConceptsFromSentinelConceptualDomain$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_SENTINEL_CONCEPTUAL_DOMAIN
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

                static final int INT_SENTINEL_CONCEPTUAL_DOMAIN = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("SentinelConceptualDomain", INT_SENTINEL_CONCEPTUAL_DOMAIN),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }

    /**
     * An XML SentinelValueDomain_takesValuesFrom_EnumerationDomain(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface SentinelValueDomainTakesValuesFromEnumerationDomain extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain.SentinelValueDomainTakesValuesFromEnumerationDomain> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "sentinelvaluedomaintakesvaluesfromenumerationdomaind97felemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain$SentinelValueDomainTakesValuesFromEnumerationDomain$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain.SentinelValueDomainTakesValuesFromEnumerationDomain.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "validtypec6c1elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum CODE_LIST = Enum.forString("CodeList");
            Enum ENUMERATION_DOMAIN = Enum.forString("EnumerationDomain");
            Enum STATISTICAL_CLASSIFICATION = Enum.forString("StatisticalClassification");

            int INT_CODE_LIST = Enum.INT_CODE_LIST;
            int INT_ENUMERATION_DOMAIN = Enum.INT_ENUMERATION_DOMAIN;
            int INT_STATISTICAL_CLASSIFICATION = Enum.INT_STATISTICAL_CLASSIFICATION;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain$SentinelValueDomainTakesValuesFromEnumerationDomain$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_CODE_LIST
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

                static final int INT_CODE_LIST = 1;
                static final int INT_ENUMERATION_DOMAIN = 2;
                static final int INT_STATISTICAL_CLASSIFICATION = 3;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("CodeList", INT_CODE_LIST),
                    new Enum("EnumerationDomain", INT_ENUMERATION_DOMAIN),
                    new Enum("StatisticalClassification", INT_STATISTICAL_CLASSIFICATION),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }

    /**
     * An XML SentinelValueDomain_isDescribedBy_ValueAndConceptDescription(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface SentinelValueDomainIsDescribedByValueAndConceptDescription extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain.SentinelValueDomainIsDescribedByValueAndConceptDescription> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "sentinelvaluedomainisdescribedbyvalueandconceptdescription03baelemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain$SentinelValueDomainIsDescribedByValueAndConceptDescription$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain.SentinelValueDomainIsDescribedByValueAndConceptDescription.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "validtype0838elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum VALUE_AND_CONCEPT_DESCRIPTION = Enum.forString("ValueAndConceptDescription");

            int INT_VALUE_AND_CONCEPT_DESCRIPTION = Enum.INT_VALUE_AND_CONCEPT_DESCRIPTION;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain$SentinelValueDomainIsDescribedByValueAndConceptDescription$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_VALUE_AND_CONCEPT_DESCRIPTION
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

                static final int INT_VALUE_AND_CONCEPT_DESCRIPTION = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("ValueAndConceptDescription", INT_VALUE_AND_CONCEPT_DESCRIPTION),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }
}
