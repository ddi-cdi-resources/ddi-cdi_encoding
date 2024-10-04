/*
 * XML Type:  CatalogDetails
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CatalogDetails(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface CatalogDetails extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "catalogdetails8887type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "access" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.AccessInformation> getAccessList();

    /**
     * Gets array of all "access" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AccessInformation[] getAccessArray();

    /**
     * Gets ith "access" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AccessInformation getAccessArray(int i);

    /**
     * Returns number of "access" element
     */
    int sizeOfAccessArray();

    /**
     * Sets array of all "access" element
     */
    void setAccessArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.AccessInformation[] accessArray);

    /**
     * Sets ith "access" element
     */
    void setAccessArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.AccessInformation access);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "access" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AccessInformation insertNewAccess(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "access" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AccessInformation addNewAccess();

    /**
     * Removes the ith "access" element
     */
    void removeAccess(int i);

    /**
     * Gets a List of "alternativeTitle" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString> getAlternativeTitleList();

    /**
     * Gets array of all "alternativeTitle" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString[] getAlternativeTitleArray();

    /**
     * Gets ith "alternativeTitle" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getAlternativeTitleArray(int i);

    /**
     * Returns number of "alternativeTitle" element
     */
    int sizeOfAlternativeTitleArray();

    /**
     * Sets array of all "alternativeTitle" element
     */
    void setAlternativeTitleArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString[] alternativeTitleArray);

    /**
     * Sets ith "alternativeTitle" element
     */
    void setAlternativeTitleArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString alternativeTitle);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "alternativeTitle" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString insertNewAlternativeTitle(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "alternativeTitle" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewAlternativeTitle();

    /**
     * Removes the ith "alternativeTitle" element
     */
    void removeAlternativeTitle(int i);

    /**
     * Gets a List of "contributor" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole> getContributorList();

    /**
     * Gets array of all "contributor" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole[] getContributorArray();

    /**
     * Gets ith "contributor" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole getContributorArray(int i);

    /**
     * Returns number of "contributor" element
     */
    int sizeOfContributorArray();

    /**
     * Sets array of all "contributor" element
     */
    void setContributorArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole[] contributorArray);

    /**
     * Sets ith "contributor" element
     */
    void setContributorArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole contributor);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "contributor" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole insertNewContributor(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "contributor" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole addNewContributor();

    /**
     * Removes the ith "contributor" element
     */
    void removeContributor(int i);

    /**
     * Gets a List of "creator" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole> getCreatorList();

    /**
     * Gets array of all "creator" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole[] getCreatorArray();

    /**
     * Gets ith "creator" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole getCreatorArray(int i);

    /**
     * Returns number of "creator" element
     */
    int sizeOfCreatorArray();

    /**
     * Sets array of all "creator" element
     */
    void setCreatorArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole[] creatorArray);

    /**
     * Sets ith "creator" element
     */
    void setCreatorArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole creator);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "creator" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole insertNewCreator(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "creator" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole addNewCreator();

    /**
     * Removes the ith "creator" element
     */
    void removeCreator(int i);

    /**
     * Gets a List of "date" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CombinedDate> getDateList();

    /**
     * Gets array of all "date" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CombinedDate[] getDateArray();

    /**
     * Gets ith "date" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CombinedDate getDateArray(int i);

    /**
     * Returns number of "date" element
     */
    int sizeOfDateArray();

    /**
     * Sets array of all "date" element
     */
    void setDateArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CombinedDate[] dateArray);

    /**
     * Sets ith "date" element
     */
    void setDateArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.CombinedDate date);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "date" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CombinedDate insertNewDate(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "date" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CombinedDate addNewDate();

    /**
     * Removes the ith "date" element
     */
    void removeDate(int i);

    /**
     * Gets the "identifier" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalIdentifier getIdentifier();

    /**
     * True if has "identifier" element
     */
    boolean isSetIdentifier();

    /**
     * Sets the "identifier" element
     */
    void setIdentifier(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalIdentifier identifier);

    /**
     * Appends and returns a new empty "identifier" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalIdentifier addNewIdentifier();

    /**
     * Unsets the "identifier" element
     */
    void unsetIdentifier();

    /**
     * Gets a List of "informationSource" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString> getInformationSourceList();

    /**
     * Gets array of all "informationSource" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString[] getInformationSourceArray();

    /**
     * Gets ith "informationSource" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getInformationSourceArray(int i);

    /**
     * Returns number of "informationSource" element
     */
    int sizeOfInformationSourceArray();

    /**
     * Sets array of all "informationSource" element
     */
    void setInformationSourceArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString[] informationSourceArray);

    /**
     * Sets ith "informationSource" element
     */
    void setInformationSourceArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString informationSource);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "informationSource" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString insertNewInformationSource(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "informationSource" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewInformationSource();

    /**
     * Removes the ith "informationSource" element
     */
    void removeInformationSource(int i);

    /**
     * Gets a List of "languageOfObject" elements
     */
    java.util.List<java.lang.String> getLanguageOfObjectList();

    /**
     * Gets array of all "languageOfObject" elements
     */
    java.lang.String[] getLanguageOfObjectArray();

    /**
     * Gets ith "languageOfObject" element
     */
    java.lang.String getLanguageOfObjectArray(int i);

    /**
     * Gets (as xml) a List of "languageOfObject" elements
     */
    java.util.List<org.apache.xmlbeans.XmlLanguage> xgetLanguageOfObjectList();

    /**
     * Gets (as xml) array of all "languageOfObject" elements
     */
    org.apache.xmlbeans.XmlLanguage[] xgetLanguageOfObjectArray();

    /**
     * Gets (as xml) ith "languageOfObject" element
     */
    org.apache.xmlbeans.XmlLanguage xgetLanguageOfObjectArray(int i);

    /**
     * Returns number of "languageOfObject" element
     */
    int sizeOfLanguageOfObjectArray();

    /**
     * Sets array of all "languageOfObject" element
     */
    void setLanguageOfObjectArray(java.lang.String[] languageOfObjectArray);

    /**
     * Sets ith "languageOfObject" element
     */
    void setLanguageOfObjectArray(int i, java.lang.String languageOfObject);

    /**
     * Sets (as xml) array of all "languageOfObject" element
     */
    void xsetLanguageOfObjectArray(org.apache.xmlbeans.XmlLanguage[] languageOfObjectArray);

    /**
     * Sets (as xml) ith "languageOfObject" element
     */
    void xsetLanguageOfObjectArray(int i, org.apache.xmlbeans.XmlLanguage languageOfObject);

    /**
     * Inserts the value as the ith "languageOfObject" element
     */
    void insertLanguageOfObject(int i, java.lang.String languageOfObject);

    /**
     * Appends the value as the last "languageOfObject" element
     */
    void addLanguageOfObject(java.lang.String languageOfObject);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "languageOfObject" element
     */
    org.apache.xmlbeans.XmlLanguage insertNewLanguageOfObject(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "languageOfObject" element
     */
    org.apache.xmlbeans.XmlLanguage addNewLanguageOfObject();

    /**
     * Removes the ith "languageOfObject" element
     */
    void removeLanguageOfObject(int i);

    /**
     * Gets the "provenance" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProvenanceInformation getProvenance();

    /**
     * True if has "provenance" element
     */
    boolean isSetProvenance();

    /**
     * Sets the "provenance" element
     */
    void setProvenance(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProvenanceInformation provenance);

    /**
     * Appends and returns a new empty "provenance" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProvenanceInformation addNewProvenance();

    /**
     * Unsets the "provenance" element
     */
    void unsetProvenance();

    /**
     * Gets a List of "publisher" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole> getPublisherList();

    /**
     * Gets array of all "publisher" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole[] getPublisherArray();

    /**
     * Gets ith "publisher" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole getPublisherArray(int i);

    /**
     * Returns number of "publisher" element
     */
    int sizeOfPublisherArray();

    /**
     * Sets array of all "publisher" element
     */
    void setPublisherArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole[] publisherArray);

    /**
     * Sets ith "publisher" element
     */
    void setPublisherArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole publisher);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "publisher" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole insertNewPublisher(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "publisher" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole addNewPublisher();

    /**
     * Removes the ith "publisher" element
     */
    void removePublisher(int i);

    /**
     * Gets a List of "relatedResource" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails.RelatedResource> getRelatedResourceList();

    /**
     * Gets array of all "relatedResource" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails.RelatedResource[] getRelatedResourceArray();

    /**
     * Gets ith "relatedResource" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails.RelatedResource getRelatedResourceArray(int i);

    /**
     * Returns number of "relatedResource" element
     */
    int sizeOfRelatedResourceArray();

    /**
     * Sets array of all "relatedResource" element
     */
    void setRelatedResourceArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails.RelatedResource[] relatedResourceArray);

    /**
     * Sets ith "relatedResource" element
     */
    void setRelatedResourceArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails.RelatedResource relatedResource);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "relatedResource" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails.RelatedResource insertNewRelatedResource(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "relatedResource" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails.RelatedResource addNewRelatedResource();

    /**
     * Removes the ith "relatedResource" element
     */
    void removeRelatedResource(int i);

    /**
     * Gets a List of "subTitle" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString> getSubTitleList();

    /**
     * Gets array of all "subTitle" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString[] getSubTitleArray();

    /**
     * Gets ith "subTitle" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getSubTitleArray(int i);

    /**
     * Returns number of "subTitle" element
     */
    int sizeOfSubTitleArray();

    /**
     * Sets array of all "subTitle" element
     */
    void setSubTitleArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString[] subTitleArray);

    /**
     * Sets ith "subTitle" element
     */
    void setSubTitleArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString subTitle);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "subTitle" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString insertNewSubTitle(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "subTitle" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewSubTitle();

    /**
     * Removes the ith "subTitle" element
     */
    void removeSubTitle(int i);

    /**
     * Gets the "summary" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getSummary();

    /**
     * True if has "summary" element
     */
    boolean isSetSummary();

    /**
     * Sets the "summary" element
     */
    void setSummary(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString summary);

    /**
     * Appends and returns a new empty "summary" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewSummary();

    /**
     * Unsets the "summary" element
     */
    void unsetSummary();

    /**
     * Gets the "title" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getTitle();

    /**
     * True if has "title" element
     */
    boolean isSetTitle();

    /**
     * Sets the "title" element
     */
    void setTitle(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString title);

    /**
     * Appends and returns a new empty "title" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewTitle();

    /**
     * Unsets the "title" element
     */
    void unsetTitle();

    /**
     * Gets a List of "typeOfResource" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry> getTypeOfResourceList();

    /**
     * Gets array of all "typeOfResource" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry[] getTypeOfResourceArray();

    /**
     * Gets ith "typeOfResource" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getTypeOfResourceArray(int i);

    /**
     * Returns number of "typeOfResource" element
     */
    int sizeOfTypeOfResourceArray();

    /**
     * Sets array of all "typeOfResource" element
     */
    void setTypeOfResourceArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry[] typeOfResourceArray);

    /**
     * Sets ith "typeOfResource" element
     */
    void setTypeOfResourceArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry typeOfResource);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "typeOfResource" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry insertNewTypeOfResource(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "typeOfResource" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewTypeOfResource();

    /**
     * Removes the ith "typeOfResource" element
     */
    void removeTypeOfResource(int i);

    /**
     * An XML relatedResource(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface RelatedResource extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails.RelatedResource> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "relatedresource5ae2elemtype");
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
