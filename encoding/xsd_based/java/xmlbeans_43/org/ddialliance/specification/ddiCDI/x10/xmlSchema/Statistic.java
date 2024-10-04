/*
 * XML Type:  Statistic
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.Statistic
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML Statistic(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface Statistic extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Statistic> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "statistic813ctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "computationBase" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ComputationBaseList.Enum getComputationBase();

    /**
     * Gets (as xml) the "computationBase" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ComputationBaseList xgetComputationBase();

    /**
     * True if has "computationBase" element
     */
    boolean isSetComputationBase();

    /**
     * Sets the "computationBase" element
     */
    void setComputationBase(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ComputationBaseList.Enum computationBase);

    /**
     * Sets (as xml) the "computationBase" element
     */
    void xsetComputationBase(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ComputationBaseList computationBase);

    /**
     * Unsets the "computationBase" element
     */
    void unsetComputationBase();

    /**
     * Gets the "content" element
     */
    double getContent();

    /**
     * Gets (as xml) the "content" element
     */
    org.apache.xmlbeans.XmlDouble xgetContent();

    /**
     * True if has "content" element
     */
    boolean isSetContent();

    /**
     * Sets the "content" element
     */
    void setContent(double content);

    /**
     * Sets (as xml) the "content" element
     */
    void xsetContent(org.apache.xmlbeans.XmlDouble content);

    /**
     * Unsets the "content" element
     */
    void unsetContent();

    /**
     * Gets the "isWeighted" element
     */
    boolean getIsWeighted();

    /**
     * Gets (as xml) the "isWeighted" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsWeighted();

    /**
     * True if has "isWeighted" element
     */
    boolean isSetIsWeighted();

    /**
     * Sets the "isWeighted" element
     */
    void setIsWeighted(boolean isWeighted);

    /**
     * Sets (as xml) the "isWeighted" element
     */
    void xsetIsWeighted(org.apache.xmlbeans.XmlBoolean isWeighted);

    /**
     * Unsets the "isWeighted" element
     */
    void unsetIsWeighted();

    /**
     * Gets the "typeOfNumericValue" element
     */
    java.lang.String getTypeOfNumericValue();

    /**
     * Gets (as xml) the "typeOfNumericValue" element
     */
    org.apache.xmlbeans.XmlString xgetTypeOfNumericValue();

    /**
     * True if has "typeOfNumericValue" element
     */
    boolean isSetTypeOfNumericValue();

    /**
     * Sets the "typeOfNumericValue" element
     */
    void setTypeOfNumericValue(java.lang.String typeOfNumericValue);

    /**
     * Sets (as xml) the "typeOfNumericValue" element
     */
    void xsetTypeOfNumericValue(org.apache.xmlbeans.XmlString typeOfNumericValue);

    /**
     * Unsets the "typeOfNumericValue" element
     */
    void unsetTypeOfNumericValue();
}
