/*
 * XML Type:  Organization
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.Organization
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML Organization(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class OrganizationImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AgentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.Organization {
    private static final long serialVersionUID = 1L;

    public OrganizationImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "contactInformation"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "organizationName"),
    };


    /**
     * Gets the "contactInformation" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContactInformation getContactInformation() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContactInformation target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContactInformation)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "contactInformation" element
     */
    @Override
    public boolean isSetContactInformation() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "contactInformation" element
     */
    @Override
    public void setContactInformation(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContactInformation contactInformation) {
        generatedSetterHelperImpl(contactInformation, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "contactInformation" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContactInformation addNewContactInformation() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContactInformation target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContactInformation)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "contactInformation" element
     */
    @Override
    public void unsetContactInformation() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets a List of "organizationName" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.OrganizationName> getOrganizationNameList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getOrganizationNameArray,
                this::setOrganizationNameArray,
                this::insertNewOrganizationName,
                this::removeOrganizationName,
                this::sizeOfOrganizationNameArray
            );
        }
    }

    /**
     * Gets array of all "organizationName" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.OrganizationName[] getOrganizationNameArray() {
        return getXmlObjectArray(PROPERTY_QNAME[1], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.OrganizationName[0]);
    }

    /**
     * Gets ith "organizationName" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.OrganizationName getOrganizationNameArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.OrganizationName target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.OrganizationName)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "organizationName" element
     */
    @Override
    public int sizeOfOrganizationNameArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets array of all "organizationName" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setOrganizationNameArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.OrganizationName[] organizationNameArray) {
        check_orphaned();
        arraySetterHelper(organizationNameArray, PROPERTY_QNAME[1]);
    }

    /**
     * Sets ith "organizationName" element
     */
    @Override
    public void setOrganizationNameArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.OrganizationName organizationName) {
        generatedSetterHelperImpl(organizationName, PROPERTY_QNAME[1], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "organizationName" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.OrganizationName insertNewOrganizationName(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.OrganizationName target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.OrganizationName)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "organizationName" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.OrganizationName addNewOrganizationName() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.OrganizationName target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.OrganizationName)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Removes the ith "organizationName" element
     */
    @Override
    public void removeOrganizationName(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], i);
        }
    }
}
