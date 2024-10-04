/*
 * An XML document type.
 * Localname: InstanceVariableMap
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMapDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one InstanceVariableMap(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface InstanceVariableMapDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMapDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "instancevariablemap3207doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "InstanceVariableMap" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap getInstanceVariableMap();

    /**
     * Sets the "InstanceVariableMap" element
     */
    void setInstanceVariableMap(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap instanceVariableMap);

    /**
     * Appends and returns a new empty "InstanceVariableMap" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap addNewInstanceVariableMap();
}
