/*
 * XML Type:  Parameter
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.Parameter
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML Parameter(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface Parameter extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Parameter> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "parameter8815type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "entityBound" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference> getEntityBoundList();

    /**
     * Gets array of all "entityBound" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference[] getEntityBoundArray();

    /**
     * Gets ith "entityBound" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference getEntityBoundArray(int i);

    /**
     * Returns number of "entityBound" element
     */
    int sizeOfEntityBoundArray();

    /**
     * Sets array of all "entityBound" element
     */
    void setEntityBoundArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference[] entityBoundArray);

    /**
     * Sets ith "entityBound" element
     */
    void setEntityBoundArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference entityBound);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "entityBound" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference insertNewEntityBound(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "entityBound" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference addNewEntityBound();

    /**
     * Removes the ith "entityBound" element
     */
    void removeEntityBound(int i);

    /**
     * Gets the "identifier" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier getIdentifier();

    /**
     * True if has "identifier" element
     */
    boolean isSetIdentifier();

    /**
     * Sets the "identifier" element
     */
    void setIdentifier(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier identifier);

    /**
     * Appends and returns a new empty "identifier" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier addNewIdentifier();

    /**
     * Unsets the "identifier" element
     */
    void unsetIdentifier();

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
}
