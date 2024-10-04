/*
 * XML Type:  ControlledVocabularyEntry
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ControlledVocabularyEntry(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface ControlledVocabularyEntry extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "controlledvocabularyentry5eaatype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "entryReference" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference> getEntryReferenceList();

    /**
     * Gets array of all "entryReference" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference[] getEntryReferenceArray();

    /**
     * Gets ith "entryReference" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference getEntryReferenceArray(int i);

    /**
     * Returns number of "entryReference" element
     */
    int sizeOfEntryReferenceArray();

    /**
     * Sets array of all "entryReference" element
     */
    void setEntryReferenceArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference[] entryReferenceArray);

    /**
     * Sets ith "entryReference" element
     */
    void setEntryReferenceArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference entryReference);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "entryReference" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference insertNewEntryReference(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "entryReference" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference addNewEntryReference();

    /**
     * Removes the ith "entryReference" element
     */
    void removeEntryReference(int i);

    /**
     * Gets a List of "entryValue" elements
     */
    java.util.List<java.lang.String> getEntryValueList();

    /**
     * Gets array of all "entryValue" elements
     */
    java.lang.String[] getEntryValueArray();

    /**
     * Gets ith "entryValue" element
     */
    java.lang.String getEntryValueArray(int i);

    /**
     * Gets (as xml) a List of "entryValue" elements
     */
    java.util.List<org.apache.xmlbeans.XmlString> xgetEntryValueList();

    /**
     * Gets (as xml) array of all "entryValue" elements
     */
    org.apache.xmlbeans.XmlString[] xgetEntryValueArray();

    /**
     * Gets (as xml) ith "entryValue" element
     */
    org.apache.xmlbeans.XmlString xgetEntryValueArray(int i);

    /**
     * Returns number of "entryValue" element
     */
    int sizeOfEntryValueArray();

    /**
     * Sets array of all "entryValue" element
     */
    void setEntryValueArray(java.lang.String[] entryValueArray);

    /**
     * Sets ith "entryValue" element
     */
    void setEntryValueArray(int i, java.lang.String entryValue);

    /**
     * Sets (as xml) array of all "entryValue" element
     */
    void xsetEntryValueArray(org.apache.xmlbeans.XmlString[] entryValueArray);

    /**
     * Sets (as xml) ith "entryValue" element
     */
    void xsetEntryValueArray(int i, org.apache.xmlbeans.XmlString entryValue);

    /**
     * Inserts the value as the ith "entryValue" element
     */
    void insertEntryValue(int i, java.lang.String entryValue);

    /**
     * Appends the value as the last "entryValue" element
     */
    void addEntryValue(java.lang.String entryValue);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "entryValue" element
     */
    org.apache.xmlbeans.XmlString insertNewEntryValue(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "entryValue" element
     */
    org.apache.xmlbeans.XmlString addNewEntryValue();

    /**
     * Removes the ith "entryValue" element
     */
    void removeEntryValue(int i);

    /**
     * Gets the "name" element
     */
    java.lang.String getName();

    /**
     * Gets (as xml) the "name" element
     */
    org.apache.xmlbeans.XmlString xgetName();

    /**
     * True if has "name" element
     */
    boolean isSetName();

    /**
     * Sets the "name" element
     */
    void setName(java.lang.String name);

    /**
     * Sets (as xml) the "name" element
     */
    void xsetName(org.apache.xmlbeans.XmlString name);

    /**
     * Unsets the "name" element
     */
    void unsetName();

    /**
     * Gets the "valueForOther" element
     */
    java.lang.String getValueForOther();

    /**
     * Gets (as xml) the "valueForOther" element
     */
    org.apache.xmlbeans.XmlString xgetValueForOther();

    /**
     * True if has "valueForOther" element
     */
    boolean isSetValueForOther();

    /**
     * Sets the "valueForOther" element
     */
    void setValueForOther(java.lang.String valueForOther);

    /**
     * Sets (as xml) the "valueForOther" element
     */
    void xsetValueForOther(org.apache.xmlbeans.XmlString valueForOther);

    /**
     * Unsets the "valueForOther" element
     */
    void unsetValueForOther();

    /**
     * Gets the "vocabulary" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference getVocabulary();

    /**
     * True if has "vocabulary" element
     */
    boolean isSetVocabulary();

    /**
     * Sets the "vocabulary" element
     */
    void setVocabulary(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference vocabulary);

    /**
     * Appends and returns a new empty "vocabulary" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference addNewVocabulary();

    /**
     * Unsets the "vocabulary" element
     */
    void unsetVocabulary();
}
