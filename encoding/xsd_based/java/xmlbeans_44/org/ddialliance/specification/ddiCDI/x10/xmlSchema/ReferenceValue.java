/*
 * XML Type:  ReferenceValue
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValue
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ReferenceValue(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface ReferenceValue extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceValue {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValue> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "referencevalued404type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ReferenceValue_correspondsTo_VariableValueComponent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValue.ReferenceValueCorrespondsToVariableValueComponent getReferenceValueCorrespondsToVariableValueComponent();

    /**
     * Sets the "ReferenceValue_correspondsTo_VariableValueComponent" element
     */
    void setReferenceValueCorrespondsToVariableValueComponent(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValue.ReferenceValueCorrespondsToVariableValueComponent referenceValueCorrespondsToVariableValueComponent);

    /**
     * Appends and returns a new empty "ReferenceValue_correspondsTo_VariableValueComponent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValue.ReferenceValueCorrespondsToVariableValueComponent addNewReferenceValueCorrespondsToVariableValueComponent();

    /**
     * Gets the "ReferenceValue_hasValueFrom_ReferenceValueDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValue.ReferenceValueHasValueFromReferenceValueDomain getReferenceValueHasValueFromReferenceValueDomain();

    /**
     * Sets the "ReferenceValue_hasValueFrom_ReferenceValueDomain" element
     */
    void setReferenceValueHasValueFromReferenceValueDomain(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValue.ReferenceValueHasValueFromReferenceValueDomain referenceValueHasValueFromReferenceValueDomain);

    /**
     * Appends and returns a new empty "ReferenceValue_hasValueFrom_ReferenceValueDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValue.ReferenceValueHasValueFromReferenceValueDomain addNewReferenceValueHasValueFromReferenceValueDomain();

    /**
     * An XML ReferenceValue_correspondsTo_VariableValueComponent(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface ReferenceValueCorrespondsToVariableValueComponent extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValue.ReferenceValueCorrespondsToVariableValueComponent> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "referencevaluecorrespondstovariablevaluecomponent9037elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValue$ReferenceValueCorrespondsToVariableValueComponent$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValue.ReferenceValueCorrespondsToVariableValueComponent.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "validtype2935elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum VARIABLE_VALUE_COMPONENT = Enum.forString("VariableValueComponent");

            int INT_VARIABLE_VALUE_COMPONENT = Enum.INT_VARIABLE_VALUE_COMPONENT;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValue$ReferenceValueCorrespondsToVariableValueComponent$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_VARIABLE_VALUE_COMPONENT
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

                static final int INT_VARIABLE_VALUE_COMPONENT = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("VariableValueComponent", INT_VARIABLE_VALUE_COMPONENT),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }

    /**
     * An XML ReferenceValue_hasValueFrom_ReferenceValueDomain(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface ReferenceValueHasValueFromReferenceValueDomain extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValue.ReferenceValueHasValueFromReferenceValueDomain> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "referencevaluehasvaluefromreferencevaluedomainaa99elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValue$ReferenceValueHasValueFromReferenceValueDomain$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValue.ReferenceValueHasValueFromReferenceValueDomain.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "validtypee25belemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum REFERENCE_VALUE_DOMAIN = Enum.forString("ReferenceValueDomain");

            int INT_REFERENCE_VALUE_DOMAIN = Enum.INT_REFERENCE_VALUE_DOMAIN;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValue$ReferenceValueHasValueFromReferenceValueDomain$ValidType.
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
