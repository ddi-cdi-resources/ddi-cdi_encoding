/*
 * An XML document type.
 * Localname: AuthorizationSource
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.AuthorizationSourceDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one AuthorizationSource(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface AuthorizationSourceDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.AuthorizationSourceDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "authorizationsourceff10doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "AuthorizationSource" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AuthorizationSource getAuthorizationSource();

    /**
     * Sets the "AuthorizationSource" element
     */
    void setAuthorizationSource(org.ddialliance.specification.ddiCDI.x10.xmlSchema.AuthorizationSource authorizationSource);

    /**
     * Appends and returns a new empty "AuthorizationSource" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AuthorizationSource addNewAuthorizationSource();
}
