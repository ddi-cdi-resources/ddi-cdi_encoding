/*
 * XML Type:  ConceptStructure
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptStructure
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML ConceptStructure(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class ConceptStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptStructure {
    private static final long serialVersionUID = 1L;

    public ConceptStructureImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "identifier"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "name"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "purpose"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "semantics"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "specification"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "topology"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "totality"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ConceptStructure_structures_ConceptSystem"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ConceptStructure_has_ConceptRelationship"),
    };


    /**
     * Gets the "identifier" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier getIdentifier() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier)get_store().find_element_user(PROPERTY_QNAME[0], 0);
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
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "identifier" element
     */
    @Override
    public void setIdentifier(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier identifier) {
        generatedSetterHelperImpl(identifier, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "identifier" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier addNewIdentifier() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier)get_store().add_element_user(PROPERTY_QNAME[0]);
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
            get_store().remove_element(PROPERTY_QNAME[0], 0);
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
        return getXmlObjectArray(PROPERTY_QNAME[1], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName[0]);
    }

    /**
     * Gets ith "name" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName getNameArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName)get_store().find_element_user(PROPERTY_QNAME[1], i);
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
            return get_store().count_elements(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets array of all "name" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setNameArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName[] nameArray) {
        check_orphaned();
        arraySetterHelper(nameArray, PROPERTY_QNAME[1]);
    }

    /**
     * Sets ith "name" element
     */
    @Override
    public void setNameArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName name) {
        generatedSetterHelperImpl(name, PROPERTY_QNAME[1], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "name" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName insertNewName(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName)get_store().insert_element_user(PROPERTY_QNAME[1], i);
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
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName)get_store().add_element_user(PROPERTY_QNAME[1]);
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
            get_store().remove_element(PROPERTY_QNAME[1], i);
        }
    }

    /**
     * Gets the "purpose" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getPurpose() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "purpose" element
     */
    @Override
    public boolean isSetPurpose() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "purpose" element
     */
    @Override
    public void setPurpose(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString purpose) {
        generatedSetterHelperImpl(purpose, PROPERTY_QNAME[2], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "purpose" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewPurpose() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Unsets the "purpose" element
     */
    @Override
    public void unsetPurpose() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }

    /**
     * Gets the "semantics" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getSemantics() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "semantics" element
     */
    @Override
    public boolean isSetSemantics() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]) != 0;
        }
    }

    /**
     * Sets the "semantics" element
     */
    @Override
    public void setSemantics(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry semantics) {
        generatedSetterHelperImpl(semantics, PROPERTY_QNAME[3], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "semantics" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewSemantics() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Unsets the "semantics" element
     */
    @Override
    public void unsetSemantics() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], 0);
        }
    }

    /**
     * Gets the "specification" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.StructureSpecification getSpecification() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.StructureSpecification target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.StructureSpecification)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "specification" element
     */
    @Override
    public boolean isSetSpecification() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[4]) != 0;
        }
    }

    /**
     * Sets the "specification" element
     */
    @Override
    public void setSpecification(org.ddialliance.specification.ddiCDI.x10.xmlSchema.StructureSpecification specification) {
        generatedSetterHelperImpl(specification, PROPERTY_QNAME[4], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "specification" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.StructureSpecification addNewSpecification() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.StructureSpecification target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.StructureSpecification)get_store().add_element_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * Unsets the "specification" element
     */
    @Override
    public void unsetSpecification() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[4], 0);
        }
    }

    /**
     * Gets the "topology" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getTopology() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().find_element_user(PROPERTY_QNAME[5], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "topology" element
     */
    @Override
    public boolean isSetTopology() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[5]) != 0;
        }
    }

    /**
     * Sets the "topology" element
     */
    @Override
    public void setTopology(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry topology) {
        generatedSetterHelperImpl(topology, PROPERTY_QNAME[5], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "topology" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewTopology() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().add_element_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * Unsets the "topology" element
     */
    @Override
    public void unsetTopology() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[5], 0);
        }
    }

    /**
     * Gets the "totality" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.StructureExtent.Enum getTotality() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[6], 0);
            return (target == null) ? null : (org.ddialliance.specification.ddiCDI.x10.xmlSchema.StructureExtent.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "totality" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.StructureExtent xgetTotality() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.StructureExtent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.StructureExtent)get_store().find_element_user(PROPERTY_QNAME[6], 0);
            return target;
        }
    }

    /**
     * True if has "totality" element
     */
    @Override
    public boolean isSetTotality() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[6]) != 0;
        }
    }

    /**
     * Sets the "totality" element
     */
    @Override
    public void setTotality(org.ddialliance.specification.ddiCDI.x10.xmlSchema.StructureExtent.Enum totality) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[6], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[6]);
            }
            target.setEnumValue(totality);
        }
    }

    /**
     * Sets (as xml) the "totality" element
     */
    @Override
    public void xsetTotality(org.ddialliance.specification.ddiCDI.x10.xmlSchema.StructureExtent totality) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.StructureExtent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.StructureExtent)get_store().find_element_user(PROPERTY_QNAME[6], 0);
            if (target == null) {
                target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.StructureExtent)get_store().add_element_user(PROPERTY_QNAME[6]);
            }
            target.set(totality);
        }
    }

    /**
     * Unsets the "totality" element
     */
    @Override
    public void unsetTotality() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[6], 0);
        }
    }

    /**
     * Gets the "ConceptStructure_structures_ConceptSystem" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptStructure.ConceptStructureStructuresConceptSystem getConceptStructureStructuresConceptSystem() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptStructure.ConceptStructureStructuresConceptSystem target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptStructure.ConceptStructureStructuresConceptSystem)get_store().find_element_user(PROPERTY_QNAME[7], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "ConceptStructure_structures_ConceptSystem" element
     */
    @Override
    public boolean isSetConceptStructureStructuresConceptSystem() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[7]) != 0;
        }
    }

    /**
     * Sets the "ConceptStructure_structures_ConceptSystem" element
     */
    @Override
    public void setConceptStructureStructuresConceptSystem(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptStructure.ConceptStructureStructuresConceptSystem conceptStructureStructuresConceptSystem) {
        generatedSetterHelperImpl(conceptStructureStructuresConceptSystem, PROPERTY_QNAME[7], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "ConceptStructure_structures_ConceptSystem" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptStructure.ConceptStructureStructuresConceptSystem addNewConceptStructureStructuresConceptSystem() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptStructure.ConceptStructureStructuresConceptSystem target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptStructure.ConceptStructureStructuresConceptSystem)get_store().add_element_user(PROPERTY_QNAME[7]);
            return target;
        }
    }

    /**
     * Unsets the "ConceptStructure_structures_ConceptSystem" element
     */
    @Override
    public void unsetConceptStructureStructuresConceptSystem() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[7], 0);
        }
    }

    /**
     * Gets a List of "ConceptStructure_has_ConceptRelationship" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptStructure.ConceptStructureHasConceptRelationship> getConceptStructureHasConceptRelationshipList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getConceptStructureHasConceptRelationshipArray,
                this::setConceptStructureHasConceptRelationshipArray,
                this::insertNewConceptStructureHasConceptRelationship,
                this::removeConceptStructureHasConceptRelationship,
                this::sizeOfConceptStructureHasConceptRelationshipArray
            );
        }
    }

    /**
     * Gets array of all "ConceptStructure_has_ConceptRelationship" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptStructure.ConceptStructureHasConceptRelationship[] getConceptStructureHasConceptRelationshipArray() {
        return getXmlObjectArray(PROPERTY_QNAME[8], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptStructure.ConceptStructureHasConceptRelationship[0]);
    }

    /**
     * Gets ith "ConceptStructure_has_ConceptRelationship" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptStructure.ConceptStructureHasConceptRelationship getConceptStructureHasConceptRelationshipArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptStructure.ConceptStructureHasConceptRelationship target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptStructure.ConceptStructureHasConceptRelationship)get_store().find_element_user(PROPERTY_QNAME[8], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ConceptStructure_has_ConceptRelationship" element
     */
    @Override
    public int sizeOfConceptStructureHasConceptRelationshipArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[8]);
        }
    }

    /**
     * Sets array of all "ConceptStructure_has_ConceptRelationship" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setConceptStructureHasConceptRelationshipArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptStructure.ConceptStructureHasConceptRelationship[] conceptStructureHasConceptRelationshipArray) {
        check_orphaned();
        arraySetterHelper(conceptStructureHasConceptRelationshipArray, PROPERTY_QNAME[8]);
    }

    /**
     * Sets ith "ConceptStructure_has_ConceptRelationship" element
     */
    @Override
    public void setConceptStructureHasConceptRelationshipArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptStructure.ConceptStructureHasConceptRelationship conceptStructureHasConceptRelationship) {
        generatedSetterHelperImpl(conceptStructureHasConceptRelationship, PROPERTY_QNAME[8], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ConceptStructure_has_ConceptRelationship" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptStructure.ConceptStructureHasConceptRelationship insertNewConceptStructureHasConceptRelationship(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptStructure.ConceptStructureHasConceptRelationship target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptStructure.ConceptStructureHasConceptRelationship)get_store().insert_element_user(PROPERTY_QNAME[8], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ConceptStructure_has_ConceptRelationship" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptStructure.ConceptStructureHasConceptRelationship addNewConceptStructureHasConceptRelationship() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptStructure.ConceptStructureHasConceptRelationship target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptStructure.ConceptStructureHasConceptRelationship)get_store().add_element_user(PROPERTY_QNAME[8]);
            return target;
        }
    }

    /**
     * Removes the ith "ConceptStructure_has_ConceptRelationship" element
     */
    @Override
    public void removeConceptStructureHasConceptRelationship(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[8], i);
        }
    }
    /**
     * An XML ConceptStructure_structures_ConceptSystem(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class ConceptStructureStructuresConceptSystemImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptStructure.ConceptStructureStructuresConceptSystem {
        private static final long serialVersionUID = 1L;

        public ConceptStructureStructuresConceptSystemImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptStructure$ConceptStructureStructuresConceptSystem$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptStructure.ConceptStructureStructuresConceptSystem.ValidType {
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
     * An XML ConceptStructure_has_ConceptRelationship(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class ConceptStructureHasConceptRelationshipImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptStructure.ConceptStructureHasConceptRelationship {
        private static final long serialVersionUID = 1L;

        public ConceptStructureHasConceptRelationshipImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }

        private static final QName[] PROPERTY_QNAME = {
            new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "validType"),
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
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptStructure$ConceptStructureHasConceptRelationship$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptStructure.ConceptStructureHasConceptRelationship.ValidType {
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
