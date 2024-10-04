set OUTPUT_FOLDER=build\rtd
rmdir /q/s %OUTPUT_FOLDER%

sphinx-build.exe	^
  -b html			^
  -c config_rtd		^
  -t rtd			^
  encoding			^
  %OUTPUT_FOLDER%

set OUTPUT_FOLDER=
