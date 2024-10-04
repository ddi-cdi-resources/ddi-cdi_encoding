/*
 * An XML document type.
 * Localname: FundingInformation
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.FundingInformationDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one FundingInformation(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class FundingInformationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.FundingInformationDocument {
    private static final long serialVersionUID = 1L;

    public FundingInformationDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "FundingInformation"),
    };


    /**
     * Gets the "FundingInformation" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.FundingInformation getFundingInformation() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.FundingInformation target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.FundingInformation)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "FundingInformation" element
     */
    @Override
    public void setFundingInformation(org.ddialliance.specification.ddiCDI.x10.xmlSchema.FundingInformation fundingInformation) {
        generatedSetterHelperImpl(fundingInformation, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "FundingInformation" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.FundingInformation addNewFundingInformation() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.FundingInformation target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.FundingInformation)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
