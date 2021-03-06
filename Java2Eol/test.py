imports = []
import glob
inDynamic = False
inFunction = False
bracketCounter = 0;
inString = False;
inComment = False;
startStatic = 0


def main(fname):
    global imports
    file_origin = open(fname, "r")
    file_edit = open("temp.txt", "r+")
    file_destination = open(fname+".java", "w")
    
    ##find imports
    for line in file_origin:
        findImports(line)
        commentStatic(line, file_edit)
        
    #write imports
    for i in imports:
        writeToFile(file_destination, "import " + i + "\n")
        
    ##write main
    writeToFile(file_destination, "class "+fname+ " {")
    writeToFile(file_destination, "public static void main (String[] args) {\n")
    
    file_edit.close()
    file_edit = open("temp.txt", "r")
    
    ##write dynamic code
    for line in file_edit:
        if "=" in line:
            if line.index('=') == 0:
                writeToFile( file_destination, "//aab"+line)
        else:
            writeToFile( file_destination, line)
    
    #close main funciton
    writeToFile(file_destination, "\n}")
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
        if "import" in i:
            a = i.split("=")
            imports.append(clean(a[a.index("imports") + 1]))
            print imports
    
def clean(string):
    temp = ""
    for i in string:
        if ((i != "\"") and (i != "%") and ( i != "<") and (i != ">")):
            temp += i
    return temp

def writeToFile(file_to, string):
    file_to.write(string)
    
main("artists2.htmljet")   
