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

<img width="1257" height="672" alt="image" src="https://github.com/user-attachments/assets/60fe8a54-6d14-4eee-aada-eaa52ae85ddc" />

### so it basically saved the memory

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
