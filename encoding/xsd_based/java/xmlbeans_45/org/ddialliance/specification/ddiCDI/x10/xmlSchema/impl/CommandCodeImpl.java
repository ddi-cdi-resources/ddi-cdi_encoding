/*
 * XML Type:  CommandCode
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandCode
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CommandCode(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class CommandCodeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandCode {
    private static final long serialVersionUID = 1L;

    public CommandCodeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "command"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "commandFile"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "description"),
    };


    /**
     * Gets a List of "command" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Command> getCommandList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getCommandArray,
                this::setCommandArray,
                this::insertNewCommand,
                this::removeCommand,
                this::sizeOfCommandArray
            );
        }
    }

    /**
     * Gets array of all "command" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Command[] getCommandArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.Command[0]);
    }

    /**
     * Gets ith "command" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Command getCommandArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Command target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Command)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "command" element
     */
    @Override
    public int sizeOfCommandArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "command" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setCommandArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Command[] commandArray) {
        check_orphaned();
        arraySetterHelper(commandArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "command" element
     */
    @Override
    public void setCommandArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Command command) {
        generatedSetterHelperImpl(command, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "command" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Command insertNewCommand(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Command target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Command)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "command" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Command addNewCommand() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Command target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Command)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "command" element
     */
    @Override
    public void removeCommand(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }

    /**
     * Gets a List of "commandFile" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandFile> getCommandFileList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getCommandFileArray,
                this::setCommandFileArray,
                this::insertNewCommandFile,
                this::removeCommandFile,
                this::sizeOfCommandFileArray
            );
        }
    }

    /**
     * Gets array of all "commandFile" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandFile[] getCommandFileArray() {
        return getXmlObjectArray(PROPERTY_QNAME[1], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandFile[0]);
    }

    /**
     * Gets ith "commandFile" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandFile getCommandFileArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandFile target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandFile)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "commandFile" element
     */
    @Override
    public int sizeOfCommandFileArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets array of all "commandFile" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setCommandFileArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandFile[] commandFileArray) {
        check_orphaned();
        arraySetterHelper(commandFileArray, PROPERTY_QNAME[1]);
    }

    /**
     * Sets ith "commandFile" element
     */
    @Override
    public void setCommandFileArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandFile commandFile) {
        generatedSetterHelperImpl(commandFile, PROPERTY_QNAME[1], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "commandFile" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandFile insertNewCommandFile(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandFile target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandFile)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "commandFile" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandFile addNewCommandFile() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandFile target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandFile)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Removes the ith "commandFile" element
     */
    @Override
    public void removeCommandFile(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], i);
        }
    }

    /**
     * Gets the "description" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getDescription() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "description" element
     */
    @Override
    public boolean isSetDescription() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "description" element
     */
    @Override
    public void setDescription(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString description) {
        generatedSetterHelperImpl(description, PROPERTY_QNAME[2], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "description" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewDescription() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Unsets the "description" element
     */
    @Override
    public void unsetDescription() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }
}
