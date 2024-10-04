/*
 * An XML document type.
 * Localname: GeoRole
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.GeoRoleDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one GeoRole(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface GeoRoleDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.GeoRoleDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "georolec883doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "GeoRole" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.GeoRole getGeoRole();

    /**
     * Sets the "GeoRole" element
     */
    void setGeoRole(org.ddialliance.specification.ddiCDI.x10.xmlSchema.GeoRole geoRole);

    /**
     * Appends and returns a new empty "GeoRole" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.GeoRole addNewGeoRole();
}
