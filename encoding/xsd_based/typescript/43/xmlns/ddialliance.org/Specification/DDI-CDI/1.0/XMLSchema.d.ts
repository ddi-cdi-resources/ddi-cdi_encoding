import * as Primitive from '../../../../xml-primitives';

// Source files:
// http://localhost:8000/ddi-cdi_43_noXsdTypeInName.xsd


interface BaseType {
	_exists: boolean;
	_namespace: string;
}
/** Definition
  * ============
  * An activity is a task described at a conceptual level. It is not parameterized and as such is less reusable. For more logical/physical, fine-grained, reusable description there is a sub-type called step.
  *
  * Examples
  * ==========
  * Phases and sub-processes of the Generic Statistical Business Process Model (GSBPM) are examples of activity.
  *
  * Explanatory notes
  * ===================
  * An activity is invoked by control logic. It may use and/or produce information objects referenced with the entityUsed and entityProduced attributes. */
interface _Activity extends BaseType {
	/** Activities may be broken out into Steps. Steps are also a subtype of Activity. */
	Activity_has_Step?: ActivityActivity_has_StepType[];
	/** An activity is embedded in the control construct which launches it. */
	Activity_hasInternal_ControlLogic?: ActivityActivity_hasInternal_ControlLogicType[];
	/** An Activity is a container for SubActivities. */
	Activity_hasSubActivity_Activity?: ActivityActivity_hasSubActivity_ActivityType[];
	/** A description of the Activity in human-readable language. */
	description?: string;
}
export interface Activity extends _Activity { constructor: { new(): Activity }; }
export var Activity: { new(): Activity };

interface _ActivityActivity_has_StepType extends BaseType {
	validType?: ActivityActivity_has_StepTypeValidTypeType[];
}
interface ActivityActivity_has_StepType extends _ActivityActivity_has_StepType { constructor: { new(): ActivityActivity_has_StepType }; }

type ActivityActivity_has_StepTypeValidTypeType = "Step";
interface _ActivityActivity_has_StepTypeValidTypeType extends Primitive._string { content: ActivityActivity_has_StepTypeValidTypeType; }

interface _ActivityActivity_hasInternal_ControlLogicType extends BaseType {
	validType?: ActivityActivity_hasInternal_ControlLogicTypeValidTypeType[];
}
interface ActivityActivity_hasInternal_ControlLogicType extends _ActivityActivity_hasInternal_ControlLogicType { constructor: { new(): ActivityActivity_hasInternal_ControlLogicType }; }

type ActivityActivity_hasInternal_ControlLogicTypeValidTypeType = ("AllenIntervalAlgebra" | "ConditionalControlLogic" | "ControlLogic" | "DeterministicImperative" | "NonDeterministicDeclarative" | "RuleBasedScheduling" | "Sequence" | "TemporalConstraints" | "TemporalControlConstruct");
interface _ActivityActivity_hasInternal_ControlLogicTypeValidTypeType extends Primitive._string { content: ActivityActivity_hasInternal_ControlLogicTypeValidTypeType; }

interface _ActivityActivity_hasSubActivity_ActivityType extends BaseType {
	validType?: ActivityActivity_hasSubActivity_ActivityTypeValidTypeType;
}
interface ActivityActivity_hasSubActivity_ActivityType extends _ActivityActivity_hasSubActivity_ActivityType { constructor: { new(): ActivityActivity_hasSubActivity_ActivityType }; }

type ActivityActivity_hasSubActivity_ActivityTypeValidTypeType = ("Activity" | "Step");
interface _ActivityActivity_hasSubActivity_ActivityTypeValidTypeType extends Primitive._string { content: ActivityActivity_hasSubActivity_ActivityTypeValidTypeType; }

/** Definition
  * ==========
  * Actor that performs a role in relation to a process or product.
  *
  * Examples
  * ========
  * Analyst performing edits on data, interviewer conducting an interview, a relational database management system managing data, organization publishing data on a regular basis, creator or contributor of a publication.
  *
  * Explanatory notes
  * =================
  * foaf:Agent is: An agent (eg. person, group, software or physical artifact). prov:Agent is: An agent is something that bears some form of responsibility for an activity taking place, for the existence of an entity, or for another agent's activity. */
interface _Agent extends BaseType {}
export interface Agent extends _Agent { constructor: { new(): Agent }; }
export var Agent: { new(): Agent };

/** Definition
  * ============
  * Listing of agents of any type who may be organized to describe relationships between agents.
  *
  * Examples
  * ==========
  * Organizations contributing to a project. Individuals within an agency. All organizations, individuals, and machines identified within the collections of an archive. A listing of organizations contributing to a network for the purposes of providing data.
  *
  * Explanatory notes
  * ===================
  * Relationships between agents are fluid and reflect effective dates of the relationship. An agent may have multiple relationships which may be sequential or concurrent. Relationships may or may not be hierarchical in nature. All Agents are serialized individually and brought into relationships as appropriate. */
interface _AgentListing extends BaseType {
	AgentListing_has_Agent?: AgentListingAgentListing_has_AgentType[];
	AgentListing_has_AgentPosition?: AgentListingAgentListing_has_AgentPositionType[];
	/** The conceptual basis for the collection of members. */
	AgentListing_isDefinedBy_Concept?: AgentListingAgentListing_isDefinedBy_ConceptType[];
	/** The unit or group of persons within the organization responsible for the agent listing (i.e., for adding, changing or deleting agent entries). */
	AgentListing_isMaintainedBy_Agent?: AgentListingAgentListing_isMaintainedBy_AgentType;
	/** If value is False, the members are unique within the collection - if True, there may be duplicates. (Note that a mathematical "bag" permits duplicates and is unordered - a "set" does not have duplicates and may be ordered.) */
	allowsDuplicates: boolean;
}
export interface AgentListing extends _AgentListing { constructor: { new(): AgentListing }; }
export var AgentListing: { new(): AgentListing };

interface _AgentListingAgentListing_has_AgentPositionType extends BaseType {
	validType: AgentListingAgentListing_has_AgentPositionTypeValidTypeType;
}
interface AgentListingAgentListing_has_AgentPositionType extends _AgentListingAgentListing_has_AgentPositionType { constructor: { new(): AgentListingAgentListing_has_AgentPositionType }; }

type AgentListingAgentListing_has_AgentPositionTypeValidTypeType = "AgentPosition";
interface _AgentListingAgentListing_has_AgentPositionTypeValidTypeType extends Primitive._string { content: AgentListingAgentListing_has_AgentPositionTypeValidTypeType; }

interface _AgentListingAgentListing_has_AgentType extends BaseType {
	validType?: AgentListingAgentListing_has_AgentTypeValidTypeType[];
}
interface AgentListingAgentListing_has_AgentType extends _AgentListingAgentListing_has_AgentType { constructor: { new(): AgentListingAgentListing_has_AgentType }; }

type AgentListingAgentListing_has_AgentTypeValidTypeType = ("Agent" | "Curator" | "Individual" | "Machine" | "Organization" | "ProcessingAgent" | "Service");
interface _AgentListingAgentListing_has_AgentTypeValidTypeType extends Primitive._string { content: AgentListingAgentListing_has_AgentTypeValidTypeType; }

interface _AgentListingAgentListing_isDefinedBy_ConceptType extends BaseType {
	validType?: AgentListingAgentListing_isDefinedBy_ConceptTypeValidTypeType[];
}
interface AgentListingAgentListing_isDefinedBy_ConceptType extends _AgentListingAgentListing_isDefinedBy_ConceptType { constructor: { new(): AgentListingAgentListing_isDefinedBy_ConceptType }; }

type AgentListingAgentListing_isDefinedBy_ConceptTypeValidTypeType = ("Category" | "Concept" | "ConceptualValue" | "ConceptualVariable" | "DescriptorVariable" | "DimensionalKeyDefinitionMember" | "InstanceVariable" | "KeyDefinitionMember" | "Population" | "ReferenceVariable" | "RepresentedVariable" | "UnitType" | "Universe");
interface _AgentListingAgentListing_isDefinedBy_ConceptTypeValidTypeType extends Primitive._string { content: AgentListingAgentListing_isDefinedBy_ConceptTypeValidTypeType; }

interface _AgentListingAgentListing_isMaintainedBy_AgentType extends BaseType {
	validType?: AgentListingAgentListing_isMaintainedBy_AgentTypeValidTypeType[];
}
interface AgentListingAgentListing_isMaintainedBy_AgentType extends _AgentListingAgentListing_isMaintainedBy_AgentType { constructor: { new(): AgentListingAgentListing_isMaintainedBy_AgentType }; }

type AgentListingAgentListing_isMaintainedBy_AgentTypeValidTypeType = ("Agent" | "Curator" | "Individual" | "Machine" | "Organization" | "ProcessingAgent" | "Service");
interface _AgentListingAgentListing_isMaintainedBy_AgentTypeValidTypeType extends Primitive._string { content: AgentListingAgentListing_isMaintainedBy_AgentTypeValidTypeType; }

/** Definition
  * ============
  * Assigns a sequence number to an agent in an agent listing. */
interface _AgentPosition extends BaseType {
	AgentPosition_indexes_Agent?: AgentPositionAgentPosition_indexes_AgentType;
	/** The index of the agent within an agent listing. */
	value: number;
}
export interface AgentPosition extends _AgentPosition { constructor: { new(): AgentPosition }; }
export var AgentPosition: { new(): AgentPosition };

interface _AgentPositionAgentPosition_indexes_AgentType extends BaseType {
	validType?: AgentPositionAgentPosition_indexes_AgentTypeValidTypeType[];
}
interface AgentPositionAgentPosition_indexes_AgentType extends _AgentPositionAgentPosition_indexes_AgentType { constructor: { new(): AgentPositionAgentPosition_indexes_AgentType }; }

type AgentPositionAgentPosition_indexes_AgentTypeValidTypeType = ("Agent" | "Curator" | "Individual" | "Machine" | "Organization" | "ProcessingAgent" | "Service");
interface _AgentPositionAgentPosition_indexes_AgentTypeValidTypeType extends Primitive._string { content: AgentPositionAgentPosition_indexes_AgentTypeValidTypeType; }

/** Definition
  * ============
  * Defines the relation of an agent within a structure.
  *
  * Examples
  * ==========
  * An organization (source/parent) employing an individual (target/child); An individual (source/parent) supervisory to an individual (target/child); An organization (source/parent) overseeing a project (organization) (target/child). Select appropriate relationship using the controlled vocabulary available through the semantics attribute.
  *
  * Explanatory notes
  * ===================
  * Used to define the relations of agents in a hierarchical structure, or in other networks. Projects can be understood as temporary organizations. */
interface _AgentRelationship extends BaseType {
	/** The subject in the description of a paired relationship – for example the Parent agent in the hierarchical Parent of Child relationship. */
	AgentRelationship_hasSource_Agent: AgentRelationshipAgentRelationship_hasSource_AgentType;
	/** The object in the description of a paired relationship – for example the Object agent in the hierarchical Parent of Child relationship. */
	AgentRelationship_hasTarget_Agent: AgentRelationshipAgentRelationship_hasTarget_AgentType;
}
export interface AgentRelationship extends _AgentRelationship { constructor: { new(): AgentRelationship }; }
export var AgentRelationship: { new(): AgentRelationship };

interface _AgentRelationshipAgentRelationship_hasSource_AgentType extends BaseType {
	validType?: AgentRelationshipAgentRelationship_hasSource_AgentTypeValidTypeType[];
}
interface AgentRelationshipAgentRelationship_hasSource_AgentType extends _AgentRelationshipAgentRelationship_hasSource_AgentType { constructor: { new(): AgentRelationshipAgentRelationship_hasSource_AgentType }; }

type AgentRelationshipAgentRelationship_hasSource_AgentTypeValidTypeType = ("Agent" | "Curator" | "Individual" | "Machine" | "Organization" | "ProcessingAgent" | "Service");
interface _AgentRelationshipAgentRelationship_hasSource_AgentTypeValidTypeType extends Primitive._string { content: AgentRelationshipAgentRelationship_hasSource_AgentTypeValidTypeType; }

interface _AgentRelationshipAgentRelationship_hasTarget_AgentType extends BaseType {
	validType?: AgentRelationshipAgentRelationship_hasTarget_AgentTypeValidTypeType[];
}
interface AgentRelationshipAgentRelationship_hasTarget_AgentType extends _AgentRelationshipAgentRelationship_hasTarget_AgentType { constructor: { new(): AgentRelationshipAgentRelationship_hasTarget_AgentType }; }

type AgentRelationshipAgentRelationship_hasTarget_AgentTypeValidTypeType = ("Agent" | "Curator" | "Individual" | "Machine" | "Organization" | "ProcessingAgent" | "Service");
interface _AgentRelationshipAgentRelationship_hasTarget_AgentTypeValidTypeType extends Primitive._string { content: AgentRelationshipAgentRelationship_hasTarget_AgentTypeValidTypeType; }

