/*
 * XML Type:  Revision
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.Revision
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML Revision(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface Revision extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Revision> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "revision5839type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "algorithm" element
     */
    java.lang.String getAlgorithm();

    /**
     * Gets (as xml) the "algorithm" element
     */
    org.apache.xmlbeans.XmlString xgetAlgorithm();

    /**
     * True if has "algorithm" element
     */
    boolean isSetAlgorithm();

    /**
     * Sets the "algorithm" element
     */
    void setAlgorithm(java.lang.String algorithm);

    /**
     * Sets (as xml) the "algorithm" element
     */
    void xsetAlgorithm(org.apache.xmlbeans.XmlString algorithm);

    /**
     * Unsets the "algorithm" element
     */
    void unsetAlgorithm();

    /**
     * Gets the "identifier" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier getIdentifier();

    /**
     * True if has "identifier" element
     */
    boolean isSetIdentifier();

    /**
     * Sets the "identifier" element
     */
    void setIdentifier(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier identifier);

    /**
     * Appends and returns a new empty "identifier" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier addNewIdentifier();

    /**
     * Unsets the "identifier" element
     */
    void unsetIdentifier();

    /**
     * Gets the "overview" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getOverview();

    /**
     * True if has "overview" element
     */
    boolean isSetOverview();

    /**
     * Sets the "overview" element
     */
    void setOverview(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString overview);

    /**
     * Appends and returns a new empty "overview" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewOverview();

    /**
     * Unsets the "overview" element
     */
    void unsetOverview();
}
