class testEverything {
public static void main (String[] args) {
//&&&staticSymbol&&&<%import testing.*;%>
//&&&staticSymbol&&&<%import abc.*;%>
//&&&staticSymbol&&&<%import iasdoh.*;%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&Do While
//&&&staticSymbol&&&<%
int count = 1; 
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
do {
            System.out.println("Count is: " + count);
            count++;
        } while (count < 11);
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&Switch
//&&&staticSymbol&&&<%
 int month = 8; 
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
String monthString;
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
switch (month) {
            case 1:  monthString = "January";
                     break;
            case 2:  monthString = "February";
                     break;
            case 3:  monthString = "March";
                     break;
            case 4:  monthString = "April";
                     break;
            case 5:  monthString = "May";
                     break;
            case 6:  monthString = "June";
                     break;
            case 7:  monthString = "July";
                     break;
            case 8:  monthString = "August";
                     break;
            case 9:  monthString = "September";
                     break;
            case 10: monthString = "October";
                     break;
            case 11: monthString = "November";
                     break;
            case 12: monthString = "December";
                     break;
            default: monthString = "Invalid month";
                     break; 
           
            } 
//&&&staticSymbol&&&%>         
//&&&staticSymbol&&&If
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
if (month == 8) {
    month = 7;
} else {
    month = 9;
} 
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&For loop
//&&&staticSymbol&&&<%
int a = 0;
int[] numbers = {1,2,3,4,5,6,7,8,9,10};
for (int item : numbers) {
    a = item;
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    
//&&&staticSymbol&&&
//&&&staticSymbol&&&
//&&&staticSymbol&&&
//&&&staticSymbol&&&

}
}