/*
 * An XML document type.
 * Localname: PhysicalLayoutRelationStructure
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalLayoutRelationStructureDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one PhysicalLayoutRelationStructure(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface PhysicalLayoutRelationStructureDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalLayoutRelationStructureDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "physicallayoutrelationstructure5992doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "PhysicalLayoutRelationStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalLayoutRelationStructure getPhysicalLayoutRelationStructure();

    /**
     * Sets the "PhysicalLayoutRelationStructure" element
     */
    void setPhysicalLayoutRelationStructure(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalLayoutRelationStructure physicalLayoutRelationStructure);

    /**
     * Appends and returns a new empty "PhysicalLayoutRelationStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalLayoutRelationStructure addNewPhysicalLayoutRelationStructure();
}
