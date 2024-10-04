/*
 * XML Type:  ConceptualVariable
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ConceptualVariable(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface ConceptualVariable extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.Concept {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "conceptualvariable7432type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "descriptiveText" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getDescriptiveText();

    /**
     * True if has "descriptiveText" element
     */
    boolean isSetDescriptiveText();

    /**
     * Sets the "descriptiveText" element
     */
    void setDescriptiveText(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString descriptiveText);

    /**
     * Appends and returns a new empty "descriptiveText" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewDescriptiveText();

    /**
     * Unsets the "descriptiveText" element
     */
    void unsetDescriptiveText();

    /**
     * Gets the "unitOfMeasureKind" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getUnitOfMeasureKind();

    /**
     * True if has "unitOfMeasureKind" element
     */
    boolean isSetUnitOfMeasureKind();

    /**
     * Sets the "unitOfMeasureKind" element
     */
    void setUnitOfMeasureKind(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry unitOfMeasureKind);

    /**
     * Appends and returns a new empty "unitOfMeasureKind" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewUnitOfMeasureKind();

    /**
     * Unsets the "unitOfMeasureKind" element
     */
    void unsetUnitOfMeasureKind();

    /**
     * Gets the "ConceptualVariable_takesSentinelConceptsFrom_SentinelConceptualDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable.ConceptualVariableTakesSentinelConceptsFromSentinelConceptualDomain getConceptualVariableTakesSentinelConceptsFromSentinelConceptualDomain();

    /**
     * True if has "ConceptualVariable_takesSentinelConceptsFrom_SentinelConceptualDomain" element
     */
    boolean isSetConceptualVariableTakesSentinelConceptsFromSentinelConceptualDomain();

    /**
     * Sets the "ConceptualVariable_takesSentinelConceptsFrom_SentinelConceptualDomain" element
     */
    void setConceptualVariableTakesSentinelConceptsFromSentinelConceptualDomain(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable.ConceptualVariableTakesSentinelConceptsFromSentinelConceptualDomain conceptualVariableTakesSentinelConceptsFromSentinelConceptualDomain);

    /**
     * Appends and returns a new empty "ConceptualVariable_takesSentinelConceptsFrom_SentinelConceptualDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable.ConceptualVariableTakesSentinelConceptsFromSentinelConceptualDomain addNewConceptualVariableTakesSentinelConceptsFromSentinelConceptualDomain();

    /**
     * Unsets the "ConceptualVariable_takesSentinelConceptsFrom_SentinelConceptualDomain" element
     */
    void unsetConceptualVariableTakesSentinelConceptsFromSentinelConceptualDomain();

    /**
     * Gets the "ConceptualVariable_takesSubstantiveConceptsFrom_SubstantiveConceptualDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable.ConceptualVariableTakesSubstantiveConceptsFromSubstantiveConceptualDomain getConceptualVariableTakesSubstantiveConceptsFromSubstantiveConceptualDomain();

    /**
     * True if has "ConceptualVariable_takesSubstantiveConceptsFrom_SubstantiveConceptualDomain" element
     */
    boolean isSetConceptualVariableTakesSubstantiveConceptsFromSubstantiveConceptualDomain();

    /**
     * Sets the "ConceptualVariable_takesSubstantiveConceptsFrom_SubstantiveConceptualDomain" element
     */
    void setConceptualVariableTakesSubstantiveConceptsFromSubstantiveConceptualDomain(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable.ConceptualVariableTakesSubstantiveConceptsFromSubstantiveConceptualDomain conceptualVariableTakesSubstantiveConceptsFromSubstantiveConceptualDomain);

    /**
     * Appends and returns a new empty "ConceptualVariable_takesSubstantiveConceptsFrom_SubstantiveConceptualDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable.ConceptualVariableTakesSubstantiveConceptsFromSubstantiveConceptualDomain addNewConceptualVariableTakesSubstantiveConceptsFromSubstantiveConceptualDomain();

    /**
     * Unsets the "ConceptualVariable_takesSubstantiveConceptsFrom_SubstantiveConceptualDomain" element
     */
    void unsetConceptualVariableTakesSubstantiveConceptsFromSubstantiveConceptualDomain();

    /**
     * Gets the "ConceptualVariable_measures_UnitType" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable.ConceptualVariableMeasuresUnitType getConceptualVariableMeasuresUnitType();

    /**
     * True if has "ConceptualVariable_measures_UnitType" element
     */
    boolean isSetConceptualVariableMeasuresUnitType();

    /**
     * Sets the "ConceptualVariable_measures_UnitType" element
     */
    void setConceptualVariableMeasuresUnitType(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable.ConceptualVariableMeasuresUnitType conceptualVariableMeasuresUnitType);

    /**
     * Appends and returns a new empty "ConceptualVariable_measures_UnitType" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable.ConceptualVariableMeasuresUnitType addNewConceptualVariableMeasuresUnitType();

    /**
     * Unsets the "ConceptualVariable_measures_UnitType" element
     */
    void unsetConceptualVariableMeasuresUnitType();

    /**
     * An XML ConceptualVariable_takesSentinelConceptsFrom_SentinelConceptualDomain(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface ConceptualVariableTakesSentinelConceptsFromSentinelConceptualDomain extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable.ConceptualVariableTakesSentinelConceptsFromSentinelConceptualDomain> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "conceptualvariabletakessentinelconceptsfromsentinelconceptualdomain46c1elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable$ConceptualVariableTakesSentinelConceptsFromSentinelConceptualDomain$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable.ConceptualVariableTakesSentinelConceptsFromSentinelConceptualDomain.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "validtypeed3felemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum SENTINEL_CONCEPTUAL_DOMAIN = Enum.forString("SentinelConceptualDomain");

            int INT_SENTINEL_CONCEPTUAL_DOMAIN = Enum.INT_SENTINEL_CONCEPTUAL_DOMAIN;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable$ConceptualVariableTakesSentinelConceptsFromSentinelConceptualDomain$ValidType.
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
     * An XML ConceptualVariable_takesSubstantiveConceptsFrom_SubstantiveConceptualDomain(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface ConceptualVariableTakesSubstantiveConceptsFromSubstantiveConceptualDomain extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable.ConceptualVariableTakesSubstantiveConceptsFromSubstantiveConceptualDomain> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "conceptualvariabletakessubstantiveconceptsfromsubstantiveconceptualdomain5331elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable$ConceptualVariableTakesSubstantiveConceptsFromSubstantiveConceptualDomain$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable.ConceptualVariableTakesSubstantiveConceptsFromSubstantiveConceptualDomain.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "validtypea32felemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum SUBSTANTIVE_CONCEPTUAL_DOMAIN = Enum.forString("SubstantiveConceptualDomain");

            int INT_SUBSTANTIVE_CONCEPTUAL_DOMAIN = Enum.INT_SUBSTANTIVE_CONCEPTUAL_DOMAIN;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable$ConceptualVariableTakesSubstantiveConceptsFromSubstantiveConceptualDomain$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_SUBSTANTIVE_CONCEPTUAL_DOMAIN
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

                static final int INT_SUBSTANTIVE_CONCEPTUAL_DOMAIN = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("SubstantiveConceptualDomain", INT_SUBSTANTIVE_CONCEPTUAL_DOMAIN),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }

    /**
     * An XML ConceptualVariable_measures_UnitType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface ConceptualVariableMeasuresUnitType extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable.ConceptualVariableMeasuresUnitType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "conceptualvariablemeasuresunittypeb859elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable$ConceptualVariableMeasuresUnitType$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable.ConceptualVariableMeasuresUnitType.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "validtyped21belemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum POPULATION = Enum.forString("Population");
            Enum UNIT_TYPE = Enum.forString("UnitType");
            Enum UNIVERSE = Enum.forString("Universe");

            int INT_POPULATION = Enum.INT_POPULATION;
            int INT_UNIT_TYPE = Enum.INT_UNIT_TYPE;
            int INT_UNIVERSE = Enum.INT_UNIVERSE;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable$ConceptualVariableMeasuresUnitType$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_POPULATION
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

                static final int INT_POPULATION = 1;
                static final int INT_UNIT_TYPE = 2;
                static final int INT_UNIVERSE = 3;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("Population", INT_POPULATION),
                    new Enum("UnitType", INT_UNIT_TYPE),
                    new Enum("Universe", INT_UNIVERSE),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }
}
