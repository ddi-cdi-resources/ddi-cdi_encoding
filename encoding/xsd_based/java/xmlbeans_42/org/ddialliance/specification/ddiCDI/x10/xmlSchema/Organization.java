/*
 * XML Type:  Organization
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.Organization
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML Organization(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface Organization extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.Agent {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Organization> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "organization0d11type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "contactInformation" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContactInformation getContactInformation();

    /**
     * True if has "contactInformation" element
     */
    boolean isSetContactInformation();

    /**
     * Sets the "contactInformation" element
     */
    void setContactInformation(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContactInformation contactInformation);

    /**
     * Appends and returns a new empty "contactInformation" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContactInformation addNewContactInformation();

    /**
     * Unsets the "contactInformation" element
     */
    void unsetContactInformation();

    /**
     * Gets a List of "organizationName" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.OrganizationName> getOrganizationNameList();

    /**
     * Gets array of all "organizationName" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.OrganizationName[] getOrganizationNameArray();

    /**
     * Gets ith "organizationName" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.OrganizationName getOrganizationNameArray(int i);

    /**
     * Returns number of "organizationName" element
     */
    int sizeOfOrganizationNameArray();

    /**
     * Sets array of all "organizationName" element
     */
    void setOrganizationNameArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.OrganizationName[] organizationNameArray);

    /**
     * Sets ith "organizationName" element
     */
    void setOrganizationNameArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.OrganizationName organizationName);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "organizationName" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.OrganizationName insertNewOrganizationName(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "organizationName" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.OrganizationName addNewOrganizationName();

    /**
     * Removes the ith "organizationName" element
     */
    void removeOrganizationName(int i);
}
