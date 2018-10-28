#!/bin/sh
filename=$1
javafilename=${filename//.kt/.jar}
eval "kotlinc $filename -include-runtime -d $javafilename"
eval "java -jar $javafilename"
