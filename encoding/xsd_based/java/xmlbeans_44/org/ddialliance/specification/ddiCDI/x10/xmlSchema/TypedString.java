/*
 * XML Type:  TypedString
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.TypedString
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML TypedString(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface TypedString extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.TypedString> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "typedstring90c7type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "content" element
     */
    java.lang.String getContent();

    /**
     * Gets (as xml) the "content" element
     */
    org.apache.xmlbeans.XmlString xgetContent();

    /**
     * Sets the "content" element
     */
    void setContent(java.lang.String content);

    /**
     * Sets (as xml) the "content" element
     */
    void xsetContent(org.apache.xmlbeans.XmlString content);

    /**
     * Gets the "typeOfContent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getTypeOfContent();

    /**
     * True if has "typeOfContent" element
     */
    boolean isSetTypeOfContent();

    /**
     * Sets the "typeOfContent" element
     */
    void setTypeOfContent(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry typeOfContent);

    /**
     * Appends and returns a new empty "typeOfContent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewTypeOfContent();

    /**
     * Unsets the "typeOfContent" element
     */
    void unsetTypeOfContent();
}
