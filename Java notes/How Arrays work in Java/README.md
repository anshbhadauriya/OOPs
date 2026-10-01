uk ki jab ham likhte hai int x=5; so x hold krta hai value 5 aur yeh x stack memory me store hota hai (primitive data type ofc)

aur jab ham array create krte hai like int [] arr= new int[5]; so vo 5 size ka array Heap memory me store hoga (non primitive data type) aur 
jo iska refernce hoga arr vo Stack memory save hoga
<img width="812" height="392" alt="image" src="https://github.com/user-attachments/assets/25afd9f6-6d27-4c55-83d9-6e1a633f3535" />

So that means arr does not hold directly holds the array
It is a refernce to an array

## How random access works in Array?
so agr kabhi tum likhte ho int x=5; so lets say vo memory address 100 pr store hota hai aur goes like 100 to 104 bcs int take 4 bytes of storage
so when we print like System.out.println(x); so it goes in stack memory and finds 100 and it knows ki int 4 byte k hai too 100 to 104 memory location se value fetch kr leta hai

but in case of non primitive?
<img width="450" height="317" alt="image" src="https://github.com/user-attachments/assets/f4c1cfa8-d5e0-4075-9ab3-ed9f65bf13b2" />
<img width="472" height="342" alt="image" src="https://github.com/user-attachments/assets/ed023521-1405-409a-84d4-6f37a185dc94" />

so koi element access krne ke lie ham formula bana skte hai 

like if we want to access of arr[3] so 100+(4*3)=112

<img width="836" height="385" alt="image" src="https://github.com/user-attachments/assets/91eb15f2-96c0-4c8f-b46f-137cc3ce789b" />

so basically arr which is refernce holds first memory block
