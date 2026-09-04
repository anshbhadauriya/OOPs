we were facing these problems
<img width="525" height="371" alt="image" src="https://github.com/user-attachments/assets/e68b183c-1a4d-45f1-92b6-8622aa0eb34c" />


# single responsibility principle

<img width="361" height="192" alt="image" src="https://github.com/user-attachments/assets/27c50d36-f625-4f2e-8ff4-c2cbaa47edf7" />


<img width="897" height="331" alt="image" src="https://github.com/user-attachments/assets/71767fde-c577-4d83-a7ad-8ea6ee58baa8" />

mtlb ek class ek hi cheez ko handle kre.. for example , tv remotes are made just to control tv.. agr same remote se ac,fan,laptop sab control hone lagega too
overcomplicated hojaega
so single responsibility principle bhi yhi batata hai ki ham class ko iss trh design kre ki vo ek hi responsibility ko handle kre aur uss class ke jitne bhi attributes,methods hai
voo sb bhi ussi responsibility ko handle kre

Before:

<img width="775" height="417" alt="image" src="https://github.com/user-attachments/assets/c0d79c8e-5c53-44dd-a92e-62524cc4bdf6" />



After using single responsibility principle:
<img width="1387" height="692" alt="image" src="https://github.com/user-attachments/assets/daadfefd-3a99-4a90-befa-ae17e1c697de" />

# Open/Closed Principle

<img width="936" height="362" alt="image" src="https://github.com/user-attachments/assets/7ec01f96-41f0-4b59-9993-b01a5b05c568" />

basically yeh batata hai ki koi new feature add krne ke lie ham puarana code na touch kre

# Liskov Substitution Principle
<img width="921" height="237" alt="image" src="https://github.com/user-attachments/assets/62d493f9-8fa8-4173-8b01-0dbc65d49cff" />
agr class A (parent) ko inherit krti hai class B (child) aur suppose kisi class ko class A ki need ho lekin ham usse class B dede too bhi koi problem na ho

# Interface Segregation Principle
<img width="921" height="437" alt="image" src="https://github.com/user-attachments/assets/88ff6ae1-6d38-4548-be77-914b7ca22a23" />

dekho problem yeh thi ki agr koi parent class A joki abstract hai aur usme methods abstract hai too abh class B (child) inherit kre class A ko to get a method from A 
so usse apni class me define krna pdega vo method as parent method is abstract..so bcs isne inherit kra A ko so isse sare method joki abstract hai parent me unhe define krna pdega
jabki B ko bss ek hi method ki zaroort thi 
<img width="1040" height="782" alt="image" src="https://github.com/user-attachments/assets/665e0b7a-fe04-4ad6-8a1d-dc1a4766001e" />
<img width="807" height="831" alt="image" src="https://github.com/user-attachments/assets/36b79c70-672e-4cd6-9695-a13e45c6e65c" />
<img width="927" height="137" alt="image" src="https://github.com/user-attachments/assets/5374d2eb-03ef-4919-979f-7fbe6ea4997c" />

# Dependency Inversion Principle
<img width="920" height="332" alt="image" src="https://github.com/user-attachments/assets/b05c6596-cfa1-42a8-b4dd-443cca03f1be" />



