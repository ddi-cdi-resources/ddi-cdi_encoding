set OUTPUT_FOLDER=build\revealjs
rmdir /q/s %OUTPUT_FOLDER%

sphinx-build.exe		^
  -b revealjs			^
  -c config_revealjs	^
  -t revealjs			^
  encoding				^
  %OUTPUT_FOLDER%

set OUTPUT_FOLDER=
