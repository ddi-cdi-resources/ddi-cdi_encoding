===========================================
Syntax Representations of the DDI-CDI Model
===========================================

.. revealjs-section::
   :data-name: Main

Includes published and exploratory approaches

.. warning::
   *Draft, needs revision*

.. only:: revealjs

   |

:Compiled by: Joachim Wackerow and Deirdre Lungley

Overview
========

* Approaches that use the DDI-CDI UML model (Canonical XMI) as a basis
* Approaches that use the DDI-CDI XML Schema as a basis, which is generated from the UML model. Often called XML Schema based data binding.
  The generators create usually program libraries.

Overview on Generated Encodings
-------------------------------

.. list-table::
   :widths: 50 50
   :header-rows: 1

   * - UML Model as Basis
     - XML Schema as Basis
   * -   * XML Schema
         * Ontology (Turtle)
         * JSON-LD
     -   * C#
         * C++
         * Java
         * JSON Schema (issues)
         * Python
         * R
         * Typescript

.. only:: revealjs

   .. include:: ddi-cdi.rst
   .. include:: ucmis.rst
   .. include:: canonical-xmi.rst
   .. include:: /model_based/xsd.rst
   .. include:: /model_based/rdf.rst
   .. include:: /xsd_based/c#/c#.rst
   .. include:: /xsd_based/c++/c++.rst
   .. include:: /xsd_based/java/java.rst
   .. include:: /xsd_based/json-schema/json-schema.rst
   .. include:: /xsd_based/python/python.rst
   .. include:: /model_based/python.rst
   .. include:: /xsd_based/r/omegahat_XMLSchema/r.rst
   .. include:: /model_based/r.rst
   .. include:: /xsd_based/typescript/typescript.rst
   .. include:: open-issues.rst

.. only:: rtd

   .. toctree::

      ddi-cdi.rst
      ucmis.rst
      canonical-xmi.rst
      /model_based/xsd.rst
      /model_based/rdf.rst
      /xsd_based/c#/c#.rst
      /xsd_based/c++/c++.rst
      /xsd_based/java/java.rst
      /xsd_based/json-schema/json-schema.rst
      /xsd_based/python/python.rst
      /model_based/python.rst
      /xsd_based/r/omegahat_XMLSchema/r.rst
      /model_based/r.rst
      /xsd_based/typescript/typescript.rst
      open-issues.rst
