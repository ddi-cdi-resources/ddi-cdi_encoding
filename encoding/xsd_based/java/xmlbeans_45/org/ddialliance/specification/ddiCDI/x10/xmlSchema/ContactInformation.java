/*
 * XML Type:  ContactInformation
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContactInformation
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ContactInformation(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface ContactInformation extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContactInformation> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "contactinformationb68atype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "address" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Address> getAddressList();

    /**
     * Gets array of all "address" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Address[] getAddressArray();

    /**
     * Gets ith "address" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Address getAddressArray(int i);

    /**
     * Returns number of "address" element
     */
    int sizeOfAddressArray();

    /**
     * Sets array of all "address" element
     */
    void setAddressArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Address[] addressArray);

    /**
     * Sets ith "address" element
     */
    void setAddressArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Address address);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "address" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Address insertNewAddress(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "address" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Address addNewAddress();

    /**
     * Removes the ith "address" element
     */
    void removeAddress(int i);

    /**
     * Gets a List of "email" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Email> getEmailList();

    /**
     * Gets array of all "email" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Email[] getEmailArray();

    /**
     * Gets ith "email" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Email getEmailArray(int i);

    /**
     * Returns number of "email" element
     */
    int sizeOfEmailArray();

    /**
     * Sets array of all "email" element
     */
    void setEmailArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Email[] emailArray);

    /**
     * Sets ith "email" element
     */
    void setEmailArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Email email);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "email" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Email insertNewEmail(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "email" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Email addNewEmail();

    /**
     * Removes the ith "email" element
     */
    void removeEmail(int i);

    /**
     * Gets a List of "emessaging" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ElectronicMessageSystem> getEmessagingList();

    /**
     * Gets array of all "emessaging" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ElectronicMessageSystem[] getEmessagingArray();

    /**
     * Gets ith "emessaging" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ElectronicMessageSystem getEmessagingArray(int i);

    /**
     * Returns number of "emessaging" element
     */
    int sizeOfEmessagingArray();

    /**
     * Sets array of all "emessaging" element
     */
    void setEmessagingArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ElectronicMessageSystem[] emessagingArray);

    /**
     * Sets ith "emessaging" element
     */
    void setEmessagingArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ElectronicMessageSystem emessaging);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "emessaging" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ElectronicMessageSystem insertNewEmessaging(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "emessaging" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ElectronicMessageSystem addNewEmessaging();

    /**
     * Removes the ith "emessaging" element
     */
    void removeEmessaging(int i);

    /**
     * Gets a List of "telephone" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Telephone> getTelephoneList();

    /**
     * Gets array of all "telephone" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Telephone[] getTelephoneArray();

    /**
     * Gets ith "telephone" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Telephone getTelephoneArray(int i);

    /**
     * Returns number of "telephone" element
     */
    int sizeOfTelephoneArray();

    /**
     * Sets array of all "telephone" element
     */
    void setTelephoneArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Telephone[] telephoneArray);

    /**
     * Sets ith "telephone" element
     */
    void setTelephoneArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Telephone telephone);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "telephone" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Telephone insertNewTelephone(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "telephone" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Telephone addNewTelephone();

    /**
     * Removes the ith "telephone" element
     */
    void removeTelephone(int i);

    /**
     * Gets a List of "website" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.WebLink> getWebsiteList();

    /**
     * Gets array of all "website" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.WebLink[] getWebsiteArray();

    /**
     * Gets ith "website" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.WebLink getWebsiteArray(int i);

    /**
     * Returns number of "website" element
     */
    int sizeOfWebsiteArray();

    /**
     * Sets array of all "website" element
     */
    void setWebsiteArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.WebLink[] websiteArray);

    /**
     * Sets ith "website" element
     */
    void setWebsiteArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.WebLink website);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "website" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.WebLink insertNewWebsite(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "website" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.WebLink addNewWebsite();

    /**
     * Removes the ith "website" element
     */
    void removeWebsite(int i);
}
