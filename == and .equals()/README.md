== compares references for objects, while .equals() compares the logical equality/content of objects, depending on how the class implements it.

dekho incase of objects like string or stringbuilder if we do == it compares refernce (address) which will always not equal 
if we do .equals() so it compares the content /data 

in case of primitive like
byte
short
int
long
float
double
char
boolean

== compares content/data 
equals() give compile error in case of primitive
