import glob
import os

def main(fname):

    ##Used to comment out static parts of Jet
    staticSymbol = "//aab"
    
    ## Used to help indentify stored code in file_store
    storeSymbol = "*%%storeSymbol%%*"    
    
    file_origin = open(fname, "r")
    file_edit = open("temp.txt", "w")
    
    path = "/usr/userfs/m/mep513/Documents/EGLStuff/Jet2Egl/egl"
    
    file_destination = open(os.path.join(path, cleanFileName(fname)+".egl"), "w")
    
    if os.path.isfile(cleanFileName(fname)+"temp.eol"):
        print "hi"
        file_store = open(cleanFileName(fname)+"temp.eol", "r")
        file_store_edit= open ("tempStore.txt", "w")
        
        ## remove semicolons left from java transformation
        maxLine = countLines(file_store)
        print maxLine
        lineCount = 0
        for line in file_store:
            if (lineCount!=0) and (lineCount !=1) and (lineCount != maxLine-1) and (lineCount != maxline):
                writeToFile(file_store_edit, line)
            lineCount += 1
        
        file_store_edit.close()
        file_store_edit= open("tempStore.txt", "r")
        storedLines=file_store_edit.readlines()
        
        
        for line in file_origin:
            if staticSymbol in line:
                print hi
                if storeSymbol in line:
                    lineTemp = line.replace(staticSymbol, "")
                    lineTemp = lineTemp.replace(storeSymbol, "")
                    writeToFile(file_edit, storedLines[lineTemp])
                    print storedLines[lineTemp]
                else:
                    writeToFile(file_edit, line.replace(staticSymbol, ""))
            else:
                writeToFile(file_edit, line) 
              
    else:
        ## remove comments
        for line in file_origin:
            if staticSymbol in line:
                writeToFile(file_edit, line.replace(staticSymbol, ""))
            else:
                writeToFile(file_edit, line)            
    file_edit.close()
    file_edit = open("temp.txt", "r")
    
    ## change brackets
    for line in file_edit:
        if line != "\n" :
            temp = line.replace("%>", "%]")
            writeToFile(file_destination, temp.replace("<%", "[%"))
      
        
    file_origin.close()
    file_edit.close()
    file_destination.close()  
           

def writeToFile(filename, string):
    filename.write(string)
    
def cleanFileName(fname):
    temp = fname.split("/")
    temp = temp[-1]
    temp = temp.split(".")
    return temp[0]


def countLines(fname):
    return sum(1 for line in fname)

path = "/usr/userfs/m/mep513/Documents/EGLStuff/Jet2Egl/eol/*"
files = glob.glob(path)
#print files
for fname in files:
    if "temp" not in cleanFileName(fname):
        main(fname)
        print "Transforming", fname, "from EOL -> EGL"
    else:
        if cleanFileName(fname)[-4:] != "temp":
            main(fname)
