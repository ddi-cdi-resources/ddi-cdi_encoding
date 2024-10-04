/*
 * XML Type:  AgentInRole
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML AgentInRole(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface AgentInRole extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "agentinrole44cctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "agentName" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.BibliographicName getAgentName();

    /**
     * True if has "agentName" element
     */
    boolean isSetAgentName();

    /**
     * Sets the "agentName" element
     */
    void setAgentName(org.ddialliance.specification.ddiCDI.x10.xmlSchema.BibliographicName agentName);

    /**
     * Appends and returns a new empty "agentName" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.BibliographicName addNewAgentName();

    /**
     * Unsets the "agentName" element
     */
    void unsetAgentName();

    /**
     * Gets the "reference" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole.Reference getReference();

    /**
     * True if has "reference" element
     */
    boolean isSetReference();

    /**
     * Sets the "reference" element
     */
    void setReference(org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole.Reference reference);

    /**
     * Appends and returns a new empty "reference" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole.Reference addNewReference();

    /**
     * Unsets the "reference" element
     */
    void unsetReference();

    /**
     * Gets a List of "role" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PairedControlledVocabularyEntry> getRoleList();

    /**
     * Gets array of all "role" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PairedControlledVocabularyEntry[] getRoleArray();

    /**
     * Gets ith "role" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PairedControlledVocabularyEntry getRoleArray(int i);

    /**
     * Returns number of "role" element
     */
    int sizeOfRoleArray();

    /**
     * Sets array of all "role" element
     */
    void setRoleArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PairedControlledVocabularyEntry[] roleArray);

    /**
     * Sets ith "role" element
     */
    void setRoleArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.PairedControlledVocabularyEntry role);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "role" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PairedControlledVocabularyEntry insertNewRole(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "role" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PairedControlledVocabularyEntry addNewRole();

    /**
     * Removes the ith "role" element
     */
    void removeRole(int i);

    /**
     * An XML reference(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface Reference extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole.Reference> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "referencef5c3elemtype");
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
    }
}
