/*
 * XML Type:  InstanceVariable
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariable
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML InstanceVariable(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface InstanceVariable extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariable> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "instancevariabled88ftype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "physicalDataType" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getPhysicalDataType();

    /**
     * True if has "physicalDataType" element
     */
    boolean isSetPhysicalDataType();

    /**
     * Sets the "physicalDataType" element
     */
    void setPhysicalDataType(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry physicalDataType);

    /**
     * Appends and returns a new empty "physicalDataType" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewPhysicalDataType();

    /**
     * Unsets the "physicalDataType" element
     */
    void unsetPhysicalDataType();

    /**
     * Gets the "platformType" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getPlatformType();

    /**
     * True if has "platformType" element
     */
    boolean isSetPlatformType();

    /**
     * Sets the "platformType" element
     */
    void setPlatformType(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry platformType);

    /**
     * Appends and returns a new empty "platformType" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewPlatformType();

    /**
     * Unsets the "platformType" element
     */
    void unsetPlatformType();

    /**
     * Gets the "source" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariable.Source getSource();

    /**
     * True if has "source" element
     */
    boolean isSetSource();

    /**
     * Sets the "source" element
     */
    void setSource(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariable.Source source);

    /**
     * Appends and returns a new empty "source" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariable.Source addNewSource();

    /**
     * Unsets the "source" element
     */
    void unsetSource();

    /**
     * Gets a List of "variableFunction" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry> getVariableFunctionList();

    /**
     * Gets array of all "variableFunction" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry[] getVariableFunctionArray();

    /**
     * Gets ith "variableFunction" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getVariableFunctionArray(int i);

    /**
     * Returns number of "variableFunction" element
     */
    int sizeOfVariableFunctionArray();

    /**
     * Sets array of all "variableFunction" element
     */
    void setVariableFunctionArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry[] variableFunctionArray);

    /**
     * Sets ith "variableFunction" element
     */
    void setVariableFunctionArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry variableFunction);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "variableFunction" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry insertNewVariableFunction(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "variableFunction" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewVariableFunction();

    /**
     * Removes the ith "variableFunction" element
     */
    void removeVariableFunction(int i);

    /**
     * An XML source(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public interface Source extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference {
        ElementFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariable.Source> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "source4cf8elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * Gets the "isAssociationReference" attribute
         */
        boolean getIsAssociationReference();

        /**
         * Gets (as xml) the "isAssociationReference" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetIsAssociationReference();

        /**
         * True if has "isAssociationReference" attribute
         */
        boolean isSetIsAssociationReference();

        /**
         * Sets the "isAssociationReference" attribute
         */
        void setIsAssociationReference(boolean isAssociationReference);

        /**
         * Sets (as xml) the "isAssociationReference" attribute
         */
        void xsetIsAssociationReference(org.apache.xmlbeans.XmlBoolean isAssociationReference);

        /**
         * Unsets the "isAssociationReference" attribute
         */
        void unsetIsAssociationReference();
    }
}
