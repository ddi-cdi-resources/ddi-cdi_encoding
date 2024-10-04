/*
 * An XML document type.
 * Localname: DataStore
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStoreDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one DataStore(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface DataStoreDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStoreDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "datastore8ab3doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "DataStore" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore getDataStore();

    /**
     * Sets the "DataStore" element
     */
    void setDataStore(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore dataStore);

    /**
     * Appends and returns a new empty "DataStore" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore addNewDataStore();
}
