/*
 * XML Type:  FundingInformation
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.FundingInformation
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML FundingInformation(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class FundingInformationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.FundingInformation {
    private static final long serialVersionUID = 1L;

    public FundingInformationImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "fundingAgent"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "grantNumber"),
    };


    /**
     * Gets a List of "fundingAgent" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole> getFundingAgentList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getFundingAgentArray,
                this::setFundingAgentArray,
                this::insertNewFundingAgent,
                this::removeFundingAgent,
                this::sizeOfFundingAgentArray
            );
        }
    }

    /**
     * Gets array of all "fundingAgent" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole[] getFundingAgentArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole[0]);
    }

    /**
     * Gets ith "fundingAgent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole getFundingAgentArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "fundingAgent" element
     */
    @Override
    public int sizeOfFundingAgentArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "fundingAgent" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setFundingAgentArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole[] fundingAgentArray) {
        check_orphaned();
        arraySetterHelper(fundingAgentArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "fundingAgent" element
     */
    @Override
    public void setFundingAgentArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole fundingAgent) {
        generatedSetterHelperImpl(fundingAgent, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "fundingAgent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole insertNewFundingAgent(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "fundingAgent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole addNewFundingAgent() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "fundingAgent" element
     */
    @Override
    public void removeFundingAgent(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }

    /**
     * Gets the "grantNumber" element
     */
    @Override
    public java.lang.String getGrantNumber() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "grantNumber" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetGrantNumber() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return target;
        }
    }

    /**
     * True if has "grantNumber" element
     */
    @Override
    public boolean isSetGrantNumber() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "grantNumber" element
     */
    @Override
    public void setGrantNumber(java.lang.String grantNumber) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.setStringValue(grantNumber);
        }
    }

    /**
     * Sets (as xml) the "grantNumber" element
     */
    @Override
    public void xsetGrantNumber(org.apache.xmlbeans.XmlString grantNumber) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.set(grantNumber);
        }
    }

    /**
     * Unsets the "grantNumber" element
     */
    @Override
    public void unsetGrantNumber() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }
}
