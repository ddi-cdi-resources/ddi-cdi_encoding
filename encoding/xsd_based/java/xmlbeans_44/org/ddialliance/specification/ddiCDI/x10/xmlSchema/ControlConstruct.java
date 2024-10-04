/*
 * XML Type:  ControlConstruct
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlConstruct
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ControlConstruct(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlConstruct.
 */
public interface ControlConstruct extends org.apache.xmlbeans.XmlNMTOKEN {
    SimpleTypeFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlConstruct> Factory = new SimpleTypeFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "controlconstruct4dd8type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
    void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

    Enum ELSE = Enum.forString("Else");
    Enum IF_THEN = Enum.forString("IfThen");
    Enum LOOP = Enum.forString("Loop");
    Enum REPEAT_UNTIL = Enum.forString("RepeatUntil");
    Enum REPEAT_WHILE = Enum.forString("RepeatWhile");

    int INT_ELSE = Enum.INT_ELSE;
    int INT_IF_THEN = Enum.INT_IF_THEN;
    int INT_LOOP = Enum.INT_LOOP;
    int INT_REPEAT_UNTIL = Enum.INT_REPEAT_UNTIL;
    int INT_REPEAT_WHILE = Enum.INT_REPEAT_WHILE;

    /**
     * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlConstruct.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_ELSE
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

        static final int INT_ELSE = 1;
        static final int INT_IF_THEN = 2;
        static final int INT_LOOP = 3;
        static final int INT_REPEAT_UNTIL = 4;
        static final int INT_REPEAT_WHILE = 5;

        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
            new Enum("Else", INT_ELSE),
            new Enum("IfThen", INT_IF_THEN),
            new Enum("Loop", INT_LOOP),
            new Enum("RepeatUntil", INT_REPEAT_UNTIL),
            new Enum("RepeatWhile", INT_REPEAT_WHILE),
        });
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() {
            return forInt(intValue());
        }
    }
}
