/*
 * XML Type:  LicenseInformation
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.LicenseInformation
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML LicenseInformation(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class LicenseInformationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.LicenseInformation {
    private static final long serialVersionUID = 1L;

    public LicenseInformationImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "contact"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "description"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "licenseAgent"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "licenseReference"),
    };


    /**
     * Gets a List of "contact" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContactInformation> getContactList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getContactArray,
                this::setContactArray,
                this::insertNewContact,
                this::removeContact,
                this::sizeOfContactArray
            );
        }
    }

    /**
     * Gets array of all "contact" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContactInformation[] getContactArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContactInformation[0]);
    }

    /**
     * Gets ith "contact" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContactInformation getContactArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContactInformation target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContactInformation)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "contact" element
     */
    @Override
    public int sizeOfContactArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "contact" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setContactArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContactInformation[] contactArray) {
        check_orphaned();
        arraySetterHelper(contactArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "contact" element
     */
    @Override
    public void setContactArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContactInformation contact) {
        generatedSetterHelperImpl(contact, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "contact" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContactInformation insertNewContact(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContactInformation target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContactInformation)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "contact" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContactInformation addNewContact() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContactInformation target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContactInformation)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "contact" element
     */
    @Override
    public void removeContact(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }

    /**
     * Gets a List of "description" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString> getDescriptionList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getDescriptionArray,
                this::setDescriptionArray,
                this::insertNewDescription,
                this::removeDescription,
                this::sizeOfDescriptionArray
            );
        }
    }

    /**
     * Gets array of all "description" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString[] getDescriptionArray() {
        return getXmlObjectArray(PROPERTY_QNAME[1], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString[0]);
    }

    /**
     * Gets ith "description" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getDescriptionArray(int i) {
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
     * Returns number of "description" element
     */
    @Override
    public int sizeOfDescriptionArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets array of all "description" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setDescriptionArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString[] descriptionArray) {
        check_orphaned();
        arraySetterHelper(descriptionArray, PROPERTY_QNAME[1]);
    }

    /**
     * Sets ith "description" element
     */
    @Override
    public void setDescriptionArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString description) {
        generatedSetterHelperImpl(description, PROPERTY_QNAME[1], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "description" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString insertNewDescription(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "description" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewDescription() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Removes the ith "description" element
     */
    @Override
    public void removeDescription(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], i);
        }
    }

    /**
     * Gets a List of "licenseAgent" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole> getLicenseAgentList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getLicenseAgentArray,
                this::setLicenseAgentArray,
                this::insertNewLicenseAgent,
                this::removeLicenseAgent,
                this::sizeOfLicenseAgentArray
            );
        }
    }

    /**
     * Gets array of all "licenseAgent" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole[] getLicenseAgentArray() {
        return getXmlObjectArray(PROPERTY_QNAME[2], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole[0]);
    }

    /**
     * Gets ith "licenseAgent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole getLicenseAgentArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "licenseAgent" element
     */
    @Override
    public int sizeOfLicenseAgentArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Sets array of all "licenseAgent" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setLicenseAgentArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole[] licenseAgentArray) {
        check_orphaned();
        arraySetterHelper(licenseAgentArray, PROPERTY_QNAME[2]);
    }

    /**
     * Sets ith "licenseAgent" element
     */
    @Override
    public void setLicenseAgentArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole licenseAgent) {
        generatedSetterHelperImpl(licenseAgent, PROPERTY_QNAME[2], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "licenseAgent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole insertNewLicenseAgent(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole)get_store().insert_element_user(PROPERTY_QNAME[2], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "licenseAgent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole addNewLicenseAgent() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Removes the ith "licenseAgent" element
     */
    @Override
    public void removeLicenseAgent(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], i);
        }
    }

    /**
     * Gets a List of "licenseReference" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference> getLicenseReferenceList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getLicenseReferenceArray,
                this::setLicenseReferenceArray,
                this::insertNewLicenseReference,
                this::removeLicenseReference,
                this::sizeOfLicenseReferenceArray
            );
        }
    }

    /**
     * Gets array of all "licenseReference" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference[] getLicenseReferenceArray() {
        return getXmlObjectArray(PROPERTY_QNAME[3], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference[0]);
    }

    /**
     * Gets ith "licenseReference" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference getLicenseReferenceArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference)get_store().find_element_user(PROPERTY_QNAME[3], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "licenseReference" element
     */
    @Override
    public int sizeOfLicenseReferenceArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Sets array of all "licenseReference" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setLicenseReferenceArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference[] licenseReferenceArray) {
        check_orphaned();
        arraySetterHelper(licenseReferenceArray, PROPERTY_QNAME[3]);
    }

    /**
     * Sets ith "licenseReference" element
     */
    @Override
    public void setLicenseReferenceArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference licenseReference) {
        generatedSetterHelperImpl(licenseReference, PROPERTY_QNAME[3], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "licenseReference" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference insertNewLicenseReference(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference)get_store().insert_element_user(PROPERTY_QNAME[3], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "licenseReference" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference addNewLicenseReference() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Removes the ith "licenseReference" element
     */
    @Override
    public void removeLicenseReference(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], i);
        }
    }
}
