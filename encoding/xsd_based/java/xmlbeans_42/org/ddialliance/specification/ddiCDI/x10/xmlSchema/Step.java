/*
 * XML Type:  Step
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML Step(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface Step extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "step2c2atype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "script" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandCode getScript();

    /**
     * True if has "script" element
     */
    boolean isSetScript();

    /**
     * Sets the "script" element
     */
    void setScript(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandCode script);

    /**
     * Appends and returns a new empty "script" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandCode addNewScript();

    /**
     * Unsets the "script" element
     */
    void unsetScript();

    /**
     * Gets the "scriptingLanguage" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getScriptingLanguage();

    /**
     * True if has "scriptingLanguage" element
     */
    boolean isSetScriptingLanguage();

    /**
     * Sets the "scriptingLanguage" element
     */
    void setScriptingLanguage(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry scriptingLanguage);

    /**
     * Appends and returns a new empty "scriptingLanguage" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewScriptingLanguage();

    /**
     * Unsets the "scriptingLanguage" element
     */
    void unsetScriptingLanguage();

    /**
     * Gets a List of "Step_produces_Parameter" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepProducesParameter> getStepProducesParameterList();

    /**
     * Gets array of all "Step_produces_Parameter" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepProducesParameter[] getStepProducesParameterArray();

    /**
     * Gets ith "Step_produces_Parameter" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepProducesParameter getStepProducesParameterArray(int i);

    /**
     * Returns number of "Step_produces_Parameter" element
     */
    int sizeOfStepProducesParameterArray();

    /**
     * Sets array of all "Step_produces_Parameter" element
     */
    void setStepProducesParameterArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepProducesParameter[] stepProducesParameterArray);

    /**
     * Sets ith "Step_produces_Parameter" element
     */
    void setStepProducesParameterArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepProducesParameter stepProducesParameter);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Step_produces_Parameter" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepProducesParameter insertNewStepProducesParameter(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Step_produces_Parameter" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepProducesParameter addNewStepProducesParameter();

    /**
     * Removes the ith "Step_produces_Parameter" element
     */
    void removeStepProducesParameter(int i);

    /**
     * Gets a List of "Step_receives_Parameter" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepReceivesParameter> getStepReceivesParameterList();

    /**
     * Gets array of all "Step_receives_Parameter" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepReceivesParameter[] getStepReceivesParameterArray();

    /**
     * Gets ith "Step_receives_Parameter" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepReceivesParameter getStepReceivesParameterArray(int i);

    /**
     * Returns number of "Step_receives_Parameter" element
     */
    int sizeOfStepReceivesParameterArray();

    /**
     * Sets array of all "Step_receives_Parameter" element
     */
    void setStepReceivesParameterArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepReceivesParameter[] stepReceivesParameterArray);

    /**
     * Sets ith "Step_receives_Parameter" element
     */
    void setStepReceivesParameterArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepReceivesParameter stepReceivesParameter);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Step_receives_Parameter" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepReceivesParameter insertNewStepReceivesParameter(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Step_receives_Parameter" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepReceivesParameter addNewStepReceivesParameter();

    /**
     * Removes the ith "Step_receives_Parameter" element
     */
    void removeStepReceivesParameter(int i);

    /**
     * Gets a List of "Step_hasSubStep_Step" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepHasSubStepStep> getStepHasSubStepStepList();

    /**
     * Gets array of all "Step_hasSubStep_Step" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepHasSubStepStep[] getStepHasSubStepStepArray();

    /**
     * Gets ith "Step_hasSubStep_Step" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepHasSubStepStep getStepHasSubStepStepArray(int i);

    /**
     * Returns number of "Step_hasSubStep_Step" element
     */
    int sizeOfStepHasSubStepStepArray();

    /**
     * Sets array of all "Step_hasSubStep_Step" element
     */
    void setStepHasSubStepStepArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepHasSubStepStep[] stepHasSubStepStepArray);

    /**
     * Sets ith "Step_hasSubStep_Step" element
     */
    void setStepHasSubStepStepArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepHasSubStepStep stepHasSubStepStep);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Step_hasSubStep_Step" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepHasSubStepStep insertNewStepHasSubStepStep(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Step_hasSubStep_Step" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepHasSubStepStep addNewStepHasSubStepStep();

    /**
     * Removes the ith "Step_hasSubStep_Step" element
     */
    void removeStepHasSubStepStep(int i);

    /**
     * An XML Step_produces_Parameter(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface StepProducesParameter extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepProducesParameter> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "stepproducesparameterb02eelemtype");
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step$StepProducesParameter$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepProducesParameter.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "validtyped7acelemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum PARAMETER = Enum.forString("Parameter");

            int INT_PARAMETER = Enum.INT_PARAMETER;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step$StepProducesParameter$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_PARAMETER
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

                static final int INT_PARAMETER = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("Parameter", INT_PARAMETER),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }

    /**
     * An XML Step_receives_Parameter(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface StepReceivesParameter extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepReceivesParameter> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "stepreceivesparameter7cf1elemtype");
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step$StepReceivesParameter$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepReceivesParameter.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "validtypea46felemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum PARAMETER = Enum.forString("Parameter");

            int INT_PARAMETER = Enum.INT_PARAMETER;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step$StepReceivesParameter$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_PARAMETER
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

                static final int INT_PARAMETER = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("Parameter", INT_PARAMETER),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }

    /**
     * An XML Step_hasSubStep_Step(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface StepHasSubStepStep extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepHasSubStepStep> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "stephassubstepstepc5c8elemtype");
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step$StepHasSubStepStep$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepHasSubStepStep.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "validtypeff0aelemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum STEP = Enum.forString("Step");

            int INT_STEP = Enum.INT_STEP;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step$StepHasSubStepStep$ValidType.
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
