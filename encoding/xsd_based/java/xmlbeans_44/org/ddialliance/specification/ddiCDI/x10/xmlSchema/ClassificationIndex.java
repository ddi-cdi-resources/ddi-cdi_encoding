/*
 * XML Type:  ClassificationIndex
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ClassificationIndex(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface ClassificationIndex extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "classificationindexf9b8type");
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
     * Gets a List of "availableLanguage" elements
     */
    java.util.List<java.lang.String> getAvailableLanguageList();

    /**
     * Gets array of all "availableLanguage" elements
     */
    java.lang.String[] getAvailableLanguageArray();

    /**
     * Gets ith "availableLanguage" element
     */
    java.lang.String getAvailableLanguageArray(int i);

    /**
     * Gets (as xml) a List of "availableLanguage" elements
     */
    java.util.List<org.apache.xmlbeans.XmlLanguage> xgetAvailableLanguageList();

    /**
     * Gets (as xml) array of all "availableLanguage" elements
     */
    org.apache.xmlbeans.XmlLanguage[] xgetAvailableLanguageArray();

    /**
     * Gets (as xml) ith "availableLanguage" element
     */
    org.apache.xmlbeans.XmlLanguage xgetAvailableLanguageArray(int i);

    /**
     * Returns number of "availableLanguage" element
     */
    int sizeOfAvailableLanguageArray();

    /**
     * Sets array of all "availableLanguage" element
     */
    void setAvailableLanguageArray(java.lang.String[] availableLanguageArray);

    /**
     * Sets ith "availableLanguage" element
     */
    void setAvailableLanguageArray(int i, java.lang.String availableLanguage);

    /**
     * Sets (as xml) array of all "availableLanguage" element
     */
    void xsetAvailableLanguageArray(org.apache.xmlbeans.XmlLanguage[] availableLanguageArray);

    /**
     * Sets (as xml) ith "availableLanguage" element
     */
    void xsetAvailableLanguageArray(int i, org.apache.xmlbeans.XmlLanguage availableLanguage);

    /**
     * Inserts the value as the ith "availableLanguage" element
     */
    void insertAvailableLanguage(int i, java.lang.String availableLanguage);

    /**
     * Appends the value as the last "availableLanguage" element
     */
    void addAvailableLanguage(java.lang.String availableLanguage);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "availableLanguage" element
     */
    org.apache.xmlbeans.XmlLanguage insertNewAvailableLanguage(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "availableLanguage" element
     */
    org.apache.xmlbeans.XmlLanguage addNewAvailableLanguage();

    /**
     * Removes the ith "availableLanguage" element
     */
    void removeAvailableLanguage(int i);

    /**
     * Gets the "catalogDetails" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails getCatalogDetails();

    /**
     * True if has "catalogDetails" element
     */
    boolean isSetCatalogDetails();

    /**
     * Sets the "catalogDetails" element
     */
    void setCatalogDetails(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails catalogDetails);

    /**
     * Appends and returns a new empty "catalogDetails" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails addNewCatalogDetails();

    /**
     * Unsets the "catalogDetails" element
     */
    void unsetCatalogDetails();

    /**
     * Gets a List of "codingInstruction" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandCode> getCodingInstructionList();

    /**
     * Gets array of all "codingInstruction" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandCode[] getCodingInstructionArray();

    /**
     * Gets ith "codingInstruction" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandCode getCodingInstructionArray(int i);

    /**
     * Returns number of "codingInstruction" element
     */
    int sizeOfCodingInstructionArray();

    /**
     * Sets array of all "codingInstruction" element
     */
    void setCodingInstructionArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandCode[] codingInstructionArray);

    /**
     * Sets ith "codingInstruction" element
     */
    void setCodingInstructionArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandCode codingInstruction);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "codingInstruction" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandCode insertNewCodingInstruction(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "codingInstruction" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandCode addNewCodingInstruction();

    /**
     * Removes the ith "codingInstruction" element
     */
    void removeCodingInstruction(int i);

    /**
     * Gets a List of "corrections" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString> getCorrectionsList();

    /**
     * Gets array of all "corrections" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString[] getCorrectionsArray();

    /**
     * Gets ith "corrections" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getCorrectionsArray(int i);

    /**
     * Returns number of "corrections" element
     */
    int sizeOfCorrectionsArray();

    /**
     * Sets array of all "corrections" element
     */
    void setCorrectionsArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString[] correctionsArray);

    /**
     * Sets ith "corrections" element
     */
    void setCorrectionsArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString corrections);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "corrections" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString insertNewCorrections(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "corrections" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewCorrections();

    /**
     * Removes the ith "corrections" element
     */
    void removeCorrections(int i);

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
     * Gets the "releaseDate" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CombinedDate getReleaseDate();

    /**
     * True if has "releaseDate" element
     */
    boolean isSetReleaseDate();

    /**
     * Sets the "releaseDate" element
     */
    void setReleaseDate(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CombinedDate releaseDate);

    /**
     * Appends and returns a new empty "releaseDate" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CombinedDate addNewReleaseDate();

    /**
     * Unsets the "releaseDate" element
     */
    void unsetReleaseDate();

    /**
     * Gets the "ClassificationIndex_isMaintainedBy_Agent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexIsMaintainedByAgent getClassificationIndexIsMaintainedByAgent();

    /**
     * True if has "ClassificationIndex_isMaintainedBy_Agent" element
     */
    boolean isSetClassificationIndexIsMaintainedByAgent();

    /**
     * Sets the "ClassificationIndex_isMaintainedBy_Agent" element
     */
    void setClassificationIndexIsMaintainedByAgent(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexIsMaintainedByAgent classificationIndexIsMaintainedByAgent);

    /**
     * Appends and returns a new empty "ClassificationIndex_isMaintainedBy_Agent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexIsMaintainedByAgent addNewClassificationIndexIsMaintainedByAgent();

    /**
     * Unsets the "ClassificationIndex_isMaintainedBy_Agent" element
     */
    void unsetClassificationIndexIsMaintainedByAgent();

    /**
     * Gets a List of "ClassificationIndex_hasContact_Agent" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasContactAgent> getClassificationIndexHasContactAgentList();

    /**
     * Gets array of all "ClassificationIndex_hasContact_Agent" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasContactAgent[] getClassificationIndexHasContactAgentArray();

    /**
     * Gets ith "ClassificationIndex_hasContact_Agent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasContactAgent getClassificationIndexHasContactAgentArray(int i);

    /**
     * Returns number of "ClassificationIndex_hasContact_Agent" element
     */
    int sizeOfClassificationIndexHasContactAgentArray();

    /**
     * Sets array of all "ClassificationIndex_hasContact_Agent" element
     */
    void setClassificationIndexHasContactAgentArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasContactAgent[] classificationIndexHasContactAgentArray);

    /**
     * Sets ith "ClassificationIndex_hasContact_Agent" element
     */
    void setClassificationIndexHasContactAgentArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasContactAgent classificationIndexHasContactAgent);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ClassificationIndex_hasContact_Agent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasContactAgent insertNewClassificationIndexHasContactAgent(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ClassificationIndex_hasContact_Agent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasContactAgent addNewClassificationIndexHasContactAgent();

    /**
     * Removes the ith "ClassificationIndex_hasContact_Agent" element
     */
    void removeClassificationIndexHasContactAgent(int i);

    /**
     * Gets a List of "ClassificationIndex_isDefinedBy_Concept" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexIsDefinedByConcept> getClassificationIndexIsDefinedByConceptList();

    /**
     * Gets array of all "ClassificationIndex_isDefinedBy_Concept" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexIsDefinedByConcept[] getClassificationIndexIsDefinedByConceptArray();

    /**
     * Gets ith "ClassificationIndex_isDefinedBy_Concept" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexIsDefinedByConcept getClassificationIndexIsDefinedByConceptArray(int i);

    /**
     * Returns number of "ClassificationIndex_isDefinedBy_Concept" element
     */
    int sizeOfClassificationIndexIsDefinedByConceptArray();

    /**
     * Sets array of all "ClassificationIndex_isDefinedBy_Concept" element
     */
    void setClassificationIndexIsDefinedByConceptArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexIsDefinedByConcept[] classificationIndexIsDefinedByConceptArray);

    /**
     * Sets ith "ClassificationIndex_isDefinedBy_Concept" element
     */
    void setClassificationIndexIsDefinedByConceptArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexIsDefinedByConcept classificationIndexIsDefinedByConcept);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ClassificationIndex_isDefinedBy_Concept" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexIsDefinedByConcept insertNewClassificationIndexIsDefinedByConcept(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ClassificationIndex_isDefinedBy_Concept" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexIsDefinedByConcept addNewClassificationIndexIsDefinedByConcept();

    /**
     * Removes the ith "ClassificationIndex_isDefinedBy_Concept" element
     */
    void removeClassificationIndexIsDefinedByConcept(int i);

    /**
     * Gets a List of "ClassificationIndex_has_ClassificationIndexEntryPosition" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasClassificationIndexEntryPosition> getClassificationIndexHasClassificationIndexEntryPositionList();

    /**
     * Gets array of all "ClassificationIndex_has_ClassificationIndexEntryPosition" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasClassificationIndexEntryPosition[] getClassificationIndexHasClassificationIndexEntryPositionArray();

    /**
     * Gets ith "ClassificationIndex_has_ClassificationIndexEntryPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasClassificationIndexEntryPosition getClassificationIndexHasClassificationIndexEntryPositionArray(int i);

    /**
     * Returns number of "ClassificationIndex_has_ClassificationIndexEntryPosition" element
     */
    int sizeOfClassificationIndexHasClassificationIndexEntryPositionArray();

    /**
     * Sets array of all "ClassificationIndex_has_ClassificationIndexEntryPosition" element
     */
    void setClassificationIndexHasClassificationIndexEntryPositionArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasClassificationIndexEntryPosition[] classificationIndexHasClassificationIndexEntryPositionArray);

    /**
     * Sets ith "ClassificationIndex_has_ClassificationIndexEntryPosition" element
     */
    void setClassificationIndexHasClassificationIndexEntryPositionArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasClassificationIndexEntryPosition classificationIndexHasClassificationIndexEntryPosition);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ClassificationIndex_has_ClassificationIndexEntryPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasClassificationIndexEntryPosition insertNewClassificationIndexHasClassificationIndexEntryPosition(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ClassificationIndex_has_ClassificationIndexEntryPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasClassificationIndexEntryPosition addNewClassificationIndexHasClassificationIndexEntryPosition();

    /**
     * Removes the ith "ClassificationIndex_has_ClassificationIndexEntryPosition" element
     */
    void removeClassificationIndexHasClassificationIndexEntryPosition(int i);

    /**
     * Gets a List of "ClassificationIndex_has_ClassificationIndexEntry" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasClassificationIndexEntry> getClassificationIndexHasClassificationIndexEntryList();

    /**
     * Gets array of all "ClassificationIndex_has_ClassificationIndexEntry" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasClassificationIndexEntry[] getClassificationIndexHasClassificationIndexEntryArray();

    /**
     * Gets ith "ClassificationIndex_has_ClassificationIndexEntry" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasClassificationIndexEntry getClassificationIndexHasClassificationIndexEntryArray(int i);

    /**
     * Returns number of "ClassificationIndex_has_ClassificationIndexEntry" element
     */
    int sizeOfClassificationIndexHasClassificationIndexEntryArray();

    /**
     * Sets array of all "ClassificationIndex_has_ClassificationIndexEntry" element
     */
    void setClassificationIndexHasClassificationIndexEntryArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasClassificationIndexEntry[] classificationIndexHasClassificationIndexEntryArray);

    /**
     * Sets ith "ClassificationIndex_has_ClassificationIndexEntry" element
     */
    void setClassificationIndexHasClassificationIndexEntryArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasClassificationIndexEntry classificationIndexHasClassificationIndexEntry);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ClassificationIndex_has_ClassificationIndexEntry" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasClassificationIndexEntry insertNewClassificationIndexHasClassificationIndexEntry(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "ClassificationIndex_has_ClassificationIndexEntry" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasClassificationIndexEntry addNewClassificationIndexHasClassificationIndexEntry();

    /**
     * Removes the ith "ClassificationIndex_has_ClassificationIndexEntry" element
     */
    void removeClassificationIndexHasClassificationIndexEntry(int i);

    /**
     * An XML ClassificationIndex_isMaintainedBy_Agent(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface ClassificationIndexIsMaintainedByAgent extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexIsMaintainedByAgent> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "classificationindexismaintainedbyagentb998elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex$ClassificationIndexIsMaintainedByAgent$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexIsMaintainedByAgent.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "validtype6916elemtype");
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
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex$ClassificationIndexIsMaintainedByAgent$ValidType.
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
     * An XML ClassificationIndex_hasContact_Agent(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface ClassificationIndexHasContactAgent extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasContactAgent> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "classificationindexhascontactagent9293elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex$ClassificationIndexHasContactAgent$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasContactAgent.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "validtypeb111elemtype");
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
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex$ClassificationIndexHasContactAgent$ValidType.
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
     * An XML ClassificationIndex_isDefinedBy_Concept(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface ClassificationIndexIsDefinedByConcept extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexIsDefinedByConcept> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "classificationindexisdefinedbyconcept6910elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex$ClassificationIndexIsDefinedByConcept$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexIsDefinedByConcept.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "validtyped1d2elemtype");
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
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex$ClassificationIndexIsDefinedByConcept$ValidType.
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
     * An XML ClassificationIndex_has_ClassificationIndexEntryPosition(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface ClassificationIndexHasClassificationIndexEntryPosition extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasClassificationIndexEntryPosition> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "classificationindexhasclassificationindexentryposition6f3belemtype");
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex$ClassificationIndexHasClassificationIndexEntryPosition$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasClassificationIndexEntryPosition.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "validtype62b9elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum CLASSIFICATION_INDEX_ENTRY_POSITION = Enum.forString("ClassificationIndexEntryPosition");

            int INT_CLASSIFICATION_INDEX_ENTRY_POSITION = Enum.INT_CLASSIFICATION_INDEX_ENTRY_POSITION;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex$ClassificationIndexHasClassificationIndexEntryPosition$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_CLASSIFICATION_INDEX_ENTRY_POSITION
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

                static final int INT_CLASSIFICATION_INDEX_ENTRY_POSITION = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("ClassificationIndexEntryPosition", INT_CLASSIFICATION_INDEX_ENTRY_POSITION),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }

    /**
     * An XML ClassificationIndex_has_ClassificationIndexEntry(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface ClassificationIndexHasClassificationIndexEntry extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasClassificationIndexEntry> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "classificationindexhasclassificationindexentry7032elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex$ClassificationIndexHasClassificationIndexEntry$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasClassificationIndexEntry.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "validtypec1b0elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum CLASSIFICATION_INDEX_ENTRY = Enum.forString("ClassificationIndexEntry");

            int INT_CLASSIFICATION_INDEX_ENTRY = Enum.INT_CLASSIFICATION_INDEX_ENTRY;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex$ClassificationIndexHasClassificationIndexEntry$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_CLASSIFICATION_INDEX_ENTRY
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

                static final int INT_CLASSIFICATION_INDEX_ENTRY = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("ClassificationIndexEntry", INT_CLASSIFICATION_INDEX_ENTRY),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }
}
