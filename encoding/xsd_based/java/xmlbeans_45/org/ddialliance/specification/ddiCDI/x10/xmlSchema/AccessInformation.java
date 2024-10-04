/*
 * XML Type:  AccessInformation
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.AccessInformation
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML AccessInformation(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface AccessInformation extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.AccessInformation> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "accessinformationce14type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "copyright" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString> getCopyrightList();

    /**
     * Gets array of all "copyright" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString[] getCopyrightArray();

    /**
     * Gets ith "copyright" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getCopyrightArray(int i);

    /**
     * Returns number of "copyright" element
     */
    int sizeOfCopyrightArray();

    /**
     * Sets array of all "copyright" element
     */
    void setCopyrightArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString[] copyrightArray);

    /**
     * Sets ith "copyright" element
     */
    void setCopyrightArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString copyright);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "copyright" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString insertNewCopyright(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "copyright" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewCopyright();

    /**
     * Removes the ith "copyright" element
     */
    void removeCopyright(int i);

    /**
     * Gets a List of "embargo" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.EmbargoInformation> getEmbargoList();

    /**
     * Gets array of all "embargo" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.EmbargoInformation[] getEmbargoArray();

    /**
     * Gets ith "embargo" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.EmbargoInformation getEmbargoArray(int i);

    /**
     * Returns number of "embargo" element
     */
    int sizeOfEmbargoArray();

    /**
     * Sets array of all "embargo" element
     */
    void setEmbargoArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.EmbargoInformation[] embargoArray);

    /**
     * Sets ith "embargo" element
     */
    void setEmbargoArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.EmbargoInformation embargo);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "embargo" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.EmbargoInformation insertNewEmbargo(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "embargo" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.EmbargoInformation addNewEmbargo();

    /**
     * Removes the ith "embargo" element
     */
    void removeEmbargo(int i);

    /**
     * Gets a List of "license" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.LicenseInformation> getLicenseList();

    /**
     * Gets array of all "license" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LicenseInformation[] getLicenseArray();

    /**
     * Gets ith "license" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LicenseInformation getLicenseArray(int i);

    /**
     * Returns number of "license" element
     */
    int sizeOfLicenseArray();

    /**
     * Sets array of all "license" element
     */
    void setLicenseArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.LicenseInformation[] licenseArray);

    /**
     * Sets ith "license" element
     */
    void setLicenseArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.LicenseInformation license);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "license" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LicenseInformation insertNewLicense(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "license" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LicenseInformation addNewLicense();

    /**
     * Removes the ith "license" element
     */
    void removeLicense(int i);

    /**
     * Gets a List of "rights" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString> getRightsList();

    /**
     * Gets array of all "rights" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString[] getRightsArray();

    /**
     * Gets ith "rights" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getRightsArray(int i);

    /**
     * Returns number of "rights" element
     */
    int sizeOfRightsArray();

    /**
     * Sets array of all "rights" element
     */
    void setRightsArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString[] rightsArray);

    /**
     * Sets ith "rights" element
     */
    void setRightsArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString rights);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "rights" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString insertNewRights(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "rights" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewRights();

    /**
     * Removes the ith "rights" element
     */
    void removeRights(int i);
}