/** Definition
  * ============
  * Defines the relationships between agents in a collection for a specified period and purpose.
  *
  * Examples
  * ==========
  * Individual employed by an organization. A unit or project (organization) within another organization. Individual supervised by another individual.
  *
  * Explanatory notes
  * ===================
  * Can describe relations between agents rather than roles within a project or in relationship to a product. Roles are defined by the parent class and relationship name that uses an agent as a target. */
interface _AgentStructure extends BaseType {
	AgentStructure_has_AgentRelationship?: AgentStructureAgentStructure_has_AgentRelationshipType[];
	AgentStructure_structures_AgentListing?: AgentStructureAgentStructure_structures_AgentListingType;
}
export interface AgentStructure extends _AgentStructure { constructor: { new(): AgentStructure }; }
export var AgentStructure: { new(): AgentStructure };

interface _AgentStructureAgentStructure_has_AgentRelationshipType extends BaseType {
	validType: AgentStructureAgentStructure_has_AgentRelationshipTypeValidTypeType;
}
interface AgentStructureAgentStructure_has_AgentRelationshipType extends _AgentStructureAgentStructure_has_AgentRelationshipType { constructor: { new(): AgentStructureAgentStructure_has_AgentRelationshipType }; }

type AgentStructureAgentStructure_has_AgentRelationshipTypeValidTypeType = "AgentRelationship";
interface _AgentStructureAgentStructure_has_AgentRelationshipTypeValidTypeType extends Primitive._string { content: AgentStructureAgentStructure_has_AgentRelationshipTypeValidTypeType; }

interface _AgentStructureAgentStructure_structures_AgentListingType extends BaseType {
	validType?: AgentStructureAgentStructure_structures_AgentListingTypeValidTypeType[];
}
interface AgentStructureAgentStructure_structures_AgentListingType extends _AgentStructureAgentStructure_structures_AgentListingType { constructor: { new(): AgentStructureAgentStructure_structures_AgentListingType }; }

type AgentStructureAgentStructure_structures_AgentListingTypeValidTypeType = "AgentListing";
interface _AgentStructureAgentStructure_structures_AgentListingTypeValidTypeType extends Primitive._string { content: AgentStructureAgentStructure_structures_AgentListingTypeValidTypeType; }

/** Definition
  * ==========
  * Control logic where the execution flow is determined by the satisfaction of temporal constraints specified with Allen's Interval Algebra over time intervals. Allen's interval algebra consists of thirteen temporal interval relations and the operations defined on them. Together these relations are distinct (any pair of definite intervals are described by one and only one of the relations), exhaustive (any pair of definite intervals are described by one of the relations), and qualitative (no numeric time spans are considered). See https://www.ics.uci.edu/~alspaugh/cls/shr/allen.html.
  *
  * Examples
  * ========
  * An Allen overlap indicates that within a sequence two procedures overlap in time.
  *
  * Explanatory notes
  * =================
  * Allen's intervals are pairwise. */
interface _AllenIntervalAlgebra extends BaseType {}
export interface AllenIntervalAlgebra extends _AllenIntervalAlgebra { constructor: { new(): AllenIntervalAlgebra }; }
export var AllenIntervalAlgebra: { new(): AllenIntervalAlgebra };

/** Definition
  * ============
  * Role given to a represented variable in the context of a data structure to qualify observations or provide other types of supplementary information.
  *
  * Examples
  * ==========
  * The publication status of an observation (e.g. provisional, final, revised). */
interface _AttributeComponent extends BaseType {
	AttributeComponent_qualifies_DataStructureComponent?: AttributeComponentAttributeComponent_qualifies_DataStructureComponentType[];
}
export interface AttributeComponent extends _AttributeComponent { constructor: { new(): AttributeComponent }; }
export var AttributeComponent: { new(): AttributeComponent };

interface _AttributeComponentAttributeComponent_qualifies_DataStructureComponentType extends BaseType {
	validType?: AttributeComponentAttributeComponent_qualifies_DataStructureComponentTypeValidTypeType[];
}
interface AttributeComponentAttributeComponent_qualifies_DataStructureComponentType extends _AttributeComponentAttributeComponent_qualifies_DataStructureComponentType { constructor: { new(): AttributeComponentAttributeComponent_qualifies_DataStructureComponentType }; }

type AttributeComponentAttributeComponent_qualifies_DataStructureComponentTypeValidTypeType = ("AttributeComponent" | "ContextualComponent" | "DataStructure" | "DataStructureComponent" | "DimensionComponent" | "DimensionalDataStructure" | "IdentifierComponent" | "KeyValueStructure" | "LongDataStructure" | "MeasureComponent" | "QualifiedMeasure" | "SyntheticIdComponent" | "VariableDescriptorComponent" | "VariableValueComponent" | "WideDataStructure");
interface _AttributeComponentAttributeComponent_qualifies_DataStructureComponentTypeValidTypeType extends Primitive._string { content: AttributeComponentAttributeComponent_qualifies_DataStructureComponentTypeValidTypeType; }

/** Definition
  * ============
  * Identifies the authorizing agency and allows for the full text of the authorization (law, regulation, or other form of authorization).
  *
  * Examples
  * ==========
  * May be used to list authorizations from oversight committees and other regulatory agencies.
  *
  * Explanatory notes
  * ===================
  * Supports requirements for some statistical offices to identify the agency or law authorizing the collection or management of data or metadata. */
interface _AuthorizationSource extends BaseType {
	AuthorizationSource_has_Agent?: AuthorizationSourceAuthorizationSource_has_AgentType[];
}
export interface AuthorizationSource extends _AuthorizationSource { constructor: { new(): AuthorizationSource }; }
export var AuthorizationSource: { new(): AuthorizationSource };

interface _AuthorizationSourceAuthorizationSource_has_AgentType extends BaseType {
	validType?: AuthorizationSourceAuthorizationSource_has_AgentTypeValidTypeType[];
}
interface AuthorizationSourceAuthorizationSource_has_AgentType extends _AuthorizationSourceAuthorizationSource_has_AgentType { constructor: { new(): AuthorizationSourceAuthorizationSource_has_AgentType }; }

type AuthorizationSourceAuthorizationSource_has_AgentTypeValidTypeType = ("Agent" | "Curator" | "Individual" | "Machine" | "Organization" | "ProcessingAgent" | "Service");
interface _AuthorizationSourceAuthorizationSource_has_AgentTypeValidTypeType extends Primitive._string { content: AuthorizationSourceAuthorizationSource_has_AgentTypeValidTypeType; }

/** Definition
  * ============
  * Concept whose role is to define and measure a characteristic.
  *
  * Examples
  * ==========
  * The category "Male" is used to define or measure "Sex" or "Gender", which are characteristics. In turn, they are also variables. "Extremely Satisfied" is a category in an agreement scale. This can be used for many kinds of variables.
  *
  * Explanatory notes
  * ===================
  * A category is a concept, typically associated with a code in the representation of a variable value. Categories are most often used in the allowed values for qualitative, i.e., nominal and ordinal, variables. A set of categories, say "Male" and "Female" for characteristics "Sex" or "Gender," helps define those characteristics. For describing location of measurement station, you might have categories "Urban", "Suburban", "Rural", etc. */
interface _Category extends BaseType {}
export interface Category extends _Category { constructor: { new(): Category }; }
export var Category: { new(): Category };

/** Definition
  * ============
  * Assigns a sequence number to a category within a list. */
interface _CategoryPosition extends BaseType {
	CategoryPosition_indexes_Category: CategoryPositionCategoryPosition_indexes_CategoryType;
	/** Index value of the member in an ordered array. */
	value: number;
}
export interface CategoryPosition extends _CategoryPosition { constructor: { new(): CategoryPosition }; }
export var CategoryPosition: { new(): CategoryPosition };

interface _CategoryPositionCategoryPosition_indexes_CategoryType extends BaseType {
	validType?: CategoryPositionCategoryPosition_indexes_CategoryTypeValidTypeType[];
}
interface CategoryPositionCategoryPosition_indexes_CategoryType extends _CategoryPositionCategoryPosition_indexes_CategoryType { constructor: { new(): CategoryPositionCategoryPosition_indexes_CategoryType }; }

type CategoryPositionCategoryPosition_indexes_CategoryTypeValidTypeType = "Category";
interface _CategoryPositionCategoryPosition_indexes_CategoryTypeValidTypeType extends Primitive._string { content: CategoryPositionCategoryPosition_indexes_CategoryTypeValidTypeType; }

/** Definition
  * ============
  * Source-to-target relationship between categories in a structure.
  *
  * Examples
  * ==========
  * In the International Standard Industrial Classification of All Economic Activities (ISIC) Revision 4 (https://unstats.un.org/unsd/demographic-social/census/documents/isic_rev4.pdf), the super-type/sub-type relation is used throughout. The super-type "Manufacturing Sector" has among its sub-types "Manufacture of Rubber and Plastics Products" (division 22). In this example, the super-type is the source (Manufacturing Sector") and the sub-type is the target. The semantics attribute will provide the type of the relationship.
  *
  * Explanatory notes
  * ===================
  * Relationships between pairs of categories are linkages between them. The meaning of the linkage is determined by the relation. */
interface _CategoryRelationship extends BaseType {
	CategoryRelationship_hasSource_Category?: CategoryRelationshipCategoryRelationship_hasSource_CategoryType[];
	/** Second member in a relationship. Note that this can be realized as a collection to support tuples. */
	CategoryRelationship_hasTarget_Category?: CategoryRelationshipCategoryRelationship_hasTarget_CategoryType[];
}
export interface CategoryRelationship extends _CategoryRelationship { constructor: { new(): CategoryRelationship }; }
export var CategoryRelationship: { new(): CategoryRelationship };

interface _CategoryRelationshipCategoryRelationship_hasSource_CategoryType extends BaseType {
	validType?: CategoryRelationshipCategoryRelationship_hasSource_CategoryTypeValidTypeType[];
}
interface CategoryRelationshipCategoryRelationship_hasSource_CategoryType extends _CategoryRelationshipCategoryRelationship_hasSource_CategoryType { constructor: { new(): CategoryRelationshipCategoryRelationship_hasSource_CategoryType }; }

type CategoryRelationshipCategoryRelationship_hasSource_CategoryTypeValidTypeType = "Category";
interface _CategoryRelationshipCategoryRelationship_hasSource_CategoryTypeValidTypeType extends Primitive._string { content: CategoryRelationshipCategoryRelationship_hasSource_CategoryTypeValidTypeType; }

interface _CategoryRelationshipCategoryRelationship_hasTarget_CategoryType extends BaseType {
	validType?: CategoryRelationshipCategoryRelationship_hasTarget_CategoryTypeValidTypeType[];
}
interface CategoryRelationshipCategoryRelationship_hasTarget_CategoryType extends _CategoryRelationshipCategoryRelationship_hasTarget_CategoryType { constructor: { new(): CategoryRelationshipCategoryRelationship_hasTarget_CategoryType }; }

type CategoryRelationshipCategoryRelationship_hasTarget_CategoryTypeValidTypeType = "Category";
interface _CategoryRelationshipCategoryRelationship_hasTarget_CategoryTypeValidTypeType extends Primitive._string { content: CategoryRelationshipCategoryRelationship_hasTarget_CategoryTypeValidTypeType; }

/** Definition
  * ============
  * Description of the relationships between and among categories within a collection.
  *
  * Examples
  * ==========
  * The category of "student" might be described as having sub-types of "primary school student" and "high school student".
  *
  * Explanatory notes
  * ===================
  * The category relation structure employs a set of category relations to describe the relationship among concepts. Each category relation is a one to many description of connections between categories. Together they might commonly describe relationships as complex as a hierarchy or graph. This is a kind of a concept structure restricted to categories (which are concepts). Allows for the specification of complex relationships among categories. */
interface _CategoryRelationStructure extends BaseType {
	CategoryRelationStructure_has_CategoryRelationship?: CategoryRelationStructureCategoryRelationStructure_has_CategoryRelationshipType[];
	CategoryRelationStructure_structures_CategorySet?: CategoryRelationStructureCategoryRelationStructure_structures_CategorySetType;
}
export interface CategoryRelationStructure extends _CategoryRelationStructure { constructor: { new(): CategoryRelationStructure }; }
export var CategoryRelationStructure: { new(): CategoryRelationStructure };

interface _CategoryRelationStructureCategoryRelationStructure_has_CategoryRelationshipType extends BaseType {
	validType: CategoryRelationStructureCategoryRelationStructure_has_CategoryRelationshipTypeValidTypeType;
}
interface CategoryRelationStructureCategoryRelationStructure_has_CategoryRelationshipType extends _CategoryRelationStructureCategoryRelationStructure_has_CategoryRelationshipType { constructor: { new(): CategoryRelationStructureCategoryRelationStructure_has_CategoryRelationshipType }; }

type CategoryRelationStructureCategoryRelationStructure_has_CategoryRelationshipTypeValidTypeType = "CategoryRelationship";
interface _CategoryRelationStructureCategoryRelationStructure_has_CategoryRelationshipTypeValidTypeType extends Primitive._string { content: CategoryRelationStructureCategoryRelationStructure_has_CategoryRelationshipTypeValidTypeType; }

