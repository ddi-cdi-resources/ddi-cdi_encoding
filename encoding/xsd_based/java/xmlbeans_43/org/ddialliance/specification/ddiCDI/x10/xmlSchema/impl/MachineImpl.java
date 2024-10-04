/*
 * XML Type:  Machine
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.Machine
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML Machine(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class MachineImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AgentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.Machine {
    private static final long serialVersionUID = 1L;

    public MachineImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "accessLocation"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "function"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "machineInterface"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "name"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ownerOperatorContact"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "typeOfMachine"),
    };


    /**
     * Gets the "accessLocation" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AccessLocation getAccessLocation() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.AccessLocation target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.AccessLocation)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "accessLocation" element
     */
    @Override
    public boolean isSetAccessLocation() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "accessLocation" element
     */
    @Override
    public void setAccessLocation(org.ddialliance.specification.ddiCDI.x10.xmlSchema.AccessLocation accessLocation) {
        generatedSetterHelperImpl(accessLocation, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "accessLocation" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AccessLocation addNewAccessLocation() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.AccessLocation target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.AccessLocation)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "accessLocation" element
     */
    @Override
    public void unsetAccessLocation() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets a List of "function" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry> getFunctionList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getFunctionArray,
                this::setFunctionArray,
                this::insertNewFunction,
                this::removeFunction,
                this::sizeOfFunctionArray
            );
        }
    }

    /**
     * Gets array of all "function" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry[] getFunctionArray() {
        return getXmlObjectArray(PROPERTY_QNAME[1], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry[0]);
    }

    /**
     * Gets ith "function" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getFunctionArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "function" element
     */
    @Override
    public int sizeOfFunctionArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets array of all "function" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setFunctionArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry[] functionArray) {
        check_orphaned();
        arraySetterHelper(functionArray, PROPERTY_QNAME[1]);
    }

    /**
     * Sets ith "function" element
     */
    @Override
    public void setFunctionArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry function) {
        generatedSetterHelperImpl(function, PROPERTY_QNAME[1], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "function" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry insertNewFunction(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "function" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewFunction() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Removes the ith "function" element
     */
    @Override
    public void removeFunction(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], i);
        }
    }

    /**
     * Gets a List of "machineInterface" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry> getMachineInterfaceList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getMachineInterfaceArray,
                this::setMachineInterfaceArray,
                this::insertNewMachineInterface,
                this::removeMachineInterface,
                this::sizeOfMachineInterfaceArray
            );
        }
    }

    /**
     * Gets array of all "machineInterface" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry[] getMachineInterfaceArray() {
        return getXmlObjectArray(PROPERTY_QNAME[2], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry[0]);
    }

    /**
     * Gets ith "machineInterface" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getMachineInterfaceArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "machineInterface" element
     */
    @Override
    public int sizeOfMachineInterfaceArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Sets array of all "machineInterface" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setMachineInterfaceArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry[] machineInterfaceArray) {
        check_orphaned();
        arraySetterHelper(machineInterfaceArray, PROPERTY_QNAME[2]);
    }

    /**
     * Sets ith "machineInterface" element
     */
    @Override
    public void setMachineInterfaceArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry machineInterface) {
        generatedSetterHelperImpl(machineInterface, PROPERTY_QNAME[2], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "machineInterface" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry insertNewMachineInterface(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().insert_element_user(PROPERTY_QNAME[2], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "machineInterface" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewMachineInterface() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Removes the ith "machineInterface" element
     */
    @Override
    public void removeMachineInterface(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], i);
        }
    }

    /**
     * Gets a List of "name" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName> getNameList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getNameArray,
                this::setNameArray,
                this::insertNewName,
                this::removeName,
                this::sizeOfNameArray
            );
        }
    }

    /**
     * Gets array of all "name" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName[] getNameArray() {
        return getXmlObjectArray(PROPERTY_QNAME[3], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName[0]);
    }

    /**
     * Gets ith "name" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName getNameArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName)get_store().find_element_user(PROPERTY_QNAME[3], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "name" element
     */
    @Override
    public int sizeOfNameArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Sets array of all "name" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setNameArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName[] nameArray) {
        check_orphaned();
        arraySetterHelper(nameArray, PROPERTY_QNAME[3]);
    }

    /**
     * Sets ith "name" element
     */
    @Override
    public void setNameArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName name) {
        generatedSetterHelperImpl(name, PROPERTY_QNAME[3], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "name" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName insertNewName(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName)get_store().insert_element_user(PROPERTY_QNAME[3], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "name" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName addNewName() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Removes the ith "name" element
     */
    @Override
    public void removeName(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], i);
        }
    }

    /**
     * Gets the "ownerOperatorContact" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContactInformation getOwnerOperatorContact() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContactInformation target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContactInformation)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "ownerOperatorContact" element
     */
    @Override
    public boolean isSetOwnerOperatorContact() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[4]) != 0;
        }
    }

    /**
     * Sets the "ownerOperatorContact" element
     */
    @Override
    public void setOwnerOperatorContact(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContactInformation ownerOperatorContact) {
        generatedSetterHelperImpl(ownerOperatorContact, PROPERTY_QNAME[4], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "ownerOperatorContact" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContactInformation addNewOwnerOperatorContact() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContactInformation target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContactInformation)get_store().add_element_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * Unsets the "ownerOperatorContact" element
     */
    @Override
    public void unsetOwnerOperatorContact() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[4], 0);
        }
    }

    /**
     * Gets the "typeOfMachine" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getTypeOfMachine() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().find_element_user(PROPERTY_QNAME[5], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "typeOfMachine" element
     */
    @Override
    public boolean isSetTypeOfMachine() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[5]) != 0;
        }
    }

    /**
     * Sets the "typeOfMachine" element
     */
    @Override
    public void setTypeOfMachine(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry typeOfMachine) {
        generatedSetterHelperImpl(typeOfMachine, PROPERTY_QNAME[5], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "typeOfMachine" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewTypeOfMachine() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().add_element_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * Unsets the "typeOfMachine" element
     */
    @Override
    public void unsetTypeOfMachine() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[5], 0);
        }
    }
}
