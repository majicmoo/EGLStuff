#!/bin/sh

found=`ls  java`
echo "" > t.bat
for f in ${found}; do 
    echo "txl .\\java\\${f} -o .\\eol\\${f}.py" >> t.bat
    echo "echo \"**************************\"" >> t.bat
    echo "echo \"${f}\"" >> t.bat
    echo "echo \"**************************\"" >> t.bat   
    echo "eol .\\eol\\${f}.py" >> t.bat
    echo "echo \"\"" >> t.bat   
    echo "" >> t.bat
done
