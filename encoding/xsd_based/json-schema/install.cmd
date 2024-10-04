rem   The first line just sets up NPM to allow calling cxsd without installing it globally. It also works on Windows if you omit the single quotes (').
echo { "scripts": { "xsd2jsonschema": "xsd2jsonschema" } } > package.json
npm install xsd2jsonschema