/*
 * XML Type:  DDICDIModels
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.DDICDIModels
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML DDICDIModels(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class DDICDIModelsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.DDICDIModels {
    private static final long serialVersionUID = 1L;

    public DDICDIModelsImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "Activity"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "Agent"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "AgentListing"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "AgentPosition"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "AgentRelationship"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "AgentStructure"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "AllenIntervalAlgebra"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "AttributeComponent"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "AuthorizationSource"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "Category"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "CategoryPosition"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "CategoryRelationStructure"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "CategoryRelationship"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "CategorySet"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "CategoryStatistic"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ClassificationFamily"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ClassificationIndex"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ClassificationIndexEntry"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ClassificationIndexEntryPosition"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ClassificationItem"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ClassificationItemPosition"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ClassificationItemRelationship"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ClassificationItemStructure"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ClassificationPosition"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ClassificationSeries"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ClassificationSeriesStructure"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "Code"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "CodeList"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "CodeListStructure"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "CodePosition"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "CodeRelationship"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ComponentPosition"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "Concept"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ConceptMap"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ConceptRelationship"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ConceptStructure"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ConceptSystem"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ConceptSystemCorrespondence"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ConceptualDomain"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ConceptualValue"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ConceptualVariable"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ConditionalControlLogic"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ContextualComponent"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ControlLogic"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "CorrespondenceTable"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "Curator"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "DataPoint"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "DataPointPosition"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "DataPointRelationship"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "DataSet"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "DataStore"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "DataStructure"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "DataStructureComponent"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "Datum"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "Descriptor"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "DescriptorValueDomain"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "DescriptorVariable"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "DeterministicImperative"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "DimensionComponent"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "DimensionGroup"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "DimensionalDataSet"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "DimensionalDataStructure"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "DimensionalKey"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "DimensionalKeyDefinition"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "DimensionalKeyDefinitionMember"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "DimensionalKeyMember"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "EnumerationDomain"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ForeignKey"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ForeignKeyComponent"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "IdentifierComponent"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "Individual"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "InformationFlowDefinition"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "InstanceKey"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "InstanceValue"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "InstanceVariable"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "InstanceVariableMap"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "Key"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "KeyDefinition"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "KeyDefinitionMember"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "KeyMember"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "KeyValueDataStore"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "KeyValueStructure"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "Level"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "LevelStructure"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "LogicalRecord"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "LogicalRecordPosition"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "LogicalRecordRelationStructure"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "LogicalRecordRelationship"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "LongDataSet"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "LongDataStructure"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "LongKey"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "LongMainKeyMember"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "Machine"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "MainKeyMember"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "MeasureComponent"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "NonDeterministicDeclarative"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "Notation"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "Organization"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "Parameter"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "PhysicalDataSet"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "PhysicalDataSetStructure"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "PhysicalLayoutRelationStructure"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "PhysicalRecordSegment"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "PhysicalRecordSegmentPosition"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "PhysicalRecordSegmentRelationship"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "PhysicalRecordSegmentStructure"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "PhysicalSegmentLayout"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "PhysicalSegmentLocation"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "Population"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "PrimaryKey"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "PrimaryKeyComponent"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ProcessingAgent"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ProductionEnvironment"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "QualifiedMeasure"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "RecordRelation"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ReferenceValue"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ReferenceValueDomain"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ReferenceVariable"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "RepresentedVariable"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "RevisableDatum"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "Revision"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "Rule"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "RuleBasedScheduling"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "RuleSet"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ScopedMeasure"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "SegmentByText"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "SentinelConceptualDomain"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "SentinelValueDomain"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "Sequence"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "SequencePosition"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "Service"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "StatisticalClassification"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "StatisticalClassificationRelationship"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "Step"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "SubstantiveConceptualDomain"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "SubstantiveValueDomain"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "SyntheticIdComponent"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "TemporalConstraints"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "TemporalControlConstruct"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "Unit"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "UnitSegmentLayout"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "UnitType"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "Universe"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ValueAndConceptDescription"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ValueDomain"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ValueMapping"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ValueMappingPosition"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ValueMappingRelationship"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "VariableCollection"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "VariableDescriptorComponent"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "VariablePosition"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "VariableRelationship"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "VariableStructure"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "VariableValueComponent"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "WideDataSet"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "WideDataStructure"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "WideKey"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "WideKeyMember"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "Wrapper"),
    };


    /**
     * Gets a List of "Activity" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity> getActivityList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getActivityArray,
                this::setActivityArray,
                this::insertNewActivity,
                this::removeActivity,
                this::sizeOfActivityArray
            );
        }
    }

    /**
     * Gets array of all "Activity" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity[] getActivityArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity[0]);
    }

    /**
     * Gets ith "Activity" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity getActivityArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Activity" element
     */
    @Override
    public int sizeOfActivityArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "Activity" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setActivityArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity[] activityArray) {
        check_orphaned();
        arraySetterHelper(activityArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "Activity" element
     */
    @Override
    public void setActivityArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity activity) {
        generatedSetterHelperImpl(activity, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Activity" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity insertNewActivity(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Activity" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity addNewActivity() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "Activity" element
     */
    @Override
    public void removeActivity(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }

    /**
     * Gets a List of "Agent" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Agent> getAgentList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getAgentArray,
                this::setAgentArray,
                this::insertNewAgent,
                this::removeAgent,
                this::sizeOfAgentArray
            );
        }
    }

    /**
     * Gets array of all "Agent" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Agent[] getAgentArray() {
        return getXmlObjectArray(PROPERTY_QNAME[1], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.Agent[0]);
    }

    /**
     * Gets ith "Agent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Agent getAgentArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Agent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Agent)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Agent" element
     */
    @Override
    public int sizeOfAgentArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets array of all "Agent" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setAgentArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Agent[] agentArray) {
        check_orphaned();
        arraySetterHelper(agentArray, PROPERTY_QNAME[1]);
    }

    /**
     * Sets ith "Agent" element
     */
    @Override
    public void setAgentArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Agent agent) {
        generatedSetterHelperImpl(agent, PROPERTY_QNAME[1], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Agent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Agent insertNewAgent(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Agent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Agent)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Agent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Agent addNewAgent() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Agent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Agent)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Removes the ith "Agent" element
     */
    @Override
    public void removeAgent(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], i);
        }
    }

    /**
     * Gets a List of "AgentListing" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing> getAgentListingList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getAgentListingArray,
                this::setAgentListingArray,
                this::insertNewAgentListing,
                this::removeAgentListing,
                this::sizeOfAgentListingArray
            );
        }
    }

    /**
     * Gets array of all "AgentListing" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing[] getAgentListingArray() {
        return getXmlObjectArray(PROPERTY_QNAME[2], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing[0]);
    }

    /**
     * Gets ith "AgentListing" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing getAgentListingArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "AgentListing" element
     */
    @Override
    public int sizeOfAgentListingArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Sets array of all "AgentListing" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setAgentListingArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing[] agentListingArray) {
        check_orphaned();
        arraySetterHelper(agentListingArray, PROPERTY_QNAME[2]);
    }

    /**
     * Sets ith "AgentListing" element
     */
    @Override
    public void setAgentListingArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing agentListing) {
        generatedSetterHelperImpl(agentListing, PROPERTY_QNAME[2], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "AgentListing" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing insertNewAgentListing(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing)get_store().insert_element_user(PROPERTY_QNAME[2], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "AgentListing" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing addNewAgentListing() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Removes the ith "AgentListing" element
     */
    @Override
    public void removeAgentListing(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], i);
        }
    }

    /**
     * Gets a List of "AgentPosition" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentPosition> getAgentPositionList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getAgentPositionArray,
                this::setAgentPositionArray,
                this::insertNewAgentPosition,
                this::removeAgentPosition,
                this::sizeOfAgentPositionArray
            );
        }
    }

    /**
     * Gets array of all "AgentPosition" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentPosition[] getAgentPositionArray() {
        return getXmlObjectArray(PROPERTY_QNAME[3], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentPosition[0]);
    }

    /**
     * Gets ith "AgentPosition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentPosition getAgentPositionArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentPosition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentPosition)get_store().find_element_user(PROPERTY_QNAME[3], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "AgentPosition" element
     */
    @Override
    public int sizeOfAgentPositionArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Sets array of all "AgentPosition" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setAgentPositionArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentPosition[] agentPositionArray) {
        check_orphaned();
        arraySetterHelper(agentPositionArray, PROPERTY_QNAME[3]);
    }

    /**
     * Sets ith "AgentPosition" element
     */
    @Override
    public void setAgentPositionArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentPosition agentPosition) {
        generatedSetterHelperImpl(agentPosition, PROPERTY_QNAME[3], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "AgentPosition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentPosition insertNewAgentPosition(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentPosition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentPosition)get_store().insert_element_user(PROPERTY_QNAME[3], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "AgentPosition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentPosition addNewAgentPosition() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentPosition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentPosition)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Removes the ith "AgentPosition" element
     */
    @Override
    public void removeAgentPosition(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], i);
        }
    }

    /**
     * Gets a List of "AgentRelationship" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentRelationship> getAgentRelationshipList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getAgentRelationshipArray,
                this::setAgentRelationshipArray,
                this::insertNewAgentRelationship,
                this::removeAgentRelationship,
                this::sizeOfAgentRelationshipArray
            );
        }
    }

    /**
     * Gets array of all "AgentRelationship" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentRelationship[] getAgentRelationshipArray() {
        return getXmlObjectArray(PROPERTY_QNAME[4], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentRelationship[0]);
    }

    /**
     * Gets ith "AgentRelationship" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentRelationship getAgentRelationshipArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentRelationship target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentRelationship)get_store().find_element_user(PROPERTY_QNAME[4], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "AgentRelationship" element
     */
    @Override
    public int sizeOfAgentRelationshipArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[4]);
        }
    }

    /**
     * Sets array of all "AgentRelationship" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setAgentRelationshipArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentRelationship[] agentRelationshipArray) {
        check_orphaned();
        arraySetterHelper(agentRelationshipArray, PROPERTY_QNAME[4]);
    }

    /**
     * Sets ith "AgentRelationship" element
     */
    @Override
    public void setAgentRelationshipArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentRelationship agentRelationship) {
        generatedSetterHelperImpl(agentRelationship, PROPERTY_QNAME[4], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "AgentRelationship" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentRelationship insertNewAgentRelationship(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentRelationship target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentRelationship)get_store().insert_element_user(PROPERTY_QNAME[4], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "AgentRelationship" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentRelationship addNewAgentRelationship() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentRelationship target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentRelationship)get_store().add_element_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * Removes the ith "AgentRelationship" element
     */
    @Override
    public void removeAgentRelationship(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[4], i);
        }
    }

    /**
     * Gets a List of "AgentStructure" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentStructure> getAgentStructureList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getAgentStructureArray,
                this::setAgentStructureArray,
                this::insertNewAgentStructure,
                this::removeAgentStructure,
                this::sizeOfAgentStructureArray
            );
        }
    }

    /**
     * Gets array of all "AgentStructure" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentStructure[] getAgentStructureArray() {
        return getXmlObjectArray(PROPERTY_QNAME[5], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentStructure[0]);
    }

    /**
     * Gets ith "AgentStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentStructure getAgentStructureArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentStructure)get_store().find_element_user(PROPERTY_QNAME[5], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "AgentStructure" element
     */
    @Override
    public int sizeOfAgentStructureArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[5]);
        }
    }

    /**
     * Sets array of all "AgentStructure" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setAgentStructureArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentStructure[] agentStructureArray) {
        check_orphaned();
        arraySetterHelper(agentStructureArray, PROPERTY_QNAME[5]);
    }

    /**
     * Sets ith "AgentStructure" element
     */
    @Override
    public void setAgentStructureArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentStructure agentStructure) {
        generatedSetterHelperImpl(agentStructure, PROPERTY_QNAME[5], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "AgentStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentStructure insertNewAgentStructure(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentStructure)get_store().insert_element_user(PROPERTY_QNAME[5], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "AgentStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentStructure addNewAgentStructure() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentStructure)get_store().add_element_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * Removes the ith "AgentStructure" element
     */
    @Override
    public void removeAgentStructure(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[5], i);
        }
    }

    /**
     * Gets a List of "AllenIntervalAlgebra" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.AllenIntervalAlgebra> getAllenIntervalAlgebraList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getAllenIntervalAlgebraArray,
                this::setAllenIntervalAlgebraArray,
                this::insertNewAllenIntervalAlgebra,
                this::removeAllenIntervalAlgebra,
                this::sizeOfAllenIntervalAlgebraArray
            );
        }
    }

    /**
     * Gets array of all "AllenIntervalAlgebra" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AllenIntervalAlgebra[] getAllenIntervalAlgebraArray() {
        return getXmlObjectArray(PROPERTY_QNAME[6], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.AllenIntervalAlgebra[0]);
    }

    /**
     * Gets ith "AllenIntervalAlgebra" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AllenIntervalAlgebra getAllenIntervalAlgebraArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.AllenIntervalAlgebra target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.AllenIntervalAlgebra)get_store().find_element_user(PROPERTY_QNAME[6], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "AllenIntervalAlgebra" element
     */
    @Override
    public int sizeOfAllenIntervalAlgebraArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[6]);
        }
    }

    /**
     * Sets array of all "AllenIntervalAlgebra" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setAllenIntervalAlgebraArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.AllenIntervalAlgebra[] allenIntervalAlgebraArray) {
        check_orphaned();
        arraySetterHelper(allenIntervalAlgebraArray, PROPERTY_QNAME[6]);
    }

    /**
     * Sets ith "AllenIntervalAlgebra" element
     */
    @Override
    public void setAllenIntervalAlgebraArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.AllenIntervalAlgebra allenIntervalAlgebra) {
        generatedSetterHelperImpl(allenIntervalAlgebra, PROPERTY_QNAME[6], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "AllenIntervalAlgebra" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AllenIntervalAlgebra insertNewAllenIntervalAlgebra(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.AllenIntervalAlgebra target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.AllenIntervalAlgebra)get_store().insert_element_user(PROPERTY_QNAME[6], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "AllenIntervalAlgebra" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AllenIntervalAlgebra addNewAllenIntervalAlgebra() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.AllenIntervalAlgebra target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.AllenIntervalAlgebra)get_store().add_element_user(PROPERTY_QNAME[6]);
            return target;
        }
    }

    /**
     * Removes the ith "AllenIntervalAlgebra" element
     */
    @Override
    public void removeAllenIntervalAlgebra(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[6], i);
        }
    }

    /**
     * Gets a List of "AttributeComponent" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.AttributeComponent> getAttributeComponentList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getAttributeComponentArray,
                this::setAttributeComponentArray,
                this::insertNewAttributeComponent,
                this::removeAttributeComponent,
                this::sizeOfAttributeComponentArray
            );
        }
    }

    /**
     * Gets array of all "AttributeComponent" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AttributeComponent[] getAttributeComponentArray() {
        return getXmlObjectArray(PROPERTY_QNAME[7], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.AttributeComponent[0]);
    }

    /**
     * Gets ith "AttributeComponent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AttributeComponent getAttributeComponentArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.AttributeComponent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.AttributeComponent)get_store().find_element_user(PROPERTY_QNAME[7], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "AttributeComponent" element
     */
    @Override
    public int sizeOfAttributeComponentArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[7]);
        }
    }

    /**
     * Sets array of all "AttributeComponent" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setAttributeComponentArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.AttributeComponent[] attributeComponentArray) {
        check_orphaned();
        arraySetterHelper(attributeComponentArray, PROPERTY_QNAME[7]);
    }

    /**
     * Sets ith "AttributeComponent" element
     */
    @Override
    public void setAttributeComponentArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.AttributeComponent attributeComponent) {
        generatedSetterHelperImpl(attributeComponent, PROPERTY_QNAME[7], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "AttributeComponent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AttributeComponent insertNewAttributeComponent(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.AttributeComponent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.AttributeComponent)get_store().insert_element_user(PROPERTY_QNAME[7], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "AttributeComponent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AttributeComponent addNewAttributeComponent() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.AttributeComponent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.AttributeComponent)get_store().add_element_user(PROPERTY_QNAME[7]);
            return target;
        }
    }

    /**
     * Removes the ith "AttributeComponent" element
     */
    @Override
    public void removeAttributeComponent(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[7], i);
        }
    }

    /**
     * Gets a List of "AuthorizationSource" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.AuthorizationSource> getAuthorizationSourceList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getAuthorizationSourceArray,
                this::setAuthorizationSourceArray,
                this::insertNewAuthorizationSource,
                this::removeAuthorizationSource,
                this::sizeOfAuthorizationSourceArray
            );
        }
    }

    /**
     * Gets array of all "AuthorizationSource" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AuthorizationSource[] getAuthorizationSourceArray() {
        return getXmlObjectArray(PROPERTY_QNAME[8], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.AuthorizationSource[0]);
    }

    /**
     * Gets ith "AuthorizationSource" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AuthorizationSource getAuthorizationSourceArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.AuthorizationSource target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.AuthorizationSource)get_store().find_element_user(PROPERTY_QNAME[8], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "AuthorizationSource" element
     */
    @Override
    public int sizeOfAuthorizationSourceArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[8]);
        }
    }

    /**
     * Sets array of all "AuthorizationSource" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setAuthorizationSourceArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.AuthorizationSource[] authorizationSourceArray) {
        check_orphaned();
        arraySetterHelper(authorizationSourceArray, PROPERTY_QNAME[8]);
    }

    /**
     * Sets ith "AuthorizationSource" element
     */
    @Override
    public void setAuthorizationSourceArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.AuthorizationSource authorizationSource) {
        generatedSetterHelperImpl(authorizationSource, PROPERTY_QNAME[8], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "AuthorizationSource" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AuthorizationSource insertNewAuthorizationSource(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.AuthorizationSource target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.AuthorizationSource)get_store().insert_element_user(PROPERTY_QNAME[8], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "AuthorizationSource" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AuthorizationSource addNewAuthorizationSource() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.AuthorizationSource target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.AuthorizationSource)get_store().add_element_user(PROPERTY_QNAME[8]);
            return target;
        }
    }

    /**
     * Removes the ith "AuthorizationSource" element
     */
    @Override
    public void removeAuthorizationSource(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[8], i);
        }
    }

    /**
     * Gets a List of "Category" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Category> getCategoryList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getCategoryArray,
                this::setCategoryArray,
                this::insertNewCategory,
                this::removeCategory,
                this::sizeOfCategoryArray
            );
        }
    }

    /**
     * Gets array of all "Category" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Category[] getCategoryArray() {
        return getXmlObjectArray(PROPERTY_QNAME[9], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.Category[0]);
    }

    /**
     * Gets ith "Category" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Category getCategoryArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Category target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Category)get_store().find_element_user(PROPERTY_QNAME[9], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Category" element
     */
    @Override
    public int sizeOfCategoryArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[9]);
        }
    }

    /**
     * Sets array of all "Category" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setCategoryArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Category[] categoryArray) {
        check_orphaned();
        arraySetterHelper(categoryArray, PROPERTY_QNAME[9]);
    }

    /**
     * Sets ith "Category" element
     */
    @Override
    public void setCategoryArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Category category) {
        generatedSetterHelperImpl(category, PROPERTY_QNAME[9], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Category" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Category insertNewCategory(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Category target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Category)get_store().insert_element_user(PROPERTY_QNAME[9], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Category" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Category addNewCategory() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Category target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Category)get_store().add_element_user(PROPERTY_QNAME[9]);
            return target;
        }
    }

    /**
     * Removes the ith "Category" element
     */
    @Override
    public void removeCategory(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[9], i);
        }
    }

    /**
     * Gets a List of "CategoryPosition" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryPosition> getCategoryPositionList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getCategoryPositionArray,
                this::setCategoryPositionArray,
                this::insertNewCategoryPosition,
                this::removeCategoryPosition,
                this::sizeOfCategoryPositionArray
            );
        }
    }

    /**
     * Gets array of all "CategoryPosition" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryPosition[] getCategoryPositionArray() {
        return getXmlObjectArray(PROPERTY_QNAME[10], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryPosition[0]);
    }

    /**
     * Gets ith "CategoryPosition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryPosition getCategoryPositionArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryPosition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryPosition)get_store().find_element_user(PROPERTY_QNAME[10], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "CategoryPosition" element
     */
    @Override
    public int sizeOfCategoryPositionArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[10]);
        }
    }

    /**
     * Sets array of all "CategoryPosition" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setCategoryPositionArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryPosition[] categoryPositionArray) {
        check_orphaned();
        arraySetterHelper(categoryPositionArray, PROPERTY_QNAME[10]);
    }

    /**
     * Sets ith "CategoryPosition" element
     */
    @Override
    public void setCategoryPositionArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryPosition categoryPosition) {
        generatedSetterHelperImpl(categoryPosition, PROPERTY_QNAME[10], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "CategoryPosition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryPosition insertNewCategoryPosition(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryPosition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryPosition)get_store().insert_element_user(PROPERTY_QNAME[10], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "CategoryPosition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryPosition addNewCategoryPosition() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryPosition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryPosition)get_store().add_element_user(PROPERTY_QNAME[10]);
            return target;
        }
    }

    /**
     * Removes the ith "CategoryPosition" element
     */
    @Override
    public void removeCategoryPosition(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[10], i);
        }
    }

    /**
     * Gets a List of "CategoryRelationStructure" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationStructure> getCategoryRelationStructureList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getCategoryRelationStructureArray,
                this::setCategoryRelationStructureArray,
                this::insertNewCategoryRelationStructure,
                this::removeCategoryRelationStructure,
                this::sizeOfCategoryRelationStructureArray
            );
        }
    }

    /**
     * Gets array of all "CategoryRelationStructure" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationStructure[] getCategoryRelationStructureArray() {
        return getXmlObjectArray(PROPERTY_QNAME[11], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationStructure[0]);
    }

    /**
     * Gets ith "CategoryRelationStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationStructure getCategoryRelationStructureArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationStructure)get_store().find_element_user(PROPERTY_QNAME[11], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "CategoryRelationStructure" element
     */
    @Override
    public int sizeOfCategoryRelationStructureArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[11]);
        }
    }

    /**
     * Sets array of all "CategoryRelationStructure" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setCategoryRelationStructureArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationStructure[] categoryRelationStructureArray) {
        check_orphaned();
        arraySetterHelper(categoryRelationStructureArray, PROPERTY_QNAME[11]);
    }

    /**
     * Sets ith "CategoryRelationStructure" element
     */
    @Override
    public void setCategoryRelationStructureArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationStructure categoryRelationStructure) {
        generatedSetterHelperImpl(categoryRelationStructure, PROPERTY_QNAME[11], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "CategoryRelationStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationStructure insertNewCategoryRelationStructure(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationStructure)get_store().insert_element_user(PROPERTY_QNAME[11], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "CategoryRelationStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationStructure addNewCategoryRelationStructure() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationStructure)get_store().add_element_user(PROPERTY_QNAME[11]);
            return target;
        }
    }

    /**
     * Removes the ith "CategoryRelationStructure" element
     */
    @Override
    public void removeCategoryRelationStructure(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[11], i);
        }
    }

    /**
     * Gets a List of "CategoryRelationship" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship> getCategoryRelationshipList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getCategoryRelationshipArray,
                this::setCategoryRelationshipArray,
                this::insertNewCategoryRelationship,
                this::removeCategoryRelationship,
                this::sizeOfCategoryRelationshipArray
            );
        }
    }

    /**
     * Gets array of all "CategoryRelationship" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship[] getCategoryRelationshipArray() {
        return getXmlObjectArray(PROPERTY_QNAME[12], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship[0]);
    }

    /**
     * Gets ith "CategoryRelationship" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship getCategoryRelationshipArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship)get_store().find_element_user(PROPERTY_QNAME[12], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "CategoryRelationship" element
     */
    @Override
    public int sizeOfCategoryRelationshipArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[12]);
        }
    }

    /**
     * Sets array of all "CategoryRelationship" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setCategoryRelationshipArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship[] categoryRelationshipArray) {
        check_orphaned();
        arraySetterHelper(categoryRelationshipArray, PROPERTY_QNAME[12]);
    }

    /**
     * Sets ith "CategoryRelationship" element
     */
    @Override
    public void setCategoryRelationshipArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship categoryRelationship) {
        generatedSetterHelperImpl(categoryRelationship, PROPERTY_QNAME[12], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "CategoryRelationship" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship insertNewCategoryRelationship(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship)get_store().insert_element_user(PROPERTY_QNAME[12], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "CategoryRelationship" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship addNewCategoryRelationship() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship)get_store().add_element_user(PROPERTY_QNAME[12]);
            return target;
        }
    }

    /**
     * Removes the ith "CategoryRelationship" element
     */
    @Override
    public void removeCategoryRelationship(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[12], i);
        }
    }

    /**
     * Gets a List of "CategorySet" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategorySet> getCategorySetList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getCategorySetArray,
                this::setCategorySetArray,
                this::insertNewCategorySet,
                this::removeCategorySet,
                this::sizeOfCategorySetArray
            );
        }
    }

    /**
     * Gets array of all "CategorySet" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategorySet[] getCategorySetArray() {
        return getXmlObjectArray(PROPERTY_QNAME[13], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategorySet[0]);
    }

    /**
     * Gets ith "CategorySet" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategorySet getCategorySetArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategorySet target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategorySet)get_store().find_element_user(PROPERTY_QNAME[13], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "CategorySet" element
     */
    @Override
    public int sizeOfCategorySetArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[13]);
        }
    }

    /**
     * Sets array of all "CategorySet" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setCategorySetArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategorySet[] categorySetArray) {
        check_orphaned();
        arraySetterHelper(categorySetArray, PROPERTY_QNAME[13]);
    }

    /**
     * Sets ith "CategorySet" element
     */
    @Override
    public void setCategorySetArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategorySet categorySet) {
        generatedSetterHelperImpl(categorySet, PROPERTY_QNAME[13], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "CategorySet" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategorySet insertNewCategorySet(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategorySet target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategorySet)get_store().insert_element_user(PROPERTY_QNAME[13], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "CategorySet" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategorySet addNewCategorySet() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategorySet target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategorySet)get_store().add_element_user(PROPERTY_QNAME[13]);
            return target;
        }
    }

    /**
     * Removes the ith "CategorySet" element
     */
    @Override
    public void removeCategorySet(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[13], i);
        }
    }

    /**
     * Gets a List of "CategoryStatistic" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic> getCategoryStatisticList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getCategoryStatisticArray,
                this::setCategoryStatisticArray,
                this::insertNewCategoryStatistic,
                this::removeCategoryStatistic,
                this::sizeOfCategoryStatisticArray
            );
        }
    }

    /**
     * Gets array of all "CategoryStatistic" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic[] getCategoryStatisticArray() {
        return getXmlObjectArray(PROPERTY_QNAME[14], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic[0]);
    }

    /**
     * Gets ith "CategoryStatistic" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic getCategoryStatisticArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic)get_store().find_element_user(PROPERTY_QNAME[14], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "CategoryStatistic" element
     */
    @Override
    public int sizeOfCategoryStatisticArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[14]);
        }
    }

    /**
     * Sets array of all "CategoryStatistic" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setCategoryStatisticArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic[] categoryStatisticArray) {
        check_orphaned();
        arraySetterHelper(categoryStatisticArray, PROPERTY_QNAME[14]);
    }

    /**
     * Sets ith "CategoryStatistic" element
     */
    @Override
    public void setCategoryStatisticArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic categoryStatistic) {
        generatedSetterHelperImpl(categoryStatistic, PROPERTY_QNAME[14], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "CategoryStatistic" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic insertNewCategoryStatistic(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic)get_store().insert_element_user(PROPERTY_QNAME[14], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "CategoryStatistic" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic addNewCategoryStatistic() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic)get_store().add_element_user(PROPERTY_QNAME[14]);
            return target;
        }
    }

    /**
     * Removes the ith "CategoryStatistic" element
     */
    @Override
    public void removeCategoryStatistic(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[14], i);
        }
    }

    /**
     * Gets a List of "ClassificationFamily" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationFamily> getClassificationFamilyList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getClassificationFamilyArray,
                this::setClassificationFamilyArray,
                this::insertNewClassificationFamily,
                this::removeClassificationFamily,
                this::sizeOfClassificationFamilyArray
            );
        }
    }

    /**
     * Gets array of all "ClassificationFamily" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationFamily[] getClassificationFamilyArray() {
        return getXmlObjectArray(PROPERTY_QNAME[15], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationFamily[0]);
    }

    /**
     * Gets ith "ClassificationFamily" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationFamily getClassificationFamilyArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationFamily target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationFamily)get_store().find_element_user(PROPERTY_QNAME[15], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ClassificationFamily" element
     */
    @Override
    public int sizeOfClassificationFamilyArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[15]);
        }
    }

    /**
     * Sets array of all "ClassificationFamily" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setClassificationFamilyArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationFamily[] classificationFamilyArray) {
        check_orphaned();
        arraySetterHelper(classificationFamilyArray, PROPERTY_QNAME[15]);
    }

    /**
     * Sets ith "ClassificationFamily" element
     */
    @Override
    public void setClassificationFamilyArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationFamily classificationFamily) {
        generatedSetterHelperImpl(classificationFamily, PROPERTY_QNAME[15], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ClassificationFamily" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationFamily insertNewClassificationFamily(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationFamily target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationFamily)get_store().insert_element_user(PROPERTY_QNAME[15], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ClassificationFamily" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationFamily addNewClassificationFamily() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationFamily target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationFamily)get_store().add_element_user(PROPERTY_QNAME[15]);
            return target;
        }
    }

    /**
     * Removes the ith "ClassificationFamily" element
     */
    @Override
    public void removeClassificationFamily(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[15], i);
        }
    }

    /**
     * Gets a List of "ClassificationIndex" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex> getClassificationIndexList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getClassificationIndexArray,
                this::setClassificationIndexArray,
                this::insertNewClassificationIndex,
                this::removeClassificationIndex,
                this::sizeOfClassificationIndexArray
            );
        }
    }

    /**
     * Gets array of all "ClassificationIndex" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex[] getClassificationIndexArray() {
        return getXmlObjectArray(PROPERTY_QNAME[16], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex[0]);
    }

    /**
     * Gets ith "ClassificationIndex" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex getClassificationIndexArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex)get_store().find_element_user(PROPERTY_QNAME[16], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ClassificationIndex" element
     */
    @Override
    public int sizeOfClassificationIndexArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[16]);
        }
    }

    /**
     * Sets array of all "ClassificationIndex" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setClassificationIndexArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex[] classificationIndexArray) {
        check_orphaned();
        arraySetterHelper(classificationIndexArray, PROPERTY_QNAME[16]);
    }

    /**
     * Sets ith "ClassificationIndex" element
     */
    @Override
    public void setClassificationIndexArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex classificationIndex) {
        generatedSetterHelperImpl(classificationIndex, PROPERTY_QNAME[16], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ClassificationIndex" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex insertNewClassificationIndex(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex)get_store().insert_element_user(PROPERTY_QNAME[16], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ClassificationIndex" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex addNewClassificationIndex() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex)get_store().add_element_user(PROPERTY_QNAME[16]);
            return target;
        }
    }

    /**
     * Removes the ith "ClassificationIndex" element
     */
    @Override
    public void removeClassificationIndex(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[16], i);
        }
    }

    /**
     * Gets a List of "ClassificationIndexEntry" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntry> getClassificationIndexEntryList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getClassificationIndexEntryArray,
                this::setClassificationIndexEntryArray,
                this::insertNewClassificationIndexEntry,
                this::removeClassificationIndexEntry,
                this::sizeOfClassificationIndexEntryArray
            );
        }
    }

    /**
     * Gets array of all "ClassificationIndexEntry" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntry[] getClassificationIndexEntryArray() {
        return getXmlObjectArray(PROPERTY_QNAME[17], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntry[0]);
    }

    /**
     * Gets ith "ClassificationIndexEntry" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntry getClassificationIndexEntryArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntry)get_store().find_element_user(PROPERTY_QNAME[17], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ClassificationIndexEntry" element
     */
    @Override
    public int sizeOfClassificationIndexEntryArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[17]);
        }
    }

    /**
     * Sets array of all "ClassificationIndexEntry" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setClassificationIndexEntryArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntry[] classificationIndexEntryArray) {
        check_orphaned();
        arraySetterHelper(classificationIndexEntryArray, PROPERTY_QNAME[17]);
    }

    /**
     * Sets ith "ClassificationIndexEntry" element
     */
    @Override
    public void setClassificationIndexEntryArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntry classificationIndexEntry) {
        generatedSetterHelperImpl(classificationIndexEntry, PROPERTY_QNAME[17], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ClassificationIndexEntry" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntry insertNewClassificationIndexEntry(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntry)get_store().insert_element_user(PROPERTY_QNAME[17], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ClassificationIndexEntry" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntry addNewClassificationIndexEntry() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntry)get_store().add_element_user(PROPERTY_QNAME[17]);
            return target;
        }
    }

    /**
     * Removes the ith "ClassificationIndexEntry" element
     */
    @Override
    public void removeClassificationIndexEntry(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[17], i);
        }
    }

    /**
     * Gets a List of "ClassificationIndexEntryPosition" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntryPosition> getClassificationIndexEntryPositionList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getClassificationIndexEntryPositionArray,
                this::setClassificationIndexEntryPositionArray,
                this::insertNewClassificationIndexEntryPosition,
                this::removeClassificationIndexEntryPosition,
                this::sizeOfClassificationIndexEntryPositionArray
            );
        }
    }

    /**
     * Gets array of all "ClassificationIndexEntryPosition" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntryPosition[] getClassificationIndexEntryPositionArray() {
        return getXmlObjectArray(PROPERTY_QNAME[18], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntryPosition[0]);
    }

    /**
     * Gets ith "ClassificationIndexEntryPosition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntryPosition getClassificationIndexEntryPositionArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntryPosition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntryPosition)get_store().find_element_user(PROPERTY_QNAME[18], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ClassificationIndexEntryPosition" element
     */
    @Override
    public int sizeOfClassificationIndexEntryPositionArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[18]);
        }
    }

    /**
     * Sets array of all "ClassificationIndexEntryPosition" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setClassificationIndexEntryPositionArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntryPosition[] classificationIndexEntryPositionArray) {
        check_orphaned();
        arraySetterHelper(classificationIndexEntryPositionArray, PROPERTY_QNAME[18]);
    }

    /**
     * Sets ith "ClassificationIndexEntryPosition" element
     */
    @Override
    public void setClassificationIndexEntryPositionArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntryPosition classificationIndexEntryPosition) {
        generatedSetterHelperImpl(classificationIndexEntryPosition, PROPERTY_QNAME[18], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ClassificationIndexEntryPosition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntryPosition insertNewClassificationIndexEntryPosition(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntryPosition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntryPosition)get_store().insert_element_user(PROPERTY_QNAME[18], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ClassificationIndexEntryPosition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntryPosition addNewClassificationIndexEntryPosition() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntryPosition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntryPosition)get_store().add_element_user(PROPERTY_QNAME[18]);
            return target;
        }
    }

    /**
     * Removes the ith "ClassificationIndexEntryPosition" element
     */
    @Override
    public void removeClassificationIndexEntryPosition(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[18], i);
        }
    }

    /**
     * Gets a List of "ClassificationItem" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItem> getClassificationItemList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getClassificationItemArray,
                this::setClassificationItemArray,
                this::insertNewClassificationItem,
                this::removeClassificationItem,
                this::sizeOfClassificationItemArray
            );
        }
    }

    /**
     * Gets array of all "ClassificationItem" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItem[] getClassificationItemArray() {
        return getXmlObjectArray(PROPERTY_QNAME[19], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItem[0]);
    }

    /**
     * Gets ith "ClassificationItem" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItem getClassificationItemArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItem target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItem)get_store().find_element_user(PROPERTY_QNAME[19], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ClassificationItem" element
     */
    @Override
    public int sizeOfClassificationItemArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[19]);
        }
    }

    /**
     * Sets array of all "ClassificationItem" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setClassificationItemArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItem[] classificationItemArray) {
        check_orphaned();
        arraySetterHelper(classificationItemArray, PROPERTY_QNAME[19]);
    }

    /**
     * Sets ith "ClassificationItem" element
     */
    @Override
    public void setClassificationItemArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItem classificationItem) {
        generatedSetterHelperImpl(classificationItem, PROPERTY_QNAME[19], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ClassificationItem" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItem insertNewClassificationItem(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItem target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItem)get_store().insert_element_user(PROPERTY_QNAME[19], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ClassificationItem" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItem addNewClassificationItem() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItem target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItem)get_store().add_element_user(PROPERTY_QNAME[19]);
            return target;
        }
    }

    /**
     * Removes the ith "ClassificationItem" element
     */
    @Override
    public void removeClassificationItem(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[19], i);
        }
    }

    /**
     * Gets a List of "ClassificationItemPosition" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemPosition> getClassificationItemPositionList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getClassificationItemPositionArray,
                this::setClassificationItemPositionArray,
                this::insertNewClassificationItemPosition,
                this::removeClassificationItemPosition,
                this::sizeOfClassificationItemPositionArray
            );
        }
    }

    /**
     * Gets array of all "ClassificationItemPosition" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemPosition[] getClassificationItemPositionArray() {
        return getXmlObjectArray(PROPERTY_QNAME[20], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemPosition[0]);
    }

    /**
     * Gets ith "ClassificationItemPosition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemPosition getClassificationItemPositionArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemPosition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemPosition)get_store().find_element_user(PROPERTY_QNAME[20], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ClassificationItemPosition" element
     */
    @Override
    public int sizeOfClassificationItemPositionArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[20]);
        }
    }

    /**
     * Sets array of all "ClassificationItemPosition" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setClassificationItemPositionArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemPosition[] classificationItemPositionArray) {
        check_orphaned();
        arraySetterHelper(classificationItemPositionArray, PROPERTY_QNAME[20]);
    }

    /**
     * Sets ith "ClassificationItemPosition" element
     */
    @Override
    public void setClassificationItemPositionArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemPosition classificationItemPosition) {
        generatedSetterHelperImpl(classificationItemPosition, PROPERTY_QNAME[20], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ClassificationItemPosition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemPosition insertNewClassificationItemPosition(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemPosition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemPosition)get_store().insert_element_user(PROPERTY_QNAME[20], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ClassificationItemPosition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemPosition addNewClassificationItemPosition() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemPosition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemPosition)get_store().add_element_user(PROPERTY_QNAME[20]);
            return target;
        }
    }

    /**
     * Removes the ith "ClassificationItemPosition" element
     */
    @Override
    public void removeClassificationItemPosition(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[20], i);
        }
    }

    /**
     * Gets a List of "ClassificationItemRelationship" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship> getClassificationItemRelationshipList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getClassificationItemRelationshipArray,
                this::setClassificationItemRelationshipArray,
                this::insertNewClassificationItemRelationship,
                this::removeClassificationItemRelationship,
                this::sizeOfClassificationItemRelationshipArray
            );
        }
    }

    /**
     * Gets array of all "ClassificationItemRelationship" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship[] getClassificationItemRelationshipArray() {
        return getXmlObjectArray(PROPERTY_QNAME[21], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship[0]);
    }

    /**
     * Gets ith "ClassificationItemRelationship" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship getClassificationItemRelationshipArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship)get_store().find_element_user(PROPERTY_QNAME[21], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ClassificationItemRelationship" element
     */
    @Override
    public int sizeOfClassificationItemRelationshipArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[21]);
        }
    }

    /**
     * Sets array of all "ClassificationItemRelationship" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setClassificationItemRelationshipArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship[] classificationItemRelationshipArray) {
        check_orphaned();
        arraySetterHelper(classificationItemRelationshipArray, PROPERTY_QNAME[21]);
    }

    /**
     * Sets ith "ClassificationItemRelationship" element
     */
    @Override
    public void setClassificationItemRelationshipArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship classificationItemRelationship) {
        generatedSetterHelperImpl(classificationItemRelationship, PROPERTY_QNAME[21], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ClassificationItemRelationship" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship insertNewClassificationItemRelationship(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship)get_store().insert_element_user(PROPERTY_QNAME[21], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ClassificationItemRelationship" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship addNewClassificationItemRelationship() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship)get_store().add_element_user(PROPERTY_QNAME[21]);
            return target;
        }
    }

    /**
     * Removes the ith "ClassificationItemRelationship" element
     */
    @Override
    public void removeClassificationItemRelationship(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[21], i);
        }
    }

    /**
     * Gets a List of "ClassificationItemStructure" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemStructure> getClassificationItemStructureList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getClassificationItemStructureArray,
                this::setClassificationItemStructureArray,
                this::insertNewClassificationItemStructure,
                this::removeClassificationItemStructure,
                this::sizeOfClassificationItemStructureArray
            );
        }
    }

    /**
     * Gets array of all "ClassificationItemStructure" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemStructure[] getClassificationItemStructureArray() {
        return getXmlObjectArray(PROPERTY_QNAME[22], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemStructure[0]);
    }

    /**
     * Gets ith "ClassificationItemStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemStructure getClassificationItemStructureArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemStructure)get_store().find_element_user(PROPERTY_QNAME[22], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ClassificationItemStructure" element
     */
    @Override
    public int sizeOfClassificationItemStructureArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[22]);
        }
    }

    /**
     * Sets array of all "ClassificationItemStructure" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setClassificationItemStructureArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemStructure[] classificationItemStructureArray) {
        check_orphaned();
        arraySetterHelper(classificationItemStructureArray, PROPERTY_QNAME[22]);
    }

    /**
     * Sets ith "ClassificationItemStructure" element
     */
    @Override
    public void setClassificationItemStructureArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemStructure classificationItemStructure) {
        generatedSetterHelperImpl(classificationItemStructure, PROPERTY_QNAME[22], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ClassificationItemStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemStructure insertNewClassificationItemStructure(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemStructure)get_store().insert_element_user(PROPERTY_QNAME[22], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ClassificationItemStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemStructure addNewClassificationItemStructure() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemStructure)get_store().add_element_user(PROPERTY_QNAME[22]);
            return target;
        }
    }

    /**
     * Removes the ith "ClassificationItemStructure" element
     */
    @Override
    public void removeClassificationItemStructure(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[22], i);
        }
    }

    /**
     * Gets a List of "ClassificationPosition" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationPosition> getClassificationPositionList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getClassificationPositionArray,
                this::setClassificationPositionArray,
                this::insertNewClassificationPosition,
                this::removeClassificationPosition,
                this::sizeOfClassificationPositionArray
            );
        }
    }

    /**
     * Gets array of all "ClassificationPosition" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationPosition[] getClassificationPositionArray() {
        return getXmlObjectArray(PROPERTY_QNAME[23], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationPosition[0]);
    }

    /**
     * Gets ith "ClassificationPosition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationPosition getClassificationPositionArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationPosition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationPosition)get_store().find_element_user(PROPERTY_QNAME[23], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ClassificationPosition" element
     */
    @Override
    public int sizeOfClassificationPositionArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[23]);
        }
    }

    /**
     * Sets array of all "ClassificationPosition" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setClassificationPositionArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationPosition[] classificationPositionArray) {
        check_orphaned();
        arraySetterHelper(classificationPositionArray, PROPERTY_QNAME[23]);
    }

    /**
     * Sets ith "ClassificationPosition" element
     */
    @Override
    public void setClassificationPositionArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationPosition classificationPosition) {
        generatedSetterHelperImpl(classificationPosition, PROPERTY_QNAME[23], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ClassificationPosition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationPosition insertNewClassificationPosition(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationPosition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationPosition)get_store().insert_element_user(PROPERTY_QNAME[23], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ClassificationPosition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationPosition addNewClassificationPosition() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationPosition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationPosition)get_store().add_element_user(PROPERTY_QNAME[23]);
            return target;
        }
    }

    /**
     * Removes the ith "ClassificationPosition" element
     */
    @Override
    public void removeClassificationPosition(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[23], i);
        }
    }

    /**
     * Gets a List of "ClassificationSeries" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeries> getClassificationSeriesList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getClassificationSeriesArray,
                this::setClassificationSeriesArray,
                this::insertNewClassificationSeries,
                this::removeClassificationSeries,
                this::sizeOfClassificationSeriesArray
            );
        }
    }

    /**
     * Gets array of all "ClassificationSeries" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeries[] getClassificationSeriesArray() {
        return getXmlObjectArray(PROPERTY_QNAME[24], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeries[0]);
    }

    /**
     * Gets ith "ClassificationSeries" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeries getClassificationSeriesArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeries target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeries)get_store().find_element_user(PROPERTY_QNAME[24], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ClassificationSeries" element
     */
    @Override
    public int sizeOfClassificationSeriesArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[24]);
        }
    }

    /**
     * Sets array of all "ClassificationSeries" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setClassificationSeriesArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeries[] classificationSeriesArray) {
        check_orphaned();
        arraySetterHelper(classificationSeriesArray, PROPERTY_QNAME[24]);
    }

    /**
     * Sets ith "ClassificationSeries" element
     */
    @Override
    public void setClassificationSeriesArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeries classificationSeries) {
        generatedSetterHelperImpl(classificationSeries, PROPERTY_QNAME[24], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ClassificationSeries" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeries insertNewClassificationSeries(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeries target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeries)get_store().insert_element_user(PROPERTY_QNAME[24], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ClassificationSeries" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeries addNewClassificationSeries() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeries target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeries)get_store().add_element_user(PROPERTY_QNAME[24]);
            return target;
        }
    }

    /**
     * Removes the ith "ClassificationSeries" element
     */
    @Override
    public void removeClassificationSeries(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[24], i);
        }
    }

    /**
     * Gets a List of "ClassificationSeriesStructure" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeriesStructure> getClassificationSeriesStructureList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getClassificationSeriesStructureArray,
                this::setClassificationSeriesStructureArray,
                this::insertNewClassificationSeriesStructure,
                this::removeClassificationSeriesStructure,
                this::sizeOfClassificationSeriesStructureArray
            );
        }
    }

    /**
     * Gets array of all "ClassificationSeriesStructure" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeriesStructure[] getClassificationSeriesStructureArray() {
        return getXmlObjectArray(PROPERTY_QNAME[25], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeriesStructure[0]);
    }

    /**
     * Gets ith "ClassificationSeriesStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeriesStructure getClassificationSeriesStructureArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeriesStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeriesStructure)get_store().find_element_user(PROPERTY_QNAME[25], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ClassificationSeriesStructure" element
     */
    @Override
    public int sizeOfClassificationSeriesStructureArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[25]);
        }
    }

    /**
     * Sets array of all "ClassificationSeriesStructure" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setClassificationSeriesStructureArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeriesStructure[] classificationSeriesStructureArray) {
        check_orphaned();
        arraySetterHelper(classificationSeriesStructureArray, PROPERTY_QNAME[25]);
    }

    /**
     * Sets ith "ClassificationSeriesStructure" element
     */
    @Override
    public void setClassificationSeriesStructureArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeriesStructure classificationSeriesStructure) {
        generatedSetterHelperImpl(classificationSeriesStructure, PROPERTY_QNAME[25], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ClassificationSeriesStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeriesStructure insertNewClassificationSeriesStructure(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeriesStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeriesStructure)get_store().insert_element_user(PROPERTY_QNAME[25], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ClassificationSeriesStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeriesStructure addNewClassificationSeriesStructure() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeriesStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeriesStructure)get_store().add_element_user(PROPERTY_QNAME[25]);
            return target;
        }
    }

    /**
     * Removes the ith "ClassificationSeriesStructure" element
     */
    @Override
    public void removeClassificationSeriesStructure(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[25], i);
        }
    }

    /**
     * Gets a List of "Code" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Code> getCodeList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getCodeArray,
                this::setCodeArray,
                this::insertNewCode,
                this::removeCode,
                this::sizeOfCodeArray
            );
        }
    }

    /**
     * Gets array of all "Code" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Code[] getCodeArray() {
        return getXmlObjectArray(PROPERTY_QNAME[26], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.Code[0]);
    }

    /**
     * Gets ith "Code" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Code getCodeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Code target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Code)get_store().find_element_user(PROPERTY_QNAME[26], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Code" element
     */
    @Override
    public int sizeOfCodeArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[26]);
        }
    }

    /**
     * Sets array of all "Code" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setCodeArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Code[] codeArray) {
        check_orphaned();
        arraySetterHelper(codeArray, PROPERTY_QNAME[26]);
    }

    /**
     * Sets ith "Code" element
     */
    @Override
    public void setCodeArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Code code) {
        generatedSetterHelperImpl(code, PROPERTY_QNAME[26], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Code" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Code insertNewCode(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Code target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Code)get_store().insert_element_user(PROPERTY_QNAME[26], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Code" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Code addNewCode() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Code target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Code)get_store().add_element_user(PROPERTY_QNAME[26]);
            return target;
        }
    }

    /**
     * Removes the ith "Code" element
     */
    @Override
    public void removeCode(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[26], i);
        }
    }

    /**
     * Gets a List of "CodeList" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeList> getCodeListList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getCodeListArray,
                this::setCodeListArray,
                this::insertNewCodeList,
                this::removeCodeList,
                this::sizeOfCodeListArray
            );
        }
    }

    /**
     * Gets array of all "CodeList" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeList[] getCodeListArray() {
        return getXmlObjectArray(PROPERTY_QNAME[27], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeList[0]);
    }

    /**
     * Gets ith "CodeList" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeList getCodeListArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeList target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeList)get_store().find_element_user(PROPERTY_QNAME[27], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "CodeList" element
     */
    @Override
    public int sizeOfCodeListArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[27]);
        }
    }

    /**
     * Sets array of all "CodeList" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setCodeListArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeList[] codeListArray) {
        check_orphaned();
        arraySetterHelper(codeListArray, PROPERTY_QNAME[27]);
    }

    /**
     * Sets ith "CodeList" element
     */
    @Override
    public void setCodeListArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeList codeList) {
        generatedSetterHelperImpl(codeList, PROPERTY_QNAME[27], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "CodeList" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeList insertNewCodeList(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeList target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeList)get_store().insert_element_user(PROPERTY_QNAME[27], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "CodeList" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeList addNewCodeList() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeList target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeList)get_store().add_element_user(PROPERTY_QNAME[27]);
            return target;
        }
    }

    /**
     * Removes the ith "CodeList" element
     */
    @Override
    public void removeCodeList(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[27], i);
        }
    }

    /**
     * Gets a List of "CodeListStructure" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeListStructure> getCodeListStructureList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getCodeListStructureArray,
                this::setCodeListStructureArray,
                this::insertNewCodeListStructure,
                this::removeCodeListStructure,
                this::sizeOfCodeListStructureArray
            );
        }
    }

    /**
     * Gets array of all "CodeListStructure" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeListStructure[] getCodeListStructureArray() {
        return getXmlObjectArray(PROPERTY_QNAME[28], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeListStructure[0]);
    }

    /**
     * Gets ith "CodeListStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeListStructure getCodeListStructureArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeListStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeListStructure)get_store().find_element_user(PROPERTY_QNAME[28], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "CodeListStructure" element
     */
    @Override
    public int sizeOfCodeListStructureArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[28]);
        }
    }

    /**
     * Sets array of all "CodeListStructure" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setCodeListStructureArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeListStructure[] codeListStructureArray) {
        check_orphaned();
        arraySetterHelper(codeListStructureArray, PROPERTY_QNAME[28]);
    }

    /**
     * Sets ith "CodeListStructure" element
     */
    @Override
    public void setCodeListStructureArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeListStructure codeListStructure) {
        generatedSetterHelperImpl(codeListStructure, PROPERTY_QNAME[28], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "CodeListStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeListStructure insertNewCodeListStructure(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeListStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeListStructure)get_store().insert_element_user(PROPERTY_QNAME[28], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "CodeListStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeListStructure addNewCodeListStructure() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeListStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeListStructure)get_store().add_element_user(PROPERTY_QNAME[28]);
            return target;
        }
    }

    /**
     * Removes the ith "CodeListStructure" element
     */
    @Override
    public void removeCodeListStructure(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[28], i);
        }
    }

    /**
     * Gets a List of "CodePosition" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodePosition> getCodePositionList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getCodePositionArray,
                this::setCodePositionArray,
                this::insertNewCodePosition,
                this::removeCodePosition,
                this::sizeOfCodePositionArray
            );
        }
    }

    /**
     * Gets array of all "CodePosition" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodePosition[] getCodePositionArray() {
        return getXmlObjectArray(PROPERTY_QNAME[29], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodePosition[0]);
    }

    /**
     * Gets ith "CodePosition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodePosition getCodePositionArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodePosition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodePosition)get_store().find_element_user(PROPERTY_QNAME[29], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "CodePosition" element
     */
    @Override
    public int sizeOfCodePositionArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[29]);
        }
    }

    /**
     * Sets array of all "CodePosition" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setCodePositionArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodePosition[] codePositionArray) {
        check_orphaned();
        arraySetterHelper(codePositionArray, PROPERTY_QNAME[29]);
    }

    /**
     * Sets ith "CodePosition" element
     */
    @Override
    public void setCodePositionArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodePosition codePosition) {
        generatedSetterHelperImpl(codePosition, PROPERTY_QNAME[29], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "CodePosition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodePosition insertNewCodePosition(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodePosition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodePosition)get_store().insert_element_user(PROPERTY_QNAME[29], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "CodePosition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodePosition addNewCodePosition() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodePosition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodePosition)get_store().add_element_user(PROPERTY_QNAME[29]);
            return target;
        }
    }

    /**
     * Removes the ith "CodePosition" element
     */
    @Override
    public void removeCodePosition(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[29], i);
        }
    }

    /**
     * Gets a List of "CodeRelationship" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship> getCodeRelationshipList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getCodeRelationshipArray,
                this::setCodeRelationshipArray,
                this::insertNewCodeRelationship,
                this::removeCodeRelationship,
                this::sizeOfCodeRelationshipArray
            );
        }
    }

    /**
     * Gets array of all "CodeRelationship" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship[] getCodeRelationshipArray() {
        return getXmlObjectArray(PROPERTY_QNAME[30], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship[0]);
    }

    /**
     * Gets ith "CodeRelationship" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship getCodeRelationshipArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship)get_store().find_element_user(PROPERTY_QNAME[30], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "CodeRelationship" element
     */
    @Override
    public int sizeOfCodeRelationshipArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[30]);
        }
    }

    /**
     * Sets array of all "CodeRelationship" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setCodeRelationshipArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship[] codeRelationshipArray) {
        check_orphaned();
        arraySetterHelper(codeRelationshipArray, PROPERTY_QNAME[30]);
    }

    /**
     * Sets ith "CodeRelationship" element
     */
    @Override
    public void setCodeRelationshipArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship codeRelationship) {
        generatedSetterHelperImpl(codeRelationship, PROPERTY_QNAME[30], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "CodeRelationship" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship insertNewCodeRelationship(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship)get_store().insert_element_user(PROPERTY_QNAME[30], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "CodeRelationship" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship addNewCodeRelationship() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship)get_store().add_element_user(PROPERTY_QNAME[30]);
            return target;
        }
    }

    /**
     * Removes the ith "CodeRelationship" element
     */
    @Override
    public void removeCodeRelationship(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[30], i);
        }
    }

    /**
     * Gets a List of "ComponentPosition" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ComponentPosition> getComponentPositionList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getComponentPositionArray,
                this::setComponentPositionArray,
                this::insertNewComponentPosition,
                this::removeComponentPosition,
                this::sizeOfComponentPositionArray
            );
        }
    }

    /**
     * Gets array of all "ComponentPosition" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ComponentPosition[] getComponentPositionArray() {
        return getXmlObjectArray(PROPERTY_QNAME[31], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.ComponentPosition[0]);
    }

    /**
     * Gets ith "ComponentPosition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ComponentPosition getComponentPositionArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ComponentPosition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ComponentPosition)get_store().find_element_user(PROPERTY_QNAME[31], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ComponentPosition" element
     */
    @Override
    public int sizeOfComponentPositionArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[31]);
        }
    }

    /**
     * Sets array of all "ComponentPosition" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setComponentPositionArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ComponentPosition[] componentPositionArray) {
        check_orphaned();
        arraySetterHelper(componentPositionArray, PROPERTY_QNAME[31]);
    }

    /**
     * Sets ith "ComponentPosition" element
     */
    @Override
    public void setComponentPositionArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ComponentPosition componentPosition) {
        generatedSetterHelperImpl(componentPosition, PROPERTY_QNAME[31], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ComponentPosition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ComponentPosition insertNewComponentPosition(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ComponentPosition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ComponentPosition)get_store().insert_element_user(PROPERTY_QNAME[31], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ComponentPosition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ComponentPosition addNewComponentPosition() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ComponentPosition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ComponentPosition)get_store().add_element_user(PROPERTY_QNAME[31]);
            return target;
        }
    }

    /**
     * Removes the ith "ComponentPosition" element
     */
    @Override
    public void removeComponentPosition(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[31], i);
        }
    }

    /**
     * Gets a List of "Concept" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Concept> getConceptList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getConceptArray,
                this::setConceptArray,
                this::insertNewConcept,
                this::removeConcept,
                this::sizeOfConceptArray
            );
        }
    }

    /**
     * Gets array of all "Concept" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Concept[] getConceptArray() {
        return getXmlObjectArray(PROPERTY_QNAME[32], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.Concept[0]);
    }

    /**
     * Gets ith "Concept" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Concept getConceptArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Concept target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Concept)get_store().find_element_user(PROPERTY_QNAME[32], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Concept" element
     */
    @Override
    public int sizeOfConceptArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[32]);
        }
    }

    /**
     * Sets array of all "Concept" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setConceptArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Concept[] conceptArray) {
        check_orphaned();
        arraySetterHelper(conceptArray, PROPERTY_QNAME[32]);
    }

    /**
     * Sets ith "Concept" element
     */
    @Override
    public void setConceptArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Concept concept) {
        generatedSetterHelperImpl(concept, PROPERTY_QNAME[32], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Concept" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Concept insertNewConcept(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Concept target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Concept)get_store().insert_element_user(PROPERTY_QNAME[32], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Concept" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Concept addNewConcept() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Concept target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Concept)get_store().add_element_user(PROPERTY_QNAME[32]);
            return target;
        }
    }

    /**
     * Removes the ith "Concept" element
     */
    @Override
    public void removeConcept(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[32], i);
        }
    }

    /**
     * Gets a List of "ConceptMap" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptMap> getConceptMapList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getConceptMapArray,
                this::setConceptMapArray,
                this::insertNewConceptMap,
                this::removeConceptMap,
                this::sizeOfConceptMapArray
            );
        }
    }

    /**
     * Gets array of all "ConceptMap" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptMap[] getConceptMapArray() {
        return getXmlObjectArray(PROPERTY_QNAME[33], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptMap[0]);
    }

    /**
     * Gets ith "ConceptMap" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptMap getConceptMapArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptMap target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptMap)get_store().find_element_user(PROPERTY_QNAME[33], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ConceptMap" element
     */
    @Override
    public int sizeOfConceptMapArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[33]);
        }
    }

    /**
     * Sets array of all "ConceptMap" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setConceptMapArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptMap[] conceptMapArray) {
        check_orphaned();
        arraySetterHelper(conceptMapArray, PROPERTY_QNAME[33]);
    }

    /**
     * Sets ith "ConceptMap" element
     */
    @Override
    public void setConceptMapArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptMap conceptMap) {
        generatedSetterHelperImpl(conceptMap, PROPERTY_QNAME[33], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ConceptMap" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptMap insertNewConceptMap(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptMap target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptMap)get_store().insert_element_user(PROPERTY_QNAME[33], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ConceptMap" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptMap addNewConceptMap() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptMap target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptMap)get_store().add_element_user(PROPERTY_QNAME[33]);
            return target;
        }
    }

    /**
     * Removes the ith "ConceptMap" element
     */
    @Override
    public void removeConceptMap(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[33], i);
        }
    }

    /**
     * Gets a List of "ConceptRelationship" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptRelationship> getConceptRelationshipList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getConceptRelationshipArray,
                this::setConceptRelationshipArray,
                this::insertNewConceptRelationship,
                this::removeConceptRelationship,
                this::sizeOfConceptRelationshipArray
            );
        }
    }

    /**
     * Gets array of all "ConceptRelationship" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptRelationship[] getConceptRelationshipArray() {
        return getXmlObjectArray(PROPERTY_QNAME[34], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptRelationship[0]);
    }

    /**
     * Gets ith "ConceptRelationship" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptRelationship getConceptRelationshipArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptRelationship target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptRelationship)get_store().find_element_user(PROPERTY_QNAME[34], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ConceptRelationship" element
     */
    @Override
    public int sizeOfConceptRelationshipArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[34]);
        }
    }

    /**
     * Sets array of all "ConceptRelationship" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setConceptRelationshipArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptRelationship[] conceptRelationshipArray) {
        check_orphaned();
        arraySetterHelper(conceptRelationshipArray, PROPERTY_QNAME[34]);
    }

    /**
     * Sets ith "ConceptRelationship" element
     */
    @Override
    public void setConceptRelationshipArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptRelationship conceptRelationship) {
        generatedSetterHelperImpl(conceptRelationship, PROPERTY_QNAME[34], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ConceptRelationship" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptRelationship insertNewConceptRelationship(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptRelationship target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptRelationship)get_store().insert_element_user(PROPERTY_QNAME[34], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ConceptRelationship" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptRelationship addNewConceptRelationship() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptRelationship target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptRelationship)get_store().add_element_user(PROPERTY_QNAME[34]);
            return target;
        }
    }

    /**
     * Removes the ith "ConceptRelationship" element
     */
    @Override
    public void removeConceptRelationship(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[34], i);
        }
    }

    /**
     * Gets a List of "ConceptStructure" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptStructure> getConceptStructureList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getConceptStructureArray,
                this::setConceptStructureArray,
                this::insertNewConceptStructure,
                this::removeConceptStructure,
                this::sizeOfConceptStructureArray
            );
        }
    }

    /**
     * Gets array of all "ConceptStructure" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptStructure[] getConceptStructureArray() {
        return getXmlObjectArray(PROPERTY_QNAME[35], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptStructure[0]);
    }

    /**
     * Gets ith "ConceptStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptStructure getConceptStructureArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptStructure)get_store().find_element_user(PROPERTY_QNAME[35], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ConceptStructure" element
     */
    @Override
    public int sizeOfConceptStructureArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[35]);
        }
    }

    /**
     * Sets array of all "ConceptStructure" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setConceptStructureArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptStructure[] conceptStructureArray) {
        check_orphaned();
        arraySetterHelper(conceptStructureArray, PROPERTY_QNAME[35]);
    }

    /**
     * Sets ith "ConceptStructure" element
     */
    @Override
    public void setConceptStructureArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptStructure conceptStructure) {
        generatedSetterHelperImpl(conceptStructure, PROPERTY_QNAME[35], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ConceptStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptStructure insertNewConceptStructure(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptStructure)get_store().insert_element_user(PROPERTY_QNAME[35], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ConceptStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptStructure addNewConceptStructure() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptStructure)get_store().add_element_user(PROPERTY_QNAME[35]);
            return target;
        }
    }

    /**
     * Removes the ith "ConceptStructure" element
     */
    @Override
    public void removeConceptStructure(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[35], i);
        }
    }

    /**
     * Gets a List of "ConceptSystem" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystem> getConceptSystemList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getConceptSystemArray,
                this::setConceptSystemArray,
                this::insertNewConceptSystem,
                this::removeConceptSystem,
                this::sizeOfConceptSystemArray
            );
        }
    }

    /**
     * Gets array of all "ConceptSystem" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystem[] getConceptSystemArray() {
        return getXmlObjectArray(PROPERTY_QNAME[36], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystem[0]);
    }

    /**
     * Gets ith "ConceptSystem" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystem getConceptSystemArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystem target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystem)get_store().find_element_user(PROPERTY_QNAME[36], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ConceptSystem" element
     */
    @Override
    public int sizeOfConceptSystemArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[36]);
        }
    }

    /**
     * Sets array of all "ConceptSystem" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setConceptSystemArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystem[] conceptSystemArray) {
        check_orphaned();
        arraySetterHelper(conceptSystemArray, PROPERTY_QNAME[36]);
    }

    /**
     * Sets ith "ConceptSystem" element
     */
    @Override
    public void setConceptSystemArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystem conceptSystem) {
        generatedSetterHelperImpl(conceptSystem, PROPERTY_QNAME[36], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ConceptSystem" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystem insertNewConceptSystem(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystem target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystem)get_store().insert_element_user(PROPERTY_QNAME[36], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ConceptSystem" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystem addNewConceptSystem() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystem target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystem)get_store().add_element_user(PROPERTY_QNAME[36]);
            return target;
        }
    }

    /**
     * Removes the ith "ConceptSystem" element
     */
    @Override
    public void removeConceptSystem(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[36], i);
        }
    }

    /**
     * Gets a List of "ConceptSystemCorrespondence" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystemCorrespondence> getConceptSystemCorrespondenceList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getConceptSystemCorrespondenceArray,
                this::setConceptSystemCorrespondenceArray,
                this::insertNewConceptSystemCorrespondence,
                this::removeConceptSystemCorrespondence,
                this::sizeOfConceptSystemCorrespondenceArray
            );
        }
    }

    /**
     * Gets array of all "ConceptSystemCorrespondence" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystemCorrespondence[] getConceptSystemCorrespondenceArray() {
        return getXmlObjectArray(PROPERTY_QNAME[37], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystemCorrespondence[0]);
    }

    /**
     * Gets ith "ConceptSystemCorrespondence" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystemCorrespondence getConceptSystemCorrespondenceArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystemCorrespondence target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystemCorrespondence)get_store().find_element_user(PROPERTY_QNAME[37], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ConceptSystemCorrespondence" element
     */
    @Override
    public int sizeOfConceptSystemCorrespondenceArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[37]);
        }
    }

    /**
     * Sets array of all "ConceptSystemCorrespondence" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setConceptSystemCorrespondenceArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystemCorrespondence[] conceptSystemCorrespondenceArray) {
        check_orphaned();
        arraySetterHelper(conceptSystemCorrespondenceArray, PROPERTY_QNAME[37]);
    }

    /**
     * Sets ith "ConceptSystemCorrespondence" element
     */
    @Override
    public void setConceptSystemCorrespondenceArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystemCorrespondence conceptSystemCorrespondence) {
        generatedSetterHelperImpl(conceptSystemCorrespondence, PROPERTY_QNAME[37], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ConceptSystemCorrespondence" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystemCorrespondence insertNewConceptSystemCorrespondence(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystemCorrespondence target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystemCorrespondence)get_store().insert_element_user(PROPERTY_QNAME[37], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ConceptSystemCorrespondence" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystemCorrespondence addNewConceptSystemCorrespondence() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystemCorrespondence target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystemCorrespondence)get_store().add_element_user(PROPERTY_QNAME[37]);
            return target;
        }
    }

    /**
     * Removes the ith "ConceptSystemCorrespondence" element
     */
    @Override
    public void removeConceptSystemCorrespondence(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[37], i);
        }
    }

    /**
     * Gets a List of "ConceptualDomain" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualDomain> getConceptualDomainList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getConceptualDomainArray,
                this::setConceptualDomainArray,
                this::insertNewConceptualDomain,
                this::removeConceptualDomain,
                this::sizeOfConceptualDomainArray
            );
        }
    }

    /**
     * Gets array of all "ConceptualDomain" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualDomain[] getConceptualDomainArray() {
        return getXmlObjectArray(PROPERTY_QNAME[38], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualDomain[0]);
    }

    /**
     * Gets ith "ConceptualDomain" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualDomain getConceptualDomainArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualDomain target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualDomain)get_store().find_element_user(PROPERTY_QNAME[38], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ConceptualDomain" element
     */
    @Override
    public int sizeOfConceptualDomainArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[38]);
        }
    }

    /**
     * Sets array of all "ConceptualDomain" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setConceptualDomainArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualDomain[] conceptualDomainArray) {
        check_orphaned();
        arraySetterHelper(conceptualDomainArray, PROPERTY_QNAME[38]);
    }

    /**
     * Sets ith "ConceptualDomain" element
     */
    @Override
    public void setConceptualDomainArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualDomain conceptualDomain) {
        generatedSetterHelperImpl(conceptualDomain, PROPERTY_QNAME[38], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ConceptualDomain" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualDomain insertNewConceptualDomain(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualDomain target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualDomain)get_store().insert_element_user(PROPERTY_QNAME[38], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ConceptualDomain" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualDomain addNewConceptualDomain() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualDomain target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualDomain)get_store().add_element_user(PROPERTY_QNAME[38]);
            return target;
        }
    }

    /**
     * Removes the ith "ConceptualDomain" element
     */
    @Override
    public void removeConceptualDomain(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[38], i);
        }
    }

    /**
     * Gets a List of "ConceptualValue" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualValue> getConceptualValueList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getConceptualValueArray,
                this::setConceptualValueArray,
                this::insertNewConceptualValue,
                this::removeConceptualValue,
                this::sizeOfConceptualValueArray
            );
        }
    }

    /**
     * Gets array of all "ConceptualValue" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualValue[] getConceptualValueArray() {
        return getXmlObjectArray(PROPERTY_QNAME[39], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualValue[0]);
    }

    /**
     * Gets ith "ConceptualValue" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualValue getConceptualValueArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualValue target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualValue)get_store().find_element_user(PROPERTY_QNAME[39], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ConceptualValue" element
     */
    @Override
    public int sizeOfConceptualValueArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[39]);
        }
    }

    /**
     * Sets array of all "ConceptualValue" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setConceptualValueArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualValue[] conceptualValueArray) {
        check_orphaned();
        arraySetterHelper(conceptualValueArray, PROPERTY_QNAME[39]);
    }

    /**
     * Sets ith "ConceptualValue" element
     */
    @Override
    public void setConceptualValueArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualValue conceptualValue) {
        generatedSetterHelperImpl(conceptualValue, PROPERTY_QNAME[39], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ConceptualValue" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualValue insertNewConceptualValue(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualValue target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualValue)get_store().insert_element_user(PROPERTY_QNAME[39], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ConceptualValue" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualValue addNewConceptualValue() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualValue target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualValue)get_store().add_element_user(PROPERTY_QNAME[39]);
            return target;
        }
    }

    /**
     * Removes the ith "ConceptualValue" element
     */
    @Override
    public void removeConceptualValue(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[39], i);
        }
    }

    /**
     * Gets a List of "ConceptualVariable" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable> getConceptualVariableList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getConceptualVariableArray,
                this::setConceptualVariableArray,
                this::insertNewConceptualVariable,
                this::removeConceptualVariable,
                this::sizeOfConceptualVariableArray
            );
        }
    }

    /**
     * Gets array of all "ConceptualVariable" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable[] getConceptualVariableArray() {
        return getXmlObjectArray(PROPERTY_QNAME[40], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable[0]);
    }

    /**
     * Gets ith "ConceptualVariable" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable getConceptualVariableArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable)get_store().find_element_user(PROPERTY_QNAME[40], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ConceptualVariable" element
     */
    @Override
    public int sizeOfConceptualVariableArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[40]);
        }
    }

    /**
     * Sets array of all "ConceptualVariable" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setConceptualVariableArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable[] conceptualVariableArray) {
        check_orphaned();
        arraySetterHelper(conceptualVariableArray, PROPERTY_QNAME[40]);
    }

    /**
     * Sets ith "ConceptualVariable" element
     */
    @Override
    public void setConceptualVariableArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable conceptualVariable) {
        generatedSetterHelperImpl(conceptualVariable, PROPERTY_QNAME[40], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ConceptualVariable" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable insertNewConceptualVariable(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable)get_store().insert_element_user(PROPERTY_QNAME[40], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ConceptualVariable" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable addNewConceptualVariable() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable)get_store().add_element_user(PROPERTY_QNAME[40]);
            return target;
        }
    }

    /**
     * Removes the ith "ConceptualVariable" element
     */
    @Override
    public void removeConceptualVariable(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[40], i);
        }
    }

    /**
     * Gets a List of "ConditionalControlLogic" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConditionalControlLogic> getConditionalControlLogicList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getConditionalControlLogicArray,
                this::setConditionalControlLogicArray,
                this::insertNewConditionalControlLogic,
                this::removeConditionalControlLogic,
                this::sizeOfConditionalControlLogicArray
            );
        }
    }

    /**
     * Gets array of all "ConditionalControlLogic" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConditionalControlLogic[] getConditionalControlLogicArray() {
        return getXmlObjectArray(PROPERTY_QNAME[41], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConditionalControlLogic[0]);
    }

    /**
     * Gets ith "ConditionalControlLogic" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConditionalControlLogic getConditionalControlLogicArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConditionalControlLogic target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConditionalControlLogic)get_store().find_element_user(PROPERTY_QNAME[41], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ConditionalControlLogic" element
     */
    @Override
    public int sizeOfConditionalControlLogicArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[41]);
        }
    }

    /**
     * Sets array of all "ConditionalControlLogic" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setConditionalControlLogicArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConditionalControlLogic[] conditionalControlLogicArray) {
        check_orphaned();
        arraySetterHelper(conditionalControlLogicArray, PROPERTY_QNAME[41]);
    }

    /**
     * Sets ith "ConditionalControlLogic" element
     */
    @Override
    public void setConditionalControlLogicArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConditionalControlLogic conditionalControlLogic) {
        generatedSetterHelperImpl(conditionalControlLogic, PROPERTY_QNAME[41], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ConditionalControlLogic" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConditionalControlLogic insertNewConditionalControlLogic(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConditionalControlLogic target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConditionalControlLogic)get_store().insert_element_user(PROPERTY_QNAME[41], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ConditionalControlLogic" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConditionalControlLogic addNewConditionalControlLogic() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConditionalControlLogic target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConditionalControlLogic)get_store().add_element_user(PROPERTY_QNAME[41]);
            return target;
        }
    }

    /**
     * Removes the ith "ConditionalControlLogic" element
     */
    @Override
    public void removeConditionalControlLogic(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[41], i);
        }
    }

    /**
     * Gets a List of "ContextualComponent" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContextualComponent> getContextualComponentList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getContextualComponentArray,
                this::setContextualComponentArray,
                this::insertNewContextualComponent,
                this::removeContextualComponent,
                this::sizeOfContextualComponentArray
            );
        }
    }

    /**
     * Gets array of all "ContextualComponent" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContextualComponent[] getContextualComponentArray() {
        return getXmlObjectArray(PROPERTY_QNAME[42], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContextualComponent[0]);
    }

    /**
     * Gets ith "ContextualComponent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContextualComponent getContextualComponentArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContextualComponent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContextualComponent)get_store().find_element_user(PROPERTY_QNAME[42], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ContextualComponent" element
     */
    @Override
    public int sizeOfContextualComponentArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[42]);
        }
    }

    /**
     * Sets array of all "ContextualComponent" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setContextualComponentArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContextualComponent[] contextualComponentArray) {
        check_orphaned();
        arraySetterHelper(contextualComponentArray, PROPERTY_QNAME[42]);
    }

    /**
     * Sets ith "ContextualComponent" element
     */
    @Override
    public void setContextualComponentArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContextualComponent contextualComponent) {
        generatedSetterHelperImpl(contextualComponent, PROPERTY_QNAME[42], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ContextualComponent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContextualComponent insertNewContextualComponent(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContextualComponent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContextualComponent)get_store().insert_element_user(PROPERTY_QNAME[42], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ContextualComponent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContextualComponent addNewContextualComponent() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContextualComponent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContextualComponent)get_store().add_element_user(PROPERTY_QNAME[42]);
            return target;
        }
    }

    /**
     * Removes the ith "ContextualComponent" element
     */
    @Override
    public void removeContextualComponent(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[42], i);
        }
    }

    /**
     * Gets a List of "ControlLogic" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic> getControlLogicList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getControlLogicArray,
                this::setControlLogicArray,
                this::insertNewControlLogic,
                this::removeControlLogic,
                this::sizeOfControlLogicArray
            );
        }
    }

    /**
     * Gets array of all "ControlLogic" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic[] getControlLogicArray() {
        return getXmlObjectArray(PROPERTY_QNAME[43], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic[0]);
    }

    /**
     * Gets ith "ControlLogic" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic getControlLogicArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic)get_store().find_element_user(PROPERTY_QNAME[43], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ControlLogic" element
     */
    @Override
    public int sizeOfControlLogicArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[43]);
        }
    }

    /**
     * Sets array of all "ControlLogic" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setControlLogicArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic[] controlLogicArray) {
        check_orphaned();
        arraySetterHelper(controlLogicArray, PROPERTY_QNAME[43]);
    }

    /**
     * Sets ith "ControlLogic" element
     */
    @Override
    public void setControlLogicArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic controlLogic) {
        generatedSetterHelperImpl(controlLogic, PROPERTY_QNAME[43], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ControlLogic" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic insertNewControlLogic(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic)get_store().insert_element_user(PROPERTY_QNAME[43], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ControlLogic" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic addNewControlLogic() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic)get_store().add_element_user(PROPERTY_QNAME[43]);
            return target;
        }
    }

    /**
     * Removes the ith "ControlLogic" element
     */
    @Override
    public void removeControlLogic(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[43], i);
        }
    }

    /**
     * Gets a List of "CorrespondenceTable" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable> getCorrespondenceTableList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getCorrespondenceTableArray,
                this::setCorrespondenceTableArray,
                this::insertNewCorrespondenceTable,
                this::removeCorrespondenceTable,
                this::sizeOfCorrespondenceTableArray
            );
        }
    }

    /**
     * Gets array of all "CorrespondenceTable" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable[] getCorrespondenceTableArray() {
        return getXmlObjectArray(PROPERTY_QNAME[44], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable[0]);
    }

    /**
     * Gets ith "CorrespondenceTable" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable getCorrespondenceTableArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable)get_store().find_element_user(PROPERTY_QNAME[44], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "CorrespondenceTable" element
     */
    @Override
    public int sizeOfCorrespondenceTableArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[44]);
        }
    }

    /**
     * Sets array of all "CorrespondenceTable" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setCorrespondenceTableArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable[] correspondenceTableArray) {
        check_orphaned();
        arraySetterHelper(correspondenceTableArray, PROPERTY_QNAME[44]);
    }

    /**
     * Sets ith "CorrespondenceTable" element
     */
    @Override
    public void setCorrespondenceTableArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable correspondenceTable) {
        generatedSetterHelperImpl(correspondenceTable, PROPERTY_QNAME[44], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "CorrespondenceTable" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable insertNewCorrespondenceTable(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable)get_store().insert_element_user(PROPERTY_QNAME[44], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "CorrespondenceTable" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable addNewCorrespondenceTable() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable)get_store().add_element_user(PROPERTY_QNAME[44]);
            return target;
        }
    }

    /**
     * Removes the ith "CorrespondenceTable" element
     */
    @Override
    public void removeCorrespondenceTable(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[44], i);
        }
    }

    /**
     * Gets a List of "Curator" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Curator> getCuratorList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getCuratorArray,
                this::setCuratorArray,
                this::insertNewCurator,
                this::removeCurator,
                this::sizeOfCuratorArray
            );
        }
    }

    /**
     * Gets array of all "Curator" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Curator[] getCuratorArray() {
        return getXmlObjectArray(PROPERTY_QNAME[45], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.Curator[0]);
    }

    /**
     * Gets ith "Curator" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Curator getCuratorArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Curator target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Curator)get_store().find_element_user(PROPERTY_QNAME[45], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Curator" element
     */
    @Override
    public int sizeOfCuratorArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[45]);
        }
    }

    /**
     * Sets array of all "Curator" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setCuratorArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Curator[] curatorArray) {
        check_orphaned();
        arraySetterHelper(curatorArray, PROPERTY_QNAME[45]);
    }

    /**
     * Sets ith "Curator" element
     */
    @Override
    public void setCuratorArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Curator curator) {
        generatedSetterHelperImpl(curator, PROPERTY_QNAME[45], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Curator" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Curator insertNewCurator(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Curator target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Curator)get_store().insert_element_user(PROPERTY_QNAME[45], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Curator" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Curator addNewCurator() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Curator target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Curator)get_store().add_element_user(PROPERTY_QNAME[45]);
            return target;
        }
    }

    /**
     * Removes the ith "Curator" element
     */
    @Override
    public void removeCurator(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[45], i);
        }
    }

    /**
     * Gets a List of "DataPoint" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPoint> getDataPointList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getDataPointArray,
                this::setDataPointArray,
                this::insertNewDataPoint,
                this::removeDataPoint,
                this::sizeOfDataPointArray
            );
        }
    }

    /**
     * Gets array of all "DataPoint" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPoint[] getDataPointArray() {
        return getXmlObjectArray(PROPERTY_QNAME[46], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPoint[0]);
    }

    /**
     * Gets ith "DataPoint" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPoint getDataPointArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPoint target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPoint)get_store().find_element_user(PROPERTY_QNAME[46], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "DataPoint" element
     */
    @Override
    public int sizeOfDataPointArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[46]);
        }
    }

    /**
     * Sets array of all "DataPoint" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setDataPointArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPoint[] dataPointArray) {
        check_orphaned();
        arraySetterHelper(dataPointArray, PROPERTY_QNAME[46]);
    }

    /**
     * Sets ith "DataPoint" element
     */
    @Override
    public void setDataPointArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPoint dataPoint) {
        generatedSetterHelperImpl(dataPoint, PROPERTY_QNAME[46], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataPoint" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPoint insertNewDataPoint(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPoint target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPoint)get_store().insert_element_user(PROPERTY_QNAME[46], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "DataPoint" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPoint addNewDataPoint() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPoint target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPoint)get_store().add_element_user(PROPERTY_QNAME[46]);
            return target;
        }
    }

    /**
     * Removes the ith "DataPoint" element
     */
    @Override
    public void removeDataPoint(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[46], i);
        }
    }

    /**
     * Gets a List of "DataPointPosition" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointPosition> getDataPointPositionList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getDataPointPositionArray,
                this::setDataPointPositionArray,
                this::insertNewDataPointPosition,
                this::removeDataPointPosition,
                this::sizeOfDataPointPositionArray
            );
        }
    }

    /**
     * Gets array of all "DataPointPosition" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointPosition[] getDataPointPositionArray() {
        return getXmlObjectArray(PROPERTY_QNAME[47], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointPosition[0]);
    }

    /**
     * Gets ith "DataPointPosition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointPosition getDataPointPositionArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointPosition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointPosition)get_store().find_element_user(PROPERTY_QNAME[47], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "DataPointPosition" element
     */
    @Override
    public int sizeOfDataPointPositionArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[47]);
        }
    }

    /**
     * Sets array of all "DataPointPosition" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setDataPointPositionArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointPosition[] dataPointPositionArray) {
        check_orphaned();
        arraySetterHelper(dataPointPositionArray, PROPERTY_QNAME[47]);
    }

    /**
     * Sets ith "DataPointPosition" element
     */
    @Override
    public void setDataPointPositionArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointPosition dataPointPosition) {
        generatedSetterHelperImpl(dataPointPosition, PROPERTY_QNAME[47], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataPointPosition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointPosition insertNewDataPointPosition(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointPosition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointPosition)get_store().insert_element_user(PROPERTY_QNAME[47], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "DataPointPosition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointPosition addNewDataPointPosition() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointPosition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointPosition)get_store().add_element_user(PROPERTY_QNAME[47]);
            return target;
        }
    }

    /**
     * Removes the ith "DataPointPosition" element
     */
    @Override
    public void removeDataPointPosition(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[47], i);
        }
    }

    /**
     * Gets a List of "DataPointRelationship" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship> getDataPointRelationshipList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getDataPointRelationshipArray,
                this::setDataPointRelationshipArray,
                this::insertNewDataPointRelationship,
                this::removeDataPointRelationship,
                this::sizeOfDataPointRelationshipArray
            );
        }
    }

    /**
     * Gets array of all "DataPointRelationship" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship[] getDataPointRelationshipArray() {
        return getXmlObjectArray(PROPERTY_QNAME[48], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship[0]);
    }

    /**
     * Gets ith "DataPointRelationship" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship getDataPointRelationshipArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship)get_store().find_element_user(PROPERTY_QNAME[48], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "DataPointRelationship" element
     */
    @Override
    public int sizeOfDataPointRelationshipArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[48]);
        }
    }

    /**
     * Sets array of all "DataPointRelationship" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setDataPointRelationshipArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship[] dataPointRelationshipArray) {
        check_orphaned();
        arraySetterHelper(dataPointRelationshipArray, PROPERTY_QNAME[48]);
    }

    /**
     * Sets ith "DataPointRelationship" element
     */
    @Override
    public void setDataPointRelationshipArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship dataPointRelationship) {
        generatedSetterHelperImpl(dataPointRelationship, PROPERTY_QNAME[48], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataPointRelationship" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship insertNewDataPointRelationship(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship)get_store().insert_element_user(PROPERTY_QNAME[48], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "DataPointRelationship" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship addNewDataPointRelationship() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship)get_store().add_element_user(PROPERTY_QNAME[48]);
            return target;
        }
    }

    /**
     * Removes the ith "DataPointRelationship" element
     */
    @Override
    public void removeDataPointRelationship(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[48], i);
        }
    }

    /**
     * Gets a List of "DataSet" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataSet> getDataSetList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getDataSetArray,
                this::setDataSetArray,
                this::insertNewDataSet,
                this::removeDataSet,
                this::sizeOfDataSetArray
            );
        }
    }

    /**
     * Gets array of all "DataSet" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataSet[] getDataSetArray() {
        return getXmlObjectArray(PROPERTY_QNAME[49], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataSet[0]);
    }

    /**
     * Gets ith "DataSet" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataSet getDataSetArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataSet target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataSet)get_store().find_element_user(PROPERTY_QNAME[49], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "DataSet" element
     */
    @Override
    public int sizeOfDataSetArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[49]);
        }
    }

    /**
     * Sets array of all "DataSet" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setDataSetArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataSet[] dataSetArray) {
        check_orphaned();
        arraySetterHelper(dataSetArray, PROPERTY_QNAME[49]);
    }

    /**
     * Sets ith "DataSet" element
     */
    @Override
    public void setDataSetArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataSet dataSet) {
        generatedSetterHelperImpl(dataSet, PROPERTY_QNAME[49], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataSet" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataSet insertNewDataSet(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataSet target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataSet)get_store().insert_element_user(PROPERTY_QNAME[49], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "DataSet" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataSet addNewDataSet() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataSet target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataSet)get_store().add_element_user(PROPERTY_QNAME[49]);
            return target;
        }
    }

    /**
     * Removes the ith "DataSet" element
     */
    @Override
    public void removeDataSet(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[49], i);
        }
    }

    /**
     * Gets a List of "DataStore" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore> getDataStoreList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getDataStoreArray,
                this::setDataStoreArray,
                this::insertNewDataStore,
                this::removeDataStore,
                this::sizeOfDataStoreArray
            );
        }
    }

    /**
     * Gets array of all "DataStore" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore[] getDataStoreArray() {
        return getXmlObjectArray(PROPERTY_QNAME[50], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore[0]);
    }

    /**
     * Gets ith "DataStore" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore getDataStoreArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore)get_store().find_element_user(PROPERTY_QNAME[50], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "DataStore" element
     */
    @Override
    public int sizeOfDataStoreArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[50]);
        }
    }

    /**
     * Sets array of all "DataStore" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setDataStoreArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore[] dataStoreArray) {
        check_orphaned();
        arraySetterHelper(dataStoreArray, PROPERTY_QNAME[50]);
    }

    /**
     * Sets ith "DataStore" element
     */
    @Override
    public void setDataStoreArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore dataStore) {
        generatedSetterHelperImpl(dataStore, PROPERTY_QNAME[50], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataStore" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore insertNewDataStore(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore)get_store().insert_element_user(PROPERTY_QNAME[50], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "DataStore" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore addNewDataStore() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore)get_store().add_element_user(PROPERTY_QNAME[50]);
            return target;
        }
    }

    /**
     * Removes the ith "DataStore" element
     */
    @Override
    public void removeDataStore(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[50], i);
        }
    }

    /**
     * Gets a List of "DataStructure" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructure> getDataStructureList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getDataStructureArray,
                this::setDataStructureArray,
                this::insertNewDataStructure,
                this::removeDataStructure,
                this::sizeOfDataStructureArray
            );
        }
    }

    /**
     * Gets array of all "DataStructure" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructure[] getDataStructureArray() {
        return getXmlObjectArray(PROPERTY_QNAME[51], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructure[0]);
    }

    /**
     * Gets ith "DataStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructure getDataStructureArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructure)get_store().find_element_user(PROPERTY_QNAME[51], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "DataStructure" element
     */
    @Override
    public int sizeOfDataStructureArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[51]);
        }
    }

    /**
     * Sets array of all "DataStructure" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setDataStructureArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructure[] dataStructureArray) {
        check_orphaned();
        arraySetterHelper(dataStructureArray, PROPERTY_QNAME[51]);
    }

    /**
     * Sets ith "DataStructure" element
     */
    @Override
    public void setDataStructureArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructure dataStructure) {
        generatedSetterHelperImpl(dataStructure, PROPERTY_QNAME[51], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructure insertNewDataStructure(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructure)get_store().insert_element_user(PROPERTY_QNAME[51], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "DataStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructure addNewDataStructure() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructure)get_store().add_element_user(PROPERTY_QNAME[51]);
            return target;
        }
    }

    /**
     * Removes the ith "DataStructure" element
     */
    @Override
    public void removeDataStructure(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[51], i);
        }
    }

    /**
     * Gets a List of "DataStructureComponent" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructureComponent> getDataStructureComponentList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getDataStructureComponentArray,
                this::setDataStructureComponentArray,
                this::insertNewDataStructureComponent,
                this::removeDataStructureComponent,
                this::sizeOfDataStructureComponentArray
            );
        }
    }

    /**
     * Gets array of all "DataStructureComponent" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructureComponent[] getDataStructureComponentArray() {
        return getXmlObjectArray(PROPERTY_QNAME[52], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructureComponent[0]);
    }

    /**
     * Gets ith "DataStructureComponent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructureComponent getDataStructureComponentArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructureComponent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructureComponent)get_store().find_element_user(PROPERTY_QNAME[52], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "DataStructureComponent" element
     */
    @Override
    public int sizeOfDataStructureComponentArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[52]);
        }
    }

    /**
     * Sets array of all "DataStructureComponent" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setDataStructureComponentArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructureComponent[] dataStructureComponentArray) {
        check_orphaned();
        arraySetterHelper(dataStructureComponentArray, PROPERTY_QNAME[52]);
    }

    /**
     * Sets ith "DataStructureComponent" element
     */
    @Override
    public void setDataStructureComponentArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructureComponent dataStructureComponent) {
        generatedSetterHelperImpl(dataStructureComponent, PROPERTY_QNAME[52], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataStructureComponent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructureComponent insertNewDataStructureComponent(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructureComponent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructureComponent)get_store().insert_element_user(PROPERTY_QNAME[52], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "DataStructureComponent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructureComponent addNewDataStructureComponent() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructureComponent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructureComponent)get_store().add_element_user(PROPERTY_QNAME[52]);
            return target;
        }
    }

    /**
     * Removes the ith "DataStructureComponent" element
     */
    @Override
    public void removeDataStructureComponent(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[52], i);
        }
    }

    /**
     * Gets a List of "Datum" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum> getDatumList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getDatumArray,
                this::setDatumArray,
                this::insertNewDatum,
                this::removeDatum,
                this::sizeOfDatumArray
            );
        }
    }

    /**
     * Gets array of all "Datum" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum[] getDatumArray() {
        return getXmlObjectArray(PROPERTY_QNAME[53], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum[0]);
    }

    /**
     * Gets ith "Datum" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum getDatumArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum)get_store().find_element_user(PROPERTY_QNAME[53], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Datum" element
     */
    @Override
    public int sizeOfDatumArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[53]);
        }
    }

    /**
     * Sets array of all "Datum" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setDatumArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum[] datumArray) {
        check_orphaned();
        arraySetterHelper(datumArray, PROPERTY_QNAME[53]);
    }

    /**
     * Sets ith "Datum" element
     */
    @Override
    public void setDatumArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum datum) {
        generatedSetterHelperImpl(datum, PROPERTY_QNAME[53], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Datum" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum insertNewDatum(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum)get_store().insert_element_user(PROPERTY_QNAME[53], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Datum" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum addNewDatum() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum)get_store().add_element_user(PROPERTY_QNAME[53]);
            return target;
        }
    }

    /**
     * Removes the ith "Datum" element
     */
    @Override
    public void removeDatum(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[53], i);
        }
    }

    /**
     * Gets a List of "Descriptor" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor> getDescriptorList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getDescriptorArray,
                this::setDescriptorArray,
                this::insertNewDescriptor,
                this::removeDescriptor,
                this::sizeOfDescriptorArray
            );
        }
    }

    /**
     * Gets array of all "Descriptor" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor[] getDescriptorArray() {
        return getXmlObjectArray(PROPERTY_QNAME[54], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor[0]);
    }

    /**
     * Gets ith "Descriptor" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor getDescriptorArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor)get_store().find_element_user(PROPERTY_QNAME[54], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Descriptor" element
     */
    @Override
    public int sizeOfDescriptorArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[54]);
        }
    }

    /**
     * Sets array of all "Descriptor" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setDescriptorArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor[] descriptorArray) {
        check_orphaned();
        arraySetterHelper(descriptorArray, PROPERTY_QNAME[54]);
    }

    /**
     * Sets ith "Descriptor" element
     */
    @Override
    public void setDescriptorArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor descriptor) {
        generatedSetterHelperImpl(descriptor, PROPERTY_QNAME[54], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Descriptor" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor insertNewDescriptor(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor)get_store().insert_element_user(PROPERTY_QNAME[54], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Descriptor" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor addNewDescriptor() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor)get_store().add_element_user(PROPERTY_QNAME[54]);
            return target;
        }
    }

    /**
     * Removes the ith "Descriptor" element
     */
    @Override
    public void removeDescriptor(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[54], i);
        }
    }

    /**
     * Gets a List of "DescriptorValueDomain" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorValueDomain> getDescriptorValueDomainList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getDescriptorValueDomainArray,
                this::setDescriptorValueDomainArray,
                this::insertNewDescriptorValueDomain,
                this::removeDescriptorValueDomain,
                this::sizeOfDescriptorValueDomainArray
            );
        }
    }

    /**
     * Gets array of all "DescriptorValueDomain" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorValueDomain[] getDescriptorValueDomainArray() {
        return getXmlObjectArray(PROPERTY_QNAME[55], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorValueDomain[0]);
    }

    /**
     * Gets ith "DescriptorValueDomain" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorValueDomain getDescriptorValueDomainArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorValueDomain target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorValueDomain)get_store().find_element_user(PROPERTY_QNAME[55], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "DescriptorValueDomain" element
     */
    @Override
    public int sizeOfDescriptorValueDomainArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[55]);
        }
    }

    /**
     * Sets array of all "DescriptorValueDomain" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setDescriptorValueDomainArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorValueDomain[] descriptorValueDomainArray) {
        check_orphaned();
        arraySetterHelper(descriptorValueDomainArray, PROPERTY_QNAME[55]);
    }

    /**
     * Sets ith "DescriptorValueDomain" element
     */
    @Override
    public void setDescriptorValueDomainArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorValueDomain descriptorValueDomain) {
        generatedSetterHelperImpl(descriptorValueDomain, PROPERTY_QNAME[55], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DescriptorValueDomain" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorValueDomain insertNewDescriptorValueDomain(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorValueDomain target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorValueDomain)get_store().insert_element_user(PROPERTY_QNAME[55], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "DescriptorValueDomain" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorValueDomain addNewDescriptorValueDomain() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorValueDomain target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorValueDomain)get_store().add_element_user(PROPERTY_QNAME[55]);
            return target;
        }
    }

    /**
     * Removes the ith "DescriptorValueDomain" element
     */
    @Override
    public void removeDescriptorValueDomain(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[55], i);
        }
    }

    /**
     * Gets a List of "DescriptorVariable" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorVariable> getDescriptorVariableList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getDescriptorVariableArray,
                this::setDescriptorVariableArray,
                this::insertNewDescriptorVariable,
                this::removeDescriptorVariable,
                this::sizeOfDescriptorVariableArray
            );
        }
    }

    /**
     * Gets array of all "DescriptorVariable" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorVariable[] getDescriptorVariableArray() {
        return getXmlObjectArray(PROPERTY_QNAME[56], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorVariable[0]);
    }

    /**
     * Gets ith "DescriptorVariable" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorVariable getDescriptorVariableArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorVariable target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorVariable)get_store().find_element_user(PROPERTY_QNAME[56], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "DescriptorVariable" element
     */
    @Override
    public int sizeOfDescriptorVariableArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[56]);
        }
    }

    /**
     * Sets array of all "DescriptorVariable" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setDescriptorVariableArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorVariable[] descriptorVariableArray) {
        check_orphaned();
        arraySetterHelper(descriptorVariableArray, PROPERTY_QNAME[56]);
    }

    /**
     * Sets ith "DescriptorVariable" element
     */
    @Override
    public void setDescriptorVariableArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorVariable descriptorVariable) {
        generatedSetterHelperImpl(descriptorVariable, PROPERTY_QNAME[56], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DescriptorVariable" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorVariable insertNewDescriptorVariable(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorVariable target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorVariable)get_store().insert_element_user(PROPERTY_QNAME[56], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "DescriptorVariable" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorVariable addNewDescriptorVariable() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorVariable target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorVariable)get_store().add_element_user(PROPERTY_QNAME[56]);
            return target;
        }
    }

    /**
     * Removes the ith "DescriptorVariable" element
     */
    @Override
    public void removeDescriptorVariable(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[56], i);
        }
    }

    /**
     * Gets a List of "DeterministicImperative" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DeterministicImperative> getDeterministicImperativeList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getDeterministicImperativeArray,
                this::setDeterministicImperativeArray,
                this::insertNewDeterministicImperative,
                this::removeDeterministicImperative,
                this::sizeOfDeterministicImperativeArray
            );
        }
    }

    /**
     * Gets array of all "DeterministicImperative" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DeterministicImperative[] getDeterministicImperativeArray() {
        return getXmlObjectArray(PROPERTY_QNAME[57], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.DeterministicImperative[0]);
    }

    /**
     * Gets ith "DeterministicImperative" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DeterministicImperative getDeterministicImperativeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DeterministicImperative target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DeterministicImperative)get_store().find_element_user(PROPERTY_QNAME[57], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "DeterministicImperative" element
     */
    @Override
    public int sizeOfDeterministicImperativeArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[57]);
        }
    }

    /**
     * Sets array of all "DeterministicImperative" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setDeterministicImperativeArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DeterministicImperative[] deterministicImperativeArray) {
        check_orphaned();
        arraySetterHelper(deterministicImperativeArray, PROPERTY_QNAME[57]);
    }

    /**
     * Sets ith "DeterministicImperative" element
     */
    @Override
    public void setDeterministicImperativeArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.DeterministicImperative deterministicImperative) {
        generatedSetterHelperImpl(deterministicImperative, PROPERTY_QNAME[57], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DeterministicImperative" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DeterministicImperative insertNewDeterministicImperative(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DeterministicImperative target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DeterministicImperative)get_store().insert_element_user(PROPERTY_QNAME[57], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "DeterministicImperative" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DeterministicImperative addNewDeterministicImperative() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DeterministicImperative target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DeterministicImperative)get_store().add_element_user(PROPERTY_QNAME[57]);
            return target;
        }
    }

    /**
     * Removes the ith "DeterministicImperative" element
     */
    @Override
    public void removeDeterministicImperative(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[57], i);
        }
    }

    /**
     * Gets a List of "DimensionComponent" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionComponent> getDimensionComponentList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getDimensionComponentArray,
                this::setDimensionComponentArray,
                this::insertNewDimensionComponent,
                this::removeDimensionComponent,
                this::sizeOfDimensionComponentArray
            );
        }
    }

    /**
     * Gets array of all "DimensionComponent" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionComponent[] getDimensionComponentArray() {
        return getXmlObjectArray(PROPERTY_QNAME[58], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionComponent[0]);
    }

    /**
     * Gets ith "DimensionComponent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionComponent getDimensionComponentArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionComponent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionComponent)get_store().find_element_user(PROPERTY_QNAME[58], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "DimensionComponent" element
     */
    @Override
    public int sizeOfDimensionComponentArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[58]);
        }
    }

    /**
     * Sets array of all "DimensionComponent" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setDimensionComponentArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionComponent[] dimensionComponentArray) {
        check_orphaned();
        arraySetterHelper(dimensionComponentArray, PROPERTY_QNAME[58]);
    }

    /**
     * Sets ith "DimensionComponent" element
     */
    @Override
    public void setDimensionComponentArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionComponent dimensionComponent) {
        generatedSetterHelperImpl(dimensionComponent, PROPERTY_QNAME[58], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DimensionComponent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionComponent insertNewDimensionComponent(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionComponent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionComponent)get_store().insert_element_user(PROPERTY_QNAME[58], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "DimensionComponent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionComponent addNewDimensionComponent() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionComponent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionComponent)get_store().add_element_user(PROPERTY_QNAME[58]);
            return target;
        }
    }

    /**
     * Removes the ith "DimensionComponent" element
     */
    @Override
    public void removeDimensionComponent(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[58], i);
        }
    }

    /**
     * Gets a List of "DimensionGroup" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionGroup> getDimensionGroupList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getDimensionGroupArray,
                this::setDimensionGroupArray,
                this::insertNewDimensionGroup,
                this::removeDimensionGroup,
                this::sizeOfDimensionGroupArray
            );
        }
    }

    /**
     * Gets array of all "DimensionGroup" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionGroup[] getDimensionGroupArray() {
        return getXmlObjectArray(PROPERTY_QNAME[59], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionGroup[0]);
    }

    /**
     * Gets ith "DimensionGroup" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionGroup getDimensionGroupArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionGroup target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionGroup)get_store().find_element_user(PROPERTY_QNAME[59], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "DimensionGroup" element
     */
    @Override
    public int sizeOfDimensionGroupArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[59]);
        }
    }

    /**
     * Sets array of all "DimensionGroup" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setDimensionGroupArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionGroup[] dimensionGroupArray) {
        check_orphaned();
        arraySetterHelper(dimensionGroupArray, PROPERTY_QNAME[59]);
    }

    /**
     * Sets ith "DimensionGroup" element
     */
    @Override
    public void setDimensionGroupArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionGroup dimensionGroup) {
        generatedSetterHelperImpl(dimensionGroup, PROPERTY_QNAME[59], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DimensionGroup" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionGroup insertNewDimensionGroup(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionGroup target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionGroup)get_store().insert_element_user(PROPERTY_QNAME[59], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "DimensionGroup" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionGroup addNewDimensionGroup() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionGroup target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionGroup)get_store().add_element_user(PROPERTY_QNAME[59]);
            return target;
        }
    }

    /**
     * Removes the ith "DimensionGroup" element
     */
    @Override
    public void removeDimensionGroup(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[59], i);
        }
    }

    /**
     * Gets a List of "DimensionalDataSet" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataSet> getDimensionalDataSetList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getDimensionalDataSetArray,
                this::setDimensionalDataSetArray,
                this::insertNewDimensionalDataSet,
                this::removeDimensionalDataSet,
                this::sizeOfDimensionalDataSetArray
            );
        }
    }

    /**
     * Gets array of all "DimensionalDataSet" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataSet[] getDimensionalDataSetArray() {
        return getXmlObjectArray(PROPERTY_QNAME[60], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataSet[0]);
    }

    /**
     * Gets ith "DimensionalDataSet" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataSet getDimensionalDataSetArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataSet target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataSet)get_store().find_element_user(PROPERTY_QNAME[60], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "DimensionalDataSet" element
     */
    @Override
    public int sizeOfDimensionalDataSetArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[60]);
        }
    }

    /**
     * Sets array of all "DimensionalDataSet" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setDimensionalDataSetArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataSet[] dimensionalDataSetArray) {
        check_orphaned();
        arraySetterHelper(dimensionalDataSetArray, PROPERTY_QNAME[60]);
    }

    /**
     * Sets ith "DimensionalDataSet" element
     */
    @Override
    public void setDimensionalDataSetArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataSet dimensionalDataSet) {
        generatedSetterHelperImpl(dimensionalDataSet, PROPERTY_QNAME[60], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DimensionalDataSet" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataSet insertNewDimensionalDataSet(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataSet target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataSet)get_store().insert_element_user(PROPERTY_QNAME[60], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "DimensionalDataSet" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataSet addNewDimensionalDataSet() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataSet target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataSet)get_store().add_element_user(PROPERTY_QNAME[60]);
            return target;
        }
    }

    /**
     * Removes the ith "DimensionalDataSet" element
     */
    @Override
    public void removeDimensionalDataSet(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[60], i);
        }
    }

    /**
     * Gets a List of "DimensionalDataStructure" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataStructure> getDimensionalDataStructureList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getDimensionalDataStructureArray,
                this::setDimensionalDataStructureArray,
                this::insertNewDimensionalDataStructure,
                this::removeDimensionalDataStructure,
                this::sizeOfDimensionalDataStructureArray
            );
        }
    }

    /**
     * Gets array of all "DimensionalDataStructure" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataStructure[] getDimensionalDataStructureArray() {
        return getXmlObjectArray(PROPERTY_QNAME[61], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataStructure[0]);
    }

    /**
     * Gets ith "DimensionalDataStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataStructure getDimensionalDataStructureArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataStructure)get_store().find_element_user(PROPERTY_QNAME[61], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "DimensionalDataStructure" element
     */
    @Override
    public int sizeOfDimensionalDataStructureArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[61]);
        }
    }

    /**
     * Sets array of all "DimensionalDataStructure" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setDimensionalDataStructureArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataStructure[] dimensionalDataStructureArray) {
        check_orphaned();
        arraySetterHelper(dimensionalDataStructureArray, PROPERTY_QNAME[61]);
    }

    /**
     * Sets ith "DimensionalDataStructure" element
     */
    @Override
    public void setDimensionalDataStructureArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataStructure dimensionalDataStructure) {
        generatedSetterHelperImpl(dimensionalDataStructure, PROPERTY_QNAME[61], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DimensionalDataStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataStructure insertNewDimensionalDataStructure(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataStructure)get_store().insert_element_user(PROPERTY_QNAME[61], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "DimensionalDataStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataStructure addNewDimensionalDataStructure() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataStructure)get_store().add_element_user(PROPERTY_QNAME[61]);
            return target;
        }
    }

    /**
     * Removes the ith "DimensionalDataStructure" element
     */
    @Override
    public void removeDimensionalDataStructure(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[61], i);
        }
    }

    /**
     * Gets a List of "DimensionalKey" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKey> getDimensionalKeyList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getDimensionalKeyArray,
                this::setDimensionalKeyArray,
                this::insertNewDimensionalKey,
                this::removeDimensionalKey,
                this::sizeOfDimensionalKeyArray
            );
        }
    }

    /**
     * Gets array of all "DimensionalKey" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKey[] getDimensionalKeyArray() {
        return getXmlObjectArray(PROPERTY_QNAME[62], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKey[0]);
    }

    /**
     * Gets ith "DimensionalKey" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKey getDimensionalKeyArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKey target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKey)get_store().find_element_user(PROPERTY_QNAME[62], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "DimensionalKey" element
     */
    @Override
    public int sizeOfDimensionalKeyArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[62]);
        }
    }

    /**
     * Sets array of all "DimensionalKey" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setDimensionalKeyArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKey[] dimensionalKeyArray) {
        check_orphaned();
        arraySetterHelper(dimensionalKeyArray, PROPERTY_QNAME[62]);
    }

    /**
     * Sets ith "DimensionalKey" element
     */
    @Override
    public void setDimensionalKeyArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKey dimensionalKey) {
        generatedSetterHelperImpl(dimensionalKey, PROPERTY_QNAME[62], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DimensionalKey" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKey insertNewDimensionalKey(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKey target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKey)get_store().insert_element_user(PROPERTY_QNAME[62], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "DimensionalKey" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKey addNewDimensionalKey() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKey target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKey)get_store().add_element_user(PROPERTY_QNAME[62]);
            return target;
        }
    }

    /**
     * Removes the ith "DimensionalKey" element
     */
    @Override
    public void removeDimensionalKey(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[62], i);
        }
    }

    /**
     * Gets a List of "DimensionalKeyDefinition" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinition> getDimensionalKeyDefinitionList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getDimensionalKeyDefinitionArray,
                this::setDimensionalKeyDefinitionArray,
                this::insertNewDimensionalKeyDefinition,
                this::removeDimensionalKeyDefinition,
                this::sizeOfDimensionalKeyDefinitionArray
            );
        }
    }

    /**
     * Gets array of all "DimensionalKeyDefinition" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinition[] getDimensionalKeyDefinitionArray() {
        return getXmlObjectArray(PROPERTY_QNAME[63], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinition[0]);
    }

    /**
     * Gets ith "DimensionalKeyDefinition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinition getDimensionalKeyDefinitionArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinition)get_store().find_element_user(PROPERTY_QNAME[63], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "DimensionalKeyDefinition" element
     */
    @Override
    public int sizeOfDimensionalKeyDefinitionArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[63]);
        }
    }

    /**
     * Sets array of all "DimensionalKeyDefinition" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setDimensionalKeyDefinitionArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinition[] dimensionalKeyDefinitionArray) {
        check_orphaned();
        arraySetterHelper(dimensionalKeyDefinitionArray, PROPERTY_QNAME[63]);
    }

    /**
     * Sets ith "DimensionalKeyDefinition" element
     */
    @Override
    public void setDimensionalKeyDefinitionArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinition dimensionalKeyDefinition) {
        generatedSetterHelperImpl(dimensionalKeyDefinition, PROPERTY_QNAME[63], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DimensionalKeyDefinition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinition insertNewDimensionalKeyDefinition(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinition)get_store().insert_element_user(PROPERTY_QNAME[63], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "DimensionalKeyDefinition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinition addNewDimensionalKeyDefinition() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinition)get_store().add_element_user(PROPERTY_QNAME[63]);
            return target;
        }
    }

    /**
     * Removes the ith "DimensionalKeyDefinition" element
     */
    @Override
    public void removeDimensionalKeyDefinition(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[63], i);
        }
    }

    /**
     * Gets a List of "DimensionalKeyDefinitionMember" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinitionMember> getDimensionalKeyDefinitionMemberList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getDimensionalKeyDefinitionMemberArray,
                this::setDimensionalKeyDefinitionMemberArray,
                this::insertNewDimensionalKeyDefinitionMember,
                this::removeDimensionalKeyDefinitionMember,
                this::sizeOfDimensionalKeyDefinitionMemberArray
            );
        }
    }

    /**
     * Gets array of all "DimensionalKeyDefinitionMember" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinitionMember[] getDimensionalKeyDefinitionMemberArray() {
        return getXmlObjectArray(PROPERTY_QNAME[64], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinitionMember[0]);
    }

    /**
     * Gets ith "DimensionalKeyDefinitionMember" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinitionMember getDimensionalKeyDefinitionMemberArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinitionMember target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinitionMember)get_store().find_element_user(PROPERTY_QNAME[64], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "DimensionalKeyDefinitionMember" element
     */
    @Override
    public int sizeOfDimensionalKeyDefinitionMemberArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[64]);
        }
    }

    /**
     * Sets array of all "DimensionalKeyDefinitionMember" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setDimensionalKeyDefinitionMemberArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinitionMember[] dimensionalKeyDefinitionMemberArray) {
        check_orphaned();
        arraySetterHelper(dimensionalKeyDefinitionMemberArray, PROPERTY_QNAME[64]);
    }

    /**
     * Sets ith "DimensionalKeyDefinitionMember" element
     */
    @Override
    public void setDimensionalKeyDefinitionMemberArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinitionMember dimensionalKeyDefinitionMember) {
        generatedSetterHelperImpl(dimensionalKeyDefinitionMember, PROPERTY_QNAME[64], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DimensionalKeyDefinitionMember" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinitionMember insertNewDimensionalKeyDefinitionMember(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinitionMember target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinitionMember)get_store().insert_element_user(PROPERTY_QNAME[64], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "DimensionalKeyDefinitionMember" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinitionMember addNewDimensionalKeyDefinitionMember() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinitionMember target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinitionMember)get_store().add_element_user(PROPERTY_QNAME[64]);
            return target;
        }
    }

    /**
     * Removes the ith "DimensionalKeyDefinitionMember" element
     */
    @Override
    public void removeDimensionalKeyDefinitionMember(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[64], i);
        }
    }

    /**
     * Gets a List of "DimensionalKeyMember" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyMember> getDimensionalKeyMemberList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getDimensionalKeyMemberArray,
                this::setDimensionalKeyMemberArray,
                this::insertNewDimensionalKeyMember,
                this::removeDimensionalKeyMember,
                this::sizeOfDimensionalKeyMemberArray
            );
        }
    }

    /**
     * Gets array of all "DimensionalKeyMember" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyMember[] getDimensionalKeyMemberArray() {
        return getXmlObjectArray(PROPERTY_QNAME[65], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyMember[0]);
    }

    /**
     * Gets ith "DimensionalKeyMember" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyMember getDimensionalKeyMemberArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyMember target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyMember)get_store().find_element_user(PROPERTY_QNAME[65], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "DimensionalKeyMember" element
     */
    @Override
    public int sizeOfDimensionalKeyMemberArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[65]);
        }
    }

    /**
     * Sets array of all "DimensionalKeyMember" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setDimensionalKeyMemberArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyMember[] dimensionalKeyMemberArray) {
        check_orphaned();
        arraySetterHelper(dimensionalKeyMemberArray, PROPERTY_QNAME[65]);
    }

    /**
     * Sets ith "DimensionalKeyMember" element
     */
    @Override
    public void setDimensionalKeyMemberArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyMember dimensionalKeyMember) {
        generatedSetterHelperImpl(dimensionalKeyMember, PROPERTY_QNAME[65], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DimensionalKeyMember" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyMember insertNewDimensionalKeyMember(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyMember target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyMember)get_store().insert_element_user(PROPERTY_QNAME[65], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "DimensionalKeyMember" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyMember addNewDimensionalKeyMember() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyMember target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyMember)get_store().add_element_user(PROPERTY_QNAME[65]);
            return target;
        }
    }

    /**
     * Removes the ith "DimensionalKeyMember" element
     */
    @Override
    public void removeDimensionalKeyMember(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[65], i);
        }
    }

    /**
     * Gets a List of "EnumerationDomain" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain> getEnumerationDomainList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getEnumerationDomainArray,
                this::setEnumerationDomainArray,
                this::insertNewEnumerationDomain,
                this::removeEnumerationDomain,
                this::sizeOfEnumerationDomainArray
            );
        }
    }

    /**
     * Gets array of all "EnumerationDomain" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain[] getEnumerationDomainArray() {
        return getXmlObjectArray(PROPERTY_QNAME[66], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain[0]);
    }

    /**
     * Gets ith "EnumerationDomain" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain getEnumerationDomainArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain)get_store().find_element_user(PROPERTY_QNAME[66], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "EnumerationDomain" element
     */
    @Override
    public int sizeOfEnumerationDomainArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[66]);
        }
    }

    /**
     * Sets array of all "EnumerationDomain" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setEnumerationDomainArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain[] enumerationDomainArray) {
        check_orphaned();
        arraySetterHelper(enumerationDomainArray, PROPERTY_QNAME[66]);
    }

    /**
     * Sets ith "EnumerationDomain" element
     */
    @Override
    public void setEnumerationDomainArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain enumerationDomain) {
        generatedSetterHelperImpl(enumerationDomain, PROPERTY_QNAME[66], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "EnumerationDomain" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain insertNewEnumerationDomain(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain)get_store().insert_element_user(PROPERTY_QNAME[66], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "EnumerationDomain" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain addNewEnumerationDomain() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain)get_store().add_element_user(PROPERTY_QNAME[66]);
            return target;
        }
    }

    /**
     * Removes the ith "EnumerationDomain" element
     */
    @Override
    public void removeEnumerationDomain(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[66], i);
        }
    }

    /**
     * Gets a List of "ForeignKey" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKey> getForeignKeyList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getForeignKeyArray,
                this::setForeignKeyArray,
                this::insertNewForeignKey,
                this::removeForeignKey,
                this::sizeOfForeignKeyArray
            );
        }
    }

    /**
     * Gets array of all "ForeignKey" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKey[] getForeignKeyArray() {
        return getXmlObjectArray(PROPERTY_QNAME[67], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKey[0]);
    }

    /**
     * Gets ith "ForeignKey" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKey getForeignKeyArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKey target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKey)get_store().find_element_user(PROPERTY_QNAME[67], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ForeignKey" element
     */
    @Override
    public int sizeOfForeignKeyArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[67]);
        }
    }

    /**
     * Sets array of all "ForeignKey" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setForeignKeyArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKey[] foreignKeyArray) {
        check_orphaned();
        arraySetterHelper(foreignKeyArray, PROPERTY_QNAME[67]);
    }

    /**
     * Sets ith "ForeignKey" element
     */
    @Override
    public void setForeignKeyArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKey foreignKey) {
        generatedSetterHelperImpl(foreignKey, PROPERTY_QNAME[67], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ForeignKey" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKey insertNewForeignKey(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKey target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKey)get_store().insert_element_user(PROPERTY_QNAME[67], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ForeignKey" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKey addNewForeignKey() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKey target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKey)get_store().add_element_user(PROPERTY_QNAME[67]);
            return target;
        }
    }

    /**
     * Removes the ith "ForeignKey" element
     */
    @Override
    public void removeForeignKey(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[67], i);
        }
    }

    /**
     * Gets a List of "ForeignKeyComponent" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKeyComponent> getForeignKeyComponentList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getForeignKeyComponentArray,
                this::setForeignKeyComponentArray,
                this::insertNewForeignKeyComponent,
                this::removeForeignKeyComponent,
                this::sizeOfForeignKeyComponentArray
            );
        }
    }

    /**
     * Gets array of all "ForeignKeyComponent" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKeyComponent[] getForeignKeyComponentArray() {
        return getXmlObjectArray(PROPERTY_QNAME[68], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKeyComponent[0]);
    }

    /**
     * Gets ith "ForeignKeyComponent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKeyComponent getForeignKeyComponentArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKeyComponent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKeyComponent)get_store().find_element_user(PROPERTY_QNAME[68], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ForeignKeyComponent" element
     */
    @Override
    public int sizeOfForeignKeyComponentArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[68]);
        }
    }

    /**
     * Sets array of all "ForeignKeyComponent" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setForeignKeyComponentArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKeyComponent[] foreignKeyComponentArray) {
        check_orphaned();
        arraySetterHelper(foreignKeyComponentArray, PROPERTY_QNAME[68]);
    }

    /**
     * Sets ith "ForeignKeyComponent" element
     */
    @Override
    public void setForeignKeyComponentArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKeyComponent foreignKeyComponent) {
        generatedSetterHelperImpl(foreignKeyComponent, PROPERTY_QNAME[68], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ForeignKeyComponent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKeyComponent insertNewForeignKeyComponent(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKeyComponent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKeyComponent)get_store().insert_element_user(PROPERTY_QNAME[68], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ForeignKeyComponent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKeyComponent addNewForeignKeyComponent() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKeyComponent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKeyComponent)get_store().add_element_user(PROPERTY_QNAME[68]);
            return target;
        }
    }

    /**
     * Removes the ith "ForeignKeyComponent" element
     */
    @Override
    public void removeForeignKeyComponent(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[68], i);
        }
    }

    /**
     * Gets a List of "IdentifierComponent" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.IdentifierComponent> getIdentifierComponentList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getIdentifierComponentArray,
                this::setIdentifierComponentArray,
                this::insertNewIdentifierComponent,
                this::removeIdentifierComponent,
                this::sizeOfIdentifierComponentArray
            );
        }
    }

    /**
     * Gets array of all "IdentifierComponent" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.IdentifierComponent[] getIdentifierComponentArray() {
        return getXmlObjectArray(PROPERTY_QNAME[69], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.IdentifierComponent[0]);
    }

    /**
     * Gets ith "IdentifierComponent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.IdentifierComponent getIdentifierComponentArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.IdentifierComponent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.IdentifierComponent)get_store().find_element_user(PROPERTY_QNAME[69], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "IdentifierComponent" element
     */
    @Override
    public int sizeOfIdentifierComponentArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[69]);
        }
    }

    /**
     * Sets array of all "IdentifierComponent" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setIdentifierComponentArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.IdentifierComponent[] identifierComponentArray) {
        check_orphaned();
        arraySetterHelper(identifierComponentArray, PROPERTY_QNAME[69]);
    }

    /**
     * Sets ith "IdentifierComponent" element
     */
    @Override
    public void setIdentifierComponentArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.IdentifierComponent identifierComponent) {
        generatedSetterHelperImpl(identifierComponent, PROPERTY_QNAME[69], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "IdentifierComponent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.IdentifierComponent insertNewIdentifierComponent(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.IdentifierComponent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.IdentifierComponent)get_store().insert_element_user(PROPERTY_QNAME[69], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "IdentifierComponent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.IdentifierComponent addNewIdentifierComponent() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.IdentifierComponent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.IdentifierComponent)get_store().add_element_user(PROPERTY_QNAME[69]);
            return target;
        }
    }

    /**
     * Removes the ith "IdentifierComponent" element
     */
    @Override
    public void removeIdentifierComponent(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[69], i);
        }
    }

    /**
     * Gets a List of "Individual" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Individual> getIndividualList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getIndividualArray,
                this::setIndividualArray,
                this::insertNewIndividual,
                this::removeIndividual,
                this::sizeOfIndividualArray
            );
        }
    }

    /**
     * Gets array of all "Individual" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Individual[] getIndividualArray() {
        return getXmlObjectArray(PROPERTY_QNAME[70], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.Individual[0]);
    }

    /**
     * Gets ith "Individual" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Individual getIndividualArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Individual target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Individual)get_store().find_element_user(PROPERTY_QNAME[70], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Individual" element
     */
    @Override
    public int sizeOfIndividualArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[70]);
        }
    }

    /**
     * Sets array of all "Individual" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setIndividualArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Individual[] individualArray) {
        check_orphaned();
        arraySetterHelper(individualArray, PROPERTY_QNAME[70]);
    }

    /**
     * Sets ith "Individual" element
     */
    @Override
    public void setIndividualArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Individual individual) {
        generatedSetterHelperImpl(individual, PROPERTY_QNAME[70], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Individual" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Individual insertNewIndividual(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Individual target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Individual)get_store().insert_element_user(PROPERTY_QNAME[70], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Individual" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Individual addNewIndividual() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Individual target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Individual)get_store().add_element_user(PROPERTY_QNAME[70]);
            return target;
        }
    }

    /**
     * Removes the ith "Individual" element
     */
    @Override
    public void removeIndividual(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[70], i);
        }
    }

    /**
     * Gets a List of "InformationFlowDefinition" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition> getInformationFlowDefinitionList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getInformationFlowDefinitionArray,
                this::setInformationFlowDefinitionArray,
                this::insertNewInformationFlowDefinition,
                this::removeInformationFlowDefinition,
                this::sizeOfInformationFlowDefinitionArray
            );
        }
    }

    /**
     * Gets array of all "InformationFlowDefinition" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition[] getInformationFlowDefinitionArray() {
        return getXmlObjectArray(PROPERTY_QNAME[71], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition[0]);
    }

    /**
     * Gets ith "InformationFlowDefinition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition getInformationFlowDefinitionArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition)get_store().find_element_user(PROPERTY_QNAME[71], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "InformationFlowDefinition" element
     */
    @Override
    public int sizeOfInformationFlowDefinitionArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[71]);
        }
    }

    /**
     * Sets array of all "InformationFlowDefinition" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setInformationFlowDefinitionArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition[] informationFlowDefinitionArray) {
        check_orphaned();
        arraySetterHelper(informationFlowDefinitionArray, PROPERTY_QNAME[71]);
    }

    /**
     * Sets ith "InformationFlowDefinition" element
     */
    @Override
    public void setInformationFlowDefinitionArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition informationFlowDefinition) {
        generatedSetterHelperImpl(informationFlowDefinition, PROPERTY_QNAME[71], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "InformationFlowDefinition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition insertNewInformationFlowDefinition(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition)get_store().insert_element_user(PROPERTY_QNAME[71], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "InformationFlowDefinition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition addNewInformationFlowDefinition() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition)get_store().add_element_user(PROPERTY_QNAME[71]);
            return target;
        }
    }

    /**
     * Removes the ith "InformationFlowDefinition" element
     */
    @Override
    public void removeInformationFlowDefinition(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[71], i);
        }
    }

    /**
     * Gets a List of "InstanceKey" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKey> getInstanceKeyList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getInstanceKeyArray,
                this::setInstanceKeyArray,
                this::insertNewInstanceKey,
                this::removeInstanceKey,
                this::sizeOfInstanceKeyArray
            );
        }
    }

    /**
     * Gets array of all "InstanceKey" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKey[] getInstanceKeyArray() {
        return getXmlObjectArray(PROPERTY_QNAME[72], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKey[0]);
    }

    /**
     * Gets ith "InstanceKey" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKey getInstanceKeyArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKey target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKey)get_store().find_element_user(PROPERTY_QNAME[72], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "InstanceKey" element
     */
    @Override
    public int sizeOfInstanceKeyArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[72]);
        }
    }

    /**
     * Sets array of all "InstanceKey" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setInstanceKeyArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKey[] instanceKeyArray) {
        check_orphaned();
        arraySetterHelper(instanceKeyArray, PROPERTY_QNAME[72]);
    }

    /**
     * Sets ith "InstanceKey" element
     */
    @Override
    public void setInstanceKeyArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKey instanceKey) {
        generatedSetterHelperImpl(instanceKey, PROPERTY_QNAME[72], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "InstanceKey" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKey insertNewInstanceKey(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKey target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKey)get_store().insert_element_user(PROPERTY_QNAME[72], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "InstanceKey" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKey addNewInstanceKey() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKey target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKey)get_store().add_element_user(PROPERTY_QNAME[72]);
            return target;
        }
    }

    /**
     * Removes the ith "InstanceKey" element
     */
    @Override
    public void removeInstanceKey(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[72], i);
        }
    }

    /**
     * Gets a List of "InstanceValue" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceValue> getInstanceValueList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getInstanceValueArray,
                this::setInstanceValueArray,
                this::insertNewInstanceValue,
                this::removeInstanceValue,
                this::sizeOfInstanceValueArray
            );
        }
    }

    /**
     * Gets array of all "InstanceValue" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceValue[] getInstanceValueArray() {
        return getXmlObjectArray(PROPERTY_QNAME[73], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceValue[0]);
    }

    /**
     * Gets ith "InstanceValue" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceValue getInstanceValueArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceValue target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceValue)get_store().find_element_user(PROPERTY_QNAME[73], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "InstanceValue" element
     */
    @Override
    public int sizeOfInstanceValueArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[73]);
        }
    }

    /**
     * Sets array of all "InstanceValue" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setInstanceValueArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceValue[] instanceValueArray) {
        check_orphaned();
        arraySetterHelper(instanceValueArray, PROPERTY_QNAME[73]);
    }

    /**
     * Sets ith "InstanceValue" element
     */
    @Override
    public void setInstanceValueArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceValue instanceValue) {
        generatedSetterHelperImpl(instanceValue, PROPERTY_QNAME[73], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "InstanceValue" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceValue insertNewInstanceValue(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceValue target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceValue)get_store().insert_element_user(PROPERTY_QNAME[73], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "InstanceValue" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceValue addNewInstanceValue() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceValue target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceValue)get_store().add_element_user(PROPERTY_QNAME[73]);
            return target;
        }
    }

    /**
     * Removes the ith "InstanceValue" element
     */
    @Override
    public void removeInstanceValue(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[73], i);
        }
    }

    /**
     * Gets a List of "InstanceVariable" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariable> getInstanceVariableList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getInstanceVariableArray,
                this::setInstanceVariableArray,
                this::insertNewInstanceVariable,
                this::removeInstanceVariable,
                this::sizeOfInstanceVariableArray
            );
        }
    }

    /**
     * Gets array of all "InstanceVariable" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariable[] getInstanceVariableArray() {
        return getXmlObjectArray(PROPERTY_QNAME[74], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariable[0]);
    }

    /**
     * Gets ith "InstanceVariable" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariable getInstanceVariableArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariable target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariable)get_store().find_element_user(PROPERTY_QNAME[74], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "InstanceVariable" element
     */
    @Override
    public int sizeOfInstanceVariableArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[74]);
        }
    }

    /**
     * Sets array of all "InstanceVariable" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setInstanceVariableArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariable[] instanceVariableArray) {
        check_orphaned();
        arraySetterHelper(instanceVariableArray, PROPERTY_QNAME[74]);
    }

    /**
     * Sets ith "InstanceVariable" element
     */
    @Override
    public void setInstanceVariableArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariable instanceVariable) {
        generatedSetterHelperImpl(instanceVariable, PROPERTY_QNAME[74], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "InstanceVariable" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariable insertNewInstanceVariable(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariable target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariable)get_store().insert_element_user(PROPERTY_QNAME[74], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "InstanceVariable" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariable addNewInstanceVariable() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariable target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariable)get_store().add_element_user(PROPERTY_QNAME[74]);
            return target;
        }
    }

    /**
     * Removes the ith "InstanceVariable" element
     */
    @Override
    public void removeInstanceVariable(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[74], i);
        }
    }

    /**
     * Gets a List of "InstanceVariableMap" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap> getInstanceVariableMapList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getInstanceVariableMapArray,
                this::setInstanceVariableMapArray,
                this::insertNewInstanceVariableMap,
                this::removeInstanceVariableMap,
                this::sizeOfInstanceVariableMapArray
            );
        }
    }

    /**
     * Gets array of all "InstanceVariableMap" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap[] getInstanceVariableMapArray() {
        return getXmlObjectArray(PROPERTY_QNAME[75], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap[0]);
    }

    /**
     * Gets ith "InstanceVariableMap" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap getInstanceVariableMapArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap)get_store().find_element_user(PROPERTY_QNAME[75], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "InstanceVariableMap" element
     */
    @Override
    public int sizeOfInstanceVariableMapArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[75]);
        }
    }

    /**
     * Sets array of all "InstanceVariableMap" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setInstanceVariableMapArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap[] instanceVariableMapArray) {
        check_orphaned();
        arraySetterHelper(instanceVariableMapArray, PROPERTY_QNAME[75]);
    }

    /**
     * Sets ith "InstanceVariableMap" element
     */
    @Override
    public void setInstanceVariableMapArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap instanceVariableMap) {
        generatedSetterHelperImpl(instanceVariableMap, PROPERTY_QNAME[75], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "InstanceVariableMap" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap insertNewInstanceVariableMap(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap)get_store().insert_element_user(PROPERTY_QNAME[75], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "InstanceVariableMap" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap addNewInstanceVariableMap() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap)get_store().add_element_user(PROPERTY_QNAME[75]);
            return target;
        }
    }

    /**
     * Removes the ith "InstanceVariableMap" element
     */
    @Override
    public void removeInstanceVariableMap(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[75], i);
        }
    }

    /**
     * Gets a List of "Key" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key> getKeyList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getKeyArray,
                this::setKeyArray,
                this::insertNewKey,
                this::removeKey,
                this::sizeOfKeyArray
            );
        }
    }

    /**
     * Gets array of all "Key" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key[] getKeyArray() {
        return getXmlObjectArray(PROPERTY_QNAME[76], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key[0]);
    }

    /**
     * Gets ith "Key" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key getKeyArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key)get_store().find_element_user(PROPERTY_QNAME[76], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Key" element
     */
    @Override
    public int sizeOfKeyArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[76]);
        }
    }

    /**
     * Sets array of all "Key" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setKeyArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key[] keyArray) {
        check_orphaned();
        arraySetterHelper(keyArray, PROPERTY_QNAME[76]);
    }

    /**
     * Sets ith "Key" element
     */
    @Override
    public void setKeyArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key key) {
        generatedSetterHelperImpl(key, PROPERTY_QNAME[76], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Key" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key insertNewKey(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key)get_store().insert_element_user(PROPERTY_QNAME[76], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Key" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key addNewKey() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key)get_store().add_element_user(PROPERTY_QNAME[76]);
            return target;
        }
    }

    /**
     * Removes the ith "Key" element
     */
    @Override
    public void removeKey(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[76], i);
        }
    }

    /**
     * Gets a List of "KeyDefinition" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition> getKeyDefinitionList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getKeyDefinitionArray,
                this::setKeyDefinitionArray,
                this::insertNewKeyDefinition,
                this::removeKeyDefinition,
                this::sizeOfKeyDefinitionArray
            );
        }
    }

    /**
     * Gets array of all "KeyDefinition" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition[] getKeyDefinitionArray() {
        return getXmlObjectArray(PROPERTY_QNAME[77], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition[0]);
    }

    /**
     * Gets ith "KeyDefinition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition getKeyDefinitionArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition)get_store().find_element_user(PROPERTY_QNAME[77], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "KeyDefinition" element
     */
    @Override
    public int sizeOfKeyDefinitionArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[77]);
        }
    }

    /**
     * Sets array of all "KeyDefinition" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setKeyDefinitionArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition[] keyDefinitionArray) {
        check_orphaned();
        arraySetterHelper(keyDefinitionArray, PROPERTY_QNAME[77]);
    }

    /**
     * Sets ith "KeyDefinition" element
     */
    @Override
    public void setKeyDefinitionArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition keyDefinition) {
        generatedSetterHelperImpl(keyDefinition, PROPERTY_QNAME[77], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "KeyDefinition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition insertNewKeyDefinition(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition)get_store().insert_element_user(PROPERTY_QNAME[77], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "KeyDefinition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition addNewKeyDefinition() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition)get_store().add_element_user(PROPERTY_QNAME[77]);
            return target;
        }
    }

    /**
     * Removes the ith "KeyDefinition" element
     */
    @Override
    public void removeKeyDefinition(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[77], i);
        }
    }

    /**
     * Gets a List of "KeyDefinitionMember" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinitionMember> getKeyDefinitionMemberList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getKeyDefinitionMemberArray,
                this::setKeyDefinitionMemberArray,
                this::insertNewKeyDefinitionMember,
                this::removeKeyDefinitionMember,
                this::sizeOfKeyDefinitionMemberArray
            );
        }
    }

    /**
     * Gets array of all "KeyDefinitionMember" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinitionMember[] getKeyDefinitionMemberArray() {
        return getXmlObjectArray(PROPERTY_QNAME[78], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinitionMember[0]);
    }

    /**
     * Gets ith "KeyDefinitionMember" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinitionMember getKeyDefinitionMemberArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinitionMember target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinitionMember)get_store().find_element_user(PROPERTY_QNAME[78], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "KeyDefinitionMember" element
     */
    @Override
    public int sizeOfKeyDefinitionMemberArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[78]);
        }
    }

    /**
     * Sets array of all "KeyDefinitionMember" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setKeyDefinitionMemberArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinitionMember[] keyDefinitionMemberArray) {
        check_orphaned();
        arraySetterHelper(keyDefinitionMemberArray, PROPERTY_QNAME[78]);
    }

    /**
     * Sets ith "KeyDefinitionMember" element
     */
    @Override
    public void setKeyDefinitionMemberArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinitionMember keyDefinitionMember) {
        generatedSetterHelperImpl(keyDefinitionMember, PROPERTY_QNAME[78], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "KeyDefinitionMember" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinitionMember insertNewKeyDefinitionMember(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinitionMember target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinitionMember)get_store().insert_element_user(PROPERTY_QNAME[78], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "KeyDefinitionMember" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinitionMember addNewKeyDefinitionMember() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinitionMember target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinitionMember)get_store().add_element_user(PROPERTY_QNAME[78]);
            return target;
        }
    }

    /**
     * Removes the ith "KeyDefinitionMember" element
     */
    @Override
    public void removeKeyDefinitionMember(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[78], i);
        }
    }

    /**
     * Gets a List of "KeyMember" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyMember> getKeyMemberList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getKeyMemberArray,
                this::setKeyMemberArray,
                this::insertNewKeyMember,
                this::removeKeyMember,
                this::sizeOfKeyMemberArray
            );
        }
    }

    /**
     * Gets array of all "KeyMember" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyMember[] getKeyMemberArray() {
        return getXmlObjectArray(PROPERTY_QNAME[79], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyMember[0]);
    }

    /**
     * Gets ith "KeyMember" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyMember getKeyMemberArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyMember target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyMember)get_store().find_element_user(PROPERTY_QNAME[79], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "KeyMember" element
     */
    @Override
    public int sizeOfKeyMemberArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[79]);
        }
    }

    /**
     * Sets array of all "KeyMember" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setKeyMemberArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyMember[] keyMemberArray) {
        check_orphaned();
        arraySetterHelper(keyMemberArray, PROPERTY_QNAME[79]);
    }

    /**
     * Sets ith "KeyMember" element
     */
    @Override
    public void setKeyMemberArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyMember keyMember) {
        generatedSetterHelperImpl(keyMember, PROPERTY_QNAME[79], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "KeyMember" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyMember insertNewKeyMember(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyMember target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyMember)get_store().insert_element_user(PROPERTY_QNAME[79], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "KeyMember" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyMember addNewKeyMember() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyMember target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyMember)get_store().add_element_user(PROPERTY_QNAME[79]);
            return target;
        }
    }

    /**
     * Removes the ith "KeyMember" element
     */
    @Override
    public void removeKeyMember(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[79], i);
        }
    }

    /**
     * Gets a List of "KeyValueDataStore" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyValueDataStore> getKeyValueDataStoreList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getKeyValueDataStoreArray,
                this::setKeyValueDataStoreArray,
                this::insertNewKeyValueDataStore,
                this::removeKeyValueDataStore,
                this::sizeOfKeyValueDataStoreArray
            );
        }
    }

    /**
     * Gets array of all "KeyValueDataStore" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyValueDataStore[] getKeyValueDataStoreArray() {
        return getXmlObjectArray(PROPERTY_QNAME[80], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyValueDataStore[0]);
    }

    /**
     * Gets ith "KeyValueDataStore" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyValueDataStore getKeyValueDataStoreArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyValueDataStore target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyValueDataStore)get_store().find_element_user(PROPERTY_QNAME[80], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "KeyValueDataStore" element
     */
    @Override
    public int sizeOfKeyValueDataStoreArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[80]);
        }
    }

    /**
     * Sets array of all "KeyValueDataStore" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setKeyValueDataStoreArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyValueDataStore[] keyValueDataStoreArray) {
        check_orphaned();
        arraySetterHelper(keyValueDataStoreArray, PROPERTY_QNAME[80]);
    }

    /**
     * Sets ith "KeyValueDataStore" element
     */
    @Override
    public void setKeyValueDataStoreArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyValueDataStore keyValueDataStore) {
        generatedSetterHelperImpl(keyValueDataStore, PROPERTY_QNAME[80], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "KeyValueDataStore" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyValueDataStore insertNewKeyValueDataStore(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyValueDataStore target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyValueDataStore)get_store().insert_element_user(PROPERTY_QNAME[80], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "KeyValueDataStore" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyValueDataStore addNewKeyValueDataStore() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyValueDataStore target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyValueDataStore)get_store().add_element_user(PROPERTY_QNAME[80]);
            return target;
        }
    }

    /**
     * Removes the ith "KeyValueDataStore" element
     */
    @Override
    public void removeKeyValueDataStore(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[80], i);
        }
    }

    /**
     * Gets a List of "KeyValueStructure" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyValueStructure> getKeyValueStructureList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getKeyValueStructureArray,
                this::setKeyValueStructureArray,
                this::insertNewKeyValueStructure,
                this::removeKeyValueStructure,
                this::sizeOfKeyValueStructureArray
            );
        }
    }

    /**
     * Gets array of all "KeyValueStructure" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyValueStructure[] getKeyValueStructureArray() {
        return getXmlObjectArray(PROPERTY_QNAME[81], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyValueStructure[0]);
    }

    /**
     * Gets ith "KeyValueStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyValueStructure getKeyValueStructureArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyValueStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyValueStructure)get_store().find_element_user(PROPERTY_QNAME[81], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "KeyValueStructure" element
     */
    @Override
    public int sizeOfKeyValueStructureArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[81]);
        }
    }

    /**
     * Sets array of all "KeyValueStructure" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setKeyValueStructureArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyValueStructure[] keyValueStructureArray) {
        check_orphaned();
        arraySetterHelper(keyValueStructureArray, PROPERTY_QNAME[81]);
    }

    /**
     * Sets ith "KeyValueStructure" element
     */
    @Override
    public void setKeyValueStructureArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyValueStructure keyValueStructure) {
        generatedSetterHelperImpl(keyValueStructure, PROPERTY_QNAME[81], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "KeyValueStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyValueStructure insertNewKeyValueStructure(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyValueStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyValueStructure)get_store().insert_element_user(PROPERTY_QNAME[81], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "KeyValueStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyValueStructure addNewKeyValueStructure() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyValueStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyValueStructure)get_store().add_element_user(PROPERTY_QNAME[81]);
            return target;
        }
    }

    /**
     * Removes the ith "KeyValueStructure" element
     */
    @Override
    public void removeKeyValueStructure(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[81], i);
        }
    }

    /**
     * Gets a List of "Level" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Level> getLevelList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getLevelArray,
                this::setLevelArray,
                this::insertNewLevel,
                this::removeLevel,
                this::sizeOfLevelArray
            );
        }
    }

    /**
     * Gets array of all "Level" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Level[] getLevelArray() {
        return getXmlObjectArray(PROPERTY_QNAME[82], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.Level[0]);
    }

    /**
     * Gets ith "Level" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Level getLevelArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Level target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Level)get_store().find_element_user(PROPERTY_QNAME[82], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Level" element
     */
    @Override
    public int sizeOfLevelArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[82]);
        }
    }

    /**
     * Sets array of all "Level" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setLevelArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Level[] levelArray) {
        check_orphaned();
        arraySetterHelper(levelArray, PROPERTY_QNAME[82]);
    }

    /**
     * Sets ith "Level" element
     */
    @Override
    public void setLevelArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Level level) {
        generatedSetterHelperImpl(level, PROPERTY_QNAME[82], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Level" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Level insertNewLevel(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Level target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Level)get_store().insert_element_user(PROPERTY_QNAME[82], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Level" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Level addNewLevel() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Level target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Level)get_store().add_element_user(PROPERTY_QNAME[82]);
            return target;
        }
    }

    /**
     * Removes the ith "Level" element
     */
    @Override
    public void removeLevel(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[82], i);
        }
    }

    /**
     * Gets a List of "LevelStructure" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.LevelStructure> getLevelStructureList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getLevelStructureArray,
                this::setLevelStructureArray,
                this::insertNewLevelStructure,
                this::removeLevelStructure,
                this::sizeOfLevelStructureArray
            );
        }
    }

    /**
     * Gets array of all "LevelStructure" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LevelStructure[] getLevelStructureArray() {
        return getXmlObjectArray(PROPERTY_QNAME[83], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.LevelStructure[0]);
    }

    /**
     * Gets ith "LevelStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LevelStructure getLevelStructureArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LevelStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LevelStructure)get_store().find_element_user(PROPERTY_QNAME[83], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "LevelStructure" element
     */
    @Override
    public int sizeOfLevelStructureArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[83]);
        }
    }

    /**
     * Sets array of all "LevelStructure" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setLevelStructureArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.LevelStructure[] levelStructureArray) {
        check_orphaned();
        arraySetterHelper(levelStructureArray, PROPERTY_QNAME[83]);
    }

    /**
     * Sets ith "LevelStructure" element
     */
    @Override
    public void setLevelStructureArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.LevelStructure levelStructure) {
        generatedSetterHelperImpl(levelStructure, PROPERTY_QNAME[83], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "LevelStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LevelStructure insertNewLevelStructure(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LevelStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LevelStructure)get_store().insert_element_user(PROPERTY_QNAME[83], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "LevelStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LevelStructure addNewLevelStructure() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LevelStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LevelStructure)get_store().add_element_user(PROPERTY_QNAME[83]);
            return target;
        }
    }

    /**
     * Removes the ith "LevelStructure" element
     */
    @Override
    public void removeLevelStructure(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[83], i);
        }
    }

    /**
     * Gets a List of "LogicalRecord" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord> getLogicalRecordList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getLogicalRecordArray,
                this::setLogicalRecordArray,
                this::insertNewLogicalRecord,
                this::removeLogicalRecord,
                this::sizeOfLogicalRecordArray
            );
        }
    }

    /**
     * Gets array of all "LogicalRecord" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord[] getLogicalRecordArray() {
        return getXmlObjectArray(PROPERTY_QNAME[84], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord[0]);
    }

    /**
     * Gets ith "LogicalRecord" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord getLogicalRecordArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord)get_store().find_element_user(PROPERTY_QNAME[84], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "LogicalRecord" element
     */
    @Override
    public int sizeOfLogicalRecordArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[84]);
        }
    }

    /**
     * Sets array of all "LogicalRecord" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setLogicalRecordArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord[] logicalRecordArray) {
        check_orphaned();
        arraySetterHelper(logicalRecordArray, PROPERTY_QNAME[84]);
    }

    /**
     * Sets ith "LogicalRecord" element
     */
    @Override
    public void setLogicalRecordArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord logicalRecord) {
        generatedSetterHelperImpl(logicalRecord, PROPERTY_QNAME[84], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "LogicalRecord" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord insertNewLogicalRecord(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord)get_store().insert_element_user(PROPERTY_QNAME[84], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "LogicalRecord" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord addNewLogicalRecord() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord)get_store().add_element_user(PROPERTY_QNAME[84]);
            return target;
        }
    }

    /**
     * Removes the ith "LogicalRecord" element
     */
    @Override
    public void removeLogicalRecord(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[84], i);
        }
    }

    /**
     * Gets a List of "LogicalRecordPosition" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordPosition> getLogicalRecordPositionList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getLogicalRecordPositionArray,
                this::setLogicalRecordPositionArray,
                this::insertNewLogicalRecordPosition,
                this::removeLogicalRecordPosition,
                this::sizeOfLogicalRecordPositionArray
            );
        }
    }

    /**
     * Gets array of all "LogicalRecordPosition" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordPosition[] getLogicalRecordPositionArray() {
        return getXmlObjectArray(PROPERTY_QNAME[85], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordPosition[0]);
    }

    /**
     * Gets ith "LogicalRecordPosition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordPosition getLogicalRecordPositionArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordPosition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordPosition)get_store().find_element_user(PROPERTY_QNAME[85], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "LogicalRecordPosition" element
     */
    @Override
    public int sizeOfLogicalRecordPositionArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[85]);
        }
    }

    /**
     * Sets array of all "LogicalRecordPosition" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setLogicalRecordPositionArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordPosition[] logicalRecordPositionArray) {
        check_orphaned();
        arraySetterHelper(logicalRecordPositionArray, PROPERTY_QNAME[85]);
    }

    /**
     * Sets ith "LogicalRecordPosition" element
     */
    @Override
    public void setLogicalRecordPositionArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordPosition logicalRecordPosition) {
        generatedSetterHelperImpl(logicalRecordPosition, PROPERTY_QNAME[85], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "LogicalRecordPosition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordPosition insertNewLogicalRecordPosition(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordPosition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordPosition)get_store().insert_element_user(PROPERTY_QNAME[85], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "LogicalRecordPosition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordPosition addNewLogicalRecordPosition() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordPosition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordPosition)get_store().add_element_user(PROPERTY_QNAME[85]);
            return target;
        }
    }

    /**
     * Removes the ith "LogicalRecordPosition" element
     */
    @Override
    public void removeLogicalRecordPosition(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[85], i);
        }
    }

    /**
     * Gets a List of "LogicalRecordRelationStructure" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationStructure> getLogicalRecordRelationStructureList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getLogicalRecordRelationStructureArray,
                this::setLogicalRecordRelationStructureArray,
                this::insertNewLogicalRecordRelationStructure,
                this::removeLogicalRecordRelationStructure,
                this::sizeOfLogicalRecordRelationStructureArray
            );
        }
    }

    /**
     * Gets array of all "LogicalRecordRelationStructure" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationStructure[] getLogicalRecordRelationStructureArray() {
        return getXmlObjectArray(PROPERTY_QNAME[86], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationStructure[0]);
    }

    /**
     * Gets ith "LogicalRecordRelationStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationStructure getLogicalRecordRelationStructureArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationStructure)get_store().find_element_user(PROPERTY_QNAME[86], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "LogicalRecordRelationStructure" element
     */
    @Override
    public int sizeOfLogicalRecordRelationStructureArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[86]);
        }
    }

    /**
     * Sets array of all "LogicalRecordRelationStructure" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setLogicalRecordRelationStructureArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationStructure[] logicalRecordRelationStructureArray) {
        check_orphaned();
        arraySetterHelper(logicalRecordRelationStructureArray, PROPERTY_QNAME[86]);
    }

    /**
     * Sets ith "LogicalRecordRelationStructure" element
     */
    @Override
    public void setLogicalRecordRelationStructureArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationStructure logicalRecordRelationStructure) {
        generatedSetterHelperImpl(logicalRecordRelationStructure, PROPERTY_QNAME[86], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "LogicalRecordRelationStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationStructure insertNewLogicalRecordRelationStructure(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationStructure)get_store().insert_element_user(PROPERTY_QNAME[86], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "LogicalRecordRelationStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationStructure addNewLogicalRecordRelationStructure() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationStructure)get_store().add_element_user(PROPERTY_QNAME[86]);
            return target;
        }
    }

    /**
     * Removes the ith "LogicalRecordRelationStructure" element
     */
    @Override
    public void removeLogicalRecordRelationStructure(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[86], i);
        }
    }

    /**
     * Gets a List of "LogicalRecordRelationship" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship> getLogicalRecordRelationshipList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getLogicalRecordRelationshipArray,
                this::setLogicalRecordRelationshipArray,
                this::insertNewLogicalRecordRelationship,
                this::removeLogicalRecordRelationship,
                this::sizeOfLogicalRecordRelationshipArray
            );
        }
    }

    /**
     * Gets array of all "LogicalRecordRelationship" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship[] getLogicalRecordRelationshipArray() {
        return getXmlObjectArray(PROPERTY_QNAME[87], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship[0]);
    }

    /**
     * Gets ith "LogicalRecordRelationship" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship getLogicalRecordRelationshipArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship)get_store().find_element_user(PROPERTY_QNAME[87], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "LogicalRecordRelationship" element
     */
    @Override
    public int sizeOfLogicalRecordRelationshipArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[87]);
        }
    }

    /**
     * Sets array of all "LogicalRecordRelationship" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setLogicalRecordRelationshipArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship[] logicalRecordRelationshipArray) {
        check_orphaned();
        arraySetterHelper(logicalRecordRelationshipArray, PROPERTY_QNAME[87]);
    }

    /**
     * Sets ith "LogicalRecordRelationship" element
     */
    @Override
    public void setLogicalRecordRelationshipArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship logicalRecordRelationship) {
        generatedSetterHelperImpl(logicalRecordRelationship, PROPERTY_QNAME[87], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "LogicalRecordRelationship" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship insertNewLogicalRecordRelationship(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship)get_store().insert_element_user(PROPERTY_QNAME[87], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "LogicalRecordRelationship" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship addNewLogicalRecordRelationship() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship)get_store().add_element_user(PROPERTY_QNAME[87]);
            return target;
        }
    }

    /**
     * Removes the ith "LogicalRecordRelationship" element
     */
    @Override
    public void removeLogicalRecordRelationship(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[87], i);
        }
    }

    /**
     * Gets a List of "LongDataSet" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongDataSet> getLongDataSetList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getLongDataSetArray,
                this::setLongDataSetArray,
                this::insertNewLongDataSet,
                this::removeLongDataSet,
                this::sizeOfLongDataSetArray
            );
        }
    }

    /**
     * Gets array of all "LongDataSet" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongDataSet[] getLongDataSetArray() {
        return getXmlObjectArray(PROPERTY_QNAME[88], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongDataSet[0]);
    }

    /**
     * Gets ith "LongDataSet" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongDataSet getLongDataSetArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongDataSet target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongDataSet)get_store().find_element_user(PROPERTY_QNAME[88], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "LongDataSet" element
     */
    @Override
    public int sizeOfLongDataSetArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[88]);
        }
    }

    /**
     * Sets array of all "LongDataSet" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setLongDataSetArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongDataSet[] longDataSetArray) {
        check_orphaned();
        arraySetterHelper(longDataSetArray, PROPERTY_QNAME[88]);
    }

    /**
     * Sets ith "LongDataSet" element
     */
    @Override
    public void setLongDataSetArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongDataSet longDataSet) {
        generatedSetterHelperImpl(longDataSet, PROPERTY_QNAME[88], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "LongDataSet" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongDataSet insertNewLongDataSet(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongDataSet target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongDataSet)get_store().insert_element_user(PROPERTY_QNAME[88], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "LongDataSet" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongDataSet addNewLongDataSet() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongDataSet target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongDataSet)get_store().add_element_user(PROPERTY_QNAME[88]);
            return target;
        }
    }

    /**
     * Removes the ith "LongDataSet" element
     */
    @Override
    public void removeLongDataSet(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[88], i);
        }
    }

    /**
     * Gets a List of "LongDataStructure" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongDataStructure> getLongDataStructureList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getLongDataStructureArray,
                this::setLongDataStructureArray,
                this::insertNewLongDataStructure,
                this::removeLongDataStructure,
                this::sizeOfLongDataStructureArray
            );
        }
    }

    /**
     * Gets array of all "LongDataStructure" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongDataStructure[] getLongDataStructureArray() {
        return getXmlObjectArray(PROPERTY_QNAME[89], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongDataStructure[0]);
    }

    /**
     * Gets ith "LongDataStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongDataStructure getLongDataStructureArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongDataStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongDataStructure)get_store().find_element_user(PROPERTY_QNAME[89], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "LongDataStructure" element
     */
    @Override
    public int sizeOfLongDataStructureArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[89]);
        }
    }

    /**
     * Sets array of all "LongDataStructure" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setLongDataStructureArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongDataStructure[] longDataStructureArray) {
        check_orphaned();
        arraySetterHelper(longDataStructureArray, PROPERTY_QNAME[89]);
    }

    /**
     * Sets ith "LongDataStructure" element
     */
    @Override
    public void setLongDataStructureArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongDataStructure longDataStructure) {
        generatedSetterHelperImpl(longDataStructure, PROPERTY_QNAME[89], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "LongDataStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongDataStructure insertNewLongDataStructure(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongDataStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongDataStructure)get_store().insert_element_user(PROPERTY_QNAME[89], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "LongDataStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongDataStructure addNewLongDataStructure() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongDataStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongDataStructure)get_store().add_element_user(PROPERTY_QNAME[89]);
            return target;
        }
    }

    /**
     * Removes the ith "LongDataStructure" element
     */
    @Override
    public void removeLongDataStructure(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[89], i);
        }
    }

    /**
     * Gets a List of "LongKey" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongKey> getLongKeyList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getLongKeyArray,
                this::setLongKeyArray,
                this::insertNewLongKey,
                this::removeLongKey,
                this::sizeOfLongKeyArray
            );
        }
    }

    /**
     * Gets array of all "LongKey" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongKey[] getLongKeyArray() {
        return getXmlObjectArray(PROPERTY_QNAME[90], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongKey[0]);
    }

    /**
     * Gets ith "LongKey" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongKey getLongKeyArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongKey target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongKey)get_store().find_element_user(PROPERTY_QNAME[90], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "LongKey" element
     */
    @Override
    public int sizeOfLongKeyArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[90]);
        }
    }

    /**
     * Sets array of all "LongKey" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setLongKeyArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongKey[] longKeyArray) {
        check_orphaned();
        arraySetterHelper(longKeyArray, PROPERTY_QNAME[90]);
    }

    /**
     * Sets ith "LongKey" element
     */
    @Override
    public void setLongKeyArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongKey longKey) {
        generatedSetterHelperImpl(longKey, PROPERTY_QNAME[90], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "LongKey" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongKey insertNewLongKey(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongKey target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongKey)get_store().insert_element_user(PROPERTY_QNAME[90], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "LongKey" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongKey addNewLongKey() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongKey target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongKey)get_store().add_element_user(PROPERTY_QNAME[90]);
            return target;
        }
    }

    /**
     * Removes the ith "LongKey" element
     */
    @Override
    public void removeLongKey(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[90], i);
        }
    }

    /**
     * Gets a List of "LongMainKeyMember" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongMainKeyMember> getLongMainKeyMemberList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getLongMainKeyMemberArray,
                this::setLongMainKeyMemberArray,
                this::insertNewLongMainKeyMember,
                this::removeLongMainKeyMember,
                this::sizeOfLongMainKeyMemberArray
            );
        }
    }

    /**
     * Gets array of all "LongMainKeyMember" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongMainKeyMember[] getLongMainKeyMemberArray() {
        return getXmlObjectArray(PROPERTY_QNAME[91], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongMainKeyMember[0]);
    }

    /**
     * Gets ith "LongMainKeyMember" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongMainKeyMember getLongMainKeyMemberArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongMainKeyMember target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongMainKeyMember)get_store().find_element_user(PROPERTY_QNAME[91], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "LongMainKeyMember" element
     */
    @Override
    public int sizeOfLongMainKeyMemberArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[91]);
        }
    }

    /**
     * Sets array of all "LongMainKeyMember" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setLongMainKeyMemberArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongMainKeyMember[] longMainKeyMemberArray) {
        check_orphaned();
        arraySetterHelper(longMainKeyMemberArray, PROPERTY_QNAME[91]);
    }

    /**
     * Sets ith "LongMainKeyMember" element
     */
    @Override
    public void setLongMainKeyMemberArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongMainKeyMember longMainKeyMember) {
        generatedSetterHelperImpl(longMainKeyMember, PROPERTY_QNAME[91], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "LongMainKeyMember" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongMainKeyMember insertNewLongMainKeyMember(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongMainKeyMember target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongMainKeyMember)get_store().insert_element_user(PROPERTY_QNAME[91], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "LongMainKeyMember" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongMainKeyMember addNewLongMainKeyMember() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongMainKeyMember target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongMainKeyMember)get_store().add_element_user(PROPERTY_QNAME[91]);
            return target;
        }
    }

    /**
     * Removes the ith "LongMainKeyMember" element
     */
    @Override
    public void removeLongMainKeyMember(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[91], i);
        }
    }

    /**
     * Gets a List of "Machine" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Machine> getMachineList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getMachineArray,
                this::setMachineArray,
                this::insertNewMachine,
                this::removeMachine,
                this::sizeOfMachineArray
            );
        }
    }

    /**
     * Gets array of all "Machine" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Machine[] getMachineArray() {
        return getXmlObjectArray(PROPERTY_QNAME[92], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.Machine[0]);
    }

    /**
     * Gets ith "Machine" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Machine getMachineArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Machine target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Machine)get_store().find_element_user(PROPERTY_QNAME[92], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Machine" element
     */
    @Override
    public int sizeOfMachineArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[92]);
        }
    }

    /**
     * Sets array of all "Machine" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setMachineArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Machine[] machineArray) {
        check_orphaned();
        arraySetterHelper(machineArray, PROPERTY_QNAME[92]);
    }

    /**
     * Sets ith "Machine" element
     */
    @Override
    public void setMachineArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Machine machine) {
        generatedSetterHelperImpl(machine, PROPERTY_QNAME[92], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Machine" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Machine insertNewMachine(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Machine target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Machine)get_store().insert_element_user(PROPERTY_QNAME[92], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Machine" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Machine addNewMachine() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Machine target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Machine)get_store().add_element_user(PROPERTY_QNAME[92]);
            return target;
        }
    }

    /**
     * Removes the ith "Machine" element
     */
    @Override
    public void removeMachine(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[92], i);
        }
    }

    /**
     * Gets a List of "MainKeyMember" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.MainKeyMember> getMainKeyMemberList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getMainKeyMemberArray,
                this::setMainKeyMemberArray,
                this::insertNewMainKeyMember,
                this::removeMainKeyMember,
                this::sizeOfMainKeyMemberArray
            );
        }
    }

    /**
     * Gets array of all "MainKeyMember" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.MainKeyMember[] getMainKeyMemberArray() {
        return getXmlObjectArray(PROPERTY_QNAME[93], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.MainKeyMember[0]);
    }

    /**
     * Gets ith "MainKeyMember" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.MainKeyMember getMainKeyMemberArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.MainKeyMember target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.MainKeyMember)get_store().find_element_user(PROPERTY_QNAME[93], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "MainKeyMember" element
     */
    @Override
    public int sizeOfMainKeyMemberArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[93]);
        }
    }

    /**
     * Sets array of all "MainKeyMember" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setMainKeyMemberArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.MainKeyMember[] mainKeyMemberArray) {
        check_orphaned();
        arraySetterHelper(mainKeyMemberArray, PROPERTY_QNAME[93]);
    }

    /**
     * Sets ith "MainKeyMember" element
     */
    @Override
    public void setMainKeyMemberArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.MainKeyMember mainKeyMember) {
        generatedSetterHelperImpl(mainKeyMember, PROPERTY_QNAME[93], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "MainKeyMember" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.MainKeyMember insertNewMainKeyMember(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.MainKeyMember target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.MainKeyMember)get_store().insert_element_user(PROPERTY_QNAME[93], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "MainKeyMember" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.MainKeyMember addNewMainKeyMember() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.MainKeyMember target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.MainKeyMember)get_store().add_element_user(PROPERTY_QNAME[93]);
            return target;
        }
    }

    /**
     * Removes the ith "MainKeyMember" element
     */
    @Override
    public void removeMainKeyMember(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[93], i);
        }
    }

    /**
     * Gets a List of "MeasureComponent" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.MeasureComponent> getMeasureComponentList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getMeasureComponentArray,
                this::setMeasureComponentArray,
                this::insertNewMeasureComponent,
                this::removeMeasureComponent,
                this::sizeOfMeasureComponentArray
            );
        }
    }

    /**
     * Gets array of all "MeasureComponent" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.MeasureComponent[] getMeasureComponentArray() {
        return getXmlObjectArray(PROPERTY_QNAME[94], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.MeasureComponent[0]);
    }

    /**
     * Gets ith "MeasureComponent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.MeasureComponent getMeasureComponentArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.MeasureComponent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.MeasureComponent)get_store().find_element_user(PROPERTY_QNAME[94], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "MeasureComponent" element
     */
    @Override
    public int sizeOfMeasureComponentArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[94]);
        }
    }

    /**
     * Sets array of all "MeasureComponent" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setMeasureComponentArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.MeasureComponent[] measureComponentArray) {
        check_orphaned();
        arraySetterHelper(measureComponentArray, PROPERTY_QNAME[94]);
    }

    /**
     * Sets ith "MeasureComponent" element
     */
    @Override
    public void setMeasureComponentArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.MeasureComponent measureComponent) {
        generatedSetterHelperImpl(measureComponent, PROPERTY_QNAME[94], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "MeasureComponent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.MeasureComponent insertNewMeasureComponent(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.MeasureComponent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.MeasureComponent)get_store().insert_element_user(PROPERTY_QNAME[94], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "MeasureComponent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.MeasureComponent addNewMeasureComponent() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.MeasureComponent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.MeasureComponent)get_store().add_element_user(PROPERTY_QNAME[94]);
            return target;
        }
    }

    /**
     * Removes the ith "MeasureComponent" element
     */
    @Override
    public void removeMeasureComponent(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[94], i);
        }
    }

    /**
     * Gets a List of "NonDeterministicDeclarative" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDeterministicDeclarative> getNonDeterministicDeclarativeList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getNonDeterministicDeclarativeArray,
                this::setNonDeterministicDeclarativeArray,
                this::insertNewNonDeterministicDeclarative,
                this::removeNonDeterministicDeclarative,
                this::sizeOfNonDeterministicDeclarativeArray
            );
        }
    }

    /**
     * Gets array of all "NonDeterministicDeclarative" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDeterministicDeclarative[] getNonDeterministicDeclarativeArray() {
        return getXmlObjectArray(PROPERTY_QNAME[95], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDeterministicDeclarative[0]);
    }

    /**
     * Gets ith "NonDeterministicDeclarative" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDeterministicDeclarative getNonDeterministicDeclarativeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDeterministicDeclarative target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDeterministicDeclarative)get_store().find_element_user(PROPERTY_QNAME[95], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "NonDeterministicDeclarative" element
     */
    @Override
    public int sizeOfNonDeterministicDeclarativeArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[95]);
        }
    }

    /**
     * Sets array of all "NonDeterministicDeclarative" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setNonDeterministicDeclarativeArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDeterministicDeclarative[] nonDeterministicDeclarativeArray) {
        check_orphaned();
        arraySetterHelper(nonDeterministicDeclarativeArray, PROPERTY_QNAME[95]);
    }

    /**
     * Sets ith "NonDeterministicDeclarative" element
     */
    @Override
    public void setNonDeterministicDeclarativeArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDeterministicDeclarative nonDeterministicDeclarative) {
        generatedSetterHelperImpl(nonDeterministicDeclarative, PROPERTY_QNAME[95], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "NonDeterministicDeclarative" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDeterministicDeclarative insertNewNonDeterministicDeclarative(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDeterministicDeclarative target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDeterministicDeclarative)get_store().insert_element_user(PROPERTY_QNAME[95], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "NonDeterministicDeclarative" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDeterministicDeclarative addNewNonDeterministicDeclarative() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDeterministicDeclarative target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDeterministicDeclarative)get_store().add_element_user(PROPERTY_QNAME[95]);
            return target;
        }
    }

    /**
     * Removes the ith "NonDeterministicDeclarative" element
     */
    @Override
    public void removeNonDeterministicDeclarative(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[95], i);
        }
    }

    /**
     * Gets a List of "Notation" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Notation> getNotationList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getNotationArray,
                this::setNotationArray,
                this::insertNewNotation,
                this::removeNotation,
                this::sizeOfNotationArray
            );
        }
    }

    /**
     * Gets array of all "Notation" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Notation[] getNotationArray() {
        return getXmlObjectArray(PROPERTY_QNAME[96], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.Notation[0]);
    }

    /**
     * Gets ith "Notation" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Notation getNotationArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Notation target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Notation)get_store().find_element_user(PROPERTY_QNAME[96], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Notation" element
     */
    @Override
    public int sizeOfNotationArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[96]);
        }
    }

    /**
     * Sets array of all "Notation" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setNotationArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Notation[] notationArray) {
        check_orphaned();
        arraySetterHelper(notationArray, PROPERTY_QNAME[96]);
    }

    /**
     * Sets ith "Notation" element
     */
    @Override
    public void setNotationArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Notation notation) {
        generatedSetterHelperImpl(notation, PROPERTY_QNAME[96], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Notation" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Notation insertNewNotation(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Notation target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Notation)get_store().insert_element_user(PROPERTY_QNAME[96], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Notation" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Notation addNewNotation() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Notation target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Notation)get_store().add_element_user(PROPERTY_QNAME[96]);
            return target;
        }
    }

    /**
     * Removes the ith "Notation" element
     */
    @Override
    public void removeNotation(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[96], i);
        }
    }

    /**
     * Gets a List of "Organization" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Organization> getOrganizationList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getOrganizationArray,
                this::setOrganizationArray,
                this::insertNewOrganization,
                this::removeOrganization,
                this::sizeOfOrganizationArray
            );
        }
    }

    /**
     * Gets array of all "Organization" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Organization[] getOrganizationArray() {
        return getXmlObjectArray(PROPERTY_QNAME[97], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.Organization[0]);
    }

    /**
     * Gets ith "Organization" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Organization getOrganizationArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Organization target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Organization)get_store().find_element_user(PROPERTY_QNAME[97], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Organization" element
     */
    @Override
    public int sizeOfOrganizationArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[97]);
        }
    }

    /**
     * Sets array of all "Organization" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setOrganizationArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Organization[] organizationArray) {
        check_orphaned();
        arraySetterHelper(organizationArray, PROPERTY_QNAME[97]);
    }

    /**
     * Sets ith "Organization" element
     */
    @Override
    public void setOrganizationArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Organization organization) {
        generatedSetterHelperImpl(organization, PROPERTY_QNAME[97], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Organization" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Organization insertNewOrganization(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Organization target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Organization)get_store().insert_element_user(PROPERTY_QNAME[97], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Organization" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Organization addNewOrganization() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Organization target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Organization)get_store().add_element_user(PROPERTY_QNAME[97]);
            return target;
        }
    }

    /**
     * Removes the ith "Organization" element
     */
    @Override
    public void removeOrganization(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[97], i);
        }
    }

    /**
     * Gets a List of "Parameter" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Parameter> getParameterList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getParameterArray,
                this::setParameterArray,
                this::insertNewParameter,
                this::removeParameter,
                this::sizeOfParameterArray
            );
        }
    }

    /**
     * Gets array of all "Parameter" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Parameter[] getParameterArray() {
        return getXmlObjectArray(PROPERTY_QNAME[98], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.Parameter[0]);
    }

    /**
     * Gets ith "Parameter" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Parameter getParameterArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Parameter target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Parameter)get_store().find_element_user(PROPERTY_QNAME[98], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Parameter" element
     */
    @Override
    public int sizeOfParameterArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[98]);
        }
    }

    /**
     * Sets array of all "Parameter" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setParameterArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Parameter[] parameterArray) {
        check_orphaned();
        arraySetterHelper(parameterArray, PROPERTY_QNAME[98]);
    }

    /**
     * Sets ith "Parameter" element
     */
    @Override
    public void setParameterArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Parameter parameter) {
        generatedSetterHelperImpl(parameter, PROPERTY_QNAME[98], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Parameter" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Parameter insertNewParameter(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Parameter target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Parameter)get_store().insert_element_user(PROPERTY_QNAME[98], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Parameter" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Parameter addNewParameter() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Parameter target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Parameter)get_store().add_element_user(PROPERTY_QNAME[98]);
            return target;
        }
    }

    /**
     * Removes the ith "Parameter" element
     */
    @Override
    public void removeParameter(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[98], i);
        }
    }

    /**
     * Gets a List of "PhysicalDataSet" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet> getPhysicalDataSetList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getPhysicalDataSetArray,
                this::setPhysicalDataSetArray,
                this::insertNewPhysicalDataSet,
                this::removePhysicalDataSet,
                this::sizeOfPhysicalDataSetArray
            );
        }
    }

    /**
     * Gets array of all "PhysicalDataSet" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet[] getPhysicalDataSetArray() {
        return getXmlObjectArray(PROPERTY_QNAME[99], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet[0]);
    }

    /**
     * Gets ith "PhysicalDataSet" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet getPhysicalDataSetArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet)get_store().find_element_user(PROPERTY_QNAME[99], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "PhysicalDataSet" element
     */
    @Override
    public int sizeOfPhysicalDataSetArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[99]);
        }
    }

    /**
     * Sets array of all "PhysicalDataSet" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setPhysicalDataSetArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet[] physicalDataSetArray) {
        check_orphaned();
        arraySetterHelper(physicalDataSetArray, PROPERTY_QNAME[99]);
    }

    /**
     * Sets ith "PhysicalDataSet" element
     */
    @Override
    public void setPhysicalDataSetArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet physicalDataSet) {
        generatedSetterHelperImpl(physicalDataSet, PROPERTY_QNAME[99], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "PhysicalDataSet" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet insertNewPhysicalDataSet(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet)get_store().insert_element_user(PROPERTY_QNAME[99], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "PhysicalDataSet" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet addNewPhysicalDataSet() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet)get_store().add_element_user(PROPERTY_QNAME[99]);
            return target;
        }
    }

    /**
     * Removes the ith "PhysicalDataSet" element
     */
    @Override
    public void removePhysicalDataSet(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[99], i);
        }
    }

    /**
     * Gets a List of "PhysicalDataSetStructure" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSetStructure> getPhysicalDataSetStructureList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getPhysicalDataSetStructureArray,
                this::setPhysicalDataSetStructureArray,
                this::insertNewPhysicalDataSetStructure,
                this::removePhysicalDataSetStructure,
                this::sizeOfPhysicalDataSetStructureArray
            );
        }
    }

    /**
     * Gets array of all "PhysicalDataSetStructure" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSetStructure[] getPhysicalDataSetStructureArray() {
        return getXmlObjectArray(PROPERTY_QNAME[100], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSetStructure[0]);
    }

    /**
     * Gets ith "PhysicalDataSetStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSetStructure getPhysicalDataSetStructureArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSetStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSetStructure)get_store().find_element_user(PROPERTY_QNAME[100], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "PhysicalDataSetStructure" element
     */
    @Override
    public int sizeOfPhysicalDataSetStructureArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[100]);
        }
    }

    /**
     * Sets array of all "PhysicalDataSetStructure" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setPhysicalDataSetStructureArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSetStructure[] physicalDataSetStructureArray) {
        check_orphaned();
        arraySetterHelper(physicalDataSetStructureArray, PROPERTY_QNAME[100]);
    }

    /**
     * Sets ith "PhysicalDataSetStructure" element
     */
    @Override
    public void setPhysicalDataSetStructureArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSetStructure physicalDataSetStructure) {
        generatedSetterHelperImpl(physicalDataSetStructure, PROPERTY_QNAME[100], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "PhysicalDataSetStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSetStructure insertNewPhysicalDataSetStructure(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSetStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSetStructure)get_store().insert_element_user(PROPERTY_QNAME[100], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "PhysicalDataSetStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSetStructure addNewPhysicalDataSetStructure() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSetStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSetStructure)get_store().add_element_user(PROPERTY_QNAME[100]);
            return target;
        }
    }

    /**
     * Removes the ith "PhysicalDataSetStructure" element
     */
    @Override
    public void removePhysicalDataSetStructure(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[100], i);
        }
    }

    /**
     * Gets a List of "PhysicalLayoutRelationStructure" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalLayoutRelationStructure> getPhysicalLayoutRelationStructureList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getPhysicalLayoutRelationStructureArray,
                this::setPhysicalLayoutRelationStructureArray,
                this::insertNewPhysicalLayoutRelationStructure,
                this::removePhysicalLayoutRelationStructure,
                this::sizeOfPhysicalLayoutRelationStructureArray
            );
        }
    }

    /**
     * Gets array of all "PhysicalLayoutRelationStructure" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalLayoutRelationStructure[] getPhysicalLayoutRelationStructureArray() {
        return getXmlObjectArray(PROPERTY_QNAME[101], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalLayoutRelationStructure[0]);
    }

    /**
     * Gets ith "PhysicalLayoutRelationStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalLayoutRelationStructure getPhysicalLayoutRelationStructureArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalLayoutRelationStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalLayoutRelationStructure)get_store().find_element_user(PROPERTY_QNAME[101], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "PhysicalLayoutRelationStructure" element
     */
    @Override
    public int sizeOfPhysicalLayoutRelationStructureArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[101]);
        }
    }

    /**
     * Sets array of all "PhysicalLayoutRelationStructure" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setPhysicalLayoutRelationStructureArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalLayoutRelationStructure[] physicalLayoutRelationStructureArray) {
        check_orphaned();
        arraySetterHelper(physicalLayoutRelationStructureArray, PROPERTY_QNAME[101]);
    }

    /**
     * Sets ith "PhysicalLayoutRelationStructure" element
     */
    @Override
    public void setPhysicalLayoutRelationStructureArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalLayoutRelationStructure physicalLayoutRelationStructure) {
        generatedSetterHelperImpl(physicalLayoutRelationStructure, PROPERTY_QNAME[101], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "PhysicalLayoutRelationStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalLayoutRelationStructure insertNewPhysicalLayoutRelationStructure(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalLayoutRelationStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalLayoutRelationStructure)get_store().insert_element_user(PROPERTY_QNAME[101], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "PhysicalLayoutRelationStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalLayoutRelationStructure addNewPhysicalLayoutRelationStructure() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalLayoutRelationStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalLayoutRelationStructure)get_store().add_element_user(PROPERTY_QNAME[101]);
            return target;
        }
    }

    /**
     * Removes the ith "PhysicalLayoutRelationStructure" element
     */
    @Override
    public void removePhysicalLayoutRelationStructure(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[101], i);
        }
    }

    /**
     * Gets a List of "PhysicalRecordSegment" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment> getPhysicalRecordSegmentList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getPhysicalRecordSegmentArray,
                this::setPhysicalRecordSegmentArray,
                this::insertNewPhysicalRecordSegment,
                this::removePhysicalRecordSegment,
                this::sizeOfPhysicalRecordSegmentArray
            );
        }
    }

    /**
     * Gets array of all "PhysicalRecordSegment" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment[] getPhysicalRecordSegmentArray() {
        return getXmlObjectArray(PROPERTY_QNAME[102], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment[0]);
    }

    /**
     * Gets ith "PhysicalRecordSegment" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment getPhysicalRecordSegmentArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment)get_store().find_element_user(PROPERTY_QNAME[102], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "PhysicalRecordSegment" element
     */
    @Override
    public int sizeOfPhysicalRecordSegmentArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[102]);
        }
    }

    /**
     * Sets array of all "PhysicalRecordSegment" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setPhysicalRecordSegmentArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment[] physicalRecordSegmentArray) {
        check_orphaned();
        arraySetterHelper(physicalRecordSegmentArray, PROPERTY_QNAME[102]);
    }

    /**
     * Sets ith "PhysicalRecordSegment" element
     */
    @Override
    public void setPhysicalRecordSegmentArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment physicalRecordSegment) {
        generatedSetterHelperImpl(physicalRecordSegment, PROPERTY_QNAME[102], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "PhysicalRecordSegment" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment insertNewPhysicalRecordSegment(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment)get_store().insert_element_user(PROPERTY_QNAME[102], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "PhysicalRecordSegment" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment addNewPhysicalRecordSegment() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment)get_store().add_element_user(PROPERTY_QNAME[102]);
            return target;
        }
    }

    /**
     * Removes the ith "PhysicalRecordSegment" element
     */
    @Override
    public void removePhysicalRecordSegment(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[102], i);
        }
    }

    /**
     * Gets a List of "PhysicalRecordSegmentPosition" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentPosition> getPhysicalRecordSegmentPositionList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getPhysicalRecordSegmentPositionArray,
                this::setPhysicalRecordSegmentPositionArray,
                this::insertNewPhysicalRecordSegmentPosition,
                this::removePhysicalRecordSegmentPosition,
                this::sizeOfPhysicalRecordSegmentPositionArray
            );
        }
    }

    /**
     * Gets array of all "PhysicalRecordSegmentPosition" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentPosition[] getPhysicalRecordSegmentPositionArray() {
        return getXmlObjectArray(PROPERTY_QNAME[103], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentPosition[0]);
    }

    /**
     * Gets ith "PhysicalRecordSegmentPosition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentPosition getPhysicalRecordSegmentPositionArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentPosition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentPosition)get_store().find_element_user(PROPERTY_QNAME[103], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "PhysicalRecordSegmentPosition" element
     */
    @Override
    public int sizeOfPhysicalRecordSegmentPositionArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[103]);
        }
    }

    /**
     * Sets array of all "PhysicalRecordSegmentPosition" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setPhysicalRecordSegmentPositionArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentPosition[] physicalRecordSegmentPositionArray) {
        check_orphaned();
        arraySetterHelper(physicalRecordSegmentPositionArray, PROPERTY_QNAME[103]);
    }

    /**
     * Sets ith "PhysicalRecordSegmentPosition" element
     */
    @Override
    public void setPhysicalRecordSegmentPositionArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentPosition physicalRecordSegmentPosition) {
        generatedSetterHelperImpl(physicalRecordSegmentPosition, PROPERTY_QNAME[103], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "PhysicalRecordSegmentPosition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentPosition insertNewPhysicalRecordSegmentPosition(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentPosition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentPosition)get_store().insert_element_user(PROPERTY_QNAME[103], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "PhysicalRecordSegmentPosition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentPosition addNewPhysicalRecordSegmentPosition() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentPosition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentPosition)get_store().add_element_user(PROPERTY_QNAME[103]);
            return target;
        }
    }

    /**
     * Removes the ith "PhysicalRecordSegmentPosition" element
     */
    @Override
    public void removePhysicalRecordSegmentPosition(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[103], i);
        }
    }

    /**
     * Gets a List of "PhysicalRecordSegmentRelationship" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship> getPhysicalRecordSegmentRelationshipList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getPhysicalRecordSegmentRelationshipArray,
                this::setPhysicalRecordSegmentRelationshipArray,
                this::insertNewPhysicalRecordSegmentRelationship,
                this::removePhysicalRecordSegmentRelationship,
                this::sizeOfPhysicalRecordSegmentRelationshipArray
            );
        }
    }

    /**
     * Gets array of all "PhysicalRecordSegmentRelationship" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship[] getPhysicalRecordSegmentRelationshipArray() {
        return getXmlObjectArray(PROPERTY_QNAME[104], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship[0]);
    }

    /**
     * Gets ith "PhysicalRecordSegmentRelationship" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship getPhysicalRecordSegmentRelationshipArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship)get_store().find_element_user(PROPERTY_QNAME[104], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "PhysicalRecordSegmentRelationship" element
     */
    @Override
    public int sizeOfPhysicalRecordSegmentRelationshipArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[104]);
        }
    }

    /**
     * Sets array of all "PhysicalRecordSegmentRelationship" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setPhysicalRecordSegmentRelationshipArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship[] physicalRecordSegmentRelationshipArray) {
        check_orphaned();
        arraySetterHelper(physicalRecordSegmentRelationshipArray, PROPERTY_QNAME[104]);
    }

    /**
     * Sets ith "PhysicalRecordSegmentRelationship" element
     */
    @Override
    public void setPhysicalRecordSegmentRelationshipArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship physicalRecordSegmentRelationship) {
        generatedSetterHelperImpl(physicalRecordSegmentRelationship, PROPERTY_QNAME[104], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "PhysicalRecordSegmentRelationship" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship insertNewPhysicalRecordSegmentRelationship(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship)get_store().insert_element_user(PROPERTY_QNAME[104], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "PhysicalRecordSegmentRelationship" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship addNewPhysicalRecordSegmentRelationship() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship)get_store().add_element_user(PROPERTY_QNAME[104]);
            return target;
        }
    }

    /**
     * Removes the ith "PhysicalRecordSegmentRelationship" element
     */
    @Override
    public void removePhysicalRecordSegmentRelationship(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[104], i);
        }
    }

    /**
     * Gets a List of "PhysicalRecordSegmentStructure" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentStructure> getPhysicalRecordSegmentStructureList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getPhysicalRecordSegmentStructureArray,
                this::setPhysicalRecordSegmentStructureArray,
                this::insertNewPhysicalRecordSegmentStructure,
                this::removePhysicalRecordSegmentStructure,
                this::sizeOfPhysicalRecordSegmentStructureArray
            );
        }
    }

    /**
     * Gets array of all "PhysicalRecordSegmentStructure" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentStructure[] getPhysicalRecordSegmentStructureArray() {
        return getXmlObjectArray(PROPERTY_QNAME[105], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentStructure[0]);
    }

    /**
     * Gets ith "PhysicalRecordSegmentStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentStructure getPhysicalRecordSegmentStructureArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentStructure)get_store().find_element_user(PROPERTY_QNAME[105], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "PhysicalRecordSegmentStructure" element
     */
    @Override
    public int sizeOfPhysicalRecordSegmentStructureArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[105]);
        }
    }

    /**
     * Sets array of all "PhysicalRecordSegmentStructure" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setPhysicalRecordSegmentStructureArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentStructure[] physicalRecordSegmentStructureArray) {
        check_orphaned();
        arraySetterHelper(physicalRecordSegmentStructureArray, PROPERTY_QNAME[105]);
    }

    /**
     * Sets ith "PhysicalRecordSegmentStructure" element
     */
    @Override
    public void setPhysicalRecordSegmentStructureArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentStructure physicalRecordSegmentStructure) {
        generatedSetterHelperImpl(physicalRecordSegmentStructure, PROPERTY_QNAME[105], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "PhysicalRecordSegmentStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentStructure insertNewPhysicalRecordSegmentStructure(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentStructure)get_store().insert_element_user(PROPERTY_QNAME[105], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "PhysicalRecordSegmentStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentStructure addNewPhysicalRecordSegmentStructure() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentStructure)get_store().add_element_user(PROPERTY_QNAME[105]);
            return target;
        }
    }

    /**
     * Removes the ith "PhysicalRecordSegmentStructure" element
     */
    @Override
    public void removePhysicalRecordSegmentStructure(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[105], i);
        }
    }

    /**
     * Gets a List of "PhysicalSegmentLayout" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout> getPhysicalSegmentLayoutList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getPhysicalSegmentLayoutArray,
                this::setPhysicalSegmentLayoutArray,
                this::insertNewPhysicalSegmentLayout,
                this::removePhysicalSegmentLayout,
                this::sizeOfPhysicalSegmentLayoutArray
            );
        }
    }

    /**
     * Gets array of all "PhysicalSegmentLayout" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout[] getPhysicalSegmentLayoutArray() {
        return getXmlObjectArray(PROPERTY_QNAME[106], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout[0]);
    }

    /**
     * Gets ith "PhysicalSegmentLayout" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout getPhysicalSegmentLayoutArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout)get_store().find_element_user(PROPERTY_QNAME[106], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "PhysicalSegmentLayout" element
     */
    @Override
    public int sizeOfPhysicalSegmentLayoutArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[106]);
        }
    }

    /**
     * Sets array of all "PhysicalSegmentLayout" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setPhysicalSegmentLayoutArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout[] physicalSegmentLayoutArray) {
        check_orphaned();
        arraySetterHelper(physicalSegmentLayoutArray, PROPERTY_QNAME[106]);
    }

    /**
     * Sets ith "PhysicalSegmentLayout" element
     */
    @Override
    public void setPhysicalSegmentLayoutArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout physicalSegmentLayout) {
        generatedSetterHelperImpl(physicalSegmentLayout, PROPERTY_QNAME[106], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "PhysicalSegmentLayout" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout insertNewPhysicalSegmentLayout(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout)get_store().insert_element_user(PROPERTY_QNAME[106], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "PhysicalSegmentLayout" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout addNewPhysicalSegmentLayout() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout)get_store().add_element_user(PROPERTY_QNAME[106]);
            return target;
        }
    }

    /**
     * Removes the ith "PhysicalSegmentLayout" element
     */
    @Override
    public void removePhysicalSegmentLayout(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[106], i);
        }
    }

    /**
     * Gets a List of "PhysicalSegmentLocation" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLocation> getPhysicalSegmentLocationList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getPhysicalSegmentLocationArray,
                this::setPhysicalSegmentLocationArray,
                this::insertNewPhysicalSegmentLocation,
                this::removePhysicalSegmentLocation,
                this::sizeOfPhysicalSegmentLocationArray
            );
        }
    }

    /**
     * Gets array of all "PhysicalSegmentLocation" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLocation[] getPhysicalSegmentLocationArray() {
        return getXmlObjectArray(PROPERTY_QNAME[107], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLocation[0]);
    }

    /**
     * Gets ith "PhysicalSegmentLocation" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLocation getPhysicalSegmentLocationArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLocation target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLocation)get_store().find_element_user(PROPERTY_QNAME[107], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "PhysicalSegmentLocation" element
     */
    @Override
    public int sizeOfPhysicalSegmentLocationArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[107]);
        }
    }

    /**
     * Sets array of all "PhysicalSegmentLocation" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setPhysicalSegmentLocationArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLocation[] physicalSegmentLocationArray) {
        check_orphaned();
        arraySetterHelper(physicalSegmentLocationArray, PROPERTY_QNAME[107]);
    }

    /**
     * Sets ith "PhysicalSegmentLocation" element
     */
    @Override
    public void setPhysicalSegmentLocationArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLocation physicalSegmentLocation) {
        generatedSetterHelperImpl(physicalSegmentLocation, PROPERTY_QNAME[107], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "PhysicalSegmentLocation" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLocation insertNewPhysicalSegmentLocation(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLocation target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLocation)get_store().insert_element_user(PROPERTY_QNAME[107], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "PhysicalSegmentLocation" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLocation addNewPhysicalSegmentLocation() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLocation target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLocation)get_store().add_element_user(PROPERTY_QNAME[107]);
            return target;
        }
    }

    /**
     * Removes the ith "PhysicalSegmentLocation" element
     */
    @Override
    public void removePhysicalSegmentLocation(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[107], i);
        }
    }

    /**
     * Gets a List of "Population" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Population> getPopulationList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getPopulationArray,
                this::setPopulationArray,
                this::insertNewPopulation,
                this::removePopulation,
                this::sizeOfPopulationArray
            );
        }
    }

    /**
     * Gets array of all "Population" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Population[] getPopulationArray() {
        return getXmlObjectArray(PROPERTY_QNAME[108], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.Population[0]);
    }

    /**
     * Gets ith "Population" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Population getPopulationArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Population target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Population)get_store().find_element_user(PROPERTY_QNAME[108], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Population" element
     */
    @Override
    public int sizeOfPopulationArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[108]);
        }
    }

    /**
     * Sets array of all "Population" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setPopulationArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Population[] populationArray) {
        check_orphaned();
        arraySetterHelper(populationArray, PROPERTY_QNAME[108]);
    }

    /**
     * Sets ith "Population" element
     */
    @Override
    public void setPopulationArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Population population) {
        generatedSetterHelperImpl(population, PROPERTY_QNAME[108], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Population" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Population insertNewPopulation(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Population target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Population)get_store().insert_element_user(PROPERTY_QNAME[108], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Population" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Population addNewPopulation() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Population target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Population)get_store().add_element_user(PROPERTY_QNAME[108]);
            return target;
        }
    }

    /**
     * Removes the ith "Population" element
     */
    @Override
    public void removePopulation(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[108], i);
        }
    }

    /**
     * Gets a List of "PrimaryKey" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKey> getPrimaryKeyList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getPrimaryKeyArray,
                this::setPrimaryKeyArray,
                this::insertNewPrimaryKey,
                this::removePrimaryKey,
                this::sizeOfPrimaryKeyArray
            );
        }
    }

    /**
     * Gets array of all "PrimaryKey" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKey[] getPrimaryKeyArray() {
        return getXmlObjectArray(PROPERTY_QNAME[109], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKey[0]);
    }

    /**
     * Gets ith "PrimaryKey" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKey getPrimaryKeyArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKey target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKey)get_store().find_element_user(PROPERTY_QNAME[109], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "PrimaryKey" element
     */
    @Override
    public int sizeOfPrimaryKeyArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[109]);
        }
    }

    /**
     * Sets array of all "PrimaryKey" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setPrimaryKeyArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKey[] primaryKeyArray) {
        check_orphaned();
        arraySetterHelper(primaryKeyArray, PROPERTY_QNAME[109]);
    }

    /**
     * Sets ith "PrimaryKey" element
     */
    @Override
    public void setPrimaryKeyArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKey primaryKey) {
        generatedSetterHelperImpl(primaryKey, PROPERTY_QNAME[109], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "PrimaryKey" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKey insertNewPrimaryKey(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKey target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKey)get_store().insert_element_user(PROPERTY_QNAME[109], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "PrimaryKey" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKey addNewPrimaryKey() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKey target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKey)get_store().add_element_user(PROPERTY_QNAME[109]);
            return target;
        }
    }

    /**
     * Removes the ith "PrimaryKey" element
     */
    @Override
    public void removePrimaryKey(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[109], i);
        }
    }

    /**
     * Gets a List of "PrimaryKeyComponent" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKeyComponent> getPrimaryKeyComponentList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getPrimaryKeyComponentArray,
                this::setPrimaryKeyComponentArray,
                this::insertNewPrimaryKeyComponent,
                this::removePrimaryKeyComponent,
                this::sizeOfPrimaryKeyComponentArray
            );
        }
    }

    /**
     * Gets array of all "PrimaryKeyComponent" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKeyComponent[] getPrimaryKeyComponentArray() {
        return getXmlObjectArray(PROPERTY_QNAME[110], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKeyComponent[0]);
    }

    /**
     * Gets ith "PrimaryKeyComponent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKeyComponent getPrimaryKeyComponentArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKeyComponent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKeyComponent)get_store().find_element_user(PROPERTY_QNAME[110], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "PrimaryKeyComponent" element
     */
    @Override
    public int sizeOfPrimaryKeyComponentArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[110]);
        }
    }

    /**
     * Sets array of all "PrimaryKeyComponent" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setPrimaryKeyComponentArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKeyComponent[] primaryKeyComponentArray) {
        check_orphaned();
        arraySetterHelper(primaryKeyComponentArray, PROPERTY_QNAME[110]);
    }

    /**
     * Sets ith "PrimaryKeyComponent" element
     */
    @Override
    public void setPrimaryKeyComponentArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKeyComponent primaryKeyComponent) {
        generatedSetterHelperImpl(primaryKeyComponent, PROPERTY_QNAME[110], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "PrimaryKeyComponent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKeyComponent insertNewPrimaryKeyComponent(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKeyComponent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKeyComponent)get_store().insert_element_user(PROPERTY_QNAME[110], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "PrimaryKeyComponent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKeyComponent addNewPrimaryKeyComponent() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKeyComponent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKeyComponent)get_store().add_element_user(PROPERTY_QNAME[110]);
            return target;
        }
    }

    /**
     * Removes the ith "PrimaryKeyComponent" element
     */
    @Override
    public void removePrimaryKeyComponent(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[110], i);
        }
    }

    /**
     * Gets a List of "ProcessingAgent" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent> getProcessingAgentList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getProcessingAgentArray,
                this::setProcessingAgentArray,
                this::insertNewProcessingAgent,
                this::removeProcessingAgent,
                this::sizeOfProcessingAgentArray
            );
        }
    }

    /**
     * Gets array of all "ProcessingAgent" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent[] getProcessingAgentArray() {
        return getXmlObjectArray(PROPERTY_QNAME[111], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent[0]);
    }

    /**
     * Gets ith "ProcessingAgent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent getProcessingAgentArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent)get_store().find_element_user(PROPERTY_QNAME[111], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ProcessingAgent" element
     */
    @Override
    public int sizeOfProcessingAgentArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[111]);
        }
    }

    /**
     * Sets array of all "ProcessingAgent" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setProcessingAgentArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent[] processingAgentArray) {
        check_orphaned();
        arraySetterHelper(processingAgentArray, PROPERTY_QNAME[111]);
    }

    /**
     * Sets ith "ProcessingAgent" element
     */
    @Override
    public void setProcessingAgentArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent processingAgent) {
        generatedSetterHelperImpl(processingAgent, PROPERTY_QNAME[111], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ProcessingAgent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent insertNewProcessingAgent(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent)get_store().insert_element_user(PROPERTY_QNAME[111], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ProcessingAgent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent addNewProcessingAgent() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent)get_store().add_element_user(PROPERTY_QNAME[111]);
            return target;
        }
    }

    /**
     * Removes the ith "ProcessingAgent" element
     */
    @Override
    public void removeProcessingAgent(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[111], i);
        }
    }

    /**
     * Gets a List of "ProductionEnvironment" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProductionEnvironment> getProductionEnvironmentList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getProductionEnvironmentArray,
                this::setProductionEnvironmentArray,
                this::insertNewProductionEnvironment,
                this::removeProductionEnvironment,
                this::sizeOfProductionEnvironmentArray
            );
        }
    }

    /**
     * Gets array of all "ProductionEnvironment" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProductionEnvironment[] getProductionEnvironmentArray() {
        return getXmlObjectArray(PROPERTY_QNAME[112], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProductionEnvironment[0]);
    }

    /**
     * Gets ith "ProductionEnvironment" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProductionEnvironment getProductionEnvironmentArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProductionEnvironment target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProductionEnvironment)get_store().find_element_user(PROPERTY_QNAME[112], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ProductionEnvironment" element
     */
    @Override
    public int sizeOfProductionEnvironmentArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[112]);
        }
    }

    /**
     * Sets array of all "ProductionEnvironment" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setProductionEnvironmentArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProductionEnvironment[] productionEnvironmentArray) {
        check_orphaned();
        arraySetterHelper(productionEnvironmentArray, PROPERTY_QNAME[112]);
    }

    /**
     * Sets ith "ProductionEnvironment" element
     */
    @Override
    public void setProductionEnvironmentArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProductionEnvironment productionEnvironment) {
        generatedSetterHelperImpl(productionEnvironment, PROPERTY_QNAME[112], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ProductionEnvironment" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProductionEnvironment insertNewProductionEnvironment(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProductionEnvironment target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProductionEnvironment)get_store().insert_element_user(PROPERTY_QNAME[112], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ProductionEnvironment" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProductionEnvironment addNewProductionEnvironment() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProductionEnvironment target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProductionEnvironment)get_store().add_element_user(PROPERTY_QNAME[112]);
            return target;
        }
    }

    /**
     * Removes the ith "ProductionEnvironment" element
     */
    @Override
    public void removeProductionEnvironment(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[112], i);
        }
    }

    /**
     * Gets a List of "QualifiedMeasure" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.QualifiedMeasure> getQualifiedMeasureList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getQualifiedMeasureArray,
                this::setQualifiedMeasureArray,
                this::insertNewQualifiedMeasure,
                this::removeQualifiedMeasure,
                this::sizeOfQualifiedMeasureArray
            );
        }
    }

    /**
     * Gets array of all "QualifiedMeasure" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.QualifiedMeasure[] getQualifiedMeasureArray() {
        return getXmlObjectArray(PROPERTY_QNAME[113], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.QualifiedMeasure[0]);
    }

    /**
     * Gets ith "QualifiedMeasure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.QualifiedMeasure getQualifiedMeasureArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.QualifiedMeasure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.QualifiedMeasure)get_store().find_element_user(PROPERTY_QNAME[113], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "QualifiedMeasure" element
     */
    @Override
    public int sizeOfQualifiedMeasureArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[113]);
        }
    }

    /**
     * Sets array of all "QualifiedMeasure" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setQualifiedMeasureArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.QualifiedMeasure[] qualifiedMeasureArray) {
        check_orphaned();
        arraySetterHelper(qualifiedMeasureArray, PROPERTY_QNAME[113]);
    }

    /**
     * Sets ith "QualifiedMeasure" element
     */
    @Override
    public void setQualifiedMeasureArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.QualifiedMeasure qualifiedMeasure) {
        generatedSetterHelperImpl(qualifiedMeasure, PROPERTY_QNAME[113], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "QualifiedMeasure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.QualifiedMeasure insertNewQualifiedMeasure(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.QualifiedMeasure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.QualifiedMeasure)get_store().insert_element_user(PROPERTY_QNAME[113], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "QualifiedMeasure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.QualifiedMeasure addNewQualifiedMeasure() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.QualifiedMeasure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.QualifiedMeasure)get_store().add_element_user(PROPERTY_QNAME[113]);
            return target;
        }
    }

    /**
     * Removes the ith "QualifiedMeasure" element
     */
    @Override
    public void removeQualifiedMeasure(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[113], i);
        }
    }

    /**
     * Gets a List of "RecordRelation" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.RecordRelation> getRecordRelationList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getRecordRelationArray,
                this::setRecordRelationArray,
                this::insertNewRecordRelation,
                this::removeRecordRelation,
                this::sizeOfRecordRelationArray
            );
        }
    }

    /**
     * Gets array of all "RecordRelation" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.RecordRelation[] getRecordRelationArray() {
        return getXmlObjectArray(PROPERTY_QNAME[114], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.RecordRelation[0]);
    }

    /**
     * Gets ith "RecordRelation" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.RecordRelation getRecordRelationArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.RecordRelation target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.RecordRelation)get_store().find_element_user(PROPERTY_QNAME[114], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "RecordRelation" element
     */
    @Override
    public int sizeOfRecordRelationArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[114]);
        }
    }

    /**
     * Sets array of all "RecordRelation" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setRecordRelationArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.RecordRelation[] recordRelationArray) {
        check_orphaned();
        arraySetterHelper(recordRelationArray, PROPERTY_QNAME[114]);
    }

    /**
     * Sets ith "RecordRelation" element
     */
    @Override
    public void setRecordRelationArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.RecordRelation recordRelation) {
        generatedSetterHelperImpl(recordRelation, PROPERTY_QNAME[114], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "RecordRelation" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.RecordRelation insertNewRecordRelation(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.RecordRelation target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.RecordRelation)get_store().insert_element_user(PROPERTY_QNAME[114], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "RecordRelation" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.RecordRelation addNewRecordRelation() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.RecordRelation target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.RecordRelation)get_store().add_element_user(PROPERTY_QNAME[114]);
            return target;
        }
    }

    /**
     * Removes the ith "RecordRelation" element
     */
    @Override
    public void removeRecordRelation(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[114], i);
        }
    }

    /**
     * Gets a List of "ReferenceValue" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValue> getReferenceValueList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getReferenceValueArray,
                this::setReferenceValueArray,
                this::insertNewReferenceValue,
                this::removeReferenceValue,
                this::sizeOfReferenceValueArray
            );
        }
    }

    /**
     * Gets array of all "ReferenceValue" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValue[] getReferenceValueArray() {
        return getXmlObjectArray(PROPERTY_QNAME[115], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValue[0]);
    }

    /**
     * Gets ith "ReferenceValue" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValue getReferenceValueArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValue target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValue)get_store().find_element_user(PROPERTY_QNAME[115], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ReferenceValue" element
     */
    @Override
    public int sizeOfReferenceValueArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[115]);
        }
    }

    /**
     * Sets array of all "ReferenceValue" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setReferenceValueArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValue[] referenceValueArray) {
        check_orphaned();
        arraySetterHelper(referenceValueArray, PROPERTY_QNAME[115]);
    }

    /**
     * Sets ith "ReferenceValue" element
     */
    @Override
    public void setReferenceValueArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValue referenceValue) {
        generatedSetterHelperImpl(referenceValue, PROPERTY_QNAME[115], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ReferenceValue" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValue insertNewReferenceValue(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValue target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValue)get_store().insert_element_user(PROPERTY_QNAME[115], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ReferenceValue" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValue addNewReferenceValue() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValue target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValue)get_store().add_element_user(PROPERTY_QNAME[115]);
            return target;
        }
    }

    /**
     * Removes the ith "ReferenceValue" element
     */
    @Override
    public void removeReferenceValue(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[115], i);
        }
    }

    /**
     * Gets a List of "ReferenceValueDomain" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValueDomain> getReferenceValueDomainList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getReferenceValueDomainArray,
                this::setReferenceValueDomainArray,
                this::insertNewReferenceValueDomain,
                this::removeReferenceValueDomain,
                this::sizeOfReferenceValueDomainArray
            );
        }
    }

    /**
     * Gets array of all "ReferenceValueDomain" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValueDomain[] getReferenceValueDomainArray() {
        return getXmlObjectArray(PROPERTY_QNAME[116], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValueDomain[0]);
    }

    /**
     * Gets ith "ReferenceValueDomain" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValueDomain getReferenceValueDomainArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValueDomain target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValueDomain)get_store().find_element_user(PROPERTY_QNAME[116], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ReferenceValueDomain" element
     */
    @Override
    public int sizeOfReferenceValueDomainArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[116]);
        }
    }

    /**
     * Sets array of all "ReferenceValueDomain" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setReferenceValueDomainArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValueDomain[] referenceValueDomainArray) {
        check_orphaned();
        arraySetterHelper(referenceValueDomainArray, PROPERTY_QNAME[116]);
    }

    /**
     * Sets ith "ReferenceValueDomain" element
     */
    @Override
    public void setReferenceValueDomainArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValueDomain referenceValueDomain) {
        generatedSetterHelperImpl(referenceValueDomain, PROPERTY_QNAME[116], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ReferenceValueDomain" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValueDomain insertNewReferenceValueDomain(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValueDomain target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValueDomain)get_store().insert_element_user(PROPERTY_QNAME[116], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ReferenceValueDomain" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValueDomain addNewReferenceValueDomain() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValueDomain target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValueDomain)get_store().add_element_user(PROPERTY_QNAME[116]);
            return target;
        }
    }

    /**
     * Removes the ith "ReferenceValueDomain" element
     */
    @Override
    public void removeReferenceValueDomain(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[116], i);
        }
    }

    /**
     * Gets a List of "ReferenceVariable" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceVariable> getReferenceVariableList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getReferenceVariableArray,
                this::setReferenceVariableArray,
                this::insertNewReferenceVariable,
                this::removeReferenceVariable,
                this::sizeOfReferenceVariableArray
            );
        }
    }

    /**
     * Gets array of all "ReferenceVariable" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceVariable[] getReferenceVariableArray() {
        return getXmlObjectArray(PROPERTY_QNAME[117], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceVariable[0]);
    }

    /**
     * Gets ith "ReferenceVariable" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceVariable getReferenceVariableArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceVariable target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceVariable)get_store().find_element_user(PROPERTY_QNAME[117], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ReferenceVariable" element
     */
    @Override
    public int sizeOfReferenceVariableArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[117]);
        }
    }

    /**
     * Sets array of all "ReferenceVariable" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setReferenceVariableArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceVariable[] referenceVariableArray) {
        check_orphaned();
        arraySetterHelper(referenceVariableArray, PROPERTY_QNAME[117]);
    }

    /**
     * Sets ith "ReferenceVariable" element
     */
    @Override
    public void setReferenceVariableArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceVariable referenceVariable) {
        generatedSetterHelperImpl(referenceVariable, PROPERTY_QNAME[117], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ReferenceVariable" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceVariable insertNewReferenceVariable(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceVariable target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceVariable)get_store().insert_element_user(PROPERTY_QNAME[117], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ReferenceVariable" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceVariable addNewReferenceVariable() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceVariable target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceVariable)get_store().add_element_user(PROPERTY_QNAME[117]);
            return target;
        }
    }

    /**
     * Removes the ith "ReferenceVariable" element
     */
    @Override
    public void removeReferenceVariable(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[117], i);
        }
    }

    /**
     * Gets a List of "RepresentedVariable" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable> getRepresentedVariableList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getRepresentedVariableArray,
                this::setRepresentedVariableArray,
                this::insertNewRepresentedVariable,
                this::removeRepresentedVariable,
                this::sizeOfRepresentedVariableArray
            );
        }
    }

    /**
     * Gets array of all "RepresentedVariable" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable[] getRepresentedVariableArray() {
        return getXmlObjectArray(PROPERTY_QNAME[118], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable[0]);
    }

    /**
     * Gets ith "RepresentedVariable" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable getRepresentedVariableArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable)get_store().find_element_user(PROPERTY_QNAME[118], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "RepresentedVariable" element
     */
    @Override
    public int sizeOfRepresentedVariableArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[118]);
        }
    }

    /**
     * Sets array of all "RepresentedVariable" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setRepresentedVariableArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable[] representedVariableArray) {
        check_orphaned();
        arraySetterHelper(representedVariableArray, PROPERTY_QNAME[118]);
    }

    /**
     * Sets ith "RepresentedVariable" element
     */
    @Override
    public void setRepresentedVariableArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable representedVariable) {
        generatedSetterHelperImpl(representedVariable, PROPERTY_QNAME[118], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "RepresentedVariable" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable insertNewRepresentedVariable(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable)get_store().insert_element_user(PROPERTY_QNAME[118], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "RepresentedVariable" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable addNewRepresentedVariable() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable)get_store().add_element_user(PROPERTY_QNAME[118]);
            return target;
        }
    }

    /**
     * Removes the ith "RepresentedVariable" element
     */
    @Override
    public void removeRepresentedVariable(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[118], i);
        }
    }

    /**
     * Gets a List of "RevisableDatum" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.RevisableDatum> getRevisableDatumList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getRevisableDatumArray,
                this::setRevisableDatumArray,
                this::insertNewRevisableDatum,
                this::removeRevisableDatum,
                this::sizeOfRevisableDatumArray
            );
        }
    }

    /**
     * Gets array of all "RevisableDatum" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.RevisableDatum[] getRevisableDatumArray() {
        return getXmlObjectArray(PROPERTY_QNAME[119], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.RevisableDatum[0]);
    }

    /**
     * Gets ith "RevisableDatum" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.RevisableDatum getRevisableDatumArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.RevisableDatum target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.RevisableDatum)get_store().find_element_user(PROPERTY_QNAME[119], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "RevisableDatum" element
     */
    @Override
    public int sizeOfRevisableDatumArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[119]);
        }
    }

    /**
     * Sets array of all "RevisableDatum" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setRevisableDatumArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.RevisableDatum[] revisableDatumArray) {
        check_orphaned();
        arraySetterHelper(revisableDatumArray, PROPERTY_QNAME[119]);
    }

    /**
     * Sets ith "RevisableDatum" element
     */
    @Override
    public void setRevisableDatumArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.RevisableDatum revisableDatum) {
        generatedSetterHelperImpl(revisableDatum, PROPERTY_QNAME[119], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "RevisableDatum" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.RevisableDatum insertNewRevisableDatum(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.RevisableDatum target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.RevisableDatum)get_store().insert_element_user(PROPERTY_QNAME[119], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "RevisableDatum" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.RevisableDatum addNewRevisableDatum() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.RevisableDatum target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.RevisableDatum)get_store().add_element_user(PROPERTY_QNAME[119]);
            return target;
        }
    }

    /**
     * Removes the ith "RevisableDatum" element
     */
    @Override
    public void removeRevisableDatum(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[119], i);
        }
    }

    /**
     * Gets a List of "Revision" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Revision> getRevisionList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getRevisionArray,
                this::setRevisionArray,
                this::insertNewRevision,
                this::removeRevision,
                this::sizeOfRevisionArray
            );
        }
    }

    /**
     * Gets array of all "Revision" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Revision[] getRevisionArray() {
        return getXmlObjectArray(PROPERTY_QNAME[120], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.Revision[0]);
    }

    /**
     * Gets ith "Revision" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Revision getRevisionArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Revision target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Revision)get_store().find_element_user(PROPERTY_QNAME[120], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Revision" element
     */
    @Override
    public int sizeOfRevisionArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[120]);
        }
    }

    /**
     * Sets array of all "Revision" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setRevisionArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Revision[] revisionArray) {
        check_orphaned();
        arraySetterHelper(revisionArray, PROPERTY_QNAME[120]);
    }

    /**
     * Sets ith "Revision" element
     */
    @Override
    public void setRevisionArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Revision revision) {
        generatedSetterHelperImpl(revision, PROPERTY_QNAME[120], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Revision" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Revision insertNewRevision(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Revision target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Revision)get_store().insert_element_user(PROPERTY_QNAME[120], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Revision" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Revision addNewRevision() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Revision target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Revision)get_store().add_element_user(PROPERTY_QNAME[120]);
            return target;
        }
    }

    /**
     * Removes the ith "Revision" element
     */
    @Override
    public void removeRevision(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[120], i);
        }
    }

    /**
     * Gets a List of "Rule" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Rule> getRuleList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getRuleArray,
                this::setRuleArray,
                this::insertNewRule,
                this::removeRule,
                this::sizeOfRuleArray
            );
        }
    }

    /**
     * Gets array of all "Rule" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Rule[] getRuleArray() {
        return getXmlObjectArray(PROPERTY_QNAME[121], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.Rule[0]);
    }

    /**
     * Gets ith "Rule" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Rule getRuleArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Rule target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Rule)get_store().find_element_user(PROPERTY_QNAME[121], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Rule" element
     */
    @Override
    public int sizeOfRuleArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[121]);
        }
    }

    /**
     * Sets array of all "Rule" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setRuleArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Rule[] ruleArray) {
        check_orphaned();
        arraySetterHelper(ruleArray, PROPERTY_QNAME[121]);
    }

    /**
     * Sets ith "Rule" element
     */
    @Override
    public void setRuleArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Rule rule) {
        generatedSetterHelperImpl(rule, PROPERTY_QNAME[121], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Rule" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Rule insertNewRule(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Rule target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Rule)get_store().insert_element_user(PROPERTY_QNAME[121], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Rule" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Rule addNewRule() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Rule target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Rule)get_store().add_element_user(PROPERTY_QNAME[121]);
            return target;
        }
    }

    /**
     * Removes the ith "Rule" element
     */
    @Override
    public void removeRule(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[121], i);
        }
    }

    /**
     * Gets a List of "RuleBasedScheduling" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleBasedScheduling> getRuleBasedSchedulingList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getRuleBasedSchedulingArray,
                this::setRuleBasedSchedulingArray,
                this::insertNewRuleBasedScheduling,
                this::removeRuleBasedScheduling,
                this::sizeOfRuleBasedSchedulingArray
            );
        }
    }

    /**
     * Gets array of all "RuleBasedScheduling" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleBasedScheduling[] getRuleBasedSchedulingArray() {
        return getXmlObjectArray(PROPERTY_QNAME[122], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleBasedScheduling[0]);
    }

    /**
     * Gets ith "RuleBasedScheduling" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleBasedScheduling getRuleBasedSchedulingArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleBasedScheduling target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleBasedScheduling)get_store().find_element_user(PROPERTY_QNAME[122], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "RuleBasedScheduling" element
     */
    @Override
    public int sizeOfRuleBasedSchedulingArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[122]);
        }
    }

    /**
     * Sets array of all "RuleBasedScheduling" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setRuleBasedSchedulingArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleBasedScheduling[] ruleBasedSchedulingArray) {
        check_orphaned();
        arraySetterHelper(ruleBasedSchedulingArray, PROPERTY_QNAME[122]);
    }

    /**
     * Sets ith "RuleBasedScheduling" element
     */
    @Override
    public void setRuleBasedSchedulingArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleBasedScheduling ruleBasedScheduling) {
        generatedSetterHelperImpl(ruleBasedScheduling, PROPERTY_QNAME[122], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "RuleBasedScheduling" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleBasedScheduling insertNewRuleBasedScheduling(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleBasedScheduling target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleBasedScheduling)get_store().insert_element_user(PROPERTY_QNAME[122], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "RuleBasedScheduling" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleBasedScheduling addNewRuleBasedScheduling() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleBasedScheduling target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleBasedScheduling)get_store().add_element_user(PROPERTY_QNAME[122]);
            return target;
        }
    }

    /**
     * Removes the ith "RuleBasedScheduling" element
     */
    @Override
    public void removeRuleBasedScheduling(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[122], i);
        }
    }

    /**
     * Gets a List of "RuleSet" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleSet> getRuleSetList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getRuleSetArray,
                this::setRuleSetArray,
                this::insertNewRuleSet,
                this::removeRuleSet,
                this::sizeOfRuleSetArray
            );
        }
    }

    /**
     * Gets array of all "RuleSet" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleSet[] getRuleSetArray() {
        return getXmlObjectArray(PROPERTY_QNAME[123], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleSet[0]);
    }

    /**
     * Gets ith "RuleSet" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleSet getRuleSetArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleSet target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleSet)get_store().find_element_user(PROPERTY_QNAME[123], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "RuleSet" element
     */
    @Override
    public int sizeOfRuleSetArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[123]);
        }
    }

    /**
     * Sets array of all "RuleSet" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setRuleSetArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleSet[] ruleSetArray) {
        check_orphaned();
        arraySetterHelper(ruleSetArray, PROPERTY_QNAME[123]);
    }

    /**
     * Sets ith "RuleSet" element
     */
    @Override
    public void setRuleSetArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleSet ruleSet) {
        generatedSetterHelperImpl(ruleSet, PROPERTY_QNAME[123], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "RuleSet" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleSet insertNewRuleSet(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleSet target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleSet)get_store().insert_element_user(PROPERTY_QNAME[123], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "RuleSet" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleSet addNewRuleSet() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleSet target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleSet)get_store().add_element_user(PROPERTY_QNAME[123]);
            return target;
        }
    }

    /**
     * Removes the ith "RuleSet" element
     */
    @Override
    public void removeRuleSet(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[123], i);
        }
    }

    /**
     * Gets a List of "ScopedMeasure" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure> getScopedMeasureList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getScopedMeasureArray,
                this::setScopedMeasureArray,
                this::insertNewScopedMeasure,
                this::removeScopedMeasure,
                this::sizeOfScopedMeasureArray
            );
        }
    }

    /**
     * Gets array of all "ScopedMeasure" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure[] getScopedMeasureArray() {
        return getXmlObjectArray(PROPERTY_QNAME[124], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure[0]);
    }

    /**
     * Gets ith "ScopedMeasure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure getScopedMeasureArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure)get_store().find_element_user(PROPERTY_QNAME[124], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ScopedMeasure" element
     */
    @Override
    public int sizeOfScopedMeasureArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[124]);
        }
    }

    /**
     * Sets array of all "ScopedMeasure" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setScopedMeasureArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure[] scopedMeasureArray) {
        check_orphaned();
        arraySetterHelper(scopedMeasureArray, PROPERTY_QNAME[124]);
    }

    /**
     * Sets ith "ScopedMeasure" element
     */
    @Override
    public void setScopedMeasureArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure scopedMeasure) {
        generatedSetterHelperImpl(scopedMeasure, PROPERTY_QNAME[124], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ScopedMeasure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure insertNewScopedMeasure(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure)get_store().insert_element_user(PROPERTY_QNAME[124], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ScopedMeasure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure addNewScopedMeasure() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure)get_store().add_element_user(PROPERTY_QNAME[124]);
            return target;
        }
    }

    /**
     * Removes the ith "ScopedMeasure" element
     */
    @Override
    public void removeScopedMeasure(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[124], i);
        }
    }

    /**
     * Gets a List of "SegmentByText" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.SegmentByText> getSegmentByTextList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getSegmentByTextArray,
                this::setSegmentByTextArray,
                this::insertNewSegmentByText,
                this::removeSegmentByText,
                this::sizeOfSegmentByTextArray
            );
        }
    }

    /**
     * Gets array of all "SegmentByText" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.SegmentByText[] getSegmentByTextArray() {
        return getXmlObjectArray(PROPERTY_QNAME[125], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.SegmentByText[0]);
    }

    /**
     * Gets ith "SegmentByText" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.SegmentByText getSegmentByTextArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.SegmentByText target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.SegmentByText)get_store().find_element_user(PROPERTY_QNAME[125], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "SegmentByText" element
     */
    @Override
    public int sizeOfSegmentByTextArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[125]);
        }
    }

    /**
     * Sets array of all "SegmentByText" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setSegmentByTextArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.SegmentByText[] segmentByTextArray) {
        check_orphaned();
        arraySetterHelper(segmentByTextArray, PROPERTY_QNAME[125]);
    }

    /**
     * Sets ith "SegmentByText" element
     */
    @Override
    public void setSegmentByTextArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.SegmentByText segmentByText) {
        generatedSetterHelperImpl(segmentByText, PROPERTY_QNAME[125], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "SegmentByText" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.SegmentByText insertNewSegmentByText(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.SegmentByText target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.SegmentByText)get_store().insert_element_user(PROPERTY_QNAME[125], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "SegmentByText" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.SegmentByText addNewSegmentByText() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.SegmentByText target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.SegmentByText)get_store().add_element_user(PROPERTY_QNAME[125]);
            return target;
        }
    }

    /**
     * Removes the ith "SegmentByText" element
     */
    @Override
    public void removeSegmentByText(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[125], i);
        }
    }

    /**
     * Gets a List of "SentinelConceptualDomain" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelConceptualDomain> getSentinelConceptualDomainList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getSentinelConceptualDomainArray,
                this::setSentinelConceptualDomainArray,
                this::insertNewSentinelConceptualDomain,
                this::removeSentinelConceptualDomain,
                this::sizeOfSentinelConceptualDomainArray
            );
        }
    }

    /**
     * Gets array of all "SentinelConceptualDomain" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelConceptualDomain[] getSentinelConceptualDomainArray() {
        return getXmlObjectArray(PROPERTY_QNAME[126], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelConceptualDomain[0]);
    }

    /**
     * Gets ith "SentinelConceptualDomain" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelConceptualDomain getSentinelConceptualDomainArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelConceptualDomain target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelConceptualDomain)get_store().find_element_user(PROPERTY_QNAME[126], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "SentinelConceptualDomain" element
     */
    @Override
    public int sizeOfSentinelConceptualDomainArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[126]);
        }
    }

    /**
     * Sets array of all "SentinelConceptualDomain" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setSentinelConceptualDomainArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelConceptualDomain[] sentinelConceptualDomainArray) {
        check_orphaned();
        arraySetterHelper(sentinelConceptualDomainArray, PROPERTY_QNAME[126]);
    }

    /**
     * Sets ith "SentinelConceptualDomain" element
     */
    @Override
    public void setSentinelConceptualDomainArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelConceptualDomain sentinelConceptualDomain) {
        generatedSetterHelperImpl(sentinelConceptualDomain, PROPERTY_QNAME[126], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "SentinelConceptualDomain" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelConceptualDomain insertNewSentinelConceptualDomain(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelConceptualDomain target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelConceptualDomain)get_store().insert_element_user(PROPERTY_QNAME[126], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "SentinelConceptualDomain" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelConceptualDomain addNewSentinelConceptualDomain() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelConceptualDomain target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelConceptualDomain)get_store().add_element_user(PROPERTY_QNAME[126]);
            return target;
        }
    }

    /**
     * Removes the ith "SentinelConceptualDomain" element
     */
    @Override
    public void removeSentinelConceptualDomain(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[126], i);
        }
    }

    /**
     * Gets a List of "SentinelValueDomain" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain> getSentinelValueDomainList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getSentinelValueDomainArray,
                this::setSentinelValueDomainArray,
                this::insertNewSentinelValueDomain,
                this::removeSentinelValueDomain,
                this::sizeOfSentinelValueDomainArray
            );
        }
    }

    /**
     * Gets array of all "SentinelValueDomain" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain[] getSentinelValueDomainArray() {
        return getXmlObjectArray(PROPERTY_QNAME[127], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain[0]);
    }

    /**
     * Gets ith "SentinelValueDomain" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain getSentinelValueDomainArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain)get_store().find_element_user(PROPERTY_QNAME[127], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "SentinelValueDomain" element
     */
    @Override
    public int sizeOfSentinelValueDomainArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[127]);
        }
    }

    /**
     * Sets array of all "SentinelValueDomain" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setSentinelValueDomainArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain[] sentinelValueDomainArray) {
        check_orphaned();
        arraySetterHelper(sentinelValueDomainArray, PROPERTY_QNAME[127]);
    }

    /**
     * Sets ith "SentinelValueDomain" element
     */
    @Override
    public void setSentinelValueDomainArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain sentinelValueDomain) {
        generatedSetterHelperImpl(sentinelValueDomain, PROPERTY_QNAME[127], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "SentinelValueDomain" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain insertNewSentinelValueDomain(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain)get_store().insert_element_user(PROPERTY_QNAME[127], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "SentinelValueDomain" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain addNewSentinelValueDomain() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain)get_store().add_element_user(PROPERTY_QNAME[127]);
            return target;
        }
    }

    /**
     * Removes the ith "SentinelValueDomain" element
     */
    @Override
    public void removeSentinelValueDomain(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[127], i);
        }
    }

    /**
     * Gets a List of "Sequence" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Sequence> getSequenceList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getSequenceArray,
                this::setSequenceArray,
                this::insertNewSequence,
                this::removeSequence,
                this::sizeOfSequenceArray
            );
        }
    }

    /**
     * Gets array of all "Sequence" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Sequence[] getSequenceArray() {
        return getXmlObjectArray(PROPERTY_QNAME[128], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.Sequence[0]);
    }

    /**
     * Gets ith "Sequence" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Sequence getSequenceArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Sequence target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Sequence)get_store().find_element_user(PROPERTY_QNAME[128], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Sequence" element
     */
    @Override
    public int sizeOfSequenceArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[128]);
        }
    }

    /**
     * Sets array of all "Sequence" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setSequenceArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Sequence[] sequenceArray) {
        check_orphaned();
        arraySetterHelper(sequenceArray, PROPERTY_QNAME[128]);
    }

    /**
     * Sets ith "Sequence" element
     */
    @Override
    public void setSequenceArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Sequence sequence) {
        generatedSetterHelperImpl(sequence, PROPERTY_QNAME[128], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Sequence" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Sequence insertNewSequence(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Sequence target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Sequence)get_store().insert_element_user(PROPERTY_QNAME[128], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Sequence" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Sequence addNewSequence() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Sequence target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Sequence)get_store().add_element_user(PROPERTY_QNAME[128]);
            return target;
        }
    }

    /**
     * Removes the ith "Sequence" element
     */
    @Override
    public void removeSequence(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[128], i);
        }
    }

    /**
     * Gets a List of "SequencePosition" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.SequencePosition> getSequencePositionList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getSequencePositionArray,
                this::setSequencePositionArray,
                this::insertNewSequencePosition,
                this::removeSequencePosition,
                this::sizeOfSequencePositionArray
            );
        }
    }

    /**
     * Gets array of all "SequencePosition" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.SequencePosition[] getSequencePositionArray() {
        return getXmlObjectArray(PROPERTY_QNAME[129], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.SequencePosition[0]);
    }

    /**
     * Gets ith "SequencePosition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.SequencePosition getSequencePositionArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.SequencePosition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.SequencePosition)get_store().find_element_user(PROPERTY_QNAME[129], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "SequencePosition" element
     */
    @Override
    public int sizeOfSequencePositionArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[129]);
        }
    }

    /**
     * Sets array of all "SequencePosition" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setSequencePositionArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.SequencePosition[] sequencePositionArray) {
        check_orphaned();
        arraySetterHelper(sequencePositionArray, PROPERTY_QNAME[129]);
    }

    /**
     * Sets ith "SequencePosition" element
     */
    @Override
    public void setSequencePositionArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.SequencePosition sequencePosition) {
        generatedSetterHelperImpl(sequencePosition, PROPERTY_QNAME[129], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "SequencePosition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.SequencePosition insertNewSequencePosition(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.SequencePosition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.SequencePosition)get_store().insert_element_user(PROPERTY_QNAME[129], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "SequencePosition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.SequencePosition addNewSequencePosition() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.SequencePosition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.SequencePosition)get_store().add_element_user(PROPERTY_QNAME[129]);
            return target;
        }
    }

    /**
     * Removes the ith "SequencePosition" element
     */
    @Override
    public void removeSequencePosition(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[129], i);
        }
    }

    /**
     * Gets a List of "Service" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Service> getServiceList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getServiceArray,
                this::setServiceArray,
                this::insertNewService,
                this::removeService,
                this::sizeOfServiceArray
            );
        }
    }

    /**
     * Gets array of all "Service" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Service[] getServiceArray() {
        return getXmlObjectArray(PROPERTY_QNAME[130], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.Service[0]);
    }

    /**
     * Gets ith "Service" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Service getServiceArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Service target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Service)get_store().find_element_user(PROPERTY_QNAME[130], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Service" element
     */
    @Override
    public int sizeOfServiceArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[130]);
        }
    }

    /**
     * Sets array of all "Service" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setServiceArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Service[] serviceArray) {
        check_orphaned();
        arraySetterHelper(serviceArray, PROPERTY_QNAME[130]);
    }

    /**
     * Sets ith "Service" element
     */
    @Override
    public void setServiceArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Service service) {
        generatedSetterHelperImpl(service, PROPERTY_QNAME[130], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Service" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Service insertNewService(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Service target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Service)get_store().insert_element_user(PROPERTY_QNAME[130], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Service" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Service addNewService() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Service target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Service)get_store().add_element_user(PROPERTY_QNAME[130]);
            return target;
        }
    }

    /**
     * Removes the ith "Service" element
     */
    @Override
    public void removeService(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[130], i);
        }
    }

    /**
     * Gets a List of "StatisticalClassification" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification> getStatisticalClassificationList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getStatisticalClassificationArray,
                this::setStatisticalClassificationArray,
                this::insertNewStatisticalClassification,
                this::removeStatisticalClassification,
                this::sizeOfStatisticalClassificationArray
            );
        }
    }

    /**
     * Gets array of all "StatisticalClassification" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification[] getStatisticalClassificationArray() {
        return getXmlObjectArray(PROPERTY_QNAME[131], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification[0]);
    }

    /**
     * Gets ith "StatisticalClassification" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification getStatisticalClassificationArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification)get_store().find_element_user(PROPERTY_QNAME[131], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "StatisticalClassification" element
     */
    @Override
    public int sizeOfStatisticalClassificationArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[131]);
        }
    }

    /**
     * Sets array of all "StatisticalClassification" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setStatisticalClassificationArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification[] statisticalClassificationArray) {
        check_orphaned();
        arraySetterHelper(statisticalClassificationArray, PROPERTY_QNAME[131]);
    }

    /**
     * Sets ith "StatisticalClassification" element
     */
    @Override
    public void setStatisticalClassificationArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification statisticalClassification) {
        generatedSetterHelperImpl(statisticalClassification, PROPERTY_QNAME[131], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "StatisticalClassification" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification insertNewStatisticalClassification(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification)get_store().insert_element_user(PROPERTY_QNAME[131], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "StatisticalClassification" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification addNewStatisticalClassification() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification)get_store().add_element_user(PROPERTY_QNAME[131]);
            return target;
        }
    }

    /**
     * Removes the ith "StatisticalClassification" element
     */
    @Override
    public void removeStatisticalClassification(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[131], i);
        }
    }

    /**
     * Gets a List of "StatisticalClassificationRelationship" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship> getStatisticalClassificationRelationshipList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getStatisticalClassificationRelationshipArray,
                this::setStatisticalClassificationRelationshipArray,
                this::insertNewStatisticalClassificationRelationship,
                this::removeStatisticalClassificationRelationship,
                this::sizeOfStatisticalClassificationRelationshipArray
            );
        }
    }

    /**
     * Gets array of all "StatisticalClassificationRelationship" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship[] getStatisticalClassificationRelationshipArray() {
        return getXmlObjectArray(PROPERTY_QNAME[132], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship[0]);
    }

    /**
     * Gets ith "StatisticalClassificationRelationship" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship getStatisticalClassificationRelationshipArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship)get_store().find_element_user(PROPERTY_QNAME[132], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "StatisticalClassificationRelationship" element
     */
    @Override
    public int sizeOfStatisticalClassificationRelationshipArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[132]);
        }
    }

    /**
     * Sets array of all "StatisticalClassificationRelationship" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setStatisticalClassificationRelationshipArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship[] statisticalClassificationRelationshipArray) {
        check_orphaned();
        arraySetterHelper(statisticalClassificationRelationshipArray, PROPERTY_QNAME[132]);
    }

    /**
     * Sets ith "StatisticalClassificationRelationship" element
     */
    @Override
    public void setStatisticalClassificationRelationshipArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship statisticalClassificationRelationship) {
        generatedSetterHelperImpl(statisticalClassificationRelationship, PROPERTY_QNAME[132], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "StatisticalClassificationRelationship" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship insertNewStatisticalClassificationRelationship(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship)get_store().insert_element_user(PROPERTY_QNAME[132], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "StatisticalClassificationRelationship" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship addNewStatisticalClassificationRelationship() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship)get_store().add_element_user(PROPERTY_QNAME[132]);
            return target;
        }
    }

    /**
     * Removes the ith "StatisticalClassificationRelationship" element
     */
    @Override
    public void removeStatisticalClassificationRelationship(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[132], i);
        }
    }

    /**
     * Gets a List of "Step" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step> getStepList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getStepArray,
                this::setStepArray,
                this::insertNewStep,
                this::removeStep,
                this::sizeOfStepArray
            );
        }
    }

    /**
     * Gets array of all "Step" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step[] getStepArray() {
        return getXmlObjectArray(PROPERTY_QNAME[133], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step[0]);
    }

    /**
     * Gets ith "Step" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step getStepArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step)get_store().find_element_user(PROPERTY_QNAME[133], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Step" element
     */
    @Override
    public int sizeOfStepArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[133]);
        }
    }

    /**
     * Sets array of all "Step" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setStepArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step[] stepArray) {
        check_orphaned();
        arraySetterHelper(stepArray, PROPERTY_QNAME[133]);
    }

    /**
     * Sets ith "Step" element
     */
    @Override
    public void setStepArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step step) {
        generatedSetterHelperImpl(step, PROPERTY_QNAME[133], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Step" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step insertNewStep(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step)get_store().insert_element_user(PROPERTY_QNAME[133], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Step" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step addNewStep() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step)get_store().add_element_user(PROPERTY_QNAME[133]);
            return target;
        }
    }

    /**
     * Removes the ith "Step" element
     */
    @Override
    public void removeStep(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[133], i);
        }
    }

    /**
     * Gets a List of "SubstantiveConceptualDomain" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveConceptualDomain> getSubstantiveConceptualDomainList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getSubstantiveConceptualDomainArray,
                this::setSubstantiveConceptualDomainArray,
                this::insertNewSubstantiveConceptualDomain,
                this::removeSubstantiveConceptualDomain,
                this::sizeOfSubstantiveConceptualDomainArray
            );
        }
    }

    /**
     * Gets array of all "SubstantiveConceptualDomain" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveConceptualDomain[] getSubstantiveConceptualDomainArray() {
        return getXmlObjectArray(PROPERTY_QNAME[134], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveConceptualDomain[0]);
    }

    /**
     * Gets ith "SubstantiveConceptualDomain" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveConceptualDomain getSubstantiveConceptualDomainArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveConceptualDomain target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveConceptualDomain)get_store().find_element_user(PROPERTY_QNAME[134], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "SubstantiveConceptualDomain" element
     */
    @Override
    public int sizeOfSubstantiveConceptualDomainArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[134]);
        }
    }

    /**
     * Sets array of all "SubstantiveConceptualDomain" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setSubstantiveConceptualDomainArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveConceptualDomain[] substantiveConceptualDomainArray) {
        check_orphaned();
        arraySetterHelper(substantiveConceptualDomainArray, PROPERTY_QNAME[134]);
    }

    /**
     * Sets ith "SubstantiveConceptualDomain" element
     */
    @Override
    public void setSubstantiveConceptualDomainArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveConceptualDomain substantiveConceptualDomain) {
        generatedSetterHelperImpl(substantiveConceptualDomain, PROPERTY_QNAME[134], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "SubstantiveConceptualDomain" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveConceptualDomain insertNewSubstantiveConceptualDomain(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveConceptualDomain target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveConceptualDomain)get_store().insert_element_user(PROPERTY_QNAME[134], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "SubstantiveConceptualDomain" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveConceptualDomain addNewSubstantiveConceptualDomain() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveConceptualDomain target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveConceptualDomain)get_store().add_element_user(PROPERTY_QNAME[134]);
            return target;
        }
    }

    /**
     * Removes the ith "SubstantiveConceptualDomain" element
     */
    @Override
    public void removeSubstantiveConceptualDomain(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[134], i);
        }
    }

    /**
     * Gets a List of "SubstantiveValueDomain" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveValueDomain> getSubstantiveValueDomainList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getSubstantiveValueDomainArray,
                this::setSubstantiveValueDomainArray,
                this::insertNewSubstantiveValueDomain,
                this::removeSubstantiveValueDomain,
                this::sizeOfSubstantiveValueDomainArray
            );
        }
    }

    /**
     * Gets array of all "SubstantiveValueDomain" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveValueDomain[] getSubstantiveValueDomainArray() {
        return getXmlObjectArray(PROPERTY_QNAME[135], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveValueDomain[0]);
    }

    /**
     * Gets ith "SubstantiveValueDomain" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveValueDomain getSubstantiveValueDomainArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveValueDomain target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveValueDomain)get_store().find_element_user(PROPERTY_QNAME[135], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "SubstantiveValueDomain" element
     */
    @Override
    public int sizeOfSubstantiveValueDomainArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[135]);
        }
    }

    /**
     * Sets array of all "SubstantiveValueDomain" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setSubstantiveValueDomainArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveValueDomain[] substantiveValueDomainArray) {
        check_orphaned();
        arraySetterHelper(substantiveValueDomainArray, PROPERTY_QNAME[135]);
    }

    /**
     * Sets ith "SubstantiveValueDomain" element
     */
    @Override
    public void setSubstantiveValueDomainArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveValueDomain substantiveValueDomain) {
        generatedSetterHelperImpl(substantiveValueDomain, PROPERTY_QNAME[135], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "SubstantiveValueDomain" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveValueDomain insertNewSubstantiveValueDomain(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveValueDomain target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveValueDomain)get_store().insert_element_user(PROPERTY_QNAME[135], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "SubstantiveValueDomain" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveValueDomain addNewSubstantiveValueDomain() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveValueDomain target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveValueDomain)get_store().add_element_user(PROPERTY_QNAME[135]);
            return target;
        }
    }

    /**
     * Removes the ith "SubstantiveValueDomain" element
     */
    @Override
    public void removeSubstantiveValueDomain(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[135], i);
        }
    }

    /**
     * Gets a List of "SyntheticIdComponent" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.SyntheticIdComponent> getSyntheticIdComponentList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getSyntheticIdComponentArray,
                this::setSyntheticIdComponentArray,
                this::insertNewSyntheticIdComponent,
                this::removeSyntheticIdComponent,
                this::sizeOfSyntheticIdComponentArray
            );
        }
    }

    /**
     * Gets array of all "SyntheticIdComponent" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.SyntheticIdComponent[] getSyntheticIdComponentArray() {
        return getXmlObjectArray(PROPERTY_QNAME[136], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.SyntheticIdComponent[0]);
    }

    /**
     * Gets ith "SyntheticIdComponent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.SyntheticIdComponent getSyntheticIdComponentArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.SyntheticIdComponent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.SyntheticIdComponent)get_store().find_element_user(PROPERTY_QNAME[136], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "SyntheticIdComponent" element
     */
    @Override
    public int sizeOfSyntheticIdComponentArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[136]);
        }
    }

    /**
     * Sets array of all "SyntheticIdComponent" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setSyntheticIdComponentArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.SyntheticIdComponent[] syntheticIdComponentArray) {
        check_orphaned();
        arraySetterHelper(syntheticIdComponentArray, PROPERTY_QNAME[136]);
    }

    /**
     * Sets ith "SyntheticIdComponent" element
     */
    @Override
    public void setSyntheticIdComponentArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.SyntheticIdComponent syntheticIdComponent) {
        generatedSetterHelperImpl(syntheticIdComponent, PROPERTY_QNAME[136], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "SyntheticIdComponent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.SyntheticIdComponent insertNewSyntheticIdComponent(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.SyntheticIdComponent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.SyntheticIdComponent)get_store().insert_element_user(PROPERTY_QNAME[136], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "SyntheticIdComponent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.SyntheticIdComponent addNewSyntheticIdComponent() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.SyntheticIdComponent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.SyntheticIdComponent)get_store().add_element_user(PROPERTY_QNAME[136]);
            return target;
        }
    }

    /**
     * Removes the ith "SyntheticIdComponent" element
     */
    @Override
    public void removeSyntheticIdComponent(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[136], i);
        }
    }

    /**
     * Gets a List of "TemporalConstraints" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalConstraints> getTemporalConstraintsList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getTemporalConstraintsArray,
                this::setTemporalConstraintsArray,
                this::insertNewTemporalConstraints,
                this::removeTemporalConstraints,
                this::sizeOfTemporalConstraintsArray
            );
        }
    }

    /**
     * Gets array of all "TemporalConstraints" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalConstraints[] getTemporalConstraintsArray() {
        return getXmlObjectArray(PROPERTY_QNAME[137], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalConstraints[0]);
    }

    /**
     * Gets ith "TemporalConstraints" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalConstraints getTemporalConstraintsArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalConstraints target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalConstraints)get_store().find_element_user(PROPERTY_QNAME[137], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "TemporalConstraints" element
     */
    @Override
    public int sizeOfTemporalConstraintsArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[137]);
        }
    }

    /**
     * Sets array of all "TemporalConstraints" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setTemporalConstraintsArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalConstraints[] temporalConstraintsArray) {
        check_orphaned();
        arraySetterHelper(temporalConstraintsArray, PROPERTY_QNAME[137]);
    }

    /**
     * Sets ith "TemporalConstraints" element
     */
    @Override
    public void setTemporalConstraintsArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalConstraints temporalConstraints) {
        generatedSetterHelperImpl(temporalConstraints, PROPERTY_QNAME[137], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "TemporalConstraints" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalConstraints insertNewTemporalConstraints(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalConstraints target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalConstraints)get_store().insert_element_user(PROPERTY_QNAME[137], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "TemporalConstraints" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalConstraints addNewTemporalConstraints() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalConstraints target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalConstraints)get_store().add_element_user(PROPERTY_QNAME[137]);
            return target;
        }
    }

    /**
     * Removes the ith "TemporalConstraints" element
     */
    @Override
    public void removeTemporalConstraints(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[137], i);
        }
    }

    /**
     * Gets a List of "TemporalControlConstruct" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalControlConstruct> getTemporalControlConstructList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getTemporalControlConstructArray,
                this::setTemporalControlConstructArray,
                this::insertNewTemporalControlConstruct,
                this::removeTemporalControlConstruct,
                this::sizeOfTemporalControlConstructArray
            );
        }
    }

    /**
     * Gets array of all "TemporalControlConstruct" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalControlConstruct[] getTemporalControlConstructArray() {
        return getXmlObjectArray(PROPERTY_QNAME[138], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalControlConstruct[0]);
    }

    /**
     * Gets ith "TemporalControlConstruct" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalControlConstruct getTemporalControlConstructArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalControlConstruct target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalControlConstruct)get_store().find_element_user(PROPERTY_QNAME[138], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "TemporalControlConstruct" element
     */
    @Override
    public int sizeOfTemporalControlConstructArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[138]);
        }
    }

    /**
     * Sets array of all "TemporalControlConstruct" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setTemporalControlConstructArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalControlConstruct[] temporalControlConstructArray) {
        check_orphaned();
        arraySetterHelper(temporalControlConstructArray, PROPERTY_QNAME[138]);
    }

    /**
     * Sets ith "TemporalControlConstruct" element
     */
    @Override
    public void setTemporalControlConstructArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalControlConstruct temporalControlConstruct) {
        generatedSetterHelperImpl(temporalControlConstruct, PROPERTY_QNAME[138], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "TemporalControlConstruct" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalControlConstruct insertNewTemporalControlConstruct(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalControlConstruct target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalControlConstruct)get_store().insert_element_user(PROPERTY_QNAME[138], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "TemporalControlConstruct" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalControlConstruct addNewTemporalControlConstruct() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalControlConstruct target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalControlConstruct)get_store().add_element_user(PROPERTY_QNAME[138]);
            return target;
        }
    }

    /**
     * Removes the ith "TemporalControlConstruct" element
     */
    @Override
    public void removeTemporalControlConstruct(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[138], i);
        }
    }

    /**
     * Gets a List of "Unit" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Unit> getUnitList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getUnitArray,
                this::setUnitArray,
                this::insertNewUnit,
                this::removeUnit,
                this::sizeOfUnitArray
            );
        }
    }

    /**
     * Gets array of all "Unit" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Unit[] getUnitArray() {
        return getXmlObjectArray(PROPERTY_QNAME[139], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.Unit[0]);
    }

    /**
     * Gets ith "Unit" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Unit getUnitArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Unit target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Unit)get_store().find_element_user(PROPERTY_QNAME[139], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Unit" element
     */
    @Override
    public int sizeOfUnitArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[139]);
        }
    }

    /**
     * Sets array of all "Unit" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setUnitArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Unit[] unitArray) {
        check_orphaned();
        arraySetterHelper(unitArray, PROPERTY_QNAME[139]);
    }

    /**
     * Sets ith "Unit" element
     */
    @Override
    public void setUnitArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Unit unit) {
        generatedSetterHelperImpl(unit, PROPERTY_QNAME[139], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Unit" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Unit insertNewUnit(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Unit target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Unit)get_store().insert_element_user(PROPERTY_QNAME[139], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Unit" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Unit addNewUnit() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Unit target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Unit)get_store().add_element_user(PROPERTY_QNAME[139]);
            return target;
        }
    }

    /**
     * Removes the ith "Unit" element
     */
    @Override
    public void removeUnit(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[139], i);
        }
    }

    /**
     * Gets a List of "UnitSegmentLayout" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitSegmentLayout> getUnitSegmentLayoutList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getUnitSegmentLayoutArray,
                this::setUnitSegmentLayoutArray,
                this::insertNewUnitSegmentLayout,
                this::removeUnitSegmentLayout,
                this::sizeOfUnitSegmentLayoutArray
            );
        }
    }

    /**
     * Gets array of all "UnitSegmentLayout" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitSegmentLayout[] getUnitSegmentLayoutArray() {
        return getXmlObjectArray(PROPERTY_QNAME[140], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitSegmentLayout[0]);
    }

    /**
     * Gets ith "UnitSegmentLayout" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitSegmentLayout getUnitSegmentLayoutArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitSegmentLayout target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitSegmentLayout)get_store().find_element_user(PROPERTY_QNAME[140], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "UnitSegmentLayout" element
     */
    @Override
    public int sizeOfUnitSegmentLayoutArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[140]);
        }
    }

    /**
     * Sets array of all "UnitSegmentLayout" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setUnitSegmentLayoutArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitSegmentLayout[] unitSegmentLayoutArray) {
        check_orphaned();
        arraySetterHelper(unitSegmentLayoutArray, PROPERTY_QNAME[140]);
    }

    /**
     * Sets ith "UnitSegmentLayout" element
     */
    @Override
    public void setUnitSegmentLayoutArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitSegmentLayout unitSegmentLayout) {
        generatedSetterHelperImpl(unitSegmentLayout, PROPERTY_QNAME[140], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "UnitSegmentLayout" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitSegmentLayout insertNewUnitSegmentLayout(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitSegmentLayout target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitSegmentLayout)get_store().insert_element_user(PROPERTY_QNAME[140], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "UnitSegmentLayout" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitSegmentLayout addNewUnitSegmentLayout() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitSegmentLayout target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitSegmentLayout)get_store().add_element_user(PROPERTY_QNAME[140]);
            return target;
        }
    }

    /**
     * Removes the ith "UnitSegmentLayout" element
     */
    @Override
    public void removeUnitSegmentLayout(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[140], i);
        }
    }

    /**
     * Gets a List of "UnitType" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitType> getUnitTypeList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getUnitTypeArray,
                this::setUnitTypeArray,
                this::insertNewUnitType,
                this::removeUnitType,
                this::sizeOfUnitTypeArray
            );
        }
    }

    /**
     * Gets array of all "UnitType" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitType[] getUnitTypeArray() {
        return getXmlObjectArray(PROPERTY_QNAME[141], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitType[0]);
    }

    /**
     * Gets ith "UnitType" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitType getUnitTypeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitType target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitType)get_store().find_element_user(PROPERTY_QNAME[141], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "UnitType" element
     */
    @Override
    public int sizeOfUnitTypeArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[141]);
        }
    }

    /**
     * Sets array of all "UnitType" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setUnitTypeArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitType[] unitTypeArray) {
        check_orphaned();
        arraySetterHelper(unitTypeArray, PROPERTY_QNAME[141]);
    }

    /**
     * Sets ith "UnitType" element
     */
    @Override
    public void setUnitTypeArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitType unitType) {
        generatedSetterHelperImpl(unitType, PROPERTY_QNAME[141], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "UnitType" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitType insertNewUnitType(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitType target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitType)get_store().insert_element_user(PROPERTY_QNAME[141], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "UnitType" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitType addNewUnitType() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitType target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitType)get_store().add_element_user(PROPERTY_QNAME[141]);
            return target;
        }
    }

    /**
     * Removes the ith "UnitType" element
     */
    @Override
    public void removeUnitType(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[141], i);
        }
    }

    /**
     * Gets a List of "Universe" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Universe> getUniverseList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getUniverseArray,
                this::setUniverseArray,
                this::insertNewUniverse,
                this::removeUniverse,
                this::sizeOfUniverseArray
            );
        }
    }

    /**
     * Gets array of all "Universe" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Universe[] getUniverseArray() {
        return getXmlObjectArray(PROPERTY_QNAME[142], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.Universe[0]);
    }

    /**
     * Gets ith "Universe" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Universe getUniverseArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Universe target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Universe)get_store().find_element_user(PROPERTY_QNAME[142], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Universe" element
     */
    @Override
    public int sizeOfUniverseArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[142]);
        }
    }

    /**
     * Sets array of all "Universe" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setUniverseArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Universe[] universeArray) {
        check_orphaned();
        arraySetterHelper(universeArray, PROPERTY_QNAME[142]);
    }

    /**
     * Sets ith "Universe" element
     */
    @Override
    public void setUniverseArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Universe universe) {
        generatedSetterHelperImpl(universe, PROPERTY_QNAME[142], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Universe" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Universe insertNewUniverse(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Universe target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Universe)get_store().insert_element_user(PROPERTY_QNAME[142], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Universe" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Universe addNewUniverse() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Universe target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Universe)get_store().add_element_user(PROPERTY_QNAME[142]);
            return target;
        }
    }

    /**
     * Removes the ith "Universe" element
     */
    @Override
    public void removeUniverse(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[142], i);
        }
    }

    /**
     * Gets a List of "ValueAndConceptDescription" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueAndConceptDescription> getValueAndConceptDescriptionList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getValueAndConceptDescriptionArray,
                this::setValueAndConceptDescriptionArray,
                this::insertNewValueAndConceptDescription,
                this::removeValueAndConceptDescription,
                this::sizeOfValueAndConceptDescriptionArray
            );
        }
    }

    /**
     * Gets array of all "ValueAndConceptDescription" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueAndConceptDescription[] getValueAndConceptDescriptionArray() {
        return getXmlObjectArray(PROPERTY_QNAME[143], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueAndConceptDescription[0]);
    }

    /**
     * Gets ith "ValueAndConceptDescription" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueAndConceptDescription getValueAndConceptDescriptionArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueAndConceptDescription target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueAndConceptDescription)get_store().find_element_user(PROPERTY_QNAME[143], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ValueAndConceptDescription" element
     */
    @Override
    public int sizeOfValueAndConceptDescriptionArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[143]);
        }
    }

    /**
     * Sets array of all "ValueAndConceptDescription" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setValueAndConceptDescriptionArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueAndConceptDescription[] valueAndConceptDescriptionArray) {
        check_orphaned();
        arraySetterHelper(valueAndConceptDescriptionArray, PROPERTY_QNAME[143]);
    }

    /**
     * Sets ith "ValueAndConceptDescription" element
     */
    @Override
    public void setValueAndConceptDescriptionArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueAndConceptDescription valueAndConceptDescription) {
        generatedSetterHelperImpl(valueAndConceptDescription, PROPERTY_QNAME[143], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ValueAndConceptDescription" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueAndConceptDescription insertNewValueAndConceptDescription(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueAndConceptDescription target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueAndConceptDescription)get_store().insert_element_user(PROPERTY_QNAME[143], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ValueAndConceptDescription" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueAndConceptDescription addNewValueAndConceptDescription() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueAndConceptDescription target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueAndConceptDescription)get_store().add_element_user(PROPERTY_QNAME[143]);
            return target;
        }
    }

    /**
     * Removes the ith "ValueAndConceptDescription" element
     */
    @Override
    public void removeValueAndConceptDescription(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[143], i);
        }
    }

    /**
     * Gets a List of "ValueDomain" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueDomain> getValueDomainList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getValueDomainArray,
                this::setValueDomainArray,
                this::insertNewValueDomain,
                this::removeValueDomain,
                this::sizeOfValueDomainArray
            );
        }
    }

    /**
     * Gets array of all "ValueDomain" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueDomain[] getValueDomainArray() {
        return getXmlObjectArray(PROPERTY_QNAME[144], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueDomain[0]);
    }

    /**
     * Gets ith "ValueDomain" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueDomain getValueDomainArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueDomain target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueDomain)get_store().find_element_user(PROPERTY_QNAME[144], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ValueDomain" element
     */
    @Override
    public int sizeOfValueDomainArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[144]);
        }
    }

    /**
     * Sets array of all "ValueDomain" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setValueDomainArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueDomain[] valueDomainArray) {
        check_orphaned();
        arraySetterHelper(valueDomainArray, PROPERTY_QNAME[144]);
    }

    /**
     * Sets ith "ValueDomain" element
     */
    @Override
    public void setValueDomainArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueDomain valueDomain) {
        generatedSetterHelperImpl(valueDomain, PROPERTY_QNAME[144], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ValueDomain" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueDomain insertNewValueDomain(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueDomain target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueDomain)get_store().insert_element_user(PROPERTY_QNAME[144], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ValueDomain" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueDomain addNewValueDomain() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueDomain target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueDomain)get_store().add_element_user(PROPERTY_QNAME[144]);
            return target;
        }
    }

    /**
     * Removes the ith "ValueDomain" element
     */
    @Override
    public void removeValueDomain(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[144], i);
        }
    }

    /**
     * Gets a List of "ValueMapping" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMapping> getValueMappingList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getValueMappingArray,
                this::setValueMappingArray,
                this::insertNewValueMapping,
                this::removeValueMapping,
                this::sizeOfValueMappingArray
            );
        }
    }

    /**
     * Gets array of all "ValueMapping" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMapping[] getValueMappingArray() {
        return getXmlObjectArray(PROPERTY_QNAME[145], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMapping[0]);
    }

    /**
     * Gets ith "ValueMapping" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMapping getValueMappingArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMapping target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMapping)get_store().find_element_user(PROPERTY_QNAME[145], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ValueMapping" element
     */
    @Override
    public int sizeOfValueMappingArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[145]);
        }
    }

    /**
     * Sets array of all "ValueMapping" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setValueMappingArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMapping[] valueMappingArray) {
        check_orphaned();
        arraySetterHelper(valueMappingArray, PROPERTY_QNAME[145]);
    }

    /**
     * Sets ith "ValueMapping" element
     */
    @Override
    public void setValueMappingArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMapping valueMapping) {
        generatedSetterHelperImpl(valueMapping, PROPERTY_QNAME[145], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ValueMapping" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMapping insertNewValueMapping(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMapping target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMapping)get_store().insert_element_user(PROPERTY_QNAME[145], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ValueMapping" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMapping addNewValueMapping() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMapping target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMapping)get_store().add_element_user(PROPERTY_QNAME[145]);
            return target;
        }
    }

    /**
     * Removes the ith "ValueMapping" element
     */
    @Override
    public void removeValueMapping(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[145], i);
        }
    }

    /**
     * Gets a List of "ValueMappingPosition" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingPosition> getValueMappingPositionList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getValueMappingPositionArray,
                this::setValueMappingPositionArray,
                this::insertNewValueMappingPosition,
                this::removeValueMappingPosition,
                this::sizeOfValueMappingPositionArray
            );
        }
    }

    /**
     * Gets array of all "ValueMappingPosition" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingPosition[] getValueMappingPositionArray() {
        return getXmlObjectArray(PROPERTY_QNAME[146], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingPosition[0]);
    }

    /**
     * Gets ith "ValueMappingPosition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingPosition getValueMappingPositionArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingPosition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingPosition)get_store().find_element_user(PROPERTY_QNAME[146], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ValueMappingPosition" element
     */
    @Override
    public int sizeOfValueMappingPositionArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[146]);
        }
    }

    /**
     * Sets array of all "ValueMappingPosition" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setValueMappingPositionArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingPosition[] valueMappingPositionArray) {
        check_orphaned();
        arraySetterHelper(valueMappingPositionArray, PROPERTY_QNAME[146]);
    }

    /**
     * Sets ith "ValueMappingPosition" element
     */
    @Override
    public void setValueMappingPositionArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingPosition valueMappingPosition) {
        generatedSetterHelperImpl(valueMappingPosition, PROPERTY_QNAME[146], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ValueMappingPosition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingPosition insertNewValueMappingPosition(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingPosition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingPosition)get_store().insert_element_user(PROPERTY_QNAME[146], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ValueMappingPosition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingPosition addNewValueMappingPosition() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingPosition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingPosition)get_store().add_element_user(PROPERTY_QNAME[146]);
            return target;
        }
    }

    /**
     * Removes the ith "ValueMappingPosition" element
     */
    @Override
    public void removeValueMappingPosition(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[146], i);
        }
    }

    /**
     * Gets a List of "ValueMappingRelationship" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship> getValueMappingRelationshipList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getValueMappingRelationshipArray,
                this::setValueMappingRelationshipArray,
                this::insertNewValueMappingRelationship,
                this::removeValueMappingRelationship,
                this::sizeOfValueMappingRelationshipArray
            );
        }
    }

    /**
     * Gets array of all "ValueMappingRelationship" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship[] getValueMappingRelationshipArray() {
        return getXmlObjectArray(PROPERTY_QNAME[147], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship[0]);
    }

    /**
     * Gets ith "ValueMappingRelationship" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship getValueMappingRelationshipArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship)get_store().find_element_user(PROPERTY_QNAME[147], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ValueMappingRelationship" element
     */
    @Override
    public int sizeOfValueMappingRelationshipArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[147]);
        }
    }

    /**
     * Sets array of all "ValueMappingRelationship" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setValueMappingRelationshipArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship[] valueMappingRelationshipArray) {
        check_orphaned();
        arraySetterHelper(valueMappingRelationshipArray, PROPERTY_QNAME[147]);
    }

    /**
     * Sets ith "ValueMappingRelationship" element
     */
    @Override
    public void setValueMappingRelationshipArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship valueMappingRelationship) {
        generatedSetterHelperImpl(valueMappingRelationship, PROPERTY_QNAME[147], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ValueMappingRelationship" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship insertNewValueMappingRelationship(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship)get_store().insert_element_user(PROPERTY_QNAME[147], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ValueMappingRelationship" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship addNewValueMappingRelationship() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship)get_store().add_element_user(PROPERTY_QNAME[147]);
            return target;
        }
    }

    /**
     * Removes the ith "ValueMappingRelationship" element
     */
    @Override
    public void removeValueMappingRelationship(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[147], i);
        }
    }

    /**
     * Gets a List of "VariableCollection" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableCollection> getVariableCollectionList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getVariableCollectionArray,
                this::setVariableCollectionArray,
                this::insertNewVariableCollection,
                this::removeVariableCollection,
                this::sizeOfVariableCollectionArray
            );
        }
    }

    /**
     * Gets array of all "VariableCollection" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableCollection[] getVariableCollectionArray() {
        return getXmlObjectArray(PROPERTY_QNAME[148], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableCollection[0]);
    }

    /**
     * Gets ith "VariableCollection" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableCollection getVariableCollectionArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableCollection target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableCollection)get_store().find_element_user(PROPERTY_QNAME[148], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "VariableCollection" element
     */
    @Override
    public int sizeOfVariableCollectionArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[148]);
        }
    }

    /**
     * Sets array of all "VariableCollection" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setVariableCollectionArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableCollection[] variableCollectionArray) {
        check_orphaned();
        arraySetterHelper(variableCollectionArray, PROPERTY_QNAME[148]);
    }

    /**
     * Sets ith "VariableCollection" element
     */
    @Override
    public void setVariableCollectionArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableCollection variableCollection) {
        generatedSetterHelperImpl(variableCollection, PROPERTY_QNAME[148], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "VariableCollection" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableCollection insertNewVariableCollection(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableCollection target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableCollection)get_store().insert_element_user(PROPERTY_QNAME[148], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "VariableCollection" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableCollection addNewVariableCollection() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableCollection target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableCollection)get_store().add_element_user(PROPERTY_QNAME[148]);
            return target;
        }
    }

    /**
     * Removes the ith "VariableCollection" element
     */
    @Override
    public void removeVariableCollection(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[148], i);
        }
    }

    /**
     * Gets a List of "VariableDescriptorComponent" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableDescriptorComponent> getVariableDescriptorComponentList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getVariableDescriptorComponentArray,
                this::setVariableDescriptorComponentArray,
                this::insertNewVariableDescriptorComponent,
                this::removeVariableDescriptorComponent,
                this::sizeOfVariableDescriptorComponentArray
            );
        }
    }

    /**
     * Gets array of all "VariableDescriptorComponent" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableDescriptorComponent[] getVariableDescriptorComponentArray() {
        return getXmlObjectArray(PROPERTY_QNAME[149], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableDescriptorComponent[0]);
    }

    /**
     * Gets ith "VariableDescriptorComponent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableDescriptorComponent getVariableDescriptorComponentArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableDescriptorComponent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableDescriptorComponent)get_store().find_element_user(PROPERTY_QNAME[149], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "VariableDescriptorComponent" element
     */
    @Override
    public int sizeOfVariableDescriptorComponentArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[149]);
        }
    }

    /**
     * Sets array of all "VariableDescriptorComponent" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setVariableDescriptorComponentArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableDescriptorComponent[] variableDescriptorComponentArray) {
        check_orphaned();
        arraySetterHelper(variableDescriptorComponentArray, PROPERTY_QNAME[149]);
    }

    /**
     * Sets ith "VariableDescriptorComponent" element
     */
    @Override
    public void setVariableDescriptorComponentArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableDescriptorComponent variableDescriptorComponent) {
        generatedSetterHelperImpl(variableDescriptorComponent, PROPERTY_QNAME[149], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "VariableDescriptorComponent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableDescriptorComponent insertNewVariableDescriptorComponent(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableDescriptorComponent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableDescriptorComponent)get_store().insert_element_user(PROPERTY_QNAME[149], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "VariableDescriptorComponent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableDescriptorComponent addNewVariableDescriptorComponent() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableDescriptorComponent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableDescriptorComponent)get_store().add_element_user(PROPERTY_QNAME[149]);
            return target;
        }
    }

    /**
     * Removes the ith "VariableDescriptorComponent" element
     */
    @Override
    public void removeVariableDescriptorComponent(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[149], i);
        }
    }

    /**
     * Gets a List of "VariablePosition" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariablePosition> getVariablePositionList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getVariablePositionArray,
                this::setVariablePositionArray,
                this::insertNewVariablePosition,
                this::removeVariablePosition,
                this::sizeOfVariablePositionArray
            );
        }
    }

    /**
     * Gets array of all "VariablePosition" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariablePosition[] getVariablePositionArray() {
        return getXmlObjectArray(PROPERTY_QNAME[150], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariablePosition[0]);
    }

    /**
     * Gets ith "VariablePosition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariablePosition getVariablePositionArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariablePosition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariablePosition)get_store().find_element_user(PROPERTY_QNAME[150], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "VariablePosition" element
     */
    @Override
    public int sizeOfVariablePositionArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[150]);
        }
    }

    /**
     * Sets array of all "VariablePosition" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setVariablePositionArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariablePosition[] variablePositionArray) {
        check_orphaned();
        arraySetterHelper(variablePositionArray, PROPERTY_QNAME[150]);
    }

    /**
     * Sets ith "VariablePosition" element
     */
    @Override
    public void setVariablePositionArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariablePosition variablePosition) {
        generatedSetterHelperImpl(variablePosition, PROPERTY_QNAME[150], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "VariablePosition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariablePosition insertNewVariablePosition(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariablePosition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariablePosition)get_store().insert_element_user(PROPERTY_QNAME[150], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "VariablePosition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariablePosition addNewVariablePosition() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariablePosition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariablePosition)get_store().add_element_user(PROPERTY_QNAME[150]);
            return target;
        }
    }

    /**
     * Removes the ith "VariablePosition" element
     */
    @Override
    public void removeVariablePosition(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[150], i);
        }
    }

    /**
     * Gets a List of "VariableRelationship" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship> getVariableRelationshipList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getVariableRelationshipArray,
                this::setVariableRelationshipArray,
                this::insertNewVariableRelationship,
                this::removeVariableRelationship,
                this::sizeOfVariableRelationshipArray
            );
        }
    }

    /**
     * Gets array of all "VariableRelationship" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship[] getVariableRelationshipArray() {
        return getXmlObjectArray(PROPERTY_QNAME[151], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship[0]);
    }

    /**
     * Gets ith "VariableRelationship" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship getVariableRelationshipArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship)get_store().find_element_user(PROPERTY_QNAME[151], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "VariableRelationship" element
     */
    @Override
    public int sizeOfVariableRelationshipArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[151]);
        }
    }

    /**
     * Sets array of all "VariableRelationship" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setVariableRelationshipArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship[] variableRelationshipArray) {
        check_orphaned();
        arraySetterHelper(variableRelationshipArray, PROPERTY_QNAME[151]);
    }

    /**
     * Sets ith "VariableRelationship" element
     */
    @Override
    public void setVariableRelationshipArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship variableRelationship) {
        generatedSetterHelperImpl(variableRelationship, PROPERTY_QNAME[151], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "VariableRelationship" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship insertNewVariableRelationship(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship)get_store().insert_element_user(PROPERTY_QNAME[151], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "VariableRelationship" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship addNewVariableRelationship() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship)get_store().add_element_user(PROPERTY_QNAME[151]);
            return target;
        }
    }

    /**
     * Removes the ith "VariableRelationship" element
     */
    @Override
    public void removeVariableRelationship(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[151], i);
        }
    }

    /**
     * Gets a List of "VariableStructure" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableStructure> getVariableStructureList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getVariableStructureArray,
                this::setVariableStructureArray,
                this::insertNewVariableStructure,
                this::removeVariableStructure,
                this::sizeOfVariableStructureArray
            );
        }
    }

    /**
     * Gets array of all "VariableStructure" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableStructure[] getVariableStructureArray() {
        return getXmlObjectArray(PROPERTY_QNAME[152], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableStructure[0]);
    }

    /**
     * Gets ith "VariableStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableStructure getVariableStructureArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableStructure)get_store().find_element_user(PROPERTY_QNAME[152], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "VariableStructure" element
     */
    @Override
    public int sizeOfVariableStructureArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[152]);
        }
    }

    /**
     * Sets array of all "VariableStructure" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setVariableStructureArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableStructure[] variableStructureArray) {
        check_orphaned();
        arraySetterHelper(variableStructureArray, PROPERTY_QNAME[152]);
    }

    /**
     * Sets ith "VariableStructure" element
     */
    @Override
    public void setVariableStructureArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableStructure variableStructure) {
        generatedSetterHelperImpl(variableStructure, PROPERTY_QNAME[152], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "VariableStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableStructure insertNewVariableStructure(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableStructure)get_store().insert_element_user(PROPERTY_QNAME[152], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "VariableStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableStructure addNewVariableStructure() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableStructure)get_store().add_element_user(PROPERTY_QNAME[152]);
            return target;
        }
    }

    /**
     * Removes the ith "VariableStructure" element
     */
    @Override
    public void removeVariableStructure(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[152], i);
        }
    }

    /**
     * Gets a List of "VariableValueComponent" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableValueComponent> getVariableValueComponentList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getVariableValueComponentArray,
                this::setVariableValueComponentArray,
                this::insertNewVariableValueComponent,
                this::removeVariableValueComponent,
                this::sizeOfVariableValueComponentArray
            );
        }
    }

    /**
     * Gets array of all "VariableValueComponent" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableValueComponent[] getVariableValueComponentArray() {
        return getXmlObjectArray(PROPERTY_QNAME[153], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableValueComponent[0]);
    }

    /**
     * Gets ith "VariableValueComponent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableValueComponent getVariableValueComponentArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableValueComponent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableValueComponent)get_store().find_element_user(PROPERTY_QNAME[153], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "VariableValueComponent" element
     */
    @Override
    public int sizeOfVariableValueComponentArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[153]);
        }
    }

    /**
     * Sets array of all "VariableValueComponent" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setVariableValueComponentArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableValueComponent[] variableValueComponentArray) {
        check_orphaned();
        arraySetterHelper(variableValueComponentArray, PROPERTY_QNAME[153]);
    }

    /**
     * Sets ith "VariableValueComponent" element
     */
    @Override
    public void setVariableValueComponentArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableValueComponent variableValueComponent) {
        generatedSetterHelperImpl(variableValueComponent, PROPERTY_QNAME[153], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "VariableValueComponent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableValueComponent insertNewVariableValueComponent(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableValueComponent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableValueComponent)get_store().insert_element_user(PROPERTY_QNAME[153], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "VariableValueComponent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableValueComponent addNewVariableValueComponent() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableValueComponent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableValueComponent)get_store().add_element_user(PROPERTY_QNAME[153]);
            return target;
        }
    }

    /**
     * Removes the ith "VariableValueComponent" element
     */
    @Override
    public void removeVariableValueComponent(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[153], i);
        }
    }

    /**
     * Gets a List of "WideDataSet" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideDataSet> getWideDataSetList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getWideDataSetArray,
                this::setWideDataSetArray,
                this::insertNewWideDataSet,
                this::removeWideDataSet,
                this::sizeOfWideDataSetArray
            );
        }
    }

    /**
     * Gets array of all "WideDataSet" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideDataSet[] getWideDataSetArray() {
        return getXmlObjectArray(PROPERTY_QNAME[154], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideDataSet[0]);
    }

    /**
     * Gets ith "WideDataSet" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideDataSet getWideDataSetArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideDataSet target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideDataSet)get_store().find_element_user(PROPERTY_QNAME[154], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "WideDataSet" element
     */
    @Override
    public int sizeOfWideDataSetArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[154]);
        }
    }

    /**
     * Sets array of all "WideDataSet" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setWideDataSetArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideDataSet[] wideDataSetArray) {
        check_orphaned();
        arraySetterHelper(wideDataSetArray, PROPERTY_QNAME[154]);
    }

    /**
     * Sets ith "WideDataSet" element
     */
    @Override
    public void setWideDataSetArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideDataSet wideDataSet) {
        generatedSetterHelperImpl(wideDataSet, PROPERTY_QNAME[154], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "WideDataSet" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideDataSet insertNewWideDataSet(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideDataSet target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideDataSet)get_store().insert_element_user(PROPERTY_QNAME[154], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "WideDataSet" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideDataSet addNewWideDataSet() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideDataSet target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideDataSet)get_store().add_element_user(PROPERTY_QNAME[154]);
            return target;
        }
    }

    /**
     * Removes the ith "WideDataSet" element
     */
    @Override
    public void removeWideDataSet(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[154], i);
        }
    }

    /**
     * Gets a List of "WideDataStructure" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideDataStructure> getWideDataStructureList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getWideDataStructureArray,
                this::setWideDataStructureArray,
                this::insertNewWideDataStructure,
                this::removeWideDataStructure,
                this::sizeOfWideDataStructureArray
            );
        }
    }

    /**
     * Gets array of all "WideDataStructure" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideDataStructure[] getWideDataStructureArray() {
        return getXmlObjectArray(PROPERTY_QNAME[155], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideDataStructure[0]);
    }

    /**
     * Gets ith "WideDataStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideDataStructure getWideDataStructureArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideDataStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideDataStructure)get_store().find_element_user(PROPERTY_QNAME[155], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "WideDataStructure" element
     */
    @Override
    public int sizeOfWideDataStructureArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[155]);
        }
    }

    /**
     * Sets array of all "WideDataStructure" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setWideDataStructureArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideDataStructure[] wideDataStructureArray) {
        check_orphaned();
        arraySetterHelper(wideDataStructureArray, PROPERTY_QNAME[155]);
    }

    /**
     * Sets ith "WideDataStructure" element
     */
    @Override
    public void setWideDataStructureArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideDataStructure wideDataStructure) {
        generatedSetterHelperImpl(wideDataStructure, PROPERTY_QNAME[155], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "WideDataStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideDataStructure insertNewWideDataStructure(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideDataStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideDataStructure)get_store().insert_element_user(PROPERTY_QNAME[155], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "WideDataStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideDataStructure addNewWideDataStructure() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideDataStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideDataStructure)get_store().add_element_user(PROPERTY_QNAME[155]);
            return target;
        }
    }

    /**
     * Removes the ith "WideDataStructure" element
     */
    @Override
    public void removeWideDataStructure(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[155], i);
        }
    }

    /**
     * Gets a List of "WideKey" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideKey> getWideKeyList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getWideKeyArray,
                this::setWideKeyArray,
                this::insertNewWideKey,
                this::removeWideKey,
                this::sizeOfWideKeyArray
            );
        }
    }

    /**
     * Gets array of all "WideKey" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideKey[] getWideKeyArray() {
        return getXmlObjectArray(PROPERTY_QNAME[156], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideKey[0]);
    }

    /**
     * Gets ith "WideKey" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideKey getWideKeyArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideKey target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideKey)get_store().find_element_user(PROPERTY_QNAME[156], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "WideKey" element
     */
    @Override
    public int sizeOfWideKeyArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[156]);
        }
    }

    /**
     * Sets array of all "WideKey" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setWideKeyArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideKey[] wideKeyArray) {
        check_orphaned();
        arraySetterHelper(wideKeyArray, PROPERTY_QNAME[156]);
    }

    /**
     * Sets ith "WideKey" element
     */
    @Override
    public void setWideKeyArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideKey wideKey) {
        generatedSetterHelperImpl(wideKey, PROPERTY_QNAME[156], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "WideKey" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideKey insertNewWideKey(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideKey target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideKey)get_store().insert_element_user(PROPERTY_QNAME[156], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "WideKey" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideKey addNewWideKey() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideKey target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideKey)get_store().add_element_user(PROPERTY_QNAME[156]);
            return target;
        }
    }

    /**
     * Removes the ith "WideKey" element
     */
    @Override
    public void removeWideKey(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[156], i);
        }
    }

    /**
     * Gets a List of "WideKeyMember" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideKeyMember> getWideKeyMemberList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getWideKeyMemberArray,
                this::setWideKeyMemberArray,
                this::insertNewWideKeyMember,
                this::removeWideKeyMember,
                this::sizeOfWideKeyMemberArray
            );
        }
    }

    /**
     * Gets array of all "WideKeyMember" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideKeyMember[] getWideKeyMemberArray() {
        return getXmlObjectArray(PROPERTY_QNAME[157], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideKeyMember[0]);
    }

    /**
     * Gets ith "WideKeyMember" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideKeyMember getWideKeyMemberArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideKeyMember target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideKeyMember)get_store().find_element_user(PROPERTY_QNAME[157], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "WideKeyMember" element
     */
    @Override
    public int sizeOfWideKeyMemberArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[157]);
        }
    }

    /**
     * Sets array of all "WideKeyMember" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setWideKeyMemberArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideKeyMember[] wideKeyMemberArray) {
        check_orphaned();
        arraySetterHelper(wideKeyMemberArray, PROPERTY_QNAME[157]);
    }

    /**
     * Sets ith "WideKeyMember" element
     */
    @Override
    public void setWideKeyMemberArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideKeyMember wideKeyMember) {
        generatedSetterHelperImpl(wideKeyMember, PROPERTY_QNAME[157], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "WideKeyMember" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideKeyMember insertNewWideKeyMember(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideKeyMember target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideKeyMember)get_store().insert_element_user(PROPERTY_QNAME[157], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "WideKeyMember" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideKeyMember addNewWideKeyMember() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideKeyMember target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideKeyMember)get_store().add_element_user(PROPERTY_QNAME[157]);
            return target;
        }
    }

    /**
     * Removes the ith "WideKeyMember" element
     */
    @Override
    public void removeWideKeyMember(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[157], i);
        }
    }

    /**
     * Gets a List of "Wrapper" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Wrapper> getWrapperList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getWrapperArray,
                this::setWrapperArray,
                this::insertNewWrapper,
                this::removeWrapper,
                this::sizeOfWrapperArray
            );
        }
    }

    /**
     * Gets array of all "Wrapper" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Wrapper[] getWrapperArray() {
        return getXmlObjectArray(PROPERTY_QNAME[158], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.Wrapper[0]);
    }

    /**
     * Gets ith "Wrapper" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Wrapper getWrapperArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Wrapper target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Wrapper)get_store().find_element_user(PROPERTY_QNAME[158], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Wrapper" element
     */
    @Override
    public int sizeOfWrapperArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[158]);
        }
    }

    /**
     * Sets array of all "Wrapper" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setWrapperArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Wrapper[] wrapperArray) {
        check_orphaned();
        arraySetterHelper(wrapperArray, PROPERTY_QNAME[158]);
    }

    /**
     * Sets ith "Wrapper" element
     */
    @Override
    public void setWrapperArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Wrapper wrapper) {
        generatedSetterHelperImpl(wrapper, PROPERTY_QNAME[158], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Wrapper" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Wrapper insertNewWrapper(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Wrapper target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Wrapper)get_store().insert_element_user(PROPERTY_QNAME[158], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Wrapper" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Wrapper addNewWrapper() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Wrapper target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Wrapper)get_store().add_element_user(PROPERTY_QNAME[158]);
            return target;
        }
    }

    /**
     * Removes the ith "Wrapper" element
     */
    @Override
    public void removeWrapper(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[158], i);
        }
    }
}
