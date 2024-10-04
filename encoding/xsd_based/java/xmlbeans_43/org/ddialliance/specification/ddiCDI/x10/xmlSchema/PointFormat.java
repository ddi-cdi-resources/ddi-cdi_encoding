/*
 * XML Type:  PointFormat
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.PointFormat
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML PointFormat(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.PointFormat.
 */
public interface PointFormat extends org.apache.xmlbeans.XmlNMTOKEN {
    SimpleTypeFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PointFormat> Factory = new SimpleTypeFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "pointformatf753type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
    void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

    Enum DECIMAL_DEGREE = Enum.forString("DecimalDegree");
    Enum DECIMAL_MINUTES = Enum.forString("DecimalMinutes");
    Enum DEGREES_MINUTES_SECONDS = Enum.forString("DegreesMinutesSeconds");
    Enum FEET = Enum.forString("Feet");
    Enum METERS = Enum.forString("Meters");

    int INT_DECIMAL_DEGREE = Enum.INT_DECIMAL_DEGREE;
    int INT_DECIMAL_MINUTES = Enum.INT_DECIMAL_MINUTES;
    int INT_DEGREES_MINUTES_SECONDS = Enum.INT_DEGREES_MINUTES_SECONDS;
    int INT_FEET = Enum.INT_FEET;
    int INT_METERS = Enum.INT_METERS;

    /**
     * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.PointFormat.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_DECIMAL_DEGREE
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

        static final int INT_DECIMAL_DEGREE = 1;
        static final int INT_DECIMAL_MINUTES = 2;
        static final int INT_DEGREES_MINUTES_SECONDS = 3;
        static final int INT_FEET = 4;
        static final int INT_METERS = 5;

        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
            new Enum("DecimalDegree", INT_DECIMAL_DEGREE),
            new Enum("DecimalMinutes", INT_DECIMAL_MINUTES),
            new Enum("DegreesMinutesSeconds", INT_DEGREES_MINUTES_SECONDS),
            new Enum("Feet", INT_FEET),
            new Enum("Meters", INT_METERS),
        });
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() {
            return forInt(intValue());
        }
    }
}
