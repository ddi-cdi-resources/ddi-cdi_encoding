/*
 * An XML document type.
 * Localname: LongDataSet
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongDataSetDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one LongDataSet(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface LongDataSetDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongDataSetDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "longdataset2e58doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "LongDataSet" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongDataSet getLongDataSet();

    /**
     * Sets the "LongDataSet" element
     */
    void setLongDataSet(org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongDataSet longDataSet);

    /**
     * Appends and returns a new empty "LongDataSet" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongDataSet addNewLongDataSet();
}
