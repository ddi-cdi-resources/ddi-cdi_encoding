/*
 * XML Type:  EmbargoInformation
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.EmbargoInformation
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML EmbargoInformation(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface EmbargoInformation extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.EmbargoInformation> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "embargoinformationaeb7type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


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

    /**
     * Gets a List of "period" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange> getPeriodList();

    /**
     * Gets array of all "period" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange[] getPeriodArray();

    /**
     * Gets ith "period" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange getPeriodArray(int i);

    /**
     * Returns number of "period" element
     */
    int sizeOfPeriodArray();

    /**
     * Sets array of all "period" element
     */
    void setPeriodArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange[] periodArray);

    /**
     * Sets ith "period" element
     */
    void setPeriodArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange period);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "period" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange insertNewPeriod(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "period" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange addNewPeriod();

    /**
     * Removes the ith "period" element
     */
    void removePeriod(int i);
}
