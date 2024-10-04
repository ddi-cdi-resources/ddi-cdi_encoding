/*
 * XML Type:  CommandCode
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandCode
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CommandCode(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface CommandCode extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandCode> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "commandcode4604type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "command" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Command> getCommandList();

    /**
     * Gets array of all "command" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Command[] getCommandArray();

    /**
     * Gets ith "command" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Command getCommandArray(int i);

    /**
     * Returns number of "command" element
     */
    int sizeOfCommandArray();

    /**
     * Sets array of all "command" element
     */
    void setCommandArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Command[] commandArray);

    /**
     * Sets ith "command" element
     */
    void setCommandArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Command command);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "command" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Command insertNewCommand(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "command" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Command addNewCommand();

    /**
     * Removes the ith "command" element
     */
    void removeCommand(int i);

    /**
     * Gets a List of "commandFile" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandFile> getCommandFileList();

    /**
     * Gets array of all "commandFile" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandFile[] getCommandFileArray();

    /**
     * Gets ith "commandFile" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandFile getCommandFileArray(int i);

    /**
     * Returns number of "commandFile" element
     */
    int sizeOfCommandFileArray();

    /**
     * Sets array of all "commandFile" element
     */
    void setCommandFileArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandFile[] commandFileArray);

    /**
     * Sets ith "commandFile" element
     */
    void setCommandFileArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandFile commandFile);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "commandFile" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandFile insertNewCommandFile(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "commandFile" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandFile addNewCommandFile();

    /**
     * Removes the ith "commandFile" element
     */
    void removeCommandFile(int i);

    /**
     * Gets the "description" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getDescription();

    /**
     * True if has "description" element
     */
    boolean isSetDescription();

    /**
     * Sets the "description" element
     */
    void setDescription(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString description);

    /**
     * Appends and returns a new empty "description" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewDescription();

    /**
     * Unsets the "description" element
     */
    void unsetDescription();
}
