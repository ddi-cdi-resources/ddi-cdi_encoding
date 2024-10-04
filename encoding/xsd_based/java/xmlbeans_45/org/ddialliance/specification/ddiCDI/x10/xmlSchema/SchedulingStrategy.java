/*
 * XML Type:  SchedulingStrategy
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.SchedulingStrategy
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML SchedulingStrategy(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.SchedulingStrategy.
 */
public interface SchedulingStrategy extends org.apache.xmlbeans.XmlNMTOKEN {
    SimpleTypeFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.SchedulingStrategy> Factory = new SimpleTypeFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "schedulingstrategy2845type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
    void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

    Enum BACKWARD_CHAINING = Enum.forString("BackwardChaining");
    Enum FORWARD_CHAINING = Enum.forString("ForwardChaining");

    int INT_BACKWARD_CHAINING = Enum.INT_BACKWARD_CHAINING;
    int INT_FORWARD_CHAINING = Enum.INT_FORWARD_CHAINING;

    /**
     * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.SchedulingStrategy.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_BACKWARD_CHAINING
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

        static final int INT_BACKWARD_CHAINING = 1;
        static final int INT_FORWARD_CHAINING = 2;

        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
            new Enum("BackwardChaining", INT_BACKWARD_CHAINING),
            new Enum("ForwardChaining", INT_FORWARD_CHAINING),
        });
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() {
            return forInt(intValue());
        }
    }
}
