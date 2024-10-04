/*
 * An XML document type.
 * Localname: ClassificationFamily
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationFamilyDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one ClassificationFamily(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface ClassificationFamilyDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationFamilyDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "classificationfamily9758doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ClassificationFamily" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationFamily getClassificationFamily();

    /**
     * Sets the "ClassificationFamily" element
     */
    void setClassificationFamily(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationFamily classificationFamily);

    /**
     * Appends and returns a new empty "ClassificationFamily" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationFamily addNewClassificationFamily();
}
