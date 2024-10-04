/*
 * XML Type:  ObjectName
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ObjectName(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface ObjectName extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "objectnamec408type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "context" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getContext();

    /**
     * True if has "context" element
     */
    boolean isSetContext();

    /**
     * Sets the "context" element
     */
    void setContext(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry context);

    /**
     * Appends and returns a new empty "context" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewContext();

    /**
     * Unsets the "context" element
     */
    void unsetContext();

    /**
     * Gets the "name" element
     */
    java.lang.String getName();

    /**
     * Gets (as xml) the "name" element
     */
    org.apache.xmlbeans.XmlString xgetName();

    /**
     * True if has "name" element
     */
    boolean isSetName();

    /**
     * Sets the "name" element
     */
    void setName(java.lang.String name);

    /**
     * Sets (as xml) the "name" element
     */
    void xsetName(org.apache.xmlbeans.XmlString name);

    /**
     * Unsets the "name" element
     */
    void unsetName();
}
