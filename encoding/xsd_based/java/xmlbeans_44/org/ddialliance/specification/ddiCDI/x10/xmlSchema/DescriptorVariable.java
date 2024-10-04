/*
 * XML Type:  DescriptorVariable
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorVariable
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML DescriptorVariable(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface DescriptorVariable extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorVariable> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "descriptorvariable2c29type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "DescriptorVariable_takesSubstantiveValuesFrom_DescriptorValueDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorVariable.DescriptorVariableTakesSubstantiveValuesFromDescriptorValueDomain getDescriptorVariableTakesSubstantiveValuesFromDescriptorValueDomain();

    /**
     * True if has "DescriptorVariable_takesSubstantiveValuesFrom_DescriptorValueDomain" element
     */
    boolean isSetDescriptorVariableTakesSubstantiveValuesFromDescriptorValueDomain();

    /**
     * Sets the "DescriptorVariable_takesSubstantiveValuesFrom_DescriptorValueDomain" element
     */
    void setDescriptorVariableTakesSubstantiveValuesFromDescriptorValueDomain(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorVariable.DescriptorVariableTakesSubstantiveValuesFromDescriptorValueDomain descriptorVariableTakesSubstantiveValuesFromDescriptorValueDomain);

    /**
     * Appends and returns a new empty "DescriptorVariable_takesSubstantiveValuesFrom_DescriptorValueDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorVariable.DescriptorVariableTakesSubstantiveValuesFromDescriptorValueDomain addNewDescriptorVariableTakesSubstantiveValuesFromDescriptorValueDomain();

    /**
     * Unsets the "DescriptorVariable_takesSubstantiveValuesFrom_DescriptorValueDomain" element
     */
    void unsetDescriptorVariableTakesSubstantiveValuesFromDescriptorValueDomain();

    /**
     * An XML DescriptorVariable_takesSubstantiveValuesFrom_DescriptorValueDomain(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface DescriptorVariableTakesSubstantiveValuesFromDescriptorValueDomain extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorVariable.DescriptorVariableTakesSubstantiveValuesFromDescriptorValueDomain> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "descriptorvariabletakessubstantivevaluesfromdescriptorvaluedomain3eb0elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorVariable$DescriptorVariableTakesSubstantiveValuesFromDescriptorValueDomain$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorVariable.DescriptorVariableTakesSubstantiveValuesFromDescriptorValueDomain.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "validtype6caeelemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum DESCRIPTOR_VALUE_DOMAIN = Enum.forString("DescriptorValueDomain");

            int INT_DESCRIPTOR_VALUE_DOMAIN = Enum.INT_DESCRIPTOR_VALUE_DOMAIN;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorVariable$DescriptorVariableTakesSubstantiveValuesFromDescriptorValueDomain$ValidType.
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

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("DescriptorValueDomain", INT_DESCRIPTOR_VALUE_DOMAIN),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }
}