interface _CategoryRelationStructureCategoryRelationStructure_structures_CategorySetType extends BaseType {
	validType?: CategoryRelationStructureCategoryRelationStructure_structures_CategorySetTypeValidTypeType[];
}
interface CategoryRelationStructureCategoryRelationStructure_structures_CategorySetType extends _CategoryRelationStructureCategoryRelationStructure_structures_CategorySetType { constructor: { new(): CategoryRelationStructureCategoryRelationStructure_structures_CategorySetType }; }

type CategoryRelationStructureCategoryRelationStructure_structures_CategorySetTypeValidTypeType = "CategorySet";
interface _CategoryRelationStructureCategoryRelationStructure_structures_CategorySetTypeValidTypeType extends Primitive._string { content: CategoryRelationStructureCategoryRelationStructure_structures_CategorySetTypeValidTypeType; }

/** Definition
  * ============
  * Concept system where the underlying concepts are categories.
  *
  * Examples
  * ==========
  * "Male" and "Female" categories in a category set named "Gender".
  *
  * Explanatory notes
  * ===================
  * The categories in a category set help define the meaning of the category set. Gender can be defined as "male or female" - see example above. A category set can be used directly by questions to express a set of response choices. */
interface _CategorySet extends BaseType {
	CategorySet_has_Category?: CategorySetCategorySet_has_CategoryType[];
	CategorySet_has_CategoryPosition?: CategorySetCategorySet_has_CategoryPositionType[];
}
export interface CategorySet extends _CategorySet { constructor: { new(): CategorySet }; }
export var CategorySet: { new(): CategorySet };

interface _CategorySetCategorySet_has_CategoryPositionType extends BaseType {
	validType: CategorySetCategorySet_has_CategoryPositionTypeValidTypeType;
}
interface CategorySetCategorySet_has_CategoryPositionType extends _CategorySetCategorySet_has_CategoryPositionType { constructor: { new(): CategorySetCategorySet_has_CategoryPositionType }; }

type CategorySetCategorySet_has_CategoryPositionTypeValidTypeType = "CategoryPosition";
interface _CategorySetCategorySet_has_CategoryPositionTypeValidTypeType extends Primitive._string { content: CategorySetCategorySet_has_CategoryPositionTypeValidTypeType; }

interface _CategorySetCategorySet_has_CategoryType extends BaseType {
	validType?: CategorySetCategorySet_has_CategoryTypeValidTypeType[];
}
interface CategorySetCategorySet_has_CategoryType extends _CategorySetCategorySet_has_CategoryType { constructor: { new(): CategorySetCategorySet_has_CategoryType }; }

type CategorySetCategorySet_has_CategoryTypeValidTypeType = "Category";
interface _CategorySetCategorySet_has_CategoryTypeValidTypeType extends Primitive._string { content: CategorySetCategorySet_has_CategoryTypeValidTypeType; }

/** Definition
  * ============
  * Statistics related to a specific category of an instance variable within a data set.
  *
  * Examples
  * ==========
  * The percentage of females from a demographic data set.
  *
  * Explanatory notes
  * ===================
  * Statistics at the data set are used as indicators during assessment of the appropriateness of using a some data for a particular purpose. */
interface _CategoryStatistic extends BaseType {
	CategoryStatistic_appliesTo_InstanceVariable: CategoryStatisticCategoryStatistic_appliesTo_InstanceVariableType[];
	CategoryStatistic_for_Category?: CategoryStatisticCategoryStatistic_for_CategoryType;
}
export interface CategoryStatistic extends _CategoryStatistic { constructor: { new(): CategoryStatistic }; }
export var CategoryStatistic: { new(): CategoryStatistic };

interface _CategoryStatisticCategoryStatistic_appliesTo_InstanceVariableType extends BaseType {
	validType?: CategoryStatisticCategoryStatistic_appliesTo_InstanceVariableTypeValidTypeType[];
}
interface CategoryStatisticCategoryStatistic_appliesTo_InstanceVariableType extends _CategoryStatisticCategoryStatistic_appliesTo_InstanceVariableType { constructor: { new(): CategoryStatisticCategoryStatistic_appliesTo_InstanceVariableType }; }

type CategoryStatisticCategoryStatistic_appliesTo_InstanceVariableTypeValidTypeType = "InstanceVariable";
interface _CategoryStatisticCategoryStatistic_appliesTo_InstanceVariableTypeValidTypeType extends Primitive._string { content: CategoryStatisticCategoryStatistic_appliesTo_InstanceVariableTypeValidTypeType; }

interface _CategoryStatisticCategoryStatistic_for_CategoryType extends BaseType {
	validType?: CategoryStatisticCategoryStatistic_for_CategoryTypeValidTypeType[];
}
interface CategoryStatisticCategoryStatistic_for_CategoryType extends _CategoryStatisticCategoryStatistic_for_CategoryType { constructor: { new(): CategoryStatisticCategoryStatistic_for_CategoryType }; }

type CategoryStatisticCategoryStatistic_for_CategoryTypeValidTypeType = "Category";
interface _CategoryStatisticCategoryStatistic_for_CategoryTypeValidTypeType extends Primitive._string { content: CategoryStatisticCategoryStatistic_for_CategoryTypeValidTypeType; }

/** Definition
  * ============
  * Collection of classification series related by being based on a common concept
  *
  * Examples
  * ==========
  * A set of classification series (e.g., International Standard Industrial Classification (ISIC) and North American Industrial Classification System (NAICS)) based on the same concept - economic activity or industry.
  *
  * Explanatory notes
  * ===================
  * Different classification databases may use different types of classification families and have different names for the families, as no standard has been agreed upon. [GSIM1.1] This is documented by the definingConcept relationship   (e.g. economic activity).[GSIM1.1]. */
interface _ClassificationFamily extends BaseType {
	ClassificationFamily_groups_ClassificationSeries?: ClassificationFamilyClassificationFamily_groups_ClassificationSeriesType[];
	/** The conceptual basis for the collection of members. */
	ClassificationFamily_isDefinedBy_Concept?: ClassificationFamilyClassificationFamily_isDefinedBy_ConceptType[];
	/** Classification indexes associated to the classification family. */
	ClassificationFamily_uses_ClassificationIndex?: ClassificationFamilyClassificationFamily_uses_ClassificationIndexType[];
}
export interface ClassificationFamily extends _ClassificationFamily { constructor: { new(): ClassificationFamily }; }
export var ClassificationFamily: { new(): ClassificationFamily };

interface _ClassificationFamilyClassificationFamily_groups_ClassificationSeriesType extends BaseType {
	validType?: ClassificationFamilyClassificationFamily_groups_ClassificationSeriesTypeValidTypeType;
}
interface ClassificationFamilyClassificationFamily_groups_ClassificationSeriesType extends _ClassificationFamilyClassificationFamily_groups_ClassificationSeriesType { constructor: { new(): ClassificationFamilyClassificationFamily_groups_ClassificationSeriesType }; }

type ClassificationFamilyClassificationFamily_groups_ClassificationSeriesTypeValidTypeType = "ClassificationSeries";
interface _ClassificationFamilyClassificationFamily_groups_ClassificationSeriesTypeValidTypeType extends Primitive._string { content: ClassificationFamilyClassificationFamily_groups_ClassificationSeriesTypeValidTypeType; }

interface _ClassificationFamilyClassificationFamily_isDefinedBy_ConceptType extends BaseType {
	validType?: ClassificationFamilyClassificationFamily_isDefinedBy_ConceptTypeValidTypeType[];
}
interface ClassificationFamilyClassificationFamily_isDefinedBy_ConceptType extends _ClassificationFamilyClassificationFamily_isDefinedBy_ConceptType { constructor: { new(): ClassificationFamilyClassificationFamily_isDefinedBy_ConceptType }; }

type ClassificationFamilyClassificationFamily_isDefinedBy_ConceptTypeValidTypeType = ("Category" | "Concept" | "ConceptualValue" | "ConceptualVariable" | "DescriptorVariable" | "DimensionalKeyDefinitionMember" | "InstanceVariable" | "KeyDefinitionMember" | "Population" | "ReferenceVariable" | "RepresentedVariable" | "UnitType" | "Universe");
interface _ClassificationFamilyClassificationFamily_isDefinedBy_ConceptTypeValidTypeType extends Primitive._string { content: ClassificationFamilyClassificationFamily_isDefinedBy_ConceptTypeValidTypeType; }

interface _ClassificationFamilyClassificationFamily_uses_ClassificationIndexType extends BaseType {
	validType?: ClassificationFamilyClassificationFamily_uses_ClassificationIndexTypeValidTypeType[];
}
interface ClassificationFamilyClassificationFamily_uses_ClassificationIndexType extends _ClassificationFamilyClassificationFamily_uses_ClassificationIndexType { constructor: { new(): ClassificationFamilyClassificationFamily_uses_ClassificationIndexType }; }

type ClassificationFamilyClassificationFamily_uses_ClassificationIndexTypeValidTypeType = "ClassificationIndex";
interface _ClassificationFamilyClassificationFamily_uses_ClassificationIndexTypeValidTypeType extends Primitive._string { content: ClassificationFamilyClassificationFamily_uses_ClassificationIndexTypeValidTypeType; }

/** Definition
  * ============
  * Ordered list of classification index entries.
  *
  * Examples
  * ==========
  * An alphabetical index of a topically ordered statistical classification.
  *
  * Explanatory notes
  * ===================
  * A classification index shows the relationship between text found in statistical data sources (responses to survey questionnaires, administrative records) and one or more statistical classifications.  A classification index may be used to assign the codes for classification items to observations in statistical collections. Note that a GenericStatistical Information Model (GSIM) Node is the equivalent of a DDI-CDI Member, and a GSIM Node Set is a DDI-CDI Collection. A classification index can relate to one particular or to several statistical classifications. (See the GSIM Statistical Classification Model: https://statswiki.unece.org/display/gsim/Statistical+Classification+Model.) */
interface _ClassificationIndex extends BaseType {
	/** If value is False, the members are unique within the collection - if True, there may be duplicates. (Note that a mathematical “bag” permits duplicates and is unordered - a “set” does not have duplicates and may be ordered.) */
	allowsDuplicates: boolean;
	/** A list of languages in which the Statistical Classification is available. If a Classification Index exists in several languages, the number of entries in each language may be different, as the number of terms describing any given phenomenon can change from one language to another. However, the same phenomena should be described in each language. Supports the indication of multiple languages within a single property. Supports use of codes defined by the RFC 1766. */
	availableLanguage?: string[];
	ClassificationIndex_has_ClassificationIndexEntry?: ClassificationIndexClassificationIndex_has_ClassificationIndexEntryType[];
	ClassificationIndex_has_ClassificationIndexEntryPosition?: ClassificationIndexClassificationIndex_has_ClassificationIndexEntryPositionType[];
	/** Person(s) who may be contacted for additional information about the classification index. */
	ClassificationIndex_hasContact_Agent?: ClassificationIndexClassificationIndex_hasContact_AgentType[];
	/** The conceptual basis for the collection of members. */
	ClassificationIndex_isDefinedBy_Concept?: ClassificationIndexClassificationIndex_isDefinedBy_ConceptType[];
	/** The unit or group of persons within the organization responsible for the classification index (i.e., for adding, changing or deleting classification index entries). */
	ClassificationIndex_isMaintainedBy_Agent?: ClassificationIndexClassificationIndex_isMaintainedBy_AgentType;
}
export interface ClassificationIndex extends _ClassificationIndex { constructor: { new(): ClassificationIndex }; }
export var ClassificationIndex: { new(): ClassificationIndex };

interface _ClassificationIndexClassificationIndex_has_ClassificationIndexEntryPositionType extends BaseType {
	validType: ClassificationIndexClassificationIndex_has_ClassificationIndexEntryPositionTypeValidTypeType;
}
interface ClassificationIndexClassificationIndex_has_ClassificationIndexEntryPositionType extends _ClassificationIndexClassificationIndex_has_ClassificationIndexEntryPositionType { constructor: { new(): ClassificationIndexClassificationIndex_has_ClassificationIndexEntryPositionType }; }

type ClassificationIndexClassificationIndex_has_ClassificationIndexEntryPositionTypeValidTypeType = "ClassificationIndexEntryPosition";
interface _ClassificationIndexClassificationIndex_has_ClassificationIndexEntryPositionTypeValidTypeType extends Primitive._string { content: ClassificationIndexClassificationIndex_has_ClassificationIndexEntryPositionTypeValidTypeType; }

interface _ClassificationIndexClassificationIndex_has_ClassificationIndexEntryType extends BaseType {
	validType?: ClassificationIndexClassificationIndex_has_ClassificationIndexEntryTypeValidTypeType[];
}
interface ClassificationIndexClassificationIndex_has_ClassificationIndexEntryType extends _ClassificationIndexClassificationIndex_has_ClassificationIndexEntryType { constructor: { new(): ClassificationIndexClassificationIndex_has_ClassificationIndexEntryType }; }

