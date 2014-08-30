echo " "
echo "**************************"
echo "Transforming from JET to EGL"
echo "**************************"
echo " "
python ./jettojavaalmost.py
echo " "
echo "**************************"
python ./transform.py
echo "**************************"
echo " "
echo "**************************"
python ./eoltoeglalmost.py
echo "**************************"
echo " "
echo "**************************"
python ./formatter.py
echo "**************************"
echo " "
echo "Testing"
javac -cp packages/*:. Testing.java
java -cp packages/*:src:. Testing
javac -cp packages/*:src:. JetTest.java
java -cp packages/*:src:. JetTest


wdiff ./compare/jet.txt ./compare/egl.txt >/dev/null;REPLY=$?
if [ ${REPLY} -eq 0 ]
then
         echo "Files are identical"
else
         echo "Files are different"
fi
