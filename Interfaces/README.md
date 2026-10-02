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


