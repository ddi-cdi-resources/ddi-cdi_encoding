/*
 * XML Type:  Rule
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.Rule
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML Rule(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface Rule extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Rule> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "ruled45atype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "identifier" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier getIdentifier();

    /**
     * True if has "identifier" element
     */
    boolean isSetIdentifier();

    /**
     * Sets the "identifier" element
     */
    void setIdentifier(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier identifier);

    /**
     * Appends and returns a new empty "identifier" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier addNewIdentifier();

    /**
     * Unsets the "identifier" element
     */
    void unsetIdentifier();

    /**
     * Gets a List of "Rule_hasPrecondition_ConditionalControlLogic" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Rule.RuleHasPreconditionConditionalControlLogic> getRuleHasPreconditionConditionalControlLogicList();

    /**
     * Gets array of all "Rule_hasPrecondition_ConditionalControlLogic" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Rule.RuleHasPreconditionConditionalControlLogic[] getRuleHasPreconditionConditionalControlLogicArray();

    /**
     * Gets ith "Rule_hasPrecondition_ConditionalControlLogic" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Rule.RuleHasPreconditionConditionalControlLogic getRuleHasPreconditionConditionalControlLogicArray(int i);

    /**
     * Returns number of "Rule_hasPrecondition_ConditionalControlLogic" element
     */
    int sizeOfRuleHasPreconditionConditionalControlLogicArray();

    /**
     * Sets array of all "Rule_hasPrecondition_ConditionalControlLogic" element
     */
    void setRuleHasPreconditionConditionalControlLogicArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Rule.RuleHasPreconditionConditionalControlLogic[] ruleHasPreconditionConditionalControlLogicArray);

    /**
     * Sets ith "Rule_hasPrecondition_ConditionalControlLogic" element
     */
    void setRuleHasPreconditionConditionalControlLogicArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Rule.RuleHasPreconditionConditionalControlLogic ruleHasPreconditionConditionalControlLogic);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Rule_hasPrecondition_ConditionalControlLogic" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Rule.RuleHasPreconditionConditionalControlLogic insertNewRuleHasPreconditionConditionalControlLogic(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Rule_hasPrecondition_ConditionalControlLogic" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Rule.RuleHasPreconditionConditionalControlLogic addNewRuleHasPreconditionConditionalControlLogic();

    /**
     * Removes the ith "Rule_hasPrecondition_ConditionalControlLogic" element
     */
    void removeRuleHasPreconditionConditionalControlLogic(int i);

    /**
     * An XML Rule_hasPrecondition_ConditionalControlLogic(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface RuleHasPreconditionConditionalControlLogic extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Rule.RuleHasPreconditionConditionalControlLogic> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "rulehaspreconditionconditionalcontrollogic2327elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * Gets the "isAssociationReference" attribute
         */
        boolean getIsAssociationReference();

        /**
         * Gets (as xml) the "isAssociationReference" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetIsAssociationReference();

        /**
         * True if has "isAssociationReference" attribute
         */
        boolean isSetIsAssociationReference();

        /**
         * Sets the "isAssociationReference" attribute
         */
        void setIsAssociationReference(boolean isAssociationReference);

        /**
         * Sets (as xml) the "isAssociationReference" attribute
         */
        void xsetIsAssociationReference(org.apache.xmlbeans.XmlBoolean isAssociationReference);

        /**
         * Unsets the "isAssociationReference" attribute
         */
        void unsetIsAssociationReference();

        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.Rule$RuleHasPreconditionConditionalControlLogic$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Rule.RuleHasPreconditionConditionalControlLogic.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "validtype3669elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum CONDITIONAL_CONTROL_LOGIC = Enum.forString("ConditionalControlLogic");

            int INT_CONDITIONAL_CONTROL_LOGIC = Enum.INT_CONDITIONAL_CONTROL_LOGIC;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.Rule$RuleHasPreconditionConditionalControlLogic$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_CONDITIONAL_CONTROL_LOGIC
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

                static final int INT_CONDITIONAL_CONTROL_LOGIC = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("ConditionalControlLogic", INT_CONDITIONAL_CONTROL_LOGIC),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }
}
