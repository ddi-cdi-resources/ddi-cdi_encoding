JSON Schema
===========

.. revealjs-vertical::
   :data-name: JSON Schema

| Approach is based on the XML Schema:
| **xsd2jsonschema** - *A pure JavaScript library for translating complex XML Schemas into JSON Schemas.*

* `xsd2jsonschema repository <https://github.com/andrewbober/xsd2jsonschema>`_

.. card::

   Other known approaches are provided by the commercial products Altova XML Spy and Oxygen XML Editor.

JSON Schema Generation with xsd2jsonschema - Windows Batch File
---------------------------------------------------------------

.. literalinclude:: /xsd_based/json-schema/run.cmd
   :caption: run.cmd
   :language: bat
   :linenos:

xs:choice Doesn't Seem to be Implemented
----------------------------------------

.. literalinclude:: /xsd_based/json-schema/generation.log
   :caption: generation.log
   :language: text
   :linenos:
