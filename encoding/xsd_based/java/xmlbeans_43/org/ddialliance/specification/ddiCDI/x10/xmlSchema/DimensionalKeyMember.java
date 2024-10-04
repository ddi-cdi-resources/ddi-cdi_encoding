/*
 * XML Type:  DimensionalKeyMember
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyMember
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML DimensionalKeyMember(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface DimensionalKeyMember extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyMember {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyMember> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "dimensionalkeymemberee26type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "DimensionalKeyMember_hasValueFrom_CodeList" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyMember.DimensionalKeyMemberHasValueFromCodeList getDimensionalKeyMemberHasValueFromCodeList();

    /**
     * Sets the "DimensionalKeyMember_hasValueFrom_CodeList" element
     */
    void setDimensionalKeyMemberHasValueFromCodeList(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyMember.DimensionalKeyMemberHasValueFromCodeList dimensionalKeyMemberHasValueFromCodeList);

    /**
     * Appends and returns a new empty "DimensionalKeyMember_hasValueFrom_CodeList" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyMember.DimensionalKeyMemberHasValueFromCodeList addNewDimensionalKeyMemberHasValueFromCodeList();

    /**
     * An XML DimensionalKeyMember_hasValueFrom_CodeList(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface DimensionalKeyMemberHasValueFromCodeList extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyMember.DimensionalKeyMemberHasValueFromCodeList> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "dimensionalkeymemberhasvaluefromcodelistcd58elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyMember$DimensionalKeyMemberHasValueFromCodeList$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyMember.DimensionalKeyMemberHasValueFromCodeList.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "validtype051aelemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum CODE_LIST = Enum.forString("CodeList");

            int INT_CODE_LIST = Enum.INT_CODE_LIST;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyMember$DimensionalKeyMemberHasValueFromCodeList$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_CODE_LIST
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

                static final int INT_CODE_LIST = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("CodeList", INT_CODE_LIST),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }
}
