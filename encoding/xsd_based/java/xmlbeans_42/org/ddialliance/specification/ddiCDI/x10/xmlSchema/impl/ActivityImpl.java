/*
 * XML Type:  Activity
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML Activity(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class ActivityImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity {
    private static final long serialVersionUID = 1L;

    public ActivityImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "definition"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "description"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "displayLabel"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "entityProduced"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "entityUsed"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "identifier"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "name"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "standardModelMapping"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "Activity_hasInternal_ControlLogic"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "Activity_hasSubActivity_Activity"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "Activity_has_Step"),
    };


    /**
     * Gets the "definition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getDefinition() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "definition" element
     */
    @Override
    public boolean isSetDefinition() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "definition" element
     */
    @Override
    public void setDefinition(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString definition) {
        generatedSetterHelperImpl(definition, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "definition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewDefinition() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "definition" element
     */
    @Override
    public void unsetDefinition() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "description" element
     */
    @Override
    public java.lang.String getDescription() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "description" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetDescription() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return target;
        }
    }

    /**
     * True if has "description" element
     */
    @Override
    public boolean isSetDescription() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "description" element
     */
    @Override
    public void setDescription(java.lang.String description) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.setStringValue(description);
        }
    }

    /**
     * Sets (as xml) the "description" element
     */
    @Override
    public void xsetDescription(org.apache.xmlbeans.XmlString description) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.set(description);
        }
    }

    /**
     * Unsets the "description" element
     */
    @Override
    public void unsetDescription() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets a List of "displayLabel" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay> getDisplayLabelList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getDisplayLabelArray,
                this::setDisplayLabelArray,
                this::insertNewDisplayLabel,
                this::removeDisplayLabel,
                this::sizeOfDisplayLabelArray
            );
        }
    }

    /**
     * Gets array of all "displayLabel" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay[] getDisplayLabelArray() {
        return getXmlObjectArray(PROPERTY_QNAME[2], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay[0]);
    }

    /**
     * Gets ith "displayLabel" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay getDisplayLabelArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "displayLabel" element
     */
    @Override
    public int sizeOfDisplayLabelArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Sets array of all "displayLabel" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setDisplayLabelArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay[] displayLabelArray) {
        check_orphaned();
        arraySetterHelper(displayLabelArray, PROPERTY_QNAME[2]);
    }

    /**
     * Sets ith "displayLabel" element
     */
    @Override
    public void setDisplayLabelArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay displayLabel) {
        generatedSetterHelperImpl(displayLabel, PROPERTY_QNAME[2], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "displayLabel" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay insertNewDisplayLabel(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay)get_store().insert_element_user(PROPERTY_QNAME[2], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "displayLabel" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay addNewDisplayLabel() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Removes the ith "displayLabel" element
     */
    @Override
    public void removeDisplayLabel(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], i);
        }
    }

    /**
     * Gets a List of "entityProduced" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.EntityProduced> getEntityProducedList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getEntityProducedArray,
                this::setEntityProducedArray,
                this::insertNewEntityProduced,
                this::removeEntityProduced,
                this::sizeOfEntityProducedArray
            );
        }
    }

    /**
     * Gets array of all "entityProduced" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.EntityProduced[] getEntityProducedArray() {
        return getXmlObjectArray(PROPERTY_QNAME[3], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.EntityProduced[0]);
    }

    /**
     * Gets ith "entityProduced" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.EntityProduced getEntityProducedArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.EntityProduced target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.EntityProduced)get_store().find_element_user(PROPERTY_QNAME[3], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "entityProduced" element
     */
    @Override
    public int sizeOfEntityProducedArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Sets array of all "entityProduced" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setEntityProducedArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.EntityProduced[] entityProducedArray) {
        check_orphaned();
        arraySetterHelper(entityProducedArray, PROPERTY_QNAME[3]);
    }

    /**
     * Sets ith "entityProduced" element
     */
    @Override
    public void setEntityProducedArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.EntityProduced entityProduced) {
        generatedSetterHelperImpl(entityProduced, PROPERTY_QNAME[3], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "entityProduced" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.EntityProduced insertNewEntityProduced(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.EntityProduced target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.EntityProduced)get_store().insert_element_user(PROPERTY_QNAME[3], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "entityProduced" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.EntityProduced addNewEntityProduced() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.EntityProduced target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.EntityProduced)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Removes the ith "entityProduced" element
     */
    @Override
    public void removeEntityProduced(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], i);
        }
    }

    /**
     * Gets a List of "entityUsed" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.EntityUsed> getEntityUsedList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getEntityUsedArray,
                this::setEntityUsedArray,
                this::insertNewEntityUsed,
                this::removeEntityUsed,
                this::sizeOfEntityUsedArray
            );
        }
    }

    /**
     * Gets array of all "entityUsed" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.EntityUsed[] getEntityUsedArray() {
        return getXmlObjectArray(PROPERTY_QNAME[4], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.EntityUsed[0]);
    }

    /**
     * Gets ith "entityUsed" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.EntityUsed getEntityUsedArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.EntityUsed target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.EntityUsed)get_store().find_element_user(PROPERTY_QNAME[4], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "entityUsed" element
     */
    @Override
    public int sizeOfEntityUsedArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[4]);
        }
    }

    /**
     * Sets array of all "entityUsed" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setEntityUsedArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.EntityUsed[] entityUsedArray) {
        check_orphaned();
        arraySetterHelper(entityUsedArray, PROPERTY_QNAME[4]);
    }

    /**
     * Sets ith "entityUsed" element
     */
    @Override
    public void setEntityUsedArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.EntityUsed entityUsed) {
        generatedSetterHelperImpl(entityUsed, PROPERTY_QNAME[4], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "entityUsed" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.EntityUsed insertNewEntityUsed(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.EntityUsed target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.EntityUsed)get_store().insert_element_user(PROPERTY_QNAME[4], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "entityUsed" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.EntityUsed addNewEntityUsed() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.EntityUsed target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.EntityUsed)get_store().add_element_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * Removes the ith "entityUsed" element
     */
    @Override
    public void removeEntityUsed(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[4], i);
        }
    }

    /**
     * Gets the "identifier" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier getIdentifier() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier)get_store().find_element_user(PROPERTY_QNAME[5], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "identifier" element
     */
    @Override
    public boolean isSetIdentifier() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[5]) != 0;
        }
    }

    /**
     * Sets the "identifier" element
     */
    @Override
    public void setIdentifier(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier identifier) {
        generatedSetterHelperImpl(identifier, PROPERTY_QNAME[5], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "identifier" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier addNewIdentifier() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier)get_store().add_element_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * Unsets the "identifier" element
     */
    @Override
    public void unsetIdentifier() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[5], 0);
        }
    }

    /**
     * Gets a List of "name" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName> getNameList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getNameArray,
                this::setNameArray,
                this::insertNewName,
                this::removeName,
                this::sizeOfNameArray
            );
        }
    }

    /**
     * Gets array of all "name" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName[] getNameArray() {
        return getXmlObjectArray(PROPERTY_QNAME[6], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName[0]);
    }

    /**
     * Gets ith "name" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName getNameArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName)get_store().find_element_user(PROPERTY_QNAME[6], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "name" element
     */
    @Override
    public int sizeOfNameArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[6]);
        }
    }

    /**
     * Sets array of all "name" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setNameArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName[] nameArray) {
        check_orphaned();
        arraySetterHelper(nameArray, PROPERTY_QNAME[6]);
    }

    /**
     * Sets ith "name" element
     */
    @Override
    public void setNameArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName name) {
        generatedSetterHelperImpl(name, PROPERTY_QNAME[6], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "name" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName insertNewName(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName)get_store().insert_element_user(PROPERTY_QNAME[6], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "name" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName addNewName() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName)get_store().add_element_user(PROPERTY_QNAME[6]);
            return target;
        }
    }

    /**
     * Removes the ith "name" element
     */
    @Override
    public void removeName(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[6], i);
        }
    }

    /**
     * Gets a List of "standardModelMapping" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.StandardModelMapping> getStandardModelMappingList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getStandardModelMappingArray,
                this::setStandardModelMappingArray,
                this::insertNewStandardModelMapping,
                this::removeStandardModelMapping,
                this::sizeOfStandardModelMappingArray
            );
        }
    }

    /**
     * Gets array of all "standardModelMapping" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.StandardModelMapping[] getStandardModelMappingArray() {
        return getXmlObjectArray(PROPERTY_QNAME[7], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.StandardModelMapping[0]);
    }

    /**
     * Gets ith "standardModelMapping" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.StandardModelMapping getStandardModelMappingArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.StandardModelMapping target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.StandardModelMapping)get_store().find_element_user(PROPERTY_QNAME[7], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "standardModelMapping" element
     */
    @Override
    public int sizeOfStandardModelMappingArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[7]);
        }
    }

    /**
     * Sets array of all "standardModelMapping" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setStandardModelMappingArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.StandardModelMapping[] standardModelMappingArray) {
        check_orphaned();
        arraySetterHelper(standardModelMappingArray, PROPERTY_QNAME[7]);
    }

    /**
     * Sets ith "standardModelMapping" element
     */
    @Override
    public void setStandardModelMappingArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.StandardModelMapping standardModelMapping) {
        generatedSetterHelperImpl(standardModelMapping, PROPERTY_QNAME[7], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "standardModelMapping" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.StandardModelMapping insertNewStandardModelMapping(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.StandardModelMapping target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.StandardModelMapping)get_store().insert_element_user(PROPERTY_QNAME[7], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "standardModelMapping" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.StandardModelMapping addNewStandardModelMapping() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.StandardModelMapping target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.StandardModelMapping)get_store().add_element_user(PROPERTY_QNAME[7]);
            return target;
        }
    }

    /**
     * Removes the ith "standardModelMapping" element
     */
    @Override
    public void removeStandardModelMapping(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[7], i);
        }
    }

    /**
     * Gets a List of "Activity_hasInternal_ControlLogic" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasInternalControlLogic> getActivityHasInternalControlLogicList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getActivityHasInternalControlLogicArray,
                this::setActivityHasInternalControlLogicArray,
                this::insertNewActivityHasInternalControlLogic,
                this::removeActivityHasInternalControlLogic,
                this::sizeOfActivityHasInternalControlLogicArray
            );
        }
    }

    /**
     * Gets array of all "Activity_hasInternal_ControlLogic" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasInternalControlLogic[] getActivityHasInternalControlLogicArray() {
        return getXmlObjectArray(PROPERTY_QNAME[8], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasInternalControlLogic[0]);
    }

    /**
     * Gets ith "Activity_hasInternal_ControlLogic" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasInternalControlLogic getActivityHasInternalControlLogicArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasInternalControlLogic target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasInternalControlLogic)get_store().find_element_user(PROPERTY_QNAME[8], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Activity_hasInternal_ControlLogic" element
     */
    @Override
    public int sizeOfActivityHasInternalControlLogicArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[8]);
        }
    }

    /**
     * Sets array of all "Activity_hasInternal_ControlLogic" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setActivityHasInternalControlLogicArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasInternalControlLogic[] activityHasInternalControlLogicArray) {
        check_orphaned();
        arraySetterHelper(activityHasInternalControlLogicArray, PROPERTY_QNAME[8]);
    }

    /**
     * Sets ith "Activity_hasInternal_ControlLogic" element
     */
    @Override
    public void setActivityHasInternalControlLogicArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasInternalControlLogic activityHasInternalControlLogic) {
        generatedSetterHelperImpl(activityHasInternalControlLogic, PROPERTY_QNAME[8], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Activity_hasInternal_ControlLogic" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasInternalControlLogic insertNewActivityHasInternalControlLogic(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasInternalControlLogic target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasInternalControlLogic)get_store().insert_element_user(PROPERTY_QNAME[8], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Activity_hasInternal_ControlLogic" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasInternalControlLogic addNewActivityHasInternalControlLogic() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasInternalControlLogic target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasInternalControlLogic)get_store().add_element_user(PROPERTY_QNAME[8]);
            return target;
        }
    }

    /**
     * Removes the ith "Activity_hasInternal_ControlLogic" element
     */
    @Override
    public void removeActivityHasInternalControlLogic(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[8], i);
        }
    }

    /**
     * Gets a List of "Activity_hasSubActivity_Activity" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasSubActivityActivity> getActivityHasSubActivityActivityList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getActivityHasSubActivityActivityArray,
                this::setActivityHasSubActivityActivityArray,
                this::insertNewActivityHasSubActivityActivity,
                this::removeActivityHasSubActivityActivity,
                this::sizeOfActivityHasSubActivityActivityArray
            );
        }
    }

    /**
     * Gets array of all "Activity_hasSubActivity_Activity" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasSubActivityActivity[] getActivityHasSubActivityActivityArray() {
        return getXmlObjectArray(PROPERTY_QNAME[9], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasSubActivityActivity[0]);
    }

    /**
     * Gets ith "Activity_hasSubActivity_Activity" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasSubActivityActivity getActivityHasSubActivityActivityArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasSubActivityActivity target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasSubActivityActivity)get_store().find_element_user(PROPERTY_QNAME[9], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Activity_hasSubActivity_Activity" element
     */
    @Override
    public int sizeOfActivityHasSubActivityActivityArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[9]);
        }
    }

    /**
     * Sets array of all "Activity_hasSubActivity_Activity" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setActivityHasSubActivityActivityArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasSubActivityActivity[] activityHasSubActivityActivityArray) {
        check_orphaned();
        arraySetterHelper(activityHasSubActivityActivityArray, PROPERTY_QNAME[9]);
    }

    /**
     * Sets ith "Activity_hasSubActivity_Activity" element
     */
    @Override
    public void setActivityHasSubActivityActivityArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasSubActivityActivity activityHasSubActivityActivity) {
        generatedSetterHelperImpl(activityHasSubActivityActivity, PROPERTY_QNAME[9], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Activity_hasSubActivity_Activity" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasSubActivityActivity insertNewActivityHasSubActivityActivity(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasSubActivityActivity target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasSubActivityActivity)get_store().insert_element_user(PROPERTY_QNAME[9], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Activity_hasSubActivity_Activity" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasSubActivityActivity addNewActivityHasSubActivityActivity() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasSubActivityActivity target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasSubActivityActivity)get_store().add_element_user(PROPERTY_QNAME[9]);
            return target;
        }
    }

    /**
     * Removes the ith "Activity_hasSubActivity_Activity" element
     */
    @Override
    public void removeActivityHasSubActivityActivity(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[9], i);
        }
    }

    /**
     * Gets a List of "Activity_has_Step" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasStep> getActivityHasStepList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getActivityHasStepArray,
                this::setActivityHasStepArray,
                this::insertNewActivityHasStep,
                this::removeActivityHasStep,
                this::sizeOfActivityHasStepArray
            );
        }
    }

    /**
     * Gets array of all "Activity_has_Step" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasStep[] getActivityHasStepArray() {
        return getXmlObjectArray(PROPERTY_QNAME[10], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasStep[0]);
    }

    /**
     * Gets ith "Activity_has_Step" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasStep getActivityHasStepArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasStep target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasStep)get_store().find_element_user(PROPERTY_QNAME[10], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Activity_has_Step" element
     */
    @Override
    public int sizeOfActivityHasStepArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[10]);
        }
    }

    /**
     * Sets array of all "Activity_has_Step" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setActivityHasStepArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasStep[] activityHasStepArray) {
        check_orphaned();
        arraySetterHelper(activityHasStepArray, PROPERTY_QNAME[10]);
    }

    /**
     * Sets ith "Activity_has_Step" element
     */
    @Override
    public void setActivityHasStepArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasStep activityHasStep) {
        generatedSetterHelperImpl(activityHasStep, PROPERTY_QNAME[10], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Activity_has_Step" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasStep insertNewActivityHasStep(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasStep target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasStep)get_store().insert_element_user(PROPERTY_QNAME[10], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Activity_has_Step" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasStep addNewActivityHasStep() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasStep target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasStep)get_store().add_element_user(PROPERTY_QNAME[10]);
            return target;
        }
    }

    /**
     * Removes the ith "Activity_has_Step" element
     */
    @Override
    public void removeActivityHasStep(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[10], i);
        }
    }
    /**
     * An XML entityProduced(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class EntityProducedImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.ReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.EntityProduced {
        private static final long serialVersionUID = 1L;

        public EntityProducedImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }

        private static final QName[] PROPERTY_QNAME = {
            new QName("", "isAssociationReference"),
        };


        /**
         * Gets the "isAssociationReference" attribute
         */
        @Override
        public boolean getIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[0]);
                }
                return (target == null) ? false : target.getBooleanValue();
            }
        }

        /**
         * Gets (as xml) the "isAssociationReference" attribute
         */
        @Override
        public org.apache.xmlbeans.XmlBoolean xgetIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PROPERTY_QNAME[0]);
                }
                return target;
            }
        }

        /**
         * True if has "isAssociationReference" attribute
         */
        @Override
        public boolean isSetIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
            }
        }

        /**
         * Sets the "isAssociationReference" attribute
         */
        @Override
        public void setIsAssociationReference(boolean isAssociationReference) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
                }
                target.setBooleanValue(isAssociationReference);
            }
        }

        /**
         * Sets (as xml) the "isAssociationReference" attribute
         */
        @Override
        public void xsetIsAssociationReference(org.apache.xmlbeans.XmlBoolean isAssociationReference) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[0]);
                }
                target.set(isAssociationReference);
            }
        }

        /**
         * Unsets the "isAssociationReference" attribute
         */
        @Override
        public void unsetIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_attribute(PROPERTY_QNAME[0]);
            }
        }
    }
    /**
     * An XML entityUsed(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class EntityUsedImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.ReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.EntityUsed {
        private static final long serialVersionUID = 1L;

        public EntityUsedImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }

        private static final QName[] PROPERTY_QNAME = {
            new QName("", "isAssociationReference"),
        };


        /**
         * Gets the "isAssociationReference" attribute
         */
        @Override
        public boolean getIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[0]);
                }
                return (target == null) ? false : target.getBooleanValue();
            }
        }

        /**
         * Gets (as xml) the "isAssociationReference" attribute
         */
        @Override
        public org.apache.xmlbeans.XmlBoolean xgetIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PROPERTY_QNAME[0]);
                }
                return target;
            }
        }

        /**
         * True if has "isAssociationReference" attribute
         */
        @Override
        public boolean isSetIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
            }
        }

        /**
         * Sets the "isAssociationReference" attribute
         */
        @Override
        public void setIsAssociationReference(boolean isAssociationReference) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
                }
                target.setBooleanValue(isAssociationReference);
            }
        }

        /**
         * Sets (as xml) the "isAssociationReference" attribute
         */
        @Override
        public void xsetIsAssociationReference(org.apache.xmlbeans.XmlBoolean isAssociationReference) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[0]);
                }
                target.set(isAssociationReference);
            }
        }

        /**
         * Unsets the "isAssociationReference" attribute
         */
        @Override
        public void unsetIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_attribute(PROPERTY_QNAME[0]);
            }
        }
    }
    /**
     * An XML standardModelMapping(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class StandardModelMappingImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.ReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.StandardModelMapping {
        private static final long serialVersionUID = 1L;

        public StandardModelMappingImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }

        private static final QName[] PROPERTY_QNAME = {
            new QName("", "isAssociationReference"),
        };


        /**
         * Gets the "isAssociationReference" attribute
         */
        @Override
        public boolean getIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[0]);
                }
                return (target == null) ? false : target.getBooleanValue();
            }
        }

        /**
         * Gets (as xml) the "isAssociationReference" attribute
         */
        @Override
        public org.apache.xmlbeans.XmlBoolean xgetIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PROPERTY_QNAME[0]);
                }
                return target;
            }
        }

        /**
         * True if has "isAssociationReference" attribute
         */
        @Override
        public boolean isSetIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
            }
        }

        /**
         * Sets the "isAssociationReference" attribute
         */
        @Override
        public void setIsAssociationReference(boolean isAssociationReference) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
                }
                target.setBooleanValue(isAssociationReference);
            }
        }

        /**
         * Sets (as xml) the "isAssociationReference" attribute
         */
        @Override
        public void xsetIsAssociationReference(org.apache.xmlbeans.XmlBoolean isAssociationReference) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[0]);
                }
                target.set(isAssociationReference);
            }
        }

        /**
         * Unsets the "isAssociationReference" attribute
         */
        @Override
        public void unsetIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_attribute(PROPERTY_QNAME[0]);
            }
        }
    }
    /**
     * An XML Activity_hasInternal_ControlLogic(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class ActivityHasInternalControlLogicImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.ReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasInternalControlLogic {
        private static final long serialVersionUID = 1L;

        public ActivityHasInternalControlLogicImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }

        private static final QName[] PROPERTY_QNAME = {
            new QName("", "isAssociationReference"),
        };


        /**
         * Gets the "isAssociationReference" attribute
         */
        @Override
        public boolean getIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[0]);
                }
                return (target == null) ? false : target.getBooleanValue();
            }
        }

        /**
         * Gets (as xml) the "isAssociationReference" attribute
         */
        @Override
        public org.apache.xmlbeans.XmlBoolean xgetIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PROPERTY_QNAME[0]);
                }
                return target;
            }
        }

        /**
         * True if has "isAssociationReference" attribute
         */
        @Override
        public boolean isSetIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
            }
        }

        /**
         * Sets the "isAssociationReference" attribute
         */
        @Override
        public void setIsAssociationReference(boolean isAssociationReference) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
                }
                target.setBooleanValue(isAssociationReference);
            }
        }

        /**
         * Sets (as xml) the "isAssociationReference" attribute
         */
        @Override
        public void xsetIsAssociationReference(org.apache.xmlbeans.XmlBoolean isAssociationReference) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[0]);
                }
                target.set(isAssociationReference);
            }
        }

        /**
         * Unsets the "isAssociationReference" attribute
         */
        @Override
        public void unsetIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_attribute(PROPERTY_QNAME[0]);
            }
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity$ActivityHasInternalControlLogic$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasInternalControlLogic.ValidType {
            private static final long serialVersionUID = 1L;

            public ValidTypeImpl(org.apache.xmlbeans.SchemaType sType) {
                super(sType, false);
            }

            protected ValidTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
                super(sType, b);
            }
        }
    }
    /**
     * An XML Activity_hasSubActivity_Activity(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class ActivityHasSubActivityActivityImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.ReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasSubActivityActivity {
        private static final long serialVersionUID = 1L;

        public ActivityHasSubActivityActivityImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }

        private static final QName[] PROPERTY_QNAME = {
            new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "validType"),
            new QName("", "isAssociationReference"),
        };


        /**
         * Gets a List of "validType" elements
         */
        @Override
        public java.util.List<java.lang.String> getValidTypeList() {
            synchronized (monitor()) {
                check_orphaned();
                return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                    this::getValidTypeArray,
                    this::setValidTypeArray,
                    this::insertValidType,
                    this::removeValidType,
                    this::sizeOfValidTypeArray
                );
            }
        }

        /**
         * Gets array of all "validType" elements
         */
        @Override
        public java.lang.String[] getValidTypeArray() {
            return getObjectArray(PROPERTY_QNAME[0], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
        }

        /**
         * Gets ith "validType" element
         */
        @Override
        public java.lang.String getValidTypeArray(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], i);
                if (target == null) {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }

        /**
         * Gets (as xml) a List of "validType" elements
         */
        @Override
        public java.util.List<org.apache.xmlbeans.XmlString> xgetValidTypeList() {
            synchronized (monitor()) {
                check_orphaned();
                return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                    this::xgetValidTypeArray,
                    this::xsetValidTypeArray,
                    this::insertNewValidType,
                    this::removeValidType,
                    this::sizeOfValidTypeArray
                );
            }
        }

        /**
         * Gets (as xml) array of all "validType" elements
         */
        @Override
        public org.apache.xmlbeans.XmlString[] xgetValidTypeArray() {
            return xgetArray(PROPERTY_QNAME[0], org.apache.xmlbeans.XmlString[]::new);
        }

        /**
         * Gets (as xml) ith "validType" element
         */
        @Override
        public org.apache.xmlbeans.XmlString xgetValidTypeArray(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[0], i);
                if (target == null) {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }

        /**
         * Returns number of "validType" element
         */
        @Override
        public int sizeOfValidTypeArray() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().count_elements(PROPERTY_QNAME[0]);
            }
        }

        /**
         * Sets array of all "validType" element
         */
        @Override
        public void setValidTypeArray(java.lang.String[] validTypeArray) {
            synchronized (monitor()) {
                check_orphaned();
                arraySetterHelper(validTypeArray, PROPERTY_QNAME[0]);
            }
        }

        /**
         * Sets ith "validType" element
         */
        @Override
        public void setValidTypeArray(int i, java.lang.String validType) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], i);
                if (target == null) {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(validType);
            }
        }

        /**
         * Sets (as xml) array of all "validType" element
         */
        @Override
        public void xsetValidTypeArray(org.apache.xmlbeans.XmlString[]validTypeArray) {
            synchronized (monitor()) {
                check_orphaned();
                arraySetterHelper(validTypeArray, PROPERTY_QNAME[0]);
            }
        }

        /**
         * Sets (as xml) ith "validType" element
         */
        @Override
        public void xsetValidTypeArray(int i, org.apache.xmlbeans.XmlString validType) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[0], i);
                if (target == null) {
                    throw new IndexOutOfBoundsException();
                }
                target.set(validType);
            }
        }

        /**
         * Inserts the value as the ith "validType" element
         */
        @Override
        public void insertValidType(int i, java.lang.String validType) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target =
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[0], i);
                target.setStringValue(validType);
            }
        }

        /**
         * Appends the value as the last "validType" element
         */
        @Override
        public void addValidType(java.lang.String validType) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
                target.setStringValue(validType);
            }
        }

        /**
         * Inserts and returns a new empty value (as xml) as the ith "validType" element
         */
        @Override
        public org.apache.xmlbeans.XmlString insertNewValidType(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(PROPERTY_QNAME[0], i);
                return target;
            }
        }

        /**
         * Appends and returns a new empty value (as xml) as the last "validType" element
         */
        @Override
        public org.apache.xmlbeans.XmlString addNewValidType() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[0]);
                return target;
            }
        }

        /**
         * Removes the ith "validType" element
         */
        @Override
        public void removeValidType(int i) {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_element(PROPERTY_QNAME[0], i);
            }
        }

        /**
         * Gets the "isAssociationReference" attribute
         */
        @Override
        public boolean getIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[1]);
                }
                return (target == null) ? false : target.getBooleanValue();
            }
        }

        /**
         * Gets (as xml) the "isAssociationReference" attribute
         */
        @Override
        public org.apache.xmlbeans.XmlBoolean xgetIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[1]);
                if (target == null) {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PROPERTY_QNAME[1]);
                }
                return target;
            }
        }

        /**
         * True if has "isAssociationReference" attribute
         */
        @Override
        public boolean isSetIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().find_attribute_user(PROPERTY_QNAME[1]) != null;
            }
        }

        /**
         * Sets the "isAssociationReference" attribute
         */
        @Override
        public void setIsAssociationReference(boolean isAssociationReference) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
                }
                target.setBooleanValue(isAssociationReference);
            }
        }

        /**
         * Sets (as xml) the "isAssociationReference" attribute
         */
        @Override
        public void xsetIsAssociationReference(org.apache.xmlbeans.XmlBoolean isAssociationReference) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[1]);
                if (target == null) {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[1]);
                }
                target.set(isAssociationReference);
            }
        }

        /**
         * Unsets the "isAssociationReference" attribute
         */
        @Override
        public void unsetIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_attribute(PROPERTY_QNAME[1]);
            }
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity$ActivityHasSubActivityActivity$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasSubActivityActivity.ValidType {
            private static final long serialVersionUID = 1L;

            public ValidTypeImpl(org.apache.xmlbeans.SchemaType sType) {
                super(sType, false);
            }

            protected ValidTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
                super(sType, b);
            }
        }
    }
    /**
     * An XML Activity_has_Step(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class ActivityHasStepImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.ReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasStep {
        private static final long serialVersionUID = 1L;

        public ActivityHasStepImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }

        private static final QName[] PROPERTY_QNAME = {
            new QName("", "isAssociationReference"),
        };


        /**
         * Gets the "isAssociationReference" attribute
         */
        @Override
        public boolean getIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[0]);
                }
                return (target == null) ? false : target.getBooleanValue();
            }
        }

        /**
         * Gets (as xml) the "isAssociationReference" attribute
         */
        @Override
        public org.apache.xmlbeans.XmlBoolean xgetIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PROPERTY_QNAME[0]);
                }
                return target;
            }
        }

        /**
         * True if has "isAssociationReference" attribute
         */
        @Override
        public boolean isSetIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
            }
        }

        /**
         * Sets the "isAssociationReference" attribute
         */
        @Override
        public void setIsAssociationReference(boolean isAssociationReference) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
                }
                target.setBooleanValue(isAssociationReference);
            }
        }

        /**
         * Sets (as xml) the "isAssociationReference" attribute
         */
        @Override
        public void xsetIsAssociationReference(org.apache.xmlbeans.XmlBoolean isAssociationReference) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[0]);
                }
                target.set(isAssociationReference);
            }
        }

        /**
         * Unsets the "isAssociationReference" attribute
         */
        @Override
        public void unsetIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_attribute(PROPERTY_QNAME[0]);
            }
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity$ActivityHasStep$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.Activity.ActivityHasStep.ValidType {
            private static final long serialVersionUID = 1L;

            public ValidTypeImpl(org.apache.xmlbeans.SchemaType sType) {
                super(sType, false);
            }

            protected ValidTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
                super(sType, b);
            }
        }
    }
}
