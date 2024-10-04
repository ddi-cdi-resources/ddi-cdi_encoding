/*
 * XML Type:  PrivateImage
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrivateImage
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML PrivateImage(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface PrivateImage extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrivateImage> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "privateimagefff6type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "effectiveDates" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange getEffectiveDates();

    /**
     * True if has "effectiveDates" element
     */
    boolean isSetEffectiveDates();

    /**
     * Sets the "effectiveDates" element
     */
    void setEffectiveDates(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange effectiveDates);

    /**
     * Appends and returns a new empty "effectiveDates" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange addNewEffectiveDates();

    /**
     * Unsets the "effectiveDates" element
     */
    void unsetEffectiveDates();

    /**
     * Gets the "privacy" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getPrivacy();

    /**
     * True if has "privacy" element
     */
    boolean isSetPrivacy();

    /**
     * Sets the "privacy" element
     */
    void setPrivacy(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry privacy);

    /**
     * Appends and returns a new empty "privacy" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewPrivacy();

    /**
     * Unsets the "privacy" element
     */
    void unsetPrivacy();
}
