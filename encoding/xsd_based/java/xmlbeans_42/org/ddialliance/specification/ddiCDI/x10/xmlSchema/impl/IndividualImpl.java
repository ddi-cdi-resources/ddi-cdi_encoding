/*
 * XML Type:  Individual
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.Individual
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML Individual(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class IndividualImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AgentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.Individual {
    private static final long serialVersionUID = 1L;

    public IndividualImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "contactInformation"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "individualName"),
    };


    /**
     * Gets the "contactInformation" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContactInformation getContactInformation() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContactInformation target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContactInformation)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "contactInformation" element
     */
    @Override
    public boolean isSetContactInformation() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "contactInformation" element
     */
    @Override
    public void setContactInformation(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContactInformation contactInformation) {
        generatedSetterHelperImpl(contactInformation, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "contactInformation" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContactInformation addNewContactInformation() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContactInformation target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContactInformation)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "contactInformation" element
     */
    @Override
    public void unsetContactInformation() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets a List of "individualName" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.IndividualName> getIndividualNameList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getIndividualNameArray,
                this::setIndividualNameArray,
                this::insertNewIndividualName,
                this::removeIndividualName,
                this::sizeOfIndividualNameArray
            );
        }
    }

    /**
     * Gets array of all "individualName" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.IndividualName[] getIndividualNameArray() {
        return getXmlObjectArray(PROPERTY_QNAME[1], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.IndividualName[0]);
    }

    /**
     * Gets ith "individualName" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.IndividualName getIndividualNameArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.IndividualName target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.IndividualName)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "individualName" element
     */
    @Override
    public int sizeOfIndividualNameArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets array of all "individualName" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setIndividualNameArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.IndividualName[] individualNameArray) {
        check_orphaned();
        arraySetterHelper(individualNameArray, PROPERTY_QNAME[1]);
    }

    /**
     * Sets ith "individualName" element
     */
    @Override
    public void setIndividualNameArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.IndividualName individualName) {
        generatedSetterHelperImpl(individualName, PROPERTY_QNAME[1], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "individualName" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.IndividualName insertNewIndividualName(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.IndividualName target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.IndividualName)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "individualName" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.IndividualName addNewIndividualName() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.IndividualName target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.IndividualName)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Removes the ith "individualName" element
     */
    @Override
    public void removeIndividualName(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], i);
        }
    }
}
