/*
 * XML Type:  FundingInformation
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.FundingInformation
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML FundingInformation(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface FundingInformation extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.FundingInformation> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "fundinginformation7d0dtype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "fundingAgent" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole> getFundingAgentList();

    /**
     * Gets array of all "fundingAgent" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole[] getFundingAgentArray();

    /**
     * Gets ith "fundingAgent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole getFundingAgentArray(int i);

    /**
     * Returns number of "fundingAgent" element
     */
    int sizeOfFundingAgentArray();

    /**
     * Sets array of all "fundingAgent" element
     */
    void setFundingAgentArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole[] fundingAgentArray);

    /**
     * Sets ith "fundingAgent" element
     */
    void setFundingAgentArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole fundingAgent);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "fundingAgent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole insertNewFundingAgent(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "fundingAgent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole addNewFundingAgent();

    /**
     * Removes the ith "fundingAgent" element
     */
    void removeFundingAgent(int i);

    /**
     * Gets the "grantNumber" element
     */
    java.lang.String getGrantNumber();

    /**
     * Gets (as xml) the "grantNumber" element
     */
    org.apache.xmlbeans.XmlString xgetGrantNumber();

    /**
     * True if has "grantNumber" element
     */
    boolean isSetGrantNumber();

    /**
     * Sets the "grantNumber" element
     */
    void setGrantNumber(java.lang.String grantNumber);

    /**
     * Sets (as xml) the "grantNumber" element
     */
    void xsetGrantNumber(org.apache.xmlbeans.XmlString grantNumber);

    /**
     * Unsets the "grantNumber" element
     */
    void unsetGrantNumber();
}