type ClassificationIndexClassificationIndex_has_ClassificationIndexEntryTypeValidTypeType = "ClassificationIndexEntry";
interface _ClassificationIndexClassificationIndex_has_ClassificationIndexEntryTypeValidTypeType extends Primitive._string { content: ClassificationIndexClassificationIndex_has_ClassificationIndexEntryTypeValidTypeType; }

interface _ClassificationIndexClassificationIndex_hasContact_AgentType extends BaseType {
	validType?: ClassificationIndexClassificationIndex_hasContact_AgentTypeValidTypeType[];
}
interface ClassificationIndexClassificationIndex_hasContact_AgentType extends _ClassificationIndexClassificationIndex_hasContact_AgentType { constructor: { new(): ClassificationIndexClassificationIndex_hasContact_AgentType }; }

type ClassificationIndexClassificationIndex_hasContact_AgentTypeValidTypeType = ("Agent" | "Curator" | "Individual" | "Machine" | "Organization" | "ProcessingAgent" | "Service");
interface _ClassificationIndexClassificationIndex_hasContact_AgentTypeValidTypeType extends Primitive._string { content: ClassificationIndexClassificationIndex_hasContact_AgentTypeValidTypeType; }

interface _ClassificationIndexClassificationIndex_isDefinedBy_ConceptType extends BaseType {
	validType?: ClassificationIndexClassificationIndex_isDefinedBy_ConceptTypeValidTypeType[];
}
interface ClassificationIndexClassificationIndex_isDefinedBy_ConceptType extends _ClassificationIndexClassificationIndex_isDefinedBy_ConceptType { constructor: { new(): ClassificationIndexClassificationIndex_isDefinedBy_ConceptType }; }

type ClassificationIndexClassificationIndex_isDefinedBy_ConceptTypeValidTypeType = ("Category" | "Concept" | "ConceptualValue" | "ConceptualVariable" | "DescriptorVariable" | "DimensionalKeyDefinitionMember" | "InstanceVariable" | "KeyDefinitionMember" | "Population" | "ReferenceVariable" | "RepresentedVariable" | "UnitType" | "Universe");
interface _ClassificationIndexClassificationIndex_isDefinedBy_ConceptTypeValidTypeType extends Primitive._string { content: ClassificationIndexClassificationIndex_isDefinedBy_ConceptTypeValidTypeType; }

interface _ClassificationIndexClassificationIndex_isMaintainedBy_AgentType extends BaseType {
	validType?: ClassificationIndexClassificationIndex_isMaintainedBy_AgentTypeValidTypeType[];
}
interface ClassificationIndexClassificationIndex_isMaintainedBy_AgentType extends _ClassificationIndexClassificationIndex_isMaintainedBy_AgentType { constructor: { new(): ClassificationIndexClassificationIndex_isMaintainedBy_AgentType }; }

type ClassificationIndexClassificationIndex_isMaintainedBy_AgentTypeValidTypeType = ("Agent" | "Curator" | "Individual" | "Machine" | "Organization" | "ProcessingAgent" | "Service");
interface _ClassificationIndexClassificationIndex_isMaintainedBy_AgentTypeValidTypeType extends Primitive._string { content: ClassificationIndexClassificationIndex_isMaintainedBy_AgentTypeValidTypeType; }

/** Definition
  * ============
  * Word or a short phrase corresponding to a classification item in a statistical classification, together with the code of the corresponding classification item.
  *
  * Examples
  * ==========
  * The name of a locality, an economic activity, or an occupational title with the associated code from a corresponding classification item.
  *
  * Explanatory notes
  * ===================
  * Each Classification Index Entry (CIE) typically corresponds to one item of a Statistical Classification (SC). Although a CIE may be associated with a Classification Item (CI) at any Level of a SC, CIEs are normally associated with items at the lowest Level.
  * A CIE corresponds to a CI if the CI classifies the CIE with respect to the SC of which the CI is a member.
  * CIEs typically come from responses to survey questions or are verbatim descriptions in administrative records. */
interface _ClassificationIndexEntry extends BaseType {}
export interface ClassificationIndexEntry extends _ClassificationIndexEntry { constructor: { new(): ClassificationIndexEntry }; }
export var ClassificationIndexEntry: { new(): ClassificationIndexEntry };

/** Definition
  * ============
  * Member indicator for use with member type classification index entry. */
interface _ClassificationIndexEntryPosition extends BaseType {
	/** Restricts member target class to classification index entry. */
	ClassificationIndexEntryPosition_indexes_ClassificationIndexEntry: ClassificationIndexEntryPositionClassificationIndexEntryPosition_indexes_ClassificationIndexEntryType;
	/** Index value of the member in an ordered array. */
	value: number;
}
export interface ClassificationIndexEntryPosition extends _ClassificationIndexEntryPosition { constructor: { new(): ClassificationIndexEntryPosition }; }
export var ClassificationIndexEntryPosition: { new(): ClassificationIndexEntryPosition };

interface _ClassificationIndexEntryPositionClassificationIndexEntryPosition_indexes_ClassificationIndexEntryType extends BaseType {
	validType?: ClassificationIndexEntryPositionClassificationIndexEntryPosition_indexes_ClassificationIndexEntryTypeValidTypeType[];
}
interface ClassificationIndexEntryPositionClassificationIndexEntryPosition_indexes_ClassificationIndexEntryType extends _ClassificationIndexEntryPositionClassificationIndexEntryPosition_indexes_ClassificationIndexEntryType { constructor: { new(): ClassificationIndexEntryPositionClassificationIndexEntryPosition_indexes_ClassificationIndexEntryType }; }

type ClassificationIndexEntryPositionClassificationIndexEntryPosition_indexes_ClassificationIndexEntryTypeValidTypeType = "ClassificationIndexEntry";
interface _ClassificationIndexEntryPositionClassificationIndexEntryPosition_indexes_ClassificationIndexEntryTypeValidTypeType extends Primitive._string { content: ClassificationIndexEntryPositionClassificationIndexEntryPosition_indexes_ClassificationIndexEntryTypeValidTypeType; }

/** Definition
  * ============
  * A space for a category within a statistical classification.
  *
  * Examples
  * ==========
  * In the 2012 North American Industry Classification System (NAICS) one classification item has the category "construction", and has the Code 23, which designates construction in NAICS.
  *
  * Explanatory notes
  * ===================
  * A classification item defines the content and the borders of the category. A unit can be classified to one and only one item at each level of a statistical classification. As such a classification item is a placeholder for a position in a statistical classification. It contains a designation, for which code is a common kind; a category; and possibly other things.   This differentiates it from code which is a only kind of designation, in particular if it is an alphanumeric string assigned to stand in place of a category. Statistical classifications often have multiple levels. A level is defined as a set of classification items each the same number of relationships from the top or root classification item. */
interface _ClassificationItem extends BaseType {
	/** A definition for the code. Specialization of denotes for categories. */
	ClassificationItem_denotes_Category: ClassificationItemClassificationItem_denotes_CategoryType;
	/** Classification items to which the excluded cases belong (as described in explanatory notes). */
	ClassificationItem_excludes_ClassificationItem?: ClassificationItemClassificationItem_excludes_ClassificationItemType[];
	/** Case law rulings related to the classification item. */
	ClassificationItem_hasRulingBy_AuthorizationSource?: ClassificationItemClassificationItem_hasRulingBy_AuthorizationSourceType[];
	/** Classification item uses a notation. */
	ClassificationItem_uses_Notation: ClassificationItemClassificationItem_uses_NotationType;
	/** Indicates whether or not the item has been generated to make the level to which it belongs complete. */
	isGenerated?: boolean;
	/** Indicates whether or not the item is currently valid. If updates are allowed in the Statistical Classification, an item may be restricted in its validity, i.e. it may become valid or invalid after the Statistical Classification has been released. */
	isValid?: boolean;
}
export interface ClassificationItem extends _ClassificationItem { constructor: { new(): ClassificationItem }; }
export var ClassificationItem: { new(): ClassificationItem };

interface _ClassificationItemClassificationItem_denotes_CategoryType extends BaseType {
	validType?: ClassificationItemClassificationItem_denotes_CategoryTypeValidTypeType[];
}
interface ClassificationItemClassificationItem_denotes_CategoryType extends _ClassificationItemClassificationItem_denotes_CategoryType { constructor: { new(): ClassificationItemClassificationItem_denotes_CategoryType }; }

type ClassificationItemClassificationItem_denotes_CategoryTypeValidTypeType = "Category";
interface _ClassificationItemClassificationItem_denotes_CategoryTypeValidTypeType extends Primitive._string { content: ClassificationItemClassificationItem_denotes_CategoryTypeValidTypeType; }

interface _ClassificationItemClassificationItem_excludes_ClassificationItemType extends BaseType {
	validType?: ClassificationItemClassificationItem_excludes_ClassificationItemTypeValidTypeType[];
}
interface ClassificationItemClassificationItem_excludes_ClassificationItemType extends _ClassificationItemClassificationItem_excludes_ClassificationItemType { constructor: { new(): ClassificationItemClassificationItem_excludes_ClassificationItemType }; }

type ClassificationItemClassificationItem_excludes_ClassificationItemTypeValidTypeType = "ClassificationItem";
interface _ClassificationItemClassificationItem_excludes_ClassificationItemTypeValidTypeType extends Primitive._string { content: ClassificationItemClassificationItem_excludes_ClassificationItemTypeValidTypeType; }

interface _ClassificationItemClassificationItem_hasRulingBy_AuthorizationSourceType extends BaseType {
	validType?: ClassificationItemClassificationItem_hasRulingBy_AuthorizationSourceTypeValidTypeType[];
}
interface ClassificationItemClassificationItem_hasRulingBy_AuthorizationSourceType extends _ClassificationItemClassificationItem_hasRulingBy_AuthorizationSourceType { constructor: { new(): ClassificationItemClassificationItem_hasRulingBy_AuthorizationSourceType }; }

type ClassificationItemClassificationItem_hasRulingBy_AuthorizationSourceTypeValidTypeType = "AuthorizationSource";
interface _ClassificationItemClassificationItem_hasRulingBy_AuthorizationSourceTypeValidTypeType extends Primitive._string { content: ClassificationItemClassificationItem_hasRulingBy_AuthorizationSourceTypeValidTypeType; }

interface _ClassificationItemClassificationItem_uses_NotationType extends BaseType {
	validType?: ClassificationItemClassificationItem_uses_NotationTypeValidTypeType[];
}
interface ClassificationItemClassificationItem_uses_NotationType extends _ClassificationItemClassificationItem_uses_NotationType { constructor: { new(): ClassificationItemClassificationItem_uses_NotationType }; }

type ClassificationItemClassificationItem_uses_NotationTypeValidTypeType = "Notation";
interface _ClassificationItemClassificationItem_uses_NotationTypeValidTypeType extends Primitive._string { content: ClassificationItemClassificationItem_uses_NotationTypeValidTypeType; }

/** Definition
  * ============
  * Provides a classification item with an index conveying the order of the classification item within a sequence, expressed as an integer, progressing upward from 0 or 1. */
interface _ClassificationItemPosition extends BaseType {
	/** Classification item position indexes zero to one classification items. The member containing the designation of the classification item. */
	ClassificationItemPosition_indexes_ClassificationItem?: ClassificationItemPositionClassificationItemPosition_indexes_ClassificationItemType;
	/** Index value of the member in an ordered array. */
	value: number;
}
export interface ClassificationItemPosition extends _ClassificationItemPosition { constructor: { new(): ClassificationItemPosition }; }
export var ClassificationItemPosition: { new(): ClassificationItemPosition };

interface _ClassificationItemPositionClassificationItemPosition_indexes_ClassificationItemType extends BaseType {
	validType?: ClassificationItemPositionClassificationItemPosition_indexes_ClassificationItemTypeValidTypeType[];
}
interface ClassificationItemPositionClassificationItemPosition_indexes_ClassificationItemType extends _ClassificationItemPositionClassificationItemPosition_indexes_ClassificationItemType { constructor: { new(): ClassificationItemPositionClassificationItemPosition_indexes_ClassificationItemType }; }

type ClassificationItemPositionClassificationItemPosition_indexes_ClassificationItemTypeValidTypeType = "ClassificationItem";
interface _ClassificationItemPositionClassificationItemPosition_indexes_ClassificationItemTypeValidTypeType extends Primitive._string { content: ClassificationItemPositionClassificationItemPosition_indexes_ClassificationItemTypeValidTypeType; }

/** Definition
  * ============
  * Source-target relationship between classification items in a classification item relation structure. */
interface _ClassificationItemRelationship extends BaseType {}
export interface ClassificationItemRelationship extends _ClassificationItemRelationship { constructor: { new(): ClassificationItemRelationship }; }
export var ClassificationItemRelationship: { new(): ClassificationItemRelationship };

