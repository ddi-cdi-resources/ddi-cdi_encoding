/*
 * XML Type:  Address
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.Address
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML Address(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class AddressImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.Address {
    private static final long serialVersionUID = 1L;

    public AddressImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "cityPlaceLocal"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "countryCode"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "effectiveDates"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "geographicPoint"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "isPreferred"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "line"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "locationName"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "postalCode"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "privacy"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "regionalCoverage"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "stateProvince"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "timeZone"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "typeOfAddress"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "typeOfLocation"),
    };


    /**
     * Gets the "cityPlaceLocal" element
     */
    @Override
    public java.lang.String getCityPlaceLocal() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "cityPlaceLocal" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetCityPlaceLocal() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return target;
        }
    }

    /**
     * True if has "cityPlaceLocal" element
     */
    @Override
    public boolean isSetCityPlaceLocal() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "cityPlaceLocal" element
     */
    @Override
    public void setCityPlaceLocal(java.lang.String cityPlaceLocal) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.setStringValue(cityPlaceLocal);
        }
    }

    /**
     * Sets (as xml) the "cityPlaceLocal" element
     */
    @Override
    public void xsetCityPlaceLocal(org.apache.xmlbeans.XmlString cityPlaceLocal) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(cityPlaceLocal);
        }
    }

    /**
     * Unsets the "cityPlaceLocal" element
     */
    @Override
    public void unsetCityPlaceLocal() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "countryCode" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getCountryCode() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "countryCode" element
     */
    @Override
    public boolean isSetCountryCode() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "countryCode" element
     */
    @Override
    public void setCountryCode(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry countryCode) {
        generatedSetterHelperImpl(countryCode, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "countryCode" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewCountryCode() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "countryCode" element
     */
    @Override
    public void unsetCountryCode() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets the "effectiveDates" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange getEffectiveDates() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "effectiveDates" element
     */
    @Override
    public boolean isSetEffectiveDates() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "effectiveDates" element
     */
    @Override
    public void setEffectiveDates(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange effectiveDates) {
        generatedSetterHelperImpl(effectiveDates, PROPERTY_QNAME[2], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "effectiveDates" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange addNewEffectiveDates() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Unsets the "effectiveDates" element
     */
    @Override
    public void unsetEffectiveDates() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }

    /**
     * Gets the "geographicPoint" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpatialPoint getGeographicPoint() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpatialPoint target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpatialPoint)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "geographicPoint" element
     */
    @Override
    public boolean isSetGeographicPoint() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]) != 0;
        }
    }

    /**
     * Sets the "geographicPoint" element
     */
    @Override
    public void setGeographicPoint(org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpatialPoint geographicPoint) {
        generatedSetterHelperImpl(geographicPoint, PROPERTY_QNAME[3], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "geographicPoint" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpatialPoint addNewGeographicPoint() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpatialPoint target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpatialPoint)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Unsets the "geographicPoint" element
     */
    @Override
    public void unsetGeographicPoint() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], 0);
        }
    }

    /**
     * Gets the "isPreferred" element
     */
    @Override
    public boolean getIsPreferred() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "isPreferred" element
     */
    @Override
    public org.apache.xmlbeans.XmlBoolean xgetIsPreferred() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            return target;
        }
    }

    /**
     * True if has "isPreferred" element
     */
    @Override
    public boolean isSetIsPreferred() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[4]) != 0;
        }
    }

    /**
     * Sets the "isPreferred" element
     */
    @Override
    public void setIsPreferred(boolean isPreferred) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[4]);
            }
            target.setBooleanValue(isPreferred);
        }
    }

    /**
     * Sets (as xml) the "isPreferred" element
     */
    @Override
    public void xsetIsPreferred(org.apache.xmlbeans.XmlBoolean isPreferred) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(PROPERTY_QNAME[4]);
            }
            target.set(isPreferred);
        }
    }

    /**
     * Unsets the "isPreferred" element
     */
    @Override
    public void unsetIsPreferred() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[4], 0);
        }
    }

    /**
     * Gets a List of "line" elements
     */
    @Override
    public java.util.List<java.lang.String> getLineList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getLineArray,
                this::setLineArray,
                this::insertLine,
                this::removeLine,
                this::sizeOfLineArray
            );
        }
    }

    /**
     * Gets array of all "line" elements
     */
    @Override
    public java.lang.String[] getLineArray() {
        return getObjectArray(PROPERTY_QNAME[5], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "line" element
     */
    @Override
    public java.lang.String getLineArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[5], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) a List of "line" elements
     */
    @Override
    public java.util.List<org.apache.xmlbeans.XmlString> xgetLineList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetLineArray,
                this::xsetLineArray,
                this::insertNewLine,
                this::removeLine,
                this::sizeOfLineArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "line" elements
     */
    @Override
    public org.apache.xmlbeans.XmlString[] xgetLineArray() {
        return xgetArray(PROPERTY_QNAME[5], org.apache.xmlbeans.XmlString[]::new);
    }

    /**
     * Gets (as xml) ith "line" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetLineArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[5], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "line" element
     */
    @Override
    public int sizeOfLineArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[5]);
        }
    }

    /**
     * Sets array of all "line" element
     */
    @Override
    public void setLineArray(java.lang.String[] lineArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(lineArray, PROPERTY_QNAME[5]);
        }
    }

    /**
     * Sets ith "line" element
     */
    @Override
    public void setLineArray(int i, java.lang.String line) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[5], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(line);
        }
    }

    /**
     * Sets (as xml) array of all "line" element
     */
    @Override
    public void xsetLineArray(org.apache.xmlbeans.XmlString[]lineArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(lineArray, PROPERTY_QNAME[5]);
        }
    }

    /**
     * Sets (as xml) ith "line" element
     */
    @Override
    public void xsetLineArray(int i, org.apache.xmlbeans.XmlString line) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[5], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(line);
        }
    }

    /**
     * Inserts the value as the ith "line" element
     */
    @Override
    public void insertLine(int i, java.lang.String line) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[5], i);
            target.setStringValue(line);
        }
    }

    /**
     * Appends the value as the last "line" element
     */
    @Override
    public void addLine(java.lang.String line) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[5]);
            target.setStringValue(line);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "line" element
     */
    @Override
    public org.apache.xmlbeans.XmlString insertNewLine(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(PROPERTY_QNAME[5], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "line" element
     */
    @Override
    public org.apache.xmlbeans.XmlString addNewLine() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * Removes the ith "line" element
     */
    @Override
    public void removeLine(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[5], i);
        }
    }

    /**
     * Gets the "locationName" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName getLocationName() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName)get_store().find_element_user(PROPERTY_QNAME[6], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "locationName" element
     */
    @Override
    public boolean isSetLocationName() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[6]) != 0;
        }
    }

    /**
     * Sets the "locationName" element
     */
    @Override
    public void setLocationName(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName locationName) {
        generatedSetterHelperImpl(locationName, PROPERTY_QNAME[6], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "locationName" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName addNewLocationName() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName)get_store().add_element_user(PROPERTY_QNAME[6]);
            return target;
        }
    }

    /**
     * Unsets the "locationName" element
     */
    @Override
    public void unsetLocationName() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[6], 0);
        }
    }

    /**
     * Gets the "postalCode" element
     */
    @Override
    public java.lang.String getPostalCode() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[7], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "postalCode" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetPostalCode() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[7], 0);
            return target;
        }
    }

    /**
     * True if has "postalCode" element
     */
    @Override
    public boolean isSetPostalCode() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[7]) != 0;
        }
    }

    /**
     * Sets the "postalCode" element
     */
    @Override
    public void setPostalCode(java.lang.String postalCode) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[7], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[7]);
            }
            target.setStringValue(postalCode);
        }
    }

    /**
     * Sets (as xml) the "postalCode" element
     */
    @Override
    public void xsetPostalCode(org.apache.xmlbeans.XmlString postalCode) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[7], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[7]);
            }
            target.set(postalCode);
        }
    }

    /**
     * Unsets the "postalCode" element
     */
    @Override
    public void unsetPostalCode() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[7], 0);
        }
    }

    /**
     * Gets the "privacy" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getPrivacy() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().find_element_user(PROPERTY_QNAME[8], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "privacy" element
     */
    @Override
    public boolean isSetPrivacy() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[8]) != 0;
        }
    }

    /**
     * Sets the "privacy" element
     */
    @Override
    public void setPrivacy(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry privacy) {
        generatedSetterHelperImpl(privacy, PROPERTY_QNAME[8], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "privacy" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewPrivacy() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().add_element_user(PROPERTY_QNAME[8]);
            return target;
        }
    }

    /**
     * Unsets the "privacy" element
     */
    @Override
    public void unsetPrivacy() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[8], 0);
        }
    }

    /**
     * Gets the "regionalCoverage" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getRegionalCoverage() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().find_element_user(PROPERTY_QNAME[9], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "regionalCoverage" element
     */
    @Override
    public boolean isSetRegionalCoverage() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[9]) != 0;
        }
    }

    /**
     * Sets the "regionalCoverage" element
     */
    @Override
    public void setRegionalCoverage(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry regionalCoverage) {
        generatedSetterHelperImpl(regionalCoverage, PROPERTY_QNAME[9], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "regionalCoverage" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewRegionalCoverage() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().add_element_user(PROPERTY_QNAME[9]);
            return target;
        }
    }

    /**
     * Unsets the "regionalCoverage" element
     */
    @Override
    public void unsetRegionalCoverage() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[9], 0);
        }
    }

    /**
     * Gets the "stateProvince" element
     */
    @Override
    public java.lang.String getStateProvince() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[10], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "stateProvince" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetStateProvince() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[10], 0);
            return target;
        }
    }

    /**
     * True if has "stateProvince" element
     */
    @Override
    public boolean isSetStateProvince() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[10]) != 0;
        }
    }

    /**
     * Sets the "stateProvince" element
     */
    @Override
    public void setStateProvince(java.lang.String stateProvince) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[10], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[10]);
            }
            target.setStringValue(stateProvince);
        }
    }

    /**
     * Sets (as xml) the "stateProvince" element
     */
    @Override
    public void xsetStateProvince(org.apache.xmlbeans.XmlString stateProvince) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[10], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[10]);
            }
            target.set(stateProvince);
        }
    }

    /**
     * Unsets the "stateProvince" element
     */
    @Override
    public void unsetStateProvince() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[10], 0);
        }
    }

    /**
     * Gets the "timeZone" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getTimeZone() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().find_element_user(PROPERTY_QNAME[11], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "timeZone" element
     */
    @Override
    public boolean isSetTimeZone() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[11]) != 0;
        }
    }

    /**
     * Sets the "timeZone" element
     */
    @Override
    public void setTimeZone(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry timeZone) {
        generatedSetterHelperImpl(timeZone, PROPERTY_QNAME[11], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "timeZone" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewTimeZone() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().add_element_user(PROPERTY_QNAME[11]);
            return target;
        }
    }

    /**
     * Unsets the "timeZone" element
     */
    @Override
    public void unsetTimeZone() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[11], 0);
        }
    }

    /**
     * Gets the "typeOfAddress" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getTypeOfAddress() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().find_element_user(PROPERTY_QNAME[12], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "typeOfAddress" element
     */
    @Override
    public boolean isSetTypeOfAddress() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[12]) != 0;
        }
    }

    /**
     * Sets the "typeOfAddress" element
     */
    @Override
    public void setTypeOfAddress(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry typeOfAddress) {
        generatedSetterHelperImpl(typeOfAddress, PROPERTY_QNAME[12], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "typeOfAddress" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewTypeOfAddress() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().add_element_user(PROPERTY_QNAME[12]);
            return target;
        }
    }

    /**
     * Unsets the "typeOfAddress" element
     */
    @Override
    public void unsetTypeOfAddress() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[12], 0);
        }
    }

    /**
     * Gets the "typeOfLocation" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getTypeOfLocation() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().find_element_user(PROPERTY_QNAME[13], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "typeOfLocation" element
     */
    @Override
    public boolean isSetTypeOfLocation() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[13]) != 0;
        }
    }

    /**
     * Sets the "typeOfLocation" element
     */
    @Override
    public void setTypeOfLocation(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry typeOfLocation) {
        generatedSetterHelperImpl(typeOfLocation, PROPERTY_QNAME[13], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "typeOfLocation" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewTypeOfLocation() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().add_element_user(PROPERTY_QNAME[13]);
            return target;
        }
    }

    /**
     * Unsets the "typeOfLocation" element
     */
    @Override
    public void unsetTypeOfLocation() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[13], 0);
        }
    }
}
