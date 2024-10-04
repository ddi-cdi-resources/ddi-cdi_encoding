/*
 * XML Type:  Individual
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.Individual
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML Individual(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface Individual extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.Agent {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Individual> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "individual03b7type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "contactInformation" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContactInformation getContactInformation();

    /**
     * True if has "contactInformation" element
     */
    boolean isSetContactInformation();

    /**
     * Sets the "contactInformation" element
     */
    void setContactInformation(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContactInformation contactInformation);

    /**
     * Appends and returns a new empty "contactInformation" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContactInformation addNewContactInformation();

    /**
     * Unsets the "contactInformation" element
     */
    void unsetContactInformation();

    /**
     * Gets a List of "individualName" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.IndividualName> getIndividualNameList();

    /**
     * Gets array of all "individualName" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.IndividualName[] getIndividualNameArray();

    /**
     * Gets ith "individualName" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.IndividualName getIndividualNameArray(int i);

    /**
     * Returns number of "individualName" element
     */
    int sizeOfIndividualNameArray();

    /**
     * Sets array of all "individualName" element
     */
    void setIndividualNameArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.IndividualName[] individualNameArray);

    /**
     * Sets ith "individualName" element
     */
    void setIndividualNameArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.IndividualName individualName);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "individualName" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.IndividualName insertNewIndividualName(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "individualName" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.IndividualName addNewIndividualName();

    /**
     * Removes the ith "individualName" element
     */
    void removeIndividualName(int i);
}
