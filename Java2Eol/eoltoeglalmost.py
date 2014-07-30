def main(fname):
    file_origin = open(fname, "r")
    file_edit = open("temp.txt", "w")
    file_destination = open(cleanFileName(fname)+".egl", "w")
    
    ## remove comments
    for line in file_origin:
        if "//aab" in line:
           writeToFile(file_edit, line.replace("//aab", ""))
        else:
            writeToFile(file_edit, line)            
    file_edit.close()
    file_edit = open("temp.txt", "r")
    
    ## change brackets
    for line in file_edit:
        temp = line.replace("%>", "%]")
        writeToFile(file_destination, temp.replace("<%", "[%"))
        
    file_origin.close()
    file_edit.close()
    file_destination.close()  
           

def writeToFile(filename, string):
    filename.write(string)
    
def cleanFileName(fname):
    temp = fname.split(".")
    return temp[0]


main("artists2.java")
