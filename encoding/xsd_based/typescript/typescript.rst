Typescript
==========

.. revealjs-vertical::
   :data-name: Typescript

| Approach is based on the XML Schema:
| **cxsd** *is a streaming XSD parser and XML parser generator for Node.js and TypeScript.*

* `cxsd repository <https://github.com/charto/cxsd>`_

.. card::

   * The input XML Schema must be provided by a web server.
   * cxsd generates the files XMLSchema.d.ts and XMLSchema.js.

Typescript Generation with cxsd - Windows Batch File
----------------------------------------------------

.. literalinclude:: /xsd_based/typescript/run_cxsd.cmd
   :caption: run_cxsd.cmd
   :language: bat
   :linenos:

..
   XML Schema Variant 4.3 Results in an Error
   ------------------------------------------

   .. literalinclude:: /xsd_based/typescript/43.log
      :caption: 43.log
      :language: bat
      :linenos:
