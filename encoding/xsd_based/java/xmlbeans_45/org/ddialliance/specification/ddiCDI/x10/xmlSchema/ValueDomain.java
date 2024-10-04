/*
 * XML Type:  ValueDomain
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueDomain
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ValueDomain(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface ValueDomain extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueDomain> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "valuedomain9a41type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


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
     * Gets a List of "recommendedDataType" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry> getRecommendedDataTypeList();

    /**
     * Gets array of all "recommendedDataType" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry[] getRecommendedDataTypeArray();

    /**
     * Gets ith "recommendedDataType" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getRecommendedDataTypeArray(int i);

    /**
     * Returns number of "recommendedDataType" element
     */
    int sizeOfRecommendedDataTypeArray();

    /**
     * Sets array of all "recommendedDataType" element
     */
    void setRecommendedDataTypeArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry[] recommendedDataTypeArray);

    /**
     * Sets ith "recommendedDataType" element
     */
    void setRecommendedDataTypeArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry recommendedDataType);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "recommendedDataType" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry insertNewRecommendedDataType(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "recommendedDataType" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewRecommendedDataType();

    /**
     * Removes the ith "recommendedDataType" element
     */
    void removeRecommendedDataType(int i);
}
