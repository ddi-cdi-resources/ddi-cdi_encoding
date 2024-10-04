/*
 * XML Type:  ConceptualDomain
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualDomain
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ConceptualDomain(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface ConceptualDomain extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualDomain> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "conceptualdomaindebatype");
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
     * Gets a List of "displayLabel" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay> getDisplayLabelList();

    /**
     * Gets array of all "displayLabel" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay[] getDisplayLabelArray();

    /**
     * Gets ith "displayLabel" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay getDisplayLabelArray(int i);

    /**
     * Returns number of "displayLabel" element
     */
    int sizeOfDisplayLabelArray();

    /**
     * Sets array of all "displayLabel" element
     */
    void setDisplayLabelArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay[] displayLabelArray);

    /**
     * Sets ith "displayLabel" element
     */
    void setDisplayLabelArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay displayLabel);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "displayLabel" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay insertNewDisplayLabel(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "displayLabel" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay addNewDisplayLabel();

    /**
     * Removes the ith "displayLabel" element
     */
    void removeDisplayLabel(int i);

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
     * Gets the "ConceptualDomain_isDescribedBy_ValueAndConceptDescription" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualDomain.ConceptualDomainIsDescribedByValueAndConceptDescription getConceptualDomainIsDescribedByValueAndConceptDescription();

    /**
     * True if has "ConceptualDomain_isDescribedBy_ValueAndConceptDescription" element
     */
    boolean isSetConceptualDomainIsDescribedByValueAndConceptDescription();

    /**
     * Sets the "ConceptualDomain_isDescribedBy_ValueAndConceptDescription" element
     */
    void setConceptualDomainIsDescribedByValueAndConceptDescription(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualDomain.ConceptualDomainIsDescribedByValueAndConceptDescription conceptualDomainIsDescribedByValueAndConceptDescription);

    /**
     * Appends and returns a new empty "ConceptualDomain_isDescribedBy_ValueAndConceptDescription" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualDomain.ConceptualDomainIsDescribedByValueAndConceptDescription addNewConceptualDomainIsDescribedByValueAndConceptDescription();

    /**
     * Unsets the "ConceptualDomain_isDescribedBy_ValueAndConceptDescription" element
     */
    void unsetConceptualDomainIsDescribedByValueAndConceptDescription();

    /**
     * Gets the "ConceptualDomain_takesConceptsFrom_ConceptSystem" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualDomain.ConceptualDomainTakesConceptsFromConceptSystem getConceptualDomainTakesConceptsFromConceptSystem();

    /**
     * True if has "ConceptualDomain_takesConceptsFrom_ConceptSystem" element
     */
    boolean isSetConceptualDomainTakesConceptsFromConceptSystem();

    /**
     * Sets the "ConceptualDomain_takesConceptsFrom_ConceptSystem" element
     */
    void setConceptualDomainTakesConceptsFromConceptSystem(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualDomain.ConceptualDomainTakesConceptsFromConceptSystem conceptualDomainTakesConceptsFromConceptSystem);

    /**
     * Appends and returns a new empty "ConceptualDomain_takesConceptsFrom_ConceptSystem" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualDomain.ConceptualDomainTakesConceptsFromConceptSystem addNewConceptualDomainTakesConceptsFromConceptSystem();

    /**
     * Unsets the "ConceptualDomain_takesConceptsFrom_ConceptSystem" element
     */
    void unsetConceptualDomainTakesConceptsFromConceptSystem();

    /**
     * An XML ConceptualDomain_isDescribedBy_ValueAndConceptDescription(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface ConceptualDomainIsDescribedByValueAndConceptDescription extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualDomain.ConceptualDomainIsDescribedByValueAndConceptDescription> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "conceptualdomainisdescribedbyvalueandconceptdescriptionaa18elemtype");
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualDomain$ConceptualDomainIsDescribedByValueAndConceptDescription$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualDomain.ConceptualDomainIsDescribedByValueAndConceptDescription.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "validtype6516elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum VALUE_AND_CONCEPT_DESCRIPTION = Enum.forString("ValueAndConceptDescription");

            int INT_VALUE_AND_CONCEPT_DESCRIPTION = Enum.INT_VALUE_AND_CONCEPT_DESCRIPTION;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualDomain$ConceptualDomainIsDescribedByValueAndConceptDescription$ValidType.
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

    /**
     * An XML ConceptualDomain_takesConceptsFrom_ConceptSystem(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface ConceptualDomainTakesConceptsFromConceptSystem extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualDomain.ConceptualDomainTakesConceptsFromConceptSystem> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "conceptualdomaintakesconceptsfromconceptsystem9e08elemtype");
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualDomain$ConceptualDomainTakesConceptsFromConceptSystem$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualDomain.ConceptualDomainTakesConceptsFromConceptSystem.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "validtypeed4aelemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum CATEGORY_SET = Enum.forString("CategorySet");
            Enum CONCEPT_SYSTEM = Enum.forString("ConceptSystem");

            int INT_CATEGORY_SET = Enum.INT_CATEGORY_SET;
            int INT_CONCEPT_SYSTEM = Enum.INT_CONCEPT_SYSTEM;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualDomain$ConceptualDomainTakesConceptsFromConceptSystem$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_CATEGORY_SET
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

                static final int INT_CATEGORY_SET = 1;
                static final int INT_CONCEPT_SYSTEM = 2;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("CategorySet", INT_CATEGORY_SET),
                    new Enum("ConceptSystem", INT_CONCEPT_SYSTEM),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }
}
