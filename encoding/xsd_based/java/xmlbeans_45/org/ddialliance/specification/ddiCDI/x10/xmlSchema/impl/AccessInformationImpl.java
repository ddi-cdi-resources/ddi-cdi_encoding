/*
 * XML Type:  AccessInformation
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.AccessInformation
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML AccessInformation(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class AccessInformationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.AccessInformation {
    private static final long serialVersionUID = 1L;

    public AccessInformationImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "copyright"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "embargo"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "license"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "rights"),
    };


    /**
     * Gets a List of "copyright" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString> getCopyrightList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getCopyrightArray,
                this::setCopyrightArray,
                this::insertNewCopyright,
                this::removeCopyright,
                this::sizeOfCopyrightArray
            );
        }
    }

    /**
     * Gets array of all "copyright" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString[] getCopyrightArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString[0]);
    }

    /**
     * Gets ith "copyright" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getCopyrightArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "copyright" element
     */
    @Override
    public int sizeOfCopyrightArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "copyright" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setCopyrightArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString[] copyrightArray) {
        check_orphaned();
        arraySetterHelper(copyrightArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "copyright" element
     */
    @Override
    public void setCopyrightArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString copyright) {
        generatedSetterHelperImpl(copyright, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "copyright" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString insertNewCopyright(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "copyright" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewCopyright() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "copyright" element
     */
    @Override
    public void removeCopyright(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }

    /**
     * Gets a List of "embargo" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.EmbargoInformation> getEmbargoList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getEmbargoArray,
                this::setEmbargoArray,
                this::insertNewEmbargo,
                this::removeEmbargo,
                this::sizeOfEmbargoArray
            );
        }
    }

    /**
     * Gets array of all "embargo" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.EmbargoInformation[] getEmbargoArray() {
        return getXmlObjectArray(PROPERTY_QNAME[1], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.EmbargoInformation[0]);
    }

    /**
     * Gets ith "embargo" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.EmbargoInformation getEmbargoArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.EmbargoInformation target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.EmbargoInformation)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "embargo" element
     */
    @Override
    public int sizeOfEmbargoArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets array of all "embargo" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setEmbargoArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.EmbargoInformation[] embargoArray) {
        check_orphaned();
        arraySetterHelper(embargoArray, PROPERTY_QNAME[1]);
    }

    /**
     * Sets ith "embargo" element
     */
    @Override
    public void setEmbargoArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.EmbargoInformation embargo) {
        generatedSetterHelperImpl(embargo, PROPERTY_QNAME[1], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "embargo" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.EmbargoInformation insertNewEmbargo(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.EmbargoInformation target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.EmbargoInformation)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "embargo" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.EmbargoInformation addNewEmbargo() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.EmbargoInformation target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.EmbargoInformation)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Removes the ith "embargo" element
     */
    @Override
    public void removeEmbargo(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], i);
        }
    }

    /**
     * Gets a List of "license" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.LicenseInformation> getLicenseList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getLicenseArray,
                this::setLicenseArray,
                this::insertNewLicense,
                this::removeLicense,
                this::sizeOfLicenseArray
            );
        }
    }

    /**
     * Gets array of all "license" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LicenseInformation[] getLicenseArray() {
        return getXmlObjectArray(PROPERTY_QNAME[2], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.LicenseInformation[0]);
    }

    /**
     * Gets ith "license" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LicenseInformation getLicenseArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LicenseInformation target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LicenseInformation)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "license" element
     */
    @Override
    public int sizeOfLicenseArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Sets array of all "license" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setLicenseArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.LicenseInformation[] licenseArray) {
        check_orphaned();
        arraySetterHelper(licenseArray, PROPERTY_QNAME[2]);
    }

    /**
     * Sets ith "license" element
     */
    @Override
    public void setLicenseArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.LicenseInformation license) {
        generatedSetterHelperImpl(license, PROPERTY_QNAME[2], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "license" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LicenseInformation insertNewLicense(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LicenseInformation target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LicenseInformation)get_store().insert_element_user(PROPERTY_QNAME[2], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "license" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LicenseInformation addNewLicense() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LicenseInformation target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LicenseInformation)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Removes the ith "license" element
     */
    @Override
    public void removeLicense(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], i);
        }
    }

    /**
     * Gets a List of "rights" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString> getRightsList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getRightsArray,
                this::setRightsArray,
                this::insertNewRights,
                this::removeRights,
                this::sizeOfRightsArray
            );
        }
    }

    /**
     * Gets array of all "rights" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString[] getRightsArray() {
        return getXmlObjectArray(PROPERTY_QNAME[3], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString[0]);
    }

    /**
     * Gets ith "rights" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getRightsArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().find_element_user(PROPERTY_QNAME[3], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "rights" element
     */
    @Override
    public int sizeOfRightsArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Sets array of all "rights" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setRightsArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString[] rightsArray) {
        check_orphaned();
        arraySetterHelper(rightsArray, PROPERTY_QNAME[3]);
    }

    /**
     * Sets ith "rights" element
     */
    @Override
    public void setRightsArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString rights) {
        generatedSetterHelperImpl(rights, PROPERTY_QNAME[3], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "rights" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString insertNewRights(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().insert_element_user(PROPERTY_QNAME[3], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "rights" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewRights() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Removes the ith "rights" element
     */
    @Override
    public void removeRights(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], i);
        }
    }
}
