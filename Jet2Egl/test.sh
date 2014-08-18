python ./jettojavaalmost.py
echo "**************************"
echo "BlockDemo.java"
txl -comment ./java/BlockDemo.java -o ./eol/BlockDemo.eol 
echo "**************************"
echo "**************************"
echo "Artists2.java"
txl -comment ./java/artists2.java -o ./eol/artists2.eol
echo "**************************"
echo "**************************"
echo "Images.java"
txl -comment ./java/Images.java -o ./eol/Images.eol 
echo "**************************"
echo "**************************"
echo "TestCase.java"
txl -comment ./java/TestCase.java -o ./eol/TestCase.eol 
echo "**************************"
echo "TestCasetemp.java"
txl -comment ./java/TestCasetemp.java -o ./eol/TestCasetemp.eol 
echo "**************************"
python ./eoltoeglalmost.py
