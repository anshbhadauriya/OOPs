Why java?

dekho cpp me compiler hota hai jo ki kisi code ko machine code (0/1) me convert krta hai too vo har platform ke lie alg krta hai that means ki tum agr apna pc se compile kroge code too uski
ek .exe file bnegi so that wont work on others OS so u might think ki seedhe code share krdo fir baad me compile kr lena but u dont want to share your source code for security reason ofc
so we can say c/cpp is platform dependent
c/cpp was not that simple (pointers and all)
c/cpp was not very secure

so bcs of all these reasons java was born
Java is portable,simple and secure

so in case of java when we compile code so it becomes byte code so abh jab vo byte code dusre OS me jaega too ussme JVM hoga that will convert this byte code to machine code (0/1) 
Java code (.java)
        ↓
Java Compiler (javac)
        ↓
Bytecode (.class)
        ↓
JVM
        ↓
Machine Code
        ↓
CPU executes it

bss dusre OS ya platform me jvm hona chaiyee

aur haan jvm is platform dependent mtlb har pc ke lie apna jvm hoga taabhi vo apne system ke hisaab se code convert krta hai kyuki har pc aur platform ka OS alg ho skta hai

and thats how java achieves portability

soo agr aisse portability achieve kr skte hai too cpp walo ne yeh cheez kyu nahi upgrade krii

actually iske lie unnhone new language lai called c# which is portable and c# is developed by microsoft

######## Java is both compiler and interpreter ###########

Compiler converts source code to byte code and later in other system JVM interpreter + JIT compiler ke through converts byte code to machine code line by line

The Java compiler converts source code into platform-independent bytecode. The JVM on the target system interprets or JIT-compiles that bytecode into platform-specific machine code for execution.

JVM also provides security as bytecode runs in JVM
The JVM is also responsible for garbage collection. 

When your Java program creates objects:

Student s = new Student();

The object is generally stored in heap memory.

When an object is no longer reachable/used:

s = null;

The JVM's Garbage Collector (GC) can identify that the object is no longer reachable and reclaim its memory automatically.

######### JRE #########

JRE provides the environment needed to run Java programs, mainly through the JVM and Java class libraries.
When we say JRE provides the environment to run Java, we mean:

JRE gives your Java program the JVM + Java libraries + supporting runtime files it needs to execute.

######### JDK ########

It provides everything you need to write, compile, debug, and run Java programs.

JDK = JRE + Compiler,debugger,Java Docs etc.

<img width="1070" height="771" alt="image" src="https://github.com/user-attachments/assets/a1b439b8-1e24-4031-b2ce-dda605235cd2" />




