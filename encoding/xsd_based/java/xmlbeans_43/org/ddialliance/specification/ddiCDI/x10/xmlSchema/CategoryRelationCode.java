/*
 * XML Type:  CategoryRelationCode
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationCode
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CategoryRelationCode(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationCode.
 */
public interface CategoryRelationCode extends org.apache.xmlbeans.XmlNMTOKEN {
    SimpleTypeFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationCode> Factory = new SimpleTypeFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "categoryrelationcodec305type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
    void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

    Enum CONTINUOUS = Enum.forString("Continuous");
    Enum INTERVAL = Enum.forString("Interval");
    Enum NOMINAL = Enum.forString("Nominal");
    Enum ORDINAL = Enum.forString("Ordinal");
    Enum RATIO = Enum.forString("Ratio");

    int INT_CONTINUOUS = Enum.INT_CONTINUOUS;
    int INT_INTERVAL = Enum.INT_INTERVAL;
    int INT_NOMINAL = Enum.INT_NOMINAL;
    int INT_ORDINAL = Enum.INT_ORDINAL;
    int INT_RATIO = Enum.INT_RATIO;

    /**
     * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationCode.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_CONTINUOUS
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

        static final int INT_CONTINUOUS = 1;
        static final int INT_INTERVAL = 2;
        static final int INT_NOMINAL = 3;
        static final int INT_ORDINAL = 4;
        static final int INT_RATIO = 5;

        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
            new Enum("Continuous", INT_CONTINUOUS),
            new Enum("Interval", INT_INTERVAL),
            new Enum("Nominal", INT_NOMINAL),
            new Enum("Ordinal", INT_ORDINAL),
            new Enum("Ratio", INT_RATIO),
        });
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() {
            return forInt(intValue());
        }
    }
}
