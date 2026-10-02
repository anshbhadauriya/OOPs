In java we can achieve abstraction using 2 ways:
-Abstract Classes
-Interfaces

Interface hame yeh batata hai ki Koi cheez kya kr skti hai bina yeh batae ki kaise kr skti hai 

<img width="823" height="326" alt="image" src="https://github.com/user-attachments/assets/fa285c6b-0753-4357-8f19-073c53452382" />

lekin yeh too abstract class bhi batati thi !! 

<img width="1382" height="863" alt="image" src="https://github.com/user-attachments/assets/0d6d19b3-b7f1-4902-9500-59c9b71fa0ec" />

contract ka mtlb hai yaha ki agr koi class implement kr rhi hai interface ko too usse vo sare methods ki defintion deni padegi jo bhi interface me likhe hai
in case koi class sare method ki implementation provide nhi kr paati too usko hame abstract class banana pdta hai

by default, methods of interface are always public


abh maan lo tum nhi chahte ki sare methods ko define kro after implementing interface

so tum kya kr skte ho ki uss method ko bhi abstract bana kr chor do child class me aur agr ek method abstract hai class ko so uk ki class ko bhi abstract banana pdega
like this:

<img width="432" height="193" alt="image" src="https://github.com/user-attachments/assets/975f6eb8-6ff5-41a7-afc0-d7a8fe0cf133" />
<img width="912" height="845" alt="image" src="https://github.com/user-attachments/assets/be9f857f-38d9-4ec6-ac65-e0bf6883f043" />
<img width="642" height="187" alt="image" src="https://github.com/user-attachments/assets/662f0415-eaa2-4d21-9c0d-66e00f029f3f" />


### Agr tum koi variable banaoge interface me too java usse apne aap public static final krdega ! but why?

dekho public too har variable ke aage lag jata hai interface me lekin static isslie kyuki we know ki ham interface ka objects nhi bana skte too agr static nhi hoga too yeh variable kisi 
objects se link hojaege..isslie static bhi lag jata hai aur final isslie kyuki interface ke kisi variable ki value change nhi kr skte..

isslie java compiler apne aap **public static final** laga deta hai

aur iske static hone ki wjh se u can call it like this
<img width="746" height="410" alt="image" src="https://github.com/user-attachments/assets/f4e3b343-0415-45e2-881c-9a37e3e66354" />

so agr kabhi project me aissi situation ho jaha tumhe constant variable banane ho jinki value change na ho so instead of making class just make interface
bcs in class tumhe manually likhna pdega static final but in interface compiler apna aap hi usko static final smjhta h


## Java 8 ke baad interface me kya kya changes aae?

dekho before java 8 ham kisi bhi method ki body nhi bana skte the mtlb kisi method me kch implementation nhi ho skti thi
but after java 8.. default method ko use krke implementation kra ja skte the
<img width="857" height="525" alt="image" src="https://github.com/user-attachments/assets/93d5080a-3d81-466c-b04f-41c21964b3aa" />

## But interface me default method wala feature laane ki kya zaroort thi?...interface ki main cheez hi thi ki vo bss declare krega? aissa kyu kra gya??

the reason is very interesting..
dekho jaise collections me ek interface hamne pdha like list interface 
abh maan lo java ko koi new method lana ho list interface ka.... lets say pushback() krke abh isse problem yeh hogi ki jitni bhi exisiting classes hai jo list interface ko implement krti hai like array list sbme override krna pdega pushback ko aur uska implementation dena pdega
jo ki bhot kharab cheez hogi 
issiliee default method introduce hua

### aur JAVA 9 ke baad se interface me private methods bhi aaskte h
but private ko tum bahar se too access kr nhi skte ..so yeh bss interface ke andr hi access hoga

## Tumne yeh too suna hoga ki using interface ham multiple inheritance achieve kr skte hai aur diamond problem se bach skte hai....But how exactly?
o
dekho agr tum interface use kroge so uk tum kisi method ka implementation nhi kr skte the traditionally so at the end tum base class me hi implementation kroge issi trh diamond problem break hojati h
like this:
<img width="640" height="502" alt="image" src="https://github.com/user-attachments/assets/6d8f2542-b46c-4e97-814a-bb340c91c686" />

