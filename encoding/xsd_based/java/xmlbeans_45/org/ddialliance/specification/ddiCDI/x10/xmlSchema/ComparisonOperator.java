/*
 * XML Type:  ComparisonOperator
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ComparisonOperator
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ComparisonOperator(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ComparisonOperator.
 */
public interface ComparisonOperator extends org.apache.xmlbeans.XmlNMTOKEN {
    SimpleTypeFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ComparisonOperator> Factory = new SimpleTypeFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "comparisonoperator01ebtype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
    void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

    Enum EQUAL = Enum.forString("Equal");
    Enum GREATER_THAN = Enum.forString("GreaterThan");
    Enum GREATER_THAN_OR_EQUAL_TO = Enum.forString("GreaterThanOrEqualTo");
    Enum LESS_THAN = Enum.forString("LessThan");
    Enum LESS_THAN_OR_EQUAL_TO = Enum.forString("LessThanOrEqualTo");
    Enum NOT_EQUAL = Enum.forString("NotEqual");

    int INT_EQUAL = Enum.INT_EQUAL;
    int INT_GREATER_THAN = Enum.INT_GREATER_THAN;
    int INT_GREATER_THAN_OR_EQUAL_TO = Enum.INT_GREATER_THAN_OR_EQUAL_TO;
    int INT_LESS_THAN = Enum.INT_LESS_THAN;
    int INT_LESS_THAN_OR_EQUAL_TO = Enum.INT_LESS_THAN_OR_EQUAL_TO;
    int INT_NOT_EQUAL = Enum.INT_NOT_EQUAL;

    /**
     * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.ComparisonOperator.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_EQUAL
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

        static final int INT_EQUAL = 1;
        static final int INT_GREATER_THAN = 2;
        static final int INT_GREATER_THAN_OR_EQUAL_TO = 3;
        static final int INT_LESS_THAN = 4;
        static final int INT_LESS_THAN_OR_EQUAL_TO = 5;
        static final int INT_NOT_EQUAL = 6;

        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
            new Enum("Equal", INT_EQUAL),
            new Enum("GreaterThan", INT_GREATER_THAN),
            new Enum("GreaterThanOrEqualTo", INT_GREATER_THAN_OR_EQUAL_TO),
            new Enum("LessThan", INT_LESS_THAN),
            new Enum("LessThanOrEqualTo", INT_LESS_THAN_OR_EQUAL_TO),
            new Enum("NotEqual", INT_NOT_EQUAL),
        });
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() {
            return forInt(intValue());
        }
    }
}
