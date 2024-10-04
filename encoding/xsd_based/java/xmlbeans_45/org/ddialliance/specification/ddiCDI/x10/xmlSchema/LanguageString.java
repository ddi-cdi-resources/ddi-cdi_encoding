/*
 * XML Type:  LanguageString
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.LanguageString
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML LanguageString(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface LanguageString extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.LanguageString> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "languagestringca27type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "content" element
     */
    java.lang.String getContent();

    /**
     * Gets (as xml) the "content" element
     */
    org.apache.xmlbeans.XmlString xgetContent();

    /**
     * Sets the "content" element
     */
    void setContent(java.lang.String content);

    /**
     * Sets (as xml) the "content" element
     */
    void xsetContent(org.apache.xmlbeans.XmlString content);

    /**
     * Gets the "isTranslatable" element
     */
    boolean getIsTranslatable();

    /**
     * Gets (as xml) the "isTranslatable" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsTranslatable();

    /**
     * True if has "isTranslatable" element
     */
    boolean isSetIsTranslatable();

    /**
     * Sets the "isTranslatable" element
     */
    void setIsTranslatable(boolean isTranslatable);

    /**
     * Sets (as xml) the "isTranslatable" element
     */
    void xsetIsTranslatable(org.apache.xmlbeans.XmlBoolean isTranslatable);

    /**
     * Unsets the "isTranslatable" element
     */
    void unsetIsTranslatable();

    /**
     * Gets the "isTranslated" element
     */
    boolean getIsTranslated();

    /**
     * Gets (as xml) the "isTranslated" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsTranslated();

    /**
     * True if has "isTranslated" element
     */
    boolean isSetIsTranslated();

    /**
     * Sets the "isTranslated" element
     */
    void setIsTranslated(boolean isTranslated);

    /**
     * Sets (as xml) the "isTranslated" element
     */
    void xsetIsTranslated(org.apache.xmlbeans.XmlBoolean isTranslated);

    /**
     * Unsets the "isTranslated" element
     */
    void unsetIsTranslated();

    /**
     * Gets the "scope" element
     */
    java.lang.String getScope();

    /**
     * Gets (as xml) the "scope" element
     */
    org.apache.xmlbeans.XmlString xgetScope();

    /**
     * True if has "scope" element
     */
    boolean isSetScope();

    /**
     * Sets the "scope" element
     */
    void setScope(java.lang.String scope);

    /**
     * Sets (as xml) the "scope" element
     */
    void xsetScope(org.apache.xmlbeans.XmlString scope);

    /**
     * Unsets the "scope" element
     */
    void unsetScope();

    /**
     * Gets the "structureUsed" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getStructureUsed();

    /**
     * True if has "structureUsed" element
     */
    boolean isSetStructureUsed();

    /**
     * Sets the "structureUsed" element
     */
    void setStructureUsed(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry structureUsed);

    /**
     * Appends and returns a new empty "structureUsed" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewStructureUsed();

    /**
     * Unsets the "structureUsed" element
     */
    void unsetStructureUsed();

    /**
     * Gets the "translationDate" element
     */
    java.util.Calendar getTranslationDate();

    /**
     * Gets (as xml) the "translationDate" element
     */
    org.apache.xmlbeans.XmlDate xgetTranslationDate();

    /**
     * True if has "translationDate" element
     */
    boolean isSetTranslationDate();

    /**
     * Sets the "translationDate" element
     */
    void setTranslationDate(java.util.Calendar translationDate);

    /**
     * Sets (as xml) the "translationDate" element
     */
    void xsetTranslationDate(org.apache.xmlbeans.XmlDate translationDate);

    /**
     * Unsets the "translationDate" element
     */
    void unsetTranslationDate();

    /**
     * Gets a List of "translationSourceLanguage" elements
     */
    java.util.List<java.lang.String> getTranslationSourceLanguageList();

    /**
     * Gets array of all "translationSourceLanguage" elements
     */
    java.lang.String[] getTranslationSourceLanguageArray();

    /**
     * Gets ith "translationSourceLanguage" element
     */
    java.lang.String getTranslationSourceLanguageArray(int i);

    /**
     * Gets (as xml) a List of "translationSourceLanguage" elements
     */
    java.util.List<org.apache.xmlbeans.XmlLanguage> xgetTranslationSourceLanguageList();

    /**
     * Gets (as xml) array of all "translationSourceLanguage" elements
     */
    org.apache.xmlbeans.XmlLanguage[] xgetTranslationSourceLanguageArray();

    /**
     * Gets (as xml) ith "translationSourceLanguage" element
     */
    org.apache.xmlbeans.XmlLanguage xgetTranslationSourceLanguageArray(int i);

    /**
     * Returns number of "translationSourceLanguage" element
     */
    int sizeOfTranslationSourceLanguageArray();

    /**
     * Sets array of all "translationSourceLanguage" element
     */
    void setTranslationSourceLanguageArray(java.lang.String[] translationSourceLanguageArray);

    /**
     * Sets ith "translationSourceLanguage" element
     */
    void setTranslationSourceLanguageArray(int i, java.lang.String translationSourceLanguage);

    /**
     * Sets (as xml) array of all "translationSourceLanguage" element
     */
    void xsetTranslationSourceLanguageArray(org.apache.xmlbeans.XmlLanguage[] translationSourceLanguageArray);

    /**
     * Sets (as xml) ith "translationSourceLanguage" element
     */
    void xsetTranslationSourceLanguageArray(int i, org.apache.xmlbeans.XmlLanguage translationSourceLanguage);

    /**
     * Inserts the value as the ith "translationSourceLanguage" element
     */
    void insertTranslationSourceLanguage(int i, java.lang.String translationSourceLanguage);

    /**
     * Appends the value as the last "translationSourceLanguage" element
     */
    void addTranslationSourceLanguage(java.lang.String translationSourceLanguage);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "translationSourceLanguage" element
     */
    org.apache.xmlbeans.XmlLanguage insertNewTranslationSourceLanguage(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "translationSourceLanguage" element
     */
    org.apache.xmlbeans.XmlLanguage addNewTranslationSourceLanguage();

    /**
     * Removes the ith "translationSourceLanguage" element
     */
    void removeTranslationSourceLanguage(int i);
}
