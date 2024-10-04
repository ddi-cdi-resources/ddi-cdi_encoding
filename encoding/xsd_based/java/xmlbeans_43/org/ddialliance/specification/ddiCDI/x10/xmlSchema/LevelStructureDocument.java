/*
 * An XML document type.
 * Localname: LevelStructure
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.LevelStructureDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one LevelStructure(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface LevelStructureDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.LevelStructureDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "levelstructure7ffddoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "LevelStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LevelStructure getLevelStructure();

    /**
     * Sets the "LevelStructure" element
     */
    void setLevelStructure(org.ddialliance.specification.ddiCDI.x10.xmlSchema.LevelStructure levelStructure);

    /**
     * Appends and returns a new empty "LevelStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LevelStructure addNewLevelStructure();
}
