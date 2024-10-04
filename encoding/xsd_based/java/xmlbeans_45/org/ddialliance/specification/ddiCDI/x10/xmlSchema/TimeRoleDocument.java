/*
 * An XML document type.
 * Localname: TimeRole
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.TimeRoleDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one TimeRole(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface TimeRoleDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.TimeRoleDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "timerole3351doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "TimeRole" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.TimeRole getTimeRole();

    /**
     * Sets the "TimeRole" element
     */
    void setTimeRole(org.ddialliance.specification.ddiCDI.x10.xmlSchema.TimeRole timeRole);

    /**
     * Appends and returns a new empty "TimeRole" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.TimeRole addNewTimeRole();
}
