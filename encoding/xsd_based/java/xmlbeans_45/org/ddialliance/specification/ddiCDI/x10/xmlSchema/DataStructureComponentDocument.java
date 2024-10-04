/*
 * An XML document type.
 * Localname: DataStructureComponent
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructureComponentDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one DataStructureComponent(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface DataStructureComponentDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructureComponentDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "datastructurecomponent0942doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "DataStructureComponent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructureComponent getDataStructureComponent();

    /**
     * Sets the "DataStructureComponent" element
     */
    void setDataStructureComponent(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructureComponent dataStructureComponent);

    /**
     * Appends and returns a new empty "DataStructureComponent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructureComponent addNewDataStructureComponent();
}