/** DDI-CDI Specification
  * =====================
  *
  * The DDI-Cross Domain Integration (DDI-CDI) specification provides a
  * model for working with a wide variety of research data across many
  * scientific and policy domains. It provides a level of detail which
  * supports machine-actionable processing of data, both within and between
  * systems, and is designed to be easily aligned with other standards.
  *
  * It focuses on the key elements of the data management challenges facing
  * research today: an exact understanding of data in a wide variety of
  * formats, coming from many different sources. Two elements are critical
  * for dealing with these challenges: a flexible means of describing data
  * that can reveal the connections between the same data existing in
  * different formats, and a means of describing the provenance of the data
  * at a detailed (but comprehensible) level: the processes which produced
  * it must be transparent.
  *
  * DDI-CDI covers these areas in a fashion intended to make it optimally
  * useful to modern systems, which often employ a variety of models, and
  * comply with a range of related specifications for both functions related
  * to data description and process/provenance. The model is designed to be
  * easy to fit into such systems, by aligning with relevant external
  * standards, and to be align-able with them into the future.
  *
  * The core model field-level documentation is available in the section
  * :ref:`DDICDIModels::DDICDILibrary`.
  *
  * The corresponding Git repository can be found at
  * https://bitbucket.org/ddi-alliance/ddi-cdi/.
  *
  * Further information on DDI-CDI is available at the
  * related DDI Alliance web page https://ddialliance.org/Specification/DDI-CDI/.
  *
  * Purpose
  * -------
  *
  * The DDI-CDI specification describes a model and supporting elements for
  * implementing it in the areas of data description and process/provenance.
  * It is not intended to supplant existing specifications for these
  * purposes, but to fill in the information which such specifications often
  * do not capture. For data, this is the description of a single bit of
  * information – a datum – which can be used to play different roles in
  * different data structures and formats. For provenance and process, this
  * is the packaging of specific machine-level processes, which may be
  * described in many different ways, into a structure which relates them to
  * the business processes described at a level understandable to human
  * users.
  *
  * In order to serve this purpose, the DDI-CDI specification uses a Unified
  * Modeling Language (UML) formalization so that it can be mapped against
  * other models within systems more easily. Several different syntax
  * expressions of the model are made available to support implementation.
  *
  * Several important features of the specification can be highlighted, to
  * show how it serves this purpose:
  *
  * -  Domain-independence
  *
  * -  Datum-Oriented Data Description
  *
  * -  Provenance and Process Description
  *
  * -  Foundational Metadata
  *
  * -  Interoperability, Sustainability, and Alignment with Other Standards
  *
  * Each of these will be addressed in more detail, and an outline of the
  * specification documents is presented.
  *
  * Key Features of the Specification
  * ---------------------------------
  *
  * **Domain Independence**
  *
  * DDI-CDI is designed to be used with research data from any domain. In
  * order to do this, it is fundamentally based on the structure and other
  * generic aspects of the things it describes. It does not attempt to be a
  * domain model of semantics, nor a model specific to the life-cycle of a
  * particular domain of science or research. (Historically, DDI has focused
  * on the Social, behavioral, and Economic [SBE] sciences and some types of
  * health research – to see how DDI-CDI relates to other DDI
  * specifications, see below.)
  *
  * DDI-CDI is intended to be complimentary to (and used in combination
  * with) other standards and models which focus more on domain-specific
  * aspects (such as semantics and life-cycle models). Such generic elements
  * such as classifications and variables are given a detailed formal
  * treatment but are agnostic as to the domain. It is left to the user to
  * employ whatever domain semantics are demanded by the data with which
  * they are working.
  *
  * This feature of the specification makes it well-suited to combining data
  * coming from more than one domain or system, to allow a description that
  * supports systems which perform data integration, harmonization, and
  * similar functions. Cross-domain data sharing is becoming increasingly
  * common, and DDI-CDI is intended to provide support for this type of
  * application.
  *
  * **Datum-Oriented Data Description**
  *
  * DDI-CDI embraces a form of data description which is based on its atomic
  * components: individual datums. Any given datum can play different roles
  * in different formatting of the same data set, depending on how it is
  * processed and transformed. In order to retain the continuity of a given
  * datum across different formats and throughout a series of processes,
  * DDI-CDI allows it to be described playing different roles in different
  * structures.
  *
  * DDI-CDI provides four basic types of structural description for data
  * sets: wide data, long data, dimensional data, and key-value data. These
  * four types (and their sub-types) provide coverage for many common data
  * formats today. While not comprehensive, they cover the majority of cases
  * that the developers of this specification have seen. These include many
  * of the newer forms of data such as streaming data, "big" data,
  * registers, and instrument data. The underlying approach is one which
  * could – and may be – expanded in future. By assigning appropriate roles
  * to the variables which contain the datums across each of these different
  * formats, however, it is possible to understand how data passes from one
  * form to another.
  *
  * **Provenance and Process Description**
  *
  * If we are to fully understand data, we also need to know how it has been
  * processed and transformed. Given our ability to describe how a different
  * datum can be used in different data sets, it becomes desirable to
  * understand also how those data sets relate to one another in terms of
  * the processes which use them. This can be understood as an important
  * aspect of data provenance.
  *
  * There are many different ways of describing process and provenance.
  * Popular models include the Business Process Modelling and Notation
  * (BPMN) standard and the PROV Ontology (from W3C). There are a multitude
  * of syntaxes for driving data transformation, cleaning, and analysis in
  * packages such as R, SAS, Stata, MATLab, SPSS, Python, and so on. There
  * are also some emerging standard models for specifically describing such
  * processes (e.g., Structured Data Transformation Language
  * [SDTL], https://ddialliance.org/products/sdtl/1.0, Validation and
  * Transformation Language [VTL], https://sdmx.org/?page_id=5096).
  *
  * DDI-CDI attempts to do something which complements the use of such
  * models, by connecting specific processes interpretable by machines at
  * the lowest level (described in a package-specific syntax or language)
  * with the higher-level flows which combine these into human-readable
  * documentation of business processes. Both traditional linear
  * (deterministic) processing and the newer declarative (non-deterministic)
  * processing approaches are supported.
  *
  * **Foundational Metadata**
  *
  * In order to formally describe data at a detailed level, there are many
  * component elements which themselves must be modelled. Concepts used for
  * statistical data but also widely applicable – including categories and
  * variables – are a core part of this, but the range is broad. These
  * components are included in DDI-CDI as "foundational metadata."
  *
  * Terminology for such constructs varies widely across domains. DDI-CDI
  * has attempted to provide common terms for these components, and to adopt
  * common models from other standards where it seemed useful.
  *
  * One area which deserves particular attention is the "variable cascade" –
  * a model for how data are described at different points in their
  * creation, processing, and use, which is designed to optimize reuse.
  * While many different models have a "variable" of some form, the one
  * presented in DDI-CDI reflects the experience of working with this
  * important construct in many of the specifications and standards which
  * have preceded it. It is a nuanced view of how variables relate and are
  * understood across different systems, and – although not simple – it is a
  * powerful model which helps solve some of the commonly encountered
  * problems in data description and management.
  *
  * **Interoperability, Sustainability, and Alignment with Other Standards**
  *
  * DDI-CDI is fundamentally a model which is intended to be implemented
  * across a wide variety of technology platforms, and in combination with
  * many other standards, models, and specifications. To support this use,
  * it is formalized using a limited subset of the Unified Modelling
  * Language (UML) class diagram part. The model is provided in the form of
  * Canonical XMI (restricted XML Metadata Interchange) – an interchange
  * format for UML models supporting the import into many different
  * modelling and development tools. Further, a syntax representation is
  * provided in XML Schema, so that direct implementation of the model is
  * possible if needed.
  *
  * The platform-independence of the model makes it more easily applicable
  * across a broad range of applications and helps ensure that it will be
  * sustainable even as the technology landscape evolves.
  *
  * DDI-CDI builds on many other standard models and is aligned with them
  * where appropriate. This is shown in the model itself, where
  * formalizations from other models and specifications are refined,
  * extended, or directly used. The specification includes a description of
  * what these other standards and models are, and how they are used in DDI-CDI.
  *
  * Credits
  * -------
  *
  * Members of the Cross Domain Integration (CDI) Working Group shepherded the standard into its final form and produced the final documentation. Listed in alphabetical order they are:
  *
  * -  Arofan Gregory (chair)
  * -  Dan Gillman
  * -  Flavio Rizzolo
  * -  Hilde Orten
  * -  Jay Greenfield
  * -  Joachim Wackerow
  * -  Larry Hoyle
  * -  Oliver Hopt
  * -  Wendy Lee Thomas (Technical Committee contact)
  *
  * Over 100 people have contributed to the development of the Data Documentation Initiative Cross Domain Integration (DDI-CDI) specification. A more complete description of their contribution to the work can be found at https://bitbucket.org/ddi-alliance/ddi-cdi/src/master/CREDITS.md. */
