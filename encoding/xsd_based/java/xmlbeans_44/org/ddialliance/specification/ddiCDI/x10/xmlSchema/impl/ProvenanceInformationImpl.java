/*
 * XML Type:  ProvenanceInformation
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProvenanceInformation
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML ProvenanceInformation(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class ProvenanceInformationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProvenanceInformation {
    private static final long serialVersionUID = 1L;

    public ProvenanceInformationImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "funding"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "provenanceStatement"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "recordCreationDate"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "recordLastRevisionDate"),
    };


    /**
     * Gets a List of "funding" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.FundingInformation> getFundingList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getFundingArray,
                this::setFundingArray,
                this::insertNewFunding,
                this::removeFunding,
                this::sizeOfFundingArray
            );
        }
    }

    /**
     * Gets array of all "funding" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.FundingInformation[] getFundingArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.FundingInformation[0]);
    }

    /**
     * Gets ith "funding" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.FundingInformation getFundingArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.FundingInformation target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.FundingInformation)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "funding" element
     */
    @Override
    public int sizeOfFundingArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "funding" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setFundingArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.FundingInformation[] fundingArray) {
        check_orphaned();
        arraySetterHelper(fundingArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "funding" element
     */
    @Override
    public void setFundingArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.FundingInformation funding) {
        generatedSetterHelperImpl(funding, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "funding" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.FundingInformation insertNewFunding(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.FundingInformation target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.FundingInformation)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "funding" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.FundingInformation addNewFunding() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.FundingInformation target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.FundingInformation)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "funding" element
     */
    @Override
    public void removeFunding(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }

    /**
     * Gets a List of "provenanceStatement" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString> getProvenanceStatementList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getProvenanceStatementArray,
                this::setProvenanceStatementArray,
                this::insertNewProvenanceStatement,
                this::removeProvenanceStatement,
                this::sizeOfProvenanceStatementArray
            );
        }
    }

    /**
     * Gets array of all "provenanceStatement" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString[] getProvenanceStatementArray() {
        return getXmlObjectArray(PROPERTY_QNAME[1], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString[0]);
    }

    /**
     * Gets ith "provenanceStatement" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getProvenanceStatementArray(int i) {
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
     * Returns number of "provenanceStatement" element
     */
    @Override
    public int sizeOfProvenanceStatementArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets array of all "provenanceStatement" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setProvenanceStatementArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString[] provenanceStatementArray) {
        check_orphaned();
        arraySetterHelper(provenanceStatementArray, PROPERTY_QNAME[1]);
    }

    /**
     * Sets ith "provenanceStatement" element
     */
    @Override
    public void setProvenanceStatementArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString provenanceStatement) {
        generatedSetterHelperImpl(provenanceStatement, PROPERTY_QNAME[1], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "provenanceStatement" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString insertNewProvenanceStatement(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "provenanceStatement" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewProvenanceStatement() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Removes the ith "provenanceStatement" element
     */
    @Override
    public void removeProvenanceStatement(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], i);
        }
    }

    /**
     * Gets the "recordCreationDate" element
     */
    @Override
    public java.util.Calendar getRecordCreationDate() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target.getCalendarValue();
        }
    }

    /**
     * Gets (as xml) the "recordCreationDate" element
     */
    @Override
    public org.apache.xmlbeans.XmlDate xgetRecordCreationDate() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return target;
        }
    }

    /**
     * True if has "recordCreationDate" element
     */
    @Override
    public boolean isSetRecordCreationDate() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "recordCreationDate" element
     */
    @Override
    public void setRecordCreationDate(java.util.Calendar recordCreationDate) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[2]);
            }
            target.setCalendarValue(recordCreationDate);
        }
    }

    /**
     * Sets (as xml) the "recordCreationDate" element
     */
    @Override
    public void xsetRecordCreationDate(org.apache.xmlbeans.XmlDate recordCreationDate) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(PROPERTY_QNAME[2]);
            }
            target.set(recordCreationDate);
        }
    }

    /**
     * Unsets the "recordCreationDate" element
     */
    @Override
    public void unsetRecordCreationDate() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }

    /**
     * Gets the "recordLastRevisionDate" element
     */
    @Override
    public java.util.Calendar getRecordLastRevisionDate() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            return (target == null) ? null : target.getCalendarValue();
        }
    }

    /**
     * Gets (as xml) the "recordLastRevisionDate" element
     */
    @Override
    public org.apache.xmlbeans.XmlDate xgetRecordLastRevisionDate() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            return target;
        }
    }

    /**
     * True if has "recordLastRevisionDate" element
     */
    @Override
    public boolean isSetRecordLastRevisionDate() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]) != 0;
        }
    }

    /**
     * Sets the "recordLastRevisionDate" element
     */
    @Override
    public void setRecordLastRevisionDate(java.util.Calendar recordLastRevisionDate) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[3]);
            }
            target.setCalendarValue(recordLastRevisionDate);
        }
    }

    /**
     * Sets (as xml) the "recordLastRevisionDate" element
     */
    @Override
    public void xsetRecordLastRevisionDate(org.apache.xmlbeans.XmlDate recordLastRevisionDate) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(PROPERTY_QNAME[3]);
            }
            target.set(recordLastRevisionDate);
        }
    }

    /**
     * Unsets the "recordLastRevisionDate" element
     */
    @Override
    public void unsetRecordLastRevisionDate() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], 0);
        }
    }
}
