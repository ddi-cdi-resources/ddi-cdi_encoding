/*
 * XML Type:  ReferenceVariable
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceVariable
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ReferenceVariable(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface ReferenceVariable extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceVariable> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "referencevariable2753type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ReferenceVariable_takesValuesFrom_ReferenceValueDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceVariable.ReferenceVariableTakesValuesFromReferenceValueDomain getReferenceVariableTakesValuesFromReferenceValueDomain();

    /**
     * True if has "ReferenceVariable_takesValuesFrom_ReferenceValueDomain" element
     */
    boolean isSetReferenceVariableTakesValuesFromReferenceValueDomain();

    /**
     * Sets the "ReferenceVariable_takesValuesFrom_ReferenceValueDomain" element
     */
    void setReferenceVariableTakesValuesFromReferenceValueDomain(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceVariable.ReferenceVariableTakesValuesFromReferenceValueDomain referenceVariableTakesValuesFromReferenceValueDomain);

    /**
     * Appends and returns a new empty "ReferenceVariable_takesValuesFrom_ReferenceValueDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceVariable.ReferenceVariableTakesValuesFromReferenceValueDomain addNewReferenceVariableTakesValuesFromReferenceValueDomain();

    /**
     * Unsets the "ReferenceVariable_takesValuesFrom_ReferenceValueDomain" element
     */
    void unsetReferenceVariableTakesValuesFromReferenceValueDomain();

    /**
     * An XML ReferenceVariable_takesValuesFrom_ReferenceValueDomain(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface ReferenceVariableTakesValuesFromReferenceValueDomain extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceVariable.ReferenceVariableTakesValuesFromReferenceValueDomain> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "referencevariabletakesvaluesfromreferencevaluedomaine7d8elemtype");
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceVariable$ReferenceVariableTakesValuesFromReferenceValueDomain$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceVariable.ReferenceVariableTakesValuesFromReferenceValueDomain.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "validtype4a56elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum REFERENCE_VALUE_DOMAIN = Enum.forString("ReferenceValueDomain");

            int INT_REFERENCE_VALUE_DOMAIN = Enum.INT_REFERENCE_VALUE_DOMAIN;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceVariable$ReferenceVariableTakesValuesFromReferenceValueDomain$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_REFERENCE_VALUE_DOMAIN
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

                static final int INT_REFERENCE_VALUE_DOMAIN = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("ReferenceValueDomain", INT_REFERENCE_VALUE_DOMAIN),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }
}
