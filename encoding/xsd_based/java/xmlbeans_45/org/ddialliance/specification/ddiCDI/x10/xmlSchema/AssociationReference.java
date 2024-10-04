/*
 * XML Type:  AssociationReference
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML AssociationReference(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface AssociationReference extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "associationreference3628type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ddiReference" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalRegistrationDataIdentifier getDdiReference();

    /**
     * True if has "ddiReference" element
     */
    boolean isSetDdiReference();

    /**
     * Sets the "ddiReference" element
     */
    void setDdiReference(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalRegistrationDataIdentifier ddiReference);

    /**
     * Appends and returns a new empty "ddiReference" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalRegistrationDataIdentifier addNewDdiReference();

    /**
     * Unsets the "ddiReference" element
     */
    void unsetDdiReference();

    /**
     * Gets a List of "validType" elements
     */
    java.util.List<java.lang.String> getValidTypeList();

    /**
     * Gets array of all "validType" elements
     */
    java.lang.String[] getValidTypeArray();

    /**
     * Gets ith "validType" element
     */
    java.lang.String getValidTypeArray(int i);

    /**
     * Gets (as xml) a List of "validType" elements
     */
    java.util.List<org.apache.xmlbeans.XmlString> xgetValidTypeList();

    /**
     * Gets (as xml) array of all "validType" elements
     */
    org.apache.xmlbeans.XmlString[] xgetValidTypeArray();

    /**
     * Gets (as xml) ith "validType" element
     */
    org.apache.xmlbeans.XmlString xgetValidTypeArray(int i);

    /**
     * Returns number of "validType" element
     */
    int sizeOfValidTypeArray();

    /**
     * Sets array of all "validType" element
     */
    void setValidTypeArray(java.lang.String[] validTypeArray);

    /**
     * Sets ith "validType" element
     */
    void setValidTypeArray(int i, java.lang.String validType);

    /**
     * Sets (as xml) array of all "validType" element
     */
    void xsetValidTypeArray(org.apache.xmlbeans.XmlString[] validTypeArray);

    /**
     * Sets (as xml) ith "validType" element
     */
    void xsetValidTypeArray(int i, org.apache.xmlbeans.XmlString validType);

    /**
     * Inserts the value as the ith "validType" element
     */
    void insertValidType(int i, java.lang.String validType);

    /**
     * Appends the value as the last "validType" element
     */
    void addValidType(java.lang.String validType);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "validType" element
     */
    org.apache.xmlbeans.XmlString insertNewValidType(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "validType" element
     */
    org.apache.xmlbeans.XmlString addNewValidType();

    /**
     * Removes the ith "validType" element
     */
    void removeValidType(int i);

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
