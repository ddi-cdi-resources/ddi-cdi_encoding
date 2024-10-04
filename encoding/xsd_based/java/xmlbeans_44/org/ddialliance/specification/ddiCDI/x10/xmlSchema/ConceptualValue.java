/*
 * XML Type:  ConceptualValue
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualValue
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ConceptualValue(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface ConceptualValue extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.Concept {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualValue> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "conceptualvaluecb85type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ConceptualValue_hasConceptFrom_ConceptualDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualValue.ConceptualValueHasConceptFromConceptualDomain getConceptualValueHasConceptFromConceptualDomain();

    /**
     * Sets the "ConceptualValue_hasConceptFrom_ConceptualDomain" element
     */
    void setConceptualValueHasConceptFromConceptualDomain(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualValue.ConceptualValueHasConceptFromConceptualDomain conceptualValueHasConceptFromConceptualDomain);

    /**
     * Appends and returns a new empty "ConceptualValue_hasConceptFrom_ConceptualDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualValue.ConceptualValueHasConceptFromConceptualDomain addNewConceptualValueHasConceptFromConceptualDomain();

    /**
     * An XML ConceptualValue_hasConceptFrom_ConceptualDomain(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface ConceptualValueHasConceptFromConceptualDomain extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualValue.ConceptualValueHasConceptFromConceptualDomain> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "conceptualvaluehasconceptfromconceptualdomaind94eelemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualValue$ConceptualValueHasConceptFromConceptualDomain$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualValue.ConceptualValueHasConceptFromConceptualDomain.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "validtype1110elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum CONCEPTUAL_DOMAIN = Enum.forString("ConceptualDomain");
            Enum SENTINEL_CONCEPTUAL_DOMAIN = Enum.forString("SentinelConceptualDomain");
            Enum SUBSTANTIVE_CONCEPTUAL_DOMAIN = Enum.forString("SubstantiveConceptualDomain");

            int INT_CONCEPTUAL_DOMAIN = Enum.INT_CONCEPTUAL_DOMAIN;
            int INT_SENTINEL_CONCEPTUAL_DOMAIN = Enum.INT_SENTINEL_CONCEPTUAL_DOMAIN;
            int INT_SUBSTANTIVE_CONCEPTUAL_DOMAIN = Enum.INT_SUBSTANTIVE_CONCEPTUAL_DOMAIN;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualValue$ConceptualValueHasConceptFromConceptualDomain$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_CONCEPTUAL_DOMAIN
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

                static final int INT_CONCEPTUAL_DOMAIN = 1;
                static final int INT_SENTINEL_CONCEPTUAL_DOMAIN = 2;
                static final int INT_SUBSTANTIVE_CONCEPTUAL_DOMAIN = 3;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("ConceptualDomain", INT_CONCEPTUAL_DOMAIN),
                    new Enum("SentinelConceptualDomain", INT_SENTINEL_CONCEPTUAL_DOMAIN),
                    new Enum("SubstantiveConceptualDomain", INT_SUBSTANTIVE_CONCEPTUAL_DOMAIN),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }
}
