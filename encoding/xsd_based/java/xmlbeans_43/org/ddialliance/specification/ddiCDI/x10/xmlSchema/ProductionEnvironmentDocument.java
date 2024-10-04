/*
 * An XML document type.
 * Localname: ProductionEnvironment
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProductionEnvironmentDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one ProductionEnvironment(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface ProductionEnvironmentDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProductionEnvironmentDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "productionenvironment51f6doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ProductionEnvironment" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProductionEnvironment getProductionEnvironment();

    /**
     * Sets the "ProductionEnvironment" element
     */
    void setProductionEnvironment(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProductionEnvironment productionEnvironment);

    /**
     * Appends and returns a new empty "ProductionEnvironment" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProductionEnvironment addNewProductionEnvironment();
}
