/*
 * An XML document type.
 * Localname: InstanceVariable
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one InstanceVariable(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface InstanceVariableDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "instancevariablebe9fdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "InstanceVariable" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariable getInstanceVariable();

    /**
     * Sets the "InstanceVariable" element
     */
    void setInstanceVariable(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariable instanceVariable);

    /**
     * Appends and returns a new empty "InstanceVariable" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariable addNewInstanceVariable();
}
