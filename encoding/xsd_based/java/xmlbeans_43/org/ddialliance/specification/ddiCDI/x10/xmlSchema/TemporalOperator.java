/*
 * XML Type:  TemporalOperator
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalOperator
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML TemporalOperator(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalOperator.
 */
public interface TemporalOperator extends org.apache.xmlbeans.XmlNMTOKEN {
    SimpleTypeFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalOperator> Factory = new SimpleTypeFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "temporaloperator1ec4type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
    void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

    Enum AND_JOIN = Enum.forString("AndJoin");
    Enum AND_SPLIT = Enum.forString("AndSplit");
    Enum XOR_JOIN = Enum.forString("XorJoin");
    Enum XOR_SPLIT = Enum.forString("XorSplit");

    int INT_AND_JOIN = Enum.INT_AND_JOIN;
    int INT_AND_SPLIT = Enum.INT_AND_SPLIT;
    int INT_XOR_JOIN = Enum.INT_XOR_JOIN;
    int INT_XOR_SPLIT = Enum.INT_XOR_SPLIT;

    /**
     * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalOperator.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_AND_JOIN
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

        static final int INT_AND_JOIN = 1;
        static final int INT_AND_SPLIT = 2;
        static final int INT_XOR_JOIN = 3;
        static final int INT_XOR_SPLIT = 4;

        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
            new Enum("AndJoin", INT_AND_JOIN),
            new Enum("AndSplit", INT_AND_SPLIT),
            new Enum("XorJoin", INT_XOR_JOIN),
            new Enum("XorSplit", INT_XOR_SPLIT),
        });
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() {
            return forInt(intValue());
        }
    }
}
