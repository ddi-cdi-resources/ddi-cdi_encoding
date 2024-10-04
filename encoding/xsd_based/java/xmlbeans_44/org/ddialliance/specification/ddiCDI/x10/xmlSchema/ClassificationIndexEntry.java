/*
 * XML Type:  ClassificationIndexEntry
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntry
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ClassificationIndexEntry(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface ClassificationIndexEntry extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntry> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "classificationindexentry8f24type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "catalogDetails" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails getCatalogDetails();

    /**
     * True if has "catalogDetails" element
     */
    boolean isSetCatalogDetails();

    /**
     * Sets the "catalogDetails" element
     */
    void setCatalogDetails(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails catalogDetails);

    /**
     * Appends and returns a new empty "catalogDetails" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails addNewCatalogDetails();

    /**
     * Unsets the "catalogDetails" element
     */
    void unsetCatalogDetails();

    /**
     * Gets the "codingInstruction" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandCode getCodingInstruction();

    /**
     * True if has "codingInstruction" element
     */
    boolean isSetCodingInstruction();

    /**
     * Sets the "codingInstruction" element
     */
    void setCodingInstruction(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandCode codingInstruction);

    /**
     * Appends and returns a new empty "codingInstruction" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandCode addNewCodingInstruction();

    /**
     * Unsets the "codingInstruction" element
     */
    void unsetCodingInstruction();

    /**
     * Gets the "entry" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getEntry();

    /**
     * True if has "entry" element
     */
    boolean isSetEntry();

    /**
     * Sets the "entry" element
     */
    void setEntry(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString entry);

    /**
     * Appends and returns a new empty "entry" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewEntry();

    /**
     * Unsets the "entry" element
     */
    void unsetEntry();

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
     * Gets the "validDates" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange getValidDates();

    /**
     * True if has "validDates" element
     */
    boolean isSetValidDates();

    /**
     * Sets the "validDates" element
     */
    void setValidDates(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange validDates);

    /**
     * Appends and returns a new empty "validDates" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange addNewValidDates();

    /**
     * Unsets the "validDates" element
     */
    void unsetValidDates();
}
