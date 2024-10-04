/*
 * An XML document type.
 * Localname: AllenIntervalAlgebra
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.AllenIntervalAlgebraDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one AllenIntervalAlgebra(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface AllenIntervalAlgebraDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.AllenIntervalAlgebraDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "allenintervalalgebra9727doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "AllenIntervalAlgebra" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AllenIntervalAlgebra getAllenIntervalAlgebra();

    /**
     * Sets the "AllenIntervalAlgebra" element
     */
    void setAllenIntervalAlgebra(org.ddialliance.specification.ddiCDI.x10.xmlSchema.AllenIntervalAlgebra allenIntervalAlgebra);

    /**
     * Appends and returns a new empty "AllenIntervalAlgebra" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AllenIntervalAlgebra addNewAllenIntervalAlgebra();
}
