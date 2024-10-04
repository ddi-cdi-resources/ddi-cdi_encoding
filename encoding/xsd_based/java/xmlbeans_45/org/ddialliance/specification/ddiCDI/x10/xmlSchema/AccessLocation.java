/*
 * XML Type:  AccessLocation
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.AccessLocation
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML AccessLocation(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface AccessLocation extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.AccessLocation> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "accesslocationb9d7type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "mimeType" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getMimeType();

    /**
     * True if has "mimeType" element
     */
    boolean isSetMimeType();

    /**
     * Sets the "mimeType" element
     */
    void setMimeType(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry mimeType);

    /**
     * Appends and returns a new empty "mimeType" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewMimeType();

    /**
     * Unsets the "mimeType" element
     */
    void unsetMimeType();

    /**
     * Gets a List of "physicalLocation" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString> getPhysicalLocationList();

    /**
     * Gets array of all "physicalLocation" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString[] getPhysicalLocationArray();

    /**
     * Gets ith "physicalLocation" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getPhysicalLocationArray(int i);

    /**
     * Returns number of "physicalLocation" element
     */
    int sizeOfPhysicalLocationArray();

    /**
     * Sets array of all "physicalLocation" element
     */
    void setPhysicalLocationArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString[] physicalLocationArray);

    /**
     * Sets ith "physicalLocation" element
     */
    void setPhysicalLocationArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString physicalLocation);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "physicalLocation" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString insertNewPhysicalLocation(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "physicalLocation" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewPhysicalLocation();

    /**
     * Removes the ith "physicalLocation" element
     */
    void removePhysicalLocation(int i);

    /**
     * Gets a List of "uri" elements
     */
    java.util.List<java.lang.String> getUriList();

    /**
     * Gets array of all "uri" elements
     */
    java.lang.String[] getUriArray();

    /**
     * Gets ith "uri" element
     */
    java.lang.String getUriArray(int i);

    /**
     * Gets (as xml) a List of "uri" elements
     */
    java.util.List<org.apache.xmlbeans.XmlAnyURI> xgetUriList();

    /**
     * Gets (as xml) array of all "uri" elements
     */
    org.apache.xmlbeans.XmlAnyURI[] xgetUriArray();

    /**
     * Gets (as xml) ith "uri" element
     */
    org.apache.xmlbeans.XmlAnyURI xgetUriArray(int i);

    /**
     * Returns number of "uri" element
     */
    int sizeOfUriArray();

    /**
     * Sets array of all "uri" element
     */
    void setUriArray(java.lang.String[] uriArray);

    /**
     * Sets ith "uri" element
     */
    void setUriArray(int i, java.lang.String uri);

    /**
     * Sets (as xml) array of all "uri" element
     */
    void xsetUriArray(org.apache.xmlbeans.XmlAnyURI[] uriArray);

    /**
     * Sets (as xml) ith "uri" element
     */
    void xsetUriArray(int i, org.apache.xmlbeans.XmlAnyURI uri);

    /**
     * Inserts the value as the ith "uri" element
     */
    void insertUri(int i, java.lang.String uri);

    /**
     * Appends the value as the last "uri" element
     */
    void addUri(java.lang.String uri);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "uri" element
     */
    org.apache.xmlbeans.XmlAnyURI insertNewUri(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "uri" element
     */
    org.apache.xmlbeans.XmlAnyURI addNewUri();

    /**
     * Removes the ith "uri" element
     */
    void removeUri(int i);
}