## but JAVA 8 ke baad too ham default method use kr skte hai..jisse ham implementation bhi parent interface me kr skte hai.. uss situation me kya hoga??

too agr aissi situation aati hai so you have to override parent interface in child ... yeh rule bana dia java ne
abhh isse yeh hoga ki upr wale methods ki implementation se mtlb nhi..jo bhi override krke implementation di usse hi mtlb hai
<img width="413" height="497" alt="image" src="https://github.com/user-attachments/assets/1f6c9057-ee89-41a1-8c21-747757aa6350" />

**lekin tum chahte ho ki tum parent ka implementation use kro too voo kaise hoga?**
use **super** keyword
<img width="482" height="512" alt="image" src="https://github.com/user-attachments/assets/1f5e965a-34a3-4806-8f31-b765b3299381" />

you cannot do B.fun() bcs it is not static anymore..it is instance method bcs of default keyword

## Java resolution priority rule

<img width="805" height="670" alt="image" src="https://github.com/user-attachments/assets/523bf9a2-b3be-4e5a-af48-fb9f1a66a915" />
abh kabhi aissi situation hai jab tum class aur interface dono ko inherit kr rhe ho too hamehsa class ko hi priority di jaegi
so here **Inside B class** output aaega

## too java 9 ke baad interface itna sab kr skta hai soo how is it different from abstract class.. so actually difference kya hai interface aur abstract class ka?

**Intention -** interface contract dikhane ke lie use hota hai ki koi class kya kr skti hai..kya functionality hai class ki..isslie interface is used as verb generally
like runnable,walkable,flyable,payable

Abstract class hame batata hai families of similar class like dog , duck , elephant all these comes under animal soo agr hme eat add krna hai too bss animal me add krdege..har ek ke child 
me nhi define krna hoga
**issilie inheritance ko ham IS A relationship bolte hai**
**aur interface ko CAN DO relationship bolte hai**

**(1)** aur interface me ham normal instace fields nhi define kr skte mtlb aissa koi variable jo public static final na ho yeh nhi ho skta in interface
but in case of abstract class ham instance variable define kr skte h

**(2)** interface ke andr constructors nhi ho skte bcs constructor too object ke lie hote hai na jabki interface ko objects se lena dena nhi..
but in case of abstract class constructors ho skte hai

**(3)** interface multiple inheritance support krta hai but abstract class nhi

**(4)** interface me methods sare public hote hai..haan vo alg baat hai ki abh private bhi bana skte hai after java 9
but in case of abstract class u can use any access modifier- private,public,protected,default


# Functional interfaces
vo interface jiske andr sirf ek hi method ho..
<img width="211" height="165" alt="image" src="https://github.com/user-attachments/assets/a2d2fbaa-86c0-4a65-96f8-58cd08c6da7e" />

abh iska ek special naam kyu dia functional interface krke??..yeh too normal cheez hai??
bcs yeh java ke bhot important concept ko unlock krte hai jisse bolte hai **functional programming**  using lambda expressions..
java me already kai sare functional interface exist krte hai like-> comparable interface,predicate interface

# Marker interfaces

vo itnterface jiske andr koi method nhi hotaa..
<img width="255" height="105" alt="image" src="https://github.com/user-attachments/assets/ddac8cfb-04e7-4257-a8a9-3e6b6a467861" />

JAVA me 3 type ke marker interface hote hai

<img width="856" height="427" alt="image" src="https://github.com/user-attachments/assets/f7bde69f-4afc-42b2-8c97-2e6e9644f3b8" />

marker interface bss represent krne ke lie hote hai ki tum kisi class ko clone krna chahte hoo..like this:
<img width="1006" height="696" alt="image" src="https://github.com/user-attachments/assets/4ee3a791-9591-4f92-8c26-6e039bee502e" />

i think this is enough for interface.
