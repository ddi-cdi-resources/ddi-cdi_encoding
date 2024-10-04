/*
 * XML Type:  Address
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.Address
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML Address(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface Address extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Address> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "address4fa0type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "cityPlaceLocal" element
     */
    java.lang.String getCityPlaceLocal();

    /**
     * Gets (as xml) the "cityPlaceLocal" element
     */
    org.apache.xmlbeans.XmlString xgetCityPlaceLocal();

    /**
     * True if has "cityPlaceLocal" element
     */
    boolean isSetCityPlaceLocal();

    /**
     * Sets the "cityPlaceLocal" element
     */
    void setCityPlaceLocal(java.lang.String cityPlaceLocal);

    /**
     * Sets (as xml) the "cityPlaceLocal" element
     */
    void xsetCityPlaceLocal(org.apache.xmlbeans.XmlString cityPlaceLocal);

    /**
     * Unsets the "cityPlaceLocal" element
     */
    void unsetCityPlaceLocal();

    /**
     * Gets the "countryCode" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getCountryCode();

    /**
     * True if has "countryCode" element
     */
    boolean isSetCountryCode();

    /**
     * Sets the "countryCode" element
     */
    void setCountryCode(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry countryCode);

    /**
     * Appends and returns a new empty "countryCode" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewCountryCode();

    /**
     * Unsets the "countryCode" element
     */
    void unsetCountryCode();

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
     * Gets the "geographicPoint" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpatialPoint getGeographicPoint();

    /**
     * True if has "geographicPoint" element
     */
    boolean isSetGeographicPoint();

    /**
     * Sets the "geographicPoint" element
     */
    void setGeographicPoint(org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpatialPoint geographicPoint);

    /**
     * Appends and returns a new empty "geographicPoint" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpatialPoint addNewGeographicPoint();

    /**
     * Unsets the "geographicPoint" element
     */
    void unsetGeographicPoint();

    /**
     * Gets the "isPreferred" element
     */
    boolean getIsPreferred();

    /**
     * Gets (as xml) the "isPreferred" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsPreferred();

    /**
     * True if has "isPreferred" element
     */
    boolean isSetIsPreferred();

    /**
     * Sets the "isPreferred" element
     */
    void setIsPreferred(boolean isPreferred);

    /**
     * Sets (as xml) the "isPreferred" element
     */
    void xsetIsPreferred(org.apache.xmlbeans.XmlBoolean isPreferred);

    /**
     * Unsets the "isPreferred" element
     */
    void unsetIsPreferred();

    /**
     * Gets a List of "line" elements
     */
    java.util.List<java.lang.String> getLineList();

    /**
     * Gets array of all "line" elements
     */
    java.lang.String[] getLineArray();

    /**
     * Gets ith "line" element
     */
    java.lang.String getLineArray(int i);

    /**
     * Gets (as xml) a List of "line" elements
     */
    java.util.List<org.apache.xmlbeans.XmlString> xgetLineList();

    /**
     * Gets (as xml) array of all "line" elements
     */
    org.apache.xmlbeans.XmlString[] xgetLineArray();

    /**
     * Gets (as xml) ith "line" element
     */
    org.apache.xmlbeans.XmlString xgetLineArray(int i);

    /**
     * Returns number of "line" element
     */
    int sizeOfLineArray();

    /**
     * Sets array of all "line" element
     */
    void setLineArray(java.lang.String[] lineArray);

    /**
     * Sets ith "line" element
     */
    void setLineArray(int i, java.lang.String line);

    /**
     * Sets (as xml) array of all "line" element
     */
    void xsetLineArray(org.apache.xmlbeans.XmlString[] lineArray);

    /**
     * Sets (as xml) ith "line" element
     */
    void xsetLineArray(int i, org.apache.xmlbeans.XmlString line);

    /**
     * Inserts the value as the ith "line" element
     */
    void insertLine(int i, java.lang.String line);

    /**
     * Appends the value as the last "line" element
     */
    void addLine(java.lang.String line);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "line" element
     */
    org.apache.xmlbeans.XmlString insertNewLine(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "line" element
     */
    org.apache.xmlbeans.XmlString addNewLine();

    /**
     * Removes the ith "line" element
     */
    void removeLine(int i);

    /**
     * Gets the "locationName" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName getLocationName();

    /**
     * True if has "locationName" element
     */
    boolean isSetLocationName();

    /**
     * Sets the "locationName" element
     */
    void setLocationName(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName locationName);

    /**
     * Appends and returns a new empty "locationName" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName addNewLocationName();

    /**
     * Unsets the "locationName" element
     */
    void unsetLocationName();

    /**
     * Gets the "postalCode" element
     */
    java.lang.String getPostalCode();

    /**
     * Gets (as xml) the "postalCode" element
     */
    org.apache.xmlbeans.XmlString xgetPostalCode();

    /**
     * True if has "postalCode" element
     */
    boolean isSetPostalCode();

    /**
     * Sets the "postalCode" element
     */
    void setPostalCode(java.lang.String postalCode);

    /**
     * Sets (as xml) the "postalCode" element
     */
    void xsetPostalCode(org.apache.xmlbeans.XmlString postalCode);

    /**
     * Unsets the "postalCode" element
     */
    void unsetPostalCode();

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
     * Gets the "regionalCoverage" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getRegionalCoverage();

    /**
     * True if has "regionalCoverage" element
     */
    boolean isSetRegionalCoverage();

    /**
     * Sets the "regionalCoverage" element
     */
    void setRegionalCoverage(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry regionalCoverage);

    /**
     * Appends and returns a new empty "regionalCoverage" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewRegionalCoverage();

    /**
     * Unsets the "regionalCoverage" element
     */
    void unsetRegionalCoverage();

    /**
     * Gets the "stateProvince" element
     */
    java.lang.String getStateProvince();

    /**
     * Gets (as xml) the "stateProvince" element
     */
    org.apache.xmlbeans.XmlString xgetStateProvince();

    /**
     * True if has "stateProvince" element
     */
    boolean isSetStateProvince();

    /**
     * Sets the "stateProvince" element
     */
    void setStateProvince(java.lang.String stateProvince);

    /**
     * Sets (as xml) the "stateProvince" element
     */
    void xsetStateProvince(org.apache.xmlbeans.XmlString stateProvince);

    /**
     * Unsets the "stateProvince" element
     */
    void unsetStateProvince();

    /**
     * Gets the "timeZone" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getTimeZone();

    /**
     * True if has "timeZone" element
     */
    boolean isSetTimeZone();

    /**
     * Sets the "timeZone" element
     */
    void setTimeZone(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry timeZone);

    /**
     * Appends and returns a new empty "timeZone" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewTimeZone();

    /**
     * Unsets the "timeZone" element
     */
    void unsetTimeZone();

    /**
     * Gets the "typeOfAddress" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getTypeOfAddress();

    /**
     * True if has "typeOfAddress" element
     */
    boolean isSetTypeOfAddress();

    /**
     * Sets the "typeOfAddress" element
     */
    void setTypeOfAddress(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry typeOfAddress);

    /**
     * Appends and returns a new empty "typeOfAddress" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewTypeOfAddress();

    /**
     * Unsets the "typeOfAddress" element
     */
    void unsetTypeOfAddress();

    /**
     * Gets the "typeOfLocation" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getTypeOfLocation();

    /**
     * True if has "typeOfLocation" element
     */
    boolean isSetTypeOfLocation();

    /**
     * Sets the "typeOfLocation" element
     */
    void setTypeOfLocation(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry typeOfLocation);

    /**
     * Appends and returns a new empty "typeOfLocation" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewTypeOfLocation();

    /**
     * Unsets the "typeOfLocation" element
     */
    void unsetTypeOfLocation();
}
