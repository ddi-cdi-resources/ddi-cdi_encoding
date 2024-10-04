/*
 * An XML document type.
 * Localname: VariablePosition
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariablePositionDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one VariablePosition(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface VariablePositionDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariablePositionDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "variableposition3633doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "VariablePosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariablePosition getVariablePosition();

    /**
     * Sets the "VariablePosition" element
     */
    void setVariablePosition(org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariablePosition variablePosition);

    /**
     * Appends and returns a new empty "VariablePosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariablePosition addNewVariablePosition();
}
