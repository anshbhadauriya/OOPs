So agr hame collections me iterate krna hai... so we know sare collections index based nhi hote
so har collections normally iterate nhi ho skte

so iterable ek interface hai jo represnt krta hai kon konse object hai jinke elements ko iterate kia ja skta hai
<img width="817" height="421" alt="image" src="https://github.com/user-attachments/assets/8c307b52-f058-4ee8-8961-af6e4df3ed67" />

so koi bhi collection jisko iterate hona hai.. jo chahta hai ki uska ek ek element fetch ho ske usse iterable interface ko inherit krna pdega

iterable interface ka ek method hai iterator() jo ki actually kisi collection me iterate krega

Java me alg interface hai jiska naam Iterator hai 
aur iterator() reference lakr deta hai Iterator interface ka

<img width="946" height="316" alt="image" src="https://github.com/user-attachments/assets/27b08200-d184-4fb2-8272-c9b06cfdf39e" />
<img width="1192" height="871" alt="image" src="https://github.com/user-attachments/assets/379bfd34-84a3-4fae-bd1e-e54e5f8b9a95" />
<img width="1356" height="1072" alt="image" src="https://github.com/user-attachments/assets/6b34da8b-cff2-4124-8d8d-79b4dc05108e" />

so hamare paas ArrayList ek class hai jo implement krti hai Itreable interface ko soo usse iterable method ko define krna pdega  so usne simply return 
kr dia ArrayListIterator() ka object..aur ArrayListIterator khud hi ek class hai jo implement krti hai Iterator interface ko too usse hasnext() aur next() ki definition
dena hoga

so jab bhi ham list.iterator() likhte hai too hame ArrayListIterator ka object milta hai jisko ham collect krte hai Iterator me

and thats how it works
