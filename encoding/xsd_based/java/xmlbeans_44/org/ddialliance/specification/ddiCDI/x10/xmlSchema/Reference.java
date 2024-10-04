/*
 * XML Type:  Reference
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML Reference(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface Reference extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "reference24b7type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ddiReference" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalRegistrationDataIdentifier getDdiReference();

    /**
     * True if has "ddiReference" element
     */
    boolean isSetDdiReference();

    /**
     * Sets the "ddiReference" element
     */
    void setDdiReference(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalRegistrationDataIdentifier ddiReference);

    /**
     * Appends and returns a new empty "ddiReference" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalRegistrationDataIdentifier addNewDdiReference();

    /**
     * Unsets the "ddiReference" element
     */
    void unsetDdiReference();

    /**
     * Gets the "deepLink" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Selector getDeepLink();

    /**
     * True if has "deepLink" element
     */
    boolean isSetDeepLink();

    /**
     * Sets the "deepLink" element
     */
    void setDeepLink(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Selector deepLink);

    /**
     * Appends and returns a new empty "deepLink" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Selector addNewDeepLink();

    /**
     * Unsets the "deepLink" element
     */
    void unsetDeepLink();

    /**
     * Gets the "description" element
     */
    java.lang.String getDescription();

    /**
     * Gets (as xml) the "description" element
     */
    org.apache.xmlbeans.XmlString xgetDescription();

    /**
     * True if has "description" element
     */
    boolean isSetDescription();

    /**
     * Sets the "description" element
     */
    void setDescription(java.lang.String description);

    /**
     * Sets (as xml) the "description" element
     */
    void xsetDescription(org.apache.xmlbeans.XmlString description);

    /**
     * Unsets the "description" element
     */
    void unsetDescription();

    /**
     * Gets the "location" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getLocation();

    /**
     * True if has "location" element
     */
    boolean isSetLocation();

    /**
     * Sets the "location" element
     */
    void setLocation(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString location);

    /**
     * Appends and returns a new empty "location" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewLocation();

    /**
     * Unsets the "location" element
     */
    void unsetLocation();

    /**
     * Gets a List of "nonDdiReference" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDdiIdentifier> getNonDdiReferenceList();

    /**
     * Gets array of all "nonDdiReference" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDdiIdentifier[] getNonDdiReferenceArray();

    /**
     * Gets ith "nonDdiReference" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDdiIdentifier getNonDdiReferenceArray(int i);

    /**
     * Returns number of "nonDdiReference" element
     */
    int sizeOfNonDdiReferenceArray();

    /**
     * Sets array of all "nonDdiReference" element
     */
    void setNonDdiReferenceArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDdiIdentifier[] nonDdiReferenceArray);

    /**
     * Sets ith "nonDdiReference" element
     */
    void setNonDdiReferenceArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDdiIdentifier nonDdiReference);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "nonDdiReference" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDdiIdentifier insertNewNonDdiReference(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "nonDdiReference" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDdiIdentifier addNewNonDdiReference();

    /**
     * Removes the ith "nonDdiReference" element
     */
    void removeNonDdiReference(int i);

    /**
     * Gets the "semantic" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getSemantic();

    /**
     * True if has "semantic" element
     */
    boolean isSetSemantic();

    /**
     * Sets the "semantic" element
     */
    void setSemantic(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry semantic);

    /**
     * Appends and returns a new empty "semantic" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewSemantic();

    /**
     * Unsets the "semantic" element
     */
    void unsetSemantic();

    /**
     * Gets the "uri" element
     */
    java.lang.String getUri();

    /**
     * Gets (as xml) the "uri" element
     */
    org.apache.xmlbeans.XmlAnyURI xgetUri();

    /**
     * True if has "uri" element
     */
    boolean isSetUri();

    /**
     * Sets the "uri" element
     */
    void setUri(java.lang.String uri);

    /**
     * Sets (as xml) the "uri" element
     */
    void xsetUri(org.apache.xmlbeans.XmlAnyURI uri);

    /**
     * Unsets the "uri" element
     */
    void unsetUri();

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
}
