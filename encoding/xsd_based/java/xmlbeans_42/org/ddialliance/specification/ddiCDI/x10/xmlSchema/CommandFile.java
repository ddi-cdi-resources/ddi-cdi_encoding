/*
 * XML Type:  CommandFile
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandFile
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CommandFile(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface CommandFile extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandFile> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "commandfileb513type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "location" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getLocation();

    /**
     * True if has "location" element
     */
    boolean isSetLocation();

    /**
     * Sets the "location" element
     */
    void setLocation(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString location);

    /**
     * Appends and returns a new empty "location" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewLocation();

    /**
     * Unsets the "location" element
     */
    void unsetLocation();

    /**
     * Gets the "uri" element
     */
    java.lang.String getUri();

    /**
     * Gets (as xml) the "uri" element
     */
    org.apache.xmlbeans.XmlAnyURI xgetUri();

    /**
     * True if has "uri" element
     */
    boolean isSetUri();

    /**
     * Sets the "uri" element
     */
    void setUri(java.lang.String uri);

    /**
     * Sets (as xml) the "uri" element
     */
    void xsetUri(org.apache.xmlbeans.XmlAnyURI uri);

    /**
     * Unsets the "uri" element
     */
    void unsetUri();
}
