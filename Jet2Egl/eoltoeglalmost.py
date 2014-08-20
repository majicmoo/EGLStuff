import glob
import os

def main(fname):

    ##Used to comment out static parts of Jet
    staticSymbol = "//&&&staticSymbol&&&"
    
    ## Used to help indentify stored code in file_store
    storeSymbol = "*%%storeSymbol%%*"    
    
    file_origin = open(fname, "r")
    file_edit = open("temp.txt", "w")
    
    path = "/usr/userfs/m/mep513/Documents/EGLStuff/Jet2Egl/egl"
    eolPath = "/usr/userfs/m/mep513/Documents/EGLStuff/Jet2Egl/eol"
    file_destination = open(os.path.join(path, cleanFileName(fname)+".egl"), "w")
    
    
    ## Check if fnametemp exists, 
    ## if it does insert it into fname and remove comments.
    if os.path.isfile(os.path.join(eolPath, cleanFileName(fname)+"temp.eol")):
    
        ## open fnametemp (file_store)
        file_store = open(os.path.join(eolPath, cleanFileName(fname)+"temp.eol"), "r")
        
        ## open a file to write edits to fname temp to
        ## called file_store_edit
        file_store_edit= open ("tempStore.txt", "w")
        
        ## remove semicolons left from java transformation
        ## save changes to file_store_edit
        maxLine = sum(1 for line in file_store if line.rstrip('\n'))
        lineCount = 0
        
        ## For some reason python doesn't like you accessing a file twice
        file_store.close()
        file_store = open(os.path.join(eolPath, cleanFileName(fname)+"temp.eol"), "r")
        
        ## 
        for line in file_store:
            line = line.rstrip()
            if line:
                if (lineCount!=0) and (lineCount !=1) and (lineCount != maxLine-2) and (lineCount != maxLine-1):
                    writeToFile(file_store_edit, line)
                lineCount += 1
        
        file_store.close()
        file_store_edit.close()
        
        ## Read original file and remove comments
        ## Insert equals parts in
        file_store_edit= open("tempStore.txt", "r")
        storedLines=file_store_edit.readlines()
        for line in file_origin:
            if staticSymbol in line:
                if storeSymbol in line:
                    lineTemp = line.replace(staticSymbol, "")
                    lineTemp = lineTemp.replace(storeSymbol, "")
                    writeToFile(file_edit, storedLines[int(clean(lineTemp))])
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

def clean(string):
    temp = ""
    for i in string:
        if ((i != "\"") and (i != "%") and ( i != "<") and (i != ">")):
            temp += i
    return temp

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
