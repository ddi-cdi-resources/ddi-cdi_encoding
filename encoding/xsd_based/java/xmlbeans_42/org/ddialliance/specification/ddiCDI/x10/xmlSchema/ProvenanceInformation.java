/*
 * XML Type:  ProvenanceInformation
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProvenanceInformation
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ProvenanceInformation(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface ProvenanceInformation extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProvenanceInformation> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "provenanceinformationa737type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "funding" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.FundingInformation> getFundingList();

    /**
     * Gets array of all "funding" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.FundingInformation[] getFundingArray();

    /**
     * Gets ith "funding" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.FundingInformation getFundingArray(int i);

    /**
     * Returns number of "funding" element
     */
    int sizeOfFundingArray();

    /**
     * Sets array of all "funding" element
     */
    void setFundingArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.FundingInformation[] fundingArray);

    /**
     * Sets ith "funding" element
     */
    void setFundingArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.FundingInformation funding);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "funding" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.FundingInformation insertNewFunding(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "funding" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.FundingInformation addNewFunding();

    /**
     * Removes the ith "funding" element
     */
    void removeFunding(int i);

    /**
     * Gets a List of "provenanceStatement" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString> getProvenanceStatementList();

    /**
     * Gets array of all "provenanceStatement" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString[] getProvenanceStatementArray();

    /**
     * Gets ith "provenanceStatement" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getProvenanceStatementArray(int i);

    /**
     * Returns number of "provenanceStatement" element
     */
    int sizeOfProvenanceStatementArray();

    /**
     * Sets array of all "provenanceStatement" element
     */
    void setProvenanceStatementArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString[] provenanceStatementArray);

    /**
     * Sets ith "provenanceStatement" element
     */
    void setProvenanceStatementArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString provenanceStatement);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "provenanceStatement" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString insertNewProvenanceStatement(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "provenanceStatement" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewProvenanceStatement();

    /**
     * Removes the ith "provenanceStatement" element
     */
    void removeProvenanceStatement(int i);

    /**
     * Gets the "recordCreationDate" element
     */
    java.util.Calendar getRecordCreationDate();

    /**
     * Gets (as xml) the "recordCreationDate" element
     */
    org.apache.xmlbeans.XmlDate xgetRecordCreationDate();

    /**
     * True if has "recordCreationDate" element
     */
    boolean isSetRecordCreationDate();

    /**
     * Sets the "recordCreationDate" element
     */
    void setRecordCreationDate(java.util.Calendar recordCreationDate);

    /**
     * Sets (as xml) the "recordCreationDate" element
     */
    void xsetRecordCreationDate(org.apache.xmlbeans.XmlDate recordCreationDate);

    /**
     * Unsets the "recordCreationDate" element
     */
    void unsetRecordCreationDate();

    /**
     * Gets the "recordLastRevisionDate" element
     */
    java.util.Calendar getRecordLastRevisionDate();

    /**
     * Gets (as xml) the "recordLastRevisionDate" element
     */
    org.apache.xmlbeans.XmlDate xgetRecordLastRevisionDate();

    /**
     * True if has "recordLastRevisionDate" element
     */
    boolean isSetRecordLastRevisionDate();

    /**
     * Sets the "recordLastRevisionDate" element
     */
    void setRecordLastRevisionDate(java.util.Calendar recordLastRevisionDate);

    /**
     * Sets (as xml) the "recordLastRevisionDate" element
     */
    void xsetRecordLastRevisionDate(org.apache.xmlbeans.XmlDate recordLastRevisionDate);

    /**
     * Unsets the "recordLastRevisionDate" element
     */
    void unsetRecordLastRevisionDate();
}
