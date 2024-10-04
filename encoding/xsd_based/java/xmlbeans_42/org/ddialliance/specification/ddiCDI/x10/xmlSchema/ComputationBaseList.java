/*
 * XML Type:  ComputationBaseList
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ComputationBaseList
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ComputationBaseList(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ComputationBaseList.
 */
public interface ComputationBaseList extends org.apache.xmlbeans.XmlNMTOKEN {
    SimpleTypeFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ComputationBaseList> Factory = new SimpleTypeFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "computationbaselistfc22type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
    void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

    Enum MISSING_ONLY = Enum.forString("MissingOnly");
    Enum TOTAL = Enum.forString("Total");
    Enum VALID_ONLY = Enum.forString("ValidOnly");

    int INT_MISSING_ONLY = Enum.INT_MISSING_ONLY;
    int INT_TOTAL = Enum.INT_TOTAL;
    int INT_VALID_ONLY = Enum.INT_VALID_ONLY;

    /**
     * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.ComputationBaseList.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_MISSING_ONLY
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

        static final int INT_MISSING_ONLY = 1;
        static final int INT_TOTAL = 2;
        static final int INT_VALID_ONLY = 3;

        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
            new Enum("MissingOnly", INT_MISSING_ONLY),
            new Enum("Total", INT_TOTAL),
            new Enum("ValidOnly", INT_VALID_ONLY),
        });
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() {
            return forInt(intValue());
        }
    }
}
