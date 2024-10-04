/*
 * XML Type:  QualifiedMeasure
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.QualifiedMeasure
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML QualifiedMeasure(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface QualifiedMeasure extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.MeasureComponent {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.QualifiedMeasure> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "qualifiedmeasure3000type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "QualifiedMeasure_refines_MeasureComponent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.QualifiedMeasure.QualifiedMeasureRefinesMeasureComponent getQualifiedMeasureRefinesMeasureComponent();

    /**
     * True if has "QualifiedMeasure_refines_MeasureComponent" element
     */
    boolean isSetQualifiedMeasureRefinesMeasureComponent();

    /**
     * Sets the "QualifiedMeasure_refines_MeasureComponent" element
     */
    void setQualifiedMeasureRefinesMeasureComponent(org.ddialliance.specification.ddiCDI.x10.xmlSchema.QualifiedMeasure.QualifiedMeasureRefinesMeasureComponent qualifiedMeasureRefinesMeasureComponent);

    /**
     * Appends and returns a new empty "QualifiedMeasure_refines_MeasureComponent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.QualifiedMeasure.QualifiedMeasureRefinesMeasureComponent addNewQualifiedMeasureRefinesMeasureComponent();

    /**
     * Unsets the "QualifiedMeasure_refines_MeasureComponent" element
     */
    void unsetQualifiedMeasureRefinesMeasureComponent();

    /**
     * An XML QualifiedMeasure_refines_MeasureComponent(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface QualifiedMeasureRefinesMeasureComponent extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.QualifiedMeasure.QualifiedMeasureRefinesMeasureComponent> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "qualifiedmeasurerefinesmeasurecomponentda3felemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.QualifiedMeasure$QualifiedMeasureRefinesMeasureComponent$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.QualifiedMeasure.QualifiedMeasureRefinesMeasureComponent.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "validtype513delemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum MEASURE_COMPONENT = Enum.forString("MeasureComponent");
            Enum QUALIFIED_MEASURE = Enum.forString("QualifiedMeasure");

            int INT_MEASURE_COMPONENT = Enum.INT_MEASURE_COMPONENT;
            int INT_QUALIFIED_MEASURE = Enum.INT_QUALIFIED_MEASURE;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.QualifiedMeasure$QualifiedMeasureRefinesMeasureComponent$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_MEASURE_COMPONENT
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

                static final int INT_MEASURE_COMPONENT = 1;
                static final int INT_QUALIFIED_MEASURE = 2;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("MeasureComponent", INT_MEASURE_COMPONENT),
                    new Enum("QualifiedMeasure", INT_QUALIFIED_MEASURE),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }
}
