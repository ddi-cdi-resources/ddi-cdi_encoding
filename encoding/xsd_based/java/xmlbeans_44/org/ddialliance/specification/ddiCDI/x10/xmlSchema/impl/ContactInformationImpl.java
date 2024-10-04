/*
 * XML Type:  ContactInformation
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContactInformation
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML ContactInformation(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class ContactInformationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContactInformation {
    private static final long serialVersionUID = 1L;

    public ContactInformationImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "address"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "email"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "emessaging"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "telephone"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "website"),
    };


    /**
     * Gets a List of "address" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Address> getAddressList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getAddressArray,
                this::setAddressArray,
                this::insertNewAddress,
                this::removeAddress,
                this::sizeOfAddressArray
            );
        }
    }

    /**
     * Gets array of all "address" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Address[] getAddressArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.Address[0]);
    }

    /**
     * Gets ith "address" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Address getAddressArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Address target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Address)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "address" element
     */
    @Override
    public int sizeOfAddressArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "address" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setAddressArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Address[] addressArray) {
        check_orphaned();
        arraySetterHelper(addressArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "address" element
     */
    @Override
    public void setAddressArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Address address) {
        generatedSetterHelperImpl(address, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "address" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Address insertNewAddress(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Address target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Address)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "address" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Address addNewAddress() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Address target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Address)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "address" element
     */
    @Override
    public void removeAddress(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }

    /**
     * Gets a List of "email" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Email> getEmailList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getEmailArray,
                this::setEmailArray,
                this::insertNewEmail,
                this::removeEmail,
                this::sizeOfEmailArray
            );
        }
    }

    /**
     * Gets array of all "email" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Email[] getEmailArray() {
        return getXmlObjectArray(PROPERTY_QNAME[1], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.Email[0]);
    }

    /**
     * Gets ith "email" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Email getEmailArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Email target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Email)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "email" element
     */
    @Override
    public int sizeOfEmailArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets array of all "email" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setEmailArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Email[] emailArray) {
        check_orphaned();
        arraySetterHelper(emailArray, PROPERTY_QNAME[1]);
    }

    /**
     * Sets ith "email" element
     */
    @Override
    public void setEmailArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Email email) {
        generatedSetterHelperImpl(email, PROPERTY_QNAME[1], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "email" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Email insertNewEmail(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Email target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Email)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "email" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Email addNewEmail() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Email target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Email)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Removes the ith "email" element
     */
    @Override
    public void removeEmail(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], i);
        }
    }

    /**
     * Gets a List of "emessaging" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ElectronicMessageSystem> getEmessagingList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getEmessagingArray,
                this::setEmessagingArray,
                this::insertNewEmessaging,
                this::removeEmessaging,
                this::sizeOfEmessagingArray
            );
        }
    }

    /**
     * Gets array of all "emessaging" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ElectronicMessageSystem[] getEmessagingArray() {
        return getXmlObjectArray(PROPERTY_QNAME[2], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.ElectronicMessageSystem[0]);
    }

    /**
     * Gets ith "emessaging" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ElectronicMessageSystem getEmessagingArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ElectronicMessageSystem target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ElectronicMessageSystem)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "emessaging" element
     */
    @Override
    public int sizeOfEmessagingArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Sets array of all "emessaging" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setEmessagingArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ElectronicMessageSystem[] emessagingArray) {
        check_orphaned();
        arraySetterHelper(emessagingArray, PROPERTY_QNAME[2]);
    }

    /**
     * Sets ith "emessaging" element
     */
    @Override
    public void setEmessagingArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ElectronicMessageSystem emessaging) {
        generatedSetterHelperImpl(emessaging, PROPERTY_QNAME[2], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "emessaging" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ElectronicMessageSystem insertNewEmessaging(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ElectronicMessageSystem target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ElectronicMessageSystem)get_store().insert_element_user(PROPERTY_QNAME[2], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "emessaging" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ElectronicMessageSystem addNewEmessaging() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ElectronicMessageSystem target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ElectronicMessageSystem)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Removes the ith "emessaging" element
     */
    @Override
    public void removeEmessaging(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], i);
        }
    }

    /**
     * Gets a List of "telephone" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Telephone> getTelephoneList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getTelephoneArray,
                this::setTelephoneArray,
                this::insertNewTelephone,
                this::removeTelephone,
                this::sizeOfTelephoneArray
            );
        }
    }

    /**
     * Gets array of all "telephone" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Telephone[] getTelephoneArray() {
        return getXmlObjectArray(PROPERTY_QNAME[3], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.Telephone[0]);
    }

    /**
     * Gets ith "telephone" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Telephone getTelephoneArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Telephone target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Telephone)get_store().find_element_user(PROPERTY_QNAME[3], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "telephone" element
     */
    @Override
    public int sizeOfTelephoneArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Sets array of all "telephone" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setTelephoneArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Telephone[] telephoneArray) {
        check_orphaned();
        arraySetterHelper(telephoneArray, PROPERTY_QNAME[3]);
    }

    /**
     * Sets ith "telephone" element
     */
    @Override
    public void setTelephoneArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Telephone telephone) {
        generatedSetterHelperImpl(telephone, PROPERTY_QNAME[3], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "telephone" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Telephone insertNewTelephone(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Telephone target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Telephone)get_store().insert_element_user(PROPERTY_QNAME[3], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "telephone" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Telephone addNewTelephone() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Telephone target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Telephone)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Removes the ith "telephone" element
     */
    @Override
    public void removeTelephone(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], i);
        }
    }

    /**
     * Gets a List of "website" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.WebLink> getWebsiteList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getWebsiteArray,
                this::setWebsiteArray,
                this::insertNewWebsite,
                this::removeWebsite,
                this::sizeOfWebsiteArray
            );
        }
    }

    /**
     * Gets array of all "website" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.WebLink[] getWebsiteArray() {
        return getXmlObjectArray(PROPERTY_QNAME[4], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.WebLink[0]);
    }

    /**
     * Gets ith "website" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.WebLink getWebsiteArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.WebLink target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.WebLink)get_store().find_element_user(PROPERTY_QNAME[4], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "website" element
     */
    @Override
    public int sizeOfWebsiteArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[4]);
        }
    }

    /**
     * Sets array of all "website" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setWebsiteArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.WebLink[] websiteArray) {
        check_orphaned();
        arraySetterHelper(websiteArray, PROPERTY_QNAME[4]);
    }

    /**
     * Sets ith "website" element
     */
    @Override
    public void setWebsiteArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.WebLink website) {
        generatedSetterHelperImpl(website, PROPERTY_QNAME[4], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "website" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.WebLink insertNewWebsite(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.WebLink target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.WebLink)get_store().insert_element_user(PROPERTY_QNAME[4], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "website" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.WebLink addNewWebsite() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.WebLink target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.WebLink)get_store().add_element_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * Removes the ith "website" element
     */
    @Override
    public void removeWebsite(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[4], i);
        }
    }
}
