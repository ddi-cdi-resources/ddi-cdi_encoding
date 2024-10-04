/*
 * An XML document type.
 * Localname: SpecializationRole
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpecializationRoleDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one SpecializationRole(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface SpecializationRoleDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpecializationRoleDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "specializationrole56cfdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "SpecializationRole" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpecializationRole getSpecializationRole();

    /**
     * Sets the "SpecializationRole" element
     */
    void setSpecializationRole(org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpecializationRole specializationRole);

    /**
     * Appends and returns a new empty "SpecializationRole" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpecializationRole addNewSpecializationRole();
}
