/*
 * An XML document type.
 * Localname: VariableCollection
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableCollectionDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one VariableCollection(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface VariableCollectionDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableCollectionDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "variablecollection0ce8doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "VariableCollection" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableCollection getVariableCollection();

    /**
     * Sets the "VariableCollection" element
     */
    void setVariableCollection(org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableCollection variableCollection);

    /**
     * Appends and returns a new empty "VariableCollection" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableCollection addNewVariableCollection();
}
