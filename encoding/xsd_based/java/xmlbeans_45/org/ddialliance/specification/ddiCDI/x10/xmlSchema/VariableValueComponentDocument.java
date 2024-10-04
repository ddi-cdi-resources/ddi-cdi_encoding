/*
 * An XML document type.
 * Localname: VariableValueComponent
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableValueComponentDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one VariableValueComponent(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface VariableValueComponentDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableValueComponentDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "variablevaluecomponent8d56doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "VariableValueComponent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableValueComponent getVariableValueComponent();

    /**
     * Sets the "VariableValueComponent" element
     */
    void setVariableValueComponent(org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableValueComponent variableValueComponent);

    /**
     * Appends and returns a new empty "VariableValueComponent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableValueComponent addNewVariableValueComponent();
}
