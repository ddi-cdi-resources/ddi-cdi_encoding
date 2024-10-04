import * as Primitive from '../../../../xml-primitives';

// Source files:
// http://localhost:8000/ddi-cdi_44_noXsdTypeInName.xsd


interface BaseType {
	_exists: boolean;
	_namespace: string;
}
/** Definition
  * ============
  * A set of information important for understanding access conditions. Examples include license, embargo details. */
interface _AccessInformation extends BaseType {
	/** The copyright statement. */
	copyright?: InternationalString[];
	/** Specific information about any relevant embargo */
	embargo?: EmbargoInformation[];
	/** Information about any relevant license */
	license?: LicenseInformation[];
	/** Information about rights held in and over the resource. Typically, rights information includes a statement about various property rights associated with the resource, including intellectual property rights. */
	rights?: InternationalString[];
}
export interface AccessInformation extends _AccessInformation { constructor: { new(): AccessInformation }; }
export var AccessInformation: { new(): AccessInformation };

/** Definition
  * ============
  * A set of access information for a machine including URI, mime type, and physical location. */
interface _AccessLocation extends BaseType {
	/** The MIME type. MIME stands for "Multipurpose Internet Mail Extensions. It's a way of identifying files on the Internet according to their nature and format. Supports the use of an controlled vocabulary. */
	mimeType?: ControlledVocabularyEntry;
	/** The physical location of the machine. */
	physicalLocation?: InternationalString[];
	/** A Uniform Resource Identifier (URI) is a string of characters that unambiguously identifies a particular resource. A URI is normally expressed as a URL. */
	uri?: string[];
}
export interface AccessLocation extends _AccessLocation { constructor: { new(): AccessLocation }; }
export var AccessLocation: { new(): AccessLocation };

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
	/** Natural language statement conveying the meaning of a concept, differentiating it from other concepts. Supports the use of multiple languages and structured text. 'externalDefinition' can't be used if 'definition' is used. */
	definition?: InternationalString;
	/** A description of the Activity in human-readable language. */
	description?: string;
	/** A human-readable display label for the object. Supports the use of multiple languages. Repeat for labels with different content, for example, labels with differing length limitations. */
	displayLabel?: LabelForDisplay[];
	/** The thing resulting from the activity. */
	entityProduced?: Reference[];
	/** A thing employed in the activity. */
	entityUsed?: Reference[];
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	/** Human understandable name (linguistic signifier, word, phrase, or mnemonic). May follow ISO/IEC 11179-5 naming principles, and have context provided to specify usage. */
	name?: ObjectName[];
	/** A reference to a standard process model from which the Activity is taken, such as The Generic Statistical Business Process Model (GSBPM), the Generic Longitudinal Business Process Model (GLBPM), Open Archive Information System (OAIS) model, etc. The model and step or sub-step corresponding to the Activity is noted here using the Paired External Controlled Vocabulary Entry. Enter the name of the model in "term" and the step, sub-step, or specific portion of the model in "extent". */
	standardModelMapping?: Reference[];
}
export interface Activity extends _Activity { constructor: { new(): Activity }; }
export var Activity: { new(): Activity };

interface _ActivityActivity_has_StepType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: ActivityActivity_has_StepTypeValidTypeType[];
}
interface ActivityActivity_has_StepType extends _ActivityActivity_has_StepType { constructor: { new(): ActivityActivity_has_StepType }; }

type ActivityActivity_has_StepTypeValidTypeType = "Step";
interface _ActivityActivity_has_StepTypeValidTypeType extends Primitive._string { content: ActivityActivity_has_StepTypeValidTypeType; }

interface _ActivityActivity_hasInternal_ControlLogicType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: ActivityActivity_hasInternal_ControlLogicTypeValidTypeType[];
}
interface ActivityActivity_hasInternal_ControlLogicType extends _ActivityActivity_hasInternal_ControlLogicType { constructor: { new(): ActivityActivity_hasInternal_ControlLogicType }; }

type ActivityActivity_hasInternal_ControlLogicTypeValidTypeType = ("AllenIntervalAlgebra" | "ConditionalControlLogic" | "ControlLogic" | "DeterministicImperative" | "NonDeterministicDeclarative" | "RuleBasedScheduling" | "Sequence" | "TemporalConstraints" | "TemporalControlConstruct");
interface _ActivityActivity_hasInternal_ControlLogicTypeValidTypeType extends Primitive._string { content: ActivityActivity_hasInternal_ControlLogicTypeValidTypeType; }

interface _ActivityActivity_hasSubActivity_ActivityType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: ActivityActivity_hasSubActivity_ActivityTypeValidTypeType[];
}
interface ActivityActivity_hasSubActivity_ActivityType extends _ActivityActivity_hasSubActivity_ActivityType { constructor: { new(): ActivityActivity_hasSubActivity_ActivityType }; }

type ActivityActivity_hasSubActivity_ActivityTypeValidTypeType = ("Activity" | "Step");
interface _ActivityActivity_hasSubActivity_ActivityTypeValidTypeType extends Primitive._string { content: ActivityActivity_hasSubActivity_ActivityTypeValidTypeType; }

/** Definition
  * ==========
  * Location address identifying each part of the address as separate elements, identifying the type of address, the level of privacy associated with the release of the address, and a flag to identify the preferred address for contact.
  *
  * Examples
  * ========
  * For example:
  *
  * 1. OFFICE, ABS HOUSE, 45 Benjamin Way, Belconnen, Canberra, ACT, 2617, AU
  * 2. OFFICE, Institute of Education, 20 Bedford Way, London, WC1H 0AL, UK */
interface _Address extends BaseType {
	/** City, place, or local area used as part of an address. */
	cityPlaceLocal?: string;
	/** Country of the location. */
	countryCode?: ControlledVocabularyEntry;
	/** Clarifies when the identification information is accurate. */
	effectiveDates?: DateRange;
	/** Geographic coordinates corresponding to the address. */
	geographicPoint?: SpatialPoint;
	/** Set to True if this is the preferred location for contacting the organization or individual. */
	isPreferred?: boolean;
	/** Number and street including office or suite number. May use multiple lines. */
	line?: string[];
	/** Name of the location if applicable. */
	locationName?: ObjectName;
	/** Postal or ZIP Code. */
	postalCode?: string;
	/** Specify the level privacy for the address as public, restricted, or private. Supports the use of an external controlled vocabulary. */
	privacy?: ControlledVocabularyEntry;
	/** The region covered by the agent at this address. */
	regionalCoverage?: ControlledVocabularyEntry;
	/** A major sub-national division such as a state or province used to identify a major region within an address. */
	stateProvince?: string;
	/** Time zone of the location expressed as code. */
	timeZone?: ControlledVocabularyEntry;
	/** Indicates address type (i.e. home, office, mailing, etc.). */
	typeOfAddress?: ControlledVocabularyEntry;
	/** The type or purpose of the location (i.e. regional office, distribution center, home). */
	typeOfLocation?: ControlledVocabularyEntry;
}
export interface Address extends _Address { constructor: { new(): Address }; }
export var Address: { new(): Address };

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
interface _Agent extends BaseType {
	/** Bundles the information useful for a data catalog entry. Examples would be creator, contributor, title, copyright, embargo, and license information. A set of information useful for attribution, data discovery, and access. This is information that is tied to the identity of the object. If this information changes the version of the associated object changes. */
	catalogDetails?: CatalogDetails;
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	/** Information regarding image associated with the agent. */
	image?: PrivateImage[];
	/** Intent or reason for the object/the description of the object. */
	purpose?: InternationalString;
}
export interface Agent extends _Agent { constructor: { new(): Agent }; }
export var Agent: { new(): Agent };

/** Definition
  * ==========
  * A reference to an agent (organization, individual, or machine) including a role for that agent in the context of this specific reference.
  *
  * Examples
  * ========
  * Reference to John Doe as the lead author. */
interface _AgentInRole extends BaseType {
	/** Full name of the contributor. Language equivalents should be expressed within the international string structure. */
	agentName?: BibliographicName;
	/** Reference to an agent described in DDI or some other platform. */
	reference?: Reference;
	/** Role of the of the agent within the context of the parent property name. */
	role?: PairedControlledVocabularyEntry[];
}
export interface AgentInRole extends _AgentInRole { constructor: { new(): AgentInRole }; }
export var AgentInRole: { new(): AgentInRole };

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
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	/** Human understandable name (liguistic signifier, word, phrase, or mnemonic). May follow ISO/IEC 11179-5 naming principles, and have context provided to specify usage. */
	name?: ObjectName[];
	/** Intent or reason for the object/the description of the object. */
	purpose?: InternationalString;
}
export interface AgentListing extends _AgentListing { constructor: { new(): AgentListing }; }
export var AgentListing: { new(): AgentListing };

interface _AgentListingAgentListing_has_AgentPositionType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType: AgentListingAgentListing_has_AgentPositionTypeValidTypeType[];
}
interface AgentListingAgentListing_has_AgentPositionType extends _AgentListingAgentListing_has_AgentPositionType { constructor: { new(): AgentListingAgentListing_has_AgentPositionType }; }

type AgentListingAgentListing_has_AgentPositionTypeValidTypeType = "AgentPosition";
interface _AgentListingAgentListing_has_AgentPositionTypeValidTypeType extends Primitive._string { content: AgentListingAgentListing_has_AgentPositionTypeValidTypeType; }

interface _AgentListingAgentListing_has_AgentType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: AgentListingAgentListing_has_AgentTypeValidTypeType[];
}
interface AgentListingAgentListing_has_AgentType extends _AgentListingAgentListing_has_AgentType { constructor: { new(): AgentListingAgentListing_has_AgentType }; }

type AgentListingAgentListing_has_AgentTypeValidTypeType = ("Agent" | "Curator" | "Individual" | "Machine" | "Organization" | "ProcessingAgent" | "Service");
interface _AgentListingAgentListing_has_AgentTypeValidTypeType extends Primitive._string { content: AgentListingAgentListing_has_AgentTypeValidTypeType; }

interface _AgentListingAgentListing_isDefinedBy_ConceptType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: AgentListingAgentListing_isDefinedBy_ConceptTypeValidTypeType[];
}
interface AgentListingAgentListing_isDefinedBy_ConceptType extends _AgentListingAgentListing_isDefinedBy_ConceptType { constructor: { new(): AgentListingAgentListing_isDefinedBy_ConceptType }; }

type AgentListingAgentListing_isDefinedBy_ConceptTypeValidTypeType = ("Category" | "Concept" | "ConceptualValue" | "ConceptualVariable" | "DescriptorVariable" | "DimensionalKeyDefinitionMember" | "InstanceVariable" | "KeyDefinitionMember" | "Population" | "ReferenceVariable" | "RepresentedVariable" | "UnitType" | "Universe");
interface _AgentListingAgentListing_isDefinedBy_ConceptTypeValidTypeType extends Primitive._string { content: AgentListingAgentListing_isDefinedBy_ConceptTypeValidTypeType; }

interface _AgentListingAgentListing_isMaintainedBy_AgentType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
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
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	/** The index of the agent within an agent listing. */
	value: number;
}
export interface AgentPosition extends _AgentPosition { constructor: { new(): AgentPosition }; }
export var AgentPosition: { new(): AgentPosition };

interface _AgentPositionAgentPosition_indexes_AgentType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
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
	/** Effective dates of the relationship expressed as a start and end Date (using ISO and/or non-ISO date structures). */
	effectiveDates?: DateRange;
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	/** Specifies the semantics of the object in reference to a vocabulary, ontology, etc. */
	semantics?: ControlledVocabularyEntry;
}
export interface AgentRelationship extends _AgentRelationship { constructor: { new(): AgentRelationship }; }
export var AgentRelationship: { new(): AgentRelationship };

interface _AgentRelationshipAgentRelationship_hasSource_AgentType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: AgentRelationshipAgentRelationship_hasSource_AgentTypeValidTypeType[];
}
interface AgentRelationshipAgentRelationship_hasSource_AgentType extends _AgentRelationshipAgentRelationship_hasSource_AgentType { constructor: { new(): AgentRelationshipAgentRelationship_hasSource_AgentType }; }

type AgentRelationshipAgentRelationship_hasSource_AgentTypeValidTypeType = ("Agent" | "Curator" | "Individual" | "Machine" | "Organization" | "ProcessingAgent" | "Service");
interface _AgentRelationshipAgentRelationship_hasSource_AgentTypeValidTypeType extends Primitive._string { content: AgentRelationshipAgentRelationship_hasSource_AgentTypeValidTypeType; }

interface _AgentRelationshipAgentRelationship_hasTarget_AgentType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
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
	/** The effective start and end date of the relationship. */
	effectiveDates?: DateRange;
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	/** Human understandable name (liguistic signifier, word, phrase, or mnemonic). May follow ISO/IEC 11179-5 naming principles, and have context provided to specify usage. */
	name?: ObjectName[];
	/** Level of privacy regarding this relationship. */
	privacy?: ControlledVocabularyEntry;
	/** Intent or reason for the object/the description of the object. */
	purpose?: InternationalString;
	/** Specifies the semantics of the object in reference to a vocabulary, ontology, etc. */
	semantics?: ControlledVocabularyEntry;
	/** Provides information on reflexivity, transitivity, and symmetry of relationship using a descriptive term from an enumerated list. Use if all relations within this relation structure are of the same specification. */
	specification?: StructureSpecification;
	/** Indicates the form of the associations among members of the collection. Specifies the way in which constituent parts are interrelated or arranged. */
	topology?: ControlledVocabularyEntry;
	/** Indicates whether the related collections are comprehensive in terms of their coverage. */
	totality?: StructureExtent;
}
export interface AgentStructure extends _AgentStructure { constructor: { new(): AgentStructure }; }
export var AgentStructure: { new(): AgentStructure };

interface _AgentStructureAgentStructure_has_AgentRelationshipType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType: AgentStructureAgentStructure_has_AgentRelationshipTypeValidTypeType[];
}
interface AgentStructureAgentStructure_has_AgentRelationshipType extends _AgentStructureAgentStructure_has_AgentRelationshipType { constructor: { new(): AgentStructureAgentStructure_has_AgentRelationshipType }; }

type AgentStructureAgentStructure_has_AgentRelationshipTypeValidTypeType = "AgentRelationship";
interface _AgentStructureAgentStructure_has_AgentRelationshipTypeValidTypeType extends Primitive._string { content: AgentStructureAgentStructure_has_AgentRelationshipTypeValidTypeType; }

interface _AgentStructureAgentStructure_structures_AgentListingType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
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
interface _AllenIntervalAlgebra extends _TemporalConstraints {
	/** Temporal constraint specified as an Allen's interval relation. */
	temporalIntervalRelation: TemporalRelation;
}
export interface AllenIntervalAlgebra extends _AllenIntervalAlgebra { constructor: { new(): AllenIntervalAlgebra }; }
export var AllenIntervalAlgebra: { new(): AllenIntervalAlgebra };

/** Definition
  * ============
  * Provides a way of pointing to resources outside of the information described in the set of DDI-CDI metadata. */
interface _AssociationReference extends _IntermediateAssociationReference {
	/** A DDI type reference to a DDI object. */
	ddiReference?: InternationalRegistrationDataIdentifier;
	/** The expected type of the reference (e.g., the class or element according to the schema of the referenced resource). */
	validType?: string[];
}
export interface AssociationReference extends _AssociationReference { constructor: { new(): AssociationReference }; }
export var AssociationReference: { new(): AssociationReference };

/** Definition
  * ============
  * Role given to a represented variable in the context of a data structure to qualify observations or provide other types of supplementary information.
  *
  * Examples
  * ==========
  * The publication status of an observation (e.g. provisional, final, revised). */
interface _AttributeComponent extends _DataStructureComponent {
	AttributeComponent_qualifies_DataStructureComponent?: AttributeComponentAttributeComponent_qualifies_DataStructureComponentType[];
}
export interface AttributeComponent extends _AttributeComponent { constructor: { new(): AttributeComponent }; }
export var AttributeComponent: { new(): AttributeComponent };

interface _AttributeComponentAttributeComponent_qualifies_DataStructureComponentType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
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
	/** Identifies the date of authorization. */
	authorizationDate?: CombinedDate;
	AuthorizationSource_has_Agent?: AuthorizationSourceAuthorizationSource_has_AgentType[];
	/** Bundles the information useful for a data catalog entry.
	  *
	  * Examples would be creator, contributor, title, copyright, embargo, and license information
	  *
	  * A set of information useful for attribution, data discovery, and access.
	  * This is information that is tied to the identity of the object. If this information changes the version of the associated object changes. */
	catalogDetails?: CatalogDetails;
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	/** Provide a legal citation to a law authorizing the study/data collection. For example, a legal citation for a law authorizing a country's census. */
	legalMandate?: InternationalString;
	/** Intent or reason for the object/the description of the object. */
	purpose?: InternationalString;
	/** Text of the authorization (law, mandate, approved business case). */
	statementOfAuthorization?: InternationalString;
}
export interface AuthorizationSource extends _AuthorizationSource { constructor: { new(): AuthorizationSource }; }
export var AuthorizationSource: { new(): AuthorizationSource };

interface _AuthorizationSourceAuthorizationSource_has_AgentType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: AuthorizationSourceAuthorizationSource_has_AgentTypeValidTypeType[];
}
interface AuthorizationSourceAuthorizationSource_has_AgentType extends _AuthorizationSourceAuthorizationSource_has_AgentType { constructor: { new(): AuthorizationSourceAuthorizationSource_has_AgentType }; }

type AuthorizationSourceAuthorizationSource_has_AgentTypeValidTypeType = ("Agent" | "Curator" | "Individual" | "Machine" | "Organization" | "ProcessingAgent" | "Service");
interface _AuthorizationSourceAuthorizationSource_has_AgentTypeValidTypeType extends Primitive._string { content: AuthorizationSourceAuthorizationSource_has_AgentTypeValidTypeType; }

/** Definition
  * ============
  * Personal names should be listed surname or family name first, followed by forename or given name. When in doubt, give the name as it appears, and do not invert. In the case of organizations where there is clearly a hierarchy present, list the parts of the hierarchy from largest to smallest, separated by full stops and a space. If it is not clear whether there is a hierarchy present, or unclear which is the larger or smaller portion of the body, give the name as it appears in the item. The name may be provided in one or more languages. */
interface _BibliographicName extends _InternationalString {
	/** The affiliation of this person to an organization. This is generally an organization or sub-organization name and should be related to the specific role within which the individual is being listed. */
	affiliation?: string;
}
export interface BibliographicName extends _BibliographicName { constructor: { new(): BibliographicName }; }
export var BibliographicName: { new(): BibliographicName };

/** Definition
  * ============
  * A set of information useful for attribution, data discovery, and access.
  *
  * Examples
  * ==========
  * Creator, contributor, title, copyright, license information. */
interface _CatalogDetails extends BaseType {
	/** Information important for understanding access conditions. */
	access?: AccessInformation[];
	/** An alternative title by which a data collection is commonly referred, or an abbreviation for the title. */
	alternativeTitle?: InternationalString[];
	/** The name of a contributing author or creator, who worked in support of the primary creator given above. */
	contributor?: AgentInRole[];
	/** Person, corporate body, or agency responsible for the substantive and intellectual content of the described object. */
	creator?: AgentInRole[];
	/** A date associated with the annotated object (not the coverage period). Use typeOfDate to specify the type of date such as Version, Publication, Submitted, Copyrighted, Accepted, etc. */
	date?: CombinedDate[];
	/** An identifier or locator. Contains identifier and Managing agency (ISBN, ISSN, DOI, local archive). Indicates if it is a URI. */
	identifier?: InternationalIdentifier;
	/** The name or identifier of source information for the annotated object. */
	informationSource?: InternationalString[];
	/** Language of the intellectual content of the described object. Multiple languages are supported by the structure itself as defined in the transformation to specific bindings. Use language codes supported by xs:language which include the 2 and 3 character and extended structures defined by RFC4646 or its successors. Supports multiple language codes. */
	languageOfObject?: string[];
	/** Information about the origins of the object. */
	provenance?: ProvenanceInformation;
	/** Person or organization responsible for making the resource available in its present form. */
	publisher?: AgentInRole[];
	/** Provide the identifier, managing agency, and type of resource related to this object. Use to specify related resources similar to Dublin Core isPartOf and hasPart to indicate collection/series membership for objects where there is an identifiable record. If not an identified object use the relationship to ExternalMaterial using a type that indicates a series description. */
	relatedResource?: Reference[];
	/** Secondary or explanatory title. */
	subTitle?: InternationalString[];
	/** A summary description (abstract) of the annotated object. */
	summary?: InternationalString;
	/** Full authoritative title. List any additional titles for this item as alternativeTitle. */
	title?: InternationalString;
	/** Provide the type of the resource. This supports the use of a controlled vocabulary. It should be appropriate to the level of the annotation. */
	typeOfResource?: ControlledVocabularyEntry[];
}
export interface CatalogDetails extends _CatalogDetails { constructor: { new(): CatalogDetails }; }
export var CatalogDetails: { new(): CatalogDetails };

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
interface _Category extends _Concept {
	/** A short natural language account of the characteristics of the object. */
	descriptiveText?: InternationalString;
}
export interface Category extends _Category { constructor: { new(): Category }; }
export var Category: { new(): Category };

/** Definition
  * ============
  * Assigns a sequence number to a category within a list. */
interface _CategoryPosition extends BaseType {
	CategoryPosition_indexes_Category: CategoryPositionCategoryPosition_indexes_CategoryType;
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	/** Index value of the member in an ordered array. */
	value: number;
}
export interface CategoryPosition extends _CategoryPosition { constructor: { new(): CategoryPosition }; }
export var CategoryPosition: { new(): CategoryPosition };

interface _CategoryPositionCategoryPosition_indexes_CategoryType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: CategoryPositionCategoryPosition_indexes_CategoryTypeValidTypeType[];
}
interface CategoryPositionCategoryPosition_indexes_CategoryType extends _CategoryPositionCategoryPosition_indexes_CategoryType { constructor: { new(): CategoryPositionCategoryPosition_indexes_CategoryType }; }

type CategoryPositionCategoryPosition_indexes_CategoryTypeValidTypeType = "Category";
interface _CategoryPositionCategoryPosition_indexes_CategoryTypeValidTypeType extends Primitive._string { content: CategoryPositionCategoryPosition_indexes_CategoryTypeValidTypeType; }

/** Definition
  * ============
  * Indicates the type of relationship, nominal, ordinal, interval, ratio, or continuous. Use where appropriate for the representation type. */
export type CategoryRelationCode = ("Continuous" | "Interval" | "Nominal" | "Ordinal" | "Ratio");
interface _CategoryRelationCode extends Primitive._string { content: CategoryRelationCode; }

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
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	/** Specifies the semantics of the object in reference to a vocabulary, ontology, etc. */
	semantics?: ControlledVocabularyEntry;
}
export interface CategoryRelationship extends _CategoryRelationship { constructor: { new(): CategoryRelationship }; }
export var CategoryRelationship: { new(): CategoryRelationship };

interface _CategoryRelationshipCategoryRelationship_hasSource_CategoryType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: CategoryRelationshipCategoryRelationship_hasSource_CategoryTypeValidTypeType[];
}
interface CategoryRelationshipCategoryRelationship_hasSource_CategoryType extends _CategoryRelationshipCategoryRelationship_hasSource_CategoryType { constructor: { new(): CategoryRelationshipCategoryRelationship_hasSource_CategoryType }; }

type CategoryRelationshipCategoryRelationship_hasSource_CategoryTypeValidTypeType = "Category";
interface _CategoryRelationshipCategoryRelationship_hasSource_CategoryTypeValidTypeType extends Primitive._string { content: CategoryRelationshipCategoryRelationship_hasSource_CategoryTypeValidTypeType; }

interface _CategoryRelationshipCategoryRelationship_hasTarget_CategoryType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
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
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	/** Human understandable name (liguistic signifier, word, phrase, or mnemonic). May follow ISO/IEC 11179-5 naming principles, and have context provided to specify usage. */
	name?: ObjectName[];
	/** Intent or reason for the object/the description of the object. */
	purpose?: InternationalString;
	/** Specifies the semantics of the object in reference to a vocabulary, ontology, etc. */
	semantics?: ControlledVocabularyEntry;
	/** Provides information on reflexivity, transitivity, and symmetry of relationship using a descriptive term from an enumerated list. Use if all relations within this relation structure are of the same specification. */
	specification?: StructureSpecification;
	/** Indicates the form of the associations among members of the collection. Specifies the way in which constituent parts are interrelated or arranged. */
	topology?: ControlledVocabularyEntry;
	/** Indicates whether the related collections are comprehensive in terms of their coverage. */
	totality?: StructureExtent;
}
export interface CategoryRelationStructure extends _CategoryRelationStructure { constructor: { new(): CategoryRelationStructure }; }
export var CategoryRelationStructure: { new(): CategoryRelationStructure };

interface _CategoryRelationStructureCategoryRelationStructure_has_CategoryRelationshipType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType: CategoryRelationStructureCategoryRelationStructure_has_CategoryRelationshipTypeValidTypeType[];
}
interface CategoryRelationStructureCategoryRelationStructure_has_CategoryRelationshipType extends _CategoryRelationStructureCategoryRelationStructure_has_CategoryRelationshipType { constructor: { new(): CategoryRelationStructureCategoryRelationStructure_has_CategoryRelationshipType }; }

type CategoryRelationStructureCategoryRelationStructure_has_CategoryRelationshipTypeValidTypeType = "CategoryRelationship";
interface _CategoryRelationStructureCategoryRelationStructure_has_CategoryRelationshipTypeValidTypeType extends Primitive._string { content: CategoryRelationStructureCategoryRelationStructure_has_CategoryRelationshipTypeValidTypeType; }

interface _CategoryRelationStructureCategoryRelationStructure_structures_CategorySetType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
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
interface _CategorySet extends _ConceptSystem {
	CategorySet_has_Category?: CategorySetCategorySet_has_CategoryType[];
	CategorySet_has_CategoryPosition?: CategorySetCategorySet_has_CategoryPositionType[];
}
export interface CategorySet extends _CategorySet { constructor: { new(): CategorySet }; }
export var CategorySet: { new(): CategorySet };

interface _CategorySetCategorySet_has_CategoryPositionType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType: CategorySetCategorySet_has_CategoryPositionTypeValidTypeType[];
}
interface CategorySetCategorySet_has_CategoryPositionType extends _CategorySetCategorySet_has_CategoryPositionType { constructor: { new(): CategorySetCategorySet_has_CategoryPositionType }; }

type CategorySetCategorySet_has_CategoryPositionTypeValidTypeType = "CategoryPosition";
interface _CategorySetCategorySet_has_CategoryPositionTypeValidTypeType extends Primitive._string { content: CategorySetCategorySet_has_CategoryPositionTypeValidTypeType; }

interface _CategorySetCategorySet_has_CategoryType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
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
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	/** The value of the identified type of statistic for the category. May be repeated to provide unweighted or weighted values and different computation bases. */
	statistic?: Statistic[];
	/** Indicates the type of information about the appearance of categories within the instance variable. */
	typeOfCategoryStatistic?: ControlledVocabularyEntry;
}
export interface CategoryStatistic extends _CategoryStatistic { constructor: { new(): CategoryStatistic }; }
export var CategoryStatistic: { new(): CategoryStatistic };

interface _CategoryStatisticCategoryStatistic_appliesTo_InstanceVariableType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: CategoryStatisticCategoryStatistic_appliesTo_InstanceVariableTypeValidTypeType[];
}
interface CategoryStatisticCategoryStatistic_appliesTo_InstanceVariableType extends _CategoryStatisticCategoryStatistic_appliesTo_InstanceVariableType { constructor: { new(): CategoryStatisticCategoryStatistic_appliesTo_InstanceVariableType }; }

type CategoryStatisticCategoryStatistic_appliesTo_InstanceVariableTypeValidTypeType = "InstanceVariable";
interface _CategoryStatisticCategoryStatistic_appliesTo_InstanceVariableTypeValidTypeType extends Primitive._string { content: CategoryStatisticCategoryStatistic_appliesTo_InstanceVariableTypeValidTypeType; }

interface _CategoryStatisticCategoryStatistic_for_CategoryType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
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
	/** Bundles the information useful for a data catalog entry.
	  *
	  * Examples would be creator, contributor, title, copyright, embargo, and license information
	  *
	  * A set of information useful for attribution, data discovery, and access.
	  * This is information that is tied to the identity of the object. If this information changes the version of the associated object changes. */
	catalogDetails?: CatalogDetails;
	ClassificationFamily_groups_ClassificationSeries?: ClassificationFamilyClassificationFamily_groups_ClassificationSeriesType[];
	/** The conceptual basis for the collection of members. */
	ClassificationFamily_isDefinedBy_Concept?: ClassificationFamilyClassificationFamily_isDefinedBy_ConceptType[];
	/** Classification indexes associated to the classification family. */
	ClassificationFamily_uses_ClassificationIndex?: ClassificationFamilyClassificationFamily_uses_ClassificationIndexType[];
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	/** Human understandable name (liguistic signifier, word, phrase, or mnemonic). May follow ISO/IEC 11179-5 naming principles, and have context provided to specify usage. */
	name?: ObjectName[];
	/** Intent or reason for the object/the description of the object. */
	purpose?: InternationalString;
}
export interface ClassificationFamily extends _ClassificationFamily { constructor: { new(): ClassificationFamily }; }
export var ClassificationFamily: { new(): ClassificationFamily };

interface _ClassificationFamilyClassificationFamily_groups_ClassificationSeriesType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: ClassificationFamilyClassificationFamily_groups_ClassificationSeriesTypeValidTypeType[];
}
interface ClassificationFamilyClassificationFamily_groups_ClassificationSeriesType extends _ClassificationFamilyClassificationFamily_groups_ClassificationSeriesType { constructor: { new(): ClassificationFamilyClassificationFamily_groups_ClassificationSeriesType }; }

type ClassificationFamilyClassificationFamily_groups_ClassificationSeriesTypeValidTypeType = "ClassificationSeries";
interface _ClassificationFamilyClassificationFamily_groups_ClassificationSeriesTypeValidTypeType extends Primitive._string { content: ClassificationFamilyClassificationFamily_groups_ClassificationSeriesTypeValidTypeType; }

interface _ClassificationFamilyClassificationFamily_isDefinedBy_ConceptType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: ClassificationFamilyClassificationFamily_isDefinedBy_ConceptTypeValidTypeType[];
}
interface ClassificationFamilyClassificationFamily_isDefinedBy_ConceptType extends _ClassificationFamilyClassificationFamily_isDefinedBy_ConceptType { constructor: { new(): ClassificationFamilyClassificationFamily_isDefinedBy_ConceptType }; }

type ClassificationFamilyClassificationFamily_isDefinedBy_ConceptTypeValidTypeType = ("Category" | "Concept" | "ConceptualValue" | "ConceptualVariable" | "DescriptorVariable" | "DimensionalKeyDefinitionMember" | "InstanceVariable" | "KeyDefinitionMember" | "Population" | "ReferenceVariable" | "RepresentedVariable" | "UnitType" | "Universe");
interface _ClassificationFamilyClassificationFamily_isDefinedBy_ConceptTypeValidTypeType extends Primitive._string { content: ClassificationFamilyClassificationFamily_isDefinedBy_ConceptTypeValidTypeType; }

interface _ClassificationFamilyClassificationFamily_uses_ClassificationIndexType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
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
	/** Bundles the information useful for a data catalog entry.
	  *
	  * Examples would be creator, contributor, title, copyright, embargo, and license information
	  *
	  * A set of information useful for attribution, data discovery, and access.
	  * This is information that is tied to the identity of the object. If this information changes the version of the associated object changes. */
	catalogDetails?: CatalogDetails;
	ClassificationIndex_has_ClassificationIndexEntry?: ClassificationIndexClassificationIndex_has_ClassificationIndexEntryType[];
	ClassificationIndex_has_ClassificationIndexEntryPosition?: ClassificationIndexClassificationIndex_has_ClassificationIndexEntryPositionType[];
	/** Person(s) who may be contacted for additional information about the classification index. */
	ClassificationIndex_hasContact_Agent?: ClassificationIndexClassificationIndex_hasContact_AgentType[];
	/** The conceptual basis for the collection of members. */
	ClassificationIndex_isDefinedBy_Concept?: ClassificationIndexClassificationIndex_isDefinedBy_ConceptType[];
	/** The unit or group of persons within the organization responsible for the classification index (i.e., for adding, changing or deleting classification index entries). */
	ClassificationIndex_isMaintainedBy_Agent?: ClassificationIndexClassificationIndex_isMaintainedBy_AgentType;
	/** Additional information which drives the coding process for all entries in a Classification Index. */
	codingInstruction?: CommandCode[];
	/** Verbal summary description of corrections, which have occurred within the Classification Index. Corrections include changing the item code associated with a classification index entry. */
	corrections?: InternationalString[];
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	/** Human understandable name (liguistic signifier, word, phrase, or mnemonic). May follow ISO/IEC 11179-5 naming principles, and have context provided to specify usage. */
	name?: ObjectName[];
	/** Intent or reason for the object/the description of the object. */
	purpose?: InternationalString;
	/** Date when the current version of the classification index was released. */
	releaseDate?: CombinedDate;
}
export interface ClassificationIndex extends _ClassificationIndex { constructor: { new(): ClassificationIndex }; }
export var ClassificationIndex: { new(): ClassificationIndex };

interface _ClassificationIndexClassificationIndex_has_ClassificationIndexEntryPositionType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType: ClassificationIndexClassificationIndex_has_ClassificationIndexEntryPositionTypeValidTypeType[];
}
interface ClassificationIndexClassificationIndex_has_ClassificationIndexEntryPositionType extends _ClassificationIndexClassificationIndex_has_ClassificationIndexEntryPositionType { constructor: { new(): ClassificationIndexClassificationIndex_has_ClassificationIndexEntryPositionType }; }

type ClassificationIndexClassificationIndex_has_ClassificationIndexEntryPositionTypeValidTypeType = "ClassificationIndexEntryPosition";
interface _ClassificationIndexClassificationIndex_has_ClassificationIndexEntryPositionTypeValidTypeType extends Primitive._string { content: ClassificationIndexClassificationIndex_has_ClassificationIndexEntryPositionTypeValidTypeType; }

interface _ClassificationIndexClassificationIndex_has_ClassificationIndexEntryType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: ClassificationIndexClassificationIndex_has_ClassificationIndexEntryTypeValidTypeType[];
}
interface ClassificationIndexClassificationIndex_has_ClassificationIndexEntryType extends _ClassificationIndexClassificationIndex_has_ClassificationIndexEntryType { constructor: { new(): ClassificationIndexClassificationIndex_has_ClassificationIndexEntryType }; }

type ClassificationIndexClassificationIndex_has_ClassificationIndexEntryTypeValidTypeType = "ClassificationIndexEntry";
interface _ClassificationIndexClassificationIndex_has_ClassificationIndexEntryTypeValidTypeType extends Primitive._string { content: ClassificationIndexClassificationIndex_has_ClassificationIndexEntryTypeValidTypeType; }

interface _ClassificationIndexClassificationIndex_hasContact_AgentType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: ClassificationIndexClassificationIndex_hasContact_AgentTypeValidTypeType[];
}
interface ClassificationIndexClassificationIndex_hasContact_AgentType extends _ClassificationIndexClassificationIndex_hasContact_AgentType { constructor: { new(): ClassificationIndexClassificationIndex_hasContact_AgentType }; }

type ClassificationIndexClassificationIndex_hasContact_AgentTypeValidTypeType = ("Agent" | "Curator" | "Individual" | "Machine" | "Organization" | "ProcessingAgent" | "Service");
interface _ClassificationIndexClassificationIndex_hasContact_AgentTypeValidTypeType extends Primitive._string { content: ClassificationIndexClassificationIndex_hasContact_AgentTypeValidTypeType; }

interface _ClassificationIndexClassificationIndex_isDefinedBy_ConceptType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: ClassificationIndexClassificationIndex_isDefinedBy_ConceptTypeValidTypeType[];
}
interface ClassificationIndexClassificationIndex_isDefinedBy_ConceptType extends _ClassificationIndexClassificationIndex_isDefinedBy_ConceptType { constructor: { new(): ClassificationIndexClassificationIndex_isDefinedBy_ConceptType }; }

type ClassificationIndexClassificationIndex_isDefinedBy_ConceptTypeValidTypeType = ("Category" | "Concept" | "ConceptualValue" | "ConceptualVariable" | "DescriptorVariable" | "DimensionalKeyDefinitionMember" | "InstanceVariable" | "KeyDefinitionMember" | "Population" | "ReferenceVariable" | "RepresentedVariable" | "UnitType" | "Universe");
interface _ClassificationIndexClassificationIndex_isDefinedBy_ConceptTypeValidTypeType extends Primitive._string { content: ClassificationIndexClassificationIndex_isDefinedBy_ConceptTypeValidTypeType; }

interface _ClassificationIndexClassificationIndex_isMaintainedBy_AgentType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
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
interface _ClassificationIndexEntry extends BaseType {
	/** Bundles the information useful for a data catalog entry.
	  *
	  * Examples would be creator, contributor, title, copyright, embargo, and license information
	  *
	  * A set of information useful for attribution, data discovery, and access.
	  * This is information that is tied to the identity of the object. If this information changes the version of the associated object changes. */
	catalogDetails?: CatalogDetails;
	/** Additional information which drives the coding process for the Index Entry. Required when coding is dependent upon one or many other factors. */
	codingInstruction?: CommandCode;
	/** Text describing the type of object/unit or object property. */
	entry?: InternationalString;
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	/** The dates describing the validity period of the object. The date from which the object became valid must be defined if the map belongs to a "floating" construct. The date at which the object became invalid must be defined if the map belongs to a "floating" construct and is no longer valid. */
	validDates?: DateRange;
}
export interface ClassificationIndexEntry extends _ClassificationIndexEntry { constructor: { new(): ClassificationIndexEntry }; }
export var ClassificationIndexEntry: { new(): ClassificationIndexEntry };

/** Definition
  * ============
  * Member indicator for use with member type classification index entry. */
interface _ClassificationIndexEntryPosition extends BaseType {
	/** Restricts member target class to classification index entry. */
	ClassificationIndexEntryPosition_indexes_ClassificationIndexEntry: ClassificationIndexEntryPositionClassificationIndexEntryPosition_indexes_ClassificationIndexEntryType;
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	/** Index value of the member in an ordered array. */
	value: number;
}
export interface ClassificationIndexEntryPosition extends _ClassificationIndexEntryPosition { constructor: { new(): ClassificationIndexEntryPosition }; }
export var ClassificationIndexEntryPosition: { new(): ClassificationIndexEntryPosition };

interface _ClassificationIndexEntryPositionClassificationIndexEntryPosition_indexes_ClassificationIndexEntryType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
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
	/** Describes the changes, which the item has been subject to from the previous version to the actual statistical classification. */
	changeFromPreviousVersion?: InternationalString;
	/** Describes the changes, which the item has been subject to during the life time of the actual statistical classification. */
	changeLog?: InternationalString;
	/** A definition for the code. Specialization of denotes for categories. */
	ClassificationItem_denotes_Category: ClassificationItemClassificationItem_denotes_CategoryType;
	/** Classification items to which the excluded cases belong (as described in explanatory notes). */
	ClassificationItem_excludes_ClassificationItem?: ClassificationItemClassificationItem_excludes_ClassificationItemType[];
	/** Case law rulings related to the classification item. */
	ClassificationItem_hasRulingBy_AuthorizationSource?: ClassificationItemClassificationItem_hasRulingBy_AuthorizationSourceType[];
	/** Classification item uses a notation. */
	ClassificationItem_uses_Notation: ClassificationItemClassificationItem_uses_NotationType;
	/** A classification item may be associated with explanatory notes, which further describe and clarify the contents of the category. Explanatory notes consist of: General note: Contains either additional information about the category, or a general description of the category, which is not structured according to the "includes", "includes also", "excludes" pattern. Includes: Specifies the contents of the category. Includes also: A list of borderline cases, which belong to the described category. Excludes: A list of borderline cases, which do not belong to the described category. Excluded cases may contain a reference to the classification items to which the excluded cases belong. */
	explanatoryNotes?: InternationalString[];
	/** The future events describe an intended or implemented change (or a number of changes) related to an invalid item (e.g., these changes may have turned the now invalid item into one or several successor items). This allows for the possibility of following successors of the item in the future. */
	futureNotes?: InternationalString[];
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	/** Indicates whether or not the item has been generated to make the level to which it belongs complete. */
	isGenerated?: boolean;
	/** Indicates whether or not the item is currently valid. If updates are allowed in the Statistical Classification, an item may be restricted in its validity, i.e. it may become valid or invalid after the Statistical Classification has been released. */
	isValid?: boolean;
	/** Human understandable name (liguistic signifier, word, phrase, or mnemonic). May follow ISO/IEC 11179-5 naming principles, and have context provided to specify usage. A Classification Item has an official name as provided by the owner or maintenance unit. The name describes the content of the category. The name is unique within the Statistical Classification to which the item belongs, except for categories that are identical at more than one level in a hierarchical classification. Use the context attribute to differentiate official names or alternate names for the Classification Item. */
	name?: ObjectName[];
	/** The dates describing the validity period of the object. The date from which the object became valid must be defined if the map belongs to a "floating" construct. The date at which the object became invalid must be defined if the map belongs to a "floating" construct and is no longer valid. */
	validDates?: DateRange;
}
export interface ClassificationItem extends _ClassificationItem { constructor: { new(): ClassificationItem }; }
export var ClassificationItem: { new(): ClassificationItem };

interface _ClassificationItemClassificationItem_denotes_CategoryType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: ClassificationItemClassificationItem_denotes_CategoryTypeValidTypeType[];
}
interface ClassificationItemClassificationItem_denotes_CategoryType extends _ClassificationItemClassificationItem_denotes_CategoryType { constructor: { new(): ClassificationItemClassificationItem_denotes_CategoryType }; }

type ClassificationItemClassificationItem_denotes_CategoryTypeValidTypeType = "Category";
interface _ClassificationItemClassificationItem_denotes_CategoryTypeValidTypeType extends Primitive._string { content: ClassificationItemClassificationItem_denotes_CategoryTypeValidTypeType; }

interface _ClassificationItemClassificationItem_excludes_ClassificationItemType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: ClassificationItemClassificationItem_excludes_ClassificationItemTypeValidTypeType[];
}
interface ClassificationItemClassificationItem_excludes_ClassificationItemType extends _ClassificationItemClassificationItem_excludes_ClassificationItemType { constructor: { new(): ClassificationItemClassificationItem_excludes_ClassificationItemType }; }

type ClassificationItemClassificationItem_excludes_ClassificationItemTypeValidTypeType = "ClassificationItem";
interface _ClassificationItemClassificationItem_excludes_ClassificationItemTypeValidTypeType extends Primitive._string { content: ClassificationItemClassificationItem_excludes_ClassificationItemTypeValidTypeType; }

interface _ClassificationItemClassificationItem_hasRulingBy_AuthorizationSourceType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: ClassificationItemClassificationItem_hasRulingBy_AuthorizationSourceTypeValidTypeType[];
}
interface ClassificationItemClassificationItem_hasRulingBy_AuthorizationSourceType extends _ClassificationItemClassificationItem_hasRulingBy_AuthorizationSourceType { constructor: { new(): ClassificationItemClassificationItem_hasRulingBy_AuthorizationSourceType }; }

type ClassificationItemClassificationItem_hasRulingBy_AuthorizationSourceTypeValidTypeType = "AuthorizationSource";
interface _ClassificationItemClassificationItem_hasRulingBy_AuthorizationSourceTypeValidTypeType extends Primitive._string { content: ClassificationItemClassificationItem_hasRulingBy_AuthorizationSourceTypeValidTypeType; }

interface _ClassificationItemClassificationItem_uses_NotationType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
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
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	/** Index value of the member in an ordered array. */
	value: number;
}
export interface ClassificationItemPosition extends _ClassificationItemPosition { constructor: { new(): ClassificationItemPosition }; }
export var ClassificationItemPosition: { new(): ClassificationItemPosition };

interface _ClassificationItemPositionClassificationItemPosition_indexes_ClassificationItemType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: ClassificationItemPositionClassificationItemPosition_indexes_ClassificationItemTypeValidTypeType[];
}
interface ClassificationItemPositionClassificationItemPosition_indexes_ClassificationItemType extends _ClassificationItemPositionClassificationItemPosition_indexes_ClassificationItemType { constructor: { new(): ClassificationItemPositionClassificationItemPosition_indexes_ClassificationItemType }; }

type ClassificationItemPositionClassificationItemPosition_indexes_ClassificationItemTypeValidTypeType = "ClassificationItem";
interface _ClassificationItemPositionClassificationItemPosition_indexes_ClassificationItemTypeValidTypeType extends Primitive._string { content: ClassificationItemPositionClassificationItemPosition_indexes_ClassificationItemTypeValidTypeType; }

/** Definition
  * ============
  * Source-target relationship between classification items in a classification item relation structure. */
interface _ClassificationItemRelationship extends BaseType {
	ClassificationItemRelationship_hasSource_ClassificationItem?: ClassificationItemRelationshipClassificationItemRelationship_hasSource_ClassificationItemType[];
	/** Note that this can be realized as a collection to support tuples. */
	ClassificationItemRelationship_hasTarget_ClassificationItem?: ClassificationItemRelationshipClassificationItemRelationship_hasTarget_ClassificationItemType[];
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	/** Specifies the semantics of the object in reference to a vocabulary, ontology, etc. */
	semantics?: ControlledVocabularyEntry;
}
export interface ClassificationItemRelationship extends _ClassificationItemRelationship { constructor: { new(): ClassificationItemRelationship }; }
export var ClassificationItemRelationship: { new(): ClassificationItemRelationship };

interface _ClassificationItemRelationshipClassificationItemRelationship_hasSource_ClassificationItemType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: ClassificationItemRelationshipClassificationItemRelationship_hasSource_ClassificationItemTypeValidTypeType[];
}
interface ClassificationItemRelationshipClassificationItemRelationship_hasSource_ClassificationItemType extends _ClassificationItemRelationshipClassificationItemRelationship_hasSource_ClassificationItemType { constructor: { new(): ClassificationItemRelationshipClassificationItemRelationship_hasSource_ClassificationItemType }; }

type ClassificationItemRelationshipClassificationItemRelationship_hasSource_ClassificationItemTypeValidTypeType = "ClassificationItem";
interface _ClassificationItemRelationshipClassificationItemRelationship_hasSource_ClassificationItemTypeValidTypeType extends Primitive._string { content: ClassificationItemRelationshipClassificationItemRelationship_hasSource_ClassificationItemTypeValidTypeType; }

interface _ClassificationItemRelationshipClassificationItemRelationship_hasTarget_ClassificationItemType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: ClassificationItemRelationshipClassificationItemRelationship_hasTarget_ClassificationItemTypeValidTypeType[];
}
interface ClassificationItemRelationshipClassificationItemRelationship_hasTarget_ClassificationItemType extends _ClassificationItemRelationshipClassificationItemRelationship_hasTarget_ClassificationItemType { constructor: { new(): ClassificationItemRelationshipClassificationItemRelationship_hasTarget_ClassificationItemType }; }

type ClassificationItemRelationshipClassificationItemRelationship_hasTarget_ClassificationItemTypeValidTypeType = "ClassificationItem";
interface _ClassificationItemRelationshipClassificationItemRelationship_hasTarget_ClassificationItemTypeValidTypeType extends Primitive._string { content: ClassificationItemRelationshipClassificationItemRelationship_hasTarget_ClassificationItemTypeValidTypeType; }

/** Definition
  * ============
  * Complex relation structure for use with statistical classification.
  *
  * Examples
  * ==========
  * A classification item structure for the International Standard Classification of Occupations (ISCO-08: https://www.ilo.org/public/english/bureau/stat/isco/isco08/) would describe each of the major classifications as a parent of its sub-classifications. 1 Managers, for example would be listed as a parent of four sub groups: 11 Chief Executives, Senior Officials and Legislators; 12 Chief Executives, Senior Officials and Legislators; 13 Production and Specialized Services Managers; and 14 Hospitality, Retail and Other Services Managers.
  *
  * Explanatory notes
  * ===================
  * The classification item structure has a set of classification item relationships which are basically adjacency lists. A source classification item has a described relationship to a target list of classification items. The semantic might be, for example, "parentOf", or "contains", etc. */
interface _ClassificationItemStructure extends BaseType {
	ClassificationItemStructure_has_ClassificationItemRelationship?: ClassificationItemStructureClassificationItemStructure_has_ClassificationItemRelationshipType[];
	ClassificationItemStructure_structures_StatisticalClassification?: ClassificationItemStructureClassificationItemStructure_structures_StatisticalClassificationType;
	/** A human-readable display label for the object. Supports the use of multiple languages. Repeat for labels with different content, for example, labels with differing length limitations. */
	displayLabel?: LabelForDisplay[];
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	/** Human understandable name (liguistic signifier, word, phrase, or mnemonic). May follow ISO/IEC 11179-5 naming principles, and have context provided to specify usage. */
	name?: ObjectName[];
	/** Intent or reason for the object/the description of the object. */
	purpose?: InternationalString;
	/** Specifies the semantics of the object in reference to a vocabulary, ontology, etc. */
	semantics?: ControlledVocabularyEntry;
	/** Provides information on reflexivity, transitivity, and symmetry of relationship using a descriptive term from an enumerated list. Use if all relations within this relation structure are of the same specification. */
	specification?: StructureSpecification;
	/** Indicates the form of the associations among members of the collection. Specifies the way in which constituent parts are interrelated or arranged. */
	topology?: ControlledVocabularyEntry;
	/** Indicates whether the related collections are comprehensive in terms of their coverage. */
	totality?: StructureExtent;
}
export interface ClassificationItemStructure extends _ClassificationItemStructure { constructor: { new(): ClassificationItemStructure }; }
export var ClassificationItemStructure: { new(): ClassificationItemStructure };

interface _ClassificationItemStructureClassificationItemStructure_has_ClassificationItemRelationshipType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType: ClassificationItemStructureClassificationItemStructure_has_ClassificationItemRelationshipTypeValidTypeType[];
}
interface ClassificationItemStructureClassificationItemStructure_has_ClassificationItemRelationshipType extends _ClassificationItemStructureClassificationItemStructure_has_ClassificationItemRelationshipType { constructor: { new(): ClassificationItemStructureClassificationItemStructure_has_ClassificationItemRelationshipType }; }

type ClassificationItemStructureClassificationItemStructure_has_ClassificationItemRelationshipTypeValidTypeType = "ClassificationItemRelationship";
interface _ClassificationItemStructureClassificationItemStructure_has_ClassificationItemRelationshipTypeValidTypeType extends Primitive._string { content: ClassificationItemStructureClassificationItemStructure_has_ClassificationItemRelationshipTypeValidTypeType; }

interface _ClassificationItemStructureClassificationItemStructure_structures_StatisticalClassificationType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: ClassificationItemStructureClassificationItemStructure_structures_StatisticalClassificationTypeValidTypeType[];
}
interface ClassificationItemStructureClassificationItemStructure_structures_StatisticalClassificationType extends _ClassificationItemStructureClassificationItemStructure_structures_StatisticalClassificationType { constructor: { new(): ClassificationItemStructureClassificationItemStructure_structures_StatisticalClassificationType }; }

type ClassificationItemStructureClassificationItemStructure_structures_StatisticalClassificationTypeValidTypeType = "StatisticalClassification";
interface _ClassificationItemStructureClassificationItemStructure_structures_StatisticalClassificationTypeValidTypeType extends Primitive._string { content: ClassificationItemStructureClassificationItemStructure_structures_StatisticalClassificationTypeValidTypeType; }

/** Definition
  * ============
  * The index of a classification within a classification family expressed as an integer, progressing upward from 0 or 1. */
interface _ClassificationPosition extends BaseType {
	ClassificationPosition_indexes_StatisticalClassification?: ClassificationPositionClassificationPosition_indexes_StatisticalClassificationType;
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	/** Index value of the member in an ordered array. */
	value: number;
}
export interface ClassificationPosition extends _ClassificationPosition { constructor: { new(): ClassificationPosition }; }
export var ClassificationPosition: { new(): ClassificationPosition };

interface _ClassificationPositionClassificationPosition_indexes_StatisticalClassificationType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: ClassificationPositionClassificationPosition_indexes_StatisticalClassificationTypeValidTypeType[];
}
interface ClassificationPositionClassificationPosition_indexes_StatisticalClassificationType extends _ClassificationPositionClassificationPosition_indexes_StatisticalClassificationType { constructor: { new(): ClassificationPositionClassificationPosition_indexes_StatisticalClassificationType }; }

type ClassificationPositionClassificationPosition_indexes_StatisticalClassificationTypeValidTypeType = "StatisticalClassification";
interface _ClassificationPositionClassificationPosition_indexes_StatisticalClassificationTypeValidTypeType extends Primitive._string { content: ClassificationPositionClassificationPosition_indexes_StatisticalClassificationTypeValidTypeType; }

/** Definition
  * ============
  * Ensemble of one or more statistical classifications, based on the same concept, and related to each other as versions or updates.
  *
  * Examples
  * ==========
  * ISIC or ISCO
  * SIC (with different published versions related to the publication year).
  *
  * Explanatory notes
  * ===================
  * Typically, these statistical classifications have the same name. */
interface _ClassificationSeries extends BaseType {
	/** If value is False, the members are unique within the collection - if True, there may be duplicates. (Note that a mathematical “bag” permits duplicates and is unordered - a “set” does not have duplicates and may be ordered.) */
	allowsDuplicates: boolean;
	/** Bundles the information useful for a data catalog entry.
	  *
	  * Examples would be creator, contributor, title, copyright, embargo, and license information
	  *
	  * A set of information useful for attribution, data discovery, and access.
	  * This is information that is tied to the identity of the object. If this information changes the version of the associated object changes. */
	catalogDetails?: CatalogDetails;
	ClassificationSeries_has_ClassificationPosition?: ClassificationSeriesClassificationSeries_has_ClassificationPositionType[];
	ClassificationSeries_has_StatisticalClassification?: ClassificationSeriesClassificationSeries_has_StatisticalClassificationType[];
	/** The conceptual basis for the collection of members. */
	ClassificationSeries_isDefinedBy_Concept?: ClassificationSeriesClassificationSeries_isDefinedBy_ConceptType[];
	/** The statistical office or other authority, which created and maintains the statistical classification(s) related to the classification series. A classification series may have several owners. */
	ClassificationSeries_isOwnedBy_Agent?: ClassificationSeriesClassificationSeries_isOwnedBy_AgentType[];
	/** Classification series can be designed in a specific context of use. This property indicates that context, and supports the use of an external controlled vocabulary for this purpose. */
	context?: ControlledVocabularyEntry;
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	/** A classification series can be associated with one or a number of keywords. */
	keyword?: ControlledVocabularyEntry[];
	/** Human understandable name (liguistic signifier, word, phrase, or mnemonic). May follow ISO/IEC 11179-5 naming principles, and have context provided to specify usage. */
	name?: ObjectName[];
	/** A classification series is designed to classify a specific type of object/unit according to a specific attribute. */
	objectsOrUnitsClassified?: ControlledVocabularyEntry;
	/** Intent or reason for the object/the description of the object. */
	purpose?: InternationalString;
	/** Scientific domains, disciplines, or areas of statistics in which the classification series is implemented. */
	subject?: ControlledVocabularyEntry[];
}
export interface ClassificationSeries extends _ClassificationSeries { constructor: { new(): ClassificationSeries }; }
export var ClassificationSeries: { new(): ClassificationSeries };

interface _ClassificationSeriesClassificationSeries_has_ClassificationPositionType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType: ClassificationSeriesClassificationSeries_has_ClassificationPositionTypeValidTypeType[];
}
interface ClassificationSeriesClassificationSeries_has_ClassificationPositionType extends _ClassificationSeriesClassificationSeries_has_ClassificationPositionType { constructor: { new(): ClassificationSeriesClassificationSeries_has_ClassificationPositionType }; }

type ClassificationSeriesClassificationSeries_has_ClassificationPositionTypeValidTypeType = "ClassificationPosition";
interface _ClassificationSeriesClassificationSeries_has_ClassificationPositionTypeValidTypeType extends Primitive._string { content: ClassificationSeriesClassificationSeries_has_ClassificationPositionTypeValidTypeType; }

interface _ClassificationSeriesClassificationSeries_has_StatisticalClassificationType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: ClassificationSeriesClassificationSeries_has_StatisticalClassificationTypeValidTypeType[];
}
interface ClassificationSeriesClassificationSeries_has_StatisticalClassificationType extends _ClassificationSeriesClassificationSeries_has_StatisticalClassificationType { constructor: { new(): ClassificationSeriesClassificationSeries_has_StatisticalClassificationType }; }

type ClassificationSeriesClassificationSeries_has_StatisticalClassificationTypeValidTypeType = "StatisticalClassification";
interface _ClassificationSeriesClassificationSeries_has_StatisticalClassificationTypeValidTypeType extends Primitive._string { content: ClassificationSeriesClassificationSeries_has_StatisticalClassificationTypeValidTypeType; }

interface _ClassificationSeriesClassificationSeries_isDefinedBy_ConceptType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: ClassificationSeriesClassificationSeries_isDefinedBy_ConceptTypeValidTypeType[];
}
interface ClassificationSeriesClassificationSeries_isDefinedBy_ConceptType extends _ClassificationSeriesClassificationSeries_isDefinedBy_ConceptType { constructor: { new(): ClassificationSeriesClassificationSeries_isDefinedBy_ConceptType }; }

type ClassificationSeriesClassificationSeries_isDefinedBy_ConceptTypeValidTypeType = ("Category" | "Concept" | "ConceptualValue" | "ConceptualVariable" | "DescriptorVariable" | "DimensionalKeyDefinitionMember" | "InstanceVariable" | "KeyDefinitionMember" | "Population" | "ReferenceVariable" | "RepresentedVariable" | "UnitType" | "Universe");
interface _ClassificationSeriesClassificationSeries_isDefinedBy_ConceptTypeValidTypeType extends Primitive._string { content: ClassificationSeriesClassificationSeries_isDefinedBy_ConceptTypeValidTypeType; }

interface _ClassificationSeriesClassificationSeries_isOwnedBy_AgentType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: ClassificationSeriesClassificationSeries_isOwnedBy_AgentTypeValidTypeType[];
}
interface ClassificationSeriesClassificationSeries_isOwnedBy_AgentType extends _ClassificationSeriesClassificationSeries_isOwnedBy_AgentType { constructor: { new(): ClassificationSeriesClassificationSeries_isOwnedBy_AgentType }; }

type ClassificationSeriesClassificationSeries_isOwnedBy_AgentTypeValidTypeType = ("Agent" | "Curator" | "Individual" | "Machine" | "Organization" | "ProcessingAgent" | "Service");
interface _ClassificationSeriesClassificationSeries_isOwnedBy_AgentTypeValidTypeType extends Primitive._string { content: ClassificationSeriesClassificationSeries_isOwnedBy_AgentTypeValidTypeType; }

/** Definition
  * ============
  * Structure for describing the complex relationships between statistical classifications in a classification series.
  *
  * Examples
  * ==========
  * A classification series that branches into separately versioned classifications.
  *
  * Explanatory notes
  * ===================
  * Can use relation specification information to more fully describe the relationship between members such as parent/child, whole/part, general/specific, equivalence, etc. */
interface _ClassificationSeriesStructure extends BaseType {
	ClassificationSeriesStructure_has_StatisticalClassificationRelationship?: ClassificationSeriesStructureClassificationSeriesStructure_has_StatisticalClassificationRelationshipType[];
	ClassificationSeriesStructure_structures_ClassificationSeries?: ClassificationSeriesStructureClassificationSeriesStructure_structures_ClassificationSeriesType;
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	/** Human understandable name (liguistic signifier, word, phrase, or mnemonic). May follow ISO/IEC 11179-5 naming principles, and have context provided to specify usage. */
	name?: ObjectName[];
	/** Intent or reason for the object/the description of the object. */
	purpose?: InternationalString;
	/** Specifies the semantics of the object in reference to a vocabulary, ontology, etc. */
	semantics?: ControlledVocabularyEntry;
	/** Provides information on reflexivity, transitivity, and symmetry of relationship using a descriptive term from an enumerated list. Use if all relations within this relation structure are of the same specification. */
	specification?: StructureSpecification;
	/** Indicates the form of the associations among members of the collection. Specifies the way in which constituent parts are interrelated or arranged. */
	topology?: ControlledVocabularyEntry;
	/** Indicates whether the related collections are comprehensive in terms of their coverage. */
	totality?: StructureExtent;
}
export interface ClassificationSeriesStructure extends _ClassificationSeriesStructure { constructor: { new(): ClassificationSeriesStructure }; }
export var ClassificationSeriesStructure: { new(): ClassificationSeriesStructure };

interface _ClassificationSeriesStructureClassificationSeriesStructure_has_StatisticalClassificationRelationshipType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType: ClassificationSeriesStructureClassificationSeriesStructure_has_StatisticalClassificationRelationshipTypeValidTypeType[];
}
interface ClassificationSeriesStructureClassificationSeriesStructure_has_StatisticalClassificationRelationshipType extends _ClassificationSeriesStructureClassificationSeriesStructure_has_StatisticalClassificationRelationshipType { constructor: { new(): ClassificationSeriesStructureClassificationSeriesStructure_has_StatisticalClassificationRelationshipType }; }

type ClassificationSeriesStructureClassificationSeriesStructure_has_StatisticalClassificationRelationshipTypeValidTypeType = "StatisticalClassificationRelationship";
interface _ClassificationSeriesStructureClassificationSeriesStructure_has_StatisticalClassificationRelationshipTypeValidTypeType extends Primitive._string { content: ClassificationSeriesStructureClassificationSeriesStructure_has_StatisticalClassificationRelationshipTypeValidTypeType; }

interface _ClassificationSeriesStructureClassificationSeriesStructure_structures_ClassificationSeriesType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: ClassificationSeriesStructureClassificationSeriesStructure_structures_ClassificationSeriesTypeValidTypeType[];
}
interface ClassificationSeriesStructureClassificationSeriesStructure_structures_ClassificationSeriesType extends _ClassificationSeriesStructureClassificationSeriesStructure_structures_ClassificationSeriesType { constructor: { new(): ClassificationSeriesStructureClassificationSeriesStructure_structures_ClassificationSeriesType }; }

type ClassificationSeriesStructureClassificationSeriesStructure_structures_ClassificationSeriesTypeValidTypeType = "ClassificationSeries";
interface _ClassificationSeriesStructureClassificationSeriesStructure_structures_ClassificationSeriesTypeValidTypeType extends Primitive._string { content: ClassificationSeriesStructureClassificationSeriesStructure_structures_ClassificationSeriesTypeValidTypeType; }

/** Definition
  * ============
  * The characters used as a symbol to designate a category within a codelist or classification. (Formally, a sign for which the signifier is non-linguistic alphanumeric string.)
  *
  * Examples
  * ==========
  * The letter M might stand for the category "Male" in the codeList called "Gender".
  *
  * Explanatory notes
  * ===================
  * A non-linguistic alphanumeric string is one which does not correspond to a word in natural language. For use in a codelist. The representation property (value) is expressed as it would be found in a data file. Multiple representations may relate to the same category but should be expressed as separate codes.  It should not be confused with a classification item which is a placeholder for a position in a statistical classification. */
interface _Code extends BaseType {
	/** A definition for the code. Specialization of denotes for categories. */
	Code_denotes_Category: CodeCode_denotes_CategoryType;
	Code_uses_Notation: CodeCode_uses_NotationType;
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
}
export interface Code extends _Code { constructor: { new(): Code }; }
export var Code: { new(): Code };

interface _CodeCode_denotes_CategoryType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: CodeCode_denotes_CategoryTypeValidTypeType[];
}
interface CodeCode_denotes_CategoryType extends _CodeCode_denotes_CategoryType { constructor: { new(): CodeCode_denotes_CategoryType }; }

type CodeCode_denotes_CategoryTypeValidTypeType = "Category";
interface _CodeCode_denotes_CategoryTypeValidTypeType extends Primitive._string { content: CodeCode_denotes_CategoryTypeValidTypeType; }

interface _CodeCode_uses_NotationType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: CodeCode_uses_NotationTypeValidTypeType[];
}
interface CodeCode_uses_NotationType extends _CodeCode_uses_NotationType { constructor: { new(): CodeCode_uses_NotationType }; }

type CodeCode_uses_NotationTypeValidTypeType = "Notation";
interface _CodeCode_uses_NotationTypeValidTypeType extends Primitive._string { content: CodeCode_uses_NotationTypeValidTypeType; }

/** Definition
  * ============
  * List of codes and associated categories.
  *
  * Examples
  * ==========
  * The codes "M" and "F" could point to "Male" and "Female" categories respectively.  A code list for an occupational classification system like the International Standard Classification of Occupations (ISCO-08: https://www.ilo.org/public/english/bureau/stat/isco/isco08/) could use a classification relation structure to describe a hierarchy (Chief Executives and Administrative and Commercial Managers as subtypes of Managers).
  *
  * Explanatory notes
  * ===================
  * List may be flat or hierarchical. A hierarchical structure may have an indexed order for intended presentation even though the content within levels of the hierarchy are conceptually unordered. For hierarchical structures classification item structure is used to provide additional information on the structure and organization of the categories. Note that a category set can be structured by a classification relation structure without the need for associating any codes with the categories. This allows for the creation of a category set, for example for a response domain, without an associated codelist. */
interface _CodeList extends _EnumerationDomain {
	/** If value is False, the members are unique within the collection - if True, there may be duplicates. (Note that a mathematical “bag” permits duplicates and is unordered - a “set” does not have duplicates and may be ordered.) */
	allowsDuplicates: boolean;
	CodeList_has_Code?: CodeListCodeList_has_CodeType[];
	CodeList_has_CodePosition?: CodeListCodeList_has_CodePositionType[];
}
export interface CodeList extends _CodeList { constructor: { new(): CodeList }; }
export var CodeList: { new(): CodeList };

interface _CodeListCodeList_has_CodePositionType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType: CodeListCodeList_has_CodePositionTypeValidTypeType[];
}
interface CodeListCodeList_has_CodePositionType extends _CodeListCodeList_has_CodePositionType { constructor: { new(): CodeListCodeList_has_CodePositionType }; }

type CodeListCodeList_has_CodePositionTypeValidTypeType = "CodePosition";
interface _CodeListCodeList_has_CodePositionTypeValidTypeType extends Primitive._string { content: CodeListCodeList_has_CodePositionTypeValidTypeType; }

interface _CodeListCodeList_has_CodeType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: CodeListCodeList_has_CodeTypeValidTypeType[];
}
interface CodeListCodeList_has_CodeType extends _CodeListCodeList_has_CodeType { constructor: { new(): CodeListCodeList_has_CodeType }; }

type CodeListCodeList_has_CodeTypeValidTypeType = "Code";
interface _CodeListCodeList_has_CodeTypeValidTypeType extends Primitive._string { content: CodeListCodeList_has_CodeTypeValidTypeType; }

/** Definition
  * ============
  * Relation structure of codes within a codelist.
  *
  * Explanatory notes
  * ===================
  * Allows for the specification of complex relationships among codes. The code list structure employs a set of code relationips to describe the relationship among concepts. Each code relationship is a one to many description of connections between codes. Together they might commonly describe relationships as complex as a hierarchy. */
interface _CodeListStructure extends BaseType {
	CodeListStructure_has_CodeRelationship?: CodeListStructureCodeListStructure_has_CodeRelationshipType[];
	CodeListStructure_structures_CodeList?: CodeListStructureCodeListStructure_structures_CodeListType;
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	/** Human understandable name (liguistic signifier, word, phrase, or mnemonic). May follow ISO/IEC 11179-5 naming principles, and have context provided to specify usage. */
	name?: ObjectName[];
	/** Intent or reason for the object/the description of the object. */
	purpose?: InternationalString;
	/** Specifies the semantics of the object in reference to a vocabulary, ontology, etc. */
	semantics?: ControlledVocabularyEntry;
	/** Provides information on reflexivity, transitivity, and symmetry of relationship using a descriptive term from an enumerated list. Use if all relations within this relation structure are of the same specification. */
	specification?: StructureSpecification;
	/** Indicates the form of the associations among members of the collection. Specifies the way in which constituent parts are interrelated or arranged. */
	topology: ControlledVocabularyEntry;
	/** Indicates whether the related collections are comprehensive in terms of their coverage. */
	totality?: StructureExtent;
}
export interface CodeListStructure extends _CodeListStructure { constructor: { new(): CodeListStructure }; }
export var CodeListStructure: { new(): CodeListStructure };

interface _CodeListStructureCodeListStructure_has_CodeRelationshipType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType: CodeListStructureCodeListStructure_has_CodeRelationshipTypeValidTypeType[];
}
interface CodeListStructureCodeListStructure_has_CodeRelationshipType extends _CodeListStructureCodeListStructure_has_CodeRelationshipType { constructor: { new(): CodeListStructureCodeListStructure_has_CodeRelationshipType }; }

type CodeListStructureCodeListStructure_has_CodeRelationshipTypeValidTypeType = "CodeRelationship";
interface _CodeListStructureCodeListStructure_has_CodeRelationshipTypeValidTypeType extends Primitive._string { content: CodeListStructureCodeListStructure_has_CodeRelationshipTypeValidTypeType; }

interface _CodeListStructureCodeListStructure_structures_CodeListType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: CodeListStructureCodeListStructure_structures_CodeListTypeValidTypeType[];
}
interface CodeListStructureCodeListStructure_structures_CodeListType extends _CodeListStructureCodeListStructure_structures_CodeListType { constructor: { new(): CodeListStructureCodeListStructure_structures_CodeListType }; }

type CodeListStructureCodeListStructure_structures_CodeListTypeValidTypeType = "CodeList";
interface _CodeListStructureCodeListStructure_structures_CodeListTypeValidTypeType extends Primitive._string { content: CodeListStructureCodeListStructure_structures_CodeListTypeValidTypeType; }

/** Definition
  * ============
  * An index within an order intended for presentation (even though the content within levels of the hierarchy may be conceptually unordered). Expressed as an integer counting upward from 01 or 1. */
interface _CodePosition extends BaseType {
	CodePosition_indexes_Code?: CodePositionCodePosition_indexes_CodeType;
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	/** Index value of the member in an ordered array. */
	value: number;
}
export interface CodePosition extends _CodePosition { constructor: { new(): CodePosition }; }
export var CodePosition: { new(): CodePosition };

interface _CodePositionCodePosition_indexes_CodeType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: CodePositionCodePosition_indexes_CodeTypeValidTypeType[];
}
interface CodePositionCodePosition_indexes_CodeType extends _CodePositionCodePosition_indexes_CodeType { constructor: { new(): CodePositionCodePosition_indexes_CodeType }; }

type CodePositionCodePosition_indexes_CodeTypeValidTypeType = "Code";
interface _CodePositionCodePosition_indexes_CodeTypeValidTypeType extends Primitive._string { content: CodePositionCodePosition_indexes_CodeTypeValidTypeType; }

/** Definition
  * ============
  * Source target relationship between codes in a code relation structure. */
interface _CodeRelationship extends BaseType {
	CodeRelationship_hasSource_Code?: CodeRelationshipCodeRelationship_hasSource_CodeType[];
	/** Note that this can be realized as a collection to support tuples. */
	CodeRelationship_hasTarget_Code?: CodeRelationshipCodeRelationship_hasTarget_CodeType[];
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	/** Specifies the semantics of the object in reference to a vocabulary, ontology, etc. */
	semantics?: ControlledVocabularyEntry;
}
export interface CodeRelationship extends _CodeRelationship { constructor: { new(): CodeRelationship }; }
export var CodeRelationship: { new(): CodeRelationship };

interface _CodeRelationshipCodeRelationship_hasSource_CodeType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: CodeRelationshipCodeRelationship_hasSource_CodeTypeValidTypeType[];
}
interface CodeRelationshipCodeRelationship_hasSource_CodeType extends _CodeRelationshipCodeRelationship_hasSource_CodeType { constructor: { new(): CodeRelationshipCodeRelationship_hasSource_CodeType }; }

type CodeRelationshipCodeRelationship_hasSource_CodeTypeValidTypeType = "Code";
interface _CodeRelationshipCodeRelationship_hasSource_CodeTypeValidTypeType extends Primitive._string { content: CodeRelationshipCodeRelationship_hasSource_CodeTypeValidTypeType; }

interface _CodeRelationshipCodeRelationship_hasTarget_CodeType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: CodeRelationshipCodeRelationship_hasTarget_CodeTypeValidTypeType[];
}
interface CodeRelationshipCodeRelationship_hasTarget_CodeType extends _CodeRelationshipCodeRelationship_hasTarget_CodeType { constructor: { new(): CodeRelationshipCodeRelationship_hasTarget_CodeType }; }

type CodeRelationshipCodeRelationship_hasTarget_CodeTypeValidTypeType = "Code";
interface _CodeRelationshipCodeRelationship_hasTarget_CodeTypeValidTypeType extends Primitive._string { content: CodeRelationshipCodeRelationship_hasTarget_CodeTypeValidTypeType; }

/** Definition
  * ============
  * Provides the structure of a single Date expressed in an ISO date structure along with equivalent expression in any number of non-ISO formats. While it supports the use of the ISO time interval structure this should only be used when the exact date is unclear (i.e. occurring at some point in time between the two specified dates) or in specified applications. Ranges with specified start and end dates should use the DateRange as a datatype. Commonly uses property names include: eventDate, issueDate, and releaseDate.
  *
  * Explanatory notes
  * ===================
  * Date allows one of a set of date-time (YYYY-MM-DDThh:mm:ss), date (YYYY-MM-DD), year-month (YYYY-MM), year (YYYY), time (hh:mm:ss) and duration (PnYnMnDnHnMnS), or time interval (YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss, YYYY-MM-DDThh:mm:ss/PnYnMnDnHnMnS, PnYnMnDnHnMnS/ YYYY-MM-DDThh:mm:ss) which is formatted according to ISO 8601 and backed supported by regular expressions in the BaseDateType. Time Zone designation and negative/positive prefixes are allowed as are dates before and after 0000 through 9999. */
interface _CombinedDate extends BaseType {
	/** Strongly recommend that ALL dates be expressed in an ISO format at a minimum. A single point in time expressed in an ISO standard structure. Note that while it supports an ISO date range structure this should be used in Date only when the single date is unclear i.e. occurring at some time between two dates. */
	isoDate?: Date;
	/** A simple date expressed in a non-ISO date format, including a specification of the date format and calendar used. */
	nonIsoDate?: NonIsoDate[];
	/** Use to specify the type of date. This may reflect the refinements of dc:date such as dateAccepted, dateCopyrighted, dateSubmitted, etc. */
	semantics?: ControlledVocabularyEntry;
}
export interface CombinedDate extends _CombinedDate { constructor: { new(): CombinedDate }; }
export var CombinedDate: { new(): CombinedDate };

/** Definition
  * ============
  * Provides the following information on the command: The content of the command and the programming language used. */
interface _Command extends BaseType {
	/** Content of the command itself expressed in the language designated in programming language. */
	commandContent?: TypedString;
	/** Designates the programming language used for the command. Supports the use of a controlled vocabulary. */
	programLanguage?: ControlledVocabularyEntry;
}
export interface Command extends _Command { constructor: { new(): Command }; }
export var Command: { new(): Command };

/** Definition
  * ============
  * Contains information on the command used for processing data. Contains a description of the command which should clarify for the user the purpose and process of the command, an in-line provision of the command itself, and a reference to an external version of the command such as a coding script. */
interface _CommandCode extends BaseType {
	/** This is an in-line provision of the command itself. It provides the programming language used as well as the command. */
	command?: Command[];
	/** Identifies and provides a link to an external copy of the command, for example, a SAS Command Code script. Designates the programming language of the command file as well as the URI for the file. */
	commandFile?: CommandFile[];
	/** A description of the purpose and use of the command code provided. Supports multiple languages. */
	description?: InternationalString;
}
export interface CommandCode extends _CommandCode { constructor: { new(): CommandCode }; }
export var CommandCode: { new(): CommandCode };

/** Definition
  * ============
  * Identifies and provides a link to an external copy of the command, for example, a SAS Command Code script. Designates the programming language of the command file, a description of the location of the file , and a URN or URL for the command file. */
interface _CommandFile extends BaseType {
	/** A description of the location of the file. This may not be machine actionable. It supports a description expressed in multiple languages. */
	location?: InternationalString;
	/** The URL or URN of the command file. */
	uri?: string;
}
export interface CommandFile extends _CommandFile { constructor: { new(): CommandFile }; }
export var CommandFile: { new(): CommandFile };

/** Definition
  * ============
  * Defines the relationship between values in key/value pair. */
export type ComparisonOperator = ("Equal" | "GreaterThan" | "GreaterThanOrEqualTo" | "LessThan" | "LessThanOrEqualTo" | "NotEqual");
interface _ComparisonOperator extends Primitive._string { content: ComparisonOperator; }

/** Definition
  * ============
  * Indexes the components in a data structure using integers with a position indicated by incrementing upward from 0 or 1. */
interface _ComponentPosition extends BaseType {
	ComponentPosition_indexes_DataStructureComponent?: ComponentPositionComponentPosition_indexes_DataStructureComponentType;
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	/** Index value of the member in an ordered array. */
	value: number;
}
export interface ComponentPosition extends _ComponentPosition { constructor: { new(): ComponentPosition }; }
export var ComponentPosition: { new(): ComponentPosition };

interface _ComponentPositionComponentPosition_indexes_DataStructureComponentType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: ComponentPositionComponentPosition_indexes_DataStructureComponentTypeValidTypeType[];
}
interface ComponentPositionComponentPosition_indexes_DataStructureComponentType extends _ComponentPositionComponentPosition_indexes_DataStructureComponentType { constructor: { new(): ComponentPositionComponentPosition_indexes_DataStructureComponentType }; }

type ComponentPositionComponentPosition_indexes_DataStructureComponentTypeValidTypeType = ("AttributeComponent" | "ContextualComponent" | "DataStructure" | "DataStructureComponent" | "DimensionComponent" | "DimensionalDataStructure" | "IdentifierComponent" | "KeyValueStructure" | "LongDataStructure" | "MeasureComponent" | "QualifiedMeasure" | "SyntheticIdComponent" | "VariableDescriptorComponent" | "VariableValueComponent" | "WideDataStructure");
interface _ComponentPositionComponentPosition_indexes_DataStructureComponentTypeValidTypeType extends Primitive._string { content: ComponentPositionComponentPosition_indexes_DataStructureComponentTypeValidTypeType; }

/** Definition
  * ============
  * Defines the cases included in determining the statistic. */
export type ComputationBaseList = ("MissingOnly" | "Total" | "ValidOnly");
interface _ComputationBaseList extends Primitive._string { content: ComputationBaseList; }

/** Definition
  * ============
  * Unit of thought differentiated by characteristics (from the Generic Statistical Information Model version 1.2: https://statswiki.unece.org/display/clickablegsim/Concept).
  *
  * Examples
  * ==========
  * Velocity, Distance, Poverty, Income, Household Relationship, Family, Gender, Business Establishment, Satisfaction, Mass, Air Quality, etc.
  *
  * Explanatory notes
  * ===================
  * Many DDI-CDI classes are subtypes of the concept class including category, universe, unit type, conceptual variable. This class realizes the pattern class signified and as such a concept can be denoted by a sign. */
interface _Concept extends BaseType {
	/** Bundles the information useful for a data catalog entry. Examples would be creator, contributor, title, copyright, embargo, and license information. A set of information useful for attribution, data discovery, and access. This is information that is tied to the identity of the object. If this information changes the version of the associated object changes. */
	catalogDetails?: CatalogDetails;
	Concept_uses_Concept?: ConceptConcept_uses_ConceptType[];
	/** Natural language statement conveying the meaning of a concept, differentiating it from other concepts. Supports the use of multiple languages and structured text. 'externalDefinition' can't be used if 'definition' is used. */
	definition?: InternationalString;
	/** A human-readable display label for the object. Supports the use of multiple languages. Repeat for labels with different content, for example, labels with differing length limitations. */
	displayLabel?: LabelForDisplay[];
	/** A reference to an external definition of a concept (that is, a concept which is described outside the content of the DDI-CDI metadata description). An example is a SKOS concept. The definition property is assumed to duplicate the external one referenced if externalDefinition is used. Other corresponding properties are assumed to be included unchanged if used. */
	externalDefinition?: Reference;
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	/** Human understandable name (linguistic signifier, word, phrase, or mnemonic). May follow ISO/IEC 11179-5 naming principles, and have context provided to specify usage. */
	name?: ObjectName[];
}
export interface Concept extends _Concept { constructor: { new(): Concept }; }
export var Concept: { new(): Concept };

interface _ConceptConcept_uses_ConceptType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: ConceptConcept_uses_ConceptTypeValidTypeType[];
}
interface ConceptConcept_uses_ConceptType extends _ConceptConcept_uses_ConceptType { constructor: { new(): ConceptConcept_uses_ConceptType }; }

type ConceptConcept_uses_ConceptTypeValidTypeType = ("Category" | "Concept" | "ConceptualValue" | "ConceptualVariable" | "DescriptorVariable" | "DimensionalKeyDefinitionMember" | "InstanceVariable" | "KeyDefinitionMember" | "Population" | "ReferenceVariable" | "RepresentedVariable" | "UnitType" | "Universe");
interface _ConceptConcept_uses_ConceptTypeValidTypeType extends Primitive._string { content: ConceptConcept_uses_ConceptTypeValidTypeType; }

/** Definition
  * ============
  * Correspondence between concepts in a correspondence table.
  *
  * Examples
  * ==========
  * A simple example might map the following 2 martial status category sets:  MS1: single, married, widowed, divorced. MS2: single, married.  So, a correspondence table between these 2 category sets might look like this: MS1 single - MS2 single; MS1 widowed - MS2 single; MS1 divorced - MS2 single; MS1 married - MS2 married.
  *
  * Explanatory notes
  * ===================
  * A concept map is the pairing of similar concepts. Each concept in the map belongs to a different collection. The collection of maps for all the concepts in corresponding collections is a correspondence table. */
interface _ConceptMap extends BaseType {
	/** Concept map has one to many source concepts. */
	ConceptMap_hasSource_Concept: ConceptMapConceptMap_hasSource_ConceptType[];
	/** Concept map has one to many target concepts. */
	ConceptMap_hasTarget_Concept: ConceptMapConceptMap_hasTarget_ConceptType[];
	/** Type of correspondence in terms of commonalities and differences between two members. */
	correspondence?: CorrespondenceDefinition;
	/** A human-readable display label for the object. Supports the use of multiple languages. Repeat for labels with different content, for example, labels with differing length limitations. */
	displayLabel?: LabelForDisplay;
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	/** Explanation of the ways in which the object is employed. */
	usage?: InternationalString;
	/** The dates describing the validity period of the object. The date from which the object became valid must be defined if the map belongs to a "floating" construct. The date at which the object became invalid must be defined if the map belongs to a "floating" construct and is no longer valid. */
	validDates?: DateRange;
}
export interface ConceptMap extends _ConceptMap { constructor: { new(): ConceptMap }; }
export var ConceptMap: { new(): ConceptMap };

interface _ConceptMapConceptMap_hasSource_ConceptType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: ConceptMapConceptMap_hasSource_ConceptTypeValidTypeType[];
}
interface ConceptMapConceptMap_hasSource_ConceptType extends _ConceptMapConceptMap_hasSource_ConceptType { constructor: { new(): ConceptMapConceptMap_hasSource_ConceptType }; }

type ConceptMapConceptMap_hasSource_ConceptTypeValidTypeType = ("Category" | "Concept" | "ConceptualValue" | "ConceptualVariable" | "DescriptorVariable" | "DimensionalKeyDefinitionMember" | "InstanceVariable" | "KeyDefinitionMember" | "Population" | "ReferenceVariable" | "RepresentedVariable" | "UnitType" | "Universe");
interface _ConceptMapConceptMap_hasSource_ConceptTypeValidTypeType extends Primitive._string { content: ConceptMapConceptMap_hasSource_ConceptTypeValidTypeType; }

interface _ConceptMapConceptMap_hasTarget_ConceptType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: ConceptMapConceptMap_hasTarget_ConceptTypeValidTypeType[];
}
interface ConceptMapConceptMap_hasTarget_ConceptType extends _ConceptMapConceptMap_hasTarget_ConceptType { constructor: { new(): ConceptMapConceptMap_hasTarget_ConceptType }; }

type ConceptMapConceptMap_hasTarget_ConceptTypeValidTypeType = ("Category" | "Concept" | "ConceptualValue" | "ConceptualVariable" | "DescriptorVariable" | "DimensionalKeyDefinitionMember" | "InstanceVariable" | "KeyDefinitionMember" | "Population" | "ReferenceVariable" | "RepresentedVariable" | "UnitType" | "Universe");
interface _ConceptMapConceptMap_hasTarget_ConceptTypeValidTypeType extends Primitive._string { content: ConceptMapConceptMap_hasTarget_ConceptTypeValidTypeType; }

/** Definition
  * ============
  * Relationship between a pair of concepts in a collection of concepts. Use controlled vocabulary provided in semantics to identify the type of relationship (relation, e.g. ParentChild, WholePart, etc.)
  *
  * Examples
  * ==========
  * Apple (a specialized concept) is a kind of fruit (a generic concept). A wheel (a partitive concept) is part of a car (a whole concept).
  *
  * Explanatory notes
  * ===================
  * The idea is similar to category relationship, except it applies generally and not just for categories. */
interface _ConceptRelationship extends BaseType {
	/** Restricts source object to concept for the relationship. */
	ConceptRelationship_hasSource_Concept: ConceptRelationshipConceptRelationship_hasSource_ConceptType;
	/** Restricts target object to concept for the relationship. */
	ConceptRelationship_hasTarget_Concept: ConceptRelationshipConceptRelationship_hasTarget_ConceptType;
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	/** Specifies the semantics of the object in reference to a vocabulary, ontology, etc. */
	semantics?: ControlledVocabularyEntry;
}
export interface ConceptRelationship extends _ConceptRelationship { constructor: { new(): ConceptRelationship }; }
export var ConceptRelationship: { new(): ConceptRelationship };

interface _ConceptRelationshipConceptRelationship_hasSource_ConceptType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: ConceptRelationshipConceptRelationship_hasSource_ConceptTypeValidTypeType[];
}
interface ConceptRelationshipConceptRelationship_hasSource_ConceptType extends _ConceptRelationshipConceptRelationship_hasSource_ConceptType { constructor: { new(): ConceptRelationshipConceptRelationship_hasSource_ConceptType }; }

type ConceptRelationshipConceptRelationship_hasSource_ConceptTypeValidTypeType = ("Category" | "Concept" | "ConceptualValue" | "ConceptualVariable" | "DescriptorVariable" | "DimensionalKeyDefinitionMember" | "InstanceVariable" | "KeyDefinitionMember" | "Population" | "ReferenceVariable" | "RepresentedVariable" | "UnitType" | "Universe");
interface _ConceptRelationshipConceptRelationship_hasSource_ConceptTypeValidTypeType extends Primitive._string { content: ConceptRelationshipConceptRelationship_hasSource_ConceptTypeValidTypeType; }

interface _ConceptRelationshipConceptRelationship_hasTarget_ConceptType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: ConceptRelationshipConceptRelationship_hasTarget_ConceptTypeValidTypeType[];
}
interface ConceptRelationshipConceptRelationship_hasTarget_ConceptType extends _ConceptRelationshipConceptRelationship_hasTarget_ConceptType { constructor: { new(): ConceptRelationshipConceptRelationship_hasTarget_ConceptType }; }

type ConceptRelationshipConceptRelationship_hasTarget_ConceptTypeValidTypeType = ("Category" | "Concept" | "ConceptualValue" | "ConceptualVariable" | "DescriptorVariable" | "DimensionalKeyDefinitionMember" | "InstanceVariable" | "KeyDefinitionMember" | "Population" | "ReferenceVariable" | "RepresentedVariable" | "UnitType" | "Universe");
interface _ConceptRelationshipConceptRelationship_hasTarget_ConceptTypeValidTypeType extends Primitive._string { content: ConceptRelationshipConceptRelationship_hasTarget_ConceptTypeValidTypeType; }

/** Definition
  * ============
  * Relations of concepts within a collection.
  *
  * Examples
  * ==========
  * A concept of vacation might be described as having sub-types of beach vacation and mountain vacation.
  *
  * Explanatory notes
  * ===================
  * The concept structure employs a set of concept relationships to describe the relationship among concepts. Each concept relationship is a one to many description of connections between concepts. Together they can describe relationships as complex as a hierarchy or even a complete cyclical network as in a concept map. Allows for the specification of complex relationships among concepts. */
interface _ConceptStructure extends BaseType {
	/** Concept structure has zero to many concept relationships. */
	ConceptStructure_has_ConceptRelationship?: ConceptStructureConceptStructure_has_ConceptRelationshipType[];
	/** Concept structure structures concept system. */
	ConceptStructure_structures_ConceptSystem?: ConceptStructureConceptStructure_structures_ConceptSystemType;
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	/** Human understandable name (liguistic signifier, word, phrase, or mnemonic). May follow ISO/IEC 11179-5 naming principles, and have context provided to specify usage. */
	name?: ObjectName[];
	/** Intent or reason for the object/the description of the object. */
	purpose?: InternationalString;
	/** Specifies the semantics of the object in reference to a vocabulary, ontology, etc. */
	semantics?: ControlledVocabularyEntry;
	/** Provides information on reflexivity, transitivity, and symmetry of relationship using a descriptive term from an enumerated list. Use if all relations within this relation structure are of the same specification. */
	specification?: StructureSpecification;
	/** Indicates the form of the associations among members of the collection. Specifies the way in which constituent parts are interrelated or arranged. */
	topology?: ControlledVocabularyEntry;
	/** Indicates whether the related collections are comprehensive in terms of their coverage. */
	totality?: StructureExtent;
}
export interface ConceptStructure extends _ConceptStructure { constructor: { new(): ConceptStructure }; }
export var ConceptStructure: { new(): ConceptStructure };

interface _ConceptStructureConceptStructure_has_ConceptRelationshipType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType: ConceptStructureConceptStructure_has_ConceptRelationshipTypeValidTypeType[];
}
interface ConceptStructureConceptStructure_has_ConceptRelationshipType extends _ConceptStructureConceptStructure_has_ConceptRelationshipType { constructor: { new(): ConceptStructureConceptStructure_has_ConceptRelationshipType }; }

type ConceptStructureConceptStructure_has_ConceptRelationshipTypeValidTypeType = "ConceptRelationship";
interface _ConceptStructureConceptStructure_has_ConceptRelationshipTypeValidTypeType extends Primitive._string { content: ConceptStructureConceptStructure_has_ConceptRelationshipTypeValidTypeType; }

interface _ConceptStructureConceptStructure_structures_ConceptSystemType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: ConceptStructureConceptStructure_structures_ConceptSystemTypeValidTypeType[];
}
interface ConceptStructureConceptStructure_structures_ConceptSystemType extends _ConceptStructureConceptStructure_structures_ConceptSystemType { constructor: { new(): ConceptStructureConceptStructure_structures_ConceptSystemType }; }

type ConceptStructureConceptStructure_structures_ConceptSystemTypeValidTypeType = ("CategorySet" | "ConceptSystem");
interface _ConceptStructureConceptStructure_structures_ConceptSystemTypeValidTypeType extends Primitive._string { content: ConceptStructureConceptStructure_structures_ConceptSystemTypeValidTypeType; }

/** Definition
  * ============
  * Set of concepts structured by the relations among them [GSIM 1.1].
  *
  * Examples
  * ==========
  * 1) Concept of Sex: Male, Female, Other.
  * 2) Concept of Household Relationship: Household Head, Spouse of Household Head, Child of Household Head, Unrelated Household Member, etc.
  *
  * Explanatory notes
  * ===================
  * Note that this class can be used with concepts, classifications, universes, populations, unit types and any other class that extends from concept. */
interface _ConceptSystem extends BaseType {
	/** If value is False, the members are unique within the collection - if True, there may be duplicates. (Note that a mathematical “bag” permits duplicates and is unordered - a “set” does not have duplicates and may be ordered.) */
	allowsDuplicates: boolean;
	/** Bundles the information useful for a data catalog entry. Examples would be creator, contributor, title, copyright, embargo, and license information. A set of information useful for attribution, data discovery, and access. This is information that is tied to the identity of the object. If this information changes the version of the associated object changes. */
	catalogDetails?: CatalogDetails;
	/** Concept system has zero to many concepts. */
	ConceptSystem_has_Concept?: ConceptSystemConceptSystem_has_ConceptType[];
	/** Concept system is defined by zero to many concepts. The conceptual basis for the collection of members. */
	ConceptSystem_isDefinedBy_Concept?: ConceptSystemConceptSystem_isDefinedBy_ConceptType[];
	/** A reference to an external definition of a concept (that is, a concept which is described outside the content of the DDI-CDI metadata description). An example is a SKOS concept. The definition property is assumed to duplicate the external one referenced if externalDefinition is used. Other corresponding properties are assumed to be included unchanged if used. */
	externalDefinition?: Reference;
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	/** Human understandable name (liguistic signifier, word, phrase, or mnemonic). May follow ISO/IEC 11179-5 naming principles, and have context provided to specify usage. */
	name?: ObjectName[];
	/** Intent or reason for the object/the description of the object. */
	purpose?: InternationalString;
}
export interface ConceptSystem extends _ConceptSystem { constructor: { new(): ConceptSystem }; }
export var ConceptSystem: { new(): ConceptSystem };

interface _ConceptSystemConceptSystem_has_ConceptType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: ConceptSystemConceptSystem_has_ConceptTypeValidTypeType[];
}
interface ConceptSystemConceptSystem_has_ConceptType extends _ConceptSystemConceptSystem_has_ConceptType { constructor: { new(): ConceptSystemConceptSystem_has_ConceptType }; }

type ConceptSystemConceptSystem_has_ConceptTypeValidTypeType = ("Category" | "Concept" | "ConceptualValue" | "ConceptualVariable" | "DescriptorVariable" | "DimensionalKeyDefinitionMember" | "InstanceVariable" | "KeyDefinitionMember" | "Population" | "ReferenceVariable" | "RepresentedVariable" | "UnitType" | "Universe");
interface _ConceptSystemConceptSystem_has_ConceptTypeValidTypeType extends Primitive._string { content: ConceptSystemConceptSystem_has_ConceptTypeValidTypeType; }

interface _ConceptSystemConceptSystem_isDefinedBy_ConceptType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: ConceptSystemConceptSystem_isDefinedBy_ConceptTypeValidTypeType[];
}
interface ConceptSystemConceptSystem_isDefinedBy_ConceptType extends _ConceptSystemConceptSystem_isDefinedBy_ConceptType { constructor: { new(): ConceptSystemConceptSystem_isDefinedBy_ConceptType }; }

type ConceptSystemConceptSystem_isDefinedBy_ConceptTypeValidTypeType = ("Category" | "Concept" | "ConceptualValue" | "ConceptualVariable" | "DescriptorVariable" | "DimensionalKeyDefinitionMember" | "InstanceVariable" | "KeyDefinitionMember" | "Population" | "ReferenceVariable" | "RepresentedVariable" | "UnitType" | "Universe");
interface _ConceptSystemConceptSystem_isDefinedBy_ConceptTypeValidTypeType extends Primitive._string { content: ConceptSystemConceptSystem_isDefinedBy_ConceptTypeValidTypeType; }

/** Definition
  * ============
  * Relationship between 2 or more concept systems described through mapping similarity relationships between their member concepts.
  *
  * Examples
  * ==========
  * Correspondence between the concepts used to define the amount of salt dissolved in a body of water: the concepts "salinity" and "saltiness" might be described as equivalent, for example.
  *
  * Explanatory notes
  * ===================
  * Describes correspondence with one or more maps which identify a source and target concept and defines their commonality and difference using descriptive text and controlled vocabularies. */
interface _ConceptSystemCorrespondence extends BaseType {
	/** Bundles the information useful for a data catalog entry. Examples would be creator, contributor, title, copyright, embargo, and license information. A set of information useful for attribution, data discovery, and access. This is information that is tied to the identity of the object. If this information changes the version of the associated object changes. */
	catalogDetails?: CatalogDetails;
	/** Concept system correspondence has zero to many concept maps. */
	ConceptSystemCorrespondence_has_ConceptMap?: ConceptSystemCorrespondenceConceptSystemCorrespondence_has_ConceptMapType[];
	/** Concept system correspondence maps two to many concept systems. Realization of structures in symmetric relation. When concepts of a single concept system are mapped, the Concept has to appear twice as target. */
	ConceptSystemCorrespondence_maps_ConceptSystem: ConceptSystemCorrespondenceConceptSystemCorrespondence_maps_ConceptSystemType[];
	/** A human-readable display label for the object. Supports the use of multiple languages. Repeat for labels with different content, for example, labels with differing length limitations. */
	displayLabel?: LabelForDisplay[];
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	/** Intent or reason for the object/the description of the object. */
	purpose?: InternationalString;
	/** Explanation of the ways in which the object is employed. */
	usage?: InternationalString;
}
export interface ConceptSystemCorrespondence extends _ConceptSystemCorrespondence { constructor: { new(): ConceptSystemCorrespondence }; }
export var ConceptSystemCorrespondence: { new(): ConceptSystemCorrespondence };

interface _ConceptSystemCorrespondenceConceptSystemCorrespondence_has_ConceptMapType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: ConceptSystemCorrespondenceConceptSystemCorrespondence_has_ConceptMapTypeValidTypeType[];
}
interface ConceptSystemCorrespondenceConceptSystemCorrespondence_has_ConceptMapType extends _ConceptSystemCorrespondenceConceptSystemCorrespondence_has_ConceptMapType { constructor: { new(): ConceptSystemCorrespondenceConceptSystemCorrespondence_has_ConceptMapType }; }

type ConceptSystemCorrespondenceConceptSystemCorrespondence_has_ConceptMapTypeValidTypeType = "ConceptMap";
interface _ConceptSystemCorrespondenceConceptSystemCorrespondence_has_ConceptMapTypeValidTypeType extends Primitive._string { content: ConceptSystemCorrespondenceConceptSystemCorrespondence_has_ConceptMapTypeValidTypeType; }

interface _ConceptSystemCorrespondenceConceptSystemCorrespondence_maps_ConceptSystemType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: ConceptSystemCorrespondenceConceptSystemCorrespondence_maps_ConceptSystemTypeValidTypeType[];
}
interface ConceptSystemCorrespondenceConceptSystemCorrespondence_maps_ConceptSystemType extends _ConceptSystemCorrespondenceConceptSystemCorrespondence_maps_ConceptSystemType { constructor: { new(): ConceptSystemCorrespondenceConceptSystemCorrespondence_maps_ConceptSystemType }; }

type ConceptSystemCorrespondenceConceptSystemCorrespondence_maps_ConceptSystemTypeValidTypeType = ("CategorySet" | "ConceptSystem");
interface _ConceptSystemCorrespondenceConceptSystemCorrespondence_maps_ConceptSystemTypeValidTypeType extends Primitive._string { content: ConceptSystemCorrespondenceConceptSystemCorrespondence_maps_ConceptSystemTypeValidTypeType; }

/** Definition
  * ============
  * Set of concepts, where each concept is intended to be used as the meaning (signified) for a datum.
  *
  * Examples
  * ==========
  * Substantive: Housing Unit Tenure - Owned, Rented, Vacant. Sentinel: Non-response - Refused, Don't Know, Not Applicable
  *
  * Explanatory notes
  * ===================
  * Intent of a conceptual domain is defining a set of concepts used to measure a broader concept. For effective use they should be discrete (non-overlapping) and provide exhaustive coverage of the broader concept. The constituent concepts can be either sentinel or substantive,  The set can be described by either enumeration or by an expression. */
interface _ConceptualDomain extends BaseType {
	/** Bundles the information useful for a data catalog entry. Examples would be creator, contributor, title, copyright, embargo, and license information. A set of information useful for attribution, data discovery, and access. This is information that is tied to the identity of the object. If this information changes the version of the associated object changes. */
	catalogDetails?: CatalogDetails;
	/** A description of the concepts in the domain. A numeric domain might use a logical expression to be machine actionable; a text domain might use a regular expression to describe strings that describe the concepts. */
	ConceptualDomain_isDescribedBy_ValueAndConceptDescription?: ConceptualDomainConceptualDomain_isDescribedBy_ValueAndConceptDescriptionType;
	/** Conceptual domain takes concept from zero to one concept system. */
	ConceptualDomain_takesConceptsFrom_ConceptSystem?: ConceptualDomainConceptualDomain_takesConceptsFrom_ConceptSystemType;
	/** A human-readable display label for the object. Supports the use of multiple languages. Repeat for labels with different content, for example, labels with differing length limitations. */
	displayLabel?: LabelForDisplay[];
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
}
export interface ConceptualDomain extends _ConceptualDomain { constructor: { new(): ConceptualDomain }; }
export var ConceptualDomain: { new(): ConceptualDomain };

interface _ConceptualDomainConceptualDomain_isDescribedBy_ValueAndConceptDescriptionType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: ConceptualDomainConceptualDomain_isDescribedBy_ValueAndConceptDescriptionTypeValidTypeType[];
}
interface ConceptualDomainConceptualDomain_isDescribedBy_ValueAndConceptDescriptionType extends _ConceptualDomainConceptualDomain_isDescribedBy_ValueAndConceptDescriptionType { constructor: { new(): ConceptualDomainConceptualDomain_isDescribedBy_ValueAndConceptDescriptionType }; }

type ConceptualDomainConceptualDomain_isDescribedBy_ValueAndConceptDescriptionTypeValidTypeType = "ValueAndConceptDescription";
interface _ConceptualDomainConceptualDomain_isDescribedBy_ValueAndConceptDescriptionTypeValidTypeType extends Primitive._string { content: ConceptualDomainConceptualDomain_isDescribedBy_ValueAndConceptDescriptionTypeValidTypeType; }

interface _ConceptualDomainConceptualDomain_takesConceptsFrom_ConceptSystemType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: ConceptualDomainConceptualDomain_takesConceptsFrom_ConceptSystemTypeValidTypeType[];
}
interface ConceptualDomainConceptualDomain_takesConceptsFrom_ConceptSystemType extends _ConceptualDomainConceptualDomain_takesConceptsFrom_ConceptSystemType { constructor: { new(): ConceptualDomainConceptualDomain_takesConceptsFrom_ConceptSystemType }; }

type ConceptualDomainConceptualDomain_takesConceptsFrom_ConceptSystemTypeValidTypeType = ("CategorySet" | "ConceptSystem");
interface _ConceptualDomainConceptualDomain_takesConceptsFrom_ConceptSystemTypeValidTypeType extends Primitive._string { content: ConceptualDomainConceptualDomain_takesConceptsFrom_ConceptSystemTypeValidTypeType; }

/** Definition
  * ============
  * Concept (with a notion of equality defined) being observed, captured, or derived which is associated to a single data instance.
  *
  * Examples
  * ==========
  * A systolic blood pressure of 122 is measured. The instance value for that measurement in this paragraph is the character string "122". The associated measured concept (a blood pressure at that level) is the conceptual value.  The conceptual value comes from a conceptual domain associated with a conceptual variable.
  *
  * Explanatory notes
  * ===================
  * This is the concept associated to the actual instance of data that is stored in a data point (the signified of a datum in the signification pattern). */
interface _ConceptualValue extends _Concept {
	/** Conceptual value has concept from one conceptual domain. */
	ConceptualValue_hasConceptFrom_ConceptualDomain: ConceptualValueConceptualValue_hasConceptFrom_ConceptualDomainType;
}
export interface ConceptualValue extends _ConceptualValue { constructor: { new(): ConceptualValue }; }
export var ConceptualValue: { new(): ConceptualValue };

interface _ConceptualValueConceptualValue_hasConceptFrom_ConceptualDomainType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: ConceptualValueConceptualValue_hasConceptFrom_ConceptualDomainTypeValidTypeType[];
}
interface ConceptualValueConceptualValue_hasConceptFrom_ConceptualDomainType extends _ConceptualValueConceptualValue_hasConceptFrom_ConceptualDomainType { constructor: { new(): ConceptualValueConceptualValue_hasConceptFrom_ConceptualDomainType }; }

type ConceptualValueConceptualValue_hasConceptFrom_ConceptualDomainTypeValidTypeType = ("ConceptualDomain" | "SentinelConceptualDomain" | "SubstantiveConceptualDomain");
interface _ConceptualValueConceptualValue_hasConceptFrom_ConceptualDomainTypeValidTypeType extends Primitive._string { content: ConceptualValueConceptualValue_hasConceptFrom_ConceptualDomainTypeValidTypeType; }

/** Definition
  * ============
  * A variable at the highest level of abstraction.
  *
  * Examples
  * ==========
  * A gender variable defining two categories – "male" and "female" allowing relating each of these to concepts having description of how these categories are decided.
  *
  * Explanatory notes
  * ===================
  * The conceptual variable allows for describing the domain of concepts it can take on as well as the type of unit that can be measured. A conceptual variable for blood pressure might, for example describe the conditions under which the pressure is to be taken (sitting as opposed to standing) and a conceptual value domain as height of mercury – without units. One represented variable would further refine this by specifying inches as the unit of measurement for the height. Another might specify that the height be represented in centimeters. Both represented variables could reference the same conceptual variable to indicate in what way they are comparable. */
interface _ConceptualVariable extends _Concept {
	/** Identifies the unit type associated with the conceptual variable. */
	ConceptualVariable_measures_UnitType?: ConceptualVariableConceptualVariable_measures_UnitTypeType;
	/** Identifies the conceptual domain containing the set of sentinel concepts used to describe the conceptual variable. */
	ConceptualVariable_takesSentinelConceptsFrom_SentinelConceptualDomain?: ConceptualVariableConceptualVariable_takesSentinelConceptsFrom_SentinelConceptualDomainType;
	/** Identifies the substantive conceptual domain containing the set of substantive concepts used to describe the conceptual variable. */
	ConceptualVariable_takesSubstantiveConceptsFrom_SubstantiveConceptualDomain?: ConceptualVariableConceptualVariable_takesSubstantiveConceptsFrom_SubstantiveConceptualDomainType;
	/** A short natural language account of the characteristics of the object. */
	descriptiveText?: InternationalString;
	/** Kind of unit of measure, so that it may be prone to translation to equivalent UOMs. Example values include "acceleration," "temperature," "salinity", etc. This description exists at the conceptual level, indicating a limitation on the type of representations which may be used for the variable as it is made more concrete. */
	unitOfMeasureKind?: ControlledVocabularyEntry;
}
export interface ConceptualVariable extends _ConceptualVariable { constructor: { new(): ConceptualVariable }; }
export var ConceptualVariable: { new(): ConceptualVariable };

interface _ConceptualVariableConceptualVariable_measures_UnitTypeType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: ConceptualVariableConceptualVariable_measures_UnitTypeTypeValidTypeType[];
}
interface ConceptualVariableConceptualVariable_measures_UnitTypeType extends _ConceptualVariableConceptualVariable_measures_UnitTypeType { constructor: { new(): ConceptualVariableConceptualVariable_measures_UnitTypeType }; }

type ConceptualVariableConceptualVariable_measures_UnitTypeTypeValidTypeType = ("Population" | "UnitType" | "Universe");
interface _ConceptualVariableConceptualVariable_measures_UnitTypeTypeValidTypeType extends Primitive._string { content: ConceptualVariableConceptualVariable_measures_UnitTypeTypeValidTypeType; }

interface _ConceptualVariableConceptualVariable_takesSentinelConceptsFrom_SentinelConceptualDomainType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: ConceptualVariableConceptualVariable_takesSentinelConceptsFrom_SentinelConceptualDomainTypeValidTypeType[];
}
interface ConceptualVariableConceptualVariable_takesSentinelConceptsFrom_SentinelConceptualDomainType extends _ConceptualVariableConceptualVariable_takesSentinelConceptsFrom_SentinelConceptualDomainType { constructor: { new(): ConceptualVariableConceptualVariable_takesSentinelConceptsFrom_SentinelConceptualDomainType }; }

type ConceptualVariableConceptualVariable_takesSentinelConceptsFrom_SentinelConceptualDomainTypeValidTypeType = "SentinelConceptualDomain";
interface _ConceptualVariableConceptualVariable_takesSentinelConceptsFrom_SentinelConceptualDomainTypeValidTypeType extends Primitive._string { content: ConceptualVariableConceptualVariable_takesSentinelConceptsFrom_SentinelConceptualDomainTypeValidTypeType; }

interface _ConceptualVariableConceptualVariable_takesSubstantiveConceptsFrom_SubstantiveConceptualDomainType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: ConceptualVariableConceptualVariable_takesSubstantiveConceptsFrom_SubstantiveConceptualDomainTypeValidTypeType[];
}
interface ConceptualVariableConceptualVariable_takesSubstantiveConceptsFrom_SubstantiveConceptualDomainType extends _ConceptualVariableConceptualVariable_takesSubstantiveConceptsFrom_SubstantiveConceptualDomainType { constructor: { new(): ConceptualVariableConceptualVariable_takesSubstantiveConceptsFrom_SubstantiveConceptualDomainType }; }

type ConceptualVariableConceptualVariable_takesSubstantiveConceptsFrom_SubstantiveConceptualDomainTypeValidTypeType = "SubstantiveConceptualDomain";
interface _ConceptualVariableConceptualVariable_takesSubstantiveConceptsFrom_SubstantiveConceptualDomainTypeValidTypeType extends Primitive._string { content: ConceptualVariableConceptualVariable_takesSubstantiveConceptsFrom_SubstantiveConceptualDomainTypeValidTypeType; }

/** Definition
  * ============
  * A set of decision points which determine the flow between the steps used to perform an activity.
  *
  * Examples
  * ==========
  * Loop, IfThenElse, RepeatWhile, etc. */
interface _ConditionalControlLogic extends _DeterministicImperative {
	/** A condition associated with the construct property of the ConditionalControlLogic. It is a logical expression which can be evaluated as either true or false to determine the specific execution of the associated  construct. */
	condition: CommandCode;
	/** controlConstruct is an enumeration of type ControlConstructType. The enumeration consists of IfThen, Else, Loop, RepeatUntil and RepeatWhile. */
	construct: ControlConstruct;
}
export interface ConditionalControlLogic extends _ConditionalControlLogic { constructor: { new(): ConditionalControlLogic }; }
export var ConditionalControlLogic: { new(): ConditionalControlLogic };

/** Definition
  * ============
  * Contact information for the individual or organization including location specification, address, web site, phone numbers, and other means of communication access. Address, location, telephone, and other means of communication can be repeated to express multiple means of a single type or change over time. Each major piece of contact information contains the element effectiveDates in order to date stamp the period for which the information is valid. */
interface _ContactInformation extends BaseType {
	/** The address for contact. */
	address?: Address[];
	/** Email contact information. */
	email?: Email[];
	/** Electronic messaging other than email. */
	emessaging?: ElectronicMessageSystem[];
	/** Telephone for contact. */
	telephone?: Telephone[];
	/** The URL of the Agent's website. */
	website?: WebLink[];
}
export interface ContactInformation extends _ContactInformation { constructor: { new(): ContactInformation }; }
export var ContactInformation: { new(): ContactInformation };

/** Definition
  * ============
  * Encapsulates contextual information of the key-value datastore to provide a scope to the instance key. The instance key is unique within the scope.
  *
  * Examples
  * ==========
  * A partition, cluster name and any other key-value datastore organization information.
  *
  * Explanatory notes
  * ===================
  * A key-value datastore can be organized into multiple contextual components.
  * Other data structure components that are part of the instance key, e.g. identifier and dimension components, guarantee uniqueness only within the scope of a contextual component.
  * Synthetic id components do guarantee global uniqueness, but they might complex to setup and maintain in many organizations.
  * Contextual components provide a simple mechanism to achieve uniqueness within a single key-value datastore.
  * When a key-value datastore is organized in contextual components, a contextual component prefix is added to the instance key to make it unique across the entire key-value datastore. */
interface _ContextualComponent extends _DataStructureComponent {}
export interface ContextualComponent extends _ContextualComponent { constructor: { new(): ContextualComponent }; }
export var ContextualComponent: { new(): ContextualComponent };

/** Definition
  * ============
  * Type of control construct used by the conditional control logic related to an activity. */
export type ControlConstruct = ("Else" | "IfThen" | "Loop" | "RepeatUntil" | "RepeatWhile");
interface _ControlConstruct extends Primitive._string { content: ControlConstruct; }

/** Definition
  * ============
  * Allows for unstructured content which may be an entry from an externally maintained controlled vocabulary.If the content is from a controlled vocabulary provide the code value of the entry, as well as a reference to the controlled vocabulary from which the value is taken. Provide as many of the identifying attributes as needed to adequately identify the controlled vocabulary. Note that DDI has published a number of controlled vocabularies applicable to several locations using the external controlled vocabulary entry structure. If the code portion of the controlled vocabulary entry is language specific (i.e. a list of keywords or subject headings) use language to specify that language. In most cases the code portion of an entry is not language specific although the description and usage may be managed in one or more languages. Use of shared controlled vocabularies helps support interoperability and machine actionability. */
interface _ControlledVocabularyEntry extends BaseType {
	/** A reference to the specific item in the vocabulary referenced in the vocabulary attribute, using a URI or other resolvable identifier. */
	entryReference?: Reference[];
	/** The value of the entry of the controlled vocabulary. If no controlled vocabulary is used the term is entered here and none of the properties defining the controlled vocabulary location are used. */
	entryValue?: string[];
	/** The name of the code list (controlled vocabulary). */
	name?: string;
	/** If the value of the string is "Other" or the equivalent from the codelist, this attribute can provide a more specific value not found in the codelist. */
	valueForOther?: string;
	/** A reference to the external controlled vocabulary, using a URI or other resolvable identifier. */
	vocabulary?: Reference;
}
export interface ControlledVocabularyEntry extends _ControlledVocabularyEntry { constructor: { new(): ControlledVocabularyEntry }; }
export var ControlledVocabularyEntry: { new(): ControlledVocabularyEntry };

/** Definition
  * ============
  * Control logic is a program in which the order of statements is explicit. Control logic is either deterministic (imperative) or non-deterministic (declarative). Deterministic control logic consists of control constructs. Declarative control logic is constraint- and/or rule-based. Control logic may contain control logic.
  *
  * Examples
  * ==========
  * A loop control construct is deterministic control logic. A script is deterministic control logic. Rule based scheduling is declarative control logic.
  *
  * Explanatory notes
  * ===================
  * DDI-CDI has extended control logic to include non-deterministic activity and step controls, which are not specifically described in DDI Lifecycle or DDI Codebook. */
interface _ControlLogic extends BaseType {
	/** A control construct has zero or more information flow definitions each of which provides the control construct with zero or more input and output parameters used or produced in the step/sub-step with which it is associated. */
	ControlLogic_has_InformationFlowDefinition?: ControlLogicControlLogic_has_InformationFlowDefinitionType[];
	/** Control logic is a container of control logic which is in turn a container of control logic ad infinitum so that it is able to represent the structure of a program. */
	ControlLogic_hasSubControlLogic_ControlLogic?: ControlLogicControlLogic_hasSubControlLogic_ControlLogicType[];
	/** Control logic informs a processing agent. The information may be deterministic or non-deterministic. */
	ControlLogic_informs_ProcessingAgent?: ControlLogicControlLogic_informs_ProcessingAgentType[];
	/** Control logic invokes an activity deterministically (either conditionally or unconditionally) or non-derministically (based on temporal constraints or rule-based scheduling). */
	ControlLogic_invokes_Activity: ControlLogicControlLogic_invokes_ActivityType[];
	/** A desription of the control logic in human-readable language. */
	description?: string;
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	/** Reference to the system or standard from which the workflow was taken. */
	workflow?: ControlledVocabularyEntry;
}
export interface ControlLogic extends _ControlLogic { constructor: { new(): ControlLogic }; }
export var ControlLogic: { new(): ControlLogic };

interface _ControlLogicControlLogic_has_InformationFlowDefinitionType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: ControlLogicControlLogic_has_InformationFlowDefinitionTypeValidTypeType[];
}
interface ControlLogicControlLogic_has_InformationFlowDefinitionType extends _ControlLogicControlLogic_has_InformationFlowDefinitionType { constructor: { new(): ControlLogicControlLogic_has_InformationFlowDefinitionType }; }

type ControlLogicControlLogic_has_InformationFlowDefinitionTypeValidTypeType = "InformationFlowDefinition";
interface _ControlLogicControlLogic_has_InformationFlowDefinitionTypeValidTypeType extends Primitive._string { content: ControlLogicControlLogic_has_InformationFlowDefinitionTypeValidTypeType; }

interface _ControlLogicControlLogic_hasSubControlLogic_ControlLogicType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: ControlLogicControlLogic_hasSubControlLogic_ControlLogicTypeValidTypeType[];
}
interface ControlLogicControlLogic_hasSubControlLogic_ControlLogicType extends _ControlLogicControlLogic_hasSubControlLogic_ControlLogicType { constructor: { new(): ControlLogicControlLogic_hasSubControlLogic_ControlLogicType }; }

type ControlLogicControlLogic_hasSubControlLogic_ControlLogicTypeValidTypeType = ("AllenIntervalAlgebra" | "ConditionalControlLogic" | "ControlLogic" | "DeterministicImperative" | "NonDeterministicDeclarative" | "RuleBasedScheduling" | "Sequence" | "TemporalConstraints" | "TemporalControlConstruct");
interface _ControlLogicControlLogic_hasSubControlLogic_ControlLogicTypeValidTypeType extends Primitive._string { content: ControlLogicControlLogic_hasSubControlLogic_ControlLogicTypeValidTypeType; }

interface _ControlLogicControlLogic_informs_ProcessingAgentType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: ControlLogicControlLogic_informs_ProcessingAgentTypeValidTypeType[];
}
interface ControlLogicControlLogic_informs_ProcessingAgentType extends _ControlLogicControlLogic_informs_ProcessingAgentType { constructor: { new(): ControlLogicControlLogic_informs_ProcessingAgentType }; }

type ControlLogicControlLogic_informs_ProcessingAgentTypeValidTypeType = ("Curator" | "ProcessingAgent" | "Service");
interface _ControlLogicControlLogic_informs_ProcessingAgentTypeValidTypeType extends Primitive._string { content: ControlLogicControlLogic_informs_ProcessingAgentTypeValidTypeType; }

interface _ControlLogicControlLogic_invokes_ActivityType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: ControlLogicControlLogic_invokes_ActivityTypeValidTypeType[];
}
interface ControlLogicControlLogic_invokes_ActivityType extends _ControlLogicControlLogic_invokes_ActivityType { constructor: { new(): ControlLogicControlLogic_invokes_ActivityType }; }

type ControlLogicControlLogic_invokes_ActivityTypeValidTypeType = ("Activity" | "Step");
interface _ControlLogicControlLogic_invokes_ActivityTypeValidTypeType extends Primitive._string { content: ControlLogicControlLogic_invokes_ActivityTypeValidTypeType; }

/** Definition
  * ============
  * Describes the commonalities and differences between two members using a textual description of both commonalities and differences plus an optional coding of the type of commonality. */
interface _CorrespondenceDefinition extends BaseType {
	/** A description of the common features of the two items. Supports multiple language versions of the same content as well as optional formatting of the content. */
	commonality?: InternationalString;
	/** Commonality expressed as a term or code. Supports the use of an external controlled vocabulary. If repeated, clarify each external controlled vocabulary used. */
	commonalityCode?: ControlledVocabularyEntry[];
	/** A description of the differences between the two items. Supports multiple language versions of the same content as well as optional formatting of the content. */
	difference?: InternationalString;
	/** Allows specification of exact match, close match, or disjoint. These relationships can be further defined by describing commonalities or differences or providing additional controlled vocabulary descriptions of relationships. */
	matching?: MatchingCriterion;
}
export interface CorrespondenceDefinition extends _CorrespondenceDefinition { constructor: { new(): CorrespondenceDefinition }; }
export var CorrespondenceDefinition: { new(): CorrespondenceDefinition };

/** Definition
  * ============
  * Set of relationships between the members within or between statistical classifications.
  *
  * Examples
  * ==========
  * Correspondence between the U.S. Standard Industrial Classification (SIC) and North American Industrial Classification System (NAICS).
  *
  * Explanatory notes
  * ===================
  * Correspondence tables are used with statistical classifications. For instance, it can relate two versions from the same classification series; statistical classifications from different classification series; a variant and the version on which it is based; or different versions of a variant. In the first and last examples, the correspondence table facilitates comparability over time. */
interface _CorrespondenceTable extends BaseType {
	/** Bundles the information useful for a data catalog entry.
	  *
	  * Examples would be creator, contributor, title, copyright, embargo, and license information
	  *
	  * A set of information useful for attribution, data discovery, and access.
	  * This is information that is tied to the identity of the object. If this information changes the version of the associated object changes. */
	catalogDetails?: CatalogDetails;
	/** Correspondence table has zero to many concept maps. */
	CorrespondenceTable_has_ConceptMap?: CorrespondenceTableCorrespondenceTable_has_ConceptMapType[];
	/** The person(s) who may be contacted for additional information about the correspondence table. Can be an individual or organization. */
	CorrespondenceTable_hasContact_Agent?: CorrespondenceTableCorrespondenceTable_hasContact_AgentType[];
	/** Level from which the correspondence is made. Correspondences might be restricted to a specified level in the node set. In this case, target items are assigned only to source items on the given level. If no level is indicated, source items can be assigned to any level of the target node set. */
	CorrespondenceTable_hasSource_Level?: CorrespondenceTableCorrespondenceTable_hasSource_LevelType;
	/** Level to which the correspondence is made. Correspondences might be restricted to a specified Level in the node set. In this case, target items are assigned only to source items on the given level. If no level is indicated, target items can be assigned to any level of the source node set. */
	CorrespondenceTable_hasTarget_Level?: CorrespondenceTableCorrespondenceTable_hasTarget_LevelType;
	/** The unit or group of persons who are responsible for the correspondence table (i.e., for maintaining and updating it). */
	CorrespondenceTable_isMaintainedBy_Agent?: CorrespondenceTableCorrespondenceTable_isMaintainedBy_AgentType;
	/** The statistical office, other authority or section that created and maintains the correspondence table. A correspondence table may have several owners. */
	CorrespondenceTable_isOwnedBy_Agent?: CorrespondenceTableCorrespondenceTable_isOwnedBy_AgentType[];
	/** The statistical classification(s) from which the correspondence is made. */
	CorrespondenceTable_mapsTo_StatisticalClassification: CorrespondenceTableCorrespondenceTable_mapsTo_StatisticalClassificationType[];
	/** Effective period of validity of the correspondence table. The correspondence table expresses the relationships between the two classifications as they existed on the period specified in the table. */
	effectiveDates?: DateRange;
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
}
export interface CorrespondenceTable extends _CorrespondenceTable { constructor: { new(): CorrespondenceTable }; }
export var CorrespondenceTable: { new(): CorrespondenceTable };

interface _CorrespondenceTableCorrespondenceTable_has_ConceptMapType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: CorrespondenceTableCorrespondenceTable_has_ConceptMapTypeValidTypeType[];
}
interface CorrespondenceTableCorrespondenceTable_has_ConceptMapType extends _CorrespondenceTableCorrespondenceTable_has_ConceptMapType { constructor: { new(): CorrespondenceTableCorrespondenceTable_has_ConceptMapType }; }

type CorrespondenceTableCorrespondenceTable_has_ConceptMapTypeValidTypeType = "ConceptMap";
interface _CorrespondenceTableCorrespondenceTable_has_ConceptMapTypeValidTypeType extends Primitive._string { content: CorrespondenceTableCorrespondenceTable_has_ConceptMapTypeValidTypeType; }

interface _CorrespondenceTableCorrespondenceTable_hasContact_AgentType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: CorrespondenceTableCorrespondenceTable_hasContact_AgentTypeValidTypeType[];
}
interface CorrespondenceTableCorrespondenceTable_hasContact_AgentType extends _CorrespondenceTableCorrespondenceTable_hasContact_AgentType { constructor: { new(): CorrespondenceTableCorrespondenceTable_hasContact_AgentType }; }

type CorrespondenceTableCorrespondenceTable_hasContact_AgentTypeValidTypeType = ("Agent" | "Curator" | "Individual" | "Machine" | "Organization" | "ProcessingAgent" | "Service");
interface _CorrespondenceTableCorrespondenceTable_hasContact_AgentTypeValidTypeType extends Primitive._string { content: CorrespondenceTableCorrespondenceTable_hasContact_AgentTypeValidTypeType; }

interface _CorrespondenceTableCorrespondenceTable_hasSource_LevelType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: CorrespondenceTableCorrespondenceTable_hasSource_LevelTypeValidTypeType[];
}
interface CorrespondenceTableCorrespondenceTable_hasSource_LevelType extends _CorrespondenceTableCorrespondenceTable_hasSource_LevelType { constructor: { new(): CorrespondenceTableCorrespondenceTable_hasSource_LevelType }; }

type CorrespondenceTableCorrespondenceTable_hasSource_LevelTypeValidTypeType = "Level";
interface _CorrespondenceTableCorrespondenceTable_hasSource_LevelTypeValidTypeType extends Primitive._string { content: CorrespondenceTableCorrespondenceTable_hasSource_LevelTypeValidTypeType; }

interface _CorrespondenceTableCorrespondenceTable_hasTarget_LevelType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: CorrespondenceTableCorrespondenceTable_hasTarget_LevelTypeValidTypeType[];
}
interface CorrespondenceTableCorrespondenceTable_hasTarget_LevelType extends _CorrespondenceTableCorrespondenceTable_hasTarget_LevelType { constructor: { new(): CorrespondenceTableCorrespondenceTable_hasTarget_LevelType }; }

type CorrespondenceTableCorrespondenceTable_hasTarget_LevelTypeValidTypeType = "Level";
interface _CorrespondenceTableCorrespondenceTable_hasTarget_LevelTypeValidTypeType extends Primitive._string { content: CorrespondenceTableCorrespondenceTable_hasTarget_LevelTypeValidTypeType; }

interface _CorrespondenceTableCorrespondenceTable_isMaintainedBy_AgentType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: CorrespondenceTableCorrespondenceTable_isMaintainedBy_AgentTypeValidTypeType[];
}
interface CorrespondenceTableCorrespondenceTable_isMaintainedBy_AgentType extends _CorrespondenceTableCorrespondenceTable_isMaintainedBy_AgentType { constructor: { new(): CorrespondenceTableCorrespondenceTable_isMaintainedBy_AgentType }; }

type CorrespondenceTableCorrespondenceTable_isMaintainedBy_AgentTypeValidTypeType = ("Agent" | "Curator" | "Individual" | "Machine" | "Organization" | "ProcessingAgent" | "Service");
interface _CorrespondenceTableCorrespondenceTable_isMaintainedBy_AgentTypeValidTypeType extends Primitive._string { content: CorrespondenceTableCorrespondenceTable_isMaintainedBy_AgentTypeValidTypeType; }

interface _CorrespondenceTableCorrespondenceTable_isOwnedBy_AgentType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: CorrespondenceTableCorrespondenceTable_isOwnedBy_AgentTypeValidTypeType[];
}
interface CorrespondenceTableCorrespondenceTable_isOwnedBy_AgentType extends _CorrespondenceTableCorrespondenceTable_isOwnedBy_AgentType { constructor: { new(): CorrespondenceTableCorrespondenceTable_isOwnedBy_AgentType }; }

type CorrespondenceTableCorrespondenceTable_isOwnedBy_AgentTypeValidTypeType = ("Agent" | "Curator" | "Individual" | "Machine" | "Organization" | "ProcessingAgent" | "Service");
interface _CorrespondenceTableCorrespondenceTable_isOwnedBy_AgentTypeValidTypeType extends Primitive._string { content: CorrespondenceTableCorrespondenceTable_isOwnedBy_AgentTypeValidTypeType; }

interface _CorrespondenceTableCorrespondenceTable_mapsTo_StatisticalClassificationType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: CorrespondenceTableCorrespondenceTable_mapsTo_StatisticalClassificationTypeValidTypeType[];
}
interface CorrespondenceTableCorrespondenceTable_mapsTo_StatisticalClassificationType extends _CorrespondenceTableCorrespondenceTable_mapsTo_StatisticalClassificationType { constructor: { new(): CorrespondenceTableCorrespondenceTable_mapsTo_StatisticalClassificationType }; }

type CorrespondenceTableCorrespondenceTable_mapsTo_StatisticalClassificationTypeValidTypeType = "StatisticalClassification";
interface _CorrespondenceTableCorrespondenceTable_mapsTo_StatisticalClassificationTypeValidTypeType extends Primitive._string { content: CorrespondenceTableCorrespondenceTable_mapsTo_StatisticalClassificationTypeValidTypeType; }

/** Definition
  * ============
  * Curator is a software agent that uses techniques such as natural language processing to map facts in the research data store to the condition part of a rule.
  *
  * Examples
  * ==========
  * Domain-specific curators are available as both open source and commercial products.
  *
  * Explanatory notes
  * ===================
  * The curator assists in identifying the rules that are currently in play in the rule set. */
interface _Curator extends _ProcessingAgent {}
export interface Curator extends _Curator { constructor: { new(): Curator }; }
export var Curator: { new(): Curator };

/** Definition
  * ============
  * Container for an instance value.
  *
  * Examples
  * ==========
  * A cell in a data cube or a table.
  *
  * Explanatory notes
  * ===================
  * A data point could be empty. It exists independently of the instance value to be stored in it. */
interface _DataPoint extends BaseType {
	/** Bundles the information useful for a data catalog entry. Examples would be creator, contributor, title, copyright, embargo, and license information. A set of information useful for attribution, data discovery, and access. This is information that is tied to the identity of the object. If this information changes the version of the associated object changes. */
	catalogDetails?: CatalogDetails;
	DataPoint_correspondsTo_DataStructureComponent?: DataPointDataPoint_correspondsTo_DataStructureComponentType[];
	/** The instance variable delimits the values which can populate a data point. Data point is described by one instance variable. */
	DataPoint_isDescribedBy_InstanceVariable: DataPointDataPoint_isDescribedBy_InstanceVariableType;
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
}
export interface DataPoint extends _DataPoint { constructor: { new(): DataPoint }; }
export var DataPoint: { new(): DataPoint };

interface _DataPointDataPoint_correspondsTo_DataStructureComponentType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: DataPointDataPoint_correspondsTo_DataStructureComponentTypeValidTypeType[];
}
interface DataPointDataPoint_correspondsTo_DataStructureComponentType extends _DataPointDataPoint_correspondsTo_DataStructureComponentType { constructor: { new(): DataPointDataPoint_correspondsTo_DataStructureComponentType }; }

type DataPointDataPoint_correspondsTo_DataStructureComponentTypeValidTypeType = ("AttributeComponent" | "ContextualComponent" | "DataStructure" | "DataStructureComponent" | "DimensionComponent" | "DimensionalDataStructure" | "IdentifierComponent" | "KeyValueStructure" | "LongDataStructure" | "MeasureComponent" | "QualifiedMeasure" | "SyntheticIdComponent" | "VariableDescriptorComponent" | "VariableValueComponent" | "WideDataStructure");
interface _DataPointDataPoint_correspondsTo_DataStructureComponentTypeValidTypeType extends Primitive._string { content: DataPointDataPoint_correspondsTo_DataStructureComponentTypeValidTypeType; }

interface _DataPointDataPoint_isDescribedBy_InstanceVariableType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: DataPointDataPoint_isDescribedBy_InstanceVariableTypeValidTypeType[];
}
interface DataPointDataPoint_isDescribedBy_InstanceVariableType extends _DataPointDataPoint_isDescribedBy_InstanceVariableType { constructor: { new(): DataPointDataPoint_isDescribedBy_InstanceVariableType }; }

type DataPointDataPoint_isDescribedBy_InstanceVariableTypeValidTypeType = "InstanceVariable";
interface _DataPointDataPoint_isDescribedBy_InstanceVariableTypeValidTypeType extends Primitive._string { content: DataPointDataPoint_isDescribedBy_InstanceVariableTypeValidTypeType; }

/** Definition
  * ============
  * Indexed location of the associated member within the associated list. */
interface _DataPointPosition extends BaseType {
	/** Data point position indexes zero to one data point. */
	DataPointPosition_indexes_DataPoint?: DataPointPositionDataPointPosition_indexes_DataPointType;
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	/** Index value of the member in an ordered array. */
	value: number;
}
export interface DataPointPosition extends _DataPointPosition { constructor: { new(): DataPointPosition }; }
export var DataPointPosition: { new(): DataPointPosition };

interface _DataPointPositionDataPointPosition_indexes_DataPointType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: DataPointPositionDataPointPosition_indexes_DataPointTypeValidTypeType[];
}
interface DataPointPositionDataPointPosition_indexes_DataPointType extends _DataPointPositionDataPointPosition_indexes_DataPointType { constructor: { new(): DataPointPositionDataPointPosition_indexes_DataPointType }; }

type DataPointPositionDataPointPosition_indexes_DataPointTypeValidTypeType = "DataPoint";
interface _DataPointPositionDataPointPosition_indexes_DataPointTypeValidTypeType extends Primitive._string { content: DataPointPositionDataPointPosition_indexes_DataPointTypeValidTypeType; }

/** Definition
  * ============
  * Relations used by the data point relation structure of a logical record to describe specific source-target data points and their relationship. */
interface _DataPointRelationship extends BaseType {
	DataPointRelationship_hasSource_DataPoint?: DataPointRelationshipDataPointRelationship_hasSource_DataPointType[];
	/** Data point relationship has zero to many target data points. */
	DataPointRelationship_hasTarget_DataPoint?: DataPointRelationshipDataPointRelationship_hasTarget_DataPointType[];
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	/** Specifies the semantics of the object in reference to a vocabulary, ontology, etc. */
	semantics?: ControlledVocabularyEntry;
}
export interface DataPointRelationship extends _DataPointRelationship { constructor: { new(): DataPointRelationship }; }
export var DataPointRelationship: { new(): DataPointRelationship };

interface _DataPointRelationshipDataPointRelationship_hasSource_DataPointType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: DataPointRelationshipDataPointRelationship_hasSource_DataPointTypeValidTypeType[];
}
interface DataPointRelationshipDataPointRelationship_hasSource_DataPointType extends _DataPointRelationshipDataPointRelationship_hasSource_DataPointType { constructor: { new(): DataPointRelationshipDataPointRelationship_hasSource_DataPointType }; }

type DataPointRelationshipDataPointRelationship_hasSource_DataPointTypeValidTypeType = "DataPoint";
interface _DataPointRelationshipDataPointRelationship_hasSource_DataPointTypeValidTypeType extends Primitive._string { content: DataPointRelationshipDataPointRelationship_hasSource_DataPointTypeValidTypeType; }

interface _DataPointRelationshipDataPointRelationship_hasTarget_DataPointType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: DataPointRelationshipDataPointRelationship_hasTarget_DataPointTypeValidTypeType[];
}
interface DataPointRelationshipDataPointRelationship_hasTarget_DataPointType extends _DataPointRelationshipDataPointRelationship_hasTarget_DataPointType { constructor: { new(): DataPointRelationshipDataPointRelationship_hasTarget_DataPointType }; }

type DataPointRelationshipDataPointRelationship_hasTarget_DataPointTypeValidTypeType = "DataPoint";
interface _DataPointRelationshipDataPointRelationship_hasTarget_DataPointTypeValidTypeType extends Primitive._string { content: DataPointRelationshipDataPointRelationship_hasTarget_DataPointTypeValidTypeType; }

/** Definition
  * ============
  * Organized collection of data based on keys. */
interface _DataSet extends BaseType {
	/** Bundles the information useful for a data catalog entry. Examples would be creator, contributor, title, copyright, embargo, and license information. A set of information useful for attribution, data discovery, and access. This is information that is tied to the identity of the object. If this information changes the version of the associated object changes. */
	catalogDetails?: CatalogDetails;
	DataSet_has_DataPoint?: DataSetDataSet_has_DataPointType[];
	DataSet_has_Key?: DataSetDataSet_has_KeyType[];
	DataSet_isStructuredBy_DataStructure?: DataSetDataSet_isStructuredBy_DataStructureType[];
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
}
export interface DataSet extends _DataSet { constructor: { new(): DataSet }; }
export var DataSet: { new(): DataSet };

interface _DataSetDataSet_has_DataPointType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType: DataSetDataSet_has_DataPointTypeValidTypeType[];
}
interface DataSetDataSet_has_DataPointType extends _DataSetDataSet_has_DataPointType { constructor: { new(): DataSetDataSet_has_DataPointType }; }

type DataSetDataSet_has_DataPointTypeValidTypeType = "DataPoint";
interface _DataSetDataSet_has_DataPointTypeValidTypeType extends Primitive._string { content: DataSetDataSet_has_DataPointTypeValidTypeType; }

interface _DataSetDataSet_has_KeyType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType: DataSetDataSet_has_KeyTypeValidTypeType[];
}
interface DataSetDataSet_has_KeyType extends _DataSetDataSet_has_KeyType { constructor: { new(): DataSetDataSet_has_KeyType }; }

type DataSetDataSet_has_KeyTypeValidTypeType = ("DimensionalKey" | "InstanceKey" | "Key" | "LongKey" | "WideKey");
interface _DataSetDataSet_has_KeyTypeValidTypeType extends Primitive._string { content: DataSetDataSet_has_KeyTypeValidTypeType; }

interface _DataSetDataSet_isStructuredBy_DataStructureType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: DataSetDataSet_isStructuredBy_DataStructureTypeValidTypeType[];
}
interface DataSetDataSet_isStructuredBy_DataStructureType extends _DataSetDataSet_isStructuredBy_DataStructureType { constructor: { new(): DataSetDataSet_isStructuredBy_DataStructureType }; }

type DataSetDataSet_isStructuredBy_DataStructureTypeValidTypeType = ("DataStructure" | "DimensionalDataStructure" | "KeyValueStructure" | "LongDataStructure" | "WideDataStructure");
interface _DataSetDataSet_isStructuredBy_DataStructureTypeValidTypeType extends Primitive._string { content: DataSetDataSet_isStructuredBy_DataStructureTypeValidTypeType; }

/** Definition
  * ============
  * Collection of logical records.
  *
  * Examples
  * ==========
  * The data lineage of an individual business process or an entire data pipeline are both examples of a logical record relation structures. In a data lineage we can observe how logical records are connected within a business process or across business processes.
  *
  * Explanatory notes
  * ===================
  * Keep in mind that a logical records are definitions, not a "datasets". Logical records organized in a structured collection is called a logical record relation structure. Instances of logical records instantiated as organizations of data points hosting data are described in format description. A data store is reusable across studies. Each study has at most one data store. */
interface _DataStore extends BaseType {
	/** General information about missing data, e.g., that missing data have been standardized across the collection, missing data are present because of merging, etc.-  corresponds to DDI2.5 dataMsng. */
	aboutMissing?: InternationalString;
	/** If value is False, the members are unique within the collection - if True, there may be duplicates. (Note that a mathematical “bag” permits duplicates and is unordered - a “set” does not have duplicates and may be ordered.) */
	allowsDuplicates: boolean;
	/** Bundles the information useful for a data catalog entry. Examples would be creator, contributor, title, copyright, embargo, and license information. A set of information useful for attribution, data discovery, and access. This is information that is tied to the identity of the object. If this information changes the version of the associated object changes. */
	catalogDetails?: CatalogDetails;
	/** Default character set used in the Data Store. */
	characterSet?: string;
	DataStore_has_LogicalRecord?: DataStoreDataStore_has_LogicalRecordType[];
	DataStore_has_LogicalRecordPosition?: DataStoreDataStore_has_LogicalRecordPositionType[];
	/** The record relation that defines the relationship and linking requirements between logical records in the data store. */
	DataStore_has_RecordRelation?: DataStoreDataStore_has_RecordRelationType;
	/** The conceptual basis for the collection of members. */
	DataStore_isDefinedBy_Concept?: DataStoreDataStore_isDefinedBy_ConceptType[];
	/** The type of datastore. Could be delimited file, fixed record length file, relational database, etc. Points to an external definition which can be part of a controlled vocabulary maintained by the DDI Alliance. */
	dataStoreType?: ControlledVocabularyEntry;
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	/** Human understandable name (liguistic signifier, word, phrase, or mnemonic). May follow ISO/IEC 11179-5 naming principles, and have context provided to specify usage. */
	name?: ObjectName[];
	/** Intent or reason for the object/the description of the object. */
	purpose?: InternationalString;
	/** The number of records in the Data Store. */
	recordCount?: number;
}
export interface DataStore extends _DataStore { constructor: { new(): DataStore }; }
export var DataStore: { new(): DataStore };

interface _DataStoreDataStore_has_LogicalRecordPositionType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType: DataStoreDataStore_has_LogicalRecordPositionTypeValidTypeType[];
}
interface DataStoreDataStore_has_LogicalRecordPositionType extends _DataStoreDataStore_has_LogicalRecordPositionType { constructor: { new(): DataStoreDataStore_has_LogicalRecordPositionType }; }

type DataStoreDataStore_has_LogicalRecordPositionTypeValidTypeType = "LogicalRecordPosition";
interface _DataStoreDataStore_has_LogicalRecordPositionTypeValidTypeType extends Primitive._string { content: DataStoreDataStore_has_LogicalRecordPositionTypeValidTypeType; }

interface _DataStoreDataStore_has_LogicalRecordType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: DataStoreDataStore_has_LogicalRecordTypeValidTypeType[];
}
interface DataStoreDataStore_has_LogicalRecordType extends _DataStoreDataStore_has_LogicalRecordType { constructor: { new(): DataStoreDataStore_has_LogicalRecordType }; }

type DataStoreDataStore_has_LogicalRecordTypeValidTypeType = "LogicalRecord";
interface _DataStoreDataStore_has_LogicalRecordTypeValidTypeType extends Primitive._string { content: DataStoreDataStore_has_LogicalRecordTypeValidTypeType; }

interface _DataStoreDataStore_has_RecordRelationType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: DataStoreDataStore_has_RecordRelationTypeValidTypeType[];
}
interface DataStoreDataStore_has_RecordRelationType extends _DataStoreDataStore_has_RecordRelationType { constructor: { new(): DataStoreDataStore_has_RecordRelationType }; }

type DataStoreDataStore_has_RecordRelationTypeValidTypeType = "RecordRelation";
interface _DataStoreDataStore_has_RecordRelationTypeValidTypeType extends Primitive._string { content: DataStoreDataStore_has_RecordRelationTypeValidTypeType; }

interface _DataStoreDataStore_isDefinedBy_ConceptType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: DataStoreDataStore_isDefinedBy_ConceptTypeValidTypeType[];
}
interface DataStoreDataStore_isDefinedBy_ConceptType extends _DataStoreDataStore_isDefinedBy_ConceptType { constructor: { new(): DataStoreDataStore_isDefinedBy_ConceptType }; }

type DataStoreDataStore_isDefinedBy_ConceptTypeValidTypeType = ("Category" | "Concept" | "ConceptualValue" | "ConceptualVariable" | "DescriptorVariable" | "DimensionalKeyDefinitionMember" | "InstanceVariable" | "KeyDefinitionMember" | "Population" | "ReferenceVariable" | "RepresentedVariable" | "UnitType" | "Universe");
interface _DataStoreDataStore_isDefinedBy_ConceptTypeValidTypeType extends Primitive._string { content: DataStoreDataStore_isDefinedBy_ConceptTypeValidTypeType; }

/** Definition
  * ============
  * Data organization based on reusable data structure components. */
interface _DataStructure extends _DataStructureComponent {
	DataStructure_has_ComponentPosition?: DataStructureDataStructure_has_ComponentPositionType[];
	DataStructure_has_DataStructureComponent?: DataStructureDataStructure_has_DataStructureComponentType[];
	DataStructure_has_ForeignKey?: DataStructureDataStructure_has_ForeignKeyType[];
	DataStructure_has_PrimaryKey?: DataStructureDataStructure_has_PrimaryKeyType;
}
export interface DataStructure extends _DataStructure { constructor: { new(): DataStructure }; }
export var DataStructure: { new(): DataStructure };

/** Definition
  * ============
  * Role given to a represented variable in the context of a data structure.
  *
  * Explanatory notes
  * ===================
  * A represented variable can have different roles in different data structures. For instance, the variable sex can be a measure in a wide data structure and a dimension in a dimensional data structure. */
interface _DataStructureComponent extends BaseType {
	/** Data structure component is defined by zero to one represented variable. */
	DataStructureComponent_isDefinedBy_RepresentedVariable?: DataStructureComponentDataStructureComponent_isDefinedBy_RepresentedVariableType;
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	/** Qualifies the purpose or use expressed as a paired external controlled vocabulary. */
	semantic?: PairedControlledVocabularyEntry[];
	/** The role played by the component for the data set for purposes of harmonization and integration, typically regarding geography, time, etc. */
	specialization?: SpecializationRole;
}
export interface DataStructureComponent extends _DataStructureComponent { constructor: { new(): DataStructureComponent }; }
export var DataStructureComponent: { new(): DataStructureComponent };

interface _DataStructureComponentDataStructureComponent_isDefinedBy_RepresentedVariableType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: DataStructureComponentDataStructureComponent_isDefinedBy_RepresentedVariableTypeValidTypeType[];
}
interface DataStructureComponentDataStructureComponent_isDefinedBy_RepresentedVariableType extends _DataStructureComponentDataStructureComponent_isDefinedBy_RepresentedVariableType { constructor: { new(): DataStructureComponentDataStructureComponent_isDefinedBy_RepresentedVariableType }; }

type DataStructureComponentDataStructureComponent_isDefinedBy_RepresentedVariableTypeValidTypeType = ("DescriptorVariable" | "InstanceVariable" | "ReferenceVariable" | "RepresentedVariable");
interface _DataStructureComponentDataStructureComponent_isDefinedBy_RepresentedVariableTypeValidTypeType extends Primitive._string { content: DataStructureComponentDataStructureComponent_isDefinedBy_RepresentedVariableTypeValidTypeType; }

interface _DataStructureDataStructure_has_ComponentPositionType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType: DataStructureDataStructure_has_ComponentPositionTypeValidTypeType[];
}
interface DataStructureDataStructure_has_ComponentPositionType extends _DataStructureDataStructure_has_ComponentPositionType { constructor: { new(): DataStructureDataStructure_has_ComponentPositionType }; }

type DataStructureDataStructure_has_ComponentPositionTypeValidTypeType = "ComponentPosition";
interface _DataStructureDataStructure_has_ComponentPositionTypeValidTypeType extends Primitive._string { content: DataStructureDataStructure_has_ComponentPositionTypeValidTypeType; }

interface _DataStructureDataStructure_has_DataStructureComponentType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: DataStructureDataStructure_has_DataStructureComponentTypeValidTypeType[];
}
interface DataStructureDataStructure_has_DataStructureComponentType extends _DataStructureDataStructure_has_DataStructureComponentType { constructor: { new(): DataStructureDataStructure_has_DataStructureComponentType }; }

type DataStructureDataStructure_has_DataStructureComponentTypeValidTypeType = ("AttributeComponent" | "ContextualComponent" | "DataStructure" | "DataStructureComponent" | "DimensionComponent" | "DimensionalDataStructure" | "IdentifierComponent" | "KeyValueStructure" | "LongDataStructure" | "MeasureComponent" | "QualifiedMeasure" | "SyntheticIdComponent" | "VariableDescriptorComponent" | "VariableValueComponent" | "WideDataStructure");
interface _DataStructureDataStructure_has_DataStructureComponentTypeValidTypeType extends Primitive._string { content: DataStructureDataStructure_has_DataStructureComponentTypeValidTypeType; }

interface _DataStructureDataStructure_has_ForeignKeyType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType: DataStructureDataStructure_has_ForeignKeyTypeValidTypeType[];
}
interface DataStructureDataStructure_has_ForeignKeyType extends _DataStructureDataStructure_has_ForeignKeyType { constructor: { new(): DataStructureDataStructure_has_ForeignKeyType }; }

type DataStructureDataStructure_has_ForeignKeyTypeValidTypeType = "ForeignKey";
interface _DataStructureDataStructure_has_ForeignKeyTypeValidTypeType extends Primitive._string { content: DataStructureDataStructure_has_ForeignKeyTypeValidTypeType; }

interface _DataStructureDataStructure_has_PrimaryKeyType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType: DataStructureDataStructure_has_PrimaryKeyTypeValidTypeType[];
}
interface DataStructureDataStructure_has_PrimaryKeyType extends _DataStructureDataStructure_has_PrimaryKeyType { constructor: { new(): DataStructureDataStructure_has_PrimaryKeyType }; }

type DataStructureDataStructure_has_PrimaryKeyTypeValidTypeType = "PrimaryKey";
interface _DataStructureDataStructure_has_PrimaryKeyTypeValidTypeType extends Primitive._string { content: DataStructureDataStructure_has_PrimaryKeyTypeValidTypeType; }

/** Definition
  * ============
  * Expresses a date/time range using a start date and end date (both with the structure of Date and supporting the use of ISO and non-ISO date structures). Use in all locations where a range of dates is required, i.e. validFor, embargoPeriod, collectionPeriod, etc. */
interface _DateRange extends BaseType {
	/** The date (time) designating the end of the period or range. */
	endDate?: CombinedDate;
	/** The date (time) designating the beginning of the period or range. */
	startDate?: CombinedDate;
}
export interface DateRange extends _DateRange { constructor: { new(): DateRange }; }
export var DateRange: { new(): DateRange };

/** Definition
  * ============
  * Correspondence of a data instance to the concept it represents.
  *
  * Examples
  * ==========
  * A systolic blood pressure of 122 is measured. The single data instance (instance value) for that measurement is the character string "122". The datum in this case is the association of the conceptual value, i.e. the underlying measured concept (a blood pressure at that level), with the instance value.
  * if a datum represents the conceptual value “married” with a code “M,” it is not the same datum where that conceptual value is represented with a code “1”. If the datum which uses the code “M” is present in more than one data set, it is still the same datum.
  *
  * Explanatory notes
  * ===================
  * The datum is a reification of the association between instance value and conceptual value. It is a designation (a representation of a concept by a sign) in the signification pattern. The data instance (instance value) is the signifier and the concept it represents (conceptual value) is the signified. The datum has an association with an instance variable which allows the attachment of a unit of measurement, a datatype, and a population. These instance variable attributes are critical for interpreting the signifier.  NOTE: This is NOT datum as defined in The Data Documentation Initiative Lifecycle specification, which is more limited in breadth. This specification takes a little more formal (semiotic) description of a datum using the signification pattern.
  * The datum is reusable, and may appear in more than one data set, carrying with it its full contextualized meaning and identity. The instance variables and instance values with which it is associated will therefore be functionally similar or identical across its appearance in different data instances. Instance variable and instance value are specific to a single data set instance – datum is not. */
interface _Datum extends BaseType {
	/** Bundles the information useful for a data catalog entry. Examples would be creator, contributor, title, copyright, embargo, and license information. A set of information useful for attribution, data discovery, and access. This is information that is tied to the identity of the object. If this information changes the version of the associated object changes. */
	catalogDetails?: CatalogDetails;
	Datum_denotes_ConceptualValue: DatumDatum_denotes_ConceptualValueType;
	/** A datum is bounded by an instance variable. The datum is drawn from a set of values, either substantive or sentinel described by the value domain of the instance variable. */
	Datum_isBoundedBy_InstanceVariable: DatumDatum_isBoundedBy_InstanceVariableType[];
	Datum_uses_InstanceValue: DatumDatum_uses_InstanceValueType[];
	Datum_uses_Notation?: DatumDatum_uses_NotationType;
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
}
export interface Datum extends _Datum { constructor: { new(): Datum }; }
export var Datum: { new(): Datum };

interface _DatumDatum_denotes_ConceptualValueType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: DatumDatum_denotes_ConceptualValueTypeValidTypeType[];
}
interface DatumDatum_denotes_ConceptualValueType extends _DatumDatum_denotes_ConceptualValueType { constructor: { new(): DatumDatum_denotes_ConceptualValueType }; }

type DatumDatum_denotes_ConceptualValueTypeValidTypeType = ("ConceptualValue" | "DimensionalKeyDefinitionMember" | "KeyDefinitionMember");
interface _DatumDatum_denotes_ConceptualValueTypeValidTypeType extends Primitive._string { content: DatumDatum_denotes_ConceptualValueTypeValidTypeType; }

interface _DatumDatum_isBoundedBy_InstanceVariableType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: DatumDatum_isBoundedBy_InstanceVariableTypeValidTypeType[];
}
interface DatumDatum_isBoundedBy_InstanceVariableType extends _DatumDatum_isBoundedBy_InstanceVariableType { constructor: { new(): DatumDatum_isBoundedBy_InstanceVariableType }; }

type DatumDatum_isBoundedBy_InstanceVariableTypeValidTypeType = "InstanceVariable";
interface _DatumDatum_isBoundedBy_InstanceVariableTypeValidTypeType extends Primitive._string { content: DatumDatum_isBoundedBy_InstanceVariableTypeValidTypeType; }

interface _DatumDatum_uses_InstanceValueType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: DatumDatum_uses_InstanceValueTypeValidTypeType[];
}
interface DatumDatum_uses_InstanceValueType extends _DatumDatum_uses_InstanceValueType { constructor: { new(): DatumDatum_uses_InstanceValueType }; }

type DatumDatum_uses_InstanceValueTypeValidTypeType = ("Descriptor" | "DimensionalKeyMember" | "InstanceValue" | "KeyMember" | "LongMainKeyMember" | "MainKeyMember" | "ReferenceValue" | "WideKeyMember");
interface _DatumDatum_uses_InstanceValueTypeValidTypeType extends Primitive._string { content: DatumDatum_uses_InstanceValueTypeValidTypeType; }

interface _DatumDatum_uses_NotationType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: DatumDatum_uses_NotationTypeValidTypeType[];
}
interface DatumDatum_uses_NotationType extends _DatumDatum_uses_NotationType { constructor: { new(): DatumDatum_uses_NotationType }; }

type DatumDatum_uses_NotationTypeValidTypeType = "Notation";
interface _DatumDatum_uses_NotationTypeValidTypeType extends Primitive._string { content: DatumDatum_uses_NotationTypeValidTypeType; }

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
	  * ============
	  * Complex relation structure for use with statistical classification.
	  *
	  * Examples
	  * ==========
	  * A classification item structure for the International Standard Classification of Occupations (ISCO-08: https://www.ilo.org/public/english/bureau/stat/isco/isco08/) would describe each of the major classifications as a parent of its sub-classifications. 1 Managers, for example would be listed as a parent of four sub groups: 11 Chief Executives, Senior Officials and Legislators; 12 Chief Executives, Senior Officials and Legislators; 13 Production and Specialized Services Managers; and 14 Hospitality, Retail and Other Services Managers.
	  *
	  * Explanatory notes
	  * ===================
	  * The classification item structure has a set of classification item relationships which are basically adjacency lists. A source classification item has a described relationship to a target list of classification items. The semantic might be, for example, "parentOf", or "contains", etc. */
	ClassificationItemStructure?: ClassificationItemStructure[];
	/** Definition
	  * ============
	  * The index of a classification within a classification family expressed as an integer, progressing upward from 0 or 1. */
	ClassificationPosition?: ClassificationPosition[];
	/** Definition
	  * ============
	  * Ensemble of one or more statistical classifications, based on the same concept, and related to each other as versions or updates.
	  *
	  * Examples
	  * ==========
	  * ISIC or ISCO
	  * SIC (with different published versions related to the publication year).
	  *
	  * Explanatory notes
	  * ===================
	  * Typically, these statistical classifications have the same name. */
	ClassificationSeries?: ClassificationSeries[];
	/** Definition
	  * ============
	  * Structure for describing the complex relationships between statistical classifications in a classification series.
	  *
	  * Examples
	  * ==========
	  * A classification series that branches into separately versioned classifications.
	  *
	  * Explanatory notes
	  * ===================
	  * Can use relation specification information to more fully describe the relationship between members such as parent/child, whole/part, general/specific, equivalence, etc. */
	ClassificationSeriesStructure?: ClassificationSeriesStructure[];
	/** Definition
	  * ============
	  * The characters used as a symbol to designate a category within a codelist or classification. (Formally, a sign for which the signifier is non-linguistic alphanumeric string.)
	  *
	  * Examples
	  * ==========
	  * The letter M might stand for the category "Male" in the codeList called "Gender".
	  *
	  * Explanatory notes
	  * ===================
	  * A non-linguistic alphanumeric string is one which does not correspond to a word in natural language. For use in a codelist. The representation property (value) is expressed as it would be found in a data file. Multiple representations may relate to the same category but should be expressed as separate codes.  It should not be confused with a classification item which is a placeholder for a position in a statistical classification. */
	Code?: Code[];
	/** Definition
	  * ============
	  * List of codes and associated categories.
	  *
	  * Examples
	  * ==========
	  * The codes "M" and "F" could point to "Male" and "Female" categories respectively.  A code list for an occupational classification system like the International Standard Classification of Occupations (ISCO-08: https://www.ilo.org/public/english/bureau/stat/isco/isco08/) could use a classification relation structure to describe a hierarchy (Chief Executives and Administrative and Commercial Managers as subtypes of Managers).
	  *
	  * Explanatory notes
	  * ===================
	  * List may be flat or hierarchical. A hierarchical structure may have an indexed order for intended presentation even though the content within levels of the hierarchy are conceptually unordered. For hierarchical structures classification item structure is used to provide additional information on the structure and organization of the categories. Note that a category set can be structured by a classification relation structure without the need for associating any codes with the categories. This allows for the creation of a category set, for example for a response domain, without an associated codelist. */
	CodeList?: CodeList[];
	/** Definition
	  * ============
	  * Relation structure of codes within a codelist.
	  *
	  * Explanatory notes
	  * ===================
	  * Allows for the specification of complex relationships among codes. The code list structure employs a set of code relationips to describe the relationship among concepts. Each code relationship is a one to many description of connections between codes. Together they might commonly describe relationships as complex as a hierarchy. */
	CodeListStructure?: CodeListStructure[];
	/** Definition
	  * ============
	  * An index within an order intended for presentation (even though the content within levels of the hierarchy may be conceptually unordered). Expressed as an integer counting upward from 01 or 1. */
	CodePosition?: CodePosition[];
	/** Definition
	  * ============
	  * Source target relationship between codes in a code relation structure. */
	CodeRelationship?: CodeRelationship[];
	/** Definition
	  * ============
	  * Indexes the components in a data structure using integers with a position indicated by incrementing upward from 0 or 1. */
	ComponentPosition?: ComponentPosition[];
	/** Definition
	  * ============
	  * Unit of thought differentiated by characteristics (from the Generic Statistical Information Model version 1.2: https://statswiki.unece.org/display/clickablegsim/Concept).
	  *
	  * Examples
	  * ==========
	  * Velocity, Distance, Poverty, Income, Household Relationship, Family, Gender, Business Establishment, Satisfaction, Mass, Air Quality, etc.
	  *
	  * Explanatory notes
	  * ===================
	  * Many DDI-CDI classes are subtypes of the concept class including category, universe, unit type, conceptual variable. This class realizes the pattern class signified and as such a concept can be denoted by a sign. */
	Concept?: Concept[];
	/** Definition
	  * ============
	  * Correspondence between concepts in a correspondence table.
	  *
	  * Examples
	  * ==========
	  * A simple example might map the following 2 martial status category sets:  MS1: single, married, widowed, divorced. MS2: single, married.  So, a correspondence table between these 2 category sets might look like this: MS1 single - MS2 single; MS1 widowed - MS2 single; MS1 divorced - MS2 single; MS1 married - MS2 married.
	  *
	  * Explanatory notes
	  * ===================
	  * A concept map is the pairing of similar concepts. Each concept in the map belongs to a different collection. The collection of maps for all the concepts in corresponding collections is a correspondence table. */
	ConceptMap?: ConceptMap[];
	/** Definition
	  * ============
	  * Relationship between a pair of concepts in a collection of concepts. Use controlled vocabulary provided in semantics to identify the type of relationship (relation, e.g. ParentChild, WholePart, etc.)
	  *
	  * Examples
	  * ==========
	  * Apple (a specialized concept) is a kind of fruit (a generic concept). A wheel (a partitive concept) is part of a car (a whole concept).
	  *
	  * Explanatory notes
	  * ===================
	  * The idea is similar to category relationship, except it applies generally and not just for categories. */
	ConceptRelationship?: ConceptRelationship[];
	/** Definition
	  * ============
	  * Relations of concepts within a collection.
	  *
	  * Examples
	  * ==========
	  * A concept of vacation might be described as having sub-types of beach vacation and mountain vacation.
	  *
	  * Explanatory notes
	  * ===================
	  * The concept structure employs a set of concept relationships to describe the relationship among concepts. Each concept relationship is a one to many description of connections between concepts. Together they can describe relationships as complex as a hierarchy or even a complete cyclical network as in a concept map. Allows for the specification of complex relationships among concepts. */
	ConceptStructure?: ConceptStructure[];
	/** Definition
	  * ============
	  * Set of concepts structured by the relations among them [GSIM 1.1].
	  *
	  * Examples
	  * ==========
	  * 1) Concept of Sex: Male, Female, Other.
	  * 2) Concept of Household Relationship: Household Head, Spouse of Household Head, Child of Household Head, Unrelated Household Member, etc.
	  *
	  * Explanatory notes
	  * ===================
	  * Note that this class can be used with concepts, classifications, universes, populations, unit types and any other class that extends from concept. */
	ConceptSystem?: ConceptSystem[];
	/** Definition
	  * ============
	  * Relationship between 2 or more concept systems described through mapping similarity relationships between their member concepts.
	  *
	  * Examples
	  * ==========
	  * Correspondence between the concepts used to define the amount of salt dissolved in a body of water: the concepts "salinity" and "saltiness" might be described as equivalent, for example.
	  *
	  * Explanatory notes
	  * ===================
	  * Describes correspondence with one or more maps which identify a source and target concept and defines their commonality and difference using descriptive text and controlled vocabularies. */
	ConceptSystemCorrespondence?: ConceptSystemCorrespondence[];
	/** Definition
	  * ============
	  * Set of concepts, where each concept is intended to be used as the meaning (signified) for a datum.
	  *
	  * Examples
	  * ==========
	  * Substantive: Housing Unit Tenure - Owned, Rented, Vacant. Sentinel: Non-response - Refused, Don't Know, Not Applicable
	  *
	  * Explanatory notes
	  * ===================
	  * Intent of a conceptual domain is defining a set of concepts used to measure a broader concept. For effective use they should be discrete (non-overlapping) and provide exhaustive coverage of the broader concept. The constituent concepts can be either sentinel or substantive,  The set can be described by either enumeration or by an expression. */
	ConceptualDomain?: ConceptualDomain[];
	/** Definition
	  * ============
	  * Concept (with a notion of equality defined) being observed, captured, or derived which is associated to a single data instance.
	  *
	  * Examples
	  * ==========
	  * A systolic blood pressure of 122 is measured. The instance value for that measurement in this paragraph is the character string "122". The associated measured concept (a blood pressure at that level) is the conceptual value.  The conceptual value comes from a conceptual domain associated with a conceptual variable.
	  *
	  * Explanatory notes
	  * ===================
	  * This is the concept associated to the actual instance of data that is stored in a data point (the signified of a datum in the signification pattern). */
	ConceptualValue?: ConceptualValue[];
	/** Definition
	  * ============
	  * A variable at the highest level of abstraction.
	  *
	  * Examples
	  * ==========
	  * A gender variable defining two categories – "male" and "female" allowing relating each of these to concepts having description of how these categories are decided.
	  *
	  * Explanatory notes
	  * ===================
	  * The conceptual variable allows for describing the domain of concepts it can take on as well as the type of unit that can be measured. A conceptual variable for blood pressure might, for example describe the conditions under which the pressure is to be taken (sitting as opposed to standing) and a conceptual value domain as height of mercury – without units. One represented variable would further refine this by specifying inches as the unit of measurement for the height. Another might specify that the height be represented in centimeters. Both represented variables could reference the same conceptual variable to indicate in what way they are comparable. */
	ConceptualVariable?: ConceptualVariable[];
	/** Definition
	  * ============
	  * A set of decision points which determine the flow between the steps used to perform an activity.
	  *
	  * Examples
	  * ==========
	  * Loop, IfThenElse, RepeatWhile, etc. */
	ConditionalControlLogic?: ConditionalControlLogic[];
	/** Definition
	  * ============
	  * Encapsulates contextual information of the key-value datastore to provide a scope to the instance key. The instance key is unique within the scope.
	  *
	  * Examples
	  * ==========
	  * A partition, cluster name and any other key-value datastore organization information.
	  *
	  * Explanatory notes
	  * ===================
	  * A key-value datastore can be organized into multiple contextual components.
	  * Other data structure components that are part of the instance key, e.g. identifier and dimension components, guarantee uniqueness only within the scope of a contextual component.
	  * Synthetic id components do guarantee global uniqueness, but they might complex to setup and maintain in many organizations.
	  * Contextual components provide a simple mechanism to achieve uniqueness within a single key-value datastore.
	  * When a key-value datastore is organized in contextual components, a contextual component prefix is added to the instance key to make it unique across the entire key-value datastore. */
	ContextualComponent?: ContextualComponent[];
	/** Definition
	  * ============
	  * Control logic is a program in which the order of statements is explicit. Control logic is either deterministic (imperative) or non-deterministic (declarative). Deterministic control logic consists of control constructs. Declarative control logic is constraint- and/or rule-based. Control logic may contain control logic.
	  *
	  * Examples
	  * ==========
	  * A loop control construct is deterministic control logic. A script is deterministic control logic. Rule based scheduling is declarative control logic.
	  *
	  * Explanatory notes
	  * ===================
	  * DDI-CDI has extended control logic to include non-deterministic activity and step controls, which are not specifically described in DDI Lifecycle or DDI Codebook. */
	ControlLogic?: ControlLogic[];
	/** Definition
	  * ============
	  * Set of relationships between the members within or between statistical classifications.
	  *
	  * Examples
	  * ==========
	  * Correspondence between the U.S. Standard Industrial Classification (SIC) and North American Industrial Classification System (NAICS).
	  *
	  * Explanatory notes
	  * ===================
	  * Correspondence tables are used with statistical classifications. For instance, it can relate two versions from the same classification series; statistical classifications from different classification series; a variant and the version on which it is based; or different versions of a variant. In the first and last examples, the correspondence table facilitates comparability over time. */
	CorrespondenceTable?: CorrespondenceTable[];
	/** Definition
	  * ============
	  * Curator is a software agent that uses techniques such as natural language processing to map facts in the research data store to the condition part of a rule.
	  *
	  * Examples
	  * ==========
	  * Domain-specific curators are available as both open source and commercial products.
	  *
	  * Explanatory notes
	  * ===================
	  * The curator assists in identifying the rules that are currently in play in the rule set. */
	Curator?: Curator[];
	/** Definition
	  * ============
	  * Container for an instance value.
	  *
	  * Examples
	  * ==========
	  * A cell in a data cube or a table.
	  *
	  * Explanatory notes
	  * ===================
	  * A data point could be empty. It exists independently of the instance value to be stored in it. */
	DataPoint?: DataPoint[];
	/** Definition
	  * ============
	  * Indexed location of the associated member within the associated list. */
	DataPointPosition?: DataPointPosition[];
	/** Definition
	  * ============
	  * Relations used by the data point relation structure of a logical record to describe specific source-target data points and their relationship. */
	DataPointRelationship?: DataPointRelationship[];
	/** Definition
	  * ============
	  * Organized collection of data based on keys. */
	DataSet?: DataSet[];
	/** Definition
	  * ============
	  * Collection of logical records.
	  *
	  * Examples
	  * ==========
	  * The data lineage of an individual business process or an entire data pipeline are both examples of a logical record relation structures. In a data lineage we can observe how logical records are connected within a business process or across business processes.
	  *
	  * Explanatory notes
	  * ===================
	  * Keep in mind that a logical records are definitions, not a "datasets". Logical records organized in a structured collection is called a logical record relation structure. Instances of logical records instantiated as organizations of data points hosting data are described in format description. A data store is reusable across studies. Each study has at most one data store. */
	DataStore?: DataStore[];
	/** Definition
	  * ============
	  * Data organization based on reusable data structure components. */
	DataStructure?: DataStructure[];
	/** Definition
	  * ============
	  * Role given to a represented variable in the context of a data structure.
	  *
	  * Explanatory notes
	  * ===================
	  * A represented variable can have different roles in different data structures. For instance, the variable sex can be a measure in a wide data structure and a dimension in a dimensional data structure. */
	DataStructureComponent?: DataStructureComponent[];
	/** Definition
	  * ============
	  * Correspondence of a data instance to the concept it represents.
	  *
	  * Examples
	  * ==========
	  * A systolic blood pressure of 122 is measured. The single data instance (instance value) for that measurement is the character string "122". The datum in this case is the association of the conceptual value, i.e. the underlying measured concept (a blood pressure at that level), with the instance value.
	  * if a datum represents the conceptual value “married” with a code “M,” it is not the same datum where that conceptual value is represented with a code “1”. If the datum which uses the code “M” is present in more than one data set, it is still the same datum.
	  *
	  * Explanatory notes
	  * ===================
	  * The datum is a reification of the association between instance value and conceptual value. It is a designation (a representation of a concept by a sign) in the signification pattern. The data instance (instance value) is the signifier and the concept it represents (conceptual value) is the signified. The datum has an association with an instance variable which allows the attachment of a unit of measurement, a datatype, and a population. These instance variable attributes are critical for interpreting the signifier.  NOTE: This is NOT datum as defined in The Data Documentation Initiative Lifecycle specification, which is more limited in breadth. This specification takes a little more formal (semiotic) description of a datum using the signification pattern.
	  * The datum is reusable, and may appear in more than one data set, carrying with it its full contextualized meaning and identity. The instance variables and instance values with which it is associated will therefore be functionally similar or identical across its appearance in different data instances. Instance variable and instance value are specific to a single data set instance – datum is not. */
	Datum?: Datum[];
	/** Definition
	  * ==========
	  * Use of a code for variable identification in the context of a data structure and a variable descriptor component.
	  *
	  * Examples
	  * ========
	  * Consider two variables, i.e. income and age, with values appearing in the same column. Codes "income" and "age" are descriptors. They appear multiple time in a variable descriptor component, one for each value in the variable value component. Each descriptor references one of those values. This way it's possible to identify which values correspond to income and which ones to age. */
	Descriptor?: Descriptor[];
	/** Definition
	  * ============
	  * Set of permissible values for a variable playing the role of a variable descriptor component.
	  *
	  * Examples
	  * ==========
	  * Consider two variables, i.e. income and age, with values appearing in the same column.
	  * Codes "income" and "age" are descriptors that appear in the descriptor value domain corresponding to the descriptor variable. */
	DescriptorValueDomain?: DescriptorValueDomain[];
	/** Definition
	  * ============
	  * Variable that provides codes for variable identification in the context of a data structure.
	  * Variable playing the role of a variable descriptor component.
	  *
	  * Examples
	  * ==========
	  * Consider two variables, i.e. income and age, with values apearing in the same column.
	  * Codes "income" and "age" are descriptors that appear in the descriptor value domain corresponding to the descriptor variable. */
	DescriptorVariable?: DescriptorVariable[];
	/** Definition
	  * ============
	  * Deterministic imperative is a subtype of control logic. Deterministic control logic consists of control constructs.
	  *
	  * Examples
	  * ==========
	  * A Loop control construct is deterministic control logic. A script is deterministic control logic.
	  *
	  * Explanatory notes
	  * ===================
	  * Because control logic covers both deterministic and non-deterministic forms, it has been divided into the appropriate subtypes. */
	DeterministicImperative?: DeterministicImperative[];
	/** Definition
	  * ============
	  * Organized collection of multidimensional data. It is structured by a dimensional data structure.
	  *
	  * Examples
	  * ==========
	  * A dimensional dataset with Income values in each data point, where the dimensions organizing the data points are Sex and Marital Status.
	  *
	  * Explanatory notes
	  * ===================
	  * Similar to Structural N-Cube. */
	DimensionalDataSet?: DimensionalDataSet[];
	/** Definition
	  * ============
	  * Structure of a dimensional data set (organized collection of multidimensional data). It is described by dimension, measure and attribute components.
	  *
	  * Examples
	  * ==========
	  * The structure described by [City, Average Income, Total Population] where City is a dimension and Average Income and Total Population are measures. */
	DimensionalDataStructure?: DimensionalDataStructure[];
	/** Definition
	  * ============
	  * Collection of data instances that uniquely identify a collection of data points in a dimensional dataset.
	  *
	  * Examples
	  * ==========
	  * Collection of "male", "Ontario" and "married" strings in a dimensional dataset where data points are identified by Sex, Province and Marital Status dimensions. */
	DimensionalKey?: DimensionalKey[];
	/** Definition
	  * ============
	  * Collection of concepts that uniquely defines a collection of data points in a dimensional dataset.
	  *
	  * Examples
	  * ==========
	  * Collection of [Male], [Ontario] and [Married] categories in a dimensional dataset where data points are defined by Sex, Province and Marital Status dimensions. */
	DimensionalKeyDefinition?: DimensionalKeyDefinition[];
	/** Definition
	  * ============
	  * Single concept that is part of a dimensional key definition.
	  *
	  * Examples
	  * ==========
	  * The [Ontario] category in a dimensional dataset where data points are defined by Province and other dimensions. */
	DimensionalKeyDefinitionMember?: DimensionalKeyDefinitionMember[];
	/** Definition
	  * ============
	  * Single data instance that is part of a dimensional key.
	  *
	  * Examples
	  * ==========
	  * The "Ontario" string in a dimensional dataset where data points are identified by Province and other dimensions. */
	DimensionalKeyMember?: DimensionalKeyMember[];
	/** Definition
	  * ============
	  * Role given to a represented variable in the context of a dimensional data structure to identify the universes associated with data points. The variable acts as a field in the compound identifier (the key structure) to disambiguate the cells in the multi-dimensional "cube".
	  *
	  * Explanatory notes
	  * ===================
	  * The categories from each dimension often are used in combination to identify a cell. The meaning of the combination of the categories supplies meaning to the cell. */
	DimensionComponent?: DimensionComponent[];
	/** Definition
	  * ============
	  * Collection of dimensions that can be reused across multiple dimensional structures.
	  *
	  * Examples
	  * ==========
	  * Sex, Province and Marital Status is a common set of dimensions used across a variety of dimensional data structures and might need to be maintained separately. */
	DimensionGroup?: DimensionGroup[];
	/** Definition
	  * ============
	  * A base class acting as an extension point to allow all codifications (codelist, statistical classification, etc.) to be understood as enumerated value domains. */
	EnumerationDomain?: EnumerationDomain[];
	/** Definition
	  * ============
	  * Role of a set of data structure components for content referencing purposes
	  *
	  * Explanatory notes
	  * ===================
	  * Equivalent to foreign key in the relational model.
	  * It can be used in conjunction with primary key to link data structures and their related data sets. */
	ForeignKey?: ForeignKey[];
	/** Definition
	  * ============
	  * Role of a data structure component for content referencing purposes
	  *
	  * Explanatory notes
	  * ===================
	  * Equivalent to a foreign key attribute (i.e. column) in the relational model.
	  * It can be used in conjunction with a primary key component to link data structures and their related data sets. */
	ForeignKeyComponent?: ForeignKeyComponent[];
	/** Definition
	  * ============
	  * Role given to a represented variable in the context of a long or wide data structure to identify the units associated to data points, and in dimensional and key value data structures to provide identifying fields for the instance values.
	  *
	  * Examples
	  * ==========
	  * The personal identification number of a Swedish citizen for unit data or the name of a country in the European Union for dimensional data. */
	IdentifierComponent?: IdentifierComponent[];
	/** Definition
	  * ============
	  * A person. (See for example the W3C Friend of a Friend Ontology - http://xmlns.com/foaf/spec/#term_Person).
	  *
	  * Examples
	  * ==========
	  * Individual employed by an organization. A person within a unit or project (organization). Albert Einstein, Bugs Bunny, Harry Potter, Ashley G. Williams, Gandalf.
	  *
	  * Explanatory notes
	  * ===================
	  * Describes people referred to in the description of data and process. Similar to the concept found in Schema.org, the W3C ORG Ontology, etc. */
	Individual?: Individual[];
	/** Definition
	  * ============
	  * The relationships between parameters across steps is described by the information flow definition. Each relationship creates a pathway for an information object to follow.
	  *
	  * Examples
	  * ==========
	  * The output of one parameter might be the input of another one. Think of a Business Process Model and Notation (BPMN) diagram or an extract, transform, and load (ETL) pipeline definition as the sum of these relationships.
	  *
	  * Explanatory notes
	  * ===================
	  * In DDI Lifecycle an information flow definition was referred to in terms of a "binding". */
	InformationFlowDefinition?: InformationFlowDefinition[];
	/** Definition
	  * ============
	  * Single-valued key representation produced from the merge of the representations of all key members and a descriptor.
	  *
	  * Examples
	  * ==========
	  * The string "cluster:income_distribution:unitid:20:period:2020/02:income", where "cluster:income_distribution" is a key member based on a contextual component, "unitid:20" is based on an identifier component, "period:2020/02" is based on a component with a time role and "income" is based on a descriptor.
	  *
	  * Explanatory notes
	  * ===================
	  * For value strings, the merge is the string concatenation operation.
	  * For other classes, an appropriate merge representation can be defined. */
	InstanceKey?: InstanceKey[];
	/** Definition
	  * ============
	  * Single data instance corresponding to a concept (with a notion of equality defined) being observed, captured, or derived.
	  *
	  * Examples
	  * ==========
	  * A systolic blood pressure of 122 is measured. The single data instance (instance value) for that measurement is the character string "122". The associated measured concept (a blood pressure at that level) is the conceptual value.
	  *
	  * Explanatory notes
	  * ===================
	  * This is the actual instance of data that populates a data point (the signifier of a datum in the signification pattern). The instance value comes from a value domain associated with an instance variable which allows the attachment of a unit of measurement, a datatype, and a population. */
	InstanceValue?: InstanceValue[];
	/** Definition
	  * ==========
	  * Use of a represented variable within a data set.
	  *
	  * Examples
	  * ========
	  * 1. Gender: Dan Gillman has gender <m, male>, Arofan Gregory has gender <m, male>, etc.
	  * 2. Number of employees: Microsoft has 90,000 employees; IBM has 433,000 employees, etc.
	  * 3. Endowment: Johns Hopkins has endowment of <3, $1,000,000 and above>, Yale has endowment of <3, $1,000,000 and above>, etc.
	  * 4. A tornado near Winterset, Iowa, had a peak wind speed of 170 mph. Two instance variables of a person's height reference the same represented variable. This indicates that they are intended to: be measured with the same unit of measurement, have the same intended data type, have the same substantive value domain, use a sentinel value domain drawn from the same set of sentinel value domains, have the same sentinel (missing value) concepts, and draw their population from the same universe. In other words, the two instance variables should be comparable.
	  *
	  * Explanatory notes
	  * =================
	  * The instance variable class inherits all of the properties and relationships of the represented variable class and, in turn, the conceptual variable class. This means that an instance variable can be completely populated without the need to create an associated represented variable or conceptual variable. If, however, a user wishes to indicate that a particular instance variable is patterned after a particular represented variable or a particular conceptual variable that may be indicated by including a relationship to the represented variable and/or conceptual variable. Including these references is an important method of indicating that multiple instance variables have the same representation, measure the same concept, and are drawn from the same universe. If two instance variables of a person's height reference the same represented variable. This indicates that they are intended to: be measured with the same unit of measurement, have the same intended data type, have the same substantive value domain, use a sentinel value domain drawn from the same set of sentinel value domains, have the same sentinel (missing value) concepts, and draw their population from the same universe. In other words, the two instance variables should be comparable. The instance variable describes actual instances of data that have been collected. */
	InstanceVariable?: InstanceVariable[];
	/** Definition
	  * ============
	  * Key value relationship for two or more logical records where the key is one or more equivalent instance variables and the value is a defined relationship or a relationship to a set value.
	  *
	  * Explanatory notes
	  * ===================
	  * The instance variable map identifies the variables which are used to connect two data sets, as when persons in one structure are associated with households in another structure. For logical records Household and Person, the keys are Household ID (HHID in Household Record), and Person ID (HHIDP in Person Record). Their value relationship is Equal, and set value is n.a. For each person in the person record, the value of HHIDP will be exactly the same as the value of HHID in the household record for the household to which they belong. (Correspondence type refers to the variables themselves rather than the value of the variables concerned.) In this context correspondence type will normally be set to ExactMatch. */
	InstanceVariableMap?: InstanceVariableMap[];
	/** Definition
	  * ============
	  * Collection of data instances that uniquely identify a collection of data points in a dataset. */
	Key?: Key[];
	/** Definition
	  * ============
	  * Collection of concepts that uniquely defines a collection of data points in a dataset. */
	KeyDefinition?: KeyDefinition[];
	/** Definition
	  * ============
	  * Single concept that is part of the structure of a key definition. */
	KeyDefinitionMember?: KeyDefinitionMember[];
	/** Definition
	  * ============
	  * Single data instance that is part of a key. */
	KeyMember?: KeyMember[];
	/** Definition
	  * ============
	  * Organized collection of key-value data. It is structured by a key value structure.
	  *
	  * Examples
	  * ==========
	  * A unit key-value datastore where each instance key corresponds to a data point capturing a different characteristic of a unit.
	  *
	  * Explanatory notes
	  * ===================
	  * A key-value datastore is just a collection of key-value pairs, i.e. instance keys and reference values.
	  * Each instance key encodes all relevant information about the context, the unit of interest and the variable associated with the reference value of a given data point. */
	KeyValueDataStore?: KeyValueDataStore[];
	/** Definition
	  * ============
	  * Structure of a key-value datastore (organized collection of key-value data). It is described by identifier, contextual, synthetic id, dimension, variable descriptor and variable value components.
	  *
	  * Examples
	  * ==========
	  * The structure described by [Income distribution, Unit id, Period, Income] where Income distribution is the contextual component, Unit id identifies a statistical unit, period is a effective period and Income is the variable of interest. */
	KeyValueStructure?: KeyValueStructure[];
	/** Definition
	  * ============
	  * Set of all classification items the same number of relationships from the root (or top) classification item.
	  *
	  * Examples
	  * ==========
	  * ISCO-08: index='1' label of associated category 'Major', index='2' label of associated category 'Sub-Major',  index='3' label of associated category 'Minor',
	  *
	  * Explanatory notes
	  * ===================
	  * Provides level information for the members of the level structure. levelNumber provides the level number which may or may not be associated with a category which defines level. */
	Level?: Level[];
	/** Definition
	  * ============
	  * Nesting structure of a hierarchical collection.
	  *
	  * Examples
	  * ==========
	  * The International Standard Classification of Occupations (ISCO-08: https://www.ilo.org/public/english/bureau/stat/isco/isco08/) Major, Sub-Major, and Minor or the North American Industry Classification System (NAICS: https://www.census.gov/naics/) 2 digit sector codes, 3 digit subsector code list, 4 digit industry group code list, and 5 digit industry code list.
	  *
	  * Explanatory notes
	  * ===================
	  * The levels within the structure begin at the root level '1' and continue as an ordered array through each level of nesting. Levels are used to organize a hierarchy. Usually, a hierarchy contains one root member at the top, though it could contain several. These are the first level. All members directly related to those  in the first level compose the second level. The third and subsequent levels are defined similarly.  A level often is associated with a concept, which defines it. These correspond to kinds of aggregates. For example, in the US Standard Occupational Classification (2010), the level below the top is called Major Occupation Groups, and the next level is called Minor Occupational Groups. These ideas convey the structure. In particular, Health Care Practitioners (a major group) can be broken into Chiropractors, Dentists, Physicians, Vets, Therapists, etc. (minor groups) The categories in the nodes at the lower level aggregate to the category in node above them.  "Classification schemes are frequently organized in nested levels of increasing detail. ISCO-08, for example, has four levels: at the top level are ten major groups, each of which contain sub-major groups, which in turn are subdivided in minor groups, which contain unit groups. Even when a classification is not structured in levels ("flat classification"), the usual convention, which is adopted here, is to consider that it contains one unique level." (From the W3C Simple Knowlegde Organization System: http://rdf-vocabulary.ddialliance.org/xkos.html#) Individual classification items organized in a hierarchy may be associated with a specific level. */
	LevelStructure?: LevelStructure[];
	/** Definition
	  * ============
	  * Collection of instance variables. */
	LogicalRecord?: LogicalRecord[];
	/** Definition
	  * ============
	  * Assigns a position of the logical record within the data store. */
	LogicalRecordPosition?: LogicalRecordPosition[];
	/** Definition
	  * ============
	  * Relationships between logical records. */
	LogicalRecordRelationship?: LogicalRecordRelationship[];
	/** Definition
	  * ============
	  * Structuring of relationships between logical records in a data store.
	  *
	  * Examples
	  * ==========
	  * A data store with a Household, Family, and Person logical record type. Allows for describing parent/child, whole/part, or other relationships as appropriate. */
	LogicalRecordRelationStructure?: LogicalRecordRelationStructure[];
	/** Definition
	  * ============
	  * Organized collection of long data. It is structured by a long data structure.
	  *
	  * Examples
	  * ==========
	  * A unit dataset where each row corresponds to a set of data points capturing different characteristics of a unit, some of which can be transposed into variable descriptor and variable value components. */
	LongDataSet?: LongDataSet[];
	/** Definition
	  * ============
	  * Structure of a long dataset (organized collection of long data). It is described by identifier, measure, attribute, variable descriptor and variable value components.
	  *
	  * Examples
	  * ==========
	  * The structure described by [Unit id, Income, Province, Variable name, Variable value] where Unit id identifies a statistical unit, Income and Province are two instance variables capturing characteristics, and other instance variables are represented by Variable name (a variable descriptor component) and Variable Value (a variable value component). */
	LongDataStructure?: LongDataStructure[];
	/** Definition
	  * ============
	  * Collection of data instances that uniquely identify a collection of data points in a long dataset.
	  *
	  * Examples
	  * ==========
	  * Collection containing the single "K1Z1C1" string in a long dataset where rows are identified by postal code representations. */
	LongKey?: LongKey[];
	/** Definition
	  * ============
	  * Single data instance that is part of a long key.
	  *
	  * Examples
	  * ==========
	  * The "K1Z1C1" string in a long dataset where rows are identified by postal code representations. */
	LongMainKeyMember?: LongMainKeyMember[];
	/** Definition
	  * ============
	  * Mechanism or computer program used to perform an act.
	  *
	  * Examples
	  * ==========
	  * SAS program, photocopier
	  *
	  * Explanatory notes
	  * ===================
	  * May be used as a target to identify the agent who performed an action. Used to define hardware or software that act as agents in data capture, data processing, or other related actions. */
	Machine?: Machine[];
	/** Definition
	  * ============
	  * Identifies the unit of interest, either a statistical unit or a population, via identifier or dimension components, respectively, plus an optional contextual component.
	  * If neither identifier nor dimension components are present, then a synthetic id component is used.
	  *
	  * Examples
	  * ==========
	  * The string "income_distribution:male:Ontario:married" in a dimensional key-value datastore, where instance key members are defined by context plus Sex, Province and Marital Status dimensions. */
	MainKeyMember?: MainKeyMember[];
	/** Definition
	  * ============
	  * Role given to a represented variable in the context of a data structure to hold the observed/derived values.
	  *
	  * Examples
	  * ==========
	  * Height of a person in a wide or long dataset or number of citizens in a country in a dataset for multiple countries (dimensional dataset). */
	MeasureComponent?: MeasureComponent[];
	/** Definition
	  * ============
	  * Non-deterministic control logic is a subtype of control logic. Non-deterministic (or declarative) control logic is constraint- and/or rule-based.
	  *
	  * Examples
	  * ==========
	  * Rule based scheduling is declarative control logic.
	  *
	  * Explanatory notes
	  * ===================
	  * Unlike DDI Lifecycle, DDI-CDI describes non-deterministic activity and step controls. */
	NonDeterministicDeclarative?: NonDeterministicDeclarative[];
	/** Definition
	  * ============
	  * Representation of a category in the context of a code or a classification item, as opposed of the corresponding instance value which would appear when used in a dataset.
	  *
	  * Examples
	  * ==========
	  * The number "334" used as a code for the "Computer and electronic product manufacturing" category in the North American Industry Classification System (NAICS). */
	Notation?: Notation[];
	/** Definition
	  * ==========
	  * Collection of people organized within a framework of authority that can perform an act or be associated with another agent.
	  *
	  * Examples
	  * ==========
	  * Commonwealth Scientific and Industrial Research Organisation (CSIRO), U.S. Census Bureau, University of Michigan/Institute for Social Research, Research Data Alliance Agrisemantics Working Group.
	  *
	  * Explanatory notes
	  * =================
	  * The W3C Organization Ontology (https://www.w3.org/TR/vocab-org/#organizational_structure) definition: "Represents a collection of people organized together into a community or other social, commercial or political structure. The group has some common purpose or reason for existence which goes beyond the set of people belonging to it and can act as an agent. Organizations are often decomposable into hierarchical structures." */
	Organization?: Organization[];
	/** Definition
	  * ============
	  * An input or output to control logic and the step/sub-step it invokes. Parameters may take the form of any information object, including data sets and structured metadata as well as configuration information for the step/sub-step.
	  *
	  * Examples
	  * ==========
	  * A dimensional data set; a long data structure. */
	Parameter?: Parameter[];
	/** Definition
	  * ============
	  * Information needed for understanding the physical structure of data coming from a file or other source.
	  *
	  * Examples
	  * ==========
	  * The physical data set is the entry point for information about a file or other source. It includes information about the name of a file, the structure of segments in a file.
	  *
	  * Explanatory notes
	  * ===================
	  * Multiple styles of structural description are supported: including describing files as unit-record (unit segment layout) files; describing cubes; and describing event-history (spell) data. */
	PhysicalDataSet?: PhysicalDataSet[];
	/** Definition
	  * ============
	  * Ordering for physical record segments, which map to a logical record.
	  *
	  * Explanatory notes
	  * ===================
	  * The same logical record layout may be the source member in several adjacency lists. This can happen when physical record segments are also population specific. In this instance each adjacency list associated with a logical record layout is associated with a different population. */
	PhysicalDataSetStructure?: PhysicalDataSetStructure[];
	/** Definition
	  * ==========
	  * Realization of relation structure that is used to describe the sequence of value mappings in a physical layout.
	  *
	  * Examples
	  * ========
	  * The W3C Tabular Data on the Web specification section 4.5 Cells (https://www.w3.org/TR/tabular-data-model/#content-type) allows for a list datatype within cells. In the example below there are three top level instance variables: PersonID - the person identifier; AgeYr - age in years; BpSys_Dia - blood pressure (a list containing Systolic and Diastolic values). There are two variables at a secondary level of the hierarchy: Systolic - the systolic pressure; Diastolic - the diastolic pressure. The delimited file below uses the comma to separate "columns" and forward slash to separate elements of a blood pressure list. ::
	  *
	  * PersonID, AgeYr, BpSys_Dia
	  * 1,22,119/67
	  * 2,68,122/70
	  *
	  * The physical relation structure in this case would describe a BpSys_Dia list variable as containing an ordered sequence of the Systolic and Diastolic instance variables.
	  *
	  * Explanatory notes
	  * =================
	  * This can be more complex than a simple sequence. */
	PhysicalLayoutRelationStructure?: PhysicalLayoutRelationStructure[];
	/** Definition
	  * ==========
	  * Description of each physical storage segment required to completely cover a physical record representing the logical record.
	  *
	  * Examples
	  * ========
	  * The file below has four instance variables: PersonId, SegmentId, AgeYr, and HeightCm. The data for each person (identified by PersonId) is recorded in two segments (identified by SegmentId), "a" and "b". AgeYr is on physical segment a, and HeightCm is on segment b. These are the same data as described in the unit segment layout documentation. ::
	  *
	  * 1 a  22
	  * 1 b 183
	  * 2 a  45
	  * 2 b 175
	  *
	  * Explanatory notes
	  * =================
	  * A logical record may be stored in one or more segments housed hierarchically in a single file or in separate data files. All logical records have at least one segment. */
	PhysicalRecordSegment?: PhysicalRecordSegment[];
	/** Definition
	  * ============
	  * Assigns a position of the physical record segment within the whole physical record. For example in what order does this 80 character segment fall within an 800 character record. */
	PhysicalRecordSegmentPosition?: PhysicalRecordSegmentPosition[];
	/** Definition
	  * ============
	  * Structured relationship between physical record segments. */
	PhysicalRecordSegmentRelationship?: PhysicalRecordSegmentRelationship[];
	/** Definition
	  * ============
	  * Means for describing the complex relational structure of data points in a physical record representing the logical record. */
	PhysicalRecordSegmentStructure?: PhysicalRecordSegmentStructure[];
	/** Definition
	  * ============
	  * Used as an extension point in the description of the different layout styles of data structure descriptions.
	  *
	  * Examples
	  * ==========
	  * Examples include unit segment layouts, event data layouts, and cube layouts (e.g. summary data).
	  *
	  * Explanatory notes
	  * ===================
	  * A physical segment layout is a physical description (e.g. unit segment layout) of the associated logical record Layout consisting of a collection of value mappings describing the physical interrelationship of each related value mapping and associated instance variable. */
	PhysicalSegmentLayout?: PhysicalSegmentLayout[];
	/** Definition
	  * ============
	  * Location of a data point in a physical segment.
	  *
	  * Examples
	  * ==========
	  * A segment of text in a plain text file beginning at character 3 and ending at character 123. The location of the representation of a variable in a text file.
	  *
	  * Explanatory notes
	  * ===================
	  * While this has no properties or relationships of its own, it is useful as a target of relationships where its extensions may serve. This is an extension point since there are many different ways to describe the location of a segment - character counts, start and end times, etc. */
	PhysicalSegmentLocation?: PhysicalSegmentLocation[];
	/** Definition
	  * ============
	  * Universe with time and geography specified.
	  *
	  * Examples
	  * ==========
	  * 1. Canadian adult persons residing in Canada on 13 November 1956.
	  * 2. US computer companies at the end of 2012.
	  * 3. Universities in Denmark 1 January 2011.
	  *
	  * Explanatory notes
	  * ===================
	  * Population is the most specific in the conceptually narrowing hierarchy of unit type, universe and population. Several populations having differing time and or geography may specialize the same universe. */
	Population?: Population[];
	/** Definition
	  * ============
	  * Role of a set of data structure components for content linkage purposes
	  *
	  * Explanatory notes
	  * ===================
	  * Equivalent to primary key in the relational model.
	  * A primary key essentially indicates which data structure components correspond to key members.
	  * It can also be used in conjunction with foreign key to link data structures and their related datasets. */
	PrimaryKey?: PrimaryKey[];
	/** Definition
	  * ============
	  * Role of a data structure component for content identification purposes
	  *
	  * Explanatory notes
	  * ===================
	  * Equivalent to a primary key attribute (i.e. column) in the relational model.
	  * It can be used in conjunction with a foreign key component to link data structures and their related datasets. */
	PrimaryKeyComponent?: PrimaryKeyComponent[];
	/** Definition
	  * ============
	  * A processing agent orchestrates the production of information objects in a production environment. There are processing agents which perform data capture, data editing/processing, and data analysis (etc.), each in the appropriate production environments. The processing agent performs an activity based on the control logic.
	  *
	  * Examples
	  * ==========
	  * A processing agent initiates a data capture sequence, obtaining readings from a sensor. A processing agent initiates rule based scheduling. A processing agent is informed by control logic to invoke an imputation activity. */
	ProcessingAgent?: ProcessingAgent[];
	/** Definition
	  * ============
	  * Production environments consume and produce information objects by way of processing pipelines orchestrated by the processing agent.
	  *
	  * Examples
	  * ==========
	  * Data processing platforms and data analysis platforms are types of production environments. Each of these platforms may have subtypes. */
	ProductionEnvironment?: ProductionEnvironment[];
	/** Definition
	  * ============
	  * A measure having a specific production method.
	  *
	  * Examples
	  * ==========
	  * Seasonally adjusted monthly income. */
	QualifiedMeasure?: QualifiedMeasure[];
	/** Definition
	  * ============
	  * Relationships among record types within and between logical records.
	  *
	  * Examples
	  * ==========
	  * One logical record containing a PersonIdentifier and a PersonName and another logical record containing a MeasurementID, a PersonID, a SystolicPressure, and a DiastolicPressure could be linked by a record relation. The record relation could employ an instance variable value map to describe the linkage between  PersonIdentifier and PersonID.
	  *
	  * A household-level logical record might contain an instance variable called HouseholdID and a person-level logical record might contain an instance variable called HID. Describing a link between HouseholdID and HID would allow the linking of a person-level LogicalRecord to their corresponding household-level logical record.
	  *
	  * Explanatory notes
	  * ===================
	  * For instance variables existing in a logical record with multiple record layouts, pairs of instance variables may function as paired keys to permit the expression of hierarchical links between records of different types. These links between keys in different record types could also be used to link records in a relational structure. */
	RecordRelation?: RecordRelation[];
	/** Definition
	  * ============
	  * Recorded value in a variable value component.
	  * Value referenced by a descriptor.
	  *
	  * Examples
	  * ==========
	  * Consider two variables, i.e. income and age, with values appearing in the same column, e.g. 100000, 45, 85000, 34, etc.
	  * Codes "income" and "age" are descriptors whereas 100000, 45, 85000, 34 are reference values. */
	ReferenceValue?: ReferenceValue[];
	/** Definition
	  * ============
	  * Set of permissible values for a variable playing the role of a variable value component.
	  *
	  * Examples
	  * ==========
	  * Consider two variables, i.e. income and age, with values appearing in the same column. A reference variable in this case would be a type of represented variable that can take on values from both income and age. A long data structure might have a column that takes on values from this reference variable. A descriptor variable would then have values paired with the values from the reference variable, pointing to either the income or age variable. */
	ReferenceValueDomain?: ReferenceValueDomain[];
	/** Definition
	  * ============
	  * Variable that records values of multiple variables in the context of a data structure.
	  * Variable playing the role of a variable value component.
	  *
	  * Examples
	  * ==========
	  * Consider two variables, i.e. income and age, with values appearing in the same column, e.g. 100000, 45, 85000, 34, etc.
	  * Values 100000, 45, 85000, 34 are reference values in the reference value domain corresponding to the reference variable. */
	ReferenceVariable?: ReferenceVariable[];
	/** Definition
	  * ==========
	  * Conceptual variable with a substantive value domain specified.
	  *
	  * Examples
	  * ==========
	  * The pair (Number of Employees, Integer), where "Number of Employees" is the characteristic of the population (variable) and "Integer" is how that measure will be represented (value domain).
	  *
	  * Explanatory notes
	  * ===================
	  * Extends from conceptual variable and can contain all descriptive fields without creating a conceptual variable. By referencing a conceptual variable it can indicate a common relationship with represented variables expressing the same characteristic of a universe measured in another way, such as Age of Persons in hours rather than years. Represented variable constrains the coverage of the unit type to a specific universe. In the above case the universe with the measurement of Age in hours may be constrained to Persons under 5 days (120 hours old). Represented variable can define sentinel values for multiple storage systems which have the same conceptual domain but specialized value domains. */
	RepresentedVariable?: RepresentedVariable[];
	/** Definition
	  * ============
	  * A datum that can be qualified by a revision.
	  *
	  * Examples
	  * ==========
	  * The April datum for Income revised in June. */
	RevisableDatum?: RevisableDatum[];
	/** Definition
	  * ============
	  * Algorithm applied to produce a revised datum.
	  *
	  * Examples
	  * ==========
	  * An adjustment to monthly employment numbers to adjust for errors (sampling or non-sampling) in the underlying data. */
	Revision?: Revision[];
	/** Definition
	  * ============
	  * A rule has a condition part and an action part. A rule takes the form of: If [Condition} Then [Action]. A rule belongs to a rule set which is a component of rule based scheduling performed by the processing agent
	  *
	  * Examples
	  * ==========
	  * If Exists [InformationObject] Then Perform [Activity] */
	Rule?: Rule[];
	/** Definition
	  * ============
	  * Rule based scheduling performs a fact check on rules from the rule set, testing their condition part against the facts in the research data store. Fact checking may be assisted by a curator who can semantically compare the condition part of each candidate rule with the facts. The fact checker returns the next activity which rule based scheduling performs according to the following function: factcheck (RuleSet, ResearchDataStore, Curator): Activity.
	  *
	  * Examples
	  * ==========
	  * One real-life situation in which rule-based scheduling is performed involves data virtualization. Here the research datastore has a catalog of views available for use. Rule based scheduling might explore the catalog to determine the rule(s) in the rule set that currently apply. A software curator might assist in the decision in case there was no exact match between a rule and its condition(s) and given the current state of the research datastore. The curator typically uses natural language processing.
	  *
	  * Explanatory notes
	  * ===================
	  * Rule based scheduling is guided by its scheduling strategy. This is described by an enumeration that consists of "forwardChaining" and "backwardChaining". */
	RuleBasedScheduling?: RuleBasedScheduling[];
	/** Definition
	  * ============
	  * A rule set is a collection of rules. A rule set is a component of rule based scheduling.
	  *
	  * Examples
	  * ==========
	  * If [A overlaps B] Then [X] If [B occurs before C] Then [Y] If [C equals D] Then [Z]  It might take a curator to understand what these rules mean in the context of a research data store.
	  *
	  * Explanatory notes
	  * ===================
	  * Rule based scheduling might have multiple rule sets each of which are domain-specific. The processing agent often helps with the selection of rule sets. */
	RuleSet?: RuleSet[];
	/** Definition
	  * ==========
	  * A qualified measure whose domain is a universe as an aggregate, i.e. a measure with a specific production method applied to a specific cell in a cube.
	  *
	  * Examples
	  * ========
	  * Seasonally adjusted income for Single, Ontarians, Females. */
	ScopedMeasure?: ScopedMeasure[];
	/** Definition
	  * ============
	  * Location of a segment of text through character or line counts.
	  *
	  * Examples
	  * ==========
	  * The segment beginning at line 3, character 4 and ending at line 27 character 13. Alternatively the segment beginning at character 257 and ending at character 1350 of the whole body of text. StartLine of 10, endLine of 12, startCharacterPosition of 1, endCharacterPosition of 0 means all of lines 10, 11, and 12.  An endCharacterPosition of 0 indicates that whole lines are specified.
	  *
	  * Explanatory notes
	  * ===================
	  * An adequate description will always include a startCharacterPosition and then may include an endCharacterPosition or a characterLength. If StartLine is specified, the character counts begin within that line. */
	SegmentByText?: SegmentByText[];
	/** Definition
	  * ==========
	  * Conceptual domain of sentinel concepts.
	  *
	  * Examples
	  * ========
	  *
	  * - Refused
	  * - Don't know
	  * - Lost in processing
	  *
	  * Explanatory notes
	  * =================
	  * Sentinel values are intended for processing purposes whereas substantive values are used for subject matter concerns. */
	SentinelConceptualDomain?: SentinelConceptualDomain[];
	/** Definition
	  * ============
	  * Value domain for a sentinel conceptual domain.
	  *
	  * Examples
	  * ==========
	  * Missing categories expressed as codes: -9, refused; -8, Don't Know; for a numeric variable with values greater than zero.
	  *
	  * Explanatory notes
	  * ===================
	  * Sentinel values are defined in ISO 11404 as "element of a value space that is not completely consistent with a datatype's properties and characterizing operations...". A common example would be codes for missing values. Sentinel values are used for processing, not to describe subject matter. Typical examples include missing values or invalid entry codes. Sentinel value domains are typically of the enumerated type, but they can be the described type, too. This is not to say that sentinel values carry no information. Data on gender might be enumerated by "0, male" and "1, female". These are the substantive values (see substantive value domain). However, there may be the need to include missing values along with that data, such as "m, missing" and "r, refused". These are sentinel values.  ISO/IEC 11404 - General Purpose Datatypes, defines sentinel values in terms of how that standard defines datatypes. But, the fact that the sentinels don't fit in terms of the calculations and statistics one would perform on the "clean" data is a distinguishing characteristic. In the example above, one would not include missing or refused data in calculating a ratio of females to the total population. Sentinel values may be described rather than enumerated. For instance, there might be a range of values, each representing an out of range value, but there could be too many to enumerate. It is easier to describe the range.  In some software missing values are represented as values not in the datatype of the valid values. R has values of NA, NaN, Inf, and -Inf. SAS and Stata have values displayed as ".", ".A" through ".Z", and "._"  Other software might use values like 999 for missing that would otherwise be the same datatype as valid values but outside the parameters of the domain. In the gender example above: For SPSS the sentinel values might be represented as: 998 = "refused" 999 = "not recorded"  For SAS or Stata the sentinel values might be represented as: .R = "refused" .N = "not recorded"  Sentinel values can also be used for other purposes beyond missing. For a numeric variable "A" might represent a value somewhere in a defined range to prevent disclosure of information about an individual. This might be considered a "semi-missing value". In SAS or Stata for example: .A = "greater than or equal to 100 and less than 1000 ". */
	SentinelValueDomain?: SentinelValueDomain[];
	/** Definition
	  * ============
	  * A sequence controls the order of activities or steps by defining a simple sequence.
	  *
	  * Examples
	  * ==========
	  * A sequence might contain two subordinate sequences of activity - one for Round 1 activity of the research and the second for Round 2.
	  *
	  * Explanatory notes
	  * ===================
	  * Unlike temporal constraints, sequence is NOT pairwise. However, a group of temporal constraints can specify an order with more precision than a sequence. */
	Sequence?: Sequence[];
	/** Definition
	  * ============
	  * Assigns a sequence number to an activity within a sequence. */
	SequencePosition?: SequencePosition[];
	/** Definition
	  * ============
	  * Service is a type of processing agent. Services are atomic. They execute acts which have input and output parameters.
	  *
	  * Examples
	  * ==========
	  * Given a location as input, a weather service provides weather data as output.
	  *
	  * Explanatory notes
	  * ===================
	  * A service binds information objects to parameters at runtime. */
	Service?: Service[];
	/** Definition
	  * ============
	  * Set of categories represented by classification items where the subset of immediate children categories for any given parent category are mutually exclusive and jointly exhaustive with respect to that parent.
	  *
	  * Examples
	  * ==========
	  * ISIC rev 4; NAICS 2017, SOC 2018
	  *
	  * Explanatory notes
	  * ===================
	  * A statistical classification may have a flat, linear structure or may be hierarchically structured, such that all categories at lower levels are sub-categories of categories at the next Level up. (Source: GSIM StatisticalClassification)
	  * Each classification item represents a category. Every category is a member of a level within a statistical classification. The categories are defined with reference to one or more characteristics of a particular universe of units of observation. */
	StatisticalClassification?: StatisticalClassification[];
	/** Definition
	  * ============
	  * Specifies the statistical classifications for the source and target of a complex relationship and defines the relationship. */
	StatisticalClassificationRelationship?: StatisticalClassificationRelationship[];
	/** Definition
	  * ============
	  * Step is a reusable, parameterized activity associated to information flows. One or more steps perform an sctivity.
	  *
	  * Examples
	  * ==========
	  * An editing activity resolves into one or more steps. A transformation of a wide data set to a long data set takes a single step on an ETL (extract, transform, load) platform like Pentaho.
	  *
	  * Explanatory notes
	  * ===================
	  * Steps can be broken out into a sequence of sub steps ad infinitum. */
	Step?: Step[];
	/** Definition
	  * ==========
	  * Conceptual domain of substantive concepts.
	  *
	  * Examples
	  * ========
	  * An enumeration of concepts for a categorical variable like "male" and "female" for gender, or "ozone" and "particulate matter less than 2.5 microns in diameter" for pollutant in an air quality measure.
	  *
	  * Explanatory notes
	  * =================
	  * A conceptual variable links a unit type to a substantive conceptual domain. The latter can be an enumeration or description of the values that the variable may take on. In the enumerated case these are the categories in a category set that can be values, not the codes that represent the values. An example might be the conceptual domain for a variable representing self-identified gender. An enumeration might include the concept of "male" and the concept of "female". These, in turn, would be represented in a substantive value domain by codes in a code list like "m" and "f", or "0" and "1". A conceptual domain might be described through a value and concept description's description property of "a real number greater than 0" or through a more formal logical expression of "all reals x such that x > 0". Even in the described case, what is being described are conceptual, not the symbols used to represent the values. This may be a subtle distinction, but allows specifying that the same numeric value might be represented by 32 bits or by 64 bits or by an Arabic numeral or a Roman numeral. */
	SubstantiveConceptualDomain?: SubstantiveConceptualDomain[];
	/** Definition
	  * ==========
	  * Value domain for a substantive conceptual domain. Typically a description and/or enumeration of allowed values of interest.
	  *
	  * Examples
	  * ========
	  * All real decimal numbers relating to the subject matter of interest between 0 and 1 specified in Arabic numerals. (From the Generic Statistical Information Model [GSIM] 1.1). The codes "M" male and "F" for female .
	  *
	  * Explanatory notes
	  * =================
	  * In DDI-CDI the value domain for a variable is separated into "substantive" and "sentinel" values. Substantive values are the values of primary interest. Sentinel values are additional values that may carry supplementary information, such as reasons for missing. This duality is described in ISO 11404. Substantive values for height might be real numbers expressed in meters. The full value domain might also include codes for different kinds of missing values - one code for "refused" and another for "don’t know". Sentinel values may also convey some substantive information and at the same time represent missing values.
	  *
	  * An example might be where a numeric variable like number of employees be sometimes a count and sometimes a code representing a range of counts in order to avoid disclosure of information about a specific entity. The substantive value domain may use either a value description, for described values, or a codelist for enumerated values, or both. A value domain may consist of substantive values or sentinel values. Substantive values are those associated directly with some subject matter area. They do not address concerns around processing, such as missing values. Substantive values are called "regular values" in ISO/IEC 11404 - General Purpose Datatypes. The enumerated case is one where all values are listed.
	  *
	  * An example is the categorical values for gender: the conceptual domain could consist of the concept of male and the concept of female. These might be represented in codes and associated labels as 1 ("Male") 2 ("Female"). The described case is one where some description is needed to define the set of values. Take the following description for height in meters: "a real number between 0 and 3, represented to two Arabic decimal places". This description might be structured in some way to be machine actionable (datatype="double”, min="0", max="3", decimals="2"). */
	SubstantiveValueDomain?: SubstantiveValueDomain[];
	/** Definition
	  * ============
	  * Persistent and unique identifier (PIDs) to provide standarized, long-lasting identification.
	  *
	  * Examples
	  * ==========
	  * UUIDs, GUIDs, DOIs, URNs or any other unique id generation framework.
	  *
	  * Explanatory notes
	  * ===================
	  * This PIDs either complement or replace identifier and dimension components.
	  * They complement them when there is a need for having a globally unique identifier as part of an instance key. They replace them when identier components are not available (e.g. after de-identification for confidentiality). */
	SyntheticIdComponent?: SyntheticIdComponent[];
	/** Definition
	  * ============
	  * Temporal constraints provide a mechanism for expressing concurrency control and synchronization
	  *
	  * Examples
	  * ==========
	  * Allen's Interval Algebra is a set of temporal constraints. So are the Split and SplitJoin ControlConstructs
	  *
	  * Explanatory notes
	  * ===================
	  * Allen's interval algebra is a calculus for temporal reasoning that was introduced in 1983. Reasoning with qualitative time in Allen's full interval algebra is nondeterministic polynomial time (NP) complete. Research since 1995 identified maximal tractable subclasses of this algebra via exhaustive computer search and also other ad-hoc methods. In 2003, the full classification of complexity for satisfiability problems over constraints in Allen's interval algebra was established algebraically. */
	TemporalConstraints?: TemporalConstraints[];
	/** Definition
	  * ==========
	  * Declarative control flow operator where the continuation of the execution flow depends on the finalization of one or more preceding activities/steps.
	  *
	  * - XORJoin: Given three activities A, B and C, if XORJoin(A, B) -> C, then C is executed after either A or B finishes executing. XORJoin is sometimes referred to as simple merge.
	  * - ANDJoin: Given three activities A, B and C, if ANDJoin(A, B) -> C, then C is executed after both A and B finish executing. ANDJoin is sometimes referred to as synchronization.
	  * - XORSplit: Given three activities A, B and C, if XORSplit(A) -> (B, C), then either B or C is executed, not both, after A finishes executing. XORSplit is sometimes referred to as exclusive choice.
	  * - ANDSplit: Given three activities A, B and C, if ANDSplit(A) -> (B, C), then both B and C are executed after A finishes executing. */
	TemporalControlConstruct?: TemporalControlConstruct[];
	/** Definition
	  * ==========
	  * Individual object of interest for some statistical activity, such as data collection.
	  *
	  * Examples
	  * ========
	  * Here are 3 examples:
	  *
	  * 1. Individual US person (i.e., Arofan Gregory, Dan Gillman, Barack Obama, etc.)
	  * 2. Individual US computer companies (i.e., Microsoft, Apple, IBM, etc.)
	  * 3. Individual US universities (i.e., Johns Hopkins, University of Maryland, Yale, etc.) [GSIM 1.1]
	  *
	  * Explanatory notes
	  * =================
	  * In a traditional data table each column might represent some variable (measurement). Each row would represent the entity (Unit)  to which those variables relate. Height measurements might be made on persons (unit type) of primary school age (Universe) at Pinckney Elementary School on September 1, 2005 (population). The height for Mary Roe (Unit)  might be 139 cm.
	  *
	  * The Unit is not invariably tied to some value. A median income might be calculated for a block in the U.S. but then used as an attribute of a person residing on that block. For the initial measurement the Unit was the block. In the reuse the unit would be that specific person to which the value was applied.
	  *
	  * In a big data table each row represents a unit/variable double. Together a unit identifier and a variable identifier define the key. And for each key there is just one value – the measure of the unit on the variable.
	  *
	  * A big data table is sometimes referred to as a column-oriented data store whereas a traditional database is sometimes referred to as a row-oriented data store. The unit plays an identifier role in both types of data stores. */
	Unit?: Unit[];
	/** Definition
	  * ==========
	  * Description of unit-record ("wide") data sets, where each row in the data set provides the same group of values for variables all relating to a single unit.
	  *
	  * Examples
	  * ========
	  * A simple spreadsheet. Commonly the first row of the table will contain variable names or descriptions.
	  *
	  * The following CSV file has a rectangular layout and would import into a simple table in a spreadsheet::
	  *
	  * PersonId,AgeYr,HeightCm
	  * 1,22,183,
	  * 2,45,175,
	  *
	  * Explanatory notes
	  * =================
	  * This is the classic rectangular data table used by most statistical packages, with rows/cases/observations and columns/variables/measurements. Each cell (DataPoint) in the table is the intersection of a Unit (row) and an InstanceVariable. Each logical column will contain data relating to the values for a single variable. */
	UnitSegmentLayout?: UnitSegmentLayout[];
	/** Definition
	  * ==========
	  * Unit type is a type or class of objects of interest (units).
	  *
	  * Examples
	  * ========
	  * Person, Establishment, Household, State, Country, Dog, Automobile, Neutrino.
	  *
	  * Explanatory notes
	  * =================
	  * Unit type is the most general in the hierarchy of unit type, universe, and population. It is a description of the basic characteristics for a general set of Units. A universe is a set of entities defined by a specialization of a unit type. A Population further narrows the specification to a specific time and geography.
	  *
	  * A unit type is used to describe a class or group of Units based on a single characteristic with no specification of time and geography. For example, the unit type of "Person" groups together a set of Units based on the characteristic that they are "Persons".
	  *
	  * It concerns not only unit types used in dissemination, but anywhere in the statistical process. E.g. using administrative data might involve the use of a fiscal unit. [GSIM 1.1]. */
	UnitType?: UnitType[];
	/** Definition
	  * ============
	  * Specialized unit type, with the specialization based upon characteristics other than time and geography.
	  *
	  * Examples
	  * ==========
	  * 1. Canadian adults (not limited to those residing in Canada)
	  * 2. Computer companies
	  * 3. Universities
	  *
	  * Explanatory notes
	  * ===================
	  * Universe sits in a hierarchy between unit type and population, with unit type being most general and Population most specific. A universe is a set of entities defined by a more narrow specification than that of an underlying unit type. A population further narrows the specification to a specific time and geography.
	  *
	  * If the Universe consists of people, a number of factors may be used in defining membership in the Universe, such as age, sex, residence, income, veteran status, criminal convictions, etc. The universe may consist of elements other than persons, such as housing units, court cases, deaths, countries, etc. A universe may be described as "inclusive" or "exclusive".
	  *
	  * Not to be confused with Population, which includes the specification of time and geography. */
	Universe?: Universe[];
	/** Definition
	  * ==========
	  * Formal description of a set of values.
	  *
	  * Examples
	  * ========
	  *
	  * 1. The integers between 1 and 10, inclusive. The values of x satisfying the logicalExpression property: " (1 less than or equal to X less than or equalto 10) AND mod(x,10)=0" Also described with minimumValueInclusive = 1 and maximumValueInclusive = 10 (and datatype of integer).
	  * 2. The upper case letters A through C and X described with the regularExpression "/[A-CX]/".
	  * 3. A date-time described with the Unicode Locale Data Markup Language pattern yyyy.MM.dd G 'at' HH:mm:ss zzz.
	  *
	  * Explanatory notes
	  * =================
	  * The value and concept description may be used to describe either a value domain or a conceptual domain. For a value domain, the value and concept description contains the details for a described" domain (as opposed to an enumerated domain). There are a number of properties which can be used for the description. The description could be just text such as: "an even number greater than zero", or a more formal logical expression like "x>0 and mod(x,2)=0". A regular expression might be useful for describing a textual domain. It could also employ a format pattern from the Unicode Locale Data Markup Language (LDML: http://www.unicode.org/reports/tr35/tr35.html). Some conceptual domains might be described with just a narrative. Others, though, might be described in much the same way as a value domain depending on the specificity of the concept. In ISO 11404 a value domain may be described either through enumeration or description, or both. This class provides the facility for that description. It may be just a text description, but a description through a logical expression is machine actionable and might, for example, be rendered as an integrity constraint. If both text and a logical expression are provided the logical expression is to be taken as the canonical description. The logical expression could conform to an expression syntax like that of the Validation and Transformation Language (VTL: https://sdmx.org/?page_id=5096) or the Structured Data Transformation Language (SDTL: https://ddialliance.org/products/sdtl/1.0). */
	ValueAndConceptDescription?: ValueAndConceptDescription[];
	/** Definition
	  * ============
	  * Set of permissible values for a variable (adapted from ISO/IEC 11179).
	  *
	  * Examples
	  * ==========
	  * Age categories with a numeric code list; Age in years; Young, Middle-aged and Old.
	  *
	  * Explanatory notes
	  * ===================
	  * The values can be described by enumeration or by an expression. Value domains can be either substantive/sentinel, or described/enumeration. */
	ValueDomain?: ValueDomain[];
	/** Definition
	  * ==========
	  * Physical characteristics for the value of an instance variable stored in a data point as part of a physical segment layout.
	  *
	  * Examples
	  * ========
	  * A variable "age" might be represented in a file as a string with a maximum length of 5 characters and a number pattern of ##0.0
	  *
	  * Explanatory notes
	  * =================
	  * An instance variable has details of value domain and data type, but will not have the final details of how a value is physically represented in a data file. A variable for height, for example, may be represented as a real number, but may be represented as a string in multiple ways. The decimal separator might be, for example a period or a comma. The string representing the value of a payment might be preceded by a currency symbol. The same numeric value might be written as "1,234,567" or "1.234567". A missing value might be written as ".", "NA", ".R" or as "R". The value mapping describes how the value of an instance variable is physically expressed. The properties of the value mapping as intended to be compatible with the W3C Metadata Vocabulary for Tabular Data (https://www.w3.org/TR/tabular-metadata/) as well as common programming languages and statistical packages. The 'format' property, for example, can draw from an external controlled vocabulary such as the set of formats for Stata, SPSS, or SAS. */
	ValueMapping?: ValueMapping[];
	/** Definition
	  * ============
	  * Denotes the position of a value mapping in a sequence. */
	ValueMappingPosition?: ValueMappingPosition[];
	/** Definition
	  * ============
	  * Relationships among data points in a physical layout. */
	ValueMappingRelationship?: ValueMappingRelationship[];
	/** Definition
	  * ==========
	  * Group of any type of variable within the variable cascade (conceptual, represented, instance).
	  *
	  * Examples
	  * ========
	  * 1. Variables within a specific section of a study
	  * 2. Variables related to a specific subject or keyword
	  * 3. Variables at a specified level of development or review
	  *
	  * Explanatory notes
	  * =================
	  * A simple ordered or unordered list of variables can be described via a set of variable position parameters. An optional variable structure can describe a more complex structure for the collection. We might, for example, use the variable structure to group variables by content within a single collection of data or a wave of on-going data collection. For the purposes of management, conceptualization or anything other than organizing a logical record or physical layout. */
	VariableCollection?: VariableCollection[];
	/** Definition
	  * ============
	  * Role given to a represented variable in the context of a data structure to provide codes for variable identification.
	  *
	  * Examples
	  * ==========
	  * Consider {"income", "age"} to be the value domain of the represented variable working as a variable descriptor component.  The two codes, i.e. those designating "income" and "age", are descriptors used to identify which values in the variable value component correspond to income and which ones to age.
	  *
	  * Explanatory notes
	  * ===================
	  * Whenever more than one variable appears in the same column, we need a mechanism to distinguish which values correspond to which variable. This mechanism is provided by the variable descriptor component, which contains the codes used to link the variables to their values.  This structure provides a flexible mechanism avoiding the need for a formal pointer. */
	VariableDescriptorComponent?: VariableDescriptorComponent[];
	/** Definition
	  * ============
	  * Assigns a sequence number to a variable within a list.
	  *
	  * Explanatory notes
	  * ===================
	  * Variable position allows a list of variables to be ordered. */
	VariablePosition?: VariablePosition[];
	/** Definition
	  * ============
	  * Relationship between any variables in the variable cascade (conceptual, represented, instance), based on an ordered relation. */
	VariableRelationship?: VariableRelationship[];
	/** Definition
	  * ============
	  * Relation structure for use with any set of variables in the variable cascade (conceptual, represented, instance). */
	VariableStructure?: VariableStructure[];
	/** Definition
	  * ============
	  * Role given to a represented variable in the context of a data structure to record values of multiple variables.
	  *
	  * Examples
	  * ==========
	  * Consider two variables, i.e. income and age, with their values living together in different entries in the same column.  The values of those two variables are now in the value domain of a single variable (the one working as a variable value component).  Another column, based on a variable descriptor component, use codes for "income" and "age" to distinguish income values from age values.
	  *
	  * Explanatory notes
	  * ===================
	  * A variable value component captures the values of multiple variables that have been transposed into a single column.  The variable descriptor component provides a mechanism to identify which of those values correspond to which variable.   This structure provides a flexible mechanism avoiding the need for a formal pointer. */
	VariableValueComponent?: VariableValueComponent[];
	/** Definition
	  * ============
	  * Organized collection of wide data. It is structured by a wide data structure.
	  *
	  * Examples
	  * ==========
	  * A unit dataset where each row corresponds to a set of data points capturing different characteristics of a unit. */
	WideDataSet?: WideDataSet[];
	/** Definition
	  * ==========
	  * Structure of a wide dataset (organized collection of wide data). It is described by identifier, measure and attribute components.
	  *
	  * Examples
	  * ==========
	  * The structure described by [Unit id, Income, Province] where Unit id identifies a statistical unit and Income and Province are two instance variables capturing characteristics. */
	WideDataStructure?: WideDataStructure[];
	/** Definition
	  * ==========
	  * Collection of data instances that uniquely identify a collection of data points in a wide dataset.
	  *
	  * Examples
	  * ==========
	  * Collection containing the single "1A2B3C" string in a wide dataset where rows are identified by postal code representations. */
	WideKey?: WideKey[];
	/** Definition
	  * ============
	  * Single data instance that is part of a wide key.
	  *
	  * Examples
	  * ==========
	  * The "1A2B3C" string in a wide dataset where rows are identified by postal code representations. */
	WideKeyMember?: WideKeyMember[];
	/** Definition
	  * ==========
	  * Information structured according to the DDI-CDI model for a specific purpose or purposes within a system or community. */
	Wrapper?: Wrapper[];
}
export interface DDICDIModels extends _DDICDIModels { constructor: { new(): DDICDIModels }; }
export var DDICDIModels: { new(): DDICDIModels };

/** Definition
  * ==========
  * Use of a code for variable identification in the context of a data structure and a variable descriptor component.
  *
  * Examples
  * ========
  * Consider two variables, i.e. income and age, with values appearing in the same column. Codes "income" and "age" are descriptors. They appear multiple time in a variable descriptor component, one for each value in the variable value component. Each descriptor references one of those values. This way it's possible to identify which values correspond to income and which ones to age. */
interface _Descriptor extends _KeyMember {
	Descriptor_hasValueFrom_DescriptorValueDomain: DescriptorDescriptor_hasValueFrom_DescriptorValueDomainType;
	Descriptor_identifies_ReferenceVariable: DescriptorDescriptor_identifies_ReferenceVariableType;
	Descriptor_refersTo_ReferenceValue: DescriptorDescriptor_refersTo_ReferenceValueType[];
}
export interface Descriptor extends _Descriptor { constructor: { new(): Descriptor }; }
export var Descriptor: { new(): Descriptor };

interface _DescriptorDescriptor_hasValueFrom_DescriptorValueDomainType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: DescriptorDescriptor_hasValueFrom_DescriptorValueDomainTypeValidTypeType[];
}
interface DescriptorDescriptor_hasValueFrom_DescriptorValueDomainType extends _DescriptorDescriptor_hasValueFrom_DescriptorValueDomainType { constructor: { new(): DescriptorDescriptor_hasValueFrom_DescriptorValueDomainType }; }

type DescriptorDescriptor_hasValueFrom_DescriptorValueDomainTypeValidTypeType = "DescriptorValueDomain";
interface _DescriptorDescriptor_hasValueFrom_DescriptorValueDomainTypeValidTypeType extends Primitive._string { content: DescriptorDescriptor_hasValueFrom_DescriptorValueDomainTypeValidTypeType; }

interface _DescriptorDescriptor_identifies_ReferenceVariableType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: DescriptorDescriptor_identifies_ReferenceVariableTypeValidTypeType[];
}
interface DescriptorDescriptor_identifies_ReferenceVariableType extends _DescriptorDescriptor_identifies_ReferenceVariableType { constructor: { new(): DescriptorDescriptor_identifies_ReferenceVariableType }; }

type DescriptorDescriptor_identifies_ReferenceVariableTypeValidTypeType = "ReferenceVariable";
interface _DescriptorDescriptor_identifies_ReferenceVariableTypeValidTypeType extends Primitive._string { content: DescriptorDescriptor_identifies_ReferenceVariableTypeValidTypeType; }

interface _DescriptorDescriptor_refersTo_ReferenceValueType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType: DescriptorDescriptor_refersTo_ReferenceValueTypeValidTypeType[];
}
interface DescriptorDescriptor_refersTo_ReferenceValueType extends _DescriptorDescriptor_refersTo_ReferenceValueType { constructor: { new(): DescriptorDescriptor_refersTo_ReferenceValueType }; }

type DescriptorDescriptor_refersTo_ReferenceValueTypeValidTypeType = "ReferenceValue";
interface _DescriptorDescriptor_refersTo_ReferenceValueTypeValidTypeType extends Primitive._string { content: DescriptorDescriptor_refersTo_ReferenceValueTypeValidTypeType; }

/** Definition
  * ============
  * Set of permissible values for a variable playing the role of a variable descriptor component.
  *
  * Examples
  * ==========
  * Consider two variables, i.e. income and age, with values appearing in the same column.
  * Codes "income" and "age" are descriptors that appear in the descriptor value domain corresponding to the descriptor variable. */
interface _DescriptorValueDomain extends _SubstantiveValueDomain {}
export interface DescriptorValueDomain extends _DescriptorValueDomain { constructor: { new(): DescriptorValueDomain }; }
export var DescriptorValueDomain: { new(): DescriptorValueDomain };

/** Definition
  * ============
  * Variable that provides codes for variable identification in the context of a data structure.
  * Variable playing the role of a variable descriptor component.
  *
  * Examples
  * ==========
  * Consider two variables, i.e. income and age, with values apearing in the same column.
  * Codes "income" and "age" are descriptors that appear in the descriptor value domain corresponding to the descriptor variable. */
interface _DescriptorVariable extends _RepresentedVariable {
	DescriptorVariable_takesSubstantiveValuesFrom_DescriptorValueDomain?: DescriptorVariableDescriptorVariable_takesSubstantiveValuesFrom_DescriptorValueDomainType;
}
export interface DescriptorVariable extends _DescriptorVariable { constructor: { new(): DescriptorVariable }; }
export var DescriptorVariable: { new(): DescriptorVariable };

interface _DescriptorVariableDescriptorVariable_takesSubstantiveValuesFrom_DescriptorValueDomainType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: DescriptorVariableDescriptorVariable_takesSubstantiveValuesFrom_DescriptorValueDomainTypeValidTypeType[];
}
interface DescriptorVariableDescriptorVariable_takesSubstantiveValuesFrom_DescriptorValueDomainType extends _DescriptorVariableDescriptorVariable_takesSubstantiveValuesFrom_DescriptorValueDomainType { constructor: { new(): DescriptorVariableDescriptorVariable_takesSubstantiveValuesFrom_DescriptorValueDomainType }; }

type DescriptorVariableDescriptorVariable_takesSubstantiveValuesFrom_DescriptorValueDomainTypeValidTypeType = "DescriptorValueDomain";
interface _DescriptorVariableDescriptorVariable_takesSubstantiveValuesFrom_DescriptorValueDomainTypeValidTypeType extends Primitive._string { content: DescriptorVariableDescriptorVariable_takesSubstantiveValuesFrom_DescriptorValueDomainTypeValidTypeType; }

/** Definition
  * ============
  * Deterministic imperative is a subtype of control logic. Deterministic control logic consists of control constructs.
  *
  * Examples
  * ==========
  * A Loop control construct is deterministic control logic. A script is deterministic control logic.
  *
  * Explanatory notes
  * ===================
  * Because control logic covers both deterministic and non-deterministic forms, it has been divided into the appropriate subtypes. */
interface _DeterministicImperative extends _ControlLogic {}
export interface DeterministicImperative extends _DeterministicImperative { constructor: { new(): DeterministicImperative }; }
export var DeterministicImperative: { new(): DeterministicImperative };

/** Definition
  * ============
  * Organized collection of multidimensional data. It is structured by a dimensional data structure.
  *
  * Examples
  * ==========
  * A dimensional dataset with Income values in each data point, where the dimensions organizing the data points are Sex and Marital Status.
  *
  * Explanatory notes
  * ===================
  * Similar to Structural N-Cube. */
interface _DimensionalDataSet extends _DataSet {
	DimensionalDataSet_represents_ScopedMeasure?: DimensionalDataSetDimensionalDataSet_represents_ScopedMeasureType[];
	/** Human understandable name (liguistic signifier, word, phrase, or mnemonic). May follow ISO/IEC 11179-5 naming principles, and have context provided to specify usage. */
	name?: ObjectName[];
}
export interface DimensionalDataSet extends _DimensionalDataSet { constructor: { new(): DimensionalDataSet }; }
export var DimensionalDataSet: { new(): DimensionalDataSet };

interface _DimensionalDataSetDimensionalDataSet_represents_ScopedMeasureType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: DimensionalDataSetDimensionalDataSet_represents_ScopedMeasureTypeValidTypeType[];
}
interface DimensionalDataSetDimensionalDataSet_represents_ScopedMeasureType extends _DimensionalDataSetDimensionalDataSet_represents_ScopedMeasureType { constructor: { new(): DimensionalDataSetDimensionalDataSet_represents_ScopedMeasureType }; }

type DimensionalDataSetDimensionalDataSet_represents_ScopedMeasureTypeValidTypeType = "ScopedMeasure";
interface _DimensionalDataSetDimensionalDataSet_represents_ScopedMeasureTypeValidTypeType extends Primitive._string { content: DimensionalDataSetDimensionalDataSet_represents_ScopedMeasureTypeValidTypeType; }

/** Definition
  * ============
  * Structure of a dimensional data set (organized collection of multidimensional data). It is described by dimension, measure and attribute components.
  *
  * Examples
  * ==========
  * The structure described by [City, Average Income, Total Population] where City is a dimension and Average Income and Total Population are measures. */
interface _DimensionalDataStructure extends _DataStructure {
	DimensionalDataStructure_uses_DimensionGroup?: DimensionalDataStructureDimensionalDataStructure_uses_DimensionGroupType[];
}
export interface DimensionalDataStructure extends _DimensionalDataStructure { constructor: { new(): DimensionalDataStructure }; }
export var DimensionalDataStructure: { new(): DimensionalDataStructure };

interface _DimensionalDataStructureDimensionalDataStructure_uses_DimensionGroupType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: DimensionalDataStructureDimensionalDataStructure_uses_DimensionGroupTypeValidTypeType[];
}
interface DimensionalDataStructureDimensionalDataStructure_uses_DimensionGroupType extends _DimensionalDataStructureDimensionalDataStructure_uses_DimensionGroupType { constructor: { new(): DimensionalDataStructureDimensionalDataStructure_uses_DimensionGroupType }; }

type DimensionalDataStructureDimensionalDataStructure_uses_DimensionGroupTypeValidTypeType = "DimensionGroup";
interface _DimensionalDataStructureDimensionalDataStructure_uses_DimensionGroupTypeValidTypeType extends Primitive._string { content: DimensionalDataStructureDimensionalDataStructure_uses_DimensionGroupTypeValidTypeType; }

/** Definition
  * ============
  * Collection of data instances that uniquely identify a collection of data points in a dimensional dataset.
  *
  * Examples
  * ==========
  * Collection of "male", "Ontario" and "married" strings in a dimensional dataset where data points are identified by Sex, Province and Marital Status dimensions. */
interface _DimensionalKey extends _Key {}
export interface DimensionalKey extends _DimensionalKey { constructor: { new(): DimensionalKey }; }
export var DimensionalKey: { new(): DimensionalKey };

/** Definition
  * ============
  * Collection of concepts that uniquely defines a collection of data points in a dimensional dataset.
  *
  * Examples
  * ==========
  * Collection of [Male], [Ontario] and [Married] categories in a dimensional dataset where data points are defined by Sex, Province and Marital Status dimensions. */
interface _DimensionalKeyDefinition extends _KeyDefinition {}
export interface DimensionalKeyDefinition extends _DimensionalKeyDefinition { constructor: { new(): DimensionalKeyDefinition }; }
export var DimensionalKeyDefinition: { new(): DimensionalKeyDefinition };

/** Definition
  * ============
  * Single concept that is part of a dimensional key definition.
  *
  * Examples
  * ==========
  * The [Ontario] category in a dimensional dataset where data points are defined by Province and other dimensions. */
interface _DimensionalKeyDefinitionMember extends _ConceptualValue {
	DimensionalKeyDefinitionMember_isRepresentedBy_DimensionalKeyMember: DimensionalKeyDefinitionMemberDimensionalKeyDefinitionMember_isRepresentedBy_DimensionalKeyMemberType[];
}
export interface DimensionalKeyDefinitionMember extends _DimensionalKeyDefinitionMember { constructor: { new(): DimensionalKeyDefinitionMember }; }
export var DimensionalKeyDefinitionMember: { new(): DimensionalKeyDefinitionMember };

interface _DimensionalKeyDefinitionMemberDimensionalKeyDefinitionMember_isRepresentedBy_DimensionalKeyMemberType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: DimensionalKeyDefinitionMemberDimensionalKeyDefinitionMember_isRepresentedBy_DimensionalKeyMemberTypeValidTypeType[];
}
interface DimensionalKeyDefinitionMemberDimensionalKeyDefinitionMember_isRepresentedBy_DimensionalKeyMemberType extends _DimensionalKeyDefinitionMemberDimensionalKeyDefinitionMember_isRepresentedBy_DimensionalKeyMemberType { constructor: { new(): DimensionalKeyDefinitionMemberDimensionalKeyDefinitionMember_isRepresentedBy_DimensionalKeyMemberType }; }

type DimensionalKeyDefinitionMemberDimensionalKeyDefinitionMember_isRepresentedBy_DimensionalKeyMemberTypeValidTypeType = "DimensionalKeyMember";
interface _DimensionalKeyDefinitionMemberDimensionalKeyDefinitionMember_isRepresentedBy_DimensionalKeyMemberTypeValidTypeType extends Primitive._string { content: DimensionalKeyDefinitionMemberDimensionalKeyDefinitionMember_isRepresentedBy_DimensionalKeyMemberTypeValidTypeType; }

/** Definition
  * ============
  * Single data instance that is part of a dimensional key.
  *
  * Examples
  * ==========
  * The "Ontario" string in a dimensional dataset where data points are identified by Province and other dimensions. */
interface _DimensionalKeyMember extends _KeyMember {
	DimensionalKeyMember_hasValueFrom_CodeList: DimensionalKeyMemberDimensionalKeyMember_hasValueFrom_CodeListType;
}
export interface DimensionalKeyMember extends _DimensionalKeyMember { constructor: { new(): DimensionalKeyMember }; }
export var DimensionalKeyMember: { new(): DimensionalKeyMember };

interface _DimensionalKeyMemberDimensionalKeyMember_hasValueFrom_CodeListType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: DimensionalKeyMemberDimensionalKeyMember_hasValueFrom_CodeListTypeValidTypeType[];
}
interface DimensionalKeyMemberDimensionalKeyMember_hasValueFrom_CodeListType extends _DimensionalKeyMemberDimensionalKeyMember_hasValueFrom_CodeListType { constructor: { new(): DimensionalKeyMemberDimensionalKeyMember_hasValueFrom_CodeListType }; }

type DimensionalKeyMemberDimensionalKeyMember_hasValueFrom_CodeListTypeValidTypeType = "CodeList";
interface _DimensionalKeyMemberDimensionalKeyMember_hasValueFrom_CodeListTypeValidTypeType extends Primitive._string { content: DimensionalKeyMemberDimensionalKeyMember_hasValueFrom_CodeListTypeValidTypeType; }

/** Definition
  * ============
  * Role given to a represented variable in the context of a dimensional data structure to identify the universes associated with data points. The variable acts as a field in the compound identifier (the key structure) to disambiguate the cells in the multi-dimensional "cube".
  *
  * Explanatory notes
  * ===================
  * The categories from each dimension often are used in combination to identify a cell. The meaning of the combination of the categories supplies meaning to the cell. */
interface _DimensionComponent extends _DataStructureComponent {
	/** Indicates whether categories at a specific level can be combined to provide the value for their shared parent category. Value is True if categories can be added together (collapsed) to create higher-level categories.
	  *
	  * An example would be age categories. Five-year age categories can be collapsed into 10-year age categories. */
	categoricalAdditivity?: boolean;
	DimensionComponent_isStructuredBy_ValueDomain?: DimensionComponentDimensionComponent_isStructuredBy_ValueDomainType;
}
export interface DimensionComponent extends _DimensionComponent { constructor: { new(): DimensionComponent }; }
export var DimensionComponent: { new(): DimensionComponent };

interface _DimensionComponentDimensionComponent_isStructuredBy_ValueDomainType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: DimensionComponentDimensionComponent_isStructuredBy_ValueDomainTypeValidTypeType[];
}
interface DimensionComponentDimensionComponent_isStructuredBy_ValueDomainType extends _DimensionComponentDimensionComponent_isStructuredBy_ValueDomainType { constructor: { new(): DimensionComponentDimensionComponent_isStructuredBy_ValueDomainType }; }

type DimensionComponentDimensionComponent_isStructuredBy_ValueDomainTypeValidTypeType = ("DescriptorValueDomain" | "ReferenceValueDomain" | "SentinelValueDomain" | "SubstantiveValueDomain" | "ValueDomain");
interface _DimensionComponentDimensionComponent_isStructuredBy_ValueDomainTypeValidTypeType extends Primitive._string { content: DimensionComponentDimensionComponent_isStructuredBy_ValueDomainTypeValidTypeType; }

/** Definition
  * ============
  * Collection of dimensions that can be reused across multiple dimensional structures.
  *
  * Examples
  * ==========
  * Sex, Province and Marital Status is a common set of dimensions used across a variety of dimensional data structures and might need to be maintained separately. */
interface _DimensionGroup extends BaseType {
	DimensionGroup_has_DimensionComponent: DimensionGroupDimensionGroup_has_DimensionComponentType[];
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	/** Human understandable name (liguistic signifier, word, phrase, or mnemonic). May follow ISO/IEC 11179-5 naming principles, and have context provided to specify usage. */
	name?: ObjectName[];
}
export interface DimensionGroup extends _DimensionGroup { constructor: { new(): DimensionGroup }; }
export var DimensionGroup: { new(): DimensionGroup };

interface _DimensionGroupDimensionGroup_has_DimensionComponentType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: DimensionGroupDimensionGroup_has_DimensionComponentTypeValidTypeType[];
}
interface DimensionGroupDimensionGroup_has_DimensionComponentType extends _DimensionGroupDimensionGroup_has_DimensionComponentType { constructor: { new(): DimensionGroupDimensionGroup_has_DimensionComponentType }; }

type DimensionGroupDimensionGroup_has_DimensionComponentTypeValidTypeType = "DimensionComponent";
interface _DimensionGroupDimensionGroup_has_DimensionComponentTypeValidTypeType extends Primitive._string { content: DimensionGroupDimensionGroup_has_DimensionComponentTypeValidTypeType; }

/** Definition
  * ============
  * Any non-email means of relaying a message electronically. This would include text messaging, Skype, Twitter, ICQ, or other emerging means of electronic message conveyance.
  *
  * Examples
  * ==========
  * Skype account, etc. */
interface _ElectronicMessageSystem extends BaseType {
	/** Account identification for contacting. */
	contactAddress?: string;
	/** Time period during which the account is valid. */
	effectiveDates?: DateRange;
	/** Set to True if this is the preferred address. */
	isPreferred?: boolean;
	/** Specify the level privacy for the address as public, restricted, or private. Supports the use of an external controlled vocabulary. */
	privacy?: ControlledVocabularyEntry;
	/** Indicates the type of service used. Supports the use of a controlled vocabulary. */
	typeOfService?: ControlledVocabularyEntry;
}
export interface ElectronicMessageSystem extends _ElectronicMessageSystem { constructor: { new(): ElectronicMessageSystem }; }
export var ElectronicMessageSystem: { new(): ElectronicMessageSystem };

/** Definition
  * ============
  * An e-mail address which conforms to the internet format (RFC 822) including its type and time period for which it is valid.
  *
  * Examples
  * ==========
  * info@ddialliance.org; ex.ample@somewhere.org */
interface _Email extends BaseType {
	/** Time period for which the e-mail address is valid. */
	effectiveDates?: DateRange;
	/** The email address expressed as a string (should follow the Internet format specification - RFC 5322) e.g. user@server.ext, more complex and flexible examples are also supported by the format. */
	internetEmail?: string;
	/** Set to True if this is the preferred email. */
	isPreferred?: boolean;
	/** Indicates the level of privacy. */
	privacy?: ControlledVocabularyEntry;
	/** Code indicating the type of e-mail address. Supports the use of an external controlled vocabulary. (e.g. home, office). */
	typeOfEmail?: ControlledVocabularyEntry;
}
export interface Email extends _Email { constructor: { new(): Email }; }
export var Email: { new(): Email };

/** Definition
  * ============
  * Specific information about any relevant embargo. */
interface _EmbargoInformation extends BaseType {
	/** A text desription of the terms of an embarog on the object. */
	description?: InternationalString;
	/** The time range(s) for embargo of the object */
	period?: DateRange[];
}
export interface EmbargoInformation extends _EmbargoInformation { constructor: { new(): EmbargoInformation }; }
export var EmbargoInformation: { new(): EmbargoInformation };

/** Definition
  * ============
  * A base class acting as an extension point to allow all codifications (codelist, statistical classification, etc.) to be understood as enumerated value domains. */
interface _EnumerationDomain extends BaseType {
	/** The conceptual basis for the collection of members. */
	EnumerationDomain_isDefinedBy_Concept?: EnumerationDomainEnumerationDomain_isDefinedBy_ConceptType[];
	/** Category set associated with the enumeration. */
	EnumerationDomain_references_CategorySet?: EnumerationDomainEnumerationDomain_references_CategorySetType;
	/** Has meaningful level to which members belong. */
	EnumerationDomain_uses_LevelStructure?: EnumerationDomainEnumerationDomain_uses_LevelStructureType;
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	/** Human understandable name (liguistic signifier, word, phrase, or mnemonic). May follow ISO/IEC 11179-5 naming principles, and have context provided to specify usage. */
	name?: ObjectName[];
	/** Intent or reason for the object/the description of the object. */
	purpose?: InternationalString;
}
export interface EnumerationDomain extends _EnumerationDomain { constructor: { new(): EnumerationDomain }; }
export var EnumerationDomain: { new(): EnumerationDomain };

interface _EnumerationDomainEnumerationDomain_isDefinedBy_ConceptType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: EnumerationDomainEnumerationDomain_isDefinedBy_ConceptTypeValidTypeType[];
}
interface EnumerationDomainEnumerationDomain_isDefinedBy_ConceptType extends _EnumerationDomainEnumerationDomain_isDefinedBy_ConceptType { constructor: { new(): EnumerationDomainEnumerationDomain_isDefinedBy_ConceptType }; }

type EnumerationDomainEnumerationDomain_isDefinedBy_ConceptTypeValidTypeType = ("Category" | "Concept" | "ConceptualValue" | "ConceptualVariable" | "DescriptorVariable" | "DimensionalKeyDefinitionMember" | "InstanceVariable" | "KeyDefinitionMember" | "Population" | "ReferenceVariable" | "RepresentedVariable" | "UnitType" | "Universe");
interface _EnumerationDomainEnumerationDomain_isDefinedBy_ConceptTypeValidTypeType extends Primitive._string { content: EnumerationDomainEnumerationDomain_isDefinedBy_ConceptTypeValidTypeType; }

interface _EnumerationDomainEnumerationDomain_references_CategorySetType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: EnumerationDomainEnumerationDomain_references_CategorySetTypeValidTypeType[];
}
interface EnumerationDomainEnumerationDomain_references_CategorySetType extends _EnumerationDomainEnumerationDomain_references_CategorySetType { constructor: { new(): EnumerationDomainEnumerationDomain_references_CategorySetType }; }

type EnumerationDomainEnumerationDomain_references_CategorySetTypeValidTypeType = "CategorySet";
interface _EnumerationDomainEnumerationDomain_references_CategorySetTypeValidTypeType extends Primitive._string { content: EnumerationDomainEnumerationDomain_references_CategorySetTypeValidTypeType; }

interface _EnumerationDomainEnumerationDomain_uses_LevelStructureType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: EnumerationDomainEnumerationDomain_uses_LevelStructureTypeValidTypeType[];
}
interface EnumerationDomainEnumerationDomain_uses_LevelStructureType extends _EnumerationDomainEnumerationDomain_uses_LevelStructureType { constructor: { new(): EnumerationDomainEnumerationDomain_uses_LevelStructureType }; }

type EnumerationDomainEnumerationDomain_uses_LevelStructureTypeValidTypeType = "LevelStructure";
interface _EnumerationDomainEnumerationDomain_uses_LevelStructureTypeValidTypeType extends Primitive._string { content: EnumerationDomainEnumerationDomain_uses_LevelStructureTypeValidTypeType; }

/** Definition
  * ============
  * Role of a set of data structure components for content referencing purposes
  *
  * Explanatory notes
  * ===================
  * Equivalent to foreign key in the relational model.
  * It can be used in conjunction with primary key to link data structures and their related data sets. */
interface _ForeignKey extends BaseType {
	ForeignKey_isComposedOf_ForeignKeyComponent: ForeignKeyForeignKey_isComposedOf_ForeignKeyComponentType[];
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
}
export interface ForeignKey extends _ForeignKey { constructor: { new(): ForeignKey }; }
export var ForeignKey: { new(): ForeignKey };

/** Definition
  * ============
  * Role of a data structure component for content referencing purposes
  *
  * Explanatory notes
  * ===================
  * Equivalent to a foreign key attribute (i.e. column) in the relational model.
  * It can be used in conjunction with a primary key component to link data structures and their related data sets. */
interface _ForeignKeyComponent extends BaseType {
	ForeignKeyComponent_correspondsTo_DataStructureComponent: ForeignKeyComponentForeignKeyComponent_correspondsTo_DataStructureComponentType;
	ForeignKeyComponent_references_PrimaryKeyComponent: ForeignKeyComponentForeignKeyComponent_references_PrimaryKeyComponentType;
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
}
export interface ForeignKeyComponent extends _ForeignKeyComponent { constructor: { new(): ForeignKeyComponent }; }
export var ForeignKeyComponent: { new(): ForeignKeyComponent };

interface _ForeignKeyComponentForeignKeyComponent_correspondsTo_DataStructureComponentType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: ForeignKeyComponentForeignKeyComponent_correspondsTo_DataStructureComponentTypeValidTypeType[];
}
interface ForeignKeyComponentForeignKeyComponent_correspondsTo_DataStructureComponentType extends _ForeignKeyComponentForeignKeyComponent_correspondsTo_DataStructureComponentType { constructor: { new(): ForeignKeyComponentForeignKeyComponent_correspondsTo_DataStructureComponentType }; }

type ForeignKeyComponentForeignKeyComponent_correspondsTo_DataStructureComponentTypeValidTypeType = ("AttributeComponent" | "ContextualComponent" | "DataStructure" | "DataStructureComponent" | "DimensionComponent" | "DimensionalDataStructure" | "IdentifierComponent" | "KeyValueStructure" | "LongDataStructure" | "MeasureComponent" | "QualifiedMeasure" | "SyntheticIdComponent" | "VariableDescriptorComponent" | "VariableValueComponent" | "WideDataStructure");
interface _ForeignKeyComponentForeignKeyComponent_correspondsTo_DataStructureComponentTypeValidTypeType extends Primitive._string { content: ForeignKeyComponentForeignKeyComponent_correspondsTo_DataStructureComponentTypeValidTypeType; }

interface _ForeignKeyComponentForeignKeyComponent_references_PrimaryKeyComponentType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: ForeignKeyComponentForeignKeyComponent_references_PrimaryKeyComponentTypeValidTypeType[];
}
interface ForeignKeyComponentForeignKeyComponent_references_PrimaryKeyComponentType extends _ForeignKeyComponentForeignKeyComponent_references_PrimaryKeyComponentType { constructor: { new(): ForeignKeyComponentForeignKeyComponent_references_PrimaryKeyComponentType }; }

type ForeignKeyComponentForeignKeyComponent_references_PrimaryKeyComponentTypeValidTypeType = "PrimaryKeyComponent";
interface _ForeignKeyComponentForeignKeyComponent_references_PrimaryKeyComponentTypeValidTypeType extends Primitive._string { content: ForeignKeyComponentForeignKeyComponent_references_PrimaryKeyComponentTypeValidTypeType; }

interface _ForeignKeyForeignKey_isComposedOf_ForeignKeyComponentType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType: ForeignKeyForeignKey_isComposedOf_ForeignKeyComponentTypeValidTypeType[];
}
interface ForeignKeyForeignKey_isComposedOf_ForeignKeyComponentType extends _ForeignKeyForeignKey_isComposedOf_ForeignKeyComponentType { constructor: { new(): ForeignKeyForeignKey_isComposedOf_ForeignKeyComponentType }; }

type ForeignKeyForeignKey_isComposedOf_ForeignKeyComponentTypeValidTypeType = "ForeignKeyComponent";
interface _ForeignKeyForeignKey_isComposedOf_ForeignKeyComponentTypeValidTypeType extends Primitive._string { content: ForeignKeyForeignKey_isComposedOf_ForeignKeyComponentTypeValidTypeType; }

/** Definition
  * ============
  * Information regarding the source of funds used to develop or support the resource being described. */
interface _FundingInformation extends BaseType {
	/** A reference to the agent (e.g. organization) that provided funding for a grant. */
	fundingAgent?: AgentInRole[];
	/** The identification number for the grant at least partly provided by the funding agent. */
	grantNumber?: string;
}
export interface FundingInformation extends _FundingInformation { constructor: { new(): FundingInformation }; }
export var FundingInformation: { new(): FundingInformation };

/** Definition
  * ============
  * Geography-specific role given to a represented variable in the context of a data structure. The specific characterization of the role (e.g. reference, coordinates, etc.) may be given by a controlled vocabulary. */
interface _GeoRole extends _SpecializationRole {
	/** Function in relation to the specification of a place or physical area or feature, ideally drawn from a controlled vocabulary. */
	geography?: ControlledVocabularyEntry;
}
export interface GeoRole extends _GeoRole { constructor: { new(): GeoRole }; }
export var GeoRole: { new(): GeoRole };

/** Definition
  * ============
  * Identifier for objects requiring short- or long-lasting referencing and management. */
interface _Identifier extends BaseType {
	/** A globally unique identifier. The values of the three attributes can be used to create a DDI URN. */
	ddiIdentifier?: InternationalRegistrationDataIdentifier;
	/** Default value is False indicating that the content of the current version may change (may be in development mode). Set to True when the content of this version will no longer change. */
	isDdiIdentifierPersistent?: boolean;
	/** Default value is False. If the id of the object was created as a Universally Unique ID (UUID) set to True. */
	isDdiIdentifierUniversallyUnique?: boolean;
	/** Any identifier other than a DDI identifier. */
	nonDdiIdentifier?: NonDdiIdentifier[];
	/** A Universal Resource Identifier, valid according to the W3C XML Schema specification. */
	uri?: string;
	/** Date and time the object was changed expressed in standard ISO formats. */
	versionDate?: Date;
	/** Reason for making a new version of the object. */
	versionRationale?: RationaleDefinition;
	/** Contributor who has the ownership and responsibility for the current version. */
	versionResponsibility?: AgentInRole;
}
export interface Identifier extends _Identifier { constructor: { new(): Identifier }; }
export var Identifier: { new(): Identifier };

/** Definition
  * ============
  * Role given to a represented variable in the context of a long or wide data structure to identify the units associated to data points, and in dimensional and key value data structures to provide identifying fields for the instance values.
  *
  * Examples
  * ==========
  * The personal identification number of a Swedish citizen for unit data or the name of a country in the European Union for dimensional data. */
interface _IdentifierComponent extends _DataStructureComponent {}
export interface IdentifierComponent extends _IdentifierComponent { constructor: { new(): IdentifierComponent }; }
export var IdentifierComponent: { new(): IdentifierComponent };

/** Definition
  * ============
  * A person. (See for example the W3C Friend of a Friend Ontology - http://xmlns.com/foaf/spec/#term_Person).
  *
  * Examples
  * ==========
  * Individual employed by an organization. A person within a unit or project (organization). Albert Einstein, Bugs Bunny, Harry Potter, Ashley G. Williams, Gandalf.
  *
  * Explanatory notes
  * ===================
  * Describes people referred to in the description of data and process. Similar to the concept found in Schema.org, the W3C ORG Ontology, etc. */
interface _Individual extends _Agent {
	/** Contact information for the individual including location specification, address, URL, phone numbers, and other means of communication access. Sets of information can be repeated and date-stamped. */
	contactInformation?: ContactInformation;
	/** Name of an individual broken out into its component parts of prefix, first/given name, middle name, last/family/surname, and suffix. */
	individualName?: IndividualName[];
}
export interface Individual extends _Individual { constructor: { new(): Individual }; }
export var Individual: { new(): Individual };

/** Definition
  * ============
  * The name of an individual broken out into its component parts of prefix, first/given name, middle name, last/family/surname, and suffix. The preferred compilation of the name parts may also be provided. The legal or formal name of the individual should have the isFormal attribute set to true. The preferred name should be noted with the isPreferred attribute. The attribute sex provides information to assist in the appropriate use of pronouns. */
interface _IndividualName extends BaseType {
	/** An abbreviation or acronym for the name. This may be expressed in multiple languages. It is assumed that if only a single language is provided that it may be used in any of the other languages within which the name itself is expressed. */
	abbreviation?: InternationalString;
	/** A name may be specific to a particular context, i.e. common usage, business, social, etc.. Identify the context related to the specified name. Supports the use of an external controlled vocabulary. */
	context?: ControlledVocabularyEntry;
	/** Clarifies when the name information is accurate. */
	effectiveDates?: DateRange;
	/** First (given) name of the individual. */
	firstGiven?: string;
	/** This provides a means of providing a full name as a single object for display or print such as identification badges etc. For example a person with the name of William Grace for official use may prefer a display name of Bill Grace on a name tag or other informal publication. */
	fullName?: InternationalString;
	/** The legal or formal name of the individual should have the isFormal attribute set to True. To avoid confusion only one individual name should have the isFormal attribute set to True. Use the TypeOfIndividualName to further differentiate the type and applied usage when multiple names are provided. */
	isFormal?: boolean;
	/** If more than one name for the object is provided, use the isPreferred attribute to indicate which is the preferred name content. All other names should be set to isPreferred=False. */
	isPreferred?: boolean;
	/** Last (family) name /surname of the individual. */
	lastFamily?: string;
	/** Middle name or initial of the individual. */
	middle?: string[];
	/** Title that precedes the name of the individual, such as Ms., or Dr. */
	prefix?: string;
	/** Sex allows for the specification of male, female or neutral. The purpose of providing this information is to assist others in the appropriate use of pronouns when addressing the individual. Note that many countries/languages may offer a neutral pronoun form. */
	sex?: SexSpecification;
	/** Title that follows the name of the individual, such as Esq. (abbreviation for Esquire. This is usually a courtesy title). */
	suffix?: string;
	/** The type of individual name provided. the use of a controlled vocabulary is strongly recommended. At minimum his should include, e.g. PreviousFormalName, Nickname (or CommonName), Other. */
	typeOfIndividualName?: ControlledVocabularyEntry;
}
export interface IndividualName extends _IndividualName { constructor: { new(): IndividualName }; }
export var IndividualName: { new(): IndividualName };

/** Definition
  * ============
  * The relationships between parameters across steps is described by the information flow definition. Each relationship creates a pathway for an information object to follow.
  *
  * Examples
  * ==========
  * The output of one parameter might be the input of another one. Think of a Business Process Model and Notation (BPMN) diagram or an extract, transform, and load (ETL) pipeline definition as the sum of these relationships.
  *
  * Explanatory notes
  * ===================
  * In DDI Lifecycle an information flow definition was referred to in terms of a "binding". */
interface _InformationFlowDefinition extends BaseType {
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	/** From parameters are the outputs from a control construct produced in its step/sub-step. */
	InformationFlowDefinition_from_Parameter?: InformationFlowDefinitionInformationFlowDefinition_from_ParameterType;
	/** To parameters are the inputs to a control construct used in its step/sub-step. */
	InformationFlowDefinition_to_Parameter?: InformationFlowDefinitionInformationFlowDefinition_to_ParameterType[];
}
export interface InformationFlowDefinition extends _InformationFlowDefinition { constructor: { new(): InformationFlowDefinition }; }
export var InformationFlowDefinition: { new(): InformationFlowDefinition };

interface _InformationFlowDefinitionInformationFlowDefinition_from_ParameterType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: InformationFlowDefinitionInformationFlowDefinition_from_ParameterTypeValidTypeType[];
}
interface InformationFlowDefinitionInformationFlowDefinition_from_ParameterType extends _InformationFlowDefinitionInformationFlowDefinition_from_ParameterType { constructor: { new(): InformationFlowDefinitionInformationFlowDefinition_from_ParameterType }; }

type InformationFlowDefinitionInformationFlowDefinition_from_ParameterTypeValidTypeType = "Parameter";
interface _InformationFlowDefinitionInformationFlowDefinition_from_ParameterTypeValidTypeType extends Primitive._string { content: InformationFlowDefinitionInformationFlowDefinition_from_ParameterTypeValidTypeType; }

interface _InformationFlowDefinitionInformationFlowDefinition_to_ParameterType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: InformationFlowDefinitionInformationFlowDefinition_to_ParameterTypeValidTypeType[];
}
interface InformationFlowDefinitionInformationFlowDefinition_to_ParameterType extends _InformationFlowDefinitionInformationFlowDefinition_to_ParameterType { constructor: { new(): InformationFlowDefinitionInformationFlowDefinition_to_ParameterType }; }

type InformationFlowDefinitionInformationFlowDefinition_to_ParameterTypeValidTypeType = "Parameter";
interface _InformationFlowDefinitionInformationFlowDefinition_to_ParameterTypeValidTypeType extends Primitive._string { content: InformationFlowDefinitionInformationFlowDefinition_to_ParameterTypeValidTypeType; }

/** Definition
  * ============
  * Single-valued key representation produced from the merge of the representations of all key members and a descriptor.
  *
  * Examples
  * ==========
  * The string "cluster:income_distribution:unitid:20:period:2020/02:income", where "cluster:income_distribution" is a key member based on a contextual component, "unitid:20" is based on an identifier component, "period:2020/02" is based on a component with a time role and "income" is based on a descriptor.
  *
  * Explanatory notes
  * ===================
  * For value strings, the merge is the string concatenation operation.
  * For other classes, an appropriate merge representation can be defined. */
interface _InstanceKey extends _Key {
	InstanceKey_has_InstanceValue?: InstanceKeyInstanceKey_has_InstanceValueType;
	InstanceKey_refersTo_ReferenceValue: InstanceKeyInstanceKey_refersTo_ReferenceValueType;
}
export interface InstanceKey extends _InstanceKey { constructor: { new(): InstanceKey }; }
export var InstanceKey: { new(): InstanceKey };

interface _InstanceKeyInstanceKey_has_InstanceValueType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: InstanceKeyInstanceKey_has_InstanceValueTypeValidTypeType[];
}
interface InstanceKeyInstanceKey_has_InstanceValueType extends _InstanceKeyInstanceKey_has_InstanceValueType { constructor: { new(): InstanceKeyInstanceKey_has_InstanceValueType }; }

type InstanceKeyInstanceKey_has_InstanceValueTypeValidTypeType = ("Descriptor" | "DimensionalKeyMember" | "InstanceValue" | "KeyMember" | "LongMainKeyMember" | "MainKeyMember" | "ReferenceValue" | "WideKeyMember");
interface _InstanceKeyInstanceKey_has_InstanceValueTypeValidTypeType extends Primitive._string { content: InstanceKeyInstanceKey_has_InstanceValueTypeValidTypeType; }

interface _InstanceKeyInstanceKey_refersTo_ReferenceValueType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: InstanceKeyInstanceKey_refersTo_ReferenceValueTypeValidTypeType[];
}
interface InstanceKeyInstanceKey_refersTo_ReferenceValueType extends _InstanceKeyInstanceKey_refersTo_ReferenceValueType { constructor: { new(): InstanceKeyInstanceKey_refersTo_ReferenceValueType }; }

type InstanceKeyInstanceKey_refersTo_ReferenceValueTypeValidTypeType = "ReferenceValue";
interface _InstanceKeyInstanceKey_refersTo_ReferenceValueTypeValidTypeType extends Primitive._string { content: InstanceKeyInstanceKey_refersTo_ReferenceValueTypeValidTypeType; }

/** Definition
  * ============
  * Single data instance corresponding to a concept (with a notion of equality defined) being observed, captured, or derived.
  *
  * Examples
  * ==========
  * A systolic blood pressure of 122 is measured. The single data instance (instance value) for that measurement is the character string "122". The associated measured concept (a blood pressure at that level) is the conceptual value.
  *
  * Explanatory notes
  * ===================
  * This is the actual instance of data that populates a data point (the signifier of a datum in the signification pattern). The instance value comes from a value domain associated with an instance variable which allows the attachment of a unit of measurement, a datatype, and a population. */
interface _InstanceValue extends BaseType {
	/** The content of this value expressed as a string. */
	content?: TypedString;
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	InstanceValue_hasValueFrom_ValueDomain: InstanceValueInstanceValue_hasValueFrom_ValueDomainType;
	InstanceValue_isStoredIn_DataPoint?: InstanceValueInstanceValue_isStoredIn_DataPointType;
	InstanceValue_represents_ConceptualValue?: InstanceValueInstanceValue_represents_ConceptualValueType;
	/** The usual setting "collapse" states that leading and trailing white space will be removed and multiple adjacent white spaces will be treated as a single white space. When setting to "replace" all occurrences of #x9 (tab), #xA (line feed) and #xD (carriage return) are replaced with #x20 (space) but leading and trailing spaces will be retained. If the existence of any of these white spaces is critical to the understanding of the content, change the value of this attribute to "preserve". */
	whiteSpace?: WhiteSpaceRule;
}
export interface InstanceValue extends _InstanceValue { constructor: { new(): InstanceValue }; }
export var InstanceValue: { new(): InstanceValue };

interface _InstanceValueInstanceValue_hasValueFrom_ValueDomainType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: InstanceValueInstanceValue_hasValueFrom_ValueDomainTypeValidTypeType[];
}
interface InstanceValueInstanceValue_hasValueFrom_ValueDomainType extends _InstanceValueInstanceValue_hasValueFrom_ValueDomainType { constructor: { new(): InstanceValueInstanceValue_hasValueFrom_ValueDomainType }; }

type InstanceValueInstanceValue_hasValueFrom_ValueDomainTypeValidTypeType = ("DescriptorValueDomain" | "ReferenceValueDomain" | "SentinelValueDomain" | "SubstantiveValueDomain" | "ValueDomain");
interface _InstanceValueInstanceValue_hasValueFrom_ValueDomainTypeValidTypeType extends Primitive._string { content: InstanceValueInstanceValue_hasValueFrom_ValueDomainTypeValidTypeType; }

interface _InstanceValueInstanceValue_isStoredIn_DataPointType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: InstanceValueInstanceValue_isStoredIn_DataPointTypeValidTypeType[];
}
interface InstanceValueInstanceValue_isStoredIn_DataPointType extends _InstanceValueInstanceValue_isStoredIn_DataPointType { constructor: { new(): InstanceValueInstanceValue_isStoredIn_DataPointType }; }

type InstanceValueInstanceValue_isStoredIn_DataPointTypeValidTypeType = "DataPoint";
interface _InstanceValueInstanceValue_isStoredIn_DataPointTypeValidTypeType extends Primitive._string { content: InstanceValueInstanceValue_isStoredIn_DataPointTypeValidTypeType; }

interface _InstanceValueInstanceValue_represents_ConceptualValueType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType: InstanceValueInstanceValue_represents_ConceptualValueTypeValidTypeType[];
}
interface InstanceValueInstanceValue_represents_ConceptualValueType extends _InstanceValueInstanceValue_represents_ConceptualValueType { constructor: { new(): InstanceValueInstanceValue_represents_ConceptualValueType }; }

type InstanceValueInstanceValue_represents_ConceptualValueTypeValidTypeType = ("ConceptualValue" | "DimensionalKeyDefinitionMember" | "KeyDefinitionMember");
interface _InstanceValueInstanceValue_represents_ConceptualValueTypeValidTypeType extends Primitive._string { content: InstanceValueInstanceValue_represents_ConceptualValueTypeValidTypeType; }

/** Definition
  * ==========
  * Use of a represented variable within a data set.
  *
  * Examples
  * ========
  * 1. Gender: Dan Gillman has gender <m, male>, Arofan Gregory has gender <m, male>, etc.
  * 2. Number of employees: Microsoft has 90,000 employees; IBM has 433,000 employees, etc.
  * 3. Endowment: Johns Hopkins has endowment of <3, $1,000,000 and above>, Yale has endowment of <3, $1,000,000 and above>, etc.
  * 4. A tornado near Winterset, Iowa, had a peak wind speed of 170 mph. Two instance variables of a person's height reference the same represented variable. This indicates that they are intended to: be measured with the same unit of measurement, have the same intended data type, have the same substantive value domain, use a sentinel value domain drawn from the same set of sentinel value domains, have the same sentinel (missing value) concepts, and draw their population from the same universe. In other words, the two instance variables should be comparable.
  *
  * Explanatory notes
  * =================
  * The instance variable class inherits all of the properties and relationships of the represented variable class and, in turn, the conceptual variable class. This means that an instance variable can be completely populated without the need to create an associated represented variable or conceptual variable. If, however, a user wishes to indicate that a particular instance variable is patterned after a particular represented variable or a particular conceptual variable that may be indicated by including a relationship to the represented variable and/or conceptual variable. Including these references is an important method of indicating that multiple instance variables have the same representation, measure the same concept, and are drawn from the same universe. If two instance variables of a person's height reference the same represented variable. This indicates that they are intended to: be measured with the same unit of measurement, have the same intended data type, have the same substantive value domain, use a sentinel value domain drawn from the same set of sentinel value domains, have the same sentinel (missing value) concepts, and draw their population from the same universe. In other words, the two instance variables should be comparable. The instance variable describes actual instances of data that have been collected. */
interface _InstanceVariable extends _RepresentedVariable {
	/** The data type of this variable. Supports the optional use of an external controlled vocabulary. */
	physicalDataType?: ControlledVocabularyEntry;
	/** Describes the application or technical system context in which the variable has been realized. Typically a statistical processing package or other processing environment. */
	platformType?: ControlledVocabularyEntry;
	/** Reference capturing provenance information. */
	source?: Reference;
	/** Immutable characteristic of the variable such as geographic designator, weight, temporal designation, etc. */
	variableFunction?: ControlledVocabularyEntry[];
}
export interface InstanceVariable extends _InstanceVariable { constructor: { new(): InstanceVariable }; }
export var InstanceVariable: { new(): InstanceVariable };

/** Definition
  * ============
  * Key value relationship for two or more logical records where the key is one or more equivalent instance variables and the value is a defined relationship or a relationship to a set value.
  *
  * Explanatory notes
  * ===================
  * The instance variable map identifies the variables which are used to connect two data sets, as when persons in one structure are associated with households in another structure. For logical records Household and Person, the keys are Household ID (HHID in Household Record), and Person ID (HHIDP in Person Record). Their value relationship is Equal, and set value is n.a. For each person in the person record, the value of HHIDP will be exactly the same as the value of HHID in the household record for the household to which they belong. (Correspondence type refers to the variables themselves rather than the value of the variables concerned.) In this context correspondence type will normally be set to ExactMatch. */
interface _InstanceVariableMap extends BaseType {
	/** Relationship between the source and target instance variables or to the setValue if provided. */
	comparison: ComparisonOperator;
	/** Describes the relationship between the source and target members using both controlled vocabularies and descriptive text. In this context the correspondence refers to the two instance variables, not their value. The relationship would normally be ExactMatch. */
	correspondence: CorrespondenceDefinition;
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	/** The source instance variable for the relationship. */
	InstanceVariableMap_hasSource_InstanceVariable: InstanceVariableMapInstanceVariableMap_hasSource_InstanceVariableType[];
	/** Target instance variables if a directional relation is used. */
	InstanceVariableMap_hasTarget_InstanceVariable?: InstanceVariableMapInstanceVariableMap_hasTarget_InstanceVariableType[];
	/** A fixed value for the key source Instance Variables. */
	setValue: string;
}
export interface InstanceVariableMap extends _InstanceVariableMap { constructor: { new(): InstanceVariableMap }; }
export var InstanceVariableMap: { new(): InstanceVariableMap };

interface _InstanceVariableMapInstanceVariableMap_hasSource_InstanceVariableType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: InstanceVariableMapInstanceVariableMap_hasSource_InstanceVariableTypeValidTypeType[];
}
interface InstanceVariableMapInstanceVariableMap_hasSource_InstanceVariableType extends _InstanceVariableMapInstanceVariableMap_hasSource_InstanceVariableType { constructor: { new(): InstanceVariableMapInstanceVariableMap_hasSource_InstanceVariableType }; }

type InstanceVariableMapInstanceVariableMap_hasSource_InstanceVariableTypeValidTypeType = "InstanceVariable";
interface _InstanceVariableMapInstanceVariableMap_hasSource_InstanceVariableTypeValidTypeType extends Primitive._string { content: InstanceVariableMapInstanceVariableMap_hasSource_InstanceVariableTypeValidTypeType; }

interface _InstanceVariableMapInstanceVariableMap_hasTarget_InstanceVariableType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: InstanceVariableMapInstanceVariableMap_hasTarget_InstanceVariableTypeValidTypeType[];
}
interface InstanceVariableMapInstanceVariableMap_hasTarget_InstanceVariableType extends _InstanceVariableMapInstanceVariableMap_hasTarget_InstanceVariableType { constructor: { new(): InstanceVariableMapInstanceVariableMap_hasTarget_InstanceVariableType }; }

type InstanceVariableMapInstanceVariableMap_hasTarget_InstanceVariableTypeValidTypeType = "InstanceVariable";
interface _InstanceVariableMapInstanceVariableMap_hasTarget_InstanceVariableTypeValidTypeType extends Primitive._string { content: InstanceVariableMapInstanceVariableMap_hasTarget_InstanceVariableTypeValidTypeType; }

/** Definition
  * ============
  * Provides a way of pointing to resources outside of the information described in the set of DDI-CDI metadata. */
interface _IntermediateAssociationReference extends _Reference {
	isAssociationReference: boolean;
}
export interface IntermediateAssociationReference extends _IntermediateAssociationReference { constructor: { new(): IntermediateAssociationReference }; }
export var IntermediateAssociationReference: { new(): IntermediateAssociationReference };

/** Definition
  * ============
  * An identifier whose scope of uniqueness is broader than the local archive. Common forms of an international identifier are ISBN, ISSN, DOI or similar designator. Provides both the value of the identifier and the agency who manages it.
  *
  * Explanatory notes
  * ===================
  * For use in annotation or other citation format. */
interface _InternationalIdentifier extends BaseType {
	/** An identifier as it should be listed for identification purposes. */
	identifierContent?: string;
	/** Set to True if Identifier is a URI. */
	isURI?: boolean;
	/** The identification of the Agency which assigns and manages the identifier, i.e., ISBN, ISSN, DOI, etc. */
	managingAgency?: ControlledVocabularyEntry;
}
export interface InternationalIdentifier extends _InternationalIdentifier { constructor: { new(): InternationalIdentifier }; }
export var InternationalIdentifier: { new(): InternationalIdentifier };

/** Definition
  * ==========
  * Persistent, globally unique object identifier aligned with ISO/IEC 11179-6:2015, Information technology - Metadata registries (MDR) - Part 6: Registration, Annex A, Identifiers based on ISO/IEC 6523, http://standards.iso.org/ittf/PubliclyAvailableStandards/c060342_ISO_IEC_11179-6_2015.zip.
  * The uniqueness of an InternationalRegistrationDataIdentifier (IRDI) is determined by the combination of the values of three identifying attributes. */
interface _InternationalRegistrationDataIdentifier extends BaseType {
	/** Identifier assigned to an Administered Item within a Registration Authority, hereafter called Data Identifier (DI). The DI is called 'id' in DDI-Codebook and DDI-Lifecycle. */
	dataIdentifier: string;
	/** Identifier assigned to a Registration Authority, hereafter called Registration Authority Identifier (RAI). The RAI is called 'agency' in DDI-Codebook and DDI-Lifecycle. */
	registrationAuthorityIdentifier: string;
	/** Identifier assigned to a version under which an Administered Item registration is submitted or updated hereafter called Version Identifier (VI). The VI is called "version" in DDI-Codebook and DDI-Lifecycle. */
	versionIdentifier: string;
}
export interface InternationalRegistrationDataIdentifier extends _InternationalRegistrationDataIdentifier { constructor: { new(): InternationalRegistrationDataIdentifier }; }
export var InternationalRegistrationDataIdentifier: { new(): InternationalRegistrationDataIdentifier };

/** Definition
  * ============
  * Packaging structure for multilingual versions of the same string content, represented by a set of LanguageString. Only one LanguageString per language/scope type is allowed. Where an element of this type (InternationalString) is repeatable, the expectation is that each repetition contains a different content, each of which can be expressed in multiple languages. */
interface _InternationalString extends BaseType {
	/** A non-formatted string of text with an attribute that designates the language of the text. Repeat this object to express the same content in another language. */
	languageSpecificString?: LanguageString[];
}
export interface InternationalString extends _InternationalString { constructor: { new(): InternationalString }; }
export var InternationalString: { new(): InternationalString };

/** Definition
  * ============
  * Collection of data instances that uniquely identify a collection of data points in a dataset. */
interface _Key extends BaseType {
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	Key_correspondsTo_Unit?: KeyKey_correspondsTo_UnitType;
	Key_correspondsTo_Universe?: KeyKey_correspondsTo_UniverseType;
	Key_has_KeyMember?: KeyKey_has_KeyMemberType[];
	Key_identifies_DataPoint: KeyKey_identifies_DataPointType[];
	Key_represents_KeyDefinition?: KeyKey_represents_KeyDefinitionType;
}
export interface Key extends _Key { constructor: { new(): Key }; }
export var Key: { new(): Key };

/** Definition
  * ============
  * Collection of concepts that uniquely defines a collection of data points in a dataset. */
interface _KeyDefinition extends BaseType {
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	KeyDefinition_correspondsTo_Unit?: KeyDefinitionKeyDefinition_correspondsTo_UnitType;
	KeyDefinition_correspondsTo_Universe?: KeyDefinitionKeyDefinition_correspondsTo_UniverseType;
	KeyDefinition_has_KeyDefinitionMember?: KeyDefinitionKeyDefinition_has_KeyDefinitionMemberType[];
}
export interface KeyDefinition extends _KeyDefinition { constructor: { new(): KeyDefinition }; }
export var KeyDefinition: { new(): KeyDefinition };

interface _KeyDefinitionKeyDefinition_correspondsTo_UnitType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: KeyDefinitionKeyDefinition_correspondsTo_UnitTypeValidTypeType[];
}
interface KeyDefinitionKeyDefinition_correspondsTo_UnitType extends _KeyDefinitionKeyDefinition_correspondsTo_UnitType { constructor: { new(): KeyDefinitionKeyDefinition_correspondsTo_UnitType }; }

type KeyDefinitionKeyDefinition_correspondsTo_UnitTypeValidTypeType = "Unit";
interface _KeyDefinitionKeyDefinition_correspondsTo_UnitTypeValidTypeType extends Primitive._string { content: KeyDefinitionKeyDefinition_correspondsTo_UnitTypeValidTypeType; }

interface _KeyDefinitionKeyDefinition_correspondsTo_UniverseType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: KeyDefinitionKeyDefinition_correspondsTo_UniverseTypeValidTypeType[];
}
interface KeyDefinitionKeyDefinition_correspondsTo_UniverseType extends _KeyDefinitionKeyDefinition_correspondsTo_UniverseType { constructor: { new(): KeyDefinitionKeyDefinition_correspondsTo_UniverseType }; }

type KeyDefinitionKeyDefinition_correspondsTo_UniverseTypeValidTypeType = ("Population" | "Universe");
interface _KeyDefinitionKeyDefinition_correspondsTo_UniverseTypeValidTypeType extends Primitive._string { content: KeyDefinitionKeyDefinition_correspondsTo_UniverseTypeValidTypeType; }

interface _KeyDefinitionKeyDefinition_has_KeyDefinitionMemberType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: KeyDefinitionKeyDefinition_has_KeyDefinitionMemberTypeValidTypeType[];
}
interface KeyDefinitionKeyDefinition_has_KeyDefinitionMemberType extends _KeyDefinitionKeyDefinition_has_KeyDefinitionMemberType { constructor: { new(): KeyDefinitionKeyDefinition_has_KeyDefinitionMemberType }; }

type KeyDefinitionKeyDefinition_has_KeyDefinitionMemberTypeValidTypeType = "KeyDefinitionMember";
interface _KeyDefinitionKeyDefinition_has_KeyDefinitionMemberTypeValidTypeType extends Primitive._string { content: KeyDefinitionKeyDefinition_has_KeyDefinitionMemberTypeValidTypeType; }

/** Definition
  * ============
  * Single concept that is part of the structure of a key definition. */
interface _KeyDefinitionMember extends _ConceptualValue {}
export interface KeyDefinitionMember extends _KeyDefinitionMember { constructor: { new(): KeyDefinitionMember }; }
export var KeyDefinitionMember: { new(): KeyDefinitionMember };

interface _KeyKey_correspondsTo_UnitType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: KeyKey_correspondsTo_UnitTypeValidTypeType[];
}
interface KeyKey_correspondsTo_UnitType extends _KeyKey_correspondsTo_UnitType { constructor: { new(): KeyKey_correspondsTo_UnitType }; }

type KeyKey_correspondsTo_UnitTypeValidTypeType = "Unit";
interface _KeyKey_correspondsTo_UnitTypeValidTypeType extends Primitive._string { content: KeyKey_correspondsTo_UnitTypeValidTypeType; }

interface _KeyKey_correspondsTo_UniverseType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: KeyKey_correspondsTo_UniverseTypeValidTypeType[];
}
interface KeyKey_correspondsTo_UniverseType extends _KeyKey_correspondsTo_UniverseType { constructor: { new(): KeyKey_correspondsTo_UniverseType }; }

type KeyKey_correspondsTo_UniverseTypeValidTypeType = ("Population" | "Universe");
interface _KeyKey_correspondsTo_UniverseTypeValidTypeType extends Primitive._string { content: KeyKey_correspondsTo_UniverseTypeValidTypeType; }

interface _KeyKey_has_KeyMemberType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: KeyKey_has_KeyMemberTypeValidTypeType[];
}
interface KeyKey_has_KeyMemberType extends _KeyKey_has_KeyMemberType { constructor: { new(): KeyKey_has_KeyMemberType }; }

type KeyKey_has_KeyMemberTypeValidTypeType = ("Descriptor" | "DimensionalKeyMember" | "KeyMember" | "LongMainKeyMember" | "MainKeyMember" | "WideKeyMember");
interface _KeyKey_has_KeyMemberTypeValidTypeType extends Primitive._string { content: KeyKey_has_KeyMemberTypeValidTypeType; }

interface _KeyKey_identifies_DataPointType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: KeyKey_identifies_DataPointTypeValidTypeType[];
}
interface KeyKey_identifies_DataPointType extends _KeyKey_identifies_DataPointType { constructor: { new(): KeyKey_identifies_DataPointType }; }

type KeyKey_identifies_DataPointTypeValidTypeType = "DataPoint";
interface _KeyKey_identifies_DataPointTypeValidTypeType extends Primitive._string { content: KeyKey_identifies_DataPointTypeValidTypeType; }

interface _KeyKey_represents_KeyDefinitionType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType: KeyKey_represents_KeyDefinitionTypeValidTypeType[];
}
interface KeyKey_represents_KeyDefinitionType extends _KeyKey_represents_KeyDefinitionType { constructor: { new(): KeyKey_represents_KeyDefinitionType }; }

type KeyKey_represents_KeyDefinitionTypeValidTypeType = ("DimensionalKeyDefinition" | "KeyDefinition");
interface _KeyKey_represents_KeyDefinitionTypeValidTypeType extends Primitive._string { content: KeyKey_represents_KeyDefinitionTypeValidTypeType; }

/** Definition
  * ============
  * Single data instance that is part of a key. */
interface _KeyMember extends _InstanceValue {
	KeyMember_isBasedOn_DataStructureComponent?: KeyMemberKeyMember_isBasedOn_DataStructureComponentType[];
}
export interface KeyMember extends _KeyMember { constructor: { new(): KeyMember }; }
export var KeyMember: { new(): KeyMember };

interface _KeyMemberKeyMember_isBasedOn_DataStructureComponentType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: KeyMemberKeyMember_isBasedOn_DataStructureComponentTypeValidTypeType[];
}
interface KeyMemberKeyMember_isBasedOn_DataStructureComponentType extends _KeyMemberKeyMember_isBasedOn_DataStructureComponentType { constructor: { new(): KeyMemberKeyMember_isBasedOn_DataStructureComponentType }; }

type KeyMemberKeyMember_isBasedOn_DataStructureComponentTypeValidTypeType = ("AttributeComponent" | "ContextualComponent" | "DataStructure" | "DataStructureComponent" | "DimensionComponent" | "DimensionalDataStructure" | "IdentifierComponent" | "KeyValueStructure" | "LongDataStructure" | "MeasureComponent" | "QualifiedMeasure" | "SyntheticIdComponent" | "VariableDescriptorComponent" | "VariableValueComponent" | "WideDataStructure");
interface _KeyMemberKeyMember_isBasedOn_DataStructureComponentTypeValidTypeType extends Primitive._string { content: KeyMemberKeyMember_isBasedOn_DataStructureComponentTypeValidTypeType; }

/** Definition
  * ============
  * Organized collection of key-value data. It is structured by a key value structure.
  *
  * Examples
  * ==========
  * A unit key-value datastore where each instance key corresponds to a data point capturing a different characteristic of a unit.
  *
  * Explanatory notes
  * ===================
  * A key-value datastore is just a collection of key-value pairs, i.e. instance keys and reference values.
  * Each instance key encodes all relevant information about the context, the unit of interest and the variable associated with the reference value of a given data point. */
interface _KeyValueDataStore extends _DataSet {}
export interface KeyValueDataStore extends _KeyValueDataStore { constructor: { new(): KeyValueDataStore }; }
export var KeyValueDataStore: { new(): KeyValueDataStore };

/** Definition
  * ============
  * Structure of a key-value datastore (organized collection of key-value data). It is described by identifier, contextual, synthetic id, dimension, variable descriptor and variable value components.
  *
  * Examples
  * ==========
  * The structure described by [Income distribution, Unit id, Period, Income] where Income distribution is the contextual component, Unit id identifies a statistical unit, period is a effective period and Income is the variable of interest. */
interface _KeyValueStructure extends _DataStructure {}
export interface KeyValueStructure extends _KeyValueStructure { constructor: { new(): KeyValueStructure }; }
export var KeyValueStructure: { new(): KeyValueStructure };

/** Definition
  * ============
  * A structured display label. Label provides display content of a fully human readable display for the identification of the object. */
interface _LabelForDisplay extends _InternationalString {
	/** Indicate the locality specification for content that is specific to a geographic area. May be a country code, sub-country code, or area name. */
	locationVariant?: ControlledVocabularyEntry;
	/** A positive integer indicating the maximum number of characters in the label. */
	maxLength?: number;
	/** Allows for the specification of a starting date and ending date for the period that this label is valid. */
	validDates?: DateRange;
}
export interface LabelForDisplay extends _LabelForDisplay { constructor: { new(): LabelForDisplay }; }
export var LabelForDisplay: { new(): LabelForDisplay };

/** Definition
  * ============
  * A language/scope-type specific variant of an InternationalString. It contains the following attributes: language to designate the language, isTranslated with a default value of false to designate if an object is a translation of another language, isTranslatable with a default value of true to designate if the content can be translated, translationSourceLanguage to indicate the source languages used in creating this translation, translationDate, and scope which can be used to define intended audience or use such as internal, external, etc. */
interface _LanguageString extends BaseType {
	/** The content of the string. */
	content: string;
	/** Indicates whether content is translatable (True) or not (False). An example of something that is not translatable would be a MNEMONIC of an object or a number. */
	isTranslatable?: boolean;
	/** Indicates whether content is a translation (True) or an original (False). */
	isTranslated?: boolean;
	/** Supports specification of scope for the contained content. Use with the language specification to filter application of content. */
	scope?: string;
	/** The structure type used. Examples are HTML or restructured text. */
	structureUsed?: ControlledVocabularyEntry;
	/** The date the content was translated. Provision of translation date allows user to verify if translation was available during data collection or other time linked activity. */
	translationDate?: Date;
	/** List the language code of the source. Repeat of multiple language sources are used. */
	translationSourceLanguage?: string[];
}
export interface LanguageString extends _LanguageString { constructor: { new(): LanguageString }; }
export var LanguageString: { new(): LanguageString };

/** Definition
  * ============
  * Set of all classification items the same number of relationships from the root (or top) classification item.
  *
  * Examples
  * ==========
  * ISCO-08: index='1' label of associated category 'Major', index='2' label of associated category 'Sub-Major',  index='3' label of associated category 'Minor',
  *
  * Explanatory notes
  * ===================
  * Provides level information for the members of the level structure. levelNumber provides the level number which may or may not be associated with a category which defines level. */
interface _Level extends BaseType {
	/** A human-readable display label for the object. Supports the use of multiple languages. Repeat for labels with different content, for example, labels with differing length limitations. */
	displayLabel?: LabelForDisplay[];
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	Level_groups_ClassificationItem?: LevelLevel_groups_ClassificationItemType[];
	/** A concept or concept sub-type which describes the level. */
	Level_isDefinedBy_Concept?: LevelLevel_isDefinedBy_ConceptType;
	/** Provides an association between a level number and optional concept which defines it within an ordered array. Use is required. */
	levelNumber: number;
}
export interface Level extends _Level { constructor: { new(): Level }; }
export var Level: { new(): Level };

interface _LevelLevel_groups_ClassificationItemType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: LevelLevel_groups_ClassificationItemTypeValidTypeType[];
}
interface LevelLevel_groups_ClassificationItemType extends _LevelLevel_groups_ClassificationItemType { constructor: { new(): LevelLevel_groups_ClassificationItemType }; }

type LevelLevel_groups_ClassificationItemTypeValidTypeType = "ClassificationItem";
interface _LevelLevel_groups_ClassificationItemTypeValidTypeType extends Primitive._string { content: LevelLevel_groups_ClassificationItemTypeValidTypeType; }

interface _LevelLevel_isDefinedBy_ConceptType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: LevelLevel_isDefinedBy_ConceptTypeValidTypeType[];
}
interface LevelLevel_isDefinedBy_ConceptType extends _LevelLevel_isDefinedBy_ConceptType { constructor: { new(): LevelLevel_isDefinedBy_ConceptType }; }

type LevelLevel_isDefinedBy_ConceptTypeValidTypeType = ("Category" | "Concept" | "ConceptualValue" | "ConceptualVariable" | "DescriptorVariable" | "DimensionalKeyDefinitionMember" | "InstanceVariable" | "KeyDefinitionMember" | "Population" | "ReferenceVariable" | "RepresentedVariable" | "UnitType" | "Universe");
interface _LevelLevel_isDefinedBy_ConceptTypeValidTypeType extends Primitive._string { content: LevelLevel_isDefinedBy_ConceptTypeValidTypeType; }

/** Definition
  * ============
  * Nesting structure of a hierarchical collection.
  *
  * Examples
  * ==========
  * The International Standard Classification of Occupations (ISCO-08: https://www.ilo.org/public/english/bureau/stat/isco/isco08/) Major, Sub-Major, and Minor or the North American Industry Classification System (NAICS: https://www.census.gov/naics/) 2 digit sector codes, 3 digit subsector code list, 4 digit industry group code list, and 5 digit industry code list.
  *
  * Explanatory notes
  * ===================
  * The levels within the structure begin at the root level '1' and continue as an ordered array through each level of nesting. Levels are used to organize a hierarchy. Usually, a hierarchy contains one root member at the top, though it could contain several. These are the first level. All members directly related to those  in the first level compose the second level. The third and subsequent levels are defined similarly.  A level often is associated with a concept, which defines it. These correspond to kinds of aggregates. For example, in the US Standard Occupational Classification (2010), the level below the top is called Major Occupation Groups, and the next level is called Minor Occupational Groups. These ideas convey the structure. In particular, Health Care Practitioners (a major group) can be broken into Chiropractors, Dentists, Physicians, Vets, Therapists, etc. (minor groups) The categories in the nodes at the lower level aggregate to the category in node above them.  "Classification schemes are frequently organized in nested levels of increasing detail. ISCO-08, for example, has four levels: at the top level are ten major groups, each of which contain sub-major groups, which in turn are subdivided in minor groups, which contain unit groups. Even when a classification is not structured in levels ("flat classification"), the usual convention, which is adopted here, is to consider that it contains one unique level." (From the W3C Simple Knowlegde Organization System: http://rdf-vocabulary.ddialliance.org/xkos.html#) Individual classification items organized in a hierarchy may be associated with a specific level. */
interface _LevelStructure extends BaseType {
	/** Bundles the information useful for a data catalog entry.
	  *
	  * Examples would be creator, contributor, title, copyright, embargo, and license information
	  *
	  * A set of information useful for attribution, data discovery, and access.
	  * This is information that is tied to the identity of the object. If this information changes the version of the associated object changes. */
	catalogDetails?: CatalogDetails;
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	LevelStructure_has_Level?: LevelStructureLevelStructure_has_LevelType[];
	/** Human understandable name (liguistic signifier, word, phrase, or mnemonic). May follow ISO/IEC 11179-5 naming principles, and have context provided to specify usage. */
	name?: ObjectName[];
	/** Explanation of the ways in which the object is employed. */
	usage?: InternationalString;
	/** The period for which the level object is valid, expressed as a start and end date (supports both ISO-standard and non-ISO date formats). */
	validDateRange?: DateRange;
}
export interface LevelStructure extends _LevelStructure { constructor: { new(): LevelStructure }; }
export var LevelStructure: { new(): LevelStructure };

interface _LevelStructureLevelStructure_has_LevelType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: LevelStructureLevelStructure_has_LevelTypeValidTypeType[];
}
interface LevelStructureLevelStructure_has_LevelType extends _LevelStructureLevelStructure_has_LevelType { constructor: { new(): LevelStructureLevelStructure_has_LevelType }; }

type LevelStructureLevelStructure_has_LevelTypeValidTypeType = "Level";
interface _LevelStructureLevelStructure_has_LevelTypeValidTypeType extends Primitive._string { content: LevelStructureLevelStructure_has_LevelTypeValidTypeType; }

/** Definition
  * ============
  * Information about any relevant license.
  *
  * Examples
  * ==========
  * Licensed under Creative Commons Attribution 2.0 Generic (CC BY 2.0). */
interface _LicenseInformation extends BaseType {
	/** Information on whom to contact for details on licensing. */
	contact?: ContactInformation[];
	/** A description of licensing terms. */
	description?: InternationalString[];
	/** Points to a description of an agent with information about, or responsible for licensing of the object. */
	licenseAgent?: AgentInRole[];
	/** Points to published license terms, such as to a specific Creative Commons license. */
	licenseReference?: Reference[];
}
export interface LicenseInformation extends _LicenseInformation { constructor: { new(): LicenseInformation }; }
export var LicenseInformation: { new(): LicenseInformation };

/** Definition
  * ============
  * Collection of instance variables. */
interface _LogicalRecord extends BaseType {
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	LogicalRecord_has_InstanceVariable?: LogicalRecordLogicalRecord_has_InstanceVariableType[];
	/** The conceptual basis for the collection of members. */
	LogicalRecord_isDefinedBy_Concept?: LogicalRecordLogicalRecord_isDefinedBy_ConceptType[];
	LogicalRecord_organizes_DataSet?: LogicalRecordLogicalRecord_organizes_DataSetType[];
}
export interface LogicalRecord extends _LogicalRecord { constructor: { new(): LogicalRecord }; }
export var LogicalRecord: { new(): LogicalRecord };

interface _LogicalRecordLogicalRecord_has_InstanceVariableType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: LogicalRecordLogicalRecord_has_InstanceVariableTypeValidTypeType[];
}
interface LogicalRecordLogicalRecord_has_InstanceVariableType extends _LogicalRecordLogicalRecord_has_InstanceVariableType { constructor: { new(): LogicalRecordLogicalRecord_has_InstanceVariableType }; }

type LogicalRecordLogicalRecord_has_InstanceVariableTypeValidTypeType = "InstanceVariable";
interface _LogicalRecordLogicalRecord_has_InstanceVariableTypeValidTypeType extends Primitive._string { content: LogicalRecordLogicalRecord_has_InstanceVariableTypeValidTypeType; }

interface _LogicalRecordLogicalRecord_isDefinedBy_ConceptType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: LogicalRecordLogicalRecord_isDefinedBy_ConceptTypeValidTypeType[];
}
interface LogicalRecordLogicalRecord_isDefinedBy_ConceptType extends _LogicalRecordLogicalRecord_isDefinedBy_ConceptType { constructor: { new(): LogicalRecordLogicalRecord_isDefinedBy_ConceptType }; }

type LogicalRecordLogicalRecord_isDefinedBy_ConceptTypeValidTypeType = ("Category" | "Concept" | "ConceptualValue" | "ConceptualVariable" | "DescriptorVariable" | "DimensionalKeyDefinitionMember" | "InstanceVariable" | "KeyDefinitionMember" | "Population" | "ReferenceVariable" | "RepresentedVariable" | "UnitType" | "Universe");
interface _LogicalRecordLogicalRecord_isDefinedBy_ConceptTypeValidTypeType extends Primitive._string { content: LogicalRecordLogicalRecord_isDefinedBy_ConceptTypeValidTypeType; }

interface _LogicalRecordLogicalRecord_organizes_DataSetType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: LogicalRecordLogicalRecord_organizes_DataSetTypeValidTypeType[];
}
interface LogicalRecordLogicalRecord_organizes_DataSetType extends _LogicalRecordLogicalRecord_organizes_DataSetType { constructor: { new(): LogicalRecordLogicalRecord_organizes_DataSetType }; }

type LogicalRecordLogicalRecord_organizes_DataSetTypeValidTypeType = ("DataSet" | "DimensionalDataSet" | "KeyValueDataStore" | "LongDataSet" | "WideDataSet");
interface _LogicalRecordLogicalRecord_organizes_DataSetTypeValidTypeType extends Primitive._string { content: LogicalRecordLogicalRecord_organizes_DataSetTypeValidTypeType; }

/** Definition
  * ============
  * Assigns a position of the logical record within the data store. */
interface _LogicalRecordPosition extends BaseType {
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	/** Logical record position indexes a logical record. */
	LogicalRecordPosition_indexes_LogicalRecord: LogicalRecordPositionLogicalRecordPosition_indexes_LogicalRecordType;
	/** Index value of the member in an ordered array. */
	value: number;
}
export interface LogicalRecordPosition extends _LogicalRecordPosition { constructor: { new(): LogicalRecordPosition }; }
export var LogicalRecordPosition: { new(): LogicalRecordPosition };

interface _LogicalRecordPositionLogicalRecordPosition_indexes_LogicalRecordType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: LogicalRecordPositionLogicalRecordPosition_indexes_LogicalRecordTypeValidTypeType[];
}
interface LogicalRecordPositionLogicalRecordPosition_indexes_LogicalRecordType extends _LogicalRecordPositionLogicalRecordPosition_indexes_LogicalRecordType { constructor: { new(): LogicalRecordPositionLogicalRecordPosition_indexes_LogicalRecordType }; }

type LogicalRecordPositionLogicalRecordPosition_indexes_LogicalRecordTypeValidTypeType = "LogicalRecord";
interface _LogicalRecordPositionLogicalRecordPosition_indexes_LogicalRecordTypeValidTypeType extends Primitive._string { content: LogicalRecordPositionLogicalRecordPosition_indexes_LogicalRecordTypeValidTypeType; }

/** Definition
  * ============
  * Relationships between logical records. */
interface _LogicalRecordRelationship extends BaseType {
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	LogicalRecordRelationship_hasSource_LogicalRecord?: LogicalRecordRelationshipLogicalRecordRelationship_hasSource_LogicalRecordType[];
	/** Note that this can be realized as a collection to support tuples. */
	LogicalRecordRelationship_hasTarget_LogicalRecord?: LogicalRecordRelationshipLogicalRecordRelationship_hasTarget_LogicalRecordType[];
	/** Specifies the semantics of the object in reference to a vocabulary, ontology, etc. */
	semantics?: ControlledVocabularyEntry;
}
export interface LogicalRecordRelationship extends _LogicalRecordRelationship { constructor: { new(): LogicalRecordRelationship }; }
export var LogicalRecordRelationship: { new(): LogicalRecordRelationship };

interface _LogicalRecordRelationshipLogicalRecordRelationship_hasSource_LogicalRecordType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: LogicalRecordRelationshipLogicalRecordRelationship_hasSource_LogicalRecordTypeValidTypeType[];
}
interface LogicalRecordRelationshipLogicalRecordRelationship_hasSource_LogicalRecordType extends _LogicalRecordRelationshipLogicalRecordRelationship_hasSource_LogicalRecordType { constructor: { new(): LogicalRecordRelationshipLogicalRecordRelationship_hasSource_LogicalRecordType }; }

type LogicalRecordRelationshipLogicalRecordRelationship_hasSource_LogicalRecordTypeValidTypeType = "LogicalRecord";
interface _LogicalRecordRelationshipLogicalRecordRelationship_hasSource_LogicalRecordTypeValidTypeType extends Primitive._string { content: LogicalRecordRelationshipLogicalRecordRelationship_hasSource_LogicalRecordTypeValidTypeType; }

interface _LogicalRecordRelationshipLogicalRecordRelationship_hasTarget_LogicalRecordType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: LogicalRecordRelationshipLogicalRecordRelationship_hasTarget_LogicalRecordTypeValidTypeType[];
}
interface LogicalRecordRelationshipLogicalRecordRelationship_hasTarget_LogicalRecordType extends _LogicalRecordRelationshipLogicalRecordRelationship_hasTarget_LogicalRecordType { constructor: { new(): LogicalRecordRelationshipLogicalRecordRelationship_hasTarget_LogicalRecordType }; }

type LogicalRecordRelationshipLogicalRecordRelationship_hasTarget_LogicalRecordTypeValidTypeType = "LogicalRecord";
interface _LogicalRecordRelationshipLogicalRecordRelationship_hasTarget_LogicalRecordTypeValidTypeType extends Primitive._string { content: LogicalRecordRelationshipLogicalRecordRelationship_hasTarget_LogicalRecordTypeValidTypeType; }

/** Definition
  * ============
  * Structuring of relationships between logical records in a data store.
  *
  * Examples
  * ==========
  * A data store with a Household, Family, and Person logical record type. Allows for describing parent/child, whole/part, or other relationships as appropriate. */
interface _LogicalRecordRelationStructure extends BaseType {
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	/** LogicalRecordRelationStructure has zero to many LogicalRecordRelationships. */
	LogicalRecordRelationStructure_has_LogicalRecordRelationship?: LogicalRecordRelationStructureLogicalRecordRelationStructure_has_LogicalRecordRelationshipType[];
	LogicalRecordRelationStructure_structures_DataStore?: LogicalRecordRelationStructureLogicalRecordRelationStructure_structures_DataStoreType[];
	/** Human understandable name (liguistic signifier, word, phrase, or mnemonic). May follow ISO/IEC 11179-5 naming principles, and have context provided to specify usage. */
	name?: ObjectName[];
	/** Intent or reason for the object/the description of the object. */
	purpose?: InternationalString;
	/** Specifies the semantics of the object in reference to a vocabulary, ontology, etc. */
	semantics?: ControlledVocabularyEntry;
	/** Provides information on reflexivity, transitivity, and symmetry of relationship using a descriptive term from an enumerated list. Use if all relations within this relation structure are of the same specification. */
	specification?: StructureSpecification;
	/** Indicates the form of the associations among members of the collection. Specifies the way in which constituent parts are interrelated or arranged. */
	topology?: ControlledVocabularyEntry;
	/** Indicates whether the related collections are comprehensive in terms of their coverage. */
	totality?: StructureExtent;
}
export interface LogicalRecordRelationStructure extends _LogicalRecordRelationStructure { constructor: { new(): LogicalRecordRelationStructure }; }
export var LogicalRecordRelationStructure: { new(): LogicalRecordRelationStructure };

interface _LogicalRecordRelationStructureLogicalRecordRelationStructure_has_LogicalRecordRelationshipType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType: LogicalRecordRelationStructureLogicalRecordRelationStructure_has_LogicalRecordRelationshipTypeValidTypeType[];
}
interface LogicalRecordRelationStructureLogicalRecordRelationStructure_has_LogicalRecordRelationshipType extends _LogicalRecordRelationStructureLogicalRecordRelationStructure_has_LogicalRecordRelationshipType { constructor: { new(): LogicalRecordRelationStructureLogicalRecordRelationStructure_has_LogicalRecordRelationshipType }; }

type LogicalRecordRelationStructureLogicalRecordRelationStructure_has_LogicalRecordRelationshipTypeValidTypeType = "LogicalRecordRelationship";
interface _LogicalRecordRelationStructureLogicalRecordRelationStructure_has_LogicalRecordRelationshipTypeValidTypeType extends Primitive._string { content: LogicalRecordRelationStructureLogicalRecordRelationStructure_has_LogicalRecordRelationshipTypeValidTypeType; }

interface _LogicalRecordRelationStructureLogicalRecordRelationStructure_structures_DataStoreType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: LogicalRecordRelationStructureLogicalRecordRelationStructure_structures_DataStoreTypeValidTypeType[];
}
interface LogicalRecordRelationStructureLogicalRecordRelationStructure_structures_DataStoreType extends _LogicalRecordRelationStructureLogicalRecordRelationStructure_structures_DataStoreType { constructor: { new(): LogicalRecordRelationStructureLogicalRecordRelationStructure_structures_DataStoreType }; }

type LogicalRecordRelationStructureLogicalRecordRelationStructure_structures_DataStoreTypeValidTypeType = "DataStore";
interface _LogicalRecordRelationStructureLogicalRecordRelationStructure_structures_DataStoreTypeValidTypeType extends Primitive._string { content: LogicalRecordRelationStructureLogicalRecordRelationStructure_structures_DataStoreTypeValidTypeType; }

/** Definition
  * ============
  * Organized collection of long data. It is structured by a long data structure.
  *
  * Examples
  * ==========
  * A unit dataset where each row corresponds to a set of data points capturing different characteristics of a unit, some of which can be transposed into variable descriptor and variable value components. */
interface _LongDataSet extends _DataSet {}
export interface LongDataSet extends _LongDataSet { constructor: { new(): LongDataSet }; }
export var LongDataSet: { new(): LongDataSet };

/** Definition
  * ============
  * Structure of a long dataset (organized collection of long data). It is described by identifier, measure, attribute, variable descriptor and variable value components.
  *
  * Examples
  * ==========
  * The structure described by [Unit id, Income, Province, Variable name, Variable value] where Unit id identifies a statistical unit, Income and Province are two instance variables capturing characteristics, and other instance variables are represented by Variable name (a variable descriptor component) and Variable Value (a variable value component). */
interface _LongDataStructure extends _DataStructure {}
export interface LongDataStructure extends _LongDataStructure { constructor: { new(): LongDataStructure }; }
export var LongDataStructure: { new(): LongDataStructure };

/** Definition
  * ============
  * Collection of data instances that uniquely identify a collection of data points in a long dataset.
  *
  * Examples
  * ==========
  * Collection containing the single "K1Z1C1" string in a long dataset where rows are identified by postal code representations. */
interface _LongKey extends _Key {}
export interface LongKey extends _LongKey { constructor: { new(): LongKey }; }
export var LongKey: { new(): LongKey };

/** Definition
  * ============
  * Single data instance that is part of a long key.
  *
  * Examples
  * ==========
  * The "K1Z1C1" string in a long dataset where rows are identified by postal code representations. */
interface _LongMainKeyMember extends _KeyMember {}
export interface LongMainKeyMember extends _LongMainKeyMember { constructor: { new(): LongMainKeyMember }; }
export var LongMainKeyMember: { new(): LongMainKeyMember };

/** Definition
  * ============
  * Mechanism or computer program used to perform an act.
  *
  * Examples
  * ==========
  * SAS program, photocopier
  *
  * Explanatory notes
  * ===================
  * May be used as a target to identify the agent who performed an action. Used to define hardware or software that act as agents in data capture, data processing, or other related actions. */
interface _Machine extends _Agent {
	/** Location of the machine for the purpose of access. */
	accessLocation?: AccessLocation;
	/** The business function of the machine according to a classification or typology. */
	function?: ControlledVocabularyEntry[];
	/** Reference to the type of the machine interface according to a classification or typology. */
	machineInterface?: ControlledVocabularyEntry[];
	/** Human understandable name (liguistic signifier, word, phrase, or mnemonic). May follow ISO/IEC 11179-5 naming principles, and have context provided to specify usage. */
	name?: ObjectName[];
	/** Contact information for the owner/operator including location specification, address, URL, phone numbers, and other means of communication access. Sets of information can be repeated and date-stamped. */
	ownerOperatorContact?: ContactInformation;
	/** Describes the type of non-human actor (e.g., software, hardware, web service, etc.). */
	typeOfMachine?: ControlledVocabularyEntry;
}
export interface Machine extends _Machine { constructor: { new(): Machine }; }
export var Machine: { new(): Machine };

/** Definition
  * ============
  * Identifies the unit of interest, either a statistical unit or a population, via identifier or dimension components, respectively, plus an optional contextual component.
  * If neither identifier nor dimension components are present, then a synthetic id component is used.
  *
  * Examples
  * ==========
  * The string "income_distribution:male:Ontario:married" in a dimensional key-value datastore, where instance key members are defined by context plus Sex, Province and Marital Status dimensions. */
interface _MainKeyMember extends _KeyMember {
	MainKeyMember_hasValueFrom_SubstantiveValueDomain?: MainKeyMemberMainKeyMember_hasValueFrom_SubstantiveValueDomainType;
}
export interface MainKeyMember extends _MainKeyMember { constructor: { new(): MainKeyMember }; }
export var MainKeyMember: { new(): MainKeyMember };

interface _MainKeyMemberMainKeyMember_hasValueFrom_SubstantiveValueDomainType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: MainKeyMemberMainKeyMember_hasValueFrom_SubstantiveValueDomainTypeValidTypeType[];
}
interface MainKeyMemberMainKeyMember_hasValueFrom_SubstantiveValueDomainType extends _MainKeyMemberMainKeyMember_hasValueFrom_SubstantiveValueDomainType { constructor: { new(): MainKeyMemberMainKeyMember_hasValueFrom_SubstantiveValueDomainType }; }

type MainKeyMemberMainKeyMember_hasValueFrom_SubstantiveValueDomainTypeValidTypeType = ("DescriptorValueDomain" | "SubstantiveValueDomain");
interface _MainKeyMemberMainKeyMember_hasValueFrom_SubstantiveValueDomainTypeValidTypeType extends Primitive._string { content: MainKeyMemberMainKeyMember_hasValueFrom_SubstantiveValueDomainTypeValidTypeType; }

/** Definition
  * ============
  * Supports mapping comparative relationships by type of match. Not used for causative, sequential, temporal or special relations. */
export type MatchingCriterion = ("CloseMatch" | "Disjoint" | "ExactMatch");
interface _MatchingCriterion extends Primitive._string { content: MatchingCriterion; }

/** Definition
  * ============
  * Role given to a represented variable in the context of a data structure to hold the observed/derived values.
  *
  * Examples
  * ==========
  * Height of a person in a wide or long dataset or number of citizens in a country in a dataset for multiple countries (dimensional dataset). */
interface _MeasureComponent extends _DataStructureComponent {
	/** Human understandable name (liguistic signifier, word, phrase, or mnemonic). May follow ISO/IEC 11179-5 naming principles, and have context provided to specify usage. */
	name?: ObjectName[];
}
export interface MeasureComponent extends _MeasureComponent { constructor: { new(): MeasureComponent }; }
export var MeasureComponent: { new(): MeasureComponent };

/** Definition
  * ============
  * A vocabulary for the specification of how much of a collection is referenced. All, some or none of the collection may be indicated. */
export type MemberRelationshipScope = ("All" | "None" | "Some");
interface _MemberRelationshipScope extends Primitive._string { content: MemberRelationshipScope; }

/** Definition
  * ==========
  * Attributes for the model identification with constant values. */
interface _ModelIdentification extends BaseType {
	/** Acronym of the model. */
	acronym: string;
	/** Language of the model. */
	language: string;
	/** Major version number of the model. */
	majorVersion: number;
	/** Minor version number of the model. */
	minorVersion: number;
	/** Subtitle of the model. */
	subtitle: string;
	/** Title of the model. */
	title: string;
	/** URI of the specification. */
	uri: string;
}
export interface ModelIdentification extends _ModelIdentification { constructor: { new(): ModelIdentification }; }
export var ModelIdentification: { new(): ModelIdentification };

/** Definition
  * ============
  * A unique set of attributes, not conforming to the DDI identifier structure nor structured as a URI, used to identify some entity. */
interface _NonDdiIdentifier extends BaseType {
	/** The authority which maintains the identification scheme. */
	managingAgency?: string;
	/** The scheme of identifier, as distinct from a URI or a DDI-conforming identifier. */
	type: string;
	/** The identifier, structured according to the specified type. */
	value: string;
	/** The version of the object being identified, according to the versioning system provided by the identified scheme. */
	version?: string;
}
export interface NonDdiIdentifier extends _NonDdiIdentifier { constructor: { new(): NonDdiIdentifier }; }
export var NonDdiIdentifier: { new(): NonDdiIdentifier };

/** Definition
  * ============
  * Non-deterministic control logic is a subtype of control logic. Non-deterministic (or declarative) control logic is constraint- and/or rule-based.
  *
  * Examples
  * ==========
  * Rule based scheduling is declarative control logic.
  *
  * Explanatory notes
  * ===================
  * Unlike DDI Lifecycle, DDI-CDI describes non-deterministic activity and step controls. */
interface _NonDeterministicDeclarative extends _ControlLogic {}
export interface NonDeterministicDeclarative extends _NonDeterministicDeclarative { constructor: { new(): NonDeterministicDeclarative }; }
export var NonDeterministicDeclarative: { new(): NonDeterministicDeclarative };

/** Definition
  * ============
  * Used to preserve an historical date, formatted in a non-ISO fashion. */
interface _NonIsoDate extends BaseType {
	/** Specifies the type of calendar used (e.g., Gregorian, Julian, Jewish). */
	calendar?: ControlledVocabularyEntry;
	/** This is the date expressed in a non-ISO compliant structure. Primarily used to retain legacy content or to express non-Gregorian calendar dates. */
	dateContent: string;
	/** Indicate the structure of the date provided in NonISODate. For example if the NonISODate contained 4/1/2000 the Historical Date Format would be mm/dd/yyyy. The use of a controlled vocabulary is strongly recommended to support interoperability. */
	nonIsoDateFormat?: ControlledVocabularyEntry;
}
export interface NonIsoDate extends _NonIsoDate { constructor: { new(): NonIsoDate }; }
export var NonIsoDate: { new(): NonIsoDate };

/** Definition
  * ============
  * Representation of a category in the context of a code or a classification item, as opposed of the corresponding instance value which would appear when used in a dataset.
  *
  * Examples
  * ==========
  * The number "334" used as a code for the "Computer and electronic product manufacturing" category in the North American Industry Classification System (NAICS). */
interface _Notation extends BaseType {
	/** The actual content of this value as a string. */
	content?: TypedString;
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	/** Notation represents zero to many categories. */
	Notation_represents_Category?: NotationNotation_represents_CategoryType[];
	/** The usual setting "collapse" states that leading and trailing white space will be removed and multiple adjacent white spaces will be treated as a single white space. When setting to "replace" all occurrences of #x9 (tab), #xA (line feed) and #xD (carriage return) are replaced with #x20 (space) but leading and trailing spaces will be retained. If the existence of any of these white spaces is critical to the understanding of the content, change the value of this attribute to "preserve". */
	whiteSpace?: WhiteSpaceRule;
}
export interface Notation extends _Notation { constructor: { new(): Notation }; }
export var Notation: { new(): Notation };

interface _NotationNotation_represents_CategoryType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType: NotationNotation_represents_CategoryTypeValidTypeType[];
}
interface NotationNotation_represents_CategoryType extends _NotationNotation_represents_CategoryType { constructor: { new(): NotationNotation_represents_CategoryType }; }

type NotationNotation_represents_CategoryTypeValidTypeType = "Category";
interface _NotationNotation_represents_CategoryTypeValidTypeType extends Primitive._string { content: NotationNotation_represents_CategoryTypeValidTypeType; }

/** Definition
  * ==========
  * A resource which describes a specific attribute of an object. It is defined in the style of selectors of the Web Annotation Vocabulary, see https://www.w3.org/TR/annotation-vocab/. The selector can be nested dependent on the structure of the referenced object. */
interface _ObjectAttributeSelector extends _Selector {
	/** Nested object attribute selector. */
	refinedBy?: ObjectAttributeSelector;
	/** Order number of the specific attribute. */
	refinedByOrderNumber?: number;
	/** Name of the attribute. */
	value?: string;
}
export interface ObjectAttributeSelector extends _ObjectAttributeSelector { constructor: { new(): ObjectAttributeSelector }; }
export var ObjectAttributeSelector: { new(): ObjectAttributeSelector };

/** Definition
  * ==========
  * A standard means of expressing a name for a class object. A linguistic signifier. Human understandable name (word, phrase, or mnemonic) that reflects the ISO/IEC 11179-5 naming principles.
  *
  * Explanatory notes
  * =================
  * Use in model: In general the property name should be "name" as it is the name of the class object of which it is an attribute. Use a specific name (i.e. xxxName) only when naming something other than the class object of which it is an attribute. */
interface _ObjectName extends BaseType {
	/** A name may be specific to a particular context, i.e., a type of software, or a section of a registry. Identify the context related to the specified name. */
	context?: ControlledVocabularyEntry;
	/** The expressed name of the object. */
	name?: string;
}
export interface ObjectName extends _ObjectName { constructor: { new(): ObjectName }; }
export var ObjectName: { new(): ObjectName };

/** Definition
  * ==========
  * Collection of people organized within a framework of authority that can perform an act or be associated with another agent.
  *
  * Examples
  * ==========
  * Commonwealth Scientific and Industrial Research Organisation (CSIRO), U.S. Census Bureau, University of Michigan/Institute for Social Research, Research Data Alliance Agrisemantics Working Group.
  *
  * Explanatory notes
  * =================
  * The W3C Organization Ontology (https://www.w3.org/TR/vocab-org/#organizational_structure) definition: "Represents a collection of people organized together into a community or other social, commercial or political structure. The group has some common purpose or reason for existence which goes beyond the set of people belonging to it and can act as an agent. Organizations are often decomposable into hierarchical structures." */
interface _Organization extends _Agent {
	/** Contact information for the organization including location specification, address, URL, phone numbers, and other means of communication access. Sets of information can be repeated and date-stamped. */
	contactInformation?: ContactInformation;
	/** Names by which the organization is known. */
	organizationName: OrganizationName[];
}
export interface Organization extends _Organization { constructor: { new(): Organization }; }
export var Organization: { new(): Organization };

/** Definition
  * ==========
  * Names by which the organization is known. Use the attribute isFormal with a value of True to designate the legal or formal name of the organization. Names may be typed with typeOfOrganizationName to indicate their appropriate usage. */
interface _OrganizationName extends _ObjectName {
	/** An abbreviation or acronym for the name. This may be expressed in multiple languages. It is assumed that if only a single language is provided that it may be used in any of the other languages within which the name itself is expressed. */
	abbreviation?: InternationalString;
	/** The time period for which this name is accurate and in use. */
	effectiveDates?: DateRange;
	/** The legal or formal name of the organization should have the isFormal attribute set to True. To avoid confusion only one organization name should have the isFormal attribute set to True. Use the typeOfOrganizationName to further differentiate the type and applied usage when multiple names are provided. */
	isFormal?: boolean;
	/** The type of organization name provided. the use of a controlled vocabulary is strongly recommended. At minimum this should include, e.g. PreviousFormalName, Nickname (or CommonName), Other. */
	typeOfOrganizationName?: ControlledVocabularyEntry;
}
export interface OrganizationName extends _OrganizationName { constructor: { new(): OrganizationName }; }
export var OrganizationName: { new(): OrganizationName };

/** Definition
  * ==========
  * A tightly bound pair of items from an external controlled vocabulary. The extent property describes the extent to which the parent term applies for the specific case.
  *
  * Examples
  * ========
  * When used to assign a role to an actor within a specific activity this term would express the degree of contribution. Contributor with term (role) "Editor" and extent "Lead".
  *
  * Alternatively the term might be a controlled vocabulary from a list of controlled vocabularies, e.g. the Generic Longitudinal Business Process Model (GLBPM) in a list that could include other business process model frameworks. In this context the extent becomes the name of a business process model task, e.g. "integrate data" from the GLBPM. */
interface _PairedControlledVocabularyEntry extends BaseType {
	/** Describes the extent to which the parent term applies for the specific case using an external controlled vocabulary. When associated with a role from the CASRAI Contributor Roles Taxonomy an appropriate vocabulary should be specified as either "lead", "equal", or "supporting". */
	extent?: ControlledVocabularyEntry;
	/** The term attributed to the parent class, for example the role of a contributor. */
	term: ControlledVocabularyEntry;
}
export interface PairedControlledVocabularyEntry extends _PairedControlledVocabularyEntry { constructor: { new(): PairedControlledVocabularyEntry }; }
export var PairedControlledVocabularyEntry: { new(): PairedControlledVocabularyEntry };

/** Definition
  * ============
  * An input or output to control logic and the step/sub-step it invokes. Parameters may take the form of any information object, including data sets and structured metadata as well as configuration information for the step/sub-step.
  *
  * Examples
  * ==========
  * A dimensional data set; a long data structure. */
interface _Parameter extends BaseType {
	/** Specification of the object being used as a parameter, typically as a reference to a class in the DDI-CDI model, but may also be a specific instance of a class. */
	entityBound?: Reference[];
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	/** Human understandable name (linguistic signifier, word, phrase, or mnemonic). May follow ISO/IEC 11179-5 naming principles, and have context provided to specify usage. */
	name?: ObjectName[];
}
export interface Parameter extends _Parameter { constructor: { new(): Parameter }; }
export var Parameter: { new(): Parameter };

/** Definition
  * ============
  * Information needed for understanding the physical structure of data coming from a file or other source.
  *
  * Examples
  * ==========
  * The physical data set is the entry point for information about a file or other source. It includes information about the name of a file, the structure of segments in a file.
  *
  * Explanatory notes
  * ===================
  * Multiple styles of structural description are supported: including describing files as unit-record (unit segment layout) files; describing cubes; and describing event-history (spell) data. */
interface _PhysicalDataSet extends BaseType {
	/** If value is False, the members are unique within the collection - if True, there may be duplicates. (Note that a mathematical "bag" permits duplicates and is unordered - a "set" does not have duplicates and may be ordered.) */
	allowsDuplicates: boolean;
	/** Bundles the information useful for a data catalog entry.
	  *
	  * Examples would be creator, contributor, title, copyright, embargo, and license information
	  *
	  * A set of information useful for attribution, data discovery, and access.
	  * This is information that is tied to the identity of the object. If this information changes the version of the associated object changes. */
	catalogDetails?: CatalogDetails;
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	/** Human understandable name (liguistic signifier, word, phrase, or mnemonic). May follow ISO/IEC 11179-5 naming principles, and have context provided to specify usage. */
	name?: ObjectName;
	/** The number of distinct segments (e.g., segments patterns with different structures, identified separately) in a physical dataset. */
	numberOfSegments?: number;
	/** Short natural language account of the information obtained from the combination of properties and relationships associated with an object. */
	overview?: InternationalString;
	/** Data store physically represented by the structure description. */
	PhysicalDataSet_formats_DataStore?: PhysicalDataSetPhysicalDataSet_formats_DataStoreType[];
	PhysicalDataSet_has_InstanceVariable?: PhysicalDataSetPhysicalDataSet_has_InstanceVariableType[];
	PhysicalDataSet_has_PhysicalRecordSegment?: PhysicalDataSetPhysicalDataSet_has_PhysicalRecordSegmentType[];
	PhysicalDataSet_has_PhysicalRecordSegmentPosition?: PhysicalDataSetPhysicalDataSet_has_PhysicalRecordSegmentPositionType[];
	/** The conceptual basis for the collection of members. */
	PhysicalDataSet_isDefinedBy_Concept?: PhysicalDataSetPhysicalDataSet_isDefinedBy_ConceptType[];
	/** Use when multiple physical segments are stored in a single file. */
	physicalFileName?: string;
	/** Intent or reason for the object/the description of the object. */
	purpose?: InternationalString;
}
export interface PhysicalDataSet extends _PhysicalDataSet { constructor: { new(): PhysicalDataSet }; }
export var PhysicalDataSet: { new(): PhysicalDataSet };

interface _PhysicalDataSetPhysicalDataSet_formats_DataStoreType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: PhysicalDataSetPhysicalDataSet_formats_DataStoreTypeValidTypeType[];
}
interface PhysicalDataSetPhysicalDataSet_formats_DataStoreType extends _PhysicalDataSetPhysicalDataSet_formats_DataStoreType { constructor: { new(): PhysicalDataSetPhysicalDataSet_formats_DataStoreType }; }

type PhysicalDataSetPhysicalDataSet_formats_DataStoreTypeValidTypeType = "DataStore";
interface _PhysicalDataSetPhysicalDataSet_formats_DataStoreTypeValidTypeType extends Primitive._string { content: PhysicalDataSetPhysicalDataSet_formats_DataStoreTypeValidTypeType; }

interface _PhysicalDataSetPhysicalDataSet_has_InstanceVariableType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: PhysicalDataSetPhysicalDataSet_has_InstanceVariableTypeValidTypeType[];
}
interface PhysicalDataSetPhysicalDataSet_has_InstanceVariableType extends _PhysicalDataSetPhysicalDataSet_has_InstanceVariableType { constructor: { new(): PhysicalDataSetPhysicalDataSet_has_InstanceVariableType }; }

type PhysicalDataSetPhysicalDataSet_has_InstanceVariableTypeValidTypeType = "InstanceVariable";
interface _PhysicalDataSetPhysicalDataSet_has_InstanceVariableTypeValidTypeType extends Primitive._string { content: PhysicalDataSetPhysicalDataSet_has_InstanceVariableTypeValidTypeType; }

interface _PhysicalDataSetPhysicalDataSet_has_PhysicalRecordSegmentPositionType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType: PhysicalDataSetPhysicalDataSet_has_PhysicalRecordSegmentPositionTypeValidTypeType[];
}
interface PhysicalDataSetPhysicalDataSet_has_PhysicalRecordSegmentPositionType extends _PhysicalDataSetPhysicalDataSet_has_PhysicalRecordSegmentPositionType { constructor: { new(): PhysicalDataSetPhysicalDataSet_has_PhysicalRecordSegmentPositionType }; }

type PhysicalDataSetPhysicalDataSet_has_PhysicalRecordSegmentPositionTypeValidTypeType = "PhysicalRecordSegmentPosition";
interface _PhysicalDataSetPhysicalDataSet_has_PhysicalRecordSegmentPositionTypeValidTypeType extends Primitive._string { content: PhysicalDataSetPhysicalDataSet_has_PhysicalRecordSegmentPositionTypeValidTypeType; }

interface _PhysicalDataSetPhysicalDataSet_has_PhysicalRecordSegmentType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: PhysicalDataSetPhysicalDataSet_has_PhysicalRecordSegmentTypeValidTypeType[];
}
interface PhysicalDataSetPhysicalDataSet_has_PhysicalRecordSegmentType extends _PhysicalDataSetPhysicalDataSet_has_PhysicalRecordSegmentType { constructor: { new(): PhysicalDataSetPhysicalDataSet_has_PhysicalRecordSegmentType }; }

type PhysicalDataSetPhysicalDataSet_has_PhysicalRecordSegmentTypeValidTypeType = "PhysicalRecordSegment";
interface _PhysicalDataSetPhysicalDataSet_has_PhysicalRecordSegmentTypeValidTypeType extends Primitive._string { content: PhysicalDataSetPhysicalDataSet_has_PhysicalRecordSegmentTypeValidTypeType; }

interface _PhysicalDataSetPhysicalDataSet_isDefinedBy_ConceptType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: PhysicalDataSetPhysicalDataSet_isDefinedBy_ConceptTypeValidTypeType[];
}
interface PhysicalDataSetPhysicalDataSet_isDefinedBy_ConceptType extends _PhysicalDataSetPhysicalDataSet_isDefinedBy_ConceptType { constructor: { new(): PhysicalDataSetPhysicalDataSet_isDefinedBy_ConceptType }; }

type PhysicalDataSetPhysicalDataSet_isDefinedBy_ConceptTypeValidTypeType = ("Category" | "Concept" | "ConceptualValue" | "ConceptualVariable" | "DescriptorVariable" | "DimensionalKeyDefinitionMember" | "InstanceVariable" | "KeyDefinitionMember" | "Population" | "ReferenceVariable" | "RepresentedVariable" | "UnitType" | "Universe");
interface _PhysicalDataSetPhysicalDataSet_isDefinedBy_ConceptTypeValidTypeType extends Primitive._string { content: PhysicalDataSetPhysicalDataSet_isDefinedBy_ConceptTypeValidTypeType; }

/** Definition
  * ============
  * Ordering for physical record segments, which map to a logical record.
  *
  * Explanatory notes
  * ===================
  * The same logical record layout may be the source member in several adjacency lists. This can happen when physical record segments are also population specific. In this instance each adjacency list associated with a logical record layout is associated with a different population. */
interface _PhysicalDataSetStructure extends BaseType {
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	/** Human understandable name (liguistic signifier, word, phrase, or mnemonic). May follow ISO/IEC 11179-5 naming principles, and have context provided to specify usage. */
	name?: ObjectName;
	PhysicalDataSetStructure_has_PhysicalRecordSegmentRelationship?: PhysicalDataSetStructurePhysicalDataSetStructure_has_PhysicalRecordSegmentRelationshipType[];
	PhysicalDataSetStructure_structures_PhysicalDataSet?: PhysicalDataSetStructurePhysicalDataSetStructure_structures_PhysicalDataSetType;
	/** Intent or reason for the object/the description of the object. */
	purpose?: InternationalString;
	/** Specifies the semantics of the object in reference to a vocabulary, ontology, etc. */
	semantics?: ControlledVocabularyEntry;
	/** Provides information on reflexivity, transitivity, and symmetry of relationship using a descriptive term from an enumerated list. Use if all relations within this relation structure are of the same specification. */
	specification?: StructureSpecification;
	/** Indicates the form of the associations among members of the collection. Specifies the way in which constituent parts are interrelated or arranged. */
	topology?: ControlledVocabularyEntry;
	/** Indicates whether the related collections are comprehensive in terms of their coverage. */
	totality?: StructureExtent;
}
export interface PhysicalDataSetStructure extends _PhysicalDataSetStructure { constructor: { new(): PhysicalDataSetStructure }; }
export var PhysicalDataSetStructure: { new(): PhysicalDataSetStructure };

interface _PhysicalDataSetStructurePhysicalDataSetStructure_has_PhysicalRecordSegmentRelationshipType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType: PhysicalDataSetStructurePhysicalDataSetStructure_has_PhysicalRecordSegmentRelationshipTypeValidTypeType[];
}
interface PhysicalDataSetStructurePhysicalDataSetStructure_has_PhysicalRecordSegmentRelationshipType extends _PhysicalDataSetStructurePhysicalDataSetStructure_has_PhysicalRecordSegmentRelationshipType { constructor: { new(): PhysicalDataSetStructurePhysicalDataSetStructure_has_PhysicalRecordSegmentRelationshipType }; }

type PhysicalDataSetStructurePhysicalDataSetStructure_has_PhysicalRecordSegmentRelationshipTypeValidTypeType = "PhysicalRecordSegmentRelationship";
interface _PhysicalDataSetStructurePhysicalDataSetStructure_has_PhysicalRecordSegmentRelationshipTypeValidTypeType extends Primitive._string { content: PhysicalDataSetStructurePhysicalDataSetStructure_has_PhysicalRecordSegmentRelationshipTypeValidTypeType; }

interface _PhysicalDataSetStructurePhysicalDataSetStructure_structures_PhysicalDataSetType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: PhysicalDataSetStructurePhysicalDataSetStructure_structures_PhysicalDataSetTypeValidTypeType[];
}
interface PhysicalDataSetStructurePhysicalDataSetStructure_structures_PhysicalDataSetType extends _PhysicalDataSetStructurePhysicalDataSetStructure_structures_PhysicalDataSetType { constructor: { new(): PhysicalDataSetStructurePhysicalDataSetStructure_structures_PhysicalDataSetType }; }

type PhysicalDataSetStructurePhysicalDataSetStructure_structures_PhysicalDataSetTypeValidTypeType = "PhysicalDataSet";
interface _PhysicalDataSetStructurePhysicalDataSetStructure_structures_PhysicalDataSetTypeValidTypeType extends Primitive._string { content: PhysicalDataSetStructurePhysicalDataSetStructure_structures_PhysicalDataSetTypeValidTypeType; }

/** Definition
  * ==========
  * Realization of relation structure that is used to describe the sequence of value mappings in a physical layout.
  *
  * Examples
  * ========
  * The W3C Tabular Data on the Web specification section 4.5 Cells (https://www.w3.org/TR/tabular-data-model/#content-type) allows for a list datatype within cells. In the example below there are three top level instance variables: PersonID - the person identifier; AgeYr - age in years; BpSys_Dia - blood pressure (a list containing Systolic and Diastolic values). There are two variables at a secondary level of the hierarchy: Systolic - the systolic pressure; Diastolic - the diastolic pressure. The delimited file below uses the comma to separate "columns" and forward slash to separate elements of a blood pressure list. ::
  *
  * PersonID, AgeYr, BpSys_Dia
  * 1,22,119/67
  * 2,68,122/70
  *
  * The physical relation structure in this case would describe a BpSys_Dia list variable as containing an ordered sequence of the Systolic and Diastolic instance variables.
  *
  * Explanatory notes
  * =================
  * This can be more complex than a simple sequence. */
interface _PhysicalLayoutRelationStructure extends BaseType {
	/** Intentional definition of the order criteria (e.g. alphabetical, numerical, increasing, decreasing, etc.). */
	criteria?: InternationalString;
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	/** A linguistic signifier. Human understandable name (word, phrase, or mnemonic) that reflects the ISO/IEC 11179-5 naming principles. If more than one name is provided then a context to differentiate usage must be provided as well. */
	name?: ObjectName[];
	PhysicalLayoutRelationStructure_has_ValueMappingRelationship?: PhysicalLayoutRelationStructurePhysicalLayoutRelationStructure_has_ValueMappingRelationshipType[];
	PhysicalLayoutRelationStructure_structures_PhysicalSegmentLayout?: PhysicalLayoutRelationStructurePhysicalLayoutRelationStructure_structures_PhysicalSegmentLayoutType;
	/** Intent or reason for the object/the description of the object. */
	purpose?: InternationalString;
	/** Specifies the semantics of the object in reference to a vocabulary, ontology, etc. */
	semantics?: ControlledVocabularyEntry;
	/** Provides information on reflexivity, transitivity, and symmetry of relationship using a descriptive term from an enumerated list. Use if all relations within this relation structure are of the same specification. */
	specification?: StructureSpecification;
	/** Indicates the form of the associations among members of the collection. Specifies the way in which constituent parts are interrelated or arranged. */
	topology: ControlledVocabularyEntry;
	/** Indicates whether the related collections are comprehensive in terms of their coverage. */
	totality?: StructureExtent;
}
export interface PhysicalLayoutRelationStructure extends _PhysicalLayoutRelationStructure { constructor: { new(): PhysicalLayoutRelationStructure }; }
export var PhysicalLayoutRelationStructure: { new(): PhysicalLayoutRelationStructure };

interface _PhysicalLayoutRelationStructurePhysicalLayoutRelationStructure_has_ValueMappingRelationshipType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType: PhysicalLayoutRelationStructurePhysicalLayoutRelationStructure_has_ValueMappingRelationshipTypeValidTypeType[];
}
interface PhysicalLayoutRelationStructurePhysicalLayoutRelationStructure_has_ValueMappingRelationshipType extends _PhysicalLayoutRelationStructurePhysicalLayoutRelationStructure_has_ValueMappingRelationshipType { constructor: { new(): PhysicalLayoutRelationStructurePhysicalLayoutRelationStructure_has_ValueMappingRelationshipType }; }

type PhysicalLayoutRelationStructurePhysicalLayoutRelationStructure_has_ValueMappingRelationshipTypeValidTypeType = "ValueMappingRelationship";
interface _PhysicalLayoutRelationStructurePhysicalLayoutRelationStructure_has_ValueMappingRelationshipTypeValidTypeType extends Primitive._string { content: PhysicalLayoutRelationStructurePhysicalLayoutRelationStructure_has_ValueMappingRelationshipTypeValidTypeType; }

interface _PhysicalLayoutRelationStructurePhysicalLayoutRelationStructure_structures_PhysicalSegmentLayoutType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: PhysicalLayoutRelationStructurePhysicalLayoutRelationStructure_structures_PhysicalSegmentLayoutTypeValidTypeType[];
}
interface PhysicalLayoutRelationStructurePhysicalLayoutRelationStructure_structures_PhysicalSegmentLayoutType extends _PhysicalLayoutRelationStructurePhysicalLayoutRelationStructure_structures_PhysicalSegmentLayoutType { constructor: { new(): PhysicalLayoutRelationStructurePhysicalLayoutRelationStructure_structures_PhysicalSegmentLayoutType }; }

type PhysicalLayoutRelationStructurePhysicalLayoutRelationStructure_structures_PhysicalSegmentLayoutTypeValidTypeType = ("PhysicalSegmentLayout" | "UnitSegmentLayout");
interface _PhysicalLayoutRelationStructurePhysicalLayoutRelationStructure_structures_PhysicalSegmentLayoutTypeValidTypeType extends Primitive._string { content: PhysicalLayoutRelationStructurePhysicalLayoutRelationStructure_structures_PhysicalSegmentLayoutTypeValidTypeType; }

/** Definition
  * ==========
  * Description of each physical storage segment required to completely cover a physical record representing the logical record.
  *
  * Examples
  * ========
  * The file below has four instance variables: PersonId, SegmentId, AgeYr, and HeightCm. The data for each person (identified by PersonId) is recorded in two segments (identified by SegmentId), "a" and "b". AgeYr is on physical segment a, and HeightCm is on segment b. These are the same data as described in the unit segment layout documentation. ::
  *
  * 1 a  22
  * 1 b 183
  * 2 a  45
  * 2 b 175
  *
  * Explanatory notes
  * =================
  * A logical record may be stored in one or more segments housed hierarchically in a single file or in separate data files. All logical records have at least one segment. */
interface _PhysicalRecordSegment extends BaseType {
	/** If value is False, the members are unique within the collection - if True, there may be duplicates. (Note that a mathematical “bag” permits duplicates and is unordered - a “set” does not have duplicates and may be ordered.) */
	allowsDuplicates: boolean;
	/** Bundles the information useful for a data catalog entry.
	  *
	  * Examples would be creator, contributor, title, copyright, embargo, and license information
	  *
	  * A set of information useful for attribution, data discovery, and access.
	  * This is information that is tied to the identity of the object. If this information changes the version of the associated object changes. */
	catalogDetails?: CatalogDetails;
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	/** Human understandable name (liguistic signifier, word, phrase, or mnemonic). May follow ISO/IEC 11179-5 naming principles, and have context provided to specify usage. */
	name?: ObjectName[];
	/** Use when each physical segment is stored in its own file. */
	physicalFileName?: string;
	PhysicalRecordSegment_has_DataPoint?: PhysicalRecordSegmentPhysicalRecordSegment_has_DataPointType[];
	PhysicalRecordSegment_has_DataPointPosition?: PhysicalRecordSegmentPhysicalRecordSegment_has_DataPointPositionType[];
	PhysicalRecordSegment_has_PhysicalSegmentLayout?: PhysicalRecordSegmentPhysicalRecordSegment_has_PhysicalSegmentLayoutType;
	/** The conceptual basis for the collection of members. */
	PhysicalRecordSegment_isDefinedBy_Concept?: PhysicalRecordSegmentPhysicalRecordSegment_isDefinedBy_ConceptType[];
	/** Every data record has zero to many physical record segments. It is possible to describe a physical data product and its record segment(s) without reference to a data record. */
	PhysicalRecordSegment_mapsTo_LogicalRecord?: PhysicalRecordSegmentPhysicalRecordSegment_mapsTo_LogicalRecordType;
	/** A record segment may represent a specific population or sub-population within a larger set of segments. Allows for the identification of this filter for membership in the segment. */
	PhysicalRecordSegment_represents_Population?: PhysicalRecordSegmentPhysicalRecordSegment_represents_PopulationType;
	/** Intent or reason for the object/the description of the object. */
	purpose?: InternationalString;
}
export interface PhysicalRecordSegment extends _PhysicalRecordSegment { constructor: { new(): PhysicalRecordSegment }; }
export var PhysicalRecordSegment: { new(): PhysicalRecordSegment };

interface _PhysicalRecordSegmentPhysicalRecordSegment_has_DataPointPositionType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType: PhysicalRecordSegmentPhysicalRecordSegment_has_DataPointPositionTypeValidTypeType[];
}
interface PhysicalRecordSegmentPhysicalRecordSegment_has_DataPointPositionType extends _PhysicalRecordSegmentPhysicalRecordSegment_has_DataPointPositionType { constructor: { new(): PhysicalRecordSegmentPhysicalRecordSegment_has_DataPointPositionType }; }

type PhysicalRecordSegmentPhysicalRecordSegment_has_DataPointPositionTypeValidTypeType = "DataPointPosition";
interface _PhysicalRecordSegmentPhysicalRecordSegment_has_DataPointPositionTypeValidTypeType extends Primitive._string { content: PhysicalRecordSegmentPhysicalRecordSegment_has_DataPointPositionTypeValidTypeType; }

interface _PhysicalRecordSegmentPhysicalRecordSegment_has_DataPointType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: PhysicalRecordSegmentPhysicalRecordSegment_has_DataPointTypeValidTypeType[];
}
interface PhysicalRecordSegmentPhysicalRecordSegment_has_DataPointType extends _PhysicalRecordSegmentPhysicalRecordSegment_has_DataPointType { constructor: { new(): PhysicalRecordSegmentPhysicalRecordSegment_has_DataPointType }; }

type PhysicalRecordSegmentPhysicalRecordSegment_has_DataPointTypeValidTypeType = "DataPoint";
interface _PhysicalRecordSegmentPhysicalRecordSegment_has_DataPointTypeValidTypeType extends Primitive._string { content: PhysicalRecordSegmentPhysicalRecordSegment_has_DataPointTypeValidTypeType; }

interface _PhysicalRecordSegmentPhysicalRecordSegment_has_PhysicalSegmentLayoutType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: PhysicalRecordSegmentPhysicalRecordSegment_has_PhysicalSegmentLayoutTypeValidTypeType[];
}
interface PhysicalRecordSegmentPhysicalRecordSegment_has_PhysicalSegmentLayoutType extends _PhysicalRecordSegmentPhysicalRecordSegment_has_PhysicalSegmentLayoutType { constructor: { new(): PhysicalRecordSegmentPhysicalRecordSegment_has_PhysicalSegmentLayoutType }; }

type PhysicalRecordSegmentPhysicalRecordSegment_has_PhysicalSegmentLayoutTypeValidTypeType = ("PhysicalSegmentLayout" | "UnitSegmentLayout");
interface _PhysicalRecordSegmentPhysicalRecordSegment_has_PhysicalSegmentLayoutTypeValidTypeType extends Primitive._string { content: PhysicalRecordSegmentPhysicalRecordSegment_has_PhysicalSegmentLayoutTypeValidTypeType; }

interface _PhysicalRecordSegmentPhysicalRecordSegment_isDefinedBy_ConceptType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: PhysicalRecordSegmentPhysicalRecordSegment_isDefinedBy_ConceptTypeValidTypeType[];
}
interface PhysicalRecordSegmentPhysicalRecordSegment_isDefinedBy_ConceptType extends _PhysicalRecordSegmentPhysicalRecordSegment_isDefinedBy_ConceptType { constructor: { new(): PhysicalRecordSegmentPhysicalRecordSegment_isDefinedBy_ConceptType }; }

type PhysicalRecordSegmentPhysicalRecordSegment_isDefinedBy_ConceptTypeValidTypeType = ("Category" | "Concept" | "ConceptualValue" | "ConceptualVariable" | "DescriptorVariable" | "DimensionalKeyDefinitionMember" | "InstanceVariable" | "KeyDefinitionMember" | "Population" | "ReferenceVariable" | "RepresentedVariable" | "UnitType" | "Universe");
interface _PhysicalRecordSegmentPhysicalRecordSegment_isDefinedBy_ConceptTypeValidTypeType extends Primitive._string { content: PhysicalRecordSegmentPhysicalRecordSegment_isDefinedBy_ConceptTypeValidTypeType; }

interface _PhysicalRecordSegmentPhysicalRecordSegment_mapsTo_LogicalRecordType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: PhysicalRecordSegmentPhysicalRecordSegment_mapsTo_LogicalRecordTypeValidTypeType[];
}
interface PhysicalRecordSegmentPhysicalRecordSegment_mapsTo_LogicalRecordType extends _PhysicalRecordSegmentPhysicalRecordSegment_mapsTo_LogicalRecordType { constructor: { new(): PhysicalRecordSegmentPhysicalRecordSegment_mapsTo_LogicalRecordType }; }

type PhysicalRecordSegmentPhysicalRecordSegment_mapsTo_LogicalRecordTypeValidTypeType = "LogicalRecord";
interface _PhysicalRecordSegmentPhysicalRecordSegment_mapsTo_LogicalRecordTypeValidTypeType extends Primitive._string { content: PhysicalRecordSegmentPhysicalRecordSegment_mapsTo_LogicalRecordTypeValidTypeType; }

interface _PhysicalRecordSegmentPhysicalRecordSegment_represents_PopulationType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: PhysicalRecordSegmentPhysicalRecordSegment_represents_PopulationTypeValidTypeType[];
}
interface PhysicalRecordSegmentPhysicalRecordSegment_represents_PopulationType extends _PhysicalRecordSegmentPhysicalRecordSegment_represents_PopulationType { constructor: { new(): PhysicalRecordSegmentPhysicalRecordSegment_represents_PopulationType }; }

type PhysicalRecordSegmentPhysicalRecordSegment_represents_PopulationTypeValidTypeType = "Population";
interface _PhysicalRecordSegmentPhysicalRecordSegment_represents_PopulationTypeValidTypeType extends Primitive._string { content: PhysicalRecordSegmentPhysicalRecordSegment_represents_PopulationTypeValidTypeType; }

/** Definition
  * ============
  * Assigns a position of the physical record segment within the whole physical record. For example in what order does this 80 character segment fall within an 800 character record. */
interface _PhysicalRecordSegmentPosition extends BaseType {
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	/** Assigns a position to a physical record segment within a physical record. */
	PhysicalRecordSegmentPosition_indexes_PhysicalRecordSegment: PhysicalRecordSegmentPositionPhysicalRecordSegmentPosition_indexes_PhysicalRecordSegmentType;
	/** Index value of the member in an ordered array. */
	value: number;
}
export interface PhysicalRecordSegmentPosition extends _PhysicalRecordSegmentPosition { constructor: { new(): PhysicalRecordSegmentPosition }; }
export var PhysicalRecordSegmentPosition: { new(): PhysicalRecordSegmentPosition };

interface _PhysicalRecordSegmentPositionPhysicalRecordSegmentPosition_indexes_PhysicalRecordSegmentType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: PhysicalRecordSegmentPositionPhysicalRecordSegmentPosition_indexes_PhysicalRecordSegmentTypeValidTypeType[];
}
interface PhysicalRecordSegmentPositionPhysicalRecordSegmentPosition_indexes_PhysicalRecordSegmentType extends _PhysicalRecordSegmentPositionPhysicalRecordSegmentPosition_indexes_PhysicalRecordSegmentType { constructor: { new(): PhysicalRecordSegmentPositionPhysicalRecordSegmentPosition_indexes_PhysicalRecordSegmentType }; }

type PhysicalRecordSegmentPositionPhysicalRecordSegmentPosition_indexes_PhysicalRecordSegmentTypeValidTypeType = "PhysicalRecordSegment";
interface _PhysicalRecordSegmentPositionPhysicalRecordSegmentPosition_indexes_PhysicalRecordSegmentTypeValidTypeType extends Primitive._string { content: PhysicalRecordSegmentPositionPhysicalRecordSegmentPosition_indexes_PhysicalRecordSegmentTypeValidTypeType; }

/** Definition
  * ============
  * Structured relationship between physical record segments. */
interface _PhysicalRecordSegmentRelationship extends BaseType {
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	PhysicalRecordSegmentRelationship_hasSource_PhysicalRecordSegment?: PhysicalRecordSegmentRelationshipPhysicalRecordSegmentRelationship_hasSource_PhysicalRecordSegmentType;
	PhysicalRecordSegmentRelationship_hasTarget_PhysicalRecordSegment?: PhysicalRecordSegmentRelationshipPhysicalRecordSegmentRelationship_hasTarget_PhysicalRecordSegmentType[];
	/** Specifies the semantics of the object in reference to a vocabulary, ontology, etc. */
	semantics?: ControlledVocabularyEntry;
}
export interface PhysicalRecordSegmentRelationship extends _PhysicalRecordSegmentRelationship { constructor: { new(): PhysicalRecordSegmentRelationship }; }
export var PhysicalRecordSegmentRelationship: { new(): PhysicalRecordSegmentRelationship };

interface _PhysicalRecordSegmentRelationshipPhysicalRecordSegmentRelationship_hasSource_PhysicalRecordSegmentType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: PhysicalRecordSegmentRelationshipPhysicalRecordSegmentRelationship_hasSource_PhysicalRecordSegmentTypeValidTypeType[];
}
interface PhysicalRecordSegmentRelationshipPhysicalRecordSegmentRelationship_hasSource_PhysicalRecordSegmentType extends _PhysicalRecordSegmentRelationshipPhysicalRecordSegmentRelationship_hasSource_PhysicalRecordSegmentType { constructor: { new(): PhysicalRecordSegmentRelationshipPhysicalRecordSegmentRelationship_hasSource_PhysicalRecordSegmentType }; }

type PhysicalRecordSegmentRelationshipPhysicalRecordSegmentRelationship_hasSource_PhysicalRecordSegmentTypeValidTypeType = "PhysicalRecordSegment";
interface _PhysicalRecordSegmentRelationshipPhysicalRecordSegmentRelationship_hasSource_PhysicalRecordSegmentTypeValidTypeType extends Primitive._string { content: PhysicalRecordSegmentRelationshipPhysicalRecordSegmentRelationship_hasSource_PhysicalRecordSegmentTypeValidTypeType; }

interface _PhysicalRecordSegmentRelationshipPhysicalRecordSegmentRelationship_hasTarget_PhysicalRecordSegmentType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: PhysicalRecordSegmentRelationshipPhysicalRecordSegmentRelationship_hasTarget_PhysicalRecordSegmentTypeValidTypeType[];
}
interface PhysicalRecordSegmentRelationshipPhysicalRecordSegmentRelationship_hasTarget_PhysicalRecordSegmentType extends _PhysicalRecordSegmentRelationshipPhysicalRecordSegmentRelationship_hasTarget_PhysicalRecordSegmentType { constructor: { new(): PhysicalRecordSegmentRelationshipPhysicalRecordSegmentRelationship_hasTarget_PhysicalRecordSegmentType }; }

type PhysicalRecordSegmentRelationshipPhysicalRecordSegmentRelationship_hasTarget_PhysicalRecordSegmentTypeValidTypeType = "PhysicalRecordSegment";
interface _PhysicalRecordSegmentRelationshipPhysicalRecordSegmentRelationship_hasTarget_PhysicalRecordSegmentTypeValidTypeType extends Primitive._string { content: PhysicalRecordSegmentRelationshipPhysicalRecordSegmentRelationship_hasTarget_PhysicalRecordSegmentTypeValidTypeType; }

/** Definition
  * ============
  * Means for describing the complex relational structure of data points in a physical record representing the logical record. */
interface _PhysicalRecordSegmentStructure extends BaseType {
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	/** A linguistic signifier. Human understandable name (word, phrase, or mnemonic) that reflects the ISO/IEC 11179-5 naming principles. */
	name?: ObjectName;
	/** PhysicalRecordSegmentStructure has zero to many DataPointRelationships. */
	PhysicalRecordSegmentStructure_has_DataPointRelationship?: PhysicalRecordSegmentStructurePhysicalRecordSegmentStructure_has_DataPointRelationshipType[];
	/** There may be cases where there is a more complex structure to a sequence of data points. A cell containing a list, for example, might be considered to have nested data points that are the elements of the list. (For simplicity's sake, each element of the list should be modeled as a data point if this is possible.) */
	PhysicalRecordSegmentStructure_structures_PhysicalRecordSegment?: PhysicalRecordSegmentStructurePhysicalRecordSegmentStructure_structures_PhysicalRecordSegmentType;
	/** Intent or reason for the object/the description of the object. */
	purpose?: InternationalString;
	/** Specifies the semantics of the object in reference to a vocabulary, ontology, etc. */
	semantics?: ControlledVocabularyEntry;
	/** Provides information on reflexivity, transitivity, and symmetry of relationship using a descriptive term from an enumerated list. Use if all relations within this relation structure are of the same specification. */
	specification?: StructureSpecification;
	/** Indicates the form of the associations among members of the collection. Specifies the way in which constituent parts are interrelated or arranged. */
	topology?: ControlledVocabularyEntry;
	/** Indicates whether the related collections are comprehensive in terms of their coverage. */
	totality?: StructureExtent;
}
export interface PhysicalRecordSegmentStructure extends _PhysicalRecordSegmentStructure { constructor: { new(): PhysicalRecordSegmentStructure }; }
export var PhysicalRecordSegmentStructure: { new(): PhysicalRecordSegmentStructure };

interface _PhysicalRecordSegmentStructurePhysicalRecordSegmentStructure_has_DataPointRelationshipType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType: PhysicalRecordSegmentStructurePhysicalRecordSegmentStructure_has_DataPointRelationshipTypeValidTypeType[];
}
interface PhysicalRecordSegmentStructurePhysicalRecordSegmentStructure_has_DataPointRelationshipType extends _PhysicalRecordSegmentStructurePhysicalRecordSegmentStructure_has_DataPointRelationshipType { constructor: { new(): PhysicalRecordSegmentStructurePhysicalRecordSegmentStructure_has_DataPointRelationshipType }; }

type PhysicalRecordSegmentStructurePhysicalRecordSegmentStructure_has_DataPointRelationshipTypeValidTypeType = "DataPointRelationship";
interface _PhysicalRecordSegmentStructurePhysicalRecordSegmentStructure_has_DataPointRelationshipTypeValidTypeType extends Primitive._string { content: PhysicalRecordSegmentStructurePhysicalRecordSegmentStructure_has_DataPointRelationshipTypeValidTypeType; }

interface _PhysicalRecordSegmentStructurePhysicalRecordSegmentStructure_structures_PhysicalRecordSegmentType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: PhysicalRecordSegmentStructurePhysicalRecordSegmentStructure_structures_PhysicalRecordSegmentTypeValidTypeType[];
}
interface PhysicalRecordSegmentStructurePhysicalRecordSegmentStructure_structures_PhysicalRecordSegmentType extends _PhysicalRecordSegmentStructurePhysicalRecordSegmentStructure_structures_PhysicalRecordSegmentType { constructor: { new(): PhysicalRecordSegmentStructurePhysicalRecordSegmentStructure_structures_PhysicalRecordSegmentType }; }

type PhysicalRecordSegmentStructurePhysicalRecordSegmentStructure_structures_PhysicalRecordSegmentTypeValidTypeType = "PhysicalRecordSegment";
interface _PhysicalRecordSegmentStructurePhysicalRecordSegmentStructure_structures_PhysicalRecordSegmentTypeValidTypeType extends Primitive._string { content: PhysicalRecordSegmentStructurePhysicalRecordSegmentStructure_structures_PhysicalRecordSegmentTypeValidTypeType; }

/** Definition
  * ============
  * Used as an extension point in the description of the different layout styles of data structure descriptions.
  *
  * Examples
  * ==========
  * Examples include unit segment layouts, event data layouts, and cube layouts (e.g. summary data).
  *
  * Explanatory notes
  * ===================
  * A physical segment layout is a physical description (e.g. unit segment layout) of the associated logical record Layout consisting of a collection of value mappings describing the physical interrelationship of each related value mapping and associated instance variable. */
interface _PhysicalSegmentLayout extends BaseType {
	/** If value is False, the members are unique within the collection - if True, there may be duplicates. (Note that a mathematical “bag” permits duplicates and is unordered - a “set” does not have duplicates and may be ordered.) */
	allowsDuplicates: boolean;
	/** The starting value for the numbering of cells, rows, columns, etc. when they constitute an ordered sequence (an array). Note that in DDI, this is typically either 0 or 1. In related W3C work (Model for Tabular Data and Metadata on the Web), they appear to standardize on 1 (see https://www.w3.org/TR/tabular-data-model/ 4.3 [Columns] and 4.4 [Rows]: "number - the position of the column amongst the columns for the associated table, starting from 1.") */
	arrayBase?: number;
	/** Bundles the information useful for a data catalog entry.
	  *
	  * Examples would be creator, contributor, title, copyright, embargo, and license information
	  *
	  * A set of information useful for attribution, data discovery, and access.
	  * This is information that is tied to the identity of the object. If this information changes the version of the associated object changes. */
	catalogDetails?: CatalogDetails;
	/** A string used to indicate that an input line is a comment, a string which precedes a comment in the data file. From https://www.w3.org/TR/tabular-metadata/ 5.9 Dialect  commentPrefix: 'An atomic property that sets the comment prefix flag to the single provided value, which MUST be a string. The default is "#".' */
	commentPrefix?: string;
	/** The Delimiting character in the data. Must be used if isDelimited is True. "The separator between cells, set by the delimiter property of a dialect description. The default is ,. See the W3C Recommendation "Metadata Vocabulary for Tabular Data" (https://www.w3.org/TR/tabular-data-model/#encoding). From the "CSV Dialect" specification (https://specs.frictionlessdata.io/csv-dialect/#specification): "delimiter: specifies a one-character string to use as the field separator. Default = ,." */
	delimiter?: string;
	/** The character encoding of the represented data. From the W3C Recommendation "Metadata Vocabulary for Tabular Data" (https://www.w3.org/TR/tabular-metadata/) 5.9 Dialect: "encoding - An atomic property that sets the encoding flag to the single provided string value, which MUST be a defined in [encoding]. The default is 'utf-8'." From the same W3C recommendation 7.2 Encoding: "CSV files should be encoded using UTF-8, and should be in Unicode Normal Form C as defined in [UAX15]. If a CSV file is not encoded using UTF-8, the encoding should be specified through the charset parameter in the Content-Type header." */
	encoding?: ControlledVocabularyEntry;
	/** "The string that is used to escape the quote character within escaped cells, or null" see https://www.w3.org/TR/tabular-data-model/#encoding. From https://www.w3.org/TR/tabular-metadata/ 5.9 Dialect "doubleQuote: A boolean atomic property that, if true, sets the escape character flag to ". If false, to \. The default is true." From http://specs.frictionlessdata.io/csv-dialect/ "doubleQuote: controls the handling of quotes inside fields. If true, two consecutive quotes should be interpreted as one. Default = true". */
	escapeCharacter?: string;
	/** True if the file contains a header containing column names. From https://www.w3.org/TR/tabular-metadata/ 5.9 Dialect "header: A boolean atomic property that, if true, sets the header row count flag to 1, and if false to 0, unless headerRowCount is provided, in which case the value provided for the header property is ignored. The default is true." From http://specs.frictionlessdata.io/csv-dialect/ "header: indicates whether the file includes a header row. If true the first row in the file is a header row, not data. Default = true". */
	hasHeader?: boolean;
	/** If True, the case of the labels in the header is significant. From the "CSV Dialect" specification (http://specs.frictionlessdata.io/csv-dialect/): "caseSensitiveHeader: indicates that case in the header is meaningful. For example, columns CAT and Cat should not be equated. Default = false." */
	headerIsCaseSensitive?: boolean;
	/** The number of lines in the header From https://www.w3.org/TR/tabular-metadata/ 5.9 Dialect "headerRowCount: A numeric atomic property that sets the header row count flag to the single provided value, which MUST be a non-negative integer. The default is 1." */
	headerRowCount?: number;
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	/** Indicates whether the data are in a delimited format. If "true," the format is delimited, and the isFixedWidth property must be set to "false." If not set to "true," the property isFixedWitdh must be set to "true." */
	isDelimited: boolean;
	/** Set to true if the file is fixed-width. If true, isDelimited must be set to false. */
	isFixedWidth: boolean;
	/** The strings that can be used at the end of a row, set by the lineTerminators property of a dialect description. The default is [CRLF, LF]. See the W3C Recommendation "Metadata Vocabulary for Tabular Data" (https://www.w3.org/TR/tabular-data-model/#encoding) 5.9 Dialect "lineTerminators: An atomic property that sets the line terminators flag to either an array containing the single provided string value, or the provided array. The default is ['rn', 'n']." Also, from the "CSV Dialect" specification (http://specs.frictionlessdata.io/csv-dialect/): "lineTerminator: specifies the character sequence which should terminate rows. Default = rn." */
	lineTerminator?: string[];
	/** A linguistic signifier. Human understandable name (word, phrase, or mnemonic) that reflects the ISO/IEC 11179-5 naming principles. If more than one name is provided provide a context to differentiate usage. */
	name?: ObjectName[];
	/** A string indicating a null value. From the W3C Recommendation "Metadata Vocabulary for Tabular Data" (https://www.w3.org/TR/tabular-metadata/) 4.3: "null: the string or strings which cause the value of cells having string value matching any of these values to be null." From the same source, Inherited 5.7: "null: An atomic property giving the string or strings used for null values within the data. If the string value of the cell is equal to any one of these values, the cell value is null. See Parsing Cells in [tabular-data-model] for more details. If not specified, the default for the null property is the empty string ''. The value of this property becomes the null annotation for the described column." */
	nullSequence?: string;
	/** Short natural language account of the information obtained from the combination of properties and relationships associated with an object. */
	overview?: InternationalString;
	/** Logical record physically represented by the physical layout. */
	PhysicalSegmentLayout_formats_LogicalRecord?: PhysicalSegmentLayoutPhysicalSegmentLayout_formats_LogicalRecordType;
	PhysicalSegmentLayout_has_ValueMapping?: PhysicalSegmentLayoutPhysicalSegmentLayout_has_ValueMappingType[];
	PhysicalSegmentLayout_has_ValueMappingPosition?: PhysicalSegmentLayoutPhysicalSegmentLayout_has_ValueMappingPositionType[];
	/** The conceptual basis for the collection of members. */
	PhysicalSegmentLayout_isDefinedBy_Concept?: PhysicalSegmentLayoutPhysicalSegmentLayout_isDefinedBy_ConceptType[];
	/** Intent or reason for the object/the description of the object. */
	purpose?: InternationalString;
	/** "The string that is used around escaped cells, or null, set by the quoteChar property of a dialect description. The default is ".". See W3C Recommendation "Model for Tabular Data and Metadata on the Web", https://www.w3.org/TR/tabular-data-model/#parsing. From the W3C Recommendation "Metadata Vocabulary for Tabular Data" (https://www.w3.org/TR/tabular-metadata/) 5.9 Dialect: "quoteChar: An atomic property that sets the quote character flag to the single provided value, which MUST be a string or null. If the value is null, the escape character flag is also set to null. The default is '"'." From the CSV Dialect specification (http://specs.frictionlessdata.io/csv-dialect/): "quoteChar: specifies a one-character string to use as the quoting character. Default = "." */
	quoteCharacter?: string;
	/** If the value is True, blank rows are ignored. From the W3C Recommendation "Metadata Vocabulary for Tabular Data" (https://www.w3.org/TR/tabular-metadata/) 5.9 Dialect: "skipBlankRows: A boolean atomic property that sets the skip blank rows flag to the single provided boolean value. The default is false." */
	skipBlankRows?: boolean;
	/** The number of columns to skip at the beginning of the row. From the W3C Recommendation "Metadata Vocabulary for Tabular Data" (https://www.w3.org/TR/tabular-metadata/) 5.9 Dialect: "skipColumns: A numeric atomic property that sets the skip columns flag to the single provided numeric value, which MUST be a non-negative integer. The default is 0." A value other than 0 will mean that the source numbers of columns will be different from their numbers. */
	skipDataColumns?: number;
	/** If the value is True, skip whitespace at the beginning of a line or following a delimiter. From the W3C Recommendation "Metadata Vocabulary for Tabular Data" (https://www.w3.org/TR/tabular-metadata/) 5.9 Dialect: "skipInitialSpace: A boolean atomic property that, if true, sets the trim flag to 'start' and if false, to false. If the trim property is provided, the skipInitialSpace property is ignored. The default is false." From the CSV Dialect specification (http://specs.frictionlessdata.io/csv-dialect/): "skipInitialSpace: specifies how to interpret whitespace which immediately follows a delimiter; if false, it means that whitespace immediately after a delimiter should be treated as part of the following field. Default = true." */
	skipInitialSpace?: boolean;
	/** Number of input rows to skip preceding the header or data. From the W3C Recommendation "Metadata Vocabulary for Tabular Data" (https://www.w3.org/TR/tabular-metadata/) 5.9 Dialect: "skipRows: A numeric atomic property that sets the skip rows flag to the single provided numeric value, which MUST be a non-negative integer. The default is 0." A value greater than 0 will mean that the source numbers of rows will be different from their numbers. */
	skipRows?: number;
	/** Indicates the direction in which columns are arranged in each row. From the W3C Recommendation "Metadata Vocabulary for Tabular Data" (https://www.w3.org/TR/tabular-metadata/)  5.3.2: "tableDirection: An atomic property that MUST have a single string value that is one of 'rtl', 'ltr', or 'auto'. Indicates whether the tables in the group should be displayed with the first column on the right, on the left, or based on the first character in the table that has a specific direction. The value of this property becomes the value of the table direction annotation for all the tables in the table group. See Bidirectional Tables in [tabular-data-model] for details. The default value for this property is 'auto'." */
	tableDirection?: TableDirectionValues;
	/** Indicates the reading order of text within cells. From the W3C Recommendation "Metadata Vocabulary for Tabular Data" (https://www.w3.org/TR/tabular-metadata/) Inherited 5.7: "textDirection: An atomic property that MUST have a single string value that is one of 'ltr', 'rtl', 'auto' or 'inherit' (the default). Indicates whether the text within cells should be displayed as left-to-right text (ltr), as right-to-left text (rtl), according to the content of the cell (auto) or in the direction inherited from the table direction annotation of the table. The value of this property determines the text direction annotation for the column, and the text direction annotation for the cells within that column: if the value is inherit then the value of the text direction annotation is the value of the table direction annotation on the table, otherwise it is the value of this property. See Bidirectional Tables in [tabular-data-model] for details." */
	textDirection?: TextDirectionValues;
	/** If the value is True, consecutive (adjacent) delimiters are treated as a single delimiter; if the value is False consecutive (adjacent) delimiters indicate a missing value. */
	treatConsecutiveDelimitersAsOne?: boolean;
	/** Specifies which spaces to remove from a data value (start, end, both, neither) From the W3C Recommendation "Metadata Vocabulary for Tabular Data" (https://www.w3.org/TR/tabular-metadata/) 5.9 Dialect: "trim: An atomic property that, if the boolean true, sets the trim flag to true and if the boolean false to false. If the value provided is a string, sets the trim flag to the provided value, which MUST be one of 'true', 'false', 'start', or 'end'. The default is true." */
	trim?: TrimValues;
}
export interface PhysicalSegmentLayout extends _PhysicalSegmentLayout { constructor: { new(): PhysicalSegmentLayout }; }
export var PhysicalSegmentLayout: { new(): PhysicalSegmentLayout };

interface _PhysicalSegmentLayoutPhysicalSegmentLayout_formats_LogicalRecordType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: PhysicalSegmentLayoutPhysicalSegmentLayout_formats_LogicalRecordTypeValidTypeType[];
}
interface PhysicalSegmentLayoutPhysicalSegmentLayout_formats_LogicalRecordType extends _PhysicalSegmentLayoutPhysicalSegmentLayout_formats_LogicalRecordType { constructor: { new(): PhysicalSegmentLayoutPhysicalSegmentLayout_formats_LogicalRecordType }; }

type PhysicalSegmentLayoutPhysicalSegmentLayout_formats_LogicalRecordTypeValidTypeType = "LogicalRecord";
interface _PhysicalSegmentLayoutPhysicalSegmentLayout_formats_LogicalRecordTypeValidTypeType extends Primitive._string { content: PhysicalSegmentLayoutPhysicalSegmentLayout_formats_LogicalRecordTypeValidTypeType; }

interface _PhysicalSegmentLayoutPhysicalSegmentLayout_has_ValueMappingPositionType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType: PhysicalSegmentLayoutPhysicalSegmentLayout_has_ValueMappingPositionTypeValidTypeType[];
}
interface PhysicalSegmentLayoutPhysicalSegmentLayout_has_ValueMappingPositionType extends _PhysicalSegmentLayoutPhysicalSegmentLayout_has_ValueMappingPositionType { constructor: { new(): PhysicalSegmentLayoutPhysicalSegmentLayout_has_ValueMappingPositionType }; }

type PhysicalSegmentLayoutPhysicalSegmentLayout_has_ValueMappingPositionTypeValidTypeType = "ValueMappingPosition";
interface _PhysicalSegmentLayoutPhysicalSegmentLayout_has_ValueMappingPositionTypeValidTypeType extends Primitive._string { content: PhysicalSegmentLayoutPhysicalSegmentLayout_has_ValueMappingPositionTypeValidTypeType; }

interface _PhysicalSegmentLayoutPhysicalSegmentLayout_has_ValueMappingType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: PhysicalSegmentLayoutPhysicalSegmentLayout_has_ValueMappingTypeValidTypeType[];
}
interface PhysicalSegmentLayoutPhysicalSegmentLayout_has_ValueMappingType extends _PhysicalSegmentLayoutPhysicalSegmentLayout_has_ValueMappingType { constructor: { new(): PhysicalSegmentLayoutPhysicalSegmentLayout_has_ValueMappingType }; }

type PhysicalSegmentLayoutPhysicalSegmentLayout_has_ValueMappingTypeValidTypeType = "ValueMapping";
interface _PhysicalSegmentLayoutPhysicalSegmentLayout_has_ValueMappingTypeValidTypeType extends Primitive._string { content: PhysicalSegmentLayoutPhysicalSegmentLayout_has_ValueMappingTypeValidTypeType; }

interface _PhysicalSegmentLayoutPhysicalSegmentLayout_isDefinedBy_ConceptType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: PhysicalSegmentLayoutPhysicalSegmentLayout_isDefinedBy_ConceptTypeValidTypeType[];
}
interface PhysicalSegmentLayoutPhysicalSegmentLayout_isDefinedBy_ConceptType extends _PhysicalSegmentLayoutPhysicalSegmentLayout_isDefinedBy_ConceptType { constructor: { new(): PhysicalSegmentLayoutPhysicalSegmentLayout_isDefinedBy_ConceptType }; }

type PhysicalSegmentLayoutPhysicalSegmentLayout_isDefinedBy_ConceptTypeValidTypeType = ("Category" | "Concept" | "ConceptualValue" | "ConceptualVariable" | "DescriptorVariable" | "DimensionalKeyDefinitionMember" | "InstanceVariable" | "KeyDefinitionMember" | "Population" | "ReferenceVariable" | "RepresentedVariable" | "UnitType" | "Universe");
interface _PhysicalSegmentLayoutPhysicalSegmentLayout_isDefinedBy_ConceptTypeValidTypeType extends Primitive._string { content: PhysicalSegmentLayoutPhysicalSegmentLayout_isDefinedBy_ConceptTypeValidTypeType; }

/** Definition
  * ============
  * Location of a data point in a physical segment.
  *
  * Examples
  * ==========
  * A segment of text in a plain text file beginning at character 3 and ending at character 123. The location of the representation of a variable in a text file.
  *
  * Explanatory notes
  * ===================
  * While this has no properties or relationships of its own, it is useful as a target of relationships where its extensions may serve. This is an extension point since there are many different ways to describe the location of a segment - character counts, start and end times, etc. */
interface _PhysicalSegmentLocation extends BaseType {
	/** Bundles the information useful for a data catalog entry.
	  *
	  * Examples would be creator, contributor, title, copyright, embargo, and license information
	  *
	  * A set of information useful for attribution, data discovery, and access.
	  * This is information that is tied to the identity of the object. If this information changes the version of the associated object changes. */
	catalogDetails?: CatalogDetails;
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
}
export interface PhysicalSegmentLocation extends _PhysicalSegmentLocation { constructor: { new(): PhysicalSegmentLocation }; }
export var PhysicalSegmentLocation: { new(): PhysicalSegmentLocation };

/** Definition
  * ============
  * Provides an enumerated list of valid point format types for capturing a coordinate point. */
export type PointFormat = ("DecimalDegree" | "DecimalMinutes" | "DegreesMinutesSeconds" | "Feet" | "Meters");
interface _PointFormat extends Primitive._string { content: PointFormat; }

/** Definition
  * ============
  * Universe with time and geography specified.
  *
  * Examples
  * ==========
  * 1. Canadian adult persons residing in Canada on 13 November 1956.
  * 2. US computer companies at the end of 2012.
  * 3. Universities in Denmark 1 January 2011.
  *
  * Explanatory notes
  * ===================
  * Population is the most specific in the conceptually narrowing hierarchy of unit type, universe and population. Several populations having differing time and or geography may specialize the same universe. */
interface _Population extends _Universe {
	/** A unit in the population. */
	Population_isComposedOf_Unit?: PopulationPopulation_isComposedOf_UnitType[];
	/** The time period associated with the population. */
	timePeriodOfPopulation?: DateRange[];
}
export interface Population extends _Population { constructor: { new(): Population }; }
export var Population: { new(): Population };

interface _PopulationPopulation_isComposedOf_UnitType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: PopulationPopulation_isComposedOf_UnitTypeValidTypeType[];
}
interface PopulationPopulation_isComposedOf_UnitType extends _PopulationPopulation_isComposedOf_UnitType { constructor: { new(): PopulationPopulation_isComposedOf_UnitType }; }

type PopulationPopulation_isComposedOf_UnitTypeValidTypeType = "Unit";
interface _PopulationPopulation_isComposedOf_UnitTypeValidTypeType extends Primitive._string { content: PopulationPopulation_isComposedOf_UnitTypeValidTypeType; }

/** Definition
  * ============
  * Role of a set of data structure components for content linkage purposes
  *
  * Explanatory notes
  * ===================
  * Equivalent to primary key in the relational model.
  * A primary key essentially indicates which data structure components correspond to key members.
  * It can also be used in conjunction with foreign key to link data structures and their related datasets. */
interface _PrimaryKey extends BaseType {
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	PrimaryKey_isComposedOf_PrimaryKeyComponent: PrimaryKeyPrimaryKey_isComposedOf_PrimaryKeyComponentType[];
}
export interface PrimaryKey extends _PrimaryKey { constructor: { new(): PrimaryKey }; }
export var PrimaryKey: { new(): PrimaryKey };

/** Definition
  * ============
  * Role of a data structure component for content identification purposes
  *
  * Explanatory notes
  * ===================
  * Equivalent to a primary key attribute (i.e. column) in the relational model.
  * It can be used in conjunction with a foreign key component to link data structures and their related datasets. */
interface _PrimaryKeyComponent extends BaseType {
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	PrimaryKeyComponent_correspondsTo_DataStructureComponent: PrimaryKeyComponentPrimaryKeyComponent_correspondsTo_DataStructureComponentType;
}
export interface PrimaryKeyComponent extends _PrimaryKeyComponent { constructor: { new(): PrimaryKeyComponent }; }
export var PrimaryKeyComponent: { new(): PrimaryKeyComponent };

interface _PrimaryKeyComponentPrimaryKeyComponent_correspondsTo_DataStructureComponentType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: PrimaryKeyComponentPrimaryKeyComponent_correspondsTo_DataStructureComponentTypeValidTypeType[];
}
interface PrimaryKeyComponentPrimaryKeyComponent_correspondsTo_DataStructureComponentType extends _PrimaryKeyComponentPrimaryKeyComponent_correspondsTo_DataStructureComponentType { constructor: { new(): PrimaryKeyComponentPrimaryKeyComponent_correspondsTo_DataStructureComponentType }; }

type PrimaryKeyComponentPrimaryKeyComponent_correspondsTo_DataStructureComponentTypeValidTypeType = ("AttributeComponent" | "ContextualComponent" | "DataStructure" | "DataStructureComponent" | "DimensionComponent" | "DimensionalDataStructure" | "IdentifierComponent" | "KeyValueStructure" | "LongDataStructure" | "MeasureComponent" | "QualifiedMeasure" | "SyntheticIdComponent" | "VariableDescriptorComponent" | "VariableValueComponent" | "WideDataStructure");
interface _PrimaryKeyComponentPrimaryKeyComponent_correspondsTo_DataStructureComponentTypeValidTypeType extends Primitive._string { content: PrimaryKeyComponentPrimaryKeyComponent_correspondsTo_DataStructureComponentTypeValidTypeType; }

interface _PrimaryKeyPrimaryKey_isComposedOf_PrimaryKeyComponentType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType: PrimaryKeyPrimaryKey_isComposedOf_PrimaryKeyComponentTypeValidTypeType[];
}
interface PrimaryKeyPrimaryKey_isComposedOf_PrimaryKeyComponentType extends _PrimaryKeyPrimaryKey_isComposedOf_PrimaryKeyComponentType { constructor: { new(): PrimaryKeyPrimaryKey_isComposedOf_PrimaryKeyComponentType }; }

type PrimaryKeyPrimaryKey_isComposedOf_PrimaryKeyComponentTypeValidTypeType = "PrimaryKeyComponent";
interface _PrimaryKeyPrimaryKey_isComposedOf_PrimaryKeyComponentTypeValidTypeType extends Primitive._string { content: PrimaryKeyPrimaryKey_isComposedOf_PrimaryKeyComponentTypeValidTypeType; }

/** Definition
  * ============
  * References an image using the standard Image description. In addition to the standard attributes provides an effective date (period) and a privacy ranking. */
interface _PrivateImage extends BaseType {
	/** The period for which this image is effective/valid. */
	effectiveDates?: DateRange;
	/** Specify the level privacy for the image as public, restricted, or private. Supports the use of an external controlled vocabulary. */
	privacy?: ControlledVocabularyEntry;
}
export interface PrivateImage extends _PrivateImage { constructor: { new(): PrivateImage }; }
export var PrivateImage: { new(): PrivateImage };

/** Definition
  * ============
  * A processing agent orchestrates the production of information objects in a production environment. There are processing agents which perform data capture, data editing/processing, and data analysis (etc.), each in the appropriate production environments. The processing agent performs an activity based on the control logic.
  *
  * Examples
  * ==========
  * A processing agent initiates a data capture sequence, obtaining readings from a sensor. A processing agent initiates rule based scheduling. A processing agent is informed by control logic to invoke an imputation activity. */
interface _ProcessingAgent extends _Agent {
	ProcessingAgent_operatesOn_ProductionEnvironment: ProcessingAgentProcessingAgent_operatesOn_ProductionEnvironmentType[];
	/** A processing agent performs an activity at the direction of control logic. */
	ProcessingAgent_performs_Activity?: ProcessingAgentProcessingAgent_performs_ActivityType[];
}
export interface ProcessingAgent extends _ProcessingAgent { constructor: { new(): ProcessingAgent }; }
export var ProcessingAgent: { new(): ProcessingAgent };

interface _ProcessingAgentProcessingAgent_operatesOn_ProductionEnvironmentType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: ProcessingAgentProcessingAgent_operatesOn_ProductionEnvironmentTypeValidTypeType[];
}
interface ProcessingAgentProcessingAgent_operatesOn_ProductionEnvironmentType extends _ProcessingAgentProcessingAgent_operatesOn_ProductionEnvironmentType { constructor: { new(): ProcessingAgentProcessingAgent_operatesOn_ProductionEnvironmentType }; }

type ProcessingAgentProcessingAgent_operatesOn_ProductionEnvironmentTypeValidTypeType = "ProductionEnvironment";
interface _ProcessingAgentProcessingAgent_operatesOn_ProductionEnvironmentTypeValidTypeType extends Primitive._string { content: ProcessingAgentProcessingAgent_operatesOn_ProductionEnvironmentTypeValidTypeType; }

interface _ProcessingAgentProcessingAgent_performs_ActivityType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: ProcessingAgentProcessingAgent_performs_ActivityTypeValidTypeType[];
}
interface ProcessingAgentProcessingAgent_performs_ActivityType extends _ProcessingAgentProcessingAgent_performs_ActivityType { constructor: { new(): ProcessingAgentProcessingAgent_performs_ActivityType }; }

type ProcessingAgentProcessingAgent_performs_ActivityTypeValidTypeType = ("Activity" | "Step");
interface _ProcessingAgentProcessingAgent_performs_ActivityTypeValidTypeType extends Primitive._string { content: ProcessingAgentProcessingAgent_performs_ActivityTypeValidTypeType; }

/** Definition
  * ============
  * Production environments consume and produce information objects by way of processing pipelines orchestrated by the processing agent.
  *
  * Examples
  * ==========
  * Data processing platforms and data analysis platforms are types of production environments. Each of these platforms may have subtypes. */
interface _ProductionEnvironment extends BaseType {
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
}
export interface ProductionEnvironment extends _ProductionEnvironment { constructor: { new(): ProductionEnvironment }; }
export var ProductionEnvironment: { new(): ProductionEnvironment };

/** Definition
  * ============
  * Basic information about the provenance of the object. Includes a simple description, but not detailed modeling of a process. */
interface _ProvenanceInformation extends BaseType {
	/** Information about a funding source. */
	funding?: FundingInformation[];
	/** A statement of any changes in ownership and custody of the resource since its creation that are significant for its authenticity, integrity, and interpretation. */
	provenanceStatement?: InternationalString[];
	/** Date the record was created. */
	recordCreationDate?: Date;
	/** Date the record was last revised. */
	recordLastRevisionDate?: Date;
}
export interface ProvenanceInformation extends _ProvenanceInformation { constructor: { new(): ProvenanceInformation }; }
export var ProvenanceInformation: { new(): ProvenanceInformation };

/** Definition
  * ============
  * A measure having a specific production method.
  *
  * Examples
  * ==========
  * Seasonally adjusted monthly income. */
interface _QualifiedMeasure extends _MeasureComponent {
	QualifiedMeasure_refines_MeasureComponent?: QualifiedMeasureQualifiedMeasure_refines_MeasureComponentType;
}
export interface QualifiedMeasure extends _QualifiedMeasure { constructor: { new(): QualifiedMeasure }; }
export var QualifiedMeasure: { new(): QualifiedMeasure };

interface _QualifiedMeasureQualifiedMeasure_refines_MeasureComponentType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: QualifiedMeasureQualifiedMeasure_refines_MeasureComponentTypeValidTypeType[];
}
interface QualifiedMeasureQualifiedMeasure_refines_MeasureComponentType extends _QualifiedMeasureQualifiedMeasure_refines_MeasureComponentType { constructor: { new(): QualifiedMeasureQualifiedMeasure_refines_MeasureComponentType }; }

type QualifiedMeasureQualifiedMeasure_refines_MeasureComponentTypeValidTypeType = ("MeasureComponent" | "QualifiedMeasure");
interface _QualifiedMeasureQualifiedMeasure_refines_MeasureComponentTypeValidTypeType extends Primitive._string { content: QualifiedMeasureQualifiedMeasure_refines_MeasureComponentTypeValidTypeType; }

/** Definition
  * ============
  * Textual description of the rationale/purpose for the version change and a coded value to provide an internal processing flag within and organization or system. */
interface _RationaleDefinition extends BaseType {
	/** Rationale  ode is primarily for internal processing flags within an organization or system. Supports the use of an external controlled vocabulary. */
	rationaleCode?: ControlledVocabularyEntry;
	/** Textual description of the rationale/purpose for the version change to inform users as to the extent and implication of the version change. May be expressed in multiple languages. */
	rationaleDescription?: InternationalString;
}
export interface RationaleDefinition extends _RationaleDefinition { constructor: { new(): RationaleDefinition }; }
export var RationaleDefinition: { new(): RationaleDefinition };

/** Definition
  * ============
  * Relationships among record types within and between logical records.
  *
  * Examples
  * ==========
  * One logical record containing a PersonIdentifier and a PersonName and another logical record containing a MeasurementID, a PersonID, a SystolicPressure, and a DiastolicPressure could be linked by a record relation. The record relation could employ an instance variable value map to describe the linkage between  PersonIdentifier and PersonID.
  *
  * A household-level logical record might contain an instance variable called HouseholdID and a person-level logical record might contain an instance variable called HID. Describing a link between HouseholdID and HID would allow the linking of a person-level LogicalRecord to their corresponding household-level logical record.
  *
  * Explanatory notes
  * ===================
  * For instance variables existing in a logical record with multiple record layouts, pairs of instance variables may function as paired keys to permit the expression of hierarchical links between records of different types. These links between keys in different record types could also be used to link records in a relational structure. */
interface _RecordRelation extends BaseType {
	/** Bundles the information useful for a data catalog entry.
	  *
	  * Examples would be creator, contributor, title, copyright, embargo, and license information
	  *
	  * A set of information useful for attribution, data discovery, and access.
	  * This is information that is tied to the identity of the object. If this information changes the version of the associated object changes. */
	catalogDetails?: CatalogDetails;
	/** A human-readable display label for the object. Supports the use of multiple languages. Repeat for labels with different content, for example, labels with differing length limitations. */
	displayLabel?: LabelForDisplay[];
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	/** Intent or reason for the object/the description of the object. */
	purpose?: InternationalString;
	RecordRelation_has_InstanceVariableMap?: RecordRelationRecordRelation_has_InstanceVariableMapType[];
	RecordRelation_maps_LogicalRecord: RecordRelationRecordRelation_maps_LogicalRecordType[];
	/** Explanation of the ways in which the object is employed. */
	usage?: InternationalString;
}
export interface RecordRelation extends _RecordRelation { constructor: { new(): RecordRelation }; }
export var RecordRelation: { new(): RecordRelation };

interface _RecordRelationRecordRelation_has_InstanceVariableMapType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: RecordRelationRecordRelation_has_InstanceVariableMapTypeValidTypeType[];
}
interface RecordRelationRecordRelation_has_InstanceVariableMapType extends _RecordRelationRecordRelation_has_InstanceVariableMapType { constructor: { new(): RecordRelationRecordRelation_has_InstanceVariableMapType }; }

type RecordRelationRecordRelation_has_InstanceVariableMapTypeValidTypeType = "InstanceVariableMap";
interface _RecordRelationRecordRelation_has_InstanceVariableMapTypeValidTypeType extends Primitive._string { content: RecordRelationRecordRelation_has_InstanceVariableMapTypeValidTypeType; }

interface _RecordRelationRecordRelation_maps_LogicalRecordType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: RecordRelationRecordRelation_maps_LogicalRecordTypeValidTypeType[];
}
interface RecordRelationRecordRelation_maps_LogicalRecordType extends _RecordRelationRecordRelation_maps_LogicalRecordType { constructor: { new(): RecordRelationRecordRelation_maps_LogicalRecordType }; }

type RecordRelationRecordRelation_maps_LogicalRecordTypeValidTypeType = "LogicalRecord";
interface _RecordRelationRecordRelation_maps_LogicalRecordTypeValidTypeType extends Primitive._string { content: RecordRelationRecordRelation_maps_LogicalRecordTypeValidTypeType; }

/** Definition
  * ============
  * Provides a way of pointing to resources outside of the information described in the set of DDI-CDI metadata. */
interface _Reference extends BaseType {
	/** A DDI type reference to a DDI object. */
	ddiReference?: InternationalRegistrationDataIdentifier;
	/** The selector refers to the object identifier by the ddiReference and has deep linking purposes. */
	deepLink?: Selector;
	/** Human-readable description of the reference. */
	description?: string;
	/** The location of the referenced resource, as appropriate to support retrieval. */
	location?: InternationalString;
	/** A non-DDI reference to any object using a system of identification which is not supported by a URI. */
	nonDdiReference?: NonDdiIdentifier[];
	/** External qualifier to describe the purpose or meaning of the reference. */
	semantic?: ControlledVocabularyEntry;
	/** A URI to any object. */
	uri?: string;
	/** The expected type of the reference (e.g., the class or element according to the schema of the referenced resource). */
	validType?: string[];
}
export interface Reference extends _Reference { constructor: { new(): Reference }; }
export var Reference: { new(): Reference };

/** Definition
  * ============
  * Recorded value in a variable value component.
  * Value referenced by a descriptor.
  *
  * Examples
  * ==========
  * Consider two variables, i.e. income and age, with values appearing in the same column, e.g. 100000, 45, 85000, 34, etc.
  * Codes "income" and "age" are descriptors whereas 100000, 45, 85000, 34 are reference values. */
interface _ReferenceValue extends _InstanceValue {
	ReferenceValue_correspondsTo_VariableValueComponent: ReferenceValueReferenceValue_correspondsTo_VariableValueComponentType;
	ReferenceValue_hasValueFrom_ReferenceValueDomain: ReferenceValueReferenceValue_hasValueFrom_ReferenceValueDomainType;
}
export interface ReferenceValue extends _ReferenceValue { constructor: { new(): ReferenceValue }; }
export var ReferenceValue: { new(): ReferenceValue };

/** Definition
  * ============
  * Set of permissible values for a variable playing the role of a variable value component.
  *
  * Examples
  * ==========
  * Consider two variables, i.e. income and age, with values appearing in the same column. A reference variable in this case would be a type of represented variable that can take on values from both income and age. A long data structure might have a column that takes on values from this reference variable. A descriptor variable would then have values paired with the values from the reference variable, pointing to either the income or age variable. */
interface _ReferenceValueDomain extends _ValueDomain {}
export interface ReferenceValueDomain extends _ReferenceValueDomain { constructor: { new(): ReferenceValueDomain }; }
export var ReferenceValueDomain: { new(): ReferenceValueDomain };

interface _ReferenceValueReferenceValue_correspondsTo_VariableValueComponentType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: ReferenceValueReferenceValue_correspondsTo_VariableValueComponentTypeValidTypeType[];
}
interface ReferenceValueReferenceValue_correspondsTo_VariableValueComponentType extends _ReferenceValueReferenceValue_correspondsTo_VariableValueComponentType { constructor: { new(): ReferenceValueReferenceValue_correspondsTo_VariableValueComponentType }; }

type ReferenceValueReferenceValue_correspondsTo_VariableValueComponentTypeValidTypeType = "VariableValueComponent";
interface _ReferenceValueReferenceValue_correspondsTo_VariableValueComponentTypeValidTypeType extends Primitive._string { content: ReferenceValueReferenceValue_correspondsTo_VariableValueComponentTypeValidTypeType; }

interface _ReferenceValueReferenceValue_hasValueFrom_ReferenceValueDomainType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: ReferenceValueReferenceValue_hasValueFrom_ReferenceValueDomainTypeValidTypeType[];
}
interface ReferenceValueReferenceValue_hasValueFrom_ReferenceValueDomainType extends _ReferenceValueReferenceValue_hasValueFrom_ReferenceValueDomainType { constructor: { new(): ReferenceValueReferenceValue_hasValueFrom_ReferenceValueDomainType }; }

type ReferenceValueReferenceValue_hasValueFrom_ReferenceValueDomainTypeValidTypeType = "ReferenceValueDomain";
interface _ReferenceValueReferenceValue_hasValueFrom_ReferenceValueDomainTypeValidTypeType extends Primitive._string { content: ReferenceValueReferenceValue_hasValueFrom_ReferenceValueDomainTypeValidTypeType; }

/** Definition
  * ============
  * Variable that records values of multiple variables in the context of a data structure.
  * Variable playing the role of a variable value component.
  *
  * Examples
  * ==========
  * Consider two variables, i.e. income and age, with values appearing in the same column, e.g. 100000, 45, 85000, 34, etc.
  * Values 100000, 45, 85000, 34 are reference values in the reference value domain corresponding to the reference variable. */
interface _ReferenceVariable extends _RepresentedVariable {
	/** Points to a value domain that contains values that may be drawn from the domains of multiple simple variables. */
	ReferenceVariable_takesValuesFrom_ReferenceValueDomain?: ReferenceVariableReferenceVariable_takesValuesFrom_ReferenceValueDomainType;
}
export interface ReferenceVariable extends _ReferenceVariable { constructor: { new(): ReferenceVariable }; }
export var ReferenceVariable: { new(): ReferenceVariable };

interface _ReferenceVariableReferenceVariable_takesValuesFrom_ReferenceValueDomainType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: ReferenceVariableReferenceVariable_takesValuesFrom_ReferenceValueDomainTypeValidTypeType[];
}
interface ReferenceVariableReferenceVariable_takesValuesFrom_ReferenceValueDomainType extends _ReferenceVariableReferenceVariable_takesValuesFrom_ReferenceValueDomainType { constructor: { new(): ReferenceVariableReferenceVariable_takesValuesFrom_ReferenceValueDomainType }; }

type ReferenceVariableReferenceVariable_takesValuesFrom_ReferenceValueDomainTypeValidTypeType = "ReferenceValueDomain";
interface _ReferenceVariableReferenceVariable_takesValuesFrom_ReferenceValueDomainTypeValidTypeType extends Primitive._string { content: ReferenceVariableReferenceVariable_takesValuesFrom_ReferenceValueDomainTypeValidTypeType; }

/** Definition
  * ==========
  * Conceptual variable with a substantive value domain specified.
  *
  * Examples
  * ==========
  * The pair (Number of Employees, Integer), where "Number of Employees" is the characteristic of the population (variable) and "Integer" is how that measure will be represented (value domain).
  *
  * Explanatory notes
  * ===================
  * Extends from conceptual variable and can contain all descriptive fields without creating a conceptual variable. By referencing a conceptual variable it can indicate a common relationship with represented variables expressing the same characteristic of a universe measured in another way, such as Age of Persons in hours rather than years. Represented variable constrains the coverage of the unit type to a specific universe. In the above case the universe with the measurement of Age in hours may be constrained to Persons under 5 days (120 hours old). Represented variable can define sentinel values for multiple storage systems which have the same conceptual domain but specialized value domains. */
interface _RepresentedVariable extends _ConceptualVariable {
	/** The unit in which the data values are measured (kg, pound, euro), expressed as a value from a controlled system of entries (i.e., QDT). Supports the provision of an identifier for the entry in the authoritative source (a URI, etc.), and the specific vocabulary. */
	describedUnitOfMeasure?: ControlledVocabularyEntry;
	/** The data type intended to be used by this variable. Supports the optional use of an external controlled vocabulary. */
	hasIntendedDataType?: ControlledVocabularyEntry;
	/** A represented variable may have more than one sets of sentinel value domains, one for each type of software platform on which related instance variables might be instantiated. All of the sentinel value domains must have sentinel conceptual domains that correspond exactly. This allows codes for missing values to be explicitly matched across platforms. */
	RepresentedVariable_takesSentinelValuesFrom_SentinelValueDomain?: RepresentedVariableRepresentedVariable_takesSentinelValuesFrom_SentinelValueDomainType[];
	/** The substantive representation (substantive value domain) of the variable. This is equivalent to the relationship "Measures" in the Generic Statistical Information Model (GSIM) although GSIM makes no distinction between substantive and sentinel values. */
	RepresentedVariable_takesSubstantiveValuesFrom_SubstantiveValueDomain?: RepresentedVariableRepresentedVariable_takesSubstantiveValuesFrom_SubstantiveValueDomainType;
	/** The unit in which the data values are measured (kg, pound, euro), expressed as a simple string, in cases where no additional information is available (in the legacy system) or needed (as in the case of broad agreement within the community of use [i.e., ISO country codes, currencies, etc. in SDMX]) */
	simpleUnitOfMeasure?: string;
}
export interface RepresentedVariable extends _RepresentedVariable { constructor: { new(): RepresentedVariable }; }
export var RepresentedVariable: { new(): RepresentedVariable };

interface _RepresentedVariableRepresentedVariable_takesSentinelValuesFrom_SentinelValueDomainType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: RepresentedVariableRepresentedVariable_takesSentinelValuesFrom_SentinelValueDomainTypeValidTypeType[];
}
interface RepresentedVariableRepresentedVariable_takesSentinelValuesFrom_SentinelValueDomainType extends _RepresentedVariableRepresentedVariable_takesSentinelValuesFrom_SentinelValueDomainType { constructor: { new(): RepresentedVariableRepresentedVariable_takesSentinelValuesFrom_SentinelValueDomainType }; }

type RepresentedVariableRepresentedVariable_takesSentinelValuesFrom_SentinelValueDomainTypeValidTypeType = "SentinelValueDomain";
interface _RepresentedVariableRepresentedVariable_takesSentinelValuesFrom_SentinelValueDomainTypeValidTypeType extends Primitive._string { content: RepresentedVariableRepresentedVariable_takesSentinelValuesFrom_SentinelValueDomainTypeValidTypeType; }

interface _RepresentedVariableRepresentedVariable_takesSubstantiveValuesFrom_SubstantiveValueDomainType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: RepresentedVariableRepresentedVariable_takesSubstantiveValuesFrom_SubstantiveValueDomainTypeValidTypeType[];
}
interface RepresentedVariableRepresentedVariable_takesSubstantiveValuesFrom_SubstantiveValueDomainType extends _RepresentedVariableRepresentedVariable_takesSubstantiveValuesFrom_SubstantiveValueDomainType { constructor: { new(): RepresentedVariableRepresentedVariable_takesSubstantiveValuesFrom_SubstantiveValueDomainType }; }

type RepresentedVariableRepresentedVariable_takesSubstantiveValuesFrom_SubstantiveValueDomainTypeValidTypeType = ("DescriptorValueDomain" | "SubstantiveValueDomain");
interface _RepresentedVariableRepresentedVariable_takesSubstantiveValuesFrom_SubstantiveValueDomainTypeValidTypeType extends Primitive._string { content: RepresentedVariableRepresentedVariable_takesSubstantiveValuesFrom_SubstantiveValueDomainTypeValidTypeType; }

/** Definition
  * ============
  * A datum that can be qualified by a revision.
  *
  * Examples
  * ==========
  * The April datum for Income revised in June. */
interface _RevisableDatum extends _Datum {
	RevisableDatum_correspondsTo_Revision?: RevisableDatumRevisableDatum_correspondsTo_RevisionType;
	/** A revision sequence number for a datum. */
	vintage: number;
}
export interface RevisableDatum extends _RevisableDatum { constructor: { new(): RevisableDatum }; }
export var RevisableDatum: { new(): RevisableDatum };

interface _RevisableDatumRevisableDatum_correspondsTo_RevisionType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: RevisableDatumRevisableDatum_correspondsTo_RevisionTypeValidTypeType[];
}
interface RevisableDatumRevisableDatum_correspondsTo_RevisionType extends _RevisableDatumRevisableDatum_correspondsTo_RevisionType { constructor: { new(): RevisableDatumRevisableDatum_correspondsTo_RevisionType }; }

type RevisableDatumRevisableDatum_correspondsTo_RevisionTypeValidTypeType = "Revision";
interface _RevisableDatumRevisableDatum_correspondsTo_RevisionTypeValidTypeType extends Primitive._string { content: RevisableDatumRevisableDatum_correspondsTo_RevisionTypeValidTypeType; }

/** Definition
  * ============
  * Algorithm applied to produce a revised datum.
  *
  * Examples
  * ==========
  * An adjustment to monthly employment numbers to adjust for errors (sampling or non-sampling) in the underlying data. */
interface _Revision extends BaseType {
	/** Actual code or reference to specific algorithm */
	algorithm?: string;
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	/** Short natural language account of the information obtained from the combination of properties and relationships associated with an object. */
	overview?: InternationalString;
}
export interface Revision extends _Revision { constructor: { new(): Revision }; }
export var Revision: { new(): Revision };

/** Definition
  * ============
  * A rule has a condition part and an action part. A rule takes the form of: If [Condition} Then [Action]. A rule belongs to a rule set which is a component of rule based scheduling performed by the processing agent
  *
  * Examples
  * ==========
  * If Exists [InformationObject] Then Perform [Activity] */
interface _Rule extends BaseType {
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	/** The condition part of a rule is associated with conditonal control logic. */
	Rule_hasPrecondition_ConditionalControlLogic?: RuleRule_hasPrecondition_ConditionalControlLogicType[];
}
export interface Rule extends _Rule { constructor: { new(): Rule }; }
export var Rule: { new(): Rule };

/** Definition
  * ============
  * Rule based scheduling performs a fact check on rules from the rule set, testing their condition part against the facts in the research data store. Fact checking may be assisted by a curator who can semantically compare the condition part of each candidate rule with the facts. The fact checker returns the next activity which rule based scheduling performs according to the following function: factcheck (RuleSet, ResearchDataStore, Curator): Activity.
  *
  * Examples
  * ==========
  * One real-life situation in which rule-based scheduling is performed involves data virtualization. Here the research datastore has a catalog of views available for use. Rule based scheduling might explore the catalog to determine the rule(s) in the rule set that currently apply. A software curator might assist in the decision in case there was no exact match between a rule and its condition(s) and given the current state of the research datastore. The curator typically uses natural language processing.
  *
  * Explanatory notes
  * ===================
  * Rule based scheduling is guided by its scheduling strategy. This is described by an enumeration that consists of "forwardChaining" and "backwardChaining". */
interface _RuleBasedScheduling extends _NonDeterministicDeclarative {
	/** Rule based scheduling has one or more curators. The curators may be commercial/off-the-shelf, open source and/or home grown. They are likely to be domain-specific which is why rule based scheduling might employ many. */
	RuleBasedScheduling_has_Curator?: RuleBasedSchedulingRuleBasedScheduling_has_CuratorType[];
	/** Rule sets are a component of rule based scheduling. */
	RuleBasedScheduling_has_RuleSet?: RuleBasedSchedulingRuleBasedScheduling_has_RuleSetType[];
	/** Indicated if rule-based scheduling is forward-chaining or backward-chaining. */
	schedulingType: SchedulingStrategy;
}
export interface RuleBasedScheduling extends _RuleBasedScheduling { constructor: { new(): RuleBasedScheduling }; }
export var RuleBasedScheduling: { new(): RuleBasedScheduling };

interface _RuleBasedSchedulingRuleBasedScheduling_has_CuratorType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: RuleBasedSchedulingRuleBasedScheduling_has_CuratorTypeValidTypeType[];
}
interface RuleBasedSchedulingRuleBasedScheduling_has_CuratorType extends _RuleBasedSchedulingRuleBasedScheduling_has_CuratorType { constructor: { new(): RuleBasedSchedulingRuleBasedScheduling_has_CuratorType }; }

type RuleBasedSchedulingRuleBasedScheduling_has_CuratorTypeValidTypeType = "Curator";
interface _RuleBasedSchedulingRuleBasedScheduling_has_CuratorTypeValidTypeType extends Primitive._string { content: RuleBasedSchedulingRuleBasedScheduling_has_CuratorTypeValidTypeType; }

interface _RuleBasedSchedulingRuleBasedScheduling_has_RuleSetType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: RuleBasedSchedulingRuleBasedScheduling_has_RuleSetTypeValidTypeType[];
}
interface RuleBasedSchedulingRuleBasedScheduling_has_RuleSetType extends _RuleBasedSchedulingRuleBasedScheduling_has_RuleSetType { constructor: { new(): RuleBasedSchedulingRuleBasedScheduling_has_RuleSetType }; }

type RuleBasedSchedulingRuleBasedScheduling_has_RuleSetTypeValidTypeType = "RuleSet";
interface _RuleBasedSchedulingRuleBasedScheduling_has_RuleSetTypeValidTypeType extends Primitive._string { content: RuleBasedSchedulingRuleBasedScheduling_has_RuleSetTypeValidTypeType; }

interface _RuleRule_hasPrecondition_ConditionalControlLogicType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: RuleRule_hasPrecondition_ConditionalControlLogicTypeValidTypeType[];
}
interface RuleRule_hasPrecondition_ConditionalControlLogicType extends _RuleRule_hasPrecondition_ConditionalControlLogicType { constructor: { new(): RuleRule_hasPrecondition_ConditionalControlLogicType }; }

type RuleRule_hasPrecondition_ConditionalControlLogicTypeValidTypeType = "ConditionalControlLogic";
interface _RuleRule_hasPrecondition_ConditionalControlLogicTypeValidTypeType extends Primitive._string { content: RuleRule_hasPrecondition_ConditionalControlLogicTypeValidTypeType; }

/** Definition
  * ============
  * A rule set is a collection of rules. A rule set is a component of rule based scheduling.
  *
  * Examples
  * ==========
  * If [A overlaps B] Then [X] If [B occurs before C] Then [Y] If [C equals D] Then [Z]  It might take a curator to understand what these rules mean in the context of a research data store.
  *
  * Explanatory notes
  * ===================
  * Rule based scheduling might have multiple rule sets each of which are domain-specific. The processing agent often helps with the selection of rule sets. */
interface _RuleSet extends BaseType {
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	/** A rule is a member of a rule set. */
	RuleSet_has_Rule?: RuleSetRuleSet_has_RuleType[];
}
export interface RuleSet extends _RuleSet { constructor: { new(): RuleSet }; }
export var RuleSet: { new(): RuleSet };

interface _RuleSetRuleSet_has_RuleType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: RuleSetRuleSet_has_RuleTypeValidTypeType[];
}
interface RuleSetRuleSet_has_RuleType extends _RuleSetRuleSet_has_RuleType { constructor: { new(): RuleSetRuleSet_has_RuleType }; }

type RuleSetRuleSet_has_RuleTypeValidTypeType = "Rule";
interface _RuleSetRuleSet_has_RuleTypeValidTypeType extends Primitive._string { content: RuleSetRuleSet_has_RuleTypeValidTypeType; }

/** Definition
  * ============
  * Enumeration that consists of forward chaining and backward chaining. Rule based scheduling is guided by its scheduling strategy. */
export type SchedulingStrategy = ("BackwardChaining" | "ForwardChaining");
interface _SchedulingStrategy extends Primitive._string { content: SchedulingStrategy; }

/** Definition
  * ==========
  * A qualified measure whose domain is a universe as an aggregate, i.e. a measure with a specific production method applied to a specific cell in a cube.
  *
  * Examples
  * ========
  * Seasonally adjusted income for Single, Ontarians, Females. */
interface _ScopedMeasure extends BaseType {
	/** Time interval between successive measurements (i.e. applications) of a Scoped Measure. */
	frequency?: InternationalString;
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	/** A universe is specific to the specific cell associated with a scoped measure. */
	ScopedMeasure_circumscribes_DimensionalKeyDefinition?: ScopedMeasureScopedMeasure_circumscribes_DimensionalKeyDefinitionType;
	/** Scoped measure generates one revisable datum. */
	ScopedMeasure_generates_RevisableDatum: ScopedMeasureScopedMeasure_generates_RevisableDatumType;
	/** A scoped measure resticts a qualified measure to a particular cell. */
	ScopedMeasure_restricts_QualifiedMeasure?: ScopedMeasureScopedMeasure_restricts_QualifiedMeasureType;
}
export interface ScopedMeasure extends _ScopedMeasure { constructor: { new(): ScopedMeasure }; }
export var ScopedMeasure: { new(): ScopedMeasure };

interface _ScopedMeasureScopedMeasure_circumscribes_DimensionalKeyDefinitionType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: ScopedMeasureScopedMeasure_circumscribes_DimensionalKeyDefinitionTypeValidTypeType[];
}
interface ScopedMeasureScopedMeasure_circumscribes_DimensionalKeyDefinitionType extends _ScopedMeasureScopedMeasure_circumscribes_DimensionalKeyDefinitionType { constructor: { new(): ScopedMeasureScopedMeasure_circumscribes_DimensionalKeyDefinitionType }; }

type ScopedMeasureScopedMeasure_circumscribes_DimensionalKeyDefinitionTypeValidTypeType = "DimensionalKeyDefinition";
interface _ScopedMeasureScopedMeasure_circumscribes_DimensionalKeyDefinitionTypeValidTypeType extends Primitive._string { content: ScopedMeasureScopedMeasure_circumscribes_DimensionalKeyDefinitionTypeValidTypeType; }

interface _ScopedMeasureScopedMeasure_generates_RevisableDatumType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType: ScopedMeasureScopedMeasure_generates_RevisableDatumTypeValidTypeType[];
}
interface ScopedMeasureScopedMeasure_generates_RevisableDatumType extends _ScopedMeasureScopedMeasure_generates_RevisableDatumType { constructor: { new(): ScopedMeasureScopedMeasure_generates_RevisableDatumType }; }

type ScopedMeasureScopedMeasure_generates_RevisableDatumTypeValidTypeType = "RevisableDatum";
interface _ScopedMeasureScopedMeasure_generates_RevisableDatumTypeValidTypeType extends Primitive._string { content: ScopedMeasureScopedMeasure_generates_RevisableDatumTypeValidTypeType; }

interface _ScopedMeasureScopedMeasure_restricts_QualifiedMeasureType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: ScopedMeasureScopedMeasure_restricts_QualifiedMeasureTypeValidTypeType[];
}
interface ScopedMeasureScopedMeasure_restricts_QualifiedMeasureType extends _ScopedMeasureScopedMeasure_restricts_QualifiedMeasureType { constructor: { new(): ScopedMeasureScopedMeasure_restricts_QualifiedMeasureType }; }

type ScopedMeasureScopedMeasure_restricts_QualifiedMeasureTypeValidTypeType = "QualifiedMeasure";
interface _ScopedMeasureScopedMeasure_restricts_QualifiedMeasureTypeValidTypeType extends Primitive._string { content: ScopedMeasureScopedMeasure_restricts_QualifiedMeasureTypeValidTypeType; }

/** Definition
  * ============
  * Location of a segment of text through character or line counts.
  *
  * Examples
  * ==========
  * The segment beginning at line 3, character 4 and ending at line 27 character 13. Alternatively the segment beginning at character 257 and ending at character 1350 of the whole body of text. StartLine of 10, endLine of 12, startCharacterPosition of 1, endCharacterPosition of 0 means all of lines 10, 11, and 12.  An endCharacterPosition of 0 indicates that whole lines are specified.
  *
  * Explanatory notes
  * ===================
  * An adequate description will always include a startCharacterPosition and then may include an endCharacterPosition or a characterLength. If StartLine is specified, the character counts begin within that line. */
interface _SegmentByText extends _PhysicalSegmentLocation {
	/** The number of characters in the segment. The segment may include text from multiple lines of the resource. If it does, the length includes any line termination characters. */
	characterLength?: number;
	/** The character position of the last character of the segment.  If endLine is specified, the count begins at character 1 of endLine. If startLine and endLine are not specified, the count begins at character 1 of the first line of the resource and the count includes any line termination characters. The resulting segment may include text from multiple lines of the resource. */
	endCharacterPosition?: number;
	/** The last line on which to count characters. If missing this defaults to startLine. */
	endLine?: number;
	/** The character position of the first character of the segment, with the count beginning at character 1 of startLine. */
	startCharacterPosition?: number;
	/** The line number, where 1 is the first line, on which to begin counting characters. If missing this defaults to 1 (the first line). */
	startLine?: number;
}
export interface SegmentByText extends _SegmentByText { constructor: { new(): SegmentByText }; }
export var SegmentByText: { new(): SegmentByText };

/** Definition
  * ==========
  * A resource which describes the segment of interest in a representation of a resource. This class is not used directly, only its subclasses. It is defined accordingly the related selector of the Web Annotation Vocabulary, see https://www.w3.org/TR/annotation-vocab/#selector. */
interface _Selector extends BaseType {}
export interface Selector extends _Selector { constructor: { new(): Selector }; }
export var Selector: { new(): Selector };

/** Definition
  * ==========
  * Conceptual domain of sentinel concepts.
  *
  * Examples
  * ========
  *
  * - Refused
  * - Don't know
  * - Lost in processing
  *
  * Explanatory notes
  * =================
  * Sentinel values are intended for processing purposes whereas substantive values are used for subject matter concerns. */
interface _SentinelConceptualDomain extends _ConceptualDomain {}
export interface SentinelConceptualDomain extends _SentinelConceptualDomain { constructor: { new(): SentinelConceptualDomain }; }
export var SentinelConceptualDomain: { new(): SentinelConceptualDomain };

/** Definition
  * ============
  * Value domain for a sentinel conceptual domain.
  *
  * Examples
  * ==========
  * Missing categories expressed as codes: -9, refused; -8, Don't Know; for a numeric variable with values greater than zero.
  *
  * Explanatory notes
  * ===================
  * Sentinel values are defined in ISO 11404 as "element of a value space that is not completely consistent with a datatype's properties and characterizing operations...". A common example would be codes for missing values. Sentinel values are used for processing, not to describe subject matter. Typical examples include missing values or invalid entry codes. Sentinel value domains are typically of the enumerated type, but they can be the described type, too. This is not to say that sentinel values carry no information. Data on gender might be enumerated by "0, male" and "1, female". These are the substantive values (see substantive value domain). However, there may be the need to include missing values along with that data, such as "m, missing" and "r, refused". These are sentinel values.  ISO/IEC 11404 - General Purpose Datatypes, defines sentinel values in terms of how that standard defines datatypes. But, the fact that the sentinels don't fit in terms of the calculations and statistics one would perform on the "clean" data is a distinguishing characteristic. In the example above, one would not include missing or refused data in calculating a ratio of females to the total population. Sentinel values may be described rather than enumerated. For instance, there might be a range of values, each representing an out of range value, but there could be too many to enumerate. It is easier to describe the range.  In some software missing values are represented as values not in the datatype of the valid values. R has values of NA, NaN, Inf, and -Inf. SAS and Stata have values displayed as ".", ".A" through ".Z", and "._"  Other software might use values like 999 for missing that would otherwise be the same datatype as valid values but outside the parameters of the domain. In the gender example above: For SPSS the sentinel values might be represented as: 998 = "refused" 999 = "not recorded"  For SAS or Stata the sentinel values might be represented as: .R = "refused" .N = "not recorded"  Sentinel values can also be used for other purposes beyond missing. For a numeric variable "A" might represent a value somewhere in a defined range to prevent disclosure of information about an individual. This might be considered a "semi-missing value". In SAS or Stata for example: .A = "greater than or equal to 100 and less than 1000 ". */
interface _SentinelValueDomain extends _ValueDomain {
	/** The type of platform under which sentinel codes will be used. Statistical software platforms use different sets of codes to indicate missing values. The external controlled vocabulary should list platform types and a description of the allowed missing value types. A sample list would be:
	  *
	  * - BlankString - A Blank string indicates missing. Comparison is based on lexical order.
	  * - EmptyString - An empty string indicates missing. Use in comparisons returns missing.
	  * - Rstyle - Codes drawn from  NA and the IEEE 754 values of NaN  -Inf   +Inf.   Comparisons return NA.
	  * - SASNumeric - codes drawn from . ._ .A .B .C .D .E .F .G .H .I .J .K .L .M .N .O .P .Q .R .S .T .U .V .W .X .Y .Z    Sentinel code treated as less than any substantive value
	  * - SPSSstyle - System missing (a dot) a set of individual values drawn from the same datatype as the SubstantiveValueDomain, and a range of values  drawn from the same datatype as the SubstantiveValueDomain. Comparisons return system missing. Some functions substitute with valid values (e.g. SUM replaces missing values with 0).
	  * - StataNumeric - codes drawn from . ._ .A .B .C .D .E .F .G .H .I .J .K .L .M .N .O .P .Q .R .S .T .U .V .W .X .Y .Z  Sentinel code treated as greater than any substantive value  - Unrestricted - No restrictions on codes for sentinel values. Use in comparisons is indeterminate. */
	platformType?: ControlledVocabularyEntry;
	/** A formal description of the set of valid values - for described value domains. */
	SentinelValueDomain_isDescribedBy_ValueAndConceptDescription?: SentinelValueDomainSentinelValueDomain_isDescribedBy_ValueAndConceptDescriptionType;
	/** Corresponding conceptual definition given by a sentinel conceptual domain. */
	SentinelValueDomain_takesConceptsFrom_SentinelConceptualDomain?: SentinelValueDomainSentinelValueDomain_takesConceptsFrom_SentinelConceptualDomainType;
	/** Any subtype of an enumeration domain enumerating the set of valid values. */
	SentinelValueDomain_takesValuesFrom_EnumerationDomain?: SentinelValueDomainSentinelValueDomain_takesValuesFrom_EnumerationDomainType;
}
export interface SentinelValueDomain extends _SentinelValueDomain { constructor: { new(): SentinelValueDomain }; }
export var SentinelValueDomain: { new(): SentinelValueDomain };

interface _SentinelValueDomainSentinelValueDomain_isDescribedBy_ValueAndConceptDescriptionType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: SentinelValueDomainSentinelValueDomain_isDescribedBy_ValueAndConceptDescriptionTypeValidTypeType[];
}
interface SentinelValueDomainSentinelValueDomain_isDescribedBy_ValueAndConceptDescriptionType extends _SentinelValueDomainSentinelValueDomain_isDescribedBy_ValueAndConceptDescriptionType { constructor: { new(): SentinelValueDomainSentinelValueDomain_isDescribedBy_ValueAndConceptDescriptionType }; }

type SentinelValueDomainSentinelValueDomain_isDescribedBy_ValueAndConceptDescriptionTypeValidTypeType = "ValueAndConceptDescription";
interface _SentinelValueDomainSentinelValueDomain_isDescribedBy_ValueAndConceptDescriptionTypeValidTypeType extends Primitive._string { content: SentinelValueDomainSentinelValueDomain_isDescribedBy_ValueAndConceptDescriptionTypeValidTypeType; }

interface _SentinelValueDomainSentinelValueDomain_takesConceptsFrom_SentinelConceptualDomainType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: SentinelValueDomainSentinelValueDomain_takesConceptsFrom_SentinelConceptualDomainTypeValidTypeType[];
}
interface SentinelValueDomainSentinelValueDomain_takesConceptsFrom_SentinelConceptualDomainType extends _SentinelValueDomainSentinelValueDomain_takesConceptsFrom_SentinelConceptualDomainType { constructor: { new(): SentinelValueDomainSentinelValueDomain_takesConceptsFrom_SentinelConceptualDomainType }; }

type SentinelValueDomainSentinelValueDomain_takesConceptsFrom_SentinelConceptualDomainTypeValidTypeType = "SentinelConceptualDomain";
interface _SentinelValueDomainSentinelValueDomain_takesConceptsFrom_SentinelConceptualDomainTypeValidTypeType extends Primitive._string { content: SentinelValueDomainSentinelValueDomain_takesConceptsFrom_SentinelConceptualDomainTypeValidTypeType; }

interface _SentinelValueDomainSentinelValueDomain_takesValuesFrom_EnumerationDomainType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: SentinelValueDomainSentinelValueDomain_takesValuesFrom_EnumerationDomainTypeValidTypeType[];
}
interface SentinelValueDomainSentinelValueDomain_takesValuesFrom_EnumerationDomainType extends _SentinelValueDomainSentinelValueDomain_takesValuesFrom_EnumerationDomainType { constructor: { new(): SentinelValueDomainSentinelValueDomain_takesValuesFrom_EnumerationDomainType }; }

type SentinelValueDomainSentinelValueDomain_takesValuesFrom_EnumerationDomainTypeValidTypeType = ("CodeList" | "EnumerationDomain" | "StatisticalClassification");
interface _SentinelValueDomainSentinelValueDomain_takesValuesFrom_EnumerationDomainTypeValidTypeType extends Primitive._string { content: SentinelValueDomainSentinelValueDomain_takesValuesFrom_EnumerationDomainTypeValidTypeType; }

/** Definition
  * ============
  * A sequence controls the order of activities or steps by defining a simple sequence.
  *
  * Examples
  * ==========
  * A sequence might contain two subordinate sequences of activity - one for Round 1 activity of the research and the second for Round 2.
  *
  * Explanatory notes
  * ===================
  * Unlike temporal constraints, sequence is NOT pairwise. However, a group of temporal constraints can specify an order with more precision than a sequence. */
interface _Sequence extends _DeterministicImperative {
	Sequence_has_SequencePosition?: SequenceSequence_has_SequencePositionType[];
}
export interface Sequence extends _Sequence { constructor: { new(): Sequence }; }
export var Sequence: { new(): Sequence };

/** Definition
  * ============
  * Assigns a sequence number to an activity within a sequence. */
interface _SequencePosition extends BaseType {
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	/** Indexes the activities in a sequence using integers with a position indicated by incrementing upward from 0 or 1. */
	value: number;
}
export interface SequencePosition extends _SequencePosition { constructor: { new(): SequencePosition }; }
export var SequencePosition: { new(): SequencePosition };

interface _SequenceSequence_has_SequencePositionType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType: SequenceSequence_has_SequencePositionTypeValidTypeType[];
}
interface SequenceSequence_has_SequencePositionType extends _SequenceSequence_has_SequencePositionType { constructor: { new(): SequenceSequence_has_SequencePositionType }; }

type SequenceSequence_has_SequencePositionTypeValidTypeType = "SequencePosition";
interface _SequenceSequence_has_SequencePositionTypeValidTypeType extends Primitive._string { content: SequenceSequence_has_SequencePositionTypeValidTypeType; }

/** Definition
  * ============
  * Service is a type of processing agent. Services are atomic. They execute acts which have input and output parameters.
  *
  * Examples
  * ==========
  * Given a location as input, a weather service provides weather data as output.
  *
  * Explanatory notes
  * ===================
  * A service binds information objects to parameters at runtime. */
interface _Service extends _ProcessingAgent {}
export interface Service extends _Service { constructor: { new(): Service }; }
export var Service: { new(): Service };

/** Definition
  * ============
  * Sex specification is limited to the purpose of determining the proper pronoun to use in addressing the individual. This may be based on conventional usage or personal preference. */
export type SexSpecification = ("Feminine" | "GenderNeutral" | "Masculine");
interface _SexSpecification extends Primitive._string { content: SexSpecification; }

/** Definition
  * ============
  * Lists the value and format type for the coordinate value. Note that this is a single value (X coordinate or Y coordinate) rather than a coordinate pair. */
interface _SpatialCoordinate extends BaseType {
	/** The value of the coordinate expressed as a string. */
	content?: string;
	/** Identifies the type of point coordinate system using a controlled vocabulary. Point formats include decimal degree, degrees minutes seconds, decimal minutes, meters, and feet. */
	coordinateType?: PointFormat;
}
export interface SpatialCoordinate extends _SpatialCoordinate { constructor: { new(): SpatialCoordinate }; }
export var SpatialCoordinate: { new(): SpatialCoordinate };

/** Definition
  * ============
  * A geographic point consisting of an X and Y coordinate. Each coordinate value is expressed separately providing its value and format. */
interface _SpatialPoint extends BaseType {
	/** An X coordinate (latitudinal equivalent) value and format expressed using the Spatial Coordinate structure. */
	xCoordinate?: SpatialCoordinate;
	/** A Y coordinate (longitudinal equivalent) value and format expressed using the Spatial Coordinate structure. */
	yCoordinate?: SpatialCoordinate;
}
export interface SpatialPoint extends _SpatialPoint { constructor: { new(): SpatialPoint }; }
export var SpatialPoint: { new(): SpatialPoint };

/** Definition
  * ============
  * Specific roles played by represented variables in terms of time, geography, and other concepts which are important for the harmonization and integration of data. */
interface _SpecializationRole extends BaseType {}
export interface SpecializationRole extends _SpecializationRole { constructor: { new(): SpecializationRole }; }
export var SpecializationRole: { new(): SpecializationRole };

/** Definition
  * ============
  * The value of the statistic expressed as a decimal, float and/or double. Indicates whether it is weighted value and the computation base. */
interface _Statistic extends BaseType {
	/** Defines the cases included in determining the statistic. The options are total = all cases, valid and missing (invalid); validOnly = Only valid values, missing (invalid) are not included in the calculation; missingOnly = Only missing (invalid) cases included in the calculation. */
	computationBase?: ComputationBaseList;
	/** The value of the statistic expressed as a real number. */
	content?: number;
	/** Set to True if the statistic is weighted. */
	isWeighted?: boolean;
	/** Indicate the type of numeric value as decimal, float, double. */
	typeOfNumericValue?: string;
}
export interface Statistic extends _Statistic { constructor: { new(): Statistic }; }
export var Statistic: { new(): Statistic };

/** Definition
  * ============
  * Set of categories represented by classification items where the subset of immediate children categories for any given parent category are mutually exclusive and jointly exhaustive with respect to that parent.
  *
  * Examples
  * ==========
  * ISIC rev 4; NAICS 2017, SOC 2018
  *
  * Explanatory notes
  * ===================
  * A statistical classification may have a flat, linear structure or may be hierarchically structured, such that all categories at lower levels are sub-categories of categories at the next Level up. (Source: GSIM StatisticalClassification)
  * Each classification item represents a category. Every category is a member of a level within a statistical classification. The categories are defined with reference to one or more characteristics of a particular universe of units of observation. */
interface _StatisticalClassification extends _EnumerationDomain {
	/** If value is False, the members are unique within the collection - if True, there may be duplicates. (Note that a mathematical “bag” permits duplicates and is unordered - a “set” does not have duplicates and may be ordered.) */
	allowsDuplicates: boolean;
	/** A list of languages in which the Statistical Classification is available. Supports the indication of multiple languages within a single property. Supports use of codes defined by the RFC 1766. */
	availableLanguage?: string[];
	/** Bundles the information useful for a data catalog entry.
	  *
	  * Examples would be creator, contributor, title, copyright, embargo, and license information
	  *
	  * A set of information useful for attribution, data discovery, and access.
	  * This is information that is tied to the identity of the object. If this information changes the version of the associated object changes. */
	catalogDetails?: CatalogDetails;
	/** Describes the relationship between the variant and its base Statistical Classification, including regroupings, aggregations added and extensions. (Source: GSIM StatisticalClassification/Changes from base Statistical Classification). */
	changeFromBase?: InternationalString;
	/** Copyright of the statistical classification. */
	copyright?: InternationalString[];
	/** A human-readable display label for the object. Supports the use of multiple languages. Repeat for labels with different content, for example, labels with differing length limitations. */
	displayLabel?: LabelForDisplay[];
	/** Indicates if the statistical classification is currently valid. */
	isCurrent?: boolean;
	/** Indicates if the Statistical Classification is a floating classification. In a floating statistical classification, a validity period should be defined for all classification Items which will allow the display of the item structure and content at different points of time. (Source: GSIM StatisticalClassification/Floating). */
	isFloating?: boolean;
	/** If the Statistical Classification is a variant, notes the specific purpose for which it was developed. (Source: GSIM StatisticalClassification/Purpose of variant). */
	purposeOfVariant?: InternationalString;
	/** Explanation of the reason(s) some decision was made or some object exists. */
	rationale?: InternationalString;
	/** Date when the current version of the Statistical Classification was released. */
	releaseDate?: CombinedDate;
	StatisticalClassification_has_ClassificationItem?: StatisticalClassificationStatisticalClassification_has_ClassificationItemType[];
	StatisticalClassification_has_ClassificationItemPosition?: StatisticalClassificationStatisticalClassification_has_ClassificationItemPositionType[];
	StatisticalClassification_has_LevelStructure?: StatisticalClassificationStatisticalClassification_has_LevelStructureType;
	StatisticalClassification_isIndexedBy_ClassificationIndex?: StatisticalClassificationStatisticalClassification_isIndexedBy_ClassificationIndexType[];
	/** Organization, agency, or group within an agency responsible for the maintenance and upkeep of the statistical classification. */
	StatisticalClassification_isMaintainedBy_Organization?: StatisticalClassificationStatisticalClassification_isMaintainedBy_OrganizationType[];
	/** Statistical classification preceded by the actual statistical classification (for those statistical classifications that are versions or updates). */
	StatisticalClassification_isPredecessorOf_StatisticalClassification?: StatisticalClassificationStatisticalClassification_isPredecessorOf_StatisticalClassificationType[];
	/** Statistical classification preceded by the actual statistical classification (for those statistical classifications that are versions or updates). */
	StatisticalClassification_isSuccessorOf_StatisticalClassification?: StatisticalClassificationStatisticalClassification_isSuccessorOf_StatisticalClassificationType[];
	/** Statistical classification on which the current variant is based, and any subsequent versions of that statistical classification to which it is also applicable. */
	StatisticalClassification_isVariantOf_StatisticalClassification?: StatisticalClassificationStatisticalClassification_isVariantOf_StatisticalClassificationType;
	/** Summary description of changes which have occurred since the most recent classification version or classification update came into force. */
	updateChanges?: InternationalString[];
	/** Explanation of the ways in which the object is employed. */
	usage?: InternationalString;
	/** The dates describing the validity period of the object. The date from which the object became valid must be defined if the map belongs to a "floating" construct. The date at which the object became invalid must be defined if the map belongs to a "floating" construct and is no longer valid. Per the Generic Statistical Information Model, Statistical Classification: "The date the statistical classification enters production use and the date on which the Statistical Classification was superseded by a successor version or otherwise ceased to be valid." */
	validDates?: DateRange;
}
export interface StatisticalClassification extends _StatisticalClassification { constructor: { new(): StatisticalClassification }; }
export var StatisticalClassification: { new(): StatisticalClassification };

/** Definition
  * ============
  * Specifies the statistical classifications for the source and target of a complex relationship and defines the relationship. */
interface _StatisticalClassificationRelationship extends BaseType {
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	/** Specifies the semantics of the object in reference to a vocabulary, ontology, etc. */
	semantics?: ControlledVocabularyEntry;
	StatisticalClassificationRelationship_hasSource_StatisticalClassification?: StatisticalClassificationRelationshipStatisticalClassificationRelationship_hasSource_StatisticalClassificationType[];
	StatisticalClassificationRelationship_hasTarget_StatisticalClassification?: StatisticalClassificationRelationshipStatisticalClassificationRelationship_hasTarget_StatisticalClassificationType[];
}
export interface StatisticalClassificationRelationship extends _StatisticalClassificationRelationship { constructor: { new(): StatisticalClassificationRelationship }; }
export var StatisticalClassificationRelationship: { new(): StatisticalClassificationRelationship };

interface _StatisticalClassificationRelationshipStatisticalClassificationRelationship_hasSource_StatisticalClassificationType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: StatisticalClassificationRelationshipStatisticalClassificationRelationship_hasSource_StatisticalClassificationTypeValidTypeType[];
}
interface StatisticalClassificationRelationshipStatisticalClassificationRelationship_hasSource_StatisticalClassificationType extends _StatisticalClassificationRelationshipStatisticalClassificationRelationship_hasSource_StatisticalClassificationType { constructor: { new(): StatisticalClassificationRelationshipStatisticalClassificationRelationship_hasSource_StatisticalClassificationType }; }

type StatisticalClassificationRelationshipStatisticalClassificationRelationship_hasSource_StatisticalClassificationTypeValidTypeType = "StatisticalClassification";
interface _StatisticalClassificationRelationshipStatisticalClassificationRelationship_hasSource_StatisticalClassificationTypeValidTypeType extends Primitive._string { content: StatisticalClassificationRelationshipStatisticalClassificationRelationship_hasSource_StatisticalClassificationTypeValidTypeType; }

interface _StatisticalClassificationRelationshipStatisticalClassificationRelationship_hasTarget_StatisticalClassificationType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: StatisticalClassificationRelationshipStatisticalClassificationRelationship_hasTarget_StatisticalClassificationTypeValidTypeType[];
}
interface StatisticalClassificationRelationshipStatisticalClassificationRelationship_hasTarget_StatisticalClassificationType extends _StatisticalClassificationRelationshipStatisticalClassificationRelationship_hasTarget_StatisticalClassificationType { constructor: { new(): StatisticalClassificationRelationshipStatisticalClassificationRelationship_hasTarget_StatisticalClassificationType }; }

type StatisticalClassificationRelationshipStatisticalClassificationRelationship_hasTarget_StatisticalClassificationTypeValidTypeType = "StatisticalClassification";
interface _StatisticalClassificationRelationshipStatisticalClassificationRelationship_hasTarget_StatisticalClassificationTypeValidTypeType extends Primitive._string { content: StatisticalClassificationRelationshipStatisticalClassificationRelationship_hasTarget_StatisticalClassificationTypeValidTypeType; }

interface _StatisticalClassificationStatisticalClassification_has_ClassificationItemPositionType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: StatisticalClassificationStatisticalClassification_has_ClassificationItemPositionTypeValidTypeType[];
}
interface StatisticalClassificationStatisticalClassification_has_ClassificationItemPositionType extends _StatisticalClassificationStatisticalClassification_has_ClassificationItemPositionType { constructor: { new(): StatisticalClassificationStatisticalClassification_has_ClassificationItemPositionType }; }

type StatisticalClassificationStatisticalClassification_has_ClassificationItemPositionTypeValidTypeType = "ClassificationItemPosition";
interface _StatisticalClassificationStatisticalClassification_has_ClassificationItemPositionTypeValidTypeType extends Primitive._string { content: StatisticalClassificationStatisticalClassification_has_ClassificationItemPositionTypeValidTypeType; }

interface _StatisticalClassificationStatisticalClassification_has_ClassificationItemType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: StatisticalClassificationStatisticalClassification_has_ClassificationItemTypeValidTypeType[];
}
interface StatisticalClassificationStatisticalClassification_has_ClassificationItemType extends _StatisticalClassificationStatisticalClassification_has_ClassificationItemType { constructor: { new(): StatisticalClassificationStatisticalClassification_has_ClassificationItemType }; }

type StatisticalClassificationStatisticalClassification_has_ClassificationItemTypeValidTypeType = "ClassificationItem";
interface _StatisticalClassificationStatisticalClassification_has_ClassificationItemTypeValidTypeType extends Primitive._string { content: StatisticalClassificationStatisticalClassification_has_ClassificationItemTypeValidTypeType; }

interface _StatisticalClassificationStatisticalClassification_has_LevelStructureType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: StatisticalClassificationStatisticalClassification_has_LevelStructureTypeValidTypeType[];
}
interface StatisticalClassificationStatisticalClassification_has_LevelStructureType extends _StatisticalClassificationStatisticalClassification_has_LevelStructureType { constructor: { new(): StatisticalClassificationStatisticalClassification_has_LevelStructureType }; }

type StatisticalClassificationStatisticalClassification_has_LevelStructureTypeValidTypeType = "LevelStructure";
interface _StatisticalClassificationStatisticalClassification_has_LevelStructureTypeValidTypeType extends Primitive._string { content: StatisticalClassificationStatisticalClassification_has_LevelStructureTypeValidTypeType; }

interface _StatisticalClassificationStatisticalClassification_isIndexedBy_ClassificationIndexType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: StatisticalClassificationStatisticalClassification_isIndexedBy_ClassificationIndexTypeValidTypeType[];
}
interface StatisticalClassificationStatisticalClassification_isIndexedBy_ClassificationIndexType extends _StatisticalClassificationStatisticalClassification_isIndexedBy_ClassificationIndexType { constructor: { new(): StatisticalClassificationStatisticalClassification_isIndexedBy_ClassificationIndexType }; }

type StatisticalClassificationStatisticalClassification_isIndexedBy_ClassificationIndexTypeValidTypeType = "ClassificationIndex";
interface _StatisticalClassificationStatisticalClassification_isIndexedBy_ClassificationIndexTypeValidTypeType extends Primitive._string { content: StatisticalClassificationStatisticalClassification_isIndexedBy_ClassificationIndexTypeValidTypeType; }

interface _StatisticalClassificationStatisticalClassification_isMaintainedBy_OrganizationType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: StatisticalClassificationStatisticalClassification_isMaintainedBy_OrganizationTypeValidTypeType[];
}
interface StatisticalClassificationStatisticalClassification_isMaintainedBy_OrganizationType extends _StatisticalClassificationStatisticalClassification_isMaintainedBy_OrganizationType { constructor: { new(): StatisticalClassificationStatisticalClassification_isMaintainedBy_OrganizationType }; }

type StatisticalClassificationStatisticalClassification_isMaintainedBy_OrganizationTypeValidTypeType = "Organization";
interface _StatisticalClassificationStatisticalClassification_isMaintainedBy_OrganizationTypeValidTypeType extends Primitive._string { content: StatisticalClassificationStatisticalClassification_isMaintainedBy_OrganizationTypeValidTypeType; }

interface _StatisticalClassificationStatisticalClassification_isPredecessorOf_StatisticalClassificationType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: StatisticalClassificationStatisticalClassification_isPredecessorOf_StatisticalClassificationTypeValidTypeType[];
}
interface StatisticalClassificationStatisticalClassification_isPredecessorOf_StatisticalClassificationType extends _StatisticalClassificationStatisticalClassification_isPredecessorOf_StatisticalClassificationType { constructor: { new(): StatisticalClassificationStatisticalClassification_isPredecessorOf_StatisticalClassificationType }; }

type StatisticalClassificationStatisticalClassification_isPredecessorOf_StatisticalClassificationTypeValidTypeType = "StatisticalClassification";
interface _StatisticalClassificationStatisticalClassification_isPredecessorOf_StatisticalClassificationTypeValidTypeType extends Primitive._string { content: StatisticalClassificationStatisticalClassification_isPredecessorOf_StatisticalClassificationTypeValidTypeType; }

interface _StatisticalClassificationStatisticalClassification_isSuccessorOf_StatisticalClassificationType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: StatisticalClassificationStatisticalClassification_isSuccessorOf_StatisticalClassificationTypeValidTypeType[];
}
interface StatisticalClassificationStatisticalClassification_isSuccessorOf_StatisticalClassificationType extends _StatisticalClassificationStatisticalClassification_isSuccessorOf_StatisticalClassificationType { constructor: { new(): StatisticalClassificationStatisticalClassification_isSuccessorOf_StatisticalClassificationType }; }

type StatisticalClassificationStatisticalClassification_isSuccessorOf_StatisticalClassificationTypeValidTypeType = "StatisticalClassification";
interface _StatisticalClassificationStatisticalClassification_isSuccessorOf_StatisticalClassificationTypeValidTypeType extends Primitive._string { content: StatisticalClassificationStatisticalClassification_isSuccessorOf_StatisticalClassificationTypeValidTypeType; }

interface _StatisticalClassificationStatisticalClassification_isVariantOf_StatisticalClassificationType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: StatisticalClassificationStatisticalClassification_isVariantOf_StatisticalClassificationTypeValidTypeType[];
}
interface StatisticalClassificationStatisticalClassification_isVariantOf_StatisticalClassificationType extends _StatisticalClassificationStatisticalClassification_isVariantOf_StatisticalClassificationType { constructor: { new(): StatisticalClassificationStatisticalClassification_isVariantOf_StatisticalClassificationType }; }

type StatisticalClassificationStatisticalClassification_isVariantOf_StatisticalClassificationTypeValidTypeType = "StatisticalClassification";
interface _StatisticalClassificationStatisticalClassification_isVariantOf_StatisticalClassificationTypeValidTypeType extends Primitive._string { content: StatisticalClassificationStatisticalClassification_isVariantOf_StatisticalClassificationTypeValidTypeType; }

/** Definition
  * ============
  * Step is a reusable, parameterized activity associated to information flows. One or more steps perform an sctivity.
  *
  * Examples
  * ==========
  * An editing activity resolves into one or more steps. A transformation of a wide data set to a long data set takes a single step on an ETL (extract, transform, load) platform like Pentaho.
  *
  * Explanatory notes
  * ===================
  * Steps can be broken out into a sequence of sub steps ad infinitum. */
interface _Step extends _Activity {
	/** The executable code for performing a process step, expressed in a formal language. */
	script?: CommandCode;
	/** The formal language used by the script associated with the process step. */
	scriptingLanguage?: ControlledVocabularyEntry;
	/** A step can be broken out into steps ad infinitum. */
	Step_hasSubStep_Step?: StepStep_hasSubStep_StepType[];
	/** The Step creates Parameter as an output. */
	Step_produces_Parameter?: StepStep_produces_ParameterType[];
	/** The Step uses Parameter as an input. */
	Step_receives_Parameter?: StepStep_receives_ParameterType[];
}
export interface Step extends _Step { constructor: { new(): Step }; }
export var Step: { new(): Step };

interface _StepStep_hasSubStep_StepType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: StepStep_hasSubStep_StepTypeValidTypeType[];
}
interface StepStep_hasSubStep_StepType extends _StepStep_hasSubStep_StepType { constructor: { new(): StepStep_hasSubStep_StepType }; }

type StepStep_hasSubStep_StepTypeValidTypeType = "Step";
interface _StepStep_hasSubStep_StepTypeValidTypeType extends Primitive._string { content: StepStep_hasSubStep_StepTypeValidTypeType; }

interface _StepStep_produces_ParameterType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: StepStep_produces_ParameterTypeValidTypeType[];
}
interface StepStep_produces_ParameterType extends _StepStep_produces_ParameterType { constructor: { new(): StepStep_produces_ParameterType }; }

type StepStep_produces_ParameterTypeValidTypeType = "Parameter";
interface _StepStep_produces_ParameterTypeValidTypeType extends Primitive._string { content: StepStep_produces_ParameterTypeValidTypeType; }

interface _StepStep_receives_ParameterType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: StepStep_receives_ParameterTypeValidTypeType[];
}
interface StepStep_receives_ParameterType extends _StepStep_receives_ParameterType { constructor: { new(): StepStep_receives_ParameterType }; }

type StepStep_receives_ParameterTypeValidTypeType = "Parameter";
interface _StepStep_receives_ParameterTypeValidTypeType extends Primitive._string { content: StepStep_receives_ParameterTypeValidTypeType; }

/** Definition
  * ============
  * Type of relation in terms of totality with respect to an associated collection.  The totality type is given by the controlled vocabulary {total, partial}.
  *
  * Examples
  * ==========
  * A binary relation R on a collection C is total if all members of C are related to each other in R. The relation is partial otherwise. */
export type StructureExtent = ("Partial" | "Total");
interface _StructureExtent extends Primitive._string { content: StructureExtent; }

/** Definition
  * ============
  * The mathematical properties of the structure. */
interface _StructureSpecification extends BaseType {
	/** Members of the selected scope of the collection are related to themselves. */
	reflexive?: MemberRelationshipScope;
	/** For pairs of members, a, b in the indicated scope of the associated collection, whenever a is related to b then also b is related to a. */
	symmetric?: MemberRelationshipScope;
	/** For members a, b, c in the indicated scope of the associated collection, whenever a is related to b and b is related to c then a is also related to c. */
	transitive?: MemberRelationshipScope;
}
export interface StructureSpecification extends _StructureSpecification { constructor: { new(): StructureSpecification }; }
export var StructureSpecification: { new(): StructureSpecification };

/** Definition
  * ==========
  * Conceptual domain of substantive concepts.
  *
  * Examples
  * ========
  * An enumeration of concepts for a categorical variable like "male" and "female" for gender, or "ozone" and "particulate matter less than 2.5 microns in diameter" for pollutant in an air quality measure.
  *
  * Explanatory notes
  * =================
  * A conceptual variable links a unit type to a substantive conceptual domain. The latter can be an enumeration or description of the values that the variable may take on. In the enumerated case these are the categories in a category set that can be values, not the codes that represent the values. An example might be the conceptual domain for a variable representing self-identified gender. An enumeration might include the concept of "male" and the concept of "female". These, in turn, would be represented in a substantive value domain by codes in a code list like "m" and "f", or "0" and "1". A conceptual domain might be described through a value and concept description's description property of "a real number greater than 0" or through a more formal logical expression of "all reals x such that x > 0". Even in the described case, what is being described are conceptual, not the symbols used to represent the values. This may be a subtle distinction, but allows specifying that the same numeric value might be represented by 32 bits or by 64 bits or by an Arabic numeral or a Roman numeral. */
interface _SubstantiveConceptualDomain extends _ConceptualDomain {}
export interface SubstantiveConceptualDomain extends _SubstantiveConceptualDomain { constructor: { new(): SubstantiveConceptualDomain }; }
export var SubstantiveConceptualDomain: { new(): SubstantiveConceptualDomain };

/** Definition
  * ==========
  * Value domain for a substantive conceptual domain. Typically a description and/or enumeration of allowed values of interest.
  *
  * Examples
  * ========
  * All real decimal numbers relating to the subject matter of interest between 0 and 1 specified in Arabic numerals. (From the Generic Statistical Information Model [GSIM] 1.1). The codes "M" male and "F" for female .
  *
  * Explanatory notes
  * =================
  * In DDI-CDI the value domain for a variable is separated into "substantive" and "sentinel" values. Substantive values are the values of primary interest. Sentinel values are additional values that may carry supplementary information, such as reasons for missing. This duality is described in ISO 11404. Substantive values for height might be real numbers expressed in meters. The full value domain might also include codes for different kinds of missing values - one code for "refused" and another for "don’t know". Sentinel values may also convey some substantive information and at the same time represent missing values.
  *
  * An example might be where a numeric variable like number of employees be sometimes a count and sometimes a code representing a range of counts in order to avoid disclosure of information about a specific entity. The substantive value domain may use either a value description, for described values, or a codelist for enumerated values, or both. A value domain may consist of substantive values or sentinel values. Substantive values are those associated directly with some subject matter area. They do not address concerns around processing, such as missing values. Substantive values are called "regular values" in ISO/IEC 11404 - General Purpose Datatypes. The enumerated case is one where all values are listed.
  *
  * An example is the categorical values for gender: the conceptual domain could consist of the concept of male and the concept of female. These might be represented in codes and associated labels as 1 ("Male") 2 ("Female"). The described case is one where some description is needed to define the set of values. Take the following description for height in meters: "a real number between 0 and 3, represented to two Arabic decimal places". This description might be structured in some way to be machine actionable (datatype="double”, min="0", max="3", decimals="2"). */
interface _SubstantiveValueDomain extends _ValueDomain {
	/** A formal description of the set of valid values - for described value domains. */
	SubstantiveValueDomain_isDescribedBy_ValueAndConceptDescription?: SubstantiveValueDomainSubstantiveValueDomain_isDescribedBy_ValueAndConceptDescriptionType;
	/** Corresponding conceptual definition given by an substantive conceptual domain. */
	SubstantiveValueDomain_takesConceptsFrom_SubstantiveConceptualDomain?: SubstantiveValueDomainSubstantiveValueDomain_takesConceptsFrom_SubstantiveConceptualDomainType;
	/** Any subtype of an enumeration domain enumerating the set of valid values. */
	SubstantiveValueDomain_takesValuesFrom_EnumerationDomain?: SubstantiveValueDomainSubstantiveValueDomain_takesValuesFrom_EnumerationDomainType;
}
export interface SubstantiveValueDomain extends _SubstantiveValueDomain { constructor: { new(): SubstantiveValueDomain }; }
export var SubstantiveValueDomain: { new(): SubstantiveValueDomain };

interface _SubstantiveValueDomainSubstantiveValueDomain_isDescribedBy_ValueAndConceptDescriptionType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: SubstantiveValueDomainSubstantiveValueDomain_isDescribedBy_ValueAndConceptDescriptionTypeValidTypeType[];
}
interface SubstantiveValueDomainSubstantiveValueDomain_isDescribedBy_ValueAndConceptDescriptionType extends _SubstantiveValueDomainSubstantiveValueDomain_isDescribedBy_ValueAndConceptDescriptionType { constructor: { new(): SubstantiveValueDomainSubstantiveValueDomain_isDescribedBy_ValueAndConceptDescriptionType }; }

type SubstantiveValueDomainSubstantiveValueDomain_isDescribedBy_ValueAndConceptDescriptionTypeValidTypeType = "ValueAndConceptDescription";
interface _SubstantiveValueDomainSubstantiveValueDomain_isDescribedBy_ValueAndConceptDescriptionTypeValidTypeType extends Primitive._string { content: SubstantiveValueDomainSubstantiveValueDomain_isDescribedBy_ValueAndConceptDescriptionTypeValidTypeType; }

interface _SubstantiveValueDomainSubstantiveValueDomain_takesConceptsFrom_SubstantiveConceptualDomainType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: SubstantiveValueDomainSubstantiveValueDomain_takesConceptsFrom_SubstantiveConceptualDomainTypeValidTypeType[];
}
interface SubstantiveValueDomainSubstantiveValueDomain_takesConceptsFrom_SubstantiveConceptualDomainType extends _SubstantiveValueDomainSubstantiveValueDomain_takesConceptsFrom_SubstantiveConceptualDomainType { constructor: { new(): SubstantiveValueDomainSubstantiveValueDomain_takesConceptsFrom_SubstantiveConceptualDomainType }; }

type SubstantiveValueDomainSubstantiveValueDomain_takesConceptsFrom_SubstantiveConceptualDomainTypeValidTypeType = "SubstantiveConceptualDomain";
interface _SubstantiveValueDomainSubstantiveValueDomain_takesConceptsFrom_SubstantiveConceptualDomainTypeValidTypeType extends Primitive._string { content: SubstantiveValueDomainSubstantiveValueDomain_takesConceptsFrom_SubstantiveConceptualDomainTypeValidTypeType; }

interface _SubstantiveValueDomainSubstantiveValueDomain_takesValuesFrom_EnumerationDomainType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: SubstantiveValueDomainSubstantiveValueDomain_takesValuesFrom_EnumerationDomainTypeValidTypeType[];
}
interface SubstantiveValueDomainSubstantiveValueDomain_takesValuesFrom_EnumerationDomainType extends _SubstantiveValueDomainSubstantiveValueDomain_takesValuesFrom_EnumerationDomainType { constructor: { new(): SubstantiveValueDomainSubstantiveValueDomain_takesValuesFrom_EnumerationDomainType }; }

type SubstantiveValueDomainSubstantiveValueDomain_takesValuesFrom_EnumerationDomainTypeValidTypeType = ("CodeList" | "EnumerationDomain" | "StatisticalClassification");
interface _SubstantiveValueDomainSubstantiveValueDomain_takesValuesFrom_EnumerationDomainTypeValidTypeType extends Primitive._string { content: SubstantiveValueDomainSubstantiveValueDomain_takesValuesFrom_EnumerationDomainTypeValidTypeType; }

/** Definition
  * ============
  * Persistent and unique identifier (PIDs) to provide standarized, long-lasting identification.
  *
  * Examples
  * ==========
  * UUIDs, GUIDs, DOIs, URNs or any other unique id generation framework.
  *
  * Explanatory notes
  * ===================
  * This PIDs either complement or replace identifier and dimension components.
  * They complement them when there is a need for having a globally unique identifier as part of an instance key. They replace them when identier components are not available (e.g. after de-identification for confidentiality). */
interface _SyntheticIdComponent extends _DataStructureComponent {}
export interface SyntheticIdComponent extends _SyntheticIdComponent { constructor: { new(): SyntheticIdComponent }; }
export var SyntheticIdComponent: { new(): SyntheticIdComponent };

/** Definition
  * ============
  * Indicates whether the tables in the group should be displayed with the first column on the right, on the left, or based on the first character in the table that has a specific direction. */
export type TableDirectionValues = ("Auto" | "Ltr" | "Rtl");
interface _TableDirectionValues extends Primitive._string { content: TableDirectionValues; }

/** Definition
  * ============
  * Details of a telephone number including the number, type of telephone number, a privacy setting and an indication of whether this is the preferred contact number.
  *
  * Examples
  * ==========
  * +12 345 67890123 */
interface _Telephone extends BaseType {
	/** Time period during which the telephone number is valid. */
	effectiveDates?: DateRange;
	/** Set to True if this is the preferred telephone number for contact. */
	isPreferred?: boolean;
	/** Specify the level privacy for the telephone number as public, restricted, or private. Supports the use of an external controlled vocabulary. */
	privacy?: ControlledVocabularyEntry;
	/** The telephone number including country code if appropriate. */
	telephoneNumber?: string;
	/** Indicates type of telephone number provided (home, fax, office, cell, etc.). Supports the use of a controlled vocabulary. */
	typeOfTelephone?: ControlledVocabularyEntry;
}
export interface Telephone extends _Telephone { constructor: { new(): Telephone }; }
export var Telephone: { new(): Telephone };

/** Definition
  * ============
  * Temporal constraints provide a mechanism for expressing concurrency control and synchronization
  *
  * Examples
  * ==========
  * Allen's Interval Algebra is a set of temporal constraints. So are the Split and SplitJoin ControlConstructs
  *
  * Explanatory notes
  * ===================
  * Allen's interval algebra is a calculus for temporal reasoning that was introduced in 1983. Reasoning with qualitative time in Allen's full interval algebra is nondeterministic polynomial time (NP) complete. Research since 1995 identified maximal tractable subclasses of this algebra via exhaustive computer search and also other ad-hoc methods. In 2003, the full classification of complexity for satisfiability problems over constraints in Allen's interval algebra was established algebraically. */
interface _TemporalConstraints extends _NonDeterministicDeclarative {}
export interface TemporalConstraints extends _TemporalConstraints { constructor: { new(): TemporalConstraints }; }
export var TemporalConstraints: { new(): TemporalConstraints };

/** Definition
  * ==========
  * Declarative control flow operator where the continuation of the execution flow depends on the finalization of one or more preceding activities/steps.
  *
  * - XORJoin: Given three activities A, B and C, if XORJoin(A, B) -> C, then C is executed after either A or B finishes executing. XORJoin is sometimes referred to as simple merge.
  * - ANDJoin: Given three activities A, B and C, if ANDJoin(A, B) -> C, then C is executed after both A and B finish executing. ANDJoin is sometimes referred to as synchronization.
  * - XORSplit: Given three activities A, B and C, if XORSplit(A) -> (B, C), then either B or C is executed, not both, after A finishes executing. XORSplit is sometimes referred to as exclusive choice.
  * - ANDSplit: Given three activities A, B and C, if ANDSplit(A) -> (B, C), then both B and C are executed after A finishes executing. */
interface _TemporalControlConstruct extends _TemporalConstraints {
	/** TemporalControl is a property of type TemporalControlConstructType. There are four members of this enumeration: AND-split, XOR-split, AND-join and XOR-join. */
	temporalControl: TemporalOperator;
}
export interface TemporalControlConstruct extends _TemporalControlConstruct { constructor: { new(): TemporalControlConstruct }; }
export var TemporalControlConstruct: { new(): TemporalControlConstruct };

/** Definition
  * ============
  * Set of control flow operators where the continuation of the execution flow depends on the finalization of one or more preceding activities. */
export type TemporalOperator = ("AndJoin" | "AndSplit" | "XorJoin" | "XorSplit");
interface _TemporalOperator extends Primitive._string { content: TemporalOperator; }

/** Definition
  * ==========
  * Set of thirteen Allen's interval relations defined as Contains, Finishes, Meets, Overlaps, Precedes, Starts (and their converses), plus Equals. These are jointly exhaustive and pairwise disjoint binary relations representing temporal relationships between pairs of time intervals.
  *
  * Explanatory notes
  * =================
  * Here are the relations in Allen's interval algebra:
  *
  * - a precedes b (p) and b is preceded by a (P)
  * - a meets b (m) and b is met by a (M)
  * - a overlaps b (o) and b is overlapped by a (O)
  * - a is finished by b (F) and b finishes a (f)
  * - a contains B (D) and b is during a (d)
  * - a starts b (s) and b is started by a (S)
  * - a and b equal (e) each other */
export type TemporalRelation = ("Contains" | "Equals" | "Finishes" | "Meets" | "Overlaps" | "Precedes" | "Starts");
interface _TemporalRelation extends Primitive._string { content: TemporalRelation; }

/** Definition
  * ============
  * Indicates whether the text within cells should be displayed as left-to-right text (ltr), as right-to-left text (rtl), according to the content of the cell (auto) or in the direction inherited from the table direction annotation of the table. */
export type TextDirectionValues = ("Auto" | "Inherit" | "Ltr" | "Rtl");
interface _TextDirectionValues extends Primitive._string { content: TextDirectionValues; }

/** Definition
  * ==========
  * Describes a range of text by recording the start and end positions of the selection in the object. Position 0 would be immediately before the first character, position 1 would be immediately before the second character, and so on. It is defined accordingly the related selector of the Web Annotation Vocabulary, see https://www.w3.org/TR/annotation-vocab/#textpositionselector. */
interface _TextPositionSelector extends _Selector {
	/** Position of the last character of the selection. Position 8 would be the end of the word "Position" of the previous sentence. */
	end: number;
	/** Position of the first character of the selection. Position 0 would be the start of the word "Position" of the previous sentence. */
	start: number;
}
export interface TextPositionSelector extends _TextPositionSelector { constructor: { new(): TextPositionSelector }; }
export var TextPositionSelector: { new(): TextPositionSelector };

/** Definition
  * ============
  * Time-specific role given to a represented variable in the context of a data structure. The specific characterization of the role (e.g. event, valid, transaction, reference, etc.) may be given by a controlled vocabulary. */
interface _TimeRole extends _SpecializationRole {
	/** Holds a value from an external controlled vocabulary defining the time role. */
	time?: ControlledVocabularyEntry;
}
export interface TimeRole extends _TimeRole { constructor: { new(): TimeRole }; }
export var TimeRole: { new(): TimeRole };

/** Definition
  * ============
  * Specifies which spaces to remove from a data value (start, end, both, neither). */
export type TrimValues = ("Both" | "End" | "Neither" | "Start");
interface _TrimValues extends Primitive._string { content: TrimValues; }

/** Definition
  * ============
  * TypedString combines a type with content defined as a simple string. May be used wherever a simple string needs to support a type definition to clarify its content.
  *
  * Examples
  * ==========
  * Content is a regular expression and the typeOfContent attribute is used to define the syntax of the regular expression content.
  *
  * Explanatory notes
  * ===================
  * This is a generic type + string where property name and documentation should be used to define any specification for the content. If international structured string content is required use TypedStructuredString. */
interface _TypedString extends BaseType {
	/** Content of the property expressed as a simple string. */
	content: string;
	/** Optional use of a controlled vocabulary to specifically type the associated content. */
	typeOfContent?: ControlledVocabularyEntry;
}
export interface TypedString extends _TypedString { constructor: { new(): TypedString }; }
export var TypedString: { new(): TypedString };

/** Definition
  * ==========
  * Individual object of interest for some statistical activity, such as data collection.
  *
  * Examples
  * ========
  * Here are 3 examples:
  *
  * 1. Individual US person (i.e., Arofan Gregory, Dan Gillman, Barack Obama, etc.)
  * 2. Individual US computer companies (i.e., Microsoft, Apple, IBM, etc.)
  * 3. Individual US universities (i.e., Johns Hopkins, University of Maryland, Yale, etc.) [GSIM 1.1]
  *
  * Explanatory notes
  * =================
  * In a traditional data table each column might represent some variable (measurement). Each row would represent the entity (Unit)  to which those variables relate. Height measurements might be made on persons (unit type) of primary school age (Universe) at Pinckney Elementary School on September 1, 2005 (population). The height for Mary Roe (Unit)  might be 139 cm.
  *
  * The Unit is not invariably tied to some value. A median income might be calculated for a block in the U.S. but then used as an attribute of a person residing on that block. For the initial measurement the Unit was the block. In the reuse the unit would be that specific person to which the value was applied.
  *
  * In a big data table each row represents a unit/variable double. Together a unit identifier and a variable identifier define the key. And for each key there is just one value – the measure of the unit on the variable.
  *
  * A big data table is sometimes referred to as a column-oriented data store whereas a traditional database is sometimes referred to as a row-oriented data store. The unit plays an identifier role in both types of data stores. */
interface _Unit extends BaseType {
	/** Bundles the information useful for a data catalog entry. Examples would be creator, contributor, title, copyright, embargo, and license information. A set of information useful for attribution, data discovery, and access. This is information that is tied to the identity of the object. If this information changes the version of the associated object changes. */
	catalogDetails?: CatalogDetails;
	/** Natural language statement conveying the meaning of a concept, differentiating it from other concepts. Supports the use of multiple languages and structured text. */
	definition?: InternationalString;
	/** A human-readable display label for the object. Supports the use of multiple languages. Repeat for labels with different content, for example, labels with differing length limitations. */
	displayLabel?: LabelForDisplay[];
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	/** Human understandable name (liguistic signifier, word, phrase, or mnemonic). May follow ISO/IEC 11179-5 naming principles, and have context provided to specify usage. */
	name?: ObjectName[];
	/** The unit type of the unit. */
	Unit_has_UnitType?: UnitUnit_has_UnitTypeType[];
}
export interface Unit extends _Unit { constructor: { new(): Unit }; }
export var Unit: { new(): Unit };

/** Definition
  * ==========
  * Description of unit-record ("wide") data sets, where each row in the data set provides the same group of values for variables all relating to a single unit.
  *
  * Examples
  * ========
  * A simple spreadsheet. Commonly the first row of the table will contain variable names or descriptions.
  *
  * The following CSV file has a rectangular layout and would import into a simple table in a spreadsheet::
  *
  * PersonId,AgeYr,HeightCm
  * 1,22,183,
  * 2,45,175,
  *
  * Explanatory notes
  * =================
  * This is the classic rectangular data table used by most statistical packages, with rows/cases/observations and columns/variables/measurements. Each cell (DataPoint) in the table is the intersection of a Unit (row) and an InstanceVariable. Each logical column will contain data relating to the values for a single variable. */
interface _UnitSegmentLayout extends _PhysicalSegmentLayout {}
export interface UnitSegmentLayout extends _UnitSegmentLayout { constructor: { new(): UnitSegmentLayout }; }
export var UnitSegmentLayout: { new(): UnitSegmentLayout };

/** Definition
  * ==========
  * Unit type is a type or class of objects of interest (units).
  *
  * Examples
  * ========
  * Person, Establishment, Household, State, Country, Dog, Automobile, Neutrino.
  *
  * Explanatory notes
  * =================
  * Unit type is the most general in the hierarchy of unit type, universe, and population. It is a description of the basic characteristics for a general set of Units. A universe is a set of entities defined by a specialization of a unit type. A Population further narrows the specification to a specific time and geography.
  *
  * A unit type is used to describe a class or group of Units based on a single characteristic with no specification of time and geography. For example, the unit type of "Person" groups together a set of Units based on the characteristic that they are "Persons".
  *
  * It concerns not only unit types used in dissemination, but anywhere in the statistical process. E.g. using administrative data might involve the use of a fiscal unit. [GSIM 1.1]. */
interface _UnitType extends _Concept {
	/** A short natural language account of the characteristics of the object. */
	descriptiveText?: InternationalString;
}
export interface UnitType extends _UnitType { constructor: { new(): UnitType }; }
export var UnitType: { new(): UnitType };

interface _UnitUnit_has_UnitTypeType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: UnitUnit_has_UnitTypeTypeValidTypeType[];
}
interface UnitUnit_has_UnitTypeType extends _UnitUnit_has_UnitTypeType { constructor: { new(): UnitUnit_has_UnitTypeType }; }

type UnitUnit_has_UnitTypeTypeValidTypeType = ("Population" | "UnitType" | "Universe");
interface _UnitUnit_has_UnitTypeTypeValidTypeType extends Primitive._string { content: UnitUnit_has_UnitTypeTypeValidTypeType; }

/** Definition
  * ============
  * Specialized unit type, with the specialization based upon characteristics other than time and geography.
  *
  * Examples
  * ==========
  * 1. Canadian adults (not limited to those residing in Canada)
  * 2. Computer companies
  * 3. Universities
  *
  * Explanatory notes
  * ===================
  * Universe sits in a hierarchy between unit type and population, with unit type being most general and Population most specific. A universe is a set of entities defined by a more narrow specification than that of an underlying unit type. A population further narrows the specification to a specific time and geography.
  *
  * If the Universe consists of people, a number of factors may be used in defining membership in the Universe, such as age, sex, residence, income, veteran status, criminal convictions, etc. The universe may consist of elements other than persons, such as housing units, court cases, deaths, countries, etc. A universe may be described as "inclusive" or "exclusive".
  *
  * Not to be confused with Population, which includes the specification of time and geography. */
interface _Universe extends _UnitType {
	/** Default value is True. The description statement of a universe is generally stated in inclusive terms such as "All persons with university degree". Occasionally a universe is defined by what it excludes, i.e., "All persons except those with university degree". In this case the value would be changed to False. */
	isInclusive?: boolean;
}
export interface Universe extends _Universe { constructor: { new(): Universe }; }
export var Universe: { new(): Universe };

/** Definition
  * ==========
  * Formal description of a set of values.
  *
  * Examples
  * ========
  *
  * 1. The integers between 1 and 10, inclusive. The values of x satisfying the logicalExpression property: " (1 less than or equal to X less than or equalto 10) AND mod(x,10)=0" Also described with minimumValueInclusive = 1 and maximumValueInclusive = 10 (and datatype of integer).
  * 2. The upper case letters A through C and X described with the regularExpression "/[A-CX]/".
  * 3. A date-time described with the Unicode Locale Data Markup Language pattern yyyy.MM.dd G 'at' HH:mm:ss zzz.
  *
  * Explanatory notes
  * =================
  * The value and concept description may be used to describe either a value domain or a conceptual domain. For a value domain, the value and concept description contains the details for a described" domain (as opposed to an enumerated domain). There are a number of properties which can be used for the description. The description could be just text such as: "an even number greater than zero", or a more formal logical expression like "x>0 and mod(x,2)=0". A regular expression might be useful for describing a textual domain. It could also employ a format pattern from the Unicode Locale Data Markup Language (LDML: http://www.unicode.org/reports/tr35/tr35.html). Some conceptual domains might be described with just a narrative. Others, though, might be described in much the same way as a value domain depending on the specificity of the concept. In ISO 11404 a value domain may be described either through enumeration or description, or both. This class provides the facility for that description. It may be just a text description, but a description through a logical expression is machine actionable and might, for example, be rendered as an integrity constraint. If both text and a logical expression are provided the logical expression is to be taken as the canonical description. The logical expression could conform to an expression syntax like that of the Validation and Transformation Language (VTL: https://sdmx.org/?page_id=5096) or the Structured Data Transformation Language (SDTL: https://ddialliance.org/products/sdtl/1.0). */
interface _ValueAndConceptDescription extends BaseType {
	/** Indicates the type of relationship, nominal, ordinal, interval, ratio, or continuous. Use where appropriate for the representation type. */
	classificationLevel?: CategoryRelationCode;
	/** A formal description of the set of values in human-readable language. */
	description?: InternationalString;
	/** A pattern for a number as described in Unicode Locale Data Markup Language (LDML) (http://www.unicode.org/reports/tr35/tr35.html) Part 3: Numbers  (http://www.unicode.org/reports/tr35/tr35-numbers.html#Number_Format_Patterns) and Part 4. Dates (http://www.unicode.org/reports/tr35/tr35-dates.html#Date_Format_Patterns) . Examples would be    #,##0.### to describe the pattern for a decimal number, or yyyy.MM.dd G 'at' HH:mm:ss zzz for a datetime pattern. */
	formatPattern?: ControlledVocabularyEntry;
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	/** A logical expression where the values of "x" making the expression true are the members of the set of valid values.  For example, "(all reals x such that  x > 0)" describes the real numbers greater than 0. */
	logicalExpression?: ControlledVocabularyEntry;
	/** A string denoting the maximum possible value (excluding this value). From the W3C Recommendation "Metadata Vocabulary for Tabular Data" (https://www.w3.org/TR/tabular-metadata/) 5.11.2: "maxExclusive: An atomic property that contains a single number or string that is the maximum valid value (exclusive). The value of this property becomes the maximum exclusive annotation for the described datatype. See Value Constraints in [tabular-data-model] for details." */
	maximumValueExclusive?: string;
	/** A string denoting the maximum possible value. From the W3C Recommendation "Metadata Vocabulary for Tabular Data" (https://www.w3.org/TR/tabular-metadata/) 5.11.2: "maximum: An atomic property that contains a single number or string that is the maximum valid value (inclusive); equivalent to maxInclusive. The value of this property becomes the maximum annotation for the described datatype. See Value Constraints in [tabular-data-model] for details." */
	maximumValueInclusive?: string;
	/** A string denoting the minimum possible value (excluding this value). From the W3C Recommendation "Metadata Vocabulary for Tabular Data" (https://www.w3.org/TR/tabular-metadata/) 5.11.2: "minExclusive: An atomic property that contains a single number or string that is the minimum valid value (exclusive). The value of this property becomes the minimum exclusive annotation for the described datatype. See Value Constraints in [tabular-data-model] for details." */
	minimumValueExclusive?: string;
	/** A string denoting the minimum possible value. From the W3C Recommendation "Metadata Vocabulary for Tabular Data" (https://www.w3.org/TR/tabular-metadata/) 5.11.2: "minimum: An atomic property that contains a single number or string that is the minimum valid value (inclusive); equivalent to minInclusive. The value of this property becomes the minimum annotation for the described datatype. See Value Constraints in [tabular-data-model] for details." */
	minimumValueInclusive?: string;
	/** A regular expression where strings matching the expression belong to the set of valid values. Use typeOfContent to specify the syntax of the regularExpression found in content. */
	regularExpression?: TypedString;
}
export interface ValueAndConceptDescription extends _ValueAndConceptDescription { constructor: { new(): ValueAndConceptDescription }; }
export var ValueAndConceptDescription: { new(): ValueAndConceptDescription };

/** Definition
  * ============
  * Set of permissible values for a variable (adapted from ISO/IEC 11179).
  *
  * Examples
  * ==========
  * Age categories with a numeric code list; Age in years; Young, Middle-aged and Old.
  *
  * Explanatory notes
  * ===================
  * The values can be described by enumeration or by an expression. Value domains can be either substantive/sentinel, or described/enumeration. */
interface _ValueDomain extends BaseType {
	/** Bundles the information useful for a data catalog entry.
	  *
	  * Examples would be creator, contributor, title, copyright, embargo, and license information
	  *
	  * A set of information useful for attribution, data discovery, and access.
	  * This is information that is tied to the identity of the object. If this information changes the version of the associated object changes. */
	catalogDetails?: CatalogDetails;
	/** A human-readable display label for the object. Supports the use of multiple languages. Repeat for labels with different content, for example, labels with differing length limitations. */
	displayLabel?: LabelForDisplay[];
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	/** The data types that are recommended for use with this domain. */
	recommendedDataType?: ControlledVocabularyEntry[];
}
export interface ValueDomain extends _ValueDomain { constructor: { new(): ValueDomain }; }
export var ValueDomain: { new(): ValueDomain };

/** Definition
  * ==========
  * Physical characteristics for the value of an instance variable stored in a data point as part of a physical segment layout.
  *
  * Examples
  * ========
  * A variable "age" might be represented in a file as a string with a maximum length of 5 characters and a number pattern of ##0.0
  *
  * Explanatory notes
  * =================
  * An instance variable has details of value domain and data type, but will not have the final details of how a value is physically represented in a data file. A variable for height, for example, may be represented as a real number, but may be represented as a string in multiple ways. The decimal separator might be, for example a period or a comma. The string representing the value of a payment might be preceded by a currency symbol. The same numeric value might be written as "1,234,567" or "1.234567". A missing value might be written as ".", "NA", ".R" or as "R". The value mapping describes how the value of an instance variable is physically expressed. The properties of the value mapping as intended to be compatible with the W3C Metadata Vocabulary for Tabular Data (https://www.w3.org/TR/tabular-metadata/) as well as common programming languages and statistical packages. The 'format' property, for example, can draw from an external controlled vocabulary such as the set of formats for Stata, SPSS, or SAS. */
interface _ValueMapping extends BaseType {
	/** The number of decimal positions expressed as an integer. Used when the decimal position is implied (no decimal separator is present) See DDI 3.2 ManagedNumericRepresentation_decimalPositions */
	decimalPositions?: number;
	/** Default value is "." (period). The character separating the integer part from the fractional part of a decimal or real number. From the W3C Recommendation "Metadata Vocabulary for Tabular Data" (https://www.w3.org/TR/tabular-metadata/) 6.4.2: "decimalChar: A string whose value is used to represent a decimal point within the number. If the supplied value is not a string, implementations MUST issue a warning and proceed as if the property had not been specified." */
	defaultDecimalSeparator?: string;
	/** Default value is null. A character separating groups of digits (for readability). In W3C part of the datatype format From https://www.w3.org/TR/tabular-metadata/ tabular 6.4.2 groupChar: "A string whose value is used to group digits within the number. If the supplied value is not a string, implementations MUST issue a warning and proceed as if the property had not been specified." */
	defaultDigitGroupSeparator?: string;
	/** A default string indicating the value to substitute for an empty string. From https://www.w3.org/TR/tabular-metadata/ Inherited 5.7  "default - An atomic property holding a single string that is used to create a default value for the cell in cases where the original string value is an empty string. See Parsing Cells in [tabular-data-model] for more details. If not specified, the default for the default property is the empty string, "". The value of this property becomes the default annotation for the described column." */
	defaultValue: string;
	/** This defines the format of the physical representation of the value. From https://www.w3.org/TR/tabular-metadata/ 5.11.2 format: "An atomic property that contains either a single string or an object that defines the format of a value of this type, used when parsing a string value as described in Parsing Cells in [tabular-data-model]. The value of this property becomes the format annotation for the described datatype." See https://www.w3.org/TR/tabular-metadata/ Tabular 6.4.2 "Formats for numeric datatypes" this may include decimalChar, groupChar, pattern "By default, numeric values must be in the formats defined in [xmlschema11-2]. It is not uncommon for numbers within tabular data to be formatted for human consumption, which may involve using commas for decimal points, grouping digits in the number using commas, or adding percent signs to the number." See https://www.w3.org/TR/tabular-metadata/ Tabular 6.4. Formats for Booleans " Boolean values may be represented in many ways aside from the standard 1 and 0 or true and false." See https://www.w3.org/TR/tabular-metadata/ 6.4.4. Formats for dates and times "By default, dates and times are assumed to be in the format defined in [xmlschema11-2]. However dates and times are commonly represented in tabular data in other formats." See https://www.w3.org/TR/tabular-metadata/ 6.4.5 Formats for durations "Durations MUST be formatted and interpreted as defined in [xmlschema11-2], using the [ISO8601] format -?PnYnMnDTnHnMnS. For example, the duration P1Y1D is used for a year and a day; the duration PT2H30M for 2 hours and 30 minutes." See https://www.w3.org/TR/tabular-metadata/ 6.4.6 Formats for other types "If the datatype base is not numeric, boolean, a date/time type, or a duration type, the datatype format annotation provides a regular expression for the string values, with syntax and processing defined by [ECMASCRIPT]. If the supplied value is not a valid regular expression, implementations MUST issue a warning and proceed as if no format had been provided." From DDI3.2 ManagedNumericRepresentation@format "A format for number expressed as a string." From DDI3.2 ManagedDateTimeRepresentation_DateFieldFormat "Describes the format of the date field, in formats such as YYYY/MM or MM-DD-YY, etc. If this element is omitted, then the format is assumed to be the XML Schema format corresponding to the type attribute value." */
	format?: ControlledVocabularyEntry;
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	/** If the value of this property is True indicates that a value is required for the referenced instance variable. From the W3C Recommendation "Metadata Vocabulary for Tabular Data" (https://www.w3.org/TR/tabular-metadata/) 5.7 Inherited Properties: "required: A boolean atomic property taking a single value which indicates whether the cell value can be null. See Parsing Cells in [tabular-data-model] for more details. The default is false, which means cells can have null values. The value of this property becomes the required annotation for the described column." */
	isRequired?: boolean;
	/** The length in characters of the physical representation of the value. From the W3C Recommendation "Metadata Vocabulary for Tabular Data" (https://www.w3.org/TR/tabular-metadata/)  5.11.2 "length: A numeric atomic property that contains a single integer that is the exact length of the value. The value of this property becomes the length annotation for the described datatype. See Length Constraints in [tabular-data-model] for details." Corresponds to DDI2.5 var/location/width and DDI 3.2 PhysicalLocation/Width. */
	length?: number;
	/** The largest possible value of the length of the physical representation of the value. From the W3C Recommendation "Metadata Vocabulary for Tabular Data" (https://www.w3.org/TR/tabular-metadata/) 5.11.2: "maxLength: A numeric atomic property that contains a single integer that is the maximum length of the value. The value of this property becomes the maximum length annotation for the described datatype. See Length Constraints in [tabular-data-model] for details." */
	maximumLength?: number;
	/** The smallest possible value for the length of the physical representation of the value. From the W3C Recommendation "Metadata Vocabulary for Tabular Data" (https://www.w3.org/TR/tabular-metadata/)  5.11.2: "minLength: An atomic property that contains a single integer that is the minimum length of the value. The value of this property becomes the minimum length annotation for the described datatype. See Length Constraints in [tabular-data-model] for details." */
	minimumLength?: number;
	/** A string indicating a null value. From the W3C Recommendation "Metadata Vocabulary for Tabular Data" (https://www.w3.org/TR/tabular-metadata/) 4.3: "null: the string or strings which cause the value of cells having string value matching any of these values to be null." From the same source, Inherited 5.7: "null: An atomic property giving the string or strings used for null values within the data. If the string value of the cell is equal to any one of these values, the cell value is null. See Parsing Cells in [tabular-data-model] for more details. If not specified, the default for the null property is the empty string ''. The value of this property becomes the null annotation for the described column." */
	nullSequence?: string;
	/** A pattern description of the format of a numeric value. In W3C part of the datatype format From https://www.w3.org/TR/tabular-metadata/ tabular 6.4.2 pattern: "A number format pattern as defined in [UAX35] http://www.unicode.org/reports/tr35/tr35-31/tr35-numbers.html#Number_Format_Patterns. Implementations MUST recognise number format patterns containing the symbols 0, #, the specified decimalChar (or "." if unspecified), the specified groupChar (or "," if unspecified), E, +, % and ‰. Implementations MAY additionally recognise number format patterns containing other special pattern characters defined in [UAX35]. If the supplied value is not a string, or if it contains an invalid number format pattern or uses special pattern characters that the implementation does not recognise, implementations MUST issue a warning and proceed as if the property had not been specified. If the datatype format annotation is a single string, this is interpreted in the same way as if it were an object with a pattern property whose value is that string. If the groupChar is specified, but no pattern is supplied, when parsing the string value of a cell against this format specification, implementations MUST recognise and parse numbers that consist of: an optional + or - sign, …  Implementations MAY also recognise numeric values that are in any of the standard-decimal, standard-percent or standard-scientific formats listed in the Unicode Common Locale Data Repository. …" */
	numberPattern?: string;
	/** The base datatype of the physical representation. An integer InstanceVariable might, for example, be stored as a floating point number. From the W3C Recommendation "Metadata Vocabulary for Tabular Data" (https://www.w3.org/TR/tabular-metadata/) Inherited 5.7: "datatype: An atomic property that contains either a single string that is the main datatype of the values of the cell or a datatype description object. If the value of this property is a string, it MUST be the name of one of the built-in datatypes defined in section 5.11.1 Built-in Datatypes and this value is normalized to an object whose base property is the original string value. If it is an object then it describes a more specialized datatype. If a cell contains a sequence (i.e. the separator property is specified and not null) then this property specifies the datatype of each value within that sequence. See 5.11 Datatypes and Parsing Cells in [tabular-data-model] for more details.  The normalized value of this property becomes the datatype annotation for the described column." */
	physicalDataType?: ControlledVocabularyEntry;
	/** The scale of the number expressed as an integer. A multiplier to be used in combination with the value to determine the measurement. (E.g., a number expressed in 100's with a value of 5 and a scale of 100 would be 500). */
	scale?: number;
	ValueMapping_formats_DataPoint?: ValueMappingValueMapping_formats_DataPointType[];
	/** Uses a physical segment location to describe where in the physical record a segment representing the data point is. This could be, for example, described as a start position and end position value for characters in a text record via the segment by text extension of physical segment location. */
	ValueMapping_uses_PhysicalSegmentLocation?: ValueMappingValueMapping_uses_PhysicalSegmentLocationType;
}
export interface ValueMapping extends _ValueMapping { constructor: { new(): ValueMapping }; }
export var ValueMapping: { new(): ValueMapping };

/** Definition
  * ============
  * Denotes the position of a value mapping in a sequence. */
interface _ValueMappingPosition extends BaseType {
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	/** Index value of the member in an ordered array. */
	value: number;
	/** Assigns a position to a value mapping within a physical segment. */
	ValueMappingPosition_indexes_ValueMapping: ValueMappingPositionValueMappingPosition_indexes_ValueMappingType;
}
export interface ValueMappingPosition extends _ValueMappingPosition { constructor: { new(): ValueMappingPosition }; }
export var ValueMappingPosition: { new(): ValueMappingPosition };

interface _ValueMappingPositionValueMappingPosition_indexes_ValueMappingType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: ValueMappingPositionValueMappingPosition_indexes_ValueMappingTypeValidTypeType[];
}
interface ValueMappingPositionValueMappingPosition_indexes_ValueMappingType extends _ValueMappingPositionValueMappingPosition_indexes_ValueMappingType { constructor: { new(): ValueMappingPositionValueMappingPosition_indexes_ValueMappingType }; }

type ValueMappingPositionValueMappingPosition_indexes_ValueMappingTypeValidTypeType = "ValueMapping";
interface _ValueMappingPositionValueMappingPosition_indexes_ValueMappingTypeValidTypeType extends Primitive._string { content: ValueMappingPositionValueMappingPosition_indexes_ValueMappingTypeValidTypeType; }

/** Definition
  * ============
  * Relationships among data points in a physical layout. */
interface _ValueMappingRelationship extends BaseType {
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	/** Specifies the semantics of the object in reference to a vocabulary, ontology, etc. */
	semantics?: ControlledVocabularyEntry;
	/** Specialization of source to variable mapping. */
	ValueMappingRelationship_hasSource_ValueMapping?: ValueMappingRelationshipValueMappingRelationship_hasSource_ValueMappingType[];
	/** Specialization of target to variable mapping. Restricts cardinality. */
	ValueMappingRelationship_hasTarget_ValueMapping?: ValueMappingRelationshipValueMappingRelationship_hasTarget_ValueMappingType[];
}
export interface ValueMappingRelationship extends _ValueMappingRelationship { constructor: { new(): ValueMappingRelationship }; }
export var ValueMappingRelationship: { new(): ValueMappingRelationship };

interface _ValueMappingRelationshipValueMappingRelationship_hasSource_ValueMappingType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: ValueMappingRelationshipValueMappingRelationship_hasSource_ValueMappingTypeValidTypeType[];
}
interface ValueMappingRelationshipValueMappingRelationship_hasSource_ValueMappingType extends _ValueMappingRelationshipValueMappingRelationship_hasSource_ValueMappingType { constructor: { new(): ValueMappingRelationshipValueMappingRelationship_hasSource_ValueMappingType }; }

type ValueMappingRelationshipValueMappingRelationship_hasSource_ValueMappingTypeValidTypeType = "ValueMapping";
interface _ValueMappingRelationshipValueMappingRelationship_hasSource_ValueMappingTypeValidTypeType extends Primitive._string { content: ValueMappingRelationshipValueMappingRelationship_hasSource_ValueMappingTypeValidTypeType; }

interface _ValueMappingRelationshipValueMappingRelationship_hasTarget_ValueMappingType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: ValueMappingRelationshipValueMappingRelationship_hasTarget_ValueMappingTypeValidTypeType[];
}
interface ValueMappingRelationshipValueMappingRelationship_hasTarget_ValueMappingType extends _ValueMappingRelationshipValueMappingRelationship_hasTarget_ValueMappingType { constructor: { new(): ValueMappingRelationshipValueMappingRelationship_hasTarget_ValueMappingType }; }

type ValueMappingRelationshipValueMappingRelationship_hasTarget_ValueMappingTypeValidTypeType = "ValueMapping";
interface _ValueMappingRelationshipValueMappingRelationship_hasTarget_ValueMappingTypeValidTypeType extends Primitive._string { content: ValueMappingRelationshipValueMappingRelationship_hasTarget_ValueMappingTypeValidTypeType; }

interface _ValueMappingValueMapping_formats_DataPointType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType: ValueMappingValueMapping_formats_DataPointTypeValidTypeType[];
}
interface ValueMappingValueMapping_formats_DataPointType extends _ValueMappingValueMapping_formats_DataPointType { constructor: { new(): ValueMappingValueMapping_formats_DataPointType }; }

type ValueMappingValueMapping_formats_DataPointTypeValidTypeType = "DataPoint";
interface _ValueMappingValueMapping_formats_DataPointTypeValidTypeType extends Primitive._string { content: ValueMappingValueMapping_formats_DataPointTypeValidTypeType; }

interface _ValueMappingValueMapping_uses_PhysicalSegmentLocationType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: ValueMappingValueMapping_uses_PhysicalSegmentLocationTypeValidTypeType[];
}
interface ValueMappingValueMapping_uses_PhysicalSegmentLocationType extends _ValueMappingValueMapping_uses_PhysicalSegmentLocationType { constructor: { new(): ValueMappingValueMapping_uses_PhysicalSegmentLocationType }; }

type ValueMappingValueMapping_uses_PhysicalSegmentLocationTypeValidTypeType = ("PhysicalSegmentLocation" | "SegmentByText");
interface _ValueMappingValueMapping_uses_PhysicalSegmentLocationTypeValidTypeType extends Primitive._string { content: ValueMappingValueMapping_uses_PhysicalSegmentLocationTypeValidTypeType; }

/** Definition
  * ==========
  * Group of any type of variable within the variable cascade (conceptual, represented, instance).
  *
  * Examples
  * ========
  * 1. Variables within a specific section of a study
  * 2. Variables related to a specific subject or keyword
  * 3. Variables at a specified level of development or review
  *
  * Explanatory notes
  * =================
  * A simple ordered or unordered list of variables can be described via a set of variable position parameters. An optional variable structure can describe a more complex structure for the collection. We might, for example, use the variable structure to group variables by content within a single collection of data or a wave of on-going data collection. For the purposes of management, conceptualization or anything other than organizing a logical record or physical layout. */
interface _VariableCollection extends BaseType {
	/** If value is False, the members are unique within the collection - if True, there may be duplicates. (Note that a mathematical “bag” permits duplicates and is unordered - a “set” does not have duplicates and may be ordered.) */
	allowsDuplicates: boolean;
	/** A human-readable display label for the object. Supports the use of multiple languages. Repeat for labels with different content, for example, labels with differing length limitations. */
	displayLabel?: LabelForDisplay[];
	/** A semantic term defining the factor used for defining this group. */
	groupingSemantic?: ControlledVocabularyEntry;
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	/** Human understandable name (liguistic signifier, word, phrase, or mnemonic). May follow ISO/IEC 11179-5 naming principles, and have context provided to specify usage. */
	name?: ObjectName[];
	/** Intent or reason for the object/the description of the object. */
	purpose?: InternationalString;
	/** Explanation of the ways in which the object is employed. */
	usage?: InternationalString;
	/** Variable collection has zero to many conceptual variables. */
	VariableCollection_has_ConceptualVariable?: VariableCollectionVariableCollection_has_ConceptualVariableType[];
	/** Variable collection has zero to many variable positions. */
	VariableCollection_has_VariablePosition?: VariableCollectionVariableCollection_has_VariablePositionType[];
	/** The conceptual basis for the collection of members. */
	VariableCollection_isDefinedBy_Concept?: VariableCollectionVariableCollection_isDefinedBy_ConceptType[];
}
export interface VariableCollection extends _VariableCollection { constructor: { new(): VariableCollection }; }
export var VariableCollection: { new(): VariableCollection };

interface _VariableCollectionVariableCollection_has_ConceptualVariableType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: VariableCollectionVariableCollection_has_ConceptualVariableTypeValidTypeType[];
}
interface VariableCollectionVariableCollection_has_ConceptualVariableType extends _VariableCollectionVariableCollection_has_ConceptualVariableType { constructor: { new(): VariableCollectionVariableCollection_has_ConceptualVariableType }; }

type VariableCollectionVariableCollection_has_ConceptualVariableTypeValidTypeType = ("ConceptualVariable" | "DescriptorVariable" | "InstanceVariable" | "ReferenceVariable" | "RepresentedVariable");
interface _VariableCollectionVariableCollection_has_ConceptualVariableTypeValidTypeType extends Primitive._string { content: VariableCollectionVariableCollection_has_ConceptualVariableTypeValidTypeType; }

interface _VariableCollectionVariableCollection_has_VariablePositionType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType: VariableCollectionVariableCollection_has_VariablePositionTypeValidTypeType[];
}
interface VariableCollectionVariableCollection_has_VariablePositionType extends _VariableCollectionVariableCollection_has_VariablePositionType { constructor: { new(): VariableCollectionVariableCollection_has_VariablePositionType }; }

type VariableCollectionVariableCollection_has_VariablePositionTypeValidTypeType = "VariablePosition";
interface _VariableCollectionVariableCollection_has_VariablePositionTypeValidTypeType extends Primitive._string { content: VariableCollectionVariableCollection_has_VariablePositionTypeValidTypeType; }

interface _VariableCollectionVariableCollection_isDefinedBy_ConceptType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: VariableCollectionVariableCollection_isDefinedBy_ConceptTypeValidTypeType[];
}
interface VariableCollectionVariableCollection_isDefinedBy_ConceptType extends _VariableCollectionVariableCollection_isDefinedBy_ConceptType { constructor: { new(): VariableCollectionVariableCollection_isDefinedBy_ConceptType }; }

type VariableCollectionVariableCollection_isDefinedBy_ConceptTypeValidTypeType = ("Category" | "Concept" | "ConceptualValue" | "ConceptualVariable" | "DescriptorVariable" | "DimensionalKeyDefinitionMember" | "InstanceVariable" | "KeyDefinitionMember" | "Population" | "ReferenceVariable" | "RepresentedVariable" | "UnitType" | "Universe");
interface _VariableCollectionVariableCollection_isDefinedBy_ConceptTypeValidTypeType extends Primitive._string { content: VariableCollectionVariableCollection_isDefinedBy_ConceptTypeValidTypeType; }

/** Definition
  * ============
  * Role given to a represented variable in the context of a data structure to provide codes for variable identification.
  *
  * Examples
  * ==========
  * Consider {"income", "age"} to be the value domain of the represented variable working as a variable descriptor component.  The two codes, i.e. those designating "income" and "age", are descriptors used to identify which values in the variable value component correspond to income and which ones to age.
  *
  * Explanatory notes
  * ===================
  * Whenever more than one variable appears in the same column, we need a mechanism to distinguish which values correspond to which variable. This mechanism is provided by the variable descriptor component, which contains the codes used to link the variables to their values.  This structure provides a flexible mechanism avoiding the need for a formal pointer. */
interface _VariableDescriptorComponent extends _DataStructureComponent {
	VariableDescriptorComponent_isDefinedBy_DescriptorVariable?: VariableDescriptorComponentVariableDescriptorComponent_isDefinedBy_DescriptorVariableType;
	VariableDescriptorComponent_refersTo_VariableValueComponent: VariableDescriptorComponentVariableDescriptorComponent_refersTo_VariableValueComponentType;
}
export interface VariableDescriptorComponent extends _VariableDescriptorComponent { constructor: { new(): VariableDescriptorComponent }; }
export var VariableDescriptorComponent: { new(): VariableDescriptorComponent };

interface _VariableDescriptorComponentVariableDescriptorComponent_isDefinedBy_DescriptorVariableType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: VariableDescriptorComponentVariableDescriptorComponent_isDefinedBy_DescriptorVariableTypeValidTypeType[];
}
interface VariableDescriptorComponentVariableDescriptorComponent_isDefinedBy_DescriptorVariableType extends _VariableDescriptorComponentVariableDescriptorComponent_isDefinedBy_DescriptorVariableType { constructor: { new(): VariableDescriptorComponentVariableDescriptorComponent_isDefinedBy_DescriptorVariableType }; }

type VariableDescriptorComponentVariableDescriptorComponent_isDefinedBy_DescriptorVariableTypeValidTypeType = "DescriptorVariable";
interface _VariableDescriptorComponentVariableDescriptorComponent_isDefinedBy_DescriptorVariableTypeValidTypeType extends Primitive._string { content: VariableDescriptorComponentVariableDescriptorComponent_isDefinedBy_DescriptorVariableTypeValidTypeType; }

interface _VariableDescriptorComponentVariableDescriptorComponent_refersTo_VariableValueComponentType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType: VariableDescriptorComponentVariableDescriptorComponent_refersTo_VariableValueComponentTypeValidTypeType[];
}
interface VariableDescriptorComponentVariableDescriptorComponent_refersTo_VariableValueComponentType extends _VariableDescriptorComponentVariableDescriptorComponent_refersTo_VariableValueComponentType { constructor: { new(): VariableDescriptorComponentVariableDescriptorComponent_refersTo_VariableValueComponentType }; }

type VariableDescriptorComponentVariableDescriptorComponent_refersTo_VariableValueComponentTypeValidTypeType = "VariableValueComponent";
interface _VariableDescriptorComponentVariableDescriptorComponent_refersTo_VariableValueComponentTypeValidTypeType extends Primitive._string { content: VariableDescriptorComponentVariableDescriptorComponent_refersTo_VariableValueComponentTypeValidTypeType; }

/** Definition
  * ============
  * Assigns a sequence number to a variable within a list.
  *
  * Explanatory notes
  * ===================
  * Variable position allows a list of variables to be ordered. */
interface _VariablePosition extends BaseType {
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	/** Index value of the member in an ordered array. */
	value: number;
	/** Variable position indexes a conceptual variable. */
	VariablePosition_indexes_ConceptualVariable: VariablePositionVariablePosition_indexes_ConceptualVariableType;
}
export interface VariablePosition extends _VariablePosition { constructor: { new(): VariablePosition }; }
export var VariablePosition: { new(): VariablePosition };

interface _VariablePositionVariablePosition_indexes_ConceptualVariableType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: VariablePositionVariablePosition_indexes_ConceptualVariableTypeValidTypeType[];
}
interface VariablePositionVariablePosition_indexes_ConceptualVariableType extends _VariablePositionVariablePosition_indexes_ConceptualVariableType { constructor: { new(): VariablePositionVariablePosition_indexes_ConceptualVariableType }; }

type VariablePositionVariablePosition_indexes_ConceptualVariableTypeValidTypeType = ("ConceptualVariable" | "DescriptorVariable" | "InstanceVariable" | "ReferenceVariable" | "RepresentedVariable");
interface _VariablePositionVariablePosition_indexes_ConceptualVariableTypeValidTypeType extends Primitive._string { content: VariablePositionVariablePosition_indexes_ConceptualVariableTypeValidTypeType; }

/** Definition
  * ============
  * Relationship between any variables in the variable cascade (conceptual, represented, instance), based on an ordered relation. */
interface _VariableRelationship extends BaseType {
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	/** Specifies the semantics of the object in reference to a vocabulary, ontology, etc. */
	semantics?: ControlledVocabularyEntry;
	VariableRelationship_hasSource_ConceptualVariable?: VariableRelationshipVariableRelationship_hasSource_ConceptualVariableType[];
	/** Note that this can be realized as a collection to support tuples. */
	VariableRelationship_hasTarget_ConceptualVariable?: VariableRelationshipVariableRelationship_hasTarget_ConceptualVariableType[];
}
export interface VariableRelationship extends _VariableRelationship { constructor: { new(): VariableRelationship }; }
export var VariableRelationship: { new(): VariableRelationship };

interface _VariableRelationshipVariableRelationship_hasSource_ConceptualVariableType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: VariableRelationshipVariableRelationship_hasSource_ConceptualVariableTypeValidTypeType[];
}
interface VariableRelationshipVariableRelationship_hasSource_ConceptualVariableType extends _VariableRelationshipVariableRelationship_hasSource_ConceptualVariableType { constructor: { new(): VariableRelationshipVariableRelationship_hasSource_ConceptualVariableType }; }

type VariableRelationshipVariableRelationship_hasSource_ConceptualVariableTypeValidTypeType = ("ConceptualVariable" | "DescriptorVariable" | "InstanceVariable" | "ReferenceVariable" | "RepresentedVariable");
interface _VariableRelationshipVariableRelationship_hasSource_ConceptualVariableTypeValidTypeType extends Primitive._string { content: VariableRelationshipVariableRelationship_hasSource_ConceptualVariableTypeValidTypeType; }

interface _VariableRelationshipVariableRelationship_hasTarget_ConceptualVariableType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: VariableRelationshipVariableRelationship_hasTarget_ConceptualVariableTypeValidTypeType[];
}
interface VariableRelationshipVariableRelationship_hasTarget_ConceptualVariableType extends _VariableRelationshipVariableRelationship_hasTarget_ConceptualVariableType { constructor: { new(): VariableRelationshipVariableRelationship_hasTarget_ConceptualVariableType }; }

type VariableRelationshipVariableRelationship_hasTarget_ConceptualVariableTypeValidTypeType = ("ConceptualVariable" | "DescriptorVariable" | "InstanceVariable" | "ReferenceVariable" | "RepresentedVariable");
interface _VariableRelationshipVariableRelationship_hasTarget_ConceptualVariableTypeValidTypeType extends Primitive._string { content: VariableRelationshipVariableRelationship_hasTarget_ConceptualVariableTypeValidTypeType; }

/** Definition
  * ============
  * Relation structure for use with any set of variables in the variable cascade (conceptual, represented, instance). */
interface _VariableStructure extends BaseType {
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	/** Human understandable name (liguistic signifier, word, phrase, or mnemonic). May follow ISO/IEC 11179-5 naming principles, and have context provided to specify usage. */
	name?: OrganizationName[];
	/** Intent or reason for the object/the description of the object. */
	purpose?: InternationalString;
	/** Specifies the semantics of the object in reference to a vocabulary, ontology, etc. */
	semantics?: ControlledVocabularyEntry;
	/** Provides information on reflexivity, transitivity, and symmetry of relationship using a descriptive term from an enumerated list. Use if all relations within this relation structure are of the same specification. */
	specification?: StructureSpecification;
	/** Indicates the form of the associations among members of the collection. Specifies the way in which constituent parts are interrelated or arranged. */
	topology?: ControlledVocabularyEntry;
	/** Indicates whether the related collections are comprehensive in terms of their coverage. */
	totality?: StructureExtent;
	VariableStructure_has_VariableRelationship?: VariableStructureVariableStructure_has_VariableRelationshipType[];
	/** Variable structure structures zero to one variable collection. */
	VariableStructure_structures_VariableCollection?: VariableStructureVariableStructure_structures_VariableCollectionType;
}
export interface VariableStructure extends _VariableStructure { constructor: { new(): VariableStructure }; }
export var VariableStructure: { new(): VariableStructure };

interface _VariableStructureVariableStructure_has_VariableRelationshipType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType: VariableStructureVariableStructure_has_VariableRelationshipTypeValidTypeType[];
}
interface VariableStructureVariableStructure_has_VariableRelationshipType extends _VariableStructureVariableStructure_has_VariableRelationshipType { constructor: { new(): VariableStructureVariableStructure_has_VariableRelationshipType }; }

type VariableStructureVariableStructure_has_VariableRelationshipTypeValidTypeType = "VariableRelationship";
interface _VariableStructureVariableStructure_has_VariableRelationshipTypeValidTypeType extends Primitive._string { content: VariableStructureVariableStructure_has_VariableRelationshipTypeValidTypeType; }

interface _VariableStructureVariableStructure_structures_VariableCollectionType extends _AssociationReference {
	ddiReference?: InternationalRegistrationDataIdentifier;
	validType?: VariableStructureVariableStructure_structures_VariableCollectionTypeValidTypeType[];
}
interface VariableStructureVariableStructure_structures_VariableCollectionType extends _VariableStructureVariableStructure_structures_VariableCollectionType { constructor: { new(): VariableStructureVariableStructure_structures_VariableCollectionType }; }

type VariableStructureVariableStructure_structures_VariableCollectionTypeValidTypeType = "VariableCollection";
interface _VariableStructureVariableStructure_structures_VariableCollectionTypeValidTypeType extends Primitive._string { content: VariableStructureVariableStructure_structures_VariableCollectionTypeValidTypeType; }

/** Definition
  * ============
  * Role given to a represented variable in the context of a data structure to record values of multiple variables.
  *
  * Examples
  * ==========
  * Consider two variables, i.e. income and age, with their values living together in different entries in the same column.  The values of those two variables are now in the value domain of a single variable (the one working as a variable value component).  Another column, based on a variable descriptor component, use codes for "income" and "age" to distinguish income values from age values.
  *
  * Explanatory notes
  * ===================
  * A variable value component captures the values of multiple variables that have been transposed into a single column.  The variable descriptor component provides a mechanism to identify which of those values correspond to which variable.   This structure provides a flexible mechanism avoiding the need for a formal pointer. */
interface _VariableValueComponent extends _DataStructureComponent {}
export interface VariableValueComponent extends _VariableValueComponent { constructor: { new(): VariableValueComponent }; }
export var VariableValueComponent: { new(): VariableValueComponent };

/** Definition
  * ============
  * A web site (normally a URL) with information on type of site, privacy flag, and effective dates. */
interface _WebLink extends BaseType {
	/** The period for which this URL is valid. */
	effectiveDates?: DateRange;
	/** Set to True if this is the preferred URL. */
	isPreferred?: boolean;
	/** Indicates the privacy level of this URL. */
	privacy?: ControlledVocabularyEntry;
	/** The type of Website URL, for example personal, project, organization, division, etc. */
	typeOfWebsite?: ControlledVocabularyEntry;
	/** A Uniform Resource Identifier (URI) is a compact sequence of characters that identifies an abstract or physical resource. Normally a URL. */
	uri?: string;
}
export interface WebLink extends _WebLink { constructor: { new(): WebLink }; }
export var WebLink: { new(): WebLink };

/** Definition
  * ============
  * WhiteSpace constrains the value space of types derived from string. */
export type WhiteSpaceRule = ("Collapse" | "Preserve" | "Replace");
interface _WhiteSpaceRule extends Primitive._string { content: WhiteSpaceRule; }

/** Definition
  * ============
  * Organized collection of wide data. It is structured by a wide data structure.
  *
  * Examples
  * ==========
  * A unit dataset where each row corresponds to a set of data points capturing different characteristics of a unit. */
interface _WideDataSet extends _DataSet {}
export interface WideDataSet extends _WideDataSet { constructor: { new(): WideDataSet }; }
export var WideDataSet: { new(): WideDataSet };

/** Definition
  * ==========
  * Structure of a wide dataset (organized collection of wide data). It is described by identifier, measure and attribute components.
  *
  * Examples
  * ==========
  * The structure described by [Unit id, Income, Province] where Unit id identifies a statistical unit and Income and Province are two instance variables capturing characteristics. */
interface _WideDataStructure extends _DataStructure {}
export interface WideDataStructure extends _WideDataStructure { constructor: { new(): WideDataStructure }; }
export var WideDataStructure: { new(): WideDataStructure };

/** Definition
  * ==========
  * Collection of data instances that uniquely identify a collection of data points in a wide dataset.
  *
  * Examples
  * ==========
  * Collection containing the single "1A2B3C" string in a wide dataset where rows are identified by postal code representations. */
interface _WideKey extends _Key {}
export interface WideKey extends _WideKey { constructor: { new(): WideKey }; }
export var WideKey: { new(): WideKey };

/** Definition
  * ============
  * Single data instance that is part of a wide key.
  *
  * Examples
  * ==========
  * The "1A2B3C" string in a wide dataset where rows are identified by postal code representations. */
interface _WideKeyMember extends _KeyMember {}
export interface WideKeyMember extends _WideKeyMember { constructor: { new(): WideKeyMember }; }
export var WideKeyMember: { new(): WideKeyMember };

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
	/** Definition
	  * ============
	  * Complex relation structure for use with statistical classification.
	  *
	  * Examples
	  * ==========
	  * A classification item structure for the International Standard Classification of Occupations (ISCO-08: https://www.ilo.org/public/english/bureau/stat/isco/isco08/) would describe each of the major classifications as a parent of its sub-classifications. 1 Managers, for example would be listed as a parent of four sub groups: 11 Chief Executives, Senior Officials and Legislators; 12 Chief Executives, Senior Officials and Legislators; 13 Production and Specialized Services Managers; and 14 Hospitality, Retail and Other Services Managers.
	  *
	  * Explanatory notes
	  * ===================
	  * The classification item structure has a set of classification item relationships which are basically adjacency lists. A source classification item has a described relationship to a target list of classification items. The semantic might be, for example, "parentOf", or "contains", etc. */
	ClassificationItemStructure?: ClassificationItemStructure[];
	/** Definition
	  * ============
	  * The index of a classification within a classification family expressed as an integer, progressing upward from 0 or 1. */
	ClassificationPosition?: ClassificationPosition[];
	/** Definition
	  * ============
	  * Ensemble of one or more statistical classifications, based on the same concept, and related to each other as versions or updates.
	  *
	  * Examples
	  * ==========
	  * ISIC or ISCO
	  * SIC (with different published versions related to the publication year).
	  *
	  * Explanatory notes
	  * ===================
	  * Typically, these statistical classifications have the same name. */
	ClassificationSeries?: ClassificationSeries[];
	/** Definition
	  * ============
	  * Structure for describing the complex relationships between statistical classifications in a classification series.
	  *
	  * Examples
	  * ==========
	  * A classification series that branches into separately versioned classifications.
	  *
	  * Explanatory notes
	  * ===================
	  * Can use relation specification information to more fully describe the relationship between members such as parent/child, whole/part, general/specific, equivalence, etc. */
	ClassificationSeriesStructure?: ClassificationSeriesStructure[];
	/** Definition
	  * ============
	  * The characters used as a symbol to designate a category within a codelist or classification. (Formally, a sign for which the signifier is non-linguistic alphanumeric string.)
	  *
	  * Examples
	  * ==========
	  * The letter M might stand for the category "Male" in the codeList called "Gender".
	  *
	  * Explanatory notes
	  * ===================
	  * A non-linguistic alphanumeric string is one which does not correspond to a word in natural language. For use in a codelist. The representation property (value) is expressed as it would be found in a data file. Multiple representations may relate to the same category but should be expressed as separate codes.  It should not be confused with a classification item which is a placeholder for a position in a statistical classification. */
	Code?: Code[];
	/** Definition
	  * ============
	  * List of codes and associated categories.
	  *
	  * Examples
	  * ==========
	  * The codes "M" and "F" could point to "Male" and "Female" categories respectively.  A code list for an occupational classification system like the International Standard Classification of Occupations (ISCO-08: https://www.ilo.org/public/english/bureau/stat/isco/isco08/) could use a classification relation structure to describe a hierarchy (Chief Executives and Administrative and Commercial Managers as subtypes of Managers).
	  *
	  * Explanatory notes
	  * ===================
	  * List may be flat or hierarchical. A hierarchical structure may have an indexed order for intended presentation even though the content within levels of the hierarchy are conceptually unordered. For hierarchical structures classification item structure is used to provide additional information on the structure and organization of the categories. Note that a category set can be structured by a classification relation structure without the need for associating any codes with the categories. This allows for the creation of a category set, for example for a response domain, without an associated codelist. */
	CodeList?: CodeList[];
	/** Definition
	  * ============
	  * Relation structure of codes within a codelist.
	  *
	  * Explanatory notes
	  * ===================
	  * Allows for the specification of complex relationships among codes. The code list structure employs a set of code relationips to describe the relationship among concepts. Each code relationship is a one to many description of connections between codes. Together they might commonly describe relationships as complex as a hierarchy. */
	CodeListStructure?: CodeListStructure[];
	/** Definition
	  * ============
	  * An index within an order intended for presentation (even though the content within levels of the hierarchy may be conceptually unordered). Expressed as an integer counting upward from 01 or 1. */
	CodePosition?: CodePosition[];
	/** Definition
	  * ============
	  * Source target relationship between codes in a code relation structure. */
	CodeRelationship?: CodeRelationship[];
	/** Definition
	  * ============
	  * Indexes the components in a data structure using integers with a position indicated by incrementing upward from 0 or 1. */
	ComponentPosition?: ComponentPosition[];
	/** Definition
	  * ============
	  * Unit of thought differentiated by characteristics (from the Generic Statistical Information Model version 1.2: https://statswiki.unece.org/display/clickablegsim/Concept).
	  *
	  * Examples
	  * ==========
	  * Velocity, Distance, Poverty, Income, Household Relationship, Family, Gender, Business Establishment, Satisfaction, Mass, Air Quality, etc.
	  *
	  * Explanatory notes
	  * ===================
	  * Many DDI-CDI classes are subtypes of the concept class including category, universe, unit type, conceptual variable. This class realizes the pattern class signified and as such a concept can be denoted by a sign. */
	Concept?: Concept[];
	/** Definition
	  * ============
	  * Correspondence between concepts in a correspondence table.
	  *
	  * Examples
	  * ==========
	  * A simple example might map the following 2 martial status category sets:  MS1: single, married, widowed, divorced. MS2: single, married.  So, a correspondence table between these 2 category sets might look like this: MS1 single - MS2 single; MS1 widowed - MS2 single; MS1 divorced - MS2 single; MS1 married - MS2 married.
	  *
	  * Explanatory notes
	  * ===================
	  * A concept map is the pairing of similar concepts. Each concept in the map belongs to a different collection. The collection of maps for all the concepts in corresponding collections is a correspondence table. */
	ConceptMap?: ConceptMap[];
	/** Definition
	  * ============
	  * Relationship between a pair of concepts in a collection of concepts. Use controlled vocabulary provided in semantics to identify the type of relationship (relation, e.g. ParentChild, WholePart, etc.)
	  *
	  * Examples
	  * ==========
	  * Apple (a specialized concept) is a kind of fruit (a generic concept). A wheel (a partitive concept) is part of a car (a whole concept).
	  *
	  * Explanatory notes
	  * ===================
	  * The idea is similar to category relationship, except it applies generally and not just for categories. */
	ConceptRelationship?: ConceptRelationship[];
	/** Definition
	  * ============
	  * Relations of concepts within a collection.
	  *
	  * Examples
	  * ==========
	  * A concept of vacation might be described as having sub-types of beach vacation and mountain vacation.
	  *
	  * Explanatory notes
	  * ===================
	  * The concept structure employs a set of concept relationships to describe the relationship among concepts. Each concept relationship is a one to many description of connections between concepts. Together they can describe relationships as complex as a hierarchy or even a complete cyclical network as in a concept map. Allows for the specification of complex relationships among concepts. */
	ConceptStructure?: ConceptStructure[];
	/** Definition
	  * ============
	  * Set of concepts structured by the relations among them [GSIM 1.1].
	  *
	  * Examples
	  * ==========
	  * 1) Concept of Sex: Male, Female, Other.
	  * 2) Concept of Household Relationship: Household Head, Spouse of Household Head, Child of Household Head, Unrelated Household Member, etc.
	  *
	  * Explanatory notes
	  * ===================
	  * Note that this class can be used with concepts, classifications, universes, populations, unit types and any other class that extends from concept. */
	ConceptSystem?: ConceptSystem[];
	/** Definition
	  * ============
	  * Relationship between 2 or more concept systems described through mapping similarity relationships between their member concepts.
	  *
	  * Examples
	  * ==========
	  * Correspondence between the concepts used to define the amount of salt dissolved in a body of water: the concepts "salinity" and "saltiness" might be described as equivalent, for example.
	  *
	  * Explanatory notes
	  * ===================
	  * Describes correspondence with one or more maps which identify a source and target concept and defines their commonality and difference using descriptive text and controlled vocabularies. */
	ConceptSystemCorrespondence?: ConceptSystemCorrespondence[];
	/** Definition
	  * ============
	  * Set of concepts, where each concept is intended to be used as the meaning (signified) for a datum.
	  *
	  * Examples
	  * ==========
	  * Substantive: Housing Unit Tenure - Owned, Rented, Vacant. Sentinel: Non-response - Refused, Don't Know, Not Applicable
	  *
	  * Explanatory notes
	  * ===================
	  * Intent of a conceptual domain is defining a set of concepts used to measure a broader concept. For effective use they should be discrete (non-overlapping) and provide exhaustive coverage of the broader concept. The constituent concepts can be either sentinel or substantive,  The set can be described by either enumeration or by an expression. */
	ConceptualDomain?: ConceptualDomain[];
	/** Definition
	  * ============
	  * Concept (with a notion of equality defined) being observed, captured, or derived which is associated to a single data instance.
	  *
	  * Examples
	  * ==========
	  * A systolic blood pressure of 122 is measured. The instance value for that measurement in this paragraph is the character string "122". The associated measured concept (a blood pressure at that level) is the conceptual value.  The conceptual value comes from a conceptual domain associated with a conceptual variable.
	  *
	  * Explanatory notes
	  * ===================
	  * This is the concept associated to the actual instance of data that is stored in a data point (the signified of a datum in the signification pattern). */
	ConceptualValue?: ConceptualValue[];
	/** Definition
	  * ============
	  * A variable at the highest level of abstraction.
	  *
	  * Examples
	  * ==========
	  * A gender variable defining two categories – "male" and "female" allowing relating each of these to concepts having description of how these categories are decided.
	  *
	  * Explanatory notes
	  * ===================
	  * The conceptual variable allows for describing the domain of concepts it can take on as well as the type of unit that can be measured. A conceptual variable for blood pressure might, for example describe the conditions under which the pressure is to be taken (sitting as opposed to standing) and a conceptual value domain as height of mercury – without units. One represented variable would further refine this by specifying inches as the unit of measurement for the height. Another might specify that the height be represented in centimeters. Both represented variables could reference the same conceptual variable to indicate in what way they are comparable. */
	ConceptualVariable?: ConceptualVariable[];
	/** Definition
	  * ============
	  * A set of decision points which determine the flow between the steps used to perform an activity.
	  *
	  * Examples
	  * ==========
	  * Loop, IfThenElse, RepeatWhile, etc. */
	ConditionalControlLogic?: ConditionalControlLogic[];
	/** Definition
	  * ============
	  * Encapsulates contextual information of the key-value datastore to provide a scope to the instance key. The instance key is unique within the scope.
	  *
	  * Examples
	  * ==========
	  * A partition, cluster name and any other key-value datastore organization information.
	  *
	  * Explanatory notes
	  * ===================
	  * A key-value datastore can be organized into multiple contextual components.
	  * Other data structure components that are part of the instance key, e.g. identifier and dimension components, guarantee uniqueness only within the scope of a contextual component.
	  * Synthetic id components do guarantee global uniqueness, but they might complex to setup and maintain in many organizations.
	  * Contextual components provide a simple mechanism to achieve uniqueness within a single key-value datastore.
	  * When a key-value datastore is organized in contextual components, a contextual component prefix is added to the instance key to make it unique across the entire key-value datastore. */
	ContextualComponent?: ContextualComponent[];
	/** Definition
	  * ============
	  * Control logic is a program in which the order of statements is explicit. Control logic is either deterministic (imperative) or non-deterministic (declarative). Deterministic control logic consists of control constructs. Declarative control logic is constraint- and/or rule-based. Control logic may contain control logic.
	  *
	  * Examples
	  * ==========
	  * A loop control construct is deterministic control logic. A script is deterministic control logic. Rule based scheduling is declarative control logic.
	  *
	  * Explanatory notes
	  * ===================
	  * DDI-CDI has extended control logic to include non-deterministic activity and step controls, which are not specifically described in DDI Lifecycle or DDI Codebook. */
	ControlLogic?: ControlLogic[];
	/** Definition
	  * ============
	  * Set of relationships between the members within or between statistical classifications.
	  *
	  * Examples
	  * ==========
	  * Correspondence between the U.S. Standard Industrial Classification (SIC) and North American Industrial Classification System (NAICS).
	  *
	  * Explanatory notes
	  * ===================
	  * Correspondence tables are used with statistical classifications. For instance, it can relate two versions from the same classification series; statistical classifications from different classification series; a variant and the version on which it is based; or different versions of a variant. In the first and last examples, the correspondence table facilitates comparability over time. */
	CorrespondenceTable?: CorrespondenceTable[];
	/** Definition
	  * ============
	  * Curator is a software agent that uses techniques such as natural language processing to map facts in the research data store to the condition part of a rule.
	  *
	  * Examples
	  * ==========
	  * Domain-specific curators are available as both open source and commercial products.
	  *
	  * Explanatory notes
	  * ===================
	  * The curator assists in identifying the rules that are currently in play in the rule set. */
	Curator?: Curator[];
	/** Definition
	  * ============
	  * Container for an instance value.
	  *
	  * Examples
	  * ==========
	  * A cell in a data cube or a table.
	  *
	  * Explanatory notes
	  * ===================
	  * A data point could be empty. It exists independently of the instance value to be stored in it. */
	DataPoint?: DataPoint[];
	/** Definition
	  * ============
	  * Indexed location of the associated member within the associated list. */
	DataPointPosition?: DataPointPosition[];
	/** Definition
	  * ============
	  * Relations used by the data point relation structure of a logical record to describe specific source-target data points and their relationship. */
	DataPointRelationship?: DataPointRelationship[];
	/** Definition
	  * ============
	  * Organized collection of data based on keys. */
	DataSet?: DataSet[];
	/** Definition
	  * ============
	  * Collection of logical records.
	  *
	  * Examples
	  * ==========
	  * The data lineage of an individual business process or an entire data pipeline are both examples of a logical record relation structures. In a data lineage we can observe how logical records are connected within a business process or across business processes.
	  *
	  * Explanatory notes
	  * ===================
	  * Keep in mind that a logical records are definitions, not a "datasets". Logical records organized in a structured collection is called a logical record relation structure. Instances of logical records instantiated as organizations of data points hosting data are described in format description. A data store is reusable across studies. Each study has at most one data store. */
	DataStore?: DataStore[];
	/** Definition
	  * ============
	  * Data organization based on reusable data structure components. */
	DataStructure?: DataStructure[];
	/** Definition
	  * ============
	  * Role given to a represented variable in the context of a data structure.
	  *
	  * Explanatory notes
	  * ===================
	  * A represented variable can have different roles in different data structures. For instance, the variable sex can be a measure in a wide data structure and a dimension in a dimensional data structure. */
	DataStructureComponent?: DataStructureComponent[];
	/** Definition
	  * ============
	  * Correspondence of a data instance to the concept it represents.
	  *
	  * Examples
	  * ==========
	  * A systolic blood pressure of 122 is measured. The single data instance (instance value) for that measurement is the character string "122". The datum in this case is the association of the conceptual value, i.e. the underlying measured concept (a blood pressure at that level), with the instance value.
	  * if a datum represents the conceptual value “married” with a code “M,” it is not the same datum where that conceptual value is represented with a code “1”. If the datum which uses the code “M” is present in more than one data set, it is still the same datum.
	  *
	  * Explanatory notes
	  * ===================
	  * The datum is a reification of the association between instance value and conceptual value. It is a designation (a representation of a concept by a sign) in the signification pattern. The data instance (instance value) is the signifier and the concept it represents (conceptual value) is the signified. The datum has an association with an instance variable which allows the attachment of a unit of measurement, a datatype, and a population. These instance variable attributes are critical for interpreting the signifier.  NOTE: This is NOT datum as defined in The Data Documentation Initiative Lifecycle specification, which is more limited in breadth. This specification takes a little more formal (semiotic) description of a datum using the signification pattern.
	  * The datum is reusable, and may appear in more than one data set, carrying with it its full contextualized meaning and identity. The instance variables and instance values with which it is associated will therefore be functionally similar or identical across its appearance in different data instances. Instance variable and instance value are specific to a single data set instance – datum is not. */
	Datum?: Datum[];
	/** Definition
	  * ==========
	  * Use of a code for variable identification in the context of a data structure and a variable descriptor component.
	  *
	  * Examples
	  * ========
	  * Consider two variables, i.e. income and age, with values appearing in the same column. Codes "income" and "age" are descriptors. They appear multiple time in a variable descriptor component, one for each value in the variable value component. Each descriptor references one of those values. This way it's possible to identify which values correspond to income and which ones to age. */
	Descriptor?: Descriptor[];
	/** Definition
	  * ============
	  * Set of permissible values for a variable playing the role of a variable descriptor component.
	  *
	  * Examples
	  * ==========
	  * Consider two variables, i.e. income and age, with values appearing in the same column.
	  * Codes "income" and "age" are descriptors that appear in the descriptor value domain corresponding to the descriptor variable. */
	DescriptorValueDomain?: DescriptorValueDomain[];
	/** Definition
	  * ============
	  * Variable that provides codes for variable identification in the context of a data structure.
	  * Variable playing the role of a variable descriptor component.
	  *
	  * Examples
	  * ==========
	  * Consider two variables, i.e. income and age, with values apearing in the same column.
	  * Codes "income" and "age" are descriptors that appear in the descriptor value domain corresponding to the descriptor variable. */
	DescriptorVariable?: DescriptorVariable[];
	/** Definition
	  * ============
	  * Deterministic imperative is a subtype of control logic. Deterministic control logic consists of control constructs.
	  *
	  * Examples
	  * ==========
	  * A Loop control construct is deterministic control logic. A script is deterministic control logic.
	  *
	  * Explanatory notes
	  * ===================
	  * Because control logic covers both deterministic and non-deterministic forms, it has been divided into the appropriate subtypes. */
	DeterministicImperative?: DeterministicImperative[];
	/** Definition
	  * ============
	  * Organized collection of multidimensional data. It is structured by a dimensional data structure.
	  *
	  * Examples
	  * ==========
	  * A dimensional dataset with Income values in each data point, where the dimensions organizing the data points are Sex and Marital Status.
	  *
	  * Explanatory notes
	  * ===================
	  * Similar to Structural N-Cube. */
	DimensionalDataSet?: DimensionalDataSet[];
	/** Definition
	  * ============
	  * Structure of a dimensional data set (organized collection of multidimensional data). It is described by dimension, measure and attribute components.
	  *
	  * Examples
	  * ==========
	  * The structure described by [City, Average Income, Total Population] where City is a dimension and Average Income and Total Population are measures. */
	DimensionalDataStructure?: DimensionalDataStructure[];
	/** Definition
	  * ============
	  * Collection of data instances that uniquely identify a collection of data points in a dimensional dataset.
	  *
	  * Examples
	  * ==========
	  * Collection of "male", "Ontario" and "married" strings in a dimensional dataset where data points are identified by Sex, Province and Marital Status dimensions. */
	DimensionalKey?: DimensionalKey[];
	/** Definition
	  * ============
	  * Collection of concepts that uniquely defines a collection of data points in a dimensional dataset.
	  *
	  * Examples
	  * ==========
	  * Collection of [Male], [Ontario] and [Married] categories in a dimensional dataset where data points are defined by Sex, Province and Marital Status dimensions. */
	DimensionalKeyDefinition?: DimensionalKeyDefinition[];
	/** Definition
	  * ============
	  * Single concept that is part of a dimensional key definition.
	  *
	  * Examples
	  * ==========
	  * The [Ontario] category in a dimensional dataset where data points are defined by Province and other dimensions. */
	DimensionalKeyDefinitionMember?: DimensionalKeyDefinitionMember[];
	/** Definition
	  * ============
	  * Single data instance that is part of a dimensional key.
	  *
	  * Examples
	  * ==========
	  * The "Ontario" string in a dimensional dataset where data points are identified by Province and other dimensions. */
	DimensionalKeyMember?: DimensionalKeyMember[];
	/** Definition
	  * ============
	  * Role given to a represented variable in the context of a dimensional data structure to identify the universes associated with data points. The variable acts as a field in the compound identifier (the key structure) to disambiguate the cells in the multi-dimensional "cube".
	  *
	  * Explanatory notes
	  * ===================
	  * The categories from each dimension often are used in combination to identify a cell. The meaning of the combination of the categories supplies meaning to the cell. */
	DimensionComponent?: DimensionComponent[];
	/** Definition
	  * ============
	  * Collection of dimensions that can be reused across multiple dimensional structures.
	  *
	  * Examples
	  * ==========
	  * Sex, Province and Marital Status is a common set of dimensions used across a variety of dimensional data structures and might need to be maintained separately. */
	DimensionGroup?: DimensionGroup[];
	/** Definition
	  * ============
	  * A base class acting as an extension point to allow all codifications (codelist, statistical classification, etc.) to be understood as enumerated value domains. */
	EnumerationDomain?: EnumerationDomain[];
	/** Definition
	  * ============
	  * Role of a set of data structure components for content referencing purposes
	  *
	  * Explanatory notes
	  * ===================
	  * Equivalent to foreign key in the relational model.
	  * It can be used in conjunction with primary key to link data structures and their related data sets. */
	ForeignKey?: ForeignKey[];
	/** Definition
	  * ============
	  * Role of a data structure component for content referencing purposes
	  *
	  * Explanatory notes
	  * ===================
	  * Equivalent to a foreign key attribute (i.e. column) in the relational model.
	  * It can be used in conjunction with a primary key component to link data structures and their related data sets. */
	ForeignKeyComponent?: ForeignKeyComponent[];
	/** Identifier for objects requiring short- or long-lasting referencing and management. */
	identifier?: Identifier;
	/** Definition
	  * ============
	  * Role given to a represented variable in the context of a long or wide data structure to identify the units associated to data points, and in dimensional and key value data structures to provide identifying fields for the instance values.
	  *
	  * Examples
	  * ==========
	  * The personal identification number of a Swedish citizen for unit data or the name of a country in the European Union for dimensional data. */
	IdentifierComponent?: IdentifierComponent[];
	/** Definition
	  * ============
	  * A person. (See for example the W3C Friend of a Friend Ontology - http://xmlns.com/foaf/spec/#term_Person).
	  *
	  * Examples
	  * ==========
	  * Individual employed by an organization. A person within a unit or project (organization). Albert Einstein, Bugs Bunny, Harry Potter, Ashley G. Williams, Gandalf.
	  *
	  * Explanatory notes
	  * ===================
	  * Describes people referred to in the description of data and process. Similar to the concept found in Schema.org, the W3C ORG Ontology, etc. */
	Individual?: Individual[];
	/** Definition
	  * ============
	  * The relationships between parameters across steps is described by the information flow definition. Each relationship creates a pathway for an information object to follow.
	  *
	  * Examples
	  * ==========
	  * The output of one parameter might be the input of another one. Think of a Business Process Model and Notation (BPMN) diagram or an extract, transform, and load (ETL) pipeline definition as the sum of these relationships.
	  *
	  * Explanatory notes
	  * ===================
	  * In DDI Lifecycle an information flow definition was referred to in terms of a "binding". */
	InformationFlowDefinition?: InformationFlowDefinition[];
	/** Definition
	  * ============
	  * Single-valued key representation produced from the merge of the representations of all key members and a descriptor.
	  *
	  * Examples
	  * ==========
	  * The string "cluster:income_distribution:unitid:20:period:2020/02:income", where "cluster:income_distribution" is a key member based on a contextual component, "unitid:20" is based on an identifier component, "period:2020/02" is based on a component with a time role and "income" is based on a descriptor.
	  *
	  * Explanatory notes
	  * ===================
	  * For value strings, the merge is the string concatenation operation.
	  * For other classes, an appropriate merge representation can be defined. */
	InstanceKey?: InstanceKey[];
	/** Definition
	  * ============
	  * Single data instance corresponding to a concept (with a notion of equality defined) being observed, captured, or derived.
	  *
	  * Examples
	  * ==========
	  * A systolic blood pressure of 122 is measured. The single data instance (instance value) for that measurement is the character string "122". The associated measured concept (a blood pressure at that level) is the conceptual value.
	  *
	  * Explanatory notes
	  * ===================
	  * This is the actual instance of data that populates a data point (the signifier of a datum in the signification pattern). The instance value comes from a value domain associated with an instance variable which allows the attachment of a unit of measurement, a datatype, and a population. */
	InstanceValue?: InstanceValue[];
	/** Definition
	  * ==========
	  * Use of a represented variable within a data set.
	  *
	  * Examples
	  * ========
	  * 1. Gender: Dan Gillman has gender <m, male>, Arofan Gregory has gender <m, male>, etc.
	  * 2. Number of employees: Microsoft has 90,000 employees; IBM has 433,000 employees, etc.
	  * 3. Endowment: Johns Hopkins has endowment of <3, $1,000,000 and above>, Yale has endowment of <3, $1,000,000 and above>, etc.
	  * 4. A tornado near Winterset, Iowa, had a peak wind speed of 170 mph. Two instance variables of a person's height reference the same represented variable. This indicates that they are intended to: be measured with the same unit of measurement, have the same intended data type, have the same substantive value domain, use a sentinel value domain drawn from the same set of sentinel value domains, have the same sentinel (missing value) concepts, and draw their population from the same universe. In other words, the two instance variables should be comparable.
	  *
	  * Explanatory notes
	  * =================
	  * The instance variable class inherits all of the properties and relationships of the represented variable class and, in turn, the conceptual variable class. This means that an instance variable can be completely populated without the need to create an associated represented variable or conceptual variable. If, however, a user wishes to indicate that a particular instance variable is patterned after a particular represented variable or a particular conceptual variable that may be indicated by including a relationship to the represented variable and/or conceptual variable. Including these references is an important method of indicating that multiple instance variables have the same representation, measure the same concept, and are drawn from the same universe. If two instance variables of a person's height reference the same represented variable. This indicates that they are intended to: be measured with the same unit of measurement, have the same intended data type, have the same substantive value domain, use a sentinel value domain drawn from the same set of sentinel value domains, have the same sentinel (missing value) concepts, and draw their population from the same universe. In other words, the two instance variables should be comparable. The instance variable describes actual instances of data that have been collected. */
	InstanceVariable?: InstanceVariable[];
	/** Definition
	  * ============
	  * Key value relationship for two or more logical records where the key is one or more equivalent instance variables and the value is a defined relationship or a relationship to a set value.
	  *
	  * Explanatory notes
	  * ===================
	  * The instance variable map identifies the variables which are used to connect two data sets, as when persons in one structure are associated with households in another structure. For logical records Household and Person, the keys are Household ID (HHID in Household Record), and Person ID (HHIDP in Person Record). Their value relationship is Equal, and set value is n.a. For each person in the person record, the value of HHIDP will be exactly the same as the value of HHID in the household record for the household to which they belong. (Correspondence type refers to the variables themselves rather than the value of the variables concerned.) In this context correspondence type will normally be set to ExactMatch. */
	InstanceVariableMap?: InstanceVariableMap[];
	/** Definition
	  * ============
	  * Collection of data instances that uniquely identify a collection of data points in a dataset. */
	Key?: Key[];
	/** Definition
	  * ============
	  * Collection of concepts that uniquely defines a collection of data points in a dataset. */
	KeyDefinition?: KeyDefinition[];
	/** Definition
	  * ============
	  * Single concept that is part of the structure of a key definition. */
	KeyDefinitionMember?: KeyDefinitionMember[];
	/** Definition
	  * ============
	  * Single data instance that is part of a key. */
	KeyMember?: KeyMember[];
	/** Definition
	  * ============
	  * Organized collection of key-value data. It is structured by a key value structure.
	  *
	  * Examples
	  * ==========
	  * A unit key-value datastore where each instance key corresponds to a data point capturing a different characteristic of a unit.
	  *
	  * Explanatory notes
	  * ===================
	  * A key-value datastore is just a collection of key-value pairs, i.e. instance keys and reference values.
	  * Each instance key encodes all relevant information about the context, the unit of interest and the variable associated with the reference value of a given data point. */
	KeyValueDataStore?: KeyValueDataStore[];
	/** Definition
	  * ============
	  * Structure of a key-value datastore (organized collection of key-value data). It is described by identifier, contextual, synthetic id, dimension, variable descriptor and variable value components.
	  *
	  * Examples
	  * ==========
	  * The structure described by [Income distribution, Unit id, Period, Income] where Income distribution is the contextual component, Unit id identifies a statistical unit, period is a effective period and Income is the variable of interest. */
	KeyValueStructure?: KeyValueStructure[];
	/** Definition
	  * ============
	  * Set of all classification items the same number of relationships from the root (or top) classification item.
	  *
	  * Examples
	  * ==========
	  * ISCO-08: index='1' label of associated category 'Major', index='2' label of associated category 'Sub-Major',  index='3' label of associated category 'Minor',
	  *
	  * Explanatory notes
	  * ===================
	  * Provides level information for the members of the level structure. levelNumber provides the level number which may or may not be associated with a category which defines level. */
	Level?: Level[];
	/** Definition
	  * ============
	  * Nesting structure of a hierarchical collection.
	  *
	  * Examples
	  * ==========
	  * The International Standard Classification of Occupations (ISCO-08: https://www.ilo.org/public/english/bureau/stat/isco/isco08/) Major, Sub-Major, and Minor or the North American Industry Classification System (NAICS: https://www.census.gov/naics/) 2 digit sector codes, 3 digit subsector code list, 4 digit industry group code list, and 5 digit industry code list.
	  *
	  * Explanatory notes
	  * ===================
	  * The levels within the structure begin at the root level '1' and continue as an ordered array through each level of nesting. Levels are used to organize a hierarchy. Usually, a hierarchy contains one root member at the top, though it could contain several. These are the first level. All members directly related to those  in the first level compose the second level. The third and subsequent levels are defined similarly.  A level often is associated with a concept, which defines it. These correspond to kinds of aggregates. For example, in the US Standard Occupational Classification (2010), the level below the top is called Major Occupation Groups, and the next level is called Minor Occupational Groups. These ideas convey the structure. In particular, Health Care Practitioners (a major group) can be broken into Chiropractors, Dentists, Physicians, Vets, Therapists, etc. (minor groups) The categories in the nodes at the lower level aggregate to the category in node above them.  "Classification schemes are frequently organized in nested levels of increasing detail. ISCO-08, for example, has four levels: at the top level are ten major groups, each of which contain sub-major groups, which in turn are subdivided in minor groups, which contain unit groups. Even when a classification is not structured in levels ("flat classification"), the usual convention, which is adopted here, is to consider that it contains one unique level." (From the W3C Simple Knowlegde Organization System: http://rdf-vocabulary.ddialliance.org/xkos.html#) Individual classification items organized in a hierarchy may be associated with a specific level. */
	LevelStructure?: LevelStructure[];
	/** Definition
	  * ============
	  * Collection of instance variables. */
	LogicalRecord?: LogicalRecord[];
	/** Definition
	  * ============
	  * Assigns a position of the logical record within the data store. */
	LogicalRecordPosition?: LogicalRecordPosition[];
	/** Definition
	  * ============
	  * Relationships between logical records. */
	LogicalRecordRelationship?: LogicalRecordRelationship[];
	/** Definition
	  * ============
	  * Structuring of relationships between logical records in a data store.
	  *
	  * Examples
	  * ==========
	  * A data store with a Household, Family, and Person logical record type. Allows for describing parent/child, whole/part, or other relationships as appropriate. */
	LogicalRecordRelationStructure?: LogicalRecordRelationStructure[];
	/** Definition
	  * ============
	  * Organized collection of long data. It is structured by a long data structure.
	  *
	  * Examples
	  * ==========
	  * A unit dataset where each row corresponds to a set of data points capturing different characteristics of a unit, some of which can be transposed into variable descriptor and variable value components. */
	LongDataSet?: LongDataSet[];
	/** Definition
	  * ============
	  * Structure of a long dataset (organized collection of long data). It is described by identifier, measure, attribute, variable descriptor and variable value components.
	  *
	  * Examples
	  * ==========
	  * The structure described by [Unit id, Income, Province, Variable name, Variable value] where Unit id identifies a statistical unit, Income and Province are two instance variables capturing characteristics, and other instance variables are represented by Variable name (a variable descriptor component) and Variable Value (a variable value component). */
	LongDataStructure?: LongDataStructure[];
	/** Definition
	  * ============
	  * Collection of data instances that uniquely identify a collection of data points in a long dataset.
	  *
	  * Examples
	  * ==========
	  * Collection containing the single "K1Z1C1" string in a long dataset where rows are identified by postal code representations. */
	LongKey?: LongKey[];
	/** Definition
	  * ============
	  * Single data instance that is part of a long key.
	  *
	  * Examples
	  * ==========
	  * The "K1Z1C1" string in a long dataset where rows are identified by postal code representations. */
	LongMainKeyMember?: LongMainKeyMember[];
	/** Definition
	  * ============
	  * Mechanism or computer program used to perform an act.
	  *
	  * Examples
	  * ==========
	  * SAS program, photocopier
	  *
	  * Explanatory notes
	  * ===================
	  * May be used as a target to identify the agent who performed an action. Used to define hardware or software that act as agents in data capture, data processing, or other related actions. */
	Machine?: Machine[];
	/** Definition
	  * ============
	  * Identifies the unit of interest, either a statistical unit or a population, via identifier or dimension components, respectively, plus an optional contextual component.
	  * If neither identifier nor dimension components are present, then a synthetic id component is used.
	  *
	  * Examples
	  * ==========
	  * The string "income_distribution:male:Ontario:married" in a dimensional key-value datastore, where instance key members are defined by context plus Sex, Province and Marital Status dimensions. */
	MainKeyMember?: MainKeyMember[];
	/** Definition
	  * ============
	  * Role given to a represented variable in the context of a data structure to hold the observed/derived values.
	  *
	  * Examples
	  * ==========
	  * Height of a person in a wide or long dataset or number of citizens in a country in a dataset for multiple countries (dimensional dataset). */
	MeasureComponent?: MeasureComponent[];
	/** Definition
	  * ============
	  * Non-deterministic control logic is a subtype of control logic. Non-deterministic (or declarative) control logic is constraint- and/or rule-based.
	  *
	  * Examples
	  * ==========
	  * Rule based scheduling is declarative control logic.
	  *
	  * Explanatory notes
	  * ===================
	  * Unlike DDI Lifecycle, DDI-CDI describes non-deterministic activity and step controls. */
	NonDeterministicDeclarative?: NonDeterministicDeclarative[];
	/** Definition
	  * ============
	  * Representation of a category in the context of a code or a classification item, as opposed of the corresponding instance value which would appear when used in a dataset.
	  *
	  * Examples
	  * ==========
	  * The number "334" used as a code for the "Computer and electronic product manufacturing" category in the North American Industry Classification System (NAICS). */
	Notation?: Notation[];
	/** Definition
	  * ==========
	  * Collection of people organized within a framework of authority that can perform an act or be associated with another agent.
	  *
	  * Examples
	  * ==========
	  * Commonwealth Scientific and Industrial Research Organisation (CSIRO), U.S. Census Bureau, University of Michigan/Institute for Social Research, Research Data Alliance Agrisemantics Working Group.
	  *
	  * Explanatory notes
	  * =================
	  * The W3C Organization Ontology (https://www.w3.org/TR/vocab-org/#organizational_structure) definition: "Represents a collection of people organized together into a community or other social, commercial or political structure. The group has some common purpose or reason for existence which goes beyond the set of people belonging to it and can act as an agent. Organizations are often decomposable into hierarchical structures." */
	Organization?: Organization[];
	/** Definition
	  * ============
	  * An input or output to control logic and the step/sub-step it invokes. Parameters may take the form of any information object, including data sets and structured metadata as well as configuration information for the step/sub-step.
	  *
	  * Examples
	  * ==========
	  * A dimensional data set; a long data structure. */
	Parameter?: Parameter[];
	/** Definition
	  * ============
	  * Information needed for understanding the physical structure of data coming from a file or other source.
	  *
	  * Examples
	  * ==========
	  * The physical data set is the entry point for information about a file or other source. It includes information about the name of a file, the structure of segments in a file.
	  *
	  * Explanatory notes
	  * ===================
	  * Multiple styles of structural description are supported: including describing files as unit-record (unit segment layout) files; describing cubes; and describing event-history (spell) data. */
	PhysicalDataSet?: PhysicalDataSet[];
	/** Definition
	  * ============
	  * Ordering for physical record segments, which map to a logical record.
	  *
	  * Explanatory notes
	  * ===================
	  * The same logical record layout may be the source member in several adjacency lists. This can happen when physical record segments are also population specific. In this instance each adjacency list associated with a logical record layout is associated with a different population. */
	PhysicalDataSetStructure?: PhysicalDataSetStructure[];
	/** Definition
	  * ==========
	  * Realization of relation structure that is used to describe the sequence of value mappings in a physical layout.
	  *
	  * Examples
	  * ========
	  * The W3C Tabular Data on the Web specification section 4.5 Cells (https://www.w3.org/TR/tabular-data-model/#content-type) allows for a list datatype within cells. In the example below there are three top level instance variables: PersonID - the person identifier; AgeYr - age in years; BpSys_Dia - blood pressure (a list containing Systolic and Diastolic values). There are two variables at a secondary level of the hierarchy: Systolic - the systolic pressure; Diastolic - the diastolic pressure. The delimited file below uses the comma to separate "columns" and forward slash to separate elements of a blood pressure list. ::
	  *
	  * PersonID, AgeYr, BpSys_Dia
	  * 1,22,119/67
	  * 2,68,122/70
	  *
	  * The physical relation structure in this case would describe a BpSys_Dia list variable as containing an ordered sequence of the Systolic and Diastolic instance variables.
	  *
	  * Explanatory notes
	  * =================
	  * This can be more complex than a simple sequence. */
	PhysicalLayoutRelationStructure?: PhysicalLayoutRelationStructure[];
	/** Definition
	  * ==========
	  * Description of each physical storage segment required to completely cover a physical record representing the logical record.
	  *
	  * Examples
	  * ========
	  * The file below has four instance variables: PersonId, SegmentId, AgeYr, and HeightCm. The data for each person (identified by PersonId) is recorded in two segments (identified by SegmentId), "a" and "b". AgeYr is on physical segment a, and HeightCm is on segment b. These are the same data as described in the unit segment layout documentation. ::
	  *
	  * 1 a  22
	  * 1 b 183
	  * 2 a  45
	  * 2 b 175
	  *
	  * Explanatory notes
	  * =================
	  * A logical record may be stored in one or more segments housed hierarchically in a single file or in separate data files. All logical records have at least one segment. */
	PhysicalRecordSegment?: PhysicalRecordSegment[];
	/** Definition
	  * ============
	  * Assigns a position of the physical record segment within the whole physical record. For example in what order does this 80 character segment fall within an 800 character record. */
	PhysicalRecordSegmentPosition?: PhysicalRecordSegmentPosition[];
	/** Definition
	  * ============
	  * Structured relationship between physical record segments. */
	PhysicalRecordSegmentRelationship?: PhysicalRecordSegmentRelationship[];
	/** Definition
	  * ============
	  * Means for describing the complex relational structure of data points in a physical record representing the logical record. */
	PhysicalRecordSegmentStructure?: PhysicalRecordSegmentStructure[];
	/** Definition
	  * ============
	  * Used as an extension point in the description of the different layout styles of data structure descriptions.
	  *
	  * Examples
	  * ==========
	  * Examples include unit segment layouts, event data layouts, and cube layouts (e.g. summary data).
	  *
	  * Explanatory notes
	  * ===================
	  * A physical segment layout is a physical description (e.g. unit segment layout) of the associated logical record Layout consisting of a collection of value mappings describing the physical interrelationship of each related value mapping and associated instance variable. */
	PhysicalSegmentLayout?: PhysicalSegmentLayout[];
	/** Definition
	  * ============
	  * Location of a data point in a physical segment.
	  *
	  * Examples
	  * ==========
	  * A segment of text in a plain text file beginning at character 3 and ending at character 123. The location of the representation of a variable in a text file.
	  *
	  * Explanatory notes
	  * ===================
	  * While this has no properties or relationships of its own, it is useful as a target of relationships where its extensions may serve. This is an extension point since there are many different ways to describe the location of a segment - character counts, start and end times, etc. */
	PhysicalSegmentLocation?: PhysicalSegmentLocation[];
	/** Definition
	  * ============
	  * Universe with time and geography specified.
	  *
	  * Examples
	  * ==========
	  * 1. Canadian adult persons residing in Canada on 13 November 1956.
	  * 2. US computer companies at the end of 2012.
	  * 3. Universities in Denmark 1 January 2011.
	  *
	  * Explanatory notes
	  * ===================
	  * Population is the most specific in the conceptually narrowing hierarchy of unit type, universe and population. Several populations having differing time and or geography may specialize the same universe. */
	Population?: Population[];
	/** Definition
	  * ============
	  * Role of a set of data structure components for content linkage purposes
	  *
	  * Explanatory notes
	  * ===================
	  * Equivalent to primary key in the relational model.
	  * A primary key essentially indicates which data structure components correspond to key members.
	  * It can also be used in conjunction with foreign key to link data structures and their related datasets. */
	PrimaryKey?: PrimaryKey[];
	/** Definition
	  * ============
	  * Role of a data structure component for content identification purposes
	  *
	  * Explanatory notes
	  * ===================
	  * Equivalent to a primary key attribute (i.e. column) in the relational model.
	  * It can be used in conjunction with a foreign key component to link data structures and their related datasets. */
	PrimaryKeyComponent?: PrimaryKeyComponent[];
	/** Definition
	  * ============
	  * A processing agent orchestrates the production of information objects in a production environment. There are processing agents which perform data capture, data editing/processing, and data analysis (etc.), each in the appropriate production environments. The processing agent performs an activity based on the control logic.
	  *
	  * Examples
	  * ==========
	  * A processing agent initiates a data capture sequence, obtaining readings from a sensor. A processing agent initiates rule based scheduling. A processing agent is informed by control logic to invoke an imputation activity. */
	ProcessingAgent?: ProcessingAgent[];
	/** Definition
	  * ============
	  * Production environments consume and produce information objects by way of processing pipelines orchestrated by the processing agent.
	  *
	  * Examples
	  * ==========
	  * Data processing platforms and data analysis platforms are types of production environments. Each of these platforms may have subtypes. */
	ProductionEnvironment?: ProductionEnvironment[];
	/** Definition
	  * ============
	  * A measure having a specific production method.
	  *
	  * Examples
	  * ==========
	  * Seasonally adjusted monthly income. */
	QualifiedMeasure?: QualifiedMeasure[];
	/** Definition
	  * ============
	  * Relationships among record types within and between logical records.
	  *
	  * Examples
	  * ==========
	  * One logical record containing a PersonIdentifier and a PersonName and another logical record containing a MeasurementID, a PersonID, a SystolicPressure, and a DiastolicPressure could be linked by a record relation. The record relation could employ an instance variable value map to describe the linkage between  PersonIdentifier and PersonID.
	  *
	  * A household-level logical record might contain an instance variable called HouseholdID and a person-level logical record might contain an instance variable called HID. Describing a link between HouseholdID and HID would allow the linking of a person-level LogicalRecord to their corresponding household-level logical record.
	  *
	  * Explanatory notes
	  * ===================
	  * For instance variables existing in a logical record with multiple record layouts, pairs of instance variables may function as paired keys to permit the expression of hierarchical links between records of different types. These links between keys in different record types could also be used to link records in a relational structure. */
	RecordRelation?: RecordRelation[];
	/** Definition
	  * ============
	  * Recorded value in a variable value component.
	  * Value referenced by a descriptor.
	  *
	  * Examples
	  * ==========
	  * Consider two variables, i.e. income and age, with values appearing in the same column, e.g. 100000, 45, 85000, 34, etc.
	  * Codes "income" and "age" are descriptors whereas 100000, 45, 85000, 34 are reference values. */
	ReferenceValue?: ReferenceValue[];
	/** Definition
	  * ============
	  * Set of permissible values for a variable playing the role of a variable value component.
	  *
	  * Examples
	  * ==========
	  * Consider two variables, i.e. income and age, with values appearing in the same column. A reference variable in this case would be a type of represented variable that can take on values from both income and age. A long data structure might have a column that takes on values from this reference variable. A descriptor variable would then have values paired with the values from the reference variable, pointing to either the income or age variable. */
	ReferenceValueDomain?: ReferenceValueDomain[];
	/** Definition
	  * ============
	  * Variable that records values of multiple variables in the context of a data structure.
	  * Variable playing the role of a variable value component.
	  *
	  * Examples
	  * ==========
	  * Consider two variables, i.e. income and age, with values appearing in the same column, e.g. 100000, 45, 85000, 34, etc.
	  * Values 100000, 45, 85000, 34 are reference values in the reference value domain corresponding to the reference variable. */
	ReferenceVariable?: ReferenceVariable[];
	/** Definition
	  * ==========
	  * Conceptual variable with a substantive value domain specified.
	  *
	  * Examples
	  * ==========
	  * The pair (Number of Employees, Integer), where "Number of Employees" is the characteristic of the population (variable) and "Integer" is how that measure will be represented (value domain).
	  *
	  * Explanatory notes
	  * ===================
	  * Extends from conceptual variable and can contain all descriptive fields without creating a conceptual variable. By referencing a conceptual variable it can indicate a common relationship with represented variables expressing the same characteristic of a universe measured in another way, such as Age of Persons in hours rather than years. Represented variable constrains the coverage of the unit type to a specific universe. In the above case the universe with the measurement of Age in hours may be constrained to Persons under 5 days (120 hours old). Represented variable can define sentinel values for multiple storage systems which have the same conceptual domain but specialized value domains. */
	RepresentedVariable?: RepresentedVariable[];
	/** Definition
	  * ============
	  * A datum that can be qualified by a revision.
	  *
	  * Examples
	  * ==========
	  * The April datum for Income revised in June. */
	RevisableDatum?: RevisableDatum[];
	/** Definition
	  * ============
	  * Algorithm applied to produce a revised datum.
	  *
	  * Examples
	  * ==========
	  * An adjustment to monthly employment numbers to adjust for errors (sampling or non-sampling) in the underlying data. */
	Revision?: Revision[];
	/** Definition
	  * ============
	  * A rule has a condition part and an action part. A rule takes the form of: If [Condition} Then [Action]. A rule belongs to a rule set which is a component of rule based scheduling performed by the processing agent
	  *
	  * Examples
	  * ==========
	  * If Exists [InformationObject] Then Perform [Activity] */
	Rule?: Rule[];
	/** Definition
	  * ============
	  * Rule based scheduling performs a fact check on rules from the rule set, testing their condition part against the facts in the research data store. Fact checking may be assisted by a curator who can semantically compare the condition part of each candidate rule with the facts. The fact checker returns the next activity which rule based scheduling performs according to the following function: factcheck (RuleSet, ResearchDataStore, Curator): Activity.
	  *
	  * Examples
	  * ==========
	  * One real-life situation in which rule-based scheduling is performed involves data virtualization. Here the research datastore has a catalog of views available for use. Rule based scheduling might explore the catalog to determine the rule(s) in the rule set that currently apply. A software curator might assist in the decision in case there was no exact match between a rule and its condition(s) and given the current state of the research datastore. The curator typically uses natural language processing.
	  *
	  * Explanatory notes
	  * ===================
	  * Rule based scheduling is guided by its scheduling strategy. This is described by an enumeration that consists of "forwardChaining" and "backwardChaining". */
	RuleBasedScheduling?: RuleBasedScheduling[];
	/** Definition
	  * ============
	  * A rule set is a collection of rules. A rule set is a component of rule based scheduling.
	  *
	  * Examples
	  * ==========
	  * If [A overlaps B] Then [X] If [B occurs before C] Then [Y] If [C equals D] Then [Z]  It might take a curator to understand what these rules mean in the context of a research data store.
	  *
	  * Explanatory notes
	  * ===================
	  * Rule based scheduling might have multiple rule sets each of which are domain-specific. The processing agent often helps with the selection of rule sets. */
	RuleSet?: RuleSet[];
	/** Definition
	  * ==========
	  * A qualified measure whose domain is a universe as an aggregate, i.e. a measure with a specific production method applied to a specific cell in a cube.
	  *
	  * Examples
	  * ========
	  * Seasonally adjusted income for Single, Ontarians, Females. */
	ScopedMeasure?: ScopedMeasure[];
	/** Definition
	  * ============
	  * Location of a segment of text through character or line counts.
	  *
	  * Examples
	  * ==========
	  * The segment beginning at line 3, character 4 and ending at line 27 character 13. Alternatively the segment beginning at character 257 and ending at character 1350 of the whole body of text. StartLine of 10, endLine of 12, startCharacterPosition of 1, endCharacterPosition of 0 means all of lines 10, 11, and 12.  An endCharacterPosition of 0 indicates that whole lines are specified.
	  *
	  * Explanatory notes
	  * ===================
	  * An adequate description will always include a startCharacterPosition and then may include an endCharacterPosition or a characterLength. If StartLine is specified, the character counts begin within that line. */
	SegmentByText?: SegmentByText[];
	/** Definition
	  * ==========
	  * Conceptual domain of sentinel concepts.
	  *
	  * Examples
	  * ========
	  *
	  * - Refused
	  * - Don't know
	  * - Lost in processing
	  *
	  * Explanatory notes
	  * =================
	  * Sentinel values are intended for processing purposes whereas substantive values are used for subject matter concerns. */
	SentinelConceptualDomain?: SentinelConceptualDomain[];
	/** Definition
	  * ============
	  * Value domain for a sentinel conceptual domain.
	  *
	  * Examples
	  * ==========
	  * Missing categories expressed as codes: -9, refused; -8, Don't Know; for a numeric variable with values greater than zero.
	  *
	  * Explanatory notes
	  * ===================
	  * Sentinel values are defined in ISO 11404 as "element of a value space that is not completely consistent with a datatype's properties and characterizing operations...". A common example would be codes for missing values. Sentinel values are used for processing, not to describe subject matter. Typical examples include missing values or invalid entry codes. Sentinel value domains are typically of the enumerated type, but they can be the described type, too. This is not to say that sentinel values carry no information. Data on gender might be enumerated by "0, male" and "1, female". These are the substantive values (see substantive value domain). However, there may be the need to include missing values along with that data, such as "m, missing" and "r, refused". These are sentinel values.  ISO/IEC 11404 - General Purpose Datatypes, defines sentinel values in terms of how that standard defines datatypes. But, the fact that the sentinels don't fit in terms of the calculations and statistics one would perform on the "clean" data is a distinguishing characteristic. In the example above, one would not include missing or refused data in calculating a ratio of females to the total population. Sentinel values may be described rather than enumerated. For instance, there might be a range of values, each representing an out of range value, but there could be too many to enumerate. It is easier to describe the range.  In some software missing values are represented as values not in the datatype of the valid values. R has values of NA, NaN, Inf, and -Inf. SAS and Stata have values displayed as ".", ".A" through ".Z", and "._"  Other software might use values like 999 for missing that would otherwise be the same datatype as valid values but outside the parameters of the domain. In the gender example above: For SPSS the sentinel values might be represented as: 998 = "refused" 999 = "not recorded"  For SAS or Stata the sentinel values might be represented as: .R = "refused" .N = "not recorded"  Sentinel values can also be used for other purposes beyond missing. For a numeric variable "A" might represent a value somewhere in a defined range to prevent disclosure of information about an individual. This might be considered a "semi-missing value". In SAS or Stata for example: .A = "greater than or equal to 100 and less than 1000 ". */
	SentinelValueDomain?: SentinelValueDomain[];
	/** Definition
	  * ============
	  * A sequence controls the order of activities or steps by defining a simple sequence.
	  *
	  * Examples
	  * ==========
	  * A sequence might contain two subordinate sequences of activity - one for Round 1 activity of the research and the second for Round 2.
	  *
	  * Explanatory notes
	  * ===================
	  * Unlike temporal constraints, sequence is NOT pairwise. However, a group of temporal constraints can specify an order with more precision than a sequence. */
	Sequence?: Sequence[];
	/** Definition
	  * ============
	  * Assigns a sequence number to an activity within a sequence. */
	SequencePosition?: SequencePosition[];
	/** Definition
	  * ============
	  * Service is a type of processing agent. Services are atomic. They execute acts which have input and output parameters.
	  *
	  * Examples
	  * ==========
	  * Given a location as input, a weather service provides weather data as output.
	  *
	  * Explanatory notes
	  * ===================
	  * A service binds information objects to parameters at runtime. */
	Service?: Service[];
	/** Definition
	  * ============
	  * Set of categories represented by classification items where the subset of immediate children categories for any given parent category are mutually exclusive and jointly exhaustive with respect to that parent.
	  *
	  * Examples
	  * ==========
	  * ISIC rev 4; NAICS 2017, SOC 2018
	  *
	  * Explanatory notes
	  * ===================
	  * A statistical classification may have a flat, linear structure or may be hierarchically structured, such that all categories at lower levels are sub-categories of categories at the next Level up. (Source: GSIM StatisticalClassification)
	  * Each classification item represents a category. Every category is a member of a level within a statistical classification. The categories are defined with reference to one or more characteristics of a particular universe of units of observation. */
	StatisticalClassification?: StatisticalClassification[];
	/** Definition
	  * ============
	  * Specifies the statistical classifications for the source and target of a complex relationship and defines the relationship. */
	StatisticalClassificationRelationship?: StatisticalClassificationRelationship[];
	/** Definition
	  * ============
	  * Step is a reusable, parameterized activity associated to information flows. One or more steps perform an sctivity.
	  *
	  * Examples
	  * ==========
	  * An editing activity resolves into one or more steps. A transformation of a wide data set to a long data set takes a single step on an ETL (extract, transform, load) platform like Pentaho.
	  *
	  * Explanatory notes
	  * ===================
	  * Steps can be broken out into a sequence of sub steps ad infinitum. */
	Step?: Step[];
	/** Definition
	  * ==========
	  * Conceptual domain of substantive concepts.
	  *
	  * Examples
	  * ========
	  * An enumeration of concepts for a categorical variable like "male" and "female" for gender, or "ozone" and "particulate matter less than 2.5 microns in diameter" for pollutant in an air quality measure.
	  *
	  * Explanatory notes
	  * =================
	  * A conceptual variable links a unit type to a substantive conceptual domain. The latter can be an enumeration or description of the values that the variable may take on. In the enumerated case these are the categories in a category set that can be values, not the codes that represent the values. An example might be the conceptual domain for a variable representing self-identified gender. An enumeration might include the concept of "male" and the concept of "female". These, in turn, would be represented in a substantive value domain by codes in a code list like "m" and "f", or "0" and "1". A conceptual domain might be described through a value and concept description's description property of "a real number greater than 0" or through a more formal logical expression of "all reals x such that x > 0". Even in the described case, what is being described are conceptual, not the symbols used to represent the values. This may be a subtle distinction, but allows specifying that the same numeric value might be represented by 32 bits or by 64 bits or by an Arabic numeral or a Roman numeral. */
	SubstantiveConceptualDomain?: SubstantiveConceptualDomain[];
	/** Definition
	  * ==========
	  * Value domain for a substantive conceptual domain. Typically a description and/or enumeration of allowed values of interest.
	  *
	  * Examples
	  * ========
	  * All real decimal numbers relating to the subject matter of interest between 0 and 1 specified in Arabic numerals. (From the Generic Statistical Information Model [GSIM] 1.1). The codes "M" male and "F" for female .
	  *
	  * Explanatory notes
	  * =================
	  * In DDI-CDI the value domain for a variable is separated into "substantive" and "sentinel" values. Substantive values are the values of primary interest. Sentinel values are additional values that may carry supplementary information, such as reasons for missing. This duality is described in ISO 11404. Substantive values for height might be real numbers expressed in meters. The full value domain might also include codes for different kinds of missing values - one code for "refused" and another for "don’t know". Sentinel values may also convey some substantive information and at the same time represent missing values.
	  *
	  * An example might be where a numeric variable like number of employees be sometimes a count and sometimes a code representing a range of counts in order to avoid disclosure of information about a specific entity. The substantive value domain may use either a value description, for described values, or a codelist for enumerated values, or both. A value domain may consist of substantive values or sentinel values. Substantive values are those associated directly with some subject matter area. They do not address concerns around processing, such as missing values. Substantive values are called "regular values" in ISO/IEC 11404 - General Purpose Datatypes. The enumerated case is one where all values are listed.
	  *
	  * An example is the categorical values for gender: the conceptual domain could consist of the concept of male and the concept of female. These might be represented in codes and associated labels as 1 ("Male") 2 ("Female"). The described case is one where some description is needed to define the set of values. Take the following description for height in meters: "a real number between 0 and 3, represented to two Arabic decimal places". This description might be structured in some way to be machine actionable (datatype="double”, min="0", max="3", decimals="2"). */
	SubstantiveValueDomain?: SubstantiveValueDomain[];
	/** Information structured according to a non-DDI-CDI specification which is relevant to the understanding and/or processing of the content of Wrapper. */
	supportingInformation?: Reference[];
	/** Definition
	  * ============
	  * Persistent and unique identifier (PIDs) to provide standarized, long-lasting identification.
	  *
	  * Examples
	  * ==========
	  * UUIDs, GUIDs, DOIs, URNs or any other unique id generation framework.
	  *
	  * Explanatory notes
	  * ===================
	  * This PIDs either complement or replace identifier and dimension components.
	  * They complement them when there is a need for having a globally unique identifier as part of an instance key. They replace them when identier components are not available (e.g. after de-identification for confidentiality). */
	SyntheticIdComponent?: SyntheticIdComponent[];
	/** Definition
	  * ============
	  * Temporal constraints provide a mechanism for expressing concurrency control and synchronization
	  *
	  * Examples
	  * ==========
	  * Allen's Interval Algebra is a set of temporal constraints. So are the Split and SplitJoin ControlConstructs
	  *
	  * Explanatory notes
	  * ===================
	  * Allen's interval algebra is a calculus for temporal reasoning that was introduced in 1983. Reasoning with qualitative time in Allen's full interval algebra is nondeterministic polynomial time (NP) complete. Research since 1995 identified maximal tractable subclasses of this algebra via exhaustive computer search and also other ad-hoc methods. In 2003, the full classification of complexity for satisfiability problems over constraints in Allen's interval algebra was established algebraically. */
	TemporalConstraints?: TemporalConstraints[];
	/** Definition
	  * ==========
	  * Declarative control flow operator where the continuation of the execution flow depends on the finalization of one or more preceding activities/steps.
	  *
	  * - XORJoin: Given three activities A, B and C, if XORJoin(A, B) -> C, then C is executed after either A or B finishes executing. XORJoin is sometimes referred to as simple merge.
	  * - ANDJoin: Given three activities A, B and C, if ANDJoin(A, B) -> C, then C is executed after both A and B finish executing. ANDJoin is sometimes referred to as synchronization.
	  * - XORSplit: Given three activities A, B and C, if XORSplit(A) -> (B, C), then either B or C is executed, not both, after A finishes executing. XORSplit is sometimes referred to as exclusive choice.
	  * - ANDSplit: Given three activities A, B and C, if ANDSplit(A) -> (B, C), then both B and C are executed after A finishes executing. */
	TemporalControlConstruct?: TemporalControlConstruct[];
	/** Definition
	  * ==========
	  * Individual object of interest for some statistical activity, such as data collection.
	  *
	  * Examples
	  * ========
	  * Here are 3 examples:
	  *
	  * 1. Individual US person (i.e., Arofan Gregory, Dan Gillman, Barack Obama, etc.)
	  * 2. Individual US computer companies (i.e., Microsoft, Apple, IBM, etc.)
	  * 3. Individual US universities (i.e., Johns Hopkins, University of Maryland, Yale, etc.) [GSIM 1.1]
	  *
	  * Explanatory notes
	  * =================
	  * In a traditional data table each column might represent some variable (measurement). Each row would represent the entity (Unit)  to which those variables relate. Height measurements might be made on persons (unit type) of primary school age (Universe) at Pinckney Elementary School on September 1, 2005 (population). The height for Mary Roe (Unit)  might be 139 cm.
	  *
	  * The Unit is not invariably tied to some value. A median income might be calculated for a block in the U.S. but then used as an attribute of a person residing on that block. For the initial measurement the Unit was the block. In the reuse the unit would be that specific person to which the value was applied.
	  *
	  * In a big data table each row represents a unit/variable double. Together a unit identifier and a variable identifier define the key. And for each key there is just one value – the measure of the unit on the variable.
	  *
	  * A big data table is sometimes referred to as a column-oriented data store whereas a traditional database is sometimes referred to as a row-oriented data store. The unit plays an identifier role in both types of data stores. */
	Unit?: Unit[];
	/** Definition
	  * ==========
	  * Description of unit-record ("wide") data sets, where each row in the data set provides the same group of values for variables all relating to a single unit.
	  *
	  * Examples
	  * ========
	  * A simple spreadsheet. Commonly the first row of the table will contain variable names or descriptions.
	  *
	  * The following CSV file has a rectangular layout and would import into a simple table in a spreadsheet::
	  *
	  * PersonId,AgeYr,HeightCm
	  * 1,22,183,
	  * 2,45,175,
	  *
	  * Explanatory notes
	  * =================
	  * This is the classic rectangular data table used by most statistical packages, with rows/cases/observations and columns/variables/measurements. Each cell (DataPoint) in the table is the intersection of a Unit (row) and an InstanceVariable. Each logical column will contain data relating to the values for a single variable. */
	UnitSegmentLayout?: UnitSegmentLayout[];
	/** Definition
	  * ==========
	  * Unit type is a type or class of objects of interest (units).
	  *
	  * Examples
	  * ========
	  * Person, Establishment, Household, State, Country, Dog, Automobile, Neutrino.
	  *
	  * Explanatory notes
	  * =================
	  * Unit type is the most general in the hierarchy of unit type, universe, and population. It is a description of the basic characteristics for a general set of Units. A universe is a set of entities defined by a specialization of a unit type. A Population further narrows the specification to a specific time and geography.
	  *
	  * A unit type is used to describe a class or group of Units based on a single characteristic with no specification of time and geography. For example, the unit type of "Person" groups together a set of Units based on the characteristic that they are "Persons".
	  *
	  * It concerns not only unit types used in dissemination, but anywhere in the statistical process. E.g. using administrative data might involve the use of a fiscal unit. [GSIM 1.1]. */
	UnitType?: UnitType[];
	/** Definition
	  * ============
	  * Specialized unit type, with the specialization based upon characteristics other than time and geography.
	  *
	  * Examples
	  * ==========
	  * 1. Canadian adults (not limited to those residing in Canada)
	  * 2. Computer companies
	  * 3. Universities
	  *
	  * Explanatory notes
	  * ===================
	  * Universe sits in a hierarchy between unit type and population, with unit type being most general and Population most specific. A universe is a set of entities defined by a more narrow specification than that of an underlying unit type. A population further narrows the specification to a specific time and geography.
	  *
	  * If the Universe consists of people, a number of factors may be used in defining membership in the Universe, such as age, sex, residence, income, veteran status, criminal convictions, etc. The universe may consist of elements other than persons, such as housing units, court cases, deaths, countries, etc. A universe may be described as "inclusive" or "exclusive".
	  *
	  * Not to be confused with Population, which includes the specification of time and geography. */
	Universe?: Universe[];
	/** Definition
	  * ==========
	  * Formal description of a set of values.
	  *
	  * Examples
	  * ========
	  *
	  * 1. The integers between 1 and 10, inclusive. The values of x satisfying the logicalExpression property: " (1 less than or equal to X less than or equalto 10) AND mod(x,10)=0" Also described with minimumValueInclusive = 1 and maximumValueInclusive = 10 (and datatype of integer).
	  * 2. The upper case letters A through C and X described with the regularExpression "/[A-CX]/".
	  * 3. A date-time described with the Unicode Locale Data Markup Language pattern yyyy.MM.dd G 'at' HH:mm:ss zzz.
	  *
	  * Explanatory notes
	  * =================
	  * The value and concept description may be used to describe either a value domain or a conceptual domain. For a value domain, the value and concept description contains the details for a described" domain (as opposed to an enumerated domain). There are a number of properties which can be used for the description. The description could be just text such as: "an even number greater than zero", or a more formal logical expression like "x>0 and mod(x,2)=0". A regular expression might be useful for describing a textual domain. It could also employ a format pattern from the Unicode Locale Data Markup Language (LDML: http://www.unicode.org/reports/tr35/tr35.html). Some conceptual domains might be described with just a narrative. Others, though, might be described in much the same way as a value domain depending on the specificity of the concept. In ISO 11404 a value domain may be described either through enumeration or description, or both. This class provides the facility for that description. It may be just a text description, but a description through a logical expression is machine actionable and might, for example, be rendered as an integrity constraint. If both text and a logical expression are provided the logical expression is to be taken as the canonical description. The logical expression could conform to an expression syntax like that of the Validation and Transformation Language (VTL: https://sdmx.org/?page_id=5096) or the Structured Data Transformation Language (SDTL: https://ddialliance.org/products/sdtl/1.0). */
	ValueAndConceptDescription?: ValueAndConceptDescription[];
	/** Definition
	  * ============
	  * Set of permissible values for a variable (adapted from ISO/IEC 11179).
	  *
	  * Examples
	  * ==========
	  * Age categories with a numeric code list; Age in years; Young, Middle-aged and Old.
	  *
	  * Explanatory notes
	  * ===================
	  * The values can be described by enumeration or by an expression. Value domains can be either substantive/sentinel, or described/enumeration. */
	ValueDomain?: ValueDomain[];
	/** Definition
	  * ==========
	  * Physical characteristics for the value of an instance variable stored in a data point as part of a physical segment layout.
	  *
	  * Examples
	  * ========
	  * A variable "age" might be represented in a file as a string with a maximum length of 5 characters and a number pattern of ##0.0
	  *
	  * Explanatory notes
	  * =================
	  * An instance variable has details of value domain and data type, but will not have the final details of how a value is physically represented in a data file. A variable for height, for example, may be represented as a real number, but may be represented as a string in multiple ways. The decimal separator might be, for example a period or a comma. The string representing the value of a payment might be preceded by a currency symbol. The same numeric value might be written as "1,234,567" or "1.234567". A missing value might be written as ".", "NA", ".R" or as "R". The value mapping describes how the value of an instance variable is physically expressed. The properties of the value mapping as intended to be compatible with the W3C Metadata Vocabulary for Tabular Data (https://www.w3.org/TR/tabular-metadata/) as well as common programming languages and statistical packages. The 'format' property, for example, can draw from an external controlled vocabulary such as the set of formats for Stata, SPSS, or SAS. */
	ValueMapping?: ValueMapping[];
	/** Definition
	  * ============
	  * Denotes the position of a value mapping in a sequence. */
	ValueMappingPosition?: ValueMappingPosition[];
	/** Definition
	  * ============
	  * Relationships among data points in a physical layout. */
	ValueMappingRelationship?: ValueMappingRelationship[];
	/** Definition
	  * ==========
	  * Group of any type of variable within the variable cascade (conceptual, represented, instance).
	  *
	  * Examples
	  * ========
	  * 1. Variables within a specific section of a study
	  * 2. Variables related to a specific subject or keyword
	  * 3. Variables at a specified level of development or review
	  *
	  * Explanatory notes
	  * =================
	  * A simple ordered or unordered list of variables can be described via a set of variable position parameters. An optional variable structure can describe a more complex structure for the collection. We might, for example, use the variable structure to group variables by content within a single collection of data or a wave of on-going data collection. For the purposes of management, conceptualization or anything other than organizing a logical record or physical layout. */
	VariableCollection?: VariableCollection[];
	/** Definition
	  * ============
	  * Role given to a represented variable in the context of a data structure to provide codes for variable identification.
	  *
	  * Examples
	  * ==========
	  * Consider {"income", "age"} to be the value domain of the represented variable working as a variable descriptor component.  The two codes, i.e. those designating "income" and "age", are descriptors used to identify which values in the variable value component correspond to income and which ones to age.
	  *
	  * Explanatory notes
	  * ===================
	  * Whenever more than one variable appears in the same column, we need a mechanism to distinguish which values correspond to which variable. This mechanism is provided by the variable descriptor component, which contains the codes used to link the variables to their values.  This structure provides a flexible mechanism avoiding the need for a formal pointer. */
	VariableDescriptorComponent?: VariableDescriptorComponent[];
	/** Definition
	  * ============
	  * Assigns a sequence number to a variable within a list.
	  *
	  * Explanatory notes
	  * ===================
	  * Variable position allows a list of variables to be ordered. */
	VariablePosition?: VariablePosition[];
	/** Definition
	  * ============
	  * Relationship between any variables in the variable cascade (conceptual, represented, instance), based on an ordered relation. */
	VariableRelationship?: VariableRelationship[];
	/** Definition
	  * ============
	  * Relation structure for use with any set of variables in the variable cascade (conceptual, represented, instance). */
	VariableStructure?: VariableStructure[];
	/** Definition
	  * ============
	  * Role given to a represented variable in the context of a data structure to record values of multiple variables.
	  *
	  * Examples
	  * ==========
	  * Consider two variables, i.e. income and age, with their values living together in different entries in the same column.  The values of those two variables are now in the value domain of a single variable (the one working as a variable value component).  Another column, based on a variable descriptor component, use codes for "income" and "age" to distinguish income values from age values.
	  *
	  * Explanatory notes
	  * ===================
	  * A variable value component captures the values of multiple variables that have been transposed into a single column.  The variable descriptor component provides a mechanism to identify which of those values correspond to which variable.   This structure provides a flexible mechanism avoiding the need for a formal pointer. */
	VariableValueComponent?: VariableValueComponent[];
	/** Definition
	  * ============
	  * Organized collection of wide data. It is structured by a wide data structure.
	  *
	  * Examples
	  * ==========
	  * A unit dataset where each row corresponds to a set of data points capturing different characteristics of a unit. */
	WideDataSet?: WideDataSet[];
	/** Definition
	  * ==========
	  * Structure of a wide dataset (organized collection of wide data). It is described by identifier, measure and attribute components.
	  *
	  * Examples
	  * ==========
	  * The structure described by [Unit id, Income, Province] where Unit id identifies a statistical unit and Income and Province are two instance variables capturing characteristics. */
	WideDataStructure?: WideDataStructure[];
	/** Definition
	  * ==========
	  * Collection of data instances that uniquely identify a collection of data points in a wide dataset.
	  *
	  * Examples
	  * ==========
	  * Collection containing the single "1A2B3C" string in a wide dataset where rows are identified by postal code representations. */
	WideKey?: WideKey[];
	/** Definition
	  * ============
	  * Single data instance that is part of a wide key.
	  *
	  * Examples
	  * ==========
	  * The "1A2B3C" string in a wide dataset where rows are identified by postal code representations. */
	WideKeyMember?: WideKeyMember[];
}
export interface Wrapper extends _Wrapper { constructor: { new(): Wrapper }; }
export var Wrapper: { new(): Wrapper };

export interface document extends BaseType {
	/** Definition
	  * ============
	  * A set of information important for understanding access conditions. Examples include license, embargo details. */
	AccessInformation: AccessInformation;
	/** Definition
	  * ============
	  * A set of access information for a machine including URI, mime type, and physical location. */
	AccessLocation: AccessLocation;
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
	  * Location address identifying each part of the address as separate elements, identifying the type of address, the level of privacy associated with the release of the address, and a flag to identify the preferred address for contact.
	  *
	  * Examples
	  * ========
	  * For example:
	  *
	  * 1. OFFICE, ABS HOUSE, 45 Benjamin Way, Belconnen, Canberra, ACT, 2617, AU
	  * 2. OFFICE, Institute of Education, 20 Bedford Way, London, WC1H 0AL, UK */
	Address: Address;
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
	  * ==========
	  * A reference to an agent (organization, individual, or machine) including a role for that agent in the context of this specific reference.
	  *
	  * Examples
	  * ========
	  * Reference to John Doe as the lead author. */
	AgentInRole: AgentInRole;
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
	/** AssociationReference Definition
	  * ============
	  * Provides a way of pointing to resources outside of the information described in the set of DDI-CDI metadata. */
	AssociationReference: AssociationReference;
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
	  * Personal names should be listed surname or family name first, followed by forename or given name. When in doubt, give the name as it appears, and do not invert. In the case of organizations where there is clearly a hierarchy present, list the parts of the hierarchy from largest to smallest, separated by full stops and a space. If it is not clear whether there is a hierarchy present, or unclear which is the larger or smaller portion of the body, give the name as it appears in the item. The name may be provided in one or more languages. */
	BibliographicName: BibliographicName;
	/** Definition
	  * ============
	  * A set of information useful for attribution, data discovery, and access.
	  *
	  * Examples
	  * ==========
	  * Creator, contributor, title, copyright, license information. */
	CatalogDetails: CatalogDetails;
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
	/** Definition
	  * ============
	  * Complex relation structure for use with statistical classification.
	  *
	  * Examples
	  * ==========
	  * A classification item structure for the International Standard Classification of Occupations (ISCO-08: https://www.ilo.org/public/english/bureau/stat/isco/isco08/) would describe each of the major classifications as a parent of its sub-classifications. 1 Managers, for example would be listed as a parent of four sub groups: 11 Chief Executives, Senior Officials and Legislators; 12 Chief Executives, Senior Officials and Legislators; 13 Production and Specialized Services Managers; and 14 Hospitality, Retail and Other Services Managers.
	  *
	  * Explanatory notes
	  * ===================
	  * The classification item structure has a set of classification item relationships which are basically adjacency lists. A source classification item has a described relationship to a target list of classification items. The semantic might be, for example, "parentOf", or "contains", etc. */
	ClassificationItemStructure: ClassificationItemStructure;
	/** Definition
	  * ============
	  * The index of a classification within a classification family expressed as an integer, progressing upward from 0 or 1. */
	ClassificationPosition: ClassificationPosition;
	/** Definition
	  * ============
	  * Ensemble of one or more statistical classifications, based on the same concept, and related to each other as versions or updates.
	  *
	  * Examples
	  * ==========
	  * ISIC or ISCO
	  * SIC (with different published versions related to the publication year).
	  *
	  * Explanatory notes
	  * ===================
	  * Typically, these statistical classifications have the same name. */
	ClassificationSeries: ClassificationSeries;
	/** Definition
	  * ============
	  * Structure for describing the complex relationships between statistical classifications in a classification series.
	  *
	  * Examples
	  * ==========
	  * A classification series that branches into separately versioned classifications.
	  *
	  * Explanatory notes
	  * ===================
	  * Can use relation specification information to more fully describe the relationship between members such as parent/child, whole/part, general/specific, equivalence, etc. */
	ClassificationSeriesStructure: ClassificationSeriesStructure;
	/** Definition
	  * ============
	  * The characters used as a symbol to designate a category within a codelist or classification. (Formally, a sign for which the signifier is non-linguistic alphanumeric string.)
	  *
	  * Examples
	  * ==========
	  * The letter M might stand for the category "Male" in the codeList called "Gender".
	  *
	  * Explanatory notes
	  * ===================
	  * A non-linguistic alphanumeric string is one which does not correspond to a word in natural language. For use in a codelist. The representation property (value) is expressed as it would be found in a data file. Multiple representations may relate to the same category but should be expressed as separate codes.  It should not be confused with a classification item which is a placeholder for a position in a statistical classification. */
	Code: Code;
	/** Definition
	  * ============
	  * List of codes and associated categories.
	  *
	  * Examples
	  * ==========
	  * The codes "M" and "F" could point to "Male" and "Female" categories respectively.  A code list for an occupational classification system like the International Standard Classification of Occupations (ISCO-08: https://www.ilo.org/public/english/bureau/stat/isco/isco08/) could use a classification relation structure to describe a hierarchy (Chief Executives and Administrative and Commercial Managers as subtypes of Managers).
	  *
	  * Explanatory notes
	  * ===================
	  * List may be flat or hierarchical. A hierarchical structure may have an indexed order for intended presentation even though the content within levels of the hierarchy are conceptually unordered. For hierarchical structures classification item structure is used to provide additional information on the structure and organization of the categories. Note that a category set can be structured by a classification relation structure without the need for associating any codes with the categories. This allows for the creation of a category set, for example for a response domain, without an associated codelist. */
	CodeList: CodeList;
	/** Definition
	  * ============
	  * Relation structure of codes within a codelist.
	  *
	  * Explanatory notes
	  * ===================
	  * Allows for the specification of complex relationships among codes. The code list structure employs a set of code relationips to describe the relationship among concepts. Each code relationship is a one to many description of connections between codes. Together they might commonly describe relationships as complex as a hierarchy. */
	CodeListStructure: CodeListStructure;
	/** Definition
	  * ============
	  * An index within an order intended for presentation (even though the content within levels of the hierarchy may be conceptually unordered). Expressed as an integer counting upward from 01 or 1. */
	CodePosition: CodePosition;
	/** Definition
	  * ============
	  * Source target relationship between codes in a code relation structure. */
	CodeRelationship: CodeRelationship;
	/** Definition
	  * ============
	  * Provides the structure of a single Date expressed in an ISO date structure along with equivalent expression in any number of non-ISO formats. While it supports the use of the ISO time interval structure this should only be used when the exact date is unclear (i.e. occurring at some point in time between the two specified dates) or in specified applications. Ranges with specified start and end dates should use the DateRange as a datatype. Commonly uses property names include: eventDate, issueDate, and releaseDate.
	  *
	  * Explanatory notes
	  * ===================
	  * Date allows one of a set of date-time (YYYY-MM-DDThh:mm:ss), date (YYYY-MM-DD), year-month (YYYY-MM), year (YYYY), time (hh:mm:ss) and duration (PnYnMnDnHnMnS), or time interval (YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss, YYYY-MM-DDThh:mm:ss/PnYnMnDnHnMnS, PnYnMnDnHnMnS/ YYYY-MM-DDThh:mm:ss) which is formatted according to ISO 8601 and backed supported by regular expressions in the BaseDateType. Time Zone designation and negative/positive prefixes are allowed as are dates before and after 0000 through 9999. */
	CombinedDate: CombinedDate;
	/** Definition
	  * ============
	  * Provides the following information on the command: The content of the command and the programming language used. */
	Command: Command;
	/** Definition
	  * ============
	  * Contains information on the command used for processing data. Contains a description of the command which should clarify for the user the purpose and process of the command, an in-line provision of the command itself, and a reference to an external version of the command such as a coding script. */
	CommandCode: CommandCode;
	/** Definition
	  * ============
	  * Identifies and provides a link to an external copy of the command, for example, a SAS Command Code script. Designates the programming language of the command file, a description of the location of the file , and a URN or URL for the command file. */
	CommandFile: CommandFile;
	/** Definition
	  * ============
	  * Indexes the components in a data structure using integers with a position indicated by incrementing upward from 0 or 1. */
	ComponentPosition: ComponentPosition;
	/** Definition
	  * ============
	  * Unit of thought differentiated by characteristics (from the Generic Statistical Information Model version 1.2: https://statswiki.unece.org/display/clickablegsim/Concept).
	  *
	  * Examples
	  * ==========
	  * Velocity, Distance, Poverty, Income, Household Relationship, Family, Gender, Business Establishment, Satisfaction, Mass, Air Quality, etc.
	  *
	  * Explanatory notes
	  * ===================
	  * Many DDI-CDI classes are subtypes of the concept class including category, universe, unit type, conceptual variable. This class realizes the pattern class signified and as such a concept can be denoted by a sign. */
	Concept: Concept;
	/** Definition
	  * ============
	  * Correspondence between concepts in a correspondence table.
	  *
	  * Examples
	  * ==========
	  * A simple example might map the following 2 martial status category sets:  MS1: single, married, widowed, divorced. MS2: single, married.  So, a correspondence table between these 2 category sets might look like this: MS1 single - MS2 single; MS1 widowed - MS2 single; MS1 divorced - MS2 single; MS1 married - MS2 married.
	  *
	  * Explanatory notes
	  * ===================
	  * A concept map is the pairing of similar concepts. Each concept in the map belongs to a different collection. The collection of maps for all the concepts in corresponding collections is a correspondence table. */
	ConceptMap: ConceptMap;
	/** Definition
	  * ============
	  * Relationship between a pair of concepts in a collection of concepts. Use controlled vocabulary provided in semantics to identify the type of relationship (relation, e.g. ParentChild, WholePart, etc.)
	  *
	  * Examples
	  * ==========
	  * Apple (a specialized concept) is a kind of fruit (a generic concept). A wheel (a partitive concept) is part of a car (a whole concept).
	  *
	  * Explanatory notes
	  * ===================
	  * The idea is similar to category relationship, except it applies generally and not just for categories. */
	ConceptRelationship: ConceptRelationship;
	/** Definition
	  * ============
	  * Relations of concepts within a collection.
	  *
	  * Examples
	  * ==========
	  * A concept of vacation might be described as having sub-types of beach vacation and mountain vacation.
	  *
	  * Explanatory notes
	  * ===================
	  * The concept structure employs a set of concept relationships to describe the relationship among concepts. Each concept relationship is a one to many description of connections between concepts. Together they can describe relationships as complex as a hierarchy or even a complete cyclical network as in a concept map. Allows for the specification of complex relationships among concepts. */
	ConceptStructure: ConceptStructure;
	/** Definition
	  * ============
	  * Set of concepts structured by the relations among them [GSIM 1.1].
	  *
	  * Examples
	  * ==========
	  * 1) Concept of Sex: Male, Female, Other.
	  * 2) Concept of Household Relationship: Household Head, Spouse of Household Head, Child of Household Head, Unrelated Household Member, etc.
	  *
	  * Explanatory notes
	  * ===================
	  * Note that this class can be used with concepts, classifications, universes, populations, unit types and any other class that extends from concept. */
	ConceptSystem: ConceptSystem;
	/** Definition
	  * ============
	  * Relationship between 2 or more concept systems described through mapping similarity relationships between their member concepts.
	  *
	  * Examples
	  * ==========
	  * Correspondence between the concepts used to define the amount of salt dissolved in a body of water: the concepts "salinity" and "saltiness" might be described as equivalent, for example.
	  *
	  * Explanatory notes
	  * ===================
	  * Describes correspondence with one or more maps which identify a source and target concept and defines their commonality and difference using descriptive text and controlled vocabularies. */
	ConceptSystemCorrespondence: ConceptSystemCorrespondence;
	/** Definition
	  * ============
	  * Set of concepts, where each concept is intended to be used as the meaning (signified) for a datum.
	  *
	  * Examples
	  * ==========
	  * Substantive: Housing Unit Tenure - Owned, Rented, Vacant. Sentinel: Non-response - Refused, Don't Know, Not Applicable
	  *
	  * Explanatory notes
	  * ===================
	  * Intent of a conceptual domain is defining a set of concepts used to measure a broader concept. For effective use they should be discrete (non-overlapping) and provide exhaustive coverage of the broader concept. The constituent concepts can be either sentinel or substantive,  The set can be described by either enumeration or by an expression. */
	ConceptualDomain: ConceptualDomain;
	/** Definition
	  * ============
	  * Concept (with a notion of equality defined) being observed, captured, or derived which is associated to a single data instance.
	  *
	  * Examples
	  * ==========
	  * A systolic blood pressure of 122 is measured. The instance value for that measurement in this paragraph is the character string "122". The associated measured concept (a blood pressure at that level) is the conceptual value.  The conceptual value comes from a conceptual domain associated with a conceptual variable.
	  *
	  * Explanatory notes
	  * ===================
	  * This is the concept associated to the actual instance of data that is stored in a data point (the signified of a datum in the signification pattern). */
	ConceptualValue: ConceptualValue;
	/** Definition
	  * ============
	  * A variable at the highest level of abstraction.
	  *
	  * Examples
	  * ==========
	  * A gender variable defining two categories – "male" and "female" allowing relating each of these to concepts having description of how these categories are decided.
	  *
	  * Explanatory notes
	  * ===================
	  * The conceptual variable allows for describing the domain of concepts it can take on as well as the type of unit that can be measured. A conceptual variable for blood pressure might, for example describe the conditions under which the pressure is to be taken (sitting as opposed to standing) and a conceptual value domain as height of mercury – without units. One represented variable would further refine this by specifying inches as the unit of measurement for the height. Another might specify that the height be represented in centimeters. Both represented variables could reference the same conceptual variable to indicate in what way they are comparable. */
	ConceptualVariable: ConceptualVariable;
	/** Definition
	  * ============
	  * A set of decision points which determine the flow between the steps used to perform an activity.
	  *
	  * Examples
	  * ==========
	  * Loop, IfThenElse, RepeatWhile, etc. */
	ConditionalControlLogic: ConditionalControlLogic;
	/** Definition
	  * ============
	  * Contact information for the individual or organization including location specification, address, web site, phone numbers, and other means of communication access. Address, location, telephone, and other means of communication can be repeated to express multiple means of a single type or change over time. Each major piece of contact information contains the element effectiveDates in order to date stamp the period for which the information is valid. */
	ContactInformation: ContactInformation;
	/** Definition
	  * ============
	  * Encapsulates contextual information of the key-value datastore to provide a scope to the instance key. The instance key is unique within the scope.
	  *
	  * Examples
	  * ==========
	  * A partition, cluster name and any other key-value datastore organization information.
	  *
	  * Explanatory notes
	  * ===================
	  * A key-value datastore can be organized into multiple contextual components.
	  * Other data structure components that are part of the instance key, e.g. identifier and dimension components, guarantee uniqueness only within the scope of a contextual component.
	  * Synthetic id components do guarantee global uniqueness, but they might complex to setup and maintain in many organizations.
	  * Contextual components provide a simple mechanism to achieve uniqueness within a single key-value datastore.
	  * When a key-value datastore is organized in contextual components, a contextual component prefix is added to the instance key to make it unique across the entire key-value datastore. */
	ContextualComponent: ContextualComponent;
	/** Definition
	  * ============
	  * Allows for unstructured content which may be an entry from an externally maintained controlled vocabulary.If the content is from a controlled vocabulary provide the code value of the entry, as well as a reference to the controlled vocabulary from which the value is taken. Provide as many of the identifying attributes as needed to adequately identify the controlled vocabulary. Note that DDI has published a number of controlled vocabularies applicable to several locations using the external controlled vocabulary entry structure. If the code portion of the controlled vocabulary entry is language specific (i.e. a list of keywords or subject headings) use language to specify that language. In most cases the code portion of an entry is not language specific although the description and usage may be managed in one or more languages. Use of shared controlled vocabularies helps support interoperability and machine actionability. */
	ControlledVocabularyEntry: ControlledVocabularyEntry;
	/** Definition
	  * ============
	  * Control logic is a program in which the order of statements is explicit. Control logic is either deterministic (imperative) or non-deterministic (declarative). Deterministic control logic consists of control constructs. Declarative control logic is constraint- and/or rule-based. Control logic may contain control logic.
	  *
	  * Examples
	  * ==========
	  * A loop control construct is deterministic control logic. A script is deterministic control logic. Rule based scheduling is declarative control logic.
	  *
	  * Explanatory notes
	  * ===================
	  * DDI-CDI has extended control logic to include non-deterministic activity and step controls, which are not specifically described in DDI Lifecycle or DDI Codebook. */
	ControlLogic: ControlLogic;
	/** Definition
	  * ============
	  * Describes the commonalities and differences between two members using a textual description of both commonalities and differences plus an optional coding of the type of commonality. */
	CorrespondenceDefinition: CorrespondenceDefinition;
	/** Definition
	  * ============
	  * Set of relationships between the members within or between statistical classifications.
	  *
	  * Examples
	  * ==========
	  * Correspondence between the U.S. Standard Industrial Classification (SIC) and North American Industrial Classification System (NAICS).
	  *
	  * Explanatory notes
	  * ===================
	  * Correspondence tables are used with statistical classifications. For instance, it can relate two versions from the same classification series; statistical classifications from different classification series; a variant and the version on which it is based; or different versions of a variant. In the first and last examples, the correspondence table facilitates comparability over time. */
	CorrespondenceTable: CorrespondenceTable;
	/** Definition
	  * ============
	  * Curator is a software agent that uses techniques such as natural language processing to map facts in the research data store to the condition part of a rule.
	  *
	  * Examples
	  * ==========
	  * Domain-specific curators are available as both open source and commercial products.
	  *
	  * Explanatory notes
	  * ===================
	  * The curator assists in identifying the rules that are currently in play in the rule set. */
	Curator: Curator;
	/** Definition
	  * ============
	  * Container for an instance value.
	  *
	  * Examples
	  * ==========
	  * A cell in a data cube or a table.
	  *
	  * Explanatory notes
	  * ===================
	  * A data point could be empty. It exists independently of the instance value to be stored in it. */
	DataPoint: DataPoint;
	/** Definition
	  * ============
	  * Indexed location of the associated member within the associated list. */
	DataPointPosition: DataPointPosition;
	/** Definition
	  * ============
	  * Relations used by the data point relation structure of a logical record to describe specific source-target data points and their relationship. */
	DataPointRelationship: DataPointRelationship;
	/** Definition
	  * ============
	  * Organized collection of data based on keys. */
	DataSet: DataSet;
	/** Definition
	  * ============
	  * Collection of logical records.
	  *
	  * Examples
	  * ==========
	  * The data lineage of an individual business process or an entire data pipeline are both examples of a logical record relation structures. In a data lineage we can observe how logical records are connected within a business process or across business processes.
	  *
	  * Explanatory notes
	  * ===================
	  * Keep in mind that a logical records are definitions, not a "datasets". Logical records organized in a structured collection is called a logical record relation structure. Instances of logical records instantiated as organizations of data points hosting data are described in format description. A data store is reusable across studies. Each study has at most one data store. */
	DataStore: DataStore;
	/** Definition
	  * ============
	  * Data organization based on reusable data structure components. */
	DataStructure: DataStructure;
	/** Definition
	  * ============
	  * Role given to a represented variable in the context of a data structure.
	  *
	  * Explanatory notes
	  * ===================
	  * A represented variable can have different roles in different data structures. For instance, the variable sex can be a measure in a wide data structure and a dimension in a dimensional data structure. */
	DataStructureComponent: DataStructureComponent;
	/** Definition
	  * ============
	  * Expresses a date/time range using a start date and end date (both with the structure of Date and supporting the use of ISO and non-ISO date structures). Use in all locations where a range of dates is required, i.e. validFor, embargoPeriod, collectionPeriod, etc. */
	DateRange: DateRange;
	/** Definition
	  * ============
	  * Correspondence of a data instance to the concept it represents.
	  *
	  * Examples
	  * ==========
	  * A systolic blood pressure of 122 is measured. The single data instance (instance value) for that measurement is the character string "122". The datum in this case is the association of the conceptual value, i.e. the underlying measured concept (a blood pressure at that level), with the instance value.
	  * if a datum represents the conceptual value “married” with a code “M,” it is not the same datum where that conceptual value is represented with a code “1”. If the datum which uses the code “M” is present in more than one data set, it is still the same datum.
	  *
	  * Explanatory notes
	  * ===================
	  * The datum is a reification of the association between instance value and conceptual value. It is a designation (a representation of a concept by a sign) in the signification pattern. The data instance (instance value) is the signifier and the concept it represents (conceptual value) is the signified. The datum has an association with an instance variable which allows the attachment of a unit of measurement, a datatype, and a population. These instance variable attributes are critical for interpreting the signifier.  NOTE: This is NOT datum as defined in The Data Documentation Initiative Lifecycle specification, which is more limited in breadth. This specification takes a little more formal (semiotic) description of a datum using the signification pattern.
	  * The datum is reusable, and may appear in more than one data set, carrying with it its full contextualized meaning and identity. The instance variables and instance values with which it is associated will therefore be functionally similar or identical across its appearance in different data instances. Instance variable and instance value are specific to a single data set instance – datum is not. */
	Datum: Datum;
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
	  * Use of a code for variable identification in the context of a data structure and a variable descriptor component.
	  *
	  * Examples
	  * ========
	  * Consider two variables, i.e. income and age, with values appearing in the same column. Codes "income" and "age" are descriptors. They appear multiple time in a variable descriptor component, one for each value in the variable value component. Each descriptor references one of those values. This way it's possible to identify which values correspond to income and which ones to age. */
	Descriptor: Descriptor;
	/** Definition
	  * ============
	  * Set of permissible values for a variable playing the role of a variable descriptor component.
	  *
	  * Examples
	  * ==========
	  * Consider two variables, i.e. income and age, with values appearing in the same column.
	  * Codes "income" and "age" are descriptors that appear in the descriptor value domain corresponding to the descriptor variable. */
	DescriptorValueDomain: DescriptorValueDomain;
	/** Definition
	  * ============
	  * Variable that provides codes for variable identification in the context of a data structure.
	  * Variable playing the role of a variable descriptor component.
	  *
	  * Examples
	  * ==========
	  * Consider two variables, i.e. income and age, with values apearing in the same column.
	  * Codes "income" and "age" are descriptors that appear in the descriptor value domain corresponding to the descriptor variable. */
	DescriptorVariable: DescriptorVariable;
	/** Definition
	  * ============
	  * Deterministic imperative is a subtype of control logic. Deterministic control logic consists of control constructs.
	  *
	  * Examples
	  * ==========
	  * A Loop control construct is deterministic control logic. A script is deterministic control logic.
	  *
	  * Explanatory notes
	  * ===================
	  * Because control logic covers both deterministic and non-deterministic forms, it has been divided into the appropriate subtypes. */
	DeterministicImperative: DeterministicImperative;
	/** Definition
	  * ============
	  * Organized collection of multidimensional data. It is structured by a dimensional data structure.
	  *
	  * Examples
	  * ==========
	  * A dimensional dataset with Income values in each data point, where the dimensions organizing the data points are Sex and Marital Status.
	  *
	  * Explanatory notes
	  * ===================
	  * Similar to Structural N-Cube. */
	DimensionalDataSet: DimensionalDataSet;
	/** Definition
	  * ============
	  * Structure of a dimensional data set (organized collection of multidimensional data). It is described by dimension, measure and attribute components.
	  *
	  * Examples
	  * ==========
	  * The structure described by [City, Average Income, Total Population] where City is a dimension and Average Income and Total Population are measures. */
	DimensionalDataStructure: DimensionalDataStructure;
	/** Definition
	  * ============
	  * Collection of data instances that uniquely identify a collection of data points in a dimensional dataset.
	  *
	  * Examples
	  * ==========
	  * Collection of "male", "Ontario" and "married" strings in a dimensional dataset where data points are identified by Sex, Province and Marital Status dimensions. */
	DimensionalKey: DimensionalKey;
	/** Definition
	  * ============
	  * Collection of concepts that uniquely defines a collection of data points in a dimensional dataset.
	  *
	  * Examples
	  * ==========
	  * Collection of [Male], [Ontario] and [Married] categories in a dimensional dataset where data points are defined by Sex, Province and Marital Status dimensions. */
	DimensionalKeyDefinition: DimensionalKeyDefinition;
	/** Definition
	  * ============
	  * Single concept that is part of a dimensional key definition.
	  *
	  * Examples
	  * ==========
	  * The [Ontario] category in a dimensional dataset where data points are defined by Province and other dimensions. */
	DimensionalKeyDefinitionMember: DimensionalKeyDefinitionMember;
	/** Definition
	  * ============
	  * Single data instance that is part of a dimensional key.
	  *
	  * Examples
	  * ==========
	  * The "Ontario" string in a dimensional dataset where data points are identified by Province and other dimensions. */
	DimensionalKeyMember: DimensionalKeyMember;
	/** Definition
	  * ============
	  * Role given to a represented variable in the context of a dimensional data structure to identify the universes associated with data points. The variable acts as a field in the compound identifier (the key structure) to disambiguate the cells in the multi-dimensional "cube".
	  *
	  * Explanatory notes
	  * ===================
	  * The categories from each dimension often are used in combination to identify a cell. The meaning of the combination of the categories supplies meaning to the cell. */
	DimensionComponent: DimensionComponent;
	/** Definition
	  * ============
	  * Collection of dimensions that can be reused across multiple dimensional structures.
	  *
	  * Examples
	  * ==========
	  * Sex, Province and Marital Status is a common set of dimensions used across a variety of dimensional data structures and might need to be maintained separately. */
	DimensionGroup: DimensionGroup;
	/** Definition
	  * ============
	  * Any non-email means of relaying a message electronically. This would include text messaging, Skype, Twitter, ICQ, or other emerging means of electronic message conveyance.
	  *
	  * Examples
	  * ==========
	  * Skype account, etc. */
	ElectronicMessageSystem: ElectronicMessageSystem;
	/** Definition
	  * ============
	  * An e-mail address which conforms to the internet format (RFC 822) including its type and time period for which it is valid.
	  *
	  * Examples
	  * ==========
	  * info@ddialliance.org; ex.ample@somewhere.org */
	Email: Email;
	/** Definition
	  * ============
	  * Specific information about any relevant embargo. */
	EmbargoInformation: EmbargoInformation;
	/** Definition
	  * ============
	  * A base class acting as an extension point to allow all codifications (codelist, statistical classification, etc.) to be understood as enumerated value domains. */
	EnumerationDomain: EnumerationDomain;
	/** Definition
	  * ============
	  * Role of a set of data structure components for content referencing purposes
	  *
	  * Explanatory notes
	  * ===================
	  * Equivalent to foreign key in the relational model.
	  * It can be used in conjunction with primary key to link data structures and their related data sets. */
	ForeignKey: ForeignKey;
	/** Definition
	  * ============
	  * Role of a data structure component for content referencing purposes
	  *
	  * Explanatory notes
	  * ===================
	  * Equivalent to a foreign key attribute (i.e. column) in the relational model.
	  * It can be used in conjunction with a primary key component to link data structures and their related data sets. */
	ForeignKeyComponent: ForeignKeyComponent;
	/** Definition
	  * ============
	  * Information regarding the source of funds used to develop or support the resource being described. */
	FundingInformation: FundingInformation;
	/** Definition
	  * ============
	  * Geography-specific role given to a represented variable in the context of a data structure. The specific characterization of the role (e.g. reference, coordinates, etc.) may be given by a controlled vocabulary. */
	GeoRole: GeoRole;
	/** Definition
	  * ============
	  * Identifier for objects requiring short- or long-lasting referencing and management. */
	Identifier: Identifier;
	/** Definition
	  * ============
	  * Role given to a represented variable in the context of a long or wide data structure to identify the units associated to data points, and in dimensional and key value data structures to provide identifying fields for the instance values.
	  *
	  * Examples
	  * ==========
	  * The personal identification number of a Swedish citizen for unit data or the name of a country in the European Union for dimensional data. */
	IdentifierComponent: IdentifierComponent;
	/** Definition
	  * ============
	  * A person. (See for example the W3C Friend of a Friend Ontology - http://xmlns.com/foaf/spec/#term_Person).
	  *
	  * Examples
	  * ==========
	  * Individual employed by an organization. A person within a unit or project (organization). Albert Einstein, Bugs Bunny, Harry Potter, Ashley G. Williams, Gandalf.
	  *
	  * Explanatory notes
	  * ===================
	  * Describes people referred to in the description of data and process. Similar to the concept found in Schema.org, the W3C ORG Ontology, etc. */
	Individual: Individual;
	/** Definition
	  * ============
	  * The name of an individual broken out into its component parts of prefix, first/given name, middle name, last/family/surname, and suffix. The preferred compilation of the name parts may also be provided. The legal or formal name of the individual should have the isFormal attribute set to true. The preferred name should be noted with the isPreferred attribute. The attribute sex provides information to assist in the appropriate use of pronouns. */
	IndividualName: IndividualName;
	/** Definition
	  * ============
	  * The relationships between parameters across steps is described by the information flow definition. Each relationship creates a pathway for an information object to follow.
	  *
	  * Examples
	  * ==========
	  * The output of one parameter might be the input of another one. Think of a Business Process Model and Notation (BPMN) diagram or an extract, transform, and load (ETL) pipeline definition as the sum of these relationships.
	  *
	  * Explanatory notes
	  * ===================
	  * In DDI Lifecycle an information flow definition was referred to in terms of a "binding". */
	InformationFlowDefinition: InformationFlowDefinition;
	/** Definition
	  * ============
	  * Single-valued key representation produced from the merge of the representations of all key members and a descriptor.
	  *
	  * Examples
	  * ==========
	  * The string "cluster:income_distribution:unitid:20:period:2020/02:income", where "cluster:income_distribution" is a key member based on a contextual component, "unitid:20" is based on an identifier component, "period:2020/02" is based on a component with a time role and "income" is based on a descriptor.
	  *
	  * Explanatory notes
	  * ===================
	  * For value strings, the merge is the string concatenation operation.
	  * For other classes, an appropriate merge representation can be defined. */
	InstanceKey: InstanceKey;
	/** Definition
	  * ============
	  * Single data instance corresponding to a concept (with a notion of equality defined) being observed, captured, or derived.
	  *
	  * Examples
	  * ==========
	  * A systolic blood pressure of 122 is measured. The single data instance (instance value) for that measurement is the character string "122". The associated measured concept (a blood pressure at that level) is the conceptual value.
	  *
	  * Explanatory notes
	  * ===================
	  * This is the actual instance of data that populates a data point (the signifier of a datum in the signification pattern). The instance value comes from a value domain associated with an instance variable which allows the attachment of a unit of measurement, a datatype, and a population. */
	InstanceValue: InstanceValue;
	/** Definition
	  * ==========
	  * Use of a represented variable within a data set.
	  *
	  * Examples
	  * ========
	  * 1. Gender: Dan Gillman has gender <m, male>, Arofan Gregory has gender <m, male>, etc.
	  * 2. Number of employees: Microsoft has 90,000 employees; IBM has 433,000 employees, etc.
	  * 3. Endowment: Johns Hopkins has endowment of <3, $1,000,000 and above>, Yale has endowment of <3, $1,000,000 and above>, etc.
	  * 4. A tornado near Winterset, Iowa, had a peak wind speed of 170 mph. Two instance variables of a person's height reference the same represented variable. This indicates that they are intended to: be measured with the same unit of measurement, have the same intended data type, have the same substantive value domain, use a sentinel value domain drawn from the same set of sentinel value domains, have the same sentinel (missing value) concepts, and draw their population from the same universe. In other words, the two instance variables should be comparable.
	  *
	  * Explanatory notes
	  * =================
	  * The instance variable class inherits all of the properties and relationships of the represented variable class and, in turn, the conceptual variable class. This means that an instance variable can be completely populated without the need to create an associated represented variable or conceptual variable. If, however, a user wishes to indicate that a particular instance variable is patterned after a particular represented variable or a particular conceptual variable that may be indicated by including a relationship to the represented variable and/or conceptual variable. Including these references is an important method of indicating that multiple instance variables have the same representation, measure the same concept, and are drawn from the same universe. If two instance variables of a person's height reference the same represented variable. This indicates that they are intended to: be measured with the same unit of measurement, have the same intended data type, have the same substantive value domain, use a sentinel value domain drawn from the same set of sentinel value domains, have the same sentinel (missing value) concepts, and draw their population from the same universe. In other words, the two instance variables should be comparable. The instance variable describes actual instances of data that have been collected. */
	InstanceVariable: InstanceVariable;
	/** Definition
	  * ============
	  * Key value relationship for two or more logical records where the key is one or more equivalent instance variables and the value is a defined relationship or a relationship to a set value.
	  *
	  * Explanatory notes
	  * ===================
	  * The instance variable map identifies the variables which are used to connect two data sets, as when persons in one structure are associated with households in another structure. For logical records Household and Person, the keys are Household ID (HHID in Household Record), and Person ID (HHIDP in Person Record). Their value relationship is Equal, and set value is n.a. For each person in the person record, the value of HHIDP will be exactly the same as the value of HHID in the household record for the household to which they belong. (Correspondence type refers to the variables themselves rather than the value of the variables concerned.) In this context correspondence type will normally be set to ExactMatch. */
	InstanceVariableMap: InstanceVariableMap;
	/** IntermediateAssociationReference Definition
	  * ============
	  * Provides a way of pointing to resources outside of the information described in the set of DDI-CDI metadata. */
	IntermediateAssociationReference: IntermediateAssociationReference;
	/** Definition
	  * ============
	  * An identifier whose scope of uniqueness is broader than the local archive. Common forms of an international identifier are ISBN, ISSN, DOI or similar designator. Provides both the value of the identifier and the agency who manages it.
	  *
	  * Explanatory notes
	  * ===================
	  * For use in annotation or other citation format. */
	InternationalIdentifier: InternationalIdentifier;
	/** Definition
	  * ==========
	  * Persistent, globally unique object identifier aligned with ISO/IEC 11179-6:2015, Information technology - Metadata registries (MDR) - Part 6: Registration, Annex A, Identifiers based on ISO/IEC 6523, http://standards.iso.org/ittf/PubliclyAvailableStandards/c060342_ISO_IEC_11179-6_2015.zip.
	  * The uniqueness of an InternationalRegistrationDataIdentifier (IRDI) is determined by the combination of the values of three identifying attributes. */
	InternationalRegistrationDataIdentifier: InternationalRegistrationDataIdentifier;
	/** Definition
	  * ============
	  * Packaging structure for multilingual versions of the same string content, represented by a set of LanguageString. Only one LanguageString per language/scope type is allowed. Where an element of this type (InternationalString) is repeatable, the expectation is that each repetition contains a different content, each of which can be expressed in multiple languages. */
	InternationalString: InternationalString;
	/** Definition
	  * ============
	  * Collection of data instances that uniquely identify a collection of data points in a dataset. */
	Key: Key;
	/** Definition
	  * ============
	  * Collection of concepts that uniquely defines a collection of data points in a dataset. */
	KeyDefinition: KeyDefinition;
	/** Definition
	  * ============
	  * Single concept that is part of the structure of a key definition. */
	KeyDefinitionMember: KeyDefinitionMember;
	/** Definition
	  * ============
	  * Single data instance that is part of a key. */
	KeyMember: KeyMember;
	/** Definition
	  * ============
	  * Organized collection of key-value data. It is structured by a key value structure.
	  *
	  * Examples
	  * ==========
	  * A unit key-value datastore where each instance key corresponds to a data point capturing a different characteristic of a unit.
	  *
	  * Explanatory notes
	  * ===================
	  * A key-value datastore is just a collection of key-value pairs, i.e. instance keys and reference values.
	  * Each instance key encodes all relevant information about the context, the unit of interest and the variable associated with the reference value of a given data point. */
	KeyValueDataStore: KeyValueDataStore;
	/** Definition
	  * ============
	  * Structure of a key-value datastore (organized collection of key-value data). It is described by identifier, contextual, synthetic id, dimension, variable descriptor and variable value components.
	  *
	  * Examples
	  * ==========
	  * The structure described by [Income distribution, Unit id, Period, Income] where Income distribution is the contextual component, Unit id identifies a statistical unit, period is a effective period and Income is the variable of interest. */
	KeyValueStructure: KeyValueStructure;
	/** Definition
	  * ============
	  * A structured display label. Label provides display content of a fully human readable display for the identification of the object. */
	LabelForDisplay: LabelForDisplay;
	/** Definition
	  * ============
	  * A language/scope-type specific variant of an InternationalString. It contains the following attributes: language to designate the language, isTranslated with a default value of false to designate if an object is a translation of another language, isTranslatable with a default value of true to designate if the content can be translated, translationSourceLanguage to indicate the source languages used in creating this translation, translationDate, and scope which can be used to define intended audience or use such as internal, external, etc. */
	LanguageString: LanguageString;
	/** Definition
	  * ============
	  * Set of all classification items the same number of relationships from the root (or top) classification item.
	  *
	  * Examples
	  * ==========
	  * ISCO-08: index='1' label of associated category 'Major', index='2' label of associated category 'Sub-Major',  index='3' label of associated category 'Minor',
	  *
	  * Explanatory notes
	  * ===================
	  * Provides level information for the members of the level structure. levelNumber provides the level number which may or may not be associated with a category which defines level. */
	Level: Level;
	/** Definition
	  * ============
	  * Nesting structure of a hierarchical collection.
	  *
	  * Examples
	  * ==========
	  * The International Standard Classification of Occupations (ISCO-08: https://www.ilo.org/public/english/bureau/stat/isco/isco08/) Major, Sub-Major, and Minor or the North American Industry Classification System (NAICS: https://www.census.gov/naics/) 2 digit sector codes, 3 digit subsector code list, 4 digit industry group code list, and 5 digit industry code list.
	  *
	  * Explanatory notes
	  * ===================
	  * The levels within the structure begin at the root level '1' and continue as an ordered array through each level of nesting. Levels are used to organize a hierarchy. Usually, a hierarchy contains one root member at the top, though it could contain several. These are the first level. All members directly related to those  in the first level compose the second level. The third and subsequent levels are defined similarly.  A level often is associated with a concept, which defines it. These correspond to kinds of aggregates. For example, in the US Standard Occupational Classification (2010), the level below the top is called Major Occupation Groups, and the next level is called Minor Occupational Groups. These ideas convey the structure. In particular, Health Care Practitioners (a major group) can be broken into Chiropractors, Dentists, Physicians, Vets, Therapists, etc. (minor groups) The categories in the nodes at the lower level aggregate to the category in node above them.  "Classification schemes are frequently organized in nested levels of increasing detail. ISCO-08, for example, has four levels: at the top level are ten major groups, each of which contain sub-major groups, which in turn are subdivided in minor groups, which contain unit groups. Even when a classification is not structured in levels ("flat classification"), the usual convention, which is adopted here, is to consider that it contains one unique level." (From the W3C Simple Knowlegde Organization System: http://rdf-vocabulary.ddialliance.org/xkos.html#) Individual classification items organized in a hierarchy may be associated with a specific level. */
	LevelStructure: LevelStructure;
	/** Definition
	  * ============
	  * Information about any relevant license.
	  *
	  * Examples
	  * ==========
	  * Licensed under Creative Commons Attribution 2.0 Generic (CC BY 2.0). */
	LicenseInformation: LicenseInformation;
	/** Definition
	  * ============
	  * Collection of instance variables. */
	LogicalRecord: LogicalRecord;
	/** Definition
	  * ============
	  * Assigns a position of the logical record within the data store. */
	LogicalRecordPosition: LogicalRecordPosition;
	/** Definition
	  * ============
	  * Relationships between logical records. */
	LogicalRecordRelationship: LogicalRecordRelationship;
	/** Definition
	  * ============
	  * Structuring of relationships between logical records in a data store.
	  *
	  * Examples
	  * ==========
	  * A data store with a Household, Family, and Person logical record type. Allows for describing parent/child, whole/part, or other relationships as appropriate. */
	LogicalRecordRelationStructure: LogicalRecordRelationStructure;
	/** Definition
	  * ============
	  * Organized collection of long data. It is structured by a long data structure.
	  *
	  * Examples
	  * ==========
	  * A unit dataset where each row corresponds to a set of data points capturing different characteristics of a unit, some of which can be transposed into variable descriptor and variable value components. */
	LongDataSet: LongDataSet;
	/** Definition
	  * ============
	  * Structure of a long dataset (organized collection of long data). It is described by identifier, measure, attribute, variable descriptor and variable value components.
	  *
	  * Examples
	  * ==========
	  * The structure described by [Unit id, Income, Province, Variable name, Variable value] where Unit id identifies a statistical unit, Income and Province are two instance variables capturing characteristics, and other instance variables are represented by Variable name (a variable descriptor component) and Variable Value (a variable value component). */
	LongDataStructure: LongDataStructure;
	/** Definition
	  * ============
	  * Collection of data instances that uniquely identify a collection of data points in a long dataset.
	  *
	  * Examples
	  * ==========
	  * Collection containing the single "K1Z1C1" string in a long dataset where rows are identified by postal code representations. */
	LongKey: LongKey;
	/** Definition
	  * ============
	  * Single data instance that is part of a long key.
	  *
	  * Examples
	  * ==========
	  * The "K1Z1C1" string in a long dataset where rows are identified by postal code representations. */
	LongMainKeyMember: LongMainKeyMember;
	/** Definition
	  * ============
	  * Mechanism or computer program used to perform an act.
	  *
	  * Examples
	  * ==========
	  * SAS program, photocopier
	  *
	  * Explanatory notes
	  * ===================
	  * May be used as a target to identify the agent who performed an action. Used to define hardware or software that act as agents in data capture, data processing, or other related actions. */
	Machine: Machine;
	/** Definition
	  * ============
	  * Identifies the unit of interest, either a statistical unit or a population, via identifier or dimension components, respectively, plus an optional contextual component.
	  * If neither identifier nor dimension components are present, then a synthetic id component is used.
	  *
	  * Examples
	  * ==========
	  * The string "income_distribution:male:Ontario:married" in a dimensional key-value datastore, where instance key members are defined by context plus Sex, Province and Marital Status dimensions. */
	MainKeyMember: MainKeyMember;
	/** Definition
	  * ============
	  * Role given to a represented variable in the context of a data structure to hold the observed/derived values.
	  *
	  * Examples
	  * ==========
	  * Height of a person in a wide or long dataset or number of citizens in a country in a dataset for multiple countries (dimensional dataset). */
	MeasureComponent: MeasureComponent;
	/** Definition
	  * ==========
	  * Attributes for the model identification with constant values. */
	ModelIdentification: ModelIdentification;
	/** Definition
	  * ============
	  * A unique set of attributes, not conforming to the DDI identifier structure nor structured as a URI, used to identify some entity. */
	NonDdiIdentifier: NonDdiIdentifier;
	/** Definition
	  * ============
	  * Non-deterministic control logic is a subtype of control logic. Non-deterministic (or declarative) control logic is constraint- and/or rule-based.
	  *
	  * Examples
	  * ==========
	  * Rule based scheduling is declarative control logic.
	  *
	  * Explanatory notes
	  * ===================
	  * Unlike DDI Lifecycle, DDI-CDI describes non-deterministic activity and step controls. */
	NonDeterministicDeclarative: NonDeterministicDeclarative;
	/** Definition
	  * ============
	  * Used to preserve an historical date, formatted in a non-ISO fashion. */
	NonIsoDate: NonIsoDate;
	/** Definition
	  * ============
	  * Representation of a category in the context of a code or a classification item, as opposed of the corresponding instance value which would appear when used in a dataset.
	  *
	  * Examples
	  * ==========
	  * The number "334" used as a code for the "Computer and electronic product manufacturing" category in the North American Industry Classification System (NAICS). */
	Notation: Notation;
	/** Definition
	  * ==========
	  * A resource which describes a specific attribute of an object. It is defined in the style of selectors of the Web Annotation Vocabulary, see https://www.w3.org/TR/annotation-vocab/. The selector can be nested dependent on the structure of the referenced object. */
	ObjectAttributeSelector: ObjectAttributeSelector;
	/** Definition
	  * ==========
	  * A standard means of expressing a name for a class object. A linguistic signifier. Human understandable name (word, phrase, or mnemonic) that reflects the ISO/IEC 11179-5 naming principles.
	  *
	  * Explanatory notes
	  * =================
	  * Use in model: In general the property name should be "name" as it is the name of the class object of which it is an attribute. Use a specific name (i.e. xxxName) only when naming something other than the class object of which it is an attribute. */
	ObjectName: ObjectName;
	/** Definition
	  * ==========
	  * Collection of people organized within a framework of authority that can perform an act or be associated with another agent.
	  *
	  * Examples
	  * ==========
	  * Commonwealth Scientific and Industrial Research Organisation (CSIRO), U.S. Census Bureau, University of Michigan/Institute for Social Research, Research Data Alliance Agrisemantics Working Group.
	  *
	  * Explanatory notes
	  * =================
	  * The W3C Organization Ontology (https://www.w3.org/TR/vocab-org/#organizational_structure) definition: "Represents a collection of people organized together into a community or other social, commercial or political structure. The group has some common purpose or reason for existence which goes beyond the set of people belonging to it and can act as an agent. Organizations are often decomposable into hierarchical structures." */
	Organization: Organization;
	/** Definition
	  * ==========
	  * Names by which the organization is known. Use the attribute isFormal with a value of True to designate the legal or formal name of the organization. Names may be typed with typeOfOrganizationName to indicate their appropriate usage. */
	OrganizationName: OrganizationName;
	/** Definition
	  * ==========
	  * A tightly bound pair of items from an external controlled vocabulary. The extent property describes the extent to which the parent term applies for the specific case.
	  *
	  * Examples
	  * ========
	  * When used to assign a role to an actor within a specific activity this term would express the degree of contribution. Contributor with term (role) "Editor" and extent "Lead".
	  *
	  * Alternatively the term might be a controlled vocabulary from a list of controlled vocabularies, e.g. the Generic Longitudinal Business Process Model (GLBPM) in a list that could include other business process model frameworks. In this context the extent becomes the name of a business process model task, e.g. "integrate data" from the GLBPM. */
	PairedControlledVocabularyEntry: PairedControlledVocabularyEntry;
	/** Definition
	  * ============
	  * An input or output to control logic and the step/sub-step it invokes. Parameters may take the form of any information object, including data sets and structured metadata as well as configuration information for the step/sub-step.
	  *
	  * Examples
	  * ==========
	  * A dimensional data set; a long data structure. */
	Parameter: Parameter;
	/** Definition
	  * ============
	  * Information needed for understanding the physical structure of data coming from a file or other source.
	  *
	  * Examples
	  * ==========
	  * The physical data set is the entry point for information about a file or other source. It includes information about the name of a file, the structure of segments in a file.
	  *
	  * Explanatory notes
	  * ===================
	  * Multiple styles of structural description are supported: including describing files as unit-record (unit segment layout) files; describing cubes; and describing event-history (spell) data. */
	PhysicalDataSet: PhysicalDataSet;
	/** Definition
	  * ============
	  * Ordering for physical record segments, which map to a logical record.
	  *
	  * Explanatory notes
	  * ===================
	  * The same logical record layout may be the source member in several adjacency lists. This can happen when physical record segments are also population specific. In this instance each adjacency list associated with a logical record layout is associated with a different population. */
	PhysicalDataSetStructure: PhysicalDataSetStructure;
	/** Definition
	  * ==========
	  * Realization of relation structure that is used to describe the sequence of value mappings in a physical layout.
	  *
	  * Examples
	  * ========
	  * The W3C Tabular Data on the Web specification section 4.5 Cells (https://www.w3.org/TR/tabular-data-model/#content-type) allows for a list datatype within cells. In the example below there are three top level instance variables: PersonID - the person identifier; AgeYr - age in years; BpSys_Dia - blood pressure (a list containing Systolic and Diastolic values). There are two variables at a secondary level of the hierarchy: Systolic - the systolic pressure; Diastolic - the diastolic pressure. The delimited file below uses the comma to separate "columns" and forward slash to separate elements of a blood pressure list. ::
	  *
	  * PersonID, AgeYr, BpSys_Dia
	  * 1,22,119/67
	  * 2,68,122/70
	  *
	  * The physical relation structure in this case would describe a BpSys_Dia list variable as containing an ordered sequence of the Systolic and Diastolic instance variables.
	  *
	  * Explanatory notes
	  * =================
	  * This can be more complex than a simple sequence. */
	PhysicalLayoutRelationStructure: PhysicalLayoutRelationStructure;
	/** Definition
	  * ==========
	  * Description of each physical storage segment required to completely cover a physical record representing the logical record.
	  *
	  * Examples
	  * ========
	  * The file below has four instance variables: PersonId, SegmentId, AgeYr, and HeightCm. The data for each person (identified by PersonId) is recorded in two segments (identified by SegmentId), "a" and "b". AgeYr is on physical segment a, and HeightCm is on segment b. These are the same data as described in the unit segment layout documentation. ::
	  *
	  * 1 a  22
	  * 1 b 183
	  * 2 a  45
	  * 2 b 175
	  *
	  * Explanatory notes
	  * =================
	  * A logical record may be stored in one or more segments housed hierarchically in a single file or in separate data files. All logical records have at least one segment. */
	PhysicalRecordSegment: PhysicalRecordSegment;
	/** Definition
	  * ============
	  * Assigns a position of the physical record segment within the whole physical record. For example in what order does this 80 character segment fall within an 800 character record. */
	PhysicalRecordSegmentPosition: PhysicalRecordSegmentPosition;
	/** Definition
	  * ============
	  * Structured relationship between physical record segments. */
	PhysicalRecordSegmentRelationship: PhysicalRecordSegmentRelationship;
	/** Definition
	  * ============
	  * Means for describing the complex relational structure of data points in a physical record representing the logical record. */
	PhysicalRecordSegmentStructure: PhysicalRecordSegmentStructure;
	/** Definition
	  * ============
	  * Used as an extension point in the description of the different layout styles of data structure descriptions.
	  *
	  * Examples
	  * ==========
	  * Examples include unit segment layouts, event data layouts, and cube layouts (e.g. summary data).
	  *
	  * Explanatory notes
	  * ===================
	  * A physical segment layout is a physical description (e.g. unit segment layout) of the associated logical record Layout consisting of a collection of value mappings describing the physical interrelationship of each related value mapping and associated instance variable. */
	PhysicalSegmentLayout: PhysicalSegmentLayout;
	/** Definition
	  * ============
	  * Location of a data point in a physical segment.
	  *
	  * Examples
	  * ==========
	  * A segment of text in a plain text file beginning at character 3 and ending at character 123. The location of the representation of a variable in a text file.
	  *
	  * Explanatory notes
	  * ===================
	  * While this has no properties or relationships of its own, it is useful as a target of relationships where its extensions may serve. This is an extension point since there are many different ways to describe the location of a segment - character counts, start and end times, etc. */
	PhysicalSegmentLocation: PhysicalSegmentLocation;
	/** Definition
	  * ============
	  * Universe with time and geography specified.
	  *
	  * Examples
	  * ==========
	  * 1. Canadian adult persons residing in Canada on 13 November 1956.
	  * 2. US computer companies at the end of 2012.
	  * 3. Universities in Denmark 1 January 2011.
	  *
	  * Explanatory notes
	  * ===================
	  * Population is the most specific in the conceptually narrowing hierarchy of unit type, universe and population. Several populations having differing time and or geography may specialize the same universe. */
	Population: Population;
	/** Definition
	  * ============
	  * Role of a set of data structure components for content linkage purposes
	  *
	  * Explanatory notes
	  * ===================
	  * Equivalent to primary key in the relational model.
	  * A primary key essentially indicates which data structure components correspond to key members.
	  * It can also be used in conjunction with foreign key to link data structures and their related datasets. */
	PrimaryKey: PrimaryKey;
	/** Definition
	  * ============
	  * Role of a data structure component for content identification purposes
	  *
	  * Explanatory notes
	  * ===================
	  * Equivalent to a primary key attribute (i.e. column) in the relational model.
	  * It can be used in conjunction with a foreign key component to link data structures and their related datasets. */
	PrimaryKeyComponent: PrimaryKeyComponent;
	/** Definition
	  * ============
	  * References an image using the standard Image description. In addition to the standard attributes provides an effective date (period) and a privacy ranking. */
	PrivateImage: PrivateImage;
	/** Definition
	  * ============
	  * A processing agent orchestrates the production of information objects in a production environment. There are processing agents which perform data capture, data editing/processing, and data analysis (etc.), each in the appropriate production environments. The processing agent performs an activity based on the control logic.
	  *
	  * Examples
	  * ==========
	  * A processing agent initiates a data capture sequence, obtaining readings from a sensor. A processing agent initiates rule based scheduling. A processing agent is informed by control logic to invoke an imputation activity. */
	ProcessingAgent: ProcessingAgent;
	/** Definition
	  * ============
	  * Production environments consume and produce information objects by way of processing pipelines orchestrated by the processing agent.
	  *
	  * Examples
	  * ==========
	  * Data processing platforms and data analysis platforms are types of production environments. Each of these platforms may have subtypes. */
	ProductionEnvironment: ProductionEnvironment;
	/** Definition
	  * ============
	  * Basic information about the provenance of the object. Includes a simple description, but not detailed modeling of a process. */
	ProvenanceInformation: ProvenanceInformation;
	/** Definition
	  * ============
	  * A measure having a specific production method.
	  *
	  * Examples
	  * ==========
	  * Seasonally adjusted monthly income. */
	QualifiedMeasure: QualifiedMeasure;
	/** Definition
	  * ============
	  * Textual description of the rationale/purpose for the version change and a coded value to provide an internal processing flag within and organization or system. */
	RationaleDefinition: RationaleDefinition;
	/** Definition
	  * ============
	  * Relationships among record types within and between logical records.
	  *
	  * Examples
	  * ==========
	  * One logical record containing a PersonIdentifier and a PersonName and another logical record containing a MeasurementID, a PersonID, a SystolicPressure, and a DiastolicPressure could be linked by a record relation. The record relation could employ an instance variable value map to describe the linkage between  PersonIdentifier and PersonID.
	  *
	  * A household-level logical record might contain an instance variable called HouseholdID and a person-level logical record might contain an instance variable called HID. Describing a link between HouseholdID and HID would allow the linking of a person-level LogicalRecord to their corresponding household-level logical record.
	  *
	  * Explanatory notes
	  * ===================
	  * For instance variables existing in a logical record with multiple record layouts, pairs of instance variables may function as paired keys to permit the expression of hierarchical links between records of different types. These links between keys in different record types could also be used to link records in a relational structure. */
	RecordRelation: RecordRelation;
	/** Definition
	  * ============
	  * Provides a way of pointing to resources outside of the information described in the set of DDI-CDI metadata. */
	Reference: Reference;
	/** Definition
	  * ============
	  * Recorded value in a variable value component.
	  * Value referenced by a descriptor.
	  *
	  * Examples
	  * ==========
	  * Consider two variables, i.e. income and age, with values appearing in the same column, e.g. 100000, 45, 85000, 34, etc.
	  * Codes "income" and "age" are descriptors whereas 100000, 45, 85000, 34 are reference values. */
	ReferenceValue: ReferenceValue;
	/** Definition
	  * ============
	  * Set of permissible values for a variable playing the role of a variable value component.
	  *
	  * Examples
	  * ==========
	  * Consider two variables, i.e. income and age, with values appearing in the same column. A reference variable in this case would be a type of represented variable that can take on values from both income and age. A long data structure might have a column that takes on values from this reference variable. A descriptor variable would then have values paired with the values from the reference variable, pointing to either the income or age variable. */
	ReferenceValueDomain: ReferenceValueDomain;
	/** Definition
	  * ============
	  * Variable that records values of multiple variables in the context of a data structure.
	  * Variable playing the role of a variable value component.
	  *
	  * Examples
	  * ==========
	  * Consider two variables, i.e. income and age, with values appearing in the same column, e.g. 100000, 45, 85000, 34, etc.
	  * Values 100000, 45, 85000, 34 are reference values in the reference value domain corresponding to the reference variable. */
	ReferenceVariable: ReferenceVariable;
	/** Definition
	  * ==========
	  * Conceptual variable with a substantive value domain specified.
	  *
	  * Examples
	  * ==========
	  * The pair (Number of Employees, Integer), where "Number of Employees" is the characteristic of the population (variable) and "Integer" is how that measure will be represented (value domain).
	  *
	  * Explanatory notes
	  * ===================
	  * Extends from conceptual variable and can contain all descriptive fields without creating a conceptual variable. By referencing a conceptual variable it can indicate a common relationship with represented variables expressing the same characteristic of a universe measured in another way, such as Age of Persons in hours rather than years. Represented variable constrains the coverage of the unit type to a specific universe. In the above case the universe with the measurement of Age in hours may be constrained to Persons under 5 days (120 hours old). Represented variable can define sentinel values for multiple storage systems which have the same conceptual domain but specialized value domains. */
	RepresentedVariable: RepresentedVariable;
	/** Definition
	  * ============
	  * A datum that can be qualified by a revision.
	  *
	  * Examples
	  * ==========
	  * The April datum for Income revised in June. */
	RevisableDatum: RevisableDatum;
	/** Definition
	  * ============
	  * Algorithm applied to produce a revised datum.
	  *
	  * Examples
	  * ==========
	  * An adjustment to monthly employment numbers to adjust for errors (sampling or non-sampling) in the underlying data. */
	Revision: Revision;
	/** Definition
	  * ============
	  * A rule has a condition part and an action part. A rule takes the form of: If [Condition} Then [Action]. A rule belongs to a rule set which is a component of rule based scheduling performed by the processing agent
	  *
	  * Examples
	  * ==========
	  * If Exists [InformationObject] Then Perform [Activity] */
	Rule: Rule;
	/** Definition
	  * ============
	  * Rule based scheduling performs a fact check on rules from the rule set, testing their condition part against the facts in the research data store. Fact checking may be assisted by a curator who can semantically compare the condition part of each candidate rule with the facts. The fact checker returns the next activity which rule based scheduling performs according to the following function: factcheck (RuleSet, ResearchDataStore, Curator): Activity.
	  *
	  * Examples
	  * ==========
	  * One real-life situation in which rule-based scheduling is performed involves data virtualization. Here the research datastore has a catalog of views available for use. Rule based scheduling might explore the catalog to determine the rule(s) in the rule set that currently apply. A software curator might assist in the decision in case there was no exact match between a rule and its condition(s) and given the current state of the research datastore. The curator typically uses natural language processing.
	  *
	  * Explanatory notes
	  * ===================
	  * Rule based scheduling is guided by its scheduling strategy. This is described by an enumeration that consists of "forwardChaining" and "backwardChaining". */
	RuleBasedScheduling: RuleBasedScheduling;
	/** Definition
	  * ============
	  * A rule set is a collection of rules. A rule set is a component of rule based scheduling.
	  *
	  * Examples
	  * ==========
	  * If [A overlaps B] Then [X] If [B occurs before C] Then [Y] If [C equals D] Then [Z]  It might take a curator to understand what these rules mean in the context of a research data store.
	  *
	  * Explanatory notes
	  * ===================
	  * Rule based scheduling might have multiple rule sets each of which are domain-specific. The processing agent often helps with the selection of rule sets. */
	RuleSet: RuleSet;
	/** Definition
	  * ==========
	  * A qualified measure whose domain is a universe as an aggregate, i.e. a measure with a specific production method applied to a specific cell in a cube.
	  *
	  * Examples
	  * ========
	  * Seasonally adjusted income for Single, Ontarians, Females. */
	ScopedMeasure: ScopedMeasure;
	/** Definition
	  * ============
	  * Location of a segment of text through character or line counts.
	  *
	  * Examples
	  * ==========
	  * The segment beginning at line 3, character 4 and ending at line 27 character 13. Alternatively the segment beginning at character 257 and ending at character 1350 of the whole body of text. StartLine of 10, endLine of 12, startCharacterPosition of 1, endCharacterPosition of 0 means all of lines 10, 11, and 12.  An endCharacterPosition of 0 indicates that whole lines are specified.
	  *
	  * Explanatory notes
	  * ===================
	  * An adequate description will always include a startCharacterPosition and then may include an endCharacterPosition or a characterLength. If StartLine is specified, the character counts begin within that line. */
	SegmentByText: SegmentByText;
	/** Definition
	  * ==========
	  * A resource which describes the segment of interest in a representation of a resource. This class is not used directly, only its subclasses. It is defined accordingly the related selector of the Web Annotation Vocabulary, see https://www.w3.org/TR/annotation-vocab/#selector. */
	Selector: Selector;
	/** Definition
	  * ==========
	  * Conceptual domain of sentinel concepts.
	  *
	  * Examples
	  * ========
	  *
	  * - Refused
	  * - Don't know
	  * - Lost in processing
	  *
	  * Explanatory notes
	  * =================
	  * Sentinel values are intended for processing purposes whereas substantive values are used for subject matter concerns. */
	SentinelConceptualDomain: SentinelConceptualDomain;
	/** Definition
	  * ============
	  * Value domain for a sentinel conceptual domain.
	  *
	  * Examples
	  * ==========
	  * Missing categories expressed as codes: -9, refused; -8, Don't Know; for a numeric variable with values greater than zero.
	  *
	  * Explanatory notes
	  * ===================
	  * Sentinel values are defined in ISO 11404 as "element of a value space that is not completely consistent with a datatype's properties and characterizing operations...". A common example would be codes for missing values. Sentinel values are used for processing, not to describe subject matter. Typical examples include missing values or invalid entry codes. Sentinel value domains are typically of the enumerated type, but they can be the described type, too. This is not to say that sentinel values carry no information. Data on gender might be enumerated by "0, male" and "1, female". These are the substantive values (see substantive value domain). However, there may be the need to include missing values along with that data, such as "m, missing" and "r, refused". These are sentinel values.  ISO/IEC 11404 - General Purpose Datatypes, defines sentinel values in terms of how that standard defines datatypes. But, the fact that the sentinels don't fit in terms of the calculations and statistics one would perform on the "clean" data is a distinguishing characteristic. In the example above, one would not include missing or refused data in calculating a ratio of females to the total population. Sentinel values may be described rather than enumerated. For instance, there might be a range of values, each representing an out of range value, but there could be too many to enumerate. It is easier to describe the range.  In some software missing values are represented as values not in the datatype of the valid values. R has values of NA, NaN, Inf, and -Inf. SAS and Stata have values displayed as ".", ".A" through ".Z", and "._"  Other software might use values like 999 for missing that would otherwise be the same datatype as valid values but outside the parameters of the domain. In the gender example above: For SPSS the sentinel values might be represented as: 998 = "refused" 999 = "not recorded"  For SAS or Stata the sentinel values might be represented as: .R = "refused" .N = "not recorded"  Sentinel values can also be used for other purposes beyond missing. For a numeric variable "A" might represent a value somewhere in a defined range to prevent disclosure of information about an individual. This might be considered a "semi-missing value". In SAS or Stata for example: .A = "greater than or equal to 100 and less than 1000 ". */
	SentinelValueDomain: SentinelValueDomain;
	/** Definition
	  * ============
	  * A sequence controls the order of activities or steps by defining a simple sequence.
	  *
	  * Examples
	  * ==========
	  * A sequence might contain two subordinate sequences of activity - one for Round 1 activity of the research and the second for Round 2.
	  *
	  * Explanatory notes
	  * ===================
	  * Unlike temporal constraints, sequence is NOT pairwise. However, a group of temporal constraints can specify an order with more precision than a sequence. */
	Sequence: Sequence;
	/** Definition
	  * ============
	  * Assigns a sequence number to an activity within a sequence. */
	SequencePosition: SequencePosition;
	/** Definition
	  * ============
	  * Service is a type of processing agent. Services are atomic. They execute acts which have input and output parameters.
	  *
	  * Examples
	  * ==========
	  * Given a location as input, a weather service provides weather data as output.
	  *
	  * Explanatory notes
	  * ===================
	  * A service binds information objects to parameters at runtime. */
	Service: Service;
	/** Definition
	  * ============
	  * Lists the value and format type for the coordinate value. Note that this is a single value (X coordinate or Y coordinate) rather than a coordinate pair. */
	SpatialCoordinate: SpatialCoordinate;
	/** Definition
	  * ============
	  * A geographic point consisting of an X and Y coordinate. Each coordinate value is expressed separately providing its value and format. */
	SpatialPoint: SpatialPoint;
	/** Definition
	  * ============
	  * Specific roles played by represented variables in terms of time, geography, and other concepts which are important for the harmonization and integration of data. */
	SpecializationRole: SpecializationRole;
	/** Definition
	  * ============
	  * The value of the statistic expressed as a decimal, float and/or double. Indicates whether it is weighted value and the computation base. */
	Statistic: Statistic;
	/** Definition
	  * ============
	  * Set of categories represented by classification items where the subset of immediate children categories for any given parent category are mutually exclusive and jointly exhaustive with respect to that parent.
	  *
	  * Examples
	  * ==========
	  * ISIC rev 4; NAICS 2017, SOC 2018
	  *
	  * Explanatory notes
	  * ===================
	  * A statistical classification may have a flat, linear structure or may be hierarchically structured, such that all categories at lower levels are sub-categories of categories at the next Level up. (Source: GSIM StatisticalClassification)
	  * Each classification item represents a category. Every category is a member of a level within a statistical classification. The categories are defined with reference to one or more characteristics of a particular universe of units of observation. */
	StatisticalClassification: StatisticalClassification;
	/** Definition
	  * ============
	  * Specifies the statistical classifications for the source and target of a complex relationship and defines the relationship. */
	StatisticalClassificationRelationship: StatisticalClassificationRelationship;
	/** Definition
	  * ============
	  * Step is a reusable, parameterized activity associated to information flows. One or more steps perform an sctivity.
	  *
	  * Examples
	  * ==========
	  * An editing activity resolves into one or more steps. A transformation of a wide data set to a long data set takes a single step on an ETL (extract, transform, load) platform like Pentaho.
	  *
	  * Explanatory notes
	  * ===================
	  * Steps can be broken out into a sequence of sub steps ad infinitum. */
	Step: Step;
	/** Definition
	  * ============
	  * The mathematical properties of the structure. */
	StructureSpecification: StructureSpecification;
	/** Definition
	  * ==========
	  * Conceptual domain of substantive concepts.
	  *
	  * Examples
	  * ========
	  * An enumeration of concepts for a categorical variable like "male" and "female" for gender, or "ozone" and "particulate matter less than 2.5 microns in diameter" for pollutant in an air quality measure.
	  *
	  * Explanatory notes
	  * =================
	  * A conceptual variable links a unit type to a substantive conceptual domain. The latter can be an enumeration or description of the values that the variable may take on. In the enumerated case these are the categories in a category set that can be values, not the codes that represent the values. An example might be the conceptual domain for a variable representing self-identified gender. An enumeration might include the concept of "male" and the concept of "female". These, in turn, would be represented in a substantive value domain by codes in a code list like "m" and "f", or "0" and "1". A conceptual domain might be described through a value and concept description's description property of "a real number greater than 0" or through a more formal logical expression of "all reals x such that x > 0". Even in the described case, what is being described are conceptual, not the symbols used to represent the values. This may be a subtle distinction, but allows specifying that the same numeric value might be represented by 32 bits or by 64 bits or by an Arabic numeral or a Roman numeral. */
	SubstantiveConceptualDomain: SubstantiveConceptualDomain;
	/** Definition
	  * ==========
	  * Value domain for a substantive conceptual domain. Typically a description and/or enumeration of allowed values of interest.
	  *
	  * Examples
	  * ========
	  * All real decimal numbers relating to the subject matter of interest between 0 and 1 specified in Arabic numerals. (From the Generic Statistical Information Model [GSIM] 1.1). The codes "M" male and "F" for female .
	  *
	  * Explanatory notes
	  * =================
	  * In DDI-CDI the value domain for a variable is separated into "substantive" and "sentinel" values. Substantive values are the values of primary interest. Sentinel values are additional values that may carry supplementary information, such as reasons for missing. This duality is described in ISO 11404. Substantive values for height might be real numbers expressed in meters. The full value domain might also include codes for different kinds of missing values - one code for "refused" and another for "don’t know". Sentinel values may also convey some substantive information and at the same time represent missing values.
	  *
	  * An example might be where a numeric variable like number of employees be sometimes a count and sometimes a code representing a range of counts in order to avoid disclosure of information about a specific entity. The substantive value domain may use either a value description, for described values, or a codelist for enumerated values, or both. A value domain may consist of substantive values or sentinel values. Substantive values are those associated directly with some subject matter area. They do not address concerns around processing, such as missing values. Substantive values are called "regular values" in ISO/IEC 11404 - General Purpose Datatypes. The enumerated case is one where all values are listed.
	  *
	  * An example is the categorical values for gender: the conceptual domain could consist of the concept of male and the concept of female. These might be represented in codes and associated labels as 1 ("Male") 2 ("Female"). The described case is one where some description is needed to define the set of values. Take the following description for height in meters: "a real number between 0 and 3, represented to two Arabic decimal places". This description might be structured in some way to be machine actionable (datatype="double”, min="0", max="3", decimals="2"). */
	SubstantiveValueDomain: SubstantiveValueDomain;
	/** Definition
	  * ============
	  * Persistent and unique identifier (PIDs) to provide standarized, long-lasting identification.
	  *
	  * Examples
	  * ==========
	  * UUIDs, GUIDs, DOIs, URNs or any other unique id generation framework.
	  *
	  * Explanatory notes
	  * ===================
	  * This PIDs either complement or replace identifier and dimension components.
	  * They complement them when there is a need for having a globally unique identifier as part of an instance key. They replace them when identier components are not available (e.g. after de-identification for confidentiality). */
	SyntheticIdComponent: SyntheticIdComponent;
	/** Definition
	  * ============
	  * Details of a telephone number including the number, type of telephone number, a privacy setting and an indication of whether this is the preferred contact number.
	  *
	  * Examples
	  * ==========
	  * +12 345 67890123 */
	Telephone: Telephone;
	/** Definition
	  * ============
	  * Temporal constraints provide a mechanism for expressing concurrency control and synchronization
	  *
	  * Examples
	  * ==========
	  * Allen's Interval Algebra is a set of temporal constraints. So are the Split and SplitJoin ControlConstructs
	  *
	  * Explanatory notes
	  * ===================
	  * Allen's interval algebra is a calculus for temporal reasoning that was introduced in 1983. Reasoning with qualitative time in Allen's full interval algebra is nondeterministic polynomial time (NP) complete. Research since 1995 identified maximal tractable subclasses of this algebra via exhaustive computer search and also other ad-hoc methods. In 2003, the full classification of complexity for satisfiability problems over constraints in Allen's interval algebra was established algebraically. */
	TemporalConstraints: TemporalConstraints;
	/** Definition
	  * ==========
	  * Declarative control flow operator where the continuation of the execution flow depends on the finalization of one or more preceding activities/steps.
	  *
	  * - XORJoin: Given three activities A, B and C, if XORJoin(A, B) -> C, then C is executed after either A or B finishes executing. XORJoin is sometimes referred to as simple merge.
	  * - ANDJoin: Given three activities A, B and C, if ANDJoin(A, B) -> C, then C is executed after both A and B finish executing. ANDJoin is sometimes referred to as synchronization.
	  * - XORSplit: Given three activities A, B and C, if XORSplit(A) -> (B, C), then either B or C is executed, not both, after A finishes executing. XORSplit is sometimes referred to as exclusive choice.
	  * - ANDSplit: Given three activities A, B and C, if ANDSplit(A) -> (B, C), then both B and C are executed after A finishes executing. */
	TemporalControlConstruct: TemporalControlConstruct;
	/** Definition
	  * ==========
	  * Describes a range of text by recording the start and end positions of the selection in the object. Position 0 would be immediately before the first character, position 1 would be immediately before the second character, and so on. It is defined accordingly the related selector of the Web Annotation Vocabulary, see https://www.w3.org/TR/annotation-vocab/#textpositionselector. */
	TextPositionSelector: TextPositionSelector;
	/** Definition
	  * ============
	  * Time-specific role given to a represented variable in the context of a data structure. The specific characterization of the role (e.g. event, valid, transaction, reference, etc.) may be given by a controlled vocabulary. */
	TimeRole: TimeRole;
	/** Definition
	  * ============
	  * TypedString combines a type with content defined as a simple string. May be used wherever a simple string needs to support a type definition to clarify its content.
	  *
	  * Examples
	  * ==========
	  * Content is a regular expression and the typeOfContent attribute is used to define the syntax of the regular expression content.
	  *
	  * Explanatory notes
	  * ===================
	  * This is a generic type + string where property name and documentation should be used to define any specification for the content. If international structured string content is required use TypedStructuredString. */
	TypedString: TypedString;
	/** Definition
	  * ==========
	  * Individual object of interest for some statistical activity, such as data collection.
	  *
	  * Examples
	  * ========
	  * Here are 3 examples:
	  *
	  * 1. Individual US person (i.e., Arofan Gregory, Dan Gillman, Barack Obama, etc.)
	  * 2. Individual US computer companies (i.e., Microsoft, Apple, IBM, etc.)
	  * 3. Individual US universities (i.e., Johns Hopkins, University of Maryland, Yale, etc.) [GSIM 1.1]
	  *
	  * Explanatory notes
	  * =================
	  * In a traditional data table each column might represent some variable (measurement). Each row would represent the entity (Unit)  to which those variables relate. Height measurements might be made on persons (unit type) of primary school age (Universe) at Pinckney Elementary School on September 1, 2005 (population). The height for Mary Roe (Unit)  might be 139 cm.
	  *
	  * The Unit is not invariably tied to some value. A median income might be calculated for a block in the U.S. but then used as an attribute of a person residing on that block. For the initial measurement the Unit was the block. In the reuse the unit would be that specific person to which the value was applied.
	  *
	  * In a big data table each row represents a unit/variable double. Together a unit identifier and a variable identifier define the key. And for each key there is just one value – the measure of the unit on the variable.
	  *
	  * A big data table is sometimes referred to as a column-oriented data store whereas a traditional database is sometimes referred to as a row-oriented data store. The unit plays an identifier role in both types of data stores. */
	Unit: Unit;
	/** Definition
	  * ==========
	  * Description of unit-record ("wide") data sets, where each row in the data set provides the same group of values for variables all relating to a single unit.
	  *
	  * Examples
	  * ========
	  * A simple spreadsheet. Commonly the first row of the table will contain variable names or descriptions.
	  *
	  * The following CSV file has a rectangular layout and would import into a simple table in a spreadsheet::
	  *
	  * PersonId,AgeYr,HeightCm
	  * 1,22,183,
	  * 2,45,175,
	  *
	  * Explanatory notes
	  * =================
	  * This is the classic rectangular data table used by most statistical packages, with rows/cases/observations and columns/variables/measurements. Each cell (DataPoint) in the table is the intersection of a Unit (row) and an InstanceVariable. Each logical column will contain data relating to the values for a single variable. */
	UnitSegmentLayout: UnitSegmentLayout;
	/** Definition
	  * ==========
	  * Unit type is a type or class of objects of interest (units).
	  *
	  * Examples
	  * ========
	  * Person, Establishment, Household, State, Country, Dog, Automobile, Neutrino.
	  *
	  * Explanatory notes
	  * =================
	  * Unit type is the most general in the hierarchy of unit type, universe, and population. It is a description of the basic characteristics for a general set of Units. A universe is a set of entities defined by a specialization of a unit type. A Population further narrows the specification to a specific time and geography.
	  *
	  * A unit type is used to describe a class or group of Units based on a single characteristic with no specification of time and geography. For example, the unit type of "Person" groups together a set of Units based on the characteristic that they are "Persons".
	  *
	  * It concerns not only unit types used in dissemination, but anywhere in the statistical process. E.g. using administrative data might involve the use of a fiscal unit. [GSIM 1.1]. */
	UnitType: UnitType;
	/** Definition
	  * ============
	  * Specialized unit type, with the specialization based upon characteristics other than time and geography.
	  *
	  * Examples
	  * ==========
	  * 1. Canadian adults (not limited to those residing in Canada)
	  * 2. Computer companies
	  * 3. Universities
	  *
	  * Explanatory notes
	  * ===================
	  * Universe sits in a hierarchy between unit type and population, with unit type being most general and Population most specific. A universe is a set of entities defined by a more narrow specification than that of an underlying unit type. A population further narrows the specification to a specific time and geography.
	  *
	  * If the Universe consists of people, a number of factors may be used in defining membership in the Universe, such as age, sex, residence, income, veteran status, criminal convictions, etc. The universe may consist of elements other than persons, such as housing units, court cases, deaths, countries, etc. A universe may be described as "inclusive" or "exclusive".
	  *
	  * Not to be confused with Population, which includes the specification of time and geography. */
	Universe: Universe;
	/** Definition
	  * ==========
	  * Formal description of a set of values.
	  *
	  * Examples
	  * ========
	  *
	  * 1. The integers between 1 and 10, inclusive. The values of x satisfying the logicalExpression property: " (1 less than or equal to X less than or equalto 10) AND mod(x,10)=0" Also described with minimumValueInclusive = 1 and maximumValueInclusive = 10 (and datatype of integer).
	  * 2. The upper case letters A through C and X described with the regularExpression "/[A-CX]/".
	  * 3. A date-time described with the Unicode Locale Data Markup Language pattern yyyy.MM.dd G 'at' HH:mm:ss zzz.
	  *
	  * Explanatory notes
	  * =================
	  * The value and concept description may be used to describe either a value domain or a conceptual domain. For a value domain, the value and concept description contains the details for a described" domain (as opposed to an enumerated domain). There are a number of properties which can be used for the description. The description could be just text such as: "an even number greater than zero", or a more formal logical expression like "x>0 and mod(x,2)=0". A regular expression might be useful for describing a textual domain. It could also employ a format pattern from the Unicode Locale Data Markup Language (LDML: http://www.unicode.org/reports/tr35/tr35.html). Some conceptual domains might be described with just a narrative. Others, though, might be described in much the same way as a value domain depending on the specificity of the concept. In ISO 11404 a value domain may be described either through enumeration or description, or both. This class provides the facility for that description. It may be just a text description, but a description through a logical expression is machine actionable and might, for example, be rendered as an integrity constraint. If both text and a logical expression are provided the logical expression is to be taken as the canonical description. The logical expression could conform to an expression syntax like that of the Validation and Transformation Language (VTL: https://sdmx.org/?page_id=5096) or the Structured Data Transformation Language (SDTL: https://ddialliance.org/products/sdtl/1.0). */
	ValueAndConceptDescription: ValueAndConceptDescription;
	/** Definition
	  * ============
	  * Set of permissible values for a variable (adapted from ISO/IEC 11179).
	  *
	  * Examples
	  * ==========
	  * Age categories with a numeric code list; Age in years; Young, Middle-aged and Old.
	  *
	  * Explanatory notes
	  * ===================
	  * The values can be described by enumeration or by an expression. Value domains can be either substantive/sentinel, or described/enumeration. */
	ValueDomain: ValueDomain;
	/** Definition
	  * ==========
	  * Physical characteristics for the value of an instance variable stored in a data point as part of a physical segment layout.
	  *
	  * Examples
	  * ========
	  * A variable "age" might be represented in a file as a string with a maximum length of 5 characters and a number pattern of ##0.0
	  *
	  * Explanatory notes
	  * =================
	  * An instance variable has details of value domain and data type, but will not have the final details of how a value is physically represented in a data file. A variable for height, for example, may be represented as a real number, but may be represented as a string in multiple ways. The decimal separator might be, for example a period or a comma. The string representing the value of a payment might be preceded by a currency symbol. The same numeric value might be written as "1,234,567" or "1.234567". A missing value might be written as ".", "NA", ".R" or as "R". The value mapping describes how the value of an instance variable is physically expressed. The properties of the value mapping as intended to be compatible with the W3C Metadata Vocabulary for Tabular Data (https://www.w3.org/TR/tabular-metadata/) as well as common programming languages and statistical packages. The 'format' property, for example, can draw from an external controlled vocabulary such as the set of formats for Stata, SPSS, or SAS. */
	ValueMapping: ValueMapping;
	/** Definition
	  * ============
	  * Denotes the position of a value mapping in a sequence. */
	ValueMappingPosition: ValueMappingPosition;
	/** Definition
	  * ============
	  * Relationships among data points in a physical layout. */
	ValueMappingRelationship: ValueMappingRelationship;
	/** Definition
	  * ==========
	  * Group of any type of variable within the variable cascade (conceptual, represented, instance).
	  *
	  * Examples
	  * ========
	  * 1. Variables within a specific section of a study
	  * 2. Variables related to a specific subject or keyword
	  * 3. Variables at a specified level of development or review
	  *
	  * Explanatory notes
	  * =================
	  * A simple ordered or unordered list of variables can be described via a set of variable position parameters. An optional variable structure can describe a more complex structure for the collection. We might, for example, use the variable structure to group variables by content within a single collection of data or a wave of on-going data collection. For the purposes of management, conceptualization or anything other than organizing a logical record or physical layout. */
	VariableCollection: VariableCollection;
	/** Definition
	  * ============
	  * Role given to a represented variable in the context of a data structure to provide codes for variable identification.
	  *
	  * Examples
	  * ==========
	  * Consider {"income", "age"} to be the value domain of the represented variable working as a variable descriptor component.  The two codes, i.e. those designating "income" and "age", are descriptors used to identify which values in the variable value component correspond to income and which ones to age.
	  *
	  * Explanatory notes
	  * ===================
	  * Whenever more than one variable appears in the same column, we need a mechanism to distinguish which values correspond to which variable. This mechanism is provided by the variable descriptor component, which contains the codes used to link the variables to their values.  This structure provides a flexible mechanism avoiding the need for a formal pointer. */
	VariableDescriptorComponent: VariableDescriptorComponent;
	/** Definition
	  * ============
	  * Assigns a sequence number to a variable within a list.
	  *
	  * Explanatory notes
	  * ===================
	  * Variable position allows a list of variables to be ordered. */
	VariablePosition: VariablePosition;
	/** Definition
	  * ============
	  * Relationship between any variables in the variable cascade (conceptual, represented, instance), based on an ordered relation. */
	VariableRelationship: VariableRelationship;
	/** Definition
	  * ============
	  * Relation structure for use with any set of variables in the variable cascade (conceptual, represented, instance). */
	VariableStructure: VariableStructure;
	/** Definition
	  * ============
	  * Role given to a represented variable in the context of a data structure to record values of multiple variables.
	  *
	  * Examples
	  * ==========
	  * Consider two variables, i.e. income and age, with their values living together in different entries in the same column.  The values of those two variables are now in the value domain of a single variable (the one working as a variable value component).  Another column, based on a variable descriptor component, use codes for "income" and "age" to distinguish income values from age values.
	  *
	  * Explanatory notes
	  * ===================
	  * A variable value component captures the values of multiple variables that have been transposed into a single column.  The variable descriptor component provides a mechanism to identify which of those values correspond to which variable.   This structure provides a flexible mechanism avoiding the need for a formal pointer. */
	VariableValueComponent: VariableValueComponent;
	/** Definition
	  * ============
	  * A web site (normally a URL) with information on type of site, privacy flag, and effective dates. */
	WebLink: WebLink;
	/** Definition
	  * ============
	  * Organized collection of wide data. It is structured by a wide data structure.
	  *
	  * Examples
	  * ==========
	  * A unit dataset where each row corresponds to a set of data points capturing different characteristics of a unit. */
	WideDataSet: WideDataSet;
	/** Definition
	  * ==========
	  * Structure of a wide dataset (organized collection of wide data). It is described by identifier, measure and attribute components.
	  *
	  * Examples
	  * ==========
	  * The structure described by [Unit id, Income, Province] where Unit id identifies a statistical unit and Income and Province are two instance variables capturing characteristics. */
	WideDataStructure: WideDataStructure;
	/** Definition
	  * ==========
	  * Collection of data instances that uniquely identify a collection of data points in a wide dataset.
	  *
	  * Examples
	  * ==========
	  * Collection containing the single "1A2B3C" string in a wide dataset where rows are identified by postal code representations. */
	WideKey: WideKey;
	/** Definition
	  * ============
	  * Single data instance that is part of a wide key.
	  *
	  * Examples
	  * ==========
	  * The "1A2B3C" string in a wide dataset where rows are identified by postal code representations. */
	WideKeyMember: WideKeyMember;
	/** Definition
	  * ==========
	  * Information structured according to the DDI-CDI model for a specific purpose or purposes within a system or community. */
	Wrapper: Wrapper;
}
export var document: document;
