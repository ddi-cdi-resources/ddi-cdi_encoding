/*
 * XML Type:  StatisticalClassification
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML StatisticalClassification(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface StatisticalClassification extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "statisticalclassificationd0adtype");
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
     * Gets the "changeFromBase" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getChangeFromBase();

    /**
     * True if has "changeFromBase" element
     */
    boolean isSetChangeFromBase();

    /**
     * Sets the "changeFromBase" element
     */
    void setChangeFromBase(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString changeFromBase);

    /**
     * Appends and returns a new empty "changeFromBase" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewChangeFromBase();

    /**
     * Unsets the "changeFromBase" element
     */
    void unsetChangeFromBase();

    /**
     * Gets a List of "copyright" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString> getCopyrightList();

    /**
     * Gets array of all "copyright" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString[] getCopyrightArray();

    /**
     * Gets ith "copyright" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getCopyrightArray(int i);

    /**
     * Returns number of "copyright" element
     */
    int sizeOfCopyrightArray();

    /**
     * Sets array of all "copyright" element
     */
    void setCopyrightArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString[] copyrightArray);

    /**
     * Sets ith "copyright" element
     */
    void setCopyrightArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString copyright);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "copyright" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString insertNewCopyright(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "copyright" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewCopyright();

    /**
     * Removes the ith "copyright" element
     */
    void removeCopyright(int i);

    /**
     * Gets a List of "displayLabel" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay> getDisplayLabelList();

    /**
     * Gets array of all "displayLabel" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay[] getDisplayLabelArray();

    /**
     * Gets ith "displayLabel" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay getDisplayLabelArray(int i);

    /**
     * Returns number of "displayLabel" element
     */
    int sizeOfDisplayLabelArray();

    /**
     * Sets array of all "displayLabel" element
     */
    void setDisplayLabelArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay[] displayLabelArray);

    /**
     * Sets ith "displayLabel" element
     */
    void setDisplayLabelArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay displayLabel);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "displayLabel" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay insertNewDisplayLabel(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "displayLabel" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay addNewDisplayLabel();

    /**
     * Removes the ith "displayLabel" element
     */
    void removeDisplayLabel(int i);

    /**
     * Gets the "isCurrent" element
     */
    boolean getIsCurrent();

    /**
     * Gets (as xml) the "isCurrent" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsCurrent();

    /**
     * True if has "isCurrent" element
     */
    boolean isSetIsCurrent();

    /**
     * Sets the "isCurrent" element
     */
    void setIsCurrent(boolean isCurrent);

    /**
     * Sets (as xml) the "isCurrent" element
     */
    void xsetIsCurrent(org.apache.xmlbeans.XmlBoolean isCurrent);

    /**
     * Unsets the "isCurrent" element
     */
    void unsetIsCurrent();

    /**
     * Gets the "isFloating" element
     */
    boolean getIsFloating();

    /**
     * Gets (as xml) the "isFloating" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsFloating();

    /**
     * True if has "isFloating" element
     */
    boolean isSetIsFloating();

    /**
     * Sets the "isFloating" element
     */
    void setIsFloating(boolean isFloating);

    /**
     * Sets (as xml) the "isFloating" element
     */
    void xsetIsFloating(org.apache.xmlbeans.XmlBoolean isFloating);

    /**
     * Unsets the "isFloating" element
     */
    void unsetIsFloating();

    /**
     * Gets the "purposeOfVariant" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getPurposeOfVariant();

    /**
     * True if has "purposeOfVariant" element
     */
    boolean isSetPurposeOfVariant();

    /**
     * Sets the "purposeOfVariant" element
     */
    void setPurposeOfVariant(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString purposeOfVariant);

    /**
     * Appends and returns a new empty "purposeOfVariant" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewPurposeOfVariant();

    /**
     * Unsets the "purposeOfVariant" element
     */
    void unsetPurposeOfVariant();

    /**
     * Gets the "rationale" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getRationale();

    /**
     * True if has "rationale" element
     */
    boolean isSetRationale();

    /**
     * Sets the "rationale" element
     */
    void setRationale(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString rationale);

    /**
     * Appends and returns a new empty "rationale" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewRationale();

    /**
     * Unsets the "rationale" element
     */
    void unsetRationale();

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
     * Gets a List of "updateChanges" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString> getUpdateChangesList();

    /**
     * Gets array of all "updateChanges" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString[] getUpdateChangesArray();

    /**
     * Gets ith "updateChanges" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getUpdateChangesArray(int i);

    /**
     * Returns number of "updateChanges" element
     */
    int sizeOfUpdateChangesArray();

    /**
     * Sets array of all "updateChanges" element
     */
    void setUpdateChangesArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString[] updateChangesArray);

    /**
     * Sets ith "updateChanges" element
     */
    void setUpdateChangesArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString updateChanges);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "updateChanges" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString insertNewUpdateChanges(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "updateChanges" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewUpdateChanges();

    /**
     * Removes the ith "updateChanges" element
     */
    void removeUpdateChanges(int i);

    /**
     * Gets the "usage" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getUsage();

    /**
     * True if has "usage" element
     */
    boolean isSetUsage();

    /**
     * Sets the "usage" element
     */
    void setUsage(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString usage);

    /**
     * Appends and returns a new empty "usage" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewUsage();

    /**
     * Unsets the "usage" element
     */
    void unsetUsage();

    /**
     * Gets the "validDates" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange getValidDates();

    /**
     * True if has "validDates" element
     */
    boolean isSetValidDates();

    /**
     * Sets the "validDates" element
     */
    void setValidDates(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange validDates);

    /**
     * Appends and returns a new empty "validDates" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange addNewValidDates();

    /**
     * Unsets the "validDates" element
     */
    void unsetValidDates();

    /**
     * Gets a List of "StatisticalClassification_isMaintainedBy_Organization" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsMaintainedByOrganization> getStatisticalClassificationIsMaintainedByOrganizationList();

    /**
     * Gets array of all "StatisticalClassification_isMaintainedBy_Organization" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsMaintainedByOrganization[] getStatisticalClassificationIsMaintainedByOrganizationArray();

    /**
     * Gets ith "StatisticalClassification_isMaintainedBy_Organization" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsMaintainedByOrganization getStatisticalClassificationIsMaintainedByOrganizationArray(int i);

    /**
     * Returns number of "StatisticalClassification_isMaintainedBy_Organization" element
     */
    int sizeOfStatisticalClassificationIsMaintainedByOrganizationArray();

    /**
     * Sets array of all "StatisticalClassification_isMaintainedBy_Organization" element
     */
    void setStatisticalClassificationIsMaintainedByOrganizationArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsMaintainedByOrganization[] statisticalClassificationIsMaintainedByOrganizationArray);

    /**
     * Sets ith "StatisticalClassification_isMaintainedBy_Organization" element
     */
    void setStatisticalClassificationIsMaintainedByOrganizationArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsMaintainedByOrganization statisticalClassificationIsMaintainedByOrganization);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "StatisticalClassification_isMaintainedBy_Organization" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsMaintainedByOrganization insertNewStatisticalClassificationIsMaintainedByOrganization(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "StatisticalClassification_isMaintainedBy_Organization" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsMaintainedByOrganization addNewStatisticalClassificationIsMaintainedByOrganization();

    /**
     * Removes the ith "StatisticalClassification_isMaintainedBy_Organization" element
     */
    void removeStatisticalClassificationIsMaintainedByOrganization(int i);

    /**
     * Gets a List of "StatisticalClassification_isIndexedBy_ClassificationIndex" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsIndexedByClassificationIndex> getStatisticalClassificationIsIndexedByClassificationIndexList();

    /**
     * Gets array of all "StatisticalClassification_isIndexedBy_ClassificationIndex" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsIndexedByClassificationIndex[] getStatisticalClassificationIsIndexedByClassificationIndexArray();

    /**
     * Gets ith "StatisticalClassification_isIndexedBy_ClassificationIndex" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsIndexedByClassificationIndex getStatisticalClassificationIsIndexedByClassificationIndexArray(int i);

    /**
     * Returns number of "StatisticalClassification_isIndexedBy_ClassificationIndex" element
     */
    int sizeOfStatisticalClassificationIsIndexedByClassificationIndexArray();

    /**
     * Sets array of all "StatisticalClassification_isIndexedBy_ClassificationIndex" element
     */
    void setStatisticalClassificationIsIndexedByClassificationIndexArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsIndexedByClassificationIndex[] statisticalClassificationIsIndexedByClassificationIndexArray);

    /**
     * Sets ith "StatisticalClassification_isIndexedBy_ClassificationIndex" element
     */
    void setStatisticalClassificationIsIndexedByClassificationIndexArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsIndexedByClassificationIndex statisticalClassificationIsIndexedByClassificationIndex);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "StatisticalClassification_isIndexedBy_ClassificationIndex" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsIndexedByClassificationIndex insertNewStatisticalClassificationIsIndexedByClassificationIndex(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "StatisticalClassification_isIndexedBy_ClassificationIndex" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsIndexedByClassificationIndex addNewStatisticalClassificationIsIndexedByClassificationIndex();

    /**
     * Removes the ith "StatisticalClassification_isIndexedBy_ClassificationIndex" element
     */
    void removeStatisticalClassificationIsIndexedByClassificationIndex(int i);

    /**
     * Gets the "StatisticalClassification_isVariantOf_StatisticalClassification" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsVariantOfStatisticalClassification getStatisticalClassificationIsVariantOfStatisticalClassification();

    /**
     * True if has "StatisticalClassification_isVariantOf_StatisticalClassification" element
     */
    boolean isSetStatisticalClassificationIsVariantOfStatisticalClassification();

    /**
     * Sets the "StatisticalClassification_isVariantOf_StatisticalClassification" element
     */
    void setStatisticalClassificationIsVariantOfStatisticalClassification(org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsVariantOfStatisticalClassification statisticalClassificationIsVariantOfStatisticalClassification);

    /**
     * Appends and returns a new empty "StatisticalClassification_isVariantOf_StatisticalClassification" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsVariantOfStatisticalClassification addNewStatisticalClassificationIsVariantOfStatisticalClassification();

    /**
     * Unsets the "StatisticalClassification_isVariantOf_StatisticalClassification" element
     */
    void unsetStatisticalClassificationIsVariantOfStatisticalClassification();

    /**
     * Gets a List of "StatisticalClassification_isSuccessorOf_StatisticalClassification" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsSuccessorOfStatisticalClassification> getStatisticalClassificationIsSuccessorOfStatisticalClassificationList();

    /**
     * Gets array of all "StatisticalClassification_isSuccessorOf_StatisticalClassification" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsSuccessorOfStatisticalClassification[] getStatisticalClassificationIsSuccessorOfStatisticalClassificationArray();

    /**
     * Gets ith "StatisticalClassification_isSuccessorOf_StatisticalClassification" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsSuccessorOfStatisticalClassification getStatisticalClassificationIsSuccessorOfStatisticalClassificationArray(int i);

    /**
     * Returns number of "StatisticalClassification_isSuccessorOf_StatisticalClassification" element
     */
    int sizeOfStatisticalClassificationIsSuccessorOfStatisticalClassificationArray();

    /**
     * Sets array of all "StatisticalClassification_isSuccessorOf_StatisticalClassification" element
     */
    void setStatisticalClassificationIsSuccessorOfStatisticalClassificationArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsSuccessorOfStatisticalClassification[] statisticalClassificationIsSuccessorOfStatisticalClassificationArray);

    /**
     * Sets ith "StatisticalClassification_isSuccessorOf_StatisticalClassification" element
     */
    void setStatisticalClassificationIsSuccessorOfStatisticalClassificationArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsSuccessorOfStatisticalClassification statisticalClassificationIsSuccessorOfStatisticalClassification);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "StatisticalClassification_isSuccessorOf_StatisticalClassification" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsSuccessorOfStatisticalClassification insertNewStatisticalClassificationIsSuccessorOfStatisticalClassification(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "StatisticalClassification_isSuccessorOf_StatisticalClassification" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsSuccessorOfStatisticalClassification addNewStatisticalClassificationIsSuccessorOfStatisticalClassification();

    /**
     * Removes the ith "StatisticalClassification_isSuccessorOf_StatisticalClassification" element
     */
    void removeStatisticalClassificationIsSuccessorOfStatisticalClassification(int i);

    /**
     * Gets a List of "StatisticalClassification_isPredecessorOf_StatisticalClassification" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsPredecessorOfStatisticalClassification> getStatisticalClassificationIsPredecessorOfStatisticalClassificationList();

    /**
     * Gets array of all "StatisticalClassification_isPredecessorOf_StatisticalClassification" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsPredecessorOfStatisticalClassification[] getStatisticalClassificationIsPredecessorOfStatisticalClassificationArray();

    /**
     * Gets ith "StatisticalClassification_isPredecessorOf_StatisticalClassification" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsPredecessorOfStatisticalClassification getStatisticalClassificationIsPredecessorOfStatisticalClassificationArray(int i);

    /**
     * Returns number of "StatisticalClassification_isPredecessorOf_StatisticalClassification" element
     */
    int sizeOfStatisticalClassificationIsPredecessorOfStatisticalClassificationArray();

    /**
     * Sets array of all "StatisticalClassification_isPredecessorOf_StatisticalClassification" element
     */
    void setStatisticalClassificationIsPredecessorOfStatisticalClassificationArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsPredecessorOfStatisticalClassification[] statisticalClassificationIsPredecessorOfStatisticalClassificationArray);

    /**
     * Sets ith "StatisticalClassification_isPredecessorOf_StatisticalClassification" element
     */
    void setStatisticalClassificationIsPredecessorOfStatisticalClassificationArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsPredecessorOfStatisticalClassification statisticalClassificationIsPredecessorOfStatisticalClassification);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "StatisticalClassification_isPredecessorOf_StatisticalClassification" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsPredecessorOfStatisticalClassification insertNewStatisticalClassificationIsPredecessorOfStatisticalClassification(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "StatisticalClassification_isPredecessorOf_StatisticalClassification" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsPredecessorOfStatisticalClassification addNewStatisticalClassificationIsPredecessorOfStatisticalClassification();

    /**
     * Removes the ith "StatisticalClassification_isPredecessorOf_StatisticalClassification" element
     */
    void removeStatisticalClassificationIsPredecessorOfStatisticalClassification(int i);

    /**
     * Gets a List of "StatisticalClassification_has_ClassificationItemPosition" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationHasClassificationItemPosition> getStatisticalClassificationHasClassificationItemPositionList();

    /**
     * Gets array of all "StatisticalClassification_has_ClassificationItemPosition" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationHasClassificationItemPosition[] getStatisticalClassificationHasClassificationItemPositionArray();

    /**
     * Gets ith "StatisticalClassification_has_ClassificationItemPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationHasClassificationItemPosition getStatisticalClassificationHasClassificationItemPositionArray(int i);

    /**
     * Returns number of "StatisticalClassification_has_ClassificationItemPosition" element
     */
    int sizeOfStatisticalClassificationHasClassificationItemPositionArray();

    /**
     * Sets array of all "StatisticalClassification_has_ClassificationItemPosition" element
     */
    void setStatisticalClassificationHasClassificationItemPositionArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationHasClassificationItemPosition[] statisticalClassificationHasClassificationItemPositionArray);

    /**
     * Sets ith "StatisticalClassification_has_ClassificationItemPosition" element
     */
    void setStatisticalClassificationHasClassificationItemPositionArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationHasClassificationItemPosition statisticalClassificationHasClassificationItemPosition);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "StatisticalClassification_has_ClassificationItemPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationHasClassificationItemPosition insertNewStatisticalClassificationHasClassificationItemPosition(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "StatisticalClassification_has_ClassificationItemPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationHasClassificationItemPosition addNewStatisticalClassificationHasClassificationItemPosition();

    /**
     * Removes the ith "StatisticalClassification_has_ClassificationItemPosition" element
     */
    void removeStatisticalClassificationHasClassificationItemPosition(int i);

    /**
     * Gets a List of "StatisticalClassification_has_ClassificationItem" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationHasClassificationItem> getStatisticalClassificationHasClassificationItemList();

    /**
     * Gets array of all "StatisticalClassification_has_ClassificationItem" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationHasClassificationItem[] getStatisticalClassificationHasClassificationItemArray();

    /**
     * Gets ith "StatisticalClassification_has_ClassificationItem" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationHasClassificationItem getStatisticalClassificationHasClassificationItemArray(int i);

    /**
     * Returns number of "StatisticalClassification_has_ClassificationItem" element
     */
    int sizeOfStatisticalClassificationHasClassificationItemArray();

    /**
     * Sets array of all "StatisticalClassification_has_ClassificationItem" element
     */
    void setStatisticalClassificationHasClassificationItemArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationHasClassificationItem[] statisticalClassificationHasClassificationItemArray);

    /**
     * Sets ith "StatisticalClassification_has_ClassificationItem" element
     */
    void setStatisticalClassificationHasClassificationItemArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationHasClassificationItem statisticalClassificationHasClassificationItem);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "StatisticalClassification_has_ClassificationItem" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationHasClassificationItem insertNewStatisticalClassificationHasClassificationItem(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "StatisticalClassification_has_ClassificationItem" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationHasClassificationItem addNewStatisticalClassificationHasClassificationItem();

    /**
     * Removes the ith "StatisticalClassification_has_ClassificationItem" element
     */
    void removeStatisticalClassificationHasClassificationItem(int i);

    /**
     * Gets the "StatisticalClassification_has_LevelStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationHasLevelStructure getStatisticalClassificationHasLevelStructure();

    /**
     * True if has "StatisticalClassification_has_LevelStructure" element
     */
    boolean isSetStatisticalClassificationHasLevelStructure();

    /**
     * Sets the "StatisticalClassification_has_LevelStructure" element
     */
    void setStatisticalClassificationHasLevelStructure(org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationHasLevelStructure statisticalClassificationHasLevelStructure);

    /**
     * Appends and returns a new empty "StatisticalClassification_has_LevelStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationHasLevelStructure addNewStatisticalClassificationHasLevelStructure();

    /**
     * Unsets the "StatisticalClassification_has_LevelStructure" element
     */
    void unsetStatisticalClassificationHasLevelStructure();

    /**
     * An XML StatisticalClassification_isMaintainedBy_Organization(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface StatisticalClassificationIsMaintainedByOrganization extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsMaintainedByOrganization> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "statisticalclassificationismaintainedbyorganization7462elemtype");
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification$StatisticalClassificationIsMaintainedByOrganization$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsMaintainedByOrganization.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "validtypee824elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum ORGANIZATION = Enum.forString("Organization");

            int INT_ORGANIZATION = Enum.INT_ORGANIZATION;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification$StatisticalClassificationIsMaintainedByOrganization$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_ORGANIZATION
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

                static final int INT_ORGANIZATION = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("Organization", INT_ORGANIZATION),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }

    /**
     * An XML StatisticalClassification_isIndexedBy_ClassificationIndex(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface StatisticalClassificationIsIndexedByClassificationIndex extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsIndexedByClassificationIndex> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "statisticalclassificationisindexedbyclassificationindex07c6elemtype");
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification$StatisticalClassificationIsIndexedByClassificationIndex$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsIndexedByClassificationIndex.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "validtypeca88elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum CLASSIFICATION_INDEX = Enum.forString("ClassificationIndex");

            int INT_CLASSIFICATION_INDEX = Enum.INT_CLASSIFICATION_INDEX;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification$StatisticalClassificationIsIndexedByClassificationIndex$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_CLASSIFICATION_INDEX
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

                static final int INT_CLASSIFICATION_INDEX = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("ClassificationIndex", INT_CLASSIFICATION_INDEX),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }

    /**
     * An XML StatisticalClassification_isVariantOf_StatisticalClassification(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface StatisticalClassificationIsVariantOfStatisticalClassification extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsVariantOfStatisticalClassification> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "statisticalclassificationisvariantofstatisticalclassificationa6cfelemtype");
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification$StatisticalClassificationIsVariantOfStatisticalClassification$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsVariantOfStatisticalClassification.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "validtyped011elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum STATISTICAL_CLASSIFICATION = Enum.forString("StatisticalClassification");

            int INT_STATISTICAL_CLASSIFICATION = Enum.INT_STATISTICAL_CLASSIFICATION;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification$StatisticalClassificationIsVariantOfStatisticalClassification$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_STATISTICAL_CLASSIFICATION
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

                static final int INT_STATISTICAL_CLASSIFICATION = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("StatisticalClassification", INT_STATISTICAL_CLASSIFICATION),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }

    /**
     * An XML StatisticalClassification_isSuccessorOf_StatisticalClassification(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface StatisticalClassificationIsSuccessorOfStatisticalClassification extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsSuccessorOfStatisticalClassification> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "statisticalclassificationissuccessorofstatisticalclassification38f0elemtype");
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification$StatisticalClassificationIsSuccessorOfStatisticalClassification$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsSuccessorOfStatisticalClassification.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "validtype19b2elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum STATISTICAL_CLASSIFICATION = Enum.forString("StatisticalClassification");

            int INT_STATISTICAL_CLASSIFICATION = Enum.INT_STATISTICAL_CLASSIFICATION;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification$StatisticalClassificationIsSuccessorOfStatisticalClassification$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_STATISTICAL_CLASSIFICATION
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

                static final int INT_STATISTICAL_CLASSIFICATION = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("StatisticalClassification", INT_STATISTICAL_CLASSIFICATION),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }

    /**
     * An XML StatisticalClassification_isPredecessorOf_StatisticalClassification(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface StatisticalClassificationIsPredecessorOfStatisticalClassification extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsPredecessorOfStatisticalClassification> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "statisticalclassificationispredecessorofstatisticalclassificationb353elemtype");
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification$StatisticalClassificationIsPredecessorOfStatisticalClassification$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsPredecessorOfStatisticalClassification.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "validtype6b95elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum STATISTICAL_CLASSIFICATION = Enum.forString("StatisticalClassification");

            int INT_STATISTICAL_CLASSIFICATION = Enum.INT_STATISTICAL_CLASSIFICATION;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification$StatisticalClassificationIsPredecessorOfStatisticalClassification$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_STATISTICAL_CLASSIFICATION
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

                static final int INT_STATISTICAL_CLASSIFICATION = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("StatisticalClassification", INT_STATISTICAL_CLASSIFICATION),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }

    /**
     * An XML StatisticalClassification_has_ClassificationItemPosition(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface StatisticalClassificationHasClassificationItemPosition extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationHasClassificationItemPosition> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "statisticalclassificationhasclassificationitemposition696eelemtype");
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification$StatisticalClassificationHasClassificationItemPosition$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationHasClassificationItemPosition.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "validtype466celemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum CLASSIFICATION_ITEM_POSITION = Enum.forString("ClassificationItemPosition");

            int INT_CLASSIFICATION_ITEM_POSITION = Enum.INT_CLASSIFICATION_ITEM_POSITION;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification$StatisticalClassificationHasClassificationItemPosition$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_CLASSIFICATION_ITEM_POSITION
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

                static final int INT_CLASSIFICATION_ITEM_POSITION = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("ClassificationItemPosition", INT_CLASSIFICATION_ITEM_POSITION),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }

    /**
     * An XML StatisticalClassification_has_ClassificationItem(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface StatisticalClassificationHasClassificationItem extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationHasClassificationItem> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "statisticalclassificationhasclassificationitemf325elemtype");
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification$StatisticalClassificationHasClassificationItem$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationHasClassificationItem.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "validtypeae23elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum CLASSIFICATION_ITEM = Enum.forString("ClassificationItem");

            int INT_CLASSIFICATION_ITEM = Enum.INT_CLASSIFICATION_ITEM;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification$StatisticalClassificationHasClassificationItem$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_CLASSIFICATION_ITEM
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

                static final int INT_CLASSIFICATION_ITEM = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("ClassificationItem", INT_CLASSIFICATION_ITEM),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }

    /**
     * An XML StatisticalClassification_has_LevelStructure(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface StatisticalClassificationHasLevelStructure extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationHasLevelStructure> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "statisticalclassificationhaslevelstructure0cdbelemtype");
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification$StatisticalClassificationHasLevelStructure$ValidType.
         */
        public interface ValidType extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationHasLevelStructure.ValidType> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "validtypef6d9elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum LEVEL_STRUCTURE = Enum.forString("LevelStructure");

            int INT_LEVEL_STRUCTURE = Enum.INT_LEVEL_STRUCTURE;

            /**
             * Enumeration value class for org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification$StatisticalClassificationHasLevelStructure$ValidType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_LEVEL_STRUCTURE
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

                static final int INT_LEVEL_STRUCTURE = 1;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("LevelStructure", INT_LEVEL_STRUCTURE),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }
}
