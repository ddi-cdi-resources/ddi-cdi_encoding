/*
 * XML Type:  LicenseInformation
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.LicenseInformation
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML LicenseInformation(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface LicenseInformation extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.LicenseInformation> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "licenseinformationa749type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "contact" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContactInformation> getContactList();

    /**
     * Gets array of all "contact" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContactInformation[] getContactArray();

    /**
     * Gets ith "contact" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContactInformation getContactArray(int i);

    /**
     * Returns number of "contact" element
     */
    int sizeOfContactArray();

    /**
     * Sets array of all "contact" element
     */
    void setContactArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContactInformation[] contactArray);

    /**
     * Sets ith "contact" element
     */
    void setContactArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContactInformation contact);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "contact" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContactInformation insertNewContact(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "contact" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContactInformation addNewContact();

    /**
     * Removes the ith "contact" element
     */
    void removeContact(int i);

    /**
     * Gets a List of "description" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString> getDescriptionList();

    /**
     * Gets array of all "description" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString[] getDescriptionArray();

    /**
     * Gets ith "description" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getDescriptionArray(int i);

    /**
     * Returns number of "description" element
     */
    int sizeOfDescriptionArray();

    /**
     * Sets array of all "description" element
     */
    void setDescriptionArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString[] descriptionArray);

    /**
     * Sets ith "description" element
     */
    void setDescriptionArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString description);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "description" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString insertNewDescription(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "description" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewDescription();

    /**
     * Removes the ith "description" element
     */
    void removeDescription(int i);

    /**
     * Gets a List of "licenseAgent" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole> getLicenseAgentList();

    /**
     * Gets array of all "licenseAgent" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole[] getLicenseAgentArray();

    /**
     * Gets ith "licenseAgent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole getLicenseAgentArray(int i);

    /**
     * Returns number of "licenseAgent" element
     */
    int sizeOfLicenseAgentArray();

    /**
     * Sets array of all "licenseAgent" element
     */
    void setLicenseAgentArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole[] licenseAgentArray);

    /**
     * Sets ith "licenseAgent" element
     */
    void setLicenseAgentArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole licenseAgent);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "licenseAgent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole insertNewLicenseAgent(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "licenseAgent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole addNewLicenseAgent();

    /**
     * Removes the ith "licenseAgent" element
     */
    void removeLicenseAgent(int i);

    /**
     * Gets a List of "licenseReference" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference> getLicenseReferenceList();

    /**
     * Gets array of all "licenseReference" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference[] getLicenseReferenceArray();

    /**
     * Gets ith "licenseReference" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference getLicenseReferenceArray(int i);

    /**
     * Returns number of "licenseReference" element
     */
    int sizeOfLicenseReferenceArray();

    /**
     * Sets array of all "licenseReference" element
     */
    void setLicenseReferenceArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference[] licenseReferenceArray);

    /**
     * Sets ith "licenseReference" element
     */
    void setLicenseReferenceArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference licenseReference);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "licenseReference" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference insertNewLicenseReference(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "licenseReference" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference addNewLicenseReference();

    /**
     * Removes the ith "licenseReference" element
     */
    void removeLicenseReference(int i);
}
