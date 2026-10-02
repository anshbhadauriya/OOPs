dekho when we create a new string like String str="ansh"; 
so here String is a class and it points to a object 
aur uss object ki value hai ansh 

now you can do str="aman";
so java uss ansh wale object ko modify nhi krta vo ek new object ko create kr deta hai in the memory so now str is pointing to new object 

## but why we cannot modify?

lets say we create a string literal (literal mtlb double quotes ko use krke directly value dedena) ""  like String name="John"; 
and now we again make a new string like String anotherName="John"; so here java will not create a new object for anotherName..it actually uses object of string name

so when java creates a string object from literal it actually puts that string object in STRING POOL 
so agli fir se jab String literal create hoga too java STRING POOL check krega ki kya vo value already STRING POOL me hai 
agr hai so it will point to that instead of creating a new object

so strings use string pool

aur yeh string pool Heap memory me hi hoti hai..java reserve krdeta hai thoda space heap me string pool ke lie
<img width="488" height="512" alt="image" src="https://github.com/user-attachments/assets/dbb0487a-7c00-45a4-9c92-8538ecc8faf4" />



<img width="1257" height="672" alt="image" src="https://github.com/user-attachments/assets/60fe8a54-6d14-4eee-aada-eaa52ae85ddc" />

<img width="686" height="291" alt="image" src="https://github.com/user-attachments/assets/d1306fdd-101a-4696-a109-bf31ae2bb101" />
yeh true hoga bcs compile time me ja + va milke java hojaege aur s1 s2 abh ek hi jagah point krege ...**Isko hi bolte hai compile time constants**

<img width="866" height="616" alt="image" src="https://github.com/user-attachments/assets/5a07aa77-98b3-4c50-9e57-07160fa6914f" />
iss case me s1 static hai so s1 ki value hame runtime me pta chlegi issilie iska new object ban jaegaa..isslie yeh false aaegaa


<img width="910" height="577" alt="image" src="https://github.com/user-attachments/assets/72b75754-a162-42cf-9ca5-b11807190444" />

s2==s3 ? false


<img width="567" height="547" alt="image" src="https://github.com/user-attachments/assets/19a7b6ba-ba39-499f-9641-9e654453fe3e" />

abh iss case me dekho koi bhi concate operation perform nhi horha so java isse compile time me hi resolve kr deta hai isslie dono string pool me point krege


### string bhot jagah use hota hai jaise Passwords me URL me Hashes too vaha ham immutability chahte hai 



### so it basically saves the memory

So you may think ki yeh cheez tabhi possible ho sakti thi jab String mutable hoti,
but nahi. Because agar aisa hota toh hum agar ek String ki value change karte toh woh sabke liye change ho jaati, which could cause problems.

but if you want to create a new string object instead of pointing to same so u can just do like:
String thirdName= new String("John");
this creates a new object

now name==anotherName will return true
but name==thirdName will return false bcs uk ki == check that both variable refers to same obj


now bcs strings are immutable 
### it is thread safe
### provides security
