/*
 * An XML document type.
 * Localname: LicenseInformation
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.LicenseInformationDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one LicenseInformation(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class LicenseInformationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.LicenseInformationDocument {
    private static final long serialVersionUID = 1L;

    public LicenseInformationDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "LicenseInformation"),
    };


    /**
     * Gets the "LicenseInformation" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LicenseInformation getLicenseInformation() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LicenseInformation target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LicenseInformation)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "LicenseInformation" element
     */
    @Override
    public void setLicenseInformation(org.ddialliance.specification.ddiCDI.x10.xmlSchema.LicenseInformation licenseInformation) {
        generatedSetterHelperImpl(licenseInformation, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "LicenseInformation" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LicenseInformation addNewLicenseInformation() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LicenseInformation target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LicenseInformation)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