interface _DDICDIModels extends BaseType {
	/** Definition
	  * ============
	  * An activity is a task described at a conceptual level. It is not parameterized and as such is less reusable. For more logical/physical, fine-grained, reusable description there is a sub-type called step.
	  *
	  * Examples
	  * ==========
	  * Phases and sub-processes of the Generic Statistical Business Process Model (GSBPM) are examples of activity.
	  *
	  * Explanatory notes
	  * ===================
	  * An activity is invoked by control logic. It may use and/or produce information objects referenced with the entityUsed and entityProduced attributes. */
	Activity?: Activity[];
	/** Definition
	  * ==========
	  * Actor that performs a role in relation to a process or product.
	  *
	  * Examples
	  * ========
	  * Analyst performing edits on data, interviewer conducting an interview, a relational database management system managing data, organization publishing data on a regular basis, creator or contributor of a publication.
	  *
	  * Explanatory notes
	  * =================
	  * foaf:Agent is: An agent (eg. person, group, software or physical artifact). prov:Agent is: An agent is something that bears some form of responsibility for an activity taking place, for the existence of an entity, or for another agent's activity. */
	Agent?: Agent[];
	/** Definition
	  * ============
	  * Listing of agents of any type who may be organized to describe relationships between agents.
	  *
	  * Examples
	  * ==========
	  * Organizations contributing to a project. Individuals within an agency. All organizations, individuals, and machines identified within the collections of an archive. A listing of organizations contributing to a network for the purposes of providing data.
	  *
	  * Explanatory notes
	  * ===================
	  * Relationships between agents are fluid and reflect effective dates of the relationship. An agent may have multiple relationships which may be sequential or concurrent. Relationships may or may not be hierarchical in nature. All Agents are serialized individually and brought into relationships as appropriate. */
	AgentListing?: AgentListing[];
	/** Definition
	  * ============
	  * Assigns a sequence number to an agent in an agent listing. */
	AgentPosition?: AgentPosition[];
	/** Definition
	  * ============
	  * Defines the relation of an agent within a structure.
	  *
	  * Examples
	  * ==========
	  * An organization (source/parent) employing an individual (target/child); An individual (source/parent) supervisory to an individual (target/child); An organization (source/parent) overseeing a project (organization) (target/child). Select appropriate relationship using the controlled vocabulary available through the semantics attribute.
	  *
	  * Explanatory notes
	  * ===================
	  * Used to define the relations of agents in a hierarchical structure, or in other networks. Projects can be understood as temporary organizations. */
	AgentRelationship?: AgentRelationship[];
	/** Definition
	  * ============
	  * Defines the relationships between agents in a collection for a specified period and purpose.
	  *
	  * Examples
	  * ==========
	  * Individual employed by an organization. A unit or project (organization) within another organization. Individual supervised by another individual.
	  *
	  * Explanatory notes
	  * ===================
	  * Can describe relations between agents rather than roles within a project or in relationship to a product. Roles are defined by the parent class and relationship name that uses an agent as a target. */
	AgentStructure?: AgentStructure[];
	/** Definition
	  * ==========
	  * Control logic where the execution flow is determined by the satisfaction of temporal constraints specified with Allen's Interval Algebra over time intervals. Allen's interval algebra consists of thirteen temporal interval relations and the operations defined on them. Together these relations are distinct (any pair of definite intervals are described by one and only one of the relations), exhaustive (any pair of definite intervals are described by one of the relations), and qualitative (no numeric time spans are considered). See https://www.ics.uci.edu/~alspaugh/cls/shr/allen.html.
	  *
	  * Examples
	  * ========
	  * An Allen overlap indicates that within a sequence two procedures overlap in time.
	  *
	  * Explanatory notes
	  * =================
	  * Allen's intervals are pairwise. */
	AllenIntervalAlgebra?: AllenIntervalAlgebra[];
	/** Definition
	  * ============
	  * Role given to a represented variable in the context of a data structure to qualify observations or provide other types of supplementary information.
	  *
	  * Examples
	  * ==========
	  * The publication status of an observation (e.g. provisional, final, revised). */
	AttributeComponent?: AttributeComponent[];
	/** Definition
	  * ============
	  * Identifies the authorizing agency and allows for the full text of the authorization (law, regulation, or other form of authorization).
	  *
	  * Examples
	  * ==========
	  * May be used to list authorizations from oversight committees and other regulatory agencies.
	  *
	  * Explanatory notes
	  * ===================
	  * Supports requirements for some statistical offices to identify the agency or law authorizing the collection or management of data or metadata. */
	AuthorizationSource?: AuthorizationSource[];
	/** Definition
	  * ============
	  * Concept whose role is to define and measure a characteristic.
	  *
	  * Examples
	  * ==========
	  * The category "Male" is used to define or measure "Sex" or "Gender", which are characteristics. In turn, they are also variables. "Extremely Satisfied" is a category in an agreement scale. This can be used for many kinds of variables.
	  *
	  * Explanatory notes
	  * ===================
	  * A category is a concept, typically associated with a code in the representation of a variable value. Categories are most often used in the allowed values for qualitative, i.e., nominal and ordinal, variables. A set of categories, say "Male" and "Female" for characteristics "Sex" or "Gender," helps define those characteristics. For describing location of measurement station, you might have categories "Urban", "Suburban", "Rural", etc. */
	Category?: Category[];
	/** Definition
	  * ============
	  * Assigns a sequence number to a category within a list. */
	CategoryPosition?: CategoryPosition[];
	/** Definition
	  * ============
	  * Source-to-target relationship between categories in a structure.
	  *
	  * Examples
	  * ==========
	  * In the International Standard Industrial Classification of All Economic Activities (ISIC) Revision 4 (https://unstats.un.org/unsd/demographic-social/census/documents/isic_rev4.pdf), the super-type/sub-type relation is used throughout. The super-type "Manufacturing Sector" has among its sub-types "Manufacture of Rubber and Plastics Products" (division 22). In this example, the super-type is the source (Manufacturing Sector") and the sub-type is the target. The semantics attribute will provide the type of the relationship.
	  *
	  * Explanatory notes
	  * ===================
	  * Relationships between pairs of categories are linkages between them. The meaning of the linkage is determined by the relation. */
	CategoryRelationship?: CategoryRelationship[];
	/** Definition
	  * ============
	  * Description of the relationships between and among categories within a collection.
	  *
	  * Examples
	  * ==========
	  * The category of "student" might be described as having sub-types of "primary school student" and "high school student".
	  *
	  * Explanatory notes
	  * ===================
	  * The category relation structure employs a set of category relations to describe the relationship among concepts. Each category relation is a one to many description of connections between categories. Together they might commonly describe relationships as complex as a hierarchy or graph. This is a kind of a concept structure restricted to categories (which are concepts). Allows for the specification of complex relationships among categories. */
	CategoryRelationStructure?: CategoryRelationStructure[];
	/** Definition
	  * ============
	  * Concept system where the underlying concepts are categories.
	  *
	  * Examples
	  * ==========
	  * "Male" and "Female" categories in a category set named "Gender".
	  *
	  * Explanatory notes
	  * ===================
	  * The categories in a category set help define the meaning of the category set. Gender can be defined as "male or female" - see example above. A category set can be used directly by questions to express a set of response choices. */
	CategorySet?: CategorySet[];
	/** Definition
	  * ============
	  * Statistics related to a specific category of an instance variable within a data set.
	  *
	  * Examples
	  * ==========
	  * The percentage of females from a demographic data set.
	  *
	  * Explanatory notes
	  * ===================
	  * Statistics at the data set are used as indicators during assessment of the appropriateness of using a some data for a particular purpose. */
	CategoryStatistic?: CategoryStatistic[];
	/** Definition
	  * ============
	  * Collection of classification series related by being based on a common concept
	  *
	  * Examples
	  * ==========
	  * A set of classification series (e.g., International Standard Industrial Classification (ISIC) and North American Industrial Classification System (NAICS)) based on the same concept - economic activity or industry.
	  *
	  * Explanatory notes
	  * ===================
	  * Different classification databases may use different types of classification families and have different names for the families, as no standard has been agreed upon. [GSIM1.1] This is documented by the definingConcept relationship   (e.g. economic activity).[GSIM1.1]. */
	ClassificationFamily?: ClassificationFamily[];
	/** Definition
	  * ============
	  * Ordered list of classification index entries.
	  *
	  * Examples
	  * ==========
	  * An alphabetical index of a topically ordered statistical classification.
	  *
	  * Explanatory notes
	  * ===================
	  * A classification index shows the relationship between text found in statistical data sources (responses to survey questionnaires, administrative records) and one or more statistical classifications.  A classification index may be used to assign the codes for classification items to observations in statistical collections. Note that a GenericStatistical Information Model (GSIM) Node is the equivalent of a DDI-CDI Member, and a GSIM Node Set is a DDI-CDI Collection. A classification index can relate to one particular or to several statistical classifications. (See the GSIM Statistical Classification Model: https://statswiki.unece.org/display/gsim/Statistical+Classification+Model.) */
	ClassificationIndex?: ClassificationIndex[];
	/** Definition
	  * ============
	  * Word or a short phrase corresponding to a classification item in a statistical classification, together with the code of the corresponding classification item.
	  *
	  * Examples
	  * ==========
	  * The name of a locality, an economic activity, or an occupational title with the associated code from a corresponding classification item.
	  *
	  * Explanatory notes
	  * ===================
	  * Each Classification Index Entry (CIE) typically corresponds to one item of a Statistical Classification (SC). Although a CIE may be associated with a Classification Item (CI) at any Level of a SC, CIEs are normally associated with items at the lowest Level.
	  * A CIE corresponds to a CI if the CI classifies the CIE with respect to the SC of which the CI is a member.
	  * CIEs typically come from responses to survey questions or are verbatim descriptions in administrative records. */
	ClassificationIndexEntry?: ClassificationIndexEntry[];
	/** Definition
	  * ============
	  * Member indicator for use with member type classification index entry. */
	ClassificationIndexEntryPosition?: ClassificationIndexEntryPosition[];
	/** Definition
	  * ============
	  * A space for a category within a statistical classification.
	  *
	  * Examples
	  * ==========
	  * In the 2012 North American Industry Classification System (NAICS) one classification item has the category "construction", and has the Code 23, which designates construction in NAICS.
	  *
	  * Explanatory notes
	  * ===================
	  * A classification item defines the content and the borders of the category. A unit can be classified to one and only one item at each level of a statistical classification. As such a classification item is a placeholder for a position in a statistical classification. It contains a designation, for which code is a common kind; a category; and possibly other things.   This differentiates it from code which is a only kind of designation, in particular if it is an alphanumeric string assigned to stand in place of a category. Statistical classifications often have multiple levels. A level is defined as a set of classification items each the same number of relationships from the top or root classification item. */
	ClassificationItem?: ClassificationItem[];
	/** Definition
	  * ============
	  * Provides a classification item with an index conveying the order of the classification item within a sequence, expressed as an integer, progressing upward from 0 or 1. */
	ClassificationItemPosition?: ClassificationItemPosition[];
	/** Definition
	  * ============
	  * Source-target relationship between classification items in a classification item relation structure. */
	ClassificationItemRelationship?: ClassificationItemRelationship[];
	/** Definition
	  * ==========
	  * Information structured according to the DDI-CDI model for a specific purpose or purposes within a system or community. */
	Wrapper?: Wrapper[];
}
export interface DDICDIModels extends _DDICDIModels { constructor: { new(): DDICDIModels }; }
export var DDICDIModels: { new(): DDICDIModels };

/** Definition
  * ==========
  * Information structured according to the DDI-CDI model for a specific purpose or purposes within a system or community. */
interface _Wrapper extends BaseType {
	/** Definition
	  * ============
	  * An activity is a task described at a conceptual level. It is not parameterized and as such is less reusable. For more logical/physical, fine-grained, reusable description there is a sub-type called step.
	  *
	  * Examples
	  * ==========
	  * Phases and sub-processes of the Generic Statistical Business Process Model (GSBPM) are examples of activity.
	  *
	  * Explanatory notes
	  * ===================
	  * An activity is invoked by control logic. It may use and/or produce information objects referenced with the entityUsed and entityProduced attributes. */
	Activity?: Activity[];
	/** Definition
	  * ==========
	  * Actor that performs a role in relation to a process or product.
	  *
	  * Examples
	  * ========
	  * Analyst performing edits on data, interviewer conducting an interview, a relational database management system managing data, organization publishing data on a regular basis, creator or contributor of a publication.
	  *
	  * Explanatory notes
	  * =================
	  * foaf:Agent is: An agent (eg. person, group, software or physical artifact). prov:Agent is: An agent is something that bears some form of responsibility for an activity taking place, for the existence of an entity, or for another agent's activity. */
	Agent?: Agent[];
	/** Definition
	  * ============
	  * Listing of agents of any type who may be organized to describe relationships between agents.
	  *
	  * Examples
	  * ==========
	  * Organizations contributing to a project. Individuals within an agency. All organizations, individuals, and machines identified within the collections of an archive. A listing of organizations contributing to a network for the purposes of providing data.
	  *
	  * Explanatory notes
	  * ===================
	  * Relationships between agents are fluid and reflect effective dates of the relationship. An agent may have multiple relationships which may be sequential or concurrent. Relationships may or may not be hierarchical in nature. All Agents are serialized individually and brought into relationships as appropriate. */
	AgentListing?: AgentListing[];
	/** Definition
	  * ============
	  * Assigns a sequence number to an agent in an agent listing. */
	AgentPosition?: AgentPosition[];
	/** Definition
	  * ============
	  * Defines the relation of an agent within a structure.
	  *
	  * Examples
	  * ==========
	  * An organization (source/parent) employing an individual (target/child); An individual (source/parent) supervisory to an individual (target/child); An organization (source/parent) overseeing a project (organization) (target/child). Select appropriate relationship using the controlled vocabulary available through the semantics attribute.
	  *
	  * Explanatory notes
	  * ===================
	  * Used to define the relations of agents in a hierarchical structure, or in other networks. Projects can be understood as temporary organizations. */
	AgentRelationship?: AgentRelationship[];
	/** Definition
	  * ============
	  * Defines the relationships between agents in a collection for a specified period and purpose.
	  *
	  * Examples
	  * ==========
	  * Individual employed by an organization. A unit or project (organization) within another organization. Individual supervised by another individual.
	  *
	  * Explanatory notes
	  * ===================
	  * Can describe relations between agents rather than roles within a project or in relationship to a product. Roles are defined by the parent class and relationship name that uses an agent as a target. */
	AgentStructure?: AgentStructure[];
	/** Definition
	  * ==========
	  * Control logic where the execution flow is determined by the satisfaction of temporal constraints specified with Allen's Interval Algebra over time intervals. Allen's interval algebra consists of thirteen temporal interval relations and the operations defined on them. Together these relations are distinct (any pair of definite intervals are described by one and only one of the relations), exhaustive (any pair of definite intervals are described by one of the relations), and qualitative (no numeric time spans are considered). See https://www.ics.uci.edu/~alspaugh/cls/shr/allen.html.
	  *
	  * Examples
	  * ========
	  * An Allen overlap indicates that within a sequence two procedures overlap in time.
	  *
	  * Explanatory notes
	  * =================
	  * Allen's intervals are pairwise. */
	AllenIntervalAlgebra?: AllenIntervalAlgebra[];
	/** Definition
	  * ============
	  * Role given to a represented variable in the context of a data structure to qualify observations or provide other types of supplementary information.
	  *
	  * Examples
	  * ==========
	  * The publication status of an observation (e.g. provisional, final, revised). */
	AttributeComponent?: AttributeComponent[];
	/** Definition
	  * ============
	  * Identifies the authorizing agency and allows for the full text of the authorization (law, regulation, or other form of authorization).
	  *
	  * Examples
	  * ==========
	  * May be used to list authorizations from oversight committees and other regulatory agencies.
	  *
	  * Explanatory notes
	  * ===================
	  * Supports requirements for some statistical offices to identify the agency or law authorizing the collection or management of data or metadata. */
	AuthorizationSource?: AuthorizationSource[];
	/** Definition
	  * ============
	  * Concept whose role is to define and measure a characteristic.
	  *
	  * Examples
	  * ==========
	  * The category "Male" is used to define or measure "Sex" or "Gender", which are characteristics. In turn, they are also variables. "Extremely Satisfied" is a category in an agreement scale. This can be used for many kinds of variables.
	  *
	  * Explanatory notes
	  * ===================
	  * A category is a concept, typically associated with a code in the representation of a variable value. Categories are most often used in the allowed values for qualitative, i.e., nominal and ordinal, variables. A set of categories, say "Male" and "Female" for characteristics "Sex" or "Gender," helps define those characteristics. For describing location of measurement station, you might have categories "Urban", "Suburban", "Rural", etc. */
	Category?: Category[];
	/** Definition
	  * ============
	  * Assigns a sequence number to a category within a list. */
	CategoryPosition?: CategoryPosition[];
	/** Definition
	  * ============
	  * Source-to-target relationship between categories in a structure.
	  *
	  * Examples
	  * ==========
	  * In the International Standard Industrial Classification of All Economic Activities (ISIC) Revision 4 (https://unstats.un.org/unsd/demographic-social/census/documents/isic_rev4.pdf), the super-type/sub-type relation is used throughout. The super-type "Manufacturing Sector" has among its sub-types "Manufacture of Rubber and Plastics Products" (division 22). In this example, the super-type is the source (Manufacturing Sector") and the sub-type is the target. The semantics attribute will provide the type of the relationship.
	  *
	  * Explanatory notes
	  * ===================
	  * Relationships between pairs of categories are linkages between them. The meaning of the linkage is determined by the relation. */
	CategoryRelationship?: CategoryRelationship[];
	/** Definition
	  * ============
	  * Description of the relationships between and among categories within a collection.
	  *
	  * Examples
	  * ==========
	  * The category of "student" might be described as having sub-types of "primary school student" and "high school student".
	  *
	  * Explanatory notes
	  * ===================
	  * The category relation structure employs a set of category relations to describe the relationship among concepts. Each category relation is a one to many description of connections between categories. Together they might commonly describe relationships as complex as a hierarchy or graph. This is a kind of a concept structure restricted to categories (which are concepts). Allows for the specification of complex relationships among categories. */
	CategoryRelationStructure?: CategoryRelationStructure[];
	/** Definition
	  * ============
	  * Concept system where the underlying concepts are categories.
	  *
	  * Examples
	  * ==========
	  * "Male" and "Female" categories in a category set named "Gender".
	  *
	  * Explanatory notes
	  * ===================
	  * The categories in a category set help define the meaning of the category set. Gender can be defined as "male or female" - see example above. A category set can be used directly by questions to express a set of response choices. */
	CategorySet?: CategorySet[];
	/** Definition
	  * ============
	  * Statistics related to a specific category of an instance variable within a data set.
	  *
	  * Examples
	  * ==========
	  * The percentage of females from a demographic data set.
	  *
	  * Explanatory notes
	  * ===================
	  * Statistics at the data set are used as indicators during assessment of the appropriateness of using a some data for a particular purpose. */
	CategoryStatistic?: CategoryStatistic[];
	/** Definition
	  * ============
	  * Collection of classification series related by being based on a common concept
	  *
	  * Examples
	  * ==========
	  * A set of classification series (e.g., International Standard Industrial Classification (ISIC) and North American Industrial Classification System (NAICS)) based on the same concept - economic activity or industry.
	  *
	  * Explanatory notes
	  * ===================
	  * Different classification databases may use different types of classification families and have different names for the families, as no standard has been agreed upon. [GSIM1.1] This is documented by the definingConcept relationship   (e.g. economic activity).[GSIM1.1]. */
	ClassificationFamily?: ClassificationFamily[];
	/** Definition
	  * ============
	  * Ordered list of classification index entries.
	  *
	  * Examples
	  * ==========
	  * An alphabetical index of a topically ordered statistical classification.
	  *
	  * Explanatory notes
	  * ===================
	  * A classification index shows the relationship between text found in statistical data sources (responses to survey questionnaires, administrative records) and one or more statistical classifications.  A classification index may be used to assign the codes for classification items to observations in statistical collections. Note that a GenericStatistical Information Model (GSIM) Node is the equivalent of a DDI-CDI Member, and a GSIM Node Set is a DDI-CDI Collection. A classification index can relate to one particular or to several statistical classifications. (See the GSIM Statistical Classification Model: https://statswiki.unece.org/display/gsim/Statistical+Classification+Model.) */
	ClassificationIndex?: ClassificationIndex[];
	/** Definition
	  * ============
	  * Word or a short phrase corresponding to a classification item in a statistical classification, together with the code of the corresponding classification item.
	  *
	  * Examples
	  * ==========
	  * The name of a locality, an economic activity, or an occupational title with the associated code from a corresponding classification item.
	  *
	  * Explanatory notes
	  * ===================
	  * Each Classification Index Entry (CIE) typically corresponds to one item of a Statistical Classification (SC). Although a CIE may be associated with a Classification Item (CI) at any Level of a SC, CIEs are normally associated with items at the lowest Level.
	  * A CIE corresponds to a CI if the CI classifies the CIE with respect to the SC of which the CI is a member.
	  * CIEs typically come from responses to survey questions or are verbatim descriptions in administrative records. */
	ClassificationIndexEntry?: ClassificationIndexEntry[];
	/** Definition
	  * ============
	  * Member indicator for use with member type classification index entry. */
	ClassificationIndexEntryPosition?: ClassificationIndexEntryPosition[];
	/** Definition
	  * ============
	  * A space for a category within a statistical classification.
	  *
	  * Examples
	  * ==========
	  * In the 2012 North American Industry Classification System (NAICS) one classification item has the category "construction", and has the Code 23, which designates construction in NAICS.
	  *
	  * Explanatory notes
	  * ===================
	  * A classification item defines the content and the borders of the category. A unit can be classified to one and only one item at each level of a statistical classification. As such a classification item is a placeholder for a position in a statistical classification. It contains a designation, for which code is a common kind; a category; and possibly other things.   This differentiates it from code which is a only kind of designation, in particular if it is an alphanumeric string assigned to stand in place of a category. Statistical classifications often have multiple levels. A level is defined as a set of classification items each the same number of relationships from the top or root classification item. */
	ClassificationItem?: ClassificationItem[];
	/** Definition
	  * ============
	  * Provides a classification item with an index conveying the order of the classification item within a sequence, expressed as an integer, progressing upward from 0 or 1. */
	ClassificationItemPosition?: ClassificationItemPosition[];
	/** Definition
	  * ============
	  * Source-target relationship between classification items in a classification item relation structure. */
	ClassificationItemRelationship?: ClassificationItemRelationship[];
}
export interface Wrapper extends _Wrapper { constructor: { new(): Wrapper }; }
export var Wrapper: { new(): Wrapper };

