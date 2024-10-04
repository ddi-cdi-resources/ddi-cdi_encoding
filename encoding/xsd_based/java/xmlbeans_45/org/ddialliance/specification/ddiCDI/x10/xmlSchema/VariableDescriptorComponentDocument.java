/*
 * An XML document type.
 * Localname: VariableDescriptorComponent
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableDescriptorComponentDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one VariableDescriptorComponent(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface VariableDescriptorComponentDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableDescriptorComponentDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "variabledescriptorcomponentd34edoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "VariableDescriptorComponent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableDescriptorComponent getVariableDescriptorComponent();

    /**
     * Sets the "VariableDescriptorComponent" element
     */
    void setVariableDescriptorComponent(org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableDescriptorComponent variableDescriptorComponent);

    /**
     * Appends and returns a new empty "VariableDescriptorComponent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableDescriptorComponent addNewVariableDescriptorComponent();
}
