wdiff ./compare/jet.txt ./compare/egl.txt >/dev/null;REPLY=$?
if [ ${REPLY} -eq 0 ]
then
         echo "Files are identical"
else
         echo "Files are different"
fi