export interface document extends BaseType {
	/** Definition
	  * ============
	  * An activity is a task described at a conceptual level. It is not parameterized and as such is less reusable. For more logical/physical, fine-grained, reusable description there is a sub-type called step.
	  *
	  * Examples
	  * ==========
	  * Phases and sub-processes of the Generic Statistical Business Process Model (GSBPM) are examples of activity.
	  *
	  * Explanatory notes
	  * ===================
	  * An activity is invoked by control logic. It may use and/or produce information objects referenced with the entityUsed and entityProduced attributes. */
	Activity: Activity;
	/** Definition
	  * ==========
	  * Actor that performs a role in relation to a process or product.
	  *
	  * Examples
	  * ========
	  * Analyst performing edits on data, interviewer conducting an interview, a relational database management system managing data, organization publishing data on a regular basis, creator or contributor of a publication.
	  *
	  * Explanatory notes
	  * =================
	  * foaf:Agent is: An agent (eg. person, group, software or physical artifact). prov:Agent is: An agent is something that bears some form of responsibility for an activity taking place, for the existence of an entity, or for another agent's activity. */
	Agent: Agent;
	/** Definition
	  * ============
	  * Listing of agents of any type who may be organized to describe relationships between agents.
	  *
	  * Examples
	  * ==========
	  * Organizations contributing to a project. Individuals within an agency. All organizations, individuals, and machines identified within the collections of an archive. A listing of organizations contributing to a network for the purposes of providing data.
	  *
	  * Explanatory notes
	  * ===================
	  * Relationships between agents are fluid and reflect effective dates of the relationship. An agent may have multiple relationships which may be sequential or concurrent. Relationships may or may not be hierarchical in nature. All Agents are serialized individually and brought into relationships as appropriate. */
	AgentListing: AgentListing;
	/** Definition
	  * ============
	  * Assigns a sequence number to an agent in an agent listing. */
	AgentPosition: AgentPosition;
	/** Definition
	  * ============
	  * Defines the relation of an agent within a structure.
	  *
	  * Examples
	  * ==========
	  * An organization (source/parent) employing an individual (target/child); An individual (source/parent) supervisory to an individual (target/child); An organization (source/parent) overseeing a project (organization) (target/child). Select appropriate relationship using the controlled vocabulary available through the semantics attribute.
	  *
	  * Explanatory notes
	  * ===================
	  * Used to define the relations of agents in a hierarchical structure, or in other networks. Projects can be understood as temporary organizations. */
	AgentRelationship: AgentRelationship;
	/** Definition
	  * ============
	  * Defines the relationships between agents in a collection for a specified period and purpose.
	  *
	  * Examples
	  * ==========
	  * Individual employed by an organization. A unit or project (organization) within another organization. Individual supervised by another individual.
	  *
	  * Explanatory notes
	  * ===================
	  * Can describe relations between agents rather than roles within a project or in relationship to a product. Roles are defined by the parent class and relationship name that uses an agent as a target. */
	AgentStructure: AgentStructure;
	/** Definition
	  * ==========
	  * Control logic where the execution flow is determined by the satisfaction of temporal constraints specified with Allen's Interval Algebra over time intervals. Allen's interval algebra consists of thirteen temporal interval relations and the operations defined on them. Together these relations are distinct (any pair of definite intervals are described by one and only one of the relations), exhaustive (any pair of definite intervals are described by one of the relations), and qualitative (no numeric time spans are considered). See https://www.ics.uci.edu/~alspaugh/cls/shr/allen.html.
	  *
	  * Examples
	  * ========
	  * An Allen overlap indicates that within a sequence two procedures overlap in time.
	  *
	  * Explanatory notes
	  * =================
	  * Allen's intervals are pairwise. */
	AllenIntervalAlgebra: AllenIntervalAlgebra;
	/** Definition
	  * ============
	  * Role given to a represented variable in the context of a data structure to qualify observations or provide other types of supplementary information.
	  *
	  * Examples
	  * ==========
	  * The publication status of an observation (e.g. provisional, final, revised). */
	AttributeComponent: AttributeComponent;
	/** Definition
	  * ============
	  * Identifies the authorizing agency and allows for the full text of the authorization (law, regulation, or other form of authorization).
	  *
	  * Examples
	  * ==========
	  * May be used to list authorizations from oversight committees and other regulatory agencies.
	  *
	  * Explanatory notes
	  * ===================
	  * Supports requirements for some statistical offices to identify the agency or law authorizing the collection or management of data or metadata. */
	AuthorizationSource: AuthorizationSource;
	/** Definition
	  * ============
	  * Concept whose role is to define and measure a characteristic.
	  *
	  * Examples
	  * ==========
	  * The category "Male" is used to define or measure "Sex" or "Gender", which are characteristics. In turn, they are also variables. "Extremely Satisfied" is a category in an agreement scale. This can be used for many kinds of variables.
	  *
	  * Explanatory notes
	  * ===================
	  * A category is a concept, typically associated with a code in the representation of a variable value. Categories are most often used in the allowed values for qualitative, i.e., nominal and ordinal, variables. A set of categories, say "Male" and "Female" for characteristics "Sex" or "Gender," helps define those characteristics. For describing location of measurement station, you might have categories "Urban", "Suburban", "Rural", etc. */
	Category: Category;
	/** Definition
	  * ============
	  * Assigns a sequence number to a category within a list. */
	CategoryPosition: CategoryPosition;
	/** Definition
	  * ============
	  * Source-to-target relationship between categories in a structure.
	  *
	  * Examples
	  * ==========
	  * In the International Standard Industrial Classification of All Economic Activities (ISIC) Revision 4 (https://unstats.un.org/unsd/demographic-social/census/documents/isic_rev4.pdf), the super-type/sub-type relation is used throughout. The super-type "Manufacturing Sector" has among its sub-types "Manufacture of Rubber and Plastics Products" (division 22). In this example, the super-type is the source (Manufacturing Sector") and the sub-type is the target. The semantics attribute will provide the type of the relationship.
	  *
	  * Explanatory notes
	  * ===================
	  * Relationships between pairs of categories are linkages between them. The meaning of the linkage is determined by the relation. */
	CategoryRelationship: CategoryRelationship;
	/** Definition
	  * ============
	  * Description of the relationships between and among categories within a collection.
	  *
	  * Examples
	  * ==========
	  * The category of "student" might be described as having sub-types of "primary school student" and "high school student".
	  *
	  * Explanatory notes
	  * ===================
	  * The category relation structure employs a set of category relations to describe the relationship among concepts. Each category relation is a one to many description of connections between categories. Together they might commonly describe relationships as complex as a hierarchy or graph. This is a kind of a concept structure restricted to categories (which are concepts). Allows for the specification of complex relationships among categories. */
	CategoryRelationStructure: CategoryRelationStructure;
	/** Definition
	  * ============
	  * Concept system where the underlying concepts are categories.
	  *
	  * Examples
	  * ==========
	  * "Male" and "Female" categories in a category set named "Gender".
	  *
	  * Explanatory notes
	  * ===================
	  * The categories in a category set help define the meaning of the category set. Gender can be defined as "male or female" - see example above. A category set can be used directly by questions to express a set of response choices. */
	CategorySet: CategorySet;
	/** Definition
	  * ============
	  * Statistics related to a specific category of an instance variable within a data set.
	  *
	  * Examples
	  * ==========
	  * The percentage of females from a demographic data set.
	  *
	  * Explanatory notes
	  * ===================
	  * Statistics at the data set are used as indicators during assessment of the appropriateness of using a some data for a particular purpose. */
	CategoryStatistic: CategoryStatistic;
	/** Definition
	  * ============
	  * Collection of classification series related by being based on a common concept
	  *
	  * Examples
	  * ==========
	  * A set of classification series (e.g., International Standard Industrial Classification (ISIC) and North American Industrial Classification System (NAICS)) based on the same concept - economic activity or industry.
	  *
	  * Explanatory notes
	  * ===================
	  * Different classification databases may use different types of classification families and have different names for the families, as no standard has been agreed upon. [GSIM1.1] This is documented by the definingConcept relationship   (e.g. economic activity).[GSIM1.1]. */
	ClassificationFamily: ClassificationFamily;
	/** Definition
	  * ============
	  * Ordered list of classification index entries.
	  *
	  * Examples
	  * ==========
	  * An alphabetical index of a topically ordered statistical classification.
	  *
	  * Explanatory notes
	  * ===================
	  * A classification index shows the relationship between text found in statistical data sources (responses to survey questionnaires, administrative records) and one or more statistical classifications.  A classification index may be used to assign the codes for classification items to observations in statistical collections. Note that a GenericStatistical Information Model (GSIM) Node is the equivalent of a DDI-CDI Member, and a GSIM Node Set is a DDI-CDI Collection. A classification index can relate to one particular or to several statistical classifications. (See the GSIM Statistical Classification Model: https://statswiki.unece.org/display/gsim/Statistical+Classification+Model.) */
	ClassificationIndex: ClassificationIndex;
	/** Definition
	  * ============
	  * Word or a short phrase corresponding to a classification item in a statistical classification, together with the code of the corresponding classification item.
	  *
	  * Examples
	  * ==========
	  * The name of a locality, an economic activity, or an occupational title with the associated code from a corresponding classification item.
	  *
	  * Explanatory notes
	  * ===================
	  * Each Classification Index Entry (CIE) typically corresponds to one item of a Statistical Classification (SC). Although a CIE may be associated with a Classification Item (CI) at any Level of a SC, CIEs are normally associated with items at the lowest Level.
	  * A CIE corresponds to a CI if the CI classifies the CIE with respect to the SC of which the CI is a member.
	  * CIEs typically come from responses to survey questions or are verbatim descriptions in administrative records. */
	ClassificationIndexEntry: ClassificationIndexEntry;
	/** Definition
	  * ============
	  * Member indicator for use with member type classification index entry. */
	ClassificationIndexEntryPosition: ClassificationIndexEntryPosition;
	/** Definition
	  * ============
	  * A space for a category within a statistical classification.
	  *
	  * Examples
	  * ==========
	  * In the 2012 North American Industry Classification System (NAICS) one classification item has the category "construction", and has the Code 23, which designates construction in NAICS.
	  *
	  * Explanatory notes
	  * ===================
	  * A classification item defines the content and the borders of the category. A unit can be classified to one and only one item at each level of a statistical classification. As such a classification item is a placeholder for a position in a statistical classification. It contains a designation, for which code is a common kind; a category; and possibly other things.   This differentiates it from code which is a only kind of designation, in particular if it is an alphanumeric string assigned to stand in place of a category. Statistical classifications often have multiple levels. A level is defined as a set of classification items each the same number of relationships from the top or root classification item. */
	ClassificationItem: ClassificationItem;
	/** Definition
	  * ============
	  * Provides a classification item with an index conveying the order of the classification item within a sequence, expressed as an integer, progressing upward from 0 or 1. */
	ClassificationItemPosition: ClassificationItemPosition;
	/** Definition
	  * ============
	  * Source-target relationship between classification items in a classification item relation structure. */
	ClassificationItemRelationship: ClassificationItemRelationship;
	/** DDI-CDI Specification
	  * =====================
	  *
	  * The DDI-Cross Domain Integration (DDI-CDI) specification provides a
	  * model for working with a wide variety of research data across many
	  * scientific and policy domains. It provides a level of detail which
	  * supports machine-actionable processing of data, both within and between
	  * systems, and is designed to be easily aligned with other standards.
	  *
	  * It focuses on the key elements of the data management challenges facing
	  * research today: an exact understanding of data in a wide variety of
	  * formats, coming from many different sources. Two elements are critical
	  * for dealing with these challenges: a flexible means of describing data
	  * that can reveal the connections between the same data existing in
	  * different formats, and a means of describing the provenance of the data
	  * at a detailed (but comprehensible) level: the processes which produced
	  * it must be transparent.
	  *
	  * DDI-CDI covers these areas in a fashion intended to make it optimally
	  * useful to modern systems, which often employ a variety of models, and
	  * comply with a range of related specifications for both functions related
	  * to data description and process/provenance. The model is designed to be
	  * easy to fit into such systems, by aligning with relevant external
	  * standards, and to be align-able with them into the future.
	  *
	  * The core model field-level documentation is available in the section
	  * :ref:`DDICDIModels::DDICDILibrary`.
	  *
	  * The corresponding Git repository can be found at
	  * https://bitbucket.org/ddi-alliance/ddi-cdi/.
	  *
	  * Further information on DDI-CDI is available at the
	  * related DDI Alliance web page https://ddialliance.org/Specification/DDI-CDI/.
	  *
	  * Purpose
	  * -------
	  *
	  * The DDI-CDI specification describes a model and supporting elements for
	  * implementing it in the areas of data description and process/provenance.
	  * It is not intended to supplant existing specifications for these
	  * purposes, but to fill in the information which such specifications often
	  * do not capture. For data, this is the description of a single bit of
	  * information – a datum – which can be used to play different roles in
	  * different data structures and formats. For provenance and process, this
	  * is the packaging of specific machine-level processes, which may be
	  * described in many different ways, into a structure which relates them to
	  * the business processes described at a level understandable to human
	  * users.
	  *
	  * In order to serve this purpose, the DDI-CDI specification uses a Unified
	  * Modeling Language (UML) formalization so that it can be mapped against
	  * other models within systems more easily. Several different syntax
	  * expressions of the model are made available to support implementation.
	  *
	  * Several important features of the specification can be highlighted, to
	  * show how it serves this purpose:
	  *
	  * -  Domain-independence
	  *
	  * -  Datum-Oriented Data Description
	  *
	  * -  Provenance and Process Description
	  *
	  * -  Foundational Metadata
	  *
	  * -  Interoperability, Sustainability, and Alignment with Other Standards
	  *
	  * Each of these will be addressed in more detail, and an outline of the
	  * specification documents is presented.
	  *
	  * Key Features of the Specification
	  * ---------------------------------
	  *
	  * **Domain Independence**
	  *
	  * DDI-CDI is designed to be used with research data from any domain. In
	  * order to do this, it is fundamentally based on the structure and other
	  * generic aspects of the things it describes. It does not attempt to be a
	  * domain model of semantics, nor a model specific to the life-cycle of a
	  * particular domain of science or research. (Historically, DDI has focused
	  * on the Social, behavioral, and Economic [SBE] sciences and some types of
	  * health research – to see how DDI-CDI relates to other DDI
	  * specifications, see below.)
	  *
	  * DDI-CDI is intended to be complimentary to (and used in combination
	  * with) other standards and models which focus more on domain-specific
	  * aspects (such as semantics and life-cycle models). Such generic elements
	  * such as classifications and variables are given a detailed formal
	  * treatment but are agnostic as to the domain. It is left to the user to
	  * employ whatever domain semantics are demanded by the data with which
	  * they are working.
	  *
	  * This feature of the specification makes it well-suited to combining data
	  * coming from more than one domain or system, to allow a description that
	  * supports systems which perform data integration, harmonization, and
	  * similar functions. Cross-domain data sharing is becoming increasingly
	  * common, and DDI-CDI is intended to provide support for this type of
	  * application.
	  *
	  * **Datum-Oriented Data Description**
	  *
	  * DDI-CDI embraces a form of data description which is based on its atomic
	  * components: individual datums. Any given datum can play different roles
	  * in different formatting of the same data set, depending on how it is
	  * processed and transformed. In order to retain the continuity of a given
	  * datum across different formats and throughout a series of processes,
	  * DDI-CDI allows it to be described playing different roles in different
	  * structures.
	  *
	  * DDI-CDI provides four basic types of structural description for data
	  * sets: wide data, long data, dimensional data, and key-value data. These
	  * four types (and their sub-types) provide coverage for many common data
	  * formats today. While not comprehensive, they cover the majority of cases
	  * that the developers of this specification have seen. These include many
	  * of the newer forms of data such as streaming data, "big" data,
	  * registers, and instrument data. The underlying approach is one which
	  * could – and may be – expanded in future. By assigning appropriate roles
	  * to the variables which contain the datums across each of these different
	  * formats, however, it is possible to understand how data passes from one
	  * form to another.
	  *
	  * **Provenance and Process Description**
	  *
	  * If we are to fully understand data, we also need to know how it has been
	  * processed and transformed. Given our ability to describe how a different
	  * datum can be used in different data sets, it becomes desirable to
	  * understand also how those data sets relate to one another in terms of
	  * the processes which use them. This can be understood as an important
	  * aspect of data provenance.
	  *
	  * There are many different ways of describing process and provenance.
	  * Popular models include the Business Process Modelling and Notation
	  * (BPMN) standard and the PROV Ontology (from W3C). There are a multitude
	  * of syntaxes for driving data transformation, cleaning, and analysis in
	  * packages such as R, SAS, Stata, MATLab, SPSS, Python, and so on. There
	  * are also some emerging standard models for specifically describing such
	  * processes (e.g., Structured Data Transformation Language
	  * [SDTL], https://ddialliance.org/products/sdtl/1.0, Validation and
	  * Transformation Language [VTL], https://sdmx.org/?page_id=5096).
	  *
	  * DDI-CDI attempts to do something which complements the use of such
	  * models, by connecting specific processes interpretable by machines at
	  * the lowest level (described in a package-specific syntax or language)
	  * with the higher-level flows which combine these into human-readable
	  * documentation of business processes. Both traditional linear
	  * (deterministic) processing and the newer declarative (non-deterministic)
	  * processing approaches are supported.
	  *
	  * **Foundational Metadata**
	  *
	  * In order to formally describe data at a detailed level, there are many
	  * component elements which themselves must be modelled. Concepts used for
	  * statistical data but also widely applicable – including categories and
	  * variables – are a core part of this, but the range is broad. These
	  * components are included in DDI-CDI as "foundational metadata."
	  *
	  * Terminology for such constructs varies widely across domains. DDI-CDI
	  * has attempted to provide common terms for these components, and to adopt
	  * common models from other standards where it seemed useful.
	  *
	  * One area which deserves particular attention is the "variable cascade" –
	  * a model for how data are described at different points in their
	  * creation, processing, and use, which is designed to optimize reuse.
	  * While many different models have a "variable" of some form, the one
	  * presented in DDI-CDI reflects the experience of working with this
	  * important construct in many of the specifications and standards which
	  * have preceded it. It is a nuanced view of how variables relate and are
	  * understood across different systems, and – although not simple – it is a
	  * powerful model which helps solve some of the commonly encountered
	  * problems in data description and management.
	  *
	  * **Interoperability, Sustainability, and Alignment with Other Standards**
	  *
	  * DDI-CDI is fundamentally a model which is intended to be implemented
	  * across a wide variety of technology platforms, and in combination with
	  * many other standards, models, and specifications. To support this use,
	  * it is formalized using a limited subset of the Unified Modelling
	  * Language (UML) class diagram part. The model is provided in the form of
	  * Canonical XMI (restricted XML Metadata Interchange) – an interchange
	  * format for UML models supporting the import into many different
	  * modelling and development tools. Further, a syntax representation is
	  * provided in XML Schema, so that direct implementation of the model is
	  * possible if needed.
	  *
	  * The platform-independence of the model makes it more easily applicable
	  * across a broad range of applications and helps ensure that it will be
	  * sustainable even as the technology landscape evolves.
	  *
	  * DDI-CDI builds on many other standard models and is aligned with them
	  * where appropriate. This is shown in the model itself, where
	  * formalizations from other models and specifications are refined,
	  * extended, or directly used. The specification includes a description of
	  * what these other standards and models are, and how they are used in DDI-CDI.
	  *
	  * Credits
	  * -------
	  *
	  * Members of the Cross Domain Integration (CDI) Working Group shepherded the standard into its final form and produced the final documentation. Listed in alphabetical order they are:
	  *
	  * -  Arofan Gregory (chair)
	  * -  Dan Gillman
	  * -  Flavio Rizzolo
	  * -  Hilde Orten
	  * -  Jay Greenfield
	  * -  Joachim Wackerow
	  * -  Larry Hoyle
	  * -  Oliver Hopt
	  * -  Wendy Lee Thomas (Technical Committee contact)
	  *
	  * Over 100 people have contributed to the development of the Data Documentation Initiative Cross Domain Integration (DDI-CDI) specification. A more complete description of their contribution to the work can be found at https://bitbucket.org/ddi-alliance/ddi-cdi/src/master/CREDITS.md. */
	DDICDIModels: DDICDIModels;
	/** Definition
	  * ==========
	  * Information structured according to the DDI-CDI model for a specific purpose or purposes within a system or community. */
	Wrapper: Wrapper;
}
export var document: document;
