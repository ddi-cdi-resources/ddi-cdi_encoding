/*
 * XML Type:  ControlLogic
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML ControlLogic(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class ControlLogicImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic {
    private static final long serialVersionUID = 1L;

    public ControlLogicImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "description"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "identifier"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "workflow"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ControlLogic_informs_ProcessingAgent"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ControlLogic_invokes_Activity"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ControlLogic_hasSubControlLogic_ControlLogic"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ControlLogic_has_InformationFlowDefinition"),
    };


    /**
     * Gets the "description" element
     */
    @Override
    public java.lang.String getDescription() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "description" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetDescription() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return target;
        }
    }

    /**
     * True if has "description" element
     */
    @Override
    public boolean isSetDescription() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "description" element
     */
    @Override
    public void setDescription(java.lang.String description) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.setStringValue(description);
        }
    }

    /**
     * Sets (as xml) the "description" element
     */
    @Override
    public void xsetDescription(org.apache.xmlbeans.XmlString description) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(description);
        }
    }

    /**
     * Unsets the "description" element
     */
    @Override
    public void unsetDescription() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "identifier" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier getIdentifier() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "identifier" element
     */
    @Override
    public boolean isSetIdentifier() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "identifier" element
     */
    @Override
    public void setIdentifier(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier identifier) {
        generatedSetterHelperImpl(identifier, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "identifier" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier addNewIdentifier() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "identifier" element
     */
    @Override
    public void unsetIdentifier() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets the "workflow" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getWorkflow() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "workflow" element
     */
    @Override
    public boolean isSetWorkflow() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "workflow" element
     */
    @Override
    public void setWorkflow(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry workflow) {
        generatedSetterHelperImpl(workflow, PROPERTY_QNAME[2], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "workflow" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewWorkflow() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Unsets the "workflow" element
     */
    @Override
    public void unsetWorkflow() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }

    /**
     * Gets a List of "ControlLogic_informs_ProcessingAgent" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicInformsProcessingAgent> getControlLogicInformsProcessingAgentList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getControlLogicInformsProcessingAgentArray,
                this::setControlLogicInformsProcessingAgentArray,
                this::insertNewControlLogicInformsProcessingAgent,
                this::removeControlLogicInformsProcessingAgent,
                this::sizeOfControlLogicInformsProcessingAgentArray
            );
        }
    }

    /**
     * Gets array of all "ControlLogic_informs_ProcessingAgent" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicInformsProcessingAgent[] getControlLogicInformsProcessingAgentArray() {
        return getXmlObjectArray(PROPERTY_QNAME[3], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicInformsProcessingAgent[0]);
    }

    /**
     * Gets ith "ControlLogic_informs_ProcessingAgent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicInformsProcessingAgent getControlLogicInformsProcessingAgentArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicInformsProcessingAgent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicInformsProcessingAgent)get_store().find_element_user(PROPERTY_QNAME[3], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ControlLogic_informs_ProcessingAgent" element
     */
    @Override
    public int sizeOfControlLogicInformsProcessingAgentArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Sets array of all "ControlLogic_informs_ProcessingAgent" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setControlLogicInformsProcessingAgentArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicInformsProcessingAgent[] controlLogicInformsProcessingAgentArray) {
        check_orphaned();
        arraySetterHelper(controlLogicInformsProcessingAgentArray, PROPERTY_QNAME[3]);
    }

    /**
     * Sets ith "ControlLogic_informs_ProcessingAgent" element
     */
    @Override
    public void setControlLogicInformsProcessingAgentArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicInformsProcessingAgent controlLogicInformsProcessingAgent) {
        generatedSetterHelperImpl(controlLogicInformsProcessingAgent, PROPERTY_QNAME[3], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ControlLogic_informs_ProcessingAgent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicInformsProcessingAgent insertNewControlLogicInformsProcessingAgent(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicInformsProcessingAgent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicInformsProcessingAgent)get_store().insert_element_user(PROPERTY_QNAME[3], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ControlLogic_informs_ProcessingAgent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicInformsProcessingAgent addNewControlLogicInformsProcessingAgent() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicInformsProcessingAgent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicInformsProcessingAgent)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Removes the ith "ControlLogic_informs_ProcessingAgent" element
     */
    @Override
    public void removeControlLogicInformsProcessingAgent(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], i);
        }
    }

    /**
     * Gets a List of "ControlLogic_invokes_Activity" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicInvokesActivity> getControlLogicInvokesActivityList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getControlLogicInvokesActivityArray,
                this::setControlLogicInvokesActivityArray,
                this::insertNewControlLogicInvokesActivity,
                this::removeControlLogicInvokesActivity,
                this::sizeOfControlLogicInvokesActivityArray
            );
        }
    }

    /**
     * Gets array of all "ControlLogic_invokes_Activity" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicInvokesActivity[] getControlLogicInvokesActivityArray() {
        return getXmlObjectArray(PROPERTY_QNAME[4], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicInvokesActivity[0]);
    }

    /**
     * Gets ith "ControlLogic_invokes_Activity" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicInvokesActivity getControlLogicInvokesActivityArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicInvokesActivity target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicInvokesActivity)get_store().find_element_user(PROPERTY_QNAME[4], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ControlLogic_invokes_Activity" element
     */
    @Override
    public int sizeOfControlLogicInvokesActivityArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[4]);
        }
    }

    /**
     * Sets array of all "ControlLogic_invokes_Activity" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setControlLogicInvokesActivityArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicInvokesActivity[] controlLogicInvokesActivityArray) {
        check_orphaned();
        arraySetterHelper(controlLogicInvokesActivityArray, PROPERTY_QNAME[4]);
    }

    /**
     * Sets ith "ControlLogic_invokes_Activity" element
     */
    @Override
    public void setControlLogicInvokesActivityArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicInvokesActivity controlLogicInvokesActivity) {
        generatedSetterHelperImpl(controlLogicInvokesActivity, PROPERTY_QNAME[4], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ControlLogic_invokes_Activity" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicInvokesActivity insertNewControlLogicInvokesActivity(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicInvokesActivity target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicInvokesActivity)get_store().insert_element_user(PROPERTY_QNAME[4], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ControlLogic_invokes_Activity" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicInvokesActivity addNewControlLogicInvokesActivity() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicInvokesActivity target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicInvokesActivity)get_store().add_element_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * Removes the ith "ControlLogic_invokes_Activity" element
     */
    @Override
    public void removeControlLogicInvokesActivity(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[4], i);
        }
    }

    /**
     * Gets a List of "ControlLogic_hasSubControlLogic_ControlLogic" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicHasSubControlLogicControlLogic> getControlLogicHasSubControlLogicControlLogicList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getControlLogicHasSubControlLogicControlLogicArray,
                this::setControlLogicHasSubControlLogicControlLogicArray,
                this::insertNewControlLogicHasSubControlLogicControlLogic,
                this::removeControlLogicHasSubControlLogicControlLogic,
                this::sizeOfControlLogicHasSubControlLogicControlLogicArray
            );
        }
    }

    /**
     * Gets array of all "ControlLogic_hasSubControlLogic_ControlLogic" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicHasSubControlLogicControlLogic[] getControlLogicHasSubControlLogicControlLogicArray() {
        return getXmlObjectArray(PROPERTY_QNAME[5], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicHasSubControlLogicControlLogic[0]);
    }

    /**
     * Gets ith "ControlLogic_hasSubControlLogic_ControlLogic" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicHasSubControlLogicControlLogic getControlLogicHasSubControlLogicControlLogicArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicHasSubControlLogicControlLogic target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicHasSubControlLogicControlLogic)get_store().find_element_user(PROPERTY_QNAME[5], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ControlLogic_hasSubControlLogic_ControlLogic" element
     */
    @Override
    public int sizeOfControlLogicHasSubControlLogicControlLogicArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[5]);
        }
    }

    /**
     * Sets array of all "ControlLogic_hasSubControlLogic_ControlLogic" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setControlLogicHasSubControlLogicControlLogicArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicHasSubControlLogicControlLogic[] controlLogicHasSubControlLogicControlLogicArray) {
        check_orphaned();
        arraySetterHelper(controlLogicHasSubControlLogicControlLogicArray, PROPERTY_QNAME[5]);
    }

    /**
     * Sets ith "ControlLogic_hasSubControlLogic_ControlLogic" element
     */
    @Override
    public void setControlLogicHasSubControlLogicControlLogicArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicHasSubControlLogicControlLogic controlLogicHasSubControlLogicControlLogic) {
        generatedSetterHelperImpl(controlLogicHasSubControlLogicControlLogic, PROPERTY_QNAME[5], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ControlLogic_hasSubControlLogic_ControlLogic" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicHasSubControlLogicControlLogic insertNewControlLogicHasSubControlLogicControlLogic(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicHasSubControlLogicControlLogic target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicHasSubControlLogicControlLogic)get_store().insert_element_user(PROPERTY_QNAME[5], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ControlLogic_hasSubControlLogic_ControlLogic" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicHasSubControlLogicControlLogic addNewControlLogicHasSubControlLogicControlLogic() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicHasSubControlLogicControlLogic target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicHasSubControlLogicControlLogic)get_store().add_element_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * Removes the ith "ControlLogic_hasSubControlLogic_ControlLogic" element
     */
    @Override
    public void removeControlLogicHasSubControlLogicControlLogic(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[5], i);
        }
    }

    /**
     * Gets a List of "ControlLogic_has_InformationFlowDefinition" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicHasInformationFlowDefinition> getControlLogicHasInformationFlowDefinitionList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getControlLogicHasInformationFlowDefinitionArray,
                this::setControlLogicHasInformationFlowDefinitionArray,
                this::insertNewControlLogicHasInformationFlowDefinition,
                this::removeControlLogicHasInformationFlowDefinition,
                this::sizeOfControlLogicHasInformationFlowDefinitionArray
            );
        }
    }

    /**
     * Gets array of all "ControlLogic_has_InformationFlowDefinition" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicHasInformationFlowDefinition[] getControlLogicHasInformationFlowDefinitionArray() {
        return getXmlObjectArray(PROPERTY_QNAME[6], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicHasInformationFlowDefinition[0]);
    }

    /**
     * Gets ith "ControlLogic_has_InformationFlowDefinition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicHasInformationFlowDefinition getControlLogicHasInformationFlowDefinitionArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicHasInformationFlowDefinition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicHasInformationFlowDefinition)get_store().find_element_user(PROPERTY_QNAME[6], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ControlLogic_has_InformationFlowDefinition" element
     */
    @Override
    public int sizeOfControlLogicHasInformationFlowDefinitionArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[6]);
        }
    }

    /**
     * Sets array of all "ControlLogic_has_InformationFlowDefinition" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setControlLogicHasInformationFlowDefinitionArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicHasInformationFlowDefinition[] controlLogicHasInformationFlowDefinitionArray) {
        check_orphaned();
        arraySetterHelper(controlLogicHasInformationFlowDefinitionArray, PROPERTY_QNAME[6]);
    }

    /**
     * Sets ith "ControlLogic_has_InformationFlowDefinition" element
     */
    @Override
    public void setControlLogicHasInformationFlowDefinitionArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicHasInformationFlowDefinition controlLogicHasInformationFlowDefinition) {
        generatedSetterHelperImpl(controlLogicHasInformationFlowDefinition, PROPERTY_QNAME[6], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ControlLogic_has_InformationFlowDefinition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicHasInformationFlowDefinition insertNewControlLogicHasInformationFlowDefinition(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicHasInformationFlowDefinition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicHasInformationFlowDefinition)get_store().insert_element_user(PROPERTY_QNAME[6], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ControlLogic_has_InformationFlowDefinition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicHasInformationFlowDefinition addNewControlLogicHasInformationFlowDefinition() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicHasInformationFlowDefinition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicHasInformationFlowDefinition)get_store().add_element_user(PROPERTY_QNAME[6]);
            return target;
        }
    }

    /**
     * Removes the ith "ControlLogic_has_InformationFlowDefinition" element
     */
    @Override
    public void removeControlLogicHasInformationFlowDefinition(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[6], i);
        }
    }
    /**
     * An XML ControlLogic_informs_ProcessingAgent(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class ControlLogicInformsProcessingAgentImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.ReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicInformsProcessingAgent {
        private static final long serialVersionUID = 1L;

        public ControlLogicInformsProcessingAgentImpl(org.apache.xmlbeans.SchemaType sType) {
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic$ControlLogicInformsProcessingAgent$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicInformsProcessingAgent.ValidType {
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
     * An XML ControlLogic_invokes_Activity(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class ControlLogicInvokesActivityImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.ReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicInvokesActivity {
        private static final long serialVersionUID = 1L;

        public ControlLogicInvokesActivityImpl(org.apache.xmlbeans.SchemaType sType) {
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic$ControlLogicInvokesActivity$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicInvokesActivity.ValidType {
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
     * An XML ControlLogic_hasSubControlLogic_ControlLogic(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class ControlLogicHasSubControlLogicControlLogicImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.ReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicHasSubControlLogicControlLogic {
        private static final long serialVersionUID = 1L;

        public ControlLogicHasSubControlLogicControlLogicImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }

        private static final QName[] PROPERTY_QNAME = {
            new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "validType"),
            new QName("", "isAssociationReference"),
        };


        /**
         * Gets a List of "validType" elements
         */
        @Override
        public java.util.List<java.lang.String> getValidTypeList() {
            synchronized (monitor()) {
                check_orphaned();
                return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                    this::getValidTypeArray,
                    this::setValidTypeArray,
                    this::insertValidType,
                    this::removeValidType,
                    this::sizeOfValidTypeArray
                );
            }
        }

        /**
         * Gets array of all "validType" elements
         */
        @Override
        public java.lang.String[] getValidTypeArray() {
            return getObjectArray(PROPERTY_QNAME[0], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
        }

        /**
         * Gets ith "validType" element
         */
        @Override
        public java.lang.String getValidTypeArray(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], i);
                if (target == null) {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }

        /**
         * Gets (as xml) a List of "validType" elements
         */
        @Override
        public java.util.List<org.apache.xmlbeans.XmlString> xgetValidTypeList() {
            synchronized (monitor()) {
                check_orphaned();
                return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                    this::xgetValidTypeArray,
                    this::xsetValidTypeArray,
                    this::insertNewValidType,
                    this::removeValidType,
                    this::sizeOfValidTypeArray
                );
            }
        }

        /**
         * Gets (as xml) array of all "validType" elements
         */
        @Override
        public org.apache.xmlbeans.XmlString[] xgetValidTypeArray() {
            return xgetArray(PROPERTY_QNAME[0], org.apache.xmlbeans.XmlString[]::new);
        }

        /**
         * Gets (as xml) ith "validType" element
         */
        @Override
        public org.apache.xmlbeans.XmlString xgetValidTypeArray(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[0], i);
                if (target == null) {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }

        /**
         * Returns number of "validType" element
         */
        @Override
        public int sizeOfValidTypeArray() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().count_elements(PROPERTY_QNAME[0]);
            }
        }

        /**
         * Sets array of all "validType" element
         */
        @Override
        public void setValidTypeArray(java.lang.String[] validTypeArray) {
            synchronized (monitor()) {
                check_orphaned();
                arraySetterHelper(validTypeArray, PROPERTY_QNAME[0]);
            }
        }

        /**
         * Sets ith "validType" element
         */
        @Override
        public void setValidTypeArray(int i, java.lang.String validType) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], i);
                if (target == null) {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(validType);
            }
        }

        /**
         * Sets (as xml) array of all "validType" element
         */
        @Override
        public void xsetValidTypeArray(org.apache.xmlbeans.XmlString[]validTypeArray) {
            synchronized (monitor()) {
                check_orphaned();
                arraySetterHelper(validTypeArray, PROPERTY_QNAME[0]);
            }
        }

        /**
         * Sets (as xml) ith "validType" element
         */
        @Override
        public void xsetValidTypeArray(int i, org.apache.xmlbeans.XmlString validType) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[0], i);
                if (target == null) {
                    throw new IndexOutOfBoundsException();
                }
                target.set(validType);
            }
        }

        /**
         * Inserts the value as the ith "validType" element
         */
        @Override
        public void insertValidType(int i, java.lang.String validType) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target =
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[0], i);
                target.setStringValue(validType);
            }
        }

        /**
         * Appends the value as the last "validType" element
         */
        @Override
        public void addValidType(java.lang.String validType) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
                target.setStringValue(validType);
            }
        }

        /**
         * Inserts and returns a new empty value (as xml) as the ith "validType" element
         */
        @Override
        public org.apache.xmlbeans.XmlString insertNewValidType(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(PROPERTY_QNAME[0], i);
                return target;
            }
        }

        /**
         * Appends and returns a new empty value (as xml) as the last "validType" element
         */
        @Override
        public org.apache.xmlbeans.XmlString addNewValidType() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[0]);
                return target;
            }
        }

        /**
         * Removes the ith "validType" element
         */
        @Override
        public void removeValidType(int i) {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_element(PROPERTY_QNAME[0], i);
            }
        }

        /**
         * Gets the "isAssociationReference" attribute
         */
        @Override
        public boolean getIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[1]);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[1]);
                if (target == null) {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PROPERTY_QNAME[1]);
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
                return get_store().find_attribute_user(PROPERTY_QNAME[1]) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[1]);
                if (target == null) {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[1]);
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
                get_store().remove_attribute(PROPERTY_QNAME[1]);
            }
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic$ControlLogicHasSubControlLogicControlLogic$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicHasSubControlLogicControlLogic.ValidType {
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
     * An XML ControlLogic_has_InformationFlowDefinition(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class ControlLogicHasInformationFlowDefinitionImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.ReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicHasInformationFlowDefinition {
        private static final long serialVersionUID = 1L;

        public ControlLogicHasInformationFlowDefinitionImpl(org.apache.xmlbeans.SchemaType sType) {
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic$ControlLogicHasInformationFlowDefinition$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic.ControlLogicHasInformationFlowDefinition.ValidType {
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
