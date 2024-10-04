/*
 * XML Type:  Command
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.Command
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML Command(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface Command extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Command> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "command9e77type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "commandContent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.TypedString getCommandContent();

    /**
     * True if has "commandContent" element
     */
    boolean isSetCommandContent();

    /**
     * Sets the "commandContent" element
     */
    void setCommandContent(org.ddialliance.specification.ddiCDI.x10.xmlSchema.TypedString commandContent);

    /**
     * Appends and returns a new empty "commandContent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.TypedString addNewCommandContent();

    /**
     * Unsets the "commandContent" element
     */
    void unsetCommandContent();

    /**
     * Gets the "programLanguage" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getProgramLanguage();

    /**
     * True if has "programLanguage" element
     */
    boolean isSetProgramLanguage();

    /**
     * Sets the "programLanguage" element
     */
    void setProgramLanguage(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry programLanguage);

    /**
     * Appends and returns a new empty "programLanguage" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewProgramLanguage();

    /**
     * Unsets the "programLanguage" element
     */
    void unsetProgramLanguage();
}
