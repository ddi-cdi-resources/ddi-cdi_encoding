/*
 * XML Type:  Category
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.Category
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML Category(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface Category extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.Concept {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Category> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "categorycedctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "descriptiveText" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getDescriptiveText();

    /**
     * True if has "descriptiveText" element
     */
    boolean isSetDescriptiveText();

    /**
     * Sets the "descriptiveText" element
     */
    void setDescriptiveText(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString descriptiveText);

    /**
     * Appends and returns a new empty "descriptiveText" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewDescriptiveText();

    /**
     * Unsets the "descriptiveText" element
     */
    void unsetDescriptiveText();
}
