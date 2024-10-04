/*
 * XML Type:  InstanceKey
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKey
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML InstanceKey(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface InstanceKey extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKey> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "instancekeyc8b6type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "InstanceKey_has_InstanceValue" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKey.InstanceKeyHasInstanceValue getInstanceKeyHasInstanceValue();

    /**
     * True if has "InstanceKey_has_InstanceValue" element
     */
    boolean isSetInstanceKeyHasInstanceValue();

    /**
     * Sets the "InstanceKey_has_InstanceValue" element
     */
    void setInstanceKeyHasInstanceValue(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKey.InstanceKeyHasInstanceValue instanceKeyHasInstanceValue);

    /**
     * Appends and returns a new empty "InstanceKey_has_InstanceValue" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKey.InstanceKeyHasInstanceValue addNewInstanceKeyHasInstanceValue();

    /**
     * Unsets the "InstanceKey_has_InstanceValue" element
     */
    void unsetInstanceKeyHasInstanceValue();

    /**
     * Gets the "InstanceKey_refersTo_ReferenceValue" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKey.InstanceKeyRefersToReferenceValue getInstanceKeyRefersToReferenceValue();

    /**
     * Sets the "InstanceKey_refersTo_ReferenceValue" element
     */
    void setInstanceKeyRefersToReferenceValue(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKey.InstanceKeyRefersToReferenceValue instanceKeyRefersToReferenceValue);

    /**
     * Appends and returns a new empty "InstanceKey_refersTo_ReferenceValue" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKey.InstanceKeyRefersToReferenceValue addNewInstanceKeyRefersToReferenceValue();

    /**
     * An XML InstanceKey_has_InstanceValue(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface InstanceKeyHasInstanceValue extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKey.InstanceKeyHasInstanceValue> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "instancekeyhasinstancevalue2ee4elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKey$InstanceKeyHasInstanceValue$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKey.InstanceKeyHasInstanceValue.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "validtypea426elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum DESCRIPTOR = Enum.forString("Descriptor");
            Enum DIMENSIONAL_KEY_MEMBER = Enum.forString("DimensionalKeyMember");
            Enum INSTANCE_VALUE = Enum.forString("InstanceValue");
            Enum KEY_MEMBER = Enum.forString("KeyMember");
            Enum LONG_MAIN_KEY_MEMBER = Enum.forString("LongMainKeyMember");
            Enum MAIN_KEY_MEMBER = Enum.forString("MainKeyMember");
            Enum REFERENCE_VALUE = Enum.forString("ReferenceValue");
            Enum WIDE_KEY_MEMBER = Enum.forString("WideKeyMember");

            int INT_DESCRIPTOR = Enum.INT_DESCRIPTOR;
            int INT_DIMENSIONAL_KEY_MEMBER = Enum.INT_DIMENSIONAL_KEY_MEMBER;
            int INT_INSTANCE_VALUE = Enum.INT_INSTANCE_VALUE;
            int INT_KEY_MEMBER = Enum.INT_KEY_MEMBER;
            int INT_LONG_MAIN_KEY_MEMBER = Enum.INT_LONG_MAIN_KEY_MEMBER;
            int INT_MAIN_KEY_MEMBER = Enum.INT_MAIN_KEY_MEMBER;
            int INT_REFERENCE_VALUE = Enum.INT_REFERENCE_VALUE;
            int INT_WIDE_KEY_MEMBER = Enum.INT_WIDE_KEY_MEMBER;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKey$InstanceKeyHasInstanceValue$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_DESCRIPTOR
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

                static final int INT_DESCRIPTOR = 1;
                static final int INT_DIMENSIONAL_KEY_MEMBER = 2;
                static final int INT_INSTANCE_VALUE = 3;
                static final int INT_KEY_MEMBER = 4;
                static final int INT_LONG_MAIN_KEY_MEMBER = 5;
                static final int INT_MAIN_KEY_MEMBER = 6;
                static final int INT_REFERENCE_VALUE = 7;
                static final int INT_WIDE_KEY_MEMBER = 8;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("Descriptor", INT_DESCRIPTOR),
                    new Enum("DimensionalKeyMember", INT_DIMENSIONAL_KEY_MEMBER),
                    new Enum("InstanceValue", INT_INSTANCE_VALUE),
                    new Enum("KeyMember", INT_KEY_MEMBER),
                    new Enum("LongMainKeyMember", INT_LONG_MAIN_KEY_MEMBER),
                    new Enum("MainKeyMember", INT_MAIN_KEY_MEMBER),
                    new Enum("ReferenceValue", INT_REFERENCE_VALUE),
                    new Enum("WideKeyMember", INT_WIDE_KEY_MEMBER),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }

    /**
     * An XML InstanceKey_refersTo_ReferenceValue(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface InstanceKeyRefersToReferenceValue extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKey.InstanceKeyRefersToReferenceValue> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "instancekeyreferstoreferencevalue2364elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKey$InstanceKeyRefersToReferenceValue$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKey.InstanceKeyRefersToReferenceValue.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "validtype1f26elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum REFERENCE_VALUE = Enum.forString("ReferenceValue");

            int INT_REFERENCE_VALUE = Enum.INT_REFERENCE_VALUE;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKey$InstanceKeyRefersToReferenceValue$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_REFERENCE_VALUE
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

                static final int INT_REFERENCE_VALUE = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("ReferenceValue", INT_REFERENCE_VALUE),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }
}
