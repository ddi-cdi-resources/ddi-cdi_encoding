/*
 * XML Type:  RuleBasedScheduling
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleBasedScheduling
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML RuleBasedScheduling(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface RuleBasedScheduling extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDeterministicDeclarative {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleBasedScheduling> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "rulebasedscheduling2fb7type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "schedulingType" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.SchedulingStrategy.Enum getSchedulingType();

    /**
     * Gets (as xml) the "schedulingType" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.SchedulingStrategy xgetSchedulingType();

    /**
     * Sets the "schedulingType" element
     */
    void setSchedulingType(org.ddialliance.specification.ddiCDI.x10.xmlSchema.SchedulingStrategy.Enum schedulingType);

    /**
     * Sets (as xml) the "schedulingType" element
     */
    void xsetSchedulingType(org.ddialliance.specification.ddiCDI.x10.xmlSchema.SchedulingStrategy schedulingType);

    /**
     * Gets a List of "RuleBasedScheduling_has_RuleSet" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleBasedScheduling.RuleBasedSchedulingHasRuleSet> getRuleBasedSchedulingHasRuleSetList();

    /**
     * Gets array of all "RuleBasedScheduling_has_RuleSet" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleBasedScheduling.RuleBasedSchedulingHasRuleSet[] getRuleBasedSchedulingHasRuleSetArray();

    /**
     * Gets ith "RuleBasedScheduling_has_RuleSet" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleBasedScheduling.RuleBasedSchedulingHasRuleSet getRuleBasedSchedulingHasRuleSetArray(int i);

    /**
     * Returns number of "RuleBasedScheduling_has_RuleSet" element
     */
    int sizeOfRuleBasedSchedulingHasRuleSetArray();

    /**
     * Sets array of all "RuleBasedScheduling_has_RuleSet" element
     */
    void setRuleBasedSchedulingHasRuleSetArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleBasedScheduling.RuleBasedSchedulingHasRuleSet[] ruleBasedSchedulingHasRuleSetArray);

    /**
     * Sets ith "RuleBasedScheduling_has_RuleSet" element
     */
    void setRuleBasedSchedulingHasRuleSetArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleBasedScheduling.RuleBasedSchedulingHasRuleSet ruleBasedSchedulingHasRuleSet);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "RuleBasedScheduling_has_RuleSet" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleBasedScheduling.RuleBasedSchedulingHasRuleSet insertNewRuleBasedSchedulingHasRuleSet(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "RuleBasedScheduling_has_RuleSet" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleBasedScheduling.RuleBasedSchedulingHasRuleSet addNewRuleBasedSchedulingHasRuleSet();

    /**
     * Removes the ith "RuleBasedScheduling_has_RuleSet" element
     */
    void removeRuleBasedSchedulingHasRuleSet(int i);

    /**
     * Gets a List of "RuleBasedScheduling_has_Curator" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleBasedScheduling.RuleBasedSchedulingHasCurator> getRuleBasedSchedulingHasCuratorList();

    /**
     * Gets array of all "RuleBasedScheduling_has_Curator" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleBasedScheduling.RuleBasedSchedulingHasCurator[] getRuleBasedSchedulingHasCuratorArray();

    /**
     * Gets ith "RuleBasedScheduling_has_Curator" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleBasedScheduling.RuleBasedSchedulingHasCurator getRuleBasedSchedulingHasCuratorArray(int i);

    /**
     * Returns number of "RuleBasedScheduling_has_Curator" element
     */
    int sizeOfRuleBasedSchedulingHasCuratorArray();

    /**
     * Sets array of all "RuleBasedScheduling_has_Curator" element
     */
    void setRuleBasedSchedulingHasCuratorArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleBasedScheduling.RuleBasedSchedulingHasCurator[] ruleBasedSchedulingHasCuratorArray);

    /**
     * Sets ith "RuleBasedScheduling_has_Curator" element
     */
    void setRuleBasedSchedulingHasCuratorArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleBasedScheduling.RuleBasedSchedulingHasCurator ruleBasedSchedulingHasCurator);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "RuleBasedScheduling_has_Curator" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleBasedScheduling.RuleBasedSchedulingHasCurator insertNewRuleBasedSchedulingHasCurator(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "RuleBasedScheduling_has_Curator" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleBasedScheduling.RuleBasedSchedulingHasCurator addNewRuleBasedSchedulingHasCurator();

    /**
     * Removes the ith "RuleBasedScheduling_has_Curator" element
     */
    void removeRuleBasedSchedulingHasCurator(int i);

    /**
     * An XML RuleBasedScheduling_has_RuleSet(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface RuleBasedSchedulingHasRuleSet extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleBasedScheduling.RuleBasedSchedulingHasRuleSet> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "rulebasedschedulinghasruleseta390elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * Gets a List of "validType" elements
         */
        java.util.List<java.lang.String> getValidTypeList();

        /**
         * Gets array of all "validType" elements
         */
        java.lang.String[] getValidTypeArray();

        /**
         * Gets ith "validType" element
         */
        java.lang.String getValidTypeArray(int i);

        /**
         * Gets (as xml) a List of "validType" elements
         */
        java.util.List<org.apache.xmlbeans.XmlString> xgetValidTypeList();

        /**
         * Gets (as xml) array of all "validType" elements
         */
        org.apache.xmlbeans.XmlString[] xgetValidTypeArray();

        /**
         * Gets (as xml) ith "validType" element
         */
        org.apache.xmlbeans.XmlString xgetValidTypeArray(int i);

        /**
         * Returns number of "validType" element
         */
        int sizeOfValidTypeArray();

        /**
         * Sets array of all "validType" element
         */
        void setValidTypeArray(java.lang.String[] validTypeArray);

        /**
         * Sets ith "validType" element
         */
        void setValidTypeArray(int i, java.lang.String validType);

        /**
         * Sets (as xml) array of all "validType" element
         */
        void xsetValidTypeArray(org.apache.xmlbeans.XmlString[] validTypeArray);

        /**
         * Sets (as xml) ith "validType" element
         */
        void xsetValidTypeArray(int i, org.apache.xmlbeans.XmlString validType);

        /**
         * Inserts the value as the ith "validType" element
         */
        void insertValidType(int i, java.lang.String validType);

        /**
         * Appends the value as the last "validType" element
         */
        void addValidType(java.lang.String validType);

        /**
         * Inserts and returns a new empty value (as xml) as the ith "validType" element
         */
        org.apache.xmlbeans.XmlString insertNewValidType(int i);

        /**
         * Appends and returns a new empty value (as xml) as the last "validType" element
         */
        org.apache.xmlbeans.XmlString addNewValidType();

        /**
         * Removes the ith "validType" element
         */
        void removeValidType(int i);

        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleBasedScheduling$RuleBasedSchedulingHasRuleSet$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleBasedScheduling.RuleBasedSchedulingHasRuleSet.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "validtypeee52elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum RULE_SET = Enum.forString("RuleSet");

            int INT_RULE_SET = Enum.INT_RULE_SET;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleBasedScheduling$RuleBasedSchedulingHasRuleSet$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_RULE_SET
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

                static final int INT_RULE_SET = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("RuleSet", INT_RULE_SET),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }

    /**
     * An XML RuleBasedScheduling_has_Curator(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface RuleBasedSchedulingHasCurator extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleBasedScheduling.RuleBasedSchedulingHasCurator> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "rulebasedschedulinghascurator8f60elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * Gets a List of "validType" elements
         */
        java.util.List<java.lang.String> getValidTypeList();

        /**
         * Gets array of all "validType" elements
         */
        java.lang.String[] getValidTypeArray();

        /**
         * Gets ith "validType" element
         */
        java.lang.String getValidTypeArray(int i);

        /**
         * Gets (as xml) a List of "validType" elements
         */
        java.util.List<org.apache.xmlbeans.XmlString> xgetValidTypeList();

        /**
         * Gets (as xml) array of all "validType" elements
         */
        org.apache.xmlbeans.XmlString[] xgetValidTypeArray();

        /**
         * Gets (as xml) ith "validType" element
         */
        org.apache.xmlbeans.XmlString xgetValidTypeArray(int i);

        /**
         * Returns number of "validType" element
         */
        int sizeOfValidTypeArray();

        /**
         * Sets array of all "validType" element
         */
        void setValidTypeArray(java.lang.String[] validTypeArray);

        /**
         * Sets ith "validType" element
         */
        void setValidTypeArray(int i, java.lang.String validType);

        /**
         * Sets (as xml) array of all "validType" element
         */
        void xsetValidTypeArray(org.apache.xmlbeans.XmlString[] validTypeArray);

        /**
         * Sets (as xml) ith "validType" element
         */
        void xsetValidTypeArray(int i, org.apache.xmlbeans.XmlString validType);

        /**
         * Inserts the value as the ith "validType" element
         */
        void insertValidType(int i, java.lang.String validType);

        /**
         * Appends the value as the last "validType" element
         */
        void addValidType(java.lang.String validType);

        /**
         * Inserts and returns a new empty value (as xml) as the ith "validType" element
         */
        org.apache.xmlbeans.XmlString insertNewValidType(int i);

        /**
         * Appends and returns a new empty value (as xml) as the last "validType" element
         */
        org.apache.xmlbeans.XmlString addNewValidType();

        /**
         * Removes the ith "validType" element
         */
        void removeValidType(int i);

        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleBasedScheduling$RuleBasedSchedulingHasCurator$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleBasedScheduling.RuleBasedSchedulingHasCurator.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "validtypeda22elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum CURATOR = Enum.forString("Curator");

            int INT_CURATOR = Enum.INT_CURATOR;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleBasedScheduling$RuleBasedSchedulingHasCurator$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_CURATOR
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

                static final int INT_CURATOR = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("Curator", INT_CURATOR),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }
}
