when we create object like Student s = new Student();  Student is object so vo heap memory me allocate hoga aur s is reference vo stack memory me allocate hoga
<img width="792" height="366" alt="image" src="https://github.com/user-attachments/assets/c3952249-e7ce-4b2c-ba7c-d77a4a3b74f4" />

references like s take 4 bytes (default) or 8 bytes of memory depending upon versions of jvm

abh objects kitni space lete hoge?

<img width="395" height="276" alt="image" src="https://github.com/user-attachments/assets/df026be6-0bca-4e44-aedf-c6594c3fe1e4" />

so total 14 bytes?? No
##### Object size-> Header Size , Exact fields , Paddings


# Call by Value vs Reference

<img width="770" height="712" alt="image" src="https://github.com/user-attachments/assets/ea99e65a-f442-4d17-8c0a-dac7fab5a0b3" />
isme value increment nhi hogi kyuki copy jaegi

bcs java me call by refernce ka koi concept hai nhi aur na hi possible hai

But here :
<img width="900" height="607" alt="image" src="https://github.com/user-attachments/assets/fe9d3605-1a85-4cac-9b61-835ff7dd881f" />

object is passed by referce
how?

uk r1 holds refernce of object random so jab tum r1 ko function me bhejoge too r1 ka bhi copy jaega lekin vo copy bhi same refernce hold kregi jo r1 hold kr rhi h
so both r1 and r points to same thing 
<img width="432" height="253" alt="image" src="https://github.com/user-attachments/assets/0dbeb265-2bf8-477e-8e88-1be63e614a73" />

so isslie in java objects are passed by refernce

## so arrays ya other non primitives like strings,arraylist,hashmap etc yeh sab behaves like call by refernce kyuki at the end banta too inka bhi object hi hai but you should say ki
## yeh bhi call by value hai kyuki copy jati h refernce ki

# so there is no call by reference in java.. 

like this:

<img width="910" height="385" alt="image" src="https://github.com/user-attachments/assets/3f5830ac-bc58-4c6d-aaae-7352a915ce9d" />

