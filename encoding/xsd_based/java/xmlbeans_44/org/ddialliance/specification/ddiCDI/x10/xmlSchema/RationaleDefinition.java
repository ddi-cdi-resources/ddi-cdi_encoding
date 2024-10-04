/*
 * XML Type:  RationaleDefinition
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.RationaleDefinition
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML RationaleDefinition(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface RationaleDefinition extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.RationaleDefinition> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "rationaledefinition19d6type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "rationaleCode" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getRationaleCode();

    /**
     * True if has "rationaleCode" element
     */
    boolean isSetRationaleCode();

    /**
     * Sets the "rationaleCode" element
     */
    void setRationaleCode(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry rationaleCode);

    /**
     * Appends and returns a new empty "rationaleCode" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewRationaleCode();

    /**
     * Unsets the "rationaleCode" element
     */
    void unsetRationaleCode();

    /**
     * Gets the "rationaleDescription" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getRationaleDescription();

    /**
     * True if has "rationaleDescription" element
     */
    boolean isSetRationaleDescription();

    /**
     * Sets the "rationaleDescription" element
     */
    void setRationaleDescription(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString rationaleDescription);

    /**
     * Appends and returns a new empty "rationaleDescription" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewRationaleDescription();

    /**
     * Unsets the "rationaleDescription" element
     */
    void unsetRationaleDescription();
}
