/*
 * XML Type:  Machine
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.Machine
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML Machine(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface Machine extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.Agent {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Machine> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "machine0173type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "accessLocation" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AccessLocation getAccessLocation();

    /**
     * True if has "accessLocation" element
     */
    boolean isSetAccessLocation();

    /**
     * Sets the "accessLocation" element
     */
    void setAccessLocation(org.ddialliance.specification.ddiCDI.x10.xmlSchema.AccessLocation accessLocation);

    /**
     * Appends and returns a new empty "accessLocation" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AccessLocation addNewAccessLocation();

    /**
     * Unsets the "accessLocation" element
     */
    void unsetAccessLocation();

    /**
     * Gets a List of "function" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry> getFunctionList();

    /**
     * Gets array of all "function" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry[] getFunctionArray();

    /**
     * Gets ith "function" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getFunctionArray(int i);

    /**
     * Returns number of "function" element
     */
    int sizeOfFunctionArray();

    /**
     * Sets array of all "function" element
     */
    void setFunctionArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry[] functionArray);

    /**
     * Sets ith "function" element
     */
    void setFunctionArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry function);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "function" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry insertNewFunction(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "function" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewFunction();

    /**
     * Removes the ith "function" element
     */
    void removeFunction(int i);

    /**
     * Gets a List of "machineInterface" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry> getMachineInterfaceList();

    /**
     * Gets array of all "machineInterface" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry[] getMachineInterfaceArray();

    /**
     * Gets ith "machineInterface" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getMachineInterfaceArray(int i);

    /**
     * Returns number of "machineInterface" element
     */
    int sizeOfMachineInterfaceArray();

    /**
     * Sets array of all "machineInterface" element
     */
    void setMachineInterfaceArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry[] machineInterfaceArray);

    /**
     * Sets ith "machineInterface" element
     */
    void setMachineInterfaceArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry machineInterface);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "machineInterface" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry insertNewMachineInterface(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "machineInterface" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewMachineInterface();

    /**
     * Removes the ith "machineInterface" element
     */
    void removeMachineInterface(int i);

    /**
     * Gets a List of "name" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName> getNameList();

    /**
     * Gets array of all "name" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName[] getNameArray();

    /**
     * Gets ith "name" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName getNameArray(int i);

    /**
     * Returns number of "name" element
     */
    int sizeOfNameArray();

    /**
     * Sets array of all "name" element
     */
    void setNameArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName[] nameArray);

    /**
     * Sets ith "name" element
     */
    void setNameArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName name);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "name" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName insertNewName(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "name" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName addNewName();

    /**
     * Removes the ith "name" element
     */
    void removeName(int i);

    /**
     * Gets the "ownerOperatorContact" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContactInformation getOwnerOperatorContact();

    /**
     * True if has "ownerOperatorContact" element
     */
    boolean isSetOwnerOperatorContact();

    /**
     * Sets the "ownerOperatorContact" element
     */
    void setOwnerOperatorContact(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContactInformation ownerOperatorContact);

    /**
     * Appends and returns a new empty "ownerOperatorContact" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContactInformation addNewOwnerOperatorContact();

    /**
     * Unsets the "ownerOperatorContact" element
     */
    void unsetOwnerOperatorContact();

    /**
     * Gets the "typeOfMachine" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getTypeOfMachine();

    /**
     * True if has "typeOfMachine" element
     */
    boolean isSetTypeOfMachine();

    /**
     * Sets the "typeOfMachine" element
     */
    void setTypeOfMachine(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry typeOfMachine);

    /**
     * Appends and returns a new empty "typeOfMachine" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewTypeOfMachine();

    /**
     * Unsets the "typeOfMachine" element
     */
    void unsetTypeOfMachine();
}
