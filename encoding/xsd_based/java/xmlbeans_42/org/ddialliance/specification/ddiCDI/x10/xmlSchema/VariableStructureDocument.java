/*
 * An XML document type.
 * Localname: VariableStructure
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableStructureDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one VariableStructure(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface VariableStructureDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableStructureDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "variablestructure46b3doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "VariableStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableStructure getVariableStructure();

    /**
     * Sets the "VariableStructure" element
     */
    void setVariableStructure(org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableStructure variableStructure);

    /**
     * Appends and returns a new empty "VariableStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableStructure addNewVariableStructure();
}
