/*
 * XML Type:  Wrapper
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.Wrapper
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML Wrapper(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface Wrapper extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Wrapper> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "wrappere7bftype");
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
     * Gets a List of "supportingInformation" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference> getSupportingInformationList();

    /**
     * Gets array of all "supportingInformation" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference[] getSupportingInformationArray();

    /**
     * Gets ith "supportingInformation" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference getSupportingInformationArray(int i);

    /**
     * Returns number of "supportingInformation" element
     */
    int sizeOfSupportingInformationArray();

    /**
     * Sets array of all "supportingInformation" element
     */
    void setSupportingInformationArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference[] supportingInformationArray);

    /**
     * Sets ith "supportingInformation" element
     */
    void setSupportingInformationArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference supportingInformation);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "supportingInformation" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference insertNewSupportingInformation(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "supportingInformation" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference addNewSupportingInformation();

    /**
     * Removes the ith "supportingInformation" element
     */
    void removeSupportingInformation(int i);

    /**
     * Gets a List of "Activity" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity> getActivityList();

    /**
     * Gets array of all "Activity" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity[] getActivityArray();

    /**
     * Gets ith "Activity" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity getActivityArray(int i);

    /**
     * Returns number of "Activity" element
     */
    int sizeOfActivityArray();

    /**
     * Sets array of all "Activity" element
     */
    void setActivityArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity[] activityArray);

    /**
     * Sets ith "Activity" element
     */
    void setActivityArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity activity);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Activity" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity insertNewActivity(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Activity" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity addNewActivity();

    /**
     * Removes the ith "Activity" element
     */
    void removeActivity(int i);

    /**
     * Gets a List of "Agent" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Agent> getAgentList();

    /**
     * Gets array of all "Agent" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Agent[] getAgentArray();

    /**
     * Gets ith "Agent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Agent getAgentArray(int i);

    /**
     * Returns number of "Agent" element
     */
    int sizeOfAgentArray();

    /**
     * Sets array of all "Agent" element
     */
    void setAgentArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Agent[] agentArray);

    /**
     * Sets ith "Agent" element
     */
    void setAgentArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Agent agent);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Agent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Agent insertNewAgent(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Agent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Agent addNewAgent();

    /**
     * Removes the ith "Agent" element
     */
    void removeAgent(int i);

    /**
     * Gets a List of "AgentListing" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing> getAgentListingList();

    /**
     * Gets array of all "AgentListing" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing[] getAgentListingArray();

    /**
     * Gets ith "AgentListing" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing getAgentListingArray(int i);

    /**
     * Returns number of "AgentListing" element
     */
    int sizeOfAgentListingArray();

    /**
     * Sets array of all "AgentListing" element
     */
    void setAgentListingArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing[] agentListingArray);

    /**
     * Sets ith "AgentListing" element
     */
    void setAgentListingArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing agentListing);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "AgentListing" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing insertNewAgentListing(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "AgentListing" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing addNewAgentListing();

    /**
     * Removes the ith "AgentListing" element
     */
    void removeAgentListing(int i);

    /**
     * Gets a List of "AgentPosition" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentPosition> getAgentPositionList();

    /**
     * Gets array of all "AgentPosition" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentPosition[] getAgentPositionArray();

    /**
     * Gets ith "AgentPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentPosition getAgentPositionArray(int i);

    /**
     * Returns number of "AgentPosition" element
     */
    int sizeOfAgentPositionArray();

    /**
     * Sets array of all "AgentPosition" element
     */
    void setAgentPositionArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentPosition[] agentPositionArray);

    /**
     * Sets ith "AgentPosition" element
     */
    void setAgentPositionArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentPosition agentPosition);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "AgentPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentPosition insertNewAgentPosition(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "AgentPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentPosition addNewAgentPosition();

    /**
     * Removes the ith "AgentPosition" element
     */
    void removeAgentPosition(int i);

    /**
     * Gets a List of "AgentRelationship" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentRelationship> getAgentRelationshipList();

    /**
     * Gets array of all "AgentRelationship" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentRelationship[] getAgentRelationshipArray();

    /**
     * Gets ith "AgentRelationship" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentRelationship getAgentRelationshipArray(int i);

    /**
     * Returns number of "AgentRelationship" element
     */
    int sizeOfAgentRelationshipArray();

    /**
     * Sets array of all "AgentRelationship" element
     */
    void setAgentRelationshipArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentRelationship[] agentRelationshipArray);

    /**
     * Sets ith "AgentRelationship" element
     */
    void setAgentRelationshipArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentRelationship agentRelationship);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "AgentRelationship" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentRelationship insertNewAgentRelationship(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "AgentRelationship" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentRelationship addNewAgentRelationship();

    /**
     * Removes the ith "AgentRelationship" element
     */
    void removeAgentRelationship(int i);

    /**
     * Gets a List of "AgentStructure" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentStructure> getAgentStructureList();

    /**
     * Gets array of all "AgentStructure" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentStructure[] getAgentStructureArray();

    /**
     * Gets ith "AgentStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentStructure getAgentStructureArray(int i);

    /**
     * Returns number of "AgentStructure" element
     */
    int sizeOfAgentStructureArray();

    /**
     * Sets array of all "AgentStructure" element
     */
    void setAgentStructureArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentStructure[] agentStructureArray);

    /**
     * Sets ith "AgentStructure" element
     */
    void setAgentStructureArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentStructure agentStructure);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "AgentStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentStructure insertNewAgentStructure(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "AgentStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentStructure addNewAgentStructure();

    /**
     * Removes the ith "AgentStructure" element
     */
    void removeAgentStructure(int i);

    /**
     * Gets a List of "AllenIntervalAlgebra" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.AllenIntervalAlgebra> getAllenIntervalAlgebraList();

    /**
     * Gets array of all "AllenIntervalAlgebra" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AllenIntervalAlgebra[] getAllenIntervalAlgebraArray();

    /**
     * Gets ith "AllenIntervalAlgebra" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AllenIntervalAlgebra getAllenIntervalAlgebraArray(int i);

    /**
     * Returns number of "AllenIntervalAlgebra" element
     */
    int sizeOfAllenIntervalAlgebraArray();

    /**
     * Sets array of all "AllenIntervalAlgebra" element
     */
    void setAllenIntervalAlgebraArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.AllenIntervalAlgebra[] allenIntervalAlgebraArray);

    /**
     * Sets ith "AllenIntervalAlgebra" element
     */
    void setAllenIntervalAlgebraArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.AllenIntervalAlgebra allenIntervalAlgebra);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "AllenIntervalAlgebra" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AllenIntervalAlgebra insertNewAllenIntervalAlgebra(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "AllenIntervalAlgebra" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AllenIntervalAlgebra addNewAllenIntervalAlgebra();

    /**
     * Removes the ith "AllenIntervalAlgebra" element
     */
    void removeAllenIntervalAlgebra(int i);

    /**
     * Gets a List of "AttributeComponent" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.AttributeComponent> getAttributeComponentList();

    /**
     * Gets array of all "AttributeComponent" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AttributeComponent[] getAttributeComponentArray();

    /**
     * Gets ith "AttributeComponent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AttributeComponent getAttributeComponentArray(int i);

    /**
     * Returns number of "AttributeComponent" element
     */
    int sizeOfAttributeComponentArray();

    /**
     * Sets array of all "AttributeComponent" element
     */
    void setAttributeComponentArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.AttributeComponent[] attributeComponentArray);

    /**
     * Sets ith "AttributeComponent" element
     */
    void setAttributeComponentArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.AttributeComponent attributeComponent);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "AttributeComponent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AttributeComponent insertNewAttributeComponent(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "AttributeComponent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AttributeComponent addNewAttributeComponent();

    /**
     * Removes the ith "AttributeComponent" element
     */
    void removeAttributeComponent(int i);

    /**
     * Gets a List of "AuthorizationSource" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.AuthorizationSource> getAuthorizationSourceList();

    /**
     * Gets array of all "AuthorizationSource" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AuthorizationSource[] getAuthorizationSourceArray();

    /**
     * Gets ith "AuthorizationSource" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AuthorizationSource getAuthorizationSourceArray(int i);

    /**
     * Returns number of "AuthorizationSource" element
     */
    int sizeOfAuthorizationSourceArray();

    /**
     * Sets array of all "AuthorizationSource" element
     */
    void setAuthorizationSourceArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.AuthorizationSource[] authorizationSourceArray);

    /**
     * Sets ith "AuthorizationSource" element
     */
    void setAuthorizationSourceArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.AuthorizationSource authorizationSource);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "AuthorizationSource" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AuthorizationSource insertNewAuthorizationSource(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "AuthorizationSource" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AuthorizationSource addNewAuthorizationSource();

    /**
     * Removes the ith "AuthorizationSource" element
     */
    void removeAuthorizationSource(int i);

    /**
     * Gets a List of "Category" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Category> getCategoryList();

    /**
     * Gets array of all "Category" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Category[] getCategoryArray();

    /**
     * Gets ith "Category" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Category getCategoryArray(int i);

    /**
     * Returns number of "Category" element
     */
    int sizeOfCategoryArray();

    /**
     * Sets array of all "Category" element
     */
    void setCategoryArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Category[] categoryArray);

    /**
     * Sets ith "Category" element
     */
    void setCategoryArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Category category);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Category" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Category insertNewCategory(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Category" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Category addNewCategory();

    /**
     * Removes the ith "Category" element
     */
    void removeCategory(int i);

    /**
     * Gets a List of "CategoryPosition" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryPosition> getCategoryPositionList();

    /**
     * Gets array of all "CategoryPosition" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryPosition[] getCategoryPositionArray();

    /**
     * Gets ith "CategoryPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryPosition getCategoryPositionArray(int i);

    /**
     * Returns number of "CategoryPosition" element
     */
    int sizeOfCategoryPositionArray();

    /**
     * Sets array of all "CategoryPosition" element
     */
    void setCategoryPositionArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryPosition[] categoryPositionArray);

    /**
     * Sets ith "CategoryPosition" element
     */
    void setCategoryPositionArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryPosition categoryPosition);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "CategoryPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryPosition insertNewCategoryPosition(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "CategoryPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryPosition addNewCategoryPosition();

    /**
     * Removes the ith "CategoryPosition" element
     */
    void removeCategoryPosition(int i);

    /**
     * Gets a List of "CategoryRelationStructure" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationStructure> getCategoryRelationStructureList();

    /**
     * Gets array of all "CategoryRelationStructure" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationStructure[] getCategoryRelationStructureArray();

    /**
     * Gets ith "CategoryRelationStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationStructure getCategoryRelationStructureArray(int i);

    /**
     * Returns number of "CategoryRelationStructure" element
     */
    int sizeOfCategoryRelationStructureArray();

    /**
     * Sets array of all "CategoryRelationStructure" element
     */
    void setCategoryRelationStructureArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationStructure[] categoryRelationStructureArray);

    /**
     * Sets ith "CategoryRelationStructure" element
     */
    void setCategoryRelationStructureArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationStructure categoryRelationStructure);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "CategoryRelationStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationStructure insertNewCategoryRelationStructure(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "CategoryRelationStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationStructure addNewCategoryRelationStructure();

    /**
     * Removes the ith "CategoryRelationStructure" element
     */
    void removeCategoryRelationStructure(int i);

    /**
     * Gets a List of "CategoryRelationship" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship> getCategoryRelationshipList();

    /**
     * Gets array of all "CategoryRelationship" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship[] getCategoryRelationshipArray();

    /**
     * Gets ith "CategoryRelationship" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship getCategoryRelationshipArray(int i);

    /**
     * Returns number of "CategoryRelationship" element
     */
    int sizeOfCategoryRelationshipArray();

    /**
     * Sets array of all "CategoryRelationship" element
     */
    void setCategoryRelationshipArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship[] categoryRelationshipArray);

    /**
     * Sets ith "CategoryRelationship" element
     */
    void setCategoryRelationshipArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship categoryRelationship);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "CategoryRelationship" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship insertNewCategoryRelationship(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "CategoryRelationship" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationship addNewCategoryRelationship();

    /**
     * Removes the ith "CategoryRelationship" element
     */
    void removeCategoryRelationship(int i);

    /**
     * Gets a List of "CategorySet" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategorySet> getCategorySetList();

    /**
     * Gets array of all "CategorySet" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategorySet[] getCategorySetArray();

    /**
     * Gets ith "CategorySet" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategorySet getCategorySetArray(int i);

    /**
     * Returns number of "CategorySet" element
     */
    int sizeOfCategorySetArray();

    /**
     * Sets array of all "CategorySet" element
     */
    void setCategorySetArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategorySet[] categorySetArray);

    /**
     * Sets ith "CategorySet" element
     */
    void setCategorySetArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategorySet categorySet);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "CategorySet" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategorySet insertNewCategorySet(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "CategorySet" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategorySet addNewCategorySet();

    /**
     * Removes the ith "CategorySet" element
     */
    void removeCategorySet(int i);

    /**
     * Gets a List of "CategoryStatistic" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic> getCategoryStatisticList();

    /**
     * Gets array of all "CategoryStatistic" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic[] getCategoryStatisticArray();

    /**
     * Gets ith "CategoryStatistic" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic getCategoryStatisticArray(int i);

    /**
     * Returns number of "CategoryStatistic" element
     */
    int sizeOfCategoryStatisticArray();

    /**
     * Sets array of all "CategoryStatistic" element
     */
    void setCategoryStatisticArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic[] categoryStatisticArray);

    /**
     * Sets ith "CategoryStatistic" element
     */
    void setCategoryStatisticArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic categoryStatistic);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "CategoryStatistic" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic insertNewCategoryStatistic(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "CategoryStatistic" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryStatistic addNewCategoryStatistic();

    /**
     * Removes the ith "CategoryStatistic" element
     */
    void removeCategoryStatistic(int i);

    /**
     * Gets a List of "ClassificationFamily" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationFamily> getClassificationFamilyList();

    /**
     * Gets array of all "ClassificationFamily" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationFamily[] getClassificationFamilyArray();

    /**
     * Gets ith "ClassificationFamily" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationFamily getClassificationFamilyArray(int i);

    /**
     * Returns number of "ClassificationFamily" element
     */
    int sizeOfClassificationFamilyArray();

    /**
     * Sets array of all "ClassificationFamily" element
     */
    void setClassificationFamilyArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationFamily[] classificationFamilyArray);

    /**
     * Sets ith "ClassificationFamily" element
     */
    void setClassificationFamilyArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationFamily classificationFamily);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ClassificationFamily" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationFamily insertNewClassificationFamily(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ClassificationFamily" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationFamily addNewClassificationFamily();

    /**
     * Removes the ith "ClassificationFamily" element
     */
    void removeClassificationFamily(int i);

    /**
     * Gets a List of "ClassificationIndex" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex> getClassificationIndexList();

    /**
     * Gets array of all "ClassificationIndex" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex[] getClassificationIndexArray();

    /**
     * Gets ith "ClassificationIndex" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex getClassificationIndexArray(int i);

    /**
     * Returns number of "ClassificationIndex" element
     */
    int sizeOfClassificationIndexArray();

    /**
     * Sets array of all "ClassificationIndex" element
     */
    void setClassificationIndexArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex[] classificationIndexArray);

    /**
     * Sets ith "ClassificationIndex" element
     */
    void setClassificationIndexArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex classificationIndex);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ClassificationIndex" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex insertNewClassificationIndex(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ClassificationIndex" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex addNewClassificationIndex();

    /**
     * Removes the ith "ClassificationIndex" element
     */
    void removeClassificationIndex(int i);

    /**
     * Gets a List of "ClassificationIndexEntry" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntry> getClassificationIndexEntryList();

    /**
     * Gets array of all "ClassificationIndexEntry" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntry[] getClassificationIndexEntryArray();

    /**
     * Gets ith "ClassificationIndexEntry" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntry getClassificationIndexEntryArray(int i);

    /**
     * Returns number of "ClassificationIndexEntry" element
     */
    int sizeOfClassificationIndexEntryArray();

    /**
     * Sets array of all "ClassificationIndexEntry" element
     */
    void setClassificationIndexEntryArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntry[] classificationIndexEntryArray);

    /**
     * Sets ith "ClassificationIndexEntry" element
     */
    void setClassificationIndexEntryArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntry classificationIndexEntry);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ClassificationIndexEntry" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntry insertNewClassificationIndexEntry(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ClassificationIndexEntry" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntry addNewClassificationIndexEntry();

    /**
     * Removes the ith "ClassificationIndexEntry" element
     */
    void removeClassificationIndexEntry(int i);

    /**
     * Gets a List of "ClassificationIndexEntryPosition" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntryPosition> getClassificationIndexEntryPositionList();

    /**
     * Gets array of all "ClassificationIndexEntryPosition" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntryPosition[] getClassificationIndexEntryPositionArray();

    /**
     * Gets ith "ClassificationIndexEntryPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntryPosition getClassificationIndexEntryPositionArray(int i);

    /**
     * Returns number of "ClassificationIndexEntryPosition" element
     */
    int sizeOfClassificationIndexEntryPositionArray();

    /**
     * Sets array of all "ClassificationIndexEntryPosition" element
     */
    void setClassificationIndexEntryPositionArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntryPosition[] classificationIndexEntryPositionArray);

    /**
     * Sets ith "ClassificationIndexEntryPosition" element
     */
    void setClassificationIndexEntryPositionArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntryPosition classificationIndexEntryPosition);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ClassificationIndexEntryPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntryPosition insertNewClassificationIndexEntryPosition(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ClassificationIndexEntryPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntryPosition addNewClassificationIndexEntryPosition();

    /**
     * Removes the ith "ClassificationIndexEntryPosition" element
     */
    void removeClassificationIndexEntryPosition(int i);

    /**
     * Gets a List of "ClassificationItem" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItem> getClassificationItemList();

    /**
     * Gets array of all "ClassificationItem" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItem[] getClassificationItemArray();

    /**
     * Gets ith "ClassificationItem" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItem getClassificationItemArray(int i);

    /**
     * Returns number of "ClassificationItem" element
     */
    int sizeOfClassificationItemArray();

    /**
     * Sets array of all "ClassificationItem" element
     */
    void setClassificationItemArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItem[] classificationItemArray);

    /**
     * Sets ith "ClassificationItem" element
     */
    void setClassificationItemArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItem classificationItem);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ClassificationItem" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItem insertNewClassificationItem(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ClassificationItem" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItem addNewClassificationItem();

    /**
     * Removes the ith "ClassificationItem" element
     */
    void removeClassificationItem(int i);

    /**
     * Gets a List of "ClassificationItemPosition" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemPosition> getClassificationItemPositionList();

    /**
     * Gets array of all "ClassificationItemPosition" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemPosition[] getClassificationItemPositionArray();

    /**
     * Gets ith "ClassificationItemPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemPosition getClassificationItemPositionArray(int i);

    /**
     * Returns number of "ClassificationItemPosition" element
     */
    int sizeOfClassificationItemPositionArray();

    /**
     * Sets array of all "ClassificationItemPosition" element
     */
    void setClassificationItemPositionArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemPosition[] classificationItemPositionArray);

    /**
     * Sets ith "ClassificationItemPosition" element
     */
    void setClassificationItemPositionArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemPosition classificationItemPosition);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ClassificationItemPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemPosition insertNewClassificationItemPosition(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ClassificationItemPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemPosition addNewClassificationItemPosition();

    /**
     * Removes the ith "ClassificationItemPosition" element
     */
    void removeClassificationItemPosition(int i);

    /**
     * Gets a List of "ClassificationItemRelationship" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship> getClassificationItemRelationshipList();

    /**
     * Gets array of all "ClassificationItemRelationship" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship[] getClassificationItemRelationshipArray();

    /**
     * Gets ith "ClassificationItemRelationship" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship getClassificationItemRelationshipArray(int i);

    /**
     * Returns number of "ClassificationItemRelationship" element
     */
    int sizeOfClassificationItemRelationshipArray();

    /**
     * Sets array of all "ClassificationItemRelationship" element
     */
    void setClassificationItemRelationshipArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship[] classificationItemRelationshipArray);

    /**
     * Sets ith "ClassificationItemRelationship" element
     */
    void setClassificationItemRelationshipArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship classificationItemRelationship);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ClassificationItemRelationship" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship insertNewClassificationItemRelationship(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ClassificationItemRelationship" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemRelationship addNewClassificationItemRelationship();

    /**
     * Removes the ith "ClassificationItemRelationship" element
     */
    void removeClassificationItemRelationship(int i);

    /**
     * Gets a List of "ClassificationItemStructure" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemStructure> getClassificationItemStructureList();

    /**
     * Gets array of all "ClassificationItemStructure" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemStructure[] getClassificationItemStructureArray();

    /**
     * Gets ith "ClassificationItemStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemStructure getClassificationItemStructureArray(int i);

    /**
     * Returns number of "ClassificationItemStructure" element
     */
    int sizeOfClassificationItemStructureArray();

    /**
     * Sets array of all "ClassificationItemStructure" element
     */
    void setClassificationItemStructureArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemStructure[] classificationItemStructureArray);

    /**
     * Sets ith "ClassificationItemStructure" element
     */
    void setClassificationItemStructureArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemStructure classificationItemStructure);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ClassificationItemStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemStructure insertNewClassificationItemStructure(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ClassificationItemStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemStructure addNewClassificationItemStructure();

    /**
     * Removes the ith "ClassificationItemStructure" element
     */
    void removeClassificationItemStructure(int i);

    /**
     * Gets a List of "ClassificationPosition" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationPosition> getClassificationPositionList();

    /**
     * Gets array of all "ClassificationPosition" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationPosition[] getClassificationPositionArray();

    /**
     * Gets ith "ClassificationPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationPosition getClassificationPositionArray(int i);

    /**
     * Returns number of "ClassificationPosition" element
     */
    int sizeOfClassificationPositionArray();

    /**
     * Sets array of all "ClassificationPosition" element
     */
    void setClassificationPositionArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationPosition[] classificationPositionArray);

    /**
     * Sets ith "ClassificationPosition" element
     */
    void setClassificationPositionArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationPosition classificationPosition);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ClassificationPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationPosition insertNewClassificationPosition(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ClassificationPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationPosition addNewClassificationPosition();

    /**
     * Removes the ith "ClassificationPosition" element
     */
    void removeClassificationPosition(int i);

    /**
     * Gets a List of "ClassificationSeries" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeries> getClassificationSeriesList();

    /**
     * Gets array of all "ClassificationSeries" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeries[] getClassificationSeriesArray();

    /**
     * Gets ith "ClassificationSeries" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeries getClassificationSeriesArray(int i);

    /**
     * Returns number of "ClassificationSeries" element
     */
    int sizeOfClassificationSeriesArray();

    /**
     * Sets array of all "ClassificationSeries" element
     */
    void setClassificationSeriesArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeries[] classificationSeriesArray);

    /**
     * Sets ith "ClassificationSeries" element
     */
    void setClassificationSeriesArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeries classificationSeries);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ClassificationSeries" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeries insertNewClassificationSeries(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ClassificationSeries" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeries addNewClassificationSeries();

    /**
     * Removes the ith "ClassificationSeries" element
     */
    void removeClassificationSeries(int i);

    /**
     * Gets a List of "ClassificationSeriesStructure" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeriesStructure> getClassificationSeriesStructureList();

    /**
     * Gets array of all "ClassificationSeriesStructure" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeriesStructure[] getClassificationSeriesStructureArray();

    /**
     * Gets ith "ClassificationSeriesStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeriesStructure getClassificationSeriesStructureArray(int i);

    /**
     * Returns number of "ClassificationSeriesStructure" element
     */
    int sizeOfClassificationSeriesStructureArray();

    /**
     * Sets array of all "ClassificationSeriesStructure" element
     */
    void setClassificationSeriesStructureArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeriesStructure[] classificationSeriesStructureArray);

    /**
     * Sets ith "ClassificationSeriesStructure" element
     */
    void setClassificationSeriesStructureArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeriesStructure classificationSeriesStructure);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ClassificationSeriesStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeriesStructure insertNewClassificationSeriesStructure(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ClassificationSeriesStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeriesStructure addNewClassificationSeriesStructure();

    /**
     * Removes the ith "ClassificationSeriesStructure" element
     */
    void removeClassificationSeriesStructure(int i);

    /**
     * Gets a List of "Code" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Code> getCodeList();

    /**
     * Gets array of all "Code" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Code[] getCodeArray();

    /**
     * Gets ith "Code" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Code getCodeArray(int i);

    /**
     * Returns number of "Code" element
     */
    int sizeOfCodeArray();

    /**
     * Sets array of all "Code" element
     */
    void setCodeArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Code[] codeArray);

    /**
     * Sets ith "Code" element
     */
    void setCodeArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Code code);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Code" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Code insertNewCode(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Code" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Code addNewCode();

    /**
     * Removes the ith "Code" element
     */
    void removeCode(int i);

    /**
     * Gets a List of "CodeList" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeList> getCodeListList();

    /**
     * Gets array of all "CodeList" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeList[] getCodeListArray();

    /**
     * Gets ith "CodeList" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeList getCodeListArray(int i);

    /**
     * Returns number of "CodeList" element
     */
    int sizeOfCodeListArray();

    /**
     * Sets array of all "CodeList" element
     */
    void setCodeListArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeList[] codeListArray);

    /**
     * Sets ith "CodeList" element
     */
    void setCodeListArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeList codeList);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "CodeList" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeList insertNewCodeList(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "CodeList" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeList addNewCodeList();

    /**
     * Removes the ith "CodeList" element
     */
    void removeCodeList(int i);

    /**
     * Gets a List of "CodeListStructure" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeListStructure> getCodeListStructureList();

    /**
     * Gets array of all "CodeListStructure" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeListStructure[] getCodeListStructureArray();

    /**
     * Gets ith "CodeListStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeListStructure getCodeListStructureArray(int i);

    /**
     * Returns number of "CodeListStructure" element
     */
    int sizeOfCodeListStructureArray();

    /**
     * Sets array of all "CodeListStructure" element
     */
    void setCodeListStructureArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeListStructure[] codeListStructureArray);

    /**
     * Sets ith "CodeListStructure" element
     */
    void setCodeListStructureArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeListStructure codeListStructure);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "CodeListStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeListStructure insertNewCodeListStructure(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "CodeListStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeListStructure addNewCodeListStructure();

    /**
     * Removes the ith "CodeListStructure" element
     */
    void removeCodeListStructure(int i);

    /**
     * Gets a List of "CodePosition" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodePosition> getCodePositionList();

    /**
     * Gets array of all "CodePosition" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodePosition[] getCodePositionArray();

    /**
     * Gets ith "CodePosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodePosition getCodePositionArray(int i);

    /**
     * Returns number of "CodePosition" element
     */
    int sizeOfCodePositionArray();

    /**
     * Sets array of all "CodePosition" element
     */
    void setCodePositionArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodePosition[] codePositionArray);

    /**
     * Sets ith "CodePosition" element
     */
    void setCodePositionArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodePosition codePosition);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "CodePosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodePosition insertNewCodePosition(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "CodePosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodePosition addNewCodePosition();

    /**
     * Removes the ith "CodePosition" element
     */
    void removeCodePosition(int i);

    /**
     * Gets a List of "CodeRelationship" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship> getCodeRelationshipList();

    /**
     * Gets array of all "CodeRelationship" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship[] getCodeRelationshipArray();

    /**
     * Gets ith "CodeRelationship" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship getCodeRelationshipArray(int i);

    /**
     * Returns number of "CodeRelationship" element
     */
    int sizeOfCodeRelationshipArray();

    /**
     * Sets array of all "CodeRelationship" element
     */
    void setCodeRelationshipArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship[] codeRelationshipArray);

    /**
     * Sets ith "CodeRelationship" element
     */
    void setCodeRelationshipArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship codeRelationship);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "CodeRelationship" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship insertNewCodeRelationship(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "CodeRelationship" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship addNewCodeRelationship();

    /**
     * Removes the ith "CodeRelationship" element
     */
    void removeCodeRelationship(int i);

    /**
     * Gets a List of "ComponentPosition" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ComponentPosition> getComponentPositionList();

    /**
     * Gets array of all "ComponentPosition" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ComponentPosition[] getComponentPositionArray();

    /**
     * Gets ith "ComponentPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ComponentPosition getComponentPositionArray(int i);

    /**
     * Returns number of "ComponentPosition" element
     */
    int sizeOfComponentPositionArray();

    /**
     * Sets array of all "ComponentPosition" element
     */
    void setComponentPositionArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ComponentPosition[] componentPositionArray);

    /**
     * Sets ith "ComponentPosition" element
     */
    void setComponentPositionArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ComponentPosition componentPosition);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ComponentPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ComponentPosition insertNewComponentPosition(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ComponentPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ComponentPosition addNewComponentPosition();

    /**
     * Removes the ith "ComponentPosition" element
     */
    void removeComponentPosition(int i);

    /**
     * Gets a List of "Concept" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Concept> getConceptList();

    /**
     * Gets array of all "Concept" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Concept[] getConceptArray();

    /**
     * Gets ith "Concept" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Concept getConceptArray(int i);

    /**
     * Returns number of "Concept" element
     */
    int sizeOfConceptArray();

    /**
     * Sets array of all "Concept" element
     */
    void setConceptArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Concept[] conceptArray);

    /**
     * Sets ith "Concept" element
     */
    void setConceptArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Concept concept);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Concept" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Concept insertNewConcept(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Concept" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Concept addNewConcept();

    /**
     * Removes the ith "Concept" element
     */
    void removeConcept(int i);

    /**
     * Gets a List of "ConceptMap" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptMap> getConceptMapList();

    /**
     * Gets array of all "ConceptMap" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptMap[] getConceptMapArray();

    /**
     * Gets ith "ConceptMap" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptMap getConceptMapArray(int i);

    /**
     * Returns number of "ConceptMap" element
     */
    int sizeOfConceptMapArray();

    /**
     * Sets array of all "ConceptMap" element
     */
    void setConceptMapArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptMap[] conceptMapArray);

    /**
     * Sets ith "ConceptMap" element
     */
    void setConceptMapArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptMap conceptMap);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ConceptMap" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptMap insertNewConceptMap(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ConceptMap" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptMap addNewConceptMap();

    /**
     * Removes the ith "ConceptMap" element
     */
    void removeConceptMap(int i);

    /**
     * Gets a List of "ConceptRelationship" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptRelationship> getConceptRelationshipList();

    /**
     * Gets array of all "ConceptRelationship" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptRelationship[] getConceptRelationshipArray();

    /**
     * Gets ith "ConceptRelationship" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptRelationship getConceptRelationshipArray(int i);

    /**
     * Returns number of "ConceptRelationship" element
     */
    int sizeOfConceptRelationshipArray();

    /**
     * Sets array of all "ConceptRelationship" element
     */
    void setConceptRelationshipArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptRelationship[] conceptRelationshipArray);

    /**
     * Sets ith "ConceptRelationship" element
     */
    void setConceptRelationshipArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptRelationship conceptRelationship);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ConceptRelationship" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptRelationship insertNewConceptRelationship(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ConceptRelationship" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptRelationship addNewConceptRelationship();

    /**
     * Removes the ith "ConceptRelationship" element
     */
    void removeConceptRelationship(int i);

    /**
     * Gets a List of "ConceptStructure" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptStructure> getConceptStructureList();

    /**
     * Gets array of all "ConceptStructure" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptStructure[] getConceptStructureArray();

    /**
     * Gets ith "ConceptStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptStructure getConceptStructureArray(int i);

    /**
     * Returns number of "ConceptStructure" element
     */
    int sizeOfConceptStructureArray();

    /**
     * Sets array of all "ConceptStructure" element
     */
    void setConceptStructureArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptStructure[] conceptStructureArray);

    /**
     * Sets ith "ConceptStructure" element
     */
    void setConceptStructureArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptStructure conceptStructure);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ConceptStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptStructure insertNewConceptStructure(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ConceptStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptStructure addNewConceptStructure();

    /**
     * Removes the ith "ConceptStructure" element
     */
    void removeConceptStructure(int i);

    /**
     * Gets a List of "ConceptSystem" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystem> getConceptSystemList();

    /**
     * Gets array of all "ConceptSystem" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystem[] getConceptSystemArray();

    /**
     * Gets ith "ConceptSystem" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystem getConceptSystemArray(int i);

    /**
     * Returns number of "ConceptSystem" element
     */
    int sizeOfConceptSystemArray();

    /**
     * Sets array of all "ConceptSystem" element
     */
    void setConceptSystemArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystem[] conceptSystemArray);

    /**
     * Sets ith "ConceptSystem" element
     */
    void setConceptSystemArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystem conceptSystem);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ConceptSystem" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystem insertNewConceptSystem(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ConceptSystem" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystem addNewConceptSystem();

    /**
     * Removes the ith "ConceptSystem" element
     */
    void removeConceptSystem(int i);

    /**
     * Gets a List of "ConceptSystemCorrespondence" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystemCorrespondence> getConceptSystemCorrespondenceList();

    /**
     * Gets array of all "ConceptSystemCorrespondence" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystemCorrespondence[] getConceptSystemCorrespondenceArray();

    /**
     * Gets ith "ConceptSystemCorrespondence" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystemCorrespondence getConceptSystemCorrespondenceArray(int i);

    /**
     * Returns number of "ConceptSystemCorrespondence" element
     */
    int sizeOfConceptSystemCorrespondenceArray();

    /**
     * Sets array of all "ConceptSystemCorrespondence" element
     */
    void setConceptSystemCorrespondenceArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystemCorrespondence[] conceptSystemCorrespondenceArray);

    /**
     * Sets ith "ConceptSystemCorrespondence" element
     */
    void setConceptSystemCorrespondenceArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystemCorrespondence conceptSystemCorrespondence);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ConceptSystemCorrespondence" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystemCorrespondence insertNewConceptSystemCorrespondence(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ConceptSystemCorrespondence" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystemCorrespondence addNewConceptSystemCorrespondence();

    /**
     * Removes the ith "ConceptSystemCorrespondence" element
     */
    void removeConceptSystemCorrespondence(int i);

    /**
     * Gets a List of "ConceptualDomain" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualDomain> getConceptualDomainList();

    /**
     * Gets array of all "ConceptualDomain" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualDomain[] getConceptualDomainArray();

    /**
     * Gets ith "ConceptualDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualDomain getConceptualDomainArray(int i);

    /**
     * Returns number of "ConceptualDomain" element
     */
    int sizeOfConceptualDomainArray();

    /**
     * Sets array of all "ConceptualDomain" element
     */
    void setConceptualDomainArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualDomain[] conceptualDomainArray);

    /**
     * Sets ith "ConceptualDomain" element
     */
    void setConceptualDomainArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualDomain conceptualDomain);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ConceptualDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualDomain insertNewConceptualDomain(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ConceptualDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualDomain addNewConceptualDomain();

    /**
     * Removes the ith "ConceptualDomain" element
     */
    void removeConceptualDomain(int i);

    /**
     * Gets a List of "ConceptualValue" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualValue> getConceptualValueList();

    /**
     * Gets array of all "ConceptualValue" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualValue[] getConceptualValueArray();

    /**
     * Gets ith "ConceptualValue" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualValue getConceptualValueArray(int i);

    /**
     * Returns number of "ConceptualValue" element
     */
    int sizeOfConceptualValueArray();

    /**
     * Sets array of all "ConceptualValue" element
     */
    void setConceptualValueArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualValue[] conceptualValueArray);

    /**
     * Sets ith "ConceptualValue" element
     */
    void setConceptualValueArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualValue conceptualValue);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ConceptualValue" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualValue insertNewConceptualValue(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ConceptualValue" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualValue addNewConceptualValue();

    /**
     * Removes the ith "ConceptualValue" element
     */
    void removeConceptualValue(int i);

    /**
     * Gets a List of "ConceptualVariable" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable> getConceptualVariableList();

    /**
     * Gets array of all "ConceptualVariable" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable[] getConceptualVariableArray();

    /**
     * Gets ith "ConceptualVariable" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable getConceptualVariableArray(int i);

    /**
     * Returns number of "ConceptualVariable" element
     */
    int sizeOfConceptualVariableArray();

    /**
     * Sets array of all "ConceptualVariable" element
     */
    void setConceptualVariableArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable[] conceptualVariableArray);

    /**
     * Sets ith "ConceptualVariable" element
     */
    void setConceptualVariableArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable conceptualVariable);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ConceptualVariable" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable insertNewConceptualVariable(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ConceptualVariable" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable addNewConceptualVariable();

    /**
     * Removes the ith "ConceptualVariable" element
     */
    void removeConceptualVariable(int i);

    /**
     * Gets a List of "ConditionalControlLogic" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConditionalControlLogic> getConditionalControlLogicList();

    /**
     * Gets array of all "ConditionalControlLogic" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConditionalControlLogic[] getConditionalControlLogicArray();

    /**
     * Gets ith "ConditionalControlLogic" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConditionalControlLogic getConditionalControlLogicArray(int i);

    /**
     * Returns number of "ConditionalControlLogic" element
     */
    int sizeOfConditionalControlLogicArray();

    /**
     * Sets array of all "ConditionalControlLogic" element
     */
    void setConditionalControlLogicArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConditionalControlLogic[] conditionalControlLogicArray);

    /**
     * Sets ith "ConditionalControlLogic" element
     */
    void setConditionalControlLogicArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConditionalControlLogic conditionalControlLogic);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ConditionalControlLogic" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConditionalControlLogic insertNewConditionalControlLogic(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ConditionalControlLogic" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConditionalControlLogic addNewConditionalControlLogic();

    /**
     * Removes the ith "ConditionalControlLogic" element
     */
    void removeConditionalControlLogic(int i);

    /**
     * Gets a List of "ContextualComponent" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContextualComponent> getContextualComponentList();

    /**
     * Gets array of all "ContextualComponent" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContextualComponent[] getContextualComponentArray();

    /**
     * Gets ith "ContextualComponent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContextualComponent getContextualComponentArray(int i);

    /**
     * Returns number of "ContextualComponent" element
     */
    int sizeOfContextualComponentArray();

    /**
     * Sets array of all "ContextualComponent" element
     */
    void setContextualComponentArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContextualComponent[] contextualComponentArray);

    /**
     * Sets ith "ContextualComponent" element
     */
    void setContextualComponentArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContextualComponent contextualComponent);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ContextualComponent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContextualComponent insertNewContextualComponent(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ContextualComponent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContextualComponent addNewContextualComponent();

    /**
     * Removes the ith "ContextualComponent" element
     */
    void removeContextualComponent(int i);

    /**
     * Gets a List of "ControlLogic" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic> getControlLogicList();

    /**
     * Gets array of all "ControlLogic" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic[] getControlLogicArray();

    /**
     * Gets ith "ControlLogic" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic getControlLogicArray(int i);

    /**
     * Returns number of "ControlLogic" element
     */
    int sizeOfControlLogicArray();

    /**
     * Sets array of all "ControlLogic" element
     */
    void setControlLogicArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic[] controlLogicArray);

    /**
     * Sets ith "ControlLogic" element
     */
    void setControlLogicArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic controlLogic);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ControlLogic" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic insertNewControlLogic(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ControlLogic" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlLogic addNewControlLogic();

    /**
     * Removes the ith "ControlLogic" element
     */
    void removeControlLogic(int i);

    /**
     * Gets a List of "CorrespondenceTable" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable> getCorrespondenceTableList();

    /**
     * Gets array of all "CorrespondenceTable" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable[] getCorrespondenceTableArray();

    /**
     * Gets ith "CorrespondenceTable" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable getCorrespondenceTableArray(int i);

    /**
     * Returns number of "CorrespondenceTable" element
     */
    int sizeOfCorrespondenceTableArray();

    /**
     * Sets array of all "CorrespondenceTable" element
     */
    void setCorrespondenceTableArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable[] correspondenceTableArray);

    /**
     * Sets ith "CorrespondenceTable" element
     */
    void setCorrespondenceTableArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable correspondenceTable);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "CorrespondenceTable" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable insertNewCorrespondenceTable(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "CorrespondenceTable" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceTable addNewCorrespondenceTable();

    /**
     * Removes the ith "CorrespondenceTable" element
     */
    void removeCorrespondenceTable(int i);

    /**
     * Gets a List of "Curator" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Curator> getCuratorList();

    /**
     * Gets array of all "Curator" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Curator[] getCuratorArray();

    /**
     * Gets ith "Curator" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Curator getCuratorArray(int i);

    /**
     * Returns number of "Curator" element
     */
    int sizeOfCuratorArray();

    /**
     * Sets array of all "Curator" element
     */
    void setCuratorArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Curator[] curatorArray);

    /**
     * Sets ith "Curator" element
     */
    void setCuratorArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Curator curator);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Curator" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Curator insertNewCurator(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Curator" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Curator addNewCurator();

    /**
     * Removes the ith "Curator" element
     */
    void removeCurator(int i);

    /**
     * Gets a List of "DataPoint" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPoint> getDataPointList();

    /**
     * Gets array of all "DataPoint" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPoint[] getDataPointArray();

    /**
     * Gets ith "DataPoint" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPoint getDataPointArray(int i);

    /**
     * Returns number of "DataPoint" element
     */
    int sizeOfDataPointArray();

    /**
     * Sets array of all "DataPoint" element
     */
    void setDataPointArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPoint[] dataPointArray);

    /**
     * Sets ith "DataPoint" element
     */
    void setDataPointArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPoint dataPoint);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataPoint" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPoint insertNewDataPoint(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "DataPoint" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPoint addNewDataPoint();

    /**
     * Removes the ith "DataPoint" element
     */
    void removeDataPoint(int i);

    /**
     * Gets a List of "DataPointPosition" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointPosition> getDataPointPositionList();

    /**
     * Gets array of all "DataPointPosition" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointPosition[] getDataPointPositionArray();

    /**
     * Gets ith "DataPointPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointPosition getDataPointPositionArray(int i);

    /**
     * Returns number of "DataPointPosition" element
     */
    int sizeOfDataPointPositionArray();

    /**
     * Sets array of all "DataPointPosition" element
     */
    void setDataPointPositionArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointPosition[] dataPointPositionArray);

    /**
     * Sets ith "DataPointPosition" element
     */
    void setDataPointPositionArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointPosition dataPointPosition);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataPointPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointPosition insertNewDataPointPosition(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "DataPointPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointPosition addNewDataPointPosition();

    /**
     * Removes the ith "DataPointPosition" element
     */
    void removeDataPointPosition(int i);

    /**
     * Gets a List of "DataPointRelationship" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship> getDataPointRelationshipList();

    /**
     * Gets array of all "DataPointRelationship" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship[] getDataPointRelationshipArray();

    /**
     * Gets ith "DataPointRelationship" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship getDataPointRelationshipArray(int i);

    /**
     * Returns number of "DataPointRelationship" element
     */
    int sizeOfDataPointRelationshipArray();

    /**
     * Sets array of all "DataPointRelationship" element
     */
    void setDataPointRelationshipArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship[] dataPointRelationshipArray);

    /**
     * Sets ith "DataPointRelationship" element
     */
    void setDataPointRelationshipArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship dataPointRelationship);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataPointRelationship" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship insertNewDataPointRelationship(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "DataPointRelationship" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataPointRelationship addNewDataPointRelationship();

    /**
     * Removes the ith "DataPointRelationship" element
     */
    void removeDataPointRelationship(int i);

    /**
     * Gets a List of "DataSet" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataSet> getDataSetList();

    /**
     * Gets array of all "DataSet" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataSet[] getDataSetArray();

    /**
     * Gets ith "DataSet" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataSet getDataSetArray(int i);

    /**
     * Returns number of "DataSet" element
     */
    int sizeOfDataSetArray();

    /**
     * Sets array of all "DataSet" element
     */
    void setDataSetArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataSet[] dataSetArray);

    /**
     * Sets ith "DataSet" element
     */
    void setDataSetArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataSet dataSet);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataSet" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataSet insertNewDataSet(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "DataSet" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataSet addNewDataSet();

    /**
     * Removes the ith "DataSet" element
     */
    void removeDataSet(int i);

    /**
     * Gets a List of "DataStore" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore> getDataStoreList();

    /**
     * Gets array of all "DataStore" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore[] getDataStoreArray();

    /**
     * Gets ith "DataStore" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore getDataStoreArray(int i);

    /**
     * Returns number of "DataStore" element
     */
    int sizeOfDataStoreArray();

    /**
     * Sets array of all "DataStore" element
     */
    void setDataStoreArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore[] dataStoreArray);

    /**
     * Sets ith "DataStore" element
     */
    void setDataStoreArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore dataStore);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataStore" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore insertNewDataStore(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "DataStore" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore addNewDataStore();

    /**
     * Removes the ith "DataStore" element
     */
    void removeDataStore(int i);

    /**
     * Gets a List of "DataStructure" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructure> getDataStructureList();

    /**
     * Gets array of all "DataStructure" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructure[] getDataStructureArray();

    /**
     * Gets ith "DataStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructure getDataStructureArray(int i);

    /**
     * Returns number of "DataStructure" element
     */
    int sizeOfDataStructureArray();

    /**
     * Sets array of all "DataStructure" element
     */
    void setDataStructureArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructure[] dataStructureArray);

    /**
     * Sets ith "DataStructure" element
     */
    void setDataStructureArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructure dataStructure);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructure insertNewDataStructure(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "DataStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructure addNewDataStructure();

    /**
     * Removes the ith "DataStructure" element
     */
    void removeDataStructure(int i);

    /**
     * Gets a List of "DataStructureComponent" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructureComponent> getDataStructureComponentList();

    /**
     * Gets array of all "DataStructureComponent" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructureComponent[] getDataStructureComponentArray();

    /**
     * Gets ith "DataStructureComponent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructureComponent getDataStructureComponentArray(int i);

    /**
     * Returns number of "DataStructureComponent" element
     */
    int sizeOfDataStructureComponentArray();

    /**
     * Sets array of all "DataStructureComponent" element
     */
    void setDataStructureComponentArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructureComponent[] dataStructureComponentArray);

    /**
     * Sets ith "DataStructureComponent" element
     */
    void setDataStructureComponentArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructureComponent dataStructureComponent);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataStructureComponent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructureComponent insertNewDataStructureComponent(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "DataStructureComponent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructureComponent addNewDataStructureComponent();

    /**
     * Removes the ith "DataStructureComponent" element
     */
    void removeDataStructureComponent(int i);

    /**
     * Gets a List of "Datum" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum> getDatumList();

    /**
     * Gets array of all "Datum" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum[] getDatumArray();

    /**
     * Gets ith "Datum" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum getDatumArray(int i);

    /**
     * Returns number of "Datum" element
     */
    int sizeOfDatumArray();

    /**
     * Sets array of all "Datum" element
     */
    void setDatumArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum[] datumArray);

    /**
     * Sets ith "Datum" element
     */
    void setDatumArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum datum);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Datum" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum insertNewDatum(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Datum" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum addNewDatum();

    /**
     * Removes the ith "Datum" element
     */
    void removeDatum(int i);

    /**
     * Gets a List of "Descriptor" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor> getDescriptorList();

    /**
     * Gets array of all "Descriptor" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor[] getDescriptorArray();

    /**
     * Gets ith "Descriptor" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor getDescriptorArray(int i);

    /**
     * Returns number of "Descriptor" element
     */
    int sizeOfDescriptorArray();

    /**
     * Sets array of all "Descriptor" element
     */
    void setDescriptorArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor[] descriptorArray);

    /**
     * Sets ith "Descriptor" element
     */
    void setDescriptorArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor descriptor);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Descriptor" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor insertNewDescriptor(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Descriptor" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Descriptor addNewDescriptor();

    /**
     * Removes the ith "Descriptor" element
     */
    void removeDescriptor(int i);

    /**
     * Gets a List of "DescriptorValueDomain" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorValueDomain> getDescriptorValueDomainList();

    /**
     * Gets array of all "DescriptorValueDomain" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorValueDomain[] getDescriptorValueDomainArray();

    /**
     * Gets ith "DescriptorValueDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorValueDomain getDescriptorValueDomainArray(int i);

    /**
     * Returns number of "DescriptorValueDomain" element
     */
    int sizeOfDescriptorValueDomainArray();

    /**
     * Sets array of all "DescriptorValueDomain" element
     */
    void setDescriptorValueDomainArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorValueDomain[] descriptorValueDomainArray);

    /**
     * Sets ith "DescriptorValueDomain" element
     */
    void setDescriptorValueDomainArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorValueDomain descriptorValueDomain);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DescriptorValueDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorValueDomain insertNewDescriptorValueDomain(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "DescriptorValueDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorValueDomain addNewDescriptorValueDomain();

    /**
     * Removes the ith "DescriptorValueDomain" element
     */
    void removeDescriptorValueDomain(int i);

    /**
     * Gets a List of "DescriptorVariable" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorVariable> getDescriptorVariableList();

    /**
     * Gets array of all "DescriptorVariable" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorVariable[] getDescriptorVariableArray();

    /**
     * Gets ith "DescriptorVariable" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorVariable getDescriptorVariableArray(int i);

    /**
     * Returns number of "DescriptorVariable" element
     */
    int sizeOfDescriptorVariableArray();

    /**
     * Sets array of all "DescriptorVariable" element
     */
    void setDescriptorVariableArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorVariable[] descriptorVariableArray);

    /**
     * Sets ith "DescriptorVariable" element
     */
    void setDescriptorVariableArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorVariable descriptorVariable);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DescriptorVariable" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorVariable insertNewDescriptorVariable(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "DescriptorVariable" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DescriptorVariable addNewDescriptorVariable();

    /**
     * Removes the ith "DescriptorVariable" element
     */
    void removeDescriptorVariable(int i);

    /**
     * Gets a List of "DeterministicImperative" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DeterministicImperative> getDeterministicImperativeList();

    /**
     * Gets array of all "DeterministicImperative" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DeterministicImperative[] getDeterministicImperativeArray();

    /**
     * Gets ith "DeterministicImperative" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DeterministicImperative getDeterministicImperativeArray(int i);

    /**
     * Returns number of "DeterministicImperative" element
     */
    int sizeOfDeterministicImperativeArray();

    /**
     * Sets array of all "DeterministicImperative" element
     */
    void setDeterministicImperativeArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DeterministicImperative[] deterministicImperativeArray);

    /**
     * Sets ith "DeterministicImperative" element
     */
    void setDeterministicImperativeArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.DeterministicImperative deterministicImperative);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DeterministicImperative" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DeterministicImperative insertNewDeterministicImperative(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "DeterministicImperative" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DeterministicImperative addNewDeterministicImperative();

    /**
     * Removes the ith "DeterministicImperative" element
     */
    void removeDeterministicImperative(int i);

    /**
     * Gets a List of "DimensionComponent" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionComponent> getDimensionComponentList();

    /**
     * Gets array of all "DimensionComponent" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionComponent[] getDimensionComponentArray();

    /**
     * Gets ith "DimensionComponent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionComponent getDimensionComponentArray(int i);

    /**
     * Returns number of "DimensionComponent" element
     */
    int sizeOfDimensionComponentArray();

    /**
     * Sets array of all "DimensionComponent" element
     */
    void setDimensionComponentArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionComponent[] dimensionComponentArray);

    /**
     * Sets ith "DimensionComponent" element
     */
    void setDimensionComponentArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionComponent dimensionComponent);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DimensionComponent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionComponent insertNewDimensionComponent(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "DimensionComponent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionComponent addNewDimensionComponent();

    /**
     * Removes the ith "DimensionComponent" element
     */
    void removeDimensionComponent(int i);

    /**
     * Gets a List of "DimensionGroup" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionGroup> getDimensionGroupList();

    /**
     * Gets array of all "DimensionGroup" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionGroup[] getDimensionGroupArray();

    /**
     * Gets ith "DimensionGroup" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionGroup getDimensionGroupArray(int i);

    /**
     * Returns number of "DimensionGroup" element
     */
    int sizeOfDimensionGroupArray();

    /**
     * Sets array of all "DimensionGroup" element
     */
    void setDimensionGroupArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionGroup[] dimensionGroupArray);

    /**
     * Sets ith "DimensionGroup" element
     */
    void setDimensionGroupArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionGroup dimensionGroup);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DimensionGroup" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionGroup insertNewDimensionGroup(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "DimensionGroup" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionGroup addNewDimensionGroup();

    /**
     * Removes the ith "DimensionGroup" element
     */
    void removeDimensionGroup(int i);

    /**
     * Gets a List of "DimensionalDataSet" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataSet> getDimensionalDataSetList();

    /**
     * Gets array of all "DimensionalDataSet" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataSet[] getDimensionalDataSetArray();

    /**
     * Gets ith "DimensionalDataSet" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataSet getDimensionalDataSetArray(int i);

    /**
     * Returns number of "DimensionalDataSet" element
     */
    int sizeOfDimensionalDataSetArray();

    /**
     * Sets array of all "DimensionalDataSet" element
     */
    void setDimensionalDataSetArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataSet[] dimensionalDataSetArray);

    /**
     * Sets ith "DimensionalDataSet" element
     */
    void setDimensionalDataSetArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataSet dimensionalDataSet);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DimensionalDataSet" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataSet insertNewDimensionalDataSet(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "DimensionalDataSet" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataSet addNewDimensionalDataSet();

    /**
     * Removes the ith "DimensionalDataSet" element
     */
    void removeDimensionalDataSet(int i);

    /**
     * Gets a List of "DimensionalDataStructure" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataStructure> getDimensionalDataStructureList();

    /**
     * Gets array of all "DimensionalDataStructure" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataStructure[] getDimensionalDataStructureArray();

    /**
     * Gets ith "DimensionalDataStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataStructure getDimensionalDataStructureArray(int i);

    /**
     * Returns number of "DimensionalDataStructure" element
     */
    int sizeOfDimensionalDataStructureArray();

    /**
     * Sets array of all "DimensionalDataStructure" element
     */
    void setDimensionalDataStructureArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataStructure[] dimensionalDataStructureArray);

    /**
     * Sets ith "DimensionalDataStructure" element
     */
    void setDimensionalDataStructureArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataStructure dimensionalDataStructure);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DimensionalDataStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataStructure insertNewDimensionalDataStructure(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "DimensionalDataStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataStructure addNewDimensionalDataStructure();

    /**
     * Removes the ith "DimensionalDataStructure" element
     */
    void removeDimensionalDataStructure(int i);

    /**
     * Gets a List of "DimensionalKey" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKey> getDimensionalKeyList();

    /**
     * Gets array of all "DimensionalKey" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKey[] getDimensionalKeyArray();

    /**
     * Gets ith "DimensionalKey" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKey getDimensionalKeyArray(int i);

    /**
     * Returns number of "DimensionalKey" element
     */
    int sizeOfDimensionalKeyArray();

    /**
     * Sets array of all "DimensionalKey" element
     */
    void setDimensionalKeyArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKey[] dimensionalKeyArray);

    /**
     * Sets ith "DimensionalKey" element
     */
    void setDimensionalKeyArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKey dimensionalKey);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DimensionalKey" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKey insertNewDimensionalKey(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "DimensionalKey" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKey addNewDimensionalKey();

    /**
     * Removes the ith "DimensionalKey" element
     */
    void removeDimensionalKey(int i);

    /**
     * Gets a List of "DimensionalKeyDefinition" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinition> getDimensionalKeyDefinitionList();

    /**
     * Gets array of all "DimensionalKeyDefinition" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinition[] getDimensionalKeyDefinitionArray();

    /**
     * Gets ith "DimensionalKeyDefinition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinition getDimensionalKeyDefinitionArray(int i);

    /**
     * Returns number of "DimensionalKeyDefinition" element
     */
    int sizeOfDimensionalKeyDefinitionArray();

    /**
     * Sets array of all "DimensionalKeyDefinition" element
     */
    void setDimensionalKeyDefinitionArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinition[] dimensionalKeyDefinitionArray);

    /**
     * Sets ith "DimensionalKeyDefinition" element
     */
    void setDimensionalKeyDefinitionArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinition dimensionalKeyDefinition);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DimensionalKeyDefinition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinition insertNewDimensionalKeyDefinition(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "DimensionalKeyDefinition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinition addNewDimensionalKeyDefinition();

    /**
     * Removes the ith "DimensionalKeyDefinition" element
     */
    void removeDimensionalKeyDefinition(int i);

    /**
     * Gets a List of "DimensionalKeyDefinitionMember" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinitionMember> getDimensionalKeyDefinitionMemberList();

    /**
     * Gets array of all "DimensionalKeyDefinitionMember" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinitionMember[] getDimensionalKeyDefinitionMemberArray();

    /**
     * Gets ith "DimensionalKeyDefinitionMember" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinitionMember getDimensionalKeyDefinitionMemberArray(int i);

    /**
     * Returns number of "DimensionalKeyDefinitionMember" element
     */
    int sizeOfDimensionalKeyDefinitionMemberArray();

    /**
     * Sets array of all "DimensionalKeyDefinitionMember" element
     */
    void setDimensionalKeyDefinitionMemberArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinitionMember[] dimensionalKeyDefinitionMemberArray);

    /**
     * Sets ith "DimensionalKeyDefinitionMember" element
     */
    void setDimensionalKeyDefinitionMemberArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinitionMember dimensionalKeyDefinitionMember);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DimensionalKeyDefinitionMember" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinitionMember insertNewDimensionalKeyDefinitionMember(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "DimensionalKeyDefinitionMember" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinitionMember addNewDimensionalKeyDefinitionMember();

    /**
     * Removes the ith "DimensionalKeyDefinitionMember" element
     */
    void removeDimensionalKeyDefinitionMember(int i);

    /**
     * Gets a List of "DimensionalKeyMember" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyMember> getDimensionalKeyMemberList();

    /**
     * Gets array of all "DimensionalKeyMember" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyMember[] getDimensionalKeyMemberArray();

    /**
     * Gets ith "DimensionalKeyMember" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyMember getDimensionalKeyMemberArray(int i);

    /**
     * Returns number of "DimensionalKeyMember" element
     */
    int sizeOfDimensionalKeyMemberArray();

    /**
     * Sets array of all "DimensionalKeyMember" element
     */
    void setDimensionalKeyMemberArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyMember[] dimensionalKeyMemberArray);

    /**
     * Sets ith "DimensionalKeyMember" element
     */
    void setDimensionalKeyMemberArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyMember dimensionalKeyMember);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DimensionalKeyMember" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyMember insertNewDimensionalKeyMember(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "DimensionalKeyMember" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyMember addNewDimensionalKeyMember();

    /**
     * Removes the ith "DimensionalKeyMember" element
     */
    void removeDimensionalKeyMember(int i);

    /**
     * Gets a List of "EnumerationDomain" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain> getEnumerationDomainList();

    /**
     * Gets array of all "EnumerationDomain" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain[] getEnumerationDomainArray();

    /**
     * Gets ith "EnumerationDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain getEnumerationDomainArray(int i);

    /**
     * Returns number of "EnumerationDomain" element
     */
    int sizeOfEnumerationDomainArray();

    /**
     * Sets array of all "EnumerationDomain" element
     */
    void setEnumerationDomainArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain[] enumerationDomainArray);

    /**
     * Sets ith "EnumerationDomain" element
     */
    void setEnumerationDomainArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain enumerationDomain);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "EnumerationDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain insertNewEnumerationDomain(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "EnumerationDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain addNewEnumerationDomain();

    /**
     * Removes the ith "EnumerationDomain" element
     */
    void removeEnumerationDomain(int i);

    /**
     * Gets a List of "ForeignKey" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKey> getForeignKeyList();

    /**
     * Gets array of all "ForeignKey" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKey[] getForeignKeyArray();

    /**
     * Gets ith "ForeignKey" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKey getForeignKeyArray(int i);

    /**
     * Returns number of "ForeignKey" element
     */
    int sizeOfForeignKeyArray();

    /**
     * Sets array of all "ForeignKey" element
     */
    void setForeignKeyArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKey[] foreignKeyArray);

    /**
     * Sets ith "ForeignKey" element
     */
    void setForeignKeyArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKey foreignKey);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ForeignKey" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKey insertNewForeignKey(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ForeignKey" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKey addNewForeignKey();

    /**
     * Removes the ith "ForeignKey" element
     */
    void removeForeignKey(int i);

    /**
     * Gets a List of "ForeignKeyComponent" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKeyComponent> getForeignKeyComponentList();

    /**
     * Gets array of all "ForeignKeyComponent" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKeyComponent[] getForeignKeyComponentArray();

    /**
     * Gets ith "ForeignKeyComponent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKeyComponent getForeignKeyComponentArray(int i);

    /**
     * Returns number of "ForeignKeyComponent" element
     */
    int sizeOfForeignKeyComponentArray();

    /**
     * Sets array of all "ForeignKeyComponent" element
     */
    void setForeignKeyComponentArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKeyComponent[] foreignKeyComponentArray);

    /**
     * Sets ith "ForeignKeyComponent" element
     */
    void setForeignKeyComponentArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKeyComponent foreignKeyComponent);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ForeignKeyComponent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKeyComponent insertNewForeignKeyComponent(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ForeignKeyComponent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKeyComponent addNewForeignKeyComponent();

    /**
     * Removes the ith "ForeignKeyComponent" element
     */
    void removeForeignKeyComponent(int i);

    /**
     * Gets a List of "IdentifierComponent" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.IdentifierComponent> getIdentifierComponentList();

    /**
     * Gets array of all "IdentifierComponent" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.IdentifierComponent[] getIdentifierComponentArray();

    /**
     * Gets ith "IdentifierComponent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.IdentifierComponent getIdentifierComponentArray(int i);

    /**
     * Returns number of "IdentifierComponent" element
     */
    int sizeOfIdentifierComponentArray();

    /**
     * Sets array of all "IdentifierComponent" element
     */
    void setIdentifierComponentArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.IdentifierComponent[] identifierComponentArray);

    /**
     * Sets ith "IdentifierComponent" element
     */
    void setIdentifierComponentArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.IdentifierComponent identifierComponent);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "IdentifierComponent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.IdentifierComponent insertNewIdentifierComponent(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "IdentifierComponent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.IdentifierComponent addNewIdentifierComponent();

    /**
     * Removes the ith "IdentifierComponent" element
     */
    void removeIdentifierComponent(int i);

    /**
     * Gets a List of "Individual" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Individual> getIndividualList();

    /**
     * Gets array of all "Individual" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Individual[] getIndividualArray();

    /**
     * Gets ith "Individual" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Individual getIndividualArray(int i);

    /**
     * Returns number of "Individual" element
     */
    int sizeOfIndividualArray();

    /**
     * Sets array of all "Individual" element
     */
    void setIndividualArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Individual[] individualArray);

    /**
     * Sets ith "Individual" element
     */
    void setIndividualArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Individual individual);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Individual" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Individual insertNewIndividual(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Individual" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Individual addNewIndividual();

    /**
     * Removes the ith "Individual" element
     */
    void removeIndividual(int i);

    /**
     * Gets a List of "InformationFlowDefinition" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition> getInformationFlowDefinitionList();

    /**
     * Gets array of all "InformationFlowDefinition" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition[] getInformationFlowDefinitionArray();

    /**
     * Gets ith "InformationFlowDefinition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition getInformationFlowDefinitionArray(int i);

    /**
     * Returns number of "InformationFlowDefinition" element
     */
    int sizeOfInformationFlowDefinitionArray();

    /**
     * Sets array of all "InformationFlowDefinition" element
     */
    void setInformationFlowDefinitionArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition[] informationFlowDefinitionArray);

    /**
     * Sets ith "InformationFlowDefinition" element
     */
    void setInformationFlowDefinitionArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition informationFlowDefinition);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "InformationFlowDefinition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition insertNewInformationFlowDefinition(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "InformationFlowDefinition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition addNewInformationFlowDefinition();

    /**
     * Removes the ith "InformationFlowDefinition" element
     */
    void removeInformationFlowDefinition(int i);

    /**
     * Gets a List of "InstanceKey" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKey> getInstanceKeyList();

    /**
     * Gets array of all "InstanceKey" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKey[] getInstanceKeyArray();

    /**
     * Gets ith "InstanceKey" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKey getInstanceKeyArray(int i);

    /**
     * Returns number of "InstanceKey" element
     */
    int sizeOfInstanceKeyArray();

    /**
     * Sets array of all "InstanceKey" element
     */
    void setInstanceKeyArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKey[] instanceKeyArray);

    /**
     * Sets ith "InstanceKey" element
     */
    void setInstanceKeyArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKey instanceKey);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "InstanceKey" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKey insertNewInstanceKey(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "InstanceKey" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKey addNewInstanceKey();

    /**
     * Removes the ith "InstanceKey" element
     */
    void removeInstanceKey(int i);

    /**
     * Gets a List of "InstanceValue" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceValue> getInstanceValueList();

    /**
     * Gets array of all "InstanceValue" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceValue[] getInstanceValueArray();

    /**
     * Gets ith "InstanceValue" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceValue getInstanceValueArray(int i);

    /**
     * Returns number of "InstanceValue" element
     */
    int sizeOfInstanceValueArray();

    /**
     * Sets array of all "InstanceValue" element
     */
    void setInstanceValueArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceValue[] instanceValueArray);

    /**
     * Sets ith "InstanceValue" element
     */
    void setInstanceValueArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceValue instanceValue);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "InstanceValue" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceValue insertNewInstanceValue(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "InstanceValue" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceValue addNewInstanceValue();

    /**
     * Removes the ith "InstanceValue" element
     */
    void removeInstanceValue(int i);

    /**
     * Gets a List of "InstanceVariable" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariable> getInstanceVariableList();

    /**
     * Gets array of all "InstanceVariable" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariable[] getInstanceVariableArray();

    /**
     * Gets ith "InstanceVariable" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariable getInstanceVariableArray(int i);

    /**
     * Returns number of "InstanceVariable" element
     */
    int sizeOfInstanceVariableArray();

    /**
     * Sets array of all "InstanceVariable" element
     */
    void setInstanceVariableArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariable[] instanceVariableArray);

    /**
     * Sets ith "InstanceVariable" element
     */
    void setInstanceVariableArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariable instanceVariable);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "InstanceVariable" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariable insertNewInstanceVariable(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "InstanceVariable" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariable addNewInstanceVariable();

    /**
     * Removes the ith "InstanceVariable" element
     */
    void removeInstanceVariable(int i);

    /**
     * Gets a List of "InstanceVariableMap" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap> getInstanceVariableMapList();

    /**
     * Gets array of all "InstanceVariableMap" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap[] getInstanceVariableMapArray();

    /**
     * Gets ith "InstanceVariableMap" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap getInstanceVariableMapArray(int i);

    /**
     * Returns number of "InstanceVariableMap" element
     */
    int sizeOfInstanceVariableMapArray();

    /**
     * Sets array of all "InstanceVariableMap" element
     */
    void setInstanceVariableMapArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap[] instanceVariableMapArray);

    /**
     * Sets ith "InstanceVariableMap" element
     */
    void setInstanceVariableMapArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap instanceVariableMap);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "InstanceVariableMap" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap insertNewInstanceVariableMap(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "InstanceVariableMap" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap addNewInstanceVariableMap();

    /**
     * Removes the ith "InstanceVariableMap" element
     */
    void removeInstanceVariableMap(int i);

    /**
     * Gets a List of "Key" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key> getKeyList();

    /**
     * Gets array of all "Key" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key[] getKeyArray();

    /**
     * Gets ith "Key" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key getKeyArray(int i);

    /**
     * Returns number of "Key" element
     */
    int sizeOfKeyArray();

    /**
     * Sets array of all "Key" element
     */
    void setKeyArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key[] keyArray);

    /**
     * Sets ith "Key" element
     */
    void setKeyArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key key);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Key" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key insertNewKey(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Key" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Key addNewKey();

    /**
     * Removes the ith "Key" element
     */
    void removeKey(int i);

    /**
     * Gets a List of "KeyDefinition" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition> getKeyDefinitionList();

    /**
     * Gets array of all "KeyDefinition" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition[] getKeyDefinitionArray();

    /**
     * Gets ith "KeyDefinition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition getKeyDefinitionArray(int i);

    /**
     * Returns number of "KeyDefinition" element
     */
    int sizeOfKeyDefinitionArray();

    /**
     * Sets array of all "KeyDefinition" element
     */
    void setKeyDefinitionArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition[] keyDefinitionArray);

    /**
     * Sets ith "KeyDefinition" element
     */
    void setKeyDefinitionArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition keyDefinition);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "KeyDefinition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition insertNewKeyDefinition(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "KeyDefinition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinition addNewKeyDefinition();

    /**
     * Removes the ith "KeyDefinition" element
     */
    void removeKeyDefinition(int i);

    /**
     * Gets a List of "KeyDefinitionMember" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinitionMember> getKeyDefinitionMemberList();

    /**
     * Gets array of all "KeyDefinitionMember" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinitionMember[] getKeyDefinitionMemberArray();

    /**
     * Gets ith "KeyDefinitionMember" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinitionMember getKeyDefinitionMemberArray(int i);

    /**
     * Returns number of "KeyDefinitionMember" element
     */
    int sizeOfKeyDefinitionMemberArray();

    /**
     * Sets array of all "KeyDefinitionMember" element
     */
    void setKeyDefinitionMemberArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinitionMember[] keyDefinitionMemberArray);

    /**
     * Sets ith "KeyDefinitionMember" element
     */
    void setKeyDefinitionMemberArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinitionMember keyDefinitionMember);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "KeyDefinitionMember" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinitionMember insertNewKeyDefinitionMember(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "KeyDefinitionMember" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyDefinitionMember addNewKeyDefinitionMember();

    /**
     * Removes the ith "KeyDefinitionMember" element
     */
    void removeKeyDefinitionMember(int i);

    /**
     * Gets a List of "KeyMember" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyMember> getKeyMemberList();

    /**
     * Gets array of all "KeyMember" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyMember[] getKeyMemberArray();

    /**
     * Gets ith "KeyMember" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyMember getKeyMemberArray(int i);

    /**
     * Returns number of "KeyMember" element
     */
    int sizeOfKeyMemberArray();

    /**
     * Sets array of all "KeyMember" element
     */
    void setKeyMemberArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyMember[] keyMemberArray);

    /**
     * Sets ith "KeyMember" element
     */
    void setKeyMemberArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyMember keyMember);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "KeyMember" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyMember insertNewKeyMember(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "KeyMember" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyMember addNewKeyMember();

    /**
     * Removes the ith "KeyMember" element
     */
    void removeKeyMember(int i);

    /**
     * Gets a List of "KeyValueDataStore" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyValueDataStore> getKeyValueDataStoreList();

    /**
     * Gets array of all "KeyValueDataStore" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyValueDataStore[] getKeyValueDataStoreArray();

    /**
     * Gets ith "KeyValueDataStore" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyValueDataStore getKeyValueDataStoreArray(int i);

    /**
     * Returns number of "KeyValueDataStore" element
     */
    int sizeOfKeyValueDataStoreArray();

    /**
     * Sets array of all "KeyValueDataStore" element
     */
    void setKeyValueDataStoreArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyValueDataStore[] keyValueDataStoreArray);

    /**
     * Sets ith "KeyValueDataStore" element
     */
    void setKeyValueDataStoreArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyValueDataStore keyValueDataStore);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "KeyValueDataStore" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyValueDataStore insertNewKeyValueDataStore(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "KeyValueDataStore" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyValueDataStore addNewKeyValueDataStore();

    /**
     * Removes the ith "KeyValueDataStore" element
     */
    void removeKeyValueDataStore(int i);

    /**
     * Gets a List of "KeyValueStructure" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyValueStructure> getKeyValueStructureList();

    /**
     * Gets array of all "KeyValueStructure" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyValueStructure[] getKeyValueStructureArray();

    /**
     * Gets ith "KeyValueStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyValueStructure getKeyValueStructureArray(int i);

    /**
     * Returns number of "KeyValueStructure" element
     */
    int sizeOfKeyValueStructureArray();

    /**
     * Sets array of all "KeyValueStructure" element
     */
    void setKeyValueStructureArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyValueStructure[] keyValueStructureArray);

    /**
     * Sets ith "KeyValueStructure" element
     */
    void setKeyValueStructureArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyValueStructure keyValueStructure);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "KeyValueStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyValueStructure insertNewKeyValueStructure(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "KeyValueStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.KeyValueStructure addNewKeyValueStructure();

    /**
     * Removes the ith "KeyValueStructure" element
     */
    void removeKeyValueStructure(int i);

    /**
     * Gets a List of "Level" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Level> getLevelList();

    /**
     * Gets array of all "Level" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Level[] getLevelArray();

    /**
     * Gets ith "Level" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Level getLevelArray(int i);

    /**
     * Returns number of "Level" element
     */
    int sizeOfLevelArray();

    /**
     * Sets array of all "Level" element
     */
    void setLevelArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Level[] levelArray);

    /**
     * Sets ith "Level" element
     */
    void setLevelArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Level level);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Level" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Level insertNewLevel(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Level" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Level addNewLevel();

    /**
     * Removes the ith "Level" element
     */
    void removeLevel(int i);

    /**
     * Gets a List of "LevelStructure" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.LevelStructure> getLevelStructureList();

    /**
     * Gets array of all "LevelStructure" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LevelStructure[] getLevelStructureArray();

    /**
     * Gets ith "LevelStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LevelStructure getLevelStructureArray(int i);

    /**
     * Returns number of "LevelStructure" element
     */
    int sizeOfLevelStructureArray();

    /**
     * Sets array of all "LevelStructure" element
     */
    void setLevelStructureArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.LevelStructure[] levelStructureArray);

    /**
     * Sets ith "LevelStructure" element
     */
    void setLevelStructureArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.LevelStructure levelStructure);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "LevelStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LevelStructure insertNewLevelStructure(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "LevelStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LevelStructure addNewLevelStructure();

    /**
     * Removes the ith "LevelStructure" element
     */
    void removeLevelStructure(int i);

    /**
     * Gets a List of "LogicalRecord" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord> getLogicalRecordList();

    /**
     * Gets array of all "LogicalRecord" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord[] getLogicalRecordArray();

    /**
     * Gets ith "LogicalRecord" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord getLogicalRecordArray(int i);

    /**
     * Returns number of "LogicalRecord" element
     */
    int sizeOfLogicalRecordArray();

    /**
     * Sets array of all "LogicalRecord" element
     */
    void setLogicalRecordArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord[] logicalRecordArray);

    /**
     * Sets ith "LogicalRecord" element
     */
    void setLogicalRecordArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord logicalRecord);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "LogicalRecord" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord insertNewLogicalRecord(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "LogicalRecord" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord addNewLogicalRecord();

    /**
     * Removes the ith "LogicalRecord" element
     */
    void removeLogicalRecord(int i);

    /**
     * Gets a List of "LogicalRecordPosition" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordPosition> getLogicalRecordPositionList();

    /**
     * Gets array of all "LogicalRecordPosition" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordPosition[] getLogicalRecordPositionArray();

    /**
     * Gets ith "LogicalRecordPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordPosition getLogicalRecordPositionArray(int i);

    /**
     * Returns number of "LogicalRecordPosition" element
     */
    int sizeOfLogicalRecordPositionArray();

    /**
     * Sets array of all "LogicalRecordPosition" element
     */
    void setLogicalRecordPositionArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordPosition[] logicalRecordPositionArray);

    /**
     * Sets ith "LogicalRecordPosition" element
     */
    void setLogicalRecordPositionArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordPosition logicalRecordPosition);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "LogicalRecordPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordPosition insertNewLogicalRecordPosition(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "LogicalRecordPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordPosition addNewLogicalRecordPosition();

    /**
     * Removes the ith "LogicalRecordPosition" element
     */
    void removeLogicalRecordPosition(int i);

    /**
     * Gets a List of "LogicalRecordRelationStructure" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationStructure> getLogicalRecordRelationStructureList();

    /**
     * Gets array of all "LogicalRecordRelationStructure" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationStructure[] getLogicalRecordRelationStructureArray();

    /**
     * Gets ith "LogicalRecordRelationStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationStructure getLogicalRecordRelationStructureArray(int i);

    /**
     * Returns number of "LogicalRecordRelationStructure" element
     */
    int sizeOfLogicalRecordRelationStructureArray();

    /**
     * Sets array of all "LogicalRecordRelationStructure" element
     */
    void setLogicalRecordRelationStructureArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationStructure[] logicalRecordRelationStructureArray);

    /**
     * Sets ith "LogicalRecordRelationStructure" element
     */
    void setLogicalRecordRelationStructureArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationStructure logicalRecordRelationStructure);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "LogicalRecordRelationStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationStructure insertNewLogicalRecordRelationStructure(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "LogicalRecordRelationStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationStructure addNewLogicalRecordRelationStructure();

    /**
     * Removes the ith "LogicalRecordRelationStructure" element
     */
    void removeLogicalRecordRelationStructure(int i);

    /**
     * Gets a List of "LogicalRecordRelationship" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship> getLogicalRecordRelationshipList();

    /**
     * Gets array of all "LogicalRecordRelationship" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship[] getLogicalRecordRelationshipArray();

    /**
     * Gets ith "LogicalRecordRelationship" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship getLogicalRecordRelationshipArray(int i);

    /**
     * Returns number of "LogicalRecordRelationship" element
     */
    int sizeOfLogicalRecordRelationshipArray();

    /**
     * Sets array of all "LogicalRecordRelationship" element
     */
    void setLogicalRecordRelationshipArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship[] logicalRecordRelationshipArray);

    /**
     * Sets ith "LogicalRecordRelationship" element
     */
    void setLogicalRecordRelationshipArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship logicalRecordRelationship);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "LogicalRecordRelationship" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship insertNewLogicalRecordRelationship(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "LogicalRecordRelationship" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship addNewLogicalRecordRelationship();

    /**
     * Removes the ith "LogicalRecordRelationship" element
     */
    void removeLogicalRecordRelationship(int i);

    /**
     * Gets a List of "LongDataSet" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongDataSet> getLongDataSetList();

    /**
     * Gets array of all "LongDataSet" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongDataSet[] getLongDataSetArray();

    /**
     * Gets ith "LongDataSet" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongDataSet getLongDataSetArray(int i);

    /**
     * Returns number of "LongDataSet" element
     */
    int sizeOfLongDataSetArray();

    /**
     * Sets array of all "LongDataSet" element
     */
    void setLongDataSetArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongDataSet[] longDataSetArray);

    /**
     * Sets ith "LongDataSet" element
     */
    void setLongDataSetArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongDataSet longDataSet);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "LongDataSet" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongDataSet insertNewLongDataSet(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "LongDataSet" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongDataSet addNewLongDataSet();

    /**
     * Removes the ith "LongDataSet" element
     */
    void removeLongDataSet(int i);

    /**
     * Gets a List of "LongDataStructure" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongDataStructure> getLongDataStructureList();

    /**
     * Gets array of all "LongDataStructure" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongDataStructure[] getLongDataStructureArray();

    /**
     * Gets ith "LongDataStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongDataStructure getLongDataStructureArray(int i);

    /**
     * Returns number of "LongDataStructure" element
     */
    int sizeOfLongDataStructureArray();

    /**
     * Sets array of all "LongDataStructure" element
     */
    void setLongDataStructureArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongDataStructure[] longDataStructureArray);

    /**
     * Sets ith "LongDataStructure" element
     */
    void setLongDataStructureArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongDataStructure longDataStructure);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "LongDataStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongDataStructure insertNewLongDataStructure(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "LongDataStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongDataStructure addNewLongDataStructure();

    /**
     * Removes the ith "LongDataStructure" element
     */
    void removeLongDataStructure(int i);

    /**
     * Gets a List of "LongKey" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongKey> getLongKeyList();

    /**
     * Gets array of all "LongKey" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongKey[] getLongKeyArray();

    /**
     * Gets ith "LongKey" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongKey getLongKeyArray(int i);

    /**
     * Returns number of "LongKey" element
     */
    int sizeOfLongKeyArray();

    /**
     * Sets array of all "LongKey" element
     */
    void setLongKeyArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongKey[] longKeyArray);

    /**
     * Sets ith "LongKey" element
     */
    void setLongKeyArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongKey longKey);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "LongKey" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongKey insertNewLongKey(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "LongKey" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongKey addNewLongKey();

    /**
     * Removes the ith "LongKey" element
     */
    void removeLongKey(int i);

    /**
     * Gets a List of "LongMainKeyMember" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongMainKeyMember> getLongMainKeyMemberList();

    /**
     * Gets array of all "LongMainKeyMember" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongMainKeyMember[] getLongMainKeyMemberArray();

    /**
     * Gets ith "LongMainKeyMember" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongMainKeyMember getLongMainKeyMemberArray(int i);

    /**
     * Returns number of "LongMainKeyMember" element
     */
    int sizeOfLongMainKeyMemberArray();

    /**
     * Sets array of all "LongMainKeyMember" element
     */
    void setLongMainKeyMemberArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongMainKeyMember[] longMainKeyMemberArray);

    /**
     * Sets ith "LongMainKeyMember" element
     */
    void setLongMainKeyMemberArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongMainKeyMember longMainKeyMember);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "LongMainKeyMember" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongMainKeyMember insertNewLongMainKeyMember(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "LongMainKeyMember" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongMainKeyMember addNewLongMainKeyMember();

    /**
     * Removes the ith "LongMainKeyMember" element
     */
    void removeLongMainKeyMember(int i);

    /**
     * Gets a List of "Machine" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Machine> getMachineList();

    /**
     * Gets array of all "Machine" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Machine[] getMachineArray();

    /**
     * Gets ith "Machine" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Machine getMachineArray(int i);

    /**
     * Returns number of "Machine" element
     */
    int sizeOfMachineArray();

    /**
     * Sets array of all "Machine" element
     */
    void setMachineArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Machine[] machineArray);

    /**
     * Sets ith "Machine" element
     */
    void setMachineArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Machine machine);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Machine" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Machine insertNewMachine(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Machine" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Machine addNewMachine();

    /**
     * Removes the ith "Machine" element
     */
    void removeMachine(int i);

    /**
     * Gets a List of "MainKeyMember" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.MainKeyMember> getMainKeyMemberList();

    /**
     * Gets array of all "MainKeyMember" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.MainKeyMember[] getMainKeyMemberArray();

    /**
     * Gets ith "MainKeyMember" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.MainKeyMember getMainKeyMemberArray(int i);

    /**
     * Returns number of "MainKeyMember" element
     */
    int sizeOfMainKeyMemberArray();

    /**
     * Sets array of all "MainKeyMember" element
     */
    void setMainKeyMemberArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.MainKeyMember[] mainKeyMemberArray);

    /**
     * Sets ith "MainKeyMember" element
     */
    void setMainKeyMemberArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.MainKeyMember mainKeyMember);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "MainKeyMember" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.MainKeyMember insertNewMainKeyMember(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "MainKeyMember" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.MainKeyMember addNewMainKeyMember();

    /**
     * Removes the ith "MainKeyMember" element
     */
    void removeMainKeyMember(int i);

    /**
     * Gets a List of "MeasureComponent" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.MeasureComponent> getMeasureComponentList();

    /**
     * Gets array of all "MeasureComponent" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.MeasureComponent[] getMeasureComponentArray();

    /**
     * Gets ith "MeasureComponent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.MeasureComponent getMeasureComponentArray(int i);

    /**
     * Returns number of "MeasureComponent" element
     */
    int sizeOfMeasureComponentArray();

    /**
     * Sets array of all "MeasureComponent" element
     */
    void setMeasureComponentArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.MeasureComponent[] measureComponentArray);

    /**
     * Sets ith "MeasureComponent" element
     */
    void setMeasureComponentArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.MeasureComponent measureComponent);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "MeasureComponent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.MeasureComponent insertNewMeasureComponent(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "MeasureComponent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.MeasureComponent addNewMeasureComponent();

    /**
     * Removes the ith "MeasureComponent" element
     */
    void removeMeasureComponent(int i);

    /**
     * Gets a List of "NonDeterministicDeclarative" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDeterministicDeclarative> getNonDeterministicDeclarativeList();

    /**
     * Gets array of all "NonDeterministicDeclarative" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDeterministicDeclarative[] getNonDeterministicDeclarativeArray();

    /**
     * Gets ith "NonDeterministicDeclarative" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDeterministicDeclarative getNonDeterministicDeclarativeArray(int i);

    /**
     * Returns number of "NonDeterministicDeclarative" element
     */
    int sizeOfNonDeterministicDeclarativeArray();

    /**
     * Sets array of all "NonDeterministicDeclarative" element
     */
    void setNonDeterministicDeclarativeArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDeterministicDeclarative[] nonDeterministicDeclarativeArray);

    /**
     * Sets ith "NonDeterministicDeclarative" element
     */
    void setNonDeterministicDeclarativeArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDeterministicDeclarative nonDeterministicDeclarative);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "NonDeterministicDeclarative" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDeterministicDeclarative insertNewNonDeterministicDeclarative(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "NonDeterministicDeclarative" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDeterministicDeclarative addNewNonDeterministicDeclarative();

    /**
     * Removes the ith "NonDeterministicDeclarative" element
     */
    void removeNonDeterministicDeclarative(int i);

    /**
     * Gets a List of "Notation" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Notation> getNotationList();

    /**
     * Gets array of all "Notation" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Notation[] getNotationArray();

    /**
     * Gets ith "Notation" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Notation getNotationArray(int i);

    /**
     * Returns number of "Notation" element
     */
    int sizeOfNotationArray();

    /**
     * Sets array of all "Notation" element
     */
    void setNotationArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Notation[] notationArray);

    /**
     * Sets ith "Notation" element
     */
    void setNotationArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Notation notation);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Notation" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Notation insertNewNotation(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Notation" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Notation addNewNotation();

    /**
     * Removes the ith "Notation" element
     */
    void removeNotation(int i);

    /**
     * Gets a List of "Organization" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Organization> getOrganizationList();

    /**
     * Gets array of all "Organization" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Organization[] getOrganizationArray();

    /**
     * Gets ith "Organization" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Organization getOrganizationArray(int i);

    /**
     * Returns number of "Organization" element
     */
    int sizeOfOrganizationArray();

    /**
     * Sets array of all "Organization" element
     */
    void setOrganizationArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Organization[] organizationArray);

    /**
     * Sets ith "Organization" element
     */
    void setOrganizationArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Organization organization);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Organization" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Organization insertNewOrganization(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Organization" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Organization addNewOrganization();

    /**
     * Removes the ith "Organization" element
     */
    void removeOrganization(int i);

    /**
     * Gets a List of "Parameter" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Parameter> getParameterList();

    /**
     * Gets array of all "Parameter" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Parameter[] getParameterArray();

    /**
     * Gets ith "Parameter" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Parameter getParameterArray(int i);

    /**
     * Returns number of "Parameter" element
     */
    int sizeOfParameterArray();

    /**
     * Sets array of all "Parameter" element
     */
    void setParameterArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Parameter[] parameterArray);

    /**
     * Sets ith "Parameter" element
     */
    void setParameterArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Parameter parameter);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Parameter" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Parameter insertNewParameter(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Parameter" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Parameter addNewParameter();

    /**
     * Removes the ith "Parameter" element
     */
    void removeParameter(int i);

    /**
     * Gets a List of "PhysicalDataSet" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet> getPhysicalDataSetList();

    /**
     * Gets array of all "PhysicalDataSet" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet[] getPhysicalDataSetArray();

    /**
     * Gets ith "PhysicalDataSet" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet getPhysicalDataSetArray(int i);

    /**
     * Returns number of "PhysicalDataSet" element
     */
    int sizeOfPhysicalDataSetArray();

    /**
     * Sets array of all "PhysicalDataSet" element
     */
    void setPhysicalDataSetArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet[] physicalDataSetArray);

    /**
     * Sets ith "PhysicalDataSet" element
     */
    void setPhysicalDataSetArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet physicalDataSet);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "PhysicalDataSet" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet insertNewPhysicalDataSet(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "PhysicalDataSet" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet addNewPhysicalDataSet();

    /**
     * Removes the ith "PhysicalDataSet" element
     */
    void removePhysicalDataSet(int i);

    /**
     * Gets a List of "PhysicalDataSetStructure" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSetStructure> getPhysicalDataSetStructureList();

    /**
     * Gets array of all "PhysicalDataSetStructure" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSetStructure[] getPhysicalDataSetStructureArray();

    /**
     * Gets ith "PhysicalDataSetStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSetStructure getPhysicalDataSetStructureArray(int i);

    /**
     * Returns number of "PhysicalDataSetStructure" element
     */
    int sizeOfPhysicalDataSetStructureArray();

    /**
     * Sets array of all "PhysicalDataSetStructure" element
     */
    void setPhysicalDataSetStructureArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSetStructure[] physicalDataSetStructureArray);

    /**
     * Sets ith "PhysicalDataSetStructure" element
     */
    void setPhysicalDataSetStructureArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSetStructure physicalDataSetStructure);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "PhysicalDataSetStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSetStructure insertNewPhysicalDataSetStructure(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "PhysicalDataSetStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSetStructure addNewPhysicalDataSetStructure();

    /**
     * Removes the ith "PhysicalDataSetStructure" element
     */
    void removePhysicalDataSetStructure(int i);

    /**
     * Gets a List of "PhysicalLayoutRelationStructure" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalLayoutRelationStructure> getPhysicalLayoutRelationStructureList();

    /**
     * Gets array of all "PhysicalLayoutRelationStructure" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalLayoutRelationStructure[] getPhysicalLayoutRelationStructureArray();

    /**
     * Gets ith "PhysicalLayoutRelationStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalLayoutRelationStructure getPhysicalLayoutRelationStructureArray(int i);

    /**
     * Returns number of "PhysicalLayoutRelationStructure" element
     */
    int sizeOfPhysicalLayoutRelationStructureArray();

    /**
     * Sets array of all "PhysicalLayoutRelationStructure" element
     */
    void setPhysicalLayoutRelationStructureArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalLayoutRelationStructure[] physicalLayoutRelationStructureArray);

    /**
     * Sets ith "PhysicalLayoutRelationStructure" element
     */
    void setPhysicalLayoutRelationStructureArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalLayoutRelationStructure physicalLayoutRelationStructure);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "PhysicalLayoutRelationStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalLayoutRelationStructure insertNewPhysicalLayoutRelationStructure(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "PhysicalLayoutRelationStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalLayoutRelationStructure addNewPhysicalLayoutRelationStructure();

    /**
     * Removes the ith "PhysicalLayoutRelationStructure" element
     */
    void removePhysicalLayoutRelationStructure(int i);

    /**
     * Gets a List of "PhysicalRecordSegment" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment> getPhysicalRecordSegmentList();

    /**
     * Gets array of all "PhysicalRecordSegment" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment[] getPhysicalRecordSegmentArray();

    /**
     * Gets ith "PhysicalRecordSegment" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment getPhysicalRecordSegmentArray(int i);

    /**
     * Returns number of "PhysicalRecordSegment" element
     */
    int sizeOfPhysicalRecordSegmentArray();

    /**
     * Sets array of all "PhysicalRecordSegment" element
     */
    void setPhysicalRecordSegmentArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment[] physicalRecordSegmentArray);

    /**
     * Sets ith "PhysicalRecordSegment" element
     */
    void setPhysicalRecordSegmentArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment physicalRecordSegment);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "PhysicalRecordSegment" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment insertNewPhysicalRecordSegment(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "PhysicalRecordSegment" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegment addNewPhysicalRecordSegment();

    /**
     * Removes the ith "PhysicalRecordSegment" element
     */
    void removePhysicalRecordSegment(int i);

    /**
     * Gets a List of "PhysicalRecordSegmentPosition" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentPosition> getPhysicalRecordSegmentPositionList();

    /**
     * Gets array of all "PhysicalRecordSegmentPosition" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentPosition[] getPhysicalRecordSegmentPositionArray();

    /**
     * Gets ith "PhysicalRecordSegmentPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentPosition getPhysicalRecordSegmentPositionArray(int i);

    /**
     * Returns number of "PhysicalRecordSegmentPosition" element
     */
    int sizeOfPhysicalRecordSegmentPositionArray();

    /**
     * Sets array of all "PhysicalRecordSegmentPosition" element
     */
    void setPhysicalRecordSegmentPositionArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentPosition[] physicalRecordSegmentPositionArray);

    /**
     * Sets ith "PhysicalRecordSegmentPosition" element
     */
    void setPhysicalRecordSegmentPositionArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentPosition physicalRecordSegmentPosition);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "PhysicalRecordSegmentPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentPosition insertNewPhysicalRecordSegmentPosition(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "PhysicalRecordSegmentPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentPosition addNewPhysicalRecordSegmentPosition();

    /**
     * Removes the ith "PhysicalRecordSegmentPosition" element
     */
    void removePhysicalRecordSegmentPosition(int i);

    /**
     * Gets a List of "PhysicalRecordSegmentRelationship" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship> getPhysicalRecordSegmentRelationshipList();

    /**
     * Gets array of all "PhysicalRecordSegmentRelationship" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship[] getPhysicalRecordSegmentRelationshipArray();

    /**
     * Gets ith "PhysicalRecordSegmentRelationship" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship getPhysicalRecordSegmentRelationshipArray(int i);

    /**
     * Returns number of "PhysicalRecordSegmentRelationship" element
     */
    int sizeOfPhysicalRecordSegmentRelationshipArray();

    /**
     * Sets array of all "PhysicalRecordSegmentRelationship" element
     */
    void setPhysicalRecordSegmentRelationshipArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship[] physicalRecordSegmentRelationshipArray);

    /**
     * Sets ith "PhysicalRecordSegmentRelationship" element
     */
    void setPhysicalRecordSegmentRelationshipArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship physicalRecordSegmentRelationship);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "PhysicalRecordSegmentRelationship" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship insertNewPhysicalRecordSegmentRelationship(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "PhysicalRecordSegmentRelationship" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship addNewPhysicalRecordSegmentRelationship();

    /**
     * Removes the ith "PhysicalRecordSegmentRelationship" element
     */
    void removePhysicalRecordSegmentRelationship(int i);

    /**
     * Gets a List of "PhysicalRecordSegmentStructure" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentStructure> getPhysicalRecordSegmentStructureList();

    /**
     * Gets array of all "PhysicalRecordSegmentStructure" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentStructure[] getPhysicalRecordSegmentStructureArray();

    /**
     * Gets ith "PhysicalRecordSegmentStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentStructure getPhysicalRecordSegmentStructureArray(int i);

    /**
     * Returns number of "PhysicalRecordSegmentStructure" element
     */
    int sizeOfPhysicalRecordSegmentStructureArray();

    /**
     * Sets array of all "PhysicalRecordSegmentStructure" element
     */
    void setPhysicalRecordSegmentStructureArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentStructure[] physicalRecordSegmentStructureArray);

    /**
     * Sets ith "PhysicalRecordSegmentStructure" element
     */
    void setPhysicalRecordSegmentStructureArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentStructure physicalRecordSegmentStructure);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "PhysicalRecordSegmentStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentStructure insertNewPhysicalRecordSegmentStructure(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "PhysicalRecordSegmentStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentStructure addNewPhysicalRecordSegmentStructure();

    /**
     * Removes the ith "PhysicalRecordSegmentStructure" element
     */
    void removePhysicalRecordSegmentStructure(int i);

    /**
     * Gets a List of "PhysicalSegmentLayout" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout> getPhysicalSegmentLayoutList();

    /**
     * Gets array of all "PhysicalSegmentLayout" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout[] getPhysicalSegmentLayoutArray();

    /**
     * Gets ith "PhysicalSegmentLayout" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout getPhysicalSegmentLayoutArray(int i);

    /**
     * Returns number of "PhysicalSegmentLayout" element
     */
    int sizeOfPhysicalSegmentLayoutArray();

    /**
     * Sets array of all "PhysicalSegmentLayout" element
     */
    void setPhysicalSegmentLayoutArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout[] physicalSegmentLayoutArray);

    /**
     * Sets ith "PhysicalSegmentLayout" element
     */
    void setPhysicalSegmentLayoutArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout physicalSegmentLayout);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "PhysicalSegmentLayout" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout insertNewPhysicalSegmentLayout(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "PhysicalSegmentLayout" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout addNewPhysicalSegmentLayout();

    /**
     * Removes the ith "PhysicalSegmentLayout" element
     */
    void removePhysicalSegmentLayout(int i);

    /**
     * Gets a List of "PhysicalSegmentLocation" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLocation> getPhysicalSegmentLocationList();

    /**
     * Gets array of all "PhysicalSegmentLocation" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLocation[] getPhysicalSegmentLocationArray();

    /**
     * Gets ith "PhysicalSegmentLocation" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLocation getPhysicalSegmentLocationArray(int i);

    /**
     * Returns number of "PhysicalSegmentLocation" element
     */
    int sizeOfPhysicalSegmentLocationArray();

    /**
     * Sets array of all "PhysicalSegmentLocation" element
     */
    void setPhysicalSegmentLocationArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLocation[] physicalSegmentLocationArray);

    /**
     * Sets ith "PhysicalSegmentLocation" element
     */
    void setPhysicalSegmentLocationArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLocation physicalSegmentLocation);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "PhysicalSegmentLocation" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLocation insertNewPhysicalSegmentLocation(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "PhysicalSegmentLocation" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLocation addNewPhysicalSegmentLocation();

    /**
     * Removes the ith "PhysicalSegmentLocation" element
     */
    void removePhysicalSegmentLocation(int i);

    /**
     * Gets a List of "Population" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Population> getPopulationList();

    /**
     * Gets array of all "Population" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Population[] getPopulationArray();

    /**
     * Gets ith "Population" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Population getPopulationArray(int i);

    /**
     * Returns number of "Population" element
     */
    int sizeOfPopulationArray();

    /**
     * Sets array of all "Population" element
     */
    void setPopulationArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Population[] populationArray);

    /**
     * Sets ith "Population" element
     */
    void setPopulationArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Population population);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Population" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Population insertNewPopulation(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Population" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Population addNewPopulation();

    /**
     * Removes the ith "Population" element
     */
    void removePopulation(int i);

    /**
     * Gets a List of "PrimaryKey" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKey> getPrimaryKeyList();

    /**
     * Gets array of all "PrimaryKey" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKey[] getPrimaryKeyArray();

    /**
     * Gets ith "PrimaryKey" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKey getPrimaryKeyArray(int i);

    /**
     * Returns number of "PrimaryKey" element
     */
    int sizeOfPrimaryKeyArray();

    /**
     * Sets array of all "PrimaryKey" element
     */
    void setPrimaryKeyArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKey[] primaryKeyArray);

    /**
     * Sets ith "PrimaryKey" element
     */
    void setPrimaryKeyArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKey primaryKey);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "PrimaryKey" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKey insertNewPrimaryKey(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "PrimaryKey" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKey addNewPrimaryKey();

    /**
     * Removes the ith "PrimaryKey" element
     */
    void removePrimaryKey(int i);

    /**
     * Gets a List of "PrimaryKeyComponent" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKeyComponent> getPrimaryKeyComponentList();

    /**
     * Gets array of all "PrimaryKeyComponent" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKeyComponent[] getPrimaryKeyComponentArray();

    /**
     * Gets ith "PrimaryKeyComponent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKeyComponent getPrimaryKeyComponentArray(int i);

    /**
     * Returns number of "PrimaryKeyComponent" element
     */
    int sizeOfPrimaryKeyComponentArray();

    /**
     * Sets array of all "PrimaryKeyComponent" element
     */
    void setPrimaryKeyComponentArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKeyComponent[] primaryKeyComponentArray);

    /**
     * Sets ith "PrimaryKeyComponent" element
     */
    void setPrimaryKeyComponentArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKeyComponent primaryKeyComponent);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "PrimaryKeyComponent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKeyComponent insertNewPrimaryKeyComponent(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "PrimaryKeyComponent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKeyComponent addNewPrimaryKeyComponent();

    /**
     * Removes the ith "PrimaryKeyComponent" element
     */
    void removePrimaryKeyComponent(int i);

    /**
     * Gets a List of "ProcessingAgent" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent> getProcessingAgentList();

    /**
     * Gets array of all "ProcessingAgent" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent[] getProcessingAgentArray();

    /**
     * Gets ith "ProcessingAgent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent getProcessingAgentArray(int i);

    /**
     * Returns number of "ProcessingAgent" element
     */
    int sizeOfProcessingAgentArray();

    /**
     * Sets array of all "ProcessingAgent" element
     */
    void setProcessingAgentArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent[] processingAgentArray);

    /**
     * Sets ith "ProcessingAgent" element
     */
    void setProcessingAgentArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent processingAgent);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ProcessingAgent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent insertNewProcessingAgent(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ProcessingAgent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent addNewProcessingAgent();

    /**
     * Removes the ith "ProcessingAgent" element
     */
    void removeProcessingAgent(int i);

    /**
     * Gets a List of "ProductionEnvironment" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProductionEnvironment> getProductionEnvironmentList();

    /**
     * Gets array of all "ProductionEnvironment" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProductionEnvironment[] getProductionEnvironmentArray();

    /**
     * Gets ith "ProductionEnvironment" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProductionEnvironment getProductionEnvironmentArray(int i);

    /**
     * Returns number of "ProductionEnvironment" element
     */
    int sizeOfProductionEnvironmentArray();

    /**
     * Sets array of all "ProductionEnvironment" element
     */
    void setProductionEnvironmentArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProductionEnvironment[] productionEnvironmentArray);

    /**
     * Sets ith "ProductionEnvironment" element
     */
    void setProductionEnvironmentArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProductionEnvironment productionEnvironment);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ProductionEnvironment" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProductionEnvironment insertNewProductionEnvironment(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ProductionEnvironment" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProductionEnvironment addNewProductionEnvironment();

    /**
     * Removes the ith "ProductionEnvironment" element
     */
    void removeProductionEnvironment(int i);

    /**
     * Gets a List of "QualifiedMeasure" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.QualifiedMeasure> getQualifiedMeasureList();

    /**
     * Gets array of all "QualifiedMeasure" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.QualifiedMeasure[] getQualifiedMeasureArray();

    /**
     * Gets ith "QualifiedMeasure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.QualifiedMeasure getQualifiedMeasureArray(int i);

    /**
     * Returns number of "QualifiedMeasure" element
     */
    int sizeOfQualifiedMeasureArray();

    /**
     * Sets array of all "QualifiedMeasure" element
     */
    void setQualifiedMeasureArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.QualifiedMeasure[] qualifiedMeasureArray);

    /**
     * Sets ith "QualifiedMeasure" element
     */
    void setQualifiedMeasureArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.QualifiedMeasure qualifiedMeasure);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "QualifiedMeasure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.QualifiedMeasure insertNewQualifiedMeasure(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "QualifiedMeasure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.QualifiedMeasure addNewQualifiedMeasure();

    /**
     * Removes the ith "QualifiedMeasure" element
     */
    void removeQualifiedMeasure(int i);

    /**
     * Gets a List of "RecordRelation" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.RecordRelation> getRecordRelationList();

    /**
     * Gets array of all "RecordRelation" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.RecordRelation[] getRecordRelationArray();

    /**
     * Gets ith "RecordRelation" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.RecordRelation getRecordRelationArray(int i);

    /**
     * Returns number of "RecordRelation" element
     */
    int sizeOfRecordRelationArray();

    /**
     * Sets array of all "RecordRelation" element
     */
    void setRecordRelationArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.RecordRelation[] recordRelationArray);

    /**
     * Sets ith "RecordRelation" element
     */
    void setRecordRelationArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.RecordRelation recordRelation);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "RecordRelation" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.RecordRelation insertNewRecordRelation(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "RecordRelation" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.RecordRelation addNewRecordRelation();

    /**
     * Removes the ith "RecordRelation" element
     */
    void removeRecordRelation(int i);

    /**
     * Gets a List of "ReferenceValue" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValue> getReferenceValueList();

    /**
     * Gets array of all "ReferenceValue" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValue[] getReferenceValueArray();

    /**
     * Gets ith "ReferenceValue" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValue getReferenceValueArray(int i);

    /**
     * Returns number of "ReferenceValue" element
     */
    int sizeOfReferenceValueArray();

    /**
     * Sets array of all "ReferenceValue" element
     */
    void setReferenceValueArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValue[] referenceValueArray);

    /**
     * Sets ith "ReferenceValue" element
     */
    void setReferenceValueArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValue referenceValue);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ReferenceValue" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValue insertNewReferenceValue(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ReferenceValue" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValue addNewReferenceValue();

    /**
     * Removes the ith "ReferenceValue" element
     */
    void removeReferenceValue(int i);

    /**
     * Gets a List of "ReferenceValueDomain" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValueDomain> getReferenceValueDomainList();

    /**
     * Gets array of all "ReferenceValueDomain" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValueDomain[] getReferenceValueDomainArray();

    /**
     * Gets ith "ReferenceValueDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValueDomain getReferenceValueDomainArray(int i);

    /**
     * Returns number of "ReferenceValueDomain" element
     */
    int sizeOfReferenceValueDomainArray();

    /**
     * Sets array of all "ReferenceValueDomain" element
     */
    void setReferenceValueDomainArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValueDomain[] referenceValueDomainArray);

    /**
     * Sets ith "ReferenceValueDomain" element
     */
    void setReferenceValueDomainArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValueDomain referenceValueDomain);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ReferenceValueDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValueDomain insertNewReferenceValueDomain(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ReferenceValueDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceValueDomain addNewReferenceValueDomain();

    /**
     * Removes the ith "ReferenceValueDomain" element
     */
    void removeReferenceValueDomain(int i);

    /**
     * Gets a List of "ReferenceVariable" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceVariable> getReferenceVariableList();

    /**
     * Gets array of all "ReferenceVariable" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceVariable[] getReferenceVariableArray();

    /**
     * Gets ith "ReferenceVariable" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceVariable getReferenceVariableArray(int i);

    /**
     * Returns number of "ReferenceVariable" element
     */
    int sizeOfReferenceVariableArray();

    /**
     * Sets array of all "ReferenceVariable" element
     */
    void setReferenceVariableArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceVariable[] referenceVariableArray);

    /**
     * Sets ith "ReferenceVariable" element
     */
    void setReferenceVariableArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceVariable referenceVariable);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ReferenceVariable" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceVariable insertNewReferenceVariable(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ReferenceVariable" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceVariable addNewReferenceVariable();

    /**
     * Removes the ith "ReferenceVariable" element
     */
    void removeReferenceVariable(int i);

    /**
     * Gets a List of "RepresentedVariable" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable> getRepresentedVariableList();

    /**
     * Gets array of all "RepresentedVariable" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable[] getRepresentedVariableArray();

    /**
     * Gets ith "RepresentedVariable" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable getRepresentedVariableArray(int i);

    /**
     * Returns number of "RepresentedVariable" element
     */
    int sizeOfRepresentedVariableArray();

    /**
     * Sets array of all "RepresentedVariable" element
     */
    void setRepresentedVariableArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable[] representedVariableArray);

    /**
     * Sets ith "RepresentedVariable" element
     */
    void setRepresentedVariableArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable representedVariable);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "RepresentedVariable" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable insertNewRepresentedVariable(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "RepresentedVariable" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable addNewRepresentedVariable();

    /**
     * Removes the ith "RepresentedVariable" element
     */
    void removeRepresentedVariable(int i);

    /**
     * Gets a List of "RevisableDatum" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.RevisableDatum> getRevisableDatumList();

    /**
     * Gets array of all "RevisableDatum" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.RevisableDatum[] getRevisableDatumArray();

    /**
     * Gets ith "RevisableDatum" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.RevisableDatum getRevisableDatumArray(int i);

    /**
     * Returns number of "RevisableDatum" element
     */
    int sizeOfRevisableDatumArray();

    /**
     * Sets array of all "RevisableDatum" element
     */
    void setRevisableDatumArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.RevisableDatum[] revisableDatumArray);

    /**
     * Sets ith "RevisableDatum" element
     */
    void setRevisableDatumArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.RevisableDatum revisableDatum);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "RevisableDatum" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.RevisableDatum insertNewRevisableDatum(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "RevisableDatum" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.RevisableDatum addNewRevisableDatum();

    /**
     * Removes the ith "RevisableDatum" element
     */
    void removeRevisableDatum(int i);

    /**
     * Gets a List of "Revision" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Revision> getRevisionList();

    /**
     * Gets array of all "Revision" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Revision[] getRevisionArray();

    /**
     * Gets ith "Revision" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Revision getRevisionArray(int i);

    /**
     * Returns number of "Revision" element
     */
    int sizeOfRevisionArray();

    /**
     * Sets array of all "Revision" element
     */
    void setRevisionArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Revision[] revisionArray);

    /**
     * Sets ith "Revision" element
     */
    void setRevisionArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Revision revision);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Revision" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Revision insertNewRevision(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Revision" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Revision addNewRevision();

    /**
     * Removes the ith "Revision" element
     */
    void removeRevision(int i);

    /**
     * Gets a List of "Rule" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Rule> getRuleList();

    /**
     * Gets array of all "Rule" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Rule[] getRuleArray();

    /**
     * Gets ith "Rule" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Rule getRuleArray(int i);

    /**
     * Returns number of "Rule" element
     */
    int sizeOfRuleArray();

    /**
     * Sets array of all "Rule" element
     */
    void setRuleArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Rule[] ruleArray);

    /**
     * Sets ith "Rule" element
     */
    void setRuleArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Rule rule);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Rule" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Rule insertNewRule(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Rule" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Rule addNewRule();

    /**
     * Removes the ith "Rule" element
     */
    void removeRule(int i);

    /**
     * Gets a List of "RuleBasedScheduling" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleBasedScheduling> getRuleBasedSchedulingList();

    /**
     * Gets array of all "RuleBasedScheduling" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleBasedScheduling[] getRuleBasedSchedulingArray();

    /**
     * Gets ith "RuleBasedScheduling" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleBasedScheduling getRuleBasedSchedulingArray(int i);

    /**
     * Returns number of "RuleBasedScheduling" element
     */
    int sizeOfRuleBasedSchedulingArray();

    /**
     * Sets array of all "RuleBasedScheduling" element
     */
    void setRuleBasedSchedulingArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleBasedScheduling[] ruleBasedSchedulingArray);

    /**
     * Sets ith "RuleBasedScheduling" element
     */
    void setRuleBasedSchedulingArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleBasedScheduling ruleBasedScheduling);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "RuleBasedScheduling" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleBasedScheduling insertNewRuleBasedScheduling(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "RuleBasedScheduling" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleBasedScheduling addNewRuleBasedScheduling();

    /**
     * Removes the ith "RuleBasedScheduling" element
     */
    void removeRuleBasedScheduling(int i);

    /**
     * Gets a List of "RuleSet" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleSet> getRuleSetList();

    /**
     * Gets array of all "RuleSet" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleSet[] getRuleSetArray();

    /**
     * Gets ith "RuleSet" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleSet getRuleSetArray(int i);

    /**
     * Returns number of "RuleSet" element
     */
    int sizeOfRuleSetArray();

    /**
     * Sets array of all "RuleSet" element
     */
    void setRuleSetArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleSet[] ruleSetArray);

    /**
     * Sets ith "RuleSet" element
     */
    void setRuleSetArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleSet ruleSet);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "RuleSet" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleSet insertNewRuleSet(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "RuleSet" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleSet addNewRuleSet();

    /**
     * Removes the ith "RuleSet" element
     */
    void removeRuleSet(int i);

    /**
     * Gets a List of "ScopedMeasure" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure> getScopedMeasureList();

    /**
     * Gets array of all "ScopedMeasure" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure[] getScopedMeasureArray();

    /**
     * Gets ith "ScopedMeasure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure getScopedMeasureArray(int i);

    /**
     * Returns number of "ScopedMeasure" element
     */
    int sizeOfScopedMeasureArray();

    /**
     * Sets array of all "ScopedMeasure" element
     */
    void setScopedMeasureArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure[] scopedMeasureArray);

    /**
     * Sets ith "ScopedMeasure" element
     */
    void setScopedMeasureArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure scopedMeasure);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ScopedMeasure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure insertNewScopedMeasure(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ScopedMeasure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ScopedMeasure addNewScopedMeasure();

    /**
     * Removes the ith "ScopedMeasure" element
     */
    void removeScopedMeasure(int i);

    /**
     * Gets a List of "SegmentByText" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.SegmentByText> getSegmentByTextList();

    /**
     * Gets array of all "SegmentByText" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.SegmentByText[] getSegmentByTextArray();

    /**
     * Gets ith "SegmentByText" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.SegmentByText getSegmentByTextArray(int i);

    /**
     * Returns number of "SegmentByText" element
     */
    int sizeOfSegmentByTextArray();

    /**
     * Sets array of all "SegmentByText" element
     */
    void setSegmentByTextArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.SegmentByText[] segmentByTextArray);

    /**
     * Sets ith "SegmentByText" element
     */
    void setSegmentByTextArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.SegmentByText segmentByText);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "SegmentByText" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.SegmentByText insertNewSegmentByText(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "SegmentByText" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.SegmentByText addNewSegmentByText();

    /**
     * Removes the ith "SegmentByText" element
     */
    void removeSegmentByText(int i);

    /**
     * Gets a List of "SentinelConceptualDomain" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelConceptualDomain> getSentinelConceptualDomainList();

    /**
     * Gets array of all "SentinelConceptualDomain" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelConceptualDomain[] getSentinelConceptualDomainArray();

    /**
     * Gets ith "SentinelConceptualDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelConceptualDomain getSentinelConceptualDomainArray(int i);

    /**
     * Returns number of "SentinelConceptualDomain" element
     */
    int sizeOfSentinelConceptualDomainArray();

    /**
     * Sets array of all "SentinelConceptualDomain" element
     */
    void setSentinelConceptualDomainArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelConceptualDomain[] sentinelConceptualDomainArray);

    /**
     * Sets ith "SentinelConceptualDomain" element
     */
    void setSentinelConceptualDomainArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelConceptualDomain sentinelConceptualDomain);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "SentinelConceptualDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelConceptualDomain insertNewSentinelConceptualDomain(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "SentinelConceptualDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelConceptualDomain addNewSentinelConceptualDomain();

    /**
     * Removes the ith "SentinelConceptualDomain" element
     */
    void removeSentinelConceptualDomain(int i);

    /**
     * Gets a List of "SentinelValueDomain" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain> getSentinelValueDomainList();

    /**
     * Gets array of all "SentinelValueDomain" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain[] getSentinelValueDomainArray();

    /**
     * Gets ith "SentinelValueDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain getSentinelValueDomainArray(int i);

    /**
     * Returns number of "SentinelValueDomain" element
     */
    int sizeOfSentinelValueDomainArray();

    /**
     * Sets array of all "SentinelValueDomain" element
     */
    void setSentinelValueDomainArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain[] sentinelValueDomainArray);

    /**
     * Sets ith "SentinelValueDomain" element
     */
    void setSentinelValueDomainArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain sentinelValueDomain);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "SentinelValueDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain insertNewSentinelValueDomain(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "SentinelValueDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain addNewSentinelValueDomain();

    /**
     * Removes the ith "SentinelValueDomain" element
     */
    void removeSentinelValueDomain(int i);

    /**
     * Gets a List of "Sequence" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Sequence> getSequenceList();

    /**
     * Gets array of all "Sequence" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Sequence[] getSequenceArray();

    /**
     * Gets ith "Sequence" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Sequence getSequenceArray(int i);

    /**
     * Returns number of "Sequence" element
     */
    int sizeOfSequenceArray();

    /**
     * Sets array of all "Sequence" element
     */
    void setSequenceArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Sequence[] sequenceArray);

    /**
     * Sets ith "Sequence" element
     */
    void setSequenceArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Sequence sequence);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Sequence" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Sequence insertNewSequence(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Sequence" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Sequence addNewSequence();

    /**
     * Removes the ith "Sequence" element
     */
    void removeSequence(int i);

    /**
     * Gets a List of "SequencePosition" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.SequencePosition> getSequencePositionList();

    /**
     * Gets array of all "SequencePosition" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.SequencePosition[] getSequencePositionArray();

    /**
     * Gets ith "SequencePosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.SequencePosition getSequencePositionArray(int i);

    /**
     * Returns number of "SequencePosition" element
     */
    int sizeOfSequencePositionArray();

    /**
     * Sets array of all "SequencePosition" element
     */
    void setSequencePositionArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.SequencePosition[] sequencePositionArray);

    /**
     * Sets ith "SequencePosition" element
     */
    void setSequencePositionArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.SequencePosition sequencePosition);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "SequencePosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.SequencePosition insertNewSequencePosition(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "SequencePosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.SequencePosition addNewSequencePosition();

    /**
     * Removes the ith "SequencePosition" element
     */
    void removeSequencePosition(int i);

    /**
     * Gets a List of "Service" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Service> getServiceList();

    /**
     * Gets array of all "Service" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Service[] getServiceArray();

    /**
     * Gets ith "Service" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Service getServiceArray(int i);

    /**
     * Returns number of "Service" element
     */
    int sizeOfServiceArray();

    /**
     * Sets array of all "Service" element
     */
    void setServiceArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Service[] serviceArray);

    /**
     * Sets ith "Service" element
     */
    void setServiceArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Service service);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Service" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Service insertNewService(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Service" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Service addNewService();

    /**
     * Removes the ith "Service" element
     */
    void removeService(int i);

    /**
     * Gets a List of "StatisticalClassification" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification> getStatisticalClassificationList();

    /**
     * Gets array of all "StatisticalClassification" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification[] getStatisticalClassificationArray();

    /**
     * Gets ith "StatisticalClassification" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification getStatisticalClassificationArray(int i);

    /**
     * Returns number of "StatisticalClassification" element
     */
    int sizeOfStatisticalClassificationArray();

    /**
     * Sets array of all "StatisticalClassification" element
     */
    void setStatisticalClassificationArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification[] statisticalClassificationArray);

    /**
     * Sets ith "StatisticalClassification" element
     */
    void setStatisticalClassificationArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification statisticalClassification);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "StatisticalClassification" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification insertNewStatisticalClassification(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "StatisticalClassification" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification addNewStatisticalClassification();

    /**
     * Removes the ith "StatisticalClassification" element
     */
    void removeStatisticalClassification(int i);

    /**
     * Gets a List of "StatisticalClassificationRelationship" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship> getStatisticalClassificationRelationshipList();

    /**
     * Gets array of all "StatisticalClassificationRelationship" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship[] getStatisticalClassificationRelationshipArray();

    /**
     * Gets ith "StatisticalClassificationRelationship" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship getStatisticalClassificationRelationshipArray(int i);

    /**
     * Returns number of "StatisticalClassificationRelationship" element
     */
    int sizeOfStatisticalClassificationRelationshipArray();

    /**
     * Sets array of all "StatisticalClassificationRelationship" element
     */
    void setStatisticalClassificationRelationshipArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship[] statisticalClassificationRelationshipArray);

    /**
     * Sets ith "StatisticalClassificationRelationship" element
     */
    void setStatisticalClassificationRelationshipArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship statisticalClassificationRelationship);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "StatisticalClassificationRelationship" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship insertNewStatisticalClassificationRelationship(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "StatisticalClassificationRelationship" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship addNewStatisticalClassificationRelationship();

    /**
     * Removes the ith "StatisticalClassificationRelationship" element
     */
    void removeStatisticalClassificationRelationship(int i);

    /**
     * Gets a List of "Step" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step> getStepList();

    /**
     * Gets array of all "Step" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step[] getStepArray();

    /**
     * Gets ith "Step" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step getStepArray(int i);

    /**
     * Returns number of "Step" element
     */
    int sizeOfStepArray();

    /**
     * Sets array of all "Step" element
     */
    void setStepArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step[] stepArray);

    /**
     * Sets ith "Step" element
     */
    void setStepArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step step);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Step" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step insertNewStep(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Step" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Step addNewStep();

    /**
     * Removes the ith "Step" element
     */
    void removeStep(int i);

    /**
     * Gets a List of "SubstantiveConceptualDomain" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveConceptualDomain> getSubstantiveConceptualDomainList();

    /**
     * Gets array of all "SubstantiveConceptualDomain" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveConceptualDomain[] getSubstantiveConceptualDomainArray();

    /**
     * Gets ith "SubstantiveConceptualDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveConceptualDomain getSubstantiveConceptualDomainArray(int i);

    /**
     * Returns number of "SubstantiveConceptualDomain" element
     */
    int sizeOfSubstantiveConceptualDomainArray();

    /**
     * Sets array of all "SubstantiveConceptualDomain" element
     */
    void setSubstantiveConceptualDomainArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveConceptualDomain[] substantiveConceptualDomainArray);

    /**
     * Sets ith "SubstantiveConceptualDomain" element
     */
    void setSubstantiveConceptualDomainArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveConceptualDomain substantiveConceptualDomain);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "SubstantiveConceptualDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveConceptualDomain insertNewSubstantiveConceptualDomain(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "SubstantiveConceptualDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveConceptualDomain addNewSubstantiveConceptualDomain();

    /**
     * Removes the ith "SubstantiveConceptualDomain" element
     */
    void removeSubstantiveConceptualDomain(int i);

    /**
     * Gets a List of "SubstantiveValueDomain" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveValueDomain> getSubstantiveValueDomainList();

    /**
     * Gets array of all "SubstantiveValueDomain" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveValueDomain[] getSubstantiveValueDomainArray();

    /**
     * Gets ith "SubstantiveValueDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveValueDomain getSubstantiveValueDomainArray(int i);

    /**
     * Returns number of "SubstantiveValueDomain" element
     */
    int sizeOfSubstantiveValueDomainArray();

    /**
     * Sets array of all "SubstantiveValueDomain" element
     */
    void setSubstantiveValueDomainArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveValueDomain[] substantiveValueDomainArray);

    /**
     * Sets ith "SubstantiveValueDomain" element
     */
    void setSubstantiveValueDomainArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveValueDomain substantiveValueDomain);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "SubstantiveValueDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveValueDomain insertNewSubstantiveValueDomain(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "SubstantiveValueDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveValueDomain addNewSubstantiveValueDomain();

    /**
     * Removes the ith "SubstantiveValueDomain" element
     */
    void removeSubstantiveValueDomain(int i);

    /**
     * Gets a List of "SyntheticIdComponent" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.SyntheticIdComponent> getSyntheticIdComponentList();

    /**
     * Gets array of all "SyntheticIdComponent" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.SyntheticIdComponent[] getSyntheticIdComponentArray();

    /**
     * Gets ith "SyntheticIdComponent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.SyntheticIdComponent getSyntheticIdComponentArray(int i);

    /**
     * Returns number of "SyntheticIdComponent" element
     */
    int sizeOfSyntheticIdComponentArray();

    /**
     * Sets array of all "SyntheticIdComponent" element
     */
    void setSyntheticIdComponentArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.SyntheticIdComponent[] syntheticIdComponentArray);

    /**
     * Sets ith "SyntheticIdComponent" element
     */
    void setSyntheticIdComponentArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.SyntheticIdComponent syntheticIdComponent);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "SyntheticIdComponent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.SyntheticIdComponent insertNewSyntheticIdComponent(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "SyntheticIdComponent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.SyntheticIdComponent addNewSyntheticIdComponent();

    /**
     * Removes the ith "SyntheticIdComponent" element
     */
    void removeSyntheticIdComponent(int i);

    /**
     * Gets a List of "TemporalConstraints" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalConstraints> getTemporalConstraintsList();

    /**
     * Gets array of all "TemporalConstraints" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalConstraints[] getTemporalConstraintsArray();

    /**
     * Gets ith "TemporalConstraints" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalConstraints getTemporalConstraintsArray(int i);

    /**
     * Returns number of "TemporalConstraints" element
     */
    int sizeOfTemporalConstraintsArray();

    /**
     * Sets array of all "TemporalConstraints" element
     */
    void setTemporalConstraintsArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalConstraints[] temporalConstraintsArray);

    /**
     * Sets ith "TemporalConstraints" element
     */
    void setTemporalConstraintsArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalConstraints temporalConstraints);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "TemporalConstraints" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalConstraints insertNewTemporalConstraints(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "TemporalConstraints" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalConstraints addNewTemporalConstraints();

    /**
     * Removes the ith "TemporalConstraints" element
     */
    void removeTemporalConstraints(int i);

    /**
     * Gets a List of "TemporalControlConstruct" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalControlConstruct> getTemporalControlConstructList();

    /**
     * Gets array of all "TemporalControlConstruct" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalControlConstruct[] getTemporalControlConstructArray();

    /**
     * Gets ith "TemporalControlConstruct" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalControlConstruct getTemporalControlConstructArray(int i);

    /**
     * Returns number of "TemporalControlConstruct" element
     */
    int sizeOfTemporalControlConstructArray();

    /**
     * Sets array of all "TemporalControlConstruct" element
     */
    void setTemporalControlConstructArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalControlConstruct[] temporalControlConstructArray);

    /**
     * Sets ith "TemporalControlConstruct" element
     */
    void setTemporalControlConstructArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalControlConstruct temporalControlConstruct);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "TemporalControlConstruct" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalControlConstruct insertNewTemporalControlConstruct(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "TemporalControlConstruct" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalControlConstruct addNewTemporalControlConstruct();

    /**
     * Removes the ith "TemporalControlConstruct" element
     */
    void removeTemporalControlConstruct(int i);

    /**
     * Gets a List of "Unit" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Unit> getUnitList();

    /**
     * Gets array of all "Unit" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Unit[] getUnitArray();

    /**
     * Gets ith "Unit" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Unit getUnitArray(int i);

    /**
     * Returns number of "Unit" element
     */
    int sizeOfUnitArray();

    /**
     * Sets array of all "Unit" element
     */
    void setUnitArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Unit[] unitArray);

    /**
     * Sets ith "Unit" element
     */
    void setUnitArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Unit unit);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Unit" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Unit insertNewUnit(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Unit" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Unit addNewUnit();

    /**
     * Removes the ith "Unit" element
     */
    void removeUnit(int i);

    /**
     * Gets a List of "UnitSegmentLayout" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitSegmentLayout> getUnitSegmentLayoutList();

    /**
     * Gets array of all "UnitSegmentLayout" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitSegmentLayout[] getUnitSegmentLayoutArray();

    /**
     * Gets ith "UnitSegmentLayout" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitSegmentLayout getUnitSegmentLayoutArray(int i);

    /**
     * Returns number of "UnitSegmentLayout" element
     */
    int sizeOfUnitSegmentLayoutArray();

    /**
     * Sets array of all "UnitSegmentLayout" element
     */
    void setUnitSegmentLayoutArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitSegmentLayout[] unitSegmentLayoutArray);

    /**
     * Sets ith "UnitSegmentLayout" element
     */
    void setUnitSegmentLayoutArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitSegmentLayout unitSegmentLayout);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "UnitSegmentLayout" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitSegmentLayout insertNewUnitSegmentLayout(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "UnitSegmentLayout" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitSegmentLayout addNewUnitSegmentLayout();

    /**
     * Removes the ith "UnitSegmentLayout" element
     */
    void removeUnitSegmentLayout(int i);

    /**
     * Gets a List of "UnitType" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitType> getUnitTypeList();

    /**
     * Gets array of all "UnitType" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitType[] getUnitTypeArray();

    /**
     * Gets ith "UnitType" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitType getUnitTypeArray(int i);

    /**
     * Returns number of "UnitType" element
     */
    int sizeOfUnitTypeArray();

    /**
     * Sets array of all "UnitType" element
     */
    void setUnitTypeArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitType[] unitTypeArray);

    /**
     * Sets ith "UnitType" element
     */
    void setUnitTypeArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitType unitType);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "UnitType" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitType insertNewUnitType(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "UnitType" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitType addNewUnitType();

    /**
     * Removes the ith "UnitType" element
     */
    void removeUnitType(int i);

    /**
     * Gets a List of "Universe" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Universe> getUniverseList();

    /**
     * Gets array of all "Universe" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Universe[] getUniverseArray();

    /**
     * Gets ith "Universe" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Universe getUniverseArray(int i);

    /**
     * Returns number of "Universe" element
     */
    int sizeOfUniverseArray();

    /**
     * Sets array of all "Universe" element
     */
    void setUniverseArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Universe[] universeArray);

    /**
     * Sets ith "Universe" element
     */
    void setUniverseArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Universe universe);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Universe" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Universe insertNewUniverse(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Universe" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Universe addNewUniverse();

    /**
     * Removes the ith "Universe" element
     */
    void removeUniverse(int i);

    /**
     * Gets a List of "ValueAndConceptDescription" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueAndConceptDescription> getValueAndConceptDescriptionList();

    /**
     * Gets array of all "ValueAndConceptDescription" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueAndConceptDescription[] getValueAndConceptDescriptionArray();

    /**
     * Gets ith "ValueAndConceptDescription" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueAndConceptDescription getValueAndConceptDescriptionArray(int i);

    /**
     * Returns number of "ValueAndConceptDescription" element
     */
    int sizeOfValueAndConceptDescriptionArray();

    /**
     * Sets array of all "ValueAndConceptDescription" element
     */
    void setValueAndConceptDescriptionArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueAndConceptDescription[] valueAndConceptDescriptionArray);

    /**
     * Sets ith "ValueAndConceptDescription" element
     */
    void setValueAndConceptDescriptionArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueAndConceptDescription valueAndConceptDescription);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ValueAndConceptDescription" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueAndConceptDescription insertNewValueAndConceptDescription(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ValueAndConceptDescription" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueAndConceptDescription addNewValueAndConceptDescription();

    /**
     * Removes the ith "ValueAndConceptDescription" element
     */
    void removeValueAndConceptDescription(int i);

    /**
     * Gets a List of "ValueDomain" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueDomain> getValueDomainList();

    /**
     * Gets array of all "ValueDomain" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueDomain[] getValueDomainArray();

    /**
     * Gets ith "ValueDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueDomain getValueDomainArray(int i);

    /**
     * Returns number of "ValueDomain" element
     */
    int sizeOfValueDomainArray();

    /**
     * Sets array of all "ValueDomain" element
     */
    void setValueDomainArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueDomain[] valueDomainArray);

    /**
     * Sets ith "ValueDomain" element
     */
    void setValueDomainArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueDomain valueDomain);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ValueDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueDomain insertNewValueDomain(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ValueDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueDomain addNewValueDomain();

    /**
     * Removes the ith "ValueDomain" element
     */
    void removeValueDomain(int i);

    /**
     * Gets a List of "ValueMapping" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMapping> getValueMappingList();

    /**
     * Gets array of all "ValueMapping" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMapping[] getValueMappingArray();

    /**
     * Gets ith "ValueMapping" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMapping getValueMappingArray(int i);

    /**
     * Returns number of "ValueMapping" element
     */
    int sizeOfValueMappingArray();

    /**
     * Sets array of all "ValueMapping" element
     */
    void setValueMappingArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMapping[] valueMappingArray);

    /**
     * Sets ith "ValueMapping" element
     */
    void setValueMappingArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMapping valueMapping);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ValueMapping" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMapping insertNewValueMapping(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ValueMapping" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMapping addNewValueMapping();

    /**
     * Removes the ith "ValueMapping" element
     */
    void removeValueMapping(int i);

    /**
     * Gets a List of "ValueMappingPosition" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingPosition> getValueMappingPositionList();

    /**
     * Gets array of all "ValueMappingPosition" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingPosition[] getValueMappingPositionArray();

    /**
     * Gets ith "ValueMappingPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingPosition getValueMappingPositionArray(int i);

    /**
     * Returns number of "ValueMappingPosition" element
     */
    int sizeOfValueMappingPositionArray();

    /**
     * Sets array of all "ValueMappingPosition" element
     */
    void setValueMappingPositionArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingPosition[] valueMappingPositionArray);

    /**
     * Sets ith "ValueMappingPosition" element
     */
    void setValueMappingPositionArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingPosition valueMappingPosition);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ValueMappingPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingPosition insertNewValueMappingPosition(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ValueMappingPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingPosition addNewValueMappingPosition();

    /**
     * Removes the ith "ValueMappingPosition" element
     */
    void removeValueMappingPosition(int i);

    /**
     * Gets a List of "ValueMappingRelationship" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship> getValueMappingRelationshipList();

    /**
     * Gets array of all "ValueMappingRelationship" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship[] getValueMappingRelationshipArray();

    /**
     * Gets ith "ValueMappingRelationship" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship getValueMappingRelationshipArray(int i);

    /**
     * Returns number of "ValueMappingRelationship" element
     */
    int sizeOfValueMappingRelationshipArray();

    /**
     * Sets array of all "ValueMappingRelationship" element
     */
    void setValueMappingRelationshipArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship[] valueMappingRelationshipArray);

    /**
     * Sets ith "ValueMappingRelationship" element
     */
    void setValueMappingRelationshipArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship valueMappingRelationship);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ValueMappingRelationship" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship insertNewValueMappingRelationship(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ValueMappingRelationship" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship addNewValueMappingRelationship();

    /**
     * Removes the ith "ValueMappingRelationship" element
     */
    void removeValueMappingRelationship(int i);

    /**
     * Gets a List of "VariableCollection" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableCollection> getVariableCollectionList();

    /**
     * Gets array of all "VariableCollection" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableCollection[] getVariableCollectionArray();

    /**
     * Gets ith "VariableCollection" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableCollection getVariableCollectionArray(int i);

    /**
     * Returns number of "VariableCollection" element
     */
    int sizeOfVariableCollectionArray();

    /**
     * Sets array of all "VariableCollection" element
     */
    void setVariableCollectionArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableCollection[] variableCollectionArray);

    /**
     * Sets ith "VariableCollection" element
     */
    void setVariableCollectionArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableCollection variableCollection);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "VariableCollection" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableCollection insertNewVariableCollection(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "VariableCollection" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableCollection addNewVariableCollection();

    /**
     * Removes the ith "VariableCollection" element
     */
    void removeVariableCollection(int i);

    /**
     * Gets a List of "VariableDescriptorComponent" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableDescriptorComponent> getVariableDescriptorComponentList();

    /**
     * Gets array of all "VariableDescriptorComponent" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableDescriptorComponent[] getVariableDescriptorComponentArray();

    /**
     * Gets ith "VariableDescriptorComponent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableDescriptorComponent getVariableDescriptorComponentArray(int i);

    /**
     * Returns number of "VariableDescriptorComponent" element
     */
    int sizeOfVariableDescriptorComponentArray();

    /**
     * Sets array of all "VariableDescriptorComponent" element
     */
    void setVariableDescriptorComponentArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableDescriptorComponent[] variableDescriptorComponentArray);

    /**
     * Sets ith "VariableDescriptorComponent" element
     */
    void setVariableDescriptorComponentArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableDescriptorComponent variableDescriptorComponent);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "VariableDescriptorComponent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableDescriptorComponent insertNewVariableDescriptorComponent(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "VariableDescriptorComponent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableDescriptorComponent addNewVariableDescriptorComponent();

    /**
     * Removes the ith "VariableDescriptorComponent" element
     */
    void removeVariableDescriptorComponent(int i);

    /**
     * Gets a List of "VariablePosition" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariablePosition> getVariablePositionList();

    /**
     * Gets array of all "VariablePosition" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariablePosition[] getVariablePositionArray();

    /**
     * Gets ith "VariablePosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariablePosition getVariablePositionArray(int i);

    /**
     * Returns number of "VariablePosition" element
     */
    int sizeOfVariablePositionArray();

    /**
     * Sets array of all "VariablePosition" element
     */
    void setVariablePositionArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariablePosition[] variablePositionArray);

    /**
     * Sets ith "VariablePosition" element
     */
    void setVariablePositionArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariablePosition variablePosition);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "VariablePosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariablePosition insertNewVariablePosition(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "VariablePosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariablePosition addNewVariablePosition();

    /**
     * Removes the ith "VariablePosition" element
     */
    void removeVariablePosition(int i);

    /**
     * Gets a List of "VariableRelationship" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship> getVariableRelationshipList();

    /**
     * Gets array of all "VariableRelationship" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship[] getVariableRelationshipArray();

    /**
     * Gets ith "VariableRelationship" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship getVariableRelationshipArray(int i);

    /**
     * Returns number of "VariableRelationship" element
     */
    int sizeOfVariableRelationshipArray();

    /**
     * Sets array of all "VariableRelationship" element
     */
    void setVariableRelationshipArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship[] variableRelationshipArray);

    /**
     * Sets ith "VariableRelationship" element
     */
    void setVariableRelationshipArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship variableRelationship);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "VariableRelationship" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship insertNewVariableRelationship(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "VariableRelationship" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship addNewVariableRelationship();

    /**
     * Removes the ith "VariableRelationship" element
     */
    void removeVariableRelationship(int i);

    /**
     * Gets a List of "VariableStructure" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableStructure> getVariableStructureList();

    /**
     * Gets array of all "VariableStructure" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableStructure[] getVariableStructureArray();

    /**
     * Gets ith "VariableStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableStructure getVariableStructureArray(int i);

    /**
     * Returns number of "VariableStructure" element
     */
    int sizeOfVariableStructureArray();

    /**
     * Sets array of all "VariableStructure" element
     */
    void setVariableStructureArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableStructure[] variableStructureArray);

    /**
     * Sets ith "VariableStructure" element
     */
    void setVariableStructureArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableStructure variableStructure);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "VariableStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableStructure insertNewVariableStructure(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "VariableStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableStructure addNewVariableStructure();

    /**
     * Removes the ith "VariableStructure" element
     */
    void removeVariableStructure(int i);

    /**
     * Gets a List of "VariableValueComponent" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableValueComponent> getVariableValueComponentList();

    /**
     * Gets array of all "VariableValueComponent" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableValueComponent[] getVariableValueComponentArray();

    /**
     * Gets ith "VariableValueComponent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableValueComponent getVariableValueComponentArray(int i);

    /**
     * Returns number of "VariableValueComponent" element
     */
    int sizeOfVariableValueComponentArray();

    /**
     * Sets array of all "VariableValueComponent" element
     */
    void setVariableValueComponentArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableValueComponent[] variableValueComponentArray);

    /**
     * Sets ith "VariableValueComponent" element
     */
    void setVariableValueComponentArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableValueComponent variableValueComponent);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "VariableValueComponent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableValueComponent insertNewVariableValueComponent(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "VariableValueComponent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableValueComponent addNewVariableValueComponent();

    /**
     * Removes the ith "VariableValueComponent" element
     */
    void removeVariableValueComponent(int i);

    /**
     * Gets a List of "WideDataSet" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideDataSet> getWideDataSetList();

    /**
     * Gets array of all "WideDataSet" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideDataSet[] getWideDataSetArray();

    /**
     * Gets ith "WideDataSet" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideDataSet getWideDataSetArray(int i);

    /**
     * Returns number of "WideDataSet" element
     */
    int sizeOfWideDataSetArray();

    /**
     * Sets array of all "WideDataSet" element
     */
    void setWideDataSetArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideDataSet[] wideDataSetArray);

    /**
     * Sets ith "WideDataSet" element
     */
    void setWideDataSetArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideDataSet wideDataSet);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "WideDataSet" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideDataSet insertNewWideDataSet(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "WideDataSet" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideDataSet addNewWideDataSet();

    /**
     * Removes the ith "WideDataSet" element
     */
    void removeWideDataSet(int i);

    /**
     * Gets a List of "WideDataStructure" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideDataStructure> getWideDataStructureList();

    /**
     * Gets array of all "WideDataStructure" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideDataStructure[] getWideDataStructureArray();

    /**
     * Gets ith "WideDataStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideDataStructure getWideDataStructureArray(int i);

    /**
     * Returns number of "WideDataStructure" element
     */
    int sizeOfWideDataStructureArray();

    /**
     * Sets array of all "WideDataStructure" element
     */
    void setWideDataStructureArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideDataStructure[] wideDataStructureArray);

    /**
     * Sets ith "WideDataStructure" element
     */
    void setWideDataStructureArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideDataStructure wideDataStructure);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "WideDataStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideDataStructure insertNewWideDataStructure(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "WideDataStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideDataStructure addNewWideDataStructure();

    /**
     * Removes the ith "WideDataStructure" element
     */
    void removeWideDataStructure(int i);

    /**
     * Gets a List of "WideKey" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideKey> getWideKeyList();

    /**
     * Gets array of all "WideKey" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideKey[] getWideKeyArray();

    /**
     * Gets ith "WideKey" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideKey getWideKeyArray(int i);

    /**
     * Returns number of "WideKey" element
     */
    int sizeOfWideKeyArray();

    /**
     * Sets array of all "WideKey" element
     */
    void setWideKeyArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideKey[] wideKeyArray);

    /**
     * Sets ith "WideKey" element
     */
    void setWideKeyArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideKey wideKey);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "WideKey" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideKey insertNewWideKey(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "WideKey" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideKey addNewWideKey();

    /**
     * Removes the ith "WideKey" element
     */
    void removeWideKey(int i);

    /**
     * Gets a List of "WideKeyMember" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideKeyMember> getWideKeyMemberList();

    /**
     * Gets array of all "WideKeyMember" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideKeyMember[] getWideKeyMemberArray();

    /**
     * Gets ith "WideKeyMember" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideKeyMember getWideKeyMemberArray(int i);

    /**
     * Returns number of "WideKeyMember" element
     */
    int sizeOfWideKeyMemberArray();

    /**
     * Sets array of all "WideKeyMember" element
     */
    void setWideKeyMemberArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideKeyMember[] wideKeyMemberArray);

    /**
     * Sets ith "WideKeyMember" element
     */
    void setWideKeyMemberArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideKeyMember wideKeyMember);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "WideKeyMember" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideKeyMember insertNewWideKeyMember(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "WideKeyMember" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideKeyMember addNewWideKeyMember();

    /**
     * Removes the ith "WideKeyMember" element
     */
    void removeWideKeyMember(int i);
}
