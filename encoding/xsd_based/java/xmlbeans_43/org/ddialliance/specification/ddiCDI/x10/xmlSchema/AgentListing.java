/*
 * XML Type:  AgentListing
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML AgentListing(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface AgentListing extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "agentlisting759dtype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "allowsDuplicates" element
     */
    boolean getAllowsDuplicates();

    /**
     * Gets (as xml) the "allowsDuplicates" element
     */
    org.apache.xmlbeans.XmlBoolean xgetAllowsDuplicates();

    /**
     * Sets the "allowsDuplicates" element
     */
    void setAllowsDuplicates(boolean allowsDuplicates);

    /**
     * Sets (as xml) the "allowsDuplicates" element
     */
    void xsetAllowsDuplicates(org.apache.xmlbeans.XmlBoolean allowsDuplicates);

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
     * Gets the "purpose" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getPurpose();

    /**
     * True if has "purpose" element
     */
    boolean isSetPurpose();

    /**
     * Sets the "purpose" element
     */
    void setPurpose(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString purpose);

    /**
     * Appends and returns a new empty "purpose" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewPurpose();

    /**
     * Unsets the "purpose" element
     */
    void unsetPurpose();

    /**
     * Gets a List of "AgentListing_isDefinedBy_Concept" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing.AgentListingIsDefinedByConcept> getAgentListingIsDefinedByConceptList();

    /**
     * Gets array of all "AgentListing_isDefinedBy_Concept" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing.AgentListingIsDefinedByConcept[] getAgentListingIsDefinedByConceptArray();

    /**
     * Gets ith "AgentListing_isDefinedBy_Concept" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing.AgentListingIsDefinedByConcept getAgentListingIsDefinedByConceptArray(int i);

    /**
     * Returns number of "AgentListing_isDefinedBy_Concept" element
     */
    int sizeOfAgentListingIsDefinedByConceptArray();

    /**
     * Sets array of all "AgentListing_isDefinedBy_Concept" element
     */
    void setAgentListingIsDefinedByConceptArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing.AgentListingIsDefinedByConcept[] agentListingIsDefinedByConceptArray);

    /**
     * Sets ith "AgentListing_isDefinedBy_Concept" element
     */
    void setAgentListingIsDefinedByConceptArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing.AgentListingIsDefinedByConcept agentListingIsDefinedByConcept);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "AgentListing_isDefinedBy_Concept" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing.AgentListingIsDefinedByConcept insertNewAgentListingIsDefinedByConcept(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "AgentListing_isDefinedBy_Concept" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing.AgentListingIsDefinedByConcept addNewAgentListingIsDefinedByConcept();

    /**
     * Removes the ith "AgentListing_isDefinedBy_Concept" element
     */
    void removeAgentListingIsDefinedByConcept(int i);

    /**
     * Gets the "AgentListing_isMaintainedBy_Agent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing.AgentListingIsMaintainedByAgent getAgentListingIsMaintainedByAgent();

    /**
     * True if has "AgentListing_isMaintainedBy_Agent" element
     */
    boolean isSetAgentListingIsMaintainedByAgent();

    /**
     * Sets the "AgentListing_isMaintainedBy_Agent" element
     */
    void setAgentListingIsMaintainedByAgent(org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing.AgentListingIsMaintainedByAgent agentListingIsMaintainedByAgent);

    /**
     * Appends and returns a new empty "AgentListing_isMaintainedBy_Agent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing.AgentListingIsMaintainedByAgent addNewAgentListingIsMaintainedByAgent();

    /**
     * Unsets the "AgentListing_isMaintainedBy_Agent" element
     */
    void unsetAgentListingIsMaintainedByAgent();

    /**
     * Gets a List of "AgentListing_has_AgentPosition" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing.AgentListingHasAgentPosition> getAgentListingHasAgentPositionList();

    /**
     * Gets array of all "AgentListing_has_AgentPosition" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing.AgentListingHasAgentPosition[] getAgentListingHasAgentPositionArray();

    /**
     * Gets ith "AgentListing_has_AgentPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing.AgentListingHasAgentPosition getAgentListingHasAgentPositionArray(int i);

    /**
     * Returns number of "AgentListing_has_AgentPosition" element
     */
    int sizeOfAgentListingHasAgentPositionArray();

    /**
     * Sets array of all "AgentListing_has_AgentPosition" element
     */
    void setAgentListingHasAgentPositionArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing.AgentListingHasAgentPosition[] agentListingHasAgentPositionArray);

    /**
     * Sets ith "AgentListing_has_AgentPosition" element
     */
    void setAgentListingHasAgentPositionArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing.AgentListingHasAgentPosition agentListingHasAgentPosition);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "AgentListing_has_AgentPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing.AgentListingHasAgentPosition insertNewAgentListingHasAgentPosition(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "AgentListing_has_AgentPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing.AgentListingHasAgentPosition addNewAgentListingHasAgentPosition();

    /**
     * Removes the ith "AgentListing_has_AgentPosition" element
     */
    void removeAgentListingHasAgentPosition(int i);

    /**
     * Gets a List of "AgentListing_has_Agent" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing.AgentListingHasAgent> getAgentListingHasAgentList();

    /**
     * Gets array of all "AgentListing_has_Agent" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing.AgentListingHasAgent[] getAgentListingHasAgentArray();

    /**
     * Gets ith "AgentListing_has_Agent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing.AgentListingHasAgent getAgentListingHasAgentArray(int i);

    /**
     * Returns number of "AgentListing_has_Agent" element
     */
    int sizeOfAgentListingHasAgentArray();

    /**
     * Sets array of all "AgentListing_has_Agent" element
     */
    void setAgentListingHasAgentArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing.AgentListingHasAgent[] agentListingHasAgentArray);

    /**
     * Sets ith "AgentListing_has_Agent" element
     */
    void setAgentListingHasAgentArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing.AgentListingHasAgent agentListingHasAgent);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "AgentListing_has_Agent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing.AgentListingHasAgent insertNewAgentListingHasAgent(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "AgentListing_has_Agent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing.AgentListingHasAgent addNewAgentListingHasAgent();

    /**
     * Removes the ith "AgentListing_has_Agent" element
     */
    void removeAgentListingHasAgent(int i);

    /**
     * An XML AgentListing_isDefinedBy_Concept(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface AgentListingIsDefinedByConcept extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing.AgentListingIsDefinedByConcept> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "agentlistingisdefinedbyconceptc142elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing$AgentListingIsDefinedByConcept$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing.AgentListingIsDefinedByConcept.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "validtypec584elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum CATEGORY = Enum.forString("Category");
            Enum CONCEPT = Enum.forString("Concept");
            Enum CONCEPTUAL_VALUE = Enum.forString("ConceptualValue");
            Enum CONCEPTUAL_VARIABLE = Enum.forString("ConceptualVariable");
            Enum DESCRIPTOR_VARIABLE = Enum.forString("DescriptorVariable");
            Enum DIMENSIONAL_KEY_DEFINITION_MEMBER = Enum.forString("DimensionalKeyDefinitionMember");
            Enum INSTANCE_VARIABLE = Enum.forString("InstanceVariable");
            Enum KEY_DEFINITION_MEMBER = Enum.forString("KeyDefinitionMember");
            Enum POPULATION = Enum.forString("Population");
            Enum REFERENCE_VARIABLE = Enum.forString("ReferenceVariable");
            Enum REPRESENTED_VARIABLE = Enum.forString("RepresentedVariable");
            Enum UNIT_TYPE = Enum.forString("UnitType");
            Enum UNIVERSE = Enum.forString("Universe");

            int INT_CATEGORY = Enum.INT_CATEGORY;
            int INT_CONCEPT = Enum.INT_CONCEPT;
            int INT_CONCEPTUAL_VALUE = Enum.INT_CONCEPTUAL_VALUE;
            int INT_CONCEPTUAL_VARIABLE = Enum.INT_CONCEPTUAL_VARIABLE;
            int INT_DESCRIPTOR_VARIABLE = Enum.INT_DESCRIPTOR_VARIABLE;
            int INT_DIMENSIONAL_KEY_DEFINITION_MEMBER = Enum.INT_DIMENSIONAL_KEY_DEFINITION_MEMBER;
            int INT_INSTANCE_VARIABLE = Enum.INT_INSTANCE_VARIABLE;
            int INT_KEY_DEFINITION_MEMBER = Enum.INT_KEY_DEFINITION_MEMBER;
            int INT_POPULATION = Enum.INT_POPULATION;
            int INT_REFERENCE_VARIABLE = Enum.INT_REFERENCE_VARIABLE;
            int INT_REPRESENTED_VARIABLE = Enum.INT_REPRESENTED_VARIABLE;
            int INT_UNIT_TYPE = Enum.INT_UNIT_TYPE;
            int INT_UNIVERSE = Enum.INT_UNIVERSE;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing$AgentListingIsDefinedByConcept$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_CATEGORY
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

                static final int INT_CATEGORY = 1;
                static final int INT_CONCEPT = 2;
                static final int INT_CONCEPTUAL_VALUE = 3;
                static final int INT_CONCEPTUAL_VARIABLE = 4;
                static final int INT_DESCRIPTOR_VARIABLE = 5;
                static final int INT_DIMENSIONAL_KEY_DEFINITION_MEMBER = 6;
                static final int INT_INSTANCE_VARIABLE = 7;
                static final int INT_KEY_DEFINITION_MEMBER = 8;
                static final int INT_POPULATION = 9;
                static final int INT_REFERENCE_VARIABLE = 10;
                static final int INT_REPRESENTED_VARIABLE = 11;
                static final int INT_UNIT_TYPE = 12;
                static final int INT_UNIVERSE = 13;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("Category", INT_CATEGORY),
                    new Enum("Concept", INT_CONCEPT),
                    new Enum("ConceptualValue", INT_CONCEPTUAL_VALUE),
                    new Enum("ConceptualVariable", INT_CONCEPTUAL_VARIABLE),
                    new Enum("DescriptorVariable", INT_DESCRIPTOR_VARIABLE),
                    new Enum("DimensionalKeyDefinitionMember", INT_DIMENSIONAL_KEY_DEFINITION_MEMBER),
                    new Enum("InstanceVariable", INT_INSTANCE_VARIABLE),
                    new Enum("KeyDefinitionMember", INT_KEY_DEFINITION_MEMBER),
                    new Enum("Population", INT_POPULATION),
                    new Enum("ReferenceVariable", INT_REFERENCE_VARIABLE),
                    new Enum("RepresentedVariable", INT_REPRESENTED_VARIABLE),
                    new Enum("UnitType", INT_UNIT_TYPE),
                    new Enum("Universe", INT_UNIVERSE),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }

    /**
     * An XML AgentListing_isMaintainedBy_Agent(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface AgentListingIsMaintainedByAgent extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing.AgentListingIsMaintainedByAgent> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "agentlistingismaintainedbyagent2960elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing$AgentListingIsMaintainedByAgent$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing.AgentListingIsMaintainedByAgent.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "validtypead5eelemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum AGENT = Enum.forString("Agent");
            Enum CURATOR = Enum.forString("Curator");
            Enum INDIVIDUAL = Enum.forString("Individual");
            Enum MACHINE = Enum.forString("Machine");
            Enum ORGANIZATION = Enum.forString("Organization");
            Enum PROCESSING_AGENT = Enum.forString("ProcessingAgent");
            Enum SERVICE = Enum.forString("Service");

            int INT_AGENT = Enum.INT_AGENT;
            int INT_CURATOR = Enum.INT_CURATOR;
            int INT_INDIVIDUAL = Enum.INT_INDIVIDUAL;
            int INT_MACHINE = Enum.INT_MACHINE;
            int INT_ORGANIZATION = Enum.INT_ORGANIZATION;
            int INT_PROCESSING_AGENT = Enum.INT_PROCESSING_AGENT;
            int INT_SERVICE = Enum.INT_SERVICE;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing$AgentListingIsMaintainedByAgent$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_AGENT
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

                static final int INT_AGENT = 1;
                static final int INT_CURATOR = 2;
                static final int INT_INDIVIDUAL = 3;
                static final int INT_MACHINE = 4;
                static final int INT_ORGANIZATION = 5;
                static final int INT_PROCESSING_AGENT = 6;
                static final int INT_SERVICE = 7;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("Agent", INT_AGENT),
                    new Enum("Curator", INT_CURATOR),
                    new Enum("Individual", INT_INDIVIDUAL),
                    new Enum("Machine", INT_MACHINE),
                    new Enum("Organization", INT_ORGANIZATION),
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
     * An XML AgentListing_has_AgentPosition(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface AgentListingHasAgentPosition extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing.AgentListingHasAgentPosition> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "agentlistinghasagentpositionfbf8elemtype");
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing$AgentListingHasAgentPosition$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing.AgentListingHasAgentPosition.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "validtype28baelemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum AGENT_POSITION = Enum.forString("AgentPosition");

            int INT_AGENT_POSITION = Enum.INT_AGENT_POSITION;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing$AgentListingHasAgentPosition$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_AGENT_POSITION
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

                static final int INT_AGENT_POSITION = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("AgentPosition", INT_AGENT_POSITION),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }

    /**
     * An XML AgentListing_has_Agent(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface AgentListingHasAgent extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing.AgentListingHasAgent> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "agentlistinghasagent70e1elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing$AgentListingHasAgent$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing.AgentListingHasAgent.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "validtype7fa3elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum AGENT = Enum.forString("Agent");
            Enum CURATOR = Enum.forString("Curator");
            Enum INDIVIDUAL = Enum.forString("Individual");
            Enum MACHINE = Enum.forString("Machine");
            Enum ORGANIZATION = Enum.forString("Organization");
            Enum PROCESSING_AGENT = Enum.forString("ProcessingAgent");
            Enum SERVICE = Enum.forString("Service");

            int INT_AGENT = Enum.INT_AGENT;
            int INT_CURATOR = Enum.INT_CURATOR;
            int INT_INDIVIDUAL = Enum.INT_INDIVIDUAL;
            int INT_MACHINE = Enum.INT_MACHINE;
            int INT_ORGANIZATION = Enum.INT_ORGANIZATION;
            int INT_PROCESSING_AGENT = Enum.INT_PROCESSING_AGENT;
            int INT_SERVICE = Enum.INT_SERVICE;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentListing$AgentListingHasAgent$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_AGENT
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

                static final int INT_AGENT = 1;
                static final int INT_CURATOR = 2;
                static final int INT_INDIVIDUAL = 3;
                static final int INT_MACHINE = 4;
                static final int INT_ORGANIZATION = 5;
                static final int INT_PROCESSING_AGENT = 6;
                static final int INT_SERVICE = 7;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("Agent", INT_AGENT),
                    new Enum("Curator", INT_CURATOR),
                    new Enum("Individual", INT_INDIVIDUAL),
                    new Enum("Machine", INT_MACHINE),
                    new Enum("Organization", INT_ORGANIZATION),
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
}
