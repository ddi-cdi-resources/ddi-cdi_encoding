/*
 * An XML document type.
 * Localname: DimensionalKeyDefinition
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinitionDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one DimensionalKeyDefinition(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface DimensionalKeyDefinitionDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinitionDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "dimensionalkeydefinitionb7efdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "DimensionalKeyDefinition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinition getDimensionalKeyDefinition();

    /**
     * Sets the "DimensionalKeyDefinition" element
     */
    void setDimensionalKeyDefinition(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinition dimensionalKeyDefinition);

    /**
     * Appends and returns a new empty "DimensionalKeyDefinition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinition addNewDimensionalKeyDefinition();
}
