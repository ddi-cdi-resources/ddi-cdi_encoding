/*
 * An XML document type.
 * Localname: FundingInformation
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.FundingInformationDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one FundingInformation(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface FundingInformationDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.FundingInformationDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "fundinginformation1f1ddoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "FundingInformation" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.FundingInformation getFundingInformation();

    /**
     * Sets the "FundingInformation" element
     */
    void setFundingInformation(org.ddialliance.specification.ddiCDI.x10.xmlSchema.FundingInformation fundingInformation);

    /**
     * Appends and returns a new empty "FundingInformation" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.FundingInformation addNewFundingInformation();
}
