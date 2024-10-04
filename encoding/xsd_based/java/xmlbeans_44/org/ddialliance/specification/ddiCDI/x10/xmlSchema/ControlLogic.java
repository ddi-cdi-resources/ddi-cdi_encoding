/*
 * XML Type:  ControlLogic
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ControlLogic(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface ControlLogic extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "controllogicb2dftype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "description" element
     */
    java.lang.String getDescription();

    /**
     * Gets (as xml) the "description" element
     */
    org.apache.xmlbeans.XmlString xgetDescription();

    /**
     * True if has "description" element
     */
    boolean isSetDescription();

    /**
     * Sets the "description" element
     */
    void setDescription(java.lang.String description);

    /**
     * Sets (as xml) the "description" element
     */
    void xsetDescription(org.apache.xmlbeans.XmlString description);

    /**
     * Unsets the "description" element
     */
    void unsetDescription();

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
     * Gets the "workflow" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getWorkflow();

    /**
     * True if has "workflow" element
     */
    boolean isSetWorkflow();

    /**
     * Sets the "workflow" element
     */
    void setWorkflow(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry workflow);

    /**
     * Appends and returns a new empty "workflow" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewWorkflow();

    /**
     * Unsets the "workflow" element
     */
    void unsetWorkflow();

    /**
     * Gets a List of "ControlLogic_informs_ProcessingAgent" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicInformsProcessingAgent> getControlLogicInformsProcessingAgentList();

    /**
     * Gets array of all "ControlLogic_informs_ProcessingAgent" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicInformsProcessingAgent[] getControlLogicInformsProcessingAgentArray();

    /**
     * Gets ith "ControlLogic_informs_ProcessingAgent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicInformsProcessingAgent getControlLogicInformsProcessingAgentArray(int i);

    /**
     * Returns number of "ControlLogic_informs_ProcessingAgent" element
     */
    int sizeOfControlLogicInformsProcessingAgentArray();

    /**
     * Sets array of all "ControlLogic_informs_ProcessingAgent" element
     */
    void setControlLogicInformsProcessingAgentArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicInformsProcessingAgent[] controlLogicInformsProcessingAgentArray);

    /**
     * Sets ith "ControlLogic_informs_ProcessingAgent" element
     */
    void setControlLogicInformsProcessingAgentArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicInformsProcessingAgent controlLogicInformsProcessingAgent);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ControlLogic_informs_ProcessingAgent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicInformsProcessingAgent insertNewControlLogicInformsProcessingAgent(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ControlLogic_informs_ProcessingAgent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicInformsProcessingAgent addNewControlLogicInformsProcessingAgent();

    /**
     * Removes the ith "ControlLogic_informs_ProcessingAgent" element
     */
    void removeControlLogicInformsProcessingAgent(int i);

    /**
     * Gets a List of "ControlLogic_invokes_Activity" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicInvokesActivity> getControlLogicInvokesActivityList();

    /**
     * Gets array of all "ControlLogic_invokes_Activity" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicInvokesActivity[] getControlLogicInvokesActivityArray();

    /**
     * Gets ith "ControlLogic_invokes_Activity" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicInvokesActivity getControlLogicInvokesActivityArray(int i);

    /**
     * Returns number of "ControlLogic_invokes_Activity" element
     */
    int sizeOfControlLogicInvokesActivityArray();

    /**
     * Sets array of all "ControlLogic_invokes_Activity" element
     */
    void setControlLogicInvokesActivityArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicInvokesActivity[] controlLogicInvokesActivityArray);

    /**
     * Sets ith "ControlLogic_invokes_Activity" element
     */
    void setControlLogicInvokesActivityArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicInvokesActivity controlLogicInvokesActivity);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ControlLogic_invokes_Activity" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicInvokesActivity insertNewControlLogicInvokesActivity(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ControlLogic_invokes_Activity" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicInvokesActivity addNewControlLogicInvokesActivity();

    /**
     * Removes the ith "ControlLogic_invokes_Activity" element
     */
    void removeControlLogicInvokesActivity(int i);

    /**
     * Gets a List of "ControlLogic_hasSubControlLogic_ControlLogic" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicHasSubControlLogicControlLogic> getControlLogicHasSubControlLogicControlLogicList();

    /**
     * Gets array of all "ControlLogic_hasSubControlLogic_ControlLogic" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicHasSubControlLogicControlLogic[] getControlLogicHasSubControlLogicControlLogicArray();

    /**
     * Gets ith "ControlLogic_hasSubControlLogic_ControlLogic" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicHasSubControlLogicControlLogic getControlLogicHasSubControlLogicControlLogicArray(int i);

    /**
     * Returns number of "ControlLogic_hasSubControlLogic_ControlLogic" element
     */
    int sizeOfControlLogicHasSubControlLogicControlLogicArray();

    /**
     * Sets array of all "ControlLogic_hasSubControlLogic_ControlLogic" element
     */
    void setControlLogicHasSubControlLogicControlLogicArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicHasSubControlLogicControlLogic[] controlLogicHasSubControlLogicControlLogicArray);

    /**
     * Sets ith "ControlLogic_hasSubControlLogic_ControlLogic" element
     */
    void setControlLogicHasSubControlLogicControlLogicArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicHasSubControlLogicControlLogic controlLogicHasSubControlLogicControlLogic);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ControlLogic_hasSubControlLogic_ControlLogic" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicHasSubControlLogicControlLogic insertNewControlLogicHasSubControlLogicControlLogic(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ControlLogic_hasSubControlLogic_ControlLogic" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicHasSubControlLogicControlLogic addNewControlLogicHasSubControlLogicControlLogic();

    /**
     * Removes the ith "ControlLogic_hasSubControlLogic_ControlLogic" element
     */
    void removeControlLogicHasSubControlLogicControlLogic(int i);

    /**
     * Gets a List of "ControlLogic_has_InformationFlowDefinition" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicHasInformationFlowDefinition> getControlLogicHasInformationFlowDefinitionList();

    /**
     * Gets array of all "ControlLogic_has_InformationFlowDefinition" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicHasInformationFlowDefinition[] getControlLogicHasInformationFlowDefinitionArray();

    /**
     * Gets ith "ControlLogic_has_InformationFlowDefinition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicHasInformationFlowDefinition getControlLogicHasInformationFlowDefinitionArray(int i);

    /**
     * Returns number of "ControlLogic_has_InformationFlowDefinition" element
     */
    int sizeOfControlLogicHasInformationFlowDefinitionArray();

    /**
     * Sets array of all "ControlLogic_has_InformationFlowDefinition" element
     */
    void setControlLogicHasInformationFlowDefinitionArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicHasInformationFlowDefinition[] controlLogicHasInformationFlowDefinitionArray);

    /**
     * Sets ith "ControlLogic_has_InformationFlowDefinition" element
     */
    void setControlLogicHasInformationFlowDefinitionArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicHasInformationFlowDefinition controlLogicHasInformationFlowDefinition);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ControlLogic_has_InformationFlowDefinition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicHasInformationFlowDefinition insertNewControlLogicHasInformationFlowDefinition(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ControlLogic_has_InformationFlowDefinition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicHasInformationFlowDefinition addNewControlLogicHasInformationFlowDefinition();

    /**
     * Removes the ith "ControlLogic_has_InformationFlowDefinition" element
     */
    void removeControlLogicHasInformationFlowDefinition(int i);

    /**
     * An XML ControlLogic_informs_ProcessingAgent(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface ControlLogicInformsProcessingAgent extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicInformsProcessingAgent> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "controllogicinformsprocessingagentc204elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic$ControlLogicInformsProcessingAgent$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicInformsProcessingAgent.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "validtyped546elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum CURATOR = Enum.forString("Curator");
            Enum PROCESSING_AGENT = Enum.forString("ProcessingAgent");
            Enum SERVICE = Enum.forString("Service");

            int INT_CURATOR = Enum.INT_CURATOR;
            int INT_PROCESSING_AGENT = Enum.INT_PROCESSING_AGENT;
            int INT_SERVICE = Enum.INT_SERVICE;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic$ControlLogicInformsProcessingAgent$ValidType.
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
                static final int INT_PROCESSING_AGENT = 2;
                static final int INT_SERVICE = 3;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("Curator", INT_CURATOR),
                    new Enum("ProcessingAgent", INT_PROCESSING_AGENT),
                    new Enum("Service", INT_SERVICE),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }

    /**
     * An XML ControlLogic_invokes_Activity(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface ControlLogicInvokesActivity extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicInvokesActivity> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "controllogicinvokesactivity6402elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic$ControlLogicInvokesActivity$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicInvokesActivity.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "validtype9700elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum ACTIVITY = Enum.forString("Activity");
            Enum STEP = Enum.forString("Step");

            int INT_ACTIVITY = Enum.INT_ACTIVITY;
            int INT_STEP = Enum.INT_STEP;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic$ControlLogicInvokesActivity$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_ACTIVITY
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

                static final int INT_ACTIVITY = 1;
                static final int INT_STEP = 2;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("Activity", INT_ACTIVITY),
                    new Enum("Step", INT_STEP),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }

    /**
     * An XML ControlLogic_hasSubControlLogic_ControlLogic(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface ControlLogicHasSubControlLogicControlLogic extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicHasSubControlLogicControlLogic> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "controllogichassubcontrollogiccontrollogica908elemtype");
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic$ControlLogicHasSubControlLogicControlLogic$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicHasSubControlLogicControlLogic.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "validtype5a4aelemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum ALLEN_INTERVAL_ALGEBRA = Enum.forString("AllenIntervalAlgebra");
            Enum CONDITIONAL_CONTROL_LOGIC = Enum.forString("ConditionalControlLogic");
            Enum CONTROL_LOGIC = Enum.forString("ControlLogic");
            Enum DETERMINISTIC_IMPERATIVE = Enum.forString("DeterministicImperative");
            Enum NON_DETERMINISTIC_DECLARATIVE = Enum.forString("NonDeterministicDeclarative");
            Enum RULE_BASED_SCHEDULING = Enum.forString("RuleBasedScheduling");
            Enum SEQUENCE = Enum.forString("Sequence");
            Enum TEMPORAL_CONSTRAINTS = Enum.forString("TemporalConstraints");
            Enum TEMPORAL_CONTROL_CONSTRUCT = Enum.forString("TemporalControlConstruct");

            int INT_ALLEN_INTERVAL_ALGEBRA = Enum.INT_ALLEN_INTERVAL_ALGEBRA;
            int INT_CONDITIONAL_CONTROL_LOGIC = Enum.INT_CONDITIONAL_CONTROL_LOGIC;
            int INT_CONTROL_LOGIC = Enum.INT_CONTROL_LOGIC;
            int INT_DETERMINISTIC_IMPERATIVE = Enum.INT_DETERMINISTIC_IMPERATIVE;
            int INT_NON_DETERMINISTIC_DECLARATIVE = Enum.INT_NON_DETERMINISTIC_DECLARATIVE;
            int INT_RULE_BASED_SCHEDULING = Enum.INT_RULE_BASED_SCHEDULING;
            int INT_SEQUENCE = Enum.INT_SEQUENCE;
            int INT_TEMPORAL_CONSTRAINTS = Enum.INT_TEMPORAL_CONSTRAINTS;
            int INT_TEMPORAL_CONTROL_CONSTRUCT = Enum.INT_TEMPORAL_CONTROL_CONSTRUCT;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic$ControlLogicHasSubControlLogicControlLogic$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_ALLEN_INTERVAL_ALGEBRA
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

                static final int INT_ALLEN_INTERVAL_ALGEBRA = 1;
                static final int INT_CONDITIONAL_CONTROL_LOGIC = 2;
                static final int INT_CONTROL_LOGIC = 3;
                static final int INT_DETERMINISTIC_IMPERATIVE = 4;
                static final int INT_NON_DETERMINISTIC_DECLARATIVE = 5;
                static final int INT_RULE_BASED_SCHEDULING = 6;
                static final int INT_SEQUENCE = 7;
                static final int INT_TEMPORAL_CONSTRAINTS = 8;
                static final int INT_TEMPORAL_CONTROL_CONSTRUCT = 9;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("AllenIntervalAlgebra", INT_ALLEN_INTERVAL_ALGEBRA),
                    new Enum("ConditionalControlLogic", INT_CONDITIONAL_CONTROL_LOGIC),
                    new Enum("ControlLogic", INT_CONTROL_LOGIC),
                    new Enum("DeterministicImperative", INT_DETERMINISTIC_IMPERATIVE),
                    new Enum("NonDeterministicDeclarative", INT_NON_DETERMINISTIC_DECLARATIVE),
                    new Enum("RuleBasedScheduling", INT_RULE_BASED_SCHEDULING),
                    new Enum("Sequence", INT_SEQUENCE),
                    new Enum("TemporalConstraints", INT_TEMPORAL_CONSTRAINTS),
                    new Enum("TemporalControlConstruct", INT_TEMPORAL_CONTROL_CONSTRUCT),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }

    /**
     * An XML ControlLogic_has_InformationFlowDefinition(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface ControlLogicHasInformationFlowDefinition extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicHasInformationFlowDefinition> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "controllogichasinformationflowdefinition9839elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic$ControlLogicHasInformationFlowDefinition$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicHasInformationFlowDefinition.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "validtypeb1fbelemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum INFORMATION_FLOW_DEFINITION = Enum.forString("InformationFlowDefinition");

            int INT_INFORMATION_FLOW_DEFINITION = Enum.INT_INFORMATION_FLOW_DEFINITION;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic$ControlLogicHasInformationFlowDefinition$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_INFORMATION_FLOW_DEFINITION
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

                static final int INT_INFORMATION_FLOW_DEFINITION = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("InformationFlowDefinition", INT_INFORMATION_FLOW_DEFINITION),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }
}
