imports = []
includes = set() 
import glob
inDynamic = False
inFunction = False
bracketCounter = 0;
inString = False;
inComment = False;
startStatic = 0
import os


def main(fname):
    global imports
    global includes
    file_origin = open(fname, "r")
    file_edit = open("temp.txt", "w")
    path = "/usr/userfs/m/mep513/Documents/EGLStuff/Jet2Egl/java"
    file_destination = open(os.path.join(path, cleanFileName(fname)+".java"), "w")
    
    ## loop through jet file
    ##  1. Look for imports and store in a list
    ##  2. Look for includes and store in a list
    ##  3. Comment out static parts of Jet with symbol "//aab" and save changes to temporary file
    for line in file_origin:
        findImports(line)
        findIncludes(line)
        commentStatic(line, file_edit)
          
    ##write main
    writeToFile(file_destination, "class "+cleanFileName(fname)+ " {\n")
    writeToFile(file_destination, "public static void main (String[] args) {\n")
    
    # write imports
    # Loop through import list and add them to top of java file
    for i in imports:
        writeToFile(file_destination, "//aab<%import " + i + ";%>\n")
    
    #write includes
    for i in includes:
        print i
        writeToFile(file_destination, "//aab<% include(\""+i+"\");%>\n")
    
    file_edit.close()
    file_edit = open("temp.txt", "r")
    

    ##write dynamic code
    for line in file_edit:
        if "=" in line:
            if line.index('=') == 0:
                writeToFile( file_destination, "//aab"+line)
            else:
                writeToFile( file_destination, line)
        else:
            writeToFile( file_destination, line)
    
    #close main funciton
    writeToFile(file_destination, "\n}\n}")
    file_origin.close()
    file_edit.close()
    file_destination.close()  
    
        
def commentStatic(line, filename):
    count = 0
    global startStatic
    global inDynamic
    
    ##returns if an import statement
    if "import" in line:
        return
    
    ##returns if an import statement   
    if "@ include" in line:
        return

    temp = False
    for char in line:
        if inDynamic == False:
            if count == 0:
                writeToFile(filename, "//aab")
            if temp == True:
                temp = False
                if (char == "%"):
                    inDynamic = True
                    writeToFile(filename, char)
                    writeToFile(filename, "\n")
                    ##print "Entering Dynamic\n"
                    ##print char
                else:
                    writeToFile(filename, char)
                    ##print char
            else:
                if char == "<":
                    temp = True
                writeToFile(filename, char)
                ##print char
                
                    
        else:
            if temp == True:
                temp = False
                if (char == ">"):
                    inDynamic = False
                    writeToFile(filename, "\n" +"//aab%>")
                    ##print "Exiting Dynamic\n"
                   ## print char
                else:
                    writeToFile(filename, char)
                    ##print char
            else:
                if char == "%":
                    temp = True
                    ##print char
                else:
                    writeToFile(filename, char)
                    ##print char
        count += 1

def findImports(line):
    global imports
    temp = line.split()
    for i in temp:
        if "imports" in i:
            a = i.split("=")
            imports.append(clean(a[a.index("imports") + 1]))
            


def findIncludes(line):
    global includes
    if "@ include" in line:
        temp = line.split()
        for i in temp:
            if "file" in i:
                a = i.split("=")
                includes.add(clean(a[1]))

   
def clean(string):
    temp = ""
    for i in string:
        if ((i != "\"") and (i != "%") and ( i != "<") and (i != ">")):
            temp += i
    return temp

def writeToFile(file_to, string):
    file_to.write(string)

def cleanFileName(fname):
    temp = fname.split("/")
    temp = temp[-1]
    temp = temp.split(".")
    return temp[0]

path = "/usr/userfs/m/mep513/Documents/EGLStuff/Jet2Egl/jet/*"
files = glob.glob(path)
print "************************"
print "Transforming Jet to Java"
for fname in files:
    print fname
    main(fname)   
print "************************"
