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
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Parameter> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "parameter8815type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "entityBound" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Parameter.EntityBound> getEntityBoundList();

    /**
     * Gets array of all "entityBound" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Parameter.EntityBound[] getEntityBoundArray();

    /**
     * Gets ith "entityBound" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Parameter.EntityBound getEntityBoundArray(int i);

    /**
     * Returns number of "entityBound" element
     */
    int sizeOfEntityBoundArray();

    /**
     * Sets array of all "entityBound" element
     */
    void setEntityBoundArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Parameter.EntityBound[] entityBoundArray);

    /**
     * Sets ith "entityBound" element
     */
    void setEntityBoundArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Parameter.EntityBound entityBound);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "entityBound" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Parameter.EntityBound insertNewEntityBound(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "entityBound" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Parameter.EntityBound addNewEntityBound();

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

    /**
     * An XML entityBound(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface EntityBound extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Parameter.EntityBound> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "entitybound9cdcelemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * Gets the "isAssociationReference" attribute
         */
        boolean getIsAssociationReference();

        /**
         * Gets (as xml) the "isAssociationReference" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetIsAssociationReference();

        /**
         * True if has "isAssociationReference" attribute
         */
        boolean isSetIsAssociationReference();

        /**
         * Sets the "isAssociationReference" attribute
         */
        void setIsAssociationReference(boolean isAssociationReference);

        /**
         * Sets (as xml) the "isAssociationReference" attribute
         */
        void xsetIsAssociationReference(org.apache.xmlbeans.XmlBoolean isAssociationReference);

        /**
         * Unsets the "isAssociationReference" attribute
         */
        void unsetIsAssociationReference();
    }
}
