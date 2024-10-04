/*
 * XML Type:  AccessLocation
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.AccessLocation
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML AccessLocation(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class AccessLocationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.AccessLocation {
    private static final long serialVersionUID = 1L;

    public AccessLocationImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "mimeType"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "physicalLocation"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "uri"),
    };


    /**
     * Gets the "mimeType" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getMimeType() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "mimeType" element
     */
    @Override
    public boolean isSetMimeType() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "mimeType" element
     */
    @Override
    public void setMimeType(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry mimeType) {
        generatedSetterHelperImpl(mimeType, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "mimeType" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewMimeType() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "mimeType" element
     */
    @Override
    public void unsetMimeType() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets a List of "physicalLocation" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString> getPhysicalLocationList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getPhysicalLocationArray,
                this::setPhysicalLocationArray,
                this::insertNewPhysicalLocation,
                this::removePhysicalLocation,
                this::sizeOfPhysicalLocationArray
            );
        }
    }

    /**
     * Gets array of all "physicalLocation" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString[] getPhysicalLocationArray() {
        return getXmlObjectArray(PROPERTY_QNAME[1], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString[0]);
    }

    /**
     * Gets ith "physicalLocation" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getPhysicalLocationArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "physicalLocation" element
     */
    @Override
    public int sizeOfPhysicalLocationArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets array of all "physicalLocation" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setPhysicalLocationArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString[] physicalLocationArray) {
        check_orphaned();
        arraySetterHelper(physicalLocationArray, PROPERTY_QNAME[1]);
    }

    /**
     * Sets ith "physicalLocation" element
     */
    @Override
    public void setPhysicalLocationArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString physicalLocation) {
        generatedSetterHelperImpl(physicalLocation, PROPERTY_QNAME[1], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "physicalLocation" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString insertNewPhysicalLocation(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "physicalLocation" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewPhysicalLocation() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Removes the ith "physicalLocation" element
     */
    @Override
    public void removePhysicalLocation(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], i);
        }
    }

    /**
     * Gets a List of "uri" elements
     */
    @Override
    public java.util.List<java.lang.String> getUriList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getUriArray,
                this::setUriArray,
                this::insertUri,
                this::removeUri,
                this::sizeOfUriArray
            );
        }
    }

    /**
     * Gets array of all "uri" elements
     */
    @Override
    public java.lang.String[] getUriArray() {
        return getObjectArray(PROPERTY_QNAME[2], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "uri" element
     */
    @Override
    public java.lang.String getUriArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) a List of "uri" elements
     */
    @Override
    public java.util.List<org.apache.xmlbeans.XmlAnyURI> xgetUriList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetUriArray,
                this::xsetUriArray,
                this::insertNewUri,
                this::removeUri,
                this::sizeOfUriArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "uri" elements
     */
    @Override
    public org.apache.xmlbeans.XmlAnyURI[] xgetUriArray() {
        return xgetArray(PROPERTY_QNAME[2], org.apache.xmlbeans.XmlAnyURI[]::new);
    }

    /**
     * Gets (as xml) ith "uri" element
     */
    @Override
    public org.apache.xmlbeans.XmlAnyURI xgetUriArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "uri" element
     */
    @Override
    public int sizeOfUriArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Sets array of all "uri" element
     */
    @Override
    public void setUriArray(java.lang.String[] uriArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(uriArray, PROPERTY_QNAME[2]);
        }
    }

    /**
     * Sets ith "uri" element
     */
    @Override
    public void setUriArray(int i, java.lang.String uri) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(uri);
        }
    }

    /**
     * Sets (as xml) array of all "uri" element
     */
    @Override
    public void xsetUriArray(org.apache.xmlbeans.XmlAnyURI[]uriArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(uriArray, PROPERTY_QNAME[2]);
        }
    }

    /**
     * Sets (as xml) ith "uri" element
     */
    @Override
    public void xsetUriArray(int i, org.apache.xmlbeans.XmlAnyURI uri) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(uri);
        }
    }

    /**
     * Inserts the value as the ith "uri" element
     */
    @Override
    public void insertUri(int i, java.lang.String uri) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[2], i);
            target.setStringValue(uri);
        }
    }

    /**
     * Appends the value as the last "uri" element
     */
    @Override
    public void addUri(java.lang.String uri) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[2]);
            target.setStringValue(uri);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "uri" element
     */
    @Override
    public org.apache.xmlbeans.XmlAnyURI insertNewUri(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().insert_element_user(PROPERTY_QNAME[2], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "uri" element
     */
    @Override
    public org.apache.xmlbeans.XmlAnyURI addNewUri() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Removes the ith "uri" element
     */
    @Override
    public void removeUri(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], i);
        }
    }
}
