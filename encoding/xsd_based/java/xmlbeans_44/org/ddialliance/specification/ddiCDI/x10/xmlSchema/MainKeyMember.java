/*
 * XML Type:  MainKeyMember
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.MainKeyMember
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML MainKeyMember(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface MainKeyMember extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyMember {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.MainKeyMember> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "mainkeymember188ctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "MainKeyMember_hasValueFrom_SubstantiveValueDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.MainKeyMember.MainKeyMemberHasValueFromSubstantiveValueDomain getMainKeyMemberHasValueFromSubstantiveValueDomain();

    /**
     * True if has "MainKeyMember_hasValueFrom_SubstantiveValueDomain" element
     */
    boolean isSetMainKeyMemberHasValueFromSubstantiveValueDomain();

    /**
     * Sets the "MainKeyMember_hasValueFrom_SubstantiveValueDomain" element
     */
    void setMainKeyMemberHasValueFromSubstantiveValueDomain(org.ddialliance.specification.ddiCDI.x10.xmlSchema.MainKeyMember.MainKeyMemberHasValueFromSubstantiveValueDomain mainKeyMemberHasValueFromSubstantiveValueDomain);

    /**
     * Appends and returns a new empty "MainKeyMember_hasValueFrom_SubstantiveValueDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.MainKeyMember.MainKeyMemberHasValueFromSubstantiveValueDomain addNewMainKeyMemberHasValueFromSubstantiveValueDomain();

    /**
     * Unsets the "MainKeyMember_hasValueFrom_SubstantiveValueDomain" element
     */
    void unsetMainKeyMemberHasValueFromSubstantiveValueDomain();

    /**
     * An XML MainKeyMember_hasValueFrom_SubstantiveValueDomain(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface MainKeyMemberHasValueFromSubstantiveValueDomain extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.MainKeyMember.MainKeyMemberHasValueFromSubstantiveValueDomain> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "mainkeymemberhasvaluefromsubstantivevaluedomain64daelemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.MainKeyMember$MainKeyMemberHasValueFromSubstantiveValueDomain$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.MainKeyMember.MainKeyMemberHasValueFromSubstantiveValueDomain.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "validtype9c9celemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum DESCRIPTOR_VALUE_DOMAIN = Enum.forString("DescriptorValueDomain");
            Enum SUBSTANTIVE_VALUE_DOMAIN = Enum.forString("SubstantiveValueDomain");

            int INT_DESCRIPTOR_VALUE_DOMAIN = Enum.INT_DESCRIPTOR_VALUE_DOMAIN;
            int INT_SUBSTANTIVE_VALUE_DOMAIN = Enum.INT_SUBSTANTIVE_VALUE_DOMAIN;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.MainKeyMember$MainKeyMemberHasValueFromSubstantiveValueDomain$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_DESCRIPTOR_VALUE_DOMAIN
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

                static final int INT_DESCRIPTOR_VALUE_DOMAIN = 1;
                static final int INT_SUBSTANTIVE_VALUE_DOMAIN = 2;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("DescriptorValueDomain", INT_DESCRIPTOR_VALUE_DOMAIN),
                    new Enum("SubstantiveValueDomain", INT_SUBSTANTIVE_VALUE_DOMAIN),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }
}
