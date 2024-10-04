/*
 * XML Type:  TemporalRelation
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalRelation
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML TemporalRelation(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalRelation.
 */
public interface TemporalRelation extends org.apache.xmlbeans.XmlNMTOKEN {
    SimpleTypeFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalRelation> Factory = new SimpleTypeFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "temporalrelation9c1ctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
    void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

    Enum CONTAINS = Enum.forString("Contains");
    Enum EQUALS = Enum.forString("Equals");
    Enum FINISHES = Enum.forString("Finishes");
    Enum MEETS = Enum.forString("Meets");
    Enum OVERLAPS = Enum.forString("Overlaps");
    Enum PRECEDES = Enum.forString("Precedes");
    Enum STARTS = Enum.forString("Starts");

    int INT_CONTAINS = Enum.INT_CONTAINS;
    int INT_EQUALS = Enum.INT_EQUALS;
    int INT_FINISHES = Enum.INT_FINISHES;
    int INT_MEETS = Enum.INT_MEETS;
    int INT_OVERLAPS = Enum.INT_OVERLAPS;
    int INT_PRECEDES = Enum.INT_PRECEDES;
    int INT_STARTS = Enum.INT_STARTS;

    /**
     * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalRelation.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_CONTAINS
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

        static final int INT_CONTAINS = 1;
        static final int INT_EQUALS = 2;
        static final int INT_FINISHES = 3;
        static final int INT_MEETS = 4;
        static final int INT_OVERLAPS = 5;
        static final int INT_PRECEDES = 6;
        static final int INT_STARTS = 7;

        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
            new Enum("Contains", INT_CONTAINS),
            new Enum("Equals", INT_EQUALS),
            new Enum("Finishes", INT_FINISHES),
            new Enum("Meets", INT_MEETS),
            new Enum("Overlaps", INT_OVERLAPS),
            new Enum("Precedes", INT_PRECEDES),
            new Enum("Starts", INT_STARTS),
        });
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() {
            return forInt(intValue());
        }
    }
}
