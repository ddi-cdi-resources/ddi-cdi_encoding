/*
 * XML Type:  Activity
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML Activity(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface Activity extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "activityad6dtype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "definition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getDefinition();

    /**
     * True if has "definition" element
     */
    boolean isSetDefinition();

    /**
     * Sets the "definition" element
     */
    void setDefinition(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString definition);

    /**
     * Appends and returns a new empty "definition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewDefinition();

    /**
     * Unsets the "definition" element
     */
    void unsetDefinition();

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
     * Gets a List of "displayLabel" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay> getDisplayLabelList();

    /**
     * Gets array of all "displayLabel" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay[] getDisplayLabelArray();

    /**
     * Gets ith "displayLabel" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay getDisplayLabelArray(int i);

    /**
     * Returns number of "displayLabel" element
     */
    int sizeOfDisplayLabelArray();

    /**
     * Sets array of all "displayLabel" element
     */
    void setDisplayLabelArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay[] displayLabelArray);

    /**
     * Sets ith "displayLabel" element
     */
    void setDisplayLabelArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay displayLabel);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "displayLabel" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay insertNewDisplayLabel(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "displayLabel" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay addNewDisplayLabel();

    /**
     * Removes the ith "displayLabel" element
     */
    void removeDisplayLabel(int i);

    /**
     * Gets a List of "entityProduced" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference> getEntityProducedList();

    /**
     * Gets array of all "entityProduced" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference[] getEntityProducedArray();

    /**
     * Gets ith "entityProduced" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference getEntityProducedArray(int i);

    /**
     * Returns number of "entityProduced" element
     */
    int sizeOfEntityProducedArray();

    /**
     * Sets array of all "entityProduced" element
     */
    void setEntityProducedArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference[] entityProducedArray);

    /**
     * Sets ith "entityProduced" element
     */
    void setEntityProducedArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference entityProduced);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "entityProduced" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference insertNewEntityProduced(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "entityProduced" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference addNewEntityProduced();

    /**
     * Removes the ith "entityProduced" element
     */
    void removeEntityProduced(int i);

    /**
     * Gets a List of "entityUsed" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference> getEntityUsedList();

    /**
     * Gets array of all "entityUsed" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference[] getEntityUsedArray();

    /**
     * Gets ith "entityUsed" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference getEntityUsedArray(int i);

    /**
     * Returns number of "entityUsed" element
     */
    int sizeOfEntityUsedArray();

    /**
     * Sets array of all "entityUsed" element
     */
    void setEntityUsedArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference[] entityUsedArray);

    /**
     * Sets ith "entityUsed" element
     */
    void setEntityUsedArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference entityUsed);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "entityUsed" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference insertNewEntityUsed(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "entityUsed" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference addNewEntityUsed();

    /**
     * Removes the ith "entityUsed" element
     */
    void removeEntityUsed(int i);

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
     * Gets a List of "name" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName> getNameList();

    /**
     * Gets array of all "name" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName[] getNameArray();

    /**
     * Gets ith "name" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName getNameArray(int i);

    /**
     * Returns number of "name" element
     */
    int sizeOfNameArray();

    /**
     * Sets array of all "name" element
     */
    void setNameArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName[] nameArray);

    /**
     * Sets ith "name" element
     */
    void setNameArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName name);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "name" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName insertNewName(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "name" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName addNewName();

    /**
     * Removes the ith "name" element
     */
    void removeName(int i);

    /**
     * Gets a List of "standardModelMapping" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference> getStandardModelMappingList();

    /**
     * Gets array of all "standardModelMapping" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference[] getStandardModelMappingArray();

    /**
     * Gets ith "standardModelMapping" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference getStandardModelMappingArray(int i);

    /**
     * Returns number of "standardModelMapping" element
     */
    int sizeOfStandardModelMappingArray();

    /**
     * Sets array of all "standardModelMapping" element
     */
    void setStandardModelMappingArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference[] standardModelMappingArray);

    /**
     * Sets ith "standardModelMapping" element
     */
    void setStandardModelMappingArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference standardModelMapping);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "standardModelMapping" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference insertNewStandardModelMapping(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "standardModelMapping" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference addNewStandardModelMapping();

    /**
     * Removes the ith "standardModelMapping" element
     */
    void removeStandardModelMapping(int i);

    /**
     * Gets a List of "Activity_hasInternal_ControlLogic" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasInternalControlLogic> getActivityHasInternalControlLogicList();

    /**
     * Gets array of all "Activity_hasInternal_ControlLogic" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasInternalControlLogic[] getActivityHasInternalControlLogicArray();

    /**
     * Gets ith "Activity_hasInternal_ControlLogic" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasInternalControlLogic getActivityHasInternalControlLogicArray(int i);

    /**
     * Returns number of "Activity_hasInternal_ControlLogic" element
     */
    int sizeOfActivityHasInternalControlLogicArray();

    /**
     * Sets array of all "Activity_hasInternal_ControlLogic" element
     */
    void setActivityHasInternalControlLogicArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasInternalControlLogic[] activityHasInternalControlLogicArray);

    /**
     * Sets ith "Activity_hasInternal_ControlLogic" element
     */
    void setActivityHasInternalControlLogicArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasInternalControlLogic activityHasInternalControlLogic);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Activity_hasInternal_ControlLogic" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasInternalControlLogic insertNewActivityHasInternalControlLogic(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Activity_hasInternal_ControlLogic" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasInternalControlLogic addNewActivityHasInternalControlLogic();

    /**
     * Removes the ith "Activity_hasInternal_ControlLogic" element
     */
    void removeActivityHasInternalControlLogic(int i);

    /**
     * Gets a List of "Activity_hasSubActivity_Activity" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasSubActivityActivity> getActivityHasSubActivityActivityList();

    /**
     * Gets array of all "Activity_hasSubActivity_Activity" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasSubActivityActivity[] getActivityHasSubActivityActivityArray();

    /**
     * Gets ith "Activity_hasSubActivity_Activity" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasSubActivityActivity getActivityHasSubActivityActivityArray(int i);

    /**
     * Returns number of "Activity_hasSubActivity_Activity" element
     */
    int sizeOfActivityHasSubActivityActivityArray();

    /**
     * Sets array of all "Activity_hasSubActivity_Activity" element
     */
    void setActivityHasSubActivityActivityArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasSubActivityActivity[] activityHasSubActivityActivityArray);

    /**
     * Sets ith "Activity_hasSubActivity_Activity" element
     */
    void setActivityHasSubActivityActivityArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasSubActivityActivity activityHasSubActivityActivity);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Activity_hasSubActivity_Activity" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasSubActivityActivity insertNewActivityHasSubActivityActivity(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Activity_hasSubActivity_Activity" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasSubActivityActivity addNewActivityHasSubActivityActivity();

    /**
     * Removes the ith "Activity_hasSubActivity_Activity" element
     */
    void removeActivityHasSubActivityActivity(int i);

    /**
     * Gets a List of "Activity_has_Step" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasStep> getActivityHasStepList();

    /**
     * Gets array of all "Activity_has_Step" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasStep[] getActivityHasStepArray();

    /**
     * Gets ith "Activity_has_Step" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasStep getActivityHasStepArray(int i);

    /**
     * Returns number of "Activity_has_Step" element
     */
    int sizeOfActivityHasStepArray();

    /**
     * Sets array of all "Activity_has_Step" element
     */
    void setActivityHasStepArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasStep[] activityHasStepArray);

    /**
     * Sets ith "Activity_has_Step" element
     */
    void setActivityHasStepArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasStep activityHasStep);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Activity_has_Step" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasStep insertNewActivityHasStep(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Activity_has_Step" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasStep addNewActivityHasStep();

    /**
     * Removes the ith "Activity_has_Step" element
     */
    void removeActivityHasStep(int i);

    /**
     * An XML Activity_hasInternal_ControlLogic(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface ActivityHasInternalControlLogic extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasInternalControlLogic> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "activityhasinternalcontrollogice068elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity$ActivityHasInternalControlLogic$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasInternalControlLogic.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "validtype1366elemtype");
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
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity$ActivityHasInternalControlLogic$ValidType.
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
     * An XML Activity_hasSubActivity_Activity(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface ActivityHasSubActivityActivity extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasSubActivityActivity> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "activityhassubactivityactivityd088elemtype");
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity$ActivityHasSubActivityActivity$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasSubActivityActivity.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "validtype45caelemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum ACTIVITY = Enum.forString("Activity");
            Enum STEP = Enum.forString("Step");

            int INT_ACTIVITY = Enum.INT_ACTIVITY;
            int INT_STEP = Enum.INT_STEP;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity$ActivityHasSubActivityActivity$ValidType.
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
     * An XML Activity_has_Step(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface ActivityHasStep extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasStep> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "activityhasstepf5e0elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity$ActivityHasStep$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasStep.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "validtypee4deelemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum STEP = Enum.forString("Step");

            int INT_STEP = Enum.INT_STEP;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity$ActivityHasStep$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_STEP
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

                static final int INT_STEP = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("Step", INT_STEP),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }
}
