C/C++ was fast,simple,low level (mtlb close to hardware)

cpp is not platform independent  (when we say platform say it means Operating system + Hardware/CPU architecture: x86, x64, ARM, etc. )

as u already know ki agr tum agr tum code ko compile krte ho too vo machine code me convert hota hai aur vo machine code sirf tumhare platform me hi work krega..
# if you share that machine code to another platform it wont work 
# but why?

too dekho age tumhare c ya cpp ke code me kuch print krne se related hai like cout ya printf so you have to talk with operating system so tumhare machine code vo command likhi hogi
jo operating system se bol rhi ki console me print krvaoo 
same agr tumhe file me kuch read write krna hai uske lie bhi operating system se baat krna pdega
so agr machine code me vo command likhi hoti hai too har OS ke lie too commands alg hogi kyuki har OS alag library provide krta hai
So alg OS ke lie alg machine code hona chaiye

isslie same machine code doesnt work in other OS

## but platform independent kyu banana why we cannot simply compile it in another system?

<img width="1068" height="756" alt="image" src="https://github.com/user-attachments/assets/1f592ba6-108a-4dc6-b5d7-ed9aea756003" />
<img width="1017" height="757" alt="image" src="https://github.com/user-attachments/assets/1bffafbe-5253-4da2-a71f-0fe1b853738a" />


# How java is secure?
so jab ham byte code kisi dusre platform me run krte hai too JVM execute krne se pehle check krta hai ki kahi iss code me kuch malicious cheez too nhi..this is called SandBox model
aurr issi trh Java security provide krta hai

Formal way:
### Java's security model, historically called the sandbox model, restricted untrusted code from accessing sensitive system resources directly, such as files or the operating system. This helped prevent malicious code from harming the system.

# Java walo ne java ko platform independent banaya byte code aur JVM  ke through too C++ wale kyu nhi Byte code wala scene lae vo loog bhi too byte code ya CVM krke kuch laa skte the?

## Aissa isslie kyuki cpp ka mainly hardware se close thi aur cpp already apni legacy bana chuki thi too usme ched chaad na krke microsoft ne same cheez C# me kri..
## baad me python aai vo platform independent thi
