/*
 * XML Type:  AgentStructure
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentStructure
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML AgentStructure(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface AgentStructure extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentStructure> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "agentstructurebf0ctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "effectiveDates" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange getEffectiveDates();

    /**
     * True if has "effectiveDates" element
     */
    boolean isSetEffectiveDates();

    /**
     * Sets the "effectiveDates" element
     */
    void setEffectiveDates(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange effectiveDates);

    /**
     * Appends and returns a new empty "effectiveDates" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange addNewEffectiveDates();

    /**
     * Unsets the "effectiveDates" element
     */
    void unsetEffectiveDates();

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
     * Gets the "privacy" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getPrivacy();

    /**
     * True if has "privacy" element
     */
    boolean isSetPrivacy();

    /**
     * Sets the "privacy" element
     */
    void setPrivacy(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry privacy);

    /**
     * Appends and returns a new empty "privacy" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewPrivacy();

    /**
     * Unsets the "privacy" element
     */
    void unsetPrivacy();

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
     * Gets the "semantics" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getSemantics();

    /**
     * True if has "semantics" element
     */
    boolean isSetSemantics();

    /**
     * Sets the "semantics" element
     */
    void setSemantics(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry semantics);

    /**
     * Appends and returns a new empty "semantics" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewSemantics();

    /**
     * Unsets the "semantics" element
     */
    void unsetSemantics();

    /**
     * Gets the "specification" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.StructureSpecification getSpecification();

    /**
     * True if has "specification" element
     */
    boolean isSetSpecification();

    /**
     * Sets the "specification" element
     */
    void setSpecification(org.ddialliance.specification.ddiCDI.x10.xmlSchema.StructureSpecification specification);

    /**
     * Appends and returns a new empty "specification" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.StructureSpecification addNewSpecification();

    /**
     * Unsets the "specification" element
     */
    void unsetSpecification();

    /**
     * Gets the "topology" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getTopology();

    /**
     * True if has "topology" element
     */
    boolean isSetTopology();

    /**
     * Sets the "topology" element
     */
    void setTopology(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry topology);

    /**
     * Appends and returns a new empty "topology" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewTopology();

    /**
     * Unsets the "topology" element
     */
    void unsetTopology();

    /**
     * Gets the "totality" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.StructureExtent.Enum getTotality();

    /**
     * Gets (as xml) the "totality" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.StructureExtent xgetTotality();

    /**
     * True if has "totality" element
     */
    boolean isSetTotality();

    /**
     * Sets the "totality" element
     */
    void setTotality(org.ddialliance.specification.ddiCDI.x10.xmlSchema.StructureExtent.Enum totality);

    /**
     * Sets (as xml) the "totality" element
     */
    void xsetTotality(org.ddialliance.specification.ddiCDI.x10.xmlSchema.StructureExtent totality);

    /**
     * Unsets the "totality" element
     */
    void unsetTotality();

    /**
     * Gets the "AgentStructure_structures_AgentListing" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentStructure.AgentStructureStructuresAgentListing getAgentStructureStructuresAgentListing();

    /**
     * True if has "AgentStructure_structures_AgentListing" element
     */
    boolean isSetAgentStructureStructuresAgentListing();

    /**
     * Sets the "AgentStructure_structures_AgentListing" element
     */
    void setAgentStructureStructuresAgentListing(org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentStructure.AgentStructureStructuresAgentListing agentStructureStructuresAgentListing);

    /**
     * Appends and returns a new empty "AgentStructure_structures_AgentListing" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentStructure.AgentStructureStructuresAgentListing addNewAgentStructureStructuresAgentListing();

    /**
     * Unsets the "AgentStructure_structures_AgentListing" element
     */
    void unsetAgentStructureStructuresAgentListing();

    /**
     * Gets a List of "AgentStructure_has_AgentRelationship" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentStructure.AgentStructureHasAgentRelationship> getAgentStructureHasAgentRelationshipList();

    /**
     * Gets array of all "AgentStructure_has_AgentRelationship" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentStructure.AgentStructureHasAgentRelationship[] getAgentStructureHasAgentRelationshipArray();

    /**
     * Gets ith "AgentStructure_has_AgentRelationship" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentStructure.AgentStructureHasAgentRelationship getAgentStructureHasAgentRelationshipArray(int i);

    /**
     * Returns number of "AgentStructure_has_AgentRelationship" element
     */
    int sizeOfAgentStructureHasAgentRelationshipArray();

    /**
     * Sets array of all "AgentStructure_has_AgentRelationship" element
     */
    void setAgentStructureHasAgentRelationshipArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentStructure.AgentStructureHasAgentRelationship[] agentStructureHasAgentRelationshipArray);

    /**
     * Sets ith "AgentStructure_has_AgentRelationship" element
     */
    void setAgentStructureHasAgentRelationshipArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentStructure.AgentStructureHasAgentRelationship agentStructureHasAgentRelationship);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "AgentStructure_has_AgentRelationship" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentStructure.AgentStructureHasAgentRelationship insertNewAgentStructureHasAgentRelationship(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "AgentStructure_has_AgentRelationship" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentStructure.AgentStructureHasAgentRelationship addNewAgentStructureHasAgentRelationship();

    /**
     * Removes the ith "AgentStructure_has_AgentRelationship" element
     */
    void removeAgentStructureHasAgentRelationship(int i);

    /**
     * An XML AgentStructure_structures_AgentListing(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface AgentStructureStructuresAgentListing extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentStructure.AgentStructureStructuresAgentListing> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "agentstructurestructuresagentlisting6fe3elemtype");
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentStructure$AgentStructureStructuresAgentListing$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentStructure.AgentStructureStructuresAgentListing.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "validtype1225elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum AGENT_LISTING = Enum.forString("AgentListing");

            int INT_AGENT_LISTING = Enum.INT_AGENT_LISTING;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentStructure$AgentStructureStructuresAgentListing$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_AGENT_LISTING
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

                static final int INT_AGENT_LISTING = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("AgentListing", INT_AGENT_LISTING),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }

    /**
     * An XML AgentStructure_has_AgentRelationship(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface AgentStructureHasAgentRelationship extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentStructure.AgentStructureHasAgentRelationship> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "agentstructurehasagentrelationship6169elemtype");
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentStructure$AgentStructureHasAgentRelationship$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentStructure.AgentStructureHasAgentRelationship.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "validtypeac2belemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum AGENT_RELATIONSHIP = Enum.forString("AgentRelationship");

            int INT_AGENT_RELATIONSHIP = Enum.INT_AGENT_RELATIONSHIP;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentStructure$AgentStructureHasAgentRelationship$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_AGENT_RELATIONSHIP
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

                static final int INT_AGENT_RELATIONSHIP = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("AgentRelationship", INT_AGENT_RELATIONSHIP),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }
}
