/*
 * XML Type:  Step
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML Step(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class StepImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.ActivityImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step {
    private static final long serialVersionUID = 1L;

    public StepImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "script"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "scriptingLanguage"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "Step_produces_Parameter"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "Step_receives_Parameter"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "Step_hasSubStep_Step"),
    };


    /**
     * Gets the "script" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandCode getScript() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandCode target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandCode)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "script" element
     */
    @Override
    public boolean isSetScript() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "script" element
     */
    @Override
    public void setScript(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandCode script) {
        generatedSetterHelperImpl(script, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "script" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandCode addNewScript() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandCode target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandCode)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "script" element
     */
    @Override
    public void unsetScript() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "scriptingLanguage" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getScriptingLanguage() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "scriptingLanguage" element
     */
    @Override
    public boolean isSetScriptingLanguage() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "scriptingLanguage" element
     */
    @Override
    public void setScriptingLanguage(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry scriptingLanguage) {
        generatedSetterHelperImpl(scriptingLanguage, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "scriptingLanguage" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewScriptingLanguage() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "scriptingLanguage" element
     */
    @Override
    public void unsetScriptingLanguage() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets a List of "Step_produces_Parameter" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepProducesParameter> getStepProducesParameterList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getStepProducesParameterArray,
                this::setStepProducesParameterArray,
                this::insertNewStepProducesParameter,
                this::removeStepProducesParameter,
                this::sizeOfStepProducesParameterArray
            );
        }
    }

    /**
     * Gets array of all "Step_produces_Parameter" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepProducesParameter[] getStepProducesParameterArray() {
        return getXmlObjectArray(PROPERTY_QNAME[2], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepProducesParameter[0]);
    }

    /**
     * Gets ith "Step_produces_Parameter" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepProducesParameter getStepProducesParameterArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepProducesParameter target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepProducesParameter)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Step_produces_Parameter" element
     */
    @Override
    public int sizeOfStepProducesParameterArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Sets array of all "Step_produces_Parameter" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setStepProducesParameterArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepProducesParameter[] stepProducesParameterArray) {
        check_orphaned();
        arraySetterHelper(stepProducesParameterArray, PROPERTY_QNAME[2]);
    }

    /**
     * Sets ith "Step_produces_Parameter" element
     */
    @Override
    public void setStepProducesParameterArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepProducesParameter stepProducesParameter) {
        generatedSetterHelperImpl(stepProducesParameter, PROPERTY_QNAME[2], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Step_produces_Parameter" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepProducesParameter insertNewStepProducesParameter(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepProducesParameter target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepProducesParameter)get_store().insert_element_user(PROPERTY_QNAME[2], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Step_produces_Parameter" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepProducesParameter addNewStepProducesParameter() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepProducesParameter target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepProducesParameter)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Removes the ith "Step_produces_Parameter" element
     */
    @Override
    public void removeStepProducesParameter(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], i);
        }
    }

    /**
     * Gets a List of "Step_receives_Parameter" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepReceivesParameter> getStepReceivesParameterList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getStepReceivesParameterArray,
                this::setStepReceivesParameterArray,
                this::insertNewStepReceivesParameter,
                this::removeStepReceivesParameter,
                this::sizeOfStepReceivesParameterArray
            );
        }
    }

    /**
     * Gets array of all "Step_receives_Parameter" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepReceivesParameter[] getStepReceivesParameterArray() {
        return getXmlObjectArray(PROPERTY_QNAME[3], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepReceivesParameter[0]);
    }

    /**
     * Gets ith "Step_receives_Parameter" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepReceivesParameter getStepReceivesParameterArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepReceivesParameter target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepReceivesParameter)get_store().find_element_user(PROPERTY_QNAME[3], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Step_receives_Parameter" element
     */
    @Override
    public int sizeOfStepReceivesParameterArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Sets array of all "Step_receives_Parameter" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setStepReceivesParameterArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepReceivesParameter[] stepReceivesParameterArray) {
        check_orphaned();
        arraySetterHelper(stepReceivesParameterArray, PROPERTY_QNAME[3]);
    }

    /**
     * Sets ith "Step_receives_Parameter" element
     */
    @Override
    public void setStepReceivesParameterArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepReceivesParameter stepReceivesParameter) {
        generatedSetterHelperImpl(stepReceivesParameter, PROPERTY_QNAME[3], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Step_receives_Parameter" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepReceivesParameter insertNewStepReceivesParameter(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepReceivesParameter target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepReceivesParameter)get_store().insert_element_user(PROPERTY_QNAME[3], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Step_receives_Parameter" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepReceivesParameter addNewStepReceivesParameter() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepReceivesParameter target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepReceivesParameter)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Removes the ith "Step_receives_Parameter" element
     */
    @Override
    public void removeStepReceivesParameter(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], i);
        }
    }

    /**
     * Gets a List of "Step_hasSubStep_Step" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepHasSubStepStep> getStepHasSubStepStepList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getStepHasSubStepStepArray,
                this::setStepHasSubStepStepArray,
                this::insertNewStepHasSubStepStep,
                this::removeStepHasSubStepStep,
                this::sizeOfStepHasSubStepStepArray
            );
        }
    }

    /**
     * Gets array of all "Step_hasSubStep_Step" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepHasSubStepStep[] getStepHasSubStepStepArray() {
        return getXmlObjectArray(PROPERTY_QNAME[4], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepHasSubStepStep[0]);
    }

    /**
     * Gets ith "Step_hasSubStep_Step" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepHasSubStepStep getStepHasSubStepStepArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepHasSubStepStep target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepHasSubStepStep)get_store().find_element_user(PROPERTY_QNAME[4], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Step_hasSubStep_Step" element
     */
    @Override
    public int sizeOfStepHasSubStepStepArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[4]);
        }
    }

    /**
     * Sets array of all "Step_hasSubStep_Step" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setStepHasSubStepStepArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepHasSubStepStep[] stepHasSubStepStepArray) {
        check_orphaned();
        arraySetterHelper(stepHasSubStepStepArray, PROPERTY_QNAME[4]);
    }

    /**
     * Sets ith "Step_hasSubStep_Step" element
     */
    @Override
    public void setStepHasSubStepStepArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepHasSubStepStep stepHasSubStepStep) {
        generatedSetterHelperImpl(stepHasSubStepStep, PROPERTY_QNAME[4], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Step_hasSubStep_Step" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepHasSubStepStep insertNewStepHasSubStepStep(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepHasSubStepStep target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepHasSubStepStep)get_store().insert_element_user(PROPERTY_QNAME[4], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Step_hasSubStep_Step" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepHasSubStepStep addNewStepHasSubStepStep() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepHasSubStepStep target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepHasSubStepStep)get_store().add_element_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * Removes the ith "Step_hasSubStep_Step" element
     */
    @Override
    public void removeStepHasSubStepStep(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[4], i);
        }
    }
    /**
     * An XML Step_produces_Parameter(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class StepProducesParameterImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.ReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepProducesParameter {
        private static final long serialVersionUID = 1L;

        public StepProducesParameterImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }

        private static final QName[] PROPERTY_QNAME = {
            new QName("", "isAssociationReference"),
        };


        /**
         * Gets the "isAssociationReference" attribute
         */
        @Override
        public boolean getIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[0]);
                }
                return (target == null) ? false : target.getBooleanValue();
            }
        }

        /**
         * Gets (as xml) the "isAssociationReference" attribute
         */
        @Override
        public org.apache.xmlbeans.XmlBoolean xgetIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PROPERTY_QNAME[0]);
                }
                return target;
            }
        }

        /**
         * True if has "isAssociationReference" attribute
         */
        @Override
        public boolean isSetIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
            }
        }

        /**
         * Sets the "isAssociationReference" attribute
         */
        @Override
        public void setIsAssociationReference(boolean isAssociationReference) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
                }
                target.setBooleanValue(isAssociationReference);
            }
        }

        /**
         * Sets (as xml) the "isAssociationReference" attribute
         */
        @Override
        public void xsetIsAssociationReference(org.apache.xmlbeans.XmlBoolean isAssociationReference) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[0]);
                }
                target.set(isAssociationReference);
            }
        }

        /**
         * Unsets the "isAssociationReference" attribute
         */
        @Override
        public void unsetIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_attribute(PROPERTY_QNAME[0]);
            }
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step$StepProducesParameter$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepProducesParameter.ValidType {
            private static final long serialVersionUID = 1L;

            public ValidTypeImpl(org.apache.xmlbeans.SchemaType sType) {
                super(sType, false);
            }

            protected ValidTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
                super(sType, b);
            }
        }
    }
    /**
     * An XML Step_receives_Parameter(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class StepReceivesParameterImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.ReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepReceivesParameter {
        private static final long serialVersionUID = 1L;

        public StepReceivesParameterImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }

        private static final QName[] PROPERTY_QNAME = {
            new QName("", "isAssociationReference"),
        };


        /**
         * Gets the "isAssociationReference" attribute
         */
        @Override
        public boolean getIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[0]);
                }
                return (target == null) ? false : target.getBooleanValue();
            }
        }

        /**
         * Gets (as xml) the "isAssociationReference" attribute
         */
        @Override
        public org.apache.xmlbeans.XmlBoolean xgetIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PROPERTY_QNAME[0]);
                }
                return target;
            }
        }

        /**
         * True if has "isAssociationReference" attribute
         */
        @Override
        public boolean isSetIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
            }
        }

        /**
         * Sets the "isAssociationReference" attribute
         */
        @Override
        public void setIsAssociationReference(boolean isAssociationReference) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
                }
                target.setBooleanValue(isAssociationReference);
            }
        }

        /**
         * Sets (as xml) the "isAssociationReference" attribute
         */
        @Override
        public void xsetIsAssociationReference(org.apache.xmlbeans.XmlBoolean isAssociationReference) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[0]);
                }
                target.set(isAssociationReference);
            }
        }

        /**
         * Unsets the "isAssociationReference" attribute
         */
        @Override
        public void unsetIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_attribute(PROPERTY_QNAME[0]);
            }
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step$StepReceivesParameter$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepReceivesParameter.ValidType {
            private static final long serialVersionUID = 1L;

            public ValidTypeImpl(org.apache.xmlbeans.SchemaType sType) {
                super(sType, false);
            }

            protected ValidTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
                super(sType, b);
            }
        }
    }
    /**
     * An XML Step_hasSubStep_Step(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class StepHasSubStepStepImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.ReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepHasSubStepStep {
        private static final long serialVersionUID = 1L;

        public StepHasSubStepStepImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }

        private static final QName[] PROPERTY_QNAME = {
            new QName("", "isAssociationReference"),
        };


        /**
         * Gets the "isAssociationReference" attribute
         */
        @Override
        public boolean getIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[0]);
                }
                return (target == null) ? false : target.getBooleanValue();
            }
        }

        /**
         * Gets (as xml) the "isAssociationReference" attribute
         */
        @Override
        public org.apache.xmlbeans.XmlBoolean xgetIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PROPERTY_QNAME[0]);
                }
                return target;
            }
        }

        /**
         * True if has "isAssociationReference" attribute
         */
        @Override
        public boolean isSetIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
            }
        }

        /**
         * Sets the "isAssociationReference" attribute
         */
        @Override
        public void setIsAssociationReference(boolean isAssociationReference) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
                }
                target.setBooleanValue(isAssociationReference);
            }
        }

        /**
         * Sets (as xml) the "isAssociationReference" attribute
         */
        @Override
        public void xsetIsAssociationReference(org.apache.xmlbeans.XmlBoolean isAssociationReference) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[0]);
                }
                target.set(isAssociationReference);
            }
        }

        /**
         * Unsets the "isAssociationReference" attribute
         */
        @Override
        public void unsetIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_attribute(PROPERTY_QNAME[0]);
            }
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step$StepHasSubStepStep$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step.StepHasSubStepStep.ValidType {
            private static final long serialVersionUID = 1L;

            public ValidTypeImpl(org.apache.xmlbeans.SchemaType sType) {
                super(sType, false);
            }

            protected ValidTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
                super(sType, b);
            }
        }
    }
}
