/*
 * XML Type:  DimensionComponent
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionComponent
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML DimensionComponent(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface DimensionComponent extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructureComponent {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionComponent> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "dimensioncomponent9955type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "categoricalAdditivity" element
     */
    boolean getCategoricalAdditivity();

    /**
     * Gets (as xml) the "categoricalAdditivity" element
     */
    org.apache.xmlbeans.XmlBoolean xgetCategoricalAdditivity();

    /**
     * True if has "categoricalAdditivity" element
     */
    boolean isSetCategoricalAdditivity();

    /**
     * Sets the "categoricalAdditivity" element
     */
    void setCategoricalAdditivity(boolean categoricalAdditivity);

    /**
     * Sets (as xml) the "categoricalAdditivity" element
     */
    void xsetCategoricalAdditivity(org.apache.xmlbeans.XmlBoolean categoricalAdditivity);

    /**
     * Unsets the "categoricalAdditivity" element
     */
    void unsetCategoricalAdditivity();

    /**
     * Gets the "DimensionComponent_isStructuredBy_ValueDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionComponent.DimensionComponentIsStructuredByValueDomain getDimensionComponentIsStructuredByValueDomain();

    /**
     * True if has "DimensionComponent_isStructuredBy_ValueDomain" element
     */
    boolean isSetDimensionComponentIsStructuredByValueDomain();

    /**
     * Sets the "DimensionComponent_isStructuredBy_ValueDomain" element
     */
    void setDimensionComponentIsStructuredByValueDomain(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionComponent.DimensionComponentIsStructuredByValueDomain dimensionComponentIsStructuredByValueDomain);

    /**
     * Appends and returns a new empty "DimensionComponent_isStructuredBy_ValueDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionComponent.DimensionComponentIsStructuredByValueDomain addNewDimensionComponentIsStructuredByValueDomain();

    /**
     * Unsets the "DimensionComponent_isStructuredBy_ValueDomain" element
     */
    void unsetDimensionComponentIsStructuredByValueDomain();

    /**
     * An XML DimensionComponent_isStructuredBy_ValueDomain(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface DimensionComponentIsStructuredByValueDomain extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionComponent.DimensionComponentIsStructuredByValueDomain> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "dimensioncomponentisstructuredbyvaluedomain22f9elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionComponent$DimensionComponentIsStructuredByValueDomain$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionComponent.DimensionComponentIsStructuredByValueDomain.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "validtypee377elemtype");
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
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionComponent$DimensionComponentIsStructuredByValueDomain$ValidType.
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
}
